package g5;

import g5.Y;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final class H extends J4.l<C6627B> {
    @Override // J4.l
    public final void bind(O4.f fVar, C6627B c6627b) {
        int i11;
        C6627B c6627b2 = c6627b;
        String str = c6627b2.f63799a;
        int i12 = 1;
        if (str == null) {
            fVar.C0(1);
        } else {
            fVar.e0(1, str);
        }
        fVar.m0(2, Y.h(c6627b2.f63800b));
        String str2 = c6627b2.f63801c;
        if (str2 == null) {
            fVar.C0(3);
        } else {
            fVar.e0(3, str2);
        }
        String str3 = c6627b2.f63802d;
        if (str3 == null) {
            fVar.C0(4);
        } else {
            fVar.e0(4, str3);
        }
        byte[] e11 = androidx.work.e.e(c6627b2.f63803e);
        if (e11 == null) {
            fVar.C0(5);
        } else {
            fVar.q0(5, e11);
        }
        byte[] e12 = androidx.work.e.e(c6627b2.f63804f);
        if (e12 == null) {
            fVar.C0(6);
        } else {
            fVar.q0(6, e12);
        }
        fVar.m0(7, c6627b2.f63805g);
        fVar.m0(8, c6627b2.f63806h);
        fVar.m0(9, c6627b2.f63807i);
        fVar.m0(10, c6627b2.f63809k);
        androidx.work.a backoffPolicy = c6627b2.f63810l;
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        int i13 = Y.a.f63846b[backoffPolicy.ordinal()];
        if (i13 == 1) {
            i11 = 0;
        } else {
            if (i13 != 2) {
                throw new Sc.o();
            }
            i11 = 1;
        }
        fVar.m0(11, i11);
        fVar.m0(12, c6627b2.f63811m);
        fVar.m0(13, c6627b2.f63812n);
        fVar.m0(14, c6627b2.f63813o);
        fVar.m0(15, c6627b2.f63814p);
        fVar.m0(16, c6627b2.f63815q ? 1L : 0L);
        androidx.work.s policy = c6627b2.f63816r;
        Intrinsics.checkNotNullParameter(policy, "policy");
        int i14 = Y.a.f63848d[policy.ordinal()];
        if (i14 == 1) {
            i12 = 0;
        } else if (i14 != 2) {
            throw new Sc.o();
        }
        fVar.m0(17, i12);
        fVar.m0(18, c6627b2.d());
        fVar.m0(19, c6627b2.c());
        androidx.work.d dVar = c6627b2.f63808j;
        if (dVar == null) {
            fVar.C0(20);
            fVar.C0(21);
            fVar.C0(22);
            fVar.C0(23);
            fVar.C0(24);
            fVar.C0(25);
            fVar.C0(26);
            fVar.C0(27);
            return;
        }
        fVar.m0(20, Y.f(dVar.d()));
        fVar.m0(21, dVar.g() ? 1L : 0L);
        fVar.m0(22, dVar.h() ? 1L : 0L);
        fVar.m0(23, dVar.f() ? 1L : 0L);
        fVar.m0(24, dVar.i() ? 1L : 0L);
        fVar.m0(25, dVar.b());
        fVar.m0(26, dVar.a());
        byte[] g10 = Y.g(dVar.c());
        if (g10 == null) {
            fVar.C0(27);
        } else {
            fVar.q0(27, g10);
        }
    }

    @Override // J4.A
    public final String createQuery() {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
