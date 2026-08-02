package ru.ozon.android.messenger.blocks.chat.search;

import B1.InterfaceC2547p;
import D1.InterfaceC2801g;
import E0.C2942q;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.K0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.android.messenger.framework.presentation.common.screen.compose.t;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconKt;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconStyle;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import u0.C9891D;

/* loaded from: classes10.dex */
public final class g {
    public static final void a(androidx.compose.ui.e eVar, @NotNull TextDTO title, @NotNull TextDTO previewMessage, @NotNull TextDTO time, List list, IconDTO iconDTO, List list2, TextDTO textDTO, @NotNull Function0 onView, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        TextDTO textDTO2;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(previewMessage, "previewMessage");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(onView, "onView");
        C3969l u11 = interfaceC3967k.u(1379742670);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(title) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(previewMessage) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(time) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.n(list) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= (262144 & i11) == 0 ? u11.n(iconDTO) : u11.F(iconDTO) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= (2097152 & i11) == 0 ? u11.n(list2) : u11.F(list2) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            textDTO2 = textDTO;
            i12 |= u11.n(textDTO2) ? 8388608 : 4194304;
        } else {
            textDTO2 = textDTO;
        }
        if ((100663296 & i11) == 0) {
            i12 |= u11.F(onView) ? 67108864 : 33554432;
        }
        if ((38347923 & i12) == 38347922 && u11.b()) {
            u11.j();
        } else {
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            u11.o(573217840);
            boolean z11 = (i12 & 234881024) == 67108864;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new b(onView);
                u11.x(C11);
            }
            u11.k();
            e3.i.a(aVar, null, (Function0) C11, u11, 6);
            t.a(null, a1.c.c(987786186, new c(eVar, iconDTO, iconDTO != null ? 8 : 12, list, textDTO2, previewMessage, list2, title, time), u11), u11, 48);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new d(eVar, title, previewMessage, time, list, iconDTO, list2, textDTO, onView, i11));
        }
    }

    public static final void b(androidx.compose.ui.e eVar, List list, TextDTO textDTO, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l c3969l;
        androidx.compose.ui.e eVar2;
        C3969l u11 = interfaceC3967k.u(1209887619);
        int i12 = i11 | 6;
        if ((i11 & 48) == 0) {
            i12 |= u11.n(list) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(textDTO) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            eVar2 = eVar;
            c3969l = u11;
        } else {
            e.a aVar = androidx.compose.ui.e.f40358c0;
            Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, aVar);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            androidx.compose.ui.e j11 = T.j(aVar, 0.0f, 0.0f, 0.0f, 4, 7);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            androidx.compose.ui.e l02 = j11.l0(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            Y b12 = X.b(C5179b.n(8), InterfaceC6250b.a.l(), u11, 6);
            int I12 = u11.I();
            A0 d12 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, l02);
            Function0 a12 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 h12 = Cm.e.h(u11, b12, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, h12);
            }
            U7.i.b(u11, f11, 1654429632);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    DsBadgeAtomKt.DsBadgeAtom((BadgeDTO) it.next(), null, null, u11, 0, 6);
                }
            }
            u11.k();
            u11.f();
            u11.o(121198414);
            if (textDTO == null) {
                c3969l = u11;
            } else {
                c3969l = u11;
                DsTextAtomKt.DsTextAtom(TextDTO.copy$default(textDTO, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null), null, c3969l, 0, 2);
            }
            c3969l.k();
            c3969l.f();
            eVar2 = aVar;
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new a(eVar2, list, textDTO, i11));
        }
    }

    public static final void c(androidx.compose.ui.e eVar, TextDTO textDTO, TextDTO textDTO2, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(793004360);
        int i12 = i11 | 6;
        if ((i11 & 48) == 0) {
            i12 |= u11.n(textDTO) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(textDTO2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            eVar = androidx.compose.ui.e.f40358c0;
            Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, eVar);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            DsTextAtomKt.DsTextAtom(textDTO, T.j(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0.0f, 0.0f, 8, 0.0f, 11), u11, (i12 >> 3) & 14, 0);
            DsTextAtomKt.DsTextAtom(textDTO2, new VerticalAlignElement(InterfaceC6250b.a.l()), u11, (i12 >> 6) & 14, 0);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new e(eVar, textDTO, textDTO2, i11));
        }
    }

    public static final void d(e.a aVar, TextDTO textDTO, TextDTO textDTO2, List list, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C9891D c9891d;
        float f7;
        long j11;
        long j12;
        long j13;
        K1.T t2;
        C3969l u11 = interfaceC3967k.u(442184173);
        int i13 = i11 | 6;
        int i14 = 16;
        if ((i11 & 48) == 0) {
            i13 |= u11.n(textDTO) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= u11.n(textDTO2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i13 |= (i11 & 4096) == 0 ? u11.n(list) : u11.F(list) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            e.a aVar2 = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e e11 = a0.e(aVar2, 1.0f);
            Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, e11);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            C9891D c9891d2 = C9891D.f99599a;
            androidx.compose.ui.e a12 = c9891d2.a(aVar2, 1.0f, true);
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I12 = u11.I();
            A0 d12 = u11.d();
            androidx.compose.ui.e f12 = androidx.compose.ui.c.f(u11, a12);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 h12 = Cm.e.h(u11, b12, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, h12);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            int i15 = 0;
            float f13 = 8;
            DsTextAtomKt.DsTextAtom(textDTO, T.j(c9891d2.a(aVar2, 1.0f, false), 0.0f, 0.0f, f13, 0.0f, 11), u11, (i13 >> 3) & 14, 0);
            u11.o(1355859986);
            if (list.isEmpty()) {
                i12 = i13;
                aVar = aVar2;
                c9891d = c9891d2;
                f7 = f13;
            } else {
                Y b13 = X.b(C5179b.n(4), InterfaceC6250b.a.i(), u11, 54);
                int I13 = u11.I();
                A0 d13 = u11.d();
                androidx.compose.ui.e f14 = androidx.compose.ui.c.f(u11, aVar2);
                Function0 a14 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a14);
                } else {
                    u11.e();
                }
                Function2 h13 = Cm.e.h(u11, b13, u11, d13);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                    Ep.a.d(I13, u11, I13, h13);
                }
                U7.i.b(u11, f14, -656662554);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Icon icon = (Icon) it.next();
                    AbstractC8972b abstractC8972b = TokenParserKt.tokenToIcon(icon.getImage(), u11, i15);
                    InterfaceC2547p.a.d d14 = InterfaceC2547p.a.d();
                    C7807Z c7807z = TokenParserKt.tokenToColor(icon.getTintColor(), u11, i15);
                    j11 = C7807Z.f72259m;
                    j12 = C7807Z.f72259m;
                    j13 = C7807Z.f72259m;
                    K0 k02 = new K0(j13);
                    t2 = K1.T.f15012d;
                    float f15 = i14;
                    DsIconKt.DsIcon(new DsIconStyle(d14, c7807z, j11, C7807Z.m(j12), k02, t2, 0, f15, f15, Float.NaN, (AbstractC7799Q) null, (DefaultConstructorMarker) null), null, null, abstractC8972b, null, false, false, null, u11, DsIconStyle.$stable, 246);
                    i15 = 0;
                    c9891d2 = c9891d2;
                    i14 = i14;
                    i13 = i13;
                    f13 = f13;
                    aVar2 = aVar2;
                }
                i12 = i13;
                aVar = aVar2;
                c9891d = c9891d2;
                f7 = f13;
                u11.k();
                u11.f();
            }
            u11.k();
            u11.f();
            ru.ozon.android.messenger.framework.presentation.common.utils.a.b(f7, u11);
            DsTextAtomKt.DsTextAtom(textDTO2, c9891d.b(androidx.compose.ui.e.f40358c0, InterfaceC6250b.a.i()), u11, (i12 >> 6) & 14, 0);
            u11.f();
        }
        e.a aVar3 = aVar;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new f(aVar3, textDTO, textDTO2, list, i11));
        }
    }
}
