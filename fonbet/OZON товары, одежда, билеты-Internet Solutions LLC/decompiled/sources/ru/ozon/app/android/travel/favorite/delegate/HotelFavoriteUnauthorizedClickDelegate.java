package ru.ozon.app.android.travel.favorite.delegate;

import android.view.View;
import androidx.lifecycle.J;
import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.favorite.analytics.HotelFavoriteUnauthorizedAnalytics;
import ru.ozon.app.android.travel.map.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/favorite/delegate/HotelFavoriteUnauthorizedClickDelegate;", "Landroid/view/View$OnClickListener;", "Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;", "notificationLayoutManager", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "notificationActionHandler", "Landroidx/lifecycle/J;", "notificationLifecycleOwner", "Lru/ozon/app/android/travel/favorite/analytics/HotelFavoriteUnauthorizedAnalytics;", "analytics", "<init>", "(Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/J;Lru/ozon/app/android/travel/favorite/analytics/HotelFavoriteUnauthorizedAnalytics;)V", "onUnauthenticatedUserClicked", "()V", "Landroid/view/View;", "view", "onClick", "(Landroid/view/View;)V", "Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;", "Lkotlin/jvm/functions/Function1;", "Landroidx/lifecycle/J;", "Lru/ozon/app/android/travel/favorite/analytics/HotelFavoriteUnauthorizedAnalytics;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HotelFavoriteUnauthorizedClickDelegate implements View.OnClickListener {

    @NotNull
    private final HotelFavoriteUnauthorizedAnalytics analytics;

    @NotNull
    private final Function1<AtomAction, Unit> notificationActionHandler;

    @NotNull
    private final NotificationLayoutManager notificationLayoutManager;

    @NotNull
    private final J notificationLifecycleOwner;

    /* JADX WARN: Multi-variable type inference failed */
    public HotelFavoriteUnauthorizedClickDelegate(@NotNull NotificationLayoutManager notificationLayoutManager, @NotNull Function1<? super AtomAction, Unit> notificationActionHandler, @NotNull J notificationLifecycleOwner, @NotNull HotelFavoriteUnauthorizedAnalytics analytics) {
        Intrinsics.checkNotNullParameter(notificationLayoutManager, "notificationLayoutManager");
        Intrinsics.checkNotNullParameter(notificationActionHandler, "notificationActionHandler");
        Intrinsics.checkNotNullParameter(notificationLifecycleOwner, "notificationLifecycleOwner");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.notificationLayoutManager = notificationLayoutManager;
        this.notificationActionHandler = notificationActionHandler;
        this.notificationLifecycleOwner = notificationLifecycleOwner;
        this.analytics = analytics;
    }

    private final void onUnauthenticatedUserClicked() {
        HotelFavoriteUnauthorizedClickDelegate$onUnauthenticatedUserClicked$actionHandlerWithClickTracking$1 hotelFavoriteUnauthorizedClickDelegate$onUnauthenticatedUserClicked$actionHandlerWithClickTracking$1 = new HotelFavoriteUnauthorizedClickDelegate$onUnauthenticatedUserClicked$actionHandlerWithClickTracking$1(this);
        NotificationBar make = NotificationBar.INSTANCE.make(this.notificationLayoutManager, new NotificationDTO(StringProvider.getString(R$string.hotels_favorites_authenticate_notification_message), null, 0, null, null, new NotificationDTO.RightContent(NotificationDTO.RightContent.ButtonType.BUTTON, new ButtonV3DTO(ButtonV3DTO.StyleTypes.CUSTOM, ButtonV3DTO.Sizes.SIZE_400, StringProvider.getString(R$string.hotels_favorites_authenticate_notification_button_text), null, null, null, null, UniColors.TEXT_ACTION_INVERTED.getToken(), null, null, null, null, UniColors.BG_ACTION_SECONDARY_INVERTED.getToken(), new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.REDIRECT, "ozon://login", null, null, 12, null), null, null, 6, null), null, null, null, null, 249720, null), null, null, 12, null), 3, null, null, NotificationDTO.Preset.WARNING, WalletConstants.ERROR_CODE_INVALID_TRANSACTION, null), this.notificationLifecycleOwner, hotelFavoriteUnauthorizedClickDelegate$onUnauthenticatedUserClicked$actionHandlerWithClickTracking$1);
        make.addCallback(new NotificationBar.Callback() { // from class: ru.ozon.app.android.travel.favorite.delegate.HotelFavoriteUnauthorizedClickDelegate$onUnauthenticatedUserClicked$1$1
            @Override // ru.ozon.uni.android.notificationbar.NotificationBar.Callback
            public void onDismissed(NotificationBar notificationBar, NotificationBar.DismissReason dismissReason) {
                NotificationBar.Callback.DefaultImpls.onDismissed(this, notificationBar, dismissReason);
            }

            @Override // ru.ozon.uni.android.notificationbar.NotificationBar.Callback
            public void onShown(NotificationBar notificationBar) {
                HotelFavoriteUnauthorizedAnalytics hotelFavoriteUnauthorizedAnalytics;
                Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
                hotelFavoriteUnauthorizedAnalytics = HotelFavoriteUnauthorizedClickDelegate.this.analytics;
                hotelFavoriteUnauthorizedAnalytics.sendViewEvent$map_prodGoogleAllVendorsRelease();
            }
        });
        make.show();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        onUnauthenticatedUserClicked();
    }
}
