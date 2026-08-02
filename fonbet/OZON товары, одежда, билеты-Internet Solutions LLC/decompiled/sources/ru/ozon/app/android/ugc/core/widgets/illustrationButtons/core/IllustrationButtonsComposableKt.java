package ru.ozon.app.android.ugc.core.widgets.illustrationButtons.core;

import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import I1.o;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import S0.Q;
import WZ.t;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.draw.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.illustrationButtons.presentation.IllustrationButtonsVO;
import ru.ozon.uni.android.ds.compose.component.image.DsImageAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;
import t0.p;
import t0.q;
import u0.C9891D;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aC\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0016\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/presentation/IllustrationButtonsVO;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onButtonClick", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "onView", "IllustrationButtonsComposable", "(Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/presentation/IllustrationButtonsVO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/presentation/IllustrationButtonsVO$ButtonVO;", "button", "Landroidx/compose/ui/e;", "modifier", "onClick", "IllustrationButton", "(Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/presentation/IllustrationButtonsVO$ButtonVO;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IllustrationButtonsComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IllustrationButton(IllustrationButtonsVO.ButtonVO buttonVO, e eVar, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        Object C11;
        boolean z11;
        Object C12;
        boolean q11;
        Object C13;
        int I11;
        e eVar3;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-1329639949);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(buttonVO) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            if ((i12 & 4) == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                i13 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i13 & 147) == 146 || !u11.b()) {
                e eVar4 = i14 == 0 ? e.f40358c0 : eVar2;
                float cornerRadius = buttonVO.getCornerRadius();
                C7807Z parseColorToken = TokenParserKt.parseColorToken(buttonVO.getBackgroundColor(), u11, 0);
                u11.o(-1716586580);
                long bgPrimary = parseColorToken != null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgPrimary() : parseColorToken.w();
                u11.k();
                d.a g10 = InterfaceC6250b.a.g();
                u11.o(-1716579249);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = p.a();
                    u11.x(C11);
                }
                q qVar = (q) C11;
                u11.k();
                u11.o(-1716576349);
                z11 = ((i13 & 14) != 4) | ((i13 & 896) == 256);
                C12 = u11.C();
                if (!z11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new IllustrationButtonsComposableKt$IllustrationButton$2$1(buttonVO, function1);
                    u11.x(C12);
                }
                u11.k();
                long j11 = bgPrimary;
                e b11 = i.b(eVar4, qVar, null, false, null, null, (Function0) C12, 28);
                u11.o(-1716573253);
                q11 = u11.q(cornerRadius) | u11.s(j11);
                C13 = u11.C();
                if (!q11 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new IllustrationButtonsComposableKt$IllustrationButton$3$1(cornerRadius, j11);
                    u11.x(C13);
                }
                u11.k();
                e b12 = c.b(b11, (Function1) C13);
                C5194q a11 = C5193p.a(C5179b.g(), g10, u11, 48);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f7 = androidx.compose.ui.c.f(u11, b12);
                Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a12);
                }
                Function2 g11 = b.g(u11, a11, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, g11);
                }
                F1.b(u11, f7, InterfaceC2801g.a.f());
                DsImageAtomKt.DsImageAtom(buttonVO.getImage(), null, u11, 0, 2);
                DsTextAtomKt.DsTextAtom(buttonVO.getTitle(), null, u11, 0, 2);
                u11.f();
                eVar3 = eVar4;
            } else {
                u11.j();
                eVar3 = eVar2;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new IllustrationButtonsComposableKt$IllustrationButton$5(buttonVO, eVar3, function1, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i12 & 4) == 0) {
        }
        if ((i13 & 147) == 146) {
        }
        if (i14 == 0) {
        }
        float cornerRadius2 = buttonVO.getCornerRadius();
        C7807Z parseColorToken2 = TokenParserKt.parseColorToken(buttonVO.getBackgroundColor(), u11, 0);
        u11.o(-1716586580);
        if (parseColorToken2 != null) {
        }
        u11.k();
        d.a g102 = InterfaceC6250b.a.g();
        u11.o(-1716579249);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        q qVar2 = (q) C11;
        u11.k();
        u11.o(-1716576349);
        z11 = ((i13 & 14) != 4) | ((i13 & 896) == 256);
        C12 = u11.C();
        if (!z11) {
        }
        C12 = new IllustrationButtonsComposableKt$IllustrationButton$2$1(buttonVO, function1);
        u11.x(C12);
        u11.k();
        long j112 = bgPrimary;
        e b112 = i.b(eVar4, qVar2, null, false, null, null, (Function0) C12, 28);
        u11.o(-1716573253);
        q11 = u11.q(cornerRadius2) | u11.s(j112);
        C13 = u11.C();
        if (!q11) {
        }
        C13 = new IllustrationButtonsComposableKt$IllustrationButton$3$1(cornerRadius2, j112);
        u11.x(C13);
        u11.k();
        e b122 = c.b(b112, (Function1) C13);
        C5194q a112 = C5193p.a(C5179b.g(), g102, u11, 48);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f72 = androidx.compose.ui.c.f(u11, b122);
        Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g112 = b.g(u11, a112, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, g112);
        F1.b(u11, f72, InterfaceC2801g.a.f());
        DsImageAtomKt.DsImageAtom(buttonVO.getImage(), null, u11, 0, 2);
        DsTextAtomKt.DsTextAtom(buttonVO.getTitle(), null, u11, 0, 2);
        u11.f();
        eVar3 = eVar4;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    public static final void IllustrationButtonsComposable(@NotNull IllustrationButtonsVO state, @NotNull Function1<? super AtomAction, Unit> onButtonClick, @NotNull Function1<? super t, Unit> onView, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        Function1<? super AtomAction, Unit> function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        Intrinsics.checkNotNullParameter(onView, "onView");
        C3969l u11 = interfaceC3967k.u(-1577775020);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(onButtonClick) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(onView) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            function1 = onButtonClick;
        } else {
            C7807Z parseColorToken = TokenParserKt.parseColorToken(state.getBackgroundColor(), u11, 0);
            u11.o(-484823779);
            long layerFloor1 = parseColorToken == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1() : parseColorToken.w();
            u11.k();
            Unit unit = Unit.f71690a;
            u11.o(-484820727);
            boolean z11 = ((i12 & 14) == 4) | ((i12 & 896) == 256);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new IllustrationButtonsComposableKt$IllustrationButtonsComposable$1$1(state, onView, null);
                u11.x(C11);
            }
            u11.k();
            Q.e(u11, unit, (Function2) C11);
            e.a aVar = e.f40358c0;
            b11 = androidx.compose.foundation.e.b(a0.e(aVar, 1.0f), layerFloor1, y0.a());
            e i13 = T.i(b11, state.getPaddings().getLeftPadding(), state.getPaddings().getTopPadding(), state.getPaddings().getRightPadding(), state.getPaddings().getBottomPadding());
            u11.o(-484807209);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = IllustrationButtonsComposableKt$IllustrationButtonsComposable$2$1.INSTANCE;
                u11.x(C12);
            }
            u11.k();
            e c11 = o.c(i13, false, (Function1) C12);
            int i14 = C5179b.f39454h;
            Y b12 = X.b(C5179b.n(state.getPaddings().getButtonsPadding()), InterfaceC6250b.a.l(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = androidx.compose.ui.c.f(u11, c11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            C9891D c9891d = C9891D.f99599a;
            int i15 = (i12 << 3) & 896;
            function1 = onButtonClick;
            IllustrationButton(state.getLeftButton(), Q1.a(c9891d.a(aVar, 1.0f, true), "illustrationButtons.leftButton"), function1, u11, i15, 0);
            IllustrationButton(state.getRightButton(), Q1.a(c9891d.a(aVar, 1.0f, true), "illustrationButtons.rightButton"), function1, u11, i15, 0);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new IllustrationButtonsComposableKt$IllustrationButtonsComposable$4(state, function1, onView, i11));
        }
    }
}
