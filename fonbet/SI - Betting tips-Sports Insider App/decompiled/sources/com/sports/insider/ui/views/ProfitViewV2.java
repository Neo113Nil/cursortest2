package com.sports.insider.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import d9.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.collections.v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ve.c;
import ve.h0;
import ve.i0;
import ve.j0;
import ve.k0;
import ve.l0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\r\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0005\b\u001f !\"B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001d\u001a\u00020\n2\u001e\u0010\u001c\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/sports/insider/ui/views/ProfitViewV2;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lve/l0;", "listener", "", "setListener", "(Lve/l0;)V", "Landroid/graphics/Typeface;", "font", "setFont", "(Landroid/graphics/Typeface;)V", "", "color", "setColorIcOk", "(Ljava/lang/Integer;)V", "", "second", "setOrder", "(Z)V", "Lkotlin/Pair;", "", "", "profitLists", "setProfitLists", "(Lkotlin/Pair;)V", "ve/i0", "ve/j0", "ve/k0", "ve/h0", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProfitViewV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfitViewV2.kt\ncom/sports/insider/ui/views/ProfitViewV2\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,662:1\n404#2:663\n1869#3,2:664\n1869#3,2:666\n1869#3:669\n1870#3:678\n1869#3:679\n1870#3:688\n1878#3,3:689\n1563#3:692\n1634#3,3:693\n1563#3:696\n1634#3,3:697\n1#4:668\n44#5,8:670\n44#5,8:680\n*S KotlinDebug\n*F\n+ 1 ProfitViewV2.kt\ncom/sports/insider/ui/views/ProfitViewV2\n*L\n141#1:663\n253#1:664,2\n277#1:666,2\n457#1:669\n457#1:678\n461#1:679\n461#1:688\n510#1:689,3\n579#1:692\n579#1:693,3\n580#1:696\n580#1:697,3\n458#1:670,8\n462#1:680,8\n*E\n"})
/* loaded from: classes.dex */
public final class ProfitViewV2 extends View {
    public final float A;
    public final float B;
    public RectF C;
    public boolean D;
    public final ArrayList E;
    public final ArrayList F;
    public final ArrayList G;
    public final ArrayList H;
    public final ArrayList I;
    public final ArrayList J;
    public final RectF K;
    public final Rect L;

    /* renamed from: a, reason: collision with root package name */
    public GestureDetector f7833a;

    /* renamed from: b, reason: collision with root package name */
    public l0 f7834b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7835c;

    /* renamed from: d, reason: collision with root package name */
    public Typeface f7836d;

    /* renamed from: e, reason: collision with root package name */
    public final TextPaint f7837e;

    /* renamed from: f, reason: collision with root package name */
    public final TextPaint f7838f;

    /* renamed from: g, reason: collision with root package name */
    public final TextPaint f7839g;

    /* renamed from: g0, reason: collision with root package name */
    public final RectF f7840g0;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f7841h;

    /* renamed from: h0, reason: collision with root package name */
    public final i0 f7842h0;

    /* renamed from: i, reason: collision with root package name */
    public final float f7843i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f7844k;

    /* renamed from: l, reason: collision with root package name */
    public List f7845l;

    /* renamed from: m, reason: collision with root package name */
    public List f7846m;

    /* renamed from: n, reason: collision with root package name */
    public final float f7847n;

    /* renamed from: o, reason: collision with root package name */
    public final float f7848o;

    /* renamed from: p, reason: collision with root package name */
    public final float f7849p;
    public final float q;

    /* renamed from: r, reason: collision with root package name */
    public final float f7850r;

    /* renamed from: s, reason: collision with root package name */
    public final float f7851s;

    /* renamed from: t, reason: collision with root package name */
    public final float f7852t;

    /* renamed from: u, reason: collision with root package name */
    public final float f7853u;

    /* renamed from: v, reason: collision with root package name */
    public final float f7854v;

    /* renamed from: w, reason: collision with root package name */
    public final float f7855w;

    /* renamed from: x, reason: collision with root package name */
    public final float f7856x;

    /* renamed from: y, reason: collision with root package name */
    public final float f7857y;

    /* renamed from: z, reason: collision with root package name */
    public final float f7858z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfitViewV2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        TextPaint textPaint = new TextPaint(1);
        this.f7837e = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f7838f = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f7839g = textPaint3;
        Paint paint = new Paint(1);
        this.f7841h = paint;
        this.f7843i = 1.0f;
        this.f7845l = new ArrayList();
        this.f7846m = new ArrayList();
        this.f7847n = 2.0f;
        this.f7848o = 10.0f;
        this.f7849p = 0.2f;
        this.q = 5.76f;
        this.f7850r = 9.6f;
        this.f7851s = 5.12f;
        this.f7852t = 7.2f;
        this.f7853u = 13.0f;
        this.f7854v = 39.0f;
        this.f7855w = 8.0f;
        this.f7856x = 39.0f;
        this.f7857y = 13.0f;
        this.f7858z = 13.0f;
        this.A = 16.0f;
        this.B = 17.0f;
        this.C = new RectF();
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new RectF();
        this.L = new Rect();
        float f6 = this.B;
        this.f7840g0 = new RectF(0.0f, 0.0f, f6, f6);
        i0 i0Var = new i0();
        i0Var.f24730a = null;
        i0Var.f24731b = null;
        i0Var.f24732c = null;
        i0Var.f24733d = null;
        i0Var.f24734e = null;
        i0Var.f24735f = null;
        this.f7842h0 = i0Var;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f10 = displayMetrics.density;
        f10 = f10 < 0.01f ? 0.01f : f10;
        this.f7843i = f10;
        this.q = f10 * 5.76f;
        this.f7850r = f10 * 9.6f;
        this.f7851s = 5.12f * f10;
        this.f7852t = 7.2f * f10;
        this.f7853u = 13.0f * f10;
        this.f7854v = 39.0f * f10;
        this.B = f10 * 17.0f;
        this.f7848o = f10 * 10.0f;
        Intrinsics.checkNotNull(displayMetrics);
        Intrinsics.checkNotNullParameter(displayMetrics, "<this>");
        int i5 = Build.VERSION.SDK_INT;
        this.A = i5 >= 34 ? TypedValue.applyDimension(2, 16.0f, displayMetrics) : displayMetrics.scaledDensity * 16.0f;
        Intrinsics.checkNotNullParameter(displayMetrics, "<this>");
        this.f7855w = i5 >= 34 ? TypedValue.applyDimension(2, 8.0f, displayMetrics) : displayMetrics.scaledDensity * 8.0f;
        this.f7856x = this.f7854v;
        float f11 = this.f7853u;
        this.f7857y = f11;
        this.f7858z = f11;
        this.f7835c = Color.parseColor("#03F39E");
        textPaint3.setLetterSpacing(0.0f);
        textPaint3.setStrokeWidth(0.0f);
        textPaint3.setColor(-1);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        textPaint3.setStyle(style);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(this.f7835c);
        paint.setStrokeWidth(this.f7843i * 1.5f);
        textPaint2.setLetterSpacing(0.0f);
        textPaint2.setStrokeWidth(0.0f);
        textPaint2.setColor(-1);
        textPaint2.setStyle(style);
        textPaint2.setTextSize(this.A);
        textPaint.setLetterSpacing(0.0f);
        textPaint.setStrokeWidth(0.0f);
        textPaint.setColor(-1);
        textPaint.setStyle(style);
        textPaint.setTextSize(this.A);
    }

    public static StaticLayout d(CharSequence charSequence, Integer num, TextPaint textPaint) {
        StaticLayout build = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, num.intValue()).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(true).setLineSpacing(0.0f, 1.0f).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public final boolean a() {
        return this.f7845l.isEmpty() && this.f7846m.isEmpty();
    }

    public final int b(int i5) {
        float size;
        float size2;
        int i10 = 0;
        if (i5 <= 0 || ((int) (i5 - ((this.f7857y + this.f7856x) + this.f7858z))) <= 0) {
            return 0;
        }
        float f6 = (this.B - this.A) * 2.0f;
        if (a()) {
            return (int) (f6 + 0.0f + 0.0f);
        }
        float f10 = this.f7848o * this.f7847n;
        TextPaint textPaint = this.f7837e;
        float descent = textPaint.descent() - textPaint.ascent();
        if (this.f7845l.isEmpty()) {
            size = 0.0f;
        } else {
            int i11 = 0;
            while (this.f7845l.iterator().hasNext()) {
                i11 += (int) ((((int) (textPaint.measureText(((CharSequence) r5.next()).toString()) / getWidth())) * descent) + 1);
            }
            size = ((this.f7845l.size() - 1) * f10) + i11;
        }
        if (this.f7846m.isEmpty()) {
            size2 = 0.0f;
        } else {
            while (this.f7846m.iterator().hasNext()) {
                i10 += (int) ((((int) (textPaint.measureText(((CharSequence) r5.next()).toString()) / getWidth())) * descent) + 1);
            }
            size2 = ((this.f7846m.size() - 1) * f10) + i10;
        }
        return (int) (Math.max(size, size2) + f6 + 0.0f + 0.0f);
    }

    public final Pair c(int i5) {
        TextPaint textPaint;
        float w10;
        float max;
        Integer valueOf;
        int i10 = (int) 0.0f;
        int i11 = i5 - i10;
        if (i5 <= 0 || i11 <= 0) {
            return new Pair(0, 0);
        }
        if (a()) {
            return new Pair(Integer.valueOf((int) (this.f7857y + this.f7856x + this.f7858z)), Integer.valueOf(i10));
        }
        float f6 = this.A;
        float f10 = this.f7847n;
        while (true) {
            textPaint = this.f7839g;
            textPaint.setTextSize(f6);
            float f11 = this.B * f6;
            float f12 = this.A;
            float f13 = (f11 / f12) - f6;
            float f14 = ((this.f7848o * f6) / f12) * f10;
            int size = this.f7845l.size();
            int size2 = this.f7846m.size();
            TextPaint textPaint2 = this.f7837e;
            if (size == 0) {
                w10 = 0.0f;
            } else {
                float f15 = size;
                w10 = e.w(f15, 1.0f, f14, (textPaint2.descent() - textPaint2.ascent()) * f15);
            }
            max = Math.max(w10, size2 == 0 ? 0.0f : ((size2 - 1) * f14) + ((textPaint2.descent() - textPaint2.ascent()) * size2)) + f13 + 0.0f + 0.0f;
            if (max <= i11 || f6 <= this.f7855w) {
                break;
            }
            float f16 = this.f7849p;
            if (f10 <= 1.0f) {
                f6 -= f16;
                f10 = 1.0f;
            } else {
                f10 -= f16;
            }
        }
        Iterator it = this.f7845l.iterator();
        Integer num = null;
        if (it.hasNext()) {
            valueOf = Integer.valueOf((int) textPaint.measureText(((CharSequence) it.next()).toString()));
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf((int) textPaint.measureText(((CharSequence) it.next()).toString()));
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
        } else {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        Iterator it2 = this.f7846m.iterator();
        if (it2.hasNext()) {
            num = Integer.valueOf((int) textPaint.measureText(((CharSequence) it2.next()).toString()));
            while (it2.hasNext()) {
                Integer valueOf3 = Integer.valueOf((int) textPaint.measureText(((CharSequence) it2.next()).toString()));
                if (num.compareTo(valueOf3) < 0) {
                    num = valueOf3;
                }
            }
        }
        return new Pair(Integer.valueOf((int) (this.f7857y + this.f7856x + this.f7858z + Math.max(intValue, num != null ? num.intValue() : 0))), Integer.valueOf((int) max));
    }

    public final void e() {
        h0 h0Var;
        float f6;
        Rect rect;
        float f10;
        RectF rectF;
        float f11;
        ArrayList layoutsFirst;
        ArrayList layoutsSecond;
        float size;
        float size2;
        int i5 = this.j;
        i0 i0Var = this.f7842h0;
        if (i5 == 0 || this.f7844k == 0) {
            i0Var.f24732c = null;
            i0Var.f24733d = null;
            i0Var.f24734e = null;
            i0Var.f24735f = null;
            i0Var.f24730a = null;
            i0Var.f24731b = null;
            return;
        }
        this.C = new RectF(this.f7857y + this.f7856x, 0.0f, this.j - this.f7858z, this.f7844k - 0.0f);
        if ((this.f7845l.isEmpty() && this.f7846m.isEmpty()) || this.C.isEmpty() || this.C.width() < this.B) {
            i0Var.f24732c = null;
            i0Var.f24733d = null;
            i0Var.f24734e = null;
            i0Var.f24735f = null;
            i0Var.f24730a = null;
            i0Var.f24731b = null;
            return;
        }
        RectF rectF2 = this.C;
        List list = this.f7845l;
        List list2 = this.f7846m;
        int width = (int) rectF2.width();
        float height = rectF2.height();
        float f12 = this.f7855w;
        if (height <= 0.0f || width <= 0) {
            e0 e0Var = e0.f19204a;
            h0Var = new h0(f12, 0.0f, 0.0f, 0.0f, e0Var, e0Var);
        } else {
            float f13 = this.A;
            float f14 = this.f7847n;
            float f15 = f13;
            while (true) {
                TextPaint textPaint = this.f7838f;
                textPaint.setTextSize(f15);
                float f16 = this.B * f15;
                float f17 = this.A;
                float f18 = (f16 / f17) - f15;
                f11 = ((this.f7848o * f15) / f17) * f14;
                layoutsFirst = new ArrayList(v.k(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    layoutsFirst.add(d((CharSequence) it.next(), Integer.valueOf(width), textPaint));
                }
                layoutsSecond = new ArrayList(v.k(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    layoutsSecond.add(d((CharSequence) it2.next(), Integer.valueOf(width), textPaint));
                    height = height;
                }
                float f19 = height;
                Iterator it3 = layoutsFirst.iterator();
                int i10 = 0;
                while (it3.hasNext()) {
                    i10 += ((Layout) it3.next()).getHeight();
                }
                size = ((layoutsFirst.size() - 1) * f11) + i10;
                Iterator it4 = layoutsSecond.iterator();
                int i11 = 0;
                while (it4.hasNext()) {
                    i11 += ((Layout) it4.next()).getHeight();
                }
                size2 = ((layoutsSecond.size() - 1) * f11) + i11;
                float max = Math.max(size, size2) + f18;
                Intrinsics.checkNotNullParameter(layoutsFirst, "layoutsFirst");
                Intrinsics.checkNotNullParameter(layoutsSecond, "layoutsSecond");
                if (max < f19 || f15 <= f12) {
                    break;
                }
                float f20 = this.f7849p;
                if (f14 <= 1.0f) {
                    f15 -= f20;
                    f14 = 1.0f;
                } else {
                    f14 -= f20;
                }
                height = f19;
            }
            h0Var = new h0(f15, size, size2, f11, layoutsFirst, layoutsSecond);
        }
        ArrayList arrayList = this.G;
        arrayList.clear();
        ArrayList arrayList2 = this.H;
        arrayList2.clear();
        ArrayList arrayList3 = this.I;
        arrayList3.clear();
        ArrayList arrayList4 = this.J;
        arrayList4.clear();
        ArrayList arrayList5 = this.E;
        arrayList5.clear();
        ArrayList arrayList6 = this.F;
        arrayList6.clear();
        float f21 = (this.B * h0Var.f24724a) / this.A;
        RectF rectF3 = this.f7840g0;
        rectF3.set(0.0f, 0.0f, f21, f21);
        float width2 = rectF3.width() / this.B;
        float f22 = this.q * width2;
        float f23 = this.f7850r * width2;
        float f24 = this.f7851s * width2;
        float f25 = this.f7852t * width2;
        Path path = new Path();
        path.moveTo(rectF3.right - f22, rectF3.top + f22);
        path.lineTo(rectF3.right - f23, rectF3.bottom - f22);
        path.lineTo(rectF3.left + f24, rectF3.bottom - f25);
        float height2 = this.C.height();
        float f26 = 2;
        float f27 = h0Var.f24727d;
        float f28 = f27 / f26;
        RectF rectF4 = this.C;
        float f29 = ((height2 - h0Var.f24725b) / f26) + rectF4.top;
        float f30 = rectF4.left;
        Iterator it5 = h0Var.f24728e.iterator();
        float f31 = f29;
        while (true) {
            boolean hasNext = it5.hasNext();
            f6 = f26;
            rect = this.L;
            f10 = f27;
            rectF = this.K;
            if (!hasNext) {
                break;
            }
            float f32 = f28;
            Layout layout = (Layout) it5.next();
            i0 i0Var2 = i0Var;
            int height3 = layout.getHeight();
            arrayList.add(new k0(layout, f30, f31));
            float f33 = f31;
            float f34 = height3;
            rectF.set(f30, f31 - f32, layout.getWidth() + f30, f33 + f34 + f32);
            arrayList5.add(new RectF(rectF));
            layout.getLineBounds(0, rect);
            arrayList3.add(new j0(rectF3, path, this.f7857y, f33 - ((f21 - rect.height()) / f6)));
            f31 = f34 + f10 + f33;
            i0Var = i0Var2;
            f26 = f6;
            f27 = f10;
            f28 = f32;
            arrayList4 = arrayList4;
        }
        i0 i0Var3 = i0Var;
        ArrayList arrayList7 = arrayList4;
        float f35 = f28;
        RectF rectF5 = this.C;
        float f36 = ((height2 - h0Var.f24726c) / f6) + rectF5.top;
        float f37 = rectF5.left;
        for (Iterator it6 = h0Var.f24729f.iterator(); it6.hasNext(); it6 = it6) {
            Layout layout2 = (Layout) it6.next();
            int height4 = layout2.getHeight();
            arrayList2.add(new k0(layout2, f37, f36));
            float f38 = height4;
            float f39 = f36;
            rectF.set(f37, f36 - f35, layout2.getWidth() + f37, f36 + f38 + f35);
            arrayList6.add(new RectF(rectF));
            layout2.getLineBounds(0, rect);
            arrayList7.add(new j0(rectF3, path, this.f7857y, f39 - ((f21 - rect.height()) / f6)));
            f36 = f38 + f10 + f39;
        }
        i0Var3.f24730a = arrayList5;
        i0Var3.f24731b = arrayList6;
        i0Var3.f24732c = arrayList;
        i0Var3.f24733d = arrayList2;
        i0Var3.f24734e = arrayList3;
        i0Var3.f24735f = arrayList7;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7833a = new GestureDetector(getContext(), new c(5, this));
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7834b = null;
        this.f7833a = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int save;
        Paint paint = this.f7841h;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        boolean z5 = this.D;
        i0 i0Var = this.f7842h0;
        ArrayList<k0> arrayList = z5 ? i0Var.f24733d : i0Var.f24732c;
        if (arrayList != null) {
            for (k0 k0Var : arrayList) {
                float f6 = k0Var.f24741b;
                float f10 = k0Var.f24742c;
                save = canvas.save();
                canvas.translate(f6, f10);
                try {
                    k0Var.f24740a.draw(canvas);
                } finally {
                }
            }
        }
        ArrayList<j0> arrayList2 = this.D ? i0Var.f24735f : i0Var.f24734e;
        if (arrayList2 != null) {
            for (j0 j0Var : arrayList2) {
                float f11 = j0Var.f24738c;
                float f12 = j0Var.f24739d;
                save = canvas.save();
                canvas.translate(f11, f12);
                try {
                    canvas.drawOval(j0Var.f24736a, paint);
                    canvas.drawPath(j0Var.f24737b, paint);
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0181  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i5, int i10) {
        float w10;
        float descent;
        Integer valueOf;
        int intValue;
        Pair pair;
        Pair pair2;
        Pair pair3;
        super.onMeasure(i5, i10);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824 && mode2 == 1073741824) {
            pair3 = new Pair(Integer.valueOf(size), Integer.valueOf(size2));
        } else if (mode == 1073741824 && mode2 == Integer.MIN_VALUE) {
            pair3 = new Pair(Integer.valueOf(size), Integer.valueOf(size2));
        } else if (mode == 1073741824 && mode2 == 0) {
            pair3 = new Pair(Integer.valueOf(size), Integer.valueOf(b(size)));
        } else if (mode == Integer.MIN_VALUE && mode2 == 1073741824) {
            pair3 = new Pair(Integer.valueOf(size), Integer.valueOf(size2));
        } else if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            pair3 = new Pair(Integer.valueOf(size), Integer.valueOf(size2));
        } else if (mode == Integer.MIN_VALUE && mode2 == 0) {
            pair3 = new Pair(Integer.valueOf(size), Integer.valueOf(b(size)));
        } else if (mode == 0 && mode2 == 1073741824) {
            pair3 = new Pair(c(size2).f19192a, Integer.valueOf(size2));
        } else {
            if (mode == 0 && mode2 == Integer.MIN_VALUE) {
                Pair c2 = c(size2);
                pair2 = new Pair(c2.f19192a, Integer.valueOf(Math.min(((Number) c2.f19193b).intValue(), size2)));
            } else {
                if (a()) {
                    pair = new Pair(Integer.valueOf((int) (this.f7857y + this.f7856x + this.f7858z)), Integer.valueOf((int) 0.0f));
                } else {
                    float f6 = this.B - this.A;
                    float f10 = this.f7848o * this.f7847n;
                    int size3 = this.f7845l.size();
                    int size4 = this.f7846m.size();
                    TextPaint textPaint = this.f7837e;
                    if (size3 == 0) {
                        w10 = 0.0f;
                    } else {
                        float f11 = size3;
                        w10 = e.w(f11, 1.0f, f10, (textPaint.descent() - textPaint.ascent()) * f11);
                    }
                    if (size4 == 0) {
                        descent = 0.0f;
                    } else {
                        descent = ((size4 - 1) * f10) + ((textPaint.descent() - textPaint.ascent()) * size4);
                    }
                    float max = Math.max(w10, descent) + f6 + 0.0f + 0.0f;
                    Integer num = null;
                    int i11 = 0;
                    if (size3 != 0) {
                        Iterator it = this.f7845l.iterator();
                        if (it.hasNext()) {
                            valueOf = Integer.valueOf((int) textPaint.measureText(((CharSequence) it.next()).toString()));
                            while (it.hasNext()) {
                                Integer valueOf2 = Integer.valueOf((int) textPaint.measureText(((CharSequence) it.next()).toString()));
                                if (valueOf.compareTo(valueOf2) < 0) {
                                    valueOf = valueOf2;
                                }
                            }
                        } else {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            intValue = valueOf.intValue();
                            if (size4 != 0) {
                                Iterator it2 = this.f7846m.iterator();
                                if (it2.hasNext()) {
                                    num = Integer.valueOf((int) textPaint.measureText(((CharSequence) it2.next()).toString()));
                                    while (it2.hasNext()) {
                                        Integer valueOf3 = Integer.valueOf((int) textPaint.measureText(((CharSequence) it2.next()).toString()));
                                        if (num.compareTo(valueOf3) < 0) {
                                            num = valueOf3;
                                        }
                                    }
                                }
                                if (num != null) {
                                    i11 = num.intValue();
                                }
                            }
                            pair = new Pair(Integer.valueOf((int) (this.f7857y + this.f7856x + this.f7858z + Math.max(intValue, i11))), Integer.valueOf((int) max));
                        }
                    }
                    intValue = 0;
                    if (size4 != 0) {
                    }
                    pair = new Pair(Integer.valueOf((int) (this.f7857y + this.f7856x + this.f7858z + Math.max(intValue, i11))), Integer.valueOf((int) max));
                }
                pair2 = new Pair(pair.f19192a, pair.f19193b);
            }
            pair3 = pair2;
        }
        setMeasuredDimension(View.resolveSize(((Number) pair3.f19192a).intValue(), i5), View.resolveSize(((Number) pair3.f19193b).intValue(), i10));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        this.f7844k = i10;
        this.j = i5;
        e();
        invalidate();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        GestureDetector gestureDetector = this.f7833a;
        return gestureDetector != null ? gestureDetector.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
    }

    public final void setColorIcOk(@Nullable Integer color) {
        this.f7841h.setColor(color != null ? color.intValue() : this.f7835c);
        invalidate();
    }

    public final void setFont(@Nullable Typeface font) {
        if (Intrinsics.areEqual(this.f7836d, font)) {
            return;
        }
        if (font == null) {
            font = Typeface.DEFAULT;
        }
        this.f7836d = font;
        this.f7838f.setTypeface(font);
        this.f7837e.setTypeface(this.f7836d);
        this.f7839g.setTypeface(this.f7836d);
        e();
        requestLayout();
        invalidate();
    }

    public final void setListener(@Nullable l0 listener) {
        this.f7834b = listener;
    }

    public final void setOrder(boolean second) {
        this.D = second;
        invalidate();
    }

    public final void setProfitLists(@NotNull Pair<? extends List<? extends CharSequence>, ? extends List<? extends CharSequence>> profitLists) {
        Intrinsics.checkNotNullParameter(profitLists, "profitLists");
        this.f7845l = (List) profitLists.f19192a;
        this.f7846m = (List) profitLists.f19193b;
        e();
        requestLayout();
        invalidate();
    }
}
