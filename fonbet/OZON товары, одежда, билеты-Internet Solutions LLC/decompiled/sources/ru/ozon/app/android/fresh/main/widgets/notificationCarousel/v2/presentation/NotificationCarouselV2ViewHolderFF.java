package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation;

import AK.a;
import Ae.C2399j;
import Ae.C2408n0;
import Sc.InterfaceC4008j;
import Vg.d;
import WZ.l;
import android.os.Parcelable;
import android.view.View;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.NotificationCarouselV2Adapter;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.NotificationCarouselV2ItemDecorator;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.RecyclerViewItemsAppearanceTracker;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.viewHolders.NotificationCarouselV2BaseItemViewHolder;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 :2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001:B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u001b\u0010\u001c\u001a\u00020\u0012*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u0016J\u000f\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\"\u001a\u00060 j\u0002`!H\u0014¢\u0006\u0004\b\u0013\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00120&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R%\u00106\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u000301008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2ViewHolderFF;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2ViewModelFF;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2ViewModelFF;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;LVg/d;)V", "item", "", "bind", "(Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;)V", "subscribeToWidgetUpdates", "()V", "unsubscribeFromWidgetUpdates", "saveRecyclerViewState", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$PaddingsVO;", "Landroid/view/View;", "view", "applyTo", "(Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$PaddingsVO;Landroid/view/View;)V", "onAttach", "onDetach", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "(Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;Ll20/d;)V", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2ViewModelFF;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/NotificationCarouselV2Adapter;", "notificationAdapter", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/NotificationCarouselV2Adapter;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/NotificationCarouselV2ItemDecorator;", "itemDecorator", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/NotificationCarouselV2ItemDecorator;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/RecyclerViewItemsAppearanceTracker;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/viewHolders/NotificationCarouselV2BaseItemViewHolder;", "itemsAppearanceTracker$delegate", "LSc/j;", "getItemsAppearanceTracker", "()Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/RecyclerViewItemsAppearanceTracker;", "itemsAppearanceTracker", "Lxe/B0;", "widgetUpdatesCollector", "Lxe/B0;", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotificationCarouselV2ViewHolderFF extends k<NotificationCarouselV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final NotificationCarouselV2ItemDecorator itemDecorator;

    /* renamed from: itemsAppearanceTracker$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j itemsAppearanceTracker;

    @NotNull
    private final NotificationCarouselV2Adapter notificationAdapter;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final NotificationCarouselV2ViewModelFF viewModel;
    private B0 widgetUpdatesCollector;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationCarouselV2ViewHolderFF(@NotNull RecyclerView recyclerView, @NotNull NotificationCarouselV2ViewModelFF viewModel, @NotNull ComposerReferences composerReferences, @NotNull l tokenizedAnalytics, @NotNull d customActionHandlersStoreFactory) {
        super(recyclerView);
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.recyclerView = recyclerView;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).customActionHandlers(new NotificationCarouselV2ViewHolderFF$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        NotificationCarouselV2Adapter notificationCarouselV2Adapter = new NotificationCarouselV2Adapter(new NotificationCarouselV2ViewHolderFF$notificationAdapter$1(tokenizedAnalytics, this), new NotificationCarouselV2ViewHolderFF$notificationAdapter$2(tokenizedAnalytics));
        this.notificationAdapter = notificationCarouselV2Adapter;
        NotificationCarouselV2ItemDecorator notificationCarouselV2ItemDecorator = new NotificationCarouselV2ItemDecorator(0);
        this.itemDecorator = notificationCarouselV2ItemDecorator;
        this.itemsAppearanceTracker = Sc.k.b(new NotificationCarouselV2ViewHolderFF$itemsAppearanceTracker$2(this));
        recyclerView.setAdapter(notificationCarouselV2Adapter);
        recyclerView.addItemDecoration(notificationCarouselV2ItemDecorator);
        recyclerView.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.NotificationCarouselV2ViewHolderFF$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                if (newState == 0) {
                    NotificationCarouselV2ViewHolderFF.this.saveRecyclerViewState();
                }
            }
        });
    }

    private final void applyTo(NotificationCarouselV2VO.PaddingsVO paddingsVO, View view) {
        int horizontalPadding = paddingsVO.getHorizontalPadding();
        view.setPaddingRelative(horizontalPadding, paddingsVO.getTopPadding(), horizontalPadding, paddingsVO.getBottomPadding());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1(NotificationCarouselV2VO notificationCarouselV2VO, NotificationCarouselV2ViewHolderFF notificationCarouselV2ViewHolderFF) {
        if (notificationCarouselV2VO.getLayoutManagerState() != null) {
            RecyclerView.o layoutManager = notificationCarouselV2ViewHolderFF.recyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.onRestoreInstanceState(notificationCarouselV2VO.getLayoutManagerState());
                return;
            }
            return;
        }
        RecyclerView.o layoutManager2 = notificationCarouselV2ViewHolderFF.recyclerView.getLayoutManager();
        if (layoutManager2 != null) {
            layoutManager2.scrollToPosition(0);
        }
    }

    private final RecyclerViewItemsAppearanceTracker<NotificationCarouselV2BaseItemViewHolder<?>> getItemsAppearanceTracker() {
        return (RecyclerViewItemsAppearanceTracker) this.itemsAppearanceTracker.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveRecyclerViewState() {
        Parcelable onSaveInstanceState;
        RecyclerView.o layoutManager = this.recyclerView.getLayoutManager();
        if (layoutManager == null || (onSaveInstanceState = layoutManager.onSaveInstanceState()) == null) {
            return;
        }
        this.viewModel.saveRecyclerViewState(onSaveInstanceState);
    }

    private final void subscribeToWidgetUpdates() {
        unsubscribeFromWidgetUpdates();
        this.widgetUpdatesCollector = C2399j.C(new C2408n0(C5427n.a(this.viewModel.getWidgetUpdates(), getLifecycle(), AbstractC5434v.b.STARTED), new NotificationCarouselV2ViewHolderFF$subscribeToWidgetUpdates$1(this)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object subscribeToWidgetUpdates$bind(NotificationCarouselV2ViewHolderFF notificationCarouselV2ViewHolderFF, NotificationCarouselV2VO notificationCarouselV2VO, kotlin.coroutines.d dVar) {
        notificationCarouselV2ViewHolderFF.bind(notificationCarouselV2VO);
        return Unit.f71690a;
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
        subscribeToWidgetUpdates();
        getItemsAppearanceTracker().startItemTracking();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        getItemsAppearanceTracker().stopItemTracking();
        unsubscribeFromWidgetUpdates();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull NotificationCarouselV2VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        NotificationCarouselV2VO currentWidgetState = this.viewModel.getCurrentWidgetState();
        if (currentWidgetState != null) {
            bind(currentWidgetState);
        }
        this.viewModel.trySetNewState(item, info);
    }

    private final void bind(NotificationCarouselV2VO item) {
        applyTo(item.getPaddings(), this.recyclerView);
        this.itemDecorator.setGapSize(item.getPaddings().getBetweenPadding());
        this.notificationAdapter.submitList(item.getItems(), new a(1, item, this));
    }
}
