package ru.ozon.app.android.storefront.widgets.cms.bannercarousel.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import ik0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.cms.R$styleable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0002\r'\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0015\u0010\fJ\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\fJ\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\fR*\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u0013R\"\u0010\u001e\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u0013R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/carousel/CarouselViewPager;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "init", "(Landroid/util/AttributeSet;)V", "scrollToNextPage", "()V", "ru/ozon/app/android/storefront/widgets/cms/bannercarousel/carousel/CarouselViewPager$createPageChangeListener$1", "createPageChangeListener", "()Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/carousel/CarouselViewPager$createPageChangeListener$1;", "", "isVisible", "onVisibilityAggregated", "(Z)V", "onAttachedToWindow", "onDetachedFromWindow", "startAutoScroll", "stopAutoScroll", "enabled", "autoScrollEnabled", "Z", "getAutoScrollEnabled", "()Z", "setAutoScrollEnabled", "disableAutoScrollOnUserInteraction", "getDisableAutoScrollOnUserInteraction", "setDisableAutoScrollOnUserInteraction", "", "duration", "I", "Landroidx/recyclerview/widget/x;", "pagerSnapHelper", "Landroidx/recyclerview/widget/x;", "ru/ozon/app/android/storefront/widgets/cms/bannercarousel/carousel/CarouselViewPager$autoScroller$1", "autoScroller", "Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/carousel/CarouselViewPager$autoScroller$1;", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CarouselViewPager extends RecyclerView {
    private boolean autoScrollEnabled;

    @NotNull
    private final CarouselViewPager$autoScroller$1 autoScroller;
    private boolean disableAutoScrollOnUserInteraction;
    private int duration;

    @NotNull
    private final x pagerSnapHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [ru.ozon.app.android.storefront.widgets.cms.bannercarousel.carousel.CarouselViewPager$autoScroller$1] */
    public CarouselViewPager(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.autoScrollEnabled = true;
        this.disableAutoScrollOnUserInteraction = true;
        this.duration = AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS;
        x xVar = new x();
        this.pagerSnapHelper = xVar;
        this.autoScroller = new Runnable() { // from class: ru.ozon.app.android.storefront.widgets.cms.bannercarousel.carousel.CarouselViewPager$autoScroller$1
            @Override // java.lang.Runnable
            public void run() {
                int i11;
                CarouselViewPager.this.scrollToNextPage();
                CarouselViewPager carouselViewPager = CarouselViewPager.this;
                i11 = carouselViewPager.duration;
                carouselViewPager.postDelayed(this, i11);
            }
        };
        addOnScrollListener(createPageChangeListener());
        xVar.attachToRecyclerView(this);
        init(attrs);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.storefront.widgets.cms.bannercarousel.carousel.CarouselViewPager$createPageChangeListener$1] */
    private final CarouselViewPager$createPageChangeListener$1 createPageChangeListener() {
        return new RecyclerView.t() { // from class: ru.ozon.app.android.storefront.widgets.cms.bannercarousel.carousel.CarouselViewPager$createPageChangeListener$1
            private int previousState;

            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (this.previousState == 1 && newState == 2) {
                    if (CarouselViewPager.this.getDisableAutoScrollOnUserInteraction()) {
                        CarouselViewPager.this.stopAutoScroll();
                    } else {
                        CarouselViewPager.this.startAutoScroll();
                    }
                }
                this.previousState = newState;
            }
        };
    }

    private final void init(AttributeSet attrs) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R$styleable.CarouselViewPager);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            setAutoScrollEnabled(obtainStyledAttributes.getBoolean(R$styleable.CarouselViewPager_autoScroll, true));
            this.disableAutoScrollOnUserInteraction = obtainStyledAttributes.getBoolean(R$styleable.CarouselViewPager_disableAutoScrollOnUserInteraction, true);
            this.duration = obtainStyledAttributes.getInteger(R$styleable.CarouselViewPager_duration, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToNextPage() {
        RecyclerView.g adapter;
        RecyclerView.g adapter2 = getAdapter();
        int itemCount = ((adapter2 == null || adapter2.getItemCount() != 0) && (adapter = getAdapter()) != null) ? adapter.getItemCount() : 1;
        Integer a11 = b.a(this.pagerSnapHelper, this);
        if (a11 != null) {
            smoothScrollToPosition((a11.intValue() + 1) % itemCount);
        }
    }

    public final boolean getDisableAutoScrollOnUserInteraction() {
        return this.disableAutoScrollOnUserInteraction;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        startAutoScroll();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopAutoScroll();
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean isVisible) {
        super.onVisibilityAggregated(isVisible);
        if (isVisible) {
            startAutoScroll();
        } else {
            stopAutoScroll();
        }
    }

    public final void setAutoScrollEnabled(boolean z11) {
        if (this.autoScrollEnabled == z11) {
            return;
        }
        this.autoScrollEnabled = z11;
        if (z11) {
            startAutoScroll();
        } else {
            stopAutoScroll();
        }
    }

    public final void startAutoScroll() {
        stopAutoScroll();
        if (this.autoScrollEnabled) {
            postDelayed(this.autoScroller, this.duration);
        }
    }

    public final void stopAutoScroll() {
        removeCallbacks(this.autoScroller);
    }
}
