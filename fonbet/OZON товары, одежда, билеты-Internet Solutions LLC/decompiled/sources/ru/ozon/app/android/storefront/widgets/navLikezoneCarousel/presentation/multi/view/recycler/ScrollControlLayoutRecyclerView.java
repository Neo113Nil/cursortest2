package ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.multi.view.recycler;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0017J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/multi/view/recycler/ScrollControlLayoutRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "isScrollEnabled", "", "onTouchEvent", "e", "Landroid/view/MotionEvent;", "onInterceptTouchEvent", "enableScroll", "", "disableScroll", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScrollControlLayoutRecyclerView extends RecyclerView {
    private boolean isScrollEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollControlLayoutRecyclerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isScrollEnabled = true;
    }

    public final void disableScroll() {
        this.isScrollEnabled = false;
    }

    public final void enableScroll() {
        this.isScrollEnabled = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        return this.isScrollEnabled && super.onInterceptTouchEvent(e11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        return this.isScrollEnabled && super.onTouchEvent(e11);
    }
}
