package ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.compose;

import B1.V;
import D1.InterfaceC2801g;
import S0.A0;
import S0.C0;
import S0.C3969l;
import S0.D;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3970l0;
import S0.J0;
import S0.Q;
import Sc.o;
import T7.E;
import WZ.l;
import Z1.h;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.layout.c;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.C6285b;
import e3.i;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import l10.InterfaceC7851b;
import m0.C7980b;
import m0.C7984d;
import n0.InterfaceC8369J;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation.BonusExpirationRemainderVI;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation.BonusExpirationRemainderViewModel;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsVO;
import ru.ozon.app.android.travel.utils.extensions.ComposeColorKt;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import t0.p;
import t0.q;
import u0.EnumC9909s;
import xe.M;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a3\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\n\u0010\t¨\u0006\r²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderVI;", "state", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderViewModel;", "viewModel", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "BonusExpirationRemainder", "(Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderVI;Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderViewModel;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "ShowContent", "", "viewHeight", "common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BonusExpirationRemainderKt {
    public static final void BonusExpirationRemainder(@NotNull BonusExpirationRemainderVI state, @NotNull BonusExpirationRemainderViewModel viewModel, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-1350372933);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(viewModel) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            l lVar = (l) u11.m(f.e());
            InterfaceC7851b interfaceC7851b = (InterfaceC7851b) u11.m(f.c());
            Long valueOf = Long.valueOf(state.getId());
            u11.o(-126016688);
            boolean F11 = ((i12 & 14) == 4) | u11.F(viewModel);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new BonusExpirationRemainderKt$BonusExpirationRemainder$1$1(viewModel, state, null);
                u11.x(C11);
            }
            u11.k();
            Q.e(u11, valueOf, (Function2) C11);
            BonusExpirationRemainderViewModel.BonusAction bonusAction = (BonusExpirationRemainderViewModel.BonusAction) C6285b.c(viewModel.getResultFlow(), u11, 0).getValue();
            if (!(bonusAction instanceof BonusExpirationRemainderViewModel.Ignore)) {
                if (bonusAction instanceof BonusExpirationRemainderViewModel.RemoveWidget) {
                    interfaceC7851b.m(((BonusExpirationRemainderViewModel.RemoveWidget) bonusAction).getId());
                } else {
                    if (!(bonusAction instanceof BonusExpirationRemainderViewModel.ShowItem)) {
                        throw new o();
                    }
                    BonusExpirationRemainderVI item = ((BonusExpirationRemainderViewModel.ShowItem) bonusAction).getItem();
                    AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                    u11.o(-126002463);
                    boolean n11 = u11.n(item) | u11.F(lVar);
                    Object C12 = u11.C();
                    if (n11 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new BonusExpirationRemainderKt$BonusExpirationRemainder$2$1(item, lVar);
                        u11.x(C12);
                    }
                    u11.k();
                    i.a(aVar, null, (Function0) C12, u11, 6);
                    ShowContent(state, viewModel, actionHandler, u11, i12 & 1022);
                }
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new BonusExpirationRemainderKt$BonusExpirationRemainder$3(state, viewModel, actionHandler, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ShowContent(BonusExpirationRemainderVI bonusExpirationRemainderVI, BonusExpirationRemainderViewModel bonusExpirationRemainderViewModel, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        boolean z11;
        float f7;
        Object bonusExpirationRemainderKt$ShowContent$6$1$1;
        BonusExpirationRemainderViewModel bonusExpirationRemainderViewModel2 = bonusExpirationRemainderViewModel;
        C3969l u11 = interfaceC3967k.u(334039442);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(bonusExpirationRemainderVI) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(bonusExpirationRemainderViewModel2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            TravelWidgetSettingsVO widgetSettings = bonusExpirationRemainderVI.getWidgetSettings();
            String backgroundColor = widgetSettings != null ? widgetSettings.getBackgroundColor() : null;
            u11.o(1339575325);
            C7807Z c7807z = backgroundColor == null ? null : TokenParserKt.tokenToColor(backgroundColor, u11, 0);
            u11.k();
            u11.o(1339574171);
            long composeColor = c7807z == null ? ComposeColorKt.composeColor(UniColors.BG_APPAREL_PRIMARY, u11, 6) : c7807z.w();
            u11.k();
            TravelWidgetSettingsVO widgetSettings2 = bonusExpirationRemainderVI.getWidgetSettings();
            TravelWidgetSettingsVO.PaddingsVO paddings = widgetSettings2 != null ? widgetSettings2.getPaddings() : null;
            TravelWidgetSettingsVO widgetSettings3 = bonusExpirationRemainderVI.getWidgetSettings();
            TravelWidgetSettingsVO.CornersVO corners = widgetSettings3 != null ? widgetSettings3.getCorners() : null;
            Float valueOf = corners != null ? Float.valueOf(corners.getTopRadius()) : null;
            u11.o(1339581411);
            boolean n11 = u11.n(valueOf);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = h.a(corners != null ? UiExtKt.toDpF(corners.getTopRadius()) : 0);
                u11.x(C11);
            }
            float d11 = ((h) C11).d();
            u11.k();
            Integer valueOf2 = paddings != null ? Integer.valueOf(paddings.getLeftPadding()) : null;
            u11.o(1339584840);
            boolean n12 = u11.n(valueOf2);
            Object C12 = u11.C();
            if (n12 || C12 == InterfaceC3967k.a.a()) {
                C12 = h.a(paddings != null ? UiExtKt.toDp(paddings.getLeftPadding()) : 0);
                u11.x(C12);
            }
            float d12 = ((h) C12).d();
            u11.k();
            Integer valueOf3 = paddings != null ? Integer.valueOf(paddings.getTopPadding()) : null;
            u11.o(1339588390);
            boolean n13 = u11.n(valueOf3);
            Object C13 = u11.C();
            if (n13 || C13 == InterfaceC3967k.a.a()) {
                C13 = h.a(paddings != null ? UiExtKt.toDp(paddings.getTopPadding()) : 0);
                u11.x(C13);
            }
            float d13 = ((h) C13).d();
            u11.k();
            Integer valueOf4 = paddings != null ? Integer.valueOf(paddings.getRightPadding()) : null;
            u11.o(1339591946);
            boolean n14 = u11.n(valueOf4);
            Object C14 = u11.C();
            if (n14 || C14 == InterfaceC3967k.a.a()) {
                C14 = h.a(paddings != null ? UiExtKt.toDp(paddings.getRightPadding()) : 0);
                u11.x(C14);
            }
            float d14 = ((h) C14).d();
            u11.k();
            Integer valueOf5 = paddings != null ? Integer.valueOf(paddings.getBottomPadding()) : null;
            u11.o(1339595660);
            boolean n15 = u11.n(valueOf5);
            Object C15 = u11.C();
            if (n15 || C15 == InterfaceC3967k.a.a()) {
                C15 = h.a(paddings != null ? UiExtKt.toDp(paddings.getBottomPadding()) : 0);
                u11.x(C15);
            }
            float d15 = ((h) C15).d();
            u11.k();
            Object C16 = u11.C();
            if (C16 == InterfaceC3967k.a.a()) {
                C16 = Pk0.f.b(Q.j(g.f71771a, u11), u11);
            }
            M a11 = ((D) C16).a();
            u11.o(1339603146);
            Object C17 = u11.C();
            if (C17 == InterfaceC3967k.a.a()) {
                C17 = C7984d.a(0.0f);
                u11.x(C17);
            }
            C7980b c7980b = (C7980b) C17;
            Object b12 = Pk0.h.b(u11, 1339604755);
            if (b12 == InterfaceC3967k.a.a()) {
                b12 = C0.a(0.0f);
                u11.x(b12);
            }
            InterfaceC3970l0 interfaceC3970l0 = (InterfaceC3970l0) b12;
            u11.k();
            e.a aVar = e.f40358c0;
            e e11 = a0.e(aVar, 1.0f);
            u11.o(1339609196);
            Object C18 = u11.C();
            if (C18 == InterfaceC3967k.a.a()) {
                C18 = new BonusExpirationRemainderKt$ShowContent$1$1(interfaceC3970l0);
                u11.x(C18);
            }
            u11.k();
            e a12 = c.a(e11, (Function1) C18);
            u11.o(1339613045);
            boolean F11 = u11.F(c7980b);
            Object C19 = u11.C();
            if (F11 || C19 == InterfaceC3967k.a.a()) {
                C19 = new BonusExpirationRemainderKt$ShowContent$2$1(c7980b);
                u11.x(C19);
            }
            u11.k();
            b11 = androidx.compose.foundation.e.b(C6988h.a(a.a(a12, (Function1) C19), A0.h.d(d11, d11, 0.0f, 0.0f, 12)), composeColor, y0.a());
            u11.o(1339624214);
            Object C21 = u11.C();
            if (C21 == InterfaceC3967k.a.a()) {
                C21 = p.a();
                u11.x(C21);
            }
            q qVar = (q) C21;
            Object b13 = Pk0.h.b(u11, 1339626436);
            if (b13 == InterfaceC3967k.a.a()) {
                b13 = androidx.compose.material.Q.f(7, 0L);
                u11.x(b13);
            }
            InterfaceC8369J interfaceC8369J = (InterfaceC8369J) b13;
            u11.k();
            u11.o(1339627668);
            int i13 = i12 & 14;
            boolean z12 = ((i12 & 896) == 256) | (i13 == 4);
            Object C22 = u11.C();
            if (z12 || C22 == InterfaceC3967k.a.a()) {
                C22 = new BonusExpirationRemainderKt$ShowContent$5$1(bonusExpirationRemainderVI, function1);
                u11.x(C22);
            }
            u11.k();
            e i14 = T.i(androidx.compose.foundation.i.b(b11, qVar, interfaceC8369J, false, null, null, (Function0) C22, 28), d12, d13, d14, d15);
            V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d16 = u11.d();
            e f12 = androidx.compose.ui.c.f(u11, i14);
            Function0 a13 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 f13 = E.f(u11, f11, u11, d16);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f13);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            C5187j c5187j = C5187j.f39515a;
            CellDTO cell = bonusExpirationRemainderVI.getCell();
            e a14 = c5187j.a(androidx.compose.foundation.layout.M.c(aVar, EnumC9909s.Max), InterfaceC6250b.a.e());
            if (bonusExpirationRemainderVI.getShouldAddMargins()) {
                f7 = 30;
                z11 = false;
            } else {
                z11 = false;
                f7 = 0;
            }
            DsCellAtomKt.DsCellAtom(cell, T.h(a14, f7, 0.0f, 2), null, u11, CellDTO.$stable, 4);
            u11.o(-1425641385);
            if (bonusExpirationRemainderVI.getCloseButton() != null) {
                IconButtonV3DTO closeButton = bonusExpirationRemainderVI.getCloseButton();
                e a15 = c5187j.a(aVar, InterfaceC6250b.a.n());
                u11.o(-1425635179);
                boolean F12 = u11.F(a11) | u11.F(c7980b) | u11.F(bonusExpirationRemainderViewModel) | (i13 != 4 ? z11 : true);
                Object C23 = u11.C();
                if (F12 || C23 == InterfaceC3967k.a.a()) {
                    bonusExpirationRemainderViewModel2 = bonusExpirationRemainderViewModel;
                    bonusExpirationRemainderKt$ShowContent$6$1$1 = new BonusExpirationRemainderKt$ShowContent$6$1$1(a11, c7980b, bonusExpirationRemainderViewModel2, bonusExpirationRemainderVI, interfaceC3970l0);
                    u11.x(bonusExpirationRemainderKt$ShowContent$6$1$1);
                } else {
                    bonusExpirationRemainderKt$ShowContent$6$1$1 = C23;
                    bonusExpirationRemainderViewModel2 = bonusExpirationRemainderViewModel;
                }
                u11.k();
                DsIconButtonAtomKt.DsIconButtonAtom(closeButton, null, a15, false, (Function1) bonusExpirationRemainderKt$ShowContent$6$1$1, u11, IconButtonV3DTO.$stable, 10);
                u11 = u11;
            } else {
                bonusExpirationRemainderViewModel2 = bonusExpirationRemainderViewModel;
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new BonusExpirationRemainderKt$ShowContent$7(bonusExpirationRemainderVI, bonusExpirationRemainderViewModel2, function1, i11));
        }
    }
}
