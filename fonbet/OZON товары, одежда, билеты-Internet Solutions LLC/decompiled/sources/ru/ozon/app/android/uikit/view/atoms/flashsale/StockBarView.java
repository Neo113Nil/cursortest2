package ru.ozon.app.android.uikit.view.atoms.flashsale;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.databinding.StockBarViewBinding;
import ru.ozon.app.android.uikit.view.progress.OzProgressBar;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$dimen;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0001\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010 \u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00132\b\b\u0001\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b \u0010!R*\u0010#\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%\"\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/flashsale/StockBarView;", "Landroid/widget/LinearLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "percent", "setProgress", "(I)V", "", "progressColor", "setProgressColor", "(Ljava/lang/String;)V", "", "hasBorder", "progressBackgroundColor", "setProgressBackgroundColor", "(Ljava/lang/Boolean;I)V", "", "text", "textColor", "textStyle", "setText", "(Ljava/lang/CharSequence;Ljava/lang/String;I)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isFullWidth", "Z", "()Z", "setFullWidth", "(Z)V", "stockBarMaxWidthDp", "I", "Lru/ozon/app/android/uikit/databinding/StockBarViewBinding;", "binding", "Lru/ozon/app/android/uikit/databinding/StockBarViewBinding;", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StockBarView extends LinearLayout implements AtomView {

    @NotNull
    private final StockBarViewBinding binding;
    private boolean isFullWidth;
    private final int stockBarMaxWidthDp;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StockBarView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i11;
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        if (!this.isFullWidth && 1 <= (i11 = this.stockBarMaxWidthDp) && i11 < size) {
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.stockBarMaxWidthDp, View.MeasureSpec.getMode(widthMeasureSpec));
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final void setFullWidth(boolean z11) {
        if (this.isFullWidth != z11) {
            this.isFullWidth = z11;
            requestLayout();
        }
    }

    public final void setProgress(int percent) {
        this.binding.stockProgressView.setProgress(percent);
    }

    public final void setProgressBackgroundColor(Boolean hasBorder, int progressBackgroundColor) {
        OzProgressBar ozProgressBar = this.binding.stockProgressView;
        ozProgressBar.setHasBorder(hasBorder != null ? hasBorder.booleanValue() : false);
        ozProgressBar.setBarColor(progressBackgroundColor);
    }

    public final void setProgressColor(String progressColor) {
        OzProgressBar ozProgressBar = this.binding.stockProgressView;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ozProgressBar.setFillColor(styleParser.parseColor(context, progressColor, StyleParser.OzColor.OZ_SEMANTIC_COLOR_ACCENT_ALERT));
    }

    public final void setText(@NotNull CharSequence text, String textColor, int textStyle) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.binding.stockBarText.setTextAppearance(textStyle);
        this.binding.stockBarText.setText(text);
        TextView textView = this.binding.stockBarText;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setTextColor(styleParser.parseColor(context, textColor, StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY));
    }

    public /* synthetic */ StockBarView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StockBarView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.stockBarMaxWidthDp = ResourceExtKt.toPx(148);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        StockBarViewBinding inflate = StockBarViewBinding.inflate(LayoutInflater.from(context), this);
        this.binding = inflate;
        inflate.stockProgressView.setBarColor(a.getColor(context, R$color.oz_gray_70));
        inflate.stockProgressView.setCornerRadius(context.getResources().getDimensionPixelSize(R$dimen.design_default_radius));
    }
}
