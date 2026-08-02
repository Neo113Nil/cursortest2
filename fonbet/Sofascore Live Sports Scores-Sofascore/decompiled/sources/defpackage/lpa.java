package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lpa {
    public final yoa a;
    public final ArrayList b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final ArrayList g;
    public List h;
    public int i;

    public lpa(yoa yoaVar) {
        this.a = yoaVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new jpa(0, 0));
        this.b = arrayList;
        this.f = -1;
        this.g = new ArrayList();
        this.h = km5.a;
    }

    public final int a() {
        return ((int) Math.sqrt((d() * 1.0d) / this.i)) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        if (r9 < r7) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mu4 b(int i) {
        int i2;
        int i3;
        int i4;
        List list;
        boolean z = true;
        if (!this.a.c) {
            int i5 = this.i;
            int i6 = i * i5;
            int d = d() - i6;
            if (i5 > d) {
                i5 = d;
            }
            if (i5 < 0) {
                i5 = 0;
            }
            if (i5 == this.h.size()) {
                list = this.h;
            } else {
                ArrayList arrayList = new ArrayList(i5);
                for (int i7 = 0; i7 < i5; i7++) {
                    arrayList.add(new o39(waa.b(1)));
                }
                this.h = arrayList;
                list = arrayList;
            }
            return new mu4(i6, list);
        }
        int a = i / a();
        ArrayList arrayList2 = this.b;
        int min = Math.min(a, arrayList2.size() - 1);
        int a2 = a() * min;
        int i8 = ((jpa) arrayList2.get(min)).a;
        int i9 = ((jpa) arrayList2.get(min)).b;
        int i10 = this.c;
        ArrayList arrayList3 = this.g;
        if (a2 <= i10 && i10 <= i) {
            i8 = this.d;
            i9 = this.e;
            a2 = i10;
        } else if (min == this.f && (i2 = i - a2) < arrayList3.size()) {
            i8 = ((Number) arrayList3.get(i2)).intValue();
            a2 = i;
            i9 = 0;
        }
        if (a2 % a() == 0) {
            int a3 = a();
            int i11 = i - a2;
            if (2 <= i11) {
            }
        }
        z = false;
        if (z) {
            this.f = min;
            arrayList3.clear();
        }
        if (a2 > i) {
            u3a.c("currentLine (" + a2 + ") > lineIndex (" + i + ')');
        }
        while (a2 < i && i8 < d()) {
            if (z) {
                arrayList3.add(Integer.valueOf(i8));
            }
            int i12 = 0;
            while (i12 < this.i && i8 < d()) {
                if (i9 == 0) {
                    i4 = i9;
                    i9 = e(i8, this.i - i12);
                } else {
                    i4 = 0;
                }
                i12 += i9;
                if (i12 > this.i) {
                    break;
                }
                i8++;
                i9 = i4;
            }
            a2++;
            if (a2 % a() == 0 && i8 < d()) {
                if (arrayList2.size() != a2 / a()) {
                    u3a.c("invalid starting point");
                }
                arrayList2.add(new jpa(i8, i9));
            }
        }
        this.c = i;
        this.d = i8;
        this.e = i9;
        ArrayList arrayList4 = new ArrayList();
        int i13 = 0;
        int i14 = i8;
        while (i13 < this.i && i14 < d()) {
            if (i9 == 0) {
                int i15 = i9;
                i9 = e(i14, this.i - i13);
                i3 = i15;
            } else {
                i3 = 0;
            }
            i13 += i9;
            if (i13 > this.i) {
                break;
            }
            i14++;
            arrayList4.add(new o39(waa.b(i9)));
            i9 = i3;
        }
        return new mu4(i8, arrayList4);
    }

    public final int c(int i) {
        int i2;
        int i3;
        if (d() <= 0) {
            return 0;
        }
        if (i >= d()) {
            u3a.a("ItemIndex > total count");
        }
        if (!this.a.c) {
            return i / this.i;
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        b.n(arrayList.size(), size);
        int i4 = size - 1;
        int i5 = 0;
        while (true) {
            if (i5 > i4) {
                i2 = -(i5 + 1);
                break;
            }
            i2 = (i5 + i4) >>> 1;
            int i6 = ((jpa) arrayList.get(i2)).a - i;
            if (i6 >= 0) {
                if (i6 <= 0) {
                    break;
                }
                i4 = i2 - 1;
            } else {
                i5 = i2 + 1;
            }
        }
        if (i2 < 0) {
            i2 = (-i2) - 2;
        }
        int a = a() * i2;
        int i7 = ((jpa) arrayList.get(i2)).a;
        if (i7 > i) {
            u3a.a("currentItemIndex > itemIndex");
        }
        int i8 = 0;
        while (true) {
            i3 = this.i;
            if (i7 >= i) {
                break;
            }
            int i9 = i7 + 1;
            int e = e(i7, i3 - i8);
            i8 += e;
            int i10 = this.i;
            if (i8 >= i10) {
                if (i8 == i10) {
                    a++;
                    i8 = 0;
                } else {
                    a++;
                    i8 = e;
                }
            }
            if (a % a() == 0 && a / a() >= arrayList.size()) {
                arrayList.add(new jpa(i9 - (i8 > 0 ? 1 : 0), 0));
            }
            i7 = i9;
        }
        return e(i, i3 - i8) + i8 > this.i ? a + 1 : a;
    }

    public final int d() {
        return this.a.b.b;
    }

    public final int e(int i, int i2) {
        kpa.b = i2;
        kpa.c = this.i;
        h9a j = this.a.b.j(i);
        int i3 = i - j.a;
        return (int) ((o39) ((woa) j.c).b.invoke(kpa.a, Integer.valueOf(i3))).a;
    }
}
