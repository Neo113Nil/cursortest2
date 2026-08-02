package com.tonicartos.superslim;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.tonicartos.superslim.LayoutManager;
import com.tonicartos.superslim.b;
import com.vk.thirdparty.R$styleable;
import xsna.rzl;
import xsna.tj0;

/* compiled from: GridSLM.java */
/* loaded from: classes14.dex */
public final class a extends e {
    public final Context b;
    public int c;
    public int d;
    public int e;
    public boolean f;

    public a(LayoutManager layoutManager, Context context) {
        super(layoutManager);
        this.c = 0;
        this.d = 0;
        this.b = context;
    }

    @Override // com.tonicartos.superslim.e
    public final int b(int i, d dVar, b bVar) {
        int i2;
        int i3;
        int i4;
        int b = bVar.b.b();
        int i5 = dVar.a + 1;
        int i6 = 0;
        while (true) {
            i2 = dVar.g;
            if (i6 >= i2 || i5 >= i) {
                break;
            }
            int i7 = 0;
            int i8 = 0;
            while (true) {
                i3 = this.d;
                if (i7 < i3 && (i4 = i5 + i7) < b) {
                    b.a c = bVar.c(i4);
                    View view = c.a;
                    m(c, dVar);
                    i8 = Math.max(i8, this.a.getDecoratedMeasuredHeight(view));
                    bVar.a(i4, view);
                    i7++;
                }
            }
            i6 += i8;
            i5 += i3;
        }
        if (i6 == i2) {
            return 0;
        }
        if (i6 > i2) {
            return 1;
        }
        return -i6;
    }

    @Override // com.tonicartos.superslim.e
    public final int c(int i, int i2, int i3, d dVar, b bVar) {
        int b;
        if (i2 < i && i3 < (b = bVar.b.b())) {
            b.a c = bVar.c(i3);
            bVar.a(i3, c.a);
            int i4 = c.a().i();
            int i5 = dVar.a;
            if (i4 == i5) {
                int i6 = (i3 - (dVar.b ? i5 + 1 : i5)) % this.d;
                for (int i7 = 1; i7 <= i6; i7++) {
                    int i8 = 1;
                    while (true) {
                        LayoutManager layoutManager = this.a;
                        if (i8 <= layoutManager.getChildCount()) {
                            View childAt = layoutManager.getChildAt(layoutManager.getChildCount() - i8);
                            if (layoutManager.getPosition(childAt) == i3 - i7) {
                                i2 = layoutManager.getDecoratedTop(childAt);
                                layoutManager.detachAndScrapViewAt(i8, bVar.a);
                                break;
                            }
                            if (((LayoutManager.b) childAt.getLayoutParams()).i() != i5) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
                int i9 = i2;
                int i10 = i3 - i6;
                while (i10 < b && i9 <= i) {
                    b.a c2 = bVar.c(i10);
                    if (c2.a().i() != i5) {
                        bVar.a(i10, c2.a);
                        return i9;
                    }
                    i9 += l(i9, i10, LayoutManager.Direction.END, true, dVar, bVar);
                    i10 += this.d;
                }
                return i9;
            }
        }
        return i2;
    }

    @Override // com.tonicartos.superslim.e
    public final int d(int i, int i2, int i3, d dVar, b bVar) {
        LayoutManager layoutManager;
        boolean z;
        int i4;
        int i5;
        int i6;
        LayoutManager.b a;
        int i7;
        int i8 = i3;
        d dVar2 = dVar;
        b bVar2 = bVar;
        boolean z2 = dVar2.b;
        int i9 = dVar2.c;
        int i10 = dVar2.a;
        int i11 = z2 ? i10 + 1 : i10;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            layoutManager = this.a;
            if (i13 >= layoutManager.getChildCount()) {
                break;
            }
            LayoutManager.b bVar3 = (LayoutManager.b) layoutManager.getChildAt(0).getLayoutParams();
            if (bVar3.i() != i10) {
                z = true;
                break;
            }
            if (!bVar3.f) {
                break;
            }
            i13++;
        }
        z = false;
        int i14 = (i8 - i11) % this.d;
        for (int i15 = 1; i15 < this.d - i14; i15++) {
            int i16 = 0;
            while (true) {
                if (i16 < layoutManager.getChildCount()) {
                    View childAt = layoutManager.getChildAt(i16);
                    if (((LayoutManager.b) childAt.getLayoutParams()).i() == i10) {
                        if (layoutManager.getPosition(childAt) == i8 + i15) {
                            layoutManager.detachAndScrapViewAt(i16, bVar2.a);
                            break;
                        }
                        i16++;
                    }
                }
            }
        }
        int i17 = i8 - i14;
        int i18 = -1;
        if (z) {
            int i19 = -1;
            int i20 = 0;
            i18 = i17;
            while (i18 >= 0) {
                b.a c = bVar2.c(i18);
                bVar2.a(i18, c.a);
                if (c.a().i() != i10) {
                    break;
                }
                int i21 = i12;
                int i22 = i21;
                while (i21 < this.d && (i7 = i18 + i21) <= i8) {
                    b.a c2 = bVar2.c(i7);
                    View view = c2.a;
                    bVar2.a(i7, view);
                    LayoutManager.b a2 = c2.a();
                    if (a2.i() != i10) {
                        break;
                    }
                    if (!a2.f) {
                        m(c2, dVar2);
                        i22 = Math.max(i22, layoutManager.getDecoratedMeasuredHeight(view));
                    }
                    i21++;
                    i8 = i3;
                }
                i20 += i22;
                if (i20 >= i9) {
                    break;
                }
                i19 = i18;
                i12 = 0;
                i18 -= this.d;
                i8 = i3;
            }
            i18 = i19;
            if (i20 < i9) {
                i6 = i20 - i9;
                i4 = i2 + i6;
                i5 = i18;
                while (i17 >= 0 && i4 - i6 > i) {
                    b.a c3 = bVar2.c(i17);
                    bVar2.a(i17, c3.a);
                    a = c3.a();
                    if (!a.f || a.i() != i10) {
                        break;
                        break;
                    }
                    i4 -= l(i4, i17, LayoutManager.Direction.START, z || i17 < i5, dVar2, bVar2);
                    i17 -= this.d;
                    dVar2 = dVar;
                    bVar2 = bVar;
                }
                return i4;
            }
        }
        i4 = i2;
        i5 = i18;
        i6 = 0;
        while (i17 >= 0) {
            b.a c32 = bVar2.c(i17);
            bVar2.a(i17, c32.a);
            a = c32.a();
            if (!a.f) {
                break;
            }
            i4 -= l(i4, i17, LayoutManager.Direction.START, z || i17 < i5, dVar2, bVar2);
            i17 -= this.d;
            dVar2 = dVar;
            bVar2 = bVar;
        }
        return i4;
    }

    @Override // com.tonicartos.superslim.e
    public final int e(int i, View view, b bVar, d dVar) {
        LayoutManager layoutManager = this.a;
        return c(i, j(dVar.a, layoutManager.getChildCount() - 1, layoutManager.getDecoratedBottom(view)), layoutManager.getPosition(view) + 1, dVar, bVar);
    }

    @Override // com.tonicartos.superslim.e
    public final int f(int i, View view, b bVar, d dVar) {
        return d(i, this.a.getDecoratedTop(view), r0.getPosition(view) - 1, dVar, bVar);
    }

    @Override // com.tonicartos.superslim.e
    public final LayoutManager.b g(Context context, AttributeSet attributeSet) {
        return new C0366a(context, attributeSet);
    }

    @Override // com.tonicartos.superslim.e
    public final LayoutManager.b h(LayoutManager.b bVar) {
        return new C0366a((ViewGroup.MarginLayoutParams) bVar);
    }

    @Override // com.tonicartos.superslim.e
    public final int j(int i, int i2, int i3) {
        LayoutManager layoutManager = this.a;
        int width = layoutManager.getWidth();
        int i4 = 0;
        boolean z = false;
        while (i2 >= 0) {
            View childAt = layoutManager.getChildAt(i2);
            LayoutManager.b bVar = (LayoutManager.b) childAt.getLayoutParams();
            if (bVar.i() != i) {
                break;
            }
            if (!bVar.f) {
                if (childAt.getLeft() >= width) {
                    break;
                }
                width = childAt.getLeft();
                i4 = Math.max(i4, layoutManager.getDecoratedBottom(childAt));
                z = true;
            }
            i2--;
        }
        return z ? i4 : i3;
    }

    @Override // com.tonicartos.superslim.e
    public final e k(d dVar) {
        LayoutManager.b bVar = dVar.l;
        if (bVar instanceof C0366a) {
            C0366a c0366a = (C0366a) bVar;
            int i = c0366a.p;
            int i2 = c0366a.o;
            if (i < 0 && i2 < 0) {
                i2 = 1;
            }
            if (i2 == -1) {
                this.c = i;
                this.f = false;
            } else {
                this.d = i2;
                this.c = 0;
                this.f = true;
            }
        }
        int width = (this.a.getWidth() - dVar.i) - dVar.h;
        if (!this.f) {
            if (this.c <= 0) {
                this.c = (int) tj0.a(1, 48.0f, this.b);
            }
            this.d = width / Math.abs(this.c);
        }
        if (this.d < 1) {
            this.d = 1;
        }
        int i3 = width / this.d;
        this.e = i3;
        if (i3 == 0) {
            Log.e("GridSection", rzl.a(this.d, width, ") for available width", ".", new StringBuilder("Too many columns (")));
        }
        return this;
    }

    public final int l(int i, int i2, LayoutManager.Direction direction, boolean z, d dVar, b bVar) {
        LayoutManager layoutManager;
        int i3;
        int i4;
        boolean z2 = bVar.d;
        b.a[] aVarArr = new b.a[this.d];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = this.d;
            layoutManager = this.a;
            if (i6 >= i8 || (i4 = i2 + i6) >= bVar.b.b()) {
                break;
            }
            b.a c = bVar.c(i4);
            View view = c.a;
            if (c.a().i() != dVar.a) {
                bVar.a(i4, view);
                break;
            }
            if (z) {
                m(c, dVar);
            } else {
                bVar.b(i4);
            }
            i7 = Math.max(i7, layoutManager.getDecoratedMeasuredHeight(view));
            aVarArr[i6] = c;
            i6++;
        }
        int i9 = 1;
        boolean z3 = direction == LayoutManager.Direction.START;
        int i10 = z3 ? i - i7 : i;
        while (true) {
            int i11 = this.d;
            if (i5 >= i11) {
                return i7;
            }
            int i12 = z3 ? (i11 - i5) - i9 : i5;
            int i13 = (!z2 ? z3 : !z3) ? (i11 - i5) - i9 : i5;
            b.a aVar = aVarArr[i12];
            if (aVar == null) {
                i3 = i9;
            } else {
                LayoutManager.b a = aVar.a();
                View view2 = aVar.a;
                i3 = i9;
                int decoratedMeasuredHeight = ((ViewGroup.MarginLayoutParams) a).height == -1 ? i7 : layoutManager.getDecoratedMeasuredHeight(view2);
                int decoratedMeasuredWidth = i13 == this.d + (-1) ? layoutManager.getDecoratedMeasuredWidth(view2) : Math.min(this.e, layoutManager.getDecoratedMeasuredWidth(view2));
                int i14 = i10 + decoratedMeasuredHeight;
                int i15 = (i13 * this.e) + (z2 ? dVar.i : dVar.h);
                this.a.layoutDecorated(aVar.a, i15, i10, i15 + decoratedMeasuredWidth, i14);
                a(aVarArr[i12], i12 + i2, direction, bVar);
            }
            i5++;
            i9 = i3;
        }
    }

    public final void m(b.a aVar, d dVar) {
        this.a.measureChildWithMargins(aVar.a, dVar.j + dVar.k + ((this.d - 1) * this.e), 0);
    }

    /* compiled from: GridSLM.java */
    /* renamed from: com.tonicartos.superslim.a$a, reason: collision with other inner class name */
    public static class C0366a extends LayoutManager.b {
        public int o;
        public final int p;

        public C0366a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b);
            this.o = obtainStyledAttributes.getInt(1, -1);
            this.p = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            obtainStyledAttributes.recycle();
        }

        @Deprecated
        public C0366a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            if (marginLayoutParams instanceof C0366a) {
                C0366a c0366a = (C0366a) marginLayoutParams;
                this.o = c0366a.o;
                this.p = c0366a.p;
            } else {
                this.o = -1;
                this.p = -1;
            }
        }

        @Deprecated
        public C0366a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof C0366a) {
                C0366a c0366a = (C0366a) layoutParams;
                this.o = c0366a.o;
                this.p = c0366a.p;
            } else {
                this.o = -1;
                this.p = -1;
            }
        }
    }
}
