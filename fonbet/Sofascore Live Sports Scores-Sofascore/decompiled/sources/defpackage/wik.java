package defpackage;

import com.sofascore.model.network.response.VolleyballPlayerEventStatistics;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class wik implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ wik(gwk gwkVar, qhe qheVar) {
        this.a = 24;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                v9g.x((wj4) obj, ' ');
                return Unit.a;
            case 1:
                ak4.q((wj4) obj);
                return Unit.a;
            case 2:
                return Unit.a;
            case 3:
                return new f80(((Float) obj).floatValue());
            case 4:
                return new f80(((Integer) obj).intValue());
            case 5:
                return Integer.valueOf((int) ((f80) obj).a);
            case 6:
                return new f80(((p75) obj).a);
            case 7:
                return new p75(((f80) obj).a);
            case 8:
                r75 r75Var = (r75) obj;
                return new g80(Float.intBitsToFloat((int) (r75Var.a >> 32)), Float.intBitsToFloat((int) (4294967295L & r75Var.a)));
            case 9:
                g80 g80Var = (g80) obj;
                return new r75((Float.floatToRawIntBits(g80Var.b) & 4294967295L) | (Float.floatToRawIntBits(g80Var.a) << 32));
            case 10:
                njh njhVar = (njh) obj;
                return new g80(Float.intBitsToFloat((int) (njhVar.a >> 32)), Float.intBitsToFloat((int) (4294967295L & njhVar.a)));
            case 11:
                g80 g80Var2 = (g80) obj;
                return new njh((Float.floatToRawIntBits(g80Var2.b) & 4294967295L) | (Float.floatToRawIntBits(g80Var2.a) << 32));
            case 12:
                dnd dndVar = (dnd) obj;
                return new g80(Float.intBitsToFloat((int) (dndVar.a >> 32)), Float.intBitsToFloat((int) (4294967295L & dndVar.a)));
            case 13:
                g80 g80Var3 = (g80) obj;
                return new dnd((Float.floatToRawIntBits(g80Var3.b) & 4294967295L) | (Float.floatToRawIntBits(g80Var3.a) << 32));
            case 14:
                long j = ((r6a) obj).a;
                return new g80((int) (j >> 32), (int) (j & 4294967295L));
            case 15:
                g80 g80Var4 = (g80) obj;
                return new r6a((Math.round(g80Var4.b) & 4294967295L) | (Math.round(g80Var4.a) << 32));
            case 16:
                long j2 = ((c7a) obj).a;
                return new g80((int) (j2 >> 32), (int) (j2 & 4294967295L));
            case 17:
                g80 g80Var5 = (g80) obj;
                int round = Math.round(g80Var5.a);
                if (round < 0) {
                    round = 0;
                }
                return new c7a((round << 32) | ((Math.round(g80Var5.b) >= 0 ? r11 : 0) & 4294967295L));
            case 18:
                oqf oqfVar = (oqf) obj;
                return new i80(oqfVar.a, oqfVar.b, oqfVar.c, oqfVar.d);
            case 19:
                i80 i80Var = (i80) obj;
                return new oqf(i80Var.a, i80Var.b, i80Var.c, i80Var.d);
            case 20:
                return Float.valueOf(((f80) obj).a);
            case 21:
                yma ymaVar = (yma) obj;
                ymaVar.getClass();
                ymaVar.a();
                Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                long j3 = r13.b;
                Pair pair = new Pair(valueOf, new r13(j3));
                Float valueOf2 = Float.valueOf(0.4f);
                long j4 = r13.h;
                ha5.g0(ymaVar, wxf.D(new Pair[]{pair, new Pair(valueOf2, new r13(j4)), new Pair(Float.valueOf(0.8f), new r13(j4)), new Pair(Float.valueOf(1.0f), new r13(j3))}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.POSITIVE_INFINITY), 0L, ymaVar.a.n(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                return Unit.a;
            case 22:
                ((ha5) obj).getClass();
                return Unit.a;
            case 23:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                nlg V0 = glgVar.V0("SELECT id FROM video_table");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (V0.U0()) {
                        arrayList.add(Integer.valueOf((int) V0.getLong(0)));
                    }
                    return arrayList;
                } finally {
                    V0.close();
                }
            case 24:
                return Unit.a;
            case 25:
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) obj;
                volleyballPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(volleyballPlayerEventStatistics.getPointsTotal()));
            case 26:
                ((VolleyballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r11.getWinLoss()));
            case 27:
                ((VolleyballPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r11.getPointsTotal()));
            case 28:
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics2 = (VolleyballPlayerEventStatistics) obj;
                volleyballPlayerEventStatistics2.getClass();
                return Boolean.valueOf(volleyballPlayerEventStatistics2.getWinLoss() != null);
            default:
                VolleyballPlayerEventStatistics volleyballPlayerEventStatistics3 = (VolleyballPlayerEventStatistics) obj;
                volleyballPlayerEventStatistics3.getClass();
                return String.valueOf(yid.m(volleyballPlayerEventStatistics3.getBlockPoints()));
        }
    }

    public /* synthetic */ wik(int i) {
        this.a = i;
    }
}
