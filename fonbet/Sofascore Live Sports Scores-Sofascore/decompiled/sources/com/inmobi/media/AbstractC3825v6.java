package com.inmobi.media;

import defpackage.joa;
import defpackage.ku3;
import defpackage.ok3;
import defpackage.s9a;
import defpackage.te6;
import defpackage.tub;
import defpackage.wv8;
import defpackage.xqm;
import defpackage.xw3;
import defpackage.ypa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Pair;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.v6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3825v6 {
    public static final joa a = ypa.b(new xqm(6));

    public static void a(C3592m6 c3592m6, String str, int i, int i2, long j, Zk zk, C3773t6 c3773t6, boolean z) {
        long j2;
        long j3;
        if (AbstractC3420ff.a() != null || !AbstractC3424fj.d.get()) {
            c3773t6.getClass();
            c3592m6.getClass();
            c3773t6.e.getClass();
            ok3.J(new C3670p6(c3592m6, false, c3773t6, null));
            c3773t6.a(System.currentTimeMillis());
            if (c3773t6.d != null) {
                ArrayList arrayList = c3592m6.a;
                arrayList.getClass();
                Integer num = Ak.c;
                if (num != null && arrayList.contains(Integer.valueOf(num.intValue()))) {
                    Ak.c = null;
                }
            }
            c3773t6.f.set(false);
            return;
        }
        if (str != null) {
            String str2 = c3592m6.b;
            int i3 = i - i2;
            str2.getClass();
            HashMap f = tub.f(new Pair("payload", str2));
            JSONObject b = AbstractC3386e7.b();
            if (b != null) {
                String jSONObject = b.toString();
                jSONObject.getClass();
                f.put("consentObject", jSONObject);
            }
            Ze ze = new Ze(str, i3 > 0 ? wv8.o("X-im-retry-count", String.valueOf(i3)) : null, null, new C3438g7(f, 0), null, 52);
            if (z) {
                if (i2 != i) {
                    j3 = ((long) Math.pow(2.0d, i3)) * j;
                    j2 = j3;
                    xw3.L((ku3) a.getValue(), null, null, new C3799u6(j2, ze, i2, c3592m6, str, i, j, zk, c3773t6, z, null), 3);
                }
            } else if (i2 != i) {
                j2 = j;
                xw3.L((ku3) a.getValue(), null, null, new C3799u6(j2, ze, i2, c3592m6, str, i, j, zk, c3773t6, z, null), 3);
            }
            j3 = 0;
            j2 = j3;
            xw3.L((ku3) a.getValue(), null, null, new C3799u6(j2, ze, i2, c3592m6, str, i, j, zk, c3773t6, z, null), 3);
        }
    }

    public static final ku3 a() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new M9("v6", false));
        newSingleThreadExecutor.getClass();
        return s9a.c(new te6(newSingleThreadExecutor));
    }
}
