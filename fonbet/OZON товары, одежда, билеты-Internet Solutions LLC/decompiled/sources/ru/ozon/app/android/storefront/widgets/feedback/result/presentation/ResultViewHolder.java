package ru.ozon.app.android.storefront.widgets.feedback.result.presentation;

import Vg.c;
import WZ.t;
import a00.C4911f;
import android.content.Context;
import android.view.View;
import androidx.activity.J;
import androidx.activity.L;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.storefront.widgets.feedback.common.presentation.FeedbackNavbarBinder;
import ru.ozon.app.android.storefront.widgets.feedback.result.presentation.adapter.ResultAdapter;
import ru.ozon.app.android.storefront.widgets.feedback.result.presentation.adapter.ResultAdapterDecoration;
import ru.ozon.app.android.storefront.widgets.feedback.result.presentation.model.ResultVO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\f0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/ResultViewHolder;", "Ld20/b;", "Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/model/ResultVO;", "Ll10/i;", "container", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "<init>", "(Ll10/i;LVg/c;)V", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "", "setupBackPress", "(La00/f;)V", "item", "bind", "(Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/model/ResultVO;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/model/ResultVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onWidgetDestroyed", "()V", "Ll10/i;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/adapter/ResultAdapterDecoration;", "decorator", "Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/adapter/ResultAdapterDecoration;", "Lru/ozon/uni/atoms/af/AtomAction;", "backAction", "Lru/ozon/uni/atoms/af/AtomAction;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/storefront/widgets/feedback/common/presentation/FeedbackNavbarBinder;", "feedbackNavbarBinder", "Lru/ozon/app/android/storefront/widgets/feedback/common/presentation/FeedbackNavbarBinder;", "Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/adapter/ResultAdapter;", "holderAdapter", "Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/adapter/ResultAdapter;", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ResultViewHolder extends AbstractC6065b<ResultVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private AtomAction backAction;

    @NotNull
    private final i container;

    @NotNull
    private final ResultAdapterDecoration decorator;

    @NotNull
    private final FeedbackNavbarBinder feedbackNavbarBinder;

    @NotNull
    private final ResultAdapter holderAdapter;
    private final View metricView;

    public ResultViewHolder(@NotNull i container, @NotNull c customActionHandlersStore) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        this.container = container;
        this.metricView = getRecyclerView();
        ResultAdapterDecoration resultAdapterDecoration = new ResultAdapterDecoration();
        this.decorator = resultAdapterDecoration;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(container, this).customActionHandlers(new ResultViewHolder$actionHandler$1(customActionHandlersStore)).buildHandler();
        this.actionHandler = buildHandler;
        ComponentCallbacksC5392m c11 = container.Q().c();
        Context L11 = container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        this.feedbackNavbarBinder = new FeedbackNavbarBinder(c11, L11, buildHandler, ComposerViewExtensionKt.composerToolbar(container.Y()));
        Context L12 = container.L();
        Intrinsics.checkNotNullExpressionValue(L12, "<get-context>(...)");
        ResultAdapter resultAdapter = new ResultAdapter(L12, new ResultViewHolder$holderAdapter$1(buildHandler));
        this.holderAdapter = resultAdapter;
        RecyclerView recyclerView = getRecyclerView();
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(resultAdapter);
        recyclerView.addItemDecoration(resultAdapterDecoration);
        setupBackPress(container.Q());
    }

    private final RecyclerView getRecyclerView() {
        return ComposerViewExtensionKt.composerRecyclerView(this.container.Y());
    }

    private final void setupBackPress(C4911f container) {
        J onBackPressedDispatcher;
        r a11 = container.a();
        if (a11 == null || (onBackPressedDispatcher = a11.getOnBackPressedDispatcher()) == null) {
            return;
        }
        L.a(onBackPressedDispatcher, container.f(), new ResultViewHolder$setupBackPress$1(this), 2);
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
    public void bind(@NotNull ResultVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.feedbackNavbarBinder.bindNavbar(item.getNavbar());
        this.holderAdapter.submitList(item.getBody());
        this.backAction = item.getFinalAction();
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull ResultVO item, @NotNull W10.c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.container.X(), tokenizedEvent, null, 2, null);
        }
    }
}
