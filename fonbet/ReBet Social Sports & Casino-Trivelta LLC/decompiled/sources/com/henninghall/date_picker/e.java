package com.henninghall.date_picker;

import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.Calendar;

/* loaded from: classes3.dex */
public abstract class e {
    public static DeviceEventManagerModule.RCTDeviceEventEmitter a() {
        return (DeviceEventManagerModule.RCTDeviceEventEmitter) c.f38475a.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    public static void b(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(StackTraceHelper.ID_KEY, str);
        a().emit("onCancel", createMap);
    }

    public static void c(String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("date", str);
        createMap.putString(StackTraceHelper.ID_KEY, str2);
        a().emit("onConfirm", createMap);
    }

    public static void d(Calendar calendar, String str, String str2, View view) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("date", o.b(calendar));
        createMap.putString("dateString", str);
        createMap.putString(StackTraceHelper.ID_KEY, str2);
        a().emit("dateChange", createMap);
    }

    public static void e(Tb.c cVar, String str, View view) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("spinnerState", cVar.toString());
        createMap.putString(StackTraceHelper.ID_KEY, str);
        a().emit("spinnerStateChange", createMap);
    }
}
