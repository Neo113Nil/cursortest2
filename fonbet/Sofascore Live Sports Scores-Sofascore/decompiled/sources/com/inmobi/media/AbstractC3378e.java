package com.inmobi.media;

import defpackage.joa;
import defpackage.ku3;
import defpackage.mth;
import defpackage.s9a;
import defpackage.tz9;
import defpackage.xw3;
import defpackage.z45;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3378e {
    public static void a(N0 n0, Vg vg, Long l, Function0 function0) {
        n0.getClass();
        function0.getClass();
        joa joaVar = F0.a;
        long longValue = l != null ? l.longValue() : 0L;
        mth mthVar = new mth(11, function0, n0, vg);
        ku3 ku3Var = F0.e;
        if (ku3Var == null) {
            ku3Var = s9a.c(z45.a.plus(tz9.o()));
            F0.e = ku3Var;
        }
        xw3.L(ku3Var, null, null, new E0(longValue, mthVar, null), 3);
    }

    public static final boolean a() {
        return true;
    }

    public static final Unit a(Function0 function0, N0 n0, Vg vg) {
        try {
            if (((Boolean) function0.invoke()).booleanValue()) {
                Object a = n0.a();
                if (vg != null) {
                    vg.a(a);
                }
            } else if (vg != null) {
                vg.onError(new Exception("Capture Aborted: Should Capture not satisfied"));
            }
        } catch (Exception e) {
            if (vg != null) {
                vg.onError(e);
            }
        }
        return Unit.a;
    }
}
