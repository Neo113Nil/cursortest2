package com.vk.feed.design.view.newsfeed.restriction;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.utils.ImageViewMeasurer;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import defpackage.j0;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.cn70;
import xsna.dgn;
import xsna.f4m;
import xsna.gp10;
import xsna.jjc;
import xsna.m33;
import xsna.tr;
import xsna.xx1;

/* compiled from: RestrictedPhotoView.kt */
/* loaded from: classes18.dex */
public class RestrictedPhotoView extends ViewGroup {
    public static final int s = cn70.b(16);
    public static final int t = cn70.b(20);
    public static final int u = cn70.b(56);
    public final VkText b;
    public final VkSimpleButton c;
    public final SparseArray<Drawable> d;
    public Drawable e;
    public int f;
    public int g;
    public int h;
    public ImageViewMeasurer.HeightMode i;
    public int j;
    public int k;
    public final Rect l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final int q;
    public final ArrayList<View> r;

    /* compiled from: RestrictedPhotoView.kt */
    public static final class a extends ViewGroup.MarginLayoutParams {
        public final int a;

        public /* synthetic */ a(int i) {
            this(i, -2, 0);
        }

        public a(int i, int i2, int i3) {
            super(i, i2);
            this.a = i3;
        }
    }

    public RestrictedPhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public static int b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        a aVar = layoutParams instanceof a ? (a) layoutParams : null;
        if (aVar == null) {
            return 0;
        }
        return ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
    }

    public final void a(View view, a aVar) {
        super.addView(view, aVar);
        this.r.add(view);
    }

    public final void c(int i, int i2, int i3) {
        d(m33.a(i, getContext()), ColorStateList.valueOf(i2), i3);
    }

    public final void d(Drawable drawable, ColorStateList colorStateList, int i) {
        SparseArray<Drawable> sparseArray = this.d;
        sparseArray.clear();
        this.e = null;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTintList(colorStateList);
            sparseArray.append(i, mutate);
        }
        this.p = sparseArray.size() != 0;
        requestLayout();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable;
        super.dispatchDraw(canvas);
        if (!this.p || (drawable = this.e) == null) {
            return;
        }
        drawable.draw(canvas);
    }

    public final void g(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (this.f != i) {
            this.f = i;
            z = true;
        } else {
            z = false;
        }
        if (this.g != i2) {
            this.g = i2;
        } else {
            z2 = z;
        }
        if (z2) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int paddingTop = getPaddingTop() + (((getMeasuredHeight() - (getPaddingBottom() + getPaddingTop())) - this.j) / 2);
        Drawable drawable = this.e;
        if (this.p && drawable != null) {
            int i5 = this.k;
            int a2 = j0.a(measuredWidth, paddingLeft, i5, 2, paddingLeft);
            drawable.setBounds(a2, paddingTop, a2 + i5, i5 + paddingTop);
            paddingTop += this.k;
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                if (childAt.getMeasuredHeight() == 0) {
                    childAt.layout(0, 0, 0, 0);
                } else {
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    a aVar = (a) childAt.getLayoutParams();
                    int i7 = aVar.a;
                    if (i7 == 119) {
                        childAt.layout(0, 0, measuredWidth2, measuredHeight);
                    } else if (i7 != 0) {
                        int absoluteGravity = Gravity.getAbsoluteGravity(i7, getLayoutDirection());
                        int i8 = i7 & 112;
                        int measuredWidth3 = getMeasuredWidth();
                        int measuredHeight2 = getMeasuredHeight();
                        int measuredWidth4 = (absoluteGravity & 7) == 5 ? (measuredWidth3 - childAt.getMeasuredWidth()) - ((ViewGroup.MarginLayoutParams) aVar).rightMargin : ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
                        int measuredHeight3 = i8 == 80 ? (measuredHeight2 - childAt.getMeasuredHeight()) - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin : ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                        dgn.b(childAt, measuredHeight3, measuredWidth4, measuredHeight3, childAt.getMeasuredWidth() + measuredWidth4);
                    } else {
                        int a3 = (j0.a(measuredWidth, paddingLeft, measuredWidth2, 2, paddingLeft) + ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                        int i9 = paddingTop + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                        int i10 = measuredHeight + i9;
                        childAt.layout(a3, i9, measuredWidth2 + a3, i10);
                        paddingTop = i10 + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size;
        int i3;
        int i4;
        int i5;
        int i6;
        this.j = 0;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i7 = t;
        int i8 = paddingRight + i7;
        int i9 = i7 + paddingBottom;
        VkSimpleButton vkSimpleButton = this.c;
        int b = (vkSimpleButton.getVisibility() != 8 ? b(vkSimpleButton) + vkSimpleButton.getMinimumHeight() : 0) + i9;
        int size2 = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (!this.n || (i5 = this.f) == 0 || (i6 = this.g) == 0) {
            size = View.MeasureSpec.getSize(i2);
        } else {
            ImageViewMeasurer.a(size2, i5, i6, this.m, this.i, this.l);
            Rect rect = this.l;
            if (mode == 0 || rect.width() <= size2) {
                size2 = rect.width();
                size = rect.height();
            } else {
                size = (int) (size2 / (rect.width() / rect.height()));
            }
        }
        int i10 = this.h;
        if (size > i10) {
            i3 = (size2 * i10) / size;
            i4 = i10;
        } else {
            i3 = size2;
            i4 = size;
        }
        int max = Math.max(i8, i3);
        int size3 = this.o ? View.MeasureSpec.getSize(i2) : Math.max(b, i4);
        int a2 = gp10.a(i, i8, i3, paddingRight);
        int a3 = gp10.a(i2, b, size3, paddingBottom);
        int b2 = (a3 - this.j) - b(vkSimpleButton);
        int visibility = vkSimpleButton.getVisibility();
        int i11 = this.q;
        if (visibility != 8) {
            if (b2 < vkSimpleButton.getMinimumHeight()) {
                vkSimpleButton.measure(i11, i11);
            } else {
                vkSimpleButton.measure(tr.a(a2, 1073741823, 0, Integer.MIN_VALUE), tr.a(b2, 1073741823, 0, Integer.MIN_VALUE));
                if (vkSimpleButton.getMeasuredHeight() > 0) {
                    this.j = b(vkSimpleButton) + vkSimpleButton.getMeasuredHeight() + this.j;
                }
            }
        }
        int i12 = this.j;
        int i13 = a3 - i12;
        if (this.p) {
            this.k = 0;
            this.e = null;
            SparseArray<Drawable> sparseArray = this.d;
            int size4 = sparseArray.size();
            while (true) {
                size4--;
                if (-1 >= size4) {
                    break;
                }
                int keyAt = sparseArray.keyAt(size4);
                if (i13 >= keyAt) {
                    this.k = keyAt;
                    this.e = sparseArray.valueAt(size4);
                    break;
                }
            }
            this.j = i12 + this.k;
        }
        int i14 = a3 - this.j;
        VkText vkText = this.b;
        int b3 = i14 - b(vkText);
        if (vkText.getVisibility() != 8) {
            if (b3 < s) {
                vkText.measure(i11, i11);
            } else {
                measureChildWithMargins(vkText, tr.a(max, 1073741823, 0, 1073741824), 0, i2, this.j);
                if (vkText.getMeasuredHeight() > 0) {
                    this.j = b(vkText) + vkText.getMeasuredHeight() + this.j;
                }
            }
        }
        ArrayList<View> arrayList = this.r;
        if (arrayList != null) {
            int size5 = arrayList.size();
            int i15 = 0;
            while (i15 < size5) {
                View view = arrayList.get(i15);
                view.measure(tr.a(view.getLayoutParams().width, 1073741823, 0, 1073741824), tr.a(view.getLayoutParams().height, 1073741823, 0, 1073741824));
                i15++;
                arrayList = arrayList;
            }
        } else {
            Iterator<View> it = arrayList.iterator();
            while (it.hasNext()) {
                View next = it.next();
                next.measure(tr.a(next.getLayoutParams().width, 1073741823, 0, 1073741824), tr.a(next.getLayoutParams().height, 1073741823, 0, 1073741824));
            }
        }
        int b4 = gp10.b(i, i8, max, 0, i3);
        if (this.o) {
            size3 = Math.max(this.j + paddingBottom, Math.max(b, i4));
        }
        setMeasuredDimension(b4, size3);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        super.removeView(view);
        this.r.remove(view);
    }

    public final void setButtonClickListener(View.OnClickListener onClickListener) {
        jjc.f(onClickListener, this.c);
    }

    public final void setButtonText(CharSequence charSequence) {
        VkSimpleButton vkSimpleButton = this.c;
        vkSimpleButton.setText(charSequence);
        vkSimpleButton.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
    }

    public final void setButtonTopMargin(int i) {
        f4m.t(i, this.c);
    }

    public final void setForceText(boolean z) {
        if (this.o != z) {
            this.o = z;
            requestLayout();
        }
    }

    public final void setHeightMode(ImageViewMeasurer.HeightMode heightMode) {
        if (this.i != heightMode) {
            this.i = heightMode;
            requestLayout();
            invalidate();
        }
    }

    public final void setHorizontal(boolean z) {
        if (this.m != z) {
            this.m = z;
            requestLayout();
        }
    }

    public final void setIcon(SparseArray<Drawable> sparseArray) {
        SparseArray<Drawable> sparseArray2 = this.d;
        sparseArray2.clear();
        this.e = null;
        if (sparseArray != null && sparseArray.size() != 0) {
            xx1.B(sparseArray2, sparseArray);
        }
        this.p = sparseArray2.size() != 0;
        requestLayout();
        invalidate();
    }

    public final void setMaxHeight(int i) {
        if (i != this.h) {
            this.h = i;
            requestLayout();
        }
    }

    public final void setText(CharSequence charSequence) {
        VkText vkText = this.b;
        vkText.setText(charSequence);
        vkText.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
    }

    public final void setTextColor(int i) {
        this.b.setTextColor(i);
    }

    public final void setTextMaxLines(int i) {
        this.b.setMaxLines(i);
    }

    public final void setTextSize(float f) {
        this.b.setTextSize(f);
    }

    public final void setTextTopMargin(int i) {
        f4m.t(i, this.b);
    }

    public final void setWrapContent(boolean z) {
        if (this.n != z) {
            this.n = z;
            requestLayout();
        }
    }

    public /* synthetic */ RestrictedPhotoView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public final void setTextColor(ColorStateList colorStateList) {
        this.b.setTextColor(colorStateList);
    }

    public RestrictedPhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        VkText vkText = new VkText(new ContextThemeWrapper(context, R.style.VkUiTypography_Headline1), null, 6, 0);
        this.b = vkText;
        VkSimpleButton vkSimpleButton = new VkSimpleButton(context, null, 6);
        vkSimpleButton.setSize(VkButton.Size.Small);
        vkSimpleButton.setMode(VkButton.Mode.Outline);
        vkSimpleButton.setAppearance(VkButton.Appearance.Overlay);
        this.c = vkSimpleButton;
        this.d = new SparseArray<>();
        this.h = Integer.MAX_VALUE;
        this.i = ImageViewMeasurer.HeightMode.DOUBLE_WIDTH;
        this.l = new Rect();
        this.n = true;
        this.q = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        this.r = new ArrayList<>();
        setClipToPadding(false);
        vkText.setEllipsize(TextUtils.TruncateAt.END);
        vkText.setGravity(1);
        vkText.setIncludeFontPadding(false);
        vkText.setVisibility(8);
        vkSimpleButton.setVisibility(8);
        addView(vkText, new a(-1));
        addView(vkSimpleButton);
    }
}
