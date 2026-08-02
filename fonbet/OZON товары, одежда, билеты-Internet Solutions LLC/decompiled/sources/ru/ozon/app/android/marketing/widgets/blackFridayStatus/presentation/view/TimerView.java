package ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.utils.TextPaintStyleParser;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.PaintExtKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ#\u0010\u0015\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001c\u0010\u000eJ%\u0010 \u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0011¢\u0006\u0004\b#\u0010$R*\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u0010,\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R\u0016\u0010\u001d\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010/R\u0016\u00100\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u001e\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010/R\u0016\u00102\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0016\u0010\u001f\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010/R\u0016\u00103\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101R\u0014\u00104\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010'R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010/R\u0014\u00105\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010'R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010'R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006="}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/view/TimerView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/graphics/Canvas;", "", "drawTitleBackground", "(Landroid/graphics/Canvas;)V", "drawTitle", "drawTimerBackground", "", "time", "", "timeWidth", "drawTime", "(Landroid/graphics/Canvas;Ljava/lang/String;F)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "canvas", "onDraw", "hours", "minutes", "seconds", "setTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "setTitle", "(Ljava/lang/String;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "textColor", "I", "getTextColor", "()I", "setTextColor", "(I)V", "backColor", "getBackColor", "setBackColor", "Ljava/lang/String;", "hoursWidth", "F", "minutesWidth", "secondsWidth", "timeSpacing", "titleMargin", "Landroid/text/TextPaint;", "textPaint", "Landroid/text/TextPaint;", "dp40", "Landroid/graphics/drawable/ShapeDrawable;", "back", "Landroid/graphics/drawable/ShapeDrawable;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TimerView extends View {

    @NotNull
    private final ShapeDrawable back;
    private int backColor;
    private final int dp40;

    @NotNull
    private String hours;
    private float hoursWidth;

    @NotNull
    private String minutes;
    private float minutesWidth;

    @NotNull
    private String seconds;
    private float secondsWidth;
    private int textColor;

    @NotNull
    private final TextPaint textPaint;
    private final int timeSpacing;
    private String title;
    private final int titleMargin;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawTime(Canvas canvas, String str, float f7) {
        int i11 = this.dp40;
        canvas.drawText(str, (i11 / 2.0f) - (f7 / 2.0f), PaintExtKt.getBaseline(this.textPaint, i11 / 2.0f), this.textPaint);
    }

    private final void drawTimerBackground(Canvas canvas) {
        int i11 = this.dp40;
        this.back.setBounds(0, 0, i11, i11);
        this.back.draw(canvas);
        int i12 = this.timeSpacing + i11;
        int i13 = this.dp40 + i12;
        this.back.setBounds(i12, 0, i13, i11);
        this.back.draw(canvas);
        int i14 = i13 + this.timeSpacing;
        this.back.setBounds(i14, 0, this.dp40 + i14, i11);
        this.back.draw(canvas);
    }

    private final void drawTitle(Canvas canvas) {
        String str = this.title;
        if (str != null) {
            canvas.drawText(str, 0.0f, PaintExtKt.getBaseline(this.textPaint, this.dp40 / 2.0f), this.textPaint);
        }
    }

    private final void drawTitleBackground(Canvas canvas) {
        this.back.setBounds(0, 0, getMeasuredWidth(), this.dp40);
        this.back.draw(canvas);
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.title != null) {
            drawTitleBackground(canvas);
            canvas.translate(this.titleMargin, 0.0f);
            drawTitle(canvas);
        } else {
            drawTimerBackground(canvas);
            drawTime(canvas, this.hours, this.hoursWidth);
            canvas.translate(this.dp40 + this.timeSpacing, 0.0f);
            drawTime(canvas, this.minutes, this.minutesWidth);
            canvas.translate(this.dp40 + this.timeSpacing, 0.0f);
            drawTime(canvas, this.seconds, this.secondsWidth);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i11;
        int i12;
        int resolveSize = View.resolveSize(this.dp40, heightMeasureSpec);
        String str = this.title;
        if (str != null) {
            i11 = (int) this.textPaint.measureText(str);
            i12 = this.titleMargin;
        } else {
            i11 = this.dp40 * 3;
            i12 = this.timeSpacing;
        }
        setMeasuredDimension(View.resolveSize((i12 * 2) + i11, widthMeasureSpec), resolveSize);
    }

    public final void setBackColor(int i11) {
        if (this.backColor != i11) {
            this.backColor = i11;
            this.back.getPaint().setColor(i11);
            invalidate();
        }
    }

    public final void setTextColor(int i11) {
        if (this.textColor != i11) {
            this.textColor = i11;
            this.textPaint.setColor(i11);
            invalidate();
        }
    }

    public final void setTime(@NotNull String hours, @NotNull String minutes, @NotNull String seconds) {
        Intrinsics.checkNotNullParameter(hours, "hours");
        Intrinsics.checkNotNullParameter(minutes, "minutes");
        Intrinsics.checkNotNullParameter(seconds, "seconds");
        boolean z11 = false;
        boolean z12 = true;
        boolean z13 = this.title != null;
        this.title = null;
        if (!Intrinsics.d(this.hours, hours)) {
            this.hours = hours;
            this.hoursWidth = this.textPaint.measureText(hours);
            z11 = true;
        }
        if (!Intrinsics.d(this.minutes, minutes)) {
            this.minutes = minutes;
            this.minutesWidth = this.textPaint.measureText(minutes);
            z11 = true;
        }
        if (Intrinsics.d(this.seconds, seconds)) {
            z12 = z11;
        } else {
            this.seconds = seconds;
            this.secondsWidth = this.textPaint.measureText(seconds);
        }
        if (z13) {
            requestLayout();
        }
        if (z12) {
            invalidate();
        }
    }

    public final void setTitle(@NotNull String title) {
        boolean z11;
        Intrinsics.checkNotNullParameter(title, "title");
        if (Intrinsics.d(this.title, title)) {
            z11 = false;
        } else {
            this.title = title;
            z11 = true;
        }
        this.hours = "";
        this.minutes = "";
        this.seconds = "";
        if (z11) {
            requestLayout();
            invalidate();
        }
    }

    public /* synthetic */ TimerView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimerView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.textColor = ThemeExtKt.themeColor(context, R$attr.textLightKey);
        this.backColor = ThemeExtKt.themeColor(context, R$attr.bgMarketingPrimary);
        this.hours = "";
        this.minutes = "";
        this.seconds = "";
        this.timeSpacing = ResourceExtKt.toPx(4, context);
        this.titleMargin = ResourceExtKt.toPx(12, context);
        TextPaint textPaint = new TextPaint(1);
        TextPaintStyleParser.applyStyle$default(new TextPaintStyleParser(context), textPaint, R$style.TextStyle_Body_XL_Bold, null, 4, null);
        textPaint.setColor(this.textColor);
        this.textPaint = textPaint;
        this.dp40 = ResourceExtKt.toPx(40, context);
        float[] fArr = new float[8];
        for (int i13 = 0; i13 < 8; i13++) {
            fArr[i13] = ResourceExtKt.toPxF(8, context);
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(this.backColor);
        this.back = shapeDrawable;
    }
}
