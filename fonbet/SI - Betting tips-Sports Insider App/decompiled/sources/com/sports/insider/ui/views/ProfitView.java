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
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.sports.insider.R;
import f0.l;
import gf.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ve.c;
import ve.g0;
import yg.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0019\u001a\u00020\n2\u001e\u0010\u0018\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010 \u001a\u00020\u001b8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\u00020\u001b8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001f¨\u0006$"}, d2 = {"Lcom/sports/insider/ui/views/ProfitView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lve/g0;", "listener", "", "setListener", "(Lve/g0;)V", "", "color", "setColorIcOk", "(Ljava/lang/Integer;)V", "", "first", "setOrder", "(Z)V", "Lkotlin/Pair;", "", "", "pairList", "setListProfit", "(Lkotlin/Pair;)V", "", "u", "F", "getStartMarginFrame", "()F", "startMarginFrame", "v", "getEndMarginFrame", "endMarginFrame", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProfitView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfitView.kt\ncom/sports/insider/ui/views/ProfitView\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,484:1\n404#2:485\n404#2:520\n1869#3,2:486\n1869#3,2:488\n1869#3,2:490\n1869#3,2:492\n1869#3,2:494\n1869#3,2:496\n1878#3,3:498\n1869#3:501\n1870#3:510\n1869#3:511\n1870#3:519\n1869#3,2:521\n1869#3,2:523\n1869#3,2:525\n1869#3,2:527\n44#4,8:502\n27#4,7:512\n*S KotlinDebug\n*F\n+ 1 ProfitView.kt\ncom/sports/insider/ui/views/ProfitView\n*L\n69#1:485\n328#1:520\n187#1:486,2\n195#1:488,2\n208#1:490,2\n209#1:492,2\n234#1:494,2\n245#1:496,2\n271#1:498,3\n300#1:501\n300#1:510\n311#1:511\n311#1:519\n351#1:521,2\n359#1:523,2\n375#1:525,2\n376#1:527,2\n301#1:502,8\n312#1:512,7\n*E\n"})
/* loaded from: classes.dex */
public final class ProfitView extends View {
    public static final /* synthetic */ int A = 0;

    /* renamed from: a, reason: collision with root package name */
    public GestureDetector f7809a;

    /* renamed from: b, reason: collision with root package name */
    public g0 f7810b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7811c;

    /* renamed from: d, reason: collision with root package name */
    public final Typeface f7812d;

    /* renamed from: e, reason: collision with root package name */
    public final TextPaint f7813e;

    /* renamed from: f, reason: collision with root package name */
    public final TextPaint f7814f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f7815g;

    /* renamed from: h, reason: collision with root package name */
    public final DisplayMetrics f7816h;

    /* renamed from: i, reason: collision with root package name */
    public int f7817i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public List f7818k;

    /* renamed from: l, reason: collision with root package name */
    public List f7819l;

    /* renamed from: m, reason: collision with root package name */
    public float f7820m;

    /* renamed from: n, reason: collision with root package name */
    public float f7821n;

    /* renamed from: o, reason: collision with root package name */
    public float f7822o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f7823p;
    public final ArrayList q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f7824r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f7825s;

    /* renamed from: t, reason: collision with root package name */
    public float f7826t;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final float startMarginFrame;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final float endMarginFrame;

    /* renamed from: w, reason: collision with root package name */
    public final float f7829w;

    /* renamed from: x, reason: collision with root package name */
    public final float f7830x;

    /* renamed from: y, reason: collision with root package name */
    public RectF f7831y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7832z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfitView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Typeface DEFAULT;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7811c = "#03F39E";
        this.f7813e = new TextPaint(1);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setLetterSpacing(0.0f);
        textPaint.setStrokeWidth(0.0f);
        textPaint.setColor(-1);
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f7814f = textPaint;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(Color.parseColor("#03F39E"));
        this.f7815g = paint;
        this.f7818k = new ArrayList();
        this.f7819l = new ArrayList();
        this.f7823p = new ArrayList();
        this.q = new ArrayList();
        this.f7824r = new ArrayList();
        this.f7825s = new ArrayList();
        this.f7826t = 2.0f;
        this.startMarginFrame = 13.0f;
        this.endMarginFrame = 13.0f;
        this.f7829w = 16.0f;
        this.f7830x = 17.0f;
        this.f7831y = new RectF();
        this.f7816h = a.b(context, "getDisplayMetrics(...)");
        DisplayMetrics displayMetrics = null;
        try {
            DEFAULT = l.b(getContext(), R.font.arimo_regular);
        } catch (Throwable unused) {
            DEFAULT = null;
        }
        if (DEFAULT == null) {
            DEFAULT = Typeface.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        }
        this.f7812d = DEFAULT;
        TextPaint textPaint2 = this.f7814f;
        if (DEFAULT == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fontArimoRegular");
            DEFAULT = null;
        }
        textPaint2.setTypeface(DEFAULT);
        Paint paint2 = this.f7815g;
        DisplayMetrics displayMetrics2 = this.f7816h;
        if (displayMetrics2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics2 = null;
        }
        paint2.setStrokeWidth(displayMetrics2.density * 1.5f);
        TextPaint textPaint3 = this.f7813e;
        Typeface typeface = this.f7812d;
        if (typeface == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fontArimoRegular");
            typeface = null;
        }
        textPaint3.setTypeface(typeface);
        textPaint3.setLetterSpacing(0.0f);
        textPaint3.setStrokeWidth(0.0f);
        textPaint3.setColor(-1);
        textPaint3.setStyle(Paint.Style.FILL_AND_STROKE);
        DisplayMetrics displayMetrics3 = this.f7816h;
        if (displayMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
        } else {
            displayMetrics = displayMetrics3;
        }
        float f6 = this.f7829w;
        Intrinsics.checkNotNullParameter(displayMetrics, "<this>");
        textPaint3.setTextSize(Build.VERSION.SDK_INT >= 34 ? TypedValue.applyDimension(2, f6, displayMetrics) : displayMetrics.scaledDensity * f6);
    }

    public static Layout a(ProfitView profitView, CharSequence charSequence, Integer num, TextPaint textPaint) {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        if (Build.VERSION.SDK_INT >= 28) {
            DynamicLayout build = DynamicLayout.Builder.obtain(charSequence, textPaint, num.intValue()).setAlignment(alignment).setIncludePad(true).setLineSpacing(0.0f, 1.0f).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }
        StaticLayout build2 = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, num.intValue()).setAlignment(alignment).setEllipsize(TextUtils.TruncateAt.END).setIncludePad(true).setLineSpacing(0.0f, 1.0f).setMaxLines(Integer.MAX_VALUE).build();
        Intrinsics.checkNotNull(build2);
        return build2;
    }

    private final float getEndMarginFrame() {
        DisplayMetrics displayMetrics = this.f7816h;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        return this.endMarginFrame * displayMetrics.density;
    }

    private final float getStartMarginFrame() {
        DisplayMetrics displayMetrics = this.f7816h;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        return this.startMarginFrame * displayMetrics.density;
    }

    public final Path b(RectF rectF) {
        DisplayMetrics displayMetrics = this.f7816h;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        float f6 = displayMetrics.density;
        float f10 = (rectF.right - rectF.left) / (this.f7830x * f6);
        float f11 = 5.76f * f6 * f10;
        float f12 = 9.6f * f6 * f10;
        float f13 = 5.12f * f6 * f10;
        float f14 = f6 * 7.2f * f10;
        Path path = new Path();
        path.moveTo(rectF.right - f11, rectF.top + f11);
        path.lineTo(rectF.right - f12, rectF.bottom - f11);
        path.lineTo(rectF.left + f13, rectF.bottom - f14);
        return path;
    }

    public final void c() {
        float f6;
        if (this.f7817i == 0 || this.j == 0) {
            return;
        }
        float startMarginFrame = getStartMarginFrame();
        float f10 = 39;
        DisplayMetrics displayMetrics = this.f7816h;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        this.f7831y = new RectF((f10 * displayMetrics.density) + startMarginFrame, 0.0f, this.f7817i - getEndMarginFrame(), this.j);
        if (this.f7818k.isEmpty() && this.f7819l.isEmpty()) {
            invalidate();
            return;
        }
        if (this.f7818k.isEmpty()) {
            this.f7818k = this.f7819l;
        } else if (this.f7819l.isEmpty()) {
            this.f7819l = this.f7818k;
        }
        RectF rectF = this.f7831y;
        DisplayMetrics displayMetrics2 = this.f7816h;
        if (displayMetrics2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics2 = null;
        }
        Intrinsics.checkNotNullParameter(displayMetrics2, "<this>");
        int i5 = Build.VERSION.SDK_INT;
        float f11 = this.f7829w;
        float applyDimension = i5 >= 34 ? TypedValue.applyDimension(2, f11, displayMetrics2) : displayMetrics2.scaledDensity * f11;
        DisplayMetrics displayMetrics3 = this.f7816h;
        if (displayMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics3 = null;
        }
        Intrinsics.checkNotNullParameter(displayMetrics3, "<this>");
        float f12 = 1.0f;
        float applyDimension2 = i5 >= 34 ? TypedValue.applyDimension(2, 1.0f, displayMetrics3) : displayMetrics3.scaledDensity * 1.0f;
        List list = this.f7818k;
        List list2 = this.f7819l;
        boolean z5 = true;
        while (z5) {
            TextPaint textPaint = this.f7814f;
            textPaint.setTextSize(applyDimension);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a(this, (CharSequence) it.next(), Integer.valueOf((int) (rectF.right - rectF.left)), textPaint));
                f12 = f12;
            }
            float f13 = f12;
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(a(this, (CharSequence) it2.next(), Integer.valueOf((int) (rectF.right - rectF.left)), textPaint));
            }
            DisplayMetrics displayMetrics4 = this.f7816h;
            if (displayMetrics4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("metrics");
                displayMetrics4 = null;
            }
            float f14 = this.f7830x * displayMetrics4.density * applyDimension;
            DisplayMetrics displayMetrics5 = this.f7816h;
            if (displayMetrics5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("metrics");
                displayMetrics5 = null;
            }
            float f15 = (f14 / (displayMetrics5.density * f11)) - applyDimension;
            float f16 = 10 * applyDimension;
            DisplayMetrics displayMetrics6 = this.f7816h;
            if (displayMetrics6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("metrics");
                displayMetrics6 = null;
            }
            float f17 = f16 * displayMetrics6.density;
            DisplayMetrics displayMetrics7 = this.f7816h;
            if (displayMetrics7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("metrics");
                displayMetrics7 = null;
            }
            float f18 = (f17 / (displayMetrics7.density * f11)) * this.f7826t;
            float f19 = 0;
            float size = ((arrayList.size() - 1) * f18) + f19;
            float size2 = ((arrayList2.size() - 1) * f18) + f19;
            while (arrayList.iterator().hasNext()) {
                size += ((Layout) r3.next()).getHeight();
            }
            while (arrayList2.iterator().hasNext()) {
                size2 += ((Layout) r3.next()).getHeight();
            }
            if (Math.max(size, size2) + f15 >= rectF.bottom - rectF.top && applyDimension >= applyDimension2) {
                float f20 = this.f7826t;
                if (f20 <= f13) {
                    f6 = f13;
                    this.f7826t = f6;
                    applyDimension -= 0.2f;
                } else {
                    f6 = f13;
                    this.f7826t = f20 - 0.2f;
                }
                f12 = f6;
            } else {
                f12 = f13;
                z5 = false;
            }
        }
        TextPaint textPaint2 = this.f7813e;
        textPaint2.setTextSize(applyDimension);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (CharSequence charSequence : this.f7818k) {
            RectF rectF2 = this.f7831y;
            arrayList3.add(a(this, charSequence, Integer.valueOf((int) (rectF2.right - rectF2.left)), textPaint2));
        }
        for (CharSequence charSequence2 : this.f7819l) {
            RectF rectF3 = this.f7831y;
            arrayList4.add(a(this, charSequence2, Integer.valueOf((int) (rectF3.right - rectF3.left)), textPaint2));
        }
        float f21 = 0.0f;
        while (arrayList3.iterator().hasNext()) {
            f21 += ((Layout) r4.next()).getHeight();
        }
        float f22 = 0.0f;
        while (arrayList4.iterator().hasNext()) {
            f22 += ((Layout) r4.next()).getHeight();
        }
        float textSize = textPaint2.getTextSize();
        float f23 = 10;
        DisplayMetrics displayMetrics8 = this.f7816h;
        if (displayMetrics8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics8 = null;
        }
        float f24 = f23 * displayMetrics8.density * textSize;
        DisplayMetrics displayMetrics9 = this.f7816h;
        if (displayMetrics9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics9 = null;
        }
        this.f7822o = (f24 / (f11 * displayMetrics9.density)) * this.f7826t;
        float size3 = ((arrayList3.size() - 1) * this.f7822o) + f21;
        float size4 = ((arrayList4.size() - 1) * this.f7822o) + f22;
        RectF rectF4 = this.f7831y;
        float f25 = rectF4.bottom - rectF4.top;
        float f26 = 2;
        this.f7820m = (f25 - size3) / f26;
        this.f7821n = (f25 - size4) / f26;
        float f27 = rectF4.left;
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        float f28 = this.f7831y.top + this.f7820m;
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList7.add(new u((Layout) it3.next(), Float.valueOf(f27), Float.valueOf(f28)));
            arrayList5.add(new RectF(f27, f28 - (this.f7822o / f26), r10.getWidth() + f27, (this.f7822o / f26) + r10.getHeight() + f28));
            f28 += r10.getHeight() + this.f7822o;
        }
        float f29 = this.f7831y.top + this.f7821n;
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            arrayList8.add(new u((Layout) it4.next(), Float.valueOf(f27), Float.valueOf(f29)));
            arrayList6.add(new RectF(f27, f29 - (this.f7822o / f26), r9.getWidth() + f27, (this.f7822o / f26) + r9.getHeight() + f29));
            f29 += r9.getHeight() + this.f7822o;
        }
        ArrayList arrayList9 = this.q;
        arrayList9.clear();
        ArrayList arrayList10 = this.f7825s;
        arrayList10.clear();
        arrayList9.addAll(arrayList5);
        arrayList10.addAll(arrayList6);
        ArrayList arrayList11 = this.f7823p;
        arrayList11.clear();
        ArrayList arrayList12 = this.f7824r;
        arrayList12.clear();
        arrayList11.addAll(arrayList7);
        arrayList12.addAll(arrayList8);
        invalidate();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int save;
        Paint paint = this.f7815g;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.draw(canvas);
        boolean z5 = this.f7832z;
        ArrayList<u> arrayList = this.f7823p;
        ArrayList arrayList2 = this.f7824r;
        for (u uVar : z5 ? arrayList2 : arrayList) {
            float floatValue = ((Number) uVar.f10040b).floatValue();
            float floatValue2 = ((Number) uVar.f10041c).floatValue();
            save = canvas.save();
            canvas.translate(floatValue, floatValue2);
            try {
                ((Layout) uVar.f10039a).draw(canvas);
                canvas.restoreToCount(save);
            } finally {
                canvas.restoreToCount(save);
            }
        }
        float f6 = 13;
        DisplayMetrics displayMetrics = this.f7816h;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        float f10 = f6 * displayMetrics.density;
        float f11 = this.f7831y.top;
        boolean z7 = this.f7832z;
        float f12 = f11 + (z7 ? this.f7821n : this.f7820m);
        if (z7) {
            arrayList = arrayList2;
        }
        for (u uVar2 : arrayList) {
            save = canvas.save();
            try {
                ((Layout) uVar2.f10039a).getLineBounds(0, new Rect());
                float f13 = this.f7830x;
                DisplayMetrics displayMetrics2 = this.f7816h;
                if (displayMetrics2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("metrics");
                    displayMetrics2 = null;
                }
                float textSize = f13 * displayMetrics2.density * this.f7813e.getTextSize();
                float f14 = this.f7829w;
                DisplayMetrics displayMetrics3 = this.f7816h;
                if (displayMetrics3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("metrics");
                    displayMetrics3 = null;
                }
                float f15 = textSize / (f14 * displayMetrics3.density);
                RectF rectF = new RectF(0.0f, 0.0f, f15, f15);
                canvas.translate(f10, f12 - ((f15 - r8.height()) / 2));
                canvas.drawOval(rectF, paint);
                canvas.drawPath(b(rectF), paint);
                f12 += ((Layout) uVar2.f10039a).getHeight() + this.f7822o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
        this.f7809a = new GestureDetector(getContext(), new c(4, this));
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7810b = null;
        this.f7809a = null;
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(0, size);
        }
        this.f7817i = size;
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(0, size2);
        }
        this.j = size2;
        setMeasuredDimension(this.f7817i, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        this.j = i10;
        this.f7817i = i5;
        c();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        GestureDetector gestureDetector = this.f7809a;
        return gestureDetector != null ? gestureDetector.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
    }

    public final void setColorIcOk(@Nullable Integer color) {
        this.f7815g.setColor(color != null ? color.intValue() : Color.parseColor(this.f7811c));
        invalidate();
    }

    public final void setListProfit(@NotNull Pair<? extends List<? extends CharSequence>, ? extends List<? extends CharSequence>> pairList) {
        Intrinsics.checkNotNullParameter(pairList, "pairList");
        this.f7818k = (List) pairList.f19192a;
        this.f7819l = (List) pairList.f19193b;
        c();
    }

    public final void setListener(@Nullable g0 listener) {
        this.f7810b = listener;
    }

    public final void setOrder(boolean first) {
        this.f7832z = first;
        invalidate();
    }
}
