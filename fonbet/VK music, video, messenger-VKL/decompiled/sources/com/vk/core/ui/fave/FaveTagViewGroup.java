package com.vk.core.ui.fave;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.design.ui.themehelper.R$styleable;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.be6;
import xsna.e43;
import xsna.iah0;
import xsna.izs;
import xsna.ozl;
import xsna.s3q0;
import xsna.xpg0;

/* compiled from: FaveTagViewGroup.kt */
@ozl
/* loaded from: classes17.dex */
public final class FaveTagViewGroup extends ViewGroup {
    public static final int q = iah0.a(15);
    public izs<? super FaveTag, s3q0> b;
    public List<FaveTag> c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;
    public final float i;
    public final String j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final be6 p;

    /* compiled from: FaveTagViewGroup.kt */
    public static final class a extends ViewGroup.LayoutParams {
    }

    /* compiled from: FaveTagViewGroup.kt */
    public final class b extends AppCompatTextView {
        public b(Context context) {
            super(context);
            b();
            setGravity(17);
            com.vk.typography.b.h(this, a.C1933a.c(context, FaveTagViewGroup.this.j, Math.round(((int) FaveTagViewGroup.this.k) / iah0.f().density), 16), 0);
        }

        public final void b() {
            FaveTagViewGroup faveTagViewGroup = FaveTagViewGroup.this;
            setTextColor(faveTagViewGroup.f);
            setLayoutParams(new a((int) faveTagViewGroup.n, -2));
            setText("·");
            setVisibility(0);
        }
    }

    /* compiled from: FaveTagViewGroup.kt */
    public final class c extends AppCompatTextView {
        public final FaveTag b;
        public final /* synthetic */ FaveTagViewGroup c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(FaveTagViewGroup faveTagViewGroup, Context context, FaveTag faveTag) {
            super(context);
            float f = faveTagViewGroup.k;
            this.c = faveTagViewGroup;
            this.b = faveTag;
            setTextColor(faveTagViewGroup.e);
            int i = faveTagViewGroup.g;
            if (i >= 0) {
                setBackgroundResource(i);
            }
            com.vk.typography.b.h(this, a.C1933a.b(context, faveTagViewGroup.j, f, TextSizeUnit.PX), 0);
            setLineSpacing(faveTagViewGroup.o, 1.0f);
            setText(faveTag.c);
            int i2 = (int) faveTagViewGroup.h;
            int i3 = (int) faveTagViewGroup.i;
            setPaddingRelative(i2, i3, i2, i3);
            setTextSize(0, f);
            setLayoutParams(new a(-2, -2));
            setEllipsize(TextUtils.TruncateAt.END);
            setLines(1);
            setGravity(17);
            setText(faveTag.c);
            setFocusable(false);
            setFocusableInTouchMode(false);
            setMovementMethod(null);
            setTag(faveTag);
        }
    }

    public FaveTagViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, -1);
        this.c = EmptyList.b;
        this.p = new be6(this, 7);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f);
        try {
            this.d = obtainStyledAttributes.getBoolean(3, false);
            Context context2 = e43.a;
            if (context2 == null) {
                context2 = null;
            }
            int color = context2.getColor(R.color.vk_black);
            this.e = obtainStyledAttributes.getColor(8, color);
            this.f = obtainStyledAttributes.getColor(1, color);
            this.g = obtainStyledAttributes.getResourceId(4, -1);
            this.h = obtainStyledAttributes.getDimension(6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.i = obtainStyledAttributes.getDimension(10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.j = getContext().getString(obtainStyledAttributes.getResourceId(5, R.string.font_family_regular));
            this.k = obtainStyledAttributes.getDimension(9, (int) iah0.y(13));
            this.l = obtainStyledAttributes.getDimension(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.m = obtainStyledAttributes.getDimension(11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.n = obtainStyledAttributes.getDimension(2, iah0.a(6));
            this.o = obtainStyledAttributes.getDimension(7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            obtainStyledAttributes.recycle();
            setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public final izs<FaveTag, s3q0> getClickByTag() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int paddingStart = getPaddingStart();
        int paddingEnd = i5 - getPaddingEnd();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        int i6 = paddingStart;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (childAt.getVisibility() != 8) {
                if (i6 + measuredWidth <= paddingEnd) {
                    i7 = Math.max(i7, measuredHeight);
                } else if (this.d) {
                    i7 = Math.max(i7, measuredHeight);
                } else {
                    paddingTop += i7 + ((int) this.m);
                    i6 = paddingStart;
                    i7 = measuredHeight;
                }
                int i9 = xpg0.b() ? i6 : i5 - (i6 + measuredWidth);
                int i10 = xpg0.b() ? i6 + measuredWidth : i5 - i6;
                if (childAt instanceof b) {
                    int i11 = (i7 - measuredHeight) / 2;
                    ((b) childAt).layout(i9, paddingTop + i11, i10, measuredHeight + paddingTop + i11);
                } else {
                    childAt.layout(i9, paddingTop, i10, measuredHeight + paddingTop);
                }
                i6 += measuredWidth + ((int) this.l);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0177  */
    @Override // android.view.View
    @SuppressLint({"SetTextI18n"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        measureChildren(i, i2);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i7 >= childCount) {
                i3 = size;
                i4 = size2;
                i5 = 0;
                break;
            }
            View childAt = getChildAt(i7);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            i3 = size;
            if (childAt.getVisibility() != 8 || (childAt instanceof c)) {
                childAt.setVisibility(0);
                boolean z2 = childAt instanceof b;
                if (z2) {
                    ((b) childAt).b();
                } else if (childAt instanceof c) {
                    c cVar = (c) childAt;
                    i4 = size2;
                    cVar.setText(cVar.b.c);
                    FaveTagViewGroup faveTagViewGroup = cVar.c;
                    z = z2;
                    int i12 = (int) faveTagViewGroup.h;
                    i6 = i7;
                    int i13 = (int) faveTagViewGroup.i;
                    cVar.setPaddingRelative(i12, i13, i12, i13);
                    i5 = 0;
                    cVar.setTextSize(0, faveTagViewGroup.k);
                    i8 += measuredWidth;
                    if (i8 <= paddingLeft) {
                        boolean z3 = this.d;
                        if (!z3) {
                            View childAt2 = getChildAt(i6 - 1);
                            if (childAt2 instanceof b) {
                                ((b) childAt2).setVisibility(4);
                            }
                        }
                        if (z && !z3) {
                            ((b) childAt).setVisibility(8);
                        }
                        if (z3) {
                            int i14 = paddingLeft - (i8 - measuredWidth);
                            for (int i15 = i6 + 1; i15 < childCount; i15++) {
                                getChildAt(i15).setVisibility(8);
                            }
                            int i16 = i14 >= q ? 1 : i5;
                            if (z) {
                                View childAt3 = getChildAt(i6 - 1);
                                c cVar2 = childAt3 instanceof c ? (c) childAt3 : null;
                                if (cVar2 != null && i14 > 0) {
                                    cVar2.measure(View.MeasureSpec.makeMeasureSpec(cVar2.getMeasuredWidth() + i14, 1073741824), View.MeasureSpec.makeMeasureSpec(cVar2.getMeasuredHeight(), 1073741824));
                                    cVar2.setText(getContext().getString(R.string.ellipsize_decorator, cVar2.b.c));
                                }
                                ((b) childAt).setVisibility(8);
                            } else {
                                boolean z4 = childAt instanceof c;
                                if (z4 && i16 == 0) {
                                    View childAt4 = getChildAt(i6 - 1);
                                    b bVar = childAt4 instanceof b ? (b) childAt4 : null;
                                    if (bVar != null) {
                                        bVar.measure(View.MeasureSpec.makeMeasureSpec(bVar.getMeasuredWidth() + i14, 1073741824), View.MeasureSpec.makeMeasureSpec(bVar.getMeasuredHeight(), 1073741824));
                                        bVar.setTextColor(this.e);
                                        bVar.setText(getContext().getString(R.string.ellipsize_end));
                                    }
                                    ((c) childAt).setVisibility(8);
                                } else if (z4 && i16 != 0) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.min(measuredWidth, i14), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
                                }
                            }
                        } else {
                            i10 += i9 + ((int) this.m);
                            i11++;
                            i9 = measuredHeight;
                        }
                    } else {
                        i9 = Math.max(i9, measuredHeight);
                        measuredWidth = i8;
                    }
                    i8 = measuredWidth + ((int) this.l);
                }
                i4 = size2;
                z = z2;
                i6 = i7;
                i5 = 0;
                i8 += measuredWidth;
                if (i8 <= paddingLeft) {
                }
                i8 = measuredWidth + ((int) this.l);
            } else {
                i4 = size2;
                i6 = i7;
            }
            i7 = i6 + 1;
            size = i3;
            size2 = i4;
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + i10 + i9;
        int paddingRight = i11 == 0 ? getPaddingRight() + getPaddingLeft() + i8 : i3;
        if (!this.c.isEmpty()) {
            i5 = paddingBottom;
        }
        if (mode == 1073741824) {
            paddingRight = i3;
        }
        setMeasuredDimension(paddingRight, mode2 == 1073741824 ? i4 : i5);
    }

    public final void setClickByTag(izs<? super FaveTag, s3q0> izsVar) {
        this.b = izsVar;
    }

    public final void setTags(List<FaveTag> list) {
        boolean z;
        be6 be6Var;
        removeAllViews();
        this.c = list;
        int size = list.size();
        int i = size - 1;
        int i2 = 0;
        while (true) {
            z = this.d;
            be6Var = this.p;
            if (i2 >= i) {
                break;
            }
            c cVar = new c(this, getContext(), list.get(i2));
            cVar.setOnClickListener(be6Var);
            if (z) {
                cVar.setClickable(false);
            }
            addView(cVar);
            addView(new b(getContext()));
            i2++;
        }
        if (size > 0) {
            c cVar2 = new c(this, getContext(), list.get(i));
            cVar2.setOnClickListener(be6Var);
            if (z) {
                cVar2.setClickable(false);
            }
            addView(cVar2);
        }
    }
}
