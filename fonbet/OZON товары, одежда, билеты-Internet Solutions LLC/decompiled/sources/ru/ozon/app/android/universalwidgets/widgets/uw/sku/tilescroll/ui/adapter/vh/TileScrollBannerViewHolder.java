package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.adapter.vh;

import EM.g;
import W10.c;
import WZ.l;
import WZ.t;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.data.TileScrollVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.banner.TileScrollBannerView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J!\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\u0017J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010\u0017J\u000f\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b%\u0010\u0017J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R\u0018\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010,R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010-R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/adapter/vh/TileScrollBannerViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/banner/TileScrollBannerView;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "widgetAnalytic", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function0;", "Lru/ozon/composer/ui/widget/f;", "getViewedPond", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/banner/TileScrollBannerView;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;LWZ/l;Lkotlin/jvm/functions/Function0;)V", "bindFirst", "()V", "bindSecond", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO;", "item", "", "widgetId", "trackView", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO;Ljava/lang/String;)V", "onRecycle", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "onDetach", "onViewInVisibleBounds", "bind", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO;)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/banner/TileScrollBannerView;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "LWZ/l;", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO;", "", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "steps", "Ljava/util/List;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileScrollBannerViewHolder extends j {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final FrameBinder frameBinder;

    @NotNull
    private final Function0<f> getViewedPond;
    private TileScrollVO.ItemVO.BannerVO item;

    @NotNull
    private final List<BindStep> steps;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final TileScrollBannerView view;

    @NotNull
    private final AnalyticData widgetAnalytic;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.adapter.vh.TileScrollBannerViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AtomAction action;
            TileScrollVO.ItemVO.BannerVO bannerVO = TileScrollBannerViewHolder.this.item;
            if (bannerVO == null || (action = bannerVO.getAction()) == null) {
                return;
            }
            TileScrollBannerViewHolder.this.actionHandler.invoke(action);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TileScrollBannerViewHolder(@NotNull TileScrollBannerView view, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull FrameBinder frameBinder, @NotNull RecyclerView recyclerView, @NotNull AnalyticData widgetAnalytic, @NotNull l tokenizedAnalytics, @NotNull Function0<f> getViewedPond) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(widgetAnalytic, "widgetAnalytic");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(getViewedPond, "getViewedPond");
        this.view = view;
        this.actionHandler = actionHandler;
        this.frameBinder = frameBinder;
        this.widgetAnalytic = widgetAnalytic;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.getViewedPond = getViewedPond;
        this.steps = C7714v.b0(new EM.f(this, 1), new g(this, 2));
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        frameBinder.init(itemView);
        frameBinder.applyRecycler(recyclerView);
        view.setOnItemClicked(new AnonymousClass1());
        view.setActionHandler(actionHandler);
    }

    private final void bindFirst() {
        TileScrollVO.ItemVO.BannerVO bannerVO = this.item;
        if (bannerVO == null) {
            return;
        }
        this.view.bindTitle(bannerVO.getTopTextAtom());
    }

    private final void bindSecond() {
        TileScrollVO.ItemVO.BannerVO bannerVO = this.item;
        if (bannerVO == null) {
            return;
        }
        this.view.bindBottomItem(bannerVO.getBottomBannerItem());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$0(TileScrollBannerViewHolder tileScrollBannerViewHolder) {
        tileScrollBannerViewHolder.bindFirst();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$1(TileScrollBannerViewHolder tileScrollBannerViewHolder) {
        tileScrollBannerViewHolder.bindSecond();
        return Unit.f71690a;
    }

    private final void trackView(TileScrollVO.ItemVO.BannerVO item, String widgetId) {
        f invoke;
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
            if (widgetId == null || (invoke = this.getViewedPond.invoke()) == null) {
                return;
            }
            invoke.d(Long.valueOf(item.getId()), widgetId);
        }
    }

    public final void bind(@NotNull TileScrollVO.ItemVO.BannerVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        if (item != null) {
            this.view.bindBanner(item);
        }
        this.frameBinder.bind(this.steps, item.getViewItemKey());
    }

    @Override // jk0.j
    public void onDetach() {
        super.onDetach();
        this.frameBinder.onRecycle();
    }

    @Override // jk0.j, lk0.b
    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        super.onOffscreenPositionChanged(offscreenOffsetPercent);
        this.frameBinder.onOffscreenPositionChanged(offscreenOffsetPercent);
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        this.frameBinder.onRecycle();
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        TileScrollVO.ItemVO.BannerVO bannerVO = this.item;
        if (bannerVO != null) {
            c trackingData = this.widgetAnalytic.getTrackingData();
            trackView(bannerVO, trackingData != null ? trackingData.c() : null);
        }
    }
}
