package ru.ozon.app.android.storefront.stories.story.presentation.layoutstrategy;

import Cm.e;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/layoutstrategy/TabletLayoutStrategy;", "Lru/ozon/app/android/storefront/stories/story/presentation/layoutstrategy/LayoutStrategy;", "layout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "<init>", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "updateLayout", "", "right", "", "top", "bottom", "orientation", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TabletLayoutStrategy implements LayoutStrategy {

    @NotNull
    private final ConstraintLayout layout;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int dp8 = ResourceExtKt.toPx(8);
    private static final int dp12 = ResourceExtKt.toPx(12);
    private static final int dp16 = ResourceExtKt.toPx(16);
    private static final int dp148 = ResourceExtKt.toPx(148);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/layoutstrategy/TabletLayoutStrategy$Companion;", "", "<init>", "()V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TabletLayoutStrategy(@NotNull ConstraintLayout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.layout = layout;
    }

    @Override // ru.ozon.app.android.storefront.stories.story.presentation.layoutstrategy.LayoutStrategy
    public void updateLayout(int right, int top, int bottom, int orientation) {
        Pair pair;
        if (orientation == 2) {
            int i11 = dp8;
            pair = new Pair(Integer.valueOf(i11 + top), Integer.valueOf(i11 + bottom));
        } else {
            int i12 = dp148;
            pair = new Pair(Integer.valueOf(i12), Integer.valueOf(i12));
        }
        int intValue = ((Number) pair.a()).intValue();
        int intValue2 = ((Number) pair.b()).intValue();
        ConstraintLayout constraintLayout = this.layout;
        d b11 = e.b(constraintLayout);
        b11.e0(R$id.contentCl, 3, intValue);
        b11.e0(R$id.contentCl, 4, intValue2);
        b11.e0(R$id.closeSIB, 3, dp12 + top);
        b11.e0(R$id.closeSIB, 7, dp16 + right);
        b11.f(constraintLayout);
    }
}
