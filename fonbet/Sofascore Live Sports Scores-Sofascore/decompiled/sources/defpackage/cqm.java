package defpackage;

import android.os.CountDownTimer;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cqm extends CountDownTimer {
    public cqm() {
        super(1500L, 1500L);
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        wom womVar = hda.d;
        if (womVar != null) {
            vg6 vg6Var = (vg6) womVar.c();
            vg6Var.j0();
            if (Intrinsics.c(vg6Var.a0, new ijh(0, 0))) {
                ((vg6) womVar.c()).release();
            }
        }
        hda.d = null;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
