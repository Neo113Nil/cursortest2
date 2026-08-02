package ru.ozon.app.android.search.widgets.searchbar.shimmer;

import android.view.View;
import android.view.ViewGroup;
import hd.C6915b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \n2\u00020\u0001:\u0001\nJ+\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/shimmer/SkeletonCreator;", "", "", "radius", "Landroid/view/ViewGroup$LayoutParams;", "lp", "Landroid/view/View;", "view", "generateSkeletonView", "(FLandroid/view/ViewGroup$LayoutParams;Landroid/view/View;)Landroid/view/View;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SkeletonCreator {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/shimmer/SkeletonCreator$Companion;", "", "<init>", "()V", "", "", "multiplier", "resolveViewWidth", "(IF)I", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final int resolveViewWidth(int i11, float f7) {
            return C6915b.c(i11 * f7);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ View generateSkeletonView$default(SkeletonCreator skeletonCreator, float f7, ViewGroup.LayoutParams layoutParams, View view, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateSkeletonView");
            }
            if ((i11 & 4) != 0) {
                view = null;
            }
            return skeletonCreator.generateSkeletonView(f7, layoutParams, view);
        }
    }

    @NotNull
    View generateSkeletonView(float radius, @NotNull ViewGroup.LayoutParams lp, View view);
}
