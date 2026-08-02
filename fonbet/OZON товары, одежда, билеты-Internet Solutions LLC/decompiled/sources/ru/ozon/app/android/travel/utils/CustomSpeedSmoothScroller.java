package ru.ozon.app.android.travel.utils;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/utils/CustomSpeedSmoothScroller;", "Landroidx/recyclerview/widget/r;", "Landroid/content/Context;", "context", "", "scrollSpeed", "<init>", "(Landroid/content/Context;F)V", "Landroid/util/DisplayMetrics;", "displayMetrics", "calculateSpeedPerPixel", "(Landroid/util/DisplayMetrics;)F", "", "targetPosition", "Landroid/graphics/PointF;", "computeScrollVectorForPosition", "(I)Landroid/graphics/PointF;", "F", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomSpeedSmoothScroller extends r {
    private final float scrollSpeed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomSpeedSmoothScroller(@NotNull Context context, float f7) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.scrollSpeed = f7;
    }

    @Override // androidx.recyclerview.widget.r
    protected float calculateSpeedPerPixel(@NotNull DisplayMetrics displayMetrics) {
        Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
        return this.scrollSpeed / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    public PointF computeScrollVectorForPosition(int targetPosition) {
        RecyclerView.o layoutManager = getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            return linearLayoutManager.computeScrollVectorForPosition(targetPosition);
        }
        return null;
    }
}
