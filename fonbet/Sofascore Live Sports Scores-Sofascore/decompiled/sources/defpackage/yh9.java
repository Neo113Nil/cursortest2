package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.network.response.IceHockeyPlayerEventStatistics;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class yh9 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = null;
        int i = 1;
        switch (this.a) {
            case 0:
                ((p00) obj).getClass();
                return Unit.a;
            case 1:
                rx2 rx2Var = (rx2) obj;
                rx2Var.getClass();
                mj9 mj9Var = (mj9) rx2Var.b;
                List<Pair> H0 = CollectionsKt.H0(vub.r(mj9Var.b), new se7(18));
                Charset charset = mj9Var.c;
                LinkedHashSet linkedHashSet = mj9Var.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : linkedHashSet) {
                    if (!mj9Var.b.containsKey((Charset) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                List<Charset> H02 = CollectionsKt.H0(arrayList, new se7(17));
                StringBuilder sb = new StringBuilder();
                for (Charset charset2 : H02) {
                    if (sb.length() > 0) {
                        sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                    }
                    sb.append(gz8.J(charset2));
                }
                for (Pair pair : H0) {
                    Charset charset3 = (Charset) pair.a;
                    float floatValue = ((Number) pair.b).floatValue();
                    if (sb.length() > 0) {
                        sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                    }
                    double d = floatValue;
                    if (0.0d > d || d > 1.0d) {
                        a70.r("Check failed.");
                        return null;
                    }
                    sb.append(gz8.J(charset3) + ";q=" + (wzb.b(100.0f * floatValue) / 100.0d));
                }
                if (sb.length() == 0) {
                    sb.append(gz8.J(charset));
                }
                String sb2 = sb.toString();
                Charset charset4 = (Charset) CollectionsKt.firstOrNull(H02);
                if (charset4 == null) {
                    Pair pair2 = (Pair) CollectionsKt.firstOrNull(H0);
                    charset4 = pair2 != null ? (Charset) pair2.a : null;
                    if (charset4 == null) {
                        charset4 = Charsets.UTF_8;
                    }
                }
                rx2Var.a(f8h.h, new hm7(sb2, charset4, rq3Var, i));
                rx2Var.a(wxf.j, new oj9(charset, null));
                return Unit.a;
            case 2:
                rx2 rx2Var2 = (rx2) obj;
                rx2Var2.getClass();
                sj9 sj9Var = (sj9) rx2Var2.b;
                sj9Var.getClass();
                sj9Var.getClass();
                rx2Var2.a(it7.o, new tl(rx2Var2, rq3Var, 13));
                return Unit.a;
            case 3:
                rx2 rx2Var3 = (rx2) obj;
                rx2Var3.getClass();
                rx2Var3.a(inb.l, new tl(rx2Var3, rq3Var, 14));
                return Unit.a;
            case 4:
                rx2 rx2Var4 = (rx2) obj;
                rx2Var4.getClass();
                dk9 dk9Var = (dk9) rx2Var4.b;
                ud3 ud3Var = dk9Var.a;
                if (ud3Var == null) {
                    Intrinsics.i("shouldRetry");
                    throw null;
                }
                cv5 cv5Var = dk9Var.b;
                if (cv5Var == null) {
                    Intrinsics.i("shouldRetryOnException");
                    throw null;
                }
                he3 he3Var = dk9Var.c;
                if (he3Var != null) {
                    rx2Var4.a(it7.o, new fk9(ud3Var, cv5Var, dk9Var.f, he3Var, dk9Var.e, rx2Var4, dk9Var.d, null));
                    return Unit.a;
                }
                Intrinsics.i("delayMillis");
                throw null;
            case 5:
                rx2 rx2Var5 = (rx2) obj;
                rx2Var5.getClass();
                bl9 bl9Var = (bl9) rx2Var5.b;
                rx2Var5.a(it7.o, new f61(bl9Var.a, bl9Var.b, bl9Var.c, null, 3));
                return Unit.a;
            case 6:
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = (IceHockeyPlayerEventStatistics) obj;
                iceHockeyPlayerEventStatistics.getClass();
                return rei.i(12, iceHockeyPlayerEventStatistics.getSaves(), iceHockeyPlayerEventStatistics.getShotsAgainst(), false);
            case 7:
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics2 = (IceHockeyPlayerEventStatistics) obj;
                iceHockeyPlayerEventStatistics2.getClass();
                return Boolean.valueOf(iceHockeyPlayerEventStatistics2.getSaves() != null);
            case 8:
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics3 = (IceHockeyPlayerEventStatistics) obj;
                iceHockeyPlayerEventStatistics3.getClass();
                return rei.a(Double.valueOf(yid.k(iceHockeyPlayerEventStatistics3.getSavePercentage())), true);
            case 9:
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics4 = (IceHockeyPlayerEventStatistics) obj;
                iceHockeyPlayerEventStatistics4.getClass();
                Double savePercentage = iceHockeyPlayerEventStatistics4.getSavePercentage();
                return Double.valueOf(savePercentage != null ? savePercentage.doubleValue() : 0.0d);
            case 10:
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics5 = (IceHockeyPlayerEventStatistics) obj;
                iceHockeyPlayerEventStatistics5.getClass();
                return Boolean.valueOf(iceHockeyPlayerEventStatistics5.getSavePercentage() != null);
            case 11:
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics6 = (IceHockeyPlayerEventStatistics) obj;
                iceHockeyPlayerEventStatistics6.getClass();
                return rei.i(12, iceHockeyPlayerEventStatistics6.getEvenSaves(), iceHockeyPlayerEventStatistics6.getEvenShotsAgainst(), false);
            case 12:
                ((IceHockeyPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r0.getEvenSaves()));
            case 13:
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics7 = (IceHockeyPlayerEventStatistics) obj;
                iceHockeyPlayerEventStatistics7.getClass();
                return Boolean.valueOf(iceHockeyPlayerEventStatistics7.getEvenSaves() != null);
            case 14:
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics8 = (IceHockeyPlayerEventStatistics) obj;
                iceHockeyPlayerEventStatistics8.getClass();
                return rei.i(12, iceHockeyPlayerEventStatistics8.getPowerPlaySaves(), iceHockeyPlayerEventStatistics8.getPowerPlayShotsAgainst(), false);
            case 15:
                ((IceHockeyPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r0.getPowerPlaySaves()));
            case 16:
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics9 = (IceHockeyPlayerEventStatistics) obj;
                iceHockeyPlayerEventStatistics9.getClass();
                return Boolean.valueOf(iceHockeyPlayerEventStatistics9.getPowerPlaySaves() != null);
            case 17:
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics10 = (IceHockeyPlayerEventStatistics) obj;
                iceHockeyPlayerEventStatistics10.getClass();
                return rei.i(12, iceHockeyPlayerEventStatistics10.getShortHandedSaves(), iceHockeyPlayerEventStatistics10.getShortHandedShotsAgainst(), false);
            case 18:
                ((IceHockeyPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r0.getShortHandedSaves()));
            case 19:
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics11 = (IceHockeyPlayerEventStatistics) obj;
                iceHockeyPlayerEventStatistics11.getClass();
                return Boolean.valueOf(iceHockeyPlayerEventStatistics11.getShortHandedSaves() != null);
            case 20:
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics12 = (IceHockeyPlayerEventStatistics) obj;
                iceHockeyPlayerEventStatistics12.getClass();
                return rei.j(iceHockeyPlayerEventStatistics12.getSecondsPlayed(), 1);
            case 21:
                ((IceHockeyPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r0.getSecondsPlayed()));
            case 22:
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics13 = (IceHockeyPlayerEventStatistics) obj;
                iceHockeyPlayerEventStatistics13.getClass();
                return Boolean.valueOf(iceHockeyPlayerEventStatistics13.getSecondsPlayed() != null);
            case 23:
                ((IceHockeyPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r0.getSaves()));
            case 24:
                ((PlayerData) obj).getClass();
                return Boolean.valueOf(!Intrinsics.c(r0.getPlayer().getPosition(), "G"));
            case 25:
                PlayerData playerData = (PlayerData) obj;
                playerData.getClass();
                return Boolean.valueOf(Intrinsics.c(playerData.getPlayer().getPosition(), "G"));
            case 26:
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics14 = (IceHockeyPlayerEventStatistics) obj;
                iceHockeyPlayerEventStatistics14.getClass();
                return String.valueOf(yid.m(iceHockeyPlayerEventStatistics14.getGoals()));
            case 27:
                ((IceHockeyPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r0.getHits()));
            case 28:
                ((IceHockeyPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r0.getGoals()));
            default:
                IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics15 = (IceHockeyPlayerEventStatistics) obj;
                iceHockeyPlayerEventStatistics15.getClass();
                return Boolean.valueOf(iceHockeyPlayerEventStatistics15.getHits() != null);
        }
    }
}
