package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.Sports;
import com.sofascore.model.fantasy.FantasyNewsArticle;
import com.sofascore.model.fantasy.FantasyPlayer;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.UnknownHostException;
import java.text.NumberFormat;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class m6k {
    public static final tc3 a = new tc3(-798516951, new qs2(20), false);
    public static final tc3 b = new tc3(-508810749, new ud3(14), false);
    public static final hjg c = new hjg();
    public static final Object d = new Object();
    public static final int[] e = {R.attr.colorPrimary};
    public static final int[] f = {R.attr.colorPrimaryVariant};
    public static final char[] g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;

    public static void A() {
        synchronized (d) {
        }
    }

    public static void B() {
        synchronized (d) {
        }
    }

    public static void C(String str, Throwable th) {
        t(str, th);
        B();
    }

    public static long[] D(List list) {
        if (list.isEmpty()) {
            return new long[]{0};
        }
        int size = list.size();
        long[] jArr = new long[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            double floatValue = ((Float) list.get(i3)).floatValue();
            if (floatValue == -1.0d) {
                jArr[size - 1] = Long.MIN_VALUE;
            } else {
                jArr[i2] = Math.round(floatValue * 1000000.0d);
                i2++;
            }
        }
        Arrays.sort(jArr, 0, i2);
        return jArr;
    }

    public static gl E(hjg hjgVar, xe4 xe4Var) {
        hjgVar.getClass();
        gl n = hjg.n();
        if (!"data".equals(xe4Var.a.getScheme())) {
            n.b = xe4Var.a.toString();
            return n;
        }
        int i2 = 0;
        le4 le4Var = new le4(false);
        try {
            le4Var.b(xe4Var);
            byte[] bArr = new byte[1024];
            int i3 = 0;
            while (i2 != -1) {
                if (i3 == bArr.length) {
                    bArr = Arrays.copyOf(bArr, bArr.length * 2);
                }
                i2 = le4Var.read(bArr, i3, bArr.length - i3);
                if (i2 != -1) {
                    i3 += i2;
                }
            }
            n.c = nik.r(Arrays.copyOf(bArr, i3));
            return n;
        } finally {
            le4Var.close();
        }
    }

    public static final gv9 F(Context context, String str, boolean z) {
        xbb b2 = a.b();
        b2.add(context.getString(R.string.sofascore_analyst_benefit_matchup));
        b2.add(context.getString(R.string.sofascore_analyst_benefit_player_form));
        if (Intrinsics.c(str, Sports.FOOTBALL)) {
            b2.add(context.getString(R.string.sofascore_analyst_benefit_corners));
            b2.add(context.getString(R.string.sofascore_analyst_benefit_probabilities));
            b2.add(context.getString(R.string.sofascore_analyst_benefit_leagues, 250));
        } else if (Intrinsics.c(str, Sports.TENNIS)) {
            b2.add(context.getString(R.string.sofascore_analyst_benefit_playing_styles));
        }
        if (z) {
            b2.add(context.getString(R.string.three_day_trial));
        }
        return l6g.W(a.a(b2));
    }

    public static final int G(eyc eycVar, long j2, hsk hskVar) {
        float h2 = hskVar != null ? hskVar.h() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i2 = (int) (4294967295L & j2);
        int e2 = eycVar.e(Float.intBitsToFloat(i2));
        if (Float.intBitsToFloat(i2) < eycVar.f(e2) - h2 || Float.intBitsToFloat(i2) > eycVar.b(e2) + h2) {
            return -1;
        }
        int i3 = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i3) < (-h2) || Float.intBitsToFloat(i3) > eycVar.d + h2) {
            return -1;
        }
        return e2;
    }

    public static final em H(Context context, im imVar, String str) {
        NumberFormat numberFormat;
        String str2;
        Double d2 = imVar.e;
        Double d3 = imVar.a;
        Double d4 = imVar.c;
        if (d2 == null) {
            d2 = (Intrinsics.b(d4, d3) || Intrinsics.a(d4, 0.0d)) ? d3 : d4;
        }
        if (d2 == null || (str2 = imVar.b) == null) {
            numberFormat = null;
        } else {
            Currency currency = Currency.getInstance(str2);
            numberFormat = NumberFormat.getCurrencyInstance();
            numberFormat.setCurrency(currency);
        }
        String format = numberFormat != null ? numberFormat.format(d2) : null;
        String format2 = numberFormat != null ? numberFormat.format(d4) : null;
        cu cuVar = imVar.d;
        int i2 = cuVar == null ? -1 : ys5.a[cuVar.ordinal()];
        if (i2 == 1) {
            return new em(R.drawable.ic_lock_privacy, R.string.sofascore_analyst_predict_smarter_title, R.string.sofascore_analyst_predict_smarter_body, R.string.button_start_free_trial, F(context, str, true), false, dmi.q(" / ", context.getString(R.string.per_month_short)), true);
        }
        if (i2 == 2) {
            gv9 F = (format == null || format2 == null) ? F(context, Sports.FOOTBALL, false) : l6g.K(context.getString(R.string.first_six_months_discounted, format), context.getString(R.string.after_six_months_renews, format2));
            String string = context.getString(R.string.across_six_months);
            string.getClass();
            return new em(R.drawable.ic_sale_mark, R.string.black_friday_special, R.string.sofascore_analyst_ucl_body, R.string.claim_offer, F, true, string, true);
        }
        if (i2 == 3) {
            return new em(R.drawable.ic_sale_mark, R.string.sofascore_analyst_predict_smarter_title, R.string.sofascore_analyst_predict_smarter_body, R.string.claim_offer, F(context, Sports.FOOTBALL, false), false, dmi.q(" / ", context.getString(R.string.per_month_short)), true);
        }
        if (i2 != 4 && i2 != 5) {
            return new em(R.drawable.ic_lock_privacy, R.string.sofascore_analyst_predict_smarter_title, R.string.sofascore_analyst_predict_smarter_body, R.string.button_subscribe_now, F(context, str, false), false, dmi.q(" / ", context.getString(R.string.per_month_short)), Intrinsics.c(str, Sports.FOOTBALL));
        }
        xbb b2 = a.b();
        if (Intrinsics.c(str, Sports.FOOTBALL)) {
            b2.add(context.getString(R.string.sofascore_analyst_benefit_matchup));
            b2.add(context.getString(R.string.sofascore_analyst_benefit_player_form));
            b2.add(context.getString(R.string.sofascore_analyst_benefit_wc_200_leagues, 250));
            b2.add(context.getString(R.string.six_months_thirty_percent));
            b2.add(context.getString(R.string.after_six_months_renews_full_price));
            if (cuVar == cu.e) {
                b2.add(context.getString(R.string.three_day_trial));
            }
        } else if (Intrinsics.c(str, Sports.TENNIS)) {
            b2.addAll(F(context, str, cuVar == cu.e));
            b2.add(context.getString(R.string.six_months_thirty_percent));
            b2.add(context.getString(R.string.after_six_months_renews_full_price));
        }
        Unit unit = Unit.a;
        return new em(R.drawable.ic_sale_mark, R.string.sofascore_analyst_predict_smarter_title, R.string.sofascore_analyst_predict_smarter_wc_body, R.string.claim_offer, l6g.W(a.a(b2)), false, dmi.q(" / ", context.getString(R.string.per_month_short)), Intrinsics.c(str, Sports.FOOTBALL));
    }

    public static final int I(eyc eycVar, long j2, dma dmaVar, hsk hskVar) {
        long m;
        int G;
        if (dmaVar == null || (G = G(eycVar, (m = dmaVar.m(j2)), hskVar)) == -1) {
            return -1;
        }
        return eycVar.g(dnd.a(m, 1, (eycVar.b(G) + eycVar.f(G)) / 2.0f));
    }

    public static final long J(aej aejVar, long j2, long j3, dma dmaVar, hsk hskVar) {
        if (aejVar != null) {
            eyc eycVar = aejVar.b;
            if (dmaVar != null) {
                long m = dmaVar.m(j2);
                long m2 = dmaVar.m(j3);
                int G = G(eycVar, m, hskVar);
                int G2 = G(eycVar, m2, hskVar);
                if (G != -1) {
                    if (G2 != -1) {
                        G = Math.min(G, G2);
                    }
                    G2 = G;
                } else if (G2 == -1) {
                    return pej.b;
                }
                float b2 = (eycVar.b(G2) + eycVar.f(G2)) / 2.0f;
                int i2 = (int) (m >> 32);
                int i3 = (int) (m2 >> 32);
                return eycVar.h(new oqf(Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), b2 - 0.1f, Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), b2 + 0.1f), 0, it7.p);
            }
        }
        return pej.b;
    }

    public static final long K(q5b q5bVar, oqf oqfVar, int i2) {
        bej d2 = q5bVar.d();
        eyc eycVar = d2 != null ? d2.a.b : null;
        dma c2 = q5bVar.c();
        return (eycVar == null || c2 == null) ? pej.b : eycVar.h(oqfVar.k(c2.m(0L)), i2, it7.q);
    }

    public static final long L(cej cejVar, oqf oqfVar, int i2) {
        aej c2 = cejVar.c();
        eyc eycVar = c2 != null ? c2.b : null;
        dma e2 = cejVar.e();
        return (eycVar == null || e2 == null) ? pej.b : eycVar.h(oqfVar.k(e2.m(0L)), i2, it7.q);
    }

    public static final long M(q5b q5bVar, oqf oqfVar, oqf oqfVar2, int i2) {
        long K = K(q5bVar, oqfVar, i2);
        if (pej.d(K)) {
            return pej.b;
        }
        long K2 = K(q5bVar, oqfVar2, i2);
        if (pej.d(K2)) {
            return pej.b;
        }
        int i3 = (int) (K >> 32);
        int i4 = (int) (K2 & 4294967295L);
        return t6a.g(Math.min(i3, i3), Math.max(i4, i4));
    }

    public static final long N(cej cejVar, oqf oqfVar, oqf oqfVar2, int i2) {
        long L = L(cejVar, oqfVar, i2);
        if (pej.d(L)) {
            return pej.b;
        }
        long L2 = L(cejVar, oqfVar2, i2);
        if (pej.d(L2)) {
            return pej.b;
        }
        int i3 = (int) (L >> 32);
        int i4 = (int) (L2 & 4294967295L);
        return t6a.g(Math.min(i3, i3), Math.max(i4, i4));
    }

    public static String O(Context context) {
        SharedPreferences d2;
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences = d2;
        }
        return sharedPreferences.getString("registration_id", "");
    }

    public static final String P(FantasyNewsArticle fantasyNewsArticle, Context context) {
        Object u2gVar;
        fantasyNewsArticle.getClass();
        context.getClass();
        try {
            p2g p2gVar = w2g.b;
            u2gVar = Long.valueOf(OffsetDateTime.parse(fantasyNewsArticle.getDate()).toEpochSecond());
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (u2gVar instanceof u2g) {
            u2gVar = null;
        }
        Long l = (Long) u2gVar;
        if (l != null) {
            return z8e.K(l.longValue(), context);
        }
        return null;
    }

    public static void Q() {
        synchronized (d) {
        }
    }

    public static final boolean R(aej aejVar, int i2) {
        eyc eycVar = aejVar.b;
        int d2 = eycVar.d(i2);
        return i2 == aejVar.h(d2) || i2 == eycVar.c(d2, false) ? aejVar.i(i2) != aejVar.a(i2) : aejVar.a(i2) != aejVar.a(i2 - 1);
    }

    public static final boolean S(int i2) {
        int type = Character.getType(i2);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean T(int i2) {
        return Character.isWhitespace(i2) || i2 == 160;
    }

    public static final boolean U(int i2) {
        int type;
        return (!T(i2) || (type = Character.getType(i2)) == 14 || type == 13 || i2 == 10) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object V(List list, sq3 sq3Var) {
        ow0 ow0Var;
        int i2;
        Iterator it;
        int i3;
        if (sq3Var instanceof ow0) {
            ow0Var = (ow0) sq3Var;
            int i4 = ow0Var.u;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ow0Var.u = i4 - Integer.MIN_VALUE;
                Object obj = ow0Var.t;
                lu3 lu3Var = lu3.a;
                i2 = ow0Var.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    it = list.iterator();
                    i3 = 0;
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = ow0Var.s;
                    it = ow0Var.r;
                    y6a.M(obj);
                }
                while (it.hasNext()) {
                    yda ydaVar = (yda) it.next();
                    ow0Var.r = it;
                    ow0Var.s = i3;
                    ow0Var.u = 1;
                    if (ydaVar.Z(ow0Var) == lu3Var) {
                        return lu3Var;
                    }
                }
                return Unit.a;
            }
        }
        ow0Var = new ow0(sq3Var);
        Object obj2 = ow0Var.t;
        lu3 lu3Var2 = lu3.a;
        i2 = ow0Var.u;
        if (i2 != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.a;
    }

    public static gv9 W(Context context, List list, List list2) {
        list.getClass();
        list2.getClass();
        Set set = d9b.a;
        return d9b.a(list, null, list2, null, null, false, new i9b(new q9k(R.string.team_playing_eleven)), new i9b(new q9k(R.string.rest_of_squad)), null, new m04(context, 0), null, new xt3(5), 1338);
    }

    public static final FantasyPlayerUiModel X(FantasyPlayer fantasyPlayer, Context context) {
        fantasyPlayer.getClass();
        int id = fantasyPlayer.getId();
        int id2 = fantasyPlayer.getPlayer().getId();
        int id3 = fantasyPlayer.getTeam().getId();
        String name = fantasyPlayer.getTeam().getName();
        String nameCode = fantasyPlayer.getTeam().getNameCode();
        if (nameCode == null) {
            nameCode = iii.H(3, fantasyPlayer.getTeam().getName());
        }
        String str = nameCode;
        String t = tba.t(fantasyPlayer.getPlayer());
        String C = tba.C(fantasyPlayer.getPlayer());
        String C2 = tba.C(fantasyPlayer.getPlayer());
        String obj = C2 != null ? StringsKt.l0(new Regex("\\b(\\p{L}\\.-?)+\\s*").replace(C2, "")).toString() : null;
        f7a f7aVar = rz6.g;
        String position = fantasyPlayer.getPosition();
        f7aVar.getClass();
        rz6 g2 = f7a.g(position);
        Float averageScore = fantasyPlayer.getAverageScore();
        String str2 = "-";
        String format = averageScore != null ? String.format(dla.d(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(averageScore.floatValue())}, 1)) : "-";
        Float ownedPercentage = fantasyPlayer.getOwnedPercentage();
        Float form = fantasyPlayer.getForm();
        String format2 = form != null ? String.format(dla.d(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(form.floatValue())}, 1)) : "-";
        Integer totalScore = fantasyPlayer.getTotalScore();
        String format3 = totalScore != null ? String.format(dla.d(), "%d", Arrays.copyOf(new Object[]{Integer.valueOf(totalScore.intValue())}, 1)) : "-";
        Integer totalPlayersOnPosition = fantasyPlayer.getTotalPlayersOnPosition();
        Integer averageScoreRank = fantasyPlayer.getAverageScoreRank();
        Integer formRank = fantasyPlayer.getFormRank();
        Integer ownedRank = fantasyPlayer.getOwnedRank();
        Integer totalScoreRank = fantasyPlayer.getTotalScoreRank();
        Float form2 = fantasyPlayer.getForm();
        Float averageScore2 = fantasyPlayer.getAverageScore();
        Integer totalScore2 = fantasyPlayer.getTotalScore();
        Integer assists = fantasyPlayer.getAssists();
        Integer goals = fantasyPlayer.getGoals();
        Float averageRating = fantasyPlayer.getAverageRating();
        Integer averageRatingRank = fantasyPlayer.getAverageRatingRank();
        Float price = fantasyPlayer.getPrice();
        if (price != null) {
            float floatValue = price.floatValue();
            Locale d2 = dla.d();
            Set set = o84.a;
            str2 = String.format(d2, "%s%.1fM", Arrays.copyOf(new Object[]{o84.e(context), Float.valueOf(floatValue)}, 2));
        }
        return new FantasyPlayerUiModel(id, id2, id3, name, str, t, C, obj, g2, format, str2, fantasyPlayer.getPrice(), ownedPercentage, format2, format3, totalPlayersOnPosition, averageScoreRank, totalScoreRank, formRank, ownedRank, form2, totalScore2, averageScore2, goals, assists, averageRating, averageRatingRank);
    }

    public static TypedArray Y(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        v(context, attributeSet, i2, i3);
        w(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    public static final void a(uk4 uk4Var, of3 of3Var, int i2) {
        int i3;
        float f2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-607926527);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(uk4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            xtc d2 = bkh.d(utc.a, 1.0f);
            k1c c2 = e12.c(uxf.g, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d2);
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
            int ordinal = uk4Var.c.ordinal();
            if (ordinal == 0) {
                f2 = 0.0f;
            } else {
                if (ordinal != 1) {
                    zzl.b();
                    return;
                }
                f2 = uk4Var.b;
            }
            float f3 = 1.0f - f2;
            e(uk4Var.e, uk4Var.d, llf.b(1.0f - Math.abs(f2 + 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), (-1.0f) - f2, llf.b(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), av8Var, 0);
            e(uk4Var.g, uk4Var.f, llf.b(1.0f - Math.abs(f2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), -f2, llf.b(f2, -1.0f, 1.0f), av8Var, 0);
            float f4 = f2 - 1.0f;
            e(uk4Var.i, uk4Var.h, llf.b(1.0f - Math.abs(f4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), f3, llf.b(f4, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), av8Var, 0);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new n61(uk4Var, i2, 3);
        }
    }

    public static final long a0(CharSequence charSequence, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            int codePointBefore = Character.codePointBefore(charSequence, i3);
            if (!T(codePointBefore)) {
                break;
            }
            i3 -= Character.charCount(codePointBefore);
        }
        while (i2 < charSequence.length()) {
            int codePointAt = Character.codePointAt(charSequence, i2);
            if (!T(codePointAt)) {
                break;
            }
            i2 += Character.charCount(codePointAt);
        }
        return t6a.g(i3, i2);
    }

    public static final void b(int i2, mn1 mn1Var, of3 of3Var, xtc xtcVar) {
        av8 av8Var;
        xtc xtcVar2;
        Object obj;
        int i3;
        boolean z;
        final mn1 mn1Var2 = mn1Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1100031071);
        int i4 = i2 | (av8Var2.g(xtcVar) ? 4 : 2) | (av8Var2.g(mn1Var2) ? 32 : 16);
        if (av8Var2.T(i4 & 1, (i4 & 19) != 18)) {
            final long D = lz.D(R.color.secondary_highlight, av8Var2);
            final long D2 = lz.D(R.color.primary_highlight, av8Var2);
            final long D3 = lz.D(R.color.surface_1, av8Var2);
            final long D4 = lz.D(R.color.home_primary, av8Var2);
            final long D5 = lz.D(R.color.away_primary, av8Var2);
            final long D6 = lz.D(R.color.live, av8Var2);
            final long D7 = lz.D(R.color.surface_2, av8Var2);
            gv9 gv9Var = mn1Var2.f;
            Integer num = mn1Var2.e;
            boolean g2 = av8Var2.g(gv9Var) | av8Var2.g(num) | av8Var2.h(mn1Var2.c);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (g2 || O == a99Var) {
                if (gv9Var.isEmpty()) {
                    O = null;
                } else if (num != null) {
                    ListIterator listIterator = gv9Var.listIterator(gv9Var.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj = null;
                            break;
                        }
                        Object previous = listIterator.previous();
                        ListIterator listIterator2 = listIterator;
                        if (((nn1) previous).a == num.intValue()) {
                            obj = previous;
                            break;
                        }
                        listIterator = listIterator2;
                    }
                    nn1 nn1Var = (nn1) obj;
                    O = nn1Var == null ? (nn1) CollectionsKt.h0(gv9Var) : nn1Var;
                } else {
                    O = (nn1) CollectionsKt.h0(gv9Var);
                }
                av8Var2.n0(O);
            }
            final nn1 nn1Var2 = (nn1) O;
            if (av8Var2.k(dh3.n) == ema.b) {
                i3 = i4;
                z = true;
            } else {
                i3 = i4;
                z = false;
            }
            final boolean z2 = z;
            boolean g3 = av8Var2.g(nn1Var2) | ((i3 & 112) == 32) | av8Var2.h(z) | av8Var2.f(D7) | av8Var2.f(D) | av8Var2.f(D2) | av8Var2.f(D4) | av8Var2.f(D5) | av8Var2.f(D3) | av8Var2.f(D6);
            Object O2 = av8Var2.O();
            if (g3 || O2 == a99Var) {
                mn1Var2 = mn1Var;
                av8Var = av8Var2;
                O2 = new Function1() { // from class: in1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        te2 te2Var = (te2) obj2;
                        te2Var.getClass();
                        final float intBitsToFloat = Float.intBitsToFloat((int) (te2Var.a.n() & 4294967295L)) / 2.0f;
                        final nn1 nn1Var3 = nn1.this;
                        final float intBitsToFloat2 = Float.intBitsToFloat((int) (te2Var.a.n() >> 32)) * yid.l(nn1Var3 != null ? Float.valueOf(nn1Var3.b) : null);
                        final b20 a2 = e20.a();
                        a2.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat);
                        final mn1 mn1Var3 = mn1Var2;
                        for (nn1 nn1Var4 : mn1Var3.f) {
                            a2.f(Float.intBitsToFloat((int) (te2Var.a.n() >> 32)) * nn1Var4.b, intBitsToFloat - ((nn1Var4.c / 50.0f) * intBitsToFloat));
                        }
                        a2.f(Float.intBitsToFloat((int) (te2Var.a.n() >> 32)), intBitsToFloat);
                        a2.d();
                        final float intBitsToFloat3 = Float.intBitsToFloat((int) (te2Var.a.n() >> 32)) * (nn1Var3 != null ? nn1Var3.b : 1.0f);
                        final float intBitsToFloat4 = Float.intBitsToFloat((int) (te2Var.a.n() >> 32)) / mn1Var3.d;
                        final boolean z3 = z2;
                        final long j2 = D7;
                        final long j3 = D;
                        final long j4 = D2;
                        final long j5 = D6;
                        final long j6 = D3;
                        final long j7 = D4;
                        final long j8 = D5;
                        return te2Var.a(new Function1() { // from class: kn1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                ha5 ha5Var = (ha5) obj3;
                                ha5Var.getClass();
                                final long j9 = j2;
                                final float f2 = intBitsToFloat2;
                                final float f3 = intBitsToFloat;
                                final long j10 = j3;
                                final long j11 = j4;
                                final float f4 = intBitsToFloat3;
                                final mn1 mn1Var4 = mn1Var3;
                                final nn1 nn1Var5 = nn1Var3;
                                final long j12 = j5;
                                final long j13 = j6;
                                final b20 b20Var = a2;
                                final long j14 = j7;
                                final long j15 = j8;
                                final float f5 = intBitsToFloat4;
                                Function1 function1 = new Function1() { // from class: ln1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        long j16;
                                        long j17;
                                        long j18;
                                        float f6 = f4;
                                        b20 b20Var2 = b20Var;
                                        long j19 = j14;
                                        long j20 = j15;
                                        ha5 ha5Var2 = (ha5) obj4;
                                        ha5Var2.getClass();
                                        float f7 = f2;
                                        ha5Var2.n();
                                        float f8 = f3;
                                        ha5.o0(ha5Var2, j9, (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), njh.a(Float.intBitsToFloat((int) (ha5Var2.n() >> 32)) - f7, 2.0f * f8), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 120);
                                        ha5Var2.n();
                                        ha5.o0(ha5Var2, j10, 0L, njh.a(f7, f8), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 120);
                                        ha5Var2.n();
                                        ha5.o0(ha5Var2, j11, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L), njh.a(f7, f8), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 120);
                                        sx2 L0 = ha5Var2.L0();
                                        long D8 = L0.D();
                                        L0.t().o();
                                        try {
                                            ((hpo) L0.a).q(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6, f8, 1);
                                            j16 = D8;
                                            float f9 = 2.0f;
                                            try {
                                                ha5.X0(ha5Var2, b20Var2, j19, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 60);
                                                L0.t().h();
                                                L0.N(j16);
                                                float intBitsToFloat5 = Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L));
                                                sx2 L02 = ha5Var2.L0();
                                                long D9 = L02.D();
                                                L02.t().o();
                                                try {
                                                    ((hpo) L02.a).q(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f8, f6, intBitsToFloat5, 1);
                                                    j17 = D9;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    j17 = D9;
                                                }
                                                try {
                                                    ha5.X0(ha5Var2, b20Var2, j20, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 60);
                                                    mz1.v(L02, j17);
                                                    mn1 mn1Var5 = mn1Var4;
                                                    int i5 = mn1Var5.d - 1;
                                                    int i6 = 0;
                                                    while (true) {
                                                        j18 = j13;
                                                        if (i6 >= i5) {
                                                            break;
                                                        }
                                                        i6++;
                                                        float f10 = f5 * i6;
                                                        ha5.W0(ha5Var2, j18, (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L))) & 4294967295L), ha5Var2.H0(1.0f), 0, null, 496);
                                                        f9 = f9;
                                                    }
                                                    float f11 = f9;
                                                    if (mn1Var5.c) {
                                                        float intBitsToFloat6 = Float.intBitsToFloat((int) (ha5Var2.n() >> 32));
                                                        float intBitsToFloat7 = Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L));
                                                        nn1 nn1Var6 = nn1Var5;
                                                        float l = yid.l(nn1Var6 != null ? Float.valueOf(nn1Var6.b) : null) * intBitsToFloat6;
                                                        float H0 = ha5Var2.H0(f11);
                                                        long j21 = j12;
                                                        ha5.W0(ha5Var2, j21, (Float.floatToRawIntBits(l) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (Float.floatToRawIntBits(l) << 32) | (Float.floatToRawIntBits(intBitsToFloat7) & 4294967295L), H0, 0, null, 496);
                                                        float H02 = ha5Var2.H0(4.0f);
                                                        float H03 = ha5Var2.H0(f11);
                                                        long floatToRawIntBits = (Float.floatToRawIntBits(l) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L);
                                                        ha5.U(ha5Var2, j21, H02, floatToRawIntBits, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 120);
                                                        ha5.U(ha5Var2, j18, H03, floatToRawIntBits, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 120);
                                                    }
                                                    return Unit.a;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    mz1.v(L02, j17);
                                                    throw th;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                mz1.v(L0, j16);
                                                throw th;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            j16 = D8;
                                        }
                                    }
                                };
                                if (z3) {
                                    sx2 L0 = ha5Var.L0();
                                    long D8 = L0.D();
                                    L0.t().o();
                                    try {
                                        hpo hpoVar = (hpo) L0.a;
                                        sx2 sx2Var = (sx2) hpoVar.a;
                                        float intBitsToFloat5 = Float.intBitsToFloat((int) (sx2Var.D() >> 32)) / 2.0f;
                                        float intBitsToFloat6 = Float.intBitsToFloat((int) (sx2Var.D() & 4294967295L)) / 2.0f;
                                        hpoVar.G(-1.0f, 1.0f, (Float.floatToRawIntBits(intBitsToFloat5) << 32) | (Float.floatToRawIntBits(intBitsToFloat6) & 4294967295L));
                                        function1.invoke(ha5Var);
                                    } finally {
                                        mz1.v(L0, D8);
                                    }
                                } else {
                                    function1.invoke(ha5Var);
                                }
                                return Unit.a;
                            }
                        });
                    }
                };
                av8Var.n0(O2);
            } else {
                mn1Var2 = mn1Var;
                av8Var = av8Var2;
            }
            xtcVar2 = xtcVar;
            nq8.h(av8Var, td4.Y(xtcVar2, (Function1) O2));
        } else {
            av8Var = av8Var2;
            xtcVar2 = xtcVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gn1(xtcVar2, mn1Var2, i2);
        }
    }

    public static final byte[] b0(InputStream inputStream) {
        inputStream.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        z(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static final void c(int i2, mn1 mn1Var, of3 of3Var, xtc xtcVar) {
        mn1 mn1Var2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2045647934);
        int i3 = i2 | (av8Var.g(mn1Var) ? 4 : 2);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            qug o0 = hkg.o0(av8Var);
            Integer valueOf = Integer.valueOf(mn1Var.d);
            boolean g2 = ((i3 & 14) == 4) | av8Var.g(o0);
            Object O = av8Var.O();
            if (g2 || O == nf3.a) {
                O = new l0(mn1Var, o0, null, 27);
                av8Var.n0(O);
            }
            hz8.o(av8Var, valueOf, (Function2) O);
            xtc e0 = l98.e0(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f)), 8.0f, 16.0f, 8.0f, 24.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, e0);
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
            Integer valueOf2 = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf2, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            String v = oea.v(R.string.baseball_win_probability, av8Var);
            yf8 yf8Var = xth.a;
            dfj l = xth.l();
            long D = lz.D(R.color.n_lv_1, av8Var);
            utc utcVar = utc.a;
            udj.c(v, l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7), D, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, l, av8Var, 48, 0, 130040);
            udj.c("%", bkh.d(utcVar, 1.0f), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(6), 0L, 0, false, 0, 0, null, xth.g(), av8Var, 54, 0, 130040);
            av8Var = av8Var;
            xtc e2 = bkh.e(bkh.d(utcVar, 1.0f), 104.0f);
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, e2);
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
            mn1Var2 = mn1Var;
            p(mn1Var2.a, mn1Var2.b, 6, av8Var, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, 7));
            dy0.b(bkh.c.z(new goa(1.0f, true)), null, yqo.H(-667904882, av8Var, new hl6(17, mn1Var2, o0)), av8Var, 3072, 6);
            g(0, av8Var);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            mn1Var2 = mn1Var;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gn1(mn1Var2, xtcVar, i2);
        }
    }

    public static void c0(Context context, String str) {
        SharedPreferences d2;
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences = d2;
        }
        sharedPreferences.edit().putString("registration_id", str).apply();
    }

    public static final void d(vy8 vy8Var, e23 e23Var, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-525156579);
        int i3 = 2;
        if ((((av8Var.g(vy8Var) ? 4 : 2) | i2 | (av8Var.g(e23Var) ? 32 : 16)) & 19) == 18 && av8Var.D()) {
            av8Var.W();
        } else {
            av8Var.Y();
            if ((i2 & 1) != 0 && !av8Var.B()) {
                av8Var.W();
            }
            av8Var.t();
            int i4 = nv2.b;
            av8Var.e0(-1115894518);
            av8Var.e0(1886828752);
            if (!(av8Var.a instanceof pf0)) {
                z8e.N();
                throw null;
            }
            av8Var.b0();
            int i5 = 0;
            if (av8Var.S) {
                av8Var.l(new ptj(i5, 14));
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, vy8Var, f50.x);
            waa.K(av8Var, e23Var, f50.y);
            av8Var.s(true);
            av8Var.s(false);
            av8Var.s(false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new sz(vy8Var, e23Var, i2, i3);
        }
    }

    public static sx2 d0(int i2, sm6 sm6Var) {
        return new sx2(false, new t0f(i2), sm6Var, c);
    }

    public static final void e(final String str, final String str2, final float f2, final float f3, final float f4, of3 of3Var, final int i2) {
        av8 av8Var;
        av8 av8Var2;
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(229741000);
        int i3 = i2 | (av8Var3.g(str) ? 4 : 2) | (av8Var3.g(str2) ? 32 : 16) | (av8Var3.d(f2) ? 256 : 128) | (av8Var3.d(f3) ? 2048 : 1024) | (av8Var3.d(f4) ? 16384 : 8192);
        int i4 = 0;
        if (av8Var3.T(i3 & 1, (i3 & 9363) != 9362)) {
            ng0 ng0Var = new ng0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, new l1(new kv1(f4), 6));
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
            boolean z = ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object O = av8Var3.O();
            if (z || O == nf3.a) {
                O = new n28(i4, f2, f3);
                av8Var3.n0(O);
            }
            xtc M = s02.M(d2, (Function1) O);
            l8g a2 = k8g.a(ng0Var, uxf.m, av8Var3, 48);
            int hashCode = Long.hashCode(av8Var3.T);
            aee m = av8Var3.m();
            xtc C = fqj.C(av8Var3, M);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a2, hf3.g);
            waa.K(av8Var3, m, hf3.f);
            waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var3, hf3.k);
            waa.K(av8Var3, C, hf3.d);
            if (str.length() > 0) {
                av8Var3.d0(-295776922);
                yf8 yf8Var = xth.a;
                q5a.w(str, null, lz.D(R.color.n_lv_1, av8Var3), null, 0L, 0L, null, 0L, 0, false, 1, 0, xth.b(), av8Var3, i3 & 14, 24576, 114682);
                av8Var2 = av8Var3;
                bf3.u(utcVar, 4.0f, av8Var2, false);
            } else {
                av8Var2 = av8Var3;
                av8Var2.d0(-295546282);
                av8Var2.s(false);
            }
            yf8 yf8Var2 = xth.a;
            av8 av8Var4 = av8Var2;
            q5a.w(str2, null, lz.D(R.color.primary_default, av8Var2), null, 0L, 0L, null, 0L, 0, false, 1, 0, xth.b(), av8Var4, (i3 >> 3) & 14, 24576, 114682);
            av8Var = av8Var4;
            av8Var.s(true);
        } else {
            av8Var = av8Var3;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(str, str2, f2, f3, f4, i2) { // from class: o28
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ float e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    m6k.e(this.a, this.b, this.c, this.d, this.e, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final long e0(PointF pointF) {
        float f2 = pointF.x;
        float f3 = pointF.y;
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
    }

    public static final void f(uk4 uk4Var, Function0 function0, Function0 function02, Function0 function03, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-437268232);
        int i3 = i2 | (av8Var.g(uk4Var) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | (av8Var.i(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function03) ? com.ironsource.mediationsdk.metadata.a.o : 1024) | 24576;
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = mz1.e(av8Var);
            }
            wzc wzcVar2 = (wzc) O2;
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var, utcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            xtc q = n9e.q(d2a.E(bkh.e(utcVar, 32.0f), 2.0f, o7g.a(16.0f), false, 0L, 28), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f));
            l8g a2 = k8g.a(ww9.h, uxf.m, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, q);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            xtc w = oyn.w(bkh.c(utcVar, 1.0f), false, null, wzcVar, function0, 7);
            mv1 mv1Var = uxf.f;
            k1c c3 = e12.c(mv1Var, false);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, w);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            kq9.b(s6a.N(R.drawable.ic_chevron_left_large_16, 6, av8Var), null, bkh.l(l98.f0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
            av8Var.s(true);
            xtc B = wnn.B(td4.X(td4.X(bkh.c(new goa(1.0f, true), 1.0f), new gl7(13)), new gl7(12)));
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = mz1.e(av8Var);
            }
            wzc wzcVar3 = (wzc) O3;
            Object[] objArr = new Object[0];
            Object O4 = av8Var.O();
            if (O4 == a99Var) {
                O4 = o67.l;
                av8Var.n0(O4);
            }
            xtc y = tol.y(B, true, true, true, D, wzcVar3, new sol(function03, (boh) o3a.N(objArr, (Function0) O4, av8Var, 48)), av8Var, 0);
            av8Var = av8Var;
            k1c c4 = e12.c(uxf.g, false);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, y);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c4, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            a(uk4Var, av8Var, i3 & 14);
            av8Var.s(true);
            xtc w2 = oyn.w(bkh.c(utcVar, 1.0f), false, null, wzcVar2, function02, 7);
            mv1 mv1Var2 = uxf.h;
            k1c c5 = e12.c(mv1Var2, false);
            int hashCode5 = Long.hashCode(av8Var.T);
            aee m5 = av8Var.m();
            xtc C5 = fqj.C(av8Var, w2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c5, f50Var);
            waa.K(av8Var, m5, ff3Var);
            bf3.s(hashCode5, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C5, f50Var3);
            kq9.b(s6a.N(R.drawable.ic_chevron_right_large_16, 6, av8Var), null, bkh.l(l98.f0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
            av8Var.s(true);
            av8Var.s(true);
            n12 n12Var = n12.a;
            e12.a(0, av8Var, oyn.u(bkh.c(bkh.p(l98.f0(n12Var.a(utcVar, mv1Var), 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 8.0f), 1.0f), wzcVar, null, false, null, null, function0, 28));
            e12.a(0, av8Var, oyn.u(bkh.c(bkh.p(l98.f0(n12Var.a(utcVar, mv1Var2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), 8.0f), 1.0f), wzcVar2, null, false, null, null, function02, 28));
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ere(uk4Var, function0, function02, function03, xtcVar2, i2, 19);
        }
    }

    public static void f0() {
        synchronized (d) {
        }
    }

    public static final void g(int i2, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1591867080);
        if (av8Var.T(i2 & 1, i2 != 0)) {
            utc utcVar = utc.a;
            xtc c2 = bkh.c(l98.f0(bkh.q(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 25.0f, 1), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, 6), 1.0f);
            u23 a2 = t23.a(ww9.h, uxf.q, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c2);
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
            yf8 yf8Var = xth.a;
            udj.c(StatisticData.ERROR_CODE_NOT_FOUND, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var, 6, 0, 131066);
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            udj.c("50", null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var, 6, 0, 131066);
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            udj.c(StatisticData.ERROR_CODE_NOT_FOUND, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var, 6, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hd3(i2);
        }
    }

    public static void g0(String str, Exception exc) {
        t(str, exc);
        f0();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(int i2, int i3, of3 of3Var, xtc xtcVar, ImageVector imageVector, String str, Function0 function0, boolean z) {
        Function0 function02;
        int i4;
        boolean z2;
        boolean z3;
        eqf u;
        long j2;
        imageVector.getClass();
        str.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-649000272);
        int i5 = (av8Var.g(imageVector) ? 4 : 2) | i2 | (av8Var.g(str) ? 32 : 16);
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 = i5 | 3072;
            function02 = function0;
        } else {
            function02 = function0;
            i4 = i5 | (av8Var.i(function02) ? com.ironsource.mediationsdk.metadata.a.o : 1024);
        }
        int i7 = i3 & 16;
        if (i7 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            z2 = z;
            i4 |= av8Var.h(z2) ? 16384 : 8192;
            if (av8Var.T(i4 & 1, (i4 & 9363) == 9362)) {
                av8Var.W();
                z3 = z2;
            } else {
                Function0 function03 = i6 != 0 ? null : function02;
                boolean z4 = i7 != 0 ? true : z2;
                lv1 lv1Var = uxf.m;
                xtc c0 = l98.c0(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.n_lv_1, av8Var), o7g.a(16.0f)), 16.0f, 8.0f);
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
                waa.K(av8Var, a2, hf3.g);
                waa.K(av8Var, m, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C, hf3.d);
                if (z4) {
                    j2 = ljg.f(av8Var, -512386887, R.color.surface_1, av8Var, false);
                } else {
                    av8Var.d0(-512386089);
                    av8Var.s(false);
                    j2 = r13.i;
                }
                utc utcVar = utc.a;
                kq9.b(imageVector, null, bkh.l(utcVar, 24.0f), j2, av8Var, (i4 & 14) | 432, 0);
                goa d2 = bf3.d(utcVar, 8.0f, av8Var, 1.0f, true);
                yf8 yf8Var = xth.a;
                udj.c(str, d2, lz.D(R.color.surface_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, xth.g(), av8Var, (i4 >> 3) & 14, 384, 126968);
                av8Var = av8Var;
                if (function03 == null) {
                    av8Var.d0(1296266102);
                    av8Var.s(false);
                } else {
                    ljg.r(8.0f, 1296266103, av8Var, av8Var, utcVar);
                    ImageVector N = s6a.N(R.drawable.ic_close, 6, av8Var);
                    long D = lz.D(R.color.surface_1, av8Var);
                    xtc y = tol.y(bkh.l(utcVar, 16.0f), false, false, false, 0L, null, function03, av8Var, 29);
                    av8Var = av8Var;
                    kq9.b(N, null, y, D, av8Var, 48, 0);
                    av8Var.s(false);
                }
                av8Var.s(true);
                z3 = z4;
                function02 = function03;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new ci(imageVector, str, xtcVar, function02, z3, i2, i3, 4);
                return;
            }
            return;
        }
        z2 = z;
        if (av8Var.T(i4 & 1, (i4 & 9363) == 9362)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static byte[] h0(String str) {
        int length = str.length();
        if ((length & 1) != 0) {
            a70.p("String must be of even-length");
            return null;
        }
        byte[] bArr = new byte[length >> 1];
        for (int i2 = 0; i2 < length; i2 += 2) {
            bArr[i2 / 2] = (byte) (Character.digit(str.charAt(i2 + 1), 16) + (Character.digit(str.charAt(i2), 16) << 4));
        }
        return bArr;
    }

    public static final void i(int i2, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-335532581);
        int i3 = i2 | 6;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            kg0 kg0Var = ww9.h;
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
            l8g a2 = k8g.a(kg0Var, uxf.l, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
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
            lv1 lv1Var = uxf.m;
            wxf wxfVar = ww9.b;
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, utcVar);
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
            kq9.a(haa.t(R.drawable.ic_transfer_out_16, 0, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.error, av8Var), av8Var, 440, 0);
            String f2 = fc6.f(4.0f, R.string.squad_change_player_out, av8Var, av8Var, utcVar);
            long D = lz.D(R.color.n_lv_3, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(f2, null, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
            av8Var.s(true);
            l8g a4 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            utc utcVar2 = utcVar;
            udj.c(oea.v(R.string.squad_change_player_in, av8Var), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            kq9.a(haa.t(R.drawable.ic_transfer_in_16, 0, av8Var), null, ljg.i(utcVar2, 4.0f, av8Var, utcVar2, 16.0f), lz.D(R.color.success, av8Var), av8Var, 440, 0);
            av8Var.s(true);
            av8Var.s(true);
            xtcVar2 = utcVar2;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l63(xtcVar2, i2, 13);
        }
    }

    public static long i0(double d2, DisplayMetrics displayMetrics) {
        return Math.round(d2 / displayMetrics.density);
    }

    public static final void j(q28 q28Var, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        xtc xtcVar2;
        utc utcVar;
        int i3;
        boolean z;
        int i4;
        av8 av8Var2;
        int i5;
        q28Var.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function04.getClass();
        function05.getClass();
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(-1583410552);
        int i6 = i2 | (av8Var3.g(q28Var) ? 4 : 2) | (av8Var3.i(function0) ? 32 : 16) | (av8Var3.i(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var3.i(function03) ? com.ironsource.mediationsdk.metadata.a.o : 1024) | (av8Var3.i(function04) ? 16384 : 8192) | (av8Var3.i(function05) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | 1572864;
        if (av8Var3.T(i6 & 1, (599187 & i6) != 599186)) {
            utc utcVar2 = utc.a;
            xtc d0 = l98.d0(bkh.e(bkh.d(utcVar2, 1.0f), 48.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, av8Var3, 54);
            int hashCode = Long.hashCode(av8Var3.T);
            aee m = av8Var3.m();
            xtc C = fqj.C(av8Var3, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a2, hf3.g);
            waa.K(av8Var3, m, hf3.f);
            waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var3, hf3.k);
            waa.K(av8Var3, C, hf3.d);
            boolean z2 = q28Var.a;
            boolean z3 = q28Var.d;
            if (z2) {
                av8Var3.d0(-93890083);
                int i7 = (i6 >> 3) & 14;
                av8Var2 = av8Var3;
                utcVar = utcVar2;
                i3 = i6;
                i4 = 0;
                z = z3;
                i5 = 6;
                tgj.i(function0, null, q28Var.c, q28Var.b, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, i7, 50);
                av8Var2.s(false);
            } else {
                utcVar = utcVar2;
                i3 = i6;
                z = z3;
                i4 = 0;
                av8Var2 = av8Var3;
                i5 = 6;
                av8Var2.d0(-93717630);
                av8Var2.s(false);
            }
            m(z, function02, av8Var2, (i3 >> 3) & 112);
            utc utcVar3 = utcVar;
            av8 av8Var4 = av8Var2;
            wnn.d(Boolean.valueOf(z), fn0.e(1.0f, bkh.e(utcVar3, 32.0f), true), s02.h0(150, i4, null, i5), "live_count", yqo.H(-1553410911, av8Var2, new er6(q28Var, function03, function04, function05, 19)), av8Var4, 28032, 0);
            av8Var = av8Var4;
            av8Var.s(true);
            xtcVar2 = utcVar3;
        } else {
            av8Var = av8Var3;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new el1(q28Var, function0, function02, function03, function04, function05, xtcVar2, i2, 4);
        }
    }

    public static final void k(sk8 sk8Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-2106512304);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.i(sk8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i5 = 16;
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            tc3 H = yqo.H(-361337815, av8Var2, new hl7(sk8Var, i5));
            tc3 H2 = yqo.H(-1410547759, av8Var2, new ok8(sk8Var, 3));
            boolean i6 = av8Var2.i(sk8Var) | ((i3 & 112) == 32);
            Object O = av8Var2.O();
            if (i6 || O == nf3.a) {
                O = new pk8(function1, sk8Var, i4);
                av8Var2.n0(O);
            }
            av8Var = av8Var2;
            v9g.c(xtcVar, H, H2, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, null, (Function0) O, av8Var, ((i3 >> 6) & 14) | 197040, 2008);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new qk8(sk8Var, function1, xtcVar, i2, 1);
        }
    }

    public static final void l(int i2, Integer num, float f2, of3 of3Var, int i3) {
        int i4 = i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-224415666);
        int i5 = (av8Var.e(i4) ? 4 : 2) | i3 | (av8Var.g(num) ? 32 : 16) | (av8Var.d(f2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        boolean z = true;
        boolean z2 = false;
        if (av8Var.T(i5 & 1, (i5 & 147) != 146)) {
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
            l8g a2 = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d2);
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
            av8Var.d0(-1062152254);
            int i6 = 0;
            while (i6 < i4) {
                int i7 = i6 + 1;
                String valueOf = String.valueOf(i7);
                yf8 yf8Var = xth.a;
                av8 av8Var2 = av8Var;
                udj.c(valueOf, bkh.p(utcVar, f2), (num != null && i7 == num.intValue()) ? ljg.f(av8Var, -1837833597, R.color.live, av8Var, z2) : ljg.f(av8Var, -1837833117, R.color.n_lv_3, av8Var, z2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.b(), av8Var2, 0, 0, 130040);
                z = true;
                z2 = z2;
                av8Var = av8Var2;
                i6 = i7;
                utcVar = utcVar;
                i4 = i2;
            }
            av8Var.s(z2);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new jn1(f2, i2, i3, num);
        }
    }

    public static final void m(boolean z, Function0 function0, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(314968133);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function0) ? 32 : 16;
        }
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            xtc q = n9e.q(d2a.E(bkh.e(utc.a, 32.0f), 2.0f, o7g.a(16.0f), false, 0L, 28), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f));
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, q);
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
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = e.d(0L);
                av8Var.n0(O);
            }
            p28 p28Var = new p28(function0, (boh) O, i4);
            qz1 H = fcp.H(lz.D(R.color.live, av8Var), 1.0f);
            t3e t3eVar = new t3e(12.0f, 8.0f, 8.0f, 8.0f);
            t3e t3eVar2 = q72.a;
            p72 a2 = q72.a(z ? ljg.f(av8Var, -924837836, R.color.live, av8Var, false) : ljg.f(av8Var, -924837347, R.color.live_highlight, av8Var, false), z ? ljg.f(av8Var, -924835272, R.color.surface_1, av8Var, false) : ljg.f(av8Var, -924834668, R.color.live, av8Var, false), 0L, 0L, av8Var, 12);
            tc3 H2 = yqo.H(2028600123, av8Var, new cv5(z, 3));
            av8Var = av8Var;
            iz8.e(p28Var, null, false, null, a2, null, H, t3eVar, null, H2, av8Var, 805306368, Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xx0(z, function0, i2, 2);
        }
    }

    public static final void n(sbf sbfVar, gta gtaVar, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        sbfVar.getClass();
        gtaVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-620598984);
        int i3 = (av8Var.i(sbfVar) ? 4 : 2) | i2 | (av8Var.e(gtaVar.ordinal()) ? 32 : 16) | 384;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            e1d x = rfo.x(sbfVar.j, av8Var, 0);
            e1d x2 = rfo.x(sbfVar.h, av8Var, 0);
            boolean z = false;
            xhf J = x2a.J(av8Var);
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
            boolean booleanValue = ((Boolean) x.getValue()).booleanValue();
            boolean i4 = av8Var.i(sbfVar);
            if ((i3 & 112) == 32) {
                z = true;
            }
            boolean z2 = i4 | z;
            Object O = av8Var.O();
            if (z2 || O == nf3.a) {
                O = new zbe(15, sbfVar, gtaVar);
                av8Var.n0(O);
            }
            x2a.h(booleanValue, (Function0) O, d2, J, null, yqo.H(-951300719, av8Var, new ak1(J, x, 6)), yqo.H(212280466, av8Var, new yya(gtaVar, x2)), av8Var, 1769856);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wbc(sbfVar, gtaVar, xtcVar2, i2, 15);
        }
    }

    public static final void o(pbf pbfVar, gta gtaVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-828676045);
        int i3 = (av8Var.g(pbfVar) ? 4 : 2) | i2 | (av8Var.e(gtaVar.ordinal()) ? 32 : 16);
        utc utcVar = utc.a;
        int i4 = i3 | (av8Var.g(utcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i5 = 0;
        if (!av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            av8Var.W();
        } else if (pbfVar instanceof mbf) {
            av8Var.d0(384235940);
            t6a.b(bkh.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 6, 14);
            av8Var.s(false);
        } else if (pbfVar instanceof nbf) {
            av8Var.d0(384402038);
            j72.h(null, Integer.valueOf(R.drawable.no_data), null, Integer.valueOf(R.string.no_data_empty_state_mma), true, null, 0, 0L, av8Var, 24576, 229);
            av8Var.s(false);
        } else {
            if (!(pbfVar instanceof obf)) {
                throw dmi.h(av8Var, -1788721426, false);
            }
            av8Var.d0(384745735);
            obf obfVar = (obf) pbfVar;
            qbf qbfVar = obfVar.b;
            Iterator it = obfVar.a.iterator();
            int i6 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i6 = -1;
                    break;
                } else if (((qbf) it.next()).e) {
                    break;
                } else {
                    i6++;
                }
            }
            Object valueOf = Integer.valueOf(i6);
            rq3 rq3Var = null;
            if (i6 <= 6) {
                valueOf = null;
            }
            ksa a2 = msa.a(0, 0, av8Var, 0, 3);
            Unit unit = Unit.a;
            boolean g2 = av8Var.g(valueOf) | av8Var.g(a2);
            Object O = av8Var.O();
            int i7 = 14;
            Object obj = nf3.a;
            if (g2 || O == obj) {
                O = new gje(valueOf, a2, rq3Var, i7);
                av8Var.n0(O);
            }
            hz8.o(av8Var, unit, (Function2) O);
            xtc q = n9e.q(bkh.c, lz.D(R.color.surface_2, av8Var), oyn.e);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, q);
            if3.k7.getClass();
            Function0 function0 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(function0);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            t3e C2 = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 84.0f, 7);
            boolean z = ((i4 & 14) == 4) | ((i4 & 112) == 32);
            Object O2 = av8Var.O();
            if (z || O2 == obj) {
                O2 = new aaf(i5, pbfVar, gtaVar);
                av8Var.n0(O2);
            }
            v8a.a(null, a2, C2, null, null, null, false, null, (Function1) O2, av8Var, 384, 505);
            if (qbfVar != null) {
                av8Var.d0(-331884733);
                hda.f(qbfVar, l98.c0(n12.a.a(utcVar, uxf.j), 8.0f, 16.0f), av8Var, 0);
                av8Var.s(false);
            } else {
                av8Var.d0(-331571447);
                av8Var.s(false);
            }
            av8Var.s(true);
            av8Var.s(false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gme(pbfVar, gtaVar, i2, 18);
        }
    }

    public static final void p(int i2, int i3, int i4, of3 of3Var, xtc xtcVar) {
        int i5;
        int i6;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1333173228);
        int i7 = (av8Var.e(i2) ? 32 : 16) | i4 | (av8Var.e(i3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i7 & 1, (i7 & 147) != 146)) {
            xtc f0 = l98.f0(xtcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
            u23 a2 = t23.a(new ng0(20.0f, true, new a70(6)), uxf.p, av8Var, 54);
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
            utc utcVar = utc.a;
            td4.G(i2, bkh.l(utcVar, 20.0f), false, 0L, av8Var, ((i7 >> 3) & 14) | 48, 12);
            i5 = i2;
            i6 = i3;
            td4.G(i6, bkh.l(utcVar, 20.0f), false, 0L, av8Var, ((i7 >> 6) & 14) | 48, 12);
            av8Var.s(true);
        } else {
            i5 = i2;
            i6 = i3;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hn1(xtcVar, i5, i6, i4);
        }
    }

    public static final long q(long j2, CharSequence charSequence) {
        int i2 = pej.c;
        int i3 = (int) (j2 >> 32);
        int i4 = (int) (4294967295L & j2);
        int codePointBefore = i3 > 0 ? Character.codePointBefore(charSequence, i3) : 10;
        int codePointAt = i4 < charSequence.length() ? Character.codePointAt(charSequence, i4) : 10;
        if (U(codePointBefore) && (T(codePointAt) || S(codePointAt))) {
            do {
                i3 -= Character.charCount(codePointBefore);
                if (i3 == 0) {
                    break;
                }
                codePointBefore = Character.codePointBefore(charSequence, i3);
            } while (U(codePointBefore));
            return t6a.g(i3, i4);
        }
        if (!U(codePointAt)) {
            return j2;
        }
        if (!T(codePointBefore) && !S(codePointBefore)) {
            return j2;
        }
        do {
            i4 += Character.charCount(codePointAt);
            if (i4 == charSequence.length()) {
                break;
            }
            codePointAt = Character.codePointAt(charSequence, i4);
        } while (U(codePointAt));
        return t6a.g(i3, i4);
    }

    public static final xtc r(xtc xtcVar, String str, su suVar) {
        xtcVar.getClass();
        return fqj.q(xtcVar, new hl6(13, str, suVar));
    }

    public static String t(String str, Throwable th) {
        String replace;
        synchronized (d) {
            try {
                if (th != null) {
                    Throwable th2 = th;
                    while (true) {
                        if (th2 == null) {
                            replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                            break;
                        }
                        if (th2 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                        } else {
                            th2 = th2.getCause();
                        }
                    }
                } else {
                    replace = null;
                }
            } finally {
            }
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        StringBuilder r = mz1.r(str, "\n  ");
        r.append(replace.replace("\n", "\n  "));
        r.append('\n');
        return r.toString();
    }

    public static final Object u(List list, rq3 rq3Var) {
        return list.isEmpty() ? km5.a : new lw0((zu4[]) list.toArray(new zu4[0])).a(rq3Var);
    }

    public static void v(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pjf.V, i2, i3);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                x(context, "Theme.MaterialComponents", f);
            }
        }
        x(context, "Theme.AppCompat", e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void w(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pjf.V, i2, i3);
        boolean z = false;
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            for (int i4 : iArr2) {
                if (obtainStyledAttributes2.getResourceId(i4, -1) == -1) {
                    obtainStyledAttributes2.recycle();
                    break;
                }
            }
            obtainStyledAttributes2.recycle();
            z = true;
            obtainStyledAttributes.recycle();
            if (z) {
                return;
            }
            a70.p("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void x(Context context, String str, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!obtainStyledAttributes.hasValue(i2)) {
                obtainStyledAttributes.recycle();
                a70.p(lnb.o("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        if (r2 == 1.0d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap y(Drawable drawable, Bitmap.Config config, kjh kjhVar, jrg jrgVar, kjh kjhVar2, boolean z) {
        jrg jrgVar2 = jrgVar;
        kjh kjhVar3 = kjhVar2;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap.getConfig() == ((config == null || pco.H(config)) ? Bitmap.Config.ARGB_8888 : config)) {
                if (!z) {
                    long q = tol.q(bitmap.getWidth(), bitmap.getHeight(), kjhVar, jrgVar2, kjhVar3);
                    double r = tol.r(bitmap.getWidth(), bitmap.getHeight(), (int) (q >> 32), (int) (q & 4294967295L), jrgVar2, kjhVar2);
                    jrgVar2 = jrgVar2;
                    kjhVar3 = kjhVar2;
                }
                return bitmap;
            }
        }
        Drawable mutate = drawable.mutate();
        int b2 = gjk.b(mutate);
        if (b2 <= 0) {
            b2 = 512;
        }
        int a2 = gjk.a(mutate);
        int i2 = a2 > 0 ? a2 : 512;
        long q2 = tol.q(b2, i2, kjhVar, jrgVar2, kjhVar3);
        int i3 = i2;
        double r2 = tol.r(b2, i3, (int) (q2 >> 32), (int) (q2 & 4294967295L), jrgVar2, kjhVar3);
        int a3 = wzb.a(b2 * r2);
        int a4 = wzb.a(r2 * i3);
        Bitmap createBitmap = Bitmap.createBitmap(a3, a4, (config == null || pco.H(config)) ? Bitmap.Config.ARGB_8888 : config);
        Rect bounds = mutate.getBounds();
        int i4 = bounds.left;
        int i5 = bounds.top;
        int i6 = bounds.right;
        int i7 = bounds.bottom;
        mutate.setBounds(0, 0, a3, a4);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i4, i5, i6, i7);
        return createBitmap;
    }

    public static final long z(InputStream inputStream, OutputStream outputStream) {
        inputStream.getClass();
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        long j2 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j2 += read;
            read = inputStream.read(bArr);
        }
        return j2;
    }

    public abstract void Z(String str);
}
