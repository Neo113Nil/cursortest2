package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.c1;
import da.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class FlexboxLayout extends ViewGroup implements a {

    /* renamed from: a, reason: collision with root package name */
    public int f4187a;

    /* renamed from: b, reason: collision with root package name */
    public int f4188b;

    /* renamed from: c, reason: collision with root package name */
    public int f4189c;

    /* renamed from: d, reason: collision with root package name */
    public int f4190d;

    /* renamed from: e, reason: collision with root package name */
    public int f4191e;

    /* renamed from: f, reason: collision with root package name */
    public int f4192f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f4193g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f4194h;

    /* renamed from: i, reason: collision with root package name */
    public int f4195i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f4196k;

    /* renamed from: l, reason: collision with root package name */
    public int f4197l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f4198m;

    /* renamed from: n, reason: collision with root package name */
    public SparseIntArray f4199n;

    /* renamed from: o, reason: collision with root package name */
    public final f f4200o;

    /* renamed from: p, reason: collision with root package name */
    public List f4201p;
    public final d q;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new g();

        /* renamed from: a, reason: collision with root package name */
        public int f4202a;

        /* renamed from: b, reason: collision with root package name */
        public float f4203b;

        /* renamed from: c, reason: collision with root package name */
        public float f4204c;

        /* renamed from: d, reason: collision with root package name */
        public int f4205d;

        /* renamed from: e, reason: collision with root package name */
        public float f4206e;

        /* renamed from: f, reason: collision with root package name */
        public int f4207f;

        /* renamed from: g, reason: collision with root package name */
        public int f4208g;

        /* renamed from: h, reason: collision with root package name */
        public int f4209h;

        /* renamed from: i, reason: collision with root package name */
        public int f4210i;
        public boolean j;

        @Override // com.google.android.flexbox.FlexItem
        public final void J(int i5) {
            this.f4207f = i5;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int K() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int O() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int R() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void U(int i5) {
            this.f4208g = i5;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float W() {
            return this.f4203b;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float Y() {
            return this.f4206e;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int d0() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int f0() {
            return this.f4208g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getOrder() {
            return this.f4202a;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean h0() {
            return this.j;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int j0() {
            return this.f4210i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int q0() {
            return this.f4209h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int t() {
            return this.f4205d;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float w() {
            return this.f4204c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i5) {
            parcel.writeInt(this.f4202a);
            parcel.writeFloat(this.f4203b);
            parcel.writeFloat(this.f4204c);
            parcel.writeInt(this.f4205d);
            parcel.writeFloat(this.f4206e);
            parcel.writeInt(this.f4207f);
            parcel.writeInt(this.f4208g);
            parcel.writeInt(this.f4209h);
            parcel.writeInt(this.f4210i);
            parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int z() {
            return this.f4207f;
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4192f = -1;
        this.f4200o = new f(this);
        this.f4201p = new ArrayList();
        this.q = new d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f8352b, 0, 0);
        this.f4187a = obtainStyledAttributes.getInt(5, 0);
        this.f4188b = obtainStyledAttributes.getInt(6, 0);
        this.f4189c = obtainStyledAttributes.getInt(7, 0);
        this.f4190d = obtainStyledAttributes.getInt(1, 0);
        this.f4191e = obtainStyledAttributes.getInt(0, 0);
        this.f4192f = obtainStyledAttributes.getInt(8, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i5 = obtainStyledAttributes.getInt(9, 0);
        if (i5 != 0) {
            this.j = i5;
            this.f4195i = i5;
        }
        int i10 = obtainStyledAttributes.getInt(11, 0);
        if (i10 != 0) {
            this.j = i10;
        }
        int i11 = obtainStyledAttributes.getInt(10, 0);
        if (i11 != 0) {
            this.f4195i = i11;
        }
        obtainStyledAttributes.recycle();
    }

    public final void a(Canvas canvas, boolean z5, boolean z7) {
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f4201p.size();
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = (b) this.f4201p.get(i5);
            for (int i10 = 0; i10 < bVar.f4218h; i10++) {
                int i11 = bVar.f4224o + i10;
                View e7 = e(i11);
                if (e7 != null && e7.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) e7.getLayoutParams();
                    if (f(i11, i10)) {
                        d(canvas, z5 ? e7.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (e7.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f4197l, bVar.f4212b, bVar.f4217g);
                    }
                    if (i10 == bVar.f4218h - 1 && (this.j & 4) > 0) {
                        d(canvas, z5 ? (e7.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f4197l : e7.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, bVar.f4212b, bVar.f4217g);
                    }
                }
            }
            if (g(i5)) {
                c(canvas, paddingLeft, z7 ? bVar.f4214d : bVar.f4212b - this.f4196k, max);
            }
            if (h(i5) && (this.f4195i & 4) > 0) {
                c(canvas, paddingLeft, z7 ? bVar.f4212b - this.f4196k : bVar.f4214d, max);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (this.f4199n == null) {
            this.f4199n = new SparseIntArray(getChildCount());
        }
        SparseIntArray sparseIntArray = this.f4199n;
        f fVar = this.f4200o;
        FlexboxLayout flexboxLayout = fVar.f4230a;
        int flexItemCount = flexboxLayout.getFlexItemCount();
        ArrayList e7 = fVar.e(flexItemCount);
        e eVar = new e();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            eVar.f4229b = 1;
        } else {
            eVar.f4229b = ((FlexItem) layoutParams).getOrder();
        }
        if (i5 == -1 || i5 == flexItemCount) {
            eVar.f4228a = flexItemCount;
        } else if (i5 < flexboxLayout.getFlexItemCount()) {
            eVar.f4228a = i5;
            for (int i10 = i5; i10 < flexItemCount; i10++) {
                ((e) e7.get(i10)).f4228a++;
            }
        } else {
            eVar.f4228a = flexItemCount;
        }
        e7.add(eVar);
        this.f4198m = f.n(flexItemCount + 1, e7, sparseIntArray);
        super.addView(view, i5, layoutParams);
    }

    public final void b(Canvas canvas, boolean z5, boolean z7) {
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f4201p.size();
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = (b) this.f4201p.get(i5);
            for (int i10 = 0; i10 < bVar.f4218h; i10++) {
                int i11 = bVar.f4224o + i10;
                View e7 = e(i11);
                if (e7 != null && e7.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) e7.getLayoutParams();
                    if (f(i11, i10)) {
                        c(canvas, bVar.f4211a, z7 ? e7.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (e7.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f4196k, bVar.f4217g);
                    }
                    if (i10 == bVar.f4218h - 1 && (this.f4195i & 4) > 0) {
                        c(canvas, bVar.f4211a, z7 ? (e7.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f4196k : e7.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, bVar.f4217g);
                    }
                }
            }
            if (g(i5)) {
                d(canvas, z5 ? bVar.f4213c : bVar.f4211a - this.f4197l, paddingTop, max);
            }
            if (h(i5) && (this.j & 4) > 0) {
                d(canvas, z5 ? bVar.f4211a - this.f4197l : bVar.f4213c, paddingTop, max);
            }
        }
    }

    public final void c(Canvas canvas, int i5, int i10, int i11) {
        Drawable drawable = this.f4193g;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i5, i10, i11 + i5, this.f4196k + i10);
        this.f4193g.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void d(Canvas canvas, int i5, int i10, int i11) {
        Drawable drawable = this.f4194h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i5, i10, this.f4197l + i5, i11 + i10);
        this.f4194h.draw(canvas);
    }

    public final View e(int i5) {
        if (i5 < 0) {
            return null;
        }
        int[] iArr = this.f4198m;
        if (i5 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i5]);
    }

    public final boolean f(int i5, int i10) {
        for (int i11 = 1; i11 <= i10; i11++) {
            View e7 = e(i5 - i11);
            if (e7 != null && e7.getVisibility() != 8) {
                return i() ? (this.j & 2) != 0 : (this.f4195i & 2) != 0;
            }
        }
        return i() ? (this.j & 1) != 0 : (this.f4195i & 1) != 0;
    }

    public final boolean g(int i5) {
        if (i5 >= 0 && i5 < this.f4201p.size()) {
            for (int i10 = 0; i10 < i5; i10++) {
                if (((b) this.f4201p.get(i10)).a() > 0) {
                    return i() ? (this.f4195i & 2) != 0 : (this.j & 2) != 0;
                }
            }
            if (i()) {
                return (this.f4195i & 1) != 0;
            }
            if ((this.j & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f4202a = 1;
        layoutParams.f4203b = 0.0f;
        layoutParams.f4204c = 1.0f;
        layoutParams.f4205d = -1;
        layoutParams.f4206e = -1.0f;
        layoutParams.f4207f = -1;
        layoutParams.f4208g = -1;
        layoutParams.f4209h = 16777215;
        layoutParams.f4210i = 16777215;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f8353c);
        layoutParams.f4202a = obtainStyledAttributes.getInt(8, 1);
        layoutParams.f4203b = obtainStyledAttributes.getFloat(2, 0.0f);
        layoutParams.f4204c = obtainStyledAttributes.getFloat(3, 1.0f);
        layoutParams.f4205d = obtainStyledAttributes.getInt(0, -1);
        layoutParams.f4206e = obtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        layoutParams.f4207f = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        layoutParams.f4208g = obtainStyledAttributes.getDimensionPixelSize(6, -1);
        layoutParams.f4209h = obtainStyledAttributes.getDimensionPixelSize(5, 16777215);
        layoutParams.f4210i = obtainStyledAttributes.getDimensionPixelSize(4, 16777215);
        layoutParams.j = obtainStyledAttributes.getBoolean(9, false);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    @Override // com.google.android.flexbox.a
    public int getAlignContent() {
        return this.f4191e;
    }

    @Override // com.google.android.flexbox.a
    public int getAlignItems() {
        return this.f4190d;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f4193g;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f4194h;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexDirection() {
        return this.f4187a;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<b> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f4201p.size());
        for (b bVar : this.f4201p) {
            if (bVar.a() != 0) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.a
    public List<b> getFlexLinesInternal() {
        return this.f4201p;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexWrap() {
        return this.f4188b;
    }

    public int getJustifyContent() {
        return this.f4189c;
    }

    @Override // com.google.android.flexbox.a
    public int getLargestMainSize() {
        Iterator it = this.f4201p.iterator();
        int i5 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            i5 = Math.max(i5, ((b) it.next()).f4215e);
        }
        return i5;
    }

    @Override // com.google.android.flexbox.a
    public int getMaxLine() {
        return this.f4192f;
    }

    public int getShowDividerHorizontal() {
        return this.f4195i;
    }

    public int getShowDividerVertical() {
        return this.j;
    }

    @Override // com.google.android.flexbox.a
    public int getSumOfCrossSize() {
        int size = this.f4201p.size();
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f4201p.get(i10);
            if (g(i10)) {
                i5 += i() ? this.f4196k : this.f4197l;
            }
            if (h(i10)) {
                i5 += i() ? this.f4196k : this.f4197l;
            }
            i5 += bVar.f4217g;
        }
        return i5;
    }

    public final boolean h(int i5) {
        if (i5 >= 0 && i5 < this.f4201p.size()) {
            for (int i10 = i5 + 1; i10 < this.f4201p.size(); i10++) {
                if (((b) this.f4201p.get(i10)).a() > 0) {
                    return false;
                }
            }
            if (i()) {
                return (this.f4195i & 4) != 0;
            }
            if ((this.j & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        int i5 = this.f4187a;
        return i5 == 0 || i5 == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i5, int i10, int i11, int i12, boolean z5) {
        float f6;
        float f10;
        float f11;
        int i13;
        boolean z7;
        int i14;
        int i15;
        int i16;
        int i17;
        View view;
        b bVar;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i18 = i11 - i5;
        int paddingBottom = (i12 - i10) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.f4201p.size();
        for (int i19 = 0; i19 < size; i19++) {
            b bVar2 = (b) this.f4201p.get(i19);
            if (g(i19)) {
                int i20 = this.f4196k;
                paddingBottom -= i20;
                paddingTop += i20;
            }
            int i21 = paddingBottom;
            int i22 = this.f4189c;
            char c2 = 4;
            int i23 = 2;
            boolean z10 = true;
            if (i22 == 0) {
                f6 = paddingLeft;
                f10 = i18 - paddingRight;
            } else if (i22 == 1) {
                int i24 = bVar2.f4215e;
                f10 = i24 - paddingLeft;
                f6 = (i18 - i24) + paddingRight;
            } else if (i22 != 2) {
                if (i22 == 3) {
                    f6 = paddingLeft;
                    f11 = (i18 - bVar2.f4215e) / (bVar2.a() != 1 ? r7 - 1 : 1.0f);
                    f10 = i18 - paddingRight;
                } else if (i22 == 4) {
                    int a7 = bVar2.a();
                    float f12 = a7 != 0 ? (i18 - bVar2.f4215e) / a7 : 0.0f;
                    float f13 = f12 / 2.0f;
                    f6 = paddingLeft + f13;
                    float f14 = (i18 - paddingRight) - f13;
                    f11 = f12;
                    f10 = f14;
                } else {
                    if (i22 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.f4189c);
                    }
                    f11 = bVar2.a() != 0 ? (i18 - bVar2.f4215e) / (r3 + 1) : 0.0f;
                    f6 = paddingLeft + f11;
                    f10 = (i18 - paddingRight) - f11;
                }
                float max = Math.max(f11, 0.0f);
                i13 = 0;
                while (i13 < bVar2.f4218h) {
                    int i25 = bVar2.f4224o + i13;
                    View e7 = e(i25);
                    char c8 = c2;
                    if (e7 != null) {
                        boolean z11 = z10;
                        if (e7.getVisibility() == 8) {
                            z7 = z11;
                        } else {
                            LayoutParams layoutParams = (LayoutParams) e7.getLayoutParams();
                            float f15 = f6 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                            float f16 = f10 - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            if (f(i25, i13)) {
                                int i26 = this.f4197l;
                                float f17 = i26;
                                f15 += f17;
                                f16 -= f17;
                                i17 = i26;
                            } else {
                                i17 = 0;
                            }
                            float f18 = f16;
                            int i27 = (i13 != bVar2.f4218h + (-1) || (this.j & 4) <= 0) ? 0 : this.f4197l;
                            if (this.f4188b == i23) {
                                if (z5) {
                                    i15 = i23;
                                    i16 = i13;
                                    view = e7;
                                    z7 = z11;
                                    this.f4200o.k(view, bVar2, Math.round(f18) - e7.getMeasuredWidth(), i21 - e7.getMeasuredHeight(), Math.round(f18), i21);
                                } else {
                                    i16 = i13;
                                    view = e7;
                                    z7 = z11;
                                    i15 = i23;
                                    this.f4200o.k(view, bVar2, Math.round(f15), i21 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f15), i21);
                                }
                                i14 = i21;
                            } else {
                                i16 = i13;
                                view = e7;
                                z7 = z11;
                                i15 = i23;
                                i14 = i21;
                                if (z5) {
                                    this.f4200o.k(view, bVar2, Math.round(f18) - view.getMeasuredWidth(), paddingTop, Math.round(f18), view.getMeasuredHeight() + paddingTop);
                                } else {
                                    int i28 = paddingTop;
                                    this.f4200o.k(view, bVar2, Math.round(f15), i28, view.getMeasuredWidth() + Math.round(f15), view.getMeasuredHeight() + i28);
                                    paddingTop = i28;
                                }
                            }
                            f6 = f15 + view.getMeasuredWidth() + max + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            float measuredWidth = f18 - ((view.getMeasuredWidth() + max) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
                            if (z5) {
                                bVar = bVar2;
                                bVar.b(view, i27, 0, i17, 0);
                            } else {
                                bVar = bVar2;
                                bVar.b(view, i17, 0, i27, 0);
                            }
                            bVar2 = bVar;
                            f10 = measuredWidth;
                            i13 = i16 + 1;
                            c2 = c8;
                            i23 = i15;
                            z10 = z7;
                            i21 = i14;
                        }
                    } else {
                        z7 = z10;
                    }
                    i15 = i23;
                    i16 = i13;
                    i14 = i21;
                    i13 = i16 + 1;
                    c2 = c8;
                    i23 = i15;
                    z10 = z7;
                    i21 = i14;
                }
                int i29 = bVar2.f4217g;
                paddingTop += i29;
                paddingBottom = i21 - i29;
            } else {
                int i30 = bVar2.f4215e;
                f6 = paddingLeft + ((i18 - i30) / 2.0f);
                f10 = (i18 - paddingRight) - ((i18 - i30) / 2.0f);
            }
            f11 = 0.0f;
            float max2 = Math.max(f11, 0.0f);
            i13 = 0;
            while (i13 < bVar2.f4218h) {
            }
            int i292 = bVar2.f4217g;
            paddingTop += i292;
            paddingBottom = i21 - i292;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i5, int i10, int i11, int i12, boolean z5, boolean z7) {
        float f6;
        float f10;
        float f11;
        int i13;
        char c2;
        int i14;
        int i15;
        int i16;
        int i17;
        b bVar;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i18 = i12 - i10;
        int i19 = (i11 - i5) - paddingRight;
        int size = this.f4201p.size();
        for (int i20 = 0; i20 < size; i20++) {
            b bVar2 = (b) this.f4201p.get(i20);
            if (g(i20)) {
                int i21 = this.f4197l;
                paddingLeft += i21;
                i19 -= i21;
            }
            int i22 = i19;
            int i23 = this.f4189c;
            char c8 = 4;
            int i24 = 1;
            if (i23 == 0) {
                f6 = paddingTop;
                f10 = i18 - paddingBottom;
            } else if (i23 == 1) {
                int i25 = bVar2.f4215e;
                f10 = i25 - paddingTop;
                f6 = (i18 - i25) + paddingBottom;
            } else if (i23 != 2) {
                if (i23 == 3) {
                    f6 = paddingTop;
                    f11 = (i18 - bVar2.f4215e) / (bVar2.a() != 1 ? r13 - 1 : 1.0f);
                    f10 = i18 - paddingBottom;
                } else if (i23 == 4) {
                    int a7 = bVar2.a();
                    f11 = a7 != 0 ? (i18 - bVar2.f4215e) / a7 : 0.0f;
                    float f12 = f11 / 2.0f;
                    f6 = paddingTop + f12;
                    f10 = (i18 - paddingBottom) - f12;
                } else {
                    if (i23 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.f4189c);
                    }
                    f11 = bVar2.a() != 0 ? (i18 - bVar2.f4215e) / (r5 + 1) : 0.0f;
                    f6 = paddingTop + f11;
                    f10 = (i18 - paddingBottom) - f11;
                }
                float max = Math.max(f11, 0.0f);
                i13 = 0;
                while (i13 < bVar2.f4218h) {
                    int i26 = bVar2.f4224o + i13;
                    int i27 = i24;
                    View e7 = e(i26);
                    if (e7 != null) {
                        c2 = c8;
                        if (e7.getVisibility() != 8) {
                            LayoutParams layoutParams = (LayoutParams) e7.getLayoutParams();
                            float f13 = f6 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                            float f14 = f10 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (f(i26, i13)) {
                                i17 = this.f4196k;
                                float f15 = i17;
                                f13 += f15;
                                f14 -= f15;
                            } else {
                                i17 = 0;
                            }
                            float f16 = f14;
                            int i28 = (i13 != bVar2.f4218h - i27 || (this.f4195i & 4) <= 0) ? 0 : this.f4196k;
                            if (z5) {
                                if (z7) {
                                    i16 = i13;
                                    i15 = i27;
                                    this.f4200o.l(e7, bVar2, true, i22 - e7.getMeasuredWidth(), Math.round(f16) - e7.getMeasuredHeight(), i22, Math.round(f16));
                                } else {
                                    i16 = i13;
                                    i15 = i27;
                                    this.f4200o.l(e7, bVar2, true, i22 - e7.getMeasuredWidth(), Math.round(f13), i22, e7.getMeasuredHeight() + Math.round(f13));
                                }
                                i14 = i22;
                            } else {
                                i16 = i13;
                                i15 = i27;
                                i14 = i22;
                                if (z7) {
                                    this.f4200o.l(e7, bVar2, false, paddingLeft, Math.round(f16) - e7.getMeasuredHeight(), e7.getMeasuredWidth() + paddingLeft, Math.round(f16));
                                } else {
                                    int i29 = paddingLeft;
                                    this.f4200o.l(e7, bVar2, false, i29, Math.round(f13), e7.getMeasuredWidth() + i29, e7.getMeasuredHeight() + Math.round(f13));
                                    paddingLeft = i29;
                                }
                            }
                            f6 = f13 + e7.getMeasuredHeight() + max + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            float measuredHeight = f16 - ((e7.getMeasuredHeight() + max) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                            if (z7) {
                                bVar = bVar2;
                                bVar.b(e7, 0, i28, 0, i17);
                            } else {
                                bVar = bVar2;
                                bVar.b(e7, 0, i17, 0, i28);
                            }
                            bVar2 = bVar;
                            f10 = measuredHeight;
                            i13 = i16 + 1;
                            c8 = c2;
                            i24 = i15;
                            i22 = i14;
                        }
                    } else {
                        c2 = c8;
                    }
                    i16 = i13;
                    i15 = i27;
                    i14 = i22;
                    i13 = i16 + 1;
                    c8 = c2;
                    i24 = i15;
                    i22 = i14;
                }
                int i30 = bVar2.f4217g;
                paddingLeft += i30;
                i19 = i22 - i30;
            } else {
                float f17 = (i18 - bVar2.f4215e) / 2.0f;
                f6 = paddingTop + f17;
                f10 = (i18 - paddingBottom) - f17;
            }
            f11 = 0.0f;
            float max2 = Math.max(f11, 0.0f);
            i13 = 0;
            while (i13 < bVar2.f4218h) {
            }
            int i302 = bVar2.f4217g;
            paddingLeft += i302;
            i19 = i22 - i302;
        }
    }

    public final void l(int i5, int i10, int i11, int i12) {
        int paddingBottom;
        int largestMainSize;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (i5 == 0 || i5 == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i5 != 2 && i5 != 3) {
                throw new IllegalArgumentException(c1.i(i5, "Invalid flex direction: "));
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i12 = View.combineMeasuredStates(i12, 16777216);
            } else {
                size = largestMainSize;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i10, i12);
        } else if (mode == 0) {
            resolveSizeAndState = View.resolveSizeAndState(largestMainSize, i10, i12);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException(c1.i(mode, "Unknown width mode is set: "));
            }
            if (size < largestMainSize) {
                i12 = View.combineMeasuredStates(i12, 16777216);
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i10, i12);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i12 = View.combineMeasuredStates(i12, 256);
            } else {
                size2 = paddingBottom;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i11, i12);
        } else if (mode2 == 0) {
            resolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i11, i12);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException(c1.i(mode2, "Unknown height mode is set: "));
            }
            if (size2 < paddingBottom) {
                i12 = View.combineMeasuredStates(i12, 256);
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i11, i12);
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f4194h == null && this.f4193g == null) {
            return;
        }
        if (this.f4195i == 0 && this.j == 0) {
            return;
        }
        int layoutDirection = getLayoutDirection();
        int i5 = this.f4187a;
        if (i5 == 0) {
            a(canvas, layoutDirection == 1, this.f4188b == 2);
            return;
        }
        if (i5 == 1) {
            a(canvas, layoutDirection != 1, this.f4188b == 2);
            return;
        }
        if (i5 == 2) {
            boolean z5 = layoutDirection == 1;
            if (this.f4188b == 2) {
                z5 = !z5;
            }
            b(canvas, z5, false);
            return;
        }
        if (i5 != 3) {
            return;
        }
        boolean z7 = layoutDirection == 1;
        if (this.f4188b == 2) {
            z7 = !z7;
        }
        b(canvas, z7, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i5, int i10, int i11, int i12) {
        int layoutDirection = getLayoutDirection();
        int i13 = this.f4187a;
        if (i13 == 0) {
            j(i5, i10, i11, i12, layoutDirection == 1);
            return;
        }
        if (i13 == 1) {
            j(i5, i10, i11, i12, layoutDirection != 1);
            return;
        }
        if (i13 == 2) {
            boolean z7 = false;
            if (layoutDirection == 1) {
                z7 = true;
            }
            if (this.f4188b == 2) {
                z7 = !z7;
            }
            k(i5, i10, i11, i12, z7, false);
            return;
        }
        if (i13 != 3) {
            throw new IllegalStateException("Invalid flex direction is set: " + this.f4187a);
        }
        boolean z10 = layoutDirection == 1;
        if (this.f4188b == 2) {
            z10 = !z10;
        }
        k(i5, i10, i11, i12, z10, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i5, int i10) {
        int i11;
        d dVar;
        if (this.f4199n == null) {
            this.f4199n = new SparseIntArray(getChildCount());
        }
        SparseIntArray sparseIntArray = this.f4199n;
        f fVar = this.f4200o;
        FlexboxLayout flexboxLayout = fVar.f4230a;
        int flexItemCount = flexboxLayout.getFlexItemCount();
        if (sparseIntArray.size() == flexItemCount) {
            for (int i12 = 0; i12 < flexItemCount; i12++) {
                View childAt = flexboxLayout.getChildAt(i12);
                if (childAt == null || ((FlexItem) childAt.getLayoutParams()).getOrder() == sparseIntArray.get(i12)) {
                }
            }
            i11 = this.f4187a;
            dVar = this.q;
            if (i11 == 0 && i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f4187a);
                }
                this.f4201p.clear();
                dVar.f4227b = null;
                dVar.f4226a = 0;
                fVar.b(dVar, i10, i5);
                this.f4201p = dVar.f4227b;
                fVar.g(i5, i10);
                fVar.f(i5, i10, getPaddingRight() + getPaddingLeft());
                fVar.q();
                l(this.f4187a, i5, i10, dVar.f4226a);
                return;
            }
            this.f4201p.clear();
            dVar.f4227b = null;
            dVar.f4226a = 0;
            fVar.b(dVar, i5, i10);
            this.f4201p = dVar.f4227b;
            fVar.g(i5, i10);
            if (this.f4190d == 3) {
                for (b bVar : this.f4201p) {
                    int i13 = Integer.MIN_VALUE;
                    for (int i14 = 0; i14 < bVar.f4218h; i14++) {
                        View e7 = e(bVar.f4224o + i14);
                        if (e7 != null && e7.getVisibility() != 8) {
                            LayoutParams layoutParams = (LayoutParams) e7.getLayoutParams();
                            i13 = this.f4188b != 2 ? Math.max(i13, e7.getMeasuredHeight() + Math.max(bVar.f4221l - e7.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(i13, e7.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max(e7.getBaseline() + (bVar.f4221l - e7.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                        }
                    }
                    bVar.f4217g = i13;
                }
            }
            fVar.f(i5, i10, getPaddingBottom() + getPaddingTop());
            fVar.q();
            l(this.f4187a, i5, i10, dVar.f4226a);
        }
        SparseIntArray sparseIntArray2 = this.f4199n;
        int flexItemCount2 = fVar.f4230a.getFlexItemCount();
        this.f4198m = f.n(flexItemCount2, fVar.e(flexItemCount2), sparseIntArray2);
        i11 = this.f4187a;
        dVar = this.q;
        if (i11 == 0) {
        }
        this.f4201p.clear();
        dVar.f4227b = null;
        dVar.f4226a = 0;
        fVar.b(dVar, i5, i10);
        this.f4201p = dVar.f4227b;
        fVar.g(i5, i10);
        if (this.f4190d == 3) {
        }
        fVar.f(i5, i10, getPaddingBottom() + getPaddingTop());
        fVar.q();
        l(this.f4187a, i5, i10, dVar.f4226a);
    }

    public void setAlignContent(int i5) {
        if (this.f4191e != i5) {
            this.f4191e = i5;
            requestLayout();
        }
    }

    public void setAlignItems(int i5) {
        if (this.f4190d != i5) {
            this.f4190d = i5;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.f4193g) {
            return;
        }
        this.f4193g = drawable;
        boolean z5 = false;
        if (drawable != null) {
            this.f4196k = drawable.getIntrinsicHeight();
        } else {
            this.f4196k = 0;
        }
        if (this.f4193g == null && this.f4194h == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.f4194h) {
            return;
        }
        this.f4194h = drawable;
        boolean z5 = false;
        if (drawable != null) {
            this.f4197l = drawable.getIntrinsicWidth();
        } else {
            this.f4197l = 0;
        }
        if (this.f4193g == null && this.f4194h == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        requestLayout();
    }

    public void setFlexDirection(int i5) {
        if (this.f4187a != i5) {
            this.f4187a = i5;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.a
    public void setFlexLines(List<b> list) {
        this.f4201p = list;
    }

    public void setFlexWrap(int i5) {
        if (this.f4188b != i5) {
            this.f4188b = i5;
            requestLayout();
        }
    }

    public void setJustifyContent(int i5) {
        if (this.f4189c != i5) {
            this.f4189c = i5;
            requestLayout();
        }
    }

    public void setMaxLine(int i5) {
        if (this.f4192f != i5) {
            this.f4192f = i5;
            requestLayout();
        }
    }

    public void setShowDivider(int i5) {
        setShowDividerVertical(i5);
        setShowDividerHorizontal(i5);
    }

    public void setShowDividerHorizontal(int i5) {
        if (i5 != this.f4195i) {
            this.f4195i = i5;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i5) {
        if (i5 != this.j) {
            this.j = i5;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            layoutParams3.f4202a = 1;
            layoutParams3.f4203b = 0.0f;
            layoutParams3.f4204c = 1.0f;
            layoutParams3.f4205d = -1;
            layoutParams3.f4206e = -1.0f;
            layoutParams3.f4207f = -1;
            layoutParams3.f4208g = -1;
            layoutParams3.f4209h = 16777215;
            layoutParams3.f4210i = 16777215;
            layoutParams3.f4202a = layoutParams2.f4202a;
            layoutParams3.f4203b = layoutParams2.f4203b;
            layoutParams3.f4204c = layoutParams2.f4204c;
            layoutParams3.f4205d = layoutParams2.f4205d;
            layoutParams3.f4206e = layoutParams2.f4206e;
            layoutParams3.f4207f = layoutParams2.f4207f;
            layoutParams3.f4208g = layoutParams2.f4208g;
            layoutParams3.f4209h = layoutParams2.f4209h;
            layoutParams3.f4210i = layoutParams2.f4210i;
            layoutParams3.j = layoutParams2.j;
            return layoutParams3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams4.f4202a = 1;
            layoutParams4.f4203b = 0.0f;
            layoutParams4.f4204c = 1.0f;
            layoutParams4.f4205d = -1;
            layoutParams4.f4206e = -1.0f;
            layoutParams4.f4207f = -1;
            layoutParams4.f4208g = -1;
            layoutParams4.f4209h = 16777215;
            layoutParams4.f4210i = 16777215;
            return layoutParams4;
        }
        LayoutParams layoutParams5 = new LayoutParams(layoutParams);
        layoutParams5.f4202a = 1;
        layoutParams5.f4203b = 0.0f;
        layoutParams5.f4204c = 1.0f;
        layoutParams5.f4205d = -1;
        layoutParams5.f4206e = -1.0f;
        layoutParams5.f4207f = -1;
        layoutParams5.f4208g = -1;
        layoutParams5.f4209h = 16777215;
        layoutParams5.f4210i = 16777215;
        return layoutParams5;
    }
}
