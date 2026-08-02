package ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/NaviBlocksV3Layout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "blockLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "favBlock", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/BlockV3View;", "purchaseBlock", "reviewBlock", "viewBlocks", "", "getViewBlocks", "()[Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/BlockV3View;", "[Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/BlockV3View;", "bind", "", "item", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/NaviBlocksV3VO;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NaviBlocksV3Layout extends LinearLayout {

    @NotNull
    private final LinearLayout.LayoutParams blockLayoutParams;

    @NotNull
    private final BlockV3View favBlock;

    @NotNull
    private final BlockV3View purchaseBlock;

    @NotNull
    private final BlockV3View reviewBlock;

    @NotNull
    private final BlockV3View[] viewBlocks;
    public static final int $stable = 8;
    private static final int blockHeight = UiExtKt.toPx(67);

    public /* synthetic */ NaviBlocksV3Layout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull NaviBlocksV3VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        BlockV3View blockV3View = this.purchaseBlock;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, blockHeight, 1.0f);
        layoutParams.setMarginStart(UiExtKt.toPx(item.getCentralBlockMargin().getPx()));
        layoutParams.setMarginEnd(UiExtKt.toPx(item.getCentralBlockMargin().getPx()));
        blockV3View.setLayoutParams(layoutParams);
        setPadding(UiExtKt.toPx(item.getPaddings().getLeftPadding().getPx()), UiExtKt.toPx(item.getPaddings().getTopPadding().getPx()), UiExtKt.toPx(item.getPaddings().getRightPadding().getPx()), UiExtKt.toPx(item.getPaddings().getBottomPadding().getPx()));
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ViewExtKt.setBackgroundTint(this, styleParser.parseColor(context, item.getBackgroundColorToken(), UniColors.LAYER_FLOOR_1.getResId()));
    }

    @NotNull
    public final BlockV3View[] getViewBlocks() {
        return this.viewBlocks;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NaviBlocksV3Layout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, blockHeight, 1.0f);
        this.blockLayoutParams = layoutParams;
        int i12 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        AttributeSet attributeSet2 = null;
        int i13 = 0;
        BlockV3View blockV3View = new BlockV3View(context, attributeSet2, i13, i12, defaultConstructorMarker);
        blockV3View.setId(R$id.favBlock);
        blockV3View.setLayoutParams(layoutParams);
        this.favBlock = blockV3View;
        BlockV3View blockV3View2 = new BlockV3View(context, attributeSet2, i13, i12, defaultConstructorMarker);
        blockV3View2.setId(R$id.purchaseBlock);
        this.purchaseBlock = blockV3View2;
        BlockV3View blockV3View3 = new BlockV3View(context, attributeSet2, i13, i12, defaultConstructorMarker);
        blockV3View3.setId(R$id.reviewBlock);
        blockV3View3.setLayoutParams(layoutParams);
        this.reviewBlock = blockV3View3;
        this.viewBlocks = new BlockV3View[]{blockV3View, blockV3View2, blockV3View3};
        setOrientation(0);
        setWeightSum(3.0f);
        addView(blockV3View);
        addView(blockV3View2);
        addView(blockV3View3);
        setBackground(new GradientDrawable());
    }
}
