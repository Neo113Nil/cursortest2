package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xba extends u4 {
    public final int a;
    public final int b;
    public final ArrayList c;

    public xba(ArrayList arrayList, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = arrayList;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.a;
        if (i < 0 || i >= i2) {
            ArrayList arrayList = this.c;
            if (i < arrayList.size() + i2 && i2 <= i) {
                return arrayList.get(i - i2);
            }
            int size = arrayList.size() + i2;
            if (i >= size() || size > i) {
                pvd.m(size(), lnb.t(i, "Illegal attempt to access index ", " in ItemSnapshotList of size "));
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.v2
    public final int getSize() {
        return this.c.size() + this.a + this.b;
    }
}
