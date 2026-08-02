package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v4.view;

import B1.V;
import D1.InterfaceC2801g;
import E0.C2942q;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import WZ.l;
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import e1.InterfaceC6250b;
import e3.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v4.presentation.TravelCarriageSelectV4VI;
import ru.ozon.app.android.travel.molecules.view.shiftedPreviewIcons.ShiftedPreviewIconsComposeViewKt;
import ru.ozon.app.android.travel.molecules.view.shiftedPreviewIcons.ShiftedPreviewIconsVO;
import ru.ozon.app.android.travel.utils.extensions.ComposeColorKt;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.UniColors;
import u0.E;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI$DetailsVI;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "TravelCarriageSelectV4DetailsView", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI$DetailsVI;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "railway_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCarriageSelectV4DetailsViewKt {
    public static final void TravelCarriageSelectV4DetailsView(@NotNull TravelCarriageSelectV4VI.DetailsVI item, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        long j11;
        char c11;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-1904572012);
        char c12 = 6;
        int i12 = (i11 & 6) == 0 ? (u11.F(item) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            t tokenizedEvent = item.getTokenizedEvent();
            u11.o(884233182);
            if (tokenizedEvent != null) {
                l lVar = (l) u11.m(f.e());
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(-1686255688);
                boolean F11 = u11.F(lVar) | u11.F(tokenizedEvent);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new TravelCarriageSelectV4DetailsViewKt$TravelCarriageSelectV4DetailsView$1$1$1(lVar, tokenizedEvent);
                    u11.x(C11);
                }
                u11.k();
                i.a(aVar, null, (Function0) C11, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            long composeColor = ComposeColorKt.composeColor(UniColors.LAYER_FLOOR_1, u11, 6);
            u11.o(884242284);
            boolean s11 = u11.s(composeColor);
            Object C12 = u11.C();
            if (s11 || C12 == InterfaceC3967k.a.a()) {
                AbstractC7799Q.a aVar2 = AbstractC7799Q.Companion;
                j11 = C7807Z.f72258l;
                C12 = AbstractC7799Q.a.a(aVar2, C7714v.b0(C7807Z.m(j11), C7807Z.m(C7807Z.o(0.8f, composeColor)), C7807Z.m(composeColor)), 0.0f, Float.POSITIVE_INFINITY, 8);
                u11.x(C12);
            }
            AbstractC7799Q abstractC7799Q = (AbstractC7799Q) C12;
            u11.k();
            e e11 = a0.e(e.f40358c0, 1.0f);
            u11.o(884257688);
            boolean F12 = u11.F(item) | ((i12 & 112) == 32);
            Object C13 = u11.C();
            if (F12 || C13 == InterfaceC3967k.a.a()) {
                C13 = new TravelCarriageSelectV4DetailsViewKt$TravelCarriageSelectV4DetailsView$2$1(item, actionHandler);
                u11.x(C13);
            }
            u11.k();
            boolean z11 = false;
            e b11 = androidx.compose.foundation.i.b(e11, null, null, false, null, null, (Function0) C13, 28);
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, b11);
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
            u11.o(-1686231897);
            if (item.getIsServicesIconVisible()) {
                u11.o(-1686229983);
                int i13 = 0;
                for (Object obj : item.getServicesIcon()) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    TravelCarriageSelectV4VI.IconVI iconVI = (TravelCarriageSelectV4VI.IconVI) obj;
                    u11.o(-1686228937);
                    if (i13 != 0) {
                        E.a(u11, a0.r(e.f40358c0, Paddings.PADDING_100.m1867getDpD9Ej5fM()));
                    }
                    u11.k();
                    if (iconVI.getNeedFade()) {
                        u11.o(736729062);
                        e.a aVar3 = e.f40358c0;
                        V f11 = C5185h.f(InterfaceC6250b.a.o(), z11);
                        int I12 = u11.I();
                        A0 d12 = u11.d();
                        e f12 = c.f(u11, aVar3);
                        Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                            u11.H(a12);
                        } else {
                            u11.e();
                        }
                        Function2 f13 = T7.E.f(u11, f11, u11, d12);
                        if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                            a.d(I12, u11, I12, f13);
                        }
                        F1.b(u11, f12, InterfaceC2801g.a.f());
                        C5187j c5187j = C5187j.f39515a;
                        DsIconAtomKt.DsIconAtom(iconVI.getIcon(), null, u11, IconDTO.$stable, 2);
                        c11 = 6;
                        z11 = false;
                        C5185h.a(androidx.compose.foundation.e.a(c5187j.b(aVar3), abstractC7799Q, null, 6), u11, 0);
                        u11.f();
                        u11.k();
                    } else {
                        c11 = c12;
                        u11.o(737049230);
                        DsIconAtomKt.DsIconAtom(iconVI.getIcon(), null, u11, IconDTO.$stable, 2);
                        u11.k();
                    }
                    c12 = c11;
                    i13 = i14;
                }
                u11.k();
                E.a(u11, a0.r(e.f40358c0, Paddings.PADDING_300.m1867getDpD9Ej5fM()));
            }
            u11.k();
            ShiftedPreviewIconsVO shiftedPreviewIcons = item.getShiftedPreviewIcons();
            u11.o(-1686209387);
            if (shiftedPreviewIcons != null) {
                ShiftedPreviewIconsComposeViewKt.ShiftedPreviewIconsComposable(shiftedPreviewIcons, null, u11, ShiftedPreviewIconsVO.$stable, 2);
                Unit unit2 = Unit.f71690a;
            }
            u11.k();
            e.a aVar4 = e.f40358c0;
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            E.a(u11, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            DsBadgeAtomKt.DsBadgeAtom(item.getDetailsBadge(), null, actionHandler, u11, (i12 << 3) & 896, 2);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new TravelCarriageSelectV4DetailsViewKt$TravelCarriageSelectV4DetailsView$4(item, actionHandler, i11));
        }
    }
}
