package com.vk.core.tool.view.galvitalayout;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import xsna.an10;
import xsna.epx;
import xsna.gp10;
import xsna.j5g;
import xsna.jw5;
import xsna.k9x;
import xsna.ruj;
import xsna.swe0;
import xsna.vu5;

/* compiled from: GalvitaLayoutManager.kt */
/* loaded from: classes17.dex */
public final class a {

    /* compiled from: GalvitaLayoutManager.kt */
    /* renamed from: com.vk.core.tool.view.galvitalayout.a$a, reason: collision with other inner class name */
    public static final class C0782a {
        public final ChildSize[] a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;

        public C0782a() {
            this(0);
        }

        public final void a() {
            jw5.p(ChildSize.SQUARE, this.a);
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = Integer.MAX_VALUE;
            this.j = 0;
            this.k = Integer.MAX_VALUE;
            this.m = 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!C0782a.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            C0782a c0782a = (C0782a) obj;
            return Arrays.equals(this.a, c0782a.a) && this.b == c0782a.b && this.c == c0782a.c && this.d == c0782a.d && this.e == c0782a.e && this.f == c0782a.f && this.g == c0782a.g && this.h == c0782a.h && this.i == c0782a.i && this.j == c0782a.j && this.k == c0782a.k;
        }

        public final int hashCode() {
            return (((((((((((((((((((Arrays.hashCode(this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Arguments(ratios=");
            k9x q = swe0.q(0, this.b);
            boolean isEmpty = q.isEmpty();
            ChildSize[] childSizeArr = this.a;
            sb.append(Arrays.toString(isEmpty ? jw5.m(0, 0, childSizeArr) : jw5.m(q.b, q.c + 1, childSizeArr)));
            sb.append(", childCount=");
            sb.append(this.b);
            sb.append(", gap=");
            sb.append(this.c);
            sb.append(", widthMeasureSpec=");
            sb.append(View.MeasureSpec.toString(this.d));
            sb.append(", heightMeasureSpec=");
            sb.append(View.MeasureSpec.toString(this.e));
            sb.append(", usedWidth=");
            sb.append(this.f);
            sb.append(", usedHeight=");
            sb.append(this.g);
            sb.append(", minWidth=");
            sb.append(this.h);
            sb.append(", maxWidth=");
            sb.append(this.i);
            sb.append(", minHeight=");
            sb.append(this.j);
            sb.append(", maxHeight=");
            return vu5.b(sb, this.k, ')');
        }

        public C0782a(int i) {
            ChildSize[] childSizeArr = new ChildSize[10];
            for (int i2 = 0; i2 < 10; i2++) {
                childSizeArr[i2] = ChildSize.SQUARE;
            }
            this.a = childSizeArr;
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = Integer.MAX_VALUE;
            this.j = 0;
            this.k = Integer.MAX_VALUE;
            this.l = Integer.MAX_VALUE;
        }
    }

    /* compiled from: GalvitaLayoutManager.kt */
    public static final class b {
        public final Rect[] a;
        public final ruj b;
        public int c;
        public int d;

        public b() {
            this(0);
        }

        public final void a() {
            for (Rect rect : this.a) {
                rect.setEmpty();
            }
            ruj rujVar = this.b;
            rujVar.getClass();
            rujVar.a = 0;
            rujVar.b = 0;
            rujVar.c = 0;
            this.c = 0;
            this.d = 0;
        }

        public final void b(b bVar) {
            Rect[] rectArr = this.a;
            int length = rectArr.length;
            for (int i = 0; i < length; i++) {
                rectArr[i].set(bVar.a[i]);
            }
            ruj rujVar = bVar.b;
            ruj rujVar2 = this.b;
            rujVar2.getClass();
            rujVar.getClass();
            rujVar2.a(rujVar.a, rujVar.b, rujVar.c);
            this.c = bVar.c;
            this.d = bVar.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!b.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            b bVar = (b) obj;
            return Arrays.equals(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            return ((((this.b.hashCode() + (Arrays.hashCode(this.a) * 31)) * 31) + this.c) * 31) + this.d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(coords=");
            ArrayList arrayList = new ArrayList();
            for (Rect rect : this.a) {
                if (!rect.isEmpty()) {
                    arrayList.add(rect);
                }
            }
            sb.append(j5g.g0(arrayList, null, null, null, 0, null, 63));
            sb.append(", corners=");
            sb.append(this.b);
            sb.append(", width=");
            sb.append(this.c);
            sb.append(", height=");
            return vu5.b(sb, this.d, ')');
        }

        public b(int i) {
            Rect[] rectArr = new Rect[10];
            for (int i2 = 0; i2 < 10; i2++) {
                rectArr[i2] = new Rect();
            }
            ruj rujVar = new ruj(0);
            this.a = rectArr;
            this.b = rujVar;
            this.c = 0;
            this.d = 0;
        }
    }

    public static ChildSize a(a aVar, ChildSize[] childSizeArr, int i, int i2, ChildSize childSize, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            childSize = null;
        }
        aVar.getClass();
        ChildSize childSize2 = childSizeArr[i];
        if (childSize2 == childSize) {
            return ChildSize.SQUARE;
        }
        int i4 = i + 1;
        if (i4 <= i2) {
            while (childSizeArr[i4] == childSize2) {
                if (i4 != i2) {
                    i4++;
                }
            }
            return ChildSize.SQUARE;
        }
        return childSize2;
    }

    public static void c(C0782a c0782a, b bVar, ChildSize childSize, int i, int i2) {
        int i3 = c0782a.c;
        int i4 = c0782a.m;
        int i5 = i2 - i;
        int i6 = i5 + 1;
        int i7 = i4 - (i3 * i5);
        int i8 = (i4 - i3) / 2;
        int b2 = an10.b(i7 / i6);
        int b3 = an10.b(b2 / childSize.h());
        int i9 = (i6 % 2 != 0 || b2 * i6 == i7) ? -1 : (i6 / 2) - 1;
        int i10 = bVar.d;
        int i11 = 0;
        for (int i12 = 0; i12 < i6; i12++) {
            Rect rect = bVar.a[i + i12];
            int i13 = ((b2 + i3) * i12) + i11;
            rect.left = i13;
            rect.top = i10;
            int i14 = i13 + b2;
            rect.right = i14;
            rect.bottom = i10 + b3;
            if (i12 == i9 && i14 != i8) {
                i11 = i8 - i14;
                rect.right = i8;
            } else if (i12 == i5 && i14 != i4) {
                rect.right = i4;
            }
        }
        bVar.d += b3;
    }

    public final void b(C0782a c0782a, b bVar) {
        ChildSize[] childSizeArr = c0782a.a;
        Rect[] rectArr = bVar.a;
        ruj rujVar = bVar.b;
        if (c0782a.b == 0) {
            bVar.c = gp10.b(c0782a.d, c0782a.h, c0782a.i, c0782a.f, 0);
            bVar.d = gp10.b(c0782a.e, c0782a.j, c0782a.k, c0782a.g, 0);
            return;
        }
        c0782a.m = gp10.a(c0782a.d, c0782a.h, c0782a.i, c0782a.f);
        gp10.a(c0782a.e, c0782a.j, c0782a.k, c0782a.g);
        int i = c0782a.b;
        if (i == 1) {
            float h = childSizeArr[0].h();
            int i2 = c0782a.m;
            int b2 = an10.b(i2 / h);
            rectArr[0].set(0, 0, i2, b2);
            bVar.c = i2;
            bVar.d = b2;
            rujVar.a(0, 0, 0);
            return;
        }
        if (i == 2) {
            ChildSize childSize = childSizeArr[0];
            ChildSize childSize2 = childSizeArr[1];
            int i3 = c0782a.c;
            int i4 = c0782a.m - i3;
            float h2 = i4 / ((childSize2.h() / childSize.h()) + 1);
            float h3 = h2 / childSize.h();
            Rect rect = rectArr[0];
            rect.set(0, 0, an10.b(h2), an10.b(h3));
            Rect rect2 = rectArr[1];
            int i5 = rect.right + i3;
            rect2.left = i5;
            rect2.top = 0;
            rect2.right = (i4 - rect.width()) + i5;
            rect2.bottom = rect.height();
            bVar.c = c0782a.m;
            bVar.d = rect.height();
            rujVar.a(1, 1, 0);
            return;
        }
        if (i != 3) {
            if (i == 4) {
                ChildSize a = a(this, c0782a.a, 0, i - 1, ChildSize.NARROW, 2);
                c(c0782a, bVar, a, 0, 1);
                bVar.d += c0782a.c;
                c(c0782a, bVar, a, 2, 3);
                bVar.c = c0782a.m;
                rujVar.a(1, 3, 2);
                return;
            }
            if (i == 6) {
                ChildSize a2 = a(this, c0782a.a, 0, i - 1, null, 10);
                if (a2 == ChildSize.WIDE) {
                    c(c0782a, bVar, a2, 0, 1);
                    bVar.d += c0782a.c;
                    c(c0782a, bVar, a2, 2, 5);
                    rujVar.a(1, 5, 2);
                } else {
                    c(c0782a, bVar, a2, 0, 2);
                    bVar.d += c0782a.c;
                    c(c0782a, bVar, a2, 3, 5);
                    rujVar.a(2, 5, 3);
                }
                bVar.c = c0782a.m;
                return;
            }
            if (i != 9) {
                c(c0782a, bVar, a(this, c0782a.a, 0, 1, null, 8), 0, 1);
                bVar.d += c0782a.c;
                c(c0782a, bVar, a(this, c0782a.a, 2, c0782a.b - 1, null, 8), 2, c0782a.b - 1);
                bVar.c = c0782a.m;
                rujVar.a(1, c0782a.b - 1, 2);
                return;
            }
            ChildSize a3 = a(this, c0782a.a, 0, i - 1, ChildSize.NARROW, 2);
            c(c0782a, bVar, a3, 0, 2);
            bVar.d += c0782a.c;
            c(c0782a, bVar, a3, 3, 5);
            bVar.d += c0782a.c;
            c(c0782a, bVar, a3, 6, 8);
            bVar.c = c0782a.m;
            rujVar.a(2, 8, 6);
            return;
        }
        ChildSize childSize3 = childSizeArr[0];
        ChildSize childSize4 = childSizeArr[1];
        ChildSize childSize5 = childSizeArr[2];
        int i6 = c0782a.c;
        int i7 = c0782a.m - i6;
        float h4 = (i7 - (childSize3.h() * i6)) / ((((childSize4.h() / childSize5.h()) + 1) * childSize3.h()) + childSize4.h());
        int b3 = an10.b(childSize4.h() * h4);
        float h5 = b3 / childSize5.h();
        int i8 = i7 - b3;
        Rect rect3 = rectArr[1];
        int i9 = i8 + i6;
        rect3.left = i9;
        rect3.top = 0;
        rect3.right = i9 + b3;
        int b4 = an10.b(h4);
        rect3.bottom = b4;
        Rect rect4 = rectArr[2];
        int i10 = rect3.left;
        rect4.left = i10;
        int i11 = b4 + i6;
        rect4.top = i11;
        rect4.right = i10 + b3;
        int b5 = an10.b(h5) + i11;
        rect4.bottom = b5;
        Rect rect5 = rectArr[0];
        rect5.left = 0;
        rect5.top = 0;
        rect5.right = i8;
        rect5.bottom = b5;
        bVar.c = c0782a.m;
        bVar.d = rect4.bottom - rect3.top;
        rujVar.a(1, 2, 0);
    }
}
