package ru.ozon.app.android.storefront.stories.story.presentation.layoutstrategy.v3;

import Cm.e;
import Sc.o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.dto.Alignment;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0002J\b\u0010\u0011\u001a\u00020\bH\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/layoutstrategy/v3/TabletV3LayoutStrategy;", "Lru/ozon/app/android/storefront/stories/story/presentation/layoutstrategy/v3/LayoutV3Strategy;", "layout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "<init>", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "content", "updateLayout", "", "top", "", "bottom", "orientation", "updateContentAlignment", "alignment", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/Alignment;", "updateContentConstraintAsTop", "updateContentConstraintAsBottom", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TabletV3LayoutStrategy implements LayoutV3Strategy {
    private final ConstraintLayout content;
    private final ConstraintLayout layout;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int dp8 = ResourceExtKt.toPx(8);
    private static final int dp148 = ResourceExtKt.toPx(148);
    private static final int dp20 = ResourceExtKt.toPx(20);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/layoutstrategy/v3/TabletV3LayoutStrategy$Companion;", "", "<init>", "()V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Alignment.values().length];
            try {
                iArr[Alignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Alignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TabletV3LayoutStrategy(ConstraintLayout constraintLayout) {
        this.layout = constraintLayout;
        this.content = constraintLayout != null ? (ConstraintLayout) constraintLayout.findViewById(R$id.contentCl) : null;
    }

    private final void updateContentConstraintAsBottom() {
        ConstraintLayout constraintLayout = this.content;
        if (constraintLayout != null) {
            d b11 = e.b(constraintLayout);
            ConstraintSetExtKt.clearTop(b11, R$id.atomsContent);
            ConstraintSetExtKt.bottomToTop(b11, R$id.atomsContent, R$id.bottomBarrier, dp8);
            b11.f(constraintLayout);
        }
    }

    private final void updateContentConstraintAsTop() {
        ConstraintLayout constraintLayout = this.content;
        if (constraintLayout != null) {
            d b11 = e.b(constraintLayout);
            ConstraintSetExtKt.clearBottom(b11, R$id.atomsContent);
            ConstraintSetExtKt.topToBottom(b11, R$id.atomsContent, R$id.authorBlock, dp20);
            b11.f(constraintLayout);
        }
    }

    @Override // ru.ozon.app.android.storefront.stories.story.presentation.layoutstrategy.v3.LayoutV3Strategy
    public void updateContentAlignment(Alignment alignment) {
        if (alignment == null) {
            return;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
        if (i11 == 1) {
            updateContentConstraintAsTop();
        } else {
            if (i11 != 2) {
                throw new o();
            }
            updateContentConstraintAsBottom();
        }
    }

    @Override // ru.ozon.app.android.storefront.stories.story.presentation.layoutstrategy.v3.LayoutV3Strategy
    public void updateLayout(int top, int bottom, int orientation) {
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
        if (constraintLayout != null) {
            d b11 = e.b(constraintLayout);
            b11.e0(R$id.contentCl, 3, intValue);
            b11.e0(R$id.contentCl, 4, intValue2);
            b11.e0(R$id.closeSIB, 3, top);
            b11.e0(R$id.closeSIB, 7, dp8);
            b11.f(constraintLayout);
        }
        ConstraintLayout constraintLayout2 = this.content;
        if (constraintLayout2 != null) {
            d b12 = e.b(constraintLayout2);
            ConstraintSetExtKt.bottomToBottom$default(b12, R$id.storyItemIV, R$id.contentCl, 0, 4, null);
            ConstraintSetExtKt.bottomToBottom$default(b12, R$id.storyItemVideoPV, R$id.contentCl, 0, 4, null);
            ConstraintSetExtKt.bottomToTop$default(b12, R$id.socialProductsList, R$id.smallButtonContainerLLC, 0, 4, null);
            b12.f(constraintLayout2);
        }
    }
}
