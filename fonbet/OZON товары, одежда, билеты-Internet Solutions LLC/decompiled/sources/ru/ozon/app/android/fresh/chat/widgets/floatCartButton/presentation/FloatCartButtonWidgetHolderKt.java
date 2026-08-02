package ru.ozon.app.android.fresh.chat.widgets.floatCartButton.presentation;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import T7.E;
import WZ.l;
import Z1.m;
import Z1.n;
import androidx.compose.animation.b;
import androidx.compose.animation.q;
import androidx.compose.animation.s;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l0.G;
import m0.C8004n;
import m0.l1;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.chat.R$plurals;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u001aI\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\n\u0010\n\u001a\u00060\bj\u0002`\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0013\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017²\u0006\f\u0010\u0015\u001a\u00020\u00118\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/floatCartButton/presentation/FloatCartButtonVO;", "item", "Lru/ozon/app/android/fresh/chat/widgets/floatCartButton/presentation/FloatCartButtonViewModel;", "viewModel", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LZ1/h;", "containerPadding", "FloatCartButtonWidgetHolder-FJfuzF0", "(Lru/ozon/app/android/fresh/chat/widgets/floatCartButton/presentation/FloatCartButtonVO;Lru/ozon/app/android/fresh/chat/widgets/floatCartButton/presentation/FloatCartButtonViewModel;Lkotlin/jvm/functions/Function1;LWZ/l;FLS0/k;II)V", "FloatCartButtonWidgetHolder", "Lru/ozon/uni/atoms/data/text/TextDTO;", "", "newCount", "copyWithNewProductCount", "(Lru/ozon/uni/atoms/data/text/TextDTO;I)Lru/ozon/uni/atoms/data/text/TextDTO;", "state", "textAtom", "chat_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FloatCartButtonWidgetHolderKt {
    /* JADX WARN: Removed duplicated region for block: B:24:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00be  */
    /* renamed from: FloatCartButtonWidgetHolder-FJfuzF0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m709FloatCartButtonWidgetHolderFJfuzF0(@NotNull FloatCartButtonVO item, @NotNull FloatCartButtonViewModel viewModel, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics, float f7, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        float f11;
        InterfaceC3978p0 b11;
        Object C11;
        boolean n11;
        Object C12;
        boolean F11;
        Object C13;
        int I11;
        Object C14;
        Object C15;
        C3969l c3969l;
        float f12;
        J0 m02;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        C3969l u11 = interfaceC3967k.u(-1469044109);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(item) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(viewModel) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.F(tokenizedAnalytics) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i14 = i12 & 16;
        if (i14 != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            f11 = f7;
            i13 |= u11.q(f11) ? 16384 : 8192;
            if ((i13 & 9363) == 9362 || !u11.b()) {
                float f13 = i14 == 0 ? 8 : f11;
                b11 = n1.b(viewModel.getCount(), u11);
                u11.o(851414131);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = n1.f(copyWithNewProductCount(item.getText(), FloatCartButtonWidgetHolder_FJfuzF0$lambda$0(b11)), D1.f25195a);
                    u11.x(C11);
                }
                InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
                u11.k();
                Integer valueOf = Integer.valueOf(FloatCartButtonWidgetHolder_FJfuzF0$lambda$0(b11));
                u11.o(851418891);
                n11 = u11.n(b11) | u11.F(item);
                C12 = u11.C();
                if (!n11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new FloatCartButtonWidgetHolderKt$FloatCartButtonWidgetHolder$1$1(item, b11, interfaceC3978p0, null);
                    u11.x(C12);
                }
                u11.k();
                Q.e(u11, valueOf, (Function2) C12);
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(851424457);
                F11 = u11.F(item) | u11.F(tokenizedAnalytics);
                C13 = u11.C();
                if (!F11 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new FloatCartButtonWidgetHolderKt$FloatCartButtonWidgetHolder$2$1(item, tokenizedAnalytics);
                    u11.x(C13);
                }
                u11.k();
                i.a(aVar, null, (Function0) C13, u11, 6);
                e.a aVar2 = e.f40358c0;
                e f14 = T.f(a0.u(a0.e(aVar2, 1.0f), 3), f13);
                V f15 = C5185h.f(InterfaceC6250b.a.o(), false);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f16 = c.f(u11, f14);
                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a11);
                }
                Function2 f17 = E.f(u11, f15, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, f17);
                }
                F1.b(u11, f16, InterfaceC2801g.a.f());
                e a12 = C5187j.f39515a.a(aVar2, InterfaceC6250b.a.f());
                boolean z11 = FloatCartButtonWidgetHolder_FJfuzF0$lambda$0(b11) <= 0;
                u11.o(-2000362475);
                C14 = u11.C();
                if (C14 == InterfaceC3967k.a.a()) {
                    C14 = FloatCartButtonWidgetHolderKt$FloatCartButtonWidgetHolder$3$1$1.INSTANCE;
                    u11.x(C14);
                }
                u11.k();
                q c11 = b.p((Function1) C14).c(b.h(null, 3));
                s i15 = b.i(null, 3);
                u11.o(-2000358027);
                C15 = u11.C();
                if (C15 == InterfaceC3967k.a.a()) {
                    C15 = FloatCartButtonWidgetHolderKt$FloatCartButtonWidgetHolder$3$2$1.INSTANCE;
                    u11.x(C15);
                }
                u11.k();
                int i16 = l1.f73821b;
                c3969l = u11;
                G.c(z11, a12, c11, i15.c(b.r((Function1) C15, C8004n.c(400.0f, m.a(n.a(1, 1)), 1))), null, a1.c.c(-199857455, new FloatCartButtonWidgetHolderKt$FloatCartButtonWidgetHolder$3$3(item, actionHandler, tokenizedAnalytics, interfaceC3978p0), u11), c3969l, 200064, 16);
                c3969l.f();
                f12 = f13;
            } else {
                u11.j();
                f12 = f11;
                c3969l = u11;
            }
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new FloatCartButtonWidgetHolderKt$FloatCartButtonWidgetHolder$4(item, viewModel, actionHandler, tokenizedAnalytics, f12, i11, i12));
                return;
            }
            return;
        }
        f11 = f7;
        if ((i13 & 9363) == 9362) {
        }
        if (i14 == 0) {
        }
        b11 = n1.b(viewModel.getCount(), u11);
        u11.o(851414131);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) C11;
        u11.k();
        Integer valueOf2 = Integer.valueOf(FloatCartButtonWidgetHolder_FJfuzF0$lambda$0(b11));
        u11.o(851418891);
        n11 = u11.n(b11) | u11.F(item);
        C12 = u11.C();
        if (!n11) {
        }
        C12 = new FloatCartButtonWidgetHolderKt$FloatCartButtonWidgetHolder$1$1(item, b11, interfaceC3978p02, null);
        u11.x(C12);
        u11.k();
        Q.e(u11, valueOf2, (Function2) C12);
        AbstractC5434v.a aVar3 = AbstractC5434v.a.ON_RESUME;
        u11.o(851424457);
        F11 = u11.F(item) | u11.F(tokenizedAnalytics);
        C13 = u11.C();
        if (!F11) {
        }
        C13 = new FloatCartButtonWidgetHolderKt$FloatCartButtonWidgetHolder$2$1(item, tokenizedAnalytics);
        u11.x(C13);
        u11.k();
        i.a(aVar3, null, (Function0) C13, u11, 6);
        e.a aVar22 = e.f40358c0;
        e f142 = T.f(a0.u(a0.e(aVar22, 1.0f), 3), f13);
        V f152 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f162 = c.f(u11, f142);
        Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f172 = E.f(u11, f152, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f172);
        F1.b(u11, f162, InterfaceC2801g.a.f());
        e a122 = C5187j.f39515a.a(aVar22, InterfaceC6250b.a.f());
        if (FloatCartButtonWidgetHolder_FJfuzF0$lambda$0(b11) <= 0) {
        }
        u11.o(-2000362475);
        C14 = u11.C();
        if (C14 == InterfaceC3967k.a.a()) {
        }
        u11.k();
        q c112 = b.p((Function1) C14).c(b.h(null, 3));
        s i152 = b.i(null, 3);
        u11.o(-2000358027);
        C15 = u11.C();
        if (C15 == InterfaceC3967k.a.a()) {
        }
        u11.k();
        int i162 = l1.f73821b;
        c3969l = u11;
        G.c(z11, a122, c112, i152.c(b.r((Function1) C15, C8004n.c(400.0f, m.a(n.a(1, 1)), 1))), null, a1.c.c(-199857455, new FloatCartButtonWidgetHolderKt$FloatCartButtonWidgetHolder$3$3(item, actionHandler, tokenizedAnalytics, interfaceC3978p02), u11), c3969l, 200064, 16);
        c3969l.f();
        f12 = f13;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FloatCartButtonWidgetHolder_FJfuzF0$lambda$0(A1<Integer> a12) {
        return a12.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextDTO FloatCartButtonWidgetHolder_FJfuzF0$lambda$2(InterfaceC3978p0<TextDTO> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    @NotNull
    public static final TextDTO copyWithNewProductCount(@NotNull TextDTO textDTO, int i11) {
        Intrinsics.checkNotNullParameter(textDTO, "<this>");
        return TextDTO.copy$default(textDTO, new OzonSpannableString(StringProvider.getQuantityString(R$plurals.float_cart_button_products_plural, i11, Integer.valueOf(i11))), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
    }
}
