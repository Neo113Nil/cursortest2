package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dv8 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final uzc e;
    public final mqi f;

    public dv8(ArrayList arrayList, int i) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            h3f.a("Invalid start index");
        }
        this.d = new ArrayList();
        uzc uzcVar = new uzc();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            uia uiaVar = (uia) this.a.get(i3);
            int i4 = uiaVar.c;
            int i5 = uiaVar.d;
            uzcVar.i(i4, new x39(i3, i2, i5));
            i2 += i5;
        }
        this.e = uzcVar;
        this.f = ypa.b(new ps4(this, 6));
    }

    public final boolean a(int i, int i2) {
        x39 x39Var;
        int i3;
        int i4;
        uzc uzcVar = this.e;
        x39 x39Var2 = (x39) uzcVar.b(i);
        if (x39Var2 == null) {
            return false;
        }
        int i5 = x39Var2.b;
        int i6 = i2 - x39Var2.c;
        x39Var2.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = uzcVar.c;
        long[] jArr = uzcVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (x39Var = (x39) objArr[(i7 << 3) + i9]).b) >= i5 && x39Var != x39Var2 && (i4 = i3 + i6) >= 0) {
                        x39Var.b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
