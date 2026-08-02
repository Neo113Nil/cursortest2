package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class uei {
    public final cy2[] a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    static {
        new uei(new cy2[0]);
    }

    public uei(cy2[] cy2VarArr) {
        this.a = cy2VarArr;
    }

    public final void a(long j) {
        for (cy2 cy2Var : this.a) {
            cy2Var.g(j);
        }
    }
}
