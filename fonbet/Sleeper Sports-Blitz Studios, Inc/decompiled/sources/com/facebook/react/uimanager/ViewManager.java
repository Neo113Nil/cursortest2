package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlags;
import com.facebook.react.touch.JSResponderHandler;
import com.facebook.react.touch.ReactInterceptingViewGroup;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater;
import com.facebook.yoga.YogaMeasureMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* loaded from: classes6.dex */
public abstract class ViewManager<T extends View, C extends ReactShadowNode> extends BaseJavaModule {
    private static final String TAG = "ViewManager";
    private ViewManagerDelegate<T> mDelegate;
    private Map<Integer, Stack<T>> mRecyclableViews;

    protected void addEventEmitters(ThemedReactContext themedReactContext, T t) {
    }

    protected abstract T createViewInstance(ThemedReactContext themedReactContext);

    @UnstableReactNativeAPI
    public void experimental_prefetchResources(int i, ThemedReactContext themedReactContext, MapBuffer mapBuffer) {
    }

    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedViewConstants() {
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    public abstract Class<? extends C> getShadowNodeClass();

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2, float[] fArr) {
        return 0L;
    }

    protected void onAfterUpdateTransaction(T t) {
    }

    protected abstract T prepareToRecycleView(ThemedReactContext themedReactContext, T t);

    @Deprecated
    public void receiveCommand(T t, int i, ReadableArray readableArray) {
    }

    protected T recycleView(ThemedReactContext themedReactContext, T t) {
        return t;
    }

    public void setPadding(T t, int i, int i2, int i3, int i4) {
    }

    public abstract void updateExtraData(T t, Object obj);

    public Object updateState(T t, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper) {
        return null;
    }

    public ViewManager() {
        super(null);
        this.mDelegate = null;
        this.mRecyclableViews = null;
    }

    public ViewManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mDelegate = null;
        this.mRecyclableViews = null;
    }

    protected void setupViewRecycling() {
        if (ReactNativeFeatureFlags.enableViewRecycling()) {
            this.mRecyclableViews = new HashMap();
        }
    }

    private Stack<T> getRecyclableViewStack(int i, boolean z) {
        Map<Integer, Stack<T>> map = this.mRecyclableViews;
        if (map == null) {
            return null;
        }
        if (z && !map.containsKey(Integer.valueOf(i))) {
            this.mRecyclableViews.put(Integer.valueOf(i), new Stack<>());
        }
        return this.mRecyclableViews.get(Integer.valueOf(i));
    }

    public void updateProperties(T t, ReactStylesDiffMap reactStylesDiffMap) {
        ViewManagerDelegate<T> orCreateViewManagerDelegate = getOrCreateViewManagerDelegate();
        Iterator<Map.Entry<String, Object>> entryIterator = reactStylesDiffMap.getBackingMap().getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            orCreateViewManagerDelegate.kotlinCompat$setProperty(t, next.getKey(), next.getValue());
        }
        onAfterUpdateTransaction(t);
    }

    protected ViewManagerDelegate<T> getDelegate() {
        if (this instanceof ViewManagerWithGeneratedInterface) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("ViewManager using codegen must override getDelegate method (name: " + getName() + ")."));
        }
        return new ViewManagerPropertyUpdater.GenericViewManagerDelegate(this);
    }

    private ViewManagerDelegate<T> getOrCreateViewManagerDelegate() {
        ViewManagerDelegate<T> viewManagerDelegate = this.mDelegate;
        if (viewManagerDelegate != null) {
            return viewManagerDelegate;
        }
        ViewManagerDelegate<T> delegate = getDelegate();
        this.mDelegate = delegate;
        return delegate;
    }

    public T createView(int i, ThemedReactContext themedReactContext, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper, JSResponderHandler jSResponderHandler) {
        T createViewInstance = createViewInstance(i, themedReactContext, reactStylesDiffMap, stateWrapper);
        if (createViewInstance instanceof ReactInterceptingViewGroup) {
            ((ReactInterceptingViewGroup) createViewInstance).setOnInterceptTouchEventListener(jSResponderHandler);
        }
        return createViewInstance;
    }

    public C createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    public C createShadowNodeInstance(ReactApplicationContext reactApplicationContext) {
        return createShadowNodeInstance();
    }

    protected T createViewInstance(int i, ThemedReactContext themedReactContext, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper) {
        T createViewInstance;
        Object updateState;
        Stack<T> recyclableViewStack = getRecyclableViewStack(themedReactContext.getSurfaceId(), true);
        if (recyclableViewStack != null && !recyclableViewStack.empty()) {
            T pop = recyclableViewStack.pop();
            if (ReactNativeFeatureFlags.enableViewRecycling() && pop.getParent() != null) {
                ((ViewGroup) pop.getParent()).removeView(pop);
            }
            createViewInstance = recycleView(themedReactContext, pop);
        } else {
            createViewInstance = createViewInstance(themedReactContext);
        }
        createViewInstance.setId(i);
        addEventEmitters(themedReactContext, createViewInstance);
        if (reactStylesDiffMap != null) {
            updateProperties(createViewInstance, reactStylesDiffMap);
        }
        if (stateWrapper != null && (updateState = updateState(createViewInstance, reactStylesDiffMap, stateWrapper)) != null) {
            updateExtraData(createViewInstance, updateState);
        }
        return createViewInstance;
    }

    public void onDropViewInstance(T t) {
        T prepareToRecycleView;
        Context context = t.getContext();
        if (context == null) {
            FLog.e(TAG, "onDropViewInstance: view [" + t.getId() + "] has a null context");
            return;
        }
        if (!(context instanceof ThemedReactContext)) {
            FLog.e(TAG, "onDropViewInstance: view [" + t.getId() + "] has a context that is not a ThemedReactContext: " + context);
            return;
        }
        ThemedReactContext themedReactContext = (ThemedReactContext) context;
        Stack<T> recyclableViewStack = getRecyclableViewStack(themedReactContext.getSurfaceId(), false);
        if (recyclableViewStack == null || (prepareToRecycleView = prepareToRecycleView(themedReactContext, t)) == null) {
            return;
        }
        recyclableViewStack.push(prepareToRecycleView);
    }

    public void receiveCommand(T t, String str, ReadableArray readableArray) {
        getOrCreateViewManagerDelegate().kotlinCompat$receiveCommand(t, str, readableArray);
    }

    public Map<String, String> getNativeProps() {
        if (ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE && ReactNativeNewArchitectureFeatureFlags.enableBridgelessArchitecture()) {
            return ViewManagerPropertyUpdater.getNativeProps(getClass(), null);
        }
        return ViewManagerPropertyUpdater.getNativeProps(getClass(), getShadowNodeClass());
    }

    public void onSurfaceStopped(int i) {
        Map<Integer, Stack<T>> map = this.mRecyclableViews;
        if (map != null) {
            map.remove(Integer.valueOf(i));
        }
    }

    void trimMemory() {
        if (this.mRecyclableViews != null) {
            this.mRecyclableViews = new HashMap();
        }
    }

    @UnstableReactNativeAPI
    protected boolean experimental_isPrefetchingEnabled() {
        return ReactNativeFeatureFlags.enableImagePrefetchingAndroid();
    }
}
