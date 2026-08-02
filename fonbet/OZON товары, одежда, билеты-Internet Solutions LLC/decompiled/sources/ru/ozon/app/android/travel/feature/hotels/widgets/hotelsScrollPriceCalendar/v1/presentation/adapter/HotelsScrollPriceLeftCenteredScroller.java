package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v1.presentation.adapter;

import Gl.C3124a;
import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v1/presentation/adapter/HotelsScrollPriceLeftCenteredScroller;", "Landroidx/recyclerview/widget/r;", "Landroid/content/Context;", "context", "", "extraOffset", "<init>", "(Landroid/content/Context;I)V", "Landroid/util/DisplayMetrics;", "displayMetrics", "", "calculateSpeedPerPixel", "(Landroid/util/DisplayMetrics;)F", "viewStart", "viewEnd", "boxStart", "boxEnd", "snapPreference", "calculateDtToFit", "(IIIII)I", "I", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsScrollPriceLeftCenteredScroller extends r {
    private final int extraOffset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsScrollPriceLeftCenteredScroller(@NotNull Context context, int i11) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.extraOffset = i11;
    }

    @Override // androidx.recyclerview.widget.r
    public int calculateDtToFit(int viewStart, int viewEnd, int boxStart, int boxEnd, int snapPreference) {
        return (C3124a.a(boxEnd, boxStart, 2, boxStart) - ((viewEnd - viewStart) - this.extraOffset)) - viewStart;
    }

    @Override // androidx.recyclerview.widget.r
    protected float calculateSpeedPerPixel(@NotNull DisplayMetrics displayMetrics) {
        Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
        return 0.001f;
    }
}
