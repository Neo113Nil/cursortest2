package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.ironsource.U3;
import defpackage.a70;
import defpackage.mz1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzjh {
    public static void a(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble(U3.i.X, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong(U3.i.X, ((Long) obj).longValue());
        } else {
            bundle.putString(U3.i.X, obj.toString());
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
        String canonicalName = cls.getCanonicalName();
        a70.r(mz1.o(mz1.s("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), U3.j.e));
        return null;
    }
}
