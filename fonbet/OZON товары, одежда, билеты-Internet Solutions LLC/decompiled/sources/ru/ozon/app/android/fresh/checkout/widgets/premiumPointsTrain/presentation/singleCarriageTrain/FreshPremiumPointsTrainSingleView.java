package ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.singleCarriageTrain;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.R$drawable;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.common.CarriageUtilsKt;
import ru.ozon.app.android.fresh.common.utils.ExtentionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/singleCarriageTrain/FreshPremiumPointsTrainSingleView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "titleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "iconIv", "Landroid/widget/ImageView;", "getIconIv", "()Landroid/widget/ImageView;", "iconDisclosure", "linearContainer", "Landroid/widget/LinearLayout;", "getLinearContainer", "()Landroid/widget/LinearLayout;", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshPremiumPointsTrainSingleView extends FrameLayout {

    @NotNull
    private final ImageView iconDisclosure;

    @NotNull
    private final ImageView iconIv;

    @NotNull
    private final LinearLayout linearContainer;

    @NotNull
    private final TextAtomV2View titleTav;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DP_4 = UiExtKt.toPx(4);
    private static final int DP_8 = UiExtKt.toPx(8);
    private static final int DP_12 = UiExtKt.toPx(12);
    private static final int DP_16 = UiExtKt.toPx(16);
    private static final int DP_36 = UiExtKt.toPx(36);
    private static final int DP_20 = UiExtKt.toPx(20);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/singleCarriageTrain/FreshPremiumPointsTrainSingleView$Companion;", "", "<init>", "()V", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ FreshPremiumPointsTrainSingleView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final ImageView getIconIv() {
        return this.iconIv;
    }

    @NotNull
    public final LinearLayout getLinearContainer() {
        return this.linearContainer;
    }

    @NotNull
    public final TextAtomV2View getTitleTav() {
        return this.titleTav;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreshPremiumPointsTrainSingleView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.premiumPointsTitle);
        textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        this.titleTav = textAtomV2View;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R$id.premiumPointsIconView);
        int i13 = DP_20;
        appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(i13, i13));
        appCompatImageView.setBackgroundResource(R$drawable.bg_premium_points_train_icon);
        appCompatImageView.setImageResource(R$drawable.bg_premium_points_train_icon);
        this.iconIv = appCompatImageView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setId(R$id.premiumPointsIconDisclosure);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(DP_4, 0, 0, 0);
        appCompatImageView2.setLayoutParams(layoutParams);
        appCompatImageView2.setImageResource(ru.ozon.uni.core.R$drawable.ic_s_disclosure);
        this.iconDisclosure = appCompatImageView2;
        LinearLayout linearLayout = new LinearLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, DP_36);
        int i14 = DP_16;
        marginLayoutParams.setMargins(i14, 0, i14, 0);
        linearLayout.setLayoutParams(marginLayoutParams);
        linearLayout.setPadding(DP_12, 0, i14, 0);
        CarriageUtilsKt.setCarriageAppearance(linearLayout);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView(textAtomV2View);
        linearLayout.addView(appCompatImageView);
        linearLayout.addView(appCompatImageView2);
        this.linearContainer = linearLayout;
        setId(R$id.premiumPointsTrainViewWrapper);
        setLayoutParams(ExtentionsKt.createDefaultMarginLayoutParams());
        setPadding(0, DP_8, 0, i14);
        setClipChildren(false);
        setClipToPadding(false);
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.oz_semantic_bg_secondary));
        addView(linearLayout);
    }
}
