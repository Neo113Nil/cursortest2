package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import h8.InterfaceC4488a;

/* loaded from: classes2.dex */
public abstract class NativeAnimatedTurboModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeAnimatedTurboModule";

    public NativeAnimatedTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void addAnimatedEventToView(double d10, String str, ReadableMap readableMap);

    @ReactMethod
    @InterfaceC4488a
    public abstract void addListener(String str);

    @ReactMethod
    @InterfaceC4488a
    public abstract void connectAnimatedNodeToView(double d10, double d11);

    @ReactMethod
    @InterfaceC4488a
    public abstract void connectAnimatedNodes(double d10, double d11);

    @ReactMethod
    @InterfaceC4488a
    public abstract void createAnimatedNode(double d10, ReadableMap readableMap);

    @ReactMethod
    @InterfaceC4488a
    public abstract void disconnectAnimatedNodeFromView(double d10, double d11);

    @ReactMethod
    @InterfaceC4488a
    public abstract void disconnectAnimatedNodes(double d10, double d11);

    @ReactMethod
    @InterfaceC4488a
    public abstract void dropAnimatedNode(double d10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void extractAnimatedNodeOffset(double d10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void finishOperationBatch();

    @ReactMethod
    @InterfaceC4488a
    public abstract void flattenAnimatedNodeOffset(double d10);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void getValue(double d10, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public void queueAndExecuteBatchedOperations(ReadableArray readableArray) {
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void removeAnimatedEventFromView(double d10, String str, double d11);

    @ReactMethod
    @InterfaceC4488a
    public abstract void removeListeners(double d10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void restoreDefaultValues(double d10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setAnimatedNodeOffset(double d10, double d11);

    @ReactMethod
    @InterfaceC4488a
    public abstract void setAnimatedNodeValue(double d10, double d11);

    @ReactMethod
    @InterfaceC4488a
    public abstract void startAnimatingNode(double d10, double d11, ReadableMap readableMap, Callback callback);

    @ReactMethod
    @InterfaceC4488a
    public abstract void startListeningToAnimatedNodeValue(double d10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void startOperationBatch();

    @ReactMethod
    @InterfaceC4488a
    public abstract void stopAnimation(double d10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void stopListeningToAnimatedNodeValue(double d10);

    @ReactMethod
    @InterfaceC4488a
    public void updateAnimatedNodeConfig(double d10, ReadableMap readableMap) {
    }
}
