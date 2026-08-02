package com.blaze.blazesdk.features.moments.container.compose;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import defpackage.a99;
import defpackage.aee;
import defpackage.av8;
import defpackage.bkh;
import defpackage.e12;
import defpackage.eqf;
import defpackage.f50;
import defpackage.fqj;
import defpackage.hf3;
import defpackage.if3;
import defpackage.k1c;
import defpackage.mz1;
import defpackage.nf3;
import defpackage.nz;
import defpackage.of3;
import defpackage.ox1;
import defpackage.sx1;
import defpackage.td4;
import defpackage.ux1;
import defpackage.uxf;
import defpackage.vx1;
import defpackage.waa;
import defpackage.xtc;
import defpackage.z8e;
import defpackage.zg3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxtc;", "modifier", "Lcom/blaze/blazesdk/features/moments/container/compose/BlazeMomentsPlayerContainerComposeStateHandler;", "stateHandler", "", "BlazeMomentsPlayerContainerCompose", "(Lxtc;Lcom/blaze/blazesdk/features/moments/container/compose/BlazeMomentsPlayerContainerComposeStateHandler;Lof3;I)V", "blazesdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeMomentsPlayerContainerComposeKt {
    @Keep
    public static final void BlazeMomentsPlayerContainerCompose(@NotNull xtc xtcVar, @NotNull BlazeMomentsPlayerContainerComposeStateHandler blazeMomentsPlayerContainerComposeStateHandler, @Nullable of3 of3Var, int i) {
        int i2;
        xtcVar.getClass();
        blazeMomentsPlayerContainerComposeStateHandler.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1870135321);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(xtcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(blazeMomentsPlayerContainerComposeStateHandler) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && av8Var.D()) {
            av8Var.W();
        } else {
            k1c c = e12.c(uxf.c, false);
            int G = z8e.G(av8Var);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c, hf3.g);
            waa.K(av8Var, m, hf3.f);
            f50 f50Var = hf3.j;
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                mz1.t(G, av8Var, G, f50Var);
            }
            waa.K(av8Var, C, hf3.d);
            a(bkh.c, blazeMomentsPlayerContainerComposeStateHandler, av8Var, (i2 & 112) | 6);
            av8Var.s(true);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ux1(xtcVar, blazeMomentsPlayerContainerComposeStateHandler, i, 0);
        }
    }

    public static final void a(xtc xtcVar, BlazeMomentsPlayerContainerComposeStateHandler blazeMomentsPlayerContainerComposeStateHandler, of3 of3Var, int i) {
        int i2;
        xtc xtcVar2;
        xtcVar.getClass();
        blazeMomentsPlayerContainerComposeStateHandler.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1289172620);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(xtcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(blazeMomentsPlayerContainerComposeStateHandler) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && av8Var.D()) {
            av8Var.W();
            xtcVar2 = xtcVar;
        } else {
            Context context = (Context) av8Var.k(nz.b);
            av8Var.d0(784839169);
            FrameLayout frameLayout = new FrameLayout(context);
            blazeMomentsPlayerContainerComposeStateHandler.setContainerView(frameLayout);
            av8Var.d0(190704003);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new sx1(2);
                av8Var.n0(O);
            }
            av8Var.s(false);
            blazeMomentsPlayerContainerComposeStateHandler.startPlaying((Function1) O);
            av8Var.s(false);
            av8Var.d0(784845886);
            boolean i3 = av8Var.i(frameLayout);
            Object O2 = av8Var.O();
            if (i3 || O2 == a99Var) {
                O2 = new vx1(frameLayout, 0);
                av8Var.n0(O2);
            }
            Function1 function1 = (Function1) O2;
            av8Var.s(false);
            av8Var.d0(784850714);
            boolean i4 = av8Var.i(blazeMomentsPlayerContainerComposeStateHandler);
            Object O3 = av8Var.O();
            if (i4 || O3 == a99Var) {
                O3 = new ox1(blazeMomentsPlayerContainerComposeStateHandler, 4);
                av8Var.n0(O3);
            }
            Function1 function12 = (Function1) O3;
            av8Var.s(false);
            av8Var.d0(784848044);
            Object O4 = av8Var.O();
            if (O4 == a99Var) {
                O4 = new sx1(3);
                av8Var.n0(O4);
            }
            av8Var.s(false);
            xtcVar2 = xtcVar;
            td4.b(function1, xtcVar2, null, function12, (Function1) O4, av8Var, ((i2 << 3) & 112) | 24576, 4);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ux1(xtcVar2, blazeMomentsPlayerContainerComposeStateHandler, i, 1);
        }
    }
}
