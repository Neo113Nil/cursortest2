package ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.multi.view.recycler;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/presentation/multi/view/recycler/NavLikezoneSmoothScroller;", "Landroidx/recyclerview/widget/r;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/DisplayMetrics;", "displayMetrics", "", "calculateSpeedPerPixel", "(Landroid/util/DisplayMetrics;)F", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavLikezoneSmoothScroller extends r {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavLikezoneSmoothScroller(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.recyclerview.widget.r
    protected float calculateSpeedPerPixel(@NotNull DisplayMetrics displayMetrics) {
        Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
        return 50.0f / displayMetrics.densityDpi;
    }
}
