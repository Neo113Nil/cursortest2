package ru.ozon.app.android.checkoutcomposer.mercuryCertificatesInfo.presentation;

import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.C3996z;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import WZ.l;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import androidx.compose.ui.platform.V1;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import e1.InterfaceC6250b;
import e3.i;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesInfo.composable.AspectListKt;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesInfo.presentation.vo.MercuryCertificatesInfoVO;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a9\u0010\r\u001a\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/presentation/vo/MercuryCertificatesInfoVO;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "MercuryCertificatesInfoWidget", "(Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/presentation/vo/MercuryCertificatesInfoVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Landroidx/compose/ui/platform/V1;", "customUriHandler", "(Lkotlin/jvm/functions/Function1;Ljava/util/Map;LS0/k;I)Landroidx/compose/ui/platform/V1;", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MercuryCertificatesInfoWidgetKt {
    public static final void MercuryCertificatesInfoWidget(@NotNull MercuryCertificatesInfoVO state, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        Function1<? super AtomAction, Unit> function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-875282891);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
            function1 = actionHandler;
        } else {
            l lVar = (l) u11.m(f.e());
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            u11.o(1803875185);
            boolean F11 = u11.F(state) | u11.F(lVar);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new MercuryCertificatesInfoWidgetKt$MercuryCertificatesInfoWidget$1$1(state, lVar);
                u11.x(C11);
            }
            u11.k();
            i.a(aVar, null, (Function0) C11, u11, 6);
            MercuryCertificatesInfoVO.SettingsVO settings = state.getSettings();
            C7807Z c7807z = TokenParserKt.tokenToColor(settings != null ? settings.getBackgroundColor() : null, u11, 0);
            u11.o(1803878862);
            long layerFloor1 = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1() : c7807z.w();
            u11.k();
            b11 = androidx.compose.foundation.e.b(a0.e(e.f40358c0, 1.0f), layerFloor1, y0.a());
            e f7 = T.f(b11, Paddings.PADDING_500.m1867getDpD9Ej5fM());
            int i13 = C5179b.f39454h;
            C5194q a11 = C5193p.a(C5179b.n(Paddings.PADDING_300.m1867getDpD9Ej5fM()), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, f7);
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
            F1.b(u11, f11, InterfaceC2801g.a.f());
            DsTextAtomKt.DsTextAtom(state.getTitle(), null, u11, 0, 2);
            TextDTO subtitle = state.getSubtitle();
            u11.o(1717358274);
            if (subtitle != null) {
                DsTextAtomKt.DsTextAtom(subtitle, null, u11, 0, 2);
            }
            u11.k();
            MercuryCertificatesInfoVO.AspectListVO aspectList = state.getAspectList();
            u11.o(1717361341);
            if (aspectList != null) {
                AspectListKt.AspectList(aspectList, actionHandler, u11, i12 & 112);
            }
            u11.k();
            CellDTO address = state.getAddress();
            u11.o(1717367113);
            if (address == null) {
                function1 = actionHandler;
            } else {
                function1 = actionHandler;
                DsCellAtomKt.DsCellAtom(address, null, function1, u11, CellDTO.$stable | ((i12 << 3) & 896), 2);
            }
            u11.k();
            TextDTO caption = state.getCaption();
            u11.o(1717372483);
            if (caption != null) {
                C3996z.a(K0.q().c(customUriHandler(function1, caption.getTrackingInfo(), u11, (i12 >> 3) & 14)), a1.c.c(-1423202375, new MercuryCertificatesInfoWidgetKt$MercuryCertificatesInfoWidget$2$4$1(caption), u11), u11, 56);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new MercuryCertificatesInfoWidgetKt$MercuryCertificatesInfoWidget$3(state, function1, i11));
        }
    }

    @NotNull
    public static final V1 customUriHandler(@NotNull final Function1<? super AtomAction, Unit> actionHandler, final Map<String, TokenizedTrackingInfo> map, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        interfaceC3967k.o(-781756385);
        V1 v12 = new V1() { // from class: ru.ozon.app.android.checkoutcomposer.mercuryCertificatesInfo.presentation.MercuryCertificatesInfoWidgetKt$customUriHandler$1
            @Override // androidx.compose.ui.platform.V1
            public void openUri(String uri) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                actionHandler.invoke(new AtomAction.Move(uri, null, map, null, 10, null));
            }
        };
        interfaceC3967k.k();
        return v12;
    }
}
