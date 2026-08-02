package ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation;

import Vg.c;
import WZ.t;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.storefront.widgets.feedback.common.presentation.FeedbackNavbarBinder;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.core.RateListUpdateEvent;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateVO;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.RateAdapter;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.RateHeaderAdapterDecorator;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.RateHolderFactory;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\r0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\r0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\f\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/RateViewHolder;", "Ld20/b;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateVO;", "Ll10/i;", "container", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/RateViewModel;", "viewModel", "LVg/c;", "customActionHandlersStore", "<init>", "(Ll10/i;Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/RateViewModel;LVg/c;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "changeRecyclerViewBackgroundColor", "(Landroidx/recyclerview/widget/RecyclerView;)V", "item", "bind", "(Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateVO;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onWidgetDestroyed", "()V", "Ll10/i;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/RateViewModel;", "LVg/c;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "", "isListBind", "Z", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "checkboxActionHandler", "Lkotlin/jvm/functions/Function1;", "actionHandler", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/RateHeaderAdapterDecorator;", "decorator", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/RateHeaderAdapterDecorator;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/RateHolderFactory;", "rateHolderFactory", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/RateHolderFactory;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/RateAdapter;", "holderAdapter", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/RateAdapter;", "Lru/ozon/app/android/storefront/widgets/feedback/common/presentation/FeedbackNavbarBinder;", "feedbackNavbarBinder", "Lru/ozon/app/android/storefront/widgets/feedback/common/presentation/FeedbackNavbarBinder;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RateViewHolder extends AbstractC6065b<RateVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Function1<AtomAction, Unit> checkboxActionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final c customActionHandlersStore;

    @NotNull
    private final RateHeaderAdapterDecorator decorator;

    @NotNull
    private final FeedbackNavbarBinder feedbackNavbarBinder;

    @NotNull
    private final RateAdapter holderAdapter;
    private boolean isListBind;
    private final View metricView;

    @NotNull
    private final RateHolderFactory rateHolderFactory;

    @NotNull
    private final RateViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "newList", "", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/util/List;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.RateViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<List<? extends RateSection>, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RateSection> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends RateSection> list) {
            if (RateViewHolder.this.isListBind) {
                InterfaceC7851b M11 = RateViewHolder.this.container.M();
                Intrinsics.f(list);
                M11.update(new RateListUpdateEvent(list));
            }
        }
    }

    public RateViewHolder(@NotNull i container, @NotNull RateViewModel viewModel, @NotNull c customActionHandlersStore) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        this.container = container;
        this.viewModel = viewModel;
        this.customActionHandlersStore = customActionHandlersStore;
        this.metricView = container.Y();
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(container, this).onClick(new RateViewHolder$checkboxActionHandler$1(this)).buildHandler();
        this.checkboxActionHandler = buildHandler;
        Function1<AtomAction, Unit> buildHandler2 = new ActionHandler.Builder(container, this).customActionHandlers(new RateViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler2;
        RateHeaderAdapterDecorator rateHeaderAdapterDecorator = new RateHeaderAdapterDecorator();
        this.decorator = rateHeaderAdapterDecorator;
        Context L11 = container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        RateHolderFactory rateHolderFactory = new RateHolderFactory(L11, buildHandler, new RateViewHolder$rateHolderFactory$1(this));
        this.rateHolderFactory = rateHolderFactory;
        RateAdapter rateAdapter = new RateAdapter(rateHolderFactory);
        this.holderAdapter = rateAdapter;
        ComponentCallbacksC5392m c11 = container.Q().c();
        Context L12 = container.L();
        Intrinsics.checkNotNullExpressionValue(L12, "<get-context>(...)");
        this.feedbackNavbarBinder = new FeedbackNavbarBinder(c11, L12, buildHandler2, ComposerViewExtensionKt.composerToolbar(container.Y()));
        RecyclerView recyclerView = getRecyclerView();
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(rateAdapter);
        recyclerView.addItemDecoration(rateHeaderAdapterDecorator);
        viewModel.getNewList().observe(container.Q().g(), new RateViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass2()));
    }

    private final void changeRecyclerViewBackgroundColor(RecyclerView recyclerView) {
        if (recyclerView == null) {
            return;
        }
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
    }

    private final RecyclerView getRecyclerView() {
        return ComposerViewExtensionKt.composerRecyclerView(this.container.Y());
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        getRecyclerView().removeAllViews();
        getRecyclerView().removeItemDecoration(this.decorator);
        this.feedbackNavbarBinder.removeViews();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull RateVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getIsSelect()) {
            changeRecyclerViewBackgroundColor(getRecyclerView());
        }
        this.feedbackNavbarBinder.bindNavbar(item.getNavbar());
        this.holderAdapter.submitList(item.getSections());
        this.viewModel.onBindList(item.getSections());
        this.isListBind = true;
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull RateVO item, @NotNull W10.c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.container.X(), tokenizedEvent, null, 2, null);
        }
    }
}
