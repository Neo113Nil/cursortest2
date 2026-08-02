package defpackage;

import androidx.work.impl.WorkDatabase;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pbl {
    public final zbl a;
    public final g8f b;
    public final qcl c;

    static {
        rik.x("WMFgUpdater");
    }

    public pbl(WorkDatabase workDatabase, g8f g8fVar, zbl zblVar) {
        this.b = g8fVar;
        this.a = zblVar;
        this.c = workDatabase.g();
    }
}
