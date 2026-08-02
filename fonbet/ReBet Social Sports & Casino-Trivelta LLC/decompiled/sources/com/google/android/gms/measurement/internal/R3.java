package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.twilio.voice.EventKeys;

/* loaded from: classes2.dex */
public abstract class R3 {
    public static void a(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble(EventKeys.VALUE_KEY, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong(EventKeys.VALUE_KEY, ((Long) obj).longValue());
        } else {
            bundle.putString(EventKeys.VALUE_KEY, obj.toString());
        }
    }

    public static Object b(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", str, cls.getCanonicalName(), obj2.getClass().getCanonicalName()));
    }
}
