package defpackage;

import android.app.RemoteAction;
import android.graphics.drawable.Drawable;
import com.sofascore.model.team.TennisSurfaceType;
import com.sofascore.results.R;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceEntrant;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceTeam;
import com.sofascore.results.transfers.PlayerTransfersActivity;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g31 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g31(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        int i = this.a;
        utc utcVar = utc.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                long j2 = ((r13) obj).a;
                of3 of3Var = (of3) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).f(j2) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    qha.i(((Integer) obj4).intValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j2, av8Var, (intValue << 6) & 896, 2);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 1:
                long j3 = ((r13) obj).a;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Number) obj3).intValue();
                Integer num = ((o14) obj4).c;
                av8 av8Var2 = (av8) of3Var2;
                if (!av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    av8Var2.W();
                } else if (num == null) {
                    av8Var2.d0(-1552382652);
                    av8Var2.s(false);
                } else {
                    av8Var2.d0(-1552382651);
                    qha.i(R.drawable.ic_cricket_wagon_indicator, 8.0f, lz.D(num.intValue(), av8Var2), av8Var2, 48, 0);
                    av8Var2.s(false);
                }
                return Unit.a;
            case 2:
                long j4 = ((r13) obj).a;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Number) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((av8) of3Var3).f(j4) ? 4 : 2;
                }
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 19) != 18)) {
                    ft4.b(((m8j) obj4).c, j4, av8Var3, (intValue3 << 3) & 112);
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 3:
                long j5 = ((r13) obj).a;
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Number) obj3).intValue();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    td4.k(((dy7) obj4).h, bkh.l(utcVar, 16.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var4, 48, 12);
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 4:
                of3 of3Var5 = (of3) obj2;
                int intValue5 = ((Number) obj3).intValue();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 17) != 16)) {
                    ((Function2) obj4).invoke(av8Var5, 0);
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            case 5:
                long j6 = ((r13) obj).a;
                of3 of3Var6 = (of3) obj2;
                int intValue6 = ((Number) obj3).intValue();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((av8) of3Var6).f(j6) ? 4 : 2;
                }
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(intValue6 & 1, (intValue6 & 19) != 18)) {
                    PlayerTransfersActivity playerTransfersActivity = (PlayerTransfersActivity) obj4;
                    int i2 = PlayerTransfersActivity.R;
                    playerTransfersActivity.M(j6, ((ovj) playerTransfersActivity.K.getValue()).a, av8Var6, intValue6 & 14);
                } else {
                    av8Var6.W();
                }
                return Unit.a;
            case 6:
                long j7 = ((r13) obj).a;
                of3 of3Var7 = (of3) obj2;
                int intValue7 = ((Number) obj3).intValue();
                av8 av8Var7 = (av8) of3Var7;
                if (av8Var7.T(intValue7 & 1, (intValue7 & 17) != 16)) {
                    RaceFlowModels$RaceEntrant raceFlowModels$RaceEntrant = (RaceFlowModels$RaceEntrant) obj4;
                    int i3 = raceFlowModels$RaceEntrant.b;
                    RaceFlowModels$RaceTeam raceFlowModels$RaceTeam = raceFlowModels$RaceEntrant.e;
                    r13 r13Var = raceFlowModels$RaceTeam != null ? new r13(hkg.b(raceFlowModels$RaceTeam.c)) : null;
                    if (r13Var == null) {
                        j = ljg.f(av8Var7, -1604350029, R.color.neutral_default, av8Var7, false);
                    } else {
                        av8Var7.d0(-1604351424);
                        av8Var7.s(false);
                        j = r13Var.a;
                    }
                    h5a.s(i3, 0, j, av8Var7, null);
                } else {
                    av8Var7.W();
                }
                return Unit.a;
            case 7:
                long j8 = ((r13) obj).a;
                of3 of3Var8 = (of3) obj2;
                int intValue8 = ((Number) obj3).intValue();
                av8 av8Var8 = (av8) of3Var8;
                if (av8Var8.T(intValue8 & 1, (intValue8 & 17) != 16)) {
                    td4.l((g5i) obj4, bkh.l(utcVar, 16.0f), av8Var8, 48);
                } else {
                    av8Var8.W();
                }
                return Unit.a;
            case 8:
                long j9 = ((r13) obj).a;
                of3 of3Var9 = (of3) obj2;
                int intValue9 = ((Number) obj3).intValue();
                av8 av8Var9 = (av8) of3Var9;
                if (av8Var9.T(intValue9 & 1, (intValue9 & 17) != 16)) {
                    int i4 = b6j.a[((TennisSurfaceType) obj4).ordinal()];
                    if (i4 == 1) {
                        av8Var9.d0(-747749810);
                        qha.i(R.drawable.ic_tennis_terain, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lz.D(R.color.terrain_grass, av8Var9), av8Var9, 0, 2);
                        av8Var9.s(false);
                    } else if (i4 == 2) {
                        av8Var9.d0(-747744659);
                        qha.i(R.drawable.ic_tennis_terain, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lz.D(R.color.terrain_clay, av8Var9), av8Var9, 0, 2);
                        av8Var9.s(false);
                    } else if (i4 == 3) {
                        av8Var9.d0(-747739559);
                        qha.i(R.drawable.ic_tennis_terain_hard, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, av8Var9, 0, 6);
                        av8Var9.s(false);
                    } else if (i4 == 4) {
                        av8Var9.d0(-747734831);
                        qha.i(R.drawable.ic_tennis_terain, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lz.D(R.color.hardcourt_indoor, av8Var9), av8Var9, 0, 2);
                        av8Var9.s(false);
                    } else if (i4 != 5) {
                        av8Var9.d0(-1704653368);
                        av8Var9.s(false);
                    } else {
                        av8Var9.d0(-747729326);
                        qha.i(R.drawable.ic_tennis_terain, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lz.D(R.color.hardcourt_outdoor, av8Var9), av8Var9, 0, 2);
                        av8Var9.s(false);
                    }
                } else {
                    av8Var9.W();
                }
                return Unit.a;
            case 9:
                long j10 = ((r13) obj).a;
                of3 of3Var10 = (of3) obj2;
                int intValue10 = ((Number) obj3).intValue();
                av8 av8Var10 = (av8) of3Var10;
                if (av8Var10.T(intValue10 & 1, (intValue10 & 17) != 16)) {
                    tla.c.d((Drawable) obj4, av8Var10, 48);
                } else {
                    av8Var10.W();
                }
                return Unit.a;
            case 10:
                long j11 = ((r13) obj).a;
                of3 of3Var11 = (of3) obj2;
                int intValue11 = ((Number) obj3).intValue();
                av8 av8Var11 = (av8) of3Var11;
                if (av8Var11.T(intValue11 & 1, (intValue11 & 17) != 16)) {
                    tla.c.g(((RemoteAction) obj4).getIcon(), av8Var11, 48);
                } else {
                    av8Var11.W();
                }
                return Unit.a;
            case 11:
                xtc xtcVar = (xtc) obj;
                ((Number) obj3).intValue();
                av8 av8Var12 = (av8) ((of3) obj2);
                av8Var12.d0(-1498516085);
                g0i I = ufa.I(bwc.b, av8Var12);
                g0i I2 = ufa.I(bwc.d, av8Var12);
                axj axjVar = (axj) obj4;
                q4k q4kVar = lz.f;
                t01 t01Var = axjVar.a;
                e1d e1dVar = axjVar.d;
                boolean booleanValue = ((Boolean) t01Var.w()).booleanValue();
                av8Var12.d0(-1553362193);
                float f = booleanValue ? 1.0f : 0.8f;
                av8Var12.s(false);
                Float valueOf = Float.valueOf(f);
                eoh eohVar = (eoh) e1dVar;
                boolean booleanValue2 = ((Boolean) eohVar.getValue()).booleanValue();
                av8Var12.d0(-1553362193);
                float f2 = booleanValue2 ? 1.0f : 0.8f;
                av8Var12.s(false);
                Float valueOf2 = Float.valueOf(f2);
                axjVar.f();
                av8Var12.d0(386845748);
                av8Var12.s(false);
                vwj x = yso.x(axjVar, valueOf, valueOf2, I, q4kVar, av8Var12, 196608);
                boolean booleanValue3 = ((Boolean) axjVar.a.w()).booleanValue();
                av8Var12.d0(2073045083);
                float f3 = booleanValue3 ? 1.0f : 0.0f;
                av8Var12.s(false);
                Float valueOf3 = Float.valueOf(f3);
                boolean booleanValue4 = ((Boolean) eohVar.getValue()).booleanValue();
                av8Var12.d0(2073045083);
                float f4 = booleanValue4 ? 1.0f : 0.0f;
                av8Var12.s(false);
                Float valueOf4 = Float.valueOf(f4);
                axjVar.f();
                av8Var12.d0(-281714272);
                av8Var12.s(false);
                xtc N = s02.N(xtcVar, ((Number) x.getValue()).floatValue(), ((Number) x.getValue()).floatValue(), ((Number) yso.x(axjVar, valueOf3, valueOf4, I2, q4kVar, av8Var12, 196608).getValue()).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 131064);
                av8Var12.s(false);
                return N;
            default:
                long j12 = ((r13) obj).a;
                of3 of3Var12 = (of3) obj2;
                int intValue12 = ((Number) obj3).intValue();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((av8) of3Var12).f(j12) ? 4 : 2;
                }
                av8 av8Var13 = (av8) of3Var12;
                if (av8Var13.T(intValue12 & 1, (intValue12 & 19) != 18)) {
                    kq9.b(s6a.N(((gz3) obj4).b, 6, av8Var13), null, null, j12, av8Var13, ((intValue12 << 9) & 7168) | 48, 4);
                } else {
                    av8Var13.W();
                }
                return Unit.a;
        }
    }
}
