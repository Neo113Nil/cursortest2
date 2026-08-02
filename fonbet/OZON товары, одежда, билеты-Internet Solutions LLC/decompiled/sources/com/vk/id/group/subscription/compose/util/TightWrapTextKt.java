package com.vk.id.group.subscription.compose.util;

import B0.C2510t;
import B1.U;
import B1.W;
import B1.Y;
import B1.m0;
import Bl0.C2652m;
import K1.K;
import K1.T;
import Pk0.h;
import S0.C3969l;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import U50.l;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vk.id.group.subscription.compose.util.TightWrapTextKt;
import fd.InterfaceC6511n;
import ja.C7330j;
import java.util.NoSuchElementException;
import kd.C7665d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010²\u0006\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002"}, d2 = {"", "text", "Landroidx/compose/ui/e;", "modifier", "LK1/T;", "style", "", "maxLines", "LV1/r;", "overflow", "", "TightWrapText-pNBRTJQ", "(Ljava/lang/String;Landroidx/compose/ui/e;LK1/T;IILS0/k;I)V", "TightWrapText", "LK1/K;", "textLayoutResult", "group-subscription-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TightWrapTextKt {
    /* renamed from: TightWrapText-pNBRTJQ, reason: not valid java name */
    public static final void m51TightWrapTextpNBRTJQ(@NotNull final String text, @NotNull final e modifier, @NotNull final T style, final int i11, final int i12, InterfaceC3967k interfaceC3967k, final int i13) {
        int i14;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(style, "style");
        C3969l u11 = interfaceC3967k.u(-86488437);
        if ((i13 & 6) == 0) {
            i14 = (u11.n(text) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= u11.n(modifier) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= u11.n(style) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 3072) == 0) {
            i14 |= u11.r(i11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 24576) == 0) {
            i14 |= u11.r(i12) ? 16384 : 8192;
        }
        if ((i14 & 9363) == 9362 && u11.b()) {
            u11.j();
        } else {
            u11.o(-524635391);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(null, D1.f25195a);
                u11.x(C11);
            }
            final InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            Object b11 = h.b(u11, -524631270);
            if (b11 == InterfaceC3967k.a.a()) {
                b11 = new InterfaceC6511n() { // from class: ka.b
                    @Override // fd.InterfaceC6511n
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        W TightWrapText_pNBRTJQ$lambda$7$lambda$6;
                        TightWrapText_pNBRTJQ$lambda$7$lambda$6 = TightWrapTextKt.TightWrapText_pNBRTJQ$lambda$7$lambda$6(InterfaceC3978p0.this, (Y) obj, (U) obj2, (Z1.b) obj3);
                        return TightWrapText_pNBRTJQ$lambda$7$lambda$6;
                    }
                };
                u11.x(b11);
            }
            u11.k();
            e a11 = b.a((InterfaceC6511n) b11, modifier);
            u11.o(-524603219);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = new l(interfaceC3978p0, 1);
                u11.x(C12);
            }
            u11.k();
            C2510t.b(text, a11, style, (Function1) C12, i12, false, i11, 0, null, u11, (i14 & 14) | 3072 | (i14 & 896) | (57344 & i14) | ((i14 << 9) & 3670016), 416);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: ka.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TightWrapText_pNBRTJQ$lambda$10;
                    int intValue = ((Integer) obj2).intValue();
                    int i15 = i12;
                    int i16 = i13;
                    TightWrapText_pNBRTJQ$lambda$10 = TightWrapTextKt.TightWrapText_pNBRTJQ$lambda$10(text, modifier, style, i11, i15, i16, (InterfaceC3967k) obj, intValue);
                    return TightWrapText_pNBRTJQ$lambda$10;
                }
            });
        }
    }

    private static final K TightWrapText_pNBRTJQ$lambda$1(InterfaceC3978p0<K> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TightWrapText_pNBRTJQ$lambda$10(String str, e eVar, T t2, int i11, int i12, int i13, InterfaceC3967k interfaceC3967k, int i14) {
        m51TightWrapTextpNBRTJQ(str, eVar, t2, i11, i12, interfaceC3967k, C2652m.e(i13 | 1));
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W TightWrapText_pNBRTJQ$lambda$7$lambda$6(InterfaceC3978p0 interfaceC3978p0, Y layout, U measurable, Z1.b bVar) {
        W z02;
        W z03;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final m0 a02 = measurable.a0(bVar.p());
        K TightWrapText_pNBRTJQ$lambda$1 = TightWrapText_pNBRTJQ$lambda$1(interfaceC3978p0);
        Intrinsics.f(TightWrapText_pNBRTJQ$lambda$1);
        if (TightWrapText_pNBRTJQ$lambda$1.m() == 0) {
            z03 = layout.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new C7330j(a02, 1));
            return z03;
        }
        C7665d it = kotlin.ranges.h.o(0, TightWrapText_pNBRTJQ$lambda$1.m()).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        final float r11 = TightWrapText_pNBRTJQ$lambda$1.r(it.b());
        while (it.hasNext()) {
            r11 = Math.min(r11, TightWrapText_pNBRTJQ$lambda$1.r(it.b()));
        }
        C7665d it2 = kotlin.ranges.h.o(0, TightWrapText_pNBRTJQ$lambda$1.m()).iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        float s11 = TightWrapText_pNBRTJQ$lambda$1.s(it2.b());
        while (it2.hasNext()) {
            s11 = Math.max(s11, TightWrapText_pNBRTJQ$lambda$1.s(it2.b()));
        }
        z02 = layout.z0((int) Math.ceil(s11 - r11), a02.l0(), kotlin.collections.U.c(), new Function1() { // from class: ka.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit TightWrapText_pNBRTJQ$lambda$7$lambda$6$lambda$5;
                TightWrapText_pNBRTJQ$lambda$7$lambda$6$lambda$5 = TightWrapTextKt.TightWrapText_pNBRTJQ$lambda$7$lambda$6$lambda$5(m0.this, r11, (m0.a) obj);
                return TightWrapText_pNBRTJQ$lambda$7$lambda$6$lambda$5;
            }
        });
        return z02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TightWrapText_pNBRTJQ$lambda$7$lambda$6$lambda$3(m0 m0Var, m0.a layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        layout.h(m0Var, 0, 0, 0.0f);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TightWrapText_pNBRTJQ$lambda$7$lambda$6$lambda$5(m0 m0Var, float f7, m0.a layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        layout.d(m0Var, -((int) Math.floor(f7)), 0, 0.0f);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TightWrapText_pNBRTJQ$lambda$9$lambda$8(InterfaceC3978p0 interfaceC3978p0, K it) {
        Intrinsics.checkNotNullParameter(it, "it");
        interfaceC3978p0.setValue(it);
        return Unit.f71690a;
    }
}
