package com.swmansion.reanimated;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.swmansion.worklets.WorkletsModule;

@ReactModule(name = NativeReanimatedModuleSpec.NAME)
/* loaded from: classes4.dex */
public class ReanimatedModule extends NativeReanimatedModuleSpec implements LifecycleEventListener {
    private final NodesManager mNodesManager;
    private final WorkletsModule mWorkletsModule;

    public ReanimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.assertOnJSQueueThread();
        WorkletsModule workletsModule = (WorkletsModule) reactApplicationContext.getNativeModule(WorkletsModule.class);
        this.mWorkletsModule = workletsModule;
        this.mNodesManager = new NodesManager(reactApplicationContext, workletsModule);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    public NodesManager getNodesManager() {
        return this.mNodesManager;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.assertOnJSQueueThread();
        reactApplicationContext.addLifecycleEventListener(this);
    }

    @Override // com.swmansion.reanimated.NativeReanimatedModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean installTurboModule() {
        getReactApplicationContext().assertOnJSQueueThread();
        this.mNodesManager.getNativeProxy().installJSIBindings();
        return true;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        this.mNodesManager.invalidate();
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mNodesManager.onHostPause();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mNodesManager.onHostResume();
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }
}
