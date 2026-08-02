package m3;

import e3.f0;
import f3.x;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20303a;

    public /* synthetic */ b(int i5) {
        this.f20303a = i5;
    }

    @Override // f3.x
    public final void I(s2.c statement, Object obj) {
        int i5;
        int i10 = 1;
        switch (this.f20303a) {
            case 0:
                a entity = (a) obj;
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.B(1, entity.f20301a);
                statement.B(2, entity.f20302b);
                return;
            case 1:
                d entity2 = (d) obj;
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity2, "entity");
                statement.B(1, entity2.f20306a);
                statement.f(2, entity2.f20307b.longValue());
                return;
            case 2:
                g entity3 = (g) obj;
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity3, "entity");
                statement.B(1, entity3.f20313a);
                statement.f(2, entity3.f20314b);
                statement.f(3, entity3.f20315c);
                return;
            case 3:
                k entity4 = (k) obj;
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity4, "entity");
                statement.B(1, entity4.f20323a);
                statement.B(2, entity4.f20324b);
                return;
            case 4:
                o entity5 = (o) obj;
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity5, "entity");
                statement.B(1, entity5.f20331a);
                statement.f(2, rh.g.J(entity5.f20332b));
                statement.B(3, entity5.f20333c);
                statement.B(4, entity5.f20334d);
                e3.j jVar = e3.j.f8531b;
                statement.g(5, rh.g.L(entity5.f20335e));
                statement.g(6, rh.g.L(entity5.f20336f));
                statement.f(7, entity5.f20337g);
                statement.f(8, entity5.f20338h);
                statement.f(9, entity5.f20339i);
                statement.f(10, entity5.f20340k);
                e3.a backoffPolicy = entity5.f20341l;
                Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
                int i11 = v.$EnumSwitchMapping$1[backoffPolicy.ordinal()];
                if (i11 == 1) {
                    i5 = 0;
                } else {
                    if (i11 != 2) {
                        throw new gf.m();
                    }
                    i5 = 1;
                }
                statement.f(11, i5);
                statement.f(12, entity5.f20342m);
                statement.f(13, entity5.f20343n);
                statement.f(14, entity5.f20344o);
                statement.f(15, entity5.f20345p);
                statement.f(16, entity5.q ? 1L : 0L);
                f0 policy = entity5.f20346r;
                Intrinsics.checkNotNullParameter(policy, "policy");
                int i12 = v.$EnumSwitchMapping$3[policy.ordinal()];
                if (i12 == 1) {
                    i10 = 0;
                } else if (i12 != 2) {
                    throw new gf.m();
                }
                statement.f(17, i10);
                statement.f(18, entity5.f20347s);
                statement.f(19, entity5.f20348t);
                statement.f(20, entity5.f20349u);
                statement.f(21, entity5.f20350v);
                statement.f(22, entity5.f20351w);
                String str = entity5.f20352x;
                if (str == null) {
                    statement.h(23);
                } else {
                    statement.B(23, str);
                }
                Boolean bool = entity5.f20353y;
                if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
                    statement.h(24);
                } else {
                    statement.f(24, r0.intValue());
                }
                e3.f fVar = entity5.j;
                statement.f(25, rh.g.D(fVar.f8506a));
                statement.g(26, rh.g.m(fVar.f8507b));
                statement.f(27, fVar.f8508c ? 1L : 0L);
                statement.f(28, fVar.f8509d ? 1L : 0L);
                statement.f(29, fVar.f8510e ? 1L : 0L);
                statement.f(30, fVar.f8511f ? 1L : 0L);
                statement.f(31, fVar.f8512g);
                statement.f(32, fVar.f8513h);
                statement.g(33, rh.g.H(fVar.f8514i));
                return;
            default:
                t entity6 = (t) obj;
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity6, "entity");
                statement.B(1, entity6.f20363a);
                statement.B(2, entity6.f20364b);
                return;
        }
    }

    @Override // f3.x
    public final String Q() {
        switch (this.f20303a) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }
}
