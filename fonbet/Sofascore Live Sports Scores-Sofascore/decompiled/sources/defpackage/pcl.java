package defpackage;

import com.blaze.blazesdk.data_source.BlazeWidgetLabel;
import com.inmobi.media.AbstractC3294ai;
import com.inmobi.media.C3345ch;
import com.inmobi.media.N2;
import com.sofascore.model.mvvm.model.MissingPlayerData;
import com.sofascore.results.league.fragment.topStats.TopPlayerCategoryUiModel;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class pcl implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ pcl(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nlg V0;
        boolean z;
        nlg nlgVar;
        int i;
        int i2;
        Integer valueOf;
        Boolean bool;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                V0 = glgVar.V0("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    int i3 = V0.U0() ? (int) V0.getLong(0) : 0;
                    V0.close();
                    return Integer.valueOf(i3);
                } finally {
                }
            case 1:
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                V0 = glgVar2.V0("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    if (V0.U0()) {
                        z = ((int) V0.getLong(0)) != 0;
                    } else {
                        z = false;
                    }
                    V0.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 2:
                glg glgVar3 = (glg) obj;
                glgVar3.getClass();
                nlg V02 = glgVar3.V0("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
                try {
                    V02.q(1, 200L);
                    int r = w1a.r(V02, "id");
                    int r2 = w1a.r(V02, "state");
                    int r3 = w1a.r(V02, "worker_class_name");
                    int r4 = w1a.r(V02, "input_merger_class_name");
                    int r5 = w1a.r(V02, "input");
                    int r6 = w1a.r(V02, "output");
                    int r7 = w1a.r(V02, "initial_delay");
                    int r8 = w1a.r(V02, "interval_duration");
                    int r9 = w1a.r(V02, "flex_duration");
                    int r10 = w1a.r(V02, "run_attempt_count");
                    int r11 = w1a.r(V02, "backoff_policy");
                    int r12 = w1a.r(V02, "backoff_delay_duration");
                    int r13 = w1a.r(V02, "last_enqueue_time");
                    int r14 = w1a.r(V02, "minimum_retention_duration");
                    int r15 = w1a.r(V02, "schedule_requested_at");
                    int r16 = w1a.r(V02, "run_in_foreground");
                    int r17 = w1a.r(V02, "out_of_quota_policy");
                    int r18 = w1a.r(V02, "period_count");
                    int r19 = w1a.r(V02, "generation");
                    int r20 = w1a.r(V02, "next_schedule_time_override");
                    int r21 = w1a.r(V02, "next_schedule_time_override_generation");
                    int r22 = w1a.r(V02, "stop_reason");
                    int r23 = w1a.r(V02, "trace_tag");
                    int r24 = w1a.r(V02, "backoff_on_system_interruptions");
                    int r25 = w1a.r(V02, "required_network_type");
                    int r26 = w1a.r(V02, "required_network_request");
                    int r27 = w1a.r(V02, "requires_charging");
                    int r28 = w1a.r(V02, "requires_device_idle");
                    int r29 = w1a.r(V02, "requires_battery_not_low");
                    int r30 = w1a.r(V02, "requires_storage_not_low");
                    int r31 = w1a.r(V02, "trigger_content_update_delay");
                    int r32 = w1a.r(V02, "trigger_max_content_delay");
                    int r33 = w1a.r(V02, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (V02.U0()) {
                        String F0 = V02.F0(r);
                        int i4 = r14;
                        ArrayList arrayList2 = arrayList;
                        sbl E = sha.E((int) V02.getLong(r2));
                        String F02 = V02.F0(r3);
                        String F03 = V02.F0(r4);
                        byte[] blob = V02.getBlob(r5);
                        md4 md4Var = md4.b;
                        md4 y = ww9.y(blob);
                        md4 y2 = ww9.y(V02.getBlob(r6));
                        long j = V02.getLong(r7);
                        long j2 = V02.getLong(r8);
                        long j3 = V02.getLong(r9);
                        int i5 = (int) V02.getLong(r10);
                        zy0 B = sha.B((int) V02.getLong(r11));
                        long j4 = V02.getLong(r12);
                        long j5 = V02.getLong(r13);
                        long j6 = V02.getLong(i4);
                        int i6 = r15;
                        long j7 = V02.getLong(i6);
                        int i7 = r;
                        int i8 = r13;
                        int i9 = r16;
                        int i10 = r2;
                        boolean z3 = ((int) V02.getLong(i9)) != 0;
                        int i11 = r17;
                        pwd D = sha.D((int) V02.getLong(i11));
                        int i12 = r18;
                        int i13 = (int) V02.getLong(i12);
                        int i14 = r19;
                        int i15 = (int) V02.getLong(i14);
                        int i16 = r20;
                        long j8 = V02.getLong(i16);
                        int i17 = r21;
                        int i18 = (int) V02.getLong(i17);
                        int i19 = r22;
                        int i20 = (int) V02.getLong(i19);
                        int i21 = r23;
                        String F04 = V02.isNull(i21) ? null : V02.F0(i21);
                        int i22 = r24;
                        if (V02.isNull(i22)) {
                            i = i18;
                            i2 = i19;
                            valueOf = null;
                        } else {
                            i = i18;
                            i2 = i19;
                            valueOf = Integer.valueOf((int) V02.getLong(i22));
                        }
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        int i23 = r25;
                        jbd C = sha.C((int) V02.getLong(i23));
                        int i24 = r26;
                        nad Y = sha.Y(V02.getBlob(i24));
                        r25 = i23;
                        r26 = i24;
                        int i25 = r27;
                        boolean z4 = ((int) V02.getLong(i25)) != 0;
                        r27 = i25;
                        int i26 = r28;
                        boolean z5 = ((int) V02.getLong(i26)) != 0;
                        int i27 = r29;
                        boolean z6 = ((int) V02.getLong(i27)) != 0;
                        r29 = i27;
                        int i28 = r30;
                        int i29 = r31;
                        int i30 = r32;
                        int i31 = r33;
                        r33 = i31;
                        nlgVar = V02;
                        try {
                            arrayList2.add(new lcl(F0, E, F02, F03, y, y2, j, j2, j3, new zm3(Y, C, z4, z5, z6, ((int) V02.getLong(i28)) != 0, V02.getLong(i29), V02.getLong(i30), sha.o(V02.getBlob(i31))), i5, B, j4, j5, j6, j7, z3, D, i13, i15, j8, i, i20, F04, bool));
                            arrayList = arrayList2;
                            V02 = nlgVar;
                            r31 = i29;
                            r2 = i10;
                            r16 = i9;
                            r20 = i16;
                            r21 = i17;
                            r23 = i21;
                            r28 = i26;
                            r30 = i28;
                            r14 = i4;
                            r17 = i11;
                            r19 = i14;
                            r22 = i2;
                            r24 = i22;
                            r = i7;
                            r32 = i30;
                            r15 = i6;
                            r13 = i8;
                            r18 = i12;
                        } catch (Throwable th) {
                            th = th;
                            nlgVar.close();
                            throw th;
                        }
                    }
                    nlg nlgVar2 = V02;
                    ArrayList arrayList3 = arrayList;
                    nlgVar2.close();
                    return arrayList3;
                } catch (Throwable th2) {
                    th = th2;
                    nlgVar = V02;
                }
            case 3:
                glg glgVar4 = (glg) obj;
                glgVar4.getClass();
                V0 = glgVar4.V0("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    V0.U0();
                    int y3 = u0a.y(glgVar4);
                    V0.close();
                    return Integer.valueOf(y3);
                } finally {
                }
            case 4:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                gv9 gv9Var = (gv9) entry.getValue();
                if (gv9Var == null || !gv9Var.isEmpty()) {
                    Iterator<E> it = gv9Var.iterator();
                    while (it.hasNext()) {
                        if (((xel) it.next()).a.c()) {
                            return Boolean.valueOf(z2);
                        }
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            case 5:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                gv9 gv9Var2 = (gv9) entry2.getValue();
                if (gv9Var2 == null || !gv9Var2.isEmpty()) {
                    Iterator<E> it2 = gv9Var2.iterator();
                    while (it2.hasNext()) {
                        if (((xel) it2.next()).a.d()) {
                            return Boolean.valueOf(z2);
                        }
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            case 6:
                afl aflVar = (afl) obj;
                aflVar.getClass();
                return Integer.valueOf(aflVar.a);
            case 7:
                zil zilVar = (zil) obj;
                zilVar.getClass();
                return Integer.valueOf(zilVar.a);
            case 8:
                return Unit.a;
            case 9:
                ((r60) obj).getClass();
                return l98.l0(uo5.e(s02.h0(500, 0, null, 6), 2), uo5.f(s02.h0(500, 0, null, 6), 2));
            case 10:
                TopPlayerCategoryUiModel topPlayerCategoryUiModel = (TopPlayerCategoryUiModel) obj;
                topPlayerCategoryUiModel.getClass();
                return topPlayerCategoryUiModel.a;
            case 11:
                vnb vnbVar = (vnb) obj;
                vnbVar.getClass();
                return vnbVar.getClass().getName();
            case 12:
                ((r60) obj).getClass();
                return l98.l0(uo5.e(s02.h0(200, 0, null, 6), 2), uo5.f(s02.h0(200, 0, null, 6), 2));
            case 13:
                gv9 gv9Var3 = (gv9) obj;
                if (gv9Var3 != null && !gv9Var3.isEmpty()) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 14:
                ((Float) obj).getClass();
                return Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            case 15:
                hjl hjlVar = (hjl) obj;
                hjlVar.getClass();
                return Integer.valueOf(hjlVar.a);
            case 16:
                r5c r5cVar = (r5c) obj;
                r5cVar.getClass();
                return Integer.valueOf(r5cVar.a.getId());
            case 17:
                MissingPlayerData missingPlayerData = (MissingPlayerData) obj;
                String C2 = tba.C(missingPlayerData.getPlayer());
                return C2 != null ? C2 : tba.t(missingPlayerData.getPlayer());
            case 18:
                MissingPlayerData missingPlayerData2 = (MissingPlayerData) obj;
                String C3 = tba.C(missingPlayerData2.getPlayer());
                return C3 != null ? C3 : tba.t(missingPlayerData2.getPlayer());
            case 19:
                ha5 ha5Var = (ha5) obj;
                ha5Var.getClass();
                float H0 = ha5Var.H0(12.0f);
                b20 a = e20.a();
                float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.n() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) + H0;
                float H02 = ha5Var.H0(32.0f);
                float H03 = ha5Var.H0(32.0f);
                b20.c(a, new e7g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat, intBitsToFloat2, (Float.floatToRawIntBits(H02) << 32) | (Float.floatToRawIntBits(H02) & 4294967295L), (Float.floatToRawIntBits(H03) << 32) | (Float.floatToRawIntBits(H03) & 4294967295L), 0L, 0L));
                ha5.X0(ha5Var, a, r13.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new jii(H0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30), 52);
                return Unit.a;
            case 20:
                ((pol) obj).getClass();
                return Boolean.TRUE;
            case 21:
                return null;
            case 22:
                BlazeWidgetLabel blazeWidgetLabel = (BlazeWidgetLabel) obj;
                blazeWidgetLabel.getClass();
                return blazeWidgetLabel.getStringLabelExpression();
            case 23:
                return AbstractC3294ai.a((N2) obj);
            case 24:
                hbm hbmVar = (hbm) obj;
                hbmVar.getClass();
                return hbmVar.a();
            case 25:
                return Boolean.valueOf(C3345ch.a((String) obj));
            case 26:
                return Boolean.valueOf(C3345ch.b((String) obj));
            case 27:
                hbm hbmVar2 = (hbm) obj;
                hbmVar2.getClass();
                return hbmVar2.a();
            case 28:
                v7m v7mVar = (v7m) obj;
                int i32 = s4m.b;
                v7mVar.getClass();
                return String.valueOf(v7mVar.a.a.j);
            default:
                Map.Entry entry3 = (Map.Entry) obj;
                return ((String) entry3.getKey()) + ':' + ((String) entry3.getValue());
        }
    }
}
