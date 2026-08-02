package ru.ozon.app.android.fresh.main.widgets.promoCarousel.presentation;

import android.content.Context;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "isScrollingByAnimation", "()Z", "Landroid/view/MotionEvent;", "e", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "", "onAnimationStarted", "()V", "onAnimationEnded", "isAnimatedExternal", "Z", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PromoCarouselRecyclerView extends RecyclerView {
    private boolean isAnimatedExternal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoCarouselRecyclerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final boolean isScrollingByAnimation() {
        RecyclerView.o layoutManager = getLayoutManager();
        return ((layoutManager != null && layoutManager.isSmoothScrolling()) || getScrollState() == 2) && this.isAnimatedExternal;
    }

    public final void onAnimationEnded() {
        this.isAnimatedExternal = false;
    }

    public final void onAnimationStarted() {
        this.isAnimatedExternal = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        if (isScrollingByAnimation()) {
            return true;
        }
        return super.onInterceptTouchEvent(e11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        if (isScrollingByAnimation()) {
            return true;
        }
        return super.onTouchEvent(e11);
    }
}
