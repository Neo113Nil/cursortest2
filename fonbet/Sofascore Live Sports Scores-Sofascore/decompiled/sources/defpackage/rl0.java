package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class rl0 extends ffb {
    public final long g;
    public final ArrayList h;
    public final ArrayList i;

    public rl0(int i, long j) {
        super(i, 1);
        this.g = j;
        this.h = new ArrayList();
        this.i = new ArrayList();
    }

    public final rl0 A(int i) {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            rl0 rl0Var = (rl0) arrayList.get(i2);
            if (rl0Var.b == i) {
                return rl0Var;
            }
        }
        return null;
    }

    public final sl0 B(int i) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sl0 sl0Var = (sl0) arrayList.get(i2);
            if (sl0Var.b == i) {
                return sl0Var;
            }
        }
        return null;
    }

    @Override // defpackage.ffb
    public final String toString() {
        return ffb.g(this.b) + " leaves: " + Arrays.toString(this.h.toArray()) + " containers: " + Arrays.toString(this.i.toArray());
    }
}
