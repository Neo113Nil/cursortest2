package ru.ozon.app.android.uikit.view.shimmer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"setShimmering", "", "Lru/ozon/app/android/uikit/view/shimmer/ShimmerFrameLayout;", "isActive", "", "ui-kit_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UtilsKt {
    public static final void setShimmering(@NotNull ShimmerFrameLayout shimmerFrameLayout, boolean z11) {
        Intrinsics.checkNotNullParameter(shimmerFrameLayout, "<this>");
        shimmerFrameLayout.setVisibility(z11 ? 0 : 8);
        if (z11) {
            if (shimmerFrameLayout.isShimmerStarted()) {
                return;
            }
            shimmerFrameLayout.startShimmer();
        } else if (shimmerFrameLayout.isShimmerStarted()) {
            shimmerFrameLayout.stopShimmer();
        }
    }
}
