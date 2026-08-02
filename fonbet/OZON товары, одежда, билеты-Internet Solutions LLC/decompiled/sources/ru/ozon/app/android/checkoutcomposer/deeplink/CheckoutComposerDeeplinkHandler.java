package ru.ozon.app.android.checkoutcomposer.deeplink;

import GZ.j;
import IZ.a;
import J.d;
import Kk.C3531a;
import Kk.c;
import android.content.Context;
import android.view.View;
import i10.h;
import i10.l;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import qZ.C9010b;
import ru.ozon.app.android.checkoutcomposer.CheckoutPreCreationConfigurator;
import ru.ozon.app.android.checkoutcomposer.common.cardbinding.data.CardBindingConfigurator;
import ru.ozon.app.android.checkoutcomposer.common.configurator.AddressPartsInputPageConfigurator;
import ru.ozon.app.android.checkoutcomposer.common.configurator.CheckoutRequestInterceptor;
import ru.ozon.app.android.checkoutcomposer.common.configurator.InitCheckoutRequestConfigurator;
import ru.ozon.app.android.checkoutcomposer.common.configurator.RemoveRfbsSplitConfigurator;
import ru.ozon.app.android.checkoutcomposer.common.configurator.ScrollToWidgetConfigurator;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.helper.FormBuilderHelper;
import ru.ozon.app.android.checkoutcomposer.common.scrollToWidget.CheckoutScrollToWidgetKeyRepository;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.configurator.CheckoutClearCacheConfigurator;
import ru.ozon.app.android.checkoutcomposer.total.configurator.ClearReferrerConfigurator;
import ru.ozon.app.android.checkoutgeo.checkout.configurators.ConfirmDeleteResultConfigurator;
import ru.ozon.app.android.checkoutgeo.checkout.localgoods.LocalGoodsForCheckoutRepository;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFlowDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.csma.flags.OrderDoneStatusPrefetchImagesEnabled;
import ru.ozon.app.android.navigation.FlowTag;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.payment.ui.configurators.AvailableNativePaymentInterceptor;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayConfigurator;
import ru.ozon.app.android.payment.ui.fastPay.linkFastPay.LinkFastPayConfigurator;
import ru.ozon.app.android.payment.ui.updateOrderC2C.UpdateOrderC2CConfigurator;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import tZ.C9788c;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u0010\u001a\u00020\r2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u00142\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/checkoutcomposer/deeplink/CheckoutComposerDeeplinkHandler;", "LIZ/a;", "Lru/ozon/app/android/checkoutgeo/checkout/localgoods/LocalGoodsForCheckoutRepository;", "localGoodsRepo", "Lru/ozon/app/android/checkoutcomposer/common/scrollToWidget/CheckoutScrollToWidgetKeyRepository;", "checkoutScrollToWidgetKeyRepository", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/checkoutgeo/checkout/localgoods/LocalGoodsForCheckoutRepository;Lru/ozon/app/android/checkoutcomposer/common/scrollToWidget/CheckoutScrollToWidgetKeyRepository;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "Lru/ozon/app/android/composer/universalscreen/view/BackgroundColorAttr;", "handleBackground-CG0atzM", "(LGZ/j;)I", "handleBackground", "", "", "segments", "", "isNeedSecondaryBackground", "(Ljava/util/List;)Z", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/checkoutgeo/checkout/localgoods/LocalGoodsForCheckoutRepository;", "Lru/ozon/app/android/checkoutcomposer/common/scrollToWidget/CheckoutScrollToWidgetKeyRepository;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckoutComposerDeeplinkHandler implements a {

    @NotNull
    private final CheckoutScrollToWidgetKeyRepository checkoutScrollToWidgetKeyRepository;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final LocalGoodsForCheckoutRepository localGoodsRepo;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/deeplink/CheckoutComposerDeeplinkHandler$Companion;", "", "<init>", "()V", "CODE_ACTIVATION_DEEPLINK", "", "QUERY_SCROLL_WIDGET_NAME", "QUERY_SCROLL_WIDGET_VERTICAL", "QUERY_APPLY_ADDRESS", "PATH_C2C", "POPULAR_BANK_LIST", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CheckoutComposerDeeplinkHandler(@NotNull LocalGoodsForCheckoutRepository localGoodsRepo, @NotNull CheckoutScrollToWidgetKeyRepository checkoutScrollToWidgetKeyRepository, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(localGoodsRepo, "localGoodsRepo");
        Intrinsics.checkNotNullParameter(checkoutScrollToWidgetKeyRepository, "checkoutScrollToWidgetKeyRepository");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.localGoodsRepo = localGoodsRepo;
        this.checkoutScrollToWidgetKeyRepository = checkoutScrollToWidgetKeyRepository;
        this.featureChecker = featureChecker;
    }

    /* renamed from: handleBackground-CG0atzM, reason: not valid java name */
    private final int m566handleBackgroundCG0atzM(j route) {
        List<String> pathSegments = route.b().getPathSegments();
        Intrinsics.f(pathSegments);
        return Intrinsics.d(C7714v.Q(0, pathSegments), "popularBankList") ? BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor1) : isNeedSecondaryBackground(pathSegments) ? BackgroundColorAttr.m673constructorimpl(R$attr.bgSecondary) : BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor0);
    }

    private final boolean isNeedSecondaryBackground(List<String> segments) {
        String str = (String) C7714v.Q(0, segments);
        return Intrinsics.d(str, "leaveatdoormodal") || Intrinsics.d(str, "paymentpromodetail") || Intrinsics.d(str, "code") || (Intrinsics.d(str, "delivery") && segments.size() == 1) || (Intrinsics.d(str, "delivery") && Intrinsics.d((String) C7714v.Q(1, segments), "carousel") && segments.size() == 2);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        if (!d.d(route, "route", "gocheckout") || C3531a.c(route, "getPathSegments(...)", "patchUserAccount")) {
            return false;
        }
        return ((C3531a.c(route, "getPathSegments(...)", "delivery") && Kk.d.c(route, "getPathSegments(...)", 1, "map")) || C3531a.c(route, "getPathSegments(...)", "comment")) ? false : true;
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        C9788c a11;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        LinkedHashSet i11 = e0.i(ConfirmDeleteResultConfigurator.class, CreateAndPayConfigurator.class, CardBindingConfigurator.class, AddressPartsInputPageConfigurator.class, CheckoutClearCacheConfigurator.class, CheckoutPreCreationConfigurator.class, RemoveRfbsSplitConfigurator.class, UpdateOrderC2CConfigurator.class, ScrollToWidgetConfigurator.class, ClearReferrerConfigurator.class, LinkFastPayConfigurator.class, this.featureChecker.isEnabled(OrderDoneStatusPrefetchImagesEnabled.INSTANCE) ? PreloadImagesConfigurator.class : null);
        String queryParameter = route.b().getQueryParameter("scrollWidgetName");
        String queryParameter2 = route.b().getQueryParameter("scrollWidgetVertical");
        if (queryParameter != null && queryParameter2 != null) {
            this.checkoutScrollToWidgetKeyRepository.putScrollWidgetKey(queryParameter2 + "." + queryParameter);
        }
        List<String> pathSegments = route.b().getPathSegments();
        boolean z11 = pathSegments.isEmpty() || Intrinsics.d(C7714v.M(pathSegments), "c2c");
        LinkedHashSet e11 = e0.e(CheckoutRequestInterceptor.class, AvailableNativePaymentInterceptor.class);
        if (z11) {
            e11.add(InitCheckoutRequestConfigurator.class);
        }
        int m566handleBackgroundCG0atzM = m566handleBackgroundCG0atzM(route);
        Map<String, Object> e12 = route.e();
        if (e12.isEmpty()) {
            e12 = null;
        }
        if (e12 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : e12.entrySet()) {
                if (!(entry.getValue() instanceof View)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            this.localGoodsRepo.putLocalGoods(linkedHashMap);
        }
        String c11 = c.c(route, "toString(...)");
        h.c.a aVar = new h.c.a(c11, (String) null, (String) null, 14);
        LinkedHashSet f7 = e0.f(FormBuilderHelper.INSTANCE.getConfigurators(), i11);
        ComposerScreenConfig.AppearanceConfig appearanceConfig = new ComposerScreenConfig.AppearanceConfig(new l.a.b(0L, null, 3));
        int i12 = R$color.transparent;
        ComposerFlowDestination composerFlowDestination = new ComposerFlowDestination(new ComposerScreenConfig(aVar, new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(0, false, null, null, Integer.valueOf(i12), Integer.valueOf(i12), 15, null), 0, 2, null), false, null, true, false, false, false, null, false, false, false, f7, e11, null, BackgroundColorAttr.m672boximpl(m566handleBackgroundCG0atzM), false, appearanceConfig, null, null, false, false, null, null, 16601068, null), c11, null, new C9010b(FlowTag.CHECKOUT, 14), false, 20, null);
        if (!route.b().getQueryParameterNames().contains("apply_address")) {
            return composerFlowDestination;
        }
        int i13 = C9788c.f99312e;
        a11 = C9788c.a.a(null, composerFlowDestination);
        return a11;
    }
}
