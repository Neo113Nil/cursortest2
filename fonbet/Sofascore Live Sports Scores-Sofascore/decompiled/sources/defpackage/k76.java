package defpackage;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class k76 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ k76(long j, long j2, int i) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nlg V0;
        int i = this.a;
        long j = this.c;
        long j2 = this.b;
        switch (i) {
            case 0:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                V0 = glgVar.V0("SELECT id FROM events_table WHERE startTimestamp >= ? AND ( (( status_type LIKE 'notstarted' )   AND (( startTimestamp - ? ) > 259200) AND ( ABS ( ? - lastUpdate ) > 86400)) OR (( status_type LIKE 'notstarted' )   AND (( startTimestamp - ? ) > 86400) AND (( startTimestamp - ? ) < 259200) AND ( ABS ( ? - lastUpdate ) > 43200)) OR (( status_type LIKE 'notstarted' )   AND (( startTimestamp - ? ) > 43200) AND (( startTimestamp - ? ) < 86400) AND ( ABS ( ? - lastUpdate ) > 3600)) OR (( status_type LIKE 'notstarted' )   AND (( startTimestamp - ? ) > 3600) AND (( startTimestamp - ? ) < 43200) AND ( ABS ( ? - lastUpdate ) > 900)) OR (( status_type LIKE 'notstarted' )   AND (( startTimestamp - ? ) > 900) AND (( startTimestamp - ? ) < 3600) AND ( ABS ( ? - lastUpdate ) > 180)) OR (( status_type LIKE 'notstarted' )   AND (( startTimestamp - ? ) > 0) AND (( startTimestamp - ? ) < 900) AND ( ABS ( ? - lastUpdate ) > 14)) OR (( status_type LIKE 'notstarted' )   AND (( ? - startTimestamp ) > 0) AND (( ? - startTimestamp ) < 900) AND ( ABS ( ? - lastUpdate ) > 14)) OR (( status_type LIKE 'notstarted' )   AND (( ? - startTimestamp ) > 900) AND (( ? - startTimestamp ) < 3600) AND ( ABS ( ? - lastUpdate ) > 180)) OR (( status_type LIKE 'notstarted' )   AND (( ? - startTimestamp ) > 3600) AND ( ABS ( ? - lastUpdate ) > 900)) OR (( status_type LIKE 'finished' )     AND (( ? - startTimestamp ) > 0) AND (( ? - startTimestamp ) < 86400) AND ( ABS ( ? - lastUpdate ) > 3600)) OR (( status_type LIKE 'finished' )     AND (( ? - startTimestamp ) > 86400) AND ( ABS ( ? - lastUpdate ) > 86400)) OR (( status_type LIKE 'inprogress' )   AND (( ? - lastUpdate ) > 14)) OR (( status_type LIKE 'delayed' )      AND (( ? - lastUpdate ) > 180)) OR (( status_type LIKE 'interrupted' )  AND (( ? - lastUpdate ) > 180)) OR (( status_type LIKE 'suspended' )    AND (( ? - lastUpdate ) > 180)) OR (( status_type LIKE 'canceled' )     AND (( ? - lastUpdate ) > 1800)) OR (( status_type LIKE 'willcontinue' ) AND (( ? - lastUpdate ) > 180)))");
                try {
                    V0.q(1, j2);
                    V0.q(2, j);
                    V0.q(3, j);
                    V0.q(4, j);
                    V0.q(5, j);
                    V0.q(6, j);
                    V0.q(7, j);
                    V0.q(8, j);
                    V0.q(9, j);
                    V0.q(10, j);
                    V0.q(11, j);
                    V0.q(12, j);
                    V0.q(13, j);
                    V0.q(14, j);
                    V0.q(15, j);
                    V0.q(16, j);
                    V0.q(17, j);
                    V0.q(18, j);
                    V0.q(19, j);
                    V0.q(20, j);
                    V0.q(21, j);
                    V0.q(22, j);
                    V0.q(23, j);
                    V0.q(24, j);
                    V0.q(25, j);
                    V0.q(26, j);
                    V0.q(27, j);
                    V0.q(28, j);
                    V0.q(29, j);
                    V0.q(30, j);
                    V0.q(31, j);
                    V0.q(32, j);
                    V0.q(33, j);
                    V0.q(34, j);
                    V0.q(35, j);
                    V0.q(36, j);
                    V0.q(37, j);
                    ArrayList arrayList = new ArrayList();
                    while (V0.U0()) {
                        arrayList.add(Integer.valueOf((int) V0.getLong(0)));
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                V0 = glgVar2.V0("SELECT id FROM my_stage_table WHERE startDateTimestamp >= ? AND isHidden = 0 AND ((( status_type LIKE 'notstarted' ) AND (( startDateTimestamp - ? ) > 259200) AND ( ABS ( ? - lastUpdate ) > 86400)) OR (( status_type LIKE 'notstarted' ) AND (( startDateTimestamp - ? ) > 86400) AND (( startDateTimestamp - ? ) < 259200) AND ( ABS ( ? - lastUpdate ) > 43200)) OR (( status_type LIKE 'notstarted' ) AND (( startDateTimestamp - ? ) > 43200) AND (( startDateTimestamp - ? ) < 86400) AND ( ABS ( ? - lastUpdate ) > 3600)) OR (( status_type LIKE 'notstarted' ) AND (( startDateTimestamp - ? ) > 3600) AND (( startDateTimestamp - ? ) < 43200) AND ( ABS ( ? - lastUpdate ) > 900)) OR (( status_type LIKE 'notstarted' ) AND (( startDateTimestamp - ? ) > 900) AND (( startDateTimestamp - ? ) < 3600) AND ( ABS ( ? - lastUpdate ) > 180)) OR (( status_type LIKE 'notstarted' ) AND (( startDateTimestamp - ? ) > 0) AND (( startDateTimestamp - ? ) < 900) AND ( ABS ( ? - lastUpdate ) > 14)) OR (( status_type LIKE 'notstarted' ) AND (( ? - startDateTimestamp ) > 0) AND (( ? - startDateTimestamp ) < 900) AND ( ABS ( ? - lastUpdate ) > 14)) OR (( status_type LIKE 'notstarted' ) AND (( ? - startDateTimestamp ) > 900) AND (( ? - startDateTimestamp ) < 3600) AND ( ABS ( ? - lastUpdate ) > 180)) OR (( status_type LIKE 'inprogress' ) AND ( ABS ( ? - lastUpdate ) > 14)) OR (( status_type LIKE 'delayed' ) AND ( ABS ( ? - lastUpdate ) > 180)) OR (( status_type LIKE 'interrupted' ) AND ( ABS ( ? - lastUpdate ) > 180)) OR (( status_type LIKE 'suspended' ) AND ( ABS ( ? - lastUpdate ) > 180)) OR (( status_type LIKE 'preliminary' ) AND ( ABS ( ? - lastUpdate ) > 900)) OR (( ABS ( ? - lastUpdate ) > 3600)) )");
                try {
                    V0.q(1, j2);
                    V0.q(2, j);
                    V0.q(3, j);
                    V0.q(4, j);
                    V0.q(5, j);
                    V0.q(6, j);
                    V0.q(7, j);
                    V0.q(8, j);
                    V0.q(9, j);
                    V0.q(10, j);
                    V0.q(11, j);
                    V0.q(12, j);
                    V0.q(13, j);
                    V0.q(14, j);
                    V0.q(15, j);
                    V0.q(16, j);
                    V0.q(17, j);
                    V0.q(18, j);
                    V0.q(19, j);
                    V0.q(20, j);
                    V0.q(21, j);
                    V0.q(22, j);
                    V0.q(23, j);
                    V0.q(24, j);
                    V0.q(25, j);
                    V0.q(26, j);
                    V0.q(27, j);
                    V0.q(28, j);
                    V0.q(29, j);
                    V0.q(30, j);
                    ArrayList arrayList2 = new ArrayList();
                    while (V0.U0()) {
                        arrayList2.add(Integer.valueOf((int) V0.getLong(0)));
                    }
                    return arrayList2;
                } finally {
                }
            case 2:
                ha5 ha5Var = (ha5) obj;
                ha5Var.getClass();
                ha5.U(ha5Var, this.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                ha5.U(ha5Var, this.c, (njh.e(ha5Var.n()) / 2.0f) - ha5Var.H0(1.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return Unit.a;
            case 3:
                ha5 ha5Var2 = (ha5) obj;
                ha5Var2.getClass();
                cga.v(ha5Var2, true, j2);
                cga.v(ha5Var2, false, j);
                return Unit.a;
            default:
                glg glgVar3 = (glg) obj;
                glgVar3.getClass();
                V0 = glgVar3.V0("SELECT COUNT(*) FROM vote_table WHERE eventTimestamp <= ? AND eventTimestamp >= ?");
                try {
                    V0.q(1, j2);
                    V0.q(2, j);
                    int i2 = V0.U0() ? (int) V0.getLong(0) : 0;
                    V0.close();
                    return Integer.valueOf(i2);
                } finally {
                }
        }
    }
}
