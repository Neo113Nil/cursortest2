package com.swmansion.reanimated;

import android.os.SystemClock;
import android.provider.Settings;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.interfaces.DevOptionHandler;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.soloader.SoLoader;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import com.swmansion.reanimated.keyboard.KeyboardAnimationManager;
import com.swmansion.reanimated.keyboard.KeyboardWorkletWrapper;
import com.swmansion.reanimated.nativeProxy.AnimationFrameCallback;
import com.swmansion.reanimated.nativeProxy.EventHandler;
import com.swmansion.reanimated.nativeProxy.SensorSetter;
import com.swmansion.reanimated.sensor.ReanimatedSensorContainer;
import com.swmansion.reanimated.sensor.ReanimatedSensorType;
import com.swmansion.worklets.JSCallInvokerResolver;
import com.swmansion.worklets.WorkletsModule;
import h8.InterfaceC4488a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class NativeProxy {
    private static final int CMD_BACKGROUND_COLOR = 15;
    private static final int CMD_BORDER_BOTTOM_COLOR = 42;
    private static final int CMD_BORDER_BOTTOM_END_RADIUS = 28;
    private static final int CMD_BORDER_BOTTOM_LEFT_RADIUS = 25;
    private static final int CMD_BORDER_BOTTOM_RIGHT_RADIUS = 26;
    private static final int CMD_BORDER_BOTTOM_START_RADIUS = 27;
    private static final int CMD_BORDER_COLOR = 40;
    private static final int CMD_BORDER_END_COLOR = 46;
    private static final int CMD_BORDER_END_END_RADIUS = 32;
    private static final int CMD_BORDER_END_START_RADIUS = 31;
    private static final int CMD_BORDER_LEFT_COLOR = 43;
    private static final int CMD_BORDER_RADIUS = 20;
    private static final int CMD_BORDER_RIGHT_COLOR = 44;
    private static final int CMD_BORDER_START_COLOR = 45;
    private static final int CMD_BORDER_START_END_RADIUS = 30;
    private static final int CMD_BORDER_START_START_RADIUS = 29;
    private static final int CMD_BORDER_TOP_COLOR = 41;
    private static final int CMD_BORDER_TOP_END_RADIUS = 24;
    private static final int CMD_BORDER_TOP_LEFT_RADIUS = 21;
    private static final int CMD_BORDER_TOP_RIGHT_RADIUS = 22;
    private static final int CMD_BORDER_TOP_START_RADIUS = 23;
    private static final int CMD_COLOR = 16;
    private static final int CMD_ELEVATION = 11;
    private static final int CMD_END_OF_TRANSFORM = 3;
    private static final int CMD_END_OF_VIEW = 4;
    private static final int CMD_OPACITY = 10;
    private static final int CMD_SHADOW_OPACITY = 13;
    private static final int CMD_SHADOW_RADIUS = 14;
    private static final int CMD_START_OF_TRANSFORM = 2;
    private static final int CMD_START_OF_VIEW = 1;
    private static final int CMD_TINT_COLOR = 17;
    private static final int CMD_TRANSFORM_MATRIX = 111;
    private static final int CMD_TRANSFORM_PERSPECTIVE = 112;
    private static final int CMD_TRANSFORM_ROTATE = 105;
    private static final int CMD_TRANSFORM_ROTATE_X = 106;
    private static final int CMD_TRANSFORM_ROTATE_Y = 107;
    private static final int CMD_TRANSFORM_ROTATE_Z = 108;
    private static final int CMD_TRANSFORM_SCALE = 102;
    private static final int CMD_TRANSFORM_SCALE_X = 103;
    private static final int CMD_TRANSFORM_SCALE_Y = 104;
    private static final int CMD_TRANSFORM_SKEW_X = 109;
    private static final int CMD_TRANSFORM_SKEW_Y = 110;
    private static final int CMD_TRANSFORM_TRANSLATE_X = 100;
    private static final int CMD_TRANSFORM_TRANSLATE_Y = 101;
    private static final int CMD_UNIT_DEG = 200;
    private static final int CMD_UNIT_PERCENT = 203;
    private static final int CMD_UNIT_PX = 202;
    private static final int CMD_UNIT_RAD = 201;
    private static final int CMD_Z_INDEX = 12;
    private final Gc.a gestureHandlerStateManager;
    private final KeyboardAnimationManager keyboardAnimationManager;
    protected final WeakReference<ReactApplicationContext> mContext;
    protected final FabricUIManager mFabricUIManager;

    @InterfaceC4488a
    private final HybridData mHybridData;
    protected NodesManager mNodesManager;
    protected final WorkletsModule mWorkletsModule;
    private final ReanimatedSensorContainer reanimatedSensorContainer;
    private Long firstUptime = Long.valueOf(SystemClock.uptimeMillis());
    private boolean slowAnimationsEnabled = false;
    private final int ANIMATIONS_DRAG_FACTOR = 10;
    protected String cppVersion = null;
    private final AtomicBoolean mInvalidated = new AtomicBoolean(false);

    static {
        SoLoader.t("reanimated");
    }

    public NativeProxy(ReactApplicationContext reactApplicationContext, WorkletsModule workletsModule, NodesManager nodesManager) {
        Gc.a aVar = null;
        reactApplicationContext.assertOnJSQueueThread();
        this.mWorkletsModule = workletsModule;
        WeakReference<ReactApplicationContext> weakReference = new WeakReference<>(reactApplicationContext);
        this.mContext = weakReference;
        this.reanimatedSensorContainer = new ReanimatedSensorContainer(weakReference);
        this.keyboardAnimationManager = new KeyboardAnimationManager(weakReference);
        addDevMenuOption();
        try {
            RNGestureHandlerModule.Companion companion = RNGestureHandlerModule.INSTANCE;
            aVar = (Gc.a) reactApplicationContext.getNativeModule(RNGestureHandlerModule.class);
        } catch (ClassCastException | ClassNotFoundException unused) {
        }
        this.gestureHandlerStateManager = aVar;
        this.mNodesManager = nodesManager;
        FabricUIManager fabricUIManager = (FabricUIManager) UIManagerHelper.getUIManager(reactApplicationContext, 2);
        this.mFabricUIManager = fabricUIManager;
        CallInvokerHolderImpl jSCallInvokerHolder = JSCallInvokerResolver.getJSCallInvokerHolder(reactApplicationContext);
        JavaScriptContextHolder javaScriptContextHolder = reactApplicationContext.getJavaScriptContextHolder();
        Objects.requireNonNull(javaScriptContextHolder);
        this.mHybridData = initHybrid(workletsModule, javaScriptContextHolder.getContext(), jSCallInvokerHolder, fabricUIManager);
    }

    private void addDevMenuOption() {
        DevMenuUtils.addDevMenuOption(this.mContext.get(), new DevOptionHandler() { // from class: com.swmansion.reanimated.d
            @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
            public final void onOptionSelected() {
                NativeProxy.this.toggleSlowAnimations();
            }
        });
    }

    private static String commandToString(int i10) {
        switch (i10) {
            case 10:
                return ViewProps.OPACITY;
            case 11:
                return ViewProps.ELEVATION;
            case 12:
                return ViewProps.Z_INDEX;
            case 13:
                return "shadowOpacity";
            case 14:
                return "shadowRadius";
            case 15:
                return ViewProps.BACKGROUND_COLOR;
            case 16:
                return ViewProps.COLOR;
            case 17:
                return "tintColor";
            default:
                switch (i10) {
                    case 20:
                        return ViewProps.BORDER_RADIUS;
                    case 21:
                        return ViewProps.BORDER_TOP_LEFT_RADIUS;
                    case 22:
                        return ViewProps.BORDER_TOP_RIGHT_RADIUS;
                    case 23:
                        return ViewProps.BORDER_TOP_START_RADIUS;
                    case 24:
                        return ViewProps.BORDER_TOP_END_RADIUS;
                    case 25:
                        return ViewProps.BORDER_BOTTOM_LEFT_RADIUS;
                    case 26:
                        return ViewProps.BORDER_BOTTOM_RIGHT_RADIUS;
                    case 27:
                        return ViewProps.BORDER_BOTTOM_START_RADIUS;
                    case 28:
                        return ViewProps.BORDER_BOTTOM_END_RADIUS;
                    case 29:
                        return ViewProps.BORDER_START_START_RADIUS;
                    case 30:
                        return ViewProps.BORDER_START_END_RADIUS;
                    case 31:
                        return ViewProps.BORDER_END_START_RADIUS;
                    case 32:
                        return ViewProps.BORDER_END_END_RADIUS;
                    default:
                        switch (i10) {
                            case 40:
                                return ViewProps.BORDER_COLOR;
                            case 41:
                                return ViewProps.BORDER_TOP_COLOR;
                            case 42:
                                return ViewProps.BORDER_BOTTOM_COLOR;
                            case 43:
                                return ViewProps.BORDER_LEFT_COLOR;
                            case 44:
                                return ViewProps.BORDER_RIGHT_COLOR;
                            case 45:
                                return ViewProps.BORDER_START_COLOR;
                            case 46:
                                return ViewProps.BORDER_END_COLOR;
                            default:
                                throw new RuntimeException("Unknown command: " + i10);
                        }
                }
        }
    }

    private native HybridData initHybrid(WorkletsModule workletsModule, long j10, CallInvokerHolderImpl callInvokerHolderImpl, FabricUIManager fabricUIManager);

    private native void invalidateCpp();

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleSlowAnimations() {
        boolean z10 = this.slowAnimationsEnabled;
        this.slowAnimationsEnabled = !z10;
        if (!z10) {
            this.firstUptime = Long.valueOf(SystemClock.uptimeMillis());
        }
        this.mNodesManager.enableSlowAnimations(this.slowAnimationsEnabled, 10);
        this.mWorkletsModule.toggleSlowAnimations();
    }

    private static String transformCommandToString(int i10) {
        switch (i10) {
            case 100:
                return ViewProps.TRANSLATE_X;
            case 101:
                return ViewProps.TRANSLATE_Y;
            case 102:
                return "scale";
            case 103:
                return ViewProps.SCALE_X;
            case 104:
                return ViewProps.SCALE_Y;
            case 105:
                return "rotate";
            case 106:
                return "rotateX";
            case 107:
                return "rotateY";
            case 108:
                return "rotateZ";
            case 109:
                return "skewX";
            case 110:
                return "skewY";
            case 111:
                return "matrix";
            case 112:
                return "perspective";
            default:
                throw new RuntimeException("Unknown transform command: " + i10);
        }
    }

    public void checkCppVersion() {
        if (this.cppVersion == null) {
            throw new RuntimeException("[Reanimated] Java side failed to resolve C++ code version. See https://docs.swmansion.com/react-native-reanimated/docs/guides/troubleshooting#java-side-failed-to-resolve-c-code-version for more information.");
        }
        String reanimatedJavaVersion = getReanimatedJavaVersion();
        if (this.cppVersion.equals(reanimatedJavaVersion)) {
            return;
        }
        throw new RuntimeException("[Reanimated] Mismatch between Java code version and C++ code version (" + reanimatedJavaVersion + " vs. " + this.cppVersion + " respectively). See https://docs.swmansion.com/react-native-reanimated/docs/guides/troubleshooting#mismatch-between-java-code-version-and-c-code-version for more information.");
    }

    @InterfaceC4488a
    public long getAnimationTimestamp() {
        return this.slowAnimationsEnabled ? this.firstUptime.longValue() + ((SystemClock.uptimeMillis() - this.firstUptime.longValue()) / 10) : SystemClock.uptimeMillis();
    }

    public HybridData getHybridData() {
        return this.mHybridData;
    }

    @InterfaceC4488a
    public boolean getIsReducedMotion() {
        String string = Settings.Global.getString(this.mContext.get().getContentResolver(), "transition_animation_scale");
        return (string != null ? Float.parseFloat(string) : 1.0f) == 0.0f;
    }

    @InterfaceC4488a
    public String getReanimatedJavaVersion() {
        return BuildConfig.REANIMATED_VERSION_JAVA;
    }

    public native void installJSIBindings();

    public void invalidate() {
        HybridData hybridData;
        if (this.mInvalidated.getAndSet(true) || (hybridData = this.mHybridData) == null || !hybridData.isValid()) {
            return;
        }
        invalidateCpp();
    }

    public native boolean isAnyHandlerWaitingForEvent(String str, int i10);

    @InterfaceC4488a
    public void maybeFlushUIUpdatesQueue() {
        UiThreadUtil.assertOnUiThread();
        if (this.mNodesManager.isAnimationRunning()) {
            return;
        }
        this.mNodesManager.performOperationsRespectingDrawPass();
    }

    public native void performNonLayoutOperations();

    public native void performOperations();

    @InterfaceC4488a
    public boolean preserveMountedTags(int[] iArr) {
        if (!UiThreadUtil.isOnUiThread()) {
            return false;
        }
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (this.mFabricUIManager.resolveView(iArr[i10]) == null) {
                iArr[i10] = -1;
            }
        }
        return true;
    }

    @InterfaceC4488a
    public void registerEventHandler(EventHandler eventHandler) {
        eventHandler.mCustomEventNamesResolver = this.mNodesManager.getEventNameResolver();
        this.mNodesManager.registerEventHandler(eventHandler);
    }

    @InterfaceC4488a
    public int registerSensor(int i10, int i11, SensorSetter sensorSetter) {
        return this.reanimatedSensorContainer.registerSensor(ReanimatedSensorType.getInstanceById(i10), i11, sensorSetter);
    }

    @InterfaceC4488a
    public void requestRender(AnimationFrameCallback animationFrameCallback) {
        UiThreadUtil.assertOnUiThread();
        this.mNodesManager.postOnAnimation(animationFrameCallback);
    }

    @InterfaceC4488a
    public void setCppVersion(String str) {
        this.cppVersion = str;
    }

    @InterfaceC4488a
    public void setGestureState(int i10, int i11) {
        Gc.a aVar = this.gestureHandlerStateManager;
        if (aVar != null) {
            aVar.setGestureHandlerState(i10, i11);
        }
    }

    @InterfaceC4488a
    public int subscribeForKeyboardEvents(KeyboardWorkletWrapper keyboardWorkletWrapper, boolean z10, boolean z11) {
        return this.keyboardAnimationManager.subscribeForKeyboardUpdates(keyboardWorkletWrapper, z10, z11);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Iterator, java.util.PrimitiveIterator$OfInt] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @InterfaceC4488a
    public void synchronouslyUpdateUIProps(int[] iArr, double[] dArr) {
        String str;
        ?? it = Arrays.stream(iArr).iterator();
        ?? it2 = Arrays.stream(dArr).iterator();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        int i10 = -1;
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            if (nextInt == 1) {
                i10 = it.nextInt();
                javaOnlyMap = new JavaOnlyMap();
            } else if (nextInt == 2) {
                JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                while (true) {
                    int nextInt2 = it.nextInt();
                    if (nextInt2 == 3) {
                        javaOnlyMap.putArray(ViewProps.TRANSFORM, javaOnlyArray);
                    } else {
                        String transformCommandToString = transformCommandToString(nextInt2);
                        switch (nextInt2) {
                            case 100:
                            case 101:
                                double nextDouble = it2.nextDouble();
                                int nextInt3 = it.nextInt();
                                if (nextInt3 != 202) {
                                    if (nextInt3 != 203) {
                                        throw new RuntimeException("Unknown unit command");
                                    }
                                    javaOnlyArray.pushMap(JavaOnlyMap.of(transformCommandToString, nextDouble + "%"));
                                    break;
                                } else {
                                    javaOnlyArray.pushMap(JavaOnlyMap.of(transformCommandToString, Double.valueOf(nextDouble)));
                                    break;
                                }
                            case 102:
                            case 103:
                            case 104:
                            case 112:
                                javaOnlyArray.pushMap(JavaOnlyMap.of(transformCommandToString, Double.valueOf(it2.nextDouble())));
                                break;
                            case 105:
                            case 106:
                            case 107:
                            case 108:
                            case 109:
                            case 110:
                                double nextDouble2 = it2.nextDouble();
                                int nextInt4 = it.nextInt();
                                if (nextInt4 == 200) {
                                    str = "deg";
                                } else {
                                    if (nextInt4 != 201) {
                                        throw new RuntimeException("Unknown unit command");
                                    }
                                    str = "rad";
                                }
                                javaOnlyArray.pushMap(JavaOnlyMap.of(transformCommandToString, nextDouble2 + str));
                                break;
                            case 111:
                                int nextInt5 = it.nextInt();
                                JavaOnlyArray javaOnlyArray2 = new JavaOnlyArray();
                                for (int i11 = 0; i11 < nextInt5; i11++) {
                                    javaOnlyArray2.pushDouble(it2.nextDouble());
                                }
                                javaOnlyArray.pushMap(JavaOnlyMap.of(transformCommandToString, javaOnlyArray2));
                                break;
                            default:
                                throw new RuntimeException("Unknown transform type: " + nextInt2);
                        }
                    }
                }
            } else if (nextInt != 4) {
                switch (nextInt) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        javaOnlyMap.putDouble(commandToString(nextInt), it2.nextDouble());
                        break;
                    default:
                        switch (nextInt) {
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                                String commandToString = commandToString(nextInt);
                                double nextDouble3 = it2.nextDouble();
                                int nextInt6 = it.nextInt();
                                if (nextInt6 == 202) {
                                    javaOnlyMap.putDouble(commandToString, nextDouble3);
                                } else {
                                    if (nextInt6 != 203) {
                                        throw new RuntimeException("Unknown unit command");
                                    }
                                    javaOnlyMap.putString(commandToString, nextDouble3 + "%");
                                }
                                break;
                            default:
                                switch (nextInt) {
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case 45:
                                    case 46:
                                        break;
                                    default:
                                        throw new RuntimeException("Unexcepted command: " + nextInt);
                                }
                                break;
                        }
                    case 15:
                    case 16:
                    case 17:
                        javaOnlyMap.putInt(commandToString(nextInt), it.nextInt());
                        break;
                }
            } else {
                this.mFabricUIManager.synchronouslyUpdateViewOnUIThread(i10, javaOnlyMap);
            }
        }
    }

    @InterfaceC4488a
    public void unregisterSensor(int i10) {
        this.reanimatedSensorContainer.unregisterSensor(i10);
    }

    @InterfaceC4488a
    public void unsubscribeFromKeyboardEvents(int i10) {
        this.keyboardAnimationManager.unsubscribeFromKeyboardUpdates(i10);
    }
}
