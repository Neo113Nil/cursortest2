package defpackage;

import android.content.SharedPreferences;
import com.inmobi.media.C3689q;
import com.inmobi.media.N2;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class prd implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ prd(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nlg V0;
        int i;
        int i2;
        Integer valueOf;
        int i3 = this.a;
        long j = this.b;
        switch (i3) {
            case 0:
                yma ymaVar = (yma) obj;
                ymaVar.getClass();
                ymaVar.a();
                List j2 = b.j(new r13(j), new r13(r13.h));
                wj2 wj2Var = ymaVar.a;
                ha5.g0(ymaVar, new v7b(j2, null, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (wj2Var.n() & 4294967295L))) & 4294967295L), (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (wj2Var.n() & 4294967295L)) * 0.8f) & 4294967295L)), 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                return Unit.a;
            case 1:
                ha5 ha5Var = (ha5) obj;
                ha5Var.getClass();
                ha5.g0(ha5Var, new v7b(b.j(new r13(j), new r13(j), new r13(r13.h)), null, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L))) & 4294967295L), (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (4294967295L & Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))), 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                return Unit.a;
            case 2:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                V0 = glgVar.V0("DELETE FROM player_of_the_match_vote_table WHERE eventTimestamp < ?");
                try {
                    V0.q(1, j);
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
            case 3:
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                V0 = glgVar2.V0("DELETE FROM saved_searches_table WHERE timestamp < ?");
                try {
                    V0.q(1, j);
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
            case 4:
                SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                editor.getClass();
                editor.putLong("PREF_USAGE_STREAK_LAST_TIMESTAMP", System.currentTimeMillis() / 1000);
                editor.putLong("PREF_USAGE_STREAK_DAYS", j + 1);
                return Unit.a;
            case 5:
                glg glgVar3 = (glg) obj;
                glgVar3.getClass();
                V0 = glgVar3.V0("DELETE FROM tv_channel_vote_table WHERE timestamp < ?");
                try {
                    V0.q(1, j);
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
            case 6:
                glg glgVar4 = (glg) obj;
                glgVar4.getClass();
                V0 = glgVar4.V0("DELETE FROM video_table WHERE timestamp < ?");
                try {
                    V0.q(1, j);
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
            case 7:
                glg glgVar5 = (glg) obj;
                glgVar5.getClass();
                V0 = glgVar5.V0("DELETE FROM vote_table WHERE eventTimestamp < ?");
                try {
                    V0.q(1, j);
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
            case 8:
                glg glgVar6 = (glg) obj;
                glgVar6.getClass();
                V0 = glgVar6.V0("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    V0.q(1, j);
                    int r = w1a.r(V0, "id");
                    int r2 = w1a.r(V0, "state");
                    int r3 = w1a.r(V0, "worker_class_name");
                    int r4 = w1a.r(V0, "input_merger_class_name");
                    int r5 = w1a.r(V0, "input");
                    int r6 = w1a.r(V0, "output");
                    int r7 = w1a.r(V0, "initial_delay");
                    int r8 = w1a.r(V0, "interval_duration");
                    int r9 = w1a.r(V0, "flex_duration");
                    int r10 = w1a.r(V0, "run_attempt_count");
                    int r11 = w1a.r(V0, "backoff_policy");
                    int r12 = w1a.r(V0, "backoff_delay_duration");
                    int r13 = w1a.r(V0, "last_enqueue_time");
                    int r14 = w1a.r(V0, "minimum_retention_duration");
                    int r15 = w1a.r(V0, "schedule_requested_at");
                    int r16 = w1a.r(V0, "run_in_foreground");
                    int r17 = w1a.r(V0, "out_of_quota_policy");
                    int r18 = w1a.r(V0, "period_count");
                    int r19 = w1a.r(V0, "generation");
                    int r20 = w1a.r(V0, "next_schedule_time_override");
                    int r21 = w1a.r(V0, "next_schedule_time_override_generation");
                    int r22 = w1a.r(V0, "stop_reason");
                    int r23 = w1a.r(V0, "trace_tag");
                    int r24 = w1a.r(V0, "backoff_on_system_interruptions");
                    int r25 = w1a.r(V0, "required_network_type");
                    int r26 = w1a.r(V0, "required_network_request");
                    int r27 = w1a.r(V0, "requires_charging");
                    int r28 = w1a.r(V0, "requires_device_idle");
                    int r29 = w1a.r(V0, "requires_battery_not_low");
                    int r30 = w1a.r(V0, "requires_storage_not_low");
                    int r31 = w1a.r(V0, "trigger_content_update_delay");
                    int r32 = w1a.r(V0, "trigger_max_content_delay");
                    int r33 = w1a.r(V0, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (V0.U0()) {
                        String F0 = V0.F0(r);
                        int i4 = r13;
                        int i5 = r14;
                        sbl E = sha.E((int) V0.getLong(r2));
                        String F02 = V0.F0(r3);
                        String F03 = V0.F0(r4);
                        byte[] blob = V0.getBlob(r5);
                        md4 md4Var = md4.b;
                        md4 y = ww9.y(blob);
                        md4 y2 = ww9.y(V0.getBlob(r6));
                        long j3 = V0.getLong(r7);
                        long j4 = V0.getLong(r8);
                        long j5 = V0.getLong(r9);
                        int i6 = (int) V0.getLong(r10);
                        int i7 = r2;
                        int i8 = r3;
                        zy0 B = sha.B((int) V0.getLong(r11));
                        long j6 = V0.getLong(r12);
                        long j7 = V0.getLong(i4);
                        long j8 = V0.getLong(i5);
                        int i9 = r;
                        int i10 = r15;
                        long j9 = V0.getLong(i10);
                        r15 = i10;
                        int i11 = r16;
                        boolean z = ((int) V0.getLong(i11)) != 0;
                        int i12 = r17;
                        int i13 = r4;
                        pwd D = sha.D((int) V0.getLong(i12));
                        int i14 = r18;
                        int i15 = r5;
                        int i16 = (int) V0.getLong(i14);
                        int i17 = r19;
                        int i18 = (int) V0.getLong(i17);
                        int i19 = r20;
                        long j10 = V0.getLong(i19);
                        int i20 = r21;
                        int i21 = (int) V0.getLong(i20);
                        int i22 = r22;
                        int i23 = (int) V0.getLong(i22);
                        int i24 = r23;
                        Boolean bool = null;
                        String F04 = V0.isNull(i24) ? null : V0.F0(i24);
                        int i25 = r24;
                        if (V0.isNull(i25)) {
                            i = i21;
                            i2 = i22;
                            valueOf = null;
                        } else {
                            i = i21;
                            i2 = i22;
                            valueOf = Integer.valueOf((int) V0.getLong(i25));
                        }
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        }
                        int i26 = r25;
                        Boolean bool2 = bool;
                        jbd C = sha.C((int) V0.getLong(i26));
                        int i27 = r26;
                        nad Y = sha.Y(V0.getBlob(i27));
                        r25 = i26;
                        r26 = i27;
                        int i28 = r27;
                        boolean z2 = ((int) V0.getLong(i28)) != 0;
                        r27 = i28;
                        int i29 = r28;
                        boolean z3 = ((int) V0.getLong(i29)) != 0;
                        int i30 = r29;
                        boolean z4 = ((int) V0.getLong(i30)) != 0;
                        r29 = i30;
                        int i31 = r30;
                        int i32 = r31;
                        int i33 = r32;
                        int i34 = r33;
                        arrayList.add(new lcl(F0, E, F02, F03, y, y2, j3, j4, j5, new zm3(Y, C, z2, z3, z4, ((int) V0.getLong(i31)) != 0, V0.getLong(i32), V0.getLong(i33), sha.o(V0.getBlob(i34))), i6, B, j6, j7, j8, j9, z, D, i16, i18, j10, i, i23, F04, bool2));
                        r30 = i31;
                        r4 = i13;
                        r17 = i12;
                        r19 = i17;
                        r22 = i2;
                        r24 = i25;
                        r33 = i34;
                        r31 = i32;
                        r32 = i33;
                        r2 = i7;
                        r = i9;
                        r13 = i4;
                        r3 = i8;
                        r14 = i5;
                        r16 = i11;
                        r20 = i19;
                        r21 = i20;
                        r23 = i24;
                        r28 = i29;
                        r5 = i15;
                        r18 = i14;
                    }
                    return arrayList;
                } catch (Throwable th) {
                    throw th;
                }
            case 9:
                yma ymaVar2 = (yma) obj;
                ymaVar2.getClass();
                ymaVar2.a();
                ha5.g0(ymaVar2, wxf.D(new Pair[]{new Pair(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new r13(j)), new Pair(Float.valueOf(1.0f), new r13(r13.h))}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.POSITIVE_INFINITY), 0L, ymaVar2.a.n(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                return Unit.a;
            default:
                return C3689q.a(j, (N2) obj);
        }
    }
}
