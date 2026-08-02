package ru.ozon.app.android.geo.addressBookBarV2.presentation;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.core.R$style;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 H2\u00020\u0001:\u0001HB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$J#\u0010%\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b%\u0010&J!\u0010*\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0001\u0010)\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+J!\u0010,\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0001\u0010)\u001a\u00020\u0006¢\u0006\u0004\b,\u0010+R\"\u0010-\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0014\"\u0004\b0\u0010\u0012R\u0017\u00101\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u0010\u0014R\u0014\u00103\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010.R\u0014\u00104\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010.R\u0014\u00105\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010.R\u0014\u00106\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010.R\u0014\u00107\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010.R\u0014\u00108\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010.R\u0014\u00109\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010.R\u0014\u0010:\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010.R\u0016\u0010;\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010.R\u0016\u0010<\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010.R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010CR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lru/ozon/app/android/geo/addressBookBarV2/presentation/RightLeftTitlesCellV2View;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "measureIconView", "()V", "measureDisclosureView", "measureLeftTitle", "width", "measureRightTitle", "(I)V", "getDisclosureLeftMargin", "()I", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "iconRes", "iconColor", "setIcon", "(Ljava/lang/Integer;I)V", "setDisclosureIcon", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleColor", "setLeftTitle", "(Ljava/lang/String;I)V", "setRightTitle", "leftRightPadding", "I", "getLeftRightPadding", "setLeftRightPadding", "dp16", "getDp16", "dp4", "dp8", "dp10", "dp12", "dp24", "iconSize", "disclosureSize", "topBottomPadding", "iconRightPadding", "iconTopBottomPadding", "Landroidx/appcompat/widget/AppCompatImageView;", "iconView", "Landroidx/appcompat/widget/AppCompatImageView;", "disclosureView", "Landroidx/appcompat/widget/AppCompatTextView;", "leftTitleView", "Landroidx/appcompat/widget/AppCompatTextView;", "rightTitleView", "Landroid/graphics/Rect;", "rightTitleBounds", "Landroid/graphics/Rect;", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RightLeftTitlesCellV2View extends ViewGroup {
    private final int disclosureSize;

    @NotNull
    private final AppCompatImageView disclosureView;
    private final int dp10;
    private final int dp12;
    private final int dp16;
    private final int dp24;
    private final int dp4;
    private final int dp8;
    private int iconRightPadding;
    private final int iconSize;
    private int iconTopBottomPadding;

    @NotNull
    private final AppCompatImageView iconView;
    private int leftRightPadding;

    @NotNull
    private final AppCompatTextView leftTitleView;

    @NotNull
    private final Rect rightTitleBounds;

    @NotNull
    private final AppCompatTextView rightTitleView;
    private final int topBottomPadding;

    public /* synthetic */ RightLeftTitlesCellV2View(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final int getDisclosureLeftMargin() {
        if (this.disclosureView.getVisibility() == 0) {
            return this.dp4;
        }
        return 0;
    }

    private final void measureDisclosureView() {
        if (this.disclosureView.getVisibility() == 0) {
            AppCompatImageView appCompatImageView = this.disclosureView;
            int i11 = this.disclosureSize;
            MeasureExtKt.measureExactly(appCompatImageView, i11, i11);
        }
    }

    private final void measureIconView() {
        if (this.iconView.getVisibility() == 0) {
            AppCompatImageView appCompatImageView = this.iconView;
            int i11 = this.iconSize;
            MeasureExtKt.measureExactly(appCompatImageView, i11, i11);
        }
    }

    private final void measureLeftTitle() {
        if (this.leftTitleView.getVisibility() == 0) {
            MeasureExtKt.measureUnspecified(this.leftTitleView);
        }
    }

    private final void measureRightTitle(int width) {
        if (this.rightTitleView.getVisibility() == 0) {
            int measuredWidth = this.iconView.getVisibility() == 0 ? this.iconView.getMeasuredWidth() + this.iconRightPadding : 0;
            MeasureExtKt.measure(this.rightTitleView, Math.max(((((width - (this.leftRightPadding * 2)) - measuredWidth) - getDisclosureLeftMargin()) - (this.disclosureView.getVisibility() == 0 ? this.disclosureView.getMeasuredWidth() : 0)) - (this.leftTitleView.getVisibility() == 0 ? this.leftTitleView.getMeasuredWidth() : 0), 0), 1073741824, 0, 0);
        }
    }

    public final int getDp16() {
        return this.dp16;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int width;
        int i11 = this.leftRightPadding;
        if (this.iconView.getVisibility() == 0) {
            LayoutExtKt.layoutLeftTop(this.iconView, i11, this.iconTopBottomPadding);
            i11 += this.iconView.getMeasuredWidth() + this.iconRightPadding;
        }
        if (this.leftTitleView.getVisibility() == 0) {
            LayoutExtKt.layoutLeftTop(this.leftTitleView, i11, this.topBottomPadding);
            i11 += this.leftTitleView.getMeasuredWidth();
        }
        if (this.rightTitleView.getVisibility() == 0) {
            LayoutExtKt.layoutLeftTop(this.rightTitleView, i11, this.topBottomPadding);
            if (this.rightTitleView.getLayout() == null) {
                width = this.rightTitleView.getMeasuredWidth();
            } else {
                this.rightTitleView.getPaint().getTextBounds(this.rightTitleView.getLayout().getText().toString(), 0, this.rightTitleView.getText().length(), this.rightTitleBounds);
                width = this.rightTitleBounds.width();
            }
            i11 += width + getDisclosureLeftMargin();
        }
        if (this.disclosureView.getVisibility() == 0) {
            LayoutExtKt.layoutLeftTop(this.disclosureView, i11, ((bottom - top) / 2) - (this.disclosureView.getMeasuredHeight() / 2));
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        measureIconView();
        measureDisclosureView();
        measureLeftTitle();
        measureRightTitle(size);
        setMeasuredDimension(size, (this.topBottomPadding * 2) + Math.max(this.leftTitleView.getMeasuredHeight(), this.rightTitleView.getMeasuredHeight()));
    }

    public final void setDisclosureIcon(Integer iconRes, Integer iconColor) {
        AppCompatImageView appCompatImageView = this.disclosureView;
        if (iconRes == null) {
            ViewExtKt.gone(appCompatImageView);
            return;
        }
        appCompatImageView.setImageResource(iconRes.intValue());
        ThemeExtKt.tint(appCompatImageView, iconColor);
        ViewExtKt.show(appCompatImageView);
    }

    public final void setIcon(Integer iconRes, int iconColor) {
        AppCompatImageView appCompatImageView = this.iconView;
        if (iconRes == null) {
            this.iconRightPadding = 0;
            this.iconTopBottomPadding = 0;
            ViewExtKt.gone(appCompatImageView);
        } else {
            appCompatImageView.setImageResource(iconRes.intValue());
            ThemeExtKt.tint(appCompatImageView, Integer.valueOf(iconColor));
            this.iconRightPadding = this.dp8;
            this.iconTopBottomPadding = this.dp10;
            ViewExtKt.show(appCompatImageView);
        }
    }

    public final void setLeftRightPadding(int i11) {
        this.leftRightPadding = i11;
    }

    public final void setLeftTitle(String title, int titleColor) {
        AppCompatTextView appCompatTextView = this.leftTitleView;
        TextViewExtKt.setTextOrGone(appCompatTextView, title);
        appCompatTextView.setTextColor(titleColor);
    }

    public final void setRightTitle(String title, int titleColor) {
        AppCompatTextView appCompatTextView = this.rightTitleView;
        TextViewExtKt.setTextOrGone(appCompatTextView, title);
        appCompatTextView.setTextColor(titleColor);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RightLeftTitlesCellV2View(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp16 = ResourceExtKt.toPx(16);
        this.dp4 = ResourceExtKt.toPx(4);
        this.dp8 = ResourceExtKt.toPx(8);
        this.dp10 = ResourceExtKt.toPx(10);
        int px = ResourceExtKt.toPx(12);
        this.dp12 = px;
        int px2 = ResourceExtKt.toPx(24);
        this.dp24 = px2;
        this.iconSize = px2;
        this.disclosureSize = px;
        this.topBottomPadding = px;
        q qVar = q.f64554a;
        AppCompatImageView appCompatImageView = (AppCompatImageView) qVar.i(N.b(AppCompatImageView.class), context);
        appCompatImageView = appCompatImageView == null ? new AppCompatImageView(context) : appCompatImageView;
        appCompatImageView.setContentDescription("icon");
        addView(appCompatImageView);
        this.iconView = appCompatImageView;
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) qVar.i(N.b(AppCompatImageView.class), context);
        appCompatImageView2 = appCompatImageView2 == null ? new AppCompatImageView(context) : appCompatImageView2;
        appCompatImageView2.setContentDescription("disclosure");
        addView(appCompatImageView2);
        this.disclosureView = appCompatImageView2;
        AppCompatTextView appCompatTextView = (AppCompatTextView) qVar.i(N.b(AppCompatTextView.class), context);
        appCompatTextView = appCompatTextView == null ? new AppCompatTextView(context) : appCompatTextView;
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setTextAppearance(R$style.OzonTextAppearance_Compact_500medium);
        appCompatTextView.setLetterSpacing(0.0f);
        appCompatTextView.setContentDescription("leftTitle");
        addView(appCompatTextView);
        this.leftTitleView = appCompatTextView;
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) qVar.i(N.b(AppCompatTextView.class), context);
        appCompatTextView2 = appCompatTextView2 == null ? new AppCompatTextView(context) : appCompatTextView2;
        appCompatTextView2.setMaxLines(1);
        appCompatTextView2.setTextAppearance(R$style.OzonTextAppearance_Compact_500medium);
        appCompatTextView2.setLetterSpacing(0.0f);
        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        appCompatTextView2.setContentDescription("rightTitle");
        addView(appCompatTextView2);
        this.rightTitleView = appCompatTextView2;
        this.rightTitleBounds = new Rect();
    }
}
