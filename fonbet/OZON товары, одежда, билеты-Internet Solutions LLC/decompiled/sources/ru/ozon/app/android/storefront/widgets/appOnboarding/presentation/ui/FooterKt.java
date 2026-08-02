package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui;

import A0.h;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import U7.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l0.h0;
import l1.C7807Z;
import l1.y0;
import m0.C7990g;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.appOnboarding.data.AppOnboardingDTO;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingVI;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.compose.theme.UniCompositionLocalKt;
import ru.ozon.uni.core.models.UniColorToken;
import ru.ozon.uni.core.repository.UniTheme;
import u0.C9891D;
import u0.E;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Footer;", "state", "", "pageIndex", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onButtonClick", "Footer", "(Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI$Footer;ILkotlin/jvm/functions/Function1;LS0/k;I)V", "count", "current", "Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$PageControls;", "controls", "PagingDots", "(IILru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO$PageControls;LS0/k;I)V", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FooterKt {
    public static final void Footer(@NotNull AppOnboardingVI.Footer state, int i11, @NotNull Function1<? super AtomAction, Unit> onButtonClick, InterfaceC3967k interfaceC3967k, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        C3969l u11 = interfaceC3967k.u(-1457386921);
        if ((i12 & 6) == 0) {
            i13 = (u11.F(state) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= u11.r(i11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= u11.F(onButtonClick) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = e.f40358c0;
            e e11 = a0.e(aVar, 1.0f);
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            e h11 = T.h(e11, dsSpacings.m1853getDp32D9Ej5fM(), 0.0f, 2);
            C5194q a11 = C5193p.a(C5179b.b(), InterfaceC6250b.a.g(), u11, 54);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, h11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            e c11 = GZ.e.c(u11, f7, aVar, 1.0f);
            Y b11 = X.b(C5179b.b(), InterfaceC6250b.a.i(), u11, 54);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f11 = c.f(u11, c11);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 h12 = Cm.e.h(u11, b11, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, h12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            C9891D c9891d = C9891D.f99599a;
            PagingDots(state.getActionButtons().size(), i11, state.getPageControls(), u11, i13 & 112);
            FillSpacerKt.HorizontalFillSpacer(c9891d, u11, 6);
            DsButtonAtomKt.DsButtonAtom(state.getActionButtons().get(i11), null, false, onButtonClick, u11, (i13 << 3) & 7168, 6);
            u11.f();
            E.a(u11, a0.f(aVar, dsSpacings.m1853getDp32D9Ej5fM()));
            Ag0.e.a(state.getLogo(), a0.f(aVar, dsSpacings.m1842getDp12D9Ej5fM()), null, null, null, 0.0f, null, u11, 3072, 244);
            u11 = u11;
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new FooterKt$Footer$2(state, i11, onButtonClick, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PagingDots(int i11, int i12, AppOnboardingDTO.PageControls pageControls, InterfaceC3967k interfaceC3967k, int i13) {
        int i14;
        e b11;
        C3969l u11 = interfaceC3967k.u(-2098005666);
        if ((i13 & 6) == 0) {
            i14 = (u11.r(i11) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= u11.r(i12) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= u11.n(pageControls) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            e u12 = a0.u(e.f40358c0, 3);
            Y b12 = X.b(C5179b.b(), InterfaceC6250b.a.l(), u11, 6);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, u12);
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
            i.b(u11, f7, -122162904);
            int i15 = 0;
            while (i15 < i11) {
                UniTheme uniTheme = UniTheme.INSTANCE;
                UniColorToken byId = uniTheme.getColorTokens().getById(pageControls.getActiveColor());
                u11.o(-122160264);
                C7807Z m11 = byId == null ? null : C7807Z.m(UniCompositionLocalKt.getThemedColor(byId, u11, UniColorToken.$stable));
                u11.k();
                u11.o(-122161823);
                long bgPrimaryInverted = m11 == null ? uniTheme.getColors(u11, UniTheme.$stable).getBgPrimaryInverted() : m11.w();
                u11.k();
                UniColorToken byId2 = uniTheme.getColorTokens().getById(pageControls.getInactiveColor());
                u11.o(-122155432);
                C7807Z m12 = byId2 == null ? null : C7807Z.m(UniCompositionLocalKt.getThemedColor(byId2, u11, UniColorToken.$stable));
                u11.k();
                u11.o(-122157054);
                long clearLightKey500 = m12 == null ? uniTheme.getColors(u11, UniTheme.$stable).getClearLightKey500() : m12.w();
                u11.k();
                A1 a12 = h0.a(i12 == i15 ? bgPrimaryInverted : clearLightKey500, null, null, u11, 0, 14);
                DsSpacings dsSpacings = DsSpacings.INSTANCE;
                A1 a13 = C7990g.a(i12 == i15 ? dsSpacings.m1861getDp8D9Ej5fM() : dsSpacings.m1854getDp4D9Ej5fM(), null, u11, 0, 14);
                b11 = androidx.compose.foundation.e.b(C6988h.a(T.j(e.f40358c0, 0.0f, 0.0f, i11 + (-1) == i15 ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : DsSpacings.INSTANCE.m1847getDp2D9Ej5fM(), 0.0f, 11), h.e()), ((C7807Z) a12.getValue()).w(), y0.a());
                C5185h.a(a0.r(a0.f(b11, DsSpacings.INSTANCE.m1854getDp4D9Ej5fM()), ((Z1.h) a13.getValue()).d()), u11, 0);
                i15++;
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new FooterKt$PagingDots$2(i11, i12, pageControls, i13));
        }
    }
}
