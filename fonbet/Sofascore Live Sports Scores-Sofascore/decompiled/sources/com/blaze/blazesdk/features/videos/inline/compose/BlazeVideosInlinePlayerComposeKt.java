package com.blaze.blazesdk.features.videos.inline.compose;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import com.blaze.blazesdk.features.videos.inline.compose.BlazeVideosInlinePlayerComposeKt;
import defpackage.a99;
import defpackage.aee;
import defpackage.av8;
import defpackage.bkh;
import defpackage.cib;
import defpackage.e12;
import defpackage.eqf;
import defpackage.f50;
import defpackage.fqj;
import defpackage.hf3;
import defpackage.if3;
import defpackage.k1c;
import defpackage.mhb;
import defpackage.mz1;
import defpackage.nf3;
import defpackage.nz;
import defpackage.of3;
import defpackage.ox1;
import defpackage.sx1;
import defpackage.td4;
import defpackage.ttk;
import defpackage.u6b;
import defpackage.utc;
import defpackage.uxf;
import defpackage.vx1;
import defpackage.waa;
import defpackage.wx1;
import defpackage.xtc;
import defpackage.z8e;
import defpackage.zg3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxtc;", "modifier", "Lcom/blaze/blazesdk/features/videos/inline/compose/BlazeVideosInlinePlayerComposeStateHandler;", "stateHandler", "", "BlazeVideosInlinePlayerCompose", "(Lxtc;Lcom/blaze/blazesdk/features/videos/inline/compose/BlazeVideosInlinePlayerComposeStateHandler;Lof3;II)V", "blazesdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeVideosInlinePlayerComposeKt {
    @Keep
    public static final void BlazeVideosInlinePlayerCompose(@Nullable xtc xtcVar, @NotNull BlazeVideosInlinePlayerComposeStateHandler blazeVideosInlinePlayerComposeStateHandler, @Nullable of3 of3Var, int i, int i2) {
        int i3;
        blazeVideosInlinePlayerComposeStateHandler.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-202863573);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (av8Var.g(xtcVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= av8Var.i(blazeVideosInlinePlayerComposeStateHandler) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && av8Var.D()) {
            av8Var.W();
        } else {
            if (i4 != 0) {
                xtcVar = utc.a;
            }
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
            a(bkh.c, blazeVideosInlinePlayerComposeStateHandler, av8Var, (i3 & 112) | 6);
            av8Var.s(true);
        }
        xtc xtcVar2 = xtcVar;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wx1(xtcVar2, blazeVideosInlinePlayerComposeStateHandler, i, i2, 1);
        }
    }

    public static final void a(final xtc xtcVar, final BlazeVideosInlinePlayerComposeStateHandler blazeVideosInlinePlayerComposeStateHandler, of3 of3Var, final int i) {
        int i2;
        final xtc xtcVar2;
        xtcVar.getClass();
        blazeVideosInlinePlayerComposeStateHandler.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1414204042);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(xtcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(blazeVideosInlinePlayerComposeStateHandler) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && av8Var.D()) {
            av8Var.W();
            xtcVar2 = xtcVar;
        } else {
            Context context = (Context) av8Var.k(nz.b);
            u6b u6bVar = (u6b) av8Var.k(mhb.a);
            ttk a = cib.a(av8Var);
            final int i3 = 0;
            if (a == null) {
                eqf u = av8Var.u();
                if (u != null) {
                    u.d = new Function2() { // from class: zx1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            of3 of3Var2 = (of3) obj;
                            ((Integer) obj2).intValue();
                            switch (i4) {
                                case 0:
                                    BlazeVideosInlinePlayerComposeKt.a(xtcVar, blazeVideosInlinePlayerComposeStateHandler, of3Var2, aba.K(i | 1));
                                    break;
                                default:
                                    BlazeVideosInlinePlayerComposeKt.a(xtcVar, blazeVideosInlinePlayerComposeStateHandler, of3Var2, aba.K(i | 1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            FrameLayout frameLayout = new FrameLayout(context);
            blazeVideosInlinePlayerComposeStateHandler.setContainerView(frameLayout, u6bVar, a);
            av8Var.d0(-1363565370);
            boolean i4 = av8Var.i(frameLayout);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (i4 || O == a99Var) {
                O = new vx1(frameLayout, 2);
                av8Var.n0(O);
            }
            Function1 function1 = (Function1) O;
            av8Var.s(false);
            av8Var.d0(-1363560542);
            boolean i5 = av8Var.i(blazeVideosInlinePlayerComposeStateHandler);
            Object O2 = av8Var.O();
            if (i5 || O2 == a99Var) {
                O2 = new ox1(blazeVideosInlinePlayerComposeStateHandler, 7);
                av8Var.n0(O2);
            }
            Function1 function12 = (Function1) O2;
            av8Var.s(false);
            av8Var.d0(-1363563212);
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = new sx1(24);
                av8Var.n0(O3);
            }
            av8Var.s(false);
            xtcVar2 = xtcVar;
            td4.b(function1, xtcVar2, null, function12, (Function1) O3, av8Var, ((i2 << 3) & 112) | 24576, 4);
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            final int i6 = 1;
            u2.d = new Function2() { // from class: zx1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i6;
                    of3 of3Var2 = (of3) obj;
                    ((Integer) obj2).intValue();
                    switch (i42) {
                        case 0:
                            BlazeVideosInlinePlayerComposeKt.a(xtcVar2, blazeVideosInlinePlayerComposeStateHandler, of3Var2, aba.K(i | 1));
                            break;
                        default:
                            BlazeVideosInlinePlayerComposeKt.a(xtcVar2, blazeVideosInlinePlayerComposeStateHandler, of3Var2, aba.K(i | 1));
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }
}
