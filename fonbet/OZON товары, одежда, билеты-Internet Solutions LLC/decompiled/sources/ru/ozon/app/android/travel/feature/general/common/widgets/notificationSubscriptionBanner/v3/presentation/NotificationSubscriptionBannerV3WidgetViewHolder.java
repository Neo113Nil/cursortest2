package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2408n0;
import Ae.M0;
import Sc.InterfaceC4008j;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import android.app.NotificationManager;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.H;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3VI;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3ViewModel;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0011J\u001f\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010!\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010&R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u000f0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3View;", "containerView", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel;", "viewModel", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "<init>", "(Ll10/i;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3View;LWZ/l;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "", "observeWidgetStates", "()V", "", "subscribeActionSucceed", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getActualButtonDTO", "(Z)Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "onAttach", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3VI;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3View;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3ViewModel;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/app/NotificationManager;", "notificationManager$delegate", "LSc/j;", "getNotificationManager", "()Landroid/app/NotificationManager;", "notificationManager", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationSubscriptionBannerV3WidgetViewHolder extends k<NotificationSubscriptionBannerV3VI> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final NotificationSubscriptionBannerV3View containerView;

    @NotNull
    private final HandlersInhibitor inhibitor;

    /* renamed from: notificationManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j notificationManager;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final NotificationSubscriptionBannerV3ViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/presentation/NotificationSubscriptionBannerV3WidgetViewHolder$Companion;", "", "<init>", "()V", "HIDE_WIDGET", "", "SUBSCRIBE", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSubscriptionBannerV3WidgetViewHolder(@NotNull i container, @NotNull NotificationSubscriptionBannerV3View containerView, @NotNull l tokenizedAnalytics, @NotNull NotificationSubscriptionBannerV3ViewModel viewModel, @NotNull HandlersInhibitor inhibitor) {
        super(containerView);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        this.containerView = containerView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        this.inhibitor = inhibitor;
        this.actionHandler = new ActionHandler.Builder(container, this).onClick(new NotificationSubscriptionBannerV3WidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.notificationManager = Sc.k.b(new NotificationSubscriptionBannerV3WidgetViewHolder$notificationManager$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ButtonV3DTO getActualButtonDTO(boolean subscribeActionSucceed) {
        NotificationSubscriptionBannerV3VI.WidgetContent content;
        NotificationSubscriptionBannerV3VI.WidgetContent content2;
        NotificationSubscriptionBannerV3VI boundData;
        if (!getNotificationManager().areNotificationsEnabled() || (!subscribeActionSucceed && ((boundData = getBoundData()) == null || !boundData.getIsBackendSubscribed()))) {
            NotificationSubscriptionBannerV3VI boundData2 = getBoundData();
            if (boundData2 == null || (content = boundData2.getContent()) == null) {
                return null;
            }
            return content.getSubscribeButton();
        }
        NotificationSubscriptionBannerV3VI boundData3 = getBoundData();
        if (boundData3 == null || (content2 = boundData3.getContent()) == null) {
            return null;
        }
        return content2.getSubscriptionCompletedButton();
    }

    private final NotificationManager getNotificationManager() {
        return (NotificationManager) this.notificationManager.getValue();
    }

    private final void observeWidgetStates() {
        M0<NotificationSubscriptionBannerV3ViewModel.ButtonState> buttonStateFlow = this.viewModel.getButtonStateFlow();
        AbstractC5434v lifecycle = getLifecycle();
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C2399j.C(new C2408n0(new C2406m0(C5427n.a(buttonStateFlow, lifecycle, bVar)), new NotificationSubscriptionBannerV3WidgetViewHolder$observeWidgetStates$1(this, null)), H.a(getLifecycle()));
        C2399j.C(new C2408n0(new C2406m0(C5427n.a(this.viewModel.getActionFlow(), getLifecycle(), bVar)), new NotificationSubscriptionBannerV3WidgetViewHolder$observeWidgetStates$2(this, null)), H.a(getLifecycle()));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeWidgetStates();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull NotificationSubscriptionBannerV3VI item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        if (!item.getIsBackendSubscribed() || !getNotificationManager().areNotificationsEnabled() || item.getForceShowWidget()) {
            this.containerView.bind$common_prodGoogleAllVendorsRelease(item, getNotificationManager().areNotificationsEnabled(), this.actionHandler);
            this.viewModel.onViewIntent(new NotificationSubscriptionBannerV3ViewModel.ViewIntent.OnNewState(item));
            return;
        }
        this.viewModel.onViewIntent(new NotificationSubscriptionBannerV3ViewModel.ViewIntent.OnNewState(item));
        AtomAction alreadySubscribedAction = item.getAlreadySubscribedAction();
        AtomAction.ComposerAction composerAction = alreadySubscribedAction instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) alreadySubscribedAction : null;
        if (composerAction != null) {
            this.viewModel.onViewIntent(new NotificationSubscriptionBannerV3ViewModel.ViewIntent.OnRemoveAlreadySubscribedWidget(composerAction));
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull NotificationSubscriptionBannerV3VI item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            m.c(this.tokenizedAnalytics, viewEvent, null);
        }
    }
}
