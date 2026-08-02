package ru.ozon.app.android.uikit.view.atoms.multilineBadge;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.R$layout;
import ru.ozon.app.android.uikit.databinding.MultilineBadgeViewBinding;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0014J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00152\b\b\u0001\u0010\u001c\u001a\u00020\bH\u0016J\u0006\u0010\u001d\u001a\u00020\u0015J\u000e\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\bJ\u000e\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\bJ\u000e\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\bJ\u000e\u0010'\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\rJ\u0015\u0010(\u001a\u00020\u00152\b\u0010)\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010*J\u0006\u0010+\u001a\u00020,R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/multilineBadge/MultilineBadgeView;", "Landroid/widget/LinearLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "minHeightContainer", "isFullWidth", "", "Ljava/lang/Boolean;", "appearance", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "Landroid/widget/TextView;", "binding", "Lru/ozon/app/android/uikit/databinding/MultilineBadgeViewBinding;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "setLayoutParams", "params", "Landroid/view/ViewGroup$LayoutParams;", "setBackgroundColor", "color", "setDefaultBackground", "setText", "text", "", "setTextStyle", "styleId", "setMinHeightContainer", "mMinHeight", "setMaxLines", "lines", "setFullWidth", "setImageTint", "tintColor", "(Ljava/lang/Integer;)V", "getMultilineBadgeImage", "Landroid/widget/ImageView;", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MultilineBadgeView extends LinearLayout implements AtomView {

    @NotNull
    private final StyleAppearance<TextView> appearance;

    @NotNull
    private final MultilineBadgeViewBinding binding;
    private Boolean isFullWidth;
    private int minHeightContainer;

    public /* synthetic */ MultilineBadgeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final ImageView getMultilineBadgeImage() {
        ImageView multilineBadgeImage = this.binding.multilineBadgeImage;
        Intrinsics.checkNotNullExpressionValue(multilineBadgeImage, "multilineBadgeImage");
        return multilineBadgeImage;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i11 = this.minHeightContainer;
        if (measuredHeight >= i11) {
            i11 = getMeasuredHeight();
        }
        setMeasuredDimension(measuredWidth, i11);
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        ViewExtKt.setBackgroundTint(this, color);
    }

    public final void setDefaultBackground() {
        setBackgroundResource(R$drawable.bg_multiline_badge_view);
    }

    public final void setFullWidth(boolean isFullWidth) {
        this.isFullWidth = Boolean.valueOf(isFullWidth);
    }

    public final void setImageTint(Integer tintColor) {
        ImageView multilineBadgeImage = this.binding.multilineBadgeImage;
        Intrinsics.checkNotNullExpressionValue(multilineBadgeImage, "multilineBadgeImage");
        ThemeExtKt.tint(multilineBadgeImage, tintColor);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams params) {
        if (params != null) {
            params.width = Intrinsics.d(this.isFullWidth, Boolean.TRUE) ? -1 : -2;
        }
        super.setLayoutParams(params);
    }

    public final void setMaxLines(int lines) {
        this.binding.textTv.setMaxLines(lines);
    }

    public final void setMinHeightContainer(int mMinHeight) {
        this.minHeightContainer = mMinHeight;
    }

    public final void setText(@NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextView textTv = this.binding.textTv;
        Intrinsics.checkNotNullExpressionValue(textTv, "textTv");
        TextViewExtKt.setTextOrGone(textTv, text);
    }

    public final void setTextStyle(int styleId) {
        StyleAppearance<TextView> styleAppearance = this.appearance;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        styleAppearance.read(context, styleId);
        StyleAppearance<TextView> styleAppearance2 = this.appearance;
        TextView textTv = this.binding.textTv;
        Intrinsics.checkNotNullExpressionValue(textTv, "textTv");
        styleAppearance2.apply(textTv);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultilineBadgeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.appearance = StyleAppearance.Companion.ofText$default(StyleAppearance.INSTANCE, null, 1, null);
        setOrientation(0);
        setGravity(23);
        setDefaultBackground();
        this.binding = MultilineBadgeViewBinding.bind(View.inflate(context, R$layout.multiline_badge_view, this));
    }
}
