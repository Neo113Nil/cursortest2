package ru.ozon.app.android.cart.ui.cartActionProcessor.actionHandlers;

import Rg.a;
import Tg.b;
import WZ.l;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.L;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.BaseActionHandler;
import ru.ozon.app.android.action.analytics.ActionUsageAnalyticsTracking;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.cart.domain.utils.CartNotificationDelegateAnalyticUtils;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cart/ui/cartActionProcessor/actionHandlers/AddToCartResponseActionWithActionHandler;", "Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionHandler;", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "LTg/b;", "dataAction", "", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;LTg/b;)V", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddToCartResponseActionWithActionHandler extends ComposerActionWithActionHandler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToCartResponseActionWithActionHandler(@NotNull AppType appType, @NotNull ActionV2Repository actionV2Repository, @NotNull FeatureChecker featureChecker) {
        super(appType, actionV2Repository, featureChecker);
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
    }

    @Override // ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler
    protected void showNotification(@NotNull NotificationDTO notification, @NotNull CustomActionHandler.HandlerReferences handlerRefs, b dataAction) {
        NotificationLayoutManager asNotificationLayoutManager;
        a a11;
        Intrinsics.checkNotNullParameter(notification, "notification");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        ComposerReferences refs = handlerRefs.getRefs();
        View parentView = getParentView(refs.getContainer(), dataAction);
        CoordinatorLayout coordinatorLayout = parentView instanceof CoordinatorLayout ? (CoordinatorLayout) parentView : null;
        if (coordinatorLayout == null || (asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(coordinatorLayout, 0)) == null) {
            return;
        }
        Sg.a d11 = ((AnalyticsScreenStorageComponentApi) refs.getComponent(AnalyticsScreenStorageComponentApi.class)).getAnalyticsScreenStorage().d();
        String l11 = (d11 == null || (a11 = d11.a()) == null) ? null : a11.l();
        if (l11 == null) {
            l11 = "";
        }
        String str = l11;
        l tokenizedAnalytics = ((RetainComposerComponentApi) refs.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
        L l12 = new L();
        CartNotificationDelegateAnalyticUtils cartNotificationDelegateAnalyticUtils = CartNotificationDelegateAnalyticUtils.INSTANCE;
        NotificationBar.Companion companion = NotificationBar.INSTANCE;
        r a12 = refs.getContainer().a();
        if (a12 == null) {
            return;
        }
        NotificationBar make = companion.make(asNotificationLayoutManager, notification, a12, BaseActionHandler.Builder.INSTANCE.invoke(refs.getNavigator(), new ActionUsageAnalyticsTracking.ByComponentStorage(refs.getComposerWidgetComponentStorage())).onPreProcess(new AddToCartResponseActionWithActionHandler$showNotification$1(l12, tokenizedAnalytics)).buildHandler());
        long hashCode = make.hashCode();
        l12.f71786a = hashCode;
        CommonControlSettings common = notification.getCommon();
        cartNotificationDelegateAnalyticUtils.setTrackingViewEvent(make, tokenizedAnalytics, hashCode, str, common != null ? common.getTrackingInfo() : null).show();
    }
}
