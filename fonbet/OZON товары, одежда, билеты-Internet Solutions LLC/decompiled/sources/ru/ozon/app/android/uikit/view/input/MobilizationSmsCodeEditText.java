package ru.ozon.app.android.uikit.view.input;

import Sc.InterfaceC3999a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.a;
import androidx.core.content.res.g;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$font;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;

@InterfaceC3999a
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 Y2\u00020\u0001:\u0001YB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000eH\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000eH\u0014¢\u0006\u0004\b#\u0010\"J\u0019\u0010&\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J1\u0010-\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\bH\u0014¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u000e2\u0006\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b1\u00102R*\u00104\u001a\u00020\b2\u0006\u00103\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u0010\u0010R0\u0010:\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u000e\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010AR\u0014\u0010C\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010AR\u0014\u0010D\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010AR\u001c\u0010G\u001a\b\u0012\u0004\u0012\u00020F0E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010KR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010OR\u0014\u0010Q\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010AR\u0014\u0010R\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010OR\u0016\u0010S\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u001c\u0010W\u001a\n V*\u0004\u0018\u00010U0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006Z"}, d2 = {"Lru/ozon/app/android/uikit/view/input/MobilizationSmsCodeEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "desiredSize", "measureSpec", "measureDimension", "(II)I", "length", "", "changeCodeLength", "(I)V", "dp", "", "dpToPx", "(I)F", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/View$OnClickListener;", "l", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "", "text", "start", "lengthBefore", "lengthAfter", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "codeLength", "I", "getCodeLength", "()I", "setCodeLength", "Lkotlin/Function1;", "onCodeEnteredListener", "Lkotlin/jvm/functions/Function1;", "getOnCodeEnteredListener", "()Lkotlin/jvm/functions/Function1;", "setOnCodeEnteredListener", "(Lkotlin/jvm/functions/Function1;)V", "textRectHeight", "F", "textRectWidth", "spaceBetweenText", "cornerRadius", "", "Landroid/graphics/RectF;", "backgroundRects", "[Landroid/graphics/RectF;", "", "textWidthArray", "[F", "cursorTextWidthArray", "Landroid/graphics/Paint;", "charPaint", "Landroid/graphics/Paint;", "cursorPaint", "textHeight", "backgroundRectPaint", "isShowCursor", "Z", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "cursorAnimator", "Landroid/animation/ValueAnimator;", "Companion", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MobilizationSmsCodeEditText extends AppCompatEditText {

    @NotNull
    private final Paint backgroundRectPaint;

    @NotNull
    private RectF[] backgroundRects;

    @NotNull
    private final Paint charPaint;
    private int codeLength;
    private final float cornerRadius;
    private final ValueAnimator cursorAnimator;

    @NotNull
    private final Paint cursorPaint;

    @NotNull
    private final float[] cursorTextWidthArray;
    private boolean isShowCursor;
    private Function1<? super CharSequence, Unit> onCodeEnteredListener;
    private final float spaceBetweenText;
    private final float textHeight;
    private final float textRectHeight;
    private final float textRectWidth;

    @NotNull
    private float[] textWidthArray;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobilizationSmsCodeEditText(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i11 = 2;
        Intrinsics.checkNotNullParameter(context, "context");
        this.textRectHeight = dpToPx(48);
        this.textRectWidth = dpToPx(40);
        this.spaceBetweenText = dpToPx(12);
        this.cornerRadius = dpToPx(4);
        RectF[] rectFArr = new RectF[4];
        for (int i12 = 0; i12 < 4; i12++) {
            rectFArr[i12] = new RectF();
        }
        this.backgroundRects = rectFArr;
        this.textWidthArray = new float[4];
        this.cursorTextWidthArray = new float[1];
        Paint paint = new Paint(getPaint());
        paint.setColor(a.getColor(getContext(), R$color.oz_semantic_text_primary));
        paint.setTypeface(g.e(R$font.onest_semibold, getContext()));
        Resources resources = getResources();
        paint.setTextSize(TypedValue.applyDimension(2, 24.0f, resources != null ? resources.getDisplayMetrics() : null));
        this.charPaint = paint;
        Paint paint2 = new Paint(paint);
        paint2.setColor(a.getColor(getContext(), R$color.oz_semantic_accent_primary));
        this.cursorPaint = paint2;
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        this.textHeight = fontMetrics.descent + fontMetrics.ascent;
        Paint paint3 = new Paint(1);
        paint3.setColor(a.getColor(getContext(), R$color.oz_semantic_bg_primary));
        paint3.setStyle(Paint.Style.FILL);
        this.backgroundRectPaint = paint3;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.cursorAnimator = ofFloat;
        setCodeLength(4);
        setBackgroundResource(0);
        setInputType(2);
        setTextIsSelectable(false);
        setLongClickable(false);
        setCursorVisible(false);
        super.setOnClickListener(new FG.a(this, 25));
        addTextChangedListener(new SimpleTextWatcher() { // from class: ru.ozon.app.android.uikit.view.input.MobilizationSmsCodeEditText.2
            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                Intrinsics.checkNotNullParameter(s11, "s");
                super.afterTextChanged(s11);
                MobilizationSmsCodeEditText.this.cursorAnimator.cancel();
                MobilizationSmsCodeEditText.this.cursorAnimator.start();
            }
        });
        ofFloat.setDuration(1200L);
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new Ak0.a(this, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(MobilizationSmsCodeEditText mobilizationSmsCodeEditText, View view) {
        Editable text = mobilizationSmsCodeEditText.getText();
        Intrinsics.f(text);
        mobilizationSmsCodeEditText.setSelection(text.length());
    }

    private final void changeCodeLength(int length) {
        RectF[] rectFArr = new RectF[length];
        for (int i11 = 0; i11 < length; i11++) {
            rectFArr[i11] = new RectF();
        }
        this.backgroundRects = rectFArr;
        this.textWidthArray = new float[length];
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(length)});
    }

    private final float dpToPx(int dp) {
        return dp * Resources.getSystem().getDisplayMetrics().density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$6$lambda$5(MobilizationSmsCodeEditText mobilizationSmsCodeEditText, ValueAnimator valueAnimator) {
        mobilizationSmsCodeEditText.isShowCursor = 0.5f > ((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        mobilizationSmsCodeEditText.invalidate();
    }

    private final int measureDimension(int desiredSize, int measureSpec) {
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? desiredSize : size : Math.min(desiredSize, size);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.cursorAnimator.start();
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.cursorAnimator.cancel();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Editable editable;
        int i11;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Editable text = getText();
        if (text != null) {
            int length = text.length();
            this.charPaint.getTextWidths(text, 0, length, this.textWidthArray);
            this.cursorPaint.getTextWidths("|", 0, 1, this.cursorTextWidthArray);
            int i12 = this.codeLength;
            int i13 = 0;
            while (i13 < i12) {
                RectF rectF = this.backgroundRects[i13];
                if (canvas != null) {
                    float f7 = this.cornerRadius;
                    canvas.drawRoundRect(rectF, f7, f7, this.backgroundRectPaint);
                }
                float f11 = 2;
                float width = (rectF.width() / f11) + rectF.left;
                float height = rectF.height() / f11;
                if (length > i13) {
                    if (canvas != null) {
                        canvas.drawText(text, i13, i13 + 1, width - (this.textWidthArray[i13] / f11), height - (this.textHeight / f11), this.charPaint);
                    }
                    editable = text;
                    i11 = i13;
                } else {
                    editable = text;
                    i11 = i13;
                    if (length == i11 && this.isShowCursor && canvas != null) {
                        canvas.drawText("|", 0, 1, width - (this.cursorTextWidthArray[0] / f11), height - (this.textHeight / f11), this.cursorPaint);
                    }
                }
                i13 = i11 + 1;
                text = editable;
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        RectF[] rectFArr = this.backgroundRects;
        int length = rectFArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            RectF rectF = rectFArr[i11];
            float f7 = this.textRectWidth;
            float f11 = (this.spaceBetweenText + f7) * i12;
            rectF.left = f11;
            rectF.top = 0.0f;
            rectF.right = f11 + f7;
            rectF.bottom = this.textRectHeight;
            i11++;
            i12++;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(measureDimension((int) ((this.spaceBetweenText * (r1 - 1)) + (this.textRectWidth * this.codeLength)), widthMeasureSpec), measureDimension((int) this.textRectHeight, heightMeasureSpec));
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        Function1<? super CharSequence, Unit> function1;
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
        if (text != null) {
            if (text.length() != this.codeLength) {
                text = null;
            }
            if (text == null || (function1 = this.onCodeEnteredListener) == null) {
                return;
            }
            function1.invoke(text);
        }
    }

    public final void setCodeLength(int i11) {
        changeCodeLength(i11);
        this.codeLength = i11;
        requestLayout();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l11) {
    }

    public final void setOnCodeEnteredListener(Function1<? super CharSequence, Unit> function1) {
        this.onCodeEnteredListener = function1;
    }
}
