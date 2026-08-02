package ru.ozon.app.android.storefront.widgets.placementSlider.core;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import S0.Q;
import a00.h;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d00.C6020f;
import fd.InterfaceC6512o;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.common.actionHandlers.ViewPromoPlacementBannerActionHandler;
import ru.ozon.app.android.storefront.widgets.placementSlider.di.PromoPlacementWidgetComponent;
import ru.ozon.app.android.storefront.widgets.placementSlider.presentation.PromoPlacementVO;
import ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager.PromoPlacementViewModel;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aO\u0010\u0012\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2$\u0010\u0011\u001a \u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e\u0012\u0004\u0012\u00020\u00100\fH\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Ln20/i;", "promoPlacementComposeWidgetFactory", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ln20/i;", "Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/PromoPlacementVO;", "Lru/ozon/app/android/storefront/widgets/placementSlider/di/PromoPlacementWidgetComponent;", "component", "Lk20/g;", "widgetComponentStorage", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/pager/PromoPlacementViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "content", "PromoPlacementWidgetContent", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/app/android/storefront/widgets/placementSlider/di/PromoPlacementWidgetComponent;Lk20/g;Lfd/o;LS0/k;I)V", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PromoPlacementComposeWidgetFactoryKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void PromoPlacementWidgetContent(final i<PromoPlacementVO> iVar, PromoPlacementWidgetComponent promoPlacementWidgetComponent, C7475g c7475g, InterfaceC6512o<? super PromoPlacementViewModel, ? super Function1<? super AtomAction, Unit>, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6512o, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        i<PromoPlacementVO> iVar2;
        C7475g c7475g2;
        C3969l u11 = interfaceC3967k.u(-1514415829);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(iVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(promoPlacementWidgetComponent) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(c7475g) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(interfaceC6512o) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
            iVar2 = iVar;
            c7475g2 = c7475g;
        } else {
            PromoPlacementViewModel promoPlacementViewModel = (PromoPlacementViewModel) new z0(((h) u11.m(f.f())).a(), new z0.c() { // from class: ru.ozon.app.android.storefront.widgets.placementSlider.core.PromoPlacementComposeWidgetFactoryKt$PromoPlacementWidgetContent$$inlined$viewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    return new PromoPlacementViewModel((PromoPlacementVO) i.this.b());
                }
            }).a(PromoPlacementViewModel.class);
            PromoPlacementVO b11 = iVar.b();
            u11.o(-163422845);
            int i13 = i12 & 14;
            boolean F11 = (i13 == 4) | u11.F(promoPlacementViewModel);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new PromoPlacementComposeWidgetFactoryKt$PromoPlacementWidgetContent$1$1(promoPlacementViewModel, iVar, null);
                u11.x(C11);
            }
            u11.k();
            Q.e(u11, b11, (Function2) C11);
            View view = (View) u11.m(AndroidCompositionLocals_androidKt.h());
            Unit unit = Unit.f71690a;
            u11.o(-163419402);
            boolean F12 = u11.F(view);
            Object C12 = u11.C();
            if (F12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new PromoPlacementComposeWidgetFactoryKt$PromoPlacementWidgetContent$2$1(view, null);
                u11.x(C12);
            }
            u11.k();
            Q.e(u11, unit, (Function2) C12);
            int i14 = i12 >> 3;
            iVar2 = iVar;
            c7475g2 = c7475g;
            interfaceC6512o.invoke(promoPlacementViewModel, WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(iVar2, c7475g2, null, null, null, u11, i13 | (i14 & 112), 14), promoPlacementWidgetComponent.getCustomActionHandlersStoreFactory().create(ViewPromoPlacementBannerActionHandler.class))), u11, Integer.valueOf(i14 & 896));
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PromoPlacementComposeWidgetFactoryKt$PromoPlacementWidgetContent$3(iVar2, promoPlacementWidgetComponent, c7475g2, interfaceC6512o, i11));
        }
    }

    @NotNull
    public static final n20.i promoPlacementComposeWidgetFactory(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        return C6020f.b("cms", "placementSlider", null, new PromoPlacementComposeWidgetFactoryKt$promoPlacementComposeWidgetFactory$1(jsonDeserializer), 4, null);
    }
}
