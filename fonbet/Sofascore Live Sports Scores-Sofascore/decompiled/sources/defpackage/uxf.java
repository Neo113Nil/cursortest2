package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.e;
import com.facebook.internal.u;
import com.facebook.internal.x;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.internal.cast.zzyh;
import com.google.android.gms.internal.consent_sdk.zzqp;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamSeasonForm;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.unity3d.services.UnityAdsConstants;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class uxf implements yx2, zzqp, zzyh, lg0, dx1, pjd, bt8, ky3, xy2, h18, hvd {
    public final /* synthetic */ int a;
    public static final uxf b = new uxf(0);
    public static final mv1 c = new mv1(-1.0f, -1.0f);
    public static final mv1 d = new mv1(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f);
    public static final mv1 e = new mv1(1.0f, -1.0f);
    public static final mv1 f = new mv1(-1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public static final mv1 g = new mv1(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public static final mv1 h = new mv1(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public static final mv1 i = new mv1(-1.0f, 1.0f);
    public static final mv1 j = new mv1(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
    public static final mv1 k = new mv1(1.0f, 1.0f);
    public static final lv1 l = new lv1(-1.0f);
    public static final lv1 m = new lv1(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public static final lv1 n = new lv1(1.0f);
    public static final kv1 o = new kv1(-1.0f);
    public static final kv1 p = new kv1(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public static final kv1 q = new kv1(1.0f);
    public static final uz r = new uz(1);
    public static final uz s = new uz(2);
    public static final uxf t = new uxf(4);
    public static final uxf u = new uxf(5);
    public static final uxf v = new uxf(6);
    public static final uxf w = new uxf(8);
    public static final uxf x = new uxf(9);
    public static final uxf y = new uxf(10);
    public static final uxf z = new uxf(11);
    public static final uxf A = new uxf(12);
    public static final uxf B = new uxf(13);
    public static final uxf C = new uxf(14);
    public static final uxf D = new uxf(15);

    public uxf(is8 is8Var) {
        this.a = 24;
    }

    public static byte[] A(hv9 hv9Var, long j2) {
        m72 m72Var = new m72(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(hv9Var.size());
        Iterator<E> it = hv9Var.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) m72Var.apply(it.next()));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(a.q, arrayList);
        bundle.putLong("d", j2);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static rd7 C(Integer num) {
        Object obj;
        Iterator<E> it = rd7.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            int i2 = ((rd7) obj).a;
            if (num != null && i2 == num.intValue()) {
                break;
            }
        }
        return (rd7) obj;
    }

    public static String D(double d2, double d3, int i2, boolean z2) {
        String format = String.format(Locale.US, lnb.k(i2, "%.", InneractiveMediationDefs.GENDER_FEMALE), Arrays.copyOf(new Object[]{Double.valueOf(wzb.a((d2 / d3) * r0) / Math.pow(10.0d, i2))}, 1));
        return (i2 <= 0 || z2) ? format : StringsKt.n0(StringsKt.n0(format, '0'), '.');
    }

    public static String E(double d2, int i2, boolean z2) {
        String D2;
        double d3;
        boolean z3 = (i2 & 4) == 0;
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        int i3 = (i2 & 32) == 0 ? 0 : 1;
        double d4 = (!z3 || d2 < 999500.0d || d2 >= 1000000.0d) ? d2 : 1000000.0d;
        if (d4 >= 1.0E9d) {
            D2 = D(d4, 1.0E9d, 1, false);
        } else {
            if (z2 && d4 >= 1.0E8d) {
                d3 = d4;
                D2 = D(d3, 1000000.0d, 0, false);
            } else if (d4 >= 1000000.0d) {
                d3 = d4;
                D2 = D(d3, 1000000.0d, 1, false);
            } else {
                D2 = d4 >= 10000.0d ? D(d4, 1000.0d, 1 ^ i3, false) : d4 >= 1000.0d ? D(d4, 1000.0d, 1, false) : D(d4, 1.0d, 1, false);
            }
            d4 = d3;
        }
        return dmi.y(D2, d4 >= 1.0E9d ? "B" : d4 >= 1000000.0d ? PlayerKt.FOOTBALL_MIDFIELDER : d4 >= 1000.0d ? CampaignEx.JSON_KEY_AD_K : "");
    }

    public static bx7 F(Event event, Context context, boolean z2, boolean z3, Double d2, Double d3, int i2) {
        String str;
        long j2;
        fy7 fy7Var;
        Context context2;
        fy7 fy7Var2;
        TeamSeasonForm awaySeasonForm$default;
        TeamSeasonForm homeSeasonForm$default;
        boolean z4 = (i2 & 2) != 0 ? false : z2;
        boolean z5 = (i2 & 4) == 0;
        boolean z6 = (i2 & 8) != 0 ? false : z3;
        String str2 = null;
        Double d4 = (i2 & 16) != 0 ? null : d2;
        Double d5 = (i2 & 32) != 0 ? null : d3;
        event.getClass();
        context.getClass();
        int id = event.getId();
        int id2 = event.getTournament().getId();
        Integer F = o3a.F(event.getTournament());
        UniqueTournament uniqueTournament = event.getTournament().getUniqueTournament();
        String x2 = uniqueTournament != null ? tba.x(uniqueTournament) : null;
        String w2 = tba.w(event.getTournament());
        String statusType = event.getStatusType();
        String s2 = ok3.s(event);
        String groupName = event.getTournament().getGroupName();
        if (event.getRoundInfo() != null) {
            Regex regex = d7g.a;
            str = d7g.b(context, event.getRoundInfo(), false, ok3.s(event));
        } else {
            str = null;
        }
        String f0 = CollectionsKt.f0(ph0.x(new String[]{groupName, str}), ", ", null, null, null, 62);
        long startTimestamp = event.getStartTimestamp();
        String statusDescription = event.getStatusDescription();
        if (z4) {
            j2 = startTimestamp;
            fy7Var = J(Event.getHomeTeam$default(event, null, 1, null), context, d4, z6, Event.getHomeTeamSeed$default(event, null, 1, null), 4);
        } else {
            j2 = startTimestamp;
            fy7Var = null;
        }
        if (z4) {
            context2 = context;
            fy7Var2 = J(Event.getAwayTeam$default(event, null, 1, null), context2, d5, z6, Event.getAwayTeamSeed$default(event, null, 1, null), 4);
        } else {
            context2 = context;
            fy7Var2 = null;
        }
        Integer display = z4 ? Event.getHomeScore$default(event, null, 1, null).getDisplay() : null;
        Integer display2 = z4 ? Event.getAwayScore$default(event, null, 1, null).getDisplay() : null;
        Integer winnerCode$default = z4 ? Event.getWinnerCode$default(event, null, 1, null) : null;
        String r2 = (!z5 || (homeSeasonForm$default = Event.getHomeSeasonForm$default(event, null, 1, null)) == null) ? null : v8a.r(homeSeasonForm$default, context2);
        if (z5 && (awaySeasonForm$default = Event.getAwaySeasonForm$default(event, null, 1, null)) != null) {
            str2 = v8a.r(awaySeasonForm$default, context2);
        }
        return new bx7(id, Integer.valueOf(id2), F, x2, w2, s2, fy7Var, fy7Var2, f0, statusType, statusDescription, Long.valueOf(j2), display, display2, r2, str2, winnerCode$default, event.shouldReverseTeams(), event.isDoublesMatch(), 131072);
    }

    public static ux7 G(Player player) {
        player.getClass();
        return new ux7(player.getId(), tba.t(player));
    }

    public static ey7 I(SubTeam subTeam, Context context) {
        context.getClass();
        int id = subTeam.getId();
        String D2 = tba.D(subTeam, context);
        if (D2 == null) {
            D2 = "";
        }
        Country country = subTeam.getCountry();
        return new ey7(id, D2, country != null ? country.getAlpha2() : null);
    }

    public static fy7 J(Team team, Context context, Double d2, boolean z2, String str, int i2) {
        SubTeam subTeam2;
        SubTeam subTeam1;
        Double d3 = (i2 & 2) != 0 ? null : d2;
        boolean z3 = (i2 & 4) == 0;
        boolean z4 = (i2 & 8) != 0 ? false : z2;
        String str2 = (i2 & 16) != 0 ? null : str;
        team.getClass();
        context.getClass();
        boolean z5 = z4;
        int id = team.getId();
        String str3 = str2;
        String p2 = tba.p(context, team);
        String A2 = tba.A(context, team);
        int type = team.getType();
        Country country = team.getCountry();
        String alpha2 = country != null ? country.getAlpha2() : null;
        Gender gender = z3 ? team.getGender() : null;
        String w2 = z5 ? qea.w(context, team) : null;
        return new fy7(id, p2, A2, type, (!z5 || (subTeam1 = team.getSubTeam1()) == null) ? null : I(subTeam1, context), (!z5 || (subTeam2 = team.getSubTeam2()) == null) ? null : I(subTeam2, context), w2, d3, alpha2, gender, z5 ? str3 : null, z5 ? team.getNational() : false);
    }

    public static iy7 K(UniqueTournament uniqueTournament) {
        return new iy7(Integer.valueOf(uniqueTournament.getId()), tba.x(uniqueTournament));
    }

    public static final Bundle y(int i2, String str, List list) {
        String str2;
        if (!cw3.a.contains(uxf.class)) {
            try {
                if (i2 == 0) {
                    throw null;
                }
                list.getClass();
                Bundle bundle = new Bundle();
                if (i2 == 1) {
                    str2 = "MOBILE_APP_INSTALL";
                } else {
                    if (i2 != 2) {
                        throw null;
                    }
                    str2 = "CUSTOM_APP_EVENTS";
                }
                bundle.putString("event", str2);
                bundle.putString(MBridgeConstans.APP_ID, str);
                if (2 != i2) {
                    return bundle;
                }
                JSONArray z2 = b.z(str, list);
                if (z2.length() != 0) {
                    bundle.putString("custom_events", z2.toString());
                    return bundle;
                }
            } catch (Throwable th) {
                cw3.a(uxf.class, th);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:11:0x002c, B:12:0x0062, B:16:0x0071, B:20:0x0088, B:26:0x003e, B:27:0x004d), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object B(String str, Map map, ct8 ct8Var, Function1 function1, Function1 function12, sq3 sq3Var) {
        htj htjVar;
        Object obj;
        int i2;
        int intValue;
        try {
            if (sq3Var instanceof htj) {
                htjVar = (htj) sq3Var;
                int i3 = htjVar.v;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    htjVar.v = i3 - Integer.MIN_VALUE;
                    obj = htjVar.t;
                    Object obj2 = lu3.a;
                    i2 = htjVar.v;
                    if (i2 != 0) {
                        y6a.M(obj);
                        Object k38Var = new k38(function1 != null ? ((k38) function1.invoke(new k38(str))).a : str);
                        htjVar.r = str;
                        htjVar.s = function12;
                        htjVar.v = 1;
                        obj = ct8Var.invoke(k38Var, map, htjVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i2 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        function12 = htjVar.s;
                        str = htjVar.r;
                        y6a.M(obj);
                    }
                    intValue = ((Number) obj).intValue();
                    if (200 <= intValue || intValue >= 300) {
                        if (function12 != null) {
                            function12.invoke(new k38(str));
                        }
                        return obj;
                    }
                    cjb.b("Successfully fired [" + str + ']');
                    return obj;
                }
            }
            if (i2 != 0) {
            }
            intValue = ((Number) obj).intValue();
            if (200 <= intValue) {
            }
            if (function12 != null) {
            }
            return obj;
        } catch (Throwable th) {
            if (function12 != null) {
                function12.invoke(new k38(str));
            }
            cjb.b("Error firing tracker [" + str + "] - " + th);
            return new Integer(-1011);
        }
        htjVar = new htj(this, sq3Var);
        obj = htjVar.t;
        Object obj22 = lu3.a;
        i2 = htjVar.v;
    }

    @Override // defpackage.bt8
    public Object apply(Object obj) {
        Object[] objArr = (Object[]) obj;
        if (objArr.length == 2) {
            return new ku0((String) objArr[0], (mu0) objArr[1]);
        }
        hg6.d(objArr.length, "Array of size 2 expected but got ");
        return null;
    }

    @Override // defpackage.dx1
    public Bitmap f(int i2, int i3) {
        return Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
    }

    @Override // defpackage.dx1
    public Bitmap h(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    @Override // defpackage.dx1
    public void i(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.igi
    public boolean isReady() {
        return false;
    }

    @Override // defpackage.lg0
    public void j(kx4 kx4Var, int i2, int[] iArr, ema emaVar, int[] iArr2) {
        int i3 = 0;
        if (emaVar == ema.a) {
            int i4 = 0;
            for (int i5 : iArr) {
                i4 += i5;
            }
            int length = iArr.length;
            int i6 = i2 - i4;
            int i7 = 0;
            while (i3 < length) {
                int i8 = iArr[i3];
                iArr2[i7] = i6;
                i6 += i8;
                i3++;
                i7++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i9 = iArr[length2];
            iArr2[length2] = i3;
            i3 += i9;
        }
    }

    @Override // defpackage.pjd
    public Object n() {
        return new ConcurrentSkipListMap();
    }

    @Override // defpackage.h18
    public String q() {
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 16:
                return "Arrangement#End";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.xy2
    public o5a u() {
        Instant now = Instant.now();
        now.getClass();
        o5a o5aVar = o5a.c;
        return uic.l(now.getNano(), now.getEpochSecond());
    }

    @Override // defpackage.yx2
    public void x(zl1 zl1Var) {
        zl1Var.b.add("noop");
    }

    public JSONArray z(String str, List list) {
        Set set = cw3.a;
        if (set.contains(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList U0 = CollectionsKt.U0(list);
            fx5.b(U0);
            boolean z2 = false;
            if (!set.contains(this)) {
                try {
                    u k2 = x.k(str, false);
                    if (k2 != null) {
                        z2 = k2.a;
                    }
                } catch (Throwable th) {
                    cw3.a(this, th);
                }
            }
            Iterator it = U0.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                boolean z3 = eVar.c;
                if (!z3 || (z3 && z2)) {
                    jSONArray.put(eVar.a);
                }
            }
            return jSONArray;
        } catch (Throwable th2) {
            cw3.a(this, th2);
            return null;
        }
    }

    public /* synthetic */ uxf(int i2) {
        this.a = i2;
    }

    @Override // defpackage.igi
    public void H() {
    }

    @Override // defpackage.h18
    public void a() {
    }

    @Override // defpackage.igi
    public void flush() {
    }

    @Override // defpackage.igi
    public void o() {
    }

    @Override // defpackage.dx1
    public void p() {
    }

    @Override // defpackage.yx2
    public void t() {
    }

    @Override // defpackage.dx1
    public void b(int i2) {
    }

    @Override // defpackage.igi
    public void c(tz2 tz2Var) {
    }

    @Override // defpackage.yx2
    public void d(int i2) {
    }

    @Override // defpackage.igi
    public void k(zef zefVar) {
    }

    @Override // defpackage.yx2
    public void l(xei xeiVar) {
    }

    @Override // defpackage.yx2
    public void m(int i2) {
    }

    @Override // defpackage.yx2
    public void r(om4 om4Var) {
    }

    @Override // defpackage.yx2
    public void s(hl4 hl4Var) {
    }

    @Override // defpackage.yx2
    public void w(ay2 ay2Var) {
    }

    @Override // defpackage.h18
    public void v(long j2, String str) {
    }

    @Override // defpackage.hvd
    public void g(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
