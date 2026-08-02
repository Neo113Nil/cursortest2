package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import com.sofascore.model.mvvm.model.StageIds;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class yz implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ yz(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        lj2 lj2Var;
        Object u2gVar;
        int i = this.a;
        boolean z = false;
        z = false;
        long j = this.b;
        switch (i) {
            case 0:
                te2 te2Var = (te2) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (te2Var.a.n() >> 32)) / 2.0f;
                return te2Var.b(new zz(intBitsToFloat, fcp.e0(te2Var, intBitsToFloat), new ay1(j, 5), z ? 1 : 0));
            case 1:
                yma ymaVar = (yma) obj;
                ymaVar.getClass();
                ymaVar.a();
                ha5.o0(ymaVar, this.b, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ymaVar.a.n() >> 32))) << 32) | (Float.floatToRawIntBits(ymaVar.H0(1.0f)) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 120);
                return Unit.a;
            case 2:
                yma ymaVar2 = (yma) obj;
                ymaVar2.getClass();
                ymaVar2.a();
                float H0 = ymaVar2.H0(1.0f);
                wj2 wj2Var = ymaVar2.a;
                ha5.o0(ymaVar2, this.b, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (wj2Var.n() & 4294967295L)) - H0) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (wj2Var.n() >> 32))) << 32) | (Float.floatToRawIntBits(H0) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 120);
                return Unit.a;
            case 3:
                yma ymaVar3 = (yma) obj;
                ymaVar3.getClass();
                ymaVar3.a();
                float H02 = ymaVar3.H0(2.0f);
                wj2 wj2Var2 = ymaVar3.a;
                long j2 = this.b;
                ha5.o0(ymaVar3, j2, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (Float.floatToRawIntBits(H02) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (wj2Var2.n() & 4294967295L))) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 120);
                ha5.o0(ymaVar3, j2, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (wj2Var2.n() >> 32)) - H02) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (wj2Var2.n() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(H02) << 32), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 120);
                return Unit.a;
            case 4:
                te2 te2Var2 = (te2) obj;
                te2Var2.getClass();
                float j3 = te2Var2.j() * 2.0f;
                float j4 = te2Var2.j() * 16.0f;
                float f = j3 / 2.0f;
                b20 a = e20.a();
                Path path = a.a;
                a.g(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                a.f(f, (Float.intBitsToFloat((int) (te2Var2.a.n() & 4294967295L)) - f) - j4);
                float f2 = 2.0f * j4;
                float intBitsToFloat2 = (Float.intBitsToFloat((int) (te2Var2.a.n() & 4294967295L)) - f) - f2;
                float f3 = f + f2;
                float intBitsToFloat3 = Float.intBitsToFloat((int) (te2Var2.a.n() & 4294967295L)) - f;
                RectF rectF = a.b;
                if (rectF == null) {
                    rectF = new RectF();
                    a.b = rectF;
                }
                rectF.set(f, intBitsToFloat2, f3, intBitsToFloat3);
                RectF rectF2 = a.b;
                rectF2.getClass();
                path.arcTo(rectF2, 180.0f, -90.0f, false);
                a.f((Float.intBitsToFloat((int) (te2Var2.a.n() >> 32)) - f) - j4, Float.intBitsToFloat((int) (te2Var2.a.n() & 4294967295L)) - f);
                float intBitsToFloat4 = (Float.intBitsToFloat((int) (te2Var2.a.n() >> 32)) - f) - f2;
                float intBitsToFloat5 = (Float.intBitsToFloat((int) (te2Var2.a.n() & 4294967295L)) - f) - f2;
                float intBitsToFloat6 = Float.intBitsToFloat((int) (te2Var2.a.n() >> 32)) - f;
                float intBitsToFloat7 = Float.intBitsToFloat((int) (te2Var2.a.n() & 4294967295L)) - f;
                RectF rectF3 = a.b;
                if (rectF3 == null) {
                    rectF3 = new RectF();
                    a.b = rectF3;
                }
                rectF3.set(intBitsToFloat4, intBitsToFloat5, intBitsToFloat6, intBitsToFloat7);
                RectF rectF4 = a.b;
                rectF4.getClass();
                path.arcTo(rectF4, 90.0f, -90.0f, false);
                a.f(Float.intBitsToFloat((int) (te2Var2.a.n() >> 32)) - f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return te2Var2.b(new pz1(a, this.b, new jii(j3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30), 0));
            case 5:
                k52 k52Var = (k52) obj;
                Function1 function1 = k52Var.b;
                if (function1 != null && (lj2Var = k52Var.a) != null) {
                    try {
                        p2g p2gVar = w2g.b;
                        u2gVar = function1.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        p2g p2gVar2 = w2g.b;
                        u2gVar = new u2g(th);
                    }
                    lj2Var.resumeWith(u2gVar);
                }
                return Unit.a;
            case 6:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                nlg V0 = glgVar.V0("DELETE FROM buzzer_table WHERE timestamp < ?");
                try {
                    V0.q(1, j);
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
            case 7:
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                nlg V02 = glgVar2.V0("DELETE FROM chat_message_table WHERE voteTimestamp < ? AND reportTimestamp < ?");
                try {
                    V02.q(1, j);
                    V02.q(2, j);
                    V02.U0();
                    V02.close();
                    return Unit.a;
                } finally {
                }
            case 8:
                eu2 eu2Var = (eu2) obj;
                eu2Var.getClass();
                long j5 = eu2Var.c;
                if (j <= eu2Var.d && j5 <= j) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                long j6 = this.b;
                ha5 ha5Var = (ha5) obj;
                ha5Var.getClass();
                float H03 = ha5Var.H0(6.0f);
                ((hpo) ha5Var.L0().a).y(H03, H03, H03, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                try {
                    ha5.o0(ha5Var, j6, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                    hpo hpoVar = (hpo) ha5Var.L0().a;
                    float f4 = -H03;
                    hpoVar.y(f4, f4, f4, -0.0f);
                    return Unit.a;
                } catch (Throwable th2) {
                    float f5 = -H03;
                    ((hpo) ha5Var.L0().a).y(f5, f5, f5, -0.0f);
                    throw th2;
                }
            case 10:
                ((b4h) obj).a(f3h.a, new e3h(k69.a, this.b, d3h.b, true));
                return Unit.a;
            case 11:
                glg glgVar3 = (glg) obj;
                glgVar3.getClass();
                nlg V03 = glgVar3.V0("DELETE FROM crowdscourcing_scorer_table WHERE eventTimestamp < ?");
                try {
                    V03.q(1, j);
                    V03.U0();
                    V03.close();
                    return Unit.a;
                } finally {
                }
            case 12:
                glg glgVar4 = (glg) obj;
                glgVar4.getClass();
                nlg V04 = glgVar4.V0("DELETE FROM events_table WHERE startTimestamp > ? AND ( EXISTS ( SELECT * FROM leagues WHERE leagues.id = events_table.uniqueTournamentId ) OR EXISTS ( SELECT * FROM my_teams, teams WHERE teams.id = my_teams.teamId AND (teams.id = events_table.homeTeamId OR my_teams.teamId = events_table.awayTeamId OR my_teams.teamId = events_table.homeSubTeam1Id OR my_teams.teamId = events_table.awaySubTeam1Id OR my_teams.teamId = events_table.homeSubTeam2Id OR my_teams.teamId = events_table.awaySubTeam2Id)))");
                try {
                    V04.q(1, j);
                    V04.U0();
                    V04.close();
                    return Unit.a;
                } finally {
                }
            case 13:
                glg glgVar5 = (glg) obj;
                glgVar5.getClass();
                nlg V05 = glgVar5.V0("UPDATE events_table SET hide = 1 WHERE status_type LIKE 'finished' OR (status_type LIKE 'canceled' AND startTimestamp < ?) OR (status_type LIKE 'postponed' AND startTimestamp < ?) OR (status_type LIKE 'suspended' AND startTimestamp < ?) ");
                try {
                    V05.q(1, j);
                    V05.q(2, j);
                    V05.q(3, j);
                    V05.U0();
                    V05.close();
                    return Unit.a;
                } finally {
                }
            case 14:
                glg glgVar6 = (glg) obj;
                glgVar6.getClass();
                nlg V06 = glgVar6.V0("SELECT id FROM events_table WHERE startTimestamp >= ? AND ( hide = 0 ) OR status_type LIKE 'willcontinue' OR status_type LIKE 'inprogress'ORDER BY startTimestamp ASC");
                try {
                    V06.q(1, j);
                    ArrayList arrayList = new ArrayList();
                    while (V06.U0()) {
                        arrayList.add(Integer.valueOf((int) V06.getLong(0)));
                    }
                    return arrayList;
                } finally {
                }
            case 15:
                glg glgVar7 = (glg) obj;
                glgVar7.getClass();
                nlg V07 = glgVar7.V0("SELECT id FROM events_table WHERE startTimestamp >= ? AND mute = 1");
                try {
                    V07.q(1, j);
                    ArrayList arrayList2 = new ArrayList();
                    while (V07.U0()) {
                        arrayList2.add(Integer.valueOf((int) V07.getLong(0)));
                    }
                    return arrayList2;
                } finally {
                }
            case 16:
                glg glgVar8 = (glg) obj;
                glgVar8.getClass();
                nlg V08 = glgVar8.V0("UPDATE my_stage_table SET isHidden = 1 WHERE status_type LIKE 'finished' OR ( status_type LIKE 'canceled' AND startDateTimestamp < ? ) OR ( status_type LIKE 'postponed' AND startDateTimestamp < ? ) OR ( status_type LIKE 'suspended' AND startDateTimestamp < ? ) ");
                try {
                    V08.q(1, j);
                    V08.q(2, j);
                    V08.q(3, j);
                    V08.U0();
                    V08.close();
                    return Unit.a;
                } finally {
                }
            case 17:
                glg glgVar9 = (glg) obj;
                glgVar9.getClass();
                nlg V09 = glgVar9.V0("SELECT id FROM my_stage_table WHERE startDateTimestamp >= ? AND isMuted = 1");
                try {
                    V09.q(1, j);
                    ArrayList arrayList3 = new ArrayList();
                    while (V09.U0()) {
                        arrayList3.add(Integer.valueOf((int) V09.getLong(0)));
                    }
                    return arrayList3;
                } finally {
                }
            case 18:
                glg glgVar10 = (glg) obj;
                glgVar10.getClass();
                nlg V010 = glgVar10.V0("DELETE FROM my_stage_table WHERE startDateTimestamp < ?");
                try {
                    V010.q(1, j);
                    V010.U0();
                    V010.close();
                    return Unit.a;
                } finally {
                }
            case 19:
                glg glgVar11 = (glg) obj;
                glgVar11.getClass();
                nlg V011 = glgVar11.V0("DELETE FROM events_table WHERE startTimestamp < ?");
                try {
                    V011.q(1, j);
                    V011.U0();
                    V011.close();
                    return Unit.a;
                } finally {
                }
            case 20:
                glg glgVar12 = (glg) obj;
                glgVar12.getClass();
                nlg V012 = glgVar12.V0("SELECT id, parent_event_id, stage_season_unique_stage_id FROM my_stage_table WHERE startDateTimestamp >= ? AND isHidden = 0 AND NOT EXISTS(SELECT 1 FROM my_unique_stage WHERE my_unique_stage.id == my_stage_table.stage_season_unique_stage_id)");
                try {
                    V012.q(1, j);
                    ArrayList arrayList4 = new ArrayList();
                    while (V012.U0()) {
                        arrayList4.add(new StageIds((int) V012.getLong(0), V012.isNull(1) ? null : Integer.valueOf((int) V012.getLong(1)), V012.isNull(2) ? null : Integer.valueOf((int) V012.getLong(2)), null));
                    }
                    return arrayList4;
                } finally {
                }
            case 21:
                glg glgVar13 = (glg) obj;
                glgVar13.getClass();
                nlg V013 = glgVar13.V0("\n        SELECT CASE WHEN (\n            EXISTS(SELECT 1 FROM events_table WHERE startTimestamp >= ? AND mute <> -1)\n            OR EXISTS(SELECT 1 FROM my_teams)\n            OR EXISTS(SELECT 1 FROM my_leagues)\n            OR EXISTS(SELECT 1 FROM my_players)\n            OR EXISTS(SELECT 1 FROM my_stage_table WHERE startDateTimestamp >= ? AND isHidden = 0)\n            OR EXISTS(SELECT 1 FROM my_unique_stage)\n        ) THEN 1 ELSE 0 END\n    ");
                try {
                    V013.q(1, j);
                    V013.q(2, j);
                    int i2 = V013.U0() ? (int) V013.getLong(0) : 0;
                    V013.close();
                    return Integer.valueOf(i2);
                } finally {
                }
            case 22:
                glg glgVar14 = (glg) obj;
                glgVar14.getClass();
                nlg V014 = glgVar14.V0("SELECT id FROM events_table WHERE startTimestamp >= ? AND mute <> -1");
                try {
                    V014.q(1, j);
                    ArrayList arrayList5 = new ArrayList();
                    while (V014.U0()) {
                        arrayList5.add(Integer.valueOf((int) V014.getLong(0)));
                    }
                    return arrayList5;
                } finally {
                }
            case 23:
                ha5 ha5Var2 = (ha5) obj;
                ha5Var2.getClass();
                float H04 = ha5Var2.H0(1.0f);
                long j7 = this.b;
                ha5.o0(ha5Var2, j7, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var2.n() >> 32))) << 32) | (Float.floatToRawIntBits(H04) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 120);
                ha5.o0(ha5Var2, j7, (Float.floatToRawIntBits(ha5Var2.getLayoutDirection() == ema.b ? Float.intBitsToFloat((int) (ha5Var2.n() >> 32)) - H04 : 0.0f) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(H04) << 32), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 120);
                return Unit.a;
            case 24:
                ha5 ha5Var3 = (ha5) obj;
                ha5Var3.getClass();
                ha5.o0(ha5Var3, this.b, 0L, (Float.floatToRawIntBits(ha5Var3.H0(4.0f)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var3.n() & 4294967295L))) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                return Unit.a;
            case 25:
                glg glgVar15 = (glg) obj;
                glgVar15.getClass();
                nlg V015 = glgVar15.V0("DELETE FROM feed_post_feedback WHERE feedbackTimestamp < ?");
                try {
                    V015.q(1, j);
                    V015.U0();
                    V015.close();
                    return Unit.a;
                } finally {
                }
            case 26:
                return Long.valueOf(j);
            case 27:
                ((p0d) obj).e(d99.b, Long.valueOf(j));
                return null;
            case 28:
                glg glgVar16 = (glg) obj;
                glgVar16.getClass();
                nlg V016 = glgVar16.V0("DELETE FROM media_reaction_table WHERE timestamp < ?");
                try {
                    V016.q(1, j);
                    V016.U0();
                    V016.close();
                    return Unit.a;
                } finally {
                }
            default:
                ha5 ha5Var4 = (ha5) obj;
                ha5Var4.getClass();
                ha5.U(ha5Var4, this.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                return Unit.a;
        }
    }
}
