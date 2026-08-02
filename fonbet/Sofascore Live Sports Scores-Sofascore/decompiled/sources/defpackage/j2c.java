package defpackage;

import androidx.media3.common.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class j2c extends mu2 {
    public final long j;

    public j2c(re4 re4Var, xe4 xe4Var, b bVar, int i, Object obj, long j, long j2, long j3) {
        super(re4Var, xe4Var, 1, bVar, i, obj, j, j2);
        bVar.getClass();
        this.j = j3;
    }

    public long a() {
        long j = this.j;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }

    public abstract boolean b();
}
