package ve;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.f1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends View {

    /* renamed from: a, reason: collision with root package name */
    public final String f24702a;

    /* renamed from: b, reason: collision with root package name */
    public final float f24703b;

    /* renamed from: c, reason: collision with root package name */
    public final TextPaint f24704c;

    /* renamed from: d, reason: collision with root package name */
    public final TextPaint f24705d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f24706e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f24707f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f24708g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f24709h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f24710i;
    public final TextPaint j;

    /* renamed from: k, reason: collision with root package name */
    public final TextPaint f24711k;

    /* renamed from: l, reason: collision with root package name */
    public final int f24712l;

    /* renamed from: m, reason: collision with root package name */
    public final int f24713m;

    /* renamed from: n, reason: collision with root package name */
    public final int f24714n;

    /* renamed from: o, reason: collision with root package name */
    public final int f24715o;

    /* renamed from: p, reason: collision with root package name */
    public final int f24716p;
    public int q;

    /* renamed from: r, reason: collision with root package name */
    public int f24717r;

    /* renamed from: s, reason: collision with root package name */
    public GestureDetector f24718s;

    /* renamed from: t, reason: collision with root package name */
    public ValueAnimator f24719t;

    /* renamed from: u, reason: collision with root package name */
    public float f24720u;

    /* renamed from: v, reason: collision with root package name */
    public final g f24721v;

    /* renamed from: w, reason: collision with root package name */
    public e f24722w;

    /* renamed from: x, reason: collision with root package name */
    public Rect f24723x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f24702a = "ChangeLangDialogView:";
        this.f24703b = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f24704c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f24705d = textPaint2;
        Paint paint = new Paint(1);
        this.f24706e = paint;
        Paint paint2 = new Paint(1);
        this.f24707f = paint2;
        Paint paint3 = new Paint(1);
        this.f24708g = paint3;
        Paint paint4 = new Paint(1);
        this.f24709h = paint4;
        Paint paint5 = new Paint(1);
        this.f24710i = paint5;
        TextPaint textPaint3 = new TextPaint(1);
        this.j = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        this.f24711k = textPaint4;
        SpannableString[] items = new SpannableString[0];
        SpannableString[] itemsTitle = new SpannableString[0];
        f[] languageItem = new f[0];
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemsTitle, "itemsTitle");
        Intrinsics.checkNotNullParameter(languageItem, "languageItem");
        g gVar = new g();
        gVar.f24689a = items;
        gVar.f24690b = 0;
        gVar.f24691c = itemsTitle;
        gVar.f24692d = null;
        gVar.f24693e = 0.0f;
        gVar.f24694f = null;
        gVar.f24695g = null;
        gVar.f24696h = 0;
        gVar.f24697i = null;
        gVar.j = null;
        gVar.f24698k = null;
        gVar.f24699l = null;
        gVar.f24700m = null;
        gVar.f24701n = languageItem;
        this.f24721v = gVar;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f24703b = displayMetrics.density;
        this.f24714n = Color.parseColor("#545458");
        this.f24713m = Color.parseColor("#03F39E");
        this.f24712l = Color.parseColor("#F7F7F7");
        this.f24715o = Color.parseColor("#1A1A1A");
        this.f24716p = Color.parseColor("#4DB0B0B0");
        textPaint2.setColor(this.f24715o);
        Paint.Style style = Paint.Style.FILL;
        textPaint2.setStyle(style);
        Intrinsics.checkNotNull(displayMetrics);
        Intrinsics.checkNotNullParameter(displayMetrics, "<this>");
        float applyDimension = Build.VERSION.SDK_INT >= 34 ? TypedValue.applyDimension(2, 17.0f, displayMetrics) : displayMetrics.scaledDensity * 17.0f;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textPaint.setTypeface(typeface);
        textPaint.setLetterSpacing(0.0f);
        textPaint.setStrokeWidth(0.0f);
        textPaint.setColor(this.f24712l);
        Paint.Style style2 = Paint.Style.FILL_AND_STROKE;
        textPaint.setStyle(style2);
        textPaint.setTextSize(applyDimension);
        paint2.setStrokeWidth(getDp2());
        paint2.setColor(this.f24712l);
        paint2.setStyle(style2);
        paint3.setStrokeWidth(getDp2());
        paint3.setColor(this.f24714n);
        Paint.Style style3 = Paint.Style.STROKE;
        paint3.setStyle(style3);
        paint4.setStrokeWidth(getDp2());
        paint4.setColor(this.f24713m);
        paint4.setStyle(style3);
        paint.setColor(this.f24716p);
        paint.setStyle(style);
        paint5.setColor(this.f24713m);
        paint5.setStyle(style2);
        textPaint3.setTypeface(typeface);
        textPaint3.setLetterSpacing(0.0f);
        textPaint3.setStrokeWidth(0.0f);
        textPaint3.setColor(this.f24713m);
        textPaint3.setStyle(style2);
        textPaint3.setTextSize(applyDimension);
        textPaint4.setTypeface(typeface);
        textPaint4.setLetterSpacing(0.0f);
        textPaint4.setStrokeWidth(0.0f);
        textPaint4.setColor(this.f24714n);
        textPaint4.setStyle(style2);
        textPaint4.setTextSize(applyDimension);
        SpannableString[] spannableStringArr = {new SpannableString("Sprache"), new SpannableString("Idioma"), new SpannableString("Language"), new SpannableString("Langue"), new SpannableString("Idioma"), new SpannableString("Язык")};
        Intrinsics.checkNotNullParameter(spannableStringArr, "<set-?>");
        gVar.f24691c = spannableStringArr;
        SpannableString[] spannableStringArr2 = {new SpannableString("Deutsch"), new SpannableString("Español"), new SpannableString("English"), new SpannableString("Français"), new SpannableString("Português"), new SpannableString("Русский")};
        Intrinsics.checkNotNullParameter(spannableStringArr2, "<set-?>");
        gVar.f24689a = spannableStringArr2;
        f[] fVarArr = {new f(0), new f(1), new f(2), new f(3), new f(4), new f(5)};
        Intrinsics.checkNotNullParameter(fVarArr, "<set-?>");
        gVar.f24701n = fVarArr;
    }

    public static final f a(h hVar, float f6, float f10, f[] fVarArr) {
        Rect rect;
        int i5;
        if (fVarArr.length == 0) {
            return null;
        }
        for (f fVar : fVarArr) {
            if (fVar != null && (rect = fVar.f24619d) != null) {
                int i10 = rect.left;
                IntRange intRange = new IntRange(i10, rect.right, 1);
                Rect rect2 = fVar.f24619d;
                if (rect2 != null) {
                    int i11 = rect2.top;
                    IntRange intRange2 = new IntRange(i11, rect2.bottom, 1);
                    int i12 = (int) f6;
                    if (i10 <= i12 && i12 <= intRange.f19235b && i11 <= (i5 = (int) f10) && i5 <= intRange2.f19235b) {
                        return fVar;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    public static final boolean b(h hVar, float f6, float f10, Rect rect) {
        if (rect == null || rect.isEmpty()) {
            return false;
        }
        int i5 = rect.left;
        int i10 = rect.right;
        int i11 = (int) f6;
        if (i5 > i11 || i11 > i10) {
            return false;
        }
        int i12 = (int) f10;
        return rect.top <= i12 && i12 <= rect.bottom;
    }

    public static Layout d(int i5, SpannableString spannableString, TextPaint textPaint) {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        if (spannableString == null || spannableString.length() == 0 || StringsKt.H(spannableString) || i5 <= 5) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            DynamicLayout build = DynamicLayout.Builder.obtain(spannableString, textPaint, (int) textPaint.measureText(spannableString.toString())).setEllipsizedWidth(i5).setEllipsize(TextUtils.TruncateAt.END).setAlignment(alignment).setIncludePad(true).setLineSpacing(0.0f, 1.0f).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }
        StaticLayout build2 = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, (int) textPaint.measureText(spannableString.toString())).setEllipsizedWidth(i5).setAlignment(alignment).setEllipsize(TextUtils.TruncateAt.END).setIncludePad(true).setLineSpacing(0.0f, 1.0f).setMaxLines(1).build();
        Intrinsics.checkNotNull(build2);
        return build2;
    }

    private final int getDp0() {
        return 0;
    }

    private final int getDp1() {
        return (int) (1 * this.f24703b);
    }

    private final int getDp14() {
        return (int) (14 * this.f24703b);
    }

    private final int getDp16() {
        return (int) (16 * this.f24703b);
    }

    private final int getDp18() {
        return (int) (18 * this.f24703b);
    }

    private final int getDp2() {
        return (int) (2 * this.f24703b);
    }

    private final int getDp20() {
        return (int) (20 * this.f24703b);
    }

    private final int getDp21() {
        return (int) (21 * this.f24703b);
    }

    private final int getDp24() {
        return (int) (24 * this.f24703b);
    }

    private final int getDp29() {
        return (int) (29 * this.f24703b);
    }

    private final int getDp40() {
        return (int) (40 * this.f24703b);
    }

    private final int getDp56() {
        return (int) (56 * this.f24703b);
    }

    private final int getDp8() {
        return (int) (8 * this.f24703b);
    }

    private final int getMarginCheckLine() {
        return getDp16();
    }

    private final int getMarginCheckLineItemBottom() {
        return getDp0();
    }

    private final int getMarginCheckLineItemLeft() {
        return getDp24();
    }

    private final int getMarginCheckLineItemRight() {
        return getDp24();
    }

    private final int getMarginCheckLineItemTop() {
        return getDp0();
    }

    private final int getMarginIconCheckBottom() {
        return getDp2();
    }

    private final int getMarginIconCheckLeft() {
        return getDp2();
    }

    private final int getMarginIconCheckRight() {
        return getDp2();
    }

    private final int getMarginIconCheckTop() {
        return getDp2();
    }

    private final int getMarginIconCloseBottom() {
        return getDp21();
    }

    private final int getMarginIconCloseLeft() {
        return getDp29();
    }

    private final int getMarginIconCloseRight() {
        return getDp29();
    }

    private final int getMarginIconCloseTop() {
        return getDp21();
    }

    private final int getMarginLanguageCheckBottom() {
        return getDp0();
    }

    private final int getMarginLanguageCheckLeft() {
        return getDp8();
    }

    private final int getMarginLanguageCheckRight() {
        return getDp0();
    }

    private final int getMarginLanguageCheckTop() {
        return getDp0();
    }

    private final int getMarginTitleBottom() {
        return getDp18();
    }

    private final int getMarginTitleLeft() {
        return getDp24();
    }

    private final int getMarginTitleRight() {
        return getDp0();
    }

    private final int getMarginTitleTop() {
        return getDp18();
    }

    private final int getMinSizeXIconCheck() {
        return getDp20();
    }

    private final int getMinSizeXIconClose() {
        return getDp14();
    }

    private final int getMinSizeYCheckLine() {
        return getDp24();
    }

    private final int getMinSizeYHeader() {
        return getDp56();
    }

    private final int getMinSizeYHeaderLine() {
        return getDp1();
    }

    private final int getMinSizeYIconClose() {
        return getDp14();
    }

    private final float getRadiusTouchMax() {
        return getDp20();
    }

    public final void c(int i5, int i10) {
        Rect rect;
        boolean z5;
        int i11 = i5;
        g gVar = this.f24721v;
        if (i11 <= 0 || i10 <= 0) {
            gVar.f24692d = null;
            gVar.f24700m = null;
            gVar.f24698k = null;
            gVar.f24699l = null;
            gVar.f24697i = null;
            gVar.j = null;
        }
        gVar.f24692d = new RectF(0.0f, 0.0f, i11, i10);
        gVar.f24693e = getDp14();
        Rect rect2 = new Rect(0, 0, i11, getMinSizeYHeader() + getMinSizeYHeaderLine());
        Rect rect3 = new Rect(rect2.right - (getMinSizeXIconClose() + getMarginIconCloseRight()), rect2.top + getMarginIconCloseTop(), rect2.right - getMarginIconCloseRight(), getMarginIconCloseTop() + getMinSizeYIconClose() + rect2.top);
        int height = rect3.height();
        int width = rect3.width();
        Rect rect4 = new Rect(rect3.left - getMarginIconCloseLeft(), rect3.top - getMarginIconCloseTop(), rect3.right + getMarginIconCloseRight(), rect3.bottom + getMarginIconCloseBottom());
        if (height < getMinSizeYIconClose() || width < getMinSizeXIconClose() || rect3.bottom >= i10 || rect3.top >= i10 || rect3.right >= i11 || rect3.left >= i11) {
            gVar.f24694f = null;
            gVar.f24695g = null;
        } else {
            gVar.f24694f = rect3;
            gVar.f24695g = rect4;
        }
        this.f24723x = (rect4.width() <= 0 || rect4.height() <= 0) ? null : rect4;
        Rect rect5 = new Rect(rect2.left + getMarginTitleLeft(), rect2.top + getMarginTitleTop(), rect4.left - getMarginTitleRight(), rect2.bottom - getMarginTitleBottom());
        int minSizeYHeaderLine = getMinSizeYHeaderLine();
        int i12 = rect2.left;
        int i13 = rect2.bottom;
        Rect rect6 = new Rect(i12, i13, rect2.right, minSizeYHeaderLine + i13);
        Rect rect7 = new Rect(rect6.left, rect6.top, rect6.right, rect6.bottom);
        int i14 = rect6.top;
        if (i14 < i10 && rect6.bottom <= i10) {
            gVar.f24697i = rect6;
            gVar.j = rect7;
        } else if (i14 >= i10 || rect6.bottom <= i10) {
            gVar.f24697i = null;
            gVar.j = null;
        } else {
            rect7.bottom = i10;
            gVar.f24697i = rect6;
            gVar.j = rect7;
        }
        gVar.f24696h = this.f24714n;
        SpannableString spannableString = (SpannableString) kotlin.collections.p.r(gVar.f24690b, gVar.f24691c);
        if (spannableString == null) {
            spannableString = new SpannableString("");
        }
        int width2 = rect5.width();
        int height2 = rect5.height();
        float f6 = 2.0f;
        if (width2 <= 0) {
            gVar.f24700m = null;
            gVar.f24698k = null;
            gVar.f24699l = null;
        } else if (height2 <= 0) {
            gVar.f24700m = null;
            gVar.f24698k = null;
            gVar.f24699l = null;
        } else if (rect5.left > i11 || rect5.right > i11) {
            gVar.f24700m = null;
            gVar.f24698k = null;
            gVar.f24699l = null;
        } else if (rect5.top > i10 || rect5.bottom > i10) {
            gVar.f24700m = null;
            gVar.f24698k = null;
            gVar.f24699l = null;
        } else {
            Layout d10 = d(width2, spannableString, this.f24704c);
            if (d10 == null) {
                gVar.f24700m = null;
                gVar.f24698k = null;
                gVar.f24699l = null;
            } else {
                int height3 = d10.getHeight();
                int i15 = rect5.left;
                int i16 = rect5.top;
                float f10 = height3;
                float f11 = (i16 + ((rect5.bottom - i16) / 2.0f)) - (f10 / 2.0f);
                Rect rect8 = new Rect(i15, (int) f11, rect5.right, (int) (f11 + f10));
                Rect rect9 = new Rect(0, 0, rect8.width(), rect8.height());
                gVar.f24700m = d10;
                gVar.f24698k = rect8;
                gVar.f24699l = rect9;
            }
        }
        f[] fVarArr = gVar.f24701n;
        int length = fVarArr.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            f fVar = fVarArr[i17];
            int i19 = i18 + 1;
            int minSizeYCheckLine = (getMinSizeYCheckLine() * i18) + (getMarginCheckLine() * i19) + rect2.bottom;
            Rect rect10 = new Rect(getMarginCheckLineItemLeft(), minSizeYCheckLine, i11 - getMarginCheckLineItemRight(), getMinSizeYCheckLine() + minSizeYCheckLine + getMarginCheckLineItemTop() + getMarginCheckLineItemBottom());
            float f12 = f6;
            Rect rect11 = new Rect(rect10.left + getMarginIconCheckLeft(), rect10.top + getMarginIconCheckTop(), rect10.left + getMarginIconCheckLeft() + getMinSizeXIconCheck() + getMarginIconCheckRight(), rect10.bottom - getMarginIconCheckBottom());
            if (rect11.height() < getDp40()) {
                float dp40 = (getDp40() - rect11.height()) / f12;
                rect = new Rect((int) (rect11.left - dp40), (int) (rect11.top - dp40), (int) (rect11.right + dp40), (int) (rect11.bottom + dp40));
            } else if (rect11.height() > getDp40()) {
                float dp402 = (getDp40() - rect11.height()) / f12;
                rect = new Rect((int) (rect11.left + dp402), (int) (rect11.top + dp402), (int) (rect11.right - dp402), (int) (rect11.bottom - dp402));
            } else {
                rect = rect11;
            }
            Rect rect12 = new Rect(rect11.right + getMarginLanguageCheckLeft(), rect10.top + getMarginLanguageCheckTop(), rect10.right - getMarginLanguageCheckRight(), rect10.bottom - getMarginLanguageCheckBottom());
            Layout d11 = d(rect12.width(), gVar.f24689a[i18], gVar.f24690b == i18 ? this.j : this.f24711k);
            if (d11 != null) {
                if (rect12.height() > d11.getHeight()) {
                    int height4 = (int) (rect12.top + ((rect12.height() - d11.getHeight()) / f12));
                    rect12.top = height4;
                    rect12.bottom = d11.getHeight() + height4;
                } else if (rect12.height() < d11.getHeight()) {
                    float height5 = (d11.getHeight() - rect12.height()) / f12;
                    rect12.top = (int) (rect12.top - height5);
                    rect12.bottom = (int) (rect12.bottom + height5);
                }
            }
            f fVar2 = gVar.f24701n[i18];
            if (fVar2 != null) {
                fVar2.f24617b = gVar.f24690b == i18;
                fVar2.f24618c = d11;
                fVar2.f24619d = rect10;
                fVar2.f24620e = rect10;
                fVar2.f24621f = rect11;
                fVar2.f24622g = rect12;
                fVar2.f24623h = rect;
                z5 = false;
                fVar2.f24624i = 0.0f;
            } else {
                z5 = false;
            }
            i17++;
            i18 = i19;
            f6 = f12;
            i11 = i5;
        }
    }

    @Nullable
    public final e getClickListener() {
        return this.f24722w;
    }

    @Override // android.view.View
    @NotNull
    public final String getTag() {
        return this.f24702a;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        super.onAttachedToWindow();
        c(this.q, this.f24717r);
        this.f24718s = new GestureDetector(getContext(), new c(1, this));
        this.f24720u = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, getRadiusTouchMax());
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(1);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new f1(4, this));
        this.f24719t = ofFloat;
        f[] fVarArr = this.f24721v.f24701n;
        int length = fVarArr.length;
        int i5 = 0;
        final int i10 = 0;
        while (i5 < length) {
            f fVar = fVarArr[i5];
            int i11 = i10 + 1;
            if (fVar != null && (valueAnimator2 = fVar.j) != null) {
                valueAnimator2.cancel();
            }
            if (fVar != null && (valueAnimator = fVar.j) != null) {
                valueAnimator.removeAllUpdateListeners();
            }
            if (fVar != null) {
                fVar.j = null;
            }
            if (fVar != null) {
                fVar.f24624i = 0.0f;
            }
            if (fVar != null) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, getRadiusTouchMax());
                ofFloat2.setRepeatMode(2);
                ofFloat2.setRepeatCount(1);
                ofFloat2.setDuration(200L);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ve.d
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator animation) {
                        Rect rect;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        h hVar = h.this;
                        f fVar2 = (f) kotlin.collections.p.r(i10, hVar.f24721v.f24701n);
                        if (fVar2 != null) {
                            Object animatedValue = animation.getAnimatedValue();
                            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                            fVar2.f24624i = ((Float) animatedValue).floatValue();
                        }
                        if (fVar2 == null || (rect = fVar2.f24623h) == null) {
                            hVar.postInvalidateDelayed(200L);
                        } else {
                            hVar.postInvalidateDelayed(200L, rect.left, rect.top, rect.right, rect.bottom);
                        }
                    }
                });
                fVar.j = ofFloat2;
            }
            i5++;
            i10 = i11;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        super.onDetachedFromWindow();
        this.f24718s = null;
        this.f24722w = null;
        ValueAnimator valueAnimator3 = this.f24719t;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = this.f24719t;
        if (valueAnimator4 != null) {
            valueAnimator4.removeAllUpdateListeners();
        }
        this.f24719t = null;
        for (f fVar : this.f24721v.f24701n) {
            if (fVar != null && (valueAnimator2 = fVar.j) != null) {
                valueAnimator2.cancel();
            }
            if (fVar != null && (valueAnimator = fVar.j) != null) {
                valueAnimator.removeAllUpdateListeners();
            }
            if (fVar != null) {
                fVar.j = null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00da, code lost:
    
        if (r6.f24617b == true) goto L65;
     */
    /* JADX WARN: Finally extract failed */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int save;
        Canvas canvas2 = canvas;
        Intrinsics.checkNotNullParameter(canvas2, "canvas");
        super.onDraw(canvas);
        g gVar = this.f24721v;
        RectF rectF = gVar.f24692d;
        float f6 = gVar.f24693e;
        TextPaint textPaint = this.f24705d;
        if (textPaint != null && rectF != null) {
            canvas2.drawRoundRect(rectF, f6, f6, textPaint);
        }
        Layout layout = gVar.f24700m;
        Rect rect = gVar.f24698k;
        Rect rect2 = gVar.f24699l;
        if (layout != null && rect != null) {
            float f10 = rect.left;
            float f11 = rect.top;
            save = canvas2.save();
            canvas2.translate(f10, f11);
            if (rect2 != null) {
                try {
                    canvas2.clipRect(rect2);
                } finally {
                }
            }
            layout.draw(canvas2);
            canvas2.restoreToCount(save);
        }
        int i5 = gVar.f24696h;
        Rect rect3 = gVar.f24697i;
        Rect rect4 = gVar.j;
        if (rect3 != null) {
            save = canvas2.save();
            if (rect4 != null) {
                try {
                    canvas2.clipRect(rect4);
                } finally {
                }
            }
            canvas2.drawColor(i5);
            canvas2.restoreToCount(save);
        }
        Rect rect5 = gVar.f24694f;
        Paint paint = this.f24707f;
        Rect rect6 = gVar.f24695g;
        float f12 = this.f24720u;
        Paint paint2 = this.f24706e;
        float f13 = 0.0f;
        if (rect5 != null) {
            float centerX = rect6 != null ? rect6.centerX() : rect5.centerX();
            float centerY = rect6 != null ? rect6.centerY() : rect5.centerY();
            if (f12 > 0.0f) {
                save = canvas2.save();
                if (rect6 != null) {
                    try {
                        canvas2.clipRect(rect6);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                canvas2.drawCircle(centerX, centerY, f12, paint2);
                canvas2.restoreToCount(save);
            }
            save = canvas2.save();
            canvas2.clipRect(rect5);
            try {
                canvas2.rotate(45.0f, centerX, centerY);
                canvas2.drawLine(rect5.left, centerY, rect5.right, centerY, paint);
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                canvas2 = canvas;
                canvas2.drawLine(centerX, rect5.top, centerX, rect5.bottom, paint);
            } catch (Throwable th4) {
                th = th4;
                canvas2 = canvas;
                throw th;
            }
        }
        f[] fVarArr = gVar.f24701n;
        int length = fVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            f fVar = fVarArr[i10];
            boolean z5 = fVar != null;
            Paint paint3 = z5 ? this.f24709h : this.f24708g;
            Layout layout2 = fVar != null ? fVar.f24618c : null;
            Rect rect7 = fVar != null ? fVar.f24619d : null;
            Rect rect8 = fVar != null ? fVar.f24620e : null;
            Paint paint4 = z5 ? this.f24710i : null;
            Rect rect9 = fVar != null ? fVar.f24621f : null;
            Rect rect10 = fVar != null ? fVar.f24622g : null;
            Rect rect11 = fVar != null ? fVar.f24623h : null;
            float f14 = fVar != null ? fVar.f24624i : f13;
            if (rect7 != null) {
                if (rect11 != null && f14 > f13) {
                    save = canvas2.save();
                    canvas2.clipRect(rect11);
                    try {
                        canvas2.drawCircle(rect11.centerX(), rect11.centerY(), f14, paint2);
                        canvas2.restoreToCount(save);
                    } finally {
                        canvas2.restoreToCount(save);
                    }
                }
                save = canvas2.save();
                if (rect8 != null) {
                    try {
                        canvas2.clipRect(rect8);
                    } finally {
                    }
                }
                if (rect9 != null) {
                    canvas2.drawCircle(rect9.centerX(), rect9.centerY(), rect9.width() / 2.0f, paint3);
                }
                if (rect9 != null && paint4 != null) {
                    canvas2.drawCircle(rect9.centerX(), rect9.centerY(), rect9.width() / 4.0f, paint4);
                }
                if (rect10 != null) {
                    canvas2.translate(rect10.left, rect10.top);
                    if (layout2 != null) {
                        layout2.draw(canvas2);
                    }
                }
                canvas2.restoreToCount(save);
            }
            i10++;
            f13 = 0.0f;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        TextPaint textPaint;
        super.onMeasure(i5, i10);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        g gVar = this.f24721v;
        SpannableString[] spannableStringArr = gVar.f24691c;
        int length = spannableStringArr.length;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            textPaint = this.f24704c;
            if (i11 >= length) {
                break;
            }
            i12 = Math.max(i12, (int) (textPaint.measureText(spannableStringArr[i11].toString()) + getMarginTitleLeft() + getMarginTitleRight() + getMarginIconCloseLeft() + getMinSizeXIconClose() + getMarginIconCloseRight()));
            i11++;
        }
        int i13 = 0;
        for (SpannableString spannableString : gVar.f24689a) {
            i13 = Math.max(i13, (int) (textPaint.measureText(spannableString.toString()) + getMarginCheckLineItemLeft() + getMarginIconCheckLeft() + getMinSizeXIconCheck() + getMarginIconCheckRight() + getMarginLanguageCheckLeft() + getMarginLanguageCheckRight()));
        }
        int minSizeYHeader = getMinSizeYHeader() + getMinSizeYHeaderLine();
        int max = Math.max(i12, i13);
        int minSizeYCheckLine = (getMinSizeYCheckLine() * gVar.f24689a.length) + ((gVar.f24689a.length + 1) * getMarginCheckLine()) + minSizeYHeader;
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            size = max;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(minSizeYCheckLine, size2);
        } else if (mode2 != 1073741824) {
            size2 = minSizeYCheckLine;
        }
        Integer valueOf = Integer.valueOf(size);
        Integer valueOf2 = Integer.valueOf(size2);
        this.q = valueOf.intValue();
        int intValue = valueOf2.intValue();
        this.f24717r = intValue;
        setMeasuredDimension(this.q, intValue);
        c(this.q, this.f24717r);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        if (i5 == 0 || i10 == 0) {
            return;
        }
        if (i11 != i5 && i12 != i10) {
            c(this.q, this.f24717r);
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        GestureDetector gestureDetector = this.f24718s;
        return gestureDetector != null ? gestureDetector.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
    }

    public final void setClickListener(@Nullable e eVar) {
        this.f24722w = eVar;
    }
}
