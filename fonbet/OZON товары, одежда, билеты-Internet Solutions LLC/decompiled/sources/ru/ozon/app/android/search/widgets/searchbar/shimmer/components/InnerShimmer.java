package ru.ozon.app.android.search.widgets.searchbar.shimmer.components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.m;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.R$anim;
import ru.ozon.app.android.search.views.searchShimmer.SearchShimmer;
import ru.ozon.app.android.search.views.searchShimmer.ShimmerConfig;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/shimmer/components/InnerShimmer;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "shimmer", "Lru/ozon/app/android/search/views/searchShimmer/SearchShimmer;", "addViews", "", "view", "Landroid/view/View;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InnerShimmer extends FrameLayout {

    @NotNull
    private final SearchShimmer shimmer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InnerShimmer(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        SearchShimmer searchShimmer = new SearchShimmer(context, null, 0, 6, null);
        searchShimmer.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.shimmer = searchShimmer;
        int i11 = R$anim.shimmer_animation;
        int px = UiExtKt.toPx(m.e.DEFAULT_DRAG_ANIMATION_DURATION);
        Float valueOf = Float.valueOf(0.0f);
        searchShimmer.configureShimmer(new ShimmerConfig(i11, px, U.j(new Pair(valueOf, valueOf), new Pair(Float.valueOf(0.3f), Float.valueOf(0.5f)), new Pair(Float.valueOf(0.5f), Float.valueOf(0.6f)), new Pair(Float.valueOf(0.6f), Float.valueOf(0.5f)), new Pair(Float.valueOf(1.0f), valueOf)), null, 8, null));
        addView(searchShimmer);
        searchShimmer.startAnimation();
    }

    public final void addViews(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.shimmer.addView(view);
    }
}
