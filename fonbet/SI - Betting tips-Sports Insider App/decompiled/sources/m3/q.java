package m3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f20358b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f20359c;

    public /* synthetic */ q(s sVar, o oVar, int i5) {
        this.f20357a = i5;
        this.f20358b = sVar;
        this.f20359c = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20357a) {
            case 0:
                s2.a _connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                this.f20358b.f20361b.g0(_connection, this.f20359c);
                return Unit.f19194a;
            default:
                o oVar = this.f20359c;
                s2.a connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(connection, "_connection");
                r rVar = this.f20358b.f20362c;
                Intrinsics.checkNotNullParameter(connection, "connection");
                s2.c r02 = connection.r0("UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?");
                try {
                    rVar.a(r02, oVar);
                    r02.n0();
                    u6.h.g(r02, null);
                    io.sentry.config.a.q(connection);
                    return Unit.f19194a;
                } finally {
                }
        }
    }
}
