package com.sofascore.results.view;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import com.sofascore.results.R;
import defpackage.a26;
import defpackage.ao2;
import defpackage.b26;
import defpackage.c26;
import defpackage.f8h;
import defpackage.ujf;
import defpackage.wzb;
import defpackage.z1g;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0012\u0013J\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/sofascore/results/view/EventListScoreTextView;", "Landroid/view/View;", "", "getText", "()Ljava/lang/String;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "", "color", "", "setTextColor", "(I)V", "getTextForAccessibility", "Landroid/graphics/Paint$FontMetrics;", "getFontMetrics", "()Landroid/graphics/Paint$FontMetrics;", "fontMetrics", "a26", "b26", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EventListScoreTextView extends View {
    public static final /* synthetic */ int i = 0;
    public ArrayList a;
    public ObjectAnimator b;
    public ObjectAnimator c;
    public final Rect d;
    public final TextPaint e;
    public String f;
    public String g;
    public float h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventListScoreTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Object obj;
        Typeface typeface;
        context.getClass();
        this.a = new ArrayList();
        this.d = new Rect();
        this.e = new TextPaint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ujf.i, 0, 0);
        f8h f8hVar = b26.e;
        int i2 = obtainStyledAttributes.getInt(0, 0);
        f8hVar.getClass();
        Iterator<E> it = b26.h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((b26) obj).a == i2) {
                    break;
                }
            }
        }
        b26 b26Var = (b26) obj;
        b26Var = b26Var == null ? b26.f : b26Var;
        this.e.setTextSize(ao2.H(b26Var.d, context));
        TextPaint textPaint = this.e;
        try {
            typeface = z1g.a(b26Var.b, context);
        } catch (Exception unused) {
            typeface = Typeface.DEFAULT;
        }
        textPaint.setTypeface(typeface);
        this.e.setLetterSpacing(b26Var.c);
        obtainStyledAttributes.recycle();
        if (isInEditMode()) {
            this.f = "0";
        }
        setBackground(context.getDrawable(R.drawable.score_highlight_background_with_border));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private final Paint.FontMetrics getFontMetrics() {
        Paint.FontMetrics fontMetrics = this.e.getFontMetrics();
        fontMetrics.getClass();
        return fontMetrics;
    }

    private final CharSequence getTextForAccessibility() {
        String str = this.f;
        return str != null ? str : "";
    }

    public final void a() {
        ArrayList arrayList = this.a;
        this.a = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a26) it.next()).b.cancel();
        }
    }

    public final void b() {
        onDetachedFromWindow();
        a();
        ObjectAnimator objectAnimator = this.b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.c;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        this.b = null;
        this.c = null;
        getBackground().setAlpha(0);
    }

    public final CharSequence c(String str) {
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint = this.e;
        CharSequence ellipsize = TextUtils.ellipsize(str, textPaint, (getWidth() - getPaddingStart()) - getPaddingEnd(), truncateAt);
        textPaint.getTextBounds(ellipsize.toString(), 0, ellipsize.length(), this.d);
        return ellipsize;
    }

    public final void d(boolean z) {
        if (!z) {
            if (this.c != null) {
                return;
            }
            int alpha = getBackground().getAlpha();
            ObjectAnimator objectAnimator = this.b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(getBackground(), PropertyValuesHolder.ofInt("alpha", alpha, 0));
            ofPropertyValuesHolder.setInterpolator(new DecelerateInterpolator());
            ofPropertyValuesHolder.setDuration(300L);
            ofPropertyValuesHolder.addListener(new c26(this, 1));
            ofPropertyValuesHolder.start();
            this.c = ofPropertyValuesHolder;
            return;
        }
        if (getBackground().getAlpha() == 255 || this.b != null) {
            return;
        }
        int alpha2 = getBackground().getAlpha();
        ObjectAnimator objectAnimator2 = this.c;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(getBackground(), PropertyValuesHolder.ofInt("alpha", alpha2, 255));
        ofPropertyValuesHolder2.setInterpolator(new DecelerateInterpolator());
        ofPropertyValuesHolder2.setDuration(300L);
        ofPropertyValuesHolder2.addListener(new c26(this, 0));
        ofPropertyValuesHolder2.start();
        this.b = ofPropertyValuesHolder2;
    }

    @Override // android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        return "com.sofascore.results.view.EventListScoreTextView";
    }

    @Nullable
    /* renamed from: getText, reason: from getter */
    public final String getF() {
        return this.f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        String str;
        canvas.getClass();
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() - getFontMetrics().bottom;
        String str2 = this.g;
        TextPaint textPaint = this.e;
        Rect rect = this.d;
        if (str2 != null) {
            CharSequence c = c(str2);
            canvas2 = canvas;
            canvas2.drawText(c, 0, c.length(), width - (rect.width() / 2.0f), height * this.h, textPaint);
        } else {
            canvas2 = canvas;
        }
        if (this.h >= 1.0f || (str = this.f) == null) {
            return;
        }
        CharSequence c2 = c(str);
        canvas2.drawText(c2, 0, c2.length(), width - (rect.width() / 2.0f), (this.h * height) + height, textPaint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.getClass();
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getAccessibilityClassName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.getClass();
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setText(getTextForAccessibility());
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        String str = this.g;
        if (str == null) {
            str = "";
        }
        TextPaint textPaint = this.e;
        int measureText = (int) textPaint.measureText(str);
        String str2 = this.f;
        int max = Math.max(measureText, (int) textPaint.measureText(str2 != null ? str2 : ""));
        float f = getFontMetrics().descent - getFontMetrics().ascent;
        int paddingEnd = getPaddingEnd() + getPaddingStart() + max;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + wzb.b(f);
        if (paddingEnd <= size) {
            size = paddingEnd;
        }
        setMeasuredDimension(size, paddingBottom);
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.getClass();
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence textForAccessibility = getTextForAccessibility();
        if (TextUtils.isEmpty(textForAccessibility)) {
            return;
        }
        accessibilityEvent.getText().add(textForAccessibility);
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEvent(int i2) {
        if (i2 == 4096) {
            return;
        }
        super.sendAccessibilityEvent(i2);
    }

    public final void setTextColor(int color) {
        TextPaint textPaint = this.e;
        if (textPaint.getColor() != color) {
            textPaint.setColor(color);
            invalidate();
        }
    }
}
