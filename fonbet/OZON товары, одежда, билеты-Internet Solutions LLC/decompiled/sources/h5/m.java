package h5;

import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase;
import g5.C6632e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final WorkDatabase f64982a;

    public m(@NonNull WorkDatabase workDatabase) {
        this.f64982a = workDatabase;
    }

    public final long a() {
        Long b11 = this.f64982a.b().b("last_force_stop_ms");
        if (b11 != null) {
            return b11.longValue();
        }
        return 0L;
    }

    public final boolean b() {
        Long b11 = this.f64982a.b().b("reschedule_needed");
        return b11 != null && b11.longValue() == 1;
    }

    public final void c(long j11) {
        this.f64982a.b().a(new C6632e("last_force_stop_ms", Long.valueOf(j11)));
    }

    public final void d() {
        Intrinsics.checkNotNullParameter("reschedule_needed", "key");
        this.f64982a.b().a(new C6632e("reschedule_needed", 0L));
    }
}
