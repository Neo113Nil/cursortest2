package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.scroll;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0000¨\u0006\b"}, d2 = {"smoothScrollToTabWithPosition", "", "Landroidx/recyclerview/widget/RecyclerView;", "position", "", "scrollOffsetPx", "animationStopCallback", "Lkotlin/Function0;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ScrollUtilsKt {
    public static final void smoothScrollToTabWithPosition(@NotNull RecyclerView recyclerView, int i11, final int i12, @NotNull final Function0<Unit> animationStopCallback) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(animationStopCallback, "animationStopCallback");
        final Context context = recyclerView.getContext();
        r rVar = new r(context) { // from class: ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.scroll.ScrollUtilsKt$smoothScrollToTabWithPosition$smoothScroller$1
            @Override // androidx.recyclerview.widget.r
            public int calculateDxToMakeVisible(View view, int snapPreference) {
                Intrinsics.checkNotNullParameter(view, "view");
                return super.calculateDxToMakeVisible(view, snapPreference) + i12;
            }

            @Override // androidx.recyclerview.widget.r
            protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return displayMetrics != null ? 130.0f / displayMetrics.densityDpi : super.calculateSpeedPerPixel(displayMetrics);
            }

            @Override // androidx.recyclerview.widget.r
            protected int getHorizontalSnapPreference() {
                return -1;
            }

            @Override // androidx.recyclerview.widget.r, androidx.recyclerview.widget.RecyclerView.z
            protected void onStop() {
                super.onStop();
                animationStopCallback.invoke();
            }
        };
        rVar.setTargetPosition(i11);
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.startSmoothScroll(rVar);
        }
    }
}
