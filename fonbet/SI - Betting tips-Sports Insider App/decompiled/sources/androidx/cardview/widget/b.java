package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class b extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {R.attr.colorBackground};
    private static final e IMPL = new c();
    private final d mCardViewDelegate;
    private boolean mCompatPadding;
    final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    public b(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.mContentPadding = rect;
        this.mShadowBounds = new Rect();
        a aVar = new a(this);
        this.mCardViewDelegate = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.a.f22192a, i5, com.sports.insider.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.sports.insider.R.color.cardview_light_background) : getResources().getColor(com.sports.insider.R.color.cardview_dark_background));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.mCompatPadding = obtainStyledAttributes.getBoolean(7, false);
        this.mPreventCornerOverlap = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        float f6 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.mUserSetMinHeight = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        IMPL.k(aVar, context, colorStateList, dimension, dimension2, f6);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return IMPL.g(this.mCardViewDelegate);
    }

    public float getCardElevation() {
        return IMPL.b(this.mCardViewDelegate);
    }

    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public float getMaxCardElevation() {
        return IMPL.f(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public float getRadius() {
        return IMPL.c(this.mCardViewDelegate);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i5, int i10) {
        if (IMPL instanceof c) {
            super.onMeasure(i5, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i5);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.j(this.mCardViewDelegate)), View.MeasureSpec.getSize(i5)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.i(this.mCardViewDelegate)), View.MeasureSpec.getSize(i10)), mode2);
        }
        super.onMeasure(i5, i10);
    }

    public void setCardBackgroundColor(int i5) {
        IMPL.m(this.mCardViewDelegate, ColorStateList.valueOf(i5));
    }

    public void setCardElevation(float f6) {
        IMPL.e(this.mCardViewDelegate, f6);
    }

    public void setContentPadding(int i5, int i10, int i11, int i12) {
        this.mContentPadding.set(i5, i10, i11, i12);
        IMPL.h(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f6) {
        IMPL.n(this.mCardViewDelegate, f6);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i5) {
        this.mUserSetMinHeight = i5;
        super.setMinimumHeight(i5);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i5) {
        this.mUserSetMinWidth = i5;
        super.setMinimumWidth(i5);
    }

    public void setPreventCornerOverlap(boolean z5) {
        if (z5 != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z5;
            IMPL.l(this.mCardViewDelegate);
        }
    }

    public void setRadius(float f6) {
        IMPL.a(this.mCardViewDelegate, f6);
    }

    public void setUseCompatPadding(boolean z5) {
        if (this.mCompatPadding != z5) {
            this.mCompatPadding = z5;
            IMPL.d(this.mCardViewDelegate);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        IMPL.m(this.mCardViewDelegate, colorStateList);
    }

    @Override // android.view.View
    public void setPadding(int i5, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i5, int i10, int i11, int i12) {
    }
}
