package e6;

import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public ReactContext f45730a;

    public n(ReactContext reactContext) {
        this.f45730a = reactContext;
    }

    public String a(Bundle bundle) {
        try {
            return b(bundle).toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public final JSONObject b(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                jSONObject.put(str, b((Bundle) obj));
            } else {
                jSONObject.put(str, JSONObject.wrap(obj));
            }
        }
        return jSONObject;
    }

    public void c(Bundle bundle) {
        String a10 = a(bundle);
        WritableMap createMap = Arguments.createMap();
        createMap.putString("dataJSON", a10);
        d("remoteNotificationReceived", createMap);
    }

    public void d(String str, Object obj) {
        if (this.f45730a.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f45730a.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, obj);
        }
    }
}
