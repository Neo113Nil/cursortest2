package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class iq3 {
    public final SnapshotStateList a = new SnapshotStateList();

    public static void b(iq3 iq3Var, Function2 function2, tc3 tc3Var, Function0 function0, int i) {
        if ((i & 8) != 0) {
            tc3Var = null;
        }
        iq3Var.a.add(new tc3(-1789283891, new er6(function2, iq3Var, tc3Var, function0), true));
    }

    public final void a(gq3 gq3Var, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-798501095);
        int i2 = (av8Var.g(gq3Var) ? 4 : 2) | i | (av8Var.g(this) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            SnapshotStateList snapshotStateList = this.a;
            int size = snapshotStateList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((ct8) snapshotStateList.get(i3)).invoke(gq3Var, av8Var, Integer.valueOf(i2 & 14));
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vn6(this, gq3Var, i, 22);
        }
    }
}
