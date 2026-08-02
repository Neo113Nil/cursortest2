package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import com.appsflyer.sdk_base.util.AndroidExtensionsKt;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.BaseballAdditionalPlayerData;
import com.sofascore.model.mvvm.model.BaseballRole;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.BaseballPlayerEventStatistics;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.AmericanFootballPlayerSeasonStatistics;
import java.net.HttpURLConnection;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class dt implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ dt(j31 j31Var) {
        this.a = 22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CharSequence bytesToUpperHexString$lambda$0;
        String slug;
        List<BaseballRole> roles;
        boolean z;
        List<BaseballRole> roles2;
        boolean z2;
        r1 = null;
        Boolean bool = null;
        r1 = null;
        Boolean bool2 = null;
        switch (this.a) {
            case 0:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics.getClass();
                Double b = yid.b(americanFootballPlayerSeasonStatistics.getRushingYards(), americanFootballPlayerSeasonStatistics.getRushingAttempts());
                String P = b != null ? o02.P(b.doubleValue(), false) : null;
                return P == null ? "-" : P;
            case 1:
                AmericanFootballPlayerSeasonStatistics americanFootballPlayerSeasonStatistics2 = (AmericanFootballPlayerSeasonStatistics) obj;
                americanFootballPlayerSeasonStatistics2.getClass();
                return Double.valueOf(yid.k(yid.b(americanFootballPlayerSeasonStatistics2.getRushingYards(), americanFootballPlayerSeasonStatistics2.getRushingAttempts())));
            case 2:
                cli cliVar = (cli) obj;
                cliVar.getClass();
                return Boolean.valueOf(cliVar.b);
            case 3:
                cli cliVar2 = (cli) obj;
                cliVar2.getClass();
                yea yeaVar = j58.a;
                return Boolean.valueOf(j58.j() && cliVar2.d);
            case 4:
                ((cli) obj).getClass();
                yea yeaVar2 = j58.a;
                return Boolean.valueOf(j58.j());
            case 5:
                cli cliVar3 = (cli) obj;
                cliVar3.getClass();
                Context context = cliVar3.e;
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = context.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences = a5f.d(applicationContext);
                        uic.j = sharedPreferences;
                    }
                    sharedPreferences.getClass();
                }
                return Boolean.valueOf(((int) ChronoUnit.DAYS.between(vxd.o(Instant.ofEpochMilli(sharedPreferences.getLong("PREF_FIRST_RUN_TIMESTAMP", 0L))), vxd.o(Instant.ofEpochMilli(System.currentTimeMillis())))) >= 7 && fqj.t(cliVar3.e, cliVar3.a, "black-friday-2025"));
            case 6:
                ((cli) obj).getClass();
                return Boolean.TRUE;
            case 7:
                cli cliVar4 = (cli) obj;
                cliVar4.getClass();
                return Boolean.valueOf(fqj.t(cliVar4.e, cliVar4.a, "discount3m"));
            case 8:
                return Float.valueOf(((Float) obj).floatValue() / 2.0f);
            case 9:
                return Boolean.TRUE;
            case 10:
                ((Integer) obj).getClass();
                return Float.valueOf(Float.NaN);
            case 11:
                return Boolean.TRUE;
            case 12:
                ((HttpsURLConnection) obj).getClass();
                return Unit.a;
            case 13:
                ((HttpURLConnection) obj).getClass();
                return Unit.a;
            case 14:
                bytesToUpperHexString$lambda$0 = AndroidExtensionsKt.bytesToUpperHexString$lambda$0(((Byte) obj).byteValue());
                return bytesToUpperHexString$lambda$0;
            case 15:
                ((Long) obj).getClass();
                return Unit.a;
            case 16:
                ((Long) obj).getClass();
                return Unit.a;
            case 17:
                return new c7a(((int) (((c7a) obj).a >> 32)) << 32);
            case 18:
                return new c7a(((int) (((c7a) obj).a >> 32)) << 32);
            case 19:
                return Boolean.valueOf(!(((m80) obj) instanceof g8e));
            case 20:
                CharSequence charSequence = (CharSequence) obj;
                charSequence.getClass();
                return Integer.valueOf(charSequence.length());
            case 21:
                return (rj0) obj;
            case 22:
                Team team = (Team) obj;
                team.getClass();
                Sport sport = team.getSport();
                if ((sport == null || (slug = sport.getSlug()) == null || !Sports.INSTANCE.getEntries().contains(slug) || wyh.e(slug) || slug.equals(Sports.MMA) || wyh.m(slug)) && team.getType() == 1) {
                    r2 = false;
                }
                return Boolean.valueOf(r2);
            case 23:
                ((pw7) obj).getClass();
                return Unit.a;
            case 24:
                zbc zbcVar = (zbc) obj;
                zbcVar.getClass();
                return zbc.a(zbcVar, 0, null, null, null, Boolean.TRUE, false, 47);
            case 25:
                return zbc.a((zbc) obj, 0, null, null, null, Boolean.FALSE, false, 47);
            case 26:
                te2 te2Var = (te2) obj;
                te2Var.getClass();
                a10 k = tgj.k(100, 100, 0, 28);
                wx a = xx.a(k);
                gtj n = yqo.n();
                n.v(r13.b);
                n.E(1);
                n.D(1.0f);
                flf flfVar = glf.a;
                IntRange intRange = new IntRange(0, 10000, 1);
                ArrayList arrayList = new ArrayList(k13.r(intRange, 10));
                v6a it = intRange.iterator();
                while (it.c) {
                    it.nextInt();
                    flfVar.getClass();
                    d7 d7Var = glf.b;
                    arrayList.add(new dnd((Float.floatToRawIntBits(d7Var.j().nextFloat() * 100.0f) & 4294967295L) | (Float.floatToRawIntBits(d7Var.j().nextFloat() * 100.0f) << 32)));
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    long j = ((dnd) arrayList.get(i)).a;
                    a.a.drawPoint(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), (Paint) n.d);
                }
                Bitmap z3 = c6o.z(k);
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                return te2Var.b(new u2(new o52(new BitmapShader(z3, tileMode, tileMode)), 16));
            case 27:
                PlayerData playerData = (PlayerData) obj;
                playerData.getClass();
                BaseballAdditionalPlayerData baseballAllPositions = playerData.getBaseballAllPositions();
                if (yid.m(baseballAllPositions != null ? baseballAllPositions.getBattingOrder() : null) <= 0) {
                    BaseballAdditionalPlayerData baseballAllPositions2 = playerData.getBaseballAllPositions();
                    if (baseballAllPositions2 != null && (roles = baseballAllPositions2.getRoles()) != null) {
                        if (!roles.isEmpty()) {
                            for (BaseballRole baseballRole : roles) {
                                List<BaseballRole> battingPositions = BaseballRole.INSTANCE.getBattingPositions();
                                if (battingPositions == null || !battingPositions.isEmpty()) {
                                    Iterator<T> it2 = battingPositions.iterator();
                                    while (it2.hasNext()) {
                                        if (((BaseballRole) it2.next()) == baseballRole) {
                                            z = true;
                                            bool2 = Boolean.valueOf(z);
                                        }
                                    }
                                }
                            }
                        }
                        z = false;
                        bool2 = Boolean.valueOf(z);
                    }
                    if (!Intrinsics.c(bool2, Boolean.TRUE)) {
                        r2 = false;
                    }
                }
                return Boolean.valueOf(r2);
            case 28:
                PlayerData playerData2 = (PlayerData) obj;
                playerData2.getClass();
                PlayerEventStatistics statistics = playerData2.getStatistics();
                if (!(statistics instanceof BaseballPlayerEventStatistics)) {
                    statistics = null;
                }
                BaseballPlayerEventStatistics baseballPlayerEventStatistics = (BaseballPlayerEventStatistics) statistics;
                if (yid.k(baseballPlayerEventStatistics != null ? baseballPlayerEventStatistics.getPitchingInningsPitched() : null) <= 0.0d) {
                    BaseballAdditionalPlayerData baseballAllPositions3 = playerData2.getBaseballAllPositions();
                    if (baseballAllPositions3 != null && (roles2 = baseballAllPositions3.getRoles()) != null) {
                        if (!roles2.isEmpty()) {
                            Iterator<T> it3 = roles2.iterator();
                            while (it3.hasNext()) {
                                if (((BaseballRole) it3.next()) == BaseballRole.Pitcher) {
                                    z2 = true;
                                    bool = Boolean.valueOf(z2);
                                }
                            }
                        }
                        z2 = false;
                        bool = Boolean.valueOf(z2);
                    }
                    if (!Intrinsics.c(bool, Boolean.TRUE)) {
                        r2 = false;
                    }
                }
                return Boolean.valueOf(r2);
            default:
                PlayerData playerData3 = (PlayerData) obj;
                playerData3.getClass();
                BaseballAdditionalPlayerData baseballAllPositions4 = playerData3.getBaseballAllPositions();
                List<BaseballRole> roles3 = baseballAllPositions4 != null ? baseballAllPositions4.getRoles() : null;
                if (roles3 == null) {
                    roles3 = km5.a;
                }
                return Boolean.valueOf((((Boolean) u71.d.c.invoke(playerData3)).booleanValue() || ((Boolean) u71.e.c.invoke(playerData3)).booleanValue()) && !(roles3.size() == 1 && CollectionsKt.Y(roles3) == BaseballRole.DesignatedHitter) == true);
        }
    }

    public /* synthetic */ dt(int i) {
        this.a = i;
    }
}
