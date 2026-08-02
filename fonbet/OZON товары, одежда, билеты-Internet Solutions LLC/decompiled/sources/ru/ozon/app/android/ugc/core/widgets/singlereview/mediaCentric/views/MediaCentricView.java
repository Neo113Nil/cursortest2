package ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views;

import B3.D;
import Sc.InterfaceC4008j;
import WZ.l;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProductTile.ReviewProductTileDTO;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.MarginItemDecoration;
import ru.ozon.app.android.pdp.utils.SnapOnScrollListener;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.ugc.core.databinding.ViewGalleryReviewProductV2Binding;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2ProductButtonBinder;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricVO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.common.gradient.OzGradientBlackOverlay2;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u009f\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\n*\u00017\b\u0001\u0018\u0000 T2\u00020\u0001:\u0001TB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJI\u0010\u0016\u001a\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010$\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0004\b$\u0010%J9\u0010(\u001a\u00020\u00122\u0006\u0010'\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00122\b\u0010*\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0012¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0012¢\u0006\u0004\b/\u0010.J\u0015\u00102\u001a\u00020\u00122\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u0012¢\u0006\u0004\b4\u0010.R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00105R$\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0017\u0010@\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010DR\u001b\u0010J\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\"0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001b\u0010P\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010G\u001a\u0004\bO\u0010\u001dR\u001b\u0010S\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010G\u001a\u0004\bR\u0010\u001a¨\u0006U"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricVideoViewHolder;", "getCurrentVideoViewHolder", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricVideoViewHolder;", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProductTile/ReviewProductTileDTO;", "products", "", "widgetId", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductButtonBinder;", "cartButtonBinder", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "tokenizedAnalytics", "bindProducts", "(Ljava/util/List;JLru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductButtonBinder;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "Landroid/view/View;", "createProductTileView", "()Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView;", "createProductsRecycler", "()Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricItemsAdapter;", "itemsAdapter", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/ReviewProductTileAdapter;", "productTilesAdapter", "", "onItemChange", "setupView", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricItemsAdapter;Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/ReviewProductTileAdapter;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO;", "item", "bind", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductButtonBinder;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "position", "setCurrentItem", "(Ljava/lang/Integer;)V", "restartVideoIfNeeded", "()V", "pauseVideoIfNeeded", "", "fromLifecycle", "resumeVideoIfNeeded", "(Z)V", "clear", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricItemsAdapter;", "Lkotlin/jvm/functions/Function1;", "ru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricView$viewPagerCallback$1", "viewPagerCallback", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricView$viewPagerCallback$1;", "Landroidx/viewpager2/widget/ViewPager2;", "mediaItemsViewPager", "Landroidx/viewpager2/widget/ViewPager2;", "topGradientView", "Landroid/view/View;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricProgressBar;", "progressBar", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricProgressBar;", "getProgressBar", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricProgressBar;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/ReviewProductTileAdapter;", "Landroidx/recyclerview/widget/x;", "snapHelper$delegate", "LSc/j;", "getSnapHelper", "()Landroidx/recyclerview/widget/x;", "snapHelper", "", "productViewsIds", "Ljava/util/Set;", "productTilesRecycler$delegate", "getProductTilesRecycler", "productTilesRecycler", "productTileView$delegate", "getProductTileView", "productTileView", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaCentricView extends FrameLayout {
    private MediaCentricItemsAdapter itemsAdapter;

    @NotNull
    private final ViewPager2 mediaItemsViewPager;
    private Function1<? super Integer, Unit> onItemChange;

    /* renamed from: productTileView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j productTileView;
    private ReviewProductTileAdapter productTilesAdapter;

    /* renamed from: productTilesRecycler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j productTilesRecycler;

    @NotNull
    private final Set<Integer> productViewsIds;

    @NotNull
    private final MediaCentricProgressBar progressBar;

    /* renamed from: snapHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j snapHelper;

    @NotNull
    private final View topGradientView;

    @NotNull
    private final MediaCentricView$viewPagerCallback$1 viewPagerCallback;
    public static final int $stable = 8;
    private static final int gradientHeight = ResourceExtKt.toPx(88);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.viewpager2.widget.ViewPager2$g, ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views.MediaCentricView$viewPagerCallback$1] */
    public MediaCentricView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ?? r02 = new ViewPager2.g() { // from class: ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views.MediaCentricView$viewPagerCallback$1
            private boolean isUserInitiated;

            @Override // androidx.viewpager2.widget.ViewPager2.g
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
                if (state == 0) {
                    this.isUserInitiated = false;
                } else {
                    if (state != 1) {
                        return;
                    }
                    this.isUserInitiated = true;
                }
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g
            public void onPageSelected(int position) {
                Function1 function1;
                if (this.isUserInitiated) {
                    MediaCentricView.this.getProgressBar().setCurrentProgressBar(position);
                    function1 = MediaCentricView.this.onItemChange;
                    if (function1 != null) {
                        function1.invoke(Integer.valueOf(position));
                    }
                }
            }
        };
        this.viewPagerCallback = r02;
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setId(R$id.mediaCentricItemsVp);
        viewPager2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        viewPager2.p(r02);
        viewPager2.v(1);
        this.mediaItemsViewPager = viewPager2;
        View view = new View(context);
        view.setId(R$id.mediaCentricTopGradient);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, gradientHeight));
        OzGradientBlackOverlay2 ozGradientBlackOverlay2 = new OzGradientBlackOverlay2();
        GradientDrawable b11 = D.b(0);
        b11.setOrientation(ozGradientBlackOverlay2.getOrientation());
        b11.setGradientType(0);
        b11.setColors(ozGradientBlackOverlay2.getColors(context));
        view.setBackground(b11);
        this.topGradientView = view;
        MediaCentricProgressBar mediaCentricProgressBar = new MediaCentricProgressBar(context);
        mediaCentricProgressBar.setId(R$id.mediaCentricProgressbar);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        Dimens dimens = Dimens.INSTANCE;
        layoutParams.setMarginStart(dimens.getDP_16());
        layoutParams.setMarginEnd(dimens.getDP_16());
        layoutParams.topMargin = dimens.getDP_16();
        layoutParams.gravity = 48;
        mediaCentricProgressBar.setLayoutParams(layoutParams);
        this.progressBar = mediaCentricProgressBar;
        this.snapHelper = LazyUtilsKt.unsafeLazy(MediaCentricView$snapHelper$2.INSTANCE);
        Integer[] elements = {Integer.valueOf(R$id.mediaCentricProduct), Integer.valueOf(R$id.mediaCentricProductsRv)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.productViewsIds = C7705l.j0(elements);
        this.productTilesRecycler = DelegatesKt.lazyUnsafe(new MediaCentricView$special$$inlined$lazyView$1(this, this));
        this.productTileView = DelegatesKt.lazyUnsafe(new MediaCentricView$special$$inlined$lazyView$2(this, this));
        Iterator it = C7714v.b0(viewPager2, view, mediaCentricProgressBar).iterator();
        while (it.hasNext()) {
            addView((View) it.next());
        }
    }

    private final void bindProducts(List<ReviewProductTileDTO> products, long widgetId, ReviewGalleryV2ProductButtonBinder cartButtonBinder, Function1<? super AtomAction, Unit> actionHandler, l tokenizedAnalytics) {
        Iterable<View> children = ViewGroupExtKt.children(this);
        ArrayList arrayList = new ArrayList();
        for (View view : children) {
            if (this.productViewsIds.contains(Integer.valueOf(view.getId()))) {
                arrayList.add(view);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ViewExtKt.gone((View) it.next());
        }
        int size = products.size();
        if (size != 0) {
            if (size == 1) {
                ViewExtKt.show(getProductTileView());
                ViewGalleryReviewProductV2Binding bind = ViewGalleryReviewProductV2Binding.bind(getProductTileView());
                Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
                new ReviewProductTileBinder(bind).bind((ReviewProductTileDTO) C7714v.K(products), Long.valueOf(widgetId), cartButtonBinder, actionHandler, tokenizedAnalytics);
                return;
            }
            ViewExtKt.show(getProductTilesRecycler());
            ReviewProductTileAdapter reviewProductTileAdapter = this.productTilesAdapter;
            if (reviewProductTileAdapter != null) {
                reviewProductTileAdapter.submitList(products, widgetId);
            }
            getProductTilesRecycler().addOnScrollListener(new SnapOnScrollListener(getSnapHelper(), 0, new MediaCentricView$bindProducts$4(this, widgetId, tokenizedAnalytics), 2, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View createProductTileView() {
        ConstraintLayout constraintLayout = ViewGalleryReviewProductV2Binding.inflate(LayoutInflater.from(getContext()), this, false).getConstraintLayout();
        constraintLayout.setId(R$id.mediaCentricProduct);
        Dimens dimens = Dimens.INSTANCE;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, dimens.getDP_52());
        layoutParams.leftMargin = dimens.getDP_16();
        layoutParams.rightMargin = dimens.getDP_16();
        layoutParams.bottomMargin = dimens.getDP_16();
        layoutParams.gravity = 80;
        constraintLayout.setLayoutParams(layoutParams);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "apply(...)");
        return constraintLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView createProductsRecycler() {
        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.setId(R$id.mediaCentricProductsRv);
        Dimens dimens = Dimens.INSTANCE;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, dimens.getDP_52());
        layoutParams.bottomMargin = dimens.getDP_16();
        layoutParams.gravity = 80;
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setAdapter(this.productTilesAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.addItemDecoration(new MarginItemDecoration(dimens.getDP_16(), 0, 2, null));
        getSnapHelper().attachToRecyclerView(recyclerView);
        return recyclerView;
    }

    private final MediaCentricVideoViewHolder getCurrentVideoViewHolder() {
        MediaCentricItemsAdapter mediaCentricItemsAdapter = this.itemsAdapter;
        if (mediaCentricItemsAdapter == null) {
            return null;
        }
        int f7 = this.mediaItemsViewPager.f();
        if (!(mediaCentricItemsAdapter.getCurrentList().get(f7) instanceof MediaCentricVO.MediaItemVO.Video)) {
            return null;
        }
        View childAt = this.mediaItemsViewPager.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        RecyclerView.C findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(f7) : null;
        if (findViewHolderForAdapterPosition instanceof MediaCentricVideoViewHolder) {
            return (MediaCentricVideoViewHolder) findViewHolderForAdapterPosition;
        }
        return null;
    }

    private final View getProductTileView() {
        return (View) this.productTileView.getValue();
    }

    private final RecyclerView getProductTilesRecycler() {
        return (RecyclerView) this.productTilesRecycler.getValue();
    }

    private final x getSnapHelper() {
        return (x) this.snapHelper.getValue();
    }

    public final void bind(@NotNull MediaCentricVO item, @NotNull ReviewGalleryV2ProductButtonBinder cartButtonBinder, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(cartButtonBinder, "cartButtonBinder");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        boolean z11 = true;
        if (item.getMediaItems().size() == 1 && (C7714v.K(item.getMediaItems()) instanceof MediaCentricVO.MediaItemVO.Image)) {
            z11 = false;
        }
        this.progressBar.init(item.getMediaItems(), item.getSelectedPosition(), z11);
        List<ReviewProductTileDTO> products = item.getProducts();
        if (products == null) {
            products = K.f71697a;
        }
        bindProducts(products, item.getId(), cartButtonBinder, actionHandler, tokenizedAnalytics);
    }

    public final void clear() {
        this.mediaItemsViewPager.s(null);
        this.progressBar.fullReset();
    }

    @NotNull
    public final MediaCentricProgressBar getProgressBar() {
        return this.progressBar;
    }

    public final void pauseVideoIfNeeded() {
        MediaCentricVideoViewHolder currentVideoViewHolder = getCurrentVideoViewHolder();
        if (currentVideoViewHolder != null) {
            currentVideoViewHolder.pausePlayer(false);
        }
    }

    public final void restartVideoIfNeeded() {
        MediaCentricVideoViewHolder currentVideoViewHolder = getCurrentVideoViewHolder();
        if (currentVideoViewHolder != null) {
            MediaCentricVideoViewHolder.replayVideo$default(currentVideoViewHolder, false, 1, null);
        }
    }

    public final void resumeVideoIfNeeded(boolean fromLifecycle) {
        MediaCentricVideoViewHolder currentVideoViewHolder = getCurrentVideoViewHolder();
        if (currentVideoViewHolder != null) {
            currentVideoViewHolder.resumePlayer(fromLifecycle);
        }
    }

    public final void setCurrentItem(Integer position) {
        if (position != null) {
            if (position.intValue() != this.mediaItemsViewPager.f()) {
                this.mediaItemsViewPager.t(position.intValue(), false);
                this.progressBar.setCurrentProgressBar(position.intValue());
            }
        }
    }

    public final void setupView(@NotNull MediaCentricItemsAdapter itemsAdapter, @NotNull ReviewProductTileAdapter productTilesAdapter, @NotNull Function1<? super Integer, Unit> onItemChange) {
        Intrinsics.checkNotNullParameter(itemsAdapter, "itemsAdapter");
        Intrinsics.checkNotNullParameter(productTilesAdapter, "productTilesAdapter");
        Intrinsics.checkNotNullParameter(onItemChange, "onItemChange");
        this.itemsAdapter = itemsAdapter;
        this.productTilesAdapter = productTilesAdapter;
        this.onItemChange = onItemChange;
        this.mediaItemsViewPager.s(itemsAdapter);
    }
}
