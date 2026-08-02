package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import x.AbstractC6768a;
import x.AbstractC6769b;
import x.AbstractC6770c;
import x.AbstractC6771d;
import y.C6834a;
import y.b;
import y.c;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {R.attr.colorBackground};

    /* renamed from: h, reason: collision with root package name */
    public static final c f17530h;

    /* renamed from: a, reason: collision with root package name */
    public boolean f17531a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17532b;

    /* renamed from: c, reason: collision with root package name */
    public int f17533c;

    /* renamed from: d, reason: collision with root package name */
    public int f17534d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f17535e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f17536f;

    /* renamed from: g, reason: collision with root package name */
    public final b f17537g;

    public class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public Drawable f17538a;

        public a() {
        }

        @Override // y.b
        public void a(Drawable drawable) {
            this.f17538a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // y.b
        public void b(int i10, int i11, int i12, int i13) {
            CardView.this.f17536f.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.f17535e;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }

        @Override // y.b
        public boolean c() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // y.b
        public Drawable d() {
            return this.f17538a;
        }

        @Override // y.b
        public boolean e() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // y.b
        public View f() {
            return CardView.this;
        }
    }

    static {
        C6834a c6834a = new C6834a();
        f17530h = c6834a;
        c6834a.l();
    }

    public CardView(Context context) {
        this(context, null);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return f17530h.h(this.f17537g);
    }

    public float getCardElevation() {
        return f17530h.k(this.f17537g);
    }

    public int getContentPaddingBottom() {
        return this.f17535e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f17535e.left;
    }

    public int getContentPaddingRight() {
        return this.f17535e.right;
    }

    public int getContentPaddingTop() {
        return this.f17535e.top;
    }

    public float getMaxCardElevation() {
        return f17530h.g(this.f17537g);
    }

    public boolean getPreventCornerOverlap() {
        return this.f17532b;
    }

    public float getRadius() {
        return f17530h.i(this.f17537g);
    }

    public boolean getUseCompatPadding() {
        return this.f17531a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (f17530h instanceof C6834a) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.e(this.f17537g)), View.MeasureSpec.getSize(i10)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.m(this.f17537g)), View.MeasureSpec.getSize(i11)), mode2);
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        f17530h.j(this.f17537g, ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        f17530h.f(this.f17537g, f10);
    }

    public void setMaxCardElevation(float f10) {
        f17530h.d(this.f17537g, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.f17534d = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.f17533c = i10;
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f17532b) {
            this.f17532b = z10;
            f17530h.n(this.f17537g);
        }
    }

    public void setRadius(float f10) {
        f17530h.c(this.f17537g, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f17531a != z10) {
            this.f17531a = z10;
            f17530h.b(this.f17537g);
        }
    }

    public CardView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6768a.f67800a);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f17530h.j(this.f17537g, colorStateList);
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f17535e = rect;
        this.f17536f = new Rect();
        a aVar = new a();
        this.f17537g = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6771d.CardView, i10, AbstractC6770c.f67803a);
        if (obtainStyledAttributes.hasValue(AbstractC6771d.f67806c)) {
            valueOf = obtainStyledAttributes.getColorStateList(AbstractC6771d.f67806c);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(AbstractC6769b.f67802b);
            } else {
                color = getResources().getColor(AbstractC6769b.f67801a);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(AbstractC6771d.f67807d, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(AbstractC6771d.f67808e, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(AbstractC6771d.f67809f, 0.0f);
        this.f17531a = obtainStyledAttributes.getBoolean(AbstractC6771d.f67811h, false);
        this.f17532b = obtainStyledAttributes.getBoolean(AbstractC6771d.f67810g, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(AbstractC6771d.f67812i, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(AbstractC6771d.f67814k, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(AbstractC6771d.f67816m, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(AbstractC6771d.f67815l, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(AbstractC6771d.f67813j, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f17533c = obtainStyledAttributes.getDimensionPixelSize(AbstractC6771d.f67804a, 0);
        this.f17534d = obtainStyledAttributes.getDimensionPixelSize(AbstractC6771d.f67805b, 0);
        obtainStyledAttributes.recycle();
        f17530h.a(aVar, context, colorStateList, dimension, dimension2, f10);
    }
}
