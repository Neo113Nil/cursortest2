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
import bet.prediction.response.Prediction;
import com.sports.insider.data.room.general.table.predictions.PredictionTable;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/sports/insider/ui/views/StateGameView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Typeface;", "typeface", "", "setArimoBoldTypeface", "(Landroid/graphics/Typeface;)V", "", PredictionTable.statusColumn, "setStatusGame", "(Ljava/lang/String;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStateGameView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateGameView.kt\ncom/sports/insider/ui/views/StateGameView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n+ 4 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,309:1\n1#2:310\n404#3:311\n404#3:312\n404#3:313\n404#3:314\n27#4,7:315\n*S KotlinDebug\n*F\n+ 1 StateGameView.kt\ncom/sports/insider/ui/views/StateGameView\n*L\n95#1:311\n96#1:312\n97#1:313\n98#1:314\n214#1:315,7\n*E\n"})
/* loaded from: classes.dex */
public final class StateGameView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final int f7929a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7930b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7931c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7932d;

    /* renamed from: e, reason: collision with root package name */
    public String f7933e;

    /* renamed from: f, reason: collision with root package name */
    public String f7934f;

    /* renamed from: g, reason: collision with root package name */
    public String f7935g;

    /* renamed from: h, reason: collision with root package name */
    public String f7936h;

    /* renamed from: i, reason: collision with root package name */
    public String f7937i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public String f7938k;

    /* renamed from: l, reason: collision with root package name */
    public final float f7939l;

    /* renamed from: m, reason: collision with root package name */
    public final float f7940m;

    /* renamed from: n, reason: collision with root package name */
    public final TextPaint f7941n;

    /* renamed from: o, reason: collision with root package name */
    public final d f7942o;

    /* renamed from: p, reason: collision with root package name */
    public Typeface f7943p;
    public final RectF q;

    /* renamed from: r, reason: collision with root package name */
    public final RectF f7944r;

    /* renamed from: s, reason: collision with root package name */
    public StaticLayout f7945s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7946t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateGameView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7933e = "Pending";
        this.f7934f = "Return";
        this.f7935g = "WON";
        this.f7936h = "LOST";
        this.f7937i = "Match completed";
        this.j = this.f7932d;
        this.f7938k = "unknown";
        this.f7939l = 45.0f;
        this.f7940m = 17.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f7941n = textPaint;
        e eVar = m0.f9201a;
        this.f7942o = c0.b(q.f18523a);
        this.q = new RectF();
        this.f7944r = new RectF();
        DisplayMetrics b10 = a.b(context, "getDisplayMetrics(...)");
        if (b10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            b10 = null;
        }
        float f6 = b10.density;
        f6 = f6 <= 0.0f ? 1.0f : f6;
        this.f7939l *= f6;
        this.f7940m *= f6;
        this.f7929a = Color.parseColor("#93908e");
        this.f7930b = Color.parseColor("#29bf57");
        this.f7931c = Color.parseColor("#A62921");
        int parseColor = Color.parseColor("#93908e");
        this.f7932d = parseColor;
        this.j = parseColor;
        textPaint.setColor(-16777216);
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        textPaint.setTextSize(this.f7940m);
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setArimoBoldTypeface(Typeface typeface) {
        if (typeface == null || !Intrinsics.areEqual(this.f7943p, typeface)) {
            if (typeface == null) {
                typeface = Typeface.DEFAULT_BOLD;
            }
            this.f7943p = typeface;
            this.f7941n.setTypeface(typeface);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final String b(String str) {
        if (str == null) {
            return this.f7933e;
        }
        switch (str.hashCode()) {
            case -1867169789:
                if (str.equals("success")) {
                    return this.f7935g;
                }
                break;
            case -934396624:
                if (str.equals(Prediction.RETURN)) {
                    return this.f7934f;
                }
                break;
            case -284840886:
                if (str.equals("unknown")) {
                    return this.f7933e;
                }
                break;
            case 3135262:
                if (str.equals(Prediction.NOT_PASSED)) {
                    return this.f7936h;
                }
                break;
        }
        return this.f7937i;
    }

    public final void c(int i5, int i10) {
        RectF rectF = this.f7944r;
        RectF rectF2 = this.q;
        StaticLayout staticLayout = null;
        if (i5 < 10 || i10 <= 10) {
            rectF2.setEmpty();
            rectF.setEmpty();
            this.f7945s = null;
            return;
        }
        float paddingStart = getPaddingStart() + 0.0f;
        float paddingTop = getPaddingTop() + 0.0f;
        float paddingEnd = (i5 - getPaddingEnd()) + 0.0f;
        float paddingBottom = (i10 - getPaddingBottom()) + 0.0f;
        float f6 = paddingEnd - paddingStart;
        float f10 = paddingBottom - paddingTop;
        float f11 = (f6 / 2.0f) + paddingStart;
        float f12 = (f10 / 2.0f) + paddingTop;
        if (f10 <= 0.0f || f6 <= 0.0f) {
            rectF2.setEmpty();
            rectF.setEmpty();
            this.f7945s = null;
            return;
        }
        String b10 = b(this.f7938k);
        int i11 = (int) f6;
        if (b10 != null && b10.length() != 0 && !StringsKt.H(b10) && i11 > 5) {
            String obj = b10.toString();
            TextPaint textPaint = this.f7941n;
            staticLayout = StaticLayout.Builder.obtain(b10, 0, b10.length(), textPaint, Math.min(i11, (int) textPaint.measureText(obj))).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(true).setLineSpacing(0.0f, 1.0f).build();
        }
        this.f7945s = staticLayout;
        float height = f12 - ((staticLayout != null ? staticLayout.getHeight() : 0) / 2.0f);
        float width = (this.f7945s != null ? r2.getWidth() : 0) + f11;
        StaticLayout staticLayout2 = this.f7945s;
        int height2 = staticLayout2 != null ? staticLayout2.getHeight() : 0;
        rectF2.set(paddingStart, paddingTop, paddingEnd, paddingBottom);
        rectF.set(f11, height, width, height2 + height);
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        c(getWidth(), getHeight());
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.q.setEmpty();
        this.f7944r.setEmpty();
        this.f7945s = null;
        if (this.f7946t) {
            c0.h(this.f7942o.f18494a);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.q.isEmpty()) {
            return;
        }
        canvas.drawColor(this.j);
        RectF rectF = this.f7944r;
        if (rectF.isEmpty()) {
            return;
        }
        int save = canvas.save();
        try {
            canvas.translate(rectF.left, rectF.top);
            StaticLayout staticLayout = this.f7945s;
            if (staticLayout != null) {
                staticLayout.draw(canvas);
            }
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        int paddingEnd = getPaddingEnd() + getPaddingStart();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int measureText = paddingEnd + ((int) this.f7941n.measureText("Match completed"));
        int i11 = (int) (paddingBottom + this.f7939l);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(measureText, size);
        } else if (mode != 1073741824) {
            size = measureText;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(i11, size2);
        } else if (mode2 != 1073741824) {
            size2 = i11;
        }
        setMeasuredDimension(size, size2);
        c(size, size2);
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
            c(i5, i10);
        }
    }

    public final void setStatusGame(@Nullable String status) {
        int i5;
        this.f7938k = status;
        b(status);
        if (status != null) {
            int hashCode = status.hashCode();
            if (hashCode != -1867169789) {
                if (hashCode != -934396624) {
                    if (hashCode == 3135262 && status.equals(Prediction.NOT_PASSED)) {
                        i5 = this.f7931c;
                    }
                } else if (status.equals(Prediction.RETURN)) {
                    i5 = this.f7929a;
                }
            } else if (status.equals("success")) {
                i5 = this.f7930b;
            }
            this.j = i5;
            requestLayout();
            invalidate();
        }
        i5 = this.f7932d;
        this.j = i5;
        requestLayout();
        invalidate();
    }
}
