package Lg;

import android.content.Context;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import eb.C4196f;
import eb.m;
import io.invertase.firebase.app.ReactNativeFirebaseAppModule;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class a {
    public static Map a(C4196f c4196f) {
        String p10 = c4196f.p();
        eb.m q10 = c4196f.q();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("name", p10);
        hashMap3.put("automaticDataCollectionEnabled", Boolean.valueOf(c4196f.w()));
        hashMap2.put("apiKey", q10.b());
        hashMap2.put("appId", q10.c());
        hashMap2.put("projectId", q10.g());
        hashMap2.put("databaseURL", q10.d());
        hashMap2.put("measurementId", q10.e());
        hashMap2.put("messagingSenderId", q10.f());
        hashMap2.put("storageBucket", q10.h());
        if (ReactNativeFirebaseAppModule.authDomains.get(p10) != null) {
            hashMap2.put("authDomain", ReactNativeFirebaseAppModule.authDomains.get(p10));
        }
        hashMap.put("options", hashMap2);
        hashMap.put("appConfig", hashMap3);
        return hashMap;
    }

    public static WritableMap b(C4196f c4196f) {
        return Arguments.makeNativeMap((Map<String, ? extends Object>) a(c4196f));
    }

    public static C4196f c(ReadableMap readableMap, ReadableMap readableMap2, Context context) {
        m.b bVar = new m.b();
        String string = readableMap2.getString("name");
        bVar.b(readableMap.getString("apiKey"));
        bVar.c(readableMap.getString("appId"));
        bVar.g(readableMap.getString("projectId"));
        bVar.d(readableMap.getString("databaseURL"));
        if (readableMap.hasKey("measurementId")) {
            bVar.e(readableMap.getString("measurementId"));
        }
        bVar.h(readableMap.getString("storageBucket"));
        bVar.f(readableMap.getString("messagingSenderId"));
        C4196f u10 = string.equals("[DEFAULT]") ? C4196f.u(context, bVar.a()) : C4196f.v(context, bVar.a(), string);
        if (readableMap2.hasKey("automaticDataCollectionEnabled")) {
            u10.C(Boolean.valueOf(readableMap2.getBoolean("automaticDataCollectionEnabled")));
        }
        if (readableMap2.hasKey("automaticResourceManagement")) {
            u10.B(readableMap2.getBoolean("automaticResourceManagement"));
        }
        return u10;
    }

    public static WritableMap d(ReadableMap readableMap) {
        WritableMap createMap = Arguments.createMap();
        createMap.merge(readableMap);
        return createMap;
    }
}
