package ru.ozon.app.android.storefront.widgets.navigationSlider.presentation;

import Am.C2438a;
import B0.C2454a;
import Ek.a;
import K00.b;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.ui.AdultListener;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.storefront.ui.navslider.databinding.WidgetNavigationSliderLayoutBinding;
import ru.ozon.app.android.storefront.widgets.navigationSlider.data.NavigationSliderUpdate;
import ru.ozon.app.android.storefront.widgets.navigationSlider.presentation.NavigationSliderVO;
import ru.ozon.app.android.tools.ItemAdapterCallback;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001!B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Landroidx/fragment/app/r;", "activity", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Landroid/view/View;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Landroidx/fragment/app/r;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderAdapter;", "navigationSliderAdapter", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderAdapter;", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderLayoutManager;", "navigationSliderLayoutManager", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderLayoutManager;", "Lru/ozon/app/android/storefront/ui/navslider/databinding/WidgetNavigationSliderLayoutBinding;", "binding", "Lru/ozon/app/android/storefront/ui/navslider/databinding/WidgetNavigationSliderLayoutBinding;", "CategoryData", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavigationSliderWidgetViewHolder extends k<NavigationSliderVO> {

    @NotNull
    private final WidgetNavigationSliderLayoutBinding binding;

    @NotNull
    private final ComposerReferences composerReferences;
    private NavigationSliderAdapter navigationSliderAdapter;

    @NotNull
    private NavigationSliderLayoutManager navigationSliderLayoutManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationSliderWidgetViewHolder(@NotNull View containerView, @NotNull final AdultHandler adultHandler, @NotNull final r activity, @NotNull FeatureChecker featureChecker, @NotNull ComposerReferences composerReferences) {
        super(containerView);
        J viewLifecycleOwner;
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        this.composerReferences = composerReferences;
        WidgetNavigationSliderLayoutBinding bind = WidgetNavigationSliderLayoutBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        ComponentCallbacksC5392m c11 = composerReferences.getContainer().c();
        if (c11 != null && (viewLifecycleOwner = c11.getViewLifecycleOwner()) != null) {
            final AbstractC5434v lifecycle = viewLifecycleOwner.getLifecycle();
            if (lifecycle.b() == AbstractC5434v.b.DESTROYED) {
                this.navigationSliderAdapter = null;
            } else {
                lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.storefront.widgets.navigationSlider.presentation.NavigationSliderWidgetViewHolder$special$$inlined$whenDestroyed$1
                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public void onDestroy(J owner) {
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        this.navigationSliderAdapter = null;
                        AbstractC5434v.this.e(this);
                    }
                });
            }
        }
        this.navigationSliderAdapter = new NavigationSliderAdapter(adultHandler, featureChecker, new ItemAdapterCallback<NavigationSliderVO.NavigationItem>() { // from class: ru.ozon.app.android.storefront.widgets.navigationSlider.presentation.NavigationSliderWidgetViewHolder.2
            @Override // ru.ozon.app.android.tools.ItemAdapterCallback
            public void click(int position, final NavigationSliderVO.NavigationItem item) {
                if (item != null) {
                    AdultHandler adultHandler2 = adultHandler;
                    r rVar = activity;
                    final NavigationSliderWidgetViewHolder navigationSliderWidgetViewHolder = NavigationSliderWidgetViewHolder.this;
                    boolean shouldBlur = item.getShouldBlur();
                    G supportFragmentManager = rVar.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    AdultHandler.DefaultImpls.showAdultDialog$default(adultHandler2, shouldBlur, supportFragmentManager, new AdultListener() { // from class: ru.ozon.app.android.storefront.widgets.navigationSlider.presentation.NavigationSliderWidgetViewHolder$2$click$1$1
                        @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                        public void onAdultAccept() {
                            ComposerNavigator.DefaultImpls.openDeeplink$default(NavigationSliderWidgetViewHolder.this.composerReferences.getNavigator(), item.getDeeplink(), null, 2, null);
                            t tokenizedEvent = item.getTokenizedEvent();
                            if (tokenizedEvent != null) {
                                TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(NavigationSliderWidgetViewHolder.this.composerReferences.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
                            }
                        }

                        @Override // ru.ozon.app.android.account.adult.ui.AdultListener
                        public void onAdultReject() {
                            AdultListener.DefaultImpls.onAdultReject(this);
                        }
                    }, null, false, 24, null);
                }
            }

            @Override // ru.ozon.app.android.tools.ItemAdapterCallback
            public void view(int position, NavigationSliderVO.NavigationItem item) {
                t tokenizedEvent;
                if (item == null || (tokenizedEvent = item.getTokenizedEvent()) == null) {
                    return;
                }
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(NavigationSliderWidgetViewHolder.this.composerReferences.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
            }
        }, this);
        this.navigationSliderLayoutManager = new NavigationSliderLayoutManager(getContext(), 0, false);
        final RecyclerView recyclerView = bind.itemsRv;
        recyclerView.setAdapter(this.navigationSliderAdapter);
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutAnimation(null);
        recyclerView.setLayoutManager(this.navigationSliderLayoutManager);
        recyclerView.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.storefront.widgets.navigationSlider.presentation.NavigationSliderWidgetViewHolder$3$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                if (newState == 0) {
                    RecyclerView.o layoutManager = RecyclerView.this.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    this.composerReferences.getController().d(new NavigationSliderUpdate.UpdateCurrentPage(linearLayoutManager != null ? linearLayoutManager.findLastVisibleItemPosition() : 0));
                }
            }
        });
        new x().attachToRecyclerView(recyclerView);
        recyclerView.setNestedScrollingEnabled(false);
        bind.pagerIndicator.d(bind.itemsRv);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull NavigationSliderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetNavigationSliderLayoutBinding widgetNavigationSliderLayoutBinding = this.binding;
        TextView titleTv = widgetNavigationSliderLayoutBinding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextViewExtKt.setTextOrGone(titleTv, item.getTitle());
        ScrollingPagerIndicator pagerIndicator = widgetNavigationSliderLayoutBinding.pagerIndicator;
        Intrinsics.checkNotNullExpressionValue(pagerIndicator, "pagerIndicator");
        ViewExtKt.showOrGone(pagerIndicator, Boolean.valueOf(item.getShowAsSlider()));
        this.navigationSliderLayoutManager.setStartPosition(item.getCurrentPage());
        RecyclerView itemsRv = widgetNavigationSliderLayoutBinding.itemsRv;
        Intrinsics.checkNotNullExpressionValue(itemsRv, "itemsRv");
        ViewGroup.LayoutParams layoutParams = itemsRv.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.height = item.getSizeInfo().getMinHeight();
        itemsRv.setLayoutParams(layoutParams2);
        NavigationSliderAdapter navigationSliderAdapter = this.navigationSliderAdapter;
        if (navigationSliderAdapter != null) {
            navigationSliderAdapter.setCategoryData(item.getSizeInfo().getCategoryData());
        }
        NavigationSliderAdapter navigationSliderAdapter2 = this.navigationSliderAdapter;
        if (navigationSliderAdapter2 != null) {
            navigationSliderAdapter2.submitList(item.getBlocks());
        }
        TextView titleTv2 = widgetNavigationSliderLayoutBinding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv2, "titleTv");
        TextViewExtKt.setTextOrGone(titleTv2, item.getTitle());
        ScrollingPagerIndicator pagerIndicator2 = widgetNavigationSliderLayoutBinding.pagerIndicator;
        Intrinsics.checkNotNullExpressionValue(pagerIndicator2, "pagerIndicator");
        ViewExtKt.showOrGone(pagerIndicator2, Boolean.valueOf(item.getShowAsSlider()));
        widgetNavigationSliderLayoutBinding.itemsRv.setHasFixedSize(true);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0019\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderWidgetViewHolder$CategoryData;", "", "", "columns", "rows", "itemWidth", "bgImageSize", "imageSize", "<init>", "(IIIII)V", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getColumns", "getRows", "getItemWidth", "getBgImageSize", "getImageSize", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CategoryData {
        private final int bgImageSize;
        private final int columns;
        private final int imageSize;
        private final int itemWidth;
        private final int rows;

        public CategoryData(int i11, int i12, int i13, int i14, int i15) {
            this.columns = i11;
            this.rows = i12;
            this.itemWidth = i13;
            this.bgImageSize = i14;
            this.imageSize = i15;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CategoryData)) {
                return false;
            }
            CategoryData categoryData = (CategoryData) other;
            return this.columns == categoryData.columns && this.rows == categoryData.rows && this.itemWidth == categoryData.itemWidth && this.bgImageSize == categoryData.bgImageSize && this.imageSize == categoryData.imageSize;
        }

        public final int getBgImageSize() {
            return this.bgImageSize;
        }

        public final int getColumns() {
            return this.columns;
        }

        public final int getImageSize() {
            return this.imageSize;
        }

        public final int getItemWidth() {
            return this.itemWidth;
        }

        public final int getRows() {
            return this.rows;
        }

        public int hashCode() {
            return Integer.hashCode(this.imageSize) + C2454a.a(this.bgImageSize, C2454a.a(this.itemWidth, C2454a.a(this.rows, Integer.hashCode(this.columns) * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.columns;
            int i12 = this.rows;
            int i13 = this.itemWidth;
            int i14 = this.bgImageSize;
            int i15 = this.imageSize;
            StringBuilder a11 = C2438a.a("CategoryData(columns=", i11, ", rows=", ", itemWidth=", i12);
            a.f(i13, i14, ", bgImageSize=", ", imageSize=", a11);
            return b.e(i15, ")", a11);
        }

        public CategoryData(int i11, int i12, int i13) {
            this(i11, i12, i13, (i13 * 60) / 100, (i13 * 50) / 100);
        }
    }
}
