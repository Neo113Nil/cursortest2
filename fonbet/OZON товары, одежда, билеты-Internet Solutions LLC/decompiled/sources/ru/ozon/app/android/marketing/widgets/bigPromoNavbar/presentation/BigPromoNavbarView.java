package ru.ozon.app.android.marketing.widgets.bigPromoNavbar.presentation;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u0000 ,2\u00020\u0001:\u0001,B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0007H\u0014J0\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0007H\u0014R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006-"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/presentation/BigPromoNavbarView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dp1", "", "dp6", "dp8", "dp16", "horizontalMargin", "cornerRadius", "titleWidth", "backgroundImage", "Landroidx/appcompat/widget/AppCompatImageView;", "getBackgroundImage", "()Landroidx/appcompat/widget/AppCompatImageView;", "cornerImage", "getCornerImage", "timerView", "Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/presentation/BigPromoTimerView;", "getTimerView", "()Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/presentation/BigPromoTimerView;", "titleView", "Landroidx/appcompat/widget/AppCompatTextView;", "getTitleView", "()Landroidx/appcompat/widget/AppCompatTextView;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "l", "t", "r", "b", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BigPromoNavbarView extends ViewGroup {

    @NotNull
    private final AppCompatImageView backgroundImage;

    @NotNull
    private final AppCompatImageView cornerImage;
    private final float cornerRadius;
    private final float dp1;
    private final int dp16;
    private final int dp6;
    private final int dp8;
    private final int horizontalMargin;

    @NotNull
    private final BigPromoTimerView timerView;

    @NotNull
    private final AppCompatTextView titleView;
    private final int titleWidth;
    public static final int $stable = 8;

    public /* synthetic */ BigPromoNavbarView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final AppCompatImageView getBackgroundImage() {
        return this.backgroundImage;
    }

    @NotNull
    public final AppCompatImageView getCornerImage() {
        return this.cornerImage;
    }

    @NotNull
    public final BigPromoTimerView getTimerView() {
        return this.timerView;
    }

    @NotNull
    public final AppCompatTextView getTitleView() {
        return this.titleView;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t2, int r11, int b11) {
        View ifNotGone = ViewExtKt.getIfNotGone(this.backgroundImage);
        if (ifNotGone != null) {
            LayoutExtKt.layoutLeftTop(ifNotGone, 0, 0);
        }
        LayoutExtKt.layoutRightBottom(this.cornerImage, getMeasuredWidth(), getMeasuredHeight());
        LayoutExtKt.layoutLeftTop(this.titleView, this.horizontalMargin, this.dp6);
        LayoutExtKt.layoutLeftTop(this.timerView, this.horizontalMargin, this.titleView.getBottom() + this.dp8);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        MeasureExtKt.measure(this.titleView, this.titleWidth, LinearLayoutManager.INVALID_OFFSET, 0, 0);
        MeasureExtKt.measure(this.timerView, size - (this.horizontalMargin * 2), LinearLayoutManager.INVALID_OFFSET, 0, 0);
        int measuredHeight = this.timerView.getMeasuredHeight() + this.titleView.getMeasuredHeight() + this.dp6 + this.dp8 + this.dp16;
        View ifNotGone = ViewExtKt.getIfNotGone(this.backgroundImage);
        if (ifNotGone != null) {
            MeasureExtKt.measureExactly(ifNotGone, size, measuredHeight);
        }
        MeasureExtKt.measure(this.cornerImage, 0, 0, measuredHeight, 1073741824);
        setMeasuredDimension(size, measuredHeight);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigPromoNavbarView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp1 = ResourceExtKt.toPxF(1);
        this.dp6 = ResourceExtKt.toPx(6);
        this.dp8 = ResourceExtKt.toPx(8);
        this.dp16 = ResourceExtKt.toPx(16);
        this.horizontalMargin = ResourceExtKt.toPx(16, context);
        this.cornerRadius = ResourceExtKt.toPxF(16, context);
        this.titleWidth = ResourceExtKt.toPx(256, context);
        AppCompatImageView appCompatImageView = (AppCompatImageView) q.f64554a.i(N.b(AppCompatImageView.class), context);
        appCompatImageView = appCompatImageView == null ? new AppCompatImageView(context) : appCompatImageView;
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        float[] fArr = new float[8];
        for (int i13 = 0; i13 < 8; i13++) {
            fArr[i13] = this.cornerRadius;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(0);
        appCompatImageView.setBackground(shapeDrawable);
        appCompatImageView.setClipToOutline(true);
        addView(appCompatImageView);
        this.backgroundImage = appCompatImageView;
        q qVar = q.f64554a;
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) qVar.i(N.b(AppCompatImageView.class), context);
        appCompatImageView2 = appCompatImageView2 == null ? new AppCompatImageView(context) : appCompatImageView2;
        appCompatImageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        appCompatImageView2.setClipToOutline(true);
        appCompatImageView2.setAdjustViewBounds(true);
        addView(appCompatImageView2);
        this.cornerImage = appCompatImageView2;
        BigPromoTimerView bigPromoTimerView = new BigPromoTimerView(context, null, 0, 0, 14, null);
        bigPromoTimerView.setContentDescription("bigPromoTimerView");
        addView(bigPromoTimerView);
        this.timerView = bigPromoTimerView;
        AppCompatTextView appCompatTextView = (AppCompatTextView) qVar.i(N.b(AppCompatTextView.class), context);
        appCompatTextView = appCompatTextView == null ? new AppCompatTextView(context) : appCompatTextView;
        appCompatTextView.setTextAppearance(UniTextStyles.HEADLINE_COMPACT_400_MEDIUM.getResId());
        appCompatTextView.setGravity(8388611);
        appCompatTextView.setLineSpacing(this.dp1, 1.0f);
        appCompatTextView.setMaxLines(2);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        addView(appCompatTextView);
        this.titleView = appCompatTextView;
    }
}
