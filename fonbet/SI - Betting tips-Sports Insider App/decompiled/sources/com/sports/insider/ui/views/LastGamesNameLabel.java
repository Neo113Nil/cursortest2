package com.sports.insider.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import eg.c0;
import eg.m0;
import jg.d;
import jg.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import lg.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yg.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/sports/insider/ui/views/LastGamesNameLabel;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Typeface;", "typeface", "", "setArimoBoldTypeface", "(Landroid/graphics/Typeface;)V", "setArimoRegularTypeface", "", "name", "setName", "(Ljava/lang/String;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLastGamesNameLabel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LastGamesNameLabel.kt\ncom/sports/insider/ui/views/LastGamesNameLabel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n+ 4 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,313:1\n1#2:314\n404#3:315\n27#4,7:316\n27#4,7:323\n*S KotlinDebug\n*F\n+ 1 LastGamesNameLabel.kt\ncom/sports/insider/ui/views/LastGamesNameLabel\n*L\n92#1:315\n210#1:316,7\n216#1:323,7\n*E\n"})
/* loaded from: classes.dex */
public final class LastGamesNameLabel extends View {

    /* renamed from: a, reason: collision with root package name */
    public String f7563a;

    /* renamed from: b, reason: collision with root package name */
    public String f7564b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7565c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7566d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7567e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7568f;

    /* renamed from: g, reason: collision with root package name */
    public final float f7569g;

    /* renamed from: h, reason: collision with root package name */
    public final float f7570h;

    /* renamed from: i, reason: collision with root package name */
    public final TextPaint f7571i;
    public final TextPaint j;

    /* renamed from: k, reason: collision with root package name */
    public final d f7572k;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f7573l;

    /* renamed from: m, reason: collision with root package name */
    public Typeface f7574m;

    /* renamed from: n, reason: collision with root package name */
    public final RectF f7575n;

    /* renamed from: o, reason: collision with root package name */
    public final RectF f7576o;

    /* renamed from: p, reason: collision with root package name */
    public final RectF f7577p;
    public StaticLayout q;

    /* renamed from: r, reason: collision with root package name */
    public StaticLayout f7578r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7579s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LastGamesNameLabel(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7563a = "Last games";
        this.f7564b = "";
        this.f7568f = 8.0f;
        this.f7569g = 20.0f;
        this.f7570h = 22.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f7571i = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.j = textPaint2;
        e eVar = m0.f9201a;
        this.f7572k = c0.b(q.f18523a);
        this.f7575n = new RectF();
        this.f7576o = new RectF();
        this.f7577p = new RectF();
        DisplayMetrics b10 = a.b(context, "getDisplayMetrics(...)");
        if (b10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            b10 = null;
        }
        float f6 = b10.density;
        f6 = f6 <= 0.0f ? 1.0f : f6;
        this.f7565c *= f6;
        this.f7566d *= f6;
        this.f7567e *= f6;
        this.f7568f *= f6;
        this.f7569g *= f6;
        this.f7570h *= f6;
        textPaint.setColor(Color.parseColor("#B6B6B6"));
        textPaint.setTypeface(Typeface.DEFAULT);
        textPaint.setTextSize(this.f7569g);
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        textPaint2.setColor(-1);
        textPaint2.setTypeface(Typeface.DEFAULT_BOLD);
        textPaint2.setTextSize(this.f7570h);
        textPaint2.setTextAlign(align);
        if (isInEditMode()) {
            this.f7564b = "Real Madrid";
        }
    }

    public static StaticLayout e(CharSequence charSequence, TextPaint textPaint, int i5) {
        if (charSequence == null || charSequence.length() == 0 || StringsKt.H(charSequence) || i5 <= 5) {
            return null;
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, Math.min(i5, (int) textPaint.measureText(charSequence.toString()))).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(true).setLineSpacing(0.0f, 1.0f).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setArimoBoldTypeface(Typeface typeface) {
        if (typeface == null || !Intrinsics.areEqual(this.f7574m, typeface)) {
            if (typeface == null) {
                typeface = Typeface.DEFAULT_BOLD;
            }
            this.f7574m = typeface;
            this.j.setTypeface(typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setArimoRegularTypeface(Typeface typeface) {
        if (typeface == null || !Intrinsics.areEqual(this.f7573l, typeface)) {
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            this.f7573l = typeface;
            this.f7571i.setTypeface(typeface);
        }
    }

    public final void c() {
        this.f7575n.setEmpty();
        this.f7576o.setEmpty();
        this.q = null;
        this.f7577p.setEmpty();
        this.f7578r = null;
    }

    public final void d(int i5, int i10) {
        if (i5 < 100 || i10 <= 100) {
            c();
            return;
        }
        float paddingStart = getPaddingStart() + 0.0f;
        float paddingTop = getPaddingTop() + 0.0f;
        float paddingEnd = (i5 - getPaddingEnd()) + 0.0f;
        float paddingBottom = (i10 - getPaddingBottom()) + 0.0f;
        float f6 = paddingEnd - paddingStart;
        float f10 = (f6 / 2.0f) + paddingStart;
        if (paddingBottom - paddingTop <= 0.0f || f6 <= 0.0f) {
            c();
            return;
        }
        int i11 = (int) (f6 - (this.f7566d + this.f7567e));
        StaticLayout e7 = e(this.f7563a, this.f7571i, i11);
        this.q = e7;
        float f11 = this.f7565c + paddingTop;
        float width = (e7 != null ? e7.getWidth() : 0) + f10;
        float height = (this.q != null ? r7.getHeight() : 0) + f11;
        StaticLayout e9 = e(this.f7564b, this.j, i11);
        this.f7578r = e9;
        float width2 = (e9 != null ? e9.getWidth() : 0) + f10;
        StaticLayout staticLayout = this.f7578r;
        int height2 = staticLayout != null ? staticLayout.getHeight() : 0;
        this.f7575n.set(paddingStart, paddingTop, paddingEnd, paddingBottom);
        this.f7576o.set(f10, f11, width, height);
        this.f7577p.set(f10, height, width2, height2 + height);
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        d(getWidth(), getHeight());
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
        if (this.f7579s) {
            c0.h(this.f7572k.f18494a);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int save;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f7575n.isEmpty()) {
            return;
        }
        RectF rectF = this.f7576o;
        if (!rectF.isEmpty()) {
            save = canvas.save();
            try {
                canvas.translate(rectF.left, rectF.top);
                StaticLayout staticLayout = this.q;
                if (staticLayout != null) {
                    staticLayout.draw(canvas);
                }
            } finally {
            }
        }
        RectF rectF2 = this.f7577p;
        if (rectF2.isEmpty()) {
            return;
        }
        save = canvas.save();
        try {
            canvas.translate(rectF2.left, rectF2.top);
            StaticLayout staticLayout2 = this.f7578r;
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            }
        } finally {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        float paddingEnd = getPaddingEnd() + getPaddingStart() + this.f7566d + this.f7567e;
        float paddingBottom = getPaddingBottom() + getPaddingTop() + this.f7565c + this.f7568f;
        int i11 = (int) (((mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE) - paddingEnd);
        this.q = e(this.f7563a, this.f7571i, i11);
        this.f7578r = e(this.f7564b, this.j, i11);
        StaticLayout staticLayout = this.q;
        int width = staticLayout != null ? staticLayout.getWidth() : 0;
        int max = (int) (paddingEnd + Math.max(width, this.f7578r != null ? r8.getWidth() : 0));
        int height = (int) (paddingBottom + (this.q != null ? r6.getHeight() : 0) + (this.f7578r != null ? r6.getHeight() : 0));
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(max, size);
        } else if (mode != 1073741824) {
            size = max;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(height, size2);
        } else if (mode2 != 1073741824) {
            size2 = height;
        }
        setMeasuredDimension(size, size2);
        d(size, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        if (i5 <= 0 || i10 <= 0) {
            return;
        }
        if (i11 == i5 && i12 == i10) {
            invalidate();
        } else {
            d(i5, i10);
        }
    }

    public final void setName(@Nullable String name) {
        if (name == null) {
            name = "";
        }
        this.f7564b = name;
        requestLayout();
        invalidate();
    }
}
