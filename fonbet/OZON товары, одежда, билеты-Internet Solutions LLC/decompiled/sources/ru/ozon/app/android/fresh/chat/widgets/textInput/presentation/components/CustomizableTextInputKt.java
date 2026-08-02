package ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.components;

import B0.C2454a;
import B0.C2475h;
import B1.V;
import D0.b;
import D1.InterfaceC2801g;
import E0.C2942q;
import Ep.a;
import Fr.g;
import J0.u3;
import Pk0.h;
import S0.A0;
import S0.A1;
import S0.C3956f1;
import S0.C3969l;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3972m0;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import U7.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.foundation.z;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import j1.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.K0;
import m3.C8060b;
import n0.d0;
import org.jetbrains.annotations.NotNull;
import u0.EnumC9909s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a]\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0017²\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0016\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "LD0/e;", "textState", "", "placeholderText", "Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/components/CustomizableTextInputStyle;", "inputStyle", "Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/components/VerticalScrollbarStyle;", "scrollbarStyle", "", "isEnabled", "Lj1/r;", "focusRequester", "Lkotlin/Function1;", "", "onFocusChanged", "CustomizableTextInput", "(Landroidx/compose/ui/e;LD0/e;Ljava/lang/String;Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/components/CustomizableTextInputStyle;Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/components/VerticalScrollbarStyle;ZLj1/r;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "", "lineCount", "isFocused", "showBlur", "chat_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CustomizableTextInputKt {
    public static final void CustomizableTextInput(@NotNull e modifier, @NotNull D0.e textState, @NotNull final String placeholderText, @NotNull final CustomizableTextInputStyle inputStyle, VerticalScrollbarStyle verticalScrollbarStyle, boolean z11, @NotNull r focusRequester, @NotNull Function1<? super Boolean, Unit> onFocusChanged, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(textState, "textState");
        Intrinsics.checkNotNullParameter(placeholderText, "placeholderText");
        Intrinsics.checkNotNullParameter(inputStyle, "inputStyle");
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        Intrinsics.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        C3969l u11 = interfaceC3967k.u(57363675);
        int u02 = u11.u0();
        if ((i11 & 6) == 0) {
            i12 = (u11.n(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(textState) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(placeholderText) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(inputStyle) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.n(verticalScrollbarStyle) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.p(z11) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.n(focusRequester) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= u11.F(onFocusChanged) ? 8388608 : 4194304;
        }
        int i13 = i12;
        if ((i13 & 4793491) == 4793490 && u11.b()) {
            u11.j();
        } else {
            d0 b11 = z.b(u11);
            u11.o(861656253);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = C3956f1.a(1);
                u11.x(C11);
            }
            InterfaceC3972m0 interfaceC3972m0 = (InterfaceC3972m0) C11;
            Object b12 = h.b(u11, 861658014);
            if (b12 == InterfaceC3967k.a.a()) {
                b12 = n1.f(Boolean.FALSE, D1.f25195a);
                u11.x(b12);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) b12;
            u11.k();
            int intValue = interfaceC3972m0.getIntValue();
            int maxLines = inputStyle.getMaxLines();
            u11.o(861659894);
            boolean r11 = u11.r(intValue) | u11.r(maxLines);
            Object C12 = u11.C();
            if (r11 || C12 == InterfaceC3967k.a.a()) {
                C12 = n1.e(new CustomizableTextInputKt$CustomizableTextInput$showBlur$2$1(inputStyle, b11, interfaceC3972m0));
                u11.x(C12);
            }
            final A1 a12 = (A1) C12;
            u11.k();
            Object e11 = textState.e();
            boolean CustomizableTextInput$lambda$4 = CustomizableTextInput$lambda$4(interfaceC3978p0);
            u11.o(861665386);
            boolean n11 = u11.n(e11) | u11.p(CustomizableTextInput$lambda$4);
            Object C13 = u11.C();
            if (n11 || C13 == InterfaceC3967k.a.a()) {
                C13 = Boolean.valueOf(textState.e().length() == 0 && !CustomizableTextInput$lambda$4(interfaceC3978p0));
                u11.x(C13);
            }
            final boolean booleanValue = ((Boolean) C13).booleanValue();
            u11.k();
            u11.o(861668747);
            boolean z12 = (i13 & 57344) == 16384;
            Object C14 = u11.C();
            if (z12 || C14 == InterfaceC3967k.a.a()) {
                C14 = Z1.h.a(verticalScrollbarStyle != null ? verticalScrollbarStyle.getScrollbarHorizontalPadding() : 0);
                u11.x(C14);
            }
            float d11 = ((Z1.h) C14).d();
            u11.k();
            Integer valueOf = Integer.valueOf(b11.l());
            u11.o(861672700);
            boolean n12 = u11.n(b11);
            Object C15 = u11.C();
            if (n12 || C15 == InterfaceC3967k.a.a()) {
                C15 = new CustomizableTextInputKt$CustomizableTextInput$1$1(b11, null);
                u11.x(C15);
            }
            u11.k();
            Q.e(u11, valueOf, (Function2) C15);
            e a11 = M.a(T.j(modifier, 0.0f, 0.0f, inputStyle.getTextHorizontalPadding() + d11, 0.0f, 11), EnumC9909s.Min);
            Y b13 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I11 = u11.I();
            A0 d12 = u11.d();
            e f7 = c.f(u11, a11);
            Function0 a13 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b13, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h11);
            }
            i.b(u11, f7, 1015780168);
            e a14 = androidx.compose.ui.focus.i.a(e.f40358c0, focusRequester);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            e l02 = a14.l0(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            u11.o(1002602764);
            boolean z13 = (i13 & 29360128) == 8388608;
            Object C16 = u11.C();
            if (z13 || C16 == InterfaceC3967k.a.a()) {
                C16 = new CustomizableTextInputKt$CustomizableTextInput$2$1$1(onFocusChanged, interfaceC3978p0);
                u11.x(C16);
            }
            u11.k();
            e a15 = androidx.compose.ui.focus.a.a(l02, (Function1) C16);
            K1.T textStyle = inputStyle.getTextStyle();
            D0.c cVar = new D0.c(inputStyle.getMaxLines(), 1);
            K0 k02 = new K0(inputStyle.getTextCursorColor());
            b bVar = new b() { // from class: ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.components.CustomizableTextInputKt$CustomizableTextInput$2$2
                @Override // D0.b
                public final void Decoration(Function2<? super InterfaceC3967k, ? super Integer, Unit> innerTextField, InterfaceC3967k interfaceC3967k2, int i14) {
                    CustomizableTextInputStyle customizableTextInputStyle;
                    A1<Boolean> a16;
                    e.a aVar;
                    boolean CustomizableTextInput$lambda$7;
                    long j11;
                    InterfaceC3967k interfaceC3967k3 = interfaceC3967k2;
                    Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                    interfaceC3967k3.o(-97288187);
                    boolean z14 = booleanValue;
                    String str = placeholderText;
                    CustomizableTextInputStyle customizableTextInputStyle2 = inputStyle;
                    A1<Boolean> a17 = a12;
                    e.a aVar2 = e.f40358c0;
                    V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
                    int I12 = interfaceC3967k3.I();
                    A0 d13 = interfaceC3967k3.d();
                    e f12 = c.f(interfaceC3967k3, aVar2);
                    InterfaceC2801g.f5440U.getClass();
                    Function0 a18 = InterfaceC2801g.a.a();
                    if (interfaceC3967k3.v() == null) {
                        C8060b.c();
                        throw null;
                    }
                    interfaceC3967k3.i();
                    if (interfaceC3967k3.t()) {
                        interfaceC3967k3.H(a18);
                    } else {
                        interfaceC3967k3.e();
                    }
                    Function2 d14 = C2454a.d(interfaceC3967k3, f11, interfaceC3967k3, d13);
                    if (interfaceC3967k3.t() || !Intrinsics.d(interfaceC3967k3.C(), Integer.valueOf(I12))) {
                        Nk.a.d(d14, I12, interfaceC3967k3, I12);
                    }
                    Ek.a.g(f12, interfaceC3967k3, 1582513744);
                    if (z14) {
                        customizableTextInputStyle = customizableTextInputStyle2;
                        aVar = aVar2;
                        a16 = a17;
                        u3.b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, customizableTextInputStyle2.getPlaceholderStyle(), interfaceC3967k2, 0, 0, 65534);
                        interfaceC3967k3 = interfaceC3967k2;
                    } else {
                        customizableTextInputStyle = customizableTextInputStyle2;
                        a16 = a17;
                        aVar = aVar2;
                    }
                    interfaceC3967k3.k();
                    innerTextField.invoke(interfaceC3967k3, Integer.valueOf(i14 & 14));
                    interfaceC3967k3.o(1582518593);
                    CustomizableTextInput$lambda$7 = CustomizableTextInputKt.CustomizableTextInput$lambda$7(a16);
                    if (CustomizableTextInput$lambda$7) {
                        e f13 = a0.f(a0.e(aVar, 1.0f), customizableTextInputStyle.getTextBlurHeight());
                        AbstractC7799Q.a aVar3 = AbstractC7799Q.Companion;
                        C7807Z m11 = C7807Z.m(customizableTextInputStyle.getTextBlurColor());
                        j11 = C7807Z.f72258l;
                        C5185h.a(androidx.compose.foundation.e.a(f13, AbstractC7799Q.a.g(aVar3, C7714v.b0(m11, C7807Z.m(j11))), null, 6), interfaceC3967k3, 0);
                    }
                    interfaceC3967k3.k();
                    interfaceC3967k3.f();
                    interfaceC3967k3.k();
                }
            };
            u11.o(1002614188);
            Object C17 = u11.C();
            if (C17 == InterfaceC3967k.a.a()) {
                C17 = new CustomizableTextInputKt$CustomizableTextInput$2$3$1(interfaceC3972m0);
                u11.x(C17);
            }
            u11.k();
            C2475h.a(textState, a15, z11, textStyle, null, cVar, (Function2) C17, k02, bVar, b11, u11, ((i13 >> 3) & 14) | 805306368 | ((i13 >> 9) & 896));
            if (verticalScrollbarStyle == null || b11.l() <= 0) {
                u11.p0(u02);
                J0 m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new CustomizableTextInputKt$CustomizableTextInput$2$4(modifier, textState, placeholderText, inputStyle, verticalScrollbarStyle, z11, focusRequester, onFocusChanged, i11));
                    return;
                }
                return;
            }
            VerticalScrollbarKt.VerticalScrollbar(verticalScrollbarStyle, b11, u11, (i13 >> 12) & 14);
            u11.k();
            u11.f();
        }
        J0 m03 = u11.m0();
        if (m03 != null) {
            m03.G(new CustomizableTextInputKt$CustomizableTextInput$3(modifier, textState, placeholderText, inputStyle, verticalScrollbarStyle, z11, focusRequester, onFocusChanged, i11));
        }
    }

    private static final boolean CustomizableTextInput$lambda$4(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CustomizableTextInput$lambda$5(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CustomizableTextInput$lambda$7(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }
}
