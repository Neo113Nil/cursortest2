package com.reactnativecompressor.Utils;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventEmitterHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/reactnativecompressor/Utils/EventEmitterHandler;", "", "<init>", "()V", "Companion", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EventEmitterHandler {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static ReactApplicationContext reactContext;

    /* compiled from: EventEmitterHandler.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\rJ\u0016\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rJ\u0016\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rJ\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\rJ \u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/reactnativecompressor/Utils/EventEmitterHandler$Companion;", "", "<init>", "()V", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "getReactContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "setReactContext", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "sendEvent", "", "eventName", "", "params", "emitBackgroundTaskExpired", "backgroundId", "emitVideoCompressProgress", "progress", "", "uuid", "emitDownloadProgress", "emitDownloadProgressError", "error", "sendUploadProgressEvent", "numBytes", "", "totalBytes", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ReactApplicationContext getReactContext() {
            return EventEmitterHandler.reactContext;
        }

        public final void setReactContext(ReactApplicationContext reactApplicationContext) {
            EventEmitterHandler.reactContext = reactApplicationContext;
        }

        private final void sendEvent(String eventName, Object params) {
            DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
            ReactApplicationContext reactContext = getReactContext();
            if (reactContext == null || (rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)) == null) {
                return;
            }
            rCTDeviceEventEmitter.emit(eventName, params);
        }

        public final void emitBackgroundTaskExpired(String backgroundId) {
            sendEvent("backgroundTaskExpired", backgroundId);
        }

        public final void emitVideoCompressProgress(double progress, String uuid) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            WritableMap createMap = Arguments.createMap();
            WritableMap createMap2 = Arguments.createMap();
            createMap.putString("uuid", uuid);
            createMap2.putDouble("progress", progress);
            createMap.putMap("data", createMap2);
            sendEvent("videoCompressProgress", createMap);
        }

        public final void emitDownloadProgress(double progress, String uuid) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            WritableMap createMap = Arguments.createMap();
            WritableMap createMap2 = Arguments.createMap();
            createMap.putString("uuid", uuid);
            createMap2.putDouble("progress", progress);
            createMap.putMap("data", createMap2);
            sendEvent("downloadProgress", createMap);
        }

        public final void emitDownloadProgressError(String uuid, String error) {
            if (uuid == null || error == null) {
                return;
            }
            WritableMap createMap = Arguments.createMap();
            WritableMap createMap2 = Arguments.createMap();
            createMap.putString("uuid", uuid);
            createMap.putString("error", error);
            createMap.putMap("data", createMap2);
            sendEvent("downloadProgressError", createMap);
        }

        public final void sendUploadProgressEvent(long numBytes, long totalBytes, String uuid) {
            if (uuid != null) {
                WritableMap createMap = Arguments.createMap();
                WritableMap createMap2 = Arguments.createMap();
                createMap.putString("uuid", uuid);
                createMap2.putDouble("written", numBytes);
                createMap2.putDouble("total", totalBytes);
                createMap.putMap("data", createMap2);
                sendEvent("uploadProgress", createMap);
            }
        }
    }
}
