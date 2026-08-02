package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class yjd {
    public static final Object[] a = new Object[0];
    public static final l0d b = new l0d(0);

    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            zzl.r(lnb.j(i, size, "Index ", " is out of bounds. The list has ", " elements."));
        }
    }

    public static final void b(int i, int i2, List list) {
        int size = list.size();
        if (i > i2) {
            a70.p(lnb.j(i, i2, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
            return;
        }
        if (i < 0) {
            zzl.r(lnb.k(i, "fromIndex (", ") is less than 0."));
            return;
        }
        if (i2 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
    }
}
