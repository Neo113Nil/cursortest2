package ru.ozon.app.android.checkoutcomposer.split.presentation.elements.separator;

import Z1.h;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.checkout.data.Paddings;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.CommonCellSettingsKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/separator/SeparatorViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/separator/SeparatorVO;", "Landroid/widget/FrameLayout;", "view", "<init>", "(Landroid/widget/FrameLayout;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/separator/SeparatorVO;Ll20/d;)V", "Landroid/view/View;", "separator", "Landroid/view/View;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SeparatorViewHolder extends k<SeparatorVO> {

    @NotNull
    private final View separator;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int dp1 = UiExtKt.toPx(1);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/separator/SeparatorViewHolder$Companion;", "", "<init>", "()V", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorViewHolder(@NotNull FrameLayout view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View view2 = new View(view.getContext());
        view2.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, dp1));
        this.separator = view2;
        view.addView(view2);
        view.setBackgroundColor(a.getColor(getContext(), R$color.layer_floor_1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SeparatorVO item, @NotNull d info) {
        CommonCellSettings.LayoutPadding bottomPadding;
        h dp;
        CommonCellSettings.LayoutPadding topPadding;
        h dp2;
        CommonCellSettings.LayoutPadding rightPadding;
        h dp3;
        CommonCellSettings.LayoutPadding leftPadding;
        h dp4;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        View view = this.separator;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setBackgroundColor(styleParser.parseColor(context, item.getColor(), R$color.graphic_neutral));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Paddings paddings = item.getPaddings();
        int i11 = 0;
        int px = (paddings == null || (leftPadding = paddings.getLeftPadding()) == null || (dp4 = CommonCellSettingsKt.getDp(leftPadding)) == null) ? 0 : UiExtKt.toPx(dp4.d());
        Paddings paddings2 = item.getPaddings();
        int px2 = (paddings2 == null || (rightPadding = paddings2.getRightPadding()) == null || (dp3 = CommonCellSettingsKt.getDp(rightPadding)) == null) ? 0 : UiExtKt.toPx(dp3.d());
        Paddings paddings3 = item.getPaddings();
        int px3 = (paddings3 == null || (topPadding = paddings3.getTopPadding()) == null || (dp2 = CommonCellSettingsKt.getDp(topPadding)) == null) ? 0 : UiExtKt.toPx(dp2.d());
        Paddings paddings4 = item.getPaddings();
        if (paddings4 != null && (bottomPadding = paddings4.getBottomPadding()) != null && (dp = CommonCellSettingsKt.getDp(bottomPadding)) != null) {
            i11 = UiExtKt.toPx(dp.d());
        }
        marginLayoutParams.setMargins(px, px3, px2, i11);
        view.setLayoutParams(marginLayoutParams);
    }
}
