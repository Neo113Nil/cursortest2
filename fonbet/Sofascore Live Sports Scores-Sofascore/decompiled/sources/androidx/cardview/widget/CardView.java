package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import defpackage.dy0;
import defpackage.f7g;
import defpackage.sjf;
import defpackage.z41;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class CardView extends FrameLayout {
    public static final int[] f = {R.attr.colorBackground};
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect d;
    public final z41 e;

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.c = rect;
        this.d = new Rect();
        z41 z41Var = new z41(this);
        this.e = z41Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sjf.a, i, com.sofascore.results.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.sofascore.results.R.color.cardview_light_background) : getResources().getColor(com.sofascore.results.R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float dimension2 = obtainStyledAttributes.getDimension(4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float dimension3 = obtainStyledAttributes.getDimension(5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.a = obtainStyledAttributes.getBoolean(7, false);
        this.b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        f7g f7gVar = new f7g(valueOf, dimension);
        z41Var.b = f7gVar;
        setBackgroundDrawable(f7gVar);
        setClipToOutline(true);
        setElevation(dimension2);
        dy0.F(z41Var, dimension3);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return ((f7g) this.e.b).h;
    }

    public float getCardElevation() {
        return ((CardView) this.e.c).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.c.left;
    }

    public int getContentPaddingRight() {
        return this.c.right;
    }

    public int getContentPaddingTop() {
        return this.c.top;
    }

    public float getMaxCardElevation() {
        return ((f7g) this.e.b).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.b;
    }

    public float getRadius() {
        return ((f7g) this.e.b).a;
    }

    public boolean getUseCompatPadding() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        f7g f7gVar = (f7g) this.e.b;
        if (valueOf == null) {
            f7gVar.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        f7gVar.h = valueOf;
        f7gVar.b.setColor(valueOf.getColorForState(f7gVar.getState(), f7gVar.h.getDefaultColor()));
        f7gVar.invalidateSelf();
    }

    public void setCardElevation(float f2) {
        ((CardView) this.e.c).setElevation(f2);
    }

    public void setMaxCardElevation(float f2) {
        dy0.F(this.e, f2);
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
        if (z != this.b) {
            this.b = z;
            z41 z41Var = this.e;
            dy0.F(z41Var, ((f7g) z41Var.b).e);
        }
    }

    public void setRadius(float f2) {
        f7g f7gVar = (f7g) this.e.b;
        if (f2 == f7gVar.a) {
            return;
        }
        f7gVar.a = f2;
        f7gVar.b(null);
        f7gVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.a != z) {
            this.a = z;
            z41 z41Var = this.e;
            dy0.F(z41Var, ((f7g) z41Var.b).e);
        }
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        f7g f7gVar = (f7g) this.e.b;
        if (colorStateList == null) {
            f7gVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        f7gVar.h = colorStateList;
        f7gVar.b.setColor(colorStateList.getColorForState(f7gVar.getState(), f7gVar.h.getDefaultColor()));
        f7gVar.invalidateSelf();
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.sofascore.results.R.attr.cardViewStyle);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
