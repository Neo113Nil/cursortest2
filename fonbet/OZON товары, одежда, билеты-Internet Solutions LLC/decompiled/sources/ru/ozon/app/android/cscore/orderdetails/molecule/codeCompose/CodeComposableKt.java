package ru.ozon.app.android.cscore.orderdetails.molecule.codeCompose;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import e1.InterfaceC6250b;
import e1.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeVI;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "CodeComposable", "(Lru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeVI;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "csma_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CodeComposableKt {
    public static final void CodeComposable(@NotNull CodeComposeVI item, @NotNull Function1<? super AtomAction, Unit> onAction, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        C3969l u11 = interfaceC3967k.u(361929014);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(item) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(onAction) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = e.f40358c0;
            e i13 = T.i(a0.u(a0.e(aVar, 1.0f), 3), item.getSettings().getPadding().getLeft().m1867getDpD9Ej5fM(), item.getSettings().getPadding().getTop().m1867getDpD9Ej5fM(), item.getSettings().getPadding().getRight().m1867getDpD9Ej5fM(), item.getSettings().getPadding().getBottom().m1867getDpD9Ej5fM());
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, i13);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            e u12 = a0.u(a0.e(aVar, 1.0f), 3);
            TestInfo testInfo = item.getTestInfo();
            String automatizationId = testInfo != null ? testInfo.getAutomatizationId() : null;
            if (automatizationId == null) {
                automatizationId = "";
            }
            e a12 = Q1.a(u12, automatizationId);
            u11.o(-309731471);
            boolean F11 = ((i12 & 112) == 32) | u11.F(item);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new CodeComposableKt$CodeComposable$1$1$1(item, onAction);
                u11.x(C11);
            }
            u11.k();
            e b11 = i.b(a12, null, null, false, null, null, (Function0) C11, 28);
            C7807Z c7807z = TokenParserKt.tokenToColor(item.getSettings().getIslandColor(), u11, 0);
            u11.o(-309728335);
            long bgSecondary = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgSecondary() : c7807z.w();
            u11.k();
            e b12 = androidx.compose.foundation.e.b(b11, bgSecondary, h.b(item.getSettings().getIslandCornerRadius().m1866getDpD9Ej5fM()));
            C5194q a13 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f13 = c.f(u11, b12);
            Function0 a14 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a14);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a13, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, g10);
            }
            F1.b(u11, f13, InterfaceC2801g.a.f());
            d.b i14 = InterfaceC6250b.a.i();
            e v11 = a0.v(aVar, null, 3);
            Y b13 = X.b(C5179b.f(), i14, u11, 48);
            int I13 = u11.I();
            A0 d13 = u11.d();
            e f14 = c.f(u11, v11);
            Function0 a15 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a15);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b13, u11, d13);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                a.d(I13, u11, I13, h11);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            TextDTO title = item.getTitle();
            e v12 = a0.v(aVar, null, 3);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
            }
            DsTextAtomKt.DsTextAtom(title, v12.l0(new LayoutWeightElement(1.0f, false)), u11, 0, 0);
            IconDTO titleIcon = item.getTitleIcon();
            u11.o(-1152524275);
            if (titleIcon != null) {
                e v13 = a0.v(aVar, null, 3);
                Z1.h parsePaddingToken = TokenParserKt.parsePaddingToken(String.valueOf(item.getTitle().getTopPadding()));
                DsIconAtomKt.DsIconAtom(titleIcon, T.j(v13, 0.0f, parsePaddingToken != null ? parsePaddingToken.d() : UniTheme.INSTANCE.getPaddings().getNone(), 0.0f, 0.0f, 13), u11, IconDTO.$stable, 0);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            u11.f();
            DsTextAtomKt.DsTextAtom(item.getSubtitle(), null, u11, 0, 2);
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CodeComposableKt$CodeComposable$2(item, onAction, i11));
        }
    }
}
