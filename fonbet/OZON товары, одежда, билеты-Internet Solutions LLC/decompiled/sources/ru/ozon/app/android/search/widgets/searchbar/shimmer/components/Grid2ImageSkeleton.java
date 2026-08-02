package ru.ozon.app.android.search.widgets.searchbar.shimmer.components;

import android.content.Context;
import android.view.View;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/shimmer/components/Grid2ImageSkeleton;", "Landroid/view/View;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "skeletonWidth", "", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Grid2ImageSkeleton extends View {
    private int skeletonWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Grid2ImageSkeleton(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        if (this.skeletonWidth == size) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else {
            this.skeletonWidth = size;
            super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(C6915b.c(size * 1.3f), 1073741824));
        }
    }
}
