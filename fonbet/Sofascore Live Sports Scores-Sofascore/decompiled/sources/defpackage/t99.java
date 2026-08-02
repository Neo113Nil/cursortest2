package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class t99 extends wm3 {
    public wm3[] r0 = new wm3[4];
    public int s0 = 0;

    public final void V(wm3 wm3Var) {
        if (wm3Var == this || wm3Var == null) {
            return;
        }
        int i = this.s0 + 1;
        wm3[] wm3VarArr = this.r0;
        if (i > wm3VarArr.length) {
            wm3VarArr = (wm3[]) Arrays.copyOf(wm3VarArr, wm3VarArr.length * 2);
            this.r0 = wm3VarArr;
        }
        int i2 = this.s0;
        wm3VarArr[i2] = wm3Var;
        this.s0 = i2 + 1;
    }

    public final void W(int i, k7l k7lVar, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.s0; i2++) {
            wm3 wm3Var = this.r0[i2];
            ArrayList arrayList2 = k7lVar.a;
            if (!arrayList2.contains(wm3Var)) {
                arrayList2.add(wm3Var);
            }
        }
        for (int i3 = 0; i3 < this.s0; i3++) {
            n9e.v(this.r0[i3], i, arrayList, k7lVar);
        }
    }

    public void X() {
    }
}
