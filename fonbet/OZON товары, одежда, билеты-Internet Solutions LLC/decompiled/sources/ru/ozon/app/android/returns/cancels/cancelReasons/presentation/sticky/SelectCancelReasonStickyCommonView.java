package ru.ozon.app.android.returns.cancels.cancelReasons.presentation.sticky;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/sticky/SelectCancelReasonStickyCommonView;", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/sticky/SelectCancelReasonStickyView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "horizontalMargin", "verticalMargin", "bottomMarginButton", "cornerRadius", "", "strokeWidth", "cellView", "Lru/ozon/uni/android/cell/CellView;", "getCellView", "()Lru/ozon/uni/android/cell/CellView;", "buttonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getButtonView", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "captionView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getCaptionView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "createTopRoundedBackground", "Landroid/graphics/drawable/Drawable;", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SelectCancelReasonStickyCommonView extends LinearLayout implements SelectCancelReasonStickyView {
    private final int bottomMarginButton;

    @NotNull
    private final ButtonV3View buttonView;

    @NotNull
    private final TextAtomV2View captionView;

    @NotNull
    private final CellView cellView;
    private final float cornerRadius;
    private final int horizontalMargin;
    private final int strokeWidth;
    private final int verticalMargin;

    public /* synthetic */ SelectCancelReasonStickyCommonView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final Drawable createTopRoundedBackground() {
        float f7 = this.cornerRadius;
        float[] fArr = {f7, f7, f7, f7, 0.0f, 0.0f, 0.0f, 0.0f};
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke(this.strokeWidth, a.getColor(getContext(), UniColors.GRAPHIC_DISABLED.getResId()));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadii(fArr);
        gradientDrawable2.setColor(a.getColor(getContext(), UniColors.LAYER_FLOOR_1.getResId()));
        int i11 = this.strokeWidth;
        return new LayerDrawable(new Drawable[]{gradientDrawable, new InsetDrawable((Drawable) gradientDrawable2, i11, i11, i11, 0)});
    }

    @Override // ru.ozon.app.android.returns.cancels.cancelReasons.presentation.sticky.SelectCancelReasonStickyView
    @NotNull
    public ButtonV3View getButtonView() {
        return this.buttonView;
    }

    @Override // ru.ozon.app.android.returns.cancels.cancelReasons.presentation.sticky.SelectCancelReasonStickyView
    @NotNull
    public TextAtomV2View getCaptionView() {
        return this.captionView;
    }

    @Override // ru.ozon.app.android.returns.cancels.cancelReasons.presentation.sticky.SelectCancelReasonStickyView
    @NotNull
    public CellView getCellView() {
        return this.cellView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectCancelReasonStickyCommonView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(8, context);
        this.horizontalMargin = px;
        int px2 = UiExtKt.toPx(8, context);
        this.verticalMargin = px2;
        int px3 = UiExtKt.toPx(8, context);
        this.bottomMarginButton = px3;
        this.cornerRadius = ResourceExtKt.toPxF(20, context);
        int px4 = UiExtKt.toPx(1);
        this.strokeWidth = px4;
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        cellView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(px);
        layoutParams.setMarginEnd(px);
        layoutParams.bottomMargin = px2;
        cellView.setLayoutParams(layoutParams);
        ViewExtKt.gone(cellView);
        addView(cellView);
        this.cellView = cellView;
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        buttonV3View.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMarginStart(px);
        layoutParams2.setMarginEnd(px);
        layoutParams2.bottomMargin = px3;
        buttonV3View.setLayoutParams(layoutParams2);
        addView(buttonV3View);
        this.buttonView = buttonV3View;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMarginStart(px);
        layoutParams3.setMarginEnd(px);
        textAtomV2View.setLayoutParams(layoutParams3);
        addView(textAtomV2View);
        this.captionView = textAtomV2View;
        setId(View.generateViewId());
        setBackground(createTopRoundedBackground());
        setOrientation(1);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMarginStart(px4 * (-1));
        marginLayoutParams.setMarginEnd(px4 * (-1));
        setLayoutParams(marginLayoutParams);
        setPadding(px4, px2, px4, getPaddingBottom());
    }
}
