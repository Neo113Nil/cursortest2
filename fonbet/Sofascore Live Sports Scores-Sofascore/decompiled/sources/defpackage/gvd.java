package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.view.DragEvent;
import android.widget.ImageView;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import com.appsflyer.internal.i;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Sports;
import com.sofascore.model.fantasy.FantasyLeagueMatchupStanding;
import com.sofascore.model.fantasy.FantasyUserCompetition;
import com.sofascore.model.newNetwork.statistics.season.team.BasketballRankedStatistics;
import com.sofascore.model.newNetwork.statistics.season.team.RankedStatistic;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class gvd {
    public static final tc3 b;
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;
    public static final ak0 a = new ak0();
    public static final tc3 c = new tc3(-602478651, new pd3(13), false);
    public static final byte[] d = {-75, 0, 60, 0, 1, 4};

    static {
        byte b2 = 0;
        b = new tc3(547150347, new hd3(b2, b2), false);
    }

    public static final long A(a85 a85Var) {
        DragEvent dragEvent = a85Var.a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
    }

    public static int B(zd7 zd7Var) {
        return (!zd7Var.d.isEmpty() && zd7Var.d.size() > 2) ? 2 : 1;
    }

    public static jk5 C(Context context) {
        ClassLoader classLoader;
        int a2 = bl6.a();
        if (a2 >= 1) {
            try {
                if (ik5.c() && (classLoader = bk6.class.getClassLoader()) != null) {
                    ActivityEmbeddingComponent a3 = ik5.a();
                    ak5 ak5Var = new ak5(new e3c(classLoader, 8));
                    hpo hpoVar = new hpo(classLoader);
                    if (a2 >= 8) {
                        new hyd(a3, ak5Var);
                    }
                    if (a2 >= 6) {
                        new gf(a3);
                    }
                    return new jk5(a3, ak5Var, hpoVar, context);
                }
            } catch (Throwable th) {
                th.toString();
            }
        }
        return null;
    }

    public static void D(String str, String str2, av8 av8Var, Object... objArr) {
        Method method;
        Method method2;
        Class<?> cls = Class.forName(str);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        ArrayList arrayList = new ArrayList();
        int length = copyOf.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Object obj = copyOf[i2];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i2++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int length2 = clsArr.length;
                int ceil = length2 == 0 ? 1 : (int) Math.ceil(length2 / 10.0d);
                Class cls3 = Integer.TYPE;
                IntRange j2 = llf.j(0, ceil);
                ArrayList arrayList2 = new ArrayList(k13.r(j2, 10));
                v6a it = j2.iterator();
                while (it.c) {
                    it.nextInt();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                k89 k89Var = new k89(3);
                ArrayList arrayList3 = k89Var.a;
                k89Var.b(clsArr);
                k89Var.a(of3.class);
                k89Var.b(clsArr2);
                method = y(declaredMethods, str2, (Class[]) arrayList3.toArray(new Class[arrayList3.size()]));
            } catch (ReflectiveOperationException unused) {
                method = null;
            }
        } catch (ReflectiveOperationException unused2) {
            Method[] declaredMethods2 = cls.getDeclaredMethods();
            int length3 = declaredMethods2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length3) {
                    method2 = null;
                    break;
                }
                method2 = declaredMethods2[i3];
                if (Intrinsics.c(method2.getName(), str2)) {
                    break;
                }
                if (c.v(method2.getName(), str2 + '-', false)) {
                    break;
                } else {
                    i3++;
                }
            }
            method = method2;
        }
        if (method != null) {
            method.setAccessible(true);
            if (Modifier.isStatic(method.getModifiers())) {
                E(method, null, av8Var, Arrays.copyOf(objArr, objArr.length));
                return;
            } else {
                E(method, cls.getConstructor(null).newInstance(null), av8Var, Arrays.copyOf(objArr, objArr.length));
                return;
            }
        }
        throw new NoSuchMethodException("Composable " + str + '.' + str2 + " not found");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cf, code lost:
    
        if (r8.equals("int") == false) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void E(Method method, Object obj, av8 av8Var, Object... objArr) {
        Object obj2;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i2 = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i3 = length - 1;
                if (Intrinsics.c(parameterTypes[length], of3.class)) {
                    i2 = length;
                    break;
                } else if (i3 < 0) {
                    break;
                } else {
                    length = i3;
                }
            }
        }
        int i4 = i2 + 1;
        int ceil = (i2 != 0 ? (int) Math.ceil(((obj != null ? 1 : 0) + i2) / 10.0d) : 1) + i4;
        int length2 = method.getParameterTypes().length;
        if ((length2 != ceil ? (int) Math.ceil(i2 / 31.0d) : 0) + ceil != length2) {
            a70.r("params don't add up to total params");
            return;
        }
        Object[] objArr2 = new Object[length2];
        for (int i5 = 0; i5 < length2; i5++) {
            if (i5 < 0 || i5 >= i2) {
                if (i5 == i2) {
                    obj2 = av8Var;
                } else {
                    if (i4 > i5 || i5 >= ceil) {
                        if (ceil > i5 || i5 >= length2) {
                            a70.r("Unexpected index");
                            return;
                        }
                        obj2 = 2097151;
                    }
                    obj2 = 0;
                }
            } else if (i5 < 0 || i5 >= objArr.length) {
                String name = method.getParameterTypes()[i5].getName();
                switch (name.hashCode()) {
                    case -1325958191:
                        if (name.equals("double")) {
                            obj2 = Double.valueOf(0.0d);
                            break;
                        }
                        obj2 = null;
                        break;
                    case 104431:
                        break;
                    case 3039496:
                        if (name.equals("byte")) {
                            obj2 = (byte) 0;
                            break;
                        }
                        obj2 = null;
                        break;
                    case 3052374:
                        if (name.equals("char")) {
                            obj2 = (char) 0;
                            break;
                        }
                        obj2 = null;
                        break;
                    case 3327612:
                        if (name.equals("long")) {
                            obj2 = 0L;
                            break;
                        }
                        obj2 = null;
                        break;
                    case 64711720:
                        if (name.equals("boolean")) {
                            obj2 = Boolean.FALSE;
                            break;
                        }
                        obj2 = null;
                        break;
                    case 97526364:
                        if (name.equals("float")) {
                            obj2 = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            break;
                        }
                        obj2 = null;
                        break;
                    case 109413500:
                        if (name.equals("short")) {
                            obj2 = (short) 0;
                            break;
                        }
                        obj2 = null;
                        break;
                    default:
                        obj2 = null;
                        break;
                }
            } else {
                obj2 = objArr[i5];
            }
            objArr2[i5] = obj2;
        }
        method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }

    public static final xtc F(hqa hqaVar, cqa cqaVar, ewd ewdVar) {
        return new dqa(hqaVar, cqaVar, ewdVar);
    }

    public static final s77 G(Context context, FantasyUserCompetition fantasyUserCompetition, String str, String str2, FantasyLeagueMatchupStanding fantasyLeagueMatchupStanding, Float f2) {
        String valueOf;
        Integer rank;
        String str3 = null;
        Integer valueOf2 = fantasyUserCompetition != null ? Integer.valueOf(fantasyUserCompetition.getId()) : null;
        if (str == null) {
            str = context.getString(R.string.league_average);
            str.getClass();
        }
        String str4 = str;
        String p = (fantasyLeagueMatchupStanding == null || (rank = fantasyLeagueMatchupStanding.getRank()) == null) ? "-" : yid.p(rank.intValue());
        if (fantasyLeagueMatchupStanding != null) {
            str3 = fantasyLeagueMatchupStanding.getWins() + "-" + fantasyLeagueMatchupStanding.getDraws() + "-" + fantasyLeagueMatchupStanding.getLosses();
        }
        return new s77(valueOf2, str2, str4, p, str3, (f2 == null || (valueOf = String.valueOf((int) f2.floatValue())) == null) ? "-" : valueOf);
    }

    public static xbb H(BasketballRankedStatistics basketballRankedStatistics, Context context, int i2, int i3) {
        String str;
        xbb b2 = a.b();
        String string = context.getString(R.string.summary);
        string.getClass();
        xbb b3 = a.b();
        RankedStatistic points = basketballRankedStatistics.getPoints();
        int i4 = 1;
        String str2 = "%.1f";
        if (points != null) {
            Float value = points.getValue();
            double floatValue = (value != null ? value.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / (i2 + i3);
            String format = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(floatValue)}, 1));
            int a2 = wzb.a(floatValue);
            if (a2 == Double.parseDouble(format)) {
                format = String.valueOf(a2);
            }
            String string2 = context.getString(R.string.points);
            string2.getClass();
            Integer rankPerGame = points.getRankPerGame();
            b3.add(new bs1(string2, format, rankPerGame != null ? rankPerGame.intValue() : 0, null));
        }
        RankedStatistic pointsAgainst = basketballRankedStatistics.getPointsAgainst();
        if (pointsAgainst != null) {
            Float value2 = pointsAgainst.getValue();
            double floatValue2 = (value2 != null ? value2.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / i2;
            String format2 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(floatValue2)}, 1));
            int a3 = wzb.a(floatValue2);
            if (a3 == Double.parseDouble(format2)) {
                format2 = String.valueOf(a3);
            }
            String string3 = context.getString(R.string.points_allowed);
            string3.getClass();
            Integer rankPerGame2 = pointsAgainst.getRankPerGame();
            b3.add(new bs1(string3, format2, rankPerGame2 != null ? rankPerGame2.intValue() : 0, null));
        }
        RankedStatistic assists = basketballRankedStatistics.getAssists();
        if (assists != null) {
            Float value3 = assists.getValue();
            double floatValue3 = (value3 != null ? value3.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / i2;
            String format3 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(floatValue3)}, 1));
            int a4 = wzb.a(floatValue3);
            if (a4 == Double.parseDouble(format3)) {
                format3 = String.valueOf(a4);
            }
            String string4 = context.getString(R.string.basketball_assists);
            string4.getClass();
            Integer rankPerGame3 = assists.getRankPerGame();
            b3.add(new bs1(string4, format3, rankPerGame3 != null ? rankPerGame3.intValue() : 0, null));
        }
        RankedStatistic assistTurnoverRatio = basketballRankedStatistics.getAssistTurnoverRatio();
        if (assistTurnoverRatio != null) {
            double floatValue4 = assistTurnoverRatio.getValue() != null ? r13.floatValue() : 0.0d;
            String format4 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(floatValue4)}, 1));
            int a5 = wzb.a(floatValue4);
            if (a5 == Double.parseDouble(format4)) {
                format4 = String.valueOf(a5);
            }
            String string5 = context.getString(R.string.assist_to_turnover_ratio);
            string5.getClass();
            Integer rankPerGame4 = assistTurnoverRatio.getRankPerGame();
            b3.add(new bs1(string5, format4, rankPerGame4 != null ? rankPerGame4.intValue() : 0, null));
        }
        xbb a6 = a.a(b3);
        km5 km5Var = km5.a;
        ezg.g(b2, string, a6, km5Var);
        String string6 = context.getString(R.string.amf_offense);
        string6.getClass();
        xbb b4 = a.b();
        RankedStatistic fieldGoalsMade = basketballRankedStatistics.getFieldGoalsMade();
        if (fieldGoalsMade != null) {
            Float value4 = fieldGoalsMade.getValue();
            double floatValue5 = (value4 != null ? value4.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / i2;
            String format5 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(floatValue5)}, 1));
            int a7 = wzb.a(floatValue5);
            if (a7 == Double.parseDouble(format5)) {
                format5 = String.valueOf(a7);
            }
            String string7 = context.getString(R.string.basketball_field_goals_made);
            string7.getClass();
            Integer rankPerGame5 = fieldGoalsMade.getRankPerGame();
            b4.add(new bs1(string7, format5, rankPerGame5 != null ? rankPerGame5.intValue() : 0, null));
        }
        RankedStatistic fieldGoalAttempts = basketballRankedStatistics.getFieldGoalAttempts();
        if (fieldGoalAttempts != null) {
            Float value5 = fieldGoalAttempts.getValue();
            double floatValue6 = (value5 != null ? value5.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / i2;
            String format6 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(floatValue6)}, 1));
            int a8 = wzb.a(floatValue6);
            if (a8 == Double.parseDouble(format6)) {
                format6 = String.valueOf(a8);
            }
            String string8 = context.getString(R.string.basketball_field_goals_attempted);
            string8.getClass();
            Integer rankPerGame6 = fieldGoalAttempts.getRankPerGame();
            b4.add(new bs1(string8, format6, rankPerGame6 != null ? rankPerGame6.intValue() : 0, null));
        }
        RankedStatistic fieldGoalsPercentage = basketballRankedStatistics.getFieldGoalsPercentage();
        if (fieldGoalsPercentage != null) {
            double floatValue7 = fieldGoalsPercentage.getValue() != null ? r13.floatValue() : 0.0d;
            String format7 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(floatValue7)}, 1));
            int a9 = wzb.a(floatValue7);
            if (a9 == Double.parseDouble(format7)) {
                format7 = String.valueOf(a9);
            }
            String y = dmi.y(format7, "%");
            String string9 = context.getString(R.string.field_goals_percentage_made);
            string9.getClass();
            Integer rankPerGame7 = fieldGoalsPercentage.getRankPerGame();
            b4.add(new bs1(string9, y, rankPerGame7 != null ? rankPerGame7.intValue() : 0, null));
        }
        RankedStatistic threePointsMade = basketballRankedStatistics.getThreePointsMade();
        if (threePointsMade != null) {
            Float value6 = threePointsMade.getValue();
            double floatValue8 = (value6 != null ? value6.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / i2;
            String format8 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(floatValue8)}, 1));
            int a10 = wzb.a(floatValue8);
            if (a10 == Double.parseDouble(format8)) {
                format8 = String.valueOf(a10);
            }
            String string10 = context.getString(R.string.basketball_three_points_made);
            string10.getClass();
            Integer rankPerGame8 = threePointsMade.getRankPerGame();
            b4.add(new bs1(string10, format8, rankPerGame8 != null ? rankPerGame8.intValue() : 0, null));
        }
        RankedStatistic threePointAttempts = basketballRankedStatistics.getThreePointAttempts();
        if (threePointAttempts != null) {
            Float value7 = threePointAttempts.getValue();
            double floatValue9 = (value7 != null ? value7.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / i2;
            String format9 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(floatValue9)}, 1));
            int a11 = wzb.a(floatValue9);
            if (a11 == Double.parseDouble(format9)) {
                format9 = String.valueOf(a11);
            }
            String string11 = context.getString(R.string.basketball_three_points_attempted);
            string11.getClass();
            Integer rankPerGame9 = threePointAttempts.getRankPerGame();
            b4.add(new bs1(string11, format9, rankPerGame9 != null ? rankPerGame9.intValue() : 0, null));
        }
        RankedStatistic threePointsPercentage = basketballRankedStatistics.getThreePointsPercentage();
        if (threePointsPercentage != null) {
            double floatValue10 = threePointsPercentage.getValue() != null ? r11.floatValue() : 0.0d;
            String format10 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(floatValue10)}, 1));
            int a12 = wzb.a(floatValue10);
            if (a12 == Double.parseDouble(format10)) {
                format10 = String.valueOf(a12);
            }
            String y2 = dmi.y(format10, "%");
            String string12 = context.getString(R.string.three_points_percentage_made);
            string12.getClass();
            Integer rankPerGame10 = threePointsPercentage.getRankPerGame();
            b4.add(new bs1(string12, y2, rankPerGame10 != null ? rankPerGame10.intValue() : 0, null));
        }
        RankedStatistic freeThrowsMade = basketballRankedStatistics.getFreeThrowsMade();
        if (freeThrowsMade != null) {
            Float value8 = freeThrowsMade.getValue();
            double floatValue11 = (value8 != null ? value8.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / i2;
            String format11 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(floatValue11)}, 1));
            int a13 = wzb.a(floatValue11);
            if (a13 == Double.parseDouble(format11)) {
                format11 = String.valueOf(a13);
            }
            String string13 = context.getString(R.string.basketball_free_throws_made);
            string13.getClass();
            Integer rankPerGame11 = freeThrowsMade.getRankPerGame();
            b4.add(new bs1(string13, format11, rankPerGame11 != null ? rankPerGame11.intValue() : 0, null));
        }
        RankedStatistic freeThrowAttempts = basketballRankedStatistics.getFreeThrowAttempts();
        if (freeThrowAttempts != null) {
            Float value9 = freeThrowAttempts.getValue();
            double floatValue12 = (value9 != null ? value9.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / i2;
            String format12 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(floatValue12)}, 1));
            int a14 = wzb.a(floatValue12);
            if (a14 == Double.parseDouble(format12)) {
                format12 = String.valueOf(a14);
            }
            String string14 = context.getString(R.string.basketball_free_throws_attempted);
            string14.getClass();
            Integer rankPerGame12 = freeThrowAttempts.getRankPerGame();
            b4.add(new bs1(string14, format12, rankPerGame12 != null ? rankPerGame12.intValue() : 0, null));
        }
        RankedStatistic freeThrowsPercentage = basketballRankedStatistics.getFreeThrowsPercentage();
        if (freeThrowsPercentage != null) {
            double floatValue13 = freeThrowsPercentage.getValue() != null ? r11.floatValue() : 0.0d;
            String format13 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(floatValue13)}, 1));
            int a15 = wzb.a(floatValue13);
            if (a15 == Double.parseDouble(format13)) {
                format13 = String.valueOf(a15);
            }
            String y3 = dmi.y(format13, "%");
            String string15 = context.getString(R.string.free_throws_percentage_made);
            string15.getClass();
            Integer rankPerGame13 = freeThrowsPercentage.getRankPerGame();
            b4.add(new bs1(string15, y3, rankPerGame13 != null ? rankPerGame13.intValue() : 0, null));
        }
        RankedStatistic effectiveFieldGoalPercentage = basketballRankedStatistics.getEffectiveFieldGoalPercentage();
        if (effectiveFieldGoalPercentage != null) {
            double floatValue14 = effectiveFieldGoalPercentage.getValue() != null ? r11.floatValue() : 0.0d;
            String format14 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(floatValue14)}, 1));
            int a16 = wzb.a(floatValue14);
            if (a16 == Double.parseDouble(format14)) {
                format14 = String.valueOf(a16);
            }
            String y4 = dmi.y(format14, "%");
            String string16 = context.getString(R.string.basketball_effective_field_goal_pct);
            string16.getClass();
            Integer rankPerGame14 = effectiveFieldGoalPercentage.getRankPerGame();
            b4.add(new bs1(string16, y4, rankPerGame14 != null ? rankPerGame14.intValue() : 0, "EFFECTIVE_FIELD_GOAL_PCT"));
        }
        RankedStatistic trueShootingPercentage = basketballRankedStatistics.getTrueShootingPercentage();
        if (trueShootingPercentage != null) {
            double floatValue15 = trueShootingPercentage.getValue() != null ? r11.floatValue() : 0.0d;
            String format15 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(floatValue15)}, 1));
            int a17 = wzb.a(floatValue15);
            if (a17 == Double.parseDouble(format15)) {
                format15 = String.valueOf(a17);
            }
            String y5 = dmi.y(format15, "%");
            String string17 = context.getString(R.string.basketball_true_shooting_pct);
            string17.getClass();
            Integer rankPerGame15 = trueShootingPercentage.getRankPerGame();
            b4.add(new bs1(string17, y5, rankPerGame15 != null ? rankPerGame15.intValue() : 0, "TRUE_SHOOTING_PCT"));
        }
        RankedStatistic benchPoints = basketballRankedStatistics.getBenchPoints();
        if (benchPoints != null) {
            Float value10 = benchPoints.getValue();
            double floatValue16 = (value10 != null ? value10.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / i2;
            String format16 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(floatValue16)}, 1));
            int a18 = wzb.a(floatValue16);
            if (a18 == Double.parseDouble(format16)) {
                format16 = String.valueOf(a18);
            }
            String string18 = context.getString(R.string.basketball_points_off_the_bench);
            string18.getClass();
            Integer rankPerGame16 = benchPoints.getRankPerGame();
            b4.add(new bs1(string18, format16, rankPerGame16 != null ? rankPerGame16.intValue() : 0, null));
        }
        RankedStatistic secondChancePoints = basketballRankedStatistics.getSecondChancePoints();
        if (secondChancePoints != null) {
            Float value11 = secondChancePoints.getValue();
            double floatValue17 = (value11 != null ? value11.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / i2;
            String format17 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(floatValue17)}, 1));
            int a19 = wzb.a(floatValue17);
            if (a19 == Double.parseDouble(format17)) {
                format17 = String.valueOf(a19);
            }
            String string19 = context.getString(R.string.basketball_second_chance_points);
            string19.getClass();
            Integer rankPerGame17 = secondChancePoints.getRankPerGame();
            b4.add(new bs1(string19, format17, rankPerGame17 != null ? rankPerGame17.intValue() : 0, null));
        }
        RankedStatistic pointsInPaint = basketballRankedStatistics.getPointsInPaint();
        if (pointsInPaint != null) {
            Float value12 = pointsInPaint.getValue();
            double floatValue18 = (value12 != null ? value12.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / i2;
            String format18 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(floatValue18)}, 1));
            int a20 = wzb.a(floatValue18);
            if (a20 == Double.parseDouble(format18)) {
                format18 = String.valueOf(a20);
            }
            String string20 = context.getString(R.string.basketball_points_in_paint);
            string20.getClass();
            Integer rankPerGame18 = pointsInPaint.getRankPerGame();
            b4.add(new bs1(string20, format18, rankPerGame18 != null ? rankPerGame18.intValue() : 0, null));
        }
        ezg.g(b2, string6, a.a(b4), km5Var);
        String string21 = context.getString(R.string.rebounds);
        string21.getClass();
        xbb b5 = a.b();
        for (Pair pair : b.j(new Pair(basketballRankedStatistics.getOffensiveRebounds(), Integer.valueOf(R.string.offensive)), new Pair(basketballRankedStatistics.getDefensiveRebounds(), Integer.valueOf(R.string.basketball_stat_rebounds_defensive)), new Pair(basketballRankedStatistics.getRebounds(), Integer.valueOf(R.string.total)))) {
            RankedStatistic rankedStatistic = (RankedStatistic) pair.a;
            int intValue = ((Number) pair.b).intValue();
            if (rankedStatistic != null) {
                Float value13 = rankedStatistic.getValue();
                double floatValue19 = (value13 != null ? value13.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / i2;
                String format19 = String.format(Locale.US, str2, Arrays.copyOf(new Object[]{Double.valueOf(floatValue19)}, i4));
                int a21 = wzb.a(floatValue19);
                str = str2;
                if (a21 == Double.parseDouble(format19)) {
                    format19 = String.valueOf(a21);
                }
                String string22 = context.getString(intValue);
                string22.getClass();
                Integer rankPerGame19 = rankedStatistic.getRankPerGame();
                b5.add(new bs1(string22, format19, rankPerGame19 != null ? rankPerGame19.intValue() : 0, null));
            } else {
                str = str2;
            }
            str2 = str;
            i4 = 1;
        }
        String str3 = str2;
        ezg.g(b2, string21, a.a(b5), km5.a);
        String string23 = context.getString(R.string.amf_defense);
        string23.getClass();
        xbb b6 = a.b();
        for (Pair pair2 : b.j(new Pair(basketballRankedStatistics.getBlocks(), Integer.valueOf(R.string.blocks)), new Pair(basketballRankedStatistics.getSteals(), Integer.valueOf(R.string.steals)))) {
            RankedStatistic rankedStatistic2 = (RankedStatistic) pair2.a;
            int intValue2 = ((Number) pair2.b).intValue();
            if (rankedStatistic2 != null) {
                Float value14 = rankedStatistic2.getValue();
                double floatValue20 = (value14 != null ? value14.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / i2;
                String format20 = String.format(Locale.US, str3, Arrays.copyOf(new Object[]{Double.valueOf(floatValue20)}, 1));
                int a22 = wzb.a(floatValue20);
                if (a22 == Double.parseDouble(format20)) {
                    format20 = String.valueOf(a22);
                }
                String string24 = context.getString(intValue2);
                string24.getClass();
                Integer rankPerGame20 = rankedStatistic2.getRankPerGame();
                b6.add(new bs1(string24, format20, rankPerGame20 != null ? rankPerGame20.intValue() : 0, null));
            }
        }
        RankedStatistic threePointsPercentageAgainst = basketballRankedStatistics.getThreePointsPercentageAgainst();
        if (threePointsPercentageAgainst != null) {
            double floatValue21 = threePointsPercentageAgainst.getValue() != null ? r7.floatValue() : 0.0d;
            String format21 = String.format(Locale.US, str3, Arrays.copyOf(new Object[]{Double.valueOf(floatValue21)}, 1));
            int a23 = wzb.a(floatValue21);
            if (a23 == Double.parseDouble(format21)) {
                format21 = String.valueOf(a23);
            }
            String y6 = dmi.y(format21, "%");
            String string25 = context.getString(R.string.three_points_percent_allowed);
            string25.getClass();
            Integer rankPerGame21 = threePointsPercentageAgainst.getRankPerGame();
            b6.add(new bs1(string25, y6, rankPerGame21 != null ? rankPerGame21.intValue() : 0, null));
        }
        RankedStatistic trueShootingPercentageAgainst = basketballRankedStatistics.getTrueShootingPercentageAgainst();
        if (trueShootingPercentageAgainst != null) {
            double floatValue22 = trueShootingPercentageAgainst.getValue() != null ? r7.floatValue() : 0.0d;
            String format22 = String.format(Locale.US, str3, Arrays.copyOf(new Object[]{Double.valueOf(floatValue22)}, 1));
            int a24 = wzb.a(floatValue22);
            if (a24 == Double.parseDouble(format22)) {
                format22 = String.valueOf(a24);
            }
            String y7 = dmi.y(format22, "%");
            String string26 = context.getString(R.string.basketball_opponent_true_shooting_pct);
            string26.getClass();
            Integer rankPerGame22 = trueShootingPercentageAgainst.getRankPerGame();
            b6.add(new bs1(string26, y7, rankPerGame22 != null ? rankPerGame22.intValue() : 0, null));
        }
        RankedStatistic offensiveFoulsAgainst = basketballRankedStatistics.getOffensiveFoulsAgainst();
        if (offensiveFoulsAgainst != null) {
            Float value15 = offensiveFoulsAgainst.getValue();
            double floatValue23 = (value15 != null ? value15.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / i2;
            String format23 = String.format(Locale.US, str3, Arrays.copyOf(new Object[]{Double.valueOf(floatValue23)}, 1));
            int a25 = wzb.a(floatValue23);
            if (a25 == Double.parseDouble(format23)) {
                format23 = String.valueOf(a25);
            }
            String string27 = context.getString(R.string.basketball_charges_drawn);
            string27.getClass();
            Integer rankPerGame23 = offensiveFoulsAgainst.getRankPerGame();
            b6.add(new bs1(string27, format23, rankPerGame23 != null ? rankPerGame23.intValue() : 0, null));
        }
        ezg.g(b2, string23, a.a(b6), km5.a);
        String string28 = context.getString(R.string.other);
        string28.getClass();
        xbb b7 = a.b();
        RankedStatistic turnovers = basketballRankedStatistics.getTurnovers();
        if (turnovers != null) {
            Float value16 = turnovers.getValue();
            double floatValue24 = (value16 != null ? value16.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / i2;
            String format24 = String.format(Locale.US, str3, Arrays.copyOf(new Object[]{Double.valueOf(floatValue24)}, 1));
            int a26 = wzb.a(floatValue24);
            if (a26 == Double.parseDouble(format24)) {
                format24 = String.valueOf(a26);
            }
            String string29 = context.getString(R.string.turnovers);
            string29.getClass();
            Integer rankPerGame24 = turnovers.getRankPerGame();
            b7.add(new bs1(string29, format24, rankPerGame24 != null ? rankPerGame24.intValue() : 0, null));
        }
        for (Pair pair3 : b.j(new Pair(basketballRankedStatistics.getTechnicalFouls(), Integer.valueOf(R.string.basketball_total_technical_fouls)), new Pair(basketballRankedStatistics.getFlagrantFouls(), Integer.valueOf(R.string.basketball_total_flagrant_fouls)))) {
            RankedStatistic rankedStatistic3 = (RankedStatistic) pair3.a;
            int intValue3 = ((Number) pair3.b).intValue();
            if (rankedStatistic3 != null) {
                String string30 = context.getString(intValue3);
                string30.getClass();
                Float value17 = rankedStatistic3.getValue();
                String j2 = yid.j(value17 != null ? Integer.valueOf(wzb.b(value17.floatValue())) : null);
                Integer rankTotal = rankedStatistic3.getRankTotal();
                b7.add(new bs1(string30, j2, rankTotal != null ? rankTotal.intValue() : 0, null));
            }
        }
        RankedStatistic pace = basketballRankedStatistics.getPace();
        if (pace != null) {
            String b8 = rei.b(1, Double.valueOf(pace.getValue() != null ? r7.floatValue() : 0.0d));
            String string31 = context.getString(R.string.basketball_pace_factor);
            string31.getClass();
            Integer rankPerGame25 = pace.getRankPerGame();
            b7.add(new bs1(string31, b8, rankPerGame25 != null ? rankPerGame25.intValue() : 0, null));
        }
        RankedStatistic offensiveRating = basketballRankedStatistics.getOffensiveRating();
        if (offensiveRating != null) {
            String b9 = rei.b(1, Double.valueOf(offensiveRating.getValue() != null ? r7.floatValue() : 0.0d));
            String string32 = context.getString(R.string.basketball_offensive_rating);
            string32.getClass();
            Integer rankPerGame26 = offensiveRating.getRankPerGame();
            b7.add(new bs1(string32, b9, rankPerGame26 != null ? rankPerGame26.intValue() : 0, null));
        }
        RankedStatistic defensiveRating = basketballRankedStatistics.getDefensiveRating();
        if (defensiveRating != null) {
            String b10 = rei.b(1, Double.valueOf(defensiveRating.getValue() != null ? r7.floatValue() : 0.0d));
            String string33 = context.getString(R.string.basketball_defensive_rating);
            string33.getClass();
            Integer rankPerGame27 = defensiveRating.getRankPerGame();
            b7.add(new bs1(string33, b10, rankPerGame27 != null ? rankPerGame27.intValue() : 0, null));
        }
        RankedStatistic netRating = basketballRankedStatistics.getNetRating();
        if (netRating != null) {
            String b11 = rei.b(1, Double.valueOf(netRating.getValue() != null ? r7.floatValue() : 0.0d));
            String string34 = context.getString(R.string.basketball_net_rating);
            string34.getClass();
            Integer rankPerGame28 = netRating.getRankPerGame();
            b7.add(new bs1(string34, b11, rankPerGame28 != null ? rankPerGame28.intValue() : 0, null));
        }
        for (Pair pair4 : b.j(new Pair(basketballRankedStatistics.getPersonalFouls(), Integer.valueOf(R.string.personal_fouls)), new Pair(basketballRankedStatistics.getPersonalFoulsAgainst(), Integer.valueOf(R.string.basketball_fouls_drawn)))) {
            RankedStatistic rankedStatistic4 = (RankedStatistic) pair4.a;
            int intValue4 = ((Number) pair4.b).intValue();
            if (rankedStatistic4 != null) {
                Float value18 = rankedStatistic4.getValue();
                double floatValue25 = (value18 != null ? value18.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / i2;
                String format25 = String.format(Locale.US, str3, Arrays.copyOf(new Object[]{Double.valueOf(floatValue25)}, 1));
                int a27 = wzb.a(floatValue25);
                if (a27 == Double.parseDouble(format25)) {
                    format25 = String.valueOf(a27);
                }
                String string35 = context.getString(intValue4);
                string35.getClass();
                Integer rankPerGame29 = rankedStatistic4.getRankPerGame();
                b7.add(new bs1(string35, format25, rankPerGame29 != null ? rankPerGame29.intValue() : 0, null));
            }
        }
        ezg.g(b2, string28, a.a(b7), km5.a);
        return a.a(b2);
    }

    public static final knb I(knb knbVar, int i2) {
        knb knbVar2;
        knb knbVar3 = null;
        if (cw3.a.contains(gvd.class)) {
            return null;
        }
        try {
            knbVar.getClass();
            int[] iArr = knbVar.a;
            int i3 = 0;
            int i4 = iArr[0];
            int i5 = iArr[1];
            int i6 = iArr[2];
            int i7 = (i5 - i2) + 1;
            knb knbVar4 = new knb(new int[]{i4, i7, i6});
            float[] fArr = knbVar.c;
            float[] fArr2 = knbVar4.c;
            int i8 = 0;
            while (i8 < i4) {
                int i9 = i3;
                while (i9 < i6) {
                    int i10 = i3;
                    while (i10 < i7) {
                        int i11 = i10 * i6;
                        int i12 = (i8 * i7 * i6) + i11 + i9;
                        int i13 = (i8 * i5 * i6) + i11 + i9;
                        fArr2[i12] = Float.MIN_VALUE;
                        int i14 = i3;
                        while (i14 < i2) {
                            knbVar2 = knbVar3;
                            try {
                                fArr2[i12] = Math.max(fArr2[i12], fArr[(i14 * i6) + i13]);
                                i14++;
                                knbVar3 = knbVar2;
                            } catch (Throwable th) {
                                th = th;
                                cw3.a(gvd.class, th);
                                return knbVar2;
                            }
                        }
                        i10++;
                        i3 = 0;
                    }
                    i9++;
                    i3 = 0;
                }
                i8++;
                i3 = 0;
            }
            return knbVar4;
        } catch (Throwable th2) {
            th = th2;
            knbVar2 = knbVar3;
        }
    }

    public static final knb J(knb knbVar, knb knbVar2) {
        if (cw3.a.contains(gvd.class)) {
            return null;
        }
        try {
            knbVar.getClass();
            knbVar2.getClass();
            int i2 = knbVar.a[0];
            int[] iArr = knbVar2.a;
            int i3 = iArr[0];
            int i4 = iArr[1];
            knb knbVar3 = new knb(new int[]{i2, i4});
            float[] fArr = knbVar.c;
            float[] fArr2 = knbVar2.c;
            float[] fArr3 = knbVar3.c;
            for (int i5 = 0; i5 < i2; i5++) {
                for (int i6 = 0; i6 < i4; i6++) {
                    int i7 = (i5 * i4) + i6;
                    fArr3[i7] = 0.0f;
                    for (int i8 = 0; i8 < i3; i8++) {
                        fArr3[i7] = (fArr[(i5 * i3) + i8] * fArr2[(i8 * i4) + i6]) + fArr3[i7];
                    }
                }
            }
            return knbVar3;
        } catch (Throwable th) {
            cw3.a(gvd.class, th);
            return null;
        }
    }

    public static final void K(knb knbVar) {
        if (cw3.a.contains(gvd.class)) {
            return;
        }
        try {
            knbVar.getClass();
            float[] fArr = knbVar.c;
            int length = fArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (fArr[i2] < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    fArr[i2] = 0.0f;
                }
            }
        } catch (Throwable th) {
            cw3.a(gvd.class, th);
        }
    }

    public static final void L(knb knbVar) {
        if (cw3.a.contains(gvd.class)) {
            return;
        }
        try {
            knbVar.getClass();
            int[] iArr = knbVar.a;
            int i2 = iArr[0];
            int i3 = iArr[1];
            float[] fArr = knbVar.c;
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = i4 * i3;
                int i6 = i5 + i3;
                float f2 = Float.MIN_VALUE;
                for (int i7 = i5; i7 < i6; i7++) {
                    float f3 = fArr[i7];
                    if (f3 > f2) {
                        f2 = f3;
                    }
                }
                float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                for (int i8 = i5; i8 < i6; i8++) {
                    float exp = (float) Math.exp(fArr[i8] - f2);
                    fArr[i8] = exp;
                    f4 += exp;
                }
                while (i5 < i6) {
                    fArr[i5] = fArr[i5] / f4;
                    i5++;
                }
            }
        } catch (Throwable th) {
            cw3.a(gvd.class, th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object M(int i2, Object obj, p1g p1gVar, wg8 wg8Var, int i3) {
        Object[] objArr;
        Object[] objArr2;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z = false;
        int i4 = 0;
        z = false;
        if ((i2 & 1) != 0 && !Intrinsics.c(p1gVar.b, wg8Var)) {
            wg8 wg8Var2 = wg8.d;
            if (wg8Var.compareTo(wg8Var2) >= 0 && Intrinsics.d(p1gVar.b.a, wg8Var2.a) < 0) {
                objArr = true;
                if ((i2 & 2) != 0) {
                    p1gVar.getClass();
                    if (i3 != 0) {
                        objArr2 = true;
                        if (objArr2 == true && objArr != true) {
                            return obj;
                        }
                        if (Build.VERSION.SDK_INT >= 28) {
                            int i5 = objArr != false ? wg8Var.a : p1gVar.b.a;
                            if (objArr2 != true) {
                                p1gVar.getClass();
                            } else if (i3 == 1) {
                                z = true;
                            }
                            return c90.e((Typeface) obj, i5, z);
                        }
                        Object[] objArr3 = objArr2 == true && i3 == 1;
                        if (objArr3 == true && objArr == true) {
                            i4 = 3;
                        } else if (objArr == true) {
                            i4 = 1;
                        } else if (objArr3 != false) {
                            i4 = 2;
                        }
                        return Typeface.create((Typeface) obj, i4);
                    }
                }
                objArr2 = false;
                if (objArr2 == true) {
                }
                if (Build.VERSION.SDK_INT >= 28) {
                }
            }
        }
        objArr = false;
        if ((i2 & 2) != 0) {
        }
        objArr2 = false;
        if (objArr2 == true) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
        }
    }

    public static final knb N(knb knbVar) {
        if (cw3.a.contains(gvd.class)) {
            return null;
        }
        try {
            int[] iArr = knbVar.a;
            int i2 = iArr[0];
            int i3 = iArr[1];
            knb knbVar2 = new knb(new int[]{i3, i2});
            float[] fArr = knbVar.c;
            float[] fArr2 = knbVar2.c;
            for (int i4 = 0; i4 < i2; i4++) {
                for (int i5 = 0; i5 < i3; i5++) {
                    fArr2[(i5 * i2) + i4] = fArr[(i4 * i3) + i5];
                }
            }
            return knbVar2;
        } catch (Throwable th) {
            cw3.a(gvd.class, th);
            return null;
        }
    }

    public static final knb O(knb knbVar) {
        if (cw3.a.contains(gvd.class)) {
            return null;
        }
        try {
            int[] iArr = knbVar.a;
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            knb knbVar2 = new knb(new int[]{i4, i3, i2});
            float[] fArr = knbVar.c;
            float[] fArr2 = knbVar2.c;
            for (int i5 = 0; i5 < i2; i5++) {
                for (int i6 = 0; i6 < i3; i6++) {
                    for (int i7 = 0; i7 < i4; i7++) {
                        fArr2[bf3.c(i6, i2, i7 * i2 * i3, i5)] = fArr[bf3.c(i6, i4, i5 * i3 * i4, i7)];
                    }
                }
            }
            return knbVar2;
        } catch (Throwable th) {
            cw3.a(gvd.class, th);
            return null;
        }
    }

    public static void P(String str) {
        throw new IllegalArgumentException(fc6.n("Unsupported type: ", str, ". ", lnb.o("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    public static final void a(ot9 ot9Var, bpf bpfVar, xtc xtcVar, op3 op3Var, of3 of3Var, int i2, int i3) {
        ot9 ot9Var2;
        hkh hkhVar;
        ry ryVar = ry.F;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2030202961);
        int i4 = ajk.b;
        av8Var.e0(402368983);
        hkh hkhVar2 = ot9Var.w.a;
        a99 a99Var = nf3.a;
        if (hkhVar2 == null) {
            if (op3Var.equals(mp3.f)) {
                hkhVar = new kpf(jjh.c);
            } else {
                av8Var.e0(-492369756);
                Object O = av8Var.O();
                if (O == a99Var) {
                    O = new gn3();
                    av8Var.n0(O);
                }
                av8Var.s(false);
                hkhVar = (hkh) O;
            }
            it9 a2 = ot9.a(ot9Var);
            a2.s = hkhVar;
            a2.b();
            ot9Var2 = a2.a();
        } else {
            ot9Var2 = ot9Var;
        }
        av8Var.s(false);
        int i5 = i2 >> 9;
        int i6 = 57344 & i5;
        av8Var.e0(-2020614074);
        Object obj = ot9Var2.b;
        if (obj instanceof it9) {
            a70.p("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
            return;
        }
        if (obj instanceof a10) {
            P("ImageBitmap");
            throw null;
        }
        if (obj instanceof ImageVector) {
            P("ImageVector");
            throw null;
        }
        if (obj instanceof d7e) {
            P("Painter");
            throw null;
        }
        if (ot9Var2.c != null) {
            a70.p("request.target must be null.");
            return;
        }
        av8Var.e0(-492369756);
        Object O2 = av8Var.O();
        if (O2 == a99Var) {
            O2 = new zj0(ot9Var2, bpfVar);
            av8Var.n0(O2);
        }
        av8Var.s(false);
        zj0 zj0Var = (zj0) O2;
        zj0Var.m = ryVar;
        zj0Var.n = op3Var;
        zj0Var.o = 1;
        zj0Var.p = ((Boolean) av8Var.k(f5a.a)).booleanValue();
        ((eoh) zj0Var.s).setValue(bpfVar);
        ((eoh) zj0Var.r).setValue(ot9Var2);
        zj0Var.a();
        av8Var.s(false);
        hkh hkhVar3 = ot9Var2.q;
        b(hkhVar3 instanceof gn3 ? xtcVar.z((xtc) hkhVar3) : xtcVar, zj0Var, op3Var, av8Var, ((i2 << 3) & 896) | (i5 & 7168) | i6 | (458752 & i5) | (3670016 & i5));
        eqf u = av8Var.u();
        if (u == null) {
            return;
        }
        u.d = new r20(ot9Var, bpfVar, xtcVar, op3Var, i2, i3, 1);
    }

    public static final void b(xtc xtcVar, zj0 zj0Var, op3 op3Var, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(10290533);
        xtc z = wnn.B(xtcVar).z(new jp3(zj0Var, op3Var));
        g00 g00Var = g00.e;
        av8Var.e0(544976794);
        kx4 kx4Var = (kx4) av8Var.k(dh3.h);
        ema emaVar = (ema) av8Var.k(dh3.n);
        hsk hskVar = (hsk) av8Var.k(dh3.t);
        if (z != utc.a) {
            z = fqj.C(av8Var, new xg3(av8Var.m()).z(z));
        }
        if3.k7.getClass();
        zg3 zg3Var = hf3.b;
        av8Var.e0(1405779621);
        av8Var.h0();
        if (av8Var.S) {
            av8Var.l(new gj0(0, zg3Var));
        } else {
            av8Var.q0();
        }
        av8Var.y = false;
        waa.K(av8Var, g00Var, hf3.g);
        waa.K(av8Var, kx4Var, hf3.e);
        waa.K(av8Var, emaVar, hf3.h);
        waa.K(av8Var, hskVar, hf3.i);
        waa.K(av8Var, z, hf3.d);
        av8Var.r();
        av8Var.s(true);
        av8Var.s(false);
        av8Var.s(false);
        eqf u = av8Var.u();
        if (u == null) {
            return;
        }
        u.d = new e00(xtcVar, zj0Var, op3Var, i2, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final mhj mhjVar, final mhj mhjVar2, final mhj mhjVar3, final long j2, xtc xtcVar, dfj dfjVar, long j3, float f2, of3 of3Var, final int i2, final int i3) {
        long j4;
        float f3;
        xtc xtcVar2;
        final float f4;
        final long j5;
        final dfj dfjVar2;
        eqf u;
        dfj dfjVar3;
        long j6;
        int i4;
        float f5;
        mhjVar.getClass();
        mhjVar2.getClass();
        mhjVar3.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1770405271);
        int i5 = i2 | (av8Var.g(mhjVar) ? 4 : 2) | (av8Var.g(mhjVar2) ? 32 : 16) | (av8Var.g(mhjVar3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.f(j2) ? com.ironsource.mediationsdk.metadata.a.o : 1024);
        int i6 = 90112 | i5;
        int i7 = i3 & 64;
        if (i7 != 0) {
            i6 = 1662976 | i5;
            j4 = j3;
        } else {
            j4 = j3;
            if ((i2 & 1572864) == 0) {
                i6 |= av8Var.f(j4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
        }
        int i8 = i3 & 128;
        if (i8 != 0) {
            i6 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            f3 = f2;
            i6 |= av8Var.d(f3) ? 8388608 : 4194304;
            if (av8Var.T(i6 & 1, (4793491 & i6) == 4793490)) {
                av8Var.W();
                xtcVar2 = xtcVar;
                f4 = f3;
                j5 = j4;
                dfjVar2 = dfjVar;
            } else {
                av8Var.Y();
                int i9 = i2 & 1;
                utc utcVar = utc.a;
                if (i9 == 0 || av8Var.B()) {
                    yf8 yf8Var = xth.a;
                    dfj i10 = xth.i();
                    int i11 = i6 & (-458753);
                    if (i7 != 0) {
                        j4 = v8a.v(12);
                    }
                    if (i8 != 0) {
                        dfjVar3 = i10;
                        j6 = j4;
                        xtcVar2 = utcVar;
                        f5 = 8.0f;
                        i4 = i11;
                        av8Var.t();
                        l8g a2 = k8g.a(ww9.b, uxf.l, av8Var, 48);
                        int hashCode = Long.hashCode(av8Var.T);
                        aee m = av8Var.m();
                        xtc C = fqj.C(av8Var, xtcVar2);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.q0();
                        } else {
                            av8Var.l(zg3Var);
                        }
                        waa.K(av8Var, a2, hf3.g);
                        waa.K(av8Var, m, hf3.f);
                        waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                        waa.J(av8Var, hf3.k);
                        waa.K(av8Var, C, hf3.d);
                        int i12 = i4 >> 6;
                        int i13 = i12 & 112;
                        int i14 = (i4 >> 9) & 7168;
                        aba.p(mhjVar, j2, dfjVar3, j6, av8Var, (i4 & 14) | i13 | i14);
                        int i15 = i4 >> 3;
                        int i16 = (i15 & 896) | 6;
                        float f6 = f5;
                        dfj dfjVar4 = dfjVar3;
                        udj.c(":", l98.d0(utcVar, f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), j2, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, dfjVar4, av8Var, i16, 0, 130040);
                        aba.p(mhjVar2, j2, dfjVar3, j6, av8Var, (i15 & 14) | i13 | i14);
                        udj.c(":", l98.d0(utcVar, f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), j2, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, dfjVar4, av8Var, i16, 0, 130040);
                        aba.p(mhjVar3, j2, dfjVar3, j6, av8Var, (i12 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | i14);
                        av8Var.s(true);
                        dfjVar2 = dfjVar3;
                        f4 = f6;
                        j5 = j6;
                    } else {
                        dfjVar3 = i10;
                        j6 = j4;
                        xtcVar2 = utcVar;
                        i4 = i11;
                    }
                } else {
                    av8Var.W();
                    xtcVar2 = xtcVar;
                    dfjVar3 = dfjVar;
                    j6 = j4;
                    i4 = i6 & (-458753);
                }
                f5 = f3;
                av8Var.t();
                l8g a22 = k8g.a(ww9.b, uxf.l, av8Var, 48);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, xtcVar2);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                }
                waa.K(av8Var, a22, hf3.g);
                waa.K(av8Var, m2, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C2, hf3.d);
                int i122 = i4 >> 6;
                int i132 = i122 & 112;
                int i142 = (i4 >> 9) & 7168;
                aba.p(mhjVar, j2, dfjVar3, j6, av8Var, (i4 & 14) | i132 | i142);
                int i152 = i4 >> 3;
                int i162 = (i152 & 896) | 6;
                float f62 = f5;
                dfj dfjVar42 = dfjVar3;
                udj.c(":", l98.d0(utcVar, f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), j2, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, dfjVar42, av8Var, i162, 0, 130040);
                aba.p(mhjVar2, j2, dfjVar3, j6, av8Var, (i152 & 14) | i132 | i142);
                udj.c(":", l98.d0(utcVar, f62, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), j2, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, dfjVar42, av8Var, i162, 0, 130040);
                aba.p(mhjVar3, j2, dfjVar3, j6, av8Var, (i122 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | i142);
                av8Var.s(true);
                dfjVar2 = dfjVar3;
                f4 = f62;
                j5 = j6;
            }
            u = av8Var.u();
            if (u == null) {
                final xtc xtcVar3 = xtcVar2;
                u.d = new Function2() { // from class: wu3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        gvd.c(mhj.this, mhjVar2, mhjVar3, j2, xtcVar3, dfjVar2, j5, f4, (of3) obj, aba.K(i2 | 1), i3);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        f3 = f2;
        if (av8Var.T(i6 & 1, (4793491 & i6) == 4793490)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void d(final int i2, final int i3, final int i4, of3 of3Var) {
        int i5;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-381459697);
        if ((i4 & 6) == 0) {
            i5 = (av8Var.e(i2) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= av8Var.e(i3) ? 32 : 16;
        }
        if (av8Var.T(i5 & 1, (i5 & 19) != 18)) {
            boolean z = av8Var.k(dh3.n) == ema.b;
            g28 g28Var = bkh.c;
            e12.a(6, av8Var, n9e.q(g28Var, r13.b, oyn.e));
            xtc D = f6a.D(g28Var, 1.7f, 1.7f);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, D);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String R = pco.R(z ? i3 : i2);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            xtc u = yqo.u(rd0.O(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), -16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 100.0f, 100.0f, null);
            q1f q1fVar = mp3.b;
            haa.a(R, null, u, null, q1fVar, av8Var, 1572912, 1976);
            String R2 = pco.R(z ? i2 : i3);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            haa.a(R2, null, yqo.u(rd0.O(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 100.0f, 100.0f, null), null, q1fVar, av8Var, 1572912, 1976);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new Function2() { // from class: ht5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(i4 | 1);
                    gvd.d(i2, i3, K, (of3) obj);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0336  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(hm hmVar, dm dmVar, r9k r9kVar, Boolean bool, boolean z, int i2, int i3, xtc xtcVar, of3 of3Var, int i4) {
        int i5;
        Integer num;
        int i6;
        Integer num2;
        float f2;
        Integer num3;
        Integer num4;
        boolean z2;
        Boolean bool2;
        or5 or5Var;
        int i7;
        boolean z3;
        boolean z4;
        boolean z5;
        Boolean bool3 = bool;
        r9kVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1955628147);
        int i8 = i4 | (av8Var.g(hmVar) ? 4 : 2) | (av8Var.g(dmVar) ? 32 : 16) | (av8Var.g(r9kVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(bool3) ? com.ironsource.mediationsdk.metadata.a.o : 1024) | (av8Var.h(z) ? 16384 : 8192) | (av8Var.e(i2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.e(i3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var.g(xtcVar) ? 8388608 : 4194304);
        if (av8Var.T(i8 & 1, (4793491 & i8) != 4793490)) {
            Context context = (Context) av8Var.k(nz.b);
            or5 or5Var2 = null;
            if (!z) {
                i5 = hmVar.d;
            } else if (dmVar != null) {
                i5 = dmVar.e;
            } else {
                num = null;
                if (z) {
                    i6 = hmVar.e;
                } else if (dmVar != null) {
                    i6 = dmVar.f;
                } else {
                    num2 = null;
                    int i9 = z ? R.string.generated_at_halftime : R.string.generated_before_match_start;
                    Integer num5 = num;
                    xtc h2 = ljg.h(16.0f, bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var), 8.0f);
                    u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, h2);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a2, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    utc utcVar = utc.a;
                    xtc f0 = l98.f0(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    String v = oea.v(R.string.ai_match_forecast_title, av8Var);
                    yf8 yf8Var = xth.a;
                    Integer num6 = num2;
                    udj.c(v, f0, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 48, 0, 131064);
                    udj.c(oea.v(i9, av8Var), l98.f0(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 48, 0, 131064);
                    if (z || dmVar == null) {
                        f2 = 8.0f;
                        boolean z6 = false;
                        av8Var.d0(-536387970);
                        num3 = hmVar.a;
                        if (num3 == null) {
                            av8Var.d0(-536359668);
                            av8Var.s(false);
                        } else {
                            av8Var.d0(-536359667);
                            n9e.d(0, 28, av8Var, null, oea.v(R.string.football_total_yellow_cards, av8Var), String.valueOf(num3.intValue()), null, null);
                            Unit unit = Unit.a;
                            z6 = false;
                            av8Var.s(false);
                        }
                        num4 = hmVar.b;
                        if (num4 == null) {
                            av8Var.d0(-536094959);
                            av8Var.s(z6);
                            z2 = z6;
                        } else {
                            av8Var.d0(-536094958);
                            n9e.d(0, 28, av8Var, null, oea.v(R.string.football_total_corners, av8Var), String.valueOf(num4.intValue()), null, null);
                            Unit unit2 = Unit.a;
                            z2 = false;
                            av8Var.s(false);
                        }
                        bool2 = hmVar.c;
                        if (bool2 == null) {
                            av8Var.d0(-535824174);
                            av8Var.s(z2);
                        } else {
                            av8Var.d0(-535824173);
                            n9e.d(0, 28, av8Var, null, oea.v(R.string.both_teams_to_score, av8Var), bool2.booleanValue() ? ljg.k(av8Var, 1265156057, R.string.yes, av8Var, z2) : ljg.k(av8Var, 1265157304, R.string.no, av8Var, z2), null, null);
                            Unit unit3 = Unit.a;
                            av8Var.s(z2);
                        }
                        av8Var.s(z2);
                    } else {
                        av8Var.d0(-537525298);
                        String str = dmVar.c;
                        if (str == null) {
                            av8Var.d0(-537500871);
                            av8Var.s(false);
                            f2 = 8.0f;
                            i7 = R.string.yes;
                            z3 = false;
                        } else {
                            av8Var.d0(-537500870);
                            String v2 = oea.v(R.string.football_scores_next_goal, av8Var);
                            f2 = 8.0f;
                            i7 = R.string.yes;
                            n9e.d(0, 28, av8Var, null, v2, str, null, null);
                            Unit unit4 = Unit.a;
                            z3 = false;
                            av8Var.s(false);
                        }
                        Boolean bool4 = dmVar.d;
                        if (bool4 == null) {
                            av8Var.d0(-537215578);
                            av8Var.s(z3);
                            z4 = z3;
                        } else {
                            av8Var.d0(-537215577);
                            boolean booleanValue = bool4.booleanValue();
                            String v3 = oea.v(R.string.football_over_goals_second_half, av8Var);
                            String k = booleanValue ? ljg.k(av8Var, 2134570275, i7, av8Var, z3) : ljg.k(av8Var, 2134571522, R.string.no, av8Var, z3);
                            z4 = z3;
                            n9e.d(0, 28, av8Var, null, v3, k, null, null);
                            Unit unit5 = Unit.a;
                            av8Var.s(z4);
                        }
                        String str2 = dmVar.b;
                        if (str2 == null) {
                            av8Var.d0(-536865402);
                            av8Var.s(z4);
                            z5 = z4;
                        } else {
                            av8Var.d0(-536865401);
                            String v4 = oea.v(R.string.football_scores_in_second_half, av8Var);
                            boolean i10 = ((i8 & 112) == 32) | av8Var.i(context);
                            Object O = av8Var.O();
                            if (i10 || O == nf3.a) {
                                O = new h84(11, context, (Object) dmVar);
                                av8Var.n0(O);
                            }
                            n9e.d(0, 20, av8Var, null, v4, str2, null, (Function0) O);
                            Unit unit6 = Unit.a;
                            z5 = false;
                            av8Var.s(false);
                        }
                        av8Var.s(z5);
                    }
                    n9e.d(0, 28, av8Var, null, oea.v(Intrinsics.c(num5, num6) ? R.string.football_full_time_outcome : R.string.football_full_time_winner, av8Var), r9kVar.a(av8Var), null, null);
                    xtc q = n9e.q(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.surface_2, av8Var), o7g.a(f2));
                    or5Var = hmVar.f;
                    if (or5Var != null && !z) {
                        or5Var2 = or5Var;
                    }
                    bool3 = bool;
                    int i11 = i8 >> 15;
                    ktm.d(i2, i3, or5Var2, Intrinsics.c(bool3, Boolean.TRUE), true, q, av8Var, (i11 & 14) | 196608 | (i11 & 112));
                    av8Var = av8Var;
                    av8Var.s(true);
                }
                num2 = Integer.valueOf(i6);
                int i92 = z ? R.string.generated_at_halftime : R.string.generated_before_match_start;
                Integer num52 = num;
                xtc h22 = ljg.h(16.0f, bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var), 8.0f);
                u23 a22 = t23.a(ww9.d, uxf.o, av8Var, 0);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, h22);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                }
                waa.K(av8Var, a22, hf3.g);
                waa.K(av8Var, m2, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C2, hf3.d);
                utc utcVar2 = utc.a;
                xtc f02 = l98.f0(l98.d0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                String v5 = oea.v(R.string.ai_match_forecast_title, av8Var);
                yf8 yf8Var2 = xth.a;
                Integer num62 = num2;
                udj.c(v5, f02, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 48, 0, 131064);
                udj.c(oea.v(i92, av8Var), l98.f0(l98.d0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 48, 0, 131064);
                if (z) {
                }
                f2 = 8.0f;
                boolean z62 = false;
                av8Var.d0(-536387970);
                num3 = hmVar.a;
                if (num3 == null) {
                }
                num4 = hmVar.b;
                if (num4 == null) {
                }
                bool2 = hmVar.c;
                if (bool2 == null) {
                }
                av8Var.s(z2);
                n9e.d(0, 28, av8Var, null, oea.v(Intrinsics.c(num52, num62) ? R.string.football_full_time_outcome : R.string.football_full_time_winner, av8Var), r9kVar.a(av8Var), null, null);
                xtc q2 = n9e.q(l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.surface_2, av8Var), o7g.a(f2));
                or5Var = hmVar.f;
                if (or5Var != null) {
                    or5Var2 = or5Var;
                }
                bool3 = bool;
                int i112 = i8 >> 15;
                ktm.d(i2, i3, or5Var2, Intrinsics.c(bool3, Boolean.TRUE), true, q2, av8Var, (i112 & 14) | 196608 | (i112 & 112));
                av8Var = av8Var;
                av8Var.s(true);
            }
            num = Integer.valueOf(i5);
            if (z) {
            }
            num2 = Integer.valueOf(i6);
            int i922 = z ? R.string.generated_at_halftime : R.string.generated_before_match_start;
            Integer num522 = num;
            xtc h222 = ljg.h(16.0f, bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var), 8.0f);
            u23 a222 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode22 = Long.hashCode(av8Var.T);
            aee m22 = av8Var.m();
            xtc C22 = fqj.C(av8Var, h222);
            if3.k7.getClass();
            zg3 zg3Var22 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
            }
            waa.K(av8Var, a222, hf3.g);
            waa.K(av8Var, m22, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode22), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C22, hf3.d);
            utc utcVar22 = utc.a;
            xtc f022 = l98.f0(l98.d0(utcVar22, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            String v52 = oea.v(R.string.ai_match_forecast_title, av8Var);
            yf8 yf8Var22 = xth.a;
            Integer num622 = num2;
            udj.c(v52, f022, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 48, 0, 131064);
            udj.c(oea.v(i922, av8Var), l98.f0(l98.d0(utcVar22, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 48, 0, 131064);
            if (z) {
            }
            f2 = 8.0f;
            boolean z622 = false;
            av8Var.d0(-536387970);
            num3 = hmVar.a;
            if (num3 == null) {
            }
            num4 = hmVar.b;
            if (num4 == null) {
            }
            bool2 = hmVar.c;
            if (bool2 == null) {
            }
            av8Var.s(z2);
            n9e.d(0, 28, av8Var, null, oea.v(Intrinsics.c(num522, num622) ? R.string.football_full_time_outcome : R.string.football_full_time_winner, av8Var), r9kVar.a(av8Var), null, null);
            xtc q22 = n9e.q(l98.f0(utcVar22, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.surface_2, av8Var), o7g.a(f2));
            or5Var = hmVar.f;
            if (or5Var != null) {
            }
            bool3 = bool;
            int i1122 = i8 >> 15;
            ktm.d(i2, i3, or5Var2, Intrinsics.c(bool3, Boolean.TRUE), true, q22, av8Var, (i1122 & 14) | 196608 | (i1122 & 112));
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vr5(hmVar, dmVar, r9kVar, bool3, z, i2, i3, xtcVar, i4);
        }
    }

    public static final void f(final int i2, final int i3, final String str, final Integer num, final int i4, xtc xtcVar, of3 of3Var, int i5) {
        av8 av8Var;
        xtc xtcVar2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(2127553974);
        int i6 = i5 | (av8Var2.e(i2) ? 4 : 2) | (av8Var2.e(i3) ? 32 : 16) | (av8Var2.g(str) ? 256 : 128) | (av8Var2.g(num) ? 2048 : 1024) | (av8Var2.e(i4) ? 16384 : 8192) | 196608;
        if (av8Var2.T(i6 & 1, (74899 & i6) != 74898)) {
            if (Build.VERSION.SDK_INT >= 31) {
                av8Var2.d0(1128290754);
                if (wyh.e(str) || str.equals(Sports.MINI_FOOTBALL)) {
                    av8Var2.d0(1128376376);
                    m(num, i4, av8Var2, (i6 >> 9) & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
                    av8Var2.s(false);
                } else {
                    av8Var2.d0(1128465470);
                    d(i2, i3, (i6 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | 384, av8Var2);
                    av8Var2.s(false);
                }
                av8Var2.s(false);
                av8Var = av8Var2;
            } else {
                av8Var2.d0(1128590090);
                g28 g28Var = bkh.c;
                Object O = av8Var2.O();
                a99 a99Var = nf3.a;
                if (O == a99Var) {
                    O = new qz4(29);
                    av8Var2.n0(O);
                }
                Function1 function1 = (Function1) O;
                boolean z = ((i6 & 112) == 32) | ((i6 & 14) == 4) | ((i6 & 896) == 256) | ((i6 & 7168) == 2048) | ((57344 & i6) == 16384);
                Object O2 = av8Var2.O();
                if (z || O2 == a99Var) {
                    Function1 function12 = new Function1() { // from class: ft5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            yy0 qy0Var;
                            ImageView imageView = (ImageView) obj;
                            imageView.getClass();
                            g6b t = qea.t(imageView);
                            if (t != null && imageView.getDrawable() == null) {
                                Context context = imageView.getContext();
                                context.getClass();
                                hkj hkjVar = new hkj(context);
                                String str2 = str;
                                if (wyh.e(str2) || str2.equals(Sports.MINI_FOOTBALL)) {
                                    Integer num2 = num;
                                    qy0Var = new qy0(num2 != null ? num2.intValue() : 0, i4);
                                } else {
                                    qy0Var = new my0(i2, i3);
                                }
                                hkjVar.c(qy0Var, t);
                                imageView.setImageDrawable(hkjVar);
                            }
                            return Unit.a;
                        }
                    };
                    av8Var2.n0(function12);
                    O2 = function12;
                }
                av8Var = av8Var2;
                td4.a(function1, g28Var, (Function1) O2, av8Var, 6, 0);
                av8Var.s(false);
            }
            xtcVar2 = utc.a;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gt5(i2, i3, str, num, i4, xtcVar2, i5);
        }
    }

    public static final void g(c17 c17Var, of3 of3Var, int i2) {
        c17Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1534405847);
        int i3 = (av8Var.i(c17Var) ? 4 : 2) | i2;
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            wkn.a(Boolean.valueOf(c17Var.c), null, null, null, yqo.H(-107589558, av8Var, new b17(c17Var, i4)), av8Var, 24576, 14);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new jo6(c17Var, i2, 15);
        }
    }

    public static final void h(String str, int i2, int i3, int i4, boolean z, xtc xtcVar, of3 of3Var, int i5, int i6) {
        xtc xtcVar2;
        int i7;
        xtc xtcVar3;
        boolean z2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-166335759);
        int i8 = i5 | (av8Var.g(str) ? 4 : 2) | (av8Var.e(i2) ? 32 : 16) | (av8Var.e(i3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.e(i4) ? com.ironsource.mediationsdk.metadata.a.o : 1024) | (av8Var.h(z) ? 16384 : 8192);
        int i9 = i6 & 32;
        if (i9 != 0) {
            i7 = i8 | 196608;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i7 = i8 | (av8Var.g(xtcVar2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        }
        if (av8Var.T(i7 & 1, (74899 & i7) != 74898)) {
            utc utcVar = utc.a;
            xtc xtcVar4 = i9 != 0 ? utcVar : xtcVar2;
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            kv1 kv1Var = uxf.p;
            xtc c0 = l98.c0(n9e.q(bkh.d(xtcVar4, 0.5f), lz.D(R.color.darken_overlay_1, av8Var), o7g.a(8.0f)), 16.0f, 8.0f);
            u23 a2 = t23.a(ng0Var, kv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            yf8 yf8Var = xth.a;
            dfj b2 = xth.b();
            long j2 = r13.d;
            xtc xtcVar5 = xtcVar4;
            udj.c(str, null, j2, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, b2, av8Var, (i7 & 14) | 384, 24960, 110586);
            av8 av8Var2 = av8Var;
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var2, 48);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, utcVar);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            if (i4 != 0) {
                av8Var2.d0(565856167);
                long j3 = i4 > 0 ? vrh.a : vrh.b;
                float f2 = i4 > 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 180.0f;
                if (z) {
                    av8Var2.d0(566049700);
                    kq9.b(s6a.N(R.drawable.ic_position_arrow_up_8, 6, av8Var2), null, bkh.l(haa.v(utcVar, f2), 16.0f), j3, av8Var2, 48, 0);
                    z2 = false;
                    av8Var2.s(false);
                } else {
                    z2 = false;
                    av8Var2.d0(566439556);
                    udj.c(String.valueOf(i4), null, j3, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var2, 0, 24960, 110586);
                    av8Var2 = av8Var2;
                    kq9.b(s6a.N(R.drawable.ic_position_arrow_up_8, 6, av8Var2), null, ljg.i(utcVar, 2.0f, av8Var2, utcVar, 8.0f), j3, av8Var2, 432, 0);
                    av8Var2.s(false);
                }
                bf3.u(utcVar, 4.0f, av8Var2, z2);
            } else {
                av8Var2.d0(567151595);
                av8Var2.s(false);
            }
            List list = dla.a;
            av8 av8Var3 = av8Var2;
            udj.c(dla.i(Integer.valueOf(i2)), null, j2, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.h(), av8Var3, 384, 24960, 110586);
            av8Var3.s(true);
            udj.c(oea.w(R.string.fantasy_rank_of_n, new Object[]{dla.i(Integer.valueOf(i3))}, av8Var3), null, lz.D(R.color.on_color_secondary, av8Var3), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var3, 0, 24960, 110586);
            av8Var = av8Var3;
            av8Var.s(true);
            xtcVar3 = xtcVar5;
        } else {
            av8Var.W();
            xtcVar3 = xtcVar2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new qz0(str, i2, i3, i4, z, xtcVar3, i5, i6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(final dm7 dm7Var, final int i2, final boolean z, xtc xtcVar, float f2, of3 of3Var, final int i3, final int i4) {
        xtc xtcVar2;
        int i5;
        float f3;
        final xtc xtcVar3;
        final float f4;
        eqf u;
        dm7Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-381825852);
        int i6 = (av8Var.g(dm7Var) ? 4 : 2) | i3 | (av8Var.e(i2) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i7 = i4 & 8;
        if (i7 != 0) {
            i5 = i6 | 3072;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i5 = i6 | (av8Var.g(xtcVar2) ? com.ironsource.mediationsdk.metadata.a.o : 1024);
        }
        int i8 = i4 & 16;
        if (i8 != 0) {
            i5 |= 24576;
        } else if ((i3 & 24576) == 0) {
            f3 = f2;
            i5 |= av8Var.d(f3) ? 16384 : 8192;
            if (av8Var.T(i5 & 1, (i5 & 9363) == 9362)) {
                av8Var.W();
                xtcVar3 = xtcVar2;
                f4 = f3;
            } else {
                utc utcVar = utc.a;
                xtc xtcVar4 = i7 != 0 ? utcVar : xtcVar2;
                if (i8 != 0) {
                    f3 = 8.0f;
                }
                Context context = (Context) av8Var.k(nz.b);
                lv1 lv1Var = uxf.m;
                xtc d2 = bkh.d(xtcVar4, 1.0f);
                boolean i9 = av8Var.i(context) | ((i5 & 14) == 4);
                Object O = av8Var.O();
                if (i9 || O == nf3.a) {
                    O = new n37(17, context, dm7Var);
                    av8Var.n0(O);
                }
                float f5 = f3;
                xtc xtcVar5 = xtcVar4;
                xtc c0 = l98.c0(tol.y(d2, false, false, false, 0L, null, (Function0) O, av8Var, 31), f5, 8.0f);
                wxf wxfVar = ww9.b;
                l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 48);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, c0);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                f50 f50Var = hf3.g;
                waa.K(av8Var, a2, f50Var);
                ff3 ff3Var = hf3.f;
                waa.K(av8Var, m, ff3Var);
                Integer valueOf = Integer.valueOf(hashCode);
                f50 f50Var2 = hf3.j;
                waa.K(av8Var, valueOf, f50Var2);
                ry ryVar = hf3.k;
                waa.J(av8Var, ryVar);
                f50 f50Var3 = hf3.d;
                waa.K(av8Var, C, f50Var3);
                xtc p = bkh.p(utcVar, 24.0f);
                k1c c2 = e12.c(uxf.g, false);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, p);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c2, f50Var);
                waa.K(av8Var, m2, ff3Var);
                bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C2, f50Var3);
                String p2 = yid.p(i2);
                yf8 yf8Var = xth.a;
                fqj.a(p2, xth.g(), lz.D(R.color.n_lv_1, av8Var), null, null, av8Var, 0, 24);
                i.o(av8Var, true, utcVar, 8.0f, av8Var);
                wnn.l(dm7Var.a, dm7Var.c, z, bkh.l(utcVar, 40.0f), dm7Var.e.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, av8Var, (i5 & 896) | 1575936, 160);
                goa d3 = bf3.d(utcVar, 16.0f, av8Var, 1.0f, true);
                u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
                int hashCode3 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C3 = fqj.C(av8Var, d3);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a3, f50Var);
                waa.K(av8Var, m3, ff3Var);
                bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C3, f50Var3);
                l8g a4 = k8g.a(wxfVar, lv1Var, av8Var, 48);
                int hashCode4 = Long.hashCode(av8Var.T);
                aee m4 = av8Var.m();
                xtc C4 = fqj.C(av8Var, utcVar);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a4, f50Var);
                waa.K(av8Var, m4, ff3Var);
                bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C4, f50Var3);
                udj.c(dm7Var.d, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110586);
                bf3.t(av8Var, true, utcVar, 4.0f, av8Var);
                udj.c(lnb.o(dm7Var.f, " · ", dm7Var.i), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
                av8Var.s(true);
                String str = dm7Var.g;
                context.getClass();
                str.getClass();
                String string = context.getString(R.string.n_points, str);
                string.getClass();
                udj.c(string, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 110586);
                av8Var = av8Var;
                av8Var.s(true);
                xtcVar3 = xtcVar5;
                f4 = f5;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new Function2() { // from class: lm7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        gvd.i(dm7.this, i2, z, xtcVar3, f4, (of3) obj, aba.K(i3 | 1), i4);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        f3 = f2;
        if (av8Var.T(i5 & 1, (i5 & 9363) == 9362)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(final kj7 kj7Var, final Function1 function1, final boolean z, xtc xtcVar, float f2, of3 of3Var, final int i2, final int i3) {
        int i4;
        xtc xtcVar2;
        int i5;
        float f3;
        int i6;
        final xtc xtcVar3;
        final float f4;
        eqf u;
        utc utcVar;
        a99 a99Var;
        Context context;
        float f5;
        lv1 lv1Var;
        xtc xtcVar4;
        float f6;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(411520843);
        if ((i2 & 6) == 0) {
            i4 = (av8Var.g(kj7Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var.g(xtcVar2) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                f3 = f2;
                i4 |= av8Var.d(f3) ? 16384 : 8192;
                i6 = i4;
                if (av8Var.T(i6 & 1, (i6 & 9363) != 9362)) {
                    utc utcVar2 = utc.a;
                    xtc xtcVar5 = i7 != 0 ? utcVar2 : xtcVar2;
                    if (i5 != 0) {
                        f3 = 8.0f;
                    }
                    Context context2 = (Context) av8Var.k(nz.b);
                    lv1 lv1Var2 = uxf.m;
                    av8Var.d0(334551925);
                    xtc d2 = bkh.d(xtcVar5, 1.0f);
                    xtc xtcVar6 = xtcVar5;
                    a99 a99Var2 = nf3.a;
                    if (function1 != null) {
                        boolean z2 = ((i6 & 14) == 4) | ((i6 & 112) == 32);
                        Object O = av8Var.O();
                        if (z2 || O == a99Var2) {
                            O = new n37(18, (Object) kj7Var, function1);
                            av8Var.n0(O);
                        }
                        lv1Var = lv1Var2;
                        xtcVar4 = xtcVar6;
                        a99Var = a99Var2;
                        f5 = f3;
                        context = context2;
                        f6 = 8.0f;
                        xtc y = tol.y(utcVar2, false, false, false, 0L, null, (Function0) O, av8Var, 31);
                        utcVar = utcVar2;
                        av8Var = av8Var;
                        d2 = d2.z(y);
                    } else {
                        utcVar = utcVar2;
                        a99Var = a99Var2;
                        context = context2;
                        f5 = f3;
                        lv1Var = lv1Var2;
                        xtcVar4 = xtcVar6;
                        f6 = 8.0f;
                    }
                    av8Var.s(false);
                    xtc c0 = l98.c0(d2, f5, f6);
                    l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, c0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var, a2, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var, C, f50Var3);
                    xtc p = bkh.p(utcVar, 36.0f);
                    k1c c2 = e12.c(uxf.g, false);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, p);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, c2, f50Var);
                    waa.K(av8Var, m2, ff3Var);
                    bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C2, f50Var3);
                    String str = kj7Var.c;
                    FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = kj7Var.a;
                    yf8 yf8Var = xth.a;
                    float f7 = f5;
                    fqj.a(str, xth.g(), lz.D(R.color.n_lv_1, av8Var), null, null, av8Var, 0, 24);
                    i.o(av8Var, true, utcVar, 8.0f, av8Var);
                    utc utcVar3 = utcVar;
                    av8 av8Var2 = av8Var;
                    wnn.l(fantasyRoundPlayerUiModel.a, fantasyRoundPlayerUiModel.h, z, bkh.l(utcVar, 40.0f), fantasyRoundPlayerUiModel.b.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, av8Var2, (i6 & 896) | 3072, 224);
                    goa d3 = bf3.d(utcVar3, 16.0f, av8Var2, 1.0f, true);
                    u23 a3 = t23.a(ww9.d, uxf.o, av8Var2, 0);
                    int hashCode3 = Long.hashCode(av8Var2.T);
                    aee m3 = av8Var2.m();
                    xtc C3 = fqj.C(av8Var2, d3);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a3, f50Var);
                    waa.K(av8Var2, m3, ff3Var);
                    bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
                    waa.K(av8Var2, C3, f50Var3);
                    FantasyPlayerUiModel fantasyPlayerUiModel = fantasyRoundPlayerUiModel.g;
                    String str2 = fantasyPlayerUiModel.g;
                    if (str2 == null) {
                        str2 = fantasyPlayerUiModel.f;
                    }
                    udj.c(str2, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var2, 0, 24960, 110586);
                    av8 av8Var3 = av8Var2;
                    List list = fantasyRoundPlayerUiModel.x;
                    if (list.isEmpty()) {
                        list = null;
                    }
                    List list2 = list;
                    if (list2 == null) {
                        av8Var3.d0(1458788103);
                        av8Var3.s(false);
                    } else {
                        bf3.r(4.0f, 1458788104, av8Var3, av8Var3, utcVar3);
                        av8Var3.d0(1432534316);
                        StringBuilder sb = new StringBuilder();
                        if (z) {
                            sb.append(fantasyRoundPlayerUiModel.j + " · ");
                        }
                        Object O2 = av8Var3.O();
                        if (O2 == a99Var) {
                            O2 = new gl7(2);
                            av8Var3.n0(O2);
                        }
                        sb.append("vs ".concat(CollectionsKt.f0(list2, ", ", null, null, (Function1) O2, 30)));
                        String sb2 = sb.toString();
                        av8Var3.s(false);
                        udj.c(sb2, null, lz.D(R.color.n_lv_3, av8Var3), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var3, 0, 24960, 110586);
                        av8Var3 = av8Var3;
                        Unit unit = Unit.a;
                        av8Var3.s(false);
                    }
                    i.o(av8Var3, true, utcVar3, 16.0f, av8Var3);
                    Integer num = fantasyRoundPlayerUiModel.n;
                    int intValue = num != null ? num.intValue() : 0;
                    context.getClass();
                    String valueOf2 = String.valueOf(intValue);
                    valueOf2.getClass();
                    String string = context.getString(R.string.n_points, valueOf2);
                    string.getClass();
                    av8 av8Var4 = av8Var3;
                    udj.c(string, null, lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var4, 0, 24960, 110586);
                    av8Var = av8Var4;
                    av8Var.s(true);
                    f4 = f7;
                    xtcVar3 = xtcVar4;
                } else {
                    av8Var.W();
                    xtcVar3 = xtcVar2;
                    f4 = f3;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new Function2() { // from class: mm7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            gvd.j(kj7.this, function1, z, xtcVar3, f4, (of3) obj, aba.K(i2 | 1), i3);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            f3 = f2;
            i6 = i4;
            if (av8Var.T(i6 & 1, (i6 & 9363) != 9362)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        f3 = f2;
        i6 = i4;
        if (av8Var.T(i6 & 1, (i6 & 9363) != 9362)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void k(String str, int i2, x43 x43Var, boolean z, xtc xtcVar, String str2, Function0 function0, of3 of3Var, int i3, int i4) {
        String str3;
        int i5;
        Function0 function02;
        int i6;
        Function0 function03;
        utc utcVar;
        Boolean bool;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(125319439);
        int i7 = (av8Var.g(str) ? 4 : 2) | i3 | (av8Var.e(i2) ? 32 : 16) | (av8Var.g(x43Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if ((i3 & 24576) == 0) {
            i7 |= av8Var.g(xtcVar) ? 16384 : 8192;
        }
        int i8 = i4 & 32;
        if (i8 != 0) {
            i5 = i7 | 196608;
            str3 = str2;
        } else {
            str3 = str2;
            i5 = i7 | (av8Var.g(str3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        }
        int i9 = i4 & 64;
        if (i9 != 0) {
            i6 = i5 | 1572864;
            function02 = function0;
        } else {
            function02 = function0;
            i6 = i5 | (av8Var.i(function02) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        if (av8Var.T(i6 & 1, (599187 & i6) != 599186)) {
            if (i8 != 0) {
                str3 = null;
            }
            Function0 function04 = i9 != 0 ? null : function02;
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            utc utcVar2 = utc.a;
            int i10 = i6;
            String str4 = str3;
            td4.y(i2, ((i6 >> 3) & 14) | 48, 12, av8Var, bkh.l(utcVar2, 24.0f), null, false);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, utcVar2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            xtc f0 = l98.f0(utcVar2, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            long D = lz.D(R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(str, f0, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, (i10 & 14) | 48, 0, 131064);
            av8Var = av8Var;
            if (str4 != null) {
                av8Var.d0(-1230901959);
                utcVar = utcVar2;
                udj.c(str4, l98.f0(utcVar2, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, ((i10 >> 15) & 14) | 48, 0, 131064);
                str3 = str4;
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                str3 = str4;
                utcVar = utcVar2;
                av8Var.d0(-1230672807);
                av8Var.s(false);
            }
            av8Var.s(true);
            nq8.h(av8Var, new goa(1.0f, true));
            if (z && ((bool = x43Var.e) == null || bool.equals(Boolean.FALSE))) {
                av8Var.d0(-1404757055);
                xtc l = bkh.l(utcVar, 32.0f);
                boolean z2 = (i10 & 3670016) == 1048576;
                Object O = av8Var.O();
                if (z2 || O == nf3.a) {
                    O = new ve7(9, function04);
                    av8Var.n0(O);
                }
                av8 av8Var2 = av8Var;
                ao2.g((Function0) O, l, false, null, null, pco.c, av8Var2, 1572912, 60);
                av8Var = av8Var2;
                av8Var.s(false);
            } else {
                av8Var.d0(-1404364657);
                av8Var.s(false);
            }
            av8Var.s(true);
            function03 = function04;
        } else {
            av8Var.W();
            function03 = function02;
        }
        String str5 = str3;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new a49(str, i2, x43Var, z, xtcVar, str5, function03, i3, i4);
        }
    }

    public static final void l(ImageVector imageVector, Function0 function0, long j2, xtc xtcVar, boolean z, of3 of3Var, int i2) {
        int i3;
        xtc xtcVar2;
        int i4;
        utc utcVar;
        boolean z2;
        imageVector.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(460748894);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(imageVector) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.f(j2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i5 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            i5 |= av8Var.h(z) ? 16384 : 8192;
        }
        if (av8Var.T(i5 & 1, (i5 & 9363) != 9362)) {
            long c2 = r13.c(lz.D(R.color.surface_1, av8Var), z ? 1.0f : 0.6f);
            av8Var.d0(398071156);
            utc utcVar2 = utc.a;
            xtc l = bkh.l(utcVar2, 48.0f);
            n7g n7gVar = o7g.a;
            xtc q = n9e.q(d2a.E(l, 2.0f, n7gVar, false, 0L, 28), j2, n7gVar);
            if (z) {
                boolean z3 = (i5 & 112) == 32;
                Object O = av8Var.O();
                if (z3 || O == nf3.a) {
                    O = new ve7(11, function0);
                    av8Var.n0(O);
                }
                i4 = i5;
                z2 = false;
                xtc y = tol.y(utcVar2, false, false, false, 0L, null, (Function0) O, av8Var, 31);
                av8Var = av8Var;
                utcVar = utcVar2;
                q = q.z(y);
            } else {
                i4 = i5;
                utcVar = utcVar2;
                z2 = false;
            }
            av8Var.s(z2);
            kq9.b(imageVector, null, l98.b0(q, 12.0f), c2, av8Var, (i4 & 14) | 48, 0);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ql7(imageVector, function0, j2, xtcVar2, z, i2);
        }
    }

    public static final void m(Integer num, int i2, of3 of3Var, int i3) {
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-977345586);
        if ((i3 & 6) == 0) {
            i4 = (av8Var.g(num) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= av8Var.e(i2) ? 32 : 16;
        }
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            haa.a(pco.I(i2, num, hkg.b0((Context) av8Var.k(nz.b))), null, yqo.u(n9e.q(bkh.c, r13.b, oyn.e), 100.0f, 100.0f, null), null, mp3.b, av8Var, 1572912, 1976);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vo(i2, i3, num);
        }
    }

    public static final void n(hre hreVar, Function1 function1, of3 of3Var, int i2) {
        hre hreVar2;
        Function1 function12;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-998198738);
        int i3 = (av8Var.g(hreVar) ? 4 : 2) | i2 | (av8Var.i(function1) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            ksa a2 = msa.a(0, 0, av8Var, 0, 3);
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = goh.b(new ni4(a2, 11));
                av8Var.n0(O);
            }
            cdi cdiVar = (cdi) O;
            g28 g28Var = bkh.c;
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, g28Var);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            hreVar2 = hreVar;
            function12 = function1;
            tol.b(nyd.a.a(null), yqo.H(-385126232, av8Var, new ere(a2, hreVar2, function12, context, cdiVar, 0)), av8Var, 56);
            s6a.a(hreVar2.g, g28Var, av8Var, 48);
            av8Var.s(true);
        } else {
            hreVar2 = hreVar;
            function12 = function1;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gme(hreVar2, function12, i2, 6);
        }
    }

    public static final void o(jre jreVar, Function2 function2, of3 of3Var, int i2) {
        jre jreVar2;
        Function2 function22;
        jreVar.getClass();
        function2.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(350359212);
        int i3 = (av8Var.i(jreVar) ? 4 : 2) | i2 | (av8Var.i(function2) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            d87 Q = u6h.Q(av8Var);
            hre k = jreVar.k();
            boolean i4 = av8Var.i(context) | ((i3 & 112) == 32) | av8Var.i(jreVar) | av8Var.g(Q);
            Object O = av8Var.O();
            if (i4 || O == nf3.a) {
                jreVar2 = jreVar;
                function22 = function2;
                lwc lwcVar = new lwc(context, function22, jreVar2, Q, 5);
                av8Var.n0(lwcVar);
                O = lwcVar;
            } else {
                jreVar2 = jreVar;
                function22 = function2;
            }
            n(k, (Function1) O, av8Var, 0);
        } else {
            jreVar2 = jreVar;
            function22 = function2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gme(jreVar2, function22, i2, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void p(gui guiVar, Function1 function1, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        boolean z;
        a99 a99Var;
        e1d e1dVar;
        boolean z2;
        boolean z3;
        String str = guiVar.a;
        function1.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2020986580);
        int i3 = i2 | (av8Var.g(guiVar) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        boolean z4 = false;
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            Object O = av8Var.O();
            a99 a99Var2 = nf3.a;
            if (O == a99Var2) {
                gv9 gv9Var = guiVar.b;
                if (gv9Var == null || !gv9Var.isEmpty()) {
                    Iterator<E> it = gv9Var.iterator();
                    while (it.hasNext()) {
                        if (((fui) it.next()).d) {
                            z3 = true;
                            break;
                        }
                    }
                }
                z3 = false;
                O = e.f(Boolean.valueOf(z3).equals(Boolean.TRUE) ? r1k.c : r1k.d);
                av8Var.n0(O);
            }
            e1d e1dVar2 = (e1d) O;
            xtc f0 = l98.f0(n9e.q(xtcVar, lz.D(R.color.surface_1, av8Var), o7g.a(16.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            boolean equals = str.equals(Sports.BASKETBALL);
            utc utcVar = utc.a;
            if (equals) {
                av8Var.d0(-291951719);
                sha.a(0, 0, av8Var, l98.f0(utcVar, 16.0f, 2.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), oea.v(R.string.basketball_titles, av8Var));
                av8Var.s(false);
                e1dVar = e1dVar2;
                a99Var = a99Var2;
                z = false;
            } else {
                av8Var.d0(-291704556);
                xtc d2 = bkh.d(utcVar, 1.0f);
                av8Var.d0(-1671973587);
                kp5<r1k> kp5Var = r1k.f;
                ArrayList arrayList = new ArrayList(k13.r(kp5Var, 10));
                for (r1k r1kVar : kp5Var) {
                    arrayList.add(new s1h(r1kVar, oea.v(r1kVar.a, av8Var), true));
                    z4 = false;
                }
                av8Var.s(z4);
                gv9 W = l6g.W(arrayList);
                r1k r1kVar2 = (r1k) e1dVar2.getValue();
                Object O2 = av8Var.O();
                if (O2 == a99Var2) {
                    O2 = new eqh(4, e1dVar2);
                    av8Var.n0(O2);
                }
                z = z4;
                a99Var = a99Var2;
                e1dVar = e1dVar2;
                l4a.a(W, r1kVar2, (Function1) O2, d2, null, false, av8Var, 3456, 48);
                av8Var = av8Var;
                av8Var.s(z);
            }
            int i4 = z;
            av8 av8Var2 = av8Var;
            l98.b((r1k) e1dVar.getValue(), null, null, null, null, null, yqo.H(-547998419, av8Var, new rsh(7, guiVar, function1)), av8Var2, 1572864, 62);
            av8Var = av8Var2;
            if (str.equals(Sports.BASKETBALL)) {
                z2 = true;
                av8Var.d0(-288725704);
                av8Var.s(i4);
            } else {
                av8Var.d0(-289697275);
                kv1 kv1Var = uxf.p;
                xtc A = wnn.A(bkh.o(new we9(kv1Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 40.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), o7g.a(16.0f));
                long D = lz.D(R.color.n_lv_4, av8Var);
                Object O3 = av8Var.O();
                a99 a99Var3 = a99Var;
                if (O3 == a99Var3) {
                    O3 = mz1.e(av8Var);
                }
                wzc wzcVar = (wzc) O3;
                Object[] objArr = new Object[i4];
                Object O4 = av8Var.O();
                if (O4 == a99Var3) {
                    O4 = nuh.h;
                    av8Var.n0(O4);
                }
                xtc c0 = l98.c0(tol.y(A, true, true, true, D, wzcVar, new cyg(function0, (boh) o3a.N(objArr, (Function0) O4, av8Var, 48), 13), av8Var, 0), 16.0f, 8.0f);
                l8g a3 = k8g.a(new ng0(4.0f, true, new l1(kv1Var, 5)), uxf.m, av8Var, 54);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, c0);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a3, hf3.g);
                waa.K(av8Var, m2, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C2, hf3.d);
                String v = oea.v(R.string.compare_trophies, av8Var);
                yf8 yf8Var = xth.a;
                z2 = true;
                udj.c(v, null, lz.D(R.color.primary_default, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
                av8Var = av8Var;
                kq9.b(s6a.N(R.drawable.ic_chevron_right_small_16, 6, av8Var), null, null, lz.D(R.color.primary_default, av8Var), av8Var, 48, 4);
                av8Var.s(true);
                av8Var.s(i4);
            }
            av8Var.s(z2);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mp9(i2, 15, guiVar, function1, function0, xtcVar);
        }
    }

    public static final void q(fui fuiVar, Function1 function1, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1453527203);
        int i3 = (av8Var.g(fuiVar) ? 4 : 2) | i2 | (av8Var.i(function1) ? 32 : 16);
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            xtc d2 = bkh.d(utc.a, 1.0f);
            boolean z = fuiVar.e;
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = nuh.i;
                av8Var.n0(O2);
            }
            xtc c0 = l98.c0(tol.y(d2, z, true, true, D, wzcVar, new eui((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function1, fuiVar, i4), av8Var, 0), 16.0f, 8.0f);
            l8g a2 = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            r(fuiVar.a, 0, av8Var);
            goa goaVar = new goa(1.0f, true);
            yf8 yf8Var = xth.a;
            udj.c(fuiVar.b, goaVar, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 131064);
            udj.c(String.valueOf(fuiVar.c), null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s5h(fuiVar, function1, i2, 13);
        }
    }

    public static final void r(int i2, int i3, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-698680759);
        int i4 = (av8Var.e(i2) ? 4 : 2) | i3;
        if (av8Var.T(i4 & 1, (i4 & 3) != 2)) {
            utc utcVar = utc.a;
            xtc l = bkh.l(utcVar, 32.0f);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, l);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            kq9.b(s6a.N(R.drawable.ic_trophy_16, 6, av8Var), null, bkh.c, lz.D(R.color.value, av8Var), av8Var, 432, 0);
            td4.y(i2, (i4 & 14) | 48, 12, av8Var, bkh.l(l98.f0(utcVar, 8.0f, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), 16.0f), null, false);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new o81(i2, i3, 10);
        }
    }

    public static final void s(knb knbVar, knb knbVar2) {
        if (cw3.a.contains(gvd.class)) {
            return;
        }
        try {
            knbVar.getClass();
            int[] iArr = knbVar.a;
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            float[] fArr = knbVar.c;
            float[] fArr2 = knbVar2.c;
            for (int i5 = 0; i5 < i2; i5++) {
                for (int i6 = 0; i6 < i3; i6++) {
                    for (int i7 = 0; i7 < i4; i7++) {
                        int c2 = bf3.c(i6, i4, i5 * i3 * i4, i7);
                        fArr[c2] = fArr[c2] + fArr2[i7];
                    }
                }
            }
        } catch (Throwable th) {
            cw3.a(gvd.class, th);
        }
    }

    public static final knb t(knb[] knbVarArr) {
        if (cw3.a.contains(gvd.class)) {
            return null;
        }
        try {
            int i2 = knbVarArr[0].a[0];
            int i3 = 0;
            for (knb knbVar : knbVarArr) {
                i3 += knbVar.a[1];
            }
            knb knbVar2 = new knb(new int[]{i2, i3});
            float[] fArr = knbVar2.c;
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = i4 * i3;
                for (knb knbVar3 : knbVarArr) {
                    float[] fArr2 = knbVar3.c;
                    int i6 = knbVar3.a[1];
                    System.arraycopy(fArr2, i4 * i6, fArr, i5, i6);
                    i5 += i6;
                }
            }
            return knbVar2;
        } catch (Throwable th) {
            cw3.a(gvd.class, th);
            return null;
        }
    }

    public static final knb u(knb knbVar, knb knbVar2) {
        knb knbVar3;
        knb knbVar4 = null;
        if (cw3.a.contains(gvd.class)) {
            return null;
        }
        try {
            knbVar.getClass();
            knbVar2.getClass();
            int[] iArr = knbVar.a;
            int i2 = 0;
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int[] iArr2 = knbVar2.a;
            int i6 = iArr2[0];
            int i7 = (i4 - i6) + 1;
            int i8 = iArr2[2];
            knb knbVar5 = new knb(new int[]{i3, i7, i8});
            float[] fArr = knbVar.c;
            float[] fArr2 = knbVar5.c;
            float[] fArr3 = knbVar2.c;
            int i9 = 0;
            while (i9 < i3) {
                int i10 = i2;
                while (i10 < i8) {
                    int i11 = i2;
                    while (i11 < i7) {
                        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        knbVar3 = knbVar4;
                        int i12 = i2;
                        while (i12 < i6) {
                            while (i2 < i5) {
                                try {
                                    f2 = (fArr[((i12 + i11) * i5) + (i4 * i5 * i9) + i2] * fArr3[(((i12 * i5) + i2) * i8) + i10]) + f2;
                                    i2++;
                                } catch (Throwable th) {
                                    th = th;
                                    cw3.a(gvd.class, th);
                                    return knbVar3;
                                }
                            }
                            i12++;
                            i2 = 0;
                        }
                        fArr2[bf3.c(i11, i8, i7 * i8 * i9, i10)] = f2;
                        i11++;
                        knbVar4 = knbVar3;
                        i2 = 0;
                    }
                    i10++;
                    i2 = 0;
                }
                i9++;
                i2 = 0;
            }
            return knbVar5;
        } catch (Throwable th2) {
            th = th2;
            knbVar3 = null;
        }
    }

    public static final File v(Context context, String str) {
        context.getClass();
        str.getClass();
        return new File(context.getApplicationContext().getFilesDir(), dmi.q("datastore/", str));
    }

    public static final knb w(knb knbVar, knb knbVar2, knb knbVar3) {
        if (cw3.a.contains(gvd.class)) {
            return null;
        }
        try {
            knbVar.getClass();
            knbVar2.getClass();
            int i2 = knbVar.a[0];
            int i3 = knbVar3.a[0];
            knb J = J(knbVar, knbVar2);
            float[] fArr = knbVar3.c;
            float[] fArr2 = J.c;
            for (int i4 = 0; i4 < i2; i4++) {
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = (i4 * i3) + i5;
                    fArr2[i6] = fArr2[i6] + fArr[i5];
                }
            }
            return J;
        } catch (Throwable th) {
            cw3.a(gvd.class, th);
            return null;
        }
    }

    public static final knb x(String[] strArr, knb knbVar) {
        if (cw3.a.contains(gvd.class)) {
            return null;
        }
        try {
            int length = strArr.length;
            int i2 = knbVar.a[1];
            knb knbVar2 = new knb(new int[]{length, 128, i2});
            float[] fArr = knbVar2.c;
            float[] fArr2 = knbVar.c;
            for (int i3 = 0; i3 < length; i3++) {
                int[] y = rik.b.y(strArr[i3]);
                for (int i4 = 0; i4 < 128; i4++) {
                    System.arraycopy(fArr2, y[i4] * i2, fArr, (i2 * i4) + (i2 * 128 * i3), i2);
                }
            }
            return knbVar2;
        } catch (Throwable th) {
            cw3.a(gvd.class, th);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static Method y(Method[] methodArr, String str, Class... clsArr) {
        Method method;
        int length = methodArr.length;
        boolean z = false;
        int i2 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                method = null;
                break;
            }
            method = methodArr[i2];
            if (str.equals(method.getName()) || c.v(method.getName(), str.concat("-"), z)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
                if (parameterTypes.length == clsArr2.length) {
                    ArrayList arrayList = new ArrayList(parameterTypes.length);
                    int length2 = parameterTypes.length;
                    boolean z2 = z;
                    ?? r12 = z2;
                    for (?? r11 = z2; r11 < length2; r11++) {
                        Class<?> cls = parameterTypes[r11];
                        int i3 = r12 + 1;
                        Class<?> cls2 = clsArr2[r12];
                        arrayList.add(Boolean.valueOf(Intrinsics.c(sha.A(cls), sha.A(cls2)) || cls.isAssignableFrom(cls2)));
                        r12 = i3;
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                continue;
            }
            i2++;
            z = false;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str.concat(" not found"));
    }

    public static final void z(knb knbVar) {
        if (cw3.a.contains(gvd.class)) {
            return;
        }
        try {
            knbVar.getClass();
            int[] iArr = knbVar.a;
            if (1 >= iArr.length) {
                return;
            }
            int length = iArr.length;
            int i2 = 1;
            for (int i3 = 1; i3 < length; i3++) {
                i2 *= knbVar.a[i3];
            }
            int i4 = knbVar.a[0];
            int[] iArr2 = {i4, i2};
            knbVar.a = iArr2;
            v6a it = new IntRange(1, 1, 1).iterator();
            while (it.c) {
                i4 *= iArr2[it.nextInt()];
            }
            float[] fArr = new float[i4];
            System.arraycopy(knbVar.c, 0, fArr, 0, Math.min(knbVar.b, i4));
            knbVar.c = fArr;
            knbVar.b = i4;
        } catch (Throwable th) {
            cw3.a(gvd.class, th);
        }
    }
}
