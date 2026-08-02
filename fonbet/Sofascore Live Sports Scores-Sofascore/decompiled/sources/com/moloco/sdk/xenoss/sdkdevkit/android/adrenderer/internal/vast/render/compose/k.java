package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import defpackage.av8;
import defpackage.ct8;
import defpackage.dch;
import defpackage.fch;
import defpackage.ff5;
import defpackage.hkg;
import defpackage.mo3;
import defpackage.n7g;
import defpackage.of3;
import defpackage.p23;
import defpackage.q23;
import defpackage.r13;
import defpackage.r72;
import defpackage.rz8;
import defpackage.t3e;
import defpackage.tc3;
import defpackage.un4;
import defpackage.utc;
import defpackage.yqo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k implements ct8 {
    public final /* synthetic */ Function0 a;

    public k(Function0 function0) {
        this.a = function0;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        of3 of3Var = (of3) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).h(booleanValue) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        tc3 y = yqo.y(-919554769, of3Var, new j(booleanValue));
        av8 av8Var2 = (av8) of3Var;
        n7g n7gVar = ((dch) av8Var2.k(fch.a)).a;
        t3e t3eVar = r72.a;
        long j = r13.h;
        ff5 ff5Var = q23.a;
        long b = ((p23) av8Var2.k(ff5Var)).b();
        long a = ((p23) av8Var2.k(ff5Var)).a();
        long j2 = ((r13) av8Var2.k(mo3.a)).a;
        if (((p23) av8Var2.k(ff5Var)).d()) {
            hkg.e0(j2);
        } else {
            hkg.e0(j2);
        }
        rz8.b(this.a, utc.a, true, null, n7gVar, null, new un4(j, b, j, r13.c(a, 0.38f)), r72.e, y, of3Var, 805306368, 0);
        return Unit.a;
    }
}
