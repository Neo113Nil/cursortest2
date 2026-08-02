package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.blaze.blazesdk.ads.models.dto.AdInfoDto;
import com.blaze.blazesdk.ads.models.dto.BannerAdInfoDto;
import com.blaze.blazesdk.ads.models.ui.BlazeAdInfoModel;
import com.blaze.blazesdk.ads.models.ui.BlazeBannerAdInfo;
import com.blaze.blazesdk.closed_captions.models.dto.ClosedCaptionsDto;
import com.blaze.blazesdk.features.stories.models.dto.PageDto;
import com.blaze.blazesdk.features.stories.models.dto.StoryDto;
import com.blaze.blazesdk.features.stories.models.ui.StoryModel;
import com.blaze.blazesdk.interactions.models.ui.InteractionModel;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.Tweet;
import com.sofascore.model.network.response.TweetMedia;
import com.sofascore.model.network.response.TwitterAccount;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class o3a {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;

    public static final long A(Bundle bundle, String str) {
        str.getClass();
        long j = bundle.getLong(str, Long.MIN_VALUE);
        if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
            return j;
        }
        w3a.I(str);
        throw null;
    }

    public static final Bundle B(Bundle bundle, String str) {
        str.getClass();
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        w3a.I(str);
        throw null;
    }

    public static final String C(Bundle bundle, String str) {
        str.getClass();
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        w3a.I(str);
        throw null;
    }

    public static final String[] D(Bundle bundle, String str) {
        str.getClass();
        String[] stringArray = bundle.getStringArray(str);
        if (stringArray != null) {
            return stringArray;
        }
        w3a.I(str);
        throw null;
    }

    public static final ArrayList E(Bundle bundle, String str) {
        str.getClass();
        ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList != null) {
            return stringArrayList;
        }
        w3a.I(str);
        throw null;
    }

    public static final Integer F(Tournament tournament) {
        tournament.getClass();
        UniqueTournament uniqueTournament = tournament.getUniqueTournament();
        if (uniqueTournament != null) {
            return Integer.valueOf(uniqueTournament.getId());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Drawable G(Context context, String str) {
        Integer num;
        context.getClass();
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            String r = c.r(lowerCase, " ", "_", false);
            if (StringsKt.J(r, "cloud", false)) {
                num = Integer.valueOf(R.drawable.weather_sunny_cloud);
            } else if (r.equals("heavy_rain")) {
                num = Integer.valueOf(R.drawable.weather_heavy_rain);
            } else if (StringsKt.J(r, "rain", false)) {
                num = Integer.valueOf(R.drawable.weather_rain);
            } else if (StringsKt.J(r, "sunny", false) || StringsKt.J(r, "hot", false)) {
                num = Integer.valueOf(R.drawable.weather_sunny);
            } else if (StringsKt.J(r, "fog", false)) {
                num = Integer.valueOf(R.drawable.weather_fog);
            } else if (StringsKt.J(r, "windy", false)) {
                num = Integer.valueOf(R.drawable.weather_windy);
            }
            if (num == null) {
                return context.getDrawable(num.intValue());
            }
            return null;
        }
        num = null;
        if (num == null) {
        }
    }

    public static boolean H(int i) {
        return i != 0 && o23.f(i) > 0.5d;
    }

    public static final boolean I(Bundle bundle, String str) {
        str.getClass();
        return r(bundle, str) && bundle.get(str) == null;
    }

    public static int J(float f, int i, int i2) {
        return o23.h(o23.k(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static final String K(String str) {
        List q = i5h.q(i5h.n(new Regex("\\d{4}").c(str), new jie(1)));
        if (q.size() != 2) {
            return str;
        }
        return String.format("%02d/%02d", Arrays.copyOf(new Object[]{Integer.valueOf(((Number) q.get(0)).intValue() % 100), Integer.valueOf(((Number) q.get(1)).intValue() % 100)}, 2));
    }

    public static final Object L(Object[] objArr, uqg uqgVar, String str, Function0 function0, of3 of3Var, int i, int i2) {
        Object[] objArr2;
        Object obj;
        Object f;
        if ((i2 & 2) != 0) {
            uqgVar = f5p.m;
        }
        uqg uqgVar2 = uqgVar;
        if ((i2 & 4) != 0) {
            str = null;
        }
        av8 av8Var = (av8) of3Var;
        long j = av8Var.T;
        if (str == null || str.length() == 0) {
            str = Long.toString(j, CharsKt.checkRadix(36));
            str.getClass();
        }
        String str2 = str;
        uqgVar2.getClass();
        spg spgVar = (spg) av8Var.k(upg.a);
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (O == a99Var) {
            Object k = (spgVar == null || (f = spgVar.f(str2)) == null) ? null : uqgVar2.k(f);
            if (k == null) {
                k = function0.invoke();
            }
            objArr2 = objArr;
            lpg lpgVar = new lpg(uqgVar2, spgVar, str2, k, objArr2);
            av8Var.n0(lpgVar);
            O = lpgVar;
        } else {
            objArr2 = objArr;
        }
        lpg lpgVar2 = (lpg) O;
        Object obj2 = Arrays.equals(objArr2, lpgVar2.e) ? lpgVar2.d : null;
        if (obj2 == null) {
            obj2 = function0.invoke();
        }
        boolean i3 = av8Var.i(lpgVar2) | ((((i & 112) ^ 48) > 32 && av8Var.i(uqgVar2)) || (i & 48) == 32) | av8Var.i(spgVar) | av8Var.g(str2) | av8Var.i(obj2) | av8Var.i(objArr2);
        Object O2 = av8Var.O();
        if (i3 || O2 == a99Var) {
            Object[] objArr3 = objArr2;
            obj = obj2;
            f05 f05Var = new f05(lpgVar2, uqgVar2, spgVar, str2, obj, objArr3);
            av8Var.n0(f05Var);
            O2 = f05Var;
        } else {
            obj = obj2;
        }
        hz8.t((Function0) O2, av8Var);
        return obj;
    }

    public static final Object M(Object[] objArr, uqg uqgVar, Function0 function0, of3 of3Var, int i) {
        return L(Arrays.copyOf(objArr, objArr.length), uqgVar, null, function0, of3Var, (i & 112) | 384 | ((i << 3) & 7168), 0);
    }

    public static final Object N(Object[] objArr, Function0 function0, of3 of3Var, int i) {
        return L(Arrays.copyOf(objArr, objArr.length), f5p.m, null, function0, of3Var, ((i << 6) & 7168) | 384, 0);
    }

    public static int O(Context context, TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? context.getColor(i) : typedValue.data;
    }

    public static final ltb P(Bundle bundle) {
        ltb ltbVar = new ltb(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            ltbVar.put(str, bundle.get(str));
        }
        return ltbVar.d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        if (r0 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final l4k Q(Tweet tweet, int i, String str) {
        gv9 gv9Var;
        o4k m4kVar;
        tweet.getClass();
        String id = tweet.getId();
        TwitterAccount account = tweet.getAccount();
        String text = tweet.getText();
        List<TweetMedia> media = tweet.getMedia();
        if (media != null) {
            ArrayList arrayList = new ArrayList(k13.r(media, 10));
            for (TweetMedia tweetMedia : media) {
                if (tweetMedia.getVideoUrl() != null) {
                    String id2 = tweetMedia.getId();
                    String imageUrl = tweetMedia.getImageUrl();
                    String videoUrl = tweetMedia.getVideoUrl();
                    videoUrl.getClass();
                    m4kVar = new n4k(id2, imageUrl, videoUrl);
                } else {
                    m4kVar = new m4k(tweetMedia.getId(), tweetMedia.getImageUrl());
                }
                arrayList.add(m4kVar);
            }
            gv9Var = l6g.W(arrayList);
        }
        gv9Var = rlh.b;
        gv9 gv9Var2 = gv9Var;
        long createdAtTimestamp = tweet.getCreatedAtTimestamp();
        bi4 bi4Var = bi4.PATTERN_DDMMY;
        ConcurrentHashMap concurrentHashMap = hk4.a;
        String i2 = fc6.i(createdAtTimestamp, hk4.a(bi4Var.d()));
        List<TweetMedia> media2 = tweet.getMedia();
        return new l4k(id, i, str, account, text, gv9Var2, i2, (media2 != null ? media2.size() : 0) > 1, tweet.getExternalUrl());
    }

    public static void R(long j, String str) {
        if (j >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 17);
        i.n(j, str, " (", sb);
        vp2.f(sb, ") must be >= 0");
    }

    public static void S(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static boolean T(byte b2) {
        return b2 > -65;
    }

    public static final m3a a(String str, KSerializer kSerializer) {
        return new m3a(str, new n3a(kSerializer));
    }

    public static final void b(afl aflVar, boolean z, Function1 function1, of3 of3Var, int i) {
        afl aflVar2;
        mv1 mv1Var = uxf.e;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1930580741);
        int i2 = i | (av8Var.g(aflVar) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.i(function1) ? 256 : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            utc utcVar = utc.a;
            float f = 16.0f;
            xtc q = n9e.q(wnn.A(bkh.p(utcVar, 156.0f), o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f));
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object O = av8Var.O();
            if (z2 || O == nf3.a) {
                O = new fej(27, function1, aflVar);
                av8Var.n0(O);
            }
            xtc y = tol.y(q, false, false, false, 0L, null, (Function0) O, av8Var, 31);
            av8 av8Var2 = av8Var;
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, y);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            xtc d2 = bkh.d(utcVar, 1.0f);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, d2);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c2, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            i9a.i(Double.valueOf(aflVar.c), false, kda.O(l98.f0(utcVar, 16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), "wc26_player_rating", av8Var2), null, null, null, false, av8Var2, 432, 496);
            n12 n12Var = n12.a;
            if (z) {
                av8Var2.d0(-1311860315);
                td4.D(aflVar.a, 0, av8Var2, rd0.O(bkh.l(n12Var.a(utcVar, mv1Var), 104.0f), 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2));
                av8Var2.s(false);
            } else {
                av8Var2.d0(-1311569938);
                f = 16.0f;
                td4.C(aflVar.a, bkh.l(l98.f0(n12Var.a(utcVar, mv1Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 12.0f, 16.0f, 1), 60.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 0, 12);
                av8Var2 = av8Var2;
                av8Var2.s(false);
            }
            av8Var2.s(true);
            xtc f0 = l98.f0(utcVar, f, 8.0f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
            String str = aflVar.b;
            long D = lz.D(R.color.n_lv_1, av8Var2);
            yf8 yf8Var = xth.a;
            av8 av8Var3 = av8Var2;
            float f2 = f;
            udj.c(str, f0, D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var3, 0, 24960, 110584);
            lv1 lv1Var = uxf.m;
            xtc e0 = l98.e0(utcVar, f2, 4.0f, f2, 8.0f);
            l8g a3 = k8g.a(ww9.b, lv1Var, av8Var3, 48);
            int hashCode3 = Long.hashCode(av8Var3.T);
            aee m3 = av8Var3.m();
            xtc C3 = fqj.C(av8Var3, e0);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a3, f50Var);
            waa.K(av8Var3, m3, ff3Var);
            bf3.s(hashCode3, av8Var3, f50Var2, av8Var3, ryVar);
            waa.K(av8Var3, C3, f50Var3);
            aflVar2 = aflVar;
            td4.k(aflVar2.d, bkh.l(utcVar, f2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var3, 48, 12);
            udj.c(aflVar2.e, l98.f0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), lz.D(R.color.n_lv_3, av8Var3), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var3, 48, 24960, 110584);
            av8Var = av8Var3;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            aflVar2 = aflVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cfl(aflVar2, z, function1, i, 0);
        }
    }

    public static final void c(gv9 gv9Var, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1206803903);
        int i2 = (av8Var.g(gv9Var) ? 4 : 2) | i | 48;
        int i3 = 14;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            int i4 = 5;
            t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5);
            boolean z = (i2 & 14) == 4;
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new uo(i4, gv9Var);
                av8Var.n0(O);
            }
            utc utcVar = utc.a;
            v8a.a(utcVar, null, C, null, null, null, false, null, (Function1) O, av8Var, 390, 506);
            xtcVar = utcVar;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new y81(gv9Var, xtcVar, i, i3);
        }
    }

    public static final void d(int i, Boolean bool, xtc xtcVar, of3 of3Var, int i2, int i3) {
        xtc xtcVar2;
        int i4;
        av8 av8Var;
        xtc xtcVar3;
        String f;
        boolean z;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(385819044);
        int i5 = i2 | (av8Var2.e(i) ? 4 : 2) | (av8Var2.g(bool) ? 32 : 16);
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 = i5 | 384;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i4 = i5 | (av8Var2.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        }
        if (av8Var2.T(i4 & 1, (i4 & 147) != 146)) {
            utc utcVar = utc.a;
            xtc xtcVar4 = i6 != 0 ? utcVar : xtcVar2;
            Context context = (Context) av8Var2.k(nz.b);
            xtc O = kda.O(bkh.d(xtcVar4, 1.0f), "regulations_main_text", av8Var2);
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, O);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            if (zu3.k.hasMcc(Integer.valueOf(i))) {
                f = ljg.k(av8Var2, -226382190, R.string.gambling_disclaimer_canada, av8Var2, false);
            } else {
                av8Var2.d0(-226379381);
                av8Var2.s(false);
                f = rld.f(context, Intrinsics.c(bool, Boolean.TRUE));
            }
            xtc xtcVar5 = xtcVar4;
            xtc c0 = l98.c0(utcVar, 16.0f, 8.0f);
            yf8 yf8Var = xth.a;
            xtcVar3 = xtcVar5;
            udj.c(f, c0, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.g(), av8Var2, 48, 0, 130040);
            av8Var = av8Var2;
            if (zu3.d.hasMcc(Integer.valueOf(i))) {
                av8Var.d0(1572696939);
                udj.c(rld.i(context), l98.c0(n9e.q(utcVar, r13.d, o7g.a(16.0f)), 16.0f, 8.0f), r13.b, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.g(), av8Var, 384, 0, 130040);
                av8Var = av8Var;
                av8Var.s(false);
                z = true;
            } else if (zu3.c.hasMcc(Integer.valueOf(i))) {
                av8Var.d0(1573205928);
                z = true;
                udj.c(oea.w(R.string.toolbar_subtitle_template, new Object[]{oea.v(R.string.responsible_gambling_argentina_title, av8Var), oea.v(R.string.responsible_gambling_argentina_text, av8Var)}, av8Var), l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.g(), av8Var, 48, 0, 130040);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                z = true;
                av8Var.d0(1573738632);
                av8Var.s(false);
            }
            av8Var.s(z);
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar3 = xtcVar2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wx1(i, bool, xtcVar3, i2, i3, 7);
        }
    }

    public static final void e(z2e z2eVar, xtc xtcVar, of3 of3Var, int i, int i2) {
        xtc xtcVar2;
        int i3;
        av8 av8Var;
        z2eVar.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-221601346);
        int i4 = i | (av8Var2.g(z2eVar) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i3 = i4 | (av8Var2.g(xtcVar2) ? 32 : 16);
        }
        if (av8Var2.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc xtcVar3 = i5 != 0 ? utcVar : xtcVar2;
            Context context = (Context) av8Var2.k(nz.b);
            long D = lz.D(R.color.n_lv_4, av8Var2);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var2);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = jxa.C;
                av8Var2.n0(O2);
            }
            xtc y = tol.y(xtcVar3, true, true, true, D, wzcVar, new gi(22, (boh) N(objArr, (Function0) O2, av8Var2, 48), context, z2eVar), av8Var2, 0);
            xtcVar2 = xtcVar3;
            xtc c0 = l98.c0(bkh.d(y, 1.0f), 16.0f, 8.0f);
            l8g a2 = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.m, av8Var2, 54);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            String str = z2eVar.d;
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var2, 0, 0, 131066);
            td4.C(z2eVar.a, bkh.l(utcVar, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 48, 12);
            kda.e(z2eVar.e, 0, av8Var2, new goa(1.0f, true), z2eVar.b, z2eVar.f);
            i9a.i(Double.valueOf(z2eVar.h), false, null, null, null, null, false, av8Var2, 432, PglCryptUtils.BASE64_FAILED);
            av8Var = av8Var2;
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        xtc xtcVar4 = xtcVar2;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p8b(i, i2, 14, z2eVar, xtcVar4);
        }
    }

    public static final void f(boolean z, Function2 function2, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1818896922);
        int i2 = (av8Var.h(z) ? 4 : 2) | i | (av8Var.i(function2) ? 32 : 16);
        if ((i2 & 19) == 18 && av8Var.D()) {
            av8Var.W();
        } else {
            h5a.r(z, function2, av8Var, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new m81(z, function2, i);
        }
    }

    public static final void g(String str, boolean z, Function1 function1, xtc xtcVar, String str2, of3 of3Var, int i, int i2) {
        int i3;
        String str3;
        int i4;
        String str4;
        str.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-154792095);
        if ((i & 6) == 0) {
            i3 = (av8Var.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | (av8Var.h(z) ? 32 : 16);
        if ((i & 384) == 0) {
            i5 |= av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= av8Var.g(xtcVar) ? a.o : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i4 = i5 | 24576;
            str3 = str2;
        } else {
            str3 = str2;
            i4 = i5 | (av8Var.g(str3) ? 16384 : 8192);
        }
        if (av8Var.T(i4 & 1, (i4 & 9363) != 9362)) {
            String str5 = i6 != 0 ? null : str3;
            tol.b(l7a.c.a(new p75(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), yqo.H(-976505823, av8Var, new f70(xtcVar, z, function1, str, str5, 14)), av8Var, 56);
            str4 = str5;
        } else {
            av8Var.W();
            str4 = str3;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ci(str, z, function1, xtcVar, str4, i, i2);
        }
    }

    public static final void h(c2j c2jVar, boolean z, xtc xtcVar, of3 of3Var, int i) {
        c2jVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1427805202);
        int i2 = i | (av8Var.g(c2jVar) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            xtc d2 = bkh.d(xtcVar, 1.0f);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 0);
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
            utc utcVar = utc.a;
            xtc c0 = l98.c0(bkh.d(utcVar, 1.0f), 16.0f, 8.0f);
            l8g a3 = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, c0);
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
            td4.z(null, bkh.l(utcVar, 40.0f), av8Var, 54);
            u23 a4 = t23.a(new ng0(4.0f, true, new a70(6)), kv1Var, av8Var, 6);
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
            String str = c2jVar.b;
            long D = lz.D(R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(str, null, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            r9k r9kVar = c2jVar.c;
            if (r9kVar == null) {
                av8Var.d0(1379080195);
                av8Var.s(false);
            } else {
                av8Var.d0(1379080196);
                udj.c(r9kVar.a(av8Var), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
                av8Var = av8Var;
                Unit unit = Unit.a;
                av8Var.s(false);
            }
            av8Var.s(true);
            av8Var.s(true);
            if (z) {
                av8Var.d0(-759409527);
                tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 14, 0L, 0L, av8Var, l98.f0(utcVar, 72.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14));
                av8Var.s(false);
            } else {
                av8Var.d0(-759327842);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t60((Object) c2jVar, z, xtcVar, i, 25);
        }
    }

    public static final void i(String str, vy8 vy8Var, cfj cfjVar, int i, of3 of3Var, int i2, int i3) {
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-192911377);
        int i5 = (av8Var.g(str) ? 4 : 2) | i2;
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = i5 | 48;
        } else {
            i4 = i5 | (av8Var.g(vy8Var) ? 32 : 16);
        }
        int i7 = i4 | (av8Var.g(cfjVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i8 = i3 & 8;
        if (i8 != 0) {
            i7 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i7 |= av8Var.e(i) ? a.o : 1024;
        }
        if ((i7 & 1171) == 1170 && av8Var.D()) {
            av8Var.W();
        } else {
            av8Var.Y();
            if ((i2 & 1) == 0 || av8Var.B()) {
                if (i6 != 0) {
                    vy8Var = ty8.a;
                }
                if (i8 != 0) {
                    i = Integer.MAX_VALUE;
                }
            } else {
                av8Var.W();
            }
            av8Var.t();
            sdj sdjVar = sdj.b;
            av8Var.e0(-1115894518);
            av8Var.e0(1886828752);
            if (!(av8Var.a instanceof pf0)) {
                z8e.N();
                throw null;
            }
            av8Var.b0();
            if (av8Var.S) {
                av8Var.l(new gj0(1, sdjVar));
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, str, ned.L);
            waa.K(av8Var, vy8Var, ned.M);
            waa.K(av8Var, cfjVar, tdj.j);
            tdj tdjVar = tdj.k;
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(i))) {
                av8Var.n0(Integer.valueOf(i));
                av8Var.b(Integer.valueOf(i), tdjVar);
            }
            ljg.t(av8Var, true, false, false);
        }
        vy8 vy8Var2 = vy8Var;
        int i9 = i;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new qs9(str, vy8Var2, cfjVar, i9, i2, i3);
        }
    }

    public static final void j(int i, of3 of3Var, gv9 gv9Var, xtc xtcVar, Function1 function1, boolean z) {
        av8 av8Var;
        gv9Var.getClass();
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1250597570);
        int i2 = i | (av8Var2.g(gv9Var) ? 4 : 2) | (av8Var2.h(z) ? 32 : 16) | (av8Var2.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.g(xtcVar) ? a.o : 1024);
        if (av8Var2.T(i2 & 1, (i2 & 1171) != 1170)) {
            xtc f0 = l98.f0(bkh.d(xtcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            u23 a2 = t23.a(new ng0(16.0f, true, new a70(6)), uxf.o, av8Var2, 6);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, f0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a3 = k8g.a(ww9.h, uxf.m, av8Var2, 54);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, d0);
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
            String v = oea.v(R.string.stars_of_the_qualifiers, av8Var2);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var2, 0, 0, 131066);
            ImageVector N = s6a.N(R.drawable.ic_info, 6, av8Var2);
            long D = lz.D(R.color.n_lv_1, av8Var2);
            xtc A = wnn.A(bkh.l(utcVar, 28.0f), o7g.a);
            long D2 = lz.D(R.color.n_lv_4, av8Var2);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var2);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = wzj.l;
                av8Var2.n0(O2);
            }
            kq9.b(N, null, l98.b0(tol.y(A, true, true, true, D2, wzcVar, new uel(1, (boh) N(objArr, (Function0) O2, av8Var2, 48), function1), av8Var2, 0), 4.0f), D, av8Var2, 48, 0);
            av8Var2.s(true);
            xtc d2 = bkh.d(utcVar, 1.0f);
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            t3e B = l98.B(8.0f, 2);
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object O3 = av8Var2.O();
            if (z2 || O3 == a99Var) {
                O3 = new bfl(gv9Var, z, function1, 0);
                av8Var2.n0(O3);
            }
            v8a.c(d2, null, B, ng0Var, null, null, false, null, (Function1) O3, av8Var2, 24966, 490);
            av8Var = av8Var2;
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new u73(gv9Var, z, function1, xtcVar, i, 2);
        }
    }

    public static final List k(List list, int i, int i2) {
        list.getClass();
        if (i2 > 0) {
            list.getClass();
            if (i >= 0 && i < list.size()) {
                return list.subList(i, Math.min(i2 + i, list.size()));
            }
        }
        return km5.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x025b, code lost:
    
        if (r0 != null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0178, code lost:
    
        if (r0 == null) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List l(List list, AdInfoDto adInfoDto) {
        Date date;
        Iterator it;
        StoryDto storyDto;
        int i;
        km5 km5Var;
        BlazeAdInfoModel blazeAdInfoModel;
        BlazeAdInfoModel k;
        BlazeBannerAdInfo blazeBannerAdInfo;
        Map map;
        Map<String, String> extraInfo;
        BannerAdInfoDto bannerAdInfo;
        AdInfoDto adInfo;
        Iterator it2;
        StoryDto storyDto2;
        srl srlVar;
        Map map2;
        StoryDto storyDto3;
        Pair pair;
        Boolean isLive;
        String description;
        String title;
        String id;
        if (list == null) {
            return km5.a;
        }
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            StoryDto storyDto4 = (StoryDto) it3.next();
            String str = (storyDto4 == null || (id = storyDto4.getId()) == null) ? "" : id;
            String str2 = (storyDto4 == null || (title = storyDto4.getTitle()) == null) ? "" : title;
            String str3 = (storyDto4 == null || (description = storyDto4.getDescription()) == null) ? "" : description;
            boolean booleanValue = (storyDto4 == null || (isLive = storyDto4.isLive()) == null) ? false : isLive.booleanValue();
            if (storyDto4 == null || (date = storyDto4.getUpdateTime()) == null) {
                date = new Date();
            }
            Date date2 = date;
            List a2 = ohm.a(storyDto4 != null ? storyDto4.getThumbnails() : null);
            List<PageDto> pages = storyDto4 != null ? storyDto4.getPages() : null;
            if (pages != null) {
                ArrayList arrayList2 = new ArrayList();
                for (PageDto pageDto : pages) {
                    if (pageDto != null) {
                        String id2 = pageDto.getId();
                        String str4 = id2 == null ? "" : id2;
                        String type = pageDto.getType();
                        String str5 = type == null ? "" : type;
                        Integer index = pageDto.getIndex();
                        int intValue = index != null ? index.intValue() : -1;
                        Double duration = pageDto.getDuration();
                        double doubleValue = duration != null ? duration.doubleValue() : 0.0d;
                        Boolean isSkippable = pageDto.isSkippable();
                        boolean booleanValue2 = isSkippable != null ? isSkippable.booleanValue() : true;
                        xvm b2 = ohm.b(pageDto.getThumbnail());
                        com.blaze.blazesdk.features.shared.models.ui_shared.i a3 = szl.a(pageDto.getCta());
                        Date updateTime = pageDto.getUpdateTime();
                        Date createTime = pageDto.getCreateTime();
                        rvl s = x2a.s(pageDto.getBaseLayer(), n3m.MP4);
                        InteractionModel a4 = msl.a(pageDto.getInteraction());
                        List<ClosedCaptionsDto> closedCaptions = pageDto.getClosedCaptions();
                        ArrayList j = closedCaptions != null ? d2a.j(closedCaptions) : null;
                        Boolean ignoreReadStatusForStory = pageDto.getIgnoreReadStatusForStory();
                        boolean booleanValue3 = ignoreReadStatusForStory != null ? ignoreReadStatusForStory.booleanValue() : false;
                        String parentStoryId = pageDto.getParentStoryId();
                        Map<String, String> extraInfo2 = pageDto.getExtraInfo();
                        if (extraInfo2 != null) {
                            ArrayList arrayList3 = new ArrayList();
                            for (Map.Entry<String, String> entry : extraInfo2.entrySet()) {
                                String key = entry.getKey();
                                Iterator it4 = it3;
                                String value = entry.getValue();
                                if (key == null || value == null) {
                                    storyDto3 = storyDto4;
                                    pair = null;
                                } else {
                                    storyDto3 = storyDto4;
                                    pair = new Pair(key, value);
                                }
                                if (pair != null) {
                                    arrayList3.add(pair);
                                }
                                it3 = it4;
                                storyDto4 = storyDto3;
                            }
                            it2 = it3;
                            storyDto2 = storyDto4;
                            map2 = tub.o(arrayList3);
                        } else {
                            it2 = it3;
                            storyDto2 = storyDto4;
                        }
                        map2 = lm5.a;
                        map2.getClass();
                        Map map3 = map2;
                        Boolean shouldShowBannerAd = pageDto.getShouldShowBannerAd();
                        srlVar = new srl(str4, doubleValue, booleanValue2, b2, a3, updateTime, s, Boolean.FALSE, str5, intValue, createTime, a4, booleanValue3, j, parentStoryId, map3, shouldShowBannerAd != null ? shouldShowBannerAd.booleanValue() : true, pageDto.getRetrievedLanguages());
                    } else {
                        it2 = it3;
                        storyDto2 = storyDto4;
                        srlVar = null;
                    }
                    if (srlVar != null) {
                        arrayList2.add(srlVar);
                    }
                    it3 = it2;
                    storyDto4 = storyDto2;
                }
                it = it3;
                storyDto = storyDto4;
                i = 0;
                km5Var = arrayList2;
            } else {
                it = it3;
                storyDto = storyDto4;
                i = 0;
                km5Var = km5.a;
            }
            km5 km5Var2 = km5Var;
            if (storyDto == null || (adInfo = storyDto.getAdInfo()) == null || (k = t6a.k(adInfo)) == null) {
                if (adInfoDto != null) {
                    k = t6a.k(adInfoDto);
                } else {
                    blazeAdInfoModel = null;
                    if (storyDto != null || (bannerAdInfo = storyDto.getBannerAdInfo()) == null) {
                        blazeBannerAdInfo = null;
                    } else {
                        String adUnitId = bannerAdInfo.getAdUnitId();
                        String size = bannerAdInfo.getSize();
                        Map<String, String> context = bannerAdInfo.getContext();
                        if (context == null) {
                            context = lm5.a;
                            context.getClass();
                        }
                        blazeBannerAdInfo = new BlazeBannerAdInfo(adUnitId, size, context);
                    }
                    BlazeAdInfoModel k2 = adInfoDto == null ? t6a.k(adInfoDto) : null;
                    List<String> geoRestriction = storyDto == null ? storyDto.getGeoRestriction() : null;
                    if (storyDto != null && (extraInfo = storyDto.getExtraInfo()) != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (Map.Entry<String, String> entry2 : extraInfo.entrySet()) {
                            String key2 = entry2.getKey();
                            String value2 = entry2.getValue();
                            Pair pair2 = (key2 == null || value2 == null) ? null : new Pair(key2, value2);
                            if (pair2 != null) {
                                arrayList4.add(pair2);
                            }
                        }
                        map = tub.o(arrayList4);
                    }
                    map = lm5.a;
                    map.getClass();
                    arrayList.add(new StoryModel(str, str2, booleanValue, date2, false, new Date(), str3, a2, km5Var2, blazeAdInfoModel, blazeBannerAdInfo, k2, geoRestriction, map, storyDto == null ? storyDto.getRetrievedLanguages() : null, false, false, 0, 0, Integer.valueOf(i)));
                    it3 = it;
                }
            }
            blazeAdInfoModel = k;
            if (storyDto != null) {
            }
            blazeBannerAdInfo = null;
            if (adInfoDto == null) {
            }
            if (storyDto == null) {
            }
            if (storyDto != null) {
                ArrayList arrayList42 = new ArrayList();
                while (r0.hasNext()) {
                }
                map = tub.o(arrayList42);
            }
            map = lm5.a;
            map.getClass();
            arrayList.add(new StoryModel(str, str2, booleanValue, date2, false, new Date(), str3, a2, km5Var2, blazeAdInfoModel, blazeBannerAdInfo, k2, geoRestriction, map, storyDto == null ? storyDto.getRetrievedLanguages() : null, false, false, 0, 0, Integer.valueOf(i)));
            it3 = it;
        }
        return arrayList;
    }

    public static final Map m(Map map) {
        map.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Pair pair = null;
            if (str2 != null) {
                if (StringsKt.R(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    pair = new Pair(str, str2);
                }
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return tub.o(arrayList);
    }

    public static final void n(StringBuilder sb, Class cls) {
        while (cls.isArray()) {
            sb.append(U3.j.d);
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (cls.equals(Void.TYPE)) {
            sb.append("V");
            return;
        }
        if (cls.equals(Integer.TYPE)) {
            sb.append("I");
            return;
        }
        if (cls.equals(Long.TYPE)) {
            sb.append("J");
            return;
        }
        if (cls.equals(Short.TYPE)) {
            sb.append(PlayerKt.VOLLEYBALL_SETTER);
            return;
        }
        if (cls.equals(Byte.TYPE)) {
            sb.append("B");
            return;
        }
        if (cls.equals(Boolean.TYPE)) {
            sb.append("Z");
            return;
        }
        if (cls.equals(Character.TYPE)) {
            sb.append("C");
            return;
        }
        if (cls.equals(Float.TYPE)) {
            sb.append("F");
            return;
        }
        if (cls.equals(Double.TYPE)) {
            sb.append("D");
            return;
        }
        sb.append("L");
        String replace = cls.getName().replace('.', '/');
        replace.getClass();
        sb.append((CharSequence) replace);
        sb.append(";");
    }

    public static final Object o(ddb ddbVar, rq3 rq3Var) {
        try {
            if (ddbVar.isDone()) {
                return p7.g(ddbVar);
            }
            lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
            ddbVar.addListener(new a8p(ddbVar, lj2Var), h35.a);
            lj2Var.v(new oo(ddbVar, 27));
            Object q = lj2Var.q();
            lu3 lu3Var = lu3.a;
            return q;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                Intrinsics.g();
            }
            throw cause;
        }
    }

    public static void p(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static int q(int i, int i2) {
        return o23.k(i, (Color.alpha(i) * i2) / 255);
    }

    public static final boolean r(Bundle bundle, String str) {
        str.getClass();
        return bundle.containsKey(str);
    }

    public static final String s(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final boolean t(Bundle bundle, String str) {
        str.getClass();
        boolean z = bundle.getBoolean(str, false);
        if (z || !bundle.getBoolean(str, true)) {
            return z;
        }
        w3a.I(str);
        throw null;
    }

    public static final String u(Context context, Tournament tournament) {
        Integer tennisPoints;
        Integer tennisPoints2;
        tournament.getClass();
        context.getClass();
        StringBuilder sb = new StringBuilder();
        if (Intrinsics.c(tournament.getCategory().getSport().getSlug(), Sports.TENNIS)) {
            UniqueTournament uniqueTournament = tournament.getUniqueTournament();
            if (((uniqueTournament == null || (tennisPoints2 = uniqueTournament.getTennisPoints()) == null) ? 0 : tennisPoints2.intValue()) == 2000) {
                sb.append(context.getString(R.string.grand_slam));
                return sb.toString();
            }
        }
        String q = tba.q(tournament.getCategory(), context);
        sb.append(q);
        UniqueTournament uniqueTournament2 = tournament.getUniqueTournament();
        if (uniqueTournament2 != null && (tennisPoints = uniqueTournament2.getTennisPoints()) != null) {
            int intValue = tennisPoints.intValue();
            if (!Intrinsics.c(tournament.getCategory().getSport().getSlug(), Sports.TENNIS) || c.n(q, String.valueOf(intValue), false)) {
                tennisPoints = null;
            }
            if (tennisPoints != null) {
                int intValue2 = tennisPoints.intValue();
                sb.append(" ");
                sb.append(intValue2);
            }
        }
        return sb.toString();
    }

    public static Integer v(int i, Context context) {
        TypedValue K = x2a.K(context.getTheme(), i);
        if (K != null) {
            return Integer.valueOf(O(context, K));
        }
        return null;
    }

    public static final double w(Bundle bundle, String str) {
        str.getClass();
        double d2 = bundle.getDouble(str, Double.MIN_VALUE);
        if (d2 != Double.MIN_VALUE || bundle.getDouble(str, Double.MAX_VALUE) != Double.MAX_VALUE) {
            return d2;
        }
        w3a.I(str);
        throw null;
    }

    public static final float x(Bundle bundle, String str) {
        str.getClass();
        float f = bundle.getFloat(str, Float.MIN_VALUE);
        if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return f;
        }
        w3a.I(str);
        throw null;
    }

    public static final int y(Bundle bundle, String str) {
        str.getClass();
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i;
        }
        w3a.I(str);
        throw null;
    }

    public static final int[] z(Bundle bundle, String str) {
        str.getClass();
        int[] intArray = bundle.getIntArray(str);
        if (intArray != null) {
            return intArray;
        }
        w3a.I(str);
        throw null;
    }
}
