package ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.multi.view;

import O9.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import cL.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.databinding.NavLikezoneCaruselMultiIndicatorBinding;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.data.NavLikezoneCaruselDTO;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.Dimens;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.LongTapDetector;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.multi.view.NavLikezoneCaruselBannerMulti;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.multi.view.recycler.NavLikezoneCaruselBannerMultiAdapter;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.multi.view.recycler.NavLikezoneSmoothScroller;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.multi.view.recycler.ScrollControlLayoutRecyclerView;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.BannerItem;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.core.UniColors;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0001\u0014J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/multi/view/NavLikezoneCaruselBannerMulti;", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "updateTopBadge", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/BannerItem;", "banners", "updateBanners", "(Ljava/util/List;)V", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$PageControls;", "controls", "updatePageControls", "(Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$PageControls;)V", "", "scrollTime", "startAutoScroll", "(Ljava/lang/Long;)V", "View", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface NavLikezoneCaruselBannerMulti {

    @Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\u00020\u0010*\u0004\u0018\u00010\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\nH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010(J\u000f\u0010*\u001a\u00020\nH\u0016¢\u0006\u0004\b*\u0010(J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J#\u00100\u001a\u00020\n2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0.H\u0016¢\u0006\u0004\b0\u00101J#\u00104\u001a\u00020\n2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\n0.H\u0016¢\u0006\u0004\b4\u00101J\u0017\u00106\u001a\u00020\n2\u0006\u00105\u001a\u00020\u0010H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0010H\u0016¢\u0006\u0004\b8\u00109R$\u00103\u001a\u0010\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\n\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010CR\u0016\u0010D\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010CR\u0016\u0010E\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010XR$\u0010Y\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010:¨\u0006Z"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/multi/view/NavLikezoneCaruselBannerMulti$View;", "Landroid/widget/FrameLayout;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/multi/view/NavLikezoneCaruselBannerMulti;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/storefront/databinding/NavLikezoneCaruselMultiIndicatorBinding;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$PageControls;", "pageControls", "", "bind", "(Lru/ozon/app/android/storefront/databinding/NavLikezoneCaruselMultiIndicatorBinding;Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$PageControls;)V", "", "Lru/ozon/uni/core/UniColors;", "default", "", "colorRes", "(Ljava/lang/String;Landroid/content/Context;Lru/ozon/uni/core/UniColors;)I", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "updateTopBadge", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/view/BannerItem;", "banners", "updateBanners", "(Ljava/util/List;)V", "controls", "updatePageControls", "(Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$PageControls;)V", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/multi/view/recycler/NavLikezoneCaruselBannerMultiAdapter;", "adapter", "setupRecyclerView", "(Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/multi/view/recycler/NavLikezoneCaruselBannerMultiAdapter;)V", "", "scrollTime", "startAutoScroll", "(Ljava/lang/Long;)V", "stopAutoScroll", "()V", "enableScroll", "disableScroll", "", "isAutoScrollPlaying", "()Z", "Lkotlin/Function1;", "callback", "onManualScrollPage", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "attachActionHandler", "position", "restorePage", "(I)V", "getNearestPagePosition", "()I", "Lkotlin/jvm/functions/Function1;", "recyclerViewAdapter", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/multi/view/recycler/NavLikezoneCaruselBannerMultiAdapter;", "Landroidx/recyclerview/widget/x;", "pagerSnapHelper", "Landroidx/recyclerview/widget/x;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Z", "idleAfterAutoScroll", "lastUserSnapPosition", "I", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "scrollToNextBannerRunnable", "Ljava/lang/Runnable;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/LongTapDetector;", "longTapDetector", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/LongTapDetector;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/multi/view/recycler/ScrollControlLayoutRecyclerView;", "recyclerView", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/multi/view/recycler/ScrollControlLayoutRecyclerView;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "topBadgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "scrollingPagerIndicator", "Lru/ozon/app/android/storefront/databinding/NavLikezoneCaruselMultiIndicatorBinding;", "Ljava/lang/Long;", "manualScrollPageCallback", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class View extends FrameLayout implements NavLikezoneCaruselBannerMulti {
        private Function1<? super AtomAction, Unit> actionHandler;

        @NotNull
        private final Handler handler;
        private boolean idleAfterAutoScroll;
        private boolean isAutoScrollPlaying;
        private int lastUserSnapPosition;

        @NotNull
        private final LinearLayoutManager linearLayoutManager;

        @NotNull
        private final LongTapDetector longTapDetector;
        private Function1<? super Integer, Unit> manualScrollPageCallback;

        @NotNull
        private final x pagerSnapHelper;

        @NotNull
        private final ScrollControlLayoutRecyclerView recyclerView;
        private NavLikezoneCaruselBannerMultiAdapter recyclerViewAdapter;
        private Long scrollTime;

        @NotNull
        private final Runnable scrollToNextBannerRunnable;

        @NotNull
        private final NavLikezoneCaruselMultiIndicatorBinding scrollingPagerIndicator;

        @SuppressLint({"ClickableViewAccessibility"})
        @NotNull
        private final BadgeView topBadgeView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public View(@NotNull Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            x xVar = new x();
            this.pagerSnapHelper = xVar;
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
            this.linearLayoutManager = linearLayoutManager;
            this.lastUserSnapPosition = -1;
            this.handler = new Handler(Looper.getMainLooper());
            this.scrollToNextBannerRunnable = new d(2, this, context);
            this.longTapDetector = new LongTapDetector.Default();
            ScrollControlLayoutRecyclerView scrollControlLayoutRecyclerView = new ScrollControlLayoutRecyclerView(context);
            scrollControlLayoutRecyclerView.setId(R$id.navLikezoneCarusel_RecyclerView);
            scrollControlLayoutRecyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            scrollControlLayoutRecyclerView.setLayoutManager(linearLayoutManager);
            scrollControlLayoutRecyclerView.setNestedScrollingEnabled(false);
            scrollControlLayoutRecyclerView.setItemAnimator(null);
            xVar.attachToRecyclerView(scrollControlLayoutRecyclerView);
            scrollControlLayoutRecyclerView.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.multi.view.NavLikezoneCaruselBannerMulti$View$recyclerView$1$1
                @Override // androidx.recyclerview.widget.RecyclerView.t
                public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                    boolean z11;
                    Long l11;
                    x xVar2;
                    int i11;
                    Function1 function1;
                    Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                    if (newState != 0) {
                        if (newState != 1) {
                            return;
                        }
                        NavLikezoneCaruselBannerMulti.View.this.stopAutoScroll();
                        return;
                    }
                    z11 = NavLikezoneCaruselBannerMulti.View.this.idleAfterAutoScroll;
                    if (!z11) {
                        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                        if (layoutManager == null) {
                            return;
                        }
                        xVar2 = NavLikezoneCaruselBannerMulti.View.this.pagerSnapHelper;
                        View findSnapView = xVar2.findSnapView(layoutManager);
                        if (findSnapView == null) {
                            return;
                        }
                        int position = layoutManager.getPosition(findSnapView);
                        i11 = NavLikezoneCaruselBannerMulti.View.this.lastUserSnapPosition;
                        if (i11 != position && position != -1) {
                            NavLikezoneCaruselBannerMulti.View.this.lastUserSnapPosition = position;
                            function1 = NavLikezoneCaruselBannerMulti.View.this.manualScrollPageCallback;
                            if (function1 != null) {
                                function1.invoke(Integer.valueOf(position));
                            }
                        }
                    }
                    NavLikezoneCaruselBannerMulti.View view = NavLikezoneCaruselBannerMulti.View.this;
                    l11 = view.scrollTime;
                    view.startAutoScroll(l11);
                }
            });
            this.recyclerView = scrollControlLayoutRecyclerView;
            BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
            badgeView.setId(R$id.navLikezoneCarusel_TopBadge);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 1);
            layoutParams.topMargin = Dimens.INSTANCE.getDp8() + ResourceExtKt.getStatusBarHeight(context);
            badgeView.setLayoutParams(layoutParams);
            badgeView.setOnTouchListener(new a(this, 0));
            this.topBadgeView = badgeView;
            NavLikezoneCaruselMultiIndicatorBinding inflate = NavLikezoneCaruselMultiIndicatorBinding.inflate(LayoutInflater.from(context), this, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            this.scrollingPagerIndicator = inflate;
            setId(R$id.navLikezoneCarusel_Banner_Root);
            setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            addView(scrollControlLayoutRecyclerView);
            addView(badgeView);
            addView(inflate.indicatorRoot);
        }

        private final void bind(NavLikezoneCaruselMultiIndicatorBinding navLikezoneCaruselMultiIndicatorBinding, NavLikezoneCaruselDTO.PageControls pageControls) {
            FrameLayout indicatorRoot = navLikezoneCaruselMultiIndicatorBinding.indicatorRoot;
            Intrinsics.checkNotNullExpressionValue(indicatorRoot, "indicatorRoot");
            String backgroundColor = pageControls.getBackgroundColor();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ViewExtKt.setBackgroundTint(indicatorRoot, colorRes(backgroundColor, context, UniColors.BG_SECONDARY));
            ScrollingPagerIndicator scrollingPagerIndicator = navLikezoneCaruselMultiIndicatorBinding.indicator;
            String inactiveColor = pageControls.getInactiveColor();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            scrollingPagerIndicator.l(colorRes(inactiveColor, context2, UniColors.CLEAR_LIGHT_KEY_600));
            ScrollingPagerIndicator scrollingPagerIndicator2 = navLikezoneCaruselMultiIndicatorBinding.indicator;
            String activeColor = pageControls.getActiveColor();
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            scrollingPagerIndicator2.n(colorRes(activeColor, context3, UniColors.BG_PRIMARY));
        }

        private final int colorRes(String str, Context context, UniColors uniColors) {
            StyleParser styleParser = StyleParser.INSTANCE;
            if (str == null) {
                str = uniColors.getToken();
            }
            Integer parseColor = styleParser.parseColor(context, str);
            return parseColor != null ? parseColor.intValue() : uniColors.getResId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void scrollToNextBannerRunnable$lambda$1(View view, Context context) {
            int findFirstCompletelyVisibleItemPosition = view.linearLayoutManager.findFirstCompletelyVisibleItemPosition();
            int i11 = findFirstCompletelyVisibleItemPosition == view.linearLayoutManager.getItemCount() - 1 ? 0 : findFirstCompletelyVisibleItemPosition + 1;
            LinearLayoutManager linearLayoutManager = view.linearLayoutManager;
            NavLikezoneSmoothScroller navLikezoneSmoothScroller = new NavLikezoneSmoothScroller(context);
            navLikezoneSmoothScroller.setTargetPosition(i11);
            linearLayoutManager.startSmoothScroll(navLikezoneSmoothScroller);
            view.idleAfterAutoScroll = true;
            view.startAutoScroll(view.scrollTime);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean topBadgeView$lambda$5$lambda$4(View view, android.view.View view2, MotionEvent motionEvent) {
            LongTapDetector longTapDetector = view.longTapDetector;
            Intrinsics.f(view2);
            Intrinsics.f(motionEvent);
            return LongTapDetector.DefaultImpls.detect$default(longTapDetector, view2, motionEvent, new NavLikezoneCaruselBannerMulti$View$topBadgeView$1$2$1(view), new NavLikezoneCaruselBannerMulti$View$topBadgeView$1$2$2(view), null, 16, null);
        }

        public void attachActionHandler(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
            Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
            this.actionHandler = actionHandler;
        }

        public void disableScroll() {
            stopAutoScroll();
            this.recyclerView.disableScroll();
        }

        public void enableScroll() {
            this.recyclerView.enableScroll();
            startAutoScroll(this.scrollTime);
        }

        public int getNearestPagePosition() {
            android.view.View findSnapView = this.pagerSnapHelper.findSnapView(this.linearLayoutManager);
            int position = findSnapView != null ? this.linearLayoutManager.getPosition(findSnapView) : -1;
            if (position != -1) {
                return position;
            }
            return 0;
        }

        /* renamed from: isAutoScrollPlaying, reason: from getter */
        public boolean getIsAutoScrollPlaying() {
            return this.isAutoScrollPlaying;
        }

        public void onManualScrollPage(@NotNull Function1<? super Integer, Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.manualScrollPageCallback = callback;
        }

        public void restorePage(int position) {
            if (position == -1) {
                return;
            }
            this.recyclerView.scrollToPosition(position);
            this.lastUserSnapPosition = position;
            this.scrollingPagerIndicator.indicator.k(position);
        }

        public void setupRecyclerView(@NotNull NavLikezoneCaruselBannerMultiAdapter adapter) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.recyclerViewAdapter = adapter;
            this.recyclerView.setAdapter(adapter);
            this.scrollingPagerIndicator.indicator.d(this.recyclerView);
        }

        @Override // ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.multi.view.NavLikezoneCaruselBannerMulti
        public void startAutoScroll(Long scrollTime) {
            this.scrollTime = scrollTime;
            this.handler.removeCallbacks(this.scrollToNextBannerRunnable);
            if (scrollTime != null) {
                long longValue = scrollTime.longValue();
                this.idleAfterAutoScroll = true;
                this.isAutoScrollPlaying = true;
                this.handler.postDelayed(this.scrollToNextBannerRunnable, longValue);
            }
        }

        public void stopAutoScroll() {
            this.idleAfterAutoScroll = false;
            this.handler.removeCallbacks(this.scrollToNextBannerRunnable);
            this.isAutoScrollPlaying = false;
        }

        @Override // ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.multi.view.NavLikezoneCaruselBannerMulti
        public void updateBanners(@NotNull List<? extends BannerItem> banners) {
            Intrinsics.checkNotNullParameter(banners, "banners");
            NavLikezoneCaruselBannerMultiAdapter navLikezoneCaruselBannerMultiAdapter = this.recyclerViewAdapter;
            if (navLikezoneCaruselBannerMultiAdapter != null) {
                navLikezoneCaruselBannerMultiAdapter.submitList(banners);
            }
            this.recyclerView.scrollToPosition(0);
            this.scrollingPagerIndicator.indicator.k(0);
        }

        @Override // ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.multi.view.NavLikezoneCaruselBannerMulti
        public void updatePageControls(@NotNull NavLikezoneCaruselDTO.PageControls controls) {
            Intrinsics.checkNotNullParameter(controls, "controls");
            bind(this.scrollingPagerIndicator, controls);
        }

        @Override // ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.multi.view.NavLikezoneCaruselBannerMulti
        public void updateTopBadge(BadgeDTO badge) {
            BadgeHolderKt.bindOrGone(this.topBadgeView, badge, this.actionHandler);
        }
    }

    void startAutoScroll(Long scrollTime);

    void updateBanners(@NotNull List<? extends BannerItem> banners);

    void updatePageControls(@NotNull NavLikezoneCaruselDTO.PageControls controls);

    void updateTopBadge(BadgeDTO badge);
}
