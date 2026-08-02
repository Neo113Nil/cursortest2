package ru.ozon.app.android.storefront.stories.story.presentation.layoutstrategy.v3;

import Cm.e;
import Sc.o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.dto.Alignment;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0012\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0002J\b\u0010\u0010\u001a\u00020\u0007H\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/layoutstrategy/v3/MobileV3LayoutStrategySmall;", "Lru/ozon/app/android/storefront/stories/story/presentation/layoutstrategy/v3/LayoutV3Strategy;", "layout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "<init>", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "updateLayout", "", "top", "", "bottom", "orientation", "updateContentAlignment", "alignment", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/Alignment;", "updateContentConstraintAsTop", "updateContentConstraintAsBottom", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MobileV3LayoutStrategySmall implements LayoutV3Strategy {
    private final ConstraintLayout layout;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int dp8 = UiExtKt.toPx(8);
    private static final int dp16 = UiExtKt.toPx(16);
    private static final int dp32 = UiExtKt.toPx(32);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/layoutstrategy/v3/MobileV3LayoutStrategySmall$Companion;", "", "<init>", "()V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public MobileV3LayoutStrategySmall(ConstraintLayout constraintLayout) {
        this.layout = constraintLayout;
    }

    private final void updateContentConstraintAsBottom() {
        ConstraintLayout constraintLayout = this.layout;
        if (constraintLayout != null) {
            d b11 = e.b(constraintLayout);
            ConstraintSetExtKt.clearTop(b11, R$id.atomsContent);
            ConstraintSetExtKt.bottomToTop(b11, R$id.atomsContent, R$id.bottomBarrier, dp8);
            b11.f(constraintLayout);
        }
    }

    private final void updateContentConstraintAsTop() {
        ConstraintLayout constraintLayout = this.layout;
        if (constraintLayout != null) {
            d b11 = e.b(constraintLayout);
            ConstraintSetExtKt.clearBottom(b11, R$id.atomsContent);
            ConstraintSetExtKt.topToBottom(b11, R$id.atomsContent, R$id.closeSIB, dp32);
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
        ConstraintLayout constraintLayout = this.layout;
        if (constraintLayout != null) {
            d b11 = e.b(constraintLayout);
            b11.e0(R$id.timeLine, 3, dp16 + top);
            b11.e0(R$id.smallButtonContainerLLC, 4, bottom);
            b11.e0(R$id.button, 4, 0);
            ConstraintSetExtKt.bottomToBottom$default(b11, R$id.storyItemIV, R$id.rootCl, 0, 4, null);
            ConstraintSetExtKt.bottomToBottom$default(b11, R$id.storyItemVideoPV, R$id.rootCl, 0, 4, null);
            ConstraintSetExtKt.bottomToTop$default(b11, R$id.socialProductsList, R$id.smallButtonContainerLLC, 0, 4, null);
            b11.f(constraintLayout);
        }
    }
}
