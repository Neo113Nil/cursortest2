package ru.ozon.uni.foundation.components.inputCore.decorationBox;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import J0.C3349u1;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import Z1.s;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ae\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function0;", "", "textField", "label", HammersV3BodyDTO.PLACEHOLDER, "", "singleLine", "", "animationProgress", "Lu0/x;", "paddingValues", "LZ1/h;", "labelTopPadding", "TextFieldLayout-1sJa4KU", "(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLu0/x;FLS0/k;I)V", "TextFieldLayout", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TextFieldLayoutKt {
    /* renamed from: TextFieldLayout-1sJa4KU, reason: not valid java name */
    public static final void m3018TextFieldLayout1sJa4KU(@NotNull e modifier, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> textField, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, boolean z11, float f7, @NotNull InterfaceC9914x interfaceC9914x, float f11, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        boolean z12;
        float f12;
        float f13;
        InterfaceC9914x paddingValues = interfaceC9914x;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(textField, "textField");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        C3969l u11 = interfaceC3967k.u(809275215);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(textField) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(function22) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            z12 = z11;
            i12 |= u11.p(z12) ? 16384 : 8192;
        } else {
            z12 = z11;
        }
        if ((196608 & i11) == 0) {
            f12 = f7;
            i12 |= u11.q(f12) ? 131072 : 65536;
        } else {
            f12 = f7;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.n(paddingValues) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            f13 = f11;
            i12 |= u11.q(f13) ? 8388608 : 4194304;
        } else {
            f13 = f11;
        }
        int i13 = i12;
        if ((4793491 & i13) == 4793490 && u11.b()) {
            u11.j();
        } else {
            u11.o(-1935066408);
            boolean z13 = ((57344 & i13) == 16384) | ((458752 & i13) == 131072) | ((3670016 & i13) == 1048576) | ((29360128 & i13) == 8388608);
            Object C11 = u11.C();
            if (z13 || C11 == InterfaceC3967k.a.a()) {
                TextFieldMeasurePolicy textFieldMeasurePolicy = new TextFieldMeasurePolicy(z12, f12, paddingValues, f13, null);
                paddingValues = paddingValues;
                u11.x(textFieldMeasurePolicy);
                C11 = textFieldMeasurePolicy;
            }
            TextFieldMeasurePolicy textFieldMeasurePolicy2 = (TextFieldMeasurePolicy) C11;
            u11.k();
            s sVar = (s) u11.m(K0.k());
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f14 = c.f(u11, modifier);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            F1.b(u11, textFieldMeasurePolicy2, InterfaceC2801g.a.e());
            F1.b(u11, d11, InterfaceC2801g.a.g());
            Function2 b11 = InterfaceC2801g.a.b();
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, b11);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            e.a aVar = e.f40358c0;
            e j11 = T.j(aVar, T.d(paddingValues, sVar), 0.0f, T.c(paddingValues, sVar), 0.0f, 10);
            u11.o(-1655118776);
            if (function22 != null) {
                e l02 = androidx.compose.ui.layout.a.b(aVar, "Hint").l0(j11);
                V f15 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I12 = u11.I();
                A0 d12 = u11.d();
                e f16 = c.f(u11, l02);
                Function0 a12 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a12);
                } else {
                    u11.e();
                }
                Function2 f17 = E.f(u11, f15, u11, d12);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    a.d(I12, u11, I12, f17);
                }
                F1.b(u11, f16, InterfaceC2801g.a.f());
                C3349u1.e((i13 >> 9) & 14, function22, u11);
            }
            u11.k();
            u11.o(-1655115370);
            if (function2 != null) {
                e l03 = androidx.compose.ui.layout.a.b(aVar, "Label").l0(j11);
                V f18 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I13 = u11.I();
                A0 d13 = u11.d();
                e f19 = c.f(u11, l03);
                Function0 a13 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a13);
                } else {
                    u11.e();
                }
                Function2 f21 = E.f(u11, f18, u11, d13);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                    a.d(I13, u11, I13, f21);
                }
                F1.b(u11, f19, InterfaceC2801g.a.f());
                C3349u1.e((i13 >> 6) & 14, function2, u11);
            }
            u11.k();
            e b12 = androidx.compose.ui.layout.a.b(j11, "TextField");
            V f22 = C5185h.f(InterfaceC6250b.a.o(), true);
            int I14 = u11.I();
            A0 d14 = u11.d();
            e f23 = c.f(u11, b12);
            Function0 a14 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a14);
            } else {
                u11.e();
            }
            Function2 f24 = E.f(u11, f22, u11, d14);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I14))) {
                a.d(I14, u11, I14, f24);
            }
            F1.b(u11, f23, InterfaceC2801g.a.f());
            textField.invoke(u11, Integer.valueOf((i13 >> 3) & 14));
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new TextFieldLayoutKt$TextFieldLayout$2(modifier, textField, function2, function22, z11, f7, paddingValues, f11, i11));
        }
    }
}
