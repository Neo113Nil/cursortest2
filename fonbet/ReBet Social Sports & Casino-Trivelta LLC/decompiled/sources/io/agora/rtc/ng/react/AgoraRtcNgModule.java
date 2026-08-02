package io.agora.rtc.ng.react;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.util.Base64;
import android.util.Rational;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.twilio.voice.EventKeys;
import io.agora.iris.IrisApiEngine;
import io.agora.iris.IrisEventHandler;
import io.agora.iris.pip.AgoraPIPActivityProxy;
import io.agora.iris.pip.AgoraPIPController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@ReactModule(name = "AgoraRtcNg")
/* loaded from: classes3.dex */
public class AgoraRtcNgModule extends AgoraRtcNgSpec implements IrisEventHandler {
    public static final String NAME = "AgoraRtcNg";
    public IrisApiEngine irisApiEngine;
    public final Object irisApiLock;
    private AgoraPIPController pipController;

    public AgoraRtcNgModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.irisApiLock = new Object();
    }

    private boolean checkPipIsReady() {
        return Build.VERSION.SDK_INT >= 26 && this.pipController != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void initPipController(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT < 26 || !(activity instanceof AgoraPIPActivityProxy)) {
            return;
        }
        AgoraPIPController agoraPIPController = this.pipController;
        if (agoraPIPController != null) {
            agoraPIPController.dispose();
        }
        this.pipController = new AgoraPIPController((AgoraPIPActivityProxy) activity, new AgoraPIPController.PIPStateChangedListener() { // from class: io.agora.rtc.ng.react.AgoraRtcNgModule.1
            @Override // io.agora.iris.pip.AgoraPIPController.PIPStateChangedListener
            public void onPIPStateChangedListener(AgoraPIPController.PIPState pIPState, String str) {
                try {
                    AgoraRtcNgModule.this.OnEvent("AgoraPip_onPipStateChanged", new JSONObject().put("state", pIPState.getValue()).put("error", str).toString(), null);
                } catch (JSONException e10) {
                    throw new RuntimeException(e10);
                }
            }
        });
    }

    @Override // io.agora.iris.IrisEventHandler
    public void OnEvent(String str, String str2, List<byte[]> list) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("event", str);
        createMap.putString(EventKeys.DATA, str2);
        if (list != null) {
            WritableArray createArray = Arguments.createArray();
            Iterator<byte[]> it = list.iterator();
            while (it.hasNext()) {
                createArray.pushString(Base64.encodeToString(it.next(), 0));
            }
            createMap.putArray("buffers", createArray);
        }
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("AgoraRtcNg:onEvent", createMap);
    }

    @Override // io.agora.rtc.ng.react.NativeAgoraRtcNgSpec
    @ReactMethod
    public void addListener(String str) {
    }

    @Override // io.agora.rtc.ng.react.NativeAgoraRtcNgSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public String callApi(ReadableMap readableMap) {
        ArrayList arrayList;
        String callIrisApi;
        synchronized (this.irisApiLock) {
            String string = readableMap.getString("funcName");
            String string2 = readableMap.getString("params");
            ReadableArray array = readableMap.getArray("buffers");
            if (array != null) {
                arrayList = new ArrayList();
                for (int i10 = 0; i10 < array.size(); i10++) {
                    arrayList.add(Base64.decode(array.getString(i10), 0));
                }
            } else {
                arrayList = null;
            }
            try {
                newIrisApiEngine();
                callIrisApi = this.irisApiEngine.callIrisApi(string, string2, (List<byte[]>) arrayList);
            } catch (Exception e10) {
                e10.printStackTrace();
                try {
                    return new JSONObject().put("result", e10.getMessage()).toString();
                } catch (JSONException e11) {
                    throw new RuntimeException(e11);
                }
            }
        }
        return callIrisApi;
    }

    @Override // io.agora.rtc.ng.react.NativeAgoraRtcNgSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean destroyIrisApiEngine() {
        synchronized (this.irisApiLock) {
            try {
                IrisApiEngine irisApiEngine = this.irisApiEngine;
                if (irisApiEngine == null) {
                    return false;
                }
                irisApiEngine.setEventHandler(null);
                this.irisApiEngine.destroy();
                this.irisApiEngine = null;
                this.pipController = null;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.rtc.ng.react.NativeAgoraRtcNgSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "AgoraRtcNg";
    }

    @Override // io.agora.rtc.ng.react.NativeAgoraRtcNgSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isPipActivated() {
        boolean z10;
        synchronized (this.irisApiLock) {
            try {
                z10 = checkPipIsReady() && this.pipController.isActivated();
            } finally {
            }
        }
        return z10;
    }

    @Override // io.agora.rtc.ng.react.NativeAgoraRtcNgSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean newIrisApiEngine() {
        synchronized (this.irisApiLock) {
            try {
                if (this.irisApiEngine != null) {
                    return false;
                }
                IrisApiEngine.enableUseJsonArray(true);
                IrisApiEngine irisApiEngine = new IrisApiEngine(getReactApplicationContext());
                this.irisApiEngine = irisApiEngine;
                irisApiEngine.setEventHandler(this);
                Activity currentActivity = getReactApplicationContext().getCurrentActivity();
                if (currentActivity != null) {
                    initPipController(currentActivity);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.rtc.ng.react.NativeAgoraRtcNgSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public void pipDispose() {
        synchronized (this.irisApiLock) {
            try {
                if (checkPipIsReady()) {
                    this.pipController.dispose();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.rtc.ng.react.NativeAgoraRtcNgSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean pipIsAutoEnterSupported() {
        boolean z10;
        synchronized (this.irisApiLock) {
            try {
                z10 = checkPipIsReady() && this.pipController.isAutoEnterSupported();
            } finally {
            }
        }
        return z10;
    }

    @Override // io.agora.rtc.ng.react.NativeAgoraRtcNgSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean pipIsSupported() {
        boolean z10;
        synchronized (this.irisApiLock) {
            try {
                z10 = checkPipIsReady() && this.pipController.isSupported();
            } finally {
            }
        }
        return z10;
    }

    @Override // io.agora.rtc.ng.react.NativeAgoraRtcNgSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean pipSetup(ReadableMap readableMap) {
        synchronized (this.irisApiLock) {
            try {
                if (checkPipIsReady()) {
                    return this.pipController.setup((readableMap.hasKey("aspectRatioX") && readableMap.hasKey("aspectRatioY")) ? new Rational(readableMap.getInt("aspectRatioX"), readableMap.getInt("aspectRatioY")) : null, readableMap.hasKey("autoEnterEnabled") ? Boolean.valueOf(readableMap.getBoolean("autoEnterEnabled")) : null, (readableMap.hasKey("sourceRectHintLeft") && readableMap.hasKey("sourceRectHintTop") && readableMap.hasKey("sourceRectHintRight") && readableMap.hasKey("sourceRectHintBottom")) ? new Rect(readableMap.getInt("sourceRectHintLeft"), readableMap.getInt("sourceRectHintTop"), readableMap.getInt("sourceRectHintRight"), readableMap.getInt("sourceRectHintBottom")) : null, readableMap.hasKey("seamlessResizeEnabled") ? Boolean.valueOf(readableMap.getBoolean("seamlessResizeEnabled")) : null, readableMap.hasKey("useExternalStateMonitor") ? Boolean.valueOf(readableMap.getBoolean("useExternalStateMonitor")) : Boolean.TRUE, readableMap.hasKey("externalStateMonitorInterval") ? Integer.valueOf(readableMap.getInt("externalStateMonitorInterval")) : 100);
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.rtc.ng.react.NativeAgoraRtcNgSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean pipStart() {
        boolean z10;
        synchronized (this.irisApiLock) {
            try {
                z10 = checkPipIsReady() && this.pipController.start();
            } finally {
            }
        }
        return z10;
    }

    @Override // io.agora.rtc.ng.react.NativeAgoraRtcNgSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public void pipStop() {
        synchronized (this.irisApiLock) {
            try {
                if (checkPipIsReady()) {
                    this.pipController.stop();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.rtc.ng.react.NativeAgoraRtcNgSpec
    @ReactMethod
    public void removeListeners(double d10) {
    }

    @Override // io.agora.rtc.ng.react.NativeAgoraRtcNgSpec
    @ReactMethod
    public void showRPSystemBroadcastPickerView(boolean z10, Promise promise) {
        promise.reject("", "not support");
    }
}
