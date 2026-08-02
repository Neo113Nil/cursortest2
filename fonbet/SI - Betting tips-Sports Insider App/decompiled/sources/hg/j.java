package hg;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f10702b;

    public /* synthetic */ j(long j, int i5) {
        this.f10701a = i5;
        this.f10702b = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer valueOf;
        Boolean bool;
        int i5 = this.f10701a;
        long j = this.f10702b;
        switch (i5) {
            case 0:
                return Long.valueOf(j);
            case 1:
                s2.a _connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                s2.c r02 = _connection.r0("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    r02.f(1, j);
                    int r5 = k2.x.r(r02, "id");
                    int r6 = k2.x.r(r02, "state");
                    int r10 = k2.x.r(r02, "worker_class_name");
                    int r11 = k2.x.r(r02, "input_merger_class_name");
                    int r12 = k2.x.r(r02, "input");
                    int r13 = k2.x.r(r02, "output");
                    int r14 = k2.x.r(r02, "initial_delay");
                    int r15 = k2.x.r(r02, "interval_duration");
                    int r16 = k2.x.r(r02, "flex_duration");
                    int r17 = k2.x.r(r02, "run_attempt_count");
                    int r18 = k2.x.r(r02, "backoff_policy");
                    int r19 = k2.x.r(r02, "backoff_delay_duration");
                    int r20 = k2.x.r(r02, "last_enqueue_time");
                    int r21 = k2.x.r(r02, "minimum_retention_duration");
                    int r22 = k2.x.r(r02, "schedule_requested_at");
                    int r23 = k2.x.r(r02, "run_in_foreground");
                    int r24 = k2.x.r(r02, "out_of_quota_policy");
                    int r25 = k2.x.r(r02, "period_count");
                    int r26 = k2.x.r(r02, "generation");
                    int r27 = k2.x.r(r02, "next_schedule_time_override");
                    int r28 = k2.x.r(r02, "next_schedule_time_override_generation");
                    int r29 = k2.x.r(r02, "stop_reason");
                    int r30 = k2.x.r(r02, "trace_tag");
                    int r31 = k2.x.r(r02, "backoff_on_system_interruptions");
                    int r32 = k2.x.r(r02, "required_network_type");
                    int r33 = k2.x.r(r02, "required_network_request");
                    int r34 = k2.x.r(r02, "requires_charging");
                    int r35 = k2.x.r(r02, "requires_device_idle");
                    int r36 = k2.x.r(r02, "requires_battery_not_low");
                    int r37 = k2.x.r(r02, "requires_storage_not_low");
                    int r38 = k2.x.r(r02, "trigger_content_update_delay");
                    int r39 = k2.x.r(r02, "trigger_max_content_delay");
                    int r40 = k2.x.r(r02, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (r02.n0()) {
                        String V = r02.V(r5);
                        ArrayList arrayList2 = arrayList;
                        int i10 = r21;
                        e3.i0 A = rh.g.A((int) r02.getLong(r6));
                        String V2 = r02.V(r10);
                        String V3 = r02.V(r11);
                        byte[] blob = r02.getBlob(r12);
                        e3.j jVar = e3.j.f8531b;
                        e3.j k6 = rh.g.k(blob);
                        e3.j k9 = rh.g.k(r02.getBlob(r13));
                        long j6 = r02.getLong(r14);
                        long j10 = r02.getLong(r15);
                        long j11 = r02.getLong(r16);
                        int i11 = (int) r02.getLong(r17);
                        e3.a v5 = rh.g.v((int) r02.getLong(r18));
                        long j12 = r02.getLong(r19);
                        long j13 = r02.getLong(r20);
                        long j14 = r02.getLong(i10);
                        int i12 = r22;
                        long j15 = r02.getLong(i12);
                        int i13 = r20;
                        int i14 = r23;
                        boolean z5 = ((int) r02.getLong(i14)) != 0;
                        int i15 = r24;
                        int i16 = r5;
                        e3.f0 z7 = rh.g.z((int) r02.getLong(i15));
                        int i17 = r25;
                        int i18 = (int) r02.getLong(i17);
                        int i19 = r26;
                        int i20 = (int) r02.getLong(i19);
                        int i21 = r27;
                        long j16 = r02.getLong(i21);
                        int i22 = r28;
                        int i23 = (int) r02.getLong(i22);
                        r28 = i22;
                        int i24 = r29;
                        int i25 = (int) r02.getLong(i24);
                        int i26 = r30;
                        String V4 = r02.isNull(i26) ? null : r02.V(i26);
                        int i27 = r31;
                        if (r02.isNull(i27)) {
                            r30 = i26;
                            r29 = i24;
                            valueOf = null;
                        } else {
                            r30 = i26;
                            r29 = i24;
                            valueOf = Integer.valueOf((int) r02.getLong(i27));
                        }
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        int i28 = r32;
                        e3.y y5 = rh.g.y((int) r02.getLong(i28));
                        int i29 = r33;
                        n3.i N = rh.g.N(r02.getBlob(i29));
                        int i30 = r34;
                        boolean z10 = ((int) r02.getLong(i30)) != 0;
                        int i31 = r35;
                        boolean z11 = ((int) r02.getLong(i31)) != 0;
                        int i32 = r36;
                        boolean z12 = ((int) r02.getLong(i32)) != 0;
                        r36 = i32;
                        int i33 = r37;
                        int i34 = r38;
                        int i35 = r39;
                        r38 = i34;
                        int i36 = r40;
                        m3.o oVar = new m3.o(V, A, V2, V3, k6, k9, j6, j10, j11, new e3.f(N, y5, z10, z11, z12, ((int) r02.getLong(i33)) != 0, r02.getLong(i34), r02.getLong(i35), rh.g.b(r02.getBlob(i36))), i11, v5, j12, j13, j14, j15, z5, z7, i18, i20, j16, i23, i25, V4, bool);
                        r40 = i36;
                        r39 = i35;
                        arrayList = arrayList2;
                        arrayList.add(oVar);
                        r35 = i31;
                        r5 = i16;
                        r24 = i15;
                        r25 = i17;
                        r26 = i19;
                        r27 = i21;
                        r31 = i27;
                        r32 = i28;
                        r33 = i29;
                        r34 = i30;
                        r37 = i33;
                        r20 = i13;
                        r22 = i12;
                        r21 = i10;
                        r23 = i14;
                    }
                    r02.close();
                    return arrayList;
                } catch (Throwable th2) {
                    r02.close();
                    throw th2;
                }
            default:
                ((g1.a) obj).e(y8.g.f25731b, Long.valueOf(j));
                return null;
        }
    }
}
