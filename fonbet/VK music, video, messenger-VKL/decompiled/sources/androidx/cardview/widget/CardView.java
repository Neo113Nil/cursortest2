package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.R$styleable;
import com.unity3d.services.UnityAdsConstants;
import xsna.bog0;
import xsna.bu9;
import xsna.kn4;

/* loaded from: classes11.dex */
public class CardView extends FrameLayout {
    public static final int[] g = {R.attr.colorBackground};
    public static final kn4 h = new kn4();
    public boolean b;
    public boolean c;
    public final Rect d;
    public final Rect e;
    public final a f;

    public class a implements bu9 {
        public Drawable a;

        public a() {
        }

        public final void a(int i, int i2, int i3, int i4) {
            CardView cardView = CardView.this;
            cardView.e.set(i, i2, i3, i4);
            Rect rect = cardView.d;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.vkontakte.android.R.attr.cardViewStyle);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return ((bog0) this.f.a).h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.d.bottom;
    }

    public int getContentPaddingLeft() {
        return this.d.left;
    }

    public int getContentPaddingRight() {
        return this.d.right;
    }

    public int getContentPaddingTop() {
        return this.d.top;
    }

    public float getMaxCardElevation() {
        return ((bog0) this.f.a).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.c;
    }

    public float getRadius() {
        return ((bog0) this.f.a).a;
    }

    public boolean getUseCompatPadding() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        bog0 i2 = kn4.i(this.f);
        if (valueOf == null) {
            i2.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        i2.h = valueOf;
        i2.b.setColor(valueOf.getColorForState(i2.getState(), i2.h.getDefaultColor()));
        i2.invalidateSelf();
    }

    public void setCardElevation(float f) {
        CardView.this.setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        h.n(this.f, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.c) {
            this.c = z;
            a aVar = this.f;
            h.n(aVar, ((bog0) aVar.a).e);
        }
    }

    public void setRadius(float f) {
        bog0 bog0Var = (bog0) this.f.a;
        if (f == bog0Var.a) {
            return;
        }
        bog0Var.a = f;
        bog0Var.b(null);
        bog0Var.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.b != z) {
            this.b = z;
            a aVar = this.f;
            h.n(aVar, ((bog0) aVar.a).e);
        }
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.d = rect;
        this.e = new Rect();
        a aVar = new a();
        this.f = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, i, com.vkontakte.android.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(g);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.vkontakte.android.R.color.cardview_light_background) : getResources().getColor(com.vkontakte.android.R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float dimension2 = obtainStyledAttributes.getDimension(4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float dimension3 = obtainStyledAttributes.getDimension(5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.b = obtainStyledAttributes.getBoolean(7, false);
        this.c = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        bog0 bog0Var = new bog0(dimension, valueOf);
        aVar.a = bog0Var;
        setBackgroundDrawable(bog0Var);
        setClipToOutline(true);
        setElevation(dimension2);
        h.n(aVar, dimension3);
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        bog0 i = kn4.i(this.f);
        if (colorStateList == null) {
            i.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        i.h = colorStateList;
        i.b.setColor(colorStateList.getColorForState(i.getState(), i.h.getDefaultColor()));
        i.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
