package com.inmobi.media;

import defpackage.ku3;
import defpackage.s9a;
import defpackage.te6;
import defpackage.tz9;
import defpackage.vdl;
import defpackage.xw3;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3353d {
    public static void a(Function0 function0) {
        function0.getClass();
        vdl vdlVar = new vdl(3, function0);
        ku3 ku3Var = F0.f;
        if (ku3Var == null) {
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new M9("AdQualityComponent-aqBeacon", false));
            newSingleThreadExecutor.getClass();
            ku3Var = s9a.c(new te6(newSingleThreadExecutor).plus(tz9.o()));
            F0.f = ku3Var;
        }
        xw3.L(ku3Var, null, null, new D0(vdlVar, null), 3);
    }

    public static final Unit b(Function0 function0) {
        function0.invoke();
        return Unit.a;
    }
}
