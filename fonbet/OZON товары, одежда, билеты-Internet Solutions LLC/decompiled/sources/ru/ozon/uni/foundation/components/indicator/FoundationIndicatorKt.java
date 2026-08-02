package ru.ozon.uni.foundation.components.indicator;

import B1.InterfaceC2547p;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import J0.u3;
import K1.T;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import T7.E;
import V1.h;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7809a0;
import l1.J0;
import n0.C8366G;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u001a{\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001aO\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a_\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a7\u0010 \u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "iconModifier", "labelModifier", "Ll1/Z;", "backgroundColor", "Ll1/J0;", "backgroundShape", "LZ1/h;", "height", "Lq1/b;", "icon", "iconColor", "labelHorizontalPadding", "minWidth", "", "text", "textColor", "LK1/T;", "textStyle", "", "FoundationIndicator-gSnA9MM", "(Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;JLl1/J0;FLq1/b;JFFLjava/lang/String;JLK1/T;LS0/k;II)V", "FoundationIndicator", "IndicatorWithIcon-m2WDlOo", "(Landroidx/compose/ui/e;Landroidx/compose/ui/e;FFJLl1/J0;Lq1/b;JLS0/k;I)V", "IndicatorWithIcon", "IndicatorWithText-uLoNqDM", "(Landroidx/compose/ui/e;Landroidx/compose/ui/e;FFJLl1/J0;FLjava/lang/String;LK1/T;JLS0/k;I)V", "IndicatorWithText", "EmptyIndicator-Zi-j2fk", "(Landroidx/compose/ui/e;FFJLl1/J0;LS0/k;I)V", "EmptyIndicator", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FoundationIndicatorKt {
    /* renamed from: EmptyIndicator-Zi-j2fk, reason: not valid java name */
    private static final void m3001EmptyIndicatorZij2fk(e eVar, float f7, float f11, long j11, J0 j02, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(2020886010);
        C5185h.a(androidx.compose.foundation.e.b(a0.o(eVar, f7, f11), j11, j02), interfaceC3967k, 0);
        interfaceC3967k.k();
    }

    /* renamed from: FoundationIndicator-gSnA9MM, reason: not valid java name */
    public static final void m3002FoundationIndicatorgSnA9MM(@NotNull e modifier, @NotNull e iconModifier, @NotNull e labelModifier, long j11, @NotNull J0 backgroundShape, float f7, AbstractC8972b abstractC8972b, long j12, float f11, float f12, String str, long j13, @NotNull T textStyle, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        long j14;
        float f13;
        int i14;
        C3969l c3969l;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(iconModifier, "iconModifier");
        Intrinsics.checkNotNullParameter(labelModifier, "labelModifier");
        Intrinsics.checkNotNullParameter(backgroundShape, "backgroundShape");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        C3969l u11 = interfaceC3967k.u(488807066);
        if ((i11 & 6) == 0) {
            i13 = (u11.n(modifier) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= u11.n(iconModifier) ? 32 : 16;
        }
        int i15 = i11 & 384;
        int i16 = UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i15 == 0) {
            i13 |= u11.n(labelModifier) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            j14 = j11;
            i13 |= u11.s(j14) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        } else {
            j14 = j11;
        }
        if ((i11 & 24576) == 0) {
            i13 |= u11.n(backgroundShape) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            f13 = f7;
            i13 |= u11.q(f13) ? 131072 : 65536;
        } else {
            f13 = f7;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= u11.n(abstractC8972b) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= u11.s(j12) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= u11.q(f11) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= u11.q(f12) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (u11.n(str) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= u11.s(j13) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            if (u11.n(textStyle)) {
                i16 = 256;
            }
            i14 |= i16;
        }
        int i17 = i14;
        if ((306783379 & i13) == 306783378 && (i17 & 147) == 146 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else if (str != null) {
            u11.o(1436911989);
            int i18 = i13 >> 6;
            int i19 = i13 << 3;
            m3004IndicatorWithTextuLoNqDM(modifier, labelModifier, f12, f13, j14, backgroundShape, f11, str, textStyle, j13, u11, (i18 & 7168) | (i13 & 14) | ((i13 >> 3) & 112) | ((i13 >> 21) & 896) | (i19 & 57344) | (i19 & 458752) | (i18 & 3670016) | ((i17 << 21) & 29360128) | ((i17 << 18) & 234881024) | (1879048192 & (i17 << 24)));
            c3969l = u11;
            c3969l.k();
        } else {
            c3969l = u11;
            if (abstractC8972b != null) {
                c3969l.o(1437414623);
                int i21 = i13 << 3;
                m3003IndicatorWithIconm2WDlOo(modifier, iconModifier, f12, f7, j11, backgroundShape, abstractC8972b, j12, c3969l, (i13 & 126) | ((i13 >> 21) & 896) | ((i13 >> 6) & 7168) | (i21 & 57344) | (i21 & 458752) | (i13 & 3670016) | (i13 & 29360128));
                c3969l = c3969l;
                c3969l.k();
            } else {
                c3969l.o(1437803859);
                m3001EmptyIndicatorZij2fk(modifier, f12, f7, j11, backgroundShape, c3969l, (i13 & 14) | ((i13 >> 24) & 112) | ((i13 >> 9) & 896) | (i13 & 7168) | (i13 & 57344));
                c3969l.k();
            }
        }
        S0.J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new FoundationIndicatorKt$FoundationIndicator$1(modifier, iconModifier, labelModifier, j11, backgroundShape, f7, abstractC8972b, j12, f11, f12, str, j13, textStyle, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IndicatorWithIcon-m2WDlOo, reason: not valid java name */
    public static final void m3003IndicatorWithIconm2WDlOo(e eVar, e eVar2, float f7, float f11, long j11, J0 j02, AbstractC8972b abstractC8972b, long j12, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        AbstractC8972b abstractC8972b2;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(-1614634577);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(eVar2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.q(f7) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.q(f11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.s(j11) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.n(j02) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            abstractC8972b2 = abstractC8972b;
            i12 |= u11.n(abstractC8972b2) ? 1048576 : 524288;
        } else {
            abstractC8972b2 = abstractC8972b;
        }
        if ((12582912 & i11) == 0) {
            i12 |= u11.s(j12) ? 8388608 : 4194304;
        }
        if ((4793491 & i12) == 4793490 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            e b11 = androidx.compose.foundation.e.b(a0.o(eVar, f7, f11), j11, j02);
            V f12 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f13 = c.f(u11, b11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f14 = E.f(u11, f12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f14);
            }
            F1.b(u11, f13, InterfaceC2801g.a.f());
            c3969l = u11;
            C8366G.a(abstractC8972b2, "", C5187j.f39515a.a(a0.n(eVar2, 16), InterfaceC6250b.a.e()), null, InterfaceC2547p.a.d(), 0.0f, j12 != 16 ? C7809a0.a.a(5, j12) : null, c3969l, ((i12 >> 18) & 14) | 24624, 40);
            c3969l.f();
        }
        S0.J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new FoundationIndicatorKt$IndicatorWithIcon$2(eVar, eVar2, f7, f11, j11, j02, abstractC8972b, j12, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IndicatorWithText-uLoNqDM, reason: not valid java name */
    public static final void m3004IndicatorWithTextuLoNqDM(e eVar, e eVar2, float f7, float f11, long j11, J0 j02, float f12, String str, T t2, long j12, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(529255037);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(eVar2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.q(f7) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.q(f11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.s(j11) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.n(j02) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.q(f12) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= u11.n(str) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= u11.n(t2) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i12 |= u11.s(j12) ? 536870912 : 268435456;
        }
        if ((306783379 & i12) == 306783378 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            int i13 = i12;
            e h11 = androidx.compose.foundation.layout.T.h(androidx.compose.foundation.e.b(a0.q(a0.b(eVar, f7, 0.0f, 2), 0.0f, f11, 0.0f, 13), j11, j02), f12, 0.0f, 2);
            V f13 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f14 = c.f(u11, h11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f15 = E.f(u11, f13, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f15);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            c3969l = u11;
            u3.b(str, C5187j.f39515a.a(eVar2, InterfaceC6250b.a.e()), j12, 0L, null, 0L, h.a(3), 0L, 2, false, 1, 0, null, t2, c3969l, (i13 >> 21) & 910, (3670016 & (i13 >> 6)) | 3120, 54776);
            c3969l.f();
        }
        S0.J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new FoundationIndicatorKt$IndicatorWithText$2(eVar, eVar2, f7, f11, j11, j02, f12, str, t2, j12, i11));
        }
    }
}
