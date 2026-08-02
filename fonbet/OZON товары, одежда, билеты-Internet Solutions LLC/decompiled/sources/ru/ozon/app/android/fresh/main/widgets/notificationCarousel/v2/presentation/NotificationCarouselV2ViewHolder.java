package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import Vg.d;
import WZ.l;
import android.view.View;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewHolder;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.NotificationCarouselV2UpdatePayload;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.NotificationCarouselV2Adapter;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.NotificationCarouselV2ItemDecorator;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.RecyclerViewItemsAppearanceTracker;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.viewHolders.NotificationCarouselV2BaseItemViewHolder;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u0011*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0013J#\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001c2\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\u001e\u0010\"J\u000f\u0010#\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0018\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010'R\u001b\u0010-\u001a\u00020(8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R%\u00103\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030/0.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b1\u00102R \u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0011048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2ViewHolder;", "Lru/ozon/app/android/fresh/common/widgets/horizontalListWidget/AbstractHorizontalListViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2ViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2ViewModel;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;LVg/d;)V", "", "unsubscribeFromWidgetUpdates", "()V", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$PaddingsVO;", "Landroid/view/View;", "view", "applyTo", "(Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$PaddingsVO;Landroid/view/View;)V", "onAttach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;Ll20/d;Ljava/lang/Object;)V", "onDetach", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2ViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "LVg/d;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/NotificationCarouselV2Adapter;", "adapter$delegate", "LSc/j;", "getAdapter", "()Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/NotificationCarouselV2Adapter;", "adapter", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/RecyclerViewItemsAppearanceTracker;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/viewHolders/NotificationCarouselV2BaseItemViewHolder;", "itemsAppearanceTracker$delegate", "getItemsAppearanceTracker", "()Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/RecyclerViewItemsAppearanceTracker;", "itemsAppearanceTracker", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/NotificationCarouselV2ItemDecorator;", "itemDecorator", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/NotificationCarouselV2ItemDecorator;", "Lxe/B0;", "widgetUpdatesCollector", "Lxe/B0;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotificationCarouselV2ViewHolder extends AbstractHorizontalListViewHolder<NotificationCarouselV2VO, NotificationCarouselV2VO.NotificationCarouselItemVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j adapter;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final NotificationCarouselV2ItemDecorator itemDecorator;

    /* renamed from: itemsAppearanceTracker$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j itemsAppearanceTracker;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final NotificationCarouselV2ViewModel viewModel;
    private B0 widgetUpdatesCollector;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationCarouselV2ViewHolder(@NotNull RecyclerView recyclerView, @NotNull NotificationCarouselV2ViewModel viewModel, @NotNull ComposerReferences composerReferences, @NotNull l tokenizedAnalytics, @NotNull d customActionHandlersStoreFactory) {
        super(recyclerView, composerReferences);
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.recyclerView = recyclerView;
        this.viewModel = viewModel;
        this.composerReferences = composerReferences;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.adapter = k.b(new NotificationCarouselV2ViewHolder$adapter$2(tokenizedAnalytics, this));
        this.itemsAppearanceTracker = k.b(new NotificationCarouselV2ViewHolder$itemsAppearanceTracker$2(this));
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).customActionHandlers(new NotificationCarouselV2ViewHolder$actionHandler$1(this)).buildHandler();
        NotificationCarouselV2ItemDecorator notificationCarouselV2ItemDecorator = new NotificationCarouselV2ItemDecorator(0);
        this.itemDecorator = notificationCarouselV2ItemDecorator;
        recyclerView.setAdapter(getAdapter());
        recyclerView.addItemDecoration(notificationCarouselV2ItemDecorator);
    }

    private final void applyTo(NotificationCarouselV2VO.PaddingsVO paddingsVO, View view) {
        view.setPaddingRelative(paddingsVO.getHorizontalPadding(), paddingsVO.getTopPadding(), paddingsVO.getHorizontalPadding(), paddingsVO.getBottomPadding());
    }

    private final RecyclerViewItemsAppearanceTracker<NotificationCarouselV2BaseItemViewHolder<?>> getItemsAppearanceTracker() {
        return (RecyclerViewItemsAppearanceTracker) this.itemsAppearanceTracker.getValue();
    }

    private final void unsubscribeFromWidgetUpdates() {
        B0 b02 = this.widgetUpdatesCollector;
        if (b02 != null) {
            b02.j(null);
        }
        this.widgetUpdatesCollector = null;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        unsubscribeFromWidgetUpdates();
        this.widgetUpdatesCollector = C2399j.C(new C2408n0(C5427n.a(this.viewModel.getWidgetUpdates(), getLifecycle(), AbstractC5434v.b.STARTED), new NotificationCarouselV2ViewHolder$onAttach$1(this, null)), K.a(this));
        getItemsAppearanceTracker().startItemTracking();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        getItemsAppearanceTracker().stopItemTracking();
        unsubscribeFromWidgetUpdates();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewHolder
    @NotNull
    public t<NotificationCarouselV2VO.NotificationCarouselItemVO, ?> getAdapter() {
        return (NotificationCarouselV2Adapter) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull NotificationCarouselV2VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bind(item, info, (Object) C7714v.b0(NotificationCarouselV2UpdatePayload.PaddingsChanged.INSTANCE, NotificationCarouselV2UpdatePayload.ItemsChanged.INSTANCE, NotificationCarouselV2UpdatePayload.ScheduleTimeChanged.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull NotificationCarouselV2VO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        List list = payload instanceof List ? (List) payload : null;
        if (list == null) {
            return;
        }
        for (Object obj : list) {
            NotificationCarouselV2UpdatePayload notificationCarouselV2UpdatePayload = obj instanceof NotificationCarouselV2UpdatePayload ? (NotificationCarouselV2UpdatePayload) obj : null;
            if (notificationCarouselV2UpdatePayload != null) {
                if (notificationCarouselV2UpdatePayload.equals(NotificationCarouselV2UpdatePayload.RemoveWidget.INSTANCE)) {
                    this.viewModel.onCleared();
                    InterfaceC7851b.a.e(this.composerReferences.getController(), null, null, null, 7);
                } else if (notificationCarouselV2UpdatePayload.equals(NotificationCarouselV2UpdatePayload.PaddingsChanged.INSTANCE)) {
                    this.itemDecorator.setGapSize(item.getPaddings().getBetweenPadding());
                    applyTo(item.getPaddings(), this.recyclerView);
                    this.recyclerView.invalidateItemDecorations();
                } else if (notificationCarouselV2UpdatePayload.equals(NotificationCarouselV2UpdatePayload.ItemsChanged.INSTANCE)) {
                    submitList(item.getItems(), item.getLayoutManagerState(), new NotificationCarouselV2ViewHolder$bind$1$1(this));
                } else if (notificationCarouselV2UpdatePayload.equals(NotificationCarouselV2UpdatePayload.ScheduleTimeChanged.INSTANCE)) {
                    this.viewModel.scheduleUpdate(info, item);
                } else {
                    throw new o();
                }
            }
        }
    }
}
