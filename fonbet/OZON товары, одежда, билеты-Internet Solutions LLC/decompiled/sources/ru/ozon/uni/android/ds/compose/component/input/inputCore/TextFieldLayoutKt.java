package ru.ozon.uni.android.ds.compose.component.input.inputCore;

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
import ru.ozon.uni.android.ds.compose.component.input.DsInputLabelPosition;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import u0.C9915y;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a]\u0010\r\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function0;", "", "textField", "label", HammersV3BodyDTO.PLACEHOLDER, "", "animationProgress", "Lu0/x;", "paddingValues", "Lru/ozon/uni/android/ds/compose/component/input/DsInputLabelPosition;", "labelPosition", "TextFieldLayout", "(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLu0/x;Lru/ozon/uni/android/ds/compose/component/input/DsInputLabelPosition;LS0/k;I)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TextFieldLayoutKt {
    public static final void TextFieldLayout(@NotNull e modifier, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> textField, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, float f7, @NotNull InterfaceC9914x paddingValues, @NotNull DsInputLabelPosition labelPosition, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(textField, "textField");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Intrinsics.checkNotNullParameter(labelPosition, "labelPosition");
        C3969l u11 = interfaceC3967k.u(1098104568);
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
            i12 |= u11.q(f7) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.n(paddingValues) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.n(labelPosition) ? 1048576 : 524288;
        }
        if ((599187 & i12) == 599186 && u11.b()) {
            u11.j();
        } else {
            u11.o(-300112119);
            boolean z11 = ((57344 & i12) == 16384) | ((458752 & i12) == 131072) | ((3670016 & i12) == 1048576);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new TextFieldMeasurePolicy(f7, paddingValues, labelPosition);
                u11.x(C11);
            }
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) C11;
            u11.k();
            s sVar = (s) u11.m(K0.k());
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, modifier);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            F1.b(u11, textFieldMeasurePolicy, InterfaceC2801g.a.e());
            F1.b(u11, d11, InterfaceC2801g.a.g());
            Function2 b11 = InterfaceC2801g.a.b();
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, b11);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            C9915y b12 = T.b((function2 == null || labelPosition != DsInputLabelPosition.INSIDE_LEFT) ? T.d(paddingValues, sVar) : DsSpacings.INSTANCE.m1838getDp0D9Ej5fM(), 0.0f, T.c(paddingValues, sVar), 0.0f, 10);
            C9915y b13 = T.b(T.d(paddingValues, sVar), 0.0f, DsSpacings.INSTANCE.m1838getDp0D9Ej5fM(), 0.0f, 10);
            u11.o(-852759722);
            if (function22 != null) {
                e e11 = T.e(androidx.compose.ui.layout.a.b(e.f40358c0, "Hint"), b12);
                V f12 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I12 = u11.I();
                A0 d12 = u11.d();
                e f13 = c.f(u11, e11);
                Function0 a12 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a12);
                } else {
                    u11.e();
                }
                Function2 f14 = E.f(u11, f12, u11, d12);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    a.d(I12, u11, I12, f14);
                }
                F1.b(u11, f13, InterfaceC2801g.a.f());
                C3349u1.e((i12 >> 9) & 14, function22, u11);
            }
            u11.k();
            u11.o(-852752187);
            if (function2 != null) {
                e e12 = T.e(androidx.compose.ui.layout.a.b(e.f40358c0, "Label"), b13);
                V f15 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I13 = u11.I();
                A0 d13 = u11.d();
                e f16 = c.f(u11, e12);
                Function0 a13 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a13);
                } else {
                    u11.e();
                }
                Function2 f17 = E.f(u11, f15, u11, d13);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                    a.d(I13, u11, I13, f17);
                }
                F1.b(u11, f16, InterfaceC2801g.a.f());
                C3349u1.e((i12 >> 6) & 14, function2, u11);
            }
            u11.k();
            e b14 = androidx.compose.ui.layout.a.b(T.e(e.f40358c0, b12), "TextField");
            V f18 = C5185h.f(InterfaceC6250b.a.o(), true);
            int I14 = u11.I();
            A0 d14 = u11.d();
            e f19 = c.f(u11, b14);
            Function0 a14 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a14);
            } else {
                u11.e();
            }
            Function2 f21 = E.f(u11, f18, u11, d14);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I14))) {
                a.d(I14, u11, I14, f21);
            }
            F1.b(u11, f19, InterfaceC2801g.a.f());
            textField.invoke(u11, Integer.valueOf((i12 >> 3) & 14));
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new TextFieldLayoutKt$TextFieldLayout$2(modifier, textField, function2, function22, f7, paddingValues, labelPosition, i11));
        }
    }
}
