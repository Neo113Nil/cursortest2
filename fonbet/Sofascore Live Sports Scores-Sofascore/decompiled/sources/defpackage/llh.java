package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class llh {
    public static final jlh a(jlh jlhVar) {
        if (!(jlhVar instanceof jlh)) {
            jlhVar = null;
        }
        if (jlhVar != null) {
            return jlhVar;
        }
        sf3.b("Inconsistent composition");
        pvd.x();
        return null;
    }

    public static final int b(ArrayList arrayList, int i, int i2) {
        int c = c(arrayList, i, i2);
        return c >= 0 ? c : -(c + 1);
    }

    public static final int c(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((vu8) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int d = Intrinsics.d(i5, i);
            if (d < 0) {
                i3 = i4 + 1;
            } else {
                if (d <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int d(int i, int[] iArr) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void e() {
        throw new ConcurrentModificationException();
    }

    public static final void f(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }
}
