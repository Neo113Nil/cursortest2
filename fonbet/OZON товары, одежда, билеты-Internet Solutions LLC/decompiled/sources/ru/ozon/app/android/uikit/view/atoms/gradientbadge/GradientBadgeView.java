package ru.ozon.app.android.uikit.view.atoms.gradientbadge;

import Sc.InterfaceC3999a;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.View;
import androidx.core.content.res.g;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$font;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 n2\u00020\u00012\u00020\u0002:\u0001nB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u00020\r2\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\rH\u0002¢\u0006\u0004\b&\u0010'J!\u0010+\u001a\u00020\r2\u0006\u0010)\u001a\u00020(2\b\b\u0001\u0010*\u001a\u00020\u0007H\u0002¢\u0006\u0004\b+\u0010,J\u001b\u0010/\u001a\u00020-*\u00020(2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u0013\u00101\u001a\u00020-*\u00020(H\u0002¢\u0006\u0004\b1\u00102J\u0013\u00103\u001a\u00020\r*\u00020\u0010H\u0002¢\u0006\u0004\b3\u0010\u0013J\u0013\u00104\u001a\u00020\r*\u00020\u0010H\u0002¢\u0006\u0004\b4\u0010\u0013J\u0015\u00105\u001a\u0004\u0018\u00010\r*\u00020\u0010H\u0002¢\u0006\u0004\b5\u00106J\u001d\u00109\u001a\u00020\r*\u0002072\b\b\u0001\u00108\u001a\u00020\u0007H\u0002¢\u0006\u0004\b9\u0010:R*\u0010\u0015\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R*\u0010A\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR*\u0010G\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010B\u001a\u0004\bH\u0010D\"\u0004\bI\u0010FR*\u0010\u0016\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010<\u001a\u0004\bJ\u0010>\"\u0004\bK\u0010@R*\u0010L\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010B\u001a\u0004\bM\u0010D\"\u0004\bN\u0010FR.\u0010\u0017\u001a\u0004\u0018\u00010\u00142\b\u0010;\u001a\u0004\u0018\u00010\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010<\u001a\u0004\bO\u0010>\"\u0004\bP\u0010@R*\u0010Q\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010B\u001a\u0004\bR\u0010D\"\u0004\bS\u0010FR*\u0010T\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u00078\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bT\u0010B\u001a\u0004\bU\u0010D\"\u0004\bV\u0010FR\u0016\u0010W\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010<R\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R$\u0010^\u001a\u00020]2\u0006\u0010;\u001a\u00020]8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0014\u0010b\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010\\R\u0014\u0010c\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010e\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010dR\u0016\u00104\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010fR\u0018\u0010g\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010<R\u0014\u0010h\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010\\R\u0016\u0010i\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010dR\u0014\u0010j\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010dR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010m¨\u0006o"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/gradientbadge/GradientBadgeView;", "Landroid/view/View;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "primaryText", "secondaryText", "tertiaryText", "setTexts", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gradientStart", "gradientEnd", "setGradient", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "", "exactly", "maxWidth", "measureWidth", "(ZI)I", "maxHeight", "measureHeight", "(I)I", "measurePrimaryText", "()V", "Landroid/graphics/Paint;", "paint", "color", "updatePaintColor", "(Landroid/graphics/Paint;I)V", "", RichContentDTO.ALIGN_CENTER, "getBaseline", "(Landroid/graphics/Paint;F)F", "getTextHeight", "(Landroid/graphics/Paint;)F", "drawPrimary", "drawSecondary", "drawTertiary", "(Landroid/graphics/Canvas;)Lkotlin/Unit;", "Landroid/text/TextPaint;", "style", "applyStyle", "(Landroid/text/TextPaint;I)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ljava/lang/String;", "getPrimaryText", "()Ljava/lang/String;", "setPrimaryText", "(Ljava/lang/String;)V", "primaryTextColor", "I", "getPrimaryTextColor", "()I", "setPrimaryTextColor", "(I)V", "primaryTextBackgroundColor", "getPrimaryTextBackgroundColor", "setPrimaryTextBackgroundColor", "getSecondaryText", "setSecondaryText", "secondaryTextColor", "getSecondaryTextColor", "setSecondaryTextColor", "getTertiaryText", "setTertiaryText", "tertiaryTextColor", "getTertiaryTextColor", "setTertiaryTextColor", "primaryStyle", "getPrimaryStyle", "setPrimaryStyle", "primaryTextToDraw", "Landroid/graphics/drawable/ShapeDrawable;", "primaryBackground", "Landroid/graphics/drawable/ShapeDrawable;", "primaryPaint", "Landroid/text/TextPaint;", "Landroid/util/SizeF;", "primarySize", "Landroid/util/SizeF;", "setPrimarySize", "(Landroid/util/SizeF;)V", "secondaryPaint", "secondaryHeight", "F", "secondaryWidth", "Z", "tertiaryTextToDraw", "tertiaryPaint", "tertiaryWidth", "tertiaryHeight", "Landroid/graphics/drawable/GradientDrawable;", "gradientBackground", "Landroid/graphics/drawable/GradientDrawable;", "Companion", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GradientBadgeView extends View implements AtomView {

    @NotNull
    private static final int[] attrs;
    private boolean drawSecondary;

    @NotNull
    private final GradientDrawable gradientBackground;

    @NotNull
    private final ShapeDrawable primaryBackground;

    @NotNull
    private TextPaint primaryPaint;

    @NotNull
    private SizeF primarySize;
    private int primaryStyle;

    @NotNull
    private String primaryText;
    private int primaryTextBackgroundColor;
    private int primaryTextColor;

    @NotNull
    private String primaryTextToDraw;
    private final float secondaryHeight;

    @NotNull
    private final TextPaint secondaryPaint;

    @NotNull
    private String secondaryText;
    private int secondaryTextColor;
    private float secondaryWidth;
    private final float tertiaryHeight;

    @NotNull
    private final TextPaint tertiaryPaint;
    private String tertiaryText;
    private int tertiaryTextColor;
    private String tertiaryTextToDraw;
    private float tertiaryWidth;
    private static final float primaryPadding = ResourceExtKt.toPxF(4);
    private static final float secondaryMargin = ResourceExtKt.toPxF(6);
    private static final float tertiaryMargin = ResourceExtKt.toPxF(3);
    private static final float defaultTextSize = ResourceExtKt.toSpF(12);

    static {
        int[] iArr = {R.attr.fontFamily, R.attr.fontFeatureSettings, R.attr.letterSpacing, R.attr.textSize};
        C7705l.Z(iArr);
        attrs = iArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientBadgeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applyStyle(TextPaint textPaint, int i11) {
        Context context = getContext();
        int[] iArr = attrs;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, iArr);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        textPaint.setFontFeatureSettings(obtainStyledAttributes.getString(C7705l.L(iArr, R.attr.fontFeatureSettings)));
        textPaint.setLetterSpacing(obtainStyledAttributes.getFloat(C7705l.L(iArr, R.attr.letterSpacing), 0.0f));
        textPaint.setTypeface(g.e(obtainStyledAttributes.getResourceId(C7705l.L(iArr, R.attr.fontFamily), R$font.onest_regular), getContext()));
        textPaint.setTextSize(obtainStyledAttributes.getDimension(C7705l.L(iArr, R.attr.textSize), defaultTextSize));
        obtainStyledAttributes.recycle();
    }

    private final void drawPrimary(Canvas canvas) {
        this.primaryBackground.draw(canvas);
        canvas.drawText(this.primaryTextToDraw, primaryPadding, getBaseline(this.primaryPaint, this.primarySize.getHeight() / 2), this.primaryPaint);
    }

    private final void drawSecondary(Canvas canvas) {
        if (this.drawSecondary) {
            canvas.drawText(this.secondaryText, secondaryMargin, getBaseline(this.secondaryPaint, this.secondaryHeight / 2), this.secondaryPaint);
        }
    }

    private final Unit drawTertiary(Canvas canvas) {
        String str = this.tertiaryTextToDraw;
        if (str == null) {
            return null;
        }
        canvas.drawText(str, 0.0f, getBaseline(this.tertiaryPaint, this.tertiaryHeight / 2), this.tertiaryPaint);
        return Unit.f71690a;
    }

    private final float getBaseline(Paint paint, float f7) {
        return f7 - ((paint.ascent() + paint.descent()) / 2);
    }

    private final float getTextHeight(Paint paint) {
        return paint.descent() - paint.ascent();
    }

    private final int measureHeight(int maxHeight) {
        float height = this.primarySize.getHeight() + getPaddingBottom() + getPaddingTop();
        if (this.tertiaryText != null) {
            height += this.tertiaryHeight + tertiaryMargin;
        }
        return Math.min((int) height, maxHeight);
    }

    static /* synthetic */ int measureHeight$default(GradientBadgeView gradientBadgeView, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return gradientBadgeView.measureHeight(i11);
    }

    private final void measurePrimaryText() {
        float measureText = this.primaryPaint.measureText(this.primaryText);
        TextPaint textPaint = this.primaryPaint;
        setPrimarySize(new SizeF(measureText, textPaint.descent() - textPaint.ascent()));
    }

    private final int measureWidth(boolean exactly, int maxWidth) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        float f7 = 2 * primaryPadding;
        float f11 = this.secondaryText.length() > 0 ? this.secondaryWidth + secondaryMargin : this.secondaryWidth;
        float f12 = paddingRight;
        float f13 = f7 + f12;
        float width = this.primarySize.getWidth() + f13 + f11;
        float f14 = this.tertiaryText != null ? this.tertiaryWidth + f12 : 0.0f;
        float max = Math.max(width, f14);
        float f15 = maxWidth;
        if (max <= f15) {
            this.drawSecondary = true;
            if (!exactly) {
                return C6915b.c(max);
            }
        } else {
            if (width > f15) {
                width -= f11;
                this.drawSecondary = false;
            }
            float max2 = Math.max(width, f14);
            if (max2 > f15) {
                if (width > f15) {
                    setPrimarySize(new SizeF(f15 - f13, this.primarySize.getHeight()));
                    this.primaryTextToDraw = TextUtils.ellipsize(this.primaryText, this.primaryPaint, this.primarySize.getWidth(), TextUtils.TruncateAt.END).toString();
                }
                if (f14 > f15) {
                    float f16 = f15 - f12;
                    this.tertiaryWidth = f16;
                    String str = this.tertiaryText;
                    this.tertiaryTextToDraw = str != null ? TextUtils.ellipsize(str, this.tertiaryPaint, f16, TextUtils.TruncateAt.END).toString() : null;
                }
            } else if (!exactly) {
                return C6915b.c(max2);
            }
        }
        return maxWidth;
    }

    static /* synthetic */ int measureWidth$default(GradientBadgeView gradientBadgeView, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return gradientBadgeView.measureWidth(z11, i11);
    }

    private final void setPrimarySize(SizeF sizeF) {
        this.primarySize = sizeF;
        this.primaryBackground.setBounds(0, 0, C6915b.c((2 * primaryPadding) + sizeF.getWidth()), C6915b.c(sizeF.getHeight()));
    }

    private final void updatePaintColor(Paint paint, int color) {
        paint.setColor(color);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.translate(getPaddingLeft(), getPaddingTop());
        canvas.save();
        drawPrimary(canvas);
        float f7 = 2;
        canvas.translate(this.primarySize.getWidth() + (primaryPadding * f7), (this.primarySize.getHeight() - this.secondaryHeight) / f7);
        drawSecondary(canvas);
        canvas.restore();
        canvas.translate(0.0f, this.primarySize.getHeight() + tertiaryMargin);
        drawTertiary(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int measureWidth$default = mode != Integer.MIN_VALUE ? mode != 1073741824 ? measureWidth$default(this, false, 0, 2, null) : measureWidth(true, size) : measureWidth(false, size);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = measureHeight(size2);
        } else if (mode2 != 1073741824) {
            size2 = measureHeight$default(this, 0, 1, null);
        }
        setMeasuredDimension(measureWidth$default, size2);
    }

    public final void setGradient(Integer gradientStart, Integer gradientEnd) {
        if (gradientStart == null || gradientEnd == null) {
            return;
        }
        int[] colors = this.gradientBackground.getColors();
        if (Intrinsics.d(colors != null ? C7705l.J(colors, 0) : null, gradientStart)) {
            int[] colors2 = this.gradientBackground.getColors();
            if (Intrinsics.d(colors2 != null ? C7705l.J(colors2, 1) : null, gradientEnd)) {
                return;
            }
        }
        this.gradientBackground.setColors(new int[]{gradientStart.intValue(), gradientEnd.intValue()});
    }

    public final void setPrimaryStyle(int i11) {
        if (this.primaryStyle != i11) {
            this.primaryStyle = i11;
            applyStyle(this.primaryPaint, i11);
            measurePrimaryText();
        }
    }

    public final void setPrimaryText(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.d(this.primaryText, value)) {
            return;
        }
        this.primaryText = value;
        this.primaryTextToDraw = value;
        measurePrimaryText();
    }

    public final void setPrimaryTextBackgroundColor(int i11) {
        if (this.primaryTextBackgroundColor != i11) {
            this.primaryTextBackgroundColor = i11;
            Paint paint = this.primaryBackground.getPaint();
            Intrinsics.checkNotNullExpressionValue(paint, "getPaint(...)");
            updatePaintColor(paint, i11);
        }
    }

    public final void setPrimaryTextColor(int i11) {
        if (this.primaryTextColor != i11) {
            this.primaryTextColor = i11;
            updatePaintColor(this.primaryPaint, i11);
        }
    }

    public final void setSecondaryText(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.d(this.secondaryText, value)) {
            return;
        }
        this.secondaryText = value;
        this.secondaryWidth = value.length() == 0 ? 0.0f : this.secondaryPaint.measureText(value);
    }

    public final void setSecondaryTextColor(int i11) {
        if (this.secondaryTextColor != i11) {
            this.secondaryTextColor = i11;
            updatePaintColor(this.secondaryPaint, i11);
        }
    }

    public final void setTertiaryText(String str) {
        if (Intrinsics.d(this.tertiaryText, str)) {
            return;
        }
        this.tertiaryText = str;
        this.tertiaryTextToDraw = str;
        this.tertiaryWidth = str != null ? this.tertiaryPaint.measureText(str) : 0.0f;
    }

    public final void setTertiaryTextColor(int i11) {
        if (this.tertiaryTextColor != i11) {
            this.tertiaryTextColor = i11;
            updatePaintColor(this.tertiaryPaint, i11);
        }
    }

    public final void setTexts(@NotNull String primaryText, @NotNull String secondaryText, String tertiaryText) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        setPrimaryText(primaryText);
        setSecondaryText(secondaryText);
        setTertiaryText(tertiaryText);
        requestLayout();
        invalidate();
    }

    public /* synthetic */ GradientBadgeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradientBadgeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.primaryText = "";
        this.primaryTextColor = ThemeExtKt.themeColor(context, R$attr.oz_semantic_text_primary);
        this.primaryTextBackgroundColor = ThemeExtKt.themeColor(context, R$attr.oz_semantic_bg_secondary);
        this.secondaryText = "";
        this.secondaryTextColor = ThemeExtKt.themeColor(context, R$attr.oz_semantic_text_primary_negative);
        this.tertiaryTextColor = ThemeExtKt.themeColor(context, R$attr.oz_semantic_credit);
        this.primaryStyle = R$style.TextStyle_Body_M;
        this.primaryTextToDraw = "";
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float[] fArr = new float[8];
        for (int i12 = 0; i12 < 8; i12++) {
            fArr[i12] = ResourceExtKt.toPxF(4);
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(this.primaryTextBackgroundColor);
        this.primaryBackground = shapeDrawable;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(this.primaryTextColor);
        applyStyle(textPaint, this.primaryStyle);
        this.primaryPaint = textPaint;
        this.primarySize = new SizeF(0.0f, getTextHeight(this.primaryPaint));
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setColor(this.secondaryTextColor);
        applyStyle(textPaint2, R$style.TextStyle_Caption);
        this.secondaryPaint = textPaint2;
        this.secondaryHeight = getTextHeight(textPaint2);
        this.drawSecondary = true;
        TextPaint textPaint3 = new TextPaint(1);
        textPaint3.setColor(this.tertiaryTextColor);
        applyStyle(textPaint3, R$style.TextStyle_Caption);
        this.tertiaryPaint = textPaint3;
        this.tertiaryHeight = getTextHeight(textPaint3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setCornerRadius(ResourceExtKt.toPxF(8));
        this.gradientBackground = gradientDrawable;
        ViewExtKt.setPaddingsDp(this, 6.0f);
        setBackground(gradientDrawable);
    }
}
