package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme;

import com.ironsource.V2;
import defpackage.av8;
import defpackage.eqf;
import defpackage.ff5;
import defpackage.h5a;
import defpackage.hkg;
import defpackage.hz8;
import defpackage.of3;
import defpackage.p23;
import defpackage.q23;
import defpackage.r13;
import defpackage.tc3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class d {
    public static final p23 a;
    public static final p23 b;

    static {
        long j = a.a;
        long j2 = r13.d;
        ff5 ff5Var = q23.a;
        long d = hkg.d(4279374354L);
        long d2 = hkg.d(4279374354L);
        long d3 = hkg.d(4291782265L);
        long j3 = r13.b;
        a = new p23(j, j, j2, j2, d, d2, d3, j3, j3, j2, j2, j3, false);
        b = q23.c(4088, j, j, j2);
    }

    public static final void a(final boolean z, tc3 tc3Var, of3 of3Var, final int i) {
        final tc3 tc3Var2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(156854067);
        if (((i | 2) & 19) == 18 && av8Var.D()) {
            av8Var.W();
            tc3Var2 = tc3Var;
        } else {
            av8Var.Y();
            if ((i & 1) == 0 || av8Var.B()) {
                z = hz8.O(av8Var);
            } else {
                av8Var.W();
            }
            av8Var.t();
            tc3Var2 = tc3Var;
            h5a.n(z ? a : b, e.a, b.a, tc3Var2, av8Var, V2.b.f, 0);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(z, tc3Var2, i) { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.c
                public final /* synthetic */ boolean a;
                public final /* synthetic */ tc3 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d.a(this.a, this.b, (of3) obj, 49);
                    return Unit.a;
                }
            };
        }
    }
}
