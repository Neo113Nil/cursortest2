package ru.ozon.app.android.marketing.widgets.actionProgress.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Fy.ViewOnLayoutChangeListenerC3067e;
import T00.m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import d20.AbstractC6065b;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import m10.C8042d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.marketing.R$dimen;
import ru.ozon.app.android.marketing.R$layout;
import ru.ozon.app.android.marketing.databinding.WidgetActionProgressBinding;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.core.HighlightsWrapperStateManager;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsCurrentMiniWidget;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import xe.B0;

@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u00015\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u0013*\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u0010J\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u0010J\u000f\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u0010J\u000f\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u0010J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010,\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/ActionProgressOverlayViewHolder;", "Ld20/b;", "Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/ActionProgressVO;", "Ll10/i;", "container", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperStateManager;", "stateManager", "<init>", "(Ll10/i;Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperStateManager;)V", "", "widgetAsyncData", "Lxe/B0;", "observeMiniWidgetState", "(Ljava/lang/String;)Lxe/B0;", "", "updatePositionAndVisibility", "()V", "Landroid/view/View;", "stickyPlaceholder", "", "visibleHeight", "(Landroid/view/View;Landroid/view/View;)F", "", "isOriginalActionProgressOutOfBounds", "()Z", "", "findFirstVisiblePosition", "()I", "onWidgetCreated", "onWidgetDestroyed", "addView", "removeView", "item", "bind", "(Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/ActionProgressVO;)V", "Ll10/i;", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperStateManager;", "Landroid/view/ViewGroup;", "rootView", "Landroid/view/ViewGroup;", "Landroidx/recyclerview/widget/g;", "recyclerView", "Landroidx/recyclerview/widget/g;", "view", "Landroid/view/View;", "Lru/ozon/app/android/marketing/databinding/WidgetActionProgressBinding;", "binding", "Lru/ozon/app/android/marketing/databinding/WidgetActionProgressBinding;", "Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/ActionProgressBinder;", "actionProgressBinder", "Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/ActionProgressBinder;", "observeAsyncStateJob", "Lxe/B0;", "ru/ozon/app/android/marketing/widgets/actionProgress/presentation/ActionProgressOverlayViewHolder$scrollListener$1", "scrollListener", "Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/ActionProgressOverlayViewHolder$scrollListener$1;", "Landroid/view/View$OnLayoutChangeListener;", "layoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "metricView", "getMetricView", "()Landroid/view/View;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ActionProgressOverlayViewHolder extends AbstractC6065b<ActionProgressVO> {

    @NotNull
    private final ActionProgressBinder actionProgressBinder;

    @NotNull
    private final WidgetActionProgressBinding binding;

    @NotNull
    private final i container;

    @NotNull
    private final View.OnLayoutChangeListener layoutChangeListener;

    @NotNull
    private final View metricView;
    private B0 observeAsyncStateJob;

    @NotNull
    private final g recyclerView;

    @NotNull
    private final ViewGroup rootView;

    @NotNull
    private final ActionProgressOverlayViewHolder$scrollListener$1 scrollListener;

    @NotNull
    private final HighlightsWrapperStateManager stateManager;

    @NotNull
    private final View view;

    /* JADX WARN: Type inference failed for: r4v9, types: [ru.ozon.app.android.marketing.widgets.actionProgress.presentation.ActionProgressOverlayViewHolder$scrollListener$1] */
    public ActionProgressOverlayViewHolder(@NotNull i container, @NotNull HighlightsWrapperStateManager stateManager) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(stateManager, "stateManager");
        this.container = container;
        this.stateManager = stateManager;
        ViewGroup Z11 = container.Z();
        this.rootView = Z11;
        this.recyclerView = container.e0();
        View inflate = LayoutInflater.from(Z11.getContext()).inflate(R$layout.widget_action_progress, Z11, false);
        inflate.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        inflate.setVisibility(8);
        Intrinsics.checkNotNullExpressionValue(inflate.getContext(), "getContext(...)");
        inflate.setTranslationZ(ResourceExtKt.dim(r4, R$dimen.mini_widget_margin));
        Intrinsics.checkNotNullExpressionValue(inflate, "apply(...)");
        this.view = inflate;
        WidgetActionProgressBinding bind = WidgetActionProgressBinding.bind(inflate);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        ActionProgressBinder actionProgressBinder = new ActionProgressBinder(bind, (CardView) inflate);
        actionProgressBinder.setIsMiniWidget();
        this.actionProgressBinder = actionProgressBinder;
        this.scrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.marketing.widgets.actionProgress.presentation.ActionProgressOverlayViewHolder$scrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                ActionProgressOverlayViewHolder.this.updatePositionAndVisibility();
            }
        };
        this.layoutChangeListener = new ViewOnLayoutChangeListenerC3067e(this, 2);
        this.metricView = inflate;
    }

    private final int findFirstVisiblePosition() {
        View findChildViewUnder = this.recyclerView.findChildViewUnder((r0.getRight() - this.recyclerView.getLeft()) / 2, this.recyclerView.getTop());
        if (findChildViewUnder != null) {
            return this.recyclerView.getChildAdapterPosition(findChildViewUnder);
        }
        RecyclerView.o layoutManager = this.recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            return linearLayoutManager.findFirstVisibleItemPosition();
        }
        return 0;
    }

    private final boolean isOriginalActionProgressOutOfBounds() {
        int i11;
        RecyclerView.g adapter = this.recyclerView.getAdapter();
        C8042d c8042d = adapter instanceof C8042d ? (C8042d) adapter : null;
        if (c8042d == null) {
            return false;
        }
        List<l> g10 = c8042d.g();
        ListIterator<l> listIterator = g10.listIterator(g10.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i11 = -1;
                break;
            }
            if (listIterator.previous().d() instanceof ActionProgressVO) {
                i11 = listIterator.nextIndex();
                break;
            }
        }
        return i11 != -1 && findFirstVisiblePosition() > i11;
    }

    private final B0 observeMiniWidgetState(String widgetAsyncData) {
        return C2399j.C(new C2408n0(C2399j.o(this.stateManager.listenState(widgetAsyncData)), new ActionProgressOverlayViewHolder$observeMiniWidgetState$1(this, null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePositionAndVisibility() {
        View findViewById = this.rootView.findViewById(R.id.stickyPlaceholder);
        View findViewById2 = this.rootView.findViewById(R.id.stickyContainer);
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        this.view.setY((findViewById != null ? findViewById.getY() : 0.0f) + visibleHeight(findViewById2, findViewById) + ((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r2.topMargin : 0));
        View view = this.view;
        ActionProgressVO boundData = getBoundData();
        view.setVisibility((boundData != null ? boundData.getCurrentMiniWidget() : null) == HighlightsCurrentMiniWidget.ACTION_PROGRESS && isOriginalActionProgressOutOfBounds() ? 0 : 8);
    }

    private final float visibleHeight(View view, View view2) {
        if (view != null) {
            return Math.max(0.0f, view.getTranslationY() + view.getBottom());
        }
        if (view2 != null) {
            return view2.getHeight();
        }
        return 0.0f;
    }

    @Override // d20.AbstractC6065b
    public void addView() {
        if (this.view.getParent() == null) {
            this.rootView.addView(this.view);
        }
        updatePositionAndVisibility();
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        this.recyclerView.addOnScrollListener(this.scrollListener);
        View findViewById = this.rootView.findViewById(R.id.stickyPlaceholder);
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(this.layoutChangeListener);
        }
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        this.recyclerView.removeOnScrollListener(this.scrollListener);
        View findViewById = this.rootView.findViewById(R.id.stickyPlaceholder);
        if (findViewById != null) {
            findViewById.removeOnLayoutChangeListener(this.layoutChangeListener);
        }
    }

    @Override // d20.AbstractC6065b
    public void removeView() {
        this.rootView.removeView(this.view);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ActionProgressVO item) {
        d c11;
        m c12;
        B0 b02;
        Intrinsics.checkNotNullParameter(item, "item");
        B0 b03 = this.observeAsyncStateJob;
        if (b03 == null || ((b03 != null && b03.isCancelled()) || ((b02 = this.observeAsyncStateJob) != null && b02.l0()))) {
            l viewItem = getViewItem();
            this.observeAsyncStateJob = observeMiniWidgetState((viewItem == null || (c11 = viewItem.c()) == null || (c12 = c11.c()) == null) ? null : c12.a());
        }
        this.actionProgressBinder.bind(item);
        updatePositionAndVisibility();
    }
}
