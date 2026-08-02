package ru.ozon.app.android.marketing.widgets.bigPromoNavbar.presentation;

import V.e;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.core.R$color;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 H2\u00020\u0001:\u0001HB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u0006*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010 \u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010#R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R.\u00102\u001a\u0004\u0018\u00010\u00062\b\u00101\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R*\u0010;\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b;\u0010#\u001a\u0004\b<\u0010=\"\u0004\b>\u0010\u000eR*\u0010?\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010#\u001a\u0004\b@\u0010=\"\u0004\bA\u0010\u000eR\u0017\u0010B\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010F\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010E¨\u0006I"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/presentation/BigPromoTimerView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "parentWidthMeasureSpec", "", "measureTimer", "(I)V", "Landroid/view/View;", "Landroidx/appcompat/widget/AppCompatTextView;", "getIfNotGoneAndEmpty", "(Landroid/view/View;)Landroidx/appcompat/widget/AppCompatTextView;", "centerY", "getTopByCenter", "(Landroid/view/View;I)I", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "dp2", "I", "dp4", "dp8", "", "timerRadius", "F", "timerContentHeight", "", "longestTime", "Ljava/lang/String;", "Landroidx/appcompat/widget/AppCompatImageView;", "timerDisclosure", "Landroidx/appcompat/widget/AppCompatImageView;", "timerImage", AppMeasurementSdk.ConditionalUserProperty.VALUE, "timerIcon", "Ljava/lang/Integer;", "getTimerIcon", "()Ljava/lang/Integer;", "setTimerIcon", "(Ljava/lang/Integer;)V", "Landroid/graphics/drawable/ShapeDrawable;", "timerShape", "Landroid/graphics/drawable/ShapeDrawable;", "timerBackgroundColor", "getTimerBackgroundColor", "()I", "setTimerBackgroundColor", "timerTextColor", "getTimerTextColor", "setTimerTextColor", "timerPart1", "Landroidx/appcompat/widget/AppCompatTextView;", "getTimerPart1", "()Landroidx/appcompat/widget/AppCompatTextView;", "timerPart2", "getTimerPart2", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BigPromoTimerView extends ViewGroup {
    private final int dp2;
    private final int dp4;
    private final int dp8;

    @NotNull
    private final String longestTime;
    private int timerBackgroundColor;
    private final int timerContentHeight;

    @NotNull
    private final AppCompatImageView timerDisclosure;
    private Integer timerIcon;

    @NotNull
    private final AppCompatImageView timerImage;

    @NotNull
    private final AppCompatTextView timerPart1;

    @NotNull
    private final AppCompatTextView timerPart2;
    private final float timerRadius;

    @NotNull
    private final ShapeDrawable timerShape;
    private int timerTextColor;
    public static final int $stable = 8;

    public /* synthetic */ BigPromoTimerView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final AppCompatTextView getIfNotGoneAndEmpty(View view) {
        AppCompatTextView appCompatTextView = view instanceof AppCompatTextView ? (AppCompatTextView) view : null;
        if (appCompatTextView != null) {
            CharSequence text = appCompatTextView.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            if (text.length() > 0 && appCompatTextView.getVisibility() != 8) {
                return appCompatTextView;
            }
        }
        return null;
    }

    private final int getTopByCenter(View view, int i11) {
        return i11 - (view.getMeasuredHeight() / 2);
    }

    private final void measureTimer(int parentWidthMeasureSpec) {
        int size = View.MeasureSpec.getSize(parentWidthMeasureSpec);
        CharSequence text = this.timerPart1.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(text.length() > 0 ? (int) this.timerPart1.getPaint().measureText(this.longestTime) : 0, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        View ifNotGone = ViewExtKt.getIfNotGone(this.timerDisclosure);
        if (ifNotGone != null) {
            MeasureExtKt.measureUnspecified(ifNotGone);
        }
        View ifNotGone2 = ViewExtKt.getIfNotGone(this.timerImage);
        if (ifNotGone2 != null) {
            MeasureExtKt.measureUnspecified(ifNotGone2);
        }
        this.timerPart1.measure(makeMeasureSpec, makeMeasureSpec2);
        this.timerPart2.measure(View.MeasureSpec.makeMeasureSpec(((((size - this.dp8) - this.dp2) - (ViewExtKt.getIfNotGone(this.timerImage) != null ? this.timerImage.getMeasuredWidth() + this.dp4 : 0)) - (getIfNotGoneAndEmpty(this.timerPart1) != null ? this.timerPart1.getMeasuredWidth() + this.dp2 : 0)) - (ViewExtKt.getIfNotGone(this.timerDisclosure) != null ? this.dp2 + this.timerDisclosure.getMeasuredWidth() : 0), LinearLayoutManager.INVALID_OFFSET), makeMeasureSpec2);
    }

    @NotNull
    public final AppCompatTextView getTimerPart1() {
        return this.timerPart1;
    }

    @NotNull
    public final AppCompatTextView getTimerPart2() {
        return this.timerPart2;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t2, int r11, int b11) {
        int i11;
        int right;
        int i12;
        int measuredHeight = getMeasuredHeight() / 2;
        View ifNotGone = ViewExtKt.getIfNotGone(this.timerImage);
        if (ifNotGone != null) {
            LayoutExtKt.layoutLeftTop(ifNotGone, this.dp8, getTopByCenter(this.timerImage, measuredHeight));
        }
        LayoutExtKt.layoutLeftTop(this.timerPart1, ViewExtKt.getIfNotGone(this.timerImage) != null ? this.timerImage.getRight() + this.dp4 : this.dp8, getTopByCenter(this.timerPart1, measuredHeight));
        AppCompatTextView appCompatTextView = this.timerPart2;
        AppCompatTextView ifNotGoneAndEmpty = getIfNotGoneAndEmpty(this.timerPart1);
        if (ifNotGoneAndEmpty != null) {
            right = ifNotGoneAndEmpty.getRight();
            i12 = this.dp2;
        } else {
            if (ViewExtKt.getIfNotGone(this.timerImage) == null) {
                i11 = this.dp8;
                LayoutExtKt.layoutLeftTop(appCompatTextView, i11, getTopByCenter(this.timerPart2, measuredHeight));
                LayoutExtKt.layoutLeftTop(this.timerDisclosure, this.timerPart2.getRight() + this.dp2, getTopByCenter(this.timerDisclosure, measuredHeight));
            }
            right = this.timerImage.getRight();
            i12 = this.dp4;
        }
        i11 = right + i12;
        LayoutExtKt.layoutLeftTop(appCompatTextView, i11, getTopByCenter(this.timerPart2, measuredHeight));
        LayoutExtKt.layoutLeftTop(this.timerDisclosure, this.timerPart2.getRight() + this.dp2, getTopByCenter(this.timerDisclosure, measuredHeight));
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        measureTimer(widthMeasureSpec);
        View ifNotGone = ViewExtKt.getIfNotGone(this.timerImage);
        int measuredWidth = ifNotGone != null ? ifNotGone.getMeasuredWidth() + this.dp4 : 0;
        AppCompatTextView ifNotGoneAndEmpty = getIfNotGoneAndEmpty(this.timerPart1);
        int measuredWidth2 = ifNotGoneAndEmpty != null ? ifNotGoneAndEmpty.getMeasuredWidth() + this.dp2 : 0;
        int measuredWidth3 = this.timerPart2.getMeasuredWidth();
        int i11 = this.dp2;
        View ifNotGone2 = ViewExtKt.getIfNotGone(this.timerDisclosure);
        setMeasuredDimension(this.dp8 + measuredWidth + measuredWidth2 + measuredWidth3 + i11 + (ifNotGone2 != null ? ifNotGone2.getMeasuredWidth() + this.dp2 : 0), this.timerContentHeight);
    }

    public final void setTimerBackgroundColor(int i11) {
        this.timerBackgroundColor = i11;
        this.timerShape.getPaint().setColor(i11);
        setBackground(this.timerShape);
    }

    public final void setTimerIcon(Integer num) {
        this.timerIcon = num;
        this.timerImage.setVisibility(num != null ? 0 : 8);
        if (num != null) {
            this.timerImage.setImageResource(num.intValue());
        }
    }

    public final void setTimerTextColor(int i11) {
        this.timerTextColor = i11;
        this.timerPart1.setTextColor(i11);
        this.timerPart2.setTextColor(i11);
        ThemeExtKt.tint(this.timerDisclosure, Integer.valueOf(i11));
        ThemeExtKt.tint(this.timerImage, Integer.valueOf(i11));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigPromoTimerView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp2 = ResourceExtKt.toPx(2);
        this.dp4 = ResourceExtKt.toPx(4);
        this.dp8 = ResourceExtKt.toPx(8);
        this.timerRadius = ResourceExtKt.toPxF(6);
        this.timerContentHeight = ResourceExtKt.toPx(20);
        this.longestTime = e.b(new Object[]{"00", "00", "00"}, 3, "%s\u2009:\u2009%s\u2009:\u2009%s", "format(...)");
        q qVar = q.f64554a;
        AppCompatImageView appCompatImageView = (AppCompatImageView) qVar.i(N.b(AppCompatImageView.class), context);
        appCompatImageView = appCompatImageView == null ? new AppCompatImageView(context) : appCompatImageView;
        appCompatImageView.setId(R$id.footerDisclosureIv);
        appCompatImageView.setImageResource(R$drawable.ic_s_disclosure_compact);
        addView(appCompatImageView);
        this.timerDisclosure = appCompatImageView;
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) qVar.i(N.b(AppCompatImageView.class), context);
        appCompatImageView2 = appCompatImageView2 == null ? new AppCompatImageView(context) : appCompatImageView2;
        appCompatImageView2.setId(R$id.premiumIv);
        addView(appCompatImageView2);
        this.timerImage = appCompatImageView2;
        float[] fArr = new float[8];
        for (int i13 = 0; i13 < 8; i13++) {
            fArr[i13] = this.timerRadius;
        }
        this.timerShape = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        this.timerBackgroundColor = a.getColor(context, R$color.graphic_primary_on_light);
        this.timerTextColor = ThemeExtKt.themeColor(context, R$attr.textLightKey);
        q qVar2 = q.f64554a;
        AppCompatTextView appCompatTextView = (AppCompatTextView) qVar2.i(N.b(AppCompatTextView.class), context);
        appCompatTextView = appCompatTextView == null ? new AppCompatTextView(context) : appCompatTextView;
        UniTextStyles uniTextStyles = UniTextStyles.BODY_CONTROL_300_X_SMALL;
        appCompatTextView.setTextAppearance(uniTextStyles.getResId());
        appCompatTextView.setTextColor(this.timerTextColor);
        appCompatTextView.setGravity(16);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setIncludeFontPadding(false);
        appCompatTextView.setContentDescription("bigPromoTimerTextView1");
        addView(appCompatTextView);
        this.timerPart1 = appCompatTextView;
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) qVar2.i(N.b(AppCompatTextView.class), context);
        appCompatTextView2 = appCompatTextView2 == null ? new AppCompatTextView(context) : appCompatTextView2;
        appCompatTextView2.setTextAppearance(uniTextStyles.getResId());
        appCompatTextView2.setGravity(16);
        appCompatTextView2.setTextColor(this.timerTextColor);
        appCompatTextView2.setMaxLines(1);
        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView2.setIncludeFontPadding(false);
        appCompatTextView2.setContentDescription("bigPromoTimerTextView2");
        addView(appCompatTextView2);
        this.timerPart2 = appCompatTextView2;
    }
}
