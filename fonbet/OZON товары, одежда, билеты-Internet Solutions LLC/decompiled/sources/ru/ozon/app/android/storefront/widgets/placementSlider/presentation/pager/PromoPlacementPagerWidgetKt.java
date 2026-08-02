package ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import Pk0.h;
import S0.A0;
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
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.i;
import fd.InterfaceC6511n;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.placementSlider.presentation.BannerVO;
import ru.ozon.app.android.storefront.widgets.placementSlider.presentation.PromoPlacementVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.utils.UniTestTagsKt;
import y0.C10792B;
import y0.b0;
import y0.c0;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aW\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042 \u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\bH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010²\u0006\u000e\u0010\u000e\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/PromoPlacementVO;", "state", "", "savedPage", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lkotlin/Function3;", "", "Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/BannerVO;", "onPageChanged", "PromoPlacementPagerWidget", "(Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/PromoPlacementVO;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Lfd/n;LS0/k;I)V", "isWidgetVisible", "isLifecycleResumed", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PromoPlacementPagerWidgetKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void PromoPlacementPagerWidget(@NotNull PromoPlacementVO state, Integer num, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull InterfaceC6511n<? super Integer, ? super Boolean, ? super BannerVO, ? extends AtomAction> onPageChanged, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Object promoPlacementPagerWidgetKt$PromoPlacementPagerWidget$3$1;
        Integer num2;
        InterfaceC3978p0 interfaceC3978p0;
        BannerVO bannerVO;
        Boolean bool;
        l lVar;
        Function1<? super AtomAction, Unit> function1;
        InterfaceC3978p0 interfaceC3978p02;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onPageChanged, "onPageChanged");
        C3969l u11 = interfaceC3967k.u(-206027287);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(num) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(onPageChanged) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
            function1 = actionHandler;
        } else {
            PlacementSliderPagerConfig placementSliderPagerConfig = new PlacementSliderPagerConfig(state.getItems().size());
            u11.G(-2094058564, state.getItems());
            int initialPage = placementSliderPagerConfig.initialPage(num);
            u11.o(-2094054509);
            boolean n11 = u11.n(placementSliderPagerConfig);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new PromoPlacementPagerWidgetKt$PromoPlacementPagerWidget$pagerState$1$1(placementSliderPagerConfig);
                u11.x(C11);
            }
            u11.k();
            b0 e11 = c0.e((Function0) C11, initialPage, u11, 2);
            u11.J();
            u11.o(-2094052580);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = n1.f(Boolean.FALSE, D1.f25195a);
                u11.x(C12);
            }
            InterfaceC3978p0 interfaceC3978p03 = (InterfaceC3978p0) C12;
            Object b11 = h.b(u11, -2094050596);
            if (b11 == InterfaceC3967k.a.a()) {
                b11 = n1.f(Boolean.FALSE, D1.f25195a);
                u11.x(b11);
            }
            InterfaceC3978p0 interfaceC3978p04 = (InterfaceC3978p0) b11;
            Object b12 = h.b(u11, -2094048516);
            if (b12 == InterfaceC3967k.a.a()) {
                b12 = n1.f(Boolean.FALSE, D1.f25195a);
                u11.x(b12);
            }
            InterfaceC3978p0 interfaceC3978p05 = (InterfaceC3978p0) b12;
            u11.k();
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            u11.o(-2094045693);
            Object C13 = u11.C();
            if (C13 == InterfaceC3967k.a.a()) {
                C13 = new PromoPlacementPagerWidgetKt$PromoPlacementPagerWidget$1$1(interfaceC3978p05);
                u11.x(C13);
            }
            u11.k();
            i.a(aVar, null, (Function0) C13, u11, 390);
            AbstractC5434v.a aVar2 = AbstractC5434v.a.ON_PAUSE;
            u11.o(-2094042684);
            Object C14 = u11.C();
            if (C14 == InterfaceC3967k.a.a()) {
                C14 = new PromoPlacementPagerWidgetKt$PromoPlacementPagerWidget$2$1(interfaceC3978p05);
                u11.x(C14);
            }
            u11.k();
            i.a(aVar2, null, (Function0) C14, u11, 390);
            int r11 = e11.r();
            BannerVO bannerVO2 = state.getItems().get(placementSliderPagerConfig.toItemIndex(r11));
            u11.o(-2094036709);
            Object C15 = u11.C();
            if (C15 == InterfaceC3967k.a.a()) {
                C15 = new LinkedHashSet();
                u11.x(C15);
            }
            Set set = (Set) C15;
            u11.k();
            l lVar2 = (l) u11.m(f.e());
            Boolean valueOf = Boolean.valueOf(PromoPlacementPagerWidget$lambda$3(interfaceC3978p04));
            Integer valueOf2 = Integer.valueOf(r11);
            u11.o(-2094031594);
            boolean r12 = ((i12 & 7168) == 2048) | u11.r(r11) | u11.F(bannerVO2) | ((i12 & 896) == 256);
            Object C16 = u11.C();
            if (r12 || C16 == InterfaceC3967k.a.a()) {
                num2 = valueOf2;
                interfaceC3978p0 = interfaceC3978p03;
                bannerVO = bannerVO2;
                bool = valueOf;
                lVar = lVar2;
                promoPlacementPagerWidgetKt$PromoPlacementPagerWidget$3$1 = new PromoPlacementPagerWidgetKt$PromoPlacementPagerWidget$3$1(onPageChanged, r11, bannerVO, actionHandler, interfaceC3978p04, null);
                function1 = actionHandler;
                interfaceC3978p02 = interfaceC3978p04;
                u11.x(promoPlacementPagerWidgetKt$PromoPlacementPagerWidget$3$1);
            } else {
                function1 = actionHandler;
                promoPlacementPagerWidgetKt$PromoPlacementPagerWidget$3$1 = C16;
                interfaceC3978p0 = interfaceC3978p03;
                num2 = valueOf2;
                bannerVO = bannerVO2;
                bool = valueOf;
                interfaceC3978p02 = interfaceC3978p04;
                lVar = lVar2;
            }
            u11.k();
            Q.f(bool, num2, bannerVO, (Function2) promoPlacementPagerWidgetKt$PromoPlacementPagerWidget$3$1, u11);
            u11.o(-2094027406);
            boolean F11 = u11.F(bannerVO) | u11.F(set) | u11.F(lVar);
            Object C17 = u11.C();
            if (F11 || C17 == InterfaceC3967k.a.a()) {
                C17 = new PromoPlacementPagerWidgetKt$PromoPlacementPagerWidget$4$1(bannerVO, set, lVar, null);
                u11.x(C17);
            }
            u11.k();
            Q.e(u11, bannerVO, (Function2) C17);
            long scrollInterval = state.getScrollInterval();
            boolean canAutoScroll = placementSliderPagerConfig.getCanAutoScroll();
            boolean z11 = ((Boolean) interfaceC3978p0.getValue()).booleanValue() || !PromoPlacementPagerWidget$lambda$6(interfaceC3978p05);
            u11.o(-2094011633);
            boolean n12 = u11.n(placementSliderPagerConfig);
            Object C18 = u11.C();
            if (n12 || C18 == InterfaceC3967k.a.a()) {
                C18 = new PromoPlacementPagerWidgetKt$PromoPlacementPagerWidget$5$1(placementSliderPagerConfig);
                u11.x(C18);
            }
            u11.k();
            PlacementSliderAutoScrollEffectKt.PlacementSliderAutoScrollEffect(e11, scrollInterval, canAutoScroll, z11, (Function1) ((kotlin.reflect.h) C18), u11, 0);
            e.a aVar3 = e.f40358c0;
            e f7 = a0.f(a0.e(aVar3, 1.0f), UserVerificationMethods.USER_VERIFY_PATTERN);
            u11.o(-2094006508);
            Object C19 = u11.C();
            if (C19 == InterfaceC3967k.a.a()) {
                C19 = new PromoPlacementPagerWidgetKt$PromoPlacementPagerWidget$6$1(interfaceC3978p02);
                u11.x(C19);
            }
            u11.k();
            e uniResourceIdTestTag = UniTestTagsKt.uniResourceIdTestTag(ru.ozon.composer.compose.widget.scrollable.f.b(f7, (Function1) C19), "promoPlacementContainer", u11, 54);
            V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f12 = c.f(u11, uniResourceIdTestTag);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f13 = E.f(u11, f11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f13);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            e e12 = a0.e(aVar3, 1.0f);
            u11.o(-593143975);
            Object C21 = u11.C();
            if (C21 == InterfaceC3967k.a.a()) {
                C21 = new PromoPlacementPagerWidgetKt$PromoPlacementPagerWidget$7$1$1(interfaceC3978p0);
                u11.x(C21);
            }
            u11.k();
            C10792B.a(e11, PlacementSliderAutoScrollEffectKt.pausePlacementSliderAutoScrollOnTouch(e12, (Function1) C21), T.a(12, 2, 0.0f), null, 1, 4, null, null, false, null, null, a1.c.c(1531010577, new PromoPlacementPagerWidgetKt$PromoPlacementPagerWidget$7$2(state, placementSliderPagerConfig, function1), u11), u11, 221568, 8136);
            u11 = u11;
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PromoPlacementPagerWidgetKt$PromoPlacementPagerWidget$8(state, num, function1, onPageChanged, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PromoPlacementPagerWidget$lambda$3(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PromoPlacementPagerWidget$lambda$4(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    private static final boolean PromoPlacementPagerWidget$lambda$6(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PromoPlacementPagerWidget$lambda$7(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }
}
