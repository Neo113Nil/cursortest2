package ru.ozon.app.android.search.widgets.expandableCells.presentation.skeletons.tileScroll;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.widgets.expandableCells.presentation.skeletons.TileItemSkeleton;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/presentation/skeletons/tileScroll/TileScrollSkeleton;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "tile1", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/skeletons/TileItemSkeleton;", "tile2", "tile3", "startAnimation", "", "stopAnimation", "generateLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "newWeight", "", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TileScrollSkeleton extends LinearLayout {

    @NotNull
    private final TileItemSkeleton tile1;

    @NotNull
    private final TileItemSkeleton tile2;

    @NotNull
    private final TileItemSkeleton tile3;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int dp4 = UiExtKt.toPx(4);
    private static final int dp20 = UiExtKt.toPx(20);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/presentation/skeletons/tileScroll/TileScrollSkeleton$Companion;", "", "<init>", "()V", "", "WEIGHT_FULL", "F", "WEIGHT_PART", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileScrollSkeleton(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        TileItemSkeleton tileItemSkeleton = new TileItemSkeleton(context, false);
        tileItemSkeleton.setId(R$id.skeletonScrollItem1);
        tileItemSkeleton.setLayoutParams(generateLayoutParams(1.0f));
        this.tile1 = tileItemSkeleton;
        TileItemSkeleton tileItemSkeleton2 = new TileItemSkeleton(context, false);
        tileItemSkeleton2.setId(R$id.skeletonScrollItem2);
        tileItemSkeleton2.setLayoutParams(generateLayoutParams(1.0f));
        this.tile2 = tileItemSkeleton2;
        TileItemSkeleton tileItemSkeleton3 = new TileItemSkeleton(context, true);
        tileItemSkeleton3.setId(R$id.skeletonScrollItem3);
        tileItemSkeleton3.setLayoutParams(generateLayoutParams(0.33f));
        this.tile3 = tileItemSkeleton3;
        setOrientation(0);
        RecyclerView.p pVar = new RecyclerView.p(-1, -2);
        int i11 = dp4;
        ((ViewGroup.MarginLayoutParams) pVar).leftMargin = i11;
        ((ViewGroup.MarginLayoutParams) pVar).topMargin = i11;
        ((ViewGroup.MarginLayoutParams) pVar).bottomMargin = dp20;
        setLayoutParams(pVar);
        addView(tileItemSkeleton);
        addView(tileItemSkeleton2);
        addView(tileItemSkeleton3);
    }

    private final LinearLayout.LayoutParams generateLayoutParams(float newWeight) {
        return new LinearLayout.LayoutParams(0, -2, newWeight);
    }

    public final void startAnimation() {
        this.tile1.startShimmerAnimation();
        this.tile2.startShimmerAnimation();
        this.tile3.startShimmerAnimation();
    }

    public final void stopAnimation() {
        this.tile1.stopShimmerAnimation();
        this.tile2.stopShimmerAnimation();
        this.tile3.stopShimmerAnimation();
    }
}
