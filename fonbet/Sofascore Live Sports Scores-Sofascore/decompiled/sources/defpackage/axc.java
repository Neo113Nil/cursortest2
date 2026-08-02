package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class axc extends ffb {
    public final long g;
    public final ArrayList h;
    public final ArrayList i;

    public axc(int i, long j) {
        super(i, 5);
        this.g = j;
        this.h = new ArrayList();
        this.i = new ArrayList();
    }

    public final axc A(int i) {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            axc axcVar = (axc) arrayList.get(i2);
            if (axcVar.b == i) {
                return axcVar;
            }
        }
        return null;
    }

    public final bxc B(int i) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            bxc bxcVar = (bxc) arrayList.get(i2);
            if (bxcVar.b == i) {
                return bxcVar;
            }
        }
        return null;
    }

    @Override // defpackage.ffb
    public final String toString() {
        return ffb.h(this.b) + " leaves: " + Arrays.toString(this.h.toArray()) + " containers: " + Arrays.toString(this.i.toArray());
    }
}
