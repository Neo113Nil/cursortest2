package R2;

import Q2.InterfaceC1491b;
import androidx.room.w;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: R2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1528d extends w.b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1491b f9984a;

    public C1528d(InterfaceC1491b clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f9984a = clock;
    }

    @Override // androidx.room.w.b
    public void c(E2.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        super.c(db2);
        db2.v();
        try {
            db2.z(e());
            db2.a0();
        } finally {
            db2.l0();
        }
    }

    public final long d() {
        return this.f9984a.a() - I.f9952a;
    }

    public final String e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + d() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }
}
