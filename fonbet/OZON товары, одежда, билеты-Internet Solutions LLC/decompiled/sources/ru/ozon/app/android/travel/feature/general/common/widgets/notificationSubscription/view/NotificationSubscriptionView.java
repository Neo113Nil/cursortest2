package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.view;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation.NotificationSubscriptionVO;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000f2\u001a\u0010\u0011\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u0012J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u000bJ\u0006\u0010\u0017\u001a\u00020\u000bJ\u0006\u0010\u0018\u001a\u00020\u000bJ\u0006\u0010\u0019\u001a\u00020\u000bJ\b\u0010\u001a\u001a\u00020\u000bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/view/NotificationSubscriptionView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "contentView", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/view/NotificationSubscriptionContentView;", "loadingView", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/view/NotificationSubscriptionLoadingView;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO$Loaded;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "stateChangeListener", "Lkotlin/Function2;", "", "bindCheckbox", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "showContent", "hideContent", "showLoading", "hideLoading", "addChildren", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationSubscriptionView extends FrameLayout {
    public static final int $stable = (RoundedShimmerView.$stable | TextAtomV2View.$stable) | CheckBoxView.$stable;

    @NotNull
    private final NotificationSubscriptionContentView contentView;

    @NotNull
    private final NotificationSubscriptionLoadingView loadingView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSubscriptionView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        NotificationSubscriptionContentView notificationSubscriptionContentView = new NotificationSubscriptionContentView(context);
        notificationSubscriptionContentView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.contentView = notificationSubscriptionContentView;
        NotificationSubscriptionLoadingView notificationSubscriptionLoadingView = new NotificationSubscriptionLoadingView(context);
        notificationSubscriptionLoadingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.loadingView = notificationSubscriptionLoadingView;
        addChildren();
    }

    private final void addChildren() {
        addView(this.contentView);
        addView(this.loadingView);
    }

    public final void bind(@NotNull NotificationSubscriptionVO.Loaded item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function2<? super AtomAction, ? super Boolean, Unit> stateChangeListener) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(stateChangeListener, "stateChangeListener");
        this.contentView.bind(item, actionHandler, stateChangeListener);
    }

    public final void bindCheckbox(@NotNull CheckBoxDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.contentView.bindCheckbox(item);
    }

    public final void hideContent() {
        ViewExtKt.gone(this.contentView);
    }

    public final void hideLoading() {
        ViewExtKt.gone(this.loadingView);
    }

    public final void showContent() {
        ViewExtKt.show(this.contentView);
    }

    public final void showLoading() {
        ViewExtKt.show(this.loadingView);
    }
}
