package ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.miniature;

import Gl.C3124a;
import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/miniature/GalleryPreviewSmoothScroller;", "Landroidx/recyclerview/widget/r;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "", "", "canScrollHorizontally", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "viewStart", "viewEnd", "boxStart", "boxEnd", "snapPreference", "calculateDtToFit", "(IIIII)I", "Landroid/util/DisplayMetrics;", "displayMetrics", "", "calculateSpeedPerPixel", "(Landroid/util/DisplayMetrics;)F", "dx", "calculateTimeForScrolling", "(I)I", "Lkotlin/jvm/functions/Function1;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryPreviewSmoothScroller extends r {

    @NotNull
    private final Function1<Integer, Boolean> canScrollHorizontally;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GalleryPreviewSmoothScroller(@NotNull Context context, @NotNull Function1<? super Integer, Boolean> canScrollHorizontally) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(canScrollHorizontally, "canScrollHorizontally");
        this.canScrollHorizontally = canScrollHorizontally;
    }

    @Override // androidx.recyclerview.widget.r
    public int calculateDtToFit(int viewStart, int viewEnd, int boxStart, int boxEnd, int snapPreference) {
        int a11 = C3124a.a(boxEnd, boxStart, 2, boxStart) - (((viewEnd - viewStart) / 2) + viewStart);
        if (this.canScrollHorizontally.invoke(Integer.valueOf(-a11)).booleanValue()) {
            return a11;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.r
    protected float calculateSpeedPerPixel(@NotNull DisplayMetrics displayMetrics) {
        Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
        return 130.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.r
    protected int calculateTimeForScrolling(int dx) {
        return Math.abs(dx) < 500 ? 130 : 221;
    }
}
