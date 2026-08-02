package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import W10.c;
import WZ.l;
import WZ.t;
import android.os.Parcelable;
import android.view.View;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.PreviewItemListAdapter;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001)\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000f0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u0004\u0018\u00010/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2WidgetVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO;", "Landroid/view/View;", "view", "Ll10/i;", "container", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/PreviewItemListAdapter$Factory;", "adapterFactory", "<init>", "(Landroid/view/View;Ll10/i;LWZ/l;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/PreviewItemListAdapter$Factory;)V", "Landroidx/lifecycle/J;", "lifecycle", "", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO;Ll20/d;)V", "onDetach", "()V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroid/view/View;", "Ll10/i;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/PreviewItemListAdapter;", "itemsAdapter", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/PreviewItemListAdapter;", "ru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2WidgetVH$scrollListener$1", "scrollListener", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2WidgetVH$scrollListener$1;", "Landroidx/recyclerview/widget/RecyclerView;", "itemsRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewViewModel;", "getViewModel", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewViewModel;", "viewModel", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryPreviewV2WidgetVH extends k<ReviewGalleryPreviewV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final PreviewItemListAdapter itemsAdapter;

    @NotNull
    private final RecyclerView itemsRecycler;

    @NotNull
    private final ReviewGalleryPreviewV2WidgetVH$scrollListener$1 scrollListener;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.recyclerview.widget.RecyclerView$t, ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewV2WidgetVH$scrollListener$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ReviewGalleryPreviewV2WidgetVH(@NotNull View view, @NotNull i container, @NotNull l tokenizedAnalytics, @NotNull PreviewItemListAdapter.Factory adapterFactory) {
        super(view);
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        this.view = view;
        this.container = container;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
        PreviewItemListAdapter create = adapterFactory.create(this);
        this.itemsAdapter = create;
        ?? r42 = new RecyclerView.t() { // from class: ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewV2WidgetVH$scrollListener$1
            /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
            
                r2 = r0.this$0.getViewModel();
             */
            @Override // androidx.recyclerview.widget.RecyclerView.t
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onScrolled(RecyclerView recyclerView2, int dx, int dy) {
                ReviewGalleryPreviewViewModel viewModel;
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                RecyclerView.o layoutManager = recyclerView2.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager == null) {
                    return;
                }
                int itemCount = linearLayoutManager.getItemCount();
                if (dx <= 0 || itemCount <= 0 || viewModel == null) {
                    return;
                }
                viewModel.loadNextItemsIfNeed(linearLayoutManager.findLastVisibleItemPosition(), itemCount - 1);
            }
        };
        this.scrollListener = r42;
        ReviewGalleryPreviewView reviewGalleryPreviewView = view instanceof ReviewGalleryPreviewView ? (ReviewGalleryPreviewView) view : null;
        if (reviewGalleryPreviewView != null) {
            RecyclerView itemsRecycler = reviewGalleryPreviewView.getItemsRecycler();
            recyclerView = itemsRecycler;
        }
        Intrinsics.g(view, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        recyclerView = (RecyclerView) view;
        this.itemsRecycler = recyclerView;
        recyclerView.setAdapter(create);
        recyclerView.addOnScrollListener(r42);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReviewGalleryPreviewViewModel getViewModel() {
        return (ReviewGalleryPreviewViewModel) getWidgetViewModel();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Parcelable scrollState;
        RecyclerView.o layoutManager;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        C10727i.c(K.a(lifecycle), null, null, new ReviewGalleryPreviewV2WidgetVH$onAttachViewModel$1(this, null), 3);
        C2399j.C(new C2408n0(this.container.M().getEventsFlow(), new ReviewGalleryPreviewV2WidgetVH$onAttachViewModel$2(this, null)), K.a(lifecycle));
        ReviewGalleryPreviewViewModel viewModel = getViewModel();
        if (viewModel == null || (scrollState = viewModel.getScrollState()) == null || (layoutManager = this.itemsRecycler.getLayoutManager()) == null) {
            return;
        }
        layoutManager.onRestoreInstanceState(scrollState);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        Parcelable onSaveInstanceState;
        ReviewGalleryPreviewViewModel viewModel;
        super.onDetach();
        RecyclerView.o layoutManager = this.itemsRecycler.getLayoutManager();
        if (layoutManager == null || (onSaveInstanceState = layoutManager.onSaveInstanceState()) == null || (viewModel = getViewModel()) == null) {
            return;
        }
        viewModel.saveScrollState(onSaveInstanceState);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReviewGalleryPreviewV2VO item, @NotNull d info) {
        ReviewGalleryPreviewViewModel viewModel;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ReviewGalleryPreviewViewModel viewModel2 = getViewModel();
        if (viewModel2 != null && !viewModel2.getInitialized() && (viewModel = getViewModel()) != null) {
            viewModel.setupInitialData(item.getId(), item.getItems(), item.getNextItemsAction());
        }
        View view = this.view;
        ReviewGalleryPreviewView reviewGalleryPreviewView = view instanceof ReviewGalleryPreviewView ? (ReviewGalleryPreviewView) view : null;
        if (reviewGalleryPreviewView != null) {
            reviewGalleryPreviewView.bindShowMoreButton(item.getShowMore(), this.actionHandler);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ReviewGalleryPreviewV2VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
