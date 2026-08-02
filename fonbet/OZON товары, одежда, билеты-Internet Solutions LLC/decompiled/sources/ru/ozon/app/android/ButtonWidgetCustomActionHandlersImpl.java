package ru.ozon.app.android;

import Vg.f;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.ButtonWidgetCustomActionHandlers;
import ru.ozon.app.android.actionHandlers.monetization.confirmBloggerChannel.ConfirmBloggerChannelActionHandler;
import ru.ozon.app.android.actionHandlers.monetization.shareLinkBloggerFromTile.ShareLinkBloggerFromTileActionHandler;
import ru.ozon.app.android.actionHandlers.monetization.submitBloggerPostMobile.SubmitBloggerPostActionHandler;
import ru.ozon.app.android.actionHandlers.ugc.doubleDismissAndRedirect.DoubleDismissAndRedirectActionHandler;
import ru.ozon.app.android.actionHandlers.ugc.doubleDismissAndRefresh.DoubleDismissAndRefreshActionHandler;
import ru.ozon.app.android.actionHandlers.ugc.submitSelectionFormMobile.SubmitSelectionFormActionHandler;
import ru.ozon.app.android.cart.ui.performTwoActions.PerformTwoActionsHandler;
import ru.ozon.app.android.common.actionHandlers.OpenApplicationStoreActionHandler;
import ru.ozon.app.android.common.actionHandlers.SetTeensModeActionHandler;
import ru.ozon.app.android.common.actionHandlers.shareLink.ShareLinkActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.addcard.AddCardActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.call.ClassifiedCallActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.callCourier.CallCourierActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.cleanCncAddress.CleanCncAddressActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.dismissAndScrollByWidgetKey.DismissAndScrollByScrollWidgetKeyActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.gocheckout.GoCheckoutActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.openNotificationSettings.OpenNotificationSettingsActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.ozonid.LogoutActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.removeSplit.RemoveSplitActionHandler;
import ru.ozon.app.android.favorites.ui.actionhandler.FamilyActionHandler;
import ru.ozon.app.android.favorites.ui.actionhandler.FamilyGetLinkActionHandler;
import ru.ozon.app.android.favorites.ui.actionhandler.FavoriteShareListActionHandler;
import ru.ozon.app.android.partpayment.homecredit.HomeCreditActionHandler;
import ru.ozon.app.android.pdp.actionHandlers.addToCartWithRedirect.AddToCartWithRedirectActionHandler;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.actionHandler.RemoveSelectionItemProductActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.PopActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.handler.ComposerActionAndRedirectActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithSaveScrollActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithRefresh.ComposerActionWithRefreshCustomActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.openDeeplinkForResult.OpenDeeplinkForRefreshResultActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.openDeleteListingModal.ClassifiedOpenDeleteListingModalActionHandler;
import ru.ozon.app.android.storefront.actionHandlers.RedirectToSelectActionHandler;
import ru.ozon.app.android.storefront.onboardingscreen.onboardingv2.OnboardingActionHandler;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.actionHandler.SendRatingOnlyActionHandler;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/ButtonWidgetCustomActionHandlersImpl;", "Lru/ozon/app/android/action/custom/ButtonWidgetCustomActionHandlers;", "<init>", "()V", "", "Ljava/lang/Class;", "LVg/f;", "getActionHandlers", "()Ljava/util/Set;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ButtonWidgetCustomActionHandlersImpl implements ButtonWidgetCustomActionHandlers {
    @Override // ru.ozon.app.android.action.custom.ButtonWidgetCustomActionHandlers
    @NotNull
    public Set<Class<? extends f>> getActionHandlers() {
        Class[] elements = {AddCardActionHandler.class, GoCheckoutActionHandler.class, ClassifiedCallActionHandler.class, HomeCreditActionHandler.class, ShareLinkActionHandler.class, RemoveSplitActionHandler.class, ComposerActionWithSaveScrollActionHandler.class, ComposerActionAndRedirectActionHandler.class, CallCourierActionHandler.class, ComposerActionWithRefreshCustomActionHandler.class, ClassifiedOpenDeleteListingModalActionHandler.class, OpenDeeplinkForRefreshResultActionHandler.class, OpenApplicationStoreActionHandler.class, RedirectToSelectActionHandler.class, OpenNotificationSettingsActionHandler.class, DismissAndScrollByScrollWidgetKeyActionHandler.class, PopActionHandler.class, OnboardingActionHandler.class, LogoutActionHandler.class, AddToCartWithRedirectActionHandler.class, PerformTwoActionsHandler.class, FavoriteShareListActionHandler.class, SubmitSelectionFormActionHandler.class, SubmitBloggerPostActionHandler.class, ConfirmBloggerChannelActionHandler.class, DoubleDismissAndRedirectActionHandler.class, DoubleDismissAndRefreshActionHandler.class, RemoveSelectionItemProductActionHandler.class, SendRatingOnlyActionHandler.class, FamilyGetLinkActionHandler.class, FamilyActionHandler.class, CleanCncAddressActionHandler.class, SetTeensModeActionHandler.class, ShareLinkBloggerFromTileActionHandler.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
