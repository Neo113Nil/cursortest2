package com.tonicartos.superslim;

import android.view.View;
import com.tonicartos.superslim.LayoutManager;
import com.tonicartos.superslim.b;

/* compiled from: LinearSLM.java */
/* loaded from: classes14.dex */
public final class c extends e {
    @Override // com.tonicartos.superslim.e
    public final int b(int i, d dVar, b bVar) {
        int i2;
        int i3 = dVar.a + 1;
        int i4 = 0;
        while (true) {
            i2 = dVar.g;
            if (i4 >= i2 || i3 >= i) {
                break;
            }
            b.a c = bVar.c(i3);
            View view = c.a;
            m(c, dVar);
            i4 += this.a.getDecoratedMeasuredHeight(view);
            bVar.a(i3, view);
            i3++;
        }
        if (i4 == i2) {
            return 0;
        }
        if (i4 > i2) {
            return 1;
        }
        return -i4;
    }

    @Override // com.tonicartos.superslim.e
    public final int c(int i, int i2, int i3, d dVar, b bVar) {
        int b = bVar.b.b();
        int i4 = i2;
        while (i3 < b && i4 < i) {
            b.a c = bVar.c(i3);
            if (c.a().i() != dVar.a) {
                bVar.a(i3, c.a);
                return i4;
            }
            m(c, dVar);
            LayoutManager.Direction direction = LayoutManager.Direction.END;
            i4 = l(c, i4, direction, dVar, bVar);
            a(c, i3, direction, bVar);
            i3++;
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087 A[SYNTHETIC] */
    @Override // com.tonicartos.superslim.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(int i, int i2, int i3, d dVar, b bVar) {
        LayoutManager layoutManager;
        boolean z;
        int i4;
        int i5;
        LayoutManager.b a;
        View childAt;
        d dVar2 = dVar;
        int i6 = dVar2.c;
        int i7 = dVar2.a;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int b = bVar.b.b();
            layoutManager = this.a;
            if (i9 >= b || (childAt = layoutManager.getChildAt(0)) == null) {
                break;
            }
            LayoutManager.b bVar2 = (LayoutManager.b) childAt.getLayoutParams();
            if (bVar2.i() != i7) {
                z = true;
                break;
            }
            if (!bVar2.f) {
                break;
            }
            i9++;
        }
        z = false;
        int i10 = -1;
        if (z) {
            int i11 = 0;
            for (int i12 = i3; i12 >= 0; i12--) {
                b.a c = bVar.c(i12);
                View view = c.a;
                bVar.a(i12, view);
                LayoutManager.b a2 = c.a();
                if (a2.i() != i7) {
                    break;
                }
                if (!a2.f) {
                    m(c, dVar2);
                    i11 += layoutManager.getDecoratedMeasuredHeight(view);
                    i10 = i12;
                    if (i11 >= i6) {
                        break;
                    }
                }
            }
            if (i11 < i6) {
                i8 = i11 - i6;
                i4 = i2 + i8;
                int i13 = i8;
                int i14 = i10;
                i5 = i3;
                int i15 = i4;
                while (i5 >= 0 && i15 - i13 > i) {
                    b.a c2 = bVar.c(i5);
                    View view2 = c2.a;
                    a = c2.a();
                    if (!a.f) {
                        bVar.a(i5, view2);
                        return i15;
                    }
                    if (a.i() != i7) {
                        bVar.a(i5, view2);
                        return i15;
                    }
                    if (!z || i5 < i14) {
                        m(c2, dVar2);
                    } else {
                        bVar.b(i5);
                    }
                    LayoutManager.Direction direction = LayoutManager.Direction.START;
                    i15 = l(c2, i15, direction, dVar2, bVar);
                    a(c2, i5, direction, bVar);
                    i5--;
                    dVar2 = dVar;
                }
                return i15;
            }
        }
        i4 = i2;
        int i132 = i8;
        int i142 = i10;
        i5 = i3;
        int i152 = i4;
        while (i5 >= 0) {
            b.a c22 = bVar.c(i5);
            View view22 = c22.a;
            a = c22.a();
            if (!a.f) {
            }
        }
        return i152;
    }

    @Override // com.tonicartos.superslim.e
    public final int e(int i, View view, b bVar, d dVar) {
        LayoutManager layoutManager = this.a;
        return c(i, layoutManager.getDecoratedBottom(view), layoutManager.getPosition(view) + 1, dVar, bVar);
    }

    @Override // com.tonicartos.superslim.e
    public final int f(int i, View view, b bVar, d dVar) {
        return d(i, this.a.getDecoratedTop(view), r0.getPosition(view) - 1, dVar, bVar);
    }

    public final int l(b.a aVar, int i, LayoutManager.Direction direction, d dVar, b bVar) {
        int i2;
        int i3;
        View view = aVar.a;
        LayoutManager layoutManager = this.a;
        int decoratedMeasuredHeight = layoutManager.getDecoratedMeasuredHeight(view);
        int decoratedMeasuredWidth = layoutManager.getDecoratedMeasuredWidth(view);
        int i4 = bVar.d ? dVar.i : dVar.h;
        int i5 = i4 + decoratedMeasuredWidth;
        LayoutManager.Direction direction2 = LayoutManager.Direction.END;
        if (direction == direction2) {
            i3 = i;
            i2 = decoratedMeasuredHeight + i;
        } else {
            i2 = i;
            i3 = i - decoratedMeasuredHeight;
        }
        this.a.layoutDecorated(aVar.a, i4, i3, i5, i2);
        return direction == direction2 ? layoutManager.getDecoratedBottom(view) : layoutManager.getDecoratedTop(view);
    }

    public final void m(b.a aVar, d dVar) {
        this.a.measureChildWithMargins(aVar.a, dVar.k + dVar.j, 0);
    }
}
