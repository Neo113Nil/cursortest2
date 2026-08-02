package ru.ozon.app.android.storefront.stories.story.presentation.layoutstrategy;

import Cm.e;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/layoutstrategy/MobileLayoutStrategy;", "Lru/ozon/app/android/storefront/stories/story/presentation/layoutstrategy/LayoutStrategy;", "layout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "<init>", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "updateLayout", "", "right", "", "top", "bottom", "orientation", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MobileLayoutStrategy implements LayoutStrategy {

    @NotNull
    private final ConstraintLayout layout;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int dp16 = ResourceExtKt.toPx(16);
    private static final int dp24 = ResourceExtKt.toPx(24);
    private static final int dp44 = ResourceExtKt.toPx(44);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/layoutstrategy/MobileLayoutStrategy$Companion;", "", "<init>", "()V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MobileLayoutStrategy(@NotNull ConstraintLayout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.layout = layout;
    }

    @Override // ru.ozon.app.android.storefront.stories.story.presentation.layoutstrategy.LayoutStrategy
    public void updateLayout(int right, int top, int bottom, int orientation) {
        ConstraintLayout constraintLayout = this.layout;
        d b11 = e.b(constraintLayout);
        b11.e0(R$id.timeLine, 3, dp16 + top);
        int i11 = R$id.buttonLBV;
        int i12 = dp44;
        b11.e0(i11, 4, i12 + bottom);
        b11.e0(R$id.contentLLC, 4, i12 + bottom);
        b11.Z(R$id.textContentLLC, 4, dp24 + bottom);
        b11.f(constraintLayout);
    }
}
