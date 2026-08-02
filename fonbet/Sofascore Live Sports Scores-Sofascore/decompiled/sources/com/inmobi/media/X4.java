package com.inmobi.media;

import defpackage.aea;
import defpackage.b1d;
import defpackage.cu3;
import defpackage.hs4;
import defpackage.ku3;
import defpackage.lj2;
import defpackage.oed;
import defpackage.p2g;
import defpackage.rob;
import defpackage.s9a;
import defpackage.smi;
import defpackage.tz9;
import defpackage.uic;
import defpackage.w2g;
import defpackage.xw3;
import defpackage.yda;
import defpackage.z45;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class X4 {
    public static final ku3 a(ku3 ku3Var, cu3 cu3Var) {
        ku3Var.getClass();
        yda ydaVar = (yda) ku3Var.getCoroutineContext().get(uic.g);
        smi smiVar = ydaVar != null ? new smi(ydaVar) : tz9.o();
        hs4 hs4Var = z45.a;
        return s9a.c(kotlin.coroutines.e.d(smiVar, rob.a.f).plus(cu3Var));
    }

    public static final ku3 a(ku3 ku3Var) {
        ku3Var.getClass();
        return s9a.c(ku3Var.getCoroutineContext().plus(new aea((yda) ku3Var.getCoroutineContext().get(uic.g))));
    }

    public static final yda a(ku3 ku3Var, Function2 function2) {
        ku3Var.getClass();
        function2.getClass();
        hs4 hs4Var = z45.a;
        return xw3.L(ku3Var, rob.a, null, function2, 2);
    }

    public static final void a(b1d b1dVar, ku3 ku3Var, AbstractC3650oc abstractC3650oc) {
        b1dVar.getClass();
        ku3Var.getClass();
        xw3.L(ku3Var, null, null, new W4(b1dVar, abstractC3650oc, null), 3);
    }

    public static final void a(List list) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((yda) it.next()).e(null);
        }
        list.clear();
    }

    public static final void a(lj2 lj2Var, Object obj) {
        lj2Var.getClass();
        if (lj2Var.r() instanceof oed) {
            try {
                p2g p2gVar = w2g.b;
                lj2Var.resumeWith(obj);
            } catch (IllegalStateException unused) {
            }
        }
    }
}
