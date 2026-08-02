package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Trace;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.internal.measurement.zzvy;
import com.google.android.gms.internal.measurement.zzws;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.material.slider.b;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandColors;
import com.sofascore.model.Sports;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.DraftPickLotteryProbability;
import com.sofascore.model.newNetwork.DraftProspect;
import com.sofascore.model.newNetwork.LeagueDraftPickItem;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class vha {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static zzae d;

    public static gv9 B(Context context, List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DraftPickLotteryProbability draftPickLotteryProbability = (DraftPickLotteryProbability) it.next();
            Team team = draftPickLotteryProbability.getTeam();
            int id = team != null ? team.getId() : -1;
            Team team2 = draftPickLotteryProbability.getTeam();
            String p = team2 != null ? tba.p(context, team2) : null;
            Regex regex = yid.a;
            String str = "-";
            if (p == null) {
                p = "-";
            }
            Float firstPickProbability = draftPickLotteryProbability.getFirstPickProbability();
            String q = firstPickProbability != null ? yid.q(firstPickProbability.floatValue(), 1) : null;
            if (q == null) {
                q = "-";
            }
            Team tradedFromTeam = draftPickLotteryProbability.getTradedFromTeam();
            String nameCode = tradedFromTeam != null ? tradedFromTeam.getNameCode() : null;
            if (nameCode != null) {
                str = nameCode;
            }
            arrayList.add(new v75(id, p, q, str));
        }
        return l6g.W(arrayList);
    }

    public static gv9 C(Context context, String str, List list) {
        String f0;
        String str2;
        String position;
        String u;
        Player player;
        Player player2;
        Team team;
        Player player3;
        Player player4;
        Team team2;
        Team team3;
        Player player5;
        Player player6;
        str.getClass();
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LeagueDraftPickItem leagueDraftPickItem = (LeagueDraftPickItem) it.next();
            DraftProspect prospect = leagueDraftPickItem.getProspect();
            String str3 = null;
            Integer valueOf = (prospect == null || (player6 = prospect.getPlayer()) == null) ? null : Integer.valueOf(player6.getId());
            DraftProspect prospect2 = leagueDraftPickItem.getProspect();
            if (prospect2 == null || (player5 = prospect2.getPlayer()) == null || (f0 = tba.t(player5)) == null) {
                DraftProspect prospect3 = leagueDraftPickItem.getProspect();
                String firstName = prospect3 != null ? prospect3.getFirstName() : null;
                DraftProspect prospect4 = leagueDraftPickItem.getProspect();
                f0 = CollectionsKt.f0(ph0.x(new String[]{firstName, prospect4 != null ? prospect4.getLastName() : null}), " ", null, null, null, 62);
                if (f0.length() == 0) {
                    f0 = null;
                }
            }
            String str4 = f0;
            DraftProspect prospect5 = leagueDraftPickItem.getProspect();
            Integer valueOf2 = (prospect5 == null || (team3 = prospect5.getTeam()) == null) ? null : Integer.valueOf(team3.getId());
            DraftProspect prospect6 = leagueDraftPickItem.getProspect();
            if (prospect6 == null || (team2 = prospect6.getTeam()) == null || (str2 = tba.p(context, team2)) == null) {
                DraftProspect prospect7 = leagueDraftPickItem.getProspect();
                if (prospect7 == null || (str2 = prospect7.getTeamName()) == null || str2.length() <= 0) {
                    str2 = null;
                }
                Regex regex = yid.a;
                if (str2 == null) {
                    str2 = "-";
                }
            }
            String str5 = str2;
            Team tradedFromTeam = leagueDraftPickItem.getTradedFromTeam();
            Integer valueOf3 = tradedFromTeam != null ? Integer.valueOf(tradedFromTeam.getId()) : null;
            Team team4 = leagueDraftPickItem.getTeam();
            int id = team4 != null ? team4.getId() : -1;
            DraftProspect prospect8 = leagueDraftPickItem.getProspect();
            if (prospect8 == null || (player4 = prospect8.getPlayer()) == null || (u = player4.getPrimaryPosition()) == null) {
                DraftProspect prospect9 = leagueDraftPickItem.getProspect();
                if (prospect9 == null || (player2 = prospect9.getPlayer()) == null || (position = player2.getPosition()) == null) {
                    DraftProspect prospect10 = leagueDraftPickItem.getProspect();
                    position = prospect10 != null ? prospect10.getPosition() : null;
                }
                DraftProspect prospect11 = leagueDraftPickItem.getProspect();
                u = dti.u(context, (prospect11 == null || (player = prospect11.getPlayer()) == null) ? null : player.getGender(), str, position, true);
            }
            String str6 = u.length() > 0 ? u : null;
            DraftProspect prospect12 = leagueDraftPickItem.getProspect();
            Gender gender = (prospect12 == null || (player3 = prospect12.getPlayer()) == null) ? null : player3.getGender();
            DraftProspect prospect13 = leagueDraftPickItem.getProspect();
            if (prospect13 != null && (team = prospect13.getTeam()) != null) {
                str3 = team.getSportSlug();
            }
            arrayList.add(new w75(valueOf, str4, valueOf2, str5, valueOf3, id, str6, gender, str3));
        }
        return l6g.W(arrayList);
    }

    public static int D(String str) {
        Date parse;
        try {
            return (int) (Double.parseDouble(str) * 1000.0d);
        } catch (NumberFormatException unused) {
            int indexOf = str.indexOf(46);
            if (indexOf < 0) {
                indexOf = str.length();
                str = str.concat(".");
            }
            int length = 3 - ((str.length() - 1) - indexOf);
            for (int i = 0; i < length; i++) {
                str = str.concat("0");
            }
            String substring = str.substring(0, indexOf + 4);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS");
            simpleDateFormat.setLenient(false);
            try {
                Date parse2 = simpleDateFormat.parse("00:00:00.000");
                try {
                    parse = simpleDateFormat.parse(substring);
                } catch (ParseException unused2) {
                    parse = new SimpleDateFormat("mm:ss.SSS").parse(substring);
                    if (parse == null && parse2 != null) {
                        return (int) (parse.getTime() - parse2.getTime());
                    }
                }
                return parse == null ? -1 : -1;
            } catch (ParseException unused3) {
                return -1;
            }
        }
    }

    public static int E(String str) {
        try {
            if (!str.endsWith("%")) {
                return -1;
            }
            int parseInt = Integer.parseInt(str.substring(0, str.length() - 1));
            if (parseInt < 0 || parseInt > 100) {
                return -1;
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static PorterDuff.Mode F(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static final String G(int i, String str) {
        int O;
        CharSequence charSequence;
        if (str.length() >= i + 12 && StringsKt.K("+-", str.charAt(0)) && (O = StringsKt.O(str, '-', 1, 4)) >= 12) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (str.charAt(i3) != '0') {
                    break;
                }
                i2 = i3;
            }
            if (O - i2 < 12) {
                int i4 = O - 10;
                if (i4 < 1) {
                    zzl.r(lnb.k(i4, "End index (", ") is less than start index (1)."));
                    return null;
                }
                if (i4 == 1) {
                    charSequence = str.subSequence(0, str.length());
                } else {
                    StringBuilder sb = new StringBuilder(str.length() - (O - 11));
                    sb.append((CharSequence) str, 0, 1);
                    sb.append((CharSequence) str, i4, str.length());
                    charSequence = sb;
                }
                return charSequence.toString();
            }
        }
        return str;
    }

    public static void H(Object obj, String str) {
        if (obj != null) {
            return;
        }
        yhk.s(str);
    }

    public static m2k I(m2k m2kVar, String[] strArr, Map map) {
        int i = 0;
        if (m2kVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (m2k) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                m2k m2kVar2 = new m2k();
                int length = strArr.length;
                while (i < length) {
                    m2kVar2.a((m2k) map.get(strArr[i]));
                    i++;
                }
                return m2kVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                m2kVar.a((m2k) map.get(strArr[0]));
                return m2kVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    m2kVar.a((m2k) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return m2kVar;
    }

    public static void L(Context context) {
        AlertDialog h = lnb.h(R.style.DialogStyle, context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.dialog_login_again, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.text)).setText(context.getString(R.string.expired_message));
        h.setCanceledOnTouchOutside(false);
        h.setView(inflate);
        h.setIcon(R.mipmap.ic_launcher_sofascore);
        h.setTitle(R.string.session_expired);
        h.setButton(-1, context.getResources().getString(R.string.user_sign_in), new h0(11, h, context));
        h.setButton(-2, context.getResources().getString(R.string.cancel), new i0(h, 12));
        h.show();
    }

    public static boolean M(String str) {
        return str == null || str.isEmpty();
    }

    public static final mwb N(Context context, Event event) {
        Pair v = pd0.v(event.getStartTimestamp(), context);
        String str = (String) v.a;
        String str2 = (String) v.b;
        int id = event.getId();
        Integer F = o3a.F(event.getTournament());
        int intValue = F != null ? F.intValue() : -1;
        String t = ok3.t(context, event);
        int id2 = Event.getHomeTeam$default(event, null, 1, null).getId();
        String A = tba.A(context, Event.getHomeTeam$default(event, null, 1, null));
        if (A == null) {
            A = tba.p(context, Event.getHomeTeam$default(event, null, 1, null));
        }
        swb swbVar = new swb(id2, A);
        int id3 = Event.getAwayTeam$default(event, null, 1, null).getId();
        String A2 = tba.A(context, Event.getAwayTeam$default(event, null, 1, null));
        if (A2 == null) {
            A2 = tba.p(context, Event.getAwayTeam$default(event, null, 1, null));
        }
        return new mwb(id, intValue, t, swbVar, new swb(id3, A2), str, str2, event.getSportSlug());
    }

    public static void P(zzws zzwsVar) {
        if (zzwsVar.zza() == Thread.currentThread() && zzwsVar.zzb() != null) {
            P(zzwsVar.zzb());
            U(zzwsVar);
        } else {
            Trace.beginSection(zzwsVar.zzd());
            U(zzwsVar);
        }
    }

    public static void S(zzws zzwsVar) {
        if (zzwsVar.zza() == Thread.currentThread() && zzwsVar.zzb() != null) {
            Trace.endSection();
            S(zzwsVar.zzb());
        } else {
            Trace.endSection();
            Trace.endSection();
        }
    }

    public static void U(zzws zzwsVar) {
        String zze = zzwsVar.zze();
        AtomicReference atomicReference = zzvy.a;
        if (zze.length() > 127) {
            zze = zze.substring(0, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        }
        Trace.beginSection(zze);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, xtc xtcVar, Function2 function2, String str2, Integer num, p3e p3eVar, Function0 function0, of3 of3Var, int i, int i2) {
        xtc xtcVar2;
        int i3;
        Function2 function22;
        int i4;
        String str3;
        int i5;
        int i6;
        Integer num2;
        int i7;
        int i8;
        int i9;
        int i10;
        p3e p3eVar2;
        xtc xtcVar3;
        Function2 function23;
        String str4;
        Integer num3;
        Function0 function02;
        av8 av8Var;
        eqf u;
        boolean z;
        Integer num4;
        String str5;
        str.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(613781835);
        int i11 = (av8Var2.g(str) ? 4 : 2) | i;
        int i12 = i2 & 2;
        if (i12 != 0) {
            i11 |= 48;
        } else if ((i & 48) == 0) {
            xtcVar2 = xtcVar;
            i11 |= av8Var2.g(xtcVar2) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i11 |= 384;
            } else if ((i & 384) == 0) {
                Function2 function24 = function2;
                i11 |= av8Var2.i(function24) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                function22 = function24;
                i4 = i2 & 8;
                if (i4 != 0) {
                    i5 = i11 | 3072;
                    str3 = str2;
                } else {
                    str3 = str2;
                    i5 = i11 | (av8Var2.g(str3) ? a.o : 1024);
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    i7 = i5 | 24576;
                    num2 = num;
                } else {
                    num2 = num;
                    i7 = i5 | (av8Var2.g(num2) ? 16384 : 8192);
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    i7 |= 196608;
                } else if ((196608 & i) == 0) {
                    i7 |= av8Var2.g(p3eVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i9 = i2 & 64;
                    if (i9 == 0) {
                        i7 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i7 |= av8Var2.i(function0) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    }
                    i10 = i7;
                    if (av8Var2.T(i10 & 1, (i7 & 599187) == 599186)) {
                        av8Var2.W();
                        p3eVar2 = p3eVar;
                        xtcVar3 = xtcVar2;
                        function23 = function22;
                        str4 = str3;
                        num3 = num2;
                        function02 = function0;
                        av8Var = av8Var2;
                    } else {
                        utc utcVar = utc.a;
                        if (i12 != 0) {
                            xtcVar2 = utcVar;
                        }
                        Function2 function25 = function22;
                        if (i3 != 0) {
                            function25 = null;
                        }
                        if (i4 != 0) {
                            str3 = null;
                        }
                        Integer num5 = i6 != 0 ? null : num2;
                        p3e C = i8 != 0 ? l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 5) : p3eVar;
                        Function0 function03 = i9 == 0 ? function0 : null;
                        lv1 lv1Var = uxf.m;
                        kg0 kg0Var = ww9.f;
                        xtc a0 = l98.a0(bkh.g(bkh.d(xtcVar2, 1.0f), 40.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), C);
                        l8g a2 = k8g.a(kg0Var, lv1Var, av8Var2, 54);
                        int hashCode = Long.hashCode(av8Var2.T);
                        aee m = av8Var2.m();
                        xtc C2 = fqj.C(av8Var2, a0);
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
                        waa.K(av8Var2, C2, hf3.d);
                        if (function25 == null) {
                            av8Var2.d0(2111937470);
                            z = false;
                            av8Var2.s(false);
                        } else {
                            av8Var2.d0(2111937471);
                            function25.invoke(av8Var2, Integer.valueOf((i10 >> 6) & 14));
                            nq8.h(av8Var2, bkh.p(utcVar, 8.0f));
                            z = false;
                            av8Var2.s(false);
                        }
                        p3eVar2 = C;
                        goa goaVar = new goa(1.0f, true);
                        yf8 yf8Var = xth.a;
                        udj.c(str, goaVar, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.j(), av8Var2, i10 & 14, 24960, 110584);
                        av8 av8Var3 = av8Var2;
                        if (str3 == null) {
                            av8Var3.d0(2112299767);
                            av8Var3.s(z);
                            num4 = num5;
                            str5 = str3;
                        } else {
                            ljg.r(4.0f, 2112299768, av8Var3, av8Var3, utcVar);
                            boolean z2 = (i10 & 3670016) == 1048576 ? true : z;
                            Object O = av8Var3.O();
                            if (z2 || O == nf3.a) {
                                O = new ve7(18, function03);
                                av8Var3.n0(O);
                            }
                            num4 = num5;
                            str5 = str3;
                            bea.f(str5, null, null, false, (Function0) O, num4, av8Var3, (i10 << 3) & 458752, 14);
                            av8Var3.s(z);
                        }
                        av8Var3.s(true);
                        function02 = function03;
                        xtcVar3 = xtcVar2;
                        function23 = function25;
                        str4 = str5;
                        num3 = num4;
                        av8Var = av8Var3;
                    }
                    u = av8Var.u();
                    if (u == null) {
                        u.d = new w51(str, xtcVar3, function23, str4, num3, p3eVar2, function02, i, i2);
                        return;
                    }
                    return;
                }
                i9 = i2 & 64;
                if (i9 == 0) {
                }
                i10 = i7;
                if (av8Var2.T(i10 & 1, (i7 & 599187) == 599186)) {
                }
                u = av8Var.u();
                if (u == null) {
                }
            }
            function22 = function2;
            i4 = i2 & 8;
            if (i4 != 0) {
            }
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            i8 = i2 & 32;
            if (i8 != 0) {
            }
            i9 = i2 & 64;
            if (i9 == 0) {
            }
            i10 = i7;
            if (av8Var2.T(i10 & 1, (i7 & 599187) == 599186)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        xtcVar2 = xtcVar;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        function22 = function2;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        i8 = i2 & 32;
        if (i8 != 0) {
        }
        i9 = i2 & 64;
        if (i9 == 0) {
        }
        i10 = i7;
        if (av8Var2.T(i10 & 1, (i7 & 599187) == 599186)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void b(dwb dwbVar, int i, Brand brand, wla wlaVar, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        Brand brand2;
        av8 av8Var;
        r13 r13Var;
        long j;
        brand.getClass();
        wlaVar.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(85613783);
        int i4 = 4;
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(dwbVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            brand2 = brand;
            i3 |= av8Var2.i(brand2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            brand2 = brand;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? av8Var2.g(wlaVar) : av8Var2.i(wlaVar) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var2.g(xtcVar) ? 16384 : 8192;
        }
        if (av8Var2.T(i3 & 1, (i3 & 9363) != 9362)) {
            BrandColors color = brand2.getColor();
            if (color == null) {
                av8Var2.d0(-690146912);
                av8Var2.s(false);
                r13Var = null;
            } else {
                av8Var2.d0(670473857);
                long D = tz9.D(color, av8Var2);
                av8Var2.s(false);
                r13Var = new r13(D);
            }
            if (r13Var == null) {
                j = ljg.f(av8Var2, 670474305, R.color.error, av8Var2, false);
            } else {
                av8Var2.d0(670473468);
                av8Var2.s(false);
                j = r13Var.a;
            }
            int id = brand2.getId();
            String url = brand2.getUrl();
            String slug = brand2.getSlug();
            BrandLocation brandLocation = BrandLocation.MatchOfTheWeek;
            r13 r13Var2 = new r13(j);
            Integer valueOf = Integer.valueOf(id);
            tc3 H = yqo.H(153018245, av8Var2, new ahf(j, dwbVar, i4));
            int i5 = ((i3 << 12) & 458752) | 24576;
            int i6 = i3 << 9;
            av8Var = av8Var2;
            s02.b(r13Var2, valueOf, url, slug, brandLocation, i, wlaVar, xtcVar, null, 0L, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, H, av8Var, i5 | (3670016 & i6) | (i6 & 29360128), 3078, 6912);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hj7(dwbVar, i, brand, wlaVar, xtcVar, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0227, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r2.O(), java.lang.Integer.valueOf(r9)) == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0483, code lost:
    
        if (r2.i(r8) != false) goto L223;
     */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(Function2 function2, final Function2 function22, ct8 ct8Var, final Function2 function23, final Function2 function24, final Function2 function25, final Function2 function26, final boolean z, final uaj uajVar, paj pajVar, final tc3 tc3Var, Function2 function27, final p3e p3eVar, of3 of3Var, final int i, final int i2) {
        int i3;
        int i4;
        ct8 ct8Var2;
        paj pajVar2;
        av8 av8Var;
        a99 a99Var;
        mv1 mv1Var;
        mv1 mv1Var2;
        int i5;
        utc utcVar;
        int i6;
        mv1 mv1Var3;
        ema emaVar;
        boolean z2;
        Function2 function28;
        mv1 mv1Var4;
        boolean z3;
        boolean z4;
        Object O;
        int G;
        final Function2 function29 = function2;
        Function2 function210 = function27;
        mv1 mv1Var5 = uxf.g;
        mv1 mv1Var6 = uxf.c;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1086465551);
        int i7 = i & 6;
        utc utcVar2 = utc.a;
        if (i7 == 0) {
            i3 = i | (av8Var2.g(utcVar2) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var2.i(function29) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var2.i(function22) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= av8Var2.i(ct8Var) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= av8Var2.i(function23) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= av8Var2.i(function24) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i3 |= av8Var2.i(function25) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= av8Var2.i(function26) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= av8Var2.h(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= av8Var2.g(uajVar) ? 536870912 : 268435456;
        }
        int i8 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? av8Var2.g(pajVar) : av8Var2.i(pajVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var2.i(tc3Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var2.i(function210) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= av8Var2.g(p3eVar) ? a.o : 1024;
        }
        int i9 = i4;
        if (av8Var2.T(i8 & 1, ((i8 & 306783379) == 306783378 && (i9 & 1171) == 1170) ? false : true)) {
            float G2 = qha.G(av8Var2);
            int i10 = i9 & 14;
            boolean d2 = ((i8 & 234881024) == 67108864) | ((i8 & 1879048192) == 536870912) | (i10 == 4 || ((i9 & 8) != 0 && av8Var2.g(pajVar))) | ((i9 & 7168) == 2048) | av8Var2.d(G2);
            Object O2 = av8Var2.O();
            a99 a99Var2 = nf3.a;
            if (d2 || O2 == a99Var2) {
                av8Var = av8Var2;
                a99Var = a99Var2;
                mv1Var = mv1Var5;
                mv1Var2 = mv1Var6;
                i5 = i9;
                utcVar = utcVar2;
                i6 = i10;
                gbj gbjVar = new gbj(z, uajVar, pajVar, p3eVar, G2);
                av8Var.n0(gbjVar);
                O2 = gbjVar;
            } else {
                av8Var = av8Var2;
                a99Var = a99Var2;
                mv1Var = mv1Var5;
                mv1Var2 = mv1Var6;
                i5 = i9;
                utcVar = utcVar2;
                i6 = i10;
            }
            gbj gbjVar2 = (gbj) O2;
            ema emaVar2 = (ema) av8Var.k(dh3.n);
            int G3 = z8e.G(av8Var);
            aee m = av8Var.m();
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
            waa.K(av8Var, gbjVar2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            f50 f50Var2 = hf3.j;
            if (av8Var.S) {
                mv1Var3 = mv1Var2;
            } else {
                mv1Var3 = mv1Var2;
            }
            mz1.t(G3, av8Var, G3, f50Var2);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            tc3Var.invoke(av8Var, Integer.valueOf((i5 >> 3) & 14));
            if (function23 != null) {
                av8Var.d0(-1445181094);
                xtc D = ww9.D(utcVar, "Leading");
                ye9 ye9Var = l7a.a;
                xtc z5 = D.z(yjc.a);
                k1c c2 = e12.c(mv1Var, false);
                int G4 = z8e.G(av8Var);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, z5);
                av8Var.h0();
                emaVar = emaVar2;
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c2, f50Var);
                waa.K(av8Var, m2, ff3Var);
                if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G4))) {
                    mz1.t(G4, av8Var, G4, f50Var2);
                }
                waa.K(av8Var, C2, f50Var3);
                function23.invoke(av8Var, Integer.valueOf((i8 >> 12) & 14));
                av8Var.s(true);
                z2 = false;
                av8Var.s(false);
            } else {
                emaVar = emaVar2;
                z2 = false;
                av8Var.d0(-1444935078);
                av8Var.s(false);
            }
            if (function24 != null) {
                av8Var.d0(-1444892360);
                xtc D2 = ww9.D(utcVar, "Trailing");
                ye9 ye9Var2 = l7a.a;
                xtc z6 = D2.z(yjc.a);
                k1c c3 = e12.c(mv1Var, z2);
                int G5 = z8e.G(av8Var);
                aee m3 = av8Var.m();
                xtc C3 = fqj.C(av8Var, z6);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c3, f50Var);
                waa.K(av8Var, m3, ff3Var);
                if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G5))) {
                    mz1.t(G5, av8Var, G5, f50Var2);
                }
                waa.K(av8Var, C3, f50Var3);
                function24.invoke(av8Var, Integer.valueOf((i8 >> 15) & 14));
                av8Var.s(true);
                av8Var.s(false);
            } else {
                av8Var.d0(-1444644422);
                av8Var.s(z2);
            }
            ema emaVar3 = emaVar;
            float L = l98.L(p3eVar, emaVar3);
            float K = l98.K(p3eVar, emaVar3);
            float R = qha.R(av8Var);
            if (function23 != null) {
                L -= R;
                if (L < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    L = 0.0f;
                }
            }
            float f = L;
            if (function24 != null) {
                K -= R;
                if (K < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    K = 0.0f;
                }
            }
            float f2 = K;
            if (function25 != null) {
                av8Var.d0(-1443868027);
                xtc f0 = l98.f0(bkh.r(bkh.g(ww9.D(utcVar, "Prefix"), 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), null, 3), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                mv1Var4 = mv1Var3;
                k1c c4 = e12.c(mv1Var4, false);
                int G6 = z8e.G(av8Var);
                aee m4 = av8Var.m();
                xtc C4 = fqj.C(av8Var, f0);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c4, f50Var);
                waa.K(av8Var, m4, ff3Var);
                if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G6))) {
                    mz1.t(G6, av8Var, G6, f50Var2);
                }
                waa.K(av8Var, C4, f50Var3);
                function28 = function25;
                function28.invoke(av8Var, Integer.valueOf((i8 >> 18) & 14));
                av8Var.s(true);
                av8Var.s(false);
            } else {
                function28 = function25;
                mv1Var4 = mv1Var3;
                av8Var.d0(-1443540326);
                av8Var.s(false);
            }
            if (function26 != null) {
                av8Var.d0(-1443497081);
                xtc f02 = l98.f0(bkh.r(bkh.g(ww9.D(utcVar, "Suffix"), 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), null, 3), 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                k1c c5 = e12.c(mv1Var4, false);
                int G7 = z8e.G(av8Var);
                aee m5 = av8Var.m();
                xtc C5 = fqj.C(av8Var, f02);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c5, f50Var);
                waa.K(av8Var, m5, ff3Var);
                if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G7))) {
                    mz1.t(G7, av8Var, G7, f50Var2);
                }
                waa.K(av8Var, C5, f50Var3);
                function26.invoke(av8Var, Integer.valueOf((i8 >> 21) & 14));
                av8Var.s(true);
                av8Var.s(false);
            } else {
                av8Var.d0(-1443171302);
                av8Var.s(false);
            }
            xtc f03 = l98.f0(utcVar, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            if (function22 != null) {
                av8Var.d0(-1442671489);
                xtc D3 = ww9.D(utcVar, "Label");
                if (i6 != 4) {
                    if ((i5 & 8) != 0) {
                        pajVar2 = pajVar;
                    } else {
                        pajVar2 = pajVar;
                    }
                    z4 = false;
                    O = av8Var.O();
                    if (!z4 || O == a99Var) {
                        O = new nxd(pajVar2, 1);
                        av8Var.n0(O);
                    }
                    xtc z7 = bkh.r(s9a.A(D3, new r64(10, (Function0) O)), null, 3).z(f03);
                    k1c c6 = e12.c(mv1Var4, false);
                    G = z8e.G(av8Var);
                    aee m6 = av8Var.m();
                    xtc C6 = fqj.C(av8Var, z7);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.q0();
                    } else {
                        av8Var.l(zg3Var);
                    }
                    waa.K(av8Var, c6, f50Var);
                    waa.K(av8Var, m6, ff3Var);
                    if (!av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                        mz1.t(G, av8Var, G, f50Var2);
                    }
                    waa.K(av8Var, C6, f50Var3);
                    function22.invoke(av8Var, Integer.valueOf((i8 >> 6) & 14));
                    av8Var.s(true);
                    av8Var.s(false);
                } else {
                    pajVar2 = pajVar;
                }
                z4 = true;
                O = av8Var.O();
                if (!z4) {
                }
                O = new nxd(pajVar2, 1);
                av8Var.n0(O);
                xtc z72 = bkh.r(s9a.A(D3, new r64(10, (Function0) O)), null, 3).z(f03);
                k1c c62 = e12.c(mv1Var4, false);
                G = z8e.G(av8Var);
                aee m62 = av8Var.m();
                xtc C62 = fqj.C(av8Var, z72);
                av8Var.h0();
                if (av8Var.S) {
                }
                waa.K(av8Var, c62, f50Var);
                waa.K(av8Var, m62, ff3Var);
                if (!av8Var.S) {
                }
                mz1.t(G, av8Var, G, f50Var2);
                waa.K(av8Var, C62, f50Var3);
                function22.invoke(av8Var, Integer.valueOf((i8 >> 6) & 14));
                av8Var.s(true);
                av8Var.s(false);
            } else {
                pajVar2 = pajVar;
                av8Var.d0(-1442276518);
                av8Var.s(false);
            }
            xtc f04 = l98.f0(bkh.r(bkh.g(utcVar, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), null, 3), function28 == null ? f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, function26 == null ? f2 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            if (ct8Var != null) {
                av8Var.d0(-1441906533);
                ct8Var2 = ct8Var;
                ct8Var2.invoke(ww9.D(utcVar, "Hint").z(f04), av8Var, Integer.valueOf((i8 >> 6) & 112));
                av8Var.s(false);
            } else {
                ct8Var2 = ct8Var;
                av8Var.d0(-1441815238);
                av8Var.s(false);
            }
            xtc z8 = ww9.D(utcVar, "TextField").z(f04);
            k1c c7 = e12.c(mv1Var4, true);
            int G8 = z8e.G(av8Var);
            aee m7 = av8Var.m();
            xtc C7 = fqj.C(av8Var, z8);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c7, f50Var);
            waa.K(av8Var, m7, ff3Var);
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G8))) {
                mz1.t(G8, av8Var, G8, f50Var2);
            }
            waa.K(av8Var, C7, f50Var3);
            function29 = function2;
            me4.l((i8 >> 3) & 14, function29, av8Var, true);
            if (function27 != null) {
                av8Var.d0(-1441566587);
                xtc a0 = l98.a0(bkh.r(bkh.g(ww9.D(utcVar, "Supporting"), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), null, 3), new t3e(16.0f, 4.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                k1c c8 = e12.c(mv1Var4, false);
                int G9 = z8e.G(av8Var);
                aee m8 = av8Var.m();
                xtc C8 = fqj.C(av8Var, a0);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c8, f50Var);
                waa.K(av8Var, m8, ff3Var);
                if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G9))) {
                    mz1.t(G9, av8Var, G9, f50Var2);
                }
                waa.K(av8Var, C8, f50Var3);
                function210 = function27;
                function210.invoke(av8Var, Integer.valueOf((i5 >> 6) & 14));
                z3 = true;
                av8Var.s(true);
                av8Var.s(false);
            } else {
                function210 = function27;
                z3 = true;
                av8Var.d0(-1441177382);
                av8Var.s(false);
            }
            av8Var.s(z3);
        } else {
            ct8Var2 = ct8Var;
            pajVar2 = pajVar;
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            final paj pajVar3 = pajVar2;
            final ct8 ct8Var3 = ct8Var2;
            final Function2 function211 = function210;
            u.d = new Function2() { // from class: taj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K2 = aba.K(i | 1);
                    int K3 = aba.K(i2);
                    vha.c(Function2.this, function22, ct8Var3, function23, function24, function25, function26, z, uajVar, pajVar3, tc3Var, function211, p3eVar, (of3) obj, K2, K3);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(String str, boolean z, boolean z2, vnb vnbVar, Function1 function1, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2032709090);
        int i2 = 2;
        int i3 = i | (av8Var.g(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= av8Var.h(z) ? 32 : 16;
        }
        int i4 = i3 | (av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(vnbVar) ? a.o : 1024) | (av8Var.i(function1) ? 16384 : 8192);
        int i5 = 1;
        if (av8Var.T(i4 & 1, (i4 & 9363) != 9362)) {
            boolean z3 = (57344 & i4) == 16384;
            Object O = av8Var.O();
            if (z3 || O == nf3.a) {
                O = new b4j(i2, function1);
                av8Var.n0(O);
            }
            ktm.s(vnbVar, (Function0) O, z2, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, yqo.H(1957834399, av8Var, new l4b(z, function1, (Object) str, i5)), av8Var, ((i4 >> 9) & 14) | 100663296 | (i4 & 896), 248);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new dt2(str, z, z2, vnbVar, function1, i);
        }
    }

    public static final void e(String str, koj kojVar, boolean z, of3 of3Var, int i) {
        str.getClass();
        kojVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1874969122);
        int i2 = (av8Var.g(str) ? 4 : 2) | i | (av8Var.i(kojVar) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) av8Var.k(nz.b);
            e1d x = rfo.x(kojVar.f, av8Var, 0);
            e1d x2 = rfo.x(kojVar.j, av8Var, 0);
            vnb vnbVar = (vnb) x.getValue();
            boolean booleanValue = ((Boolean) x2.getValue()).booleanValue();
            boolean i3 = av8Var.i(context) | av8Var.i(kojVar);
            Object O = av8Var.O();
            if (i3 || O == nf3.a) {
                O = new dvi(19, context, kojVar);
                av8Var.n0(O);
            }
            d(str, z, booleanValue, vnbVar, (Function1) O, av8Var, (i2 & 14) | ((i2 >> 3) & 112));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t60(str, kojVar, z, i, 26);
        }
    }

    public static final void f(int i, int i2, int i3, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(52192901);
        int i4 = i3 | (av8Var.e(i2) ? 32 : 16);
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
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
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            xtc f0 = l98.f0(utcVar, 8.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
            String O = l4a.O(i + ".");
            yf8 yf8Var = xth.a;
            udj.c(O, f0, lz.D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 0, 0, 131064);
            xtc f02 = l98.f0(utcVar, 20.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
            int i5 = i4 >> 3;
            Resources resources = (Resources) av8Var.k(nz.c);
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            boolean z = (((i5 & 14) ^ 6) > 4 && av8Var.e(i2)) || (i5 & 6) == 4;
            Object O2 = av8Var.O();
            if (z || O2 == nf3.a) {
                CharSequence text = resources.getText(i2);
                text.getClass();
                O2 = hda.Q(text, kx4Var);
                av8Var.n0(O2);
            }
            udj.d((q80) O2, f02, lz.D(R.color.on_color_primary, av8Var), null, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, xth.f(), av8Var, 0, 0, 262136);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new u81(i, i2, i3, 2);
        }
    }

    public static final void g(Function0 function0, of3 of3Var, int i) {
        Function0 function02;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1538300612);
        int i2 = i | (av8Var.i(function0) ? 4 : 2);
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
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
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            String v = oea.v(R.string.sofascore_widget_stay_updated, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, f0, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, 48, 0, 131064);
            wkn.k(haa.t(R.drawable.wc26_add_widget_preview, 0, av8Var), null, l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 25016, 104);
            udj.c(oea.v(R.string.sofascore_widget_wc_intro, av8Var), l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 48, 0, 131064);
            av8Var = av8Var;
            f(1, R.string.sofascore_widget_step1, 6, av8Var);
            f(2, R.string.sofascore_widget_step2_android, 6, av8Var);
            f(3, R.string.sofascore_widget_step3_android, 6, av8Var);
            xtc f02 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5);
            String v2 = oea.v(R.string.got_it_button, av8Var);
            boolean z = (i2 & 14) == 4;
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                function02 = function0;
                O = new vdl(0, function02);
                av8Var.n0(O);
            } else {
                function02 = function0;
            }
            mha.h(v2, (Function0) O, f02, lqh.a, null, false, false, false, 0L, 0, 0, av8Var, 3456, 0, 2032);
            av8Var.s(true);
        } else {
            function02 = function0;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f91(i, 13, function02);
        }
    }

    public static final void h(ef0 ef0Var, String str, String str2) {
        ef0Var.getClass();
        str.getClass();
        str2.getClass();
        ArrayList arrayList = ef0Var.a;
        arrayList.add(str);
        arrayList.add(StringsKt.l0(str2).toString());
    }

    public static final q89 i(ef0 ef0Var) {
        ef0Var.getClass();
        return new q89((String[]) ef0Var.a.toArray(new String[0]));
    }

    public static final String j(q89 q89Var, int i) {
        q89Var.getClass();
        String str = (String) ph0.F(i * 2, q89Var.a);
        if (str != null) {
            return str;
        }
        zzl.r(lnb.n("name[", i, ']'));
        return null;
    }

    public static final ef0 k(q89 q89Var) {
        q89Var.getClass();
        ef0 ef0Var = new ef0(1);
        o13.w(ef0Var.a, q89Var.a);
        return ef0Var;
    }

    public static final String l(q89 q89Var, int i) {
        q89Var.getClass();
        String str = (String) ph0.F((i * 2) + 1, q89Var.a);
        if (str != null) {
            return str;
        }
        zzl.r(lnb.n("value[", i, ']'));
        return null;
    }

    public static AdError m(int i, String str) {
        return new AdError(i, str, "com.google.ads.mediation.mintegral");
    }

    public static AdError n(int i, String str) {
        return new AdError(i, str, MBConfiguration.LOG_TAG);
    }

    public static ltk o(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                cp4.h(ljg.l(cls, "Cannot create an instance of "));
                return null;
            }
            try {
                Object newInstance = declaredConstructor.newInstance(null);
                newInstance.getClass();
                return (ltk) newInstance;
            } catch (IllegalAccessException e) {
                vp2.e(ljg.l(cls, "Cannot create an instance of "), e);
                return null;
            } catch (InstantiationException e2) {
                vp2.e(ljg.l(cls, "Cannot create an instance of "), e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            vp2.e(ljg.l(cls, "Cannot create an instance of "), e3);
            return null;
        }
    }

    public static float p(int i, Context context) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static ViewGroup s(b bVar) {
        View rootView = bVar.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(android.R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == bVar || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0188, code lost:
    
        if (r19.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_INSIDE_LINEBACK) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0192, code lost:
    
        if (r19.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_WIDE_RECEIVER) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a0, code lost:
    
        r0 = r16.getResources().getString(com.sofascore.results.R.string.am_football_receivers);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ae, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x019c, code lost:
    
        if (r19.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_TIGHT_END) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01b5, code lost:
    
        if (r19.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_STRONG_SAFETY) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01bd, code lost:
    
        if (r19.equals("RB") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0241, code lost:
    
        r0 = r16.getResources().getString(com.sofascore.results.R.string.am_football_running_backs);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x024f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01e0, code lost:
    
        if (r19.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_PUNT_RETURNER) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02ba, code lost:
    
        r0 = r16.getResources().getString(com.sofascore.results.R.string.am_football_special_teams);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02c8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01ea, code lost:
    
        if (r19.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_OFFENSIVE_TACKLE) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02d9, code lost:
    
        r0 = r16.getResources().getString(com.sofascore.results.R.string.am_football_offensive_line);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02e7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01f4, code lost:
    
        if (r19.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_OFFENSIVE_LINEMAN) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01fe, code lost:
    
        if (r19.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_OFFENSIVE_GUARD) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0208, code lost:
    
        if (r19.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_NOSE_TACKLE) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x026e, code lost:
    
        r0 = r16.getResources().getString(com.sofascore.results.R.string.am_football_defensive_line);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x027c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0212, code lost:
    
        if (r19.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_LONG_SNAPPER) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x021a, code lost:
    
        if (r19.equals("LB") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0233, code lost:
    
        if (r19.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_FREE_SAFETY) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x023d, code lost:
    
        if (r19.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_FULLBACK) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0256, code lost:
    
        if (r19.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_TACKLE) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0260, code lost:
    
        if (r19.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_LINEMAN) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x026a, code lost:
    
        if (r19.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_END) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0283, code lost:
    
        if (r19.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_BACK) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x028b, code lost:
    
        if (r19.equals("CB") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02a4, code lost:
    
        if (r19.equals("T") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02ac, code lost:
    
        if (r19.equals("P") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02b6, code lost:
    
        if (r19.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_KICKER) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02cd, code lost:
    
        if (r19.equals("G") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02d5, code lost:
    
        if (r19.equals("C") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x03b0, code lost:
    
        if (r19.equals("RW") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0429, code lost:
    
        r0 = r16.getResources().getString(com.sofascore.results.R.string.hockey_forwards);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0437, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03ba, code lost:
    
        if (r19.equals(com.sofascore.model.mvvm.model.PlayerKt.ICE_HOCKEY_RIGHT_DEFENSEMAN) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x040a, code lost:
    
        r0 = r16.getResources().getString(com.sofascore.results.R.string.hockey_defensemen);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0418, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x03c2, code lost:
    
        if (r19.equals("LW") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x03cc, code lost:
    
        if (r19.equals(com.sofascore.model.mvvm.model.PlayerKt.ICE_HOCKEY_LEFT_DEFENSEMAN) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x03d6, code lost:
    
        if (r19.equals(com.sofascore.model.mvvm.model.PlayerKt.ICE_HOCKEY_RIGHT_WING) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x03e0, code lost:
    
        if (r19.equals("L") != false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x03fe, code lost:
    
        if (r19.equals("F") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0406, code lost:
    
        if (r19.equals("D") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x041d, code lost:
    
        if (r19.equals("C") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e1, code lost:
    
        if (r19.equals("RW") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f5, code lost:
    
        r0 = r16.getResources().getString(com.sofascore.results.R.string.handball_position_title_winger);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0103, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e9, code lost:
    
        if (r19.equals("RB") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0114, code lost:
    
        r0 = r16.getResources().getString(com.sofascore.results.R.string.handball_position_title_back);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0122, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f1, code lost:
    
        if (r19.equals("LW") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0108, code lost:
    
        if (r19.equals("LB") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0110, code lost:
    
        if (r19.equals("CB") == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x016a, code lost:
    
        if (r19.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_SAFETY) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x028f, code lost:
    
        r0 = r16.getResources().getString(com.sofascore.results.R.string.am_football_defensive_backs);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x029d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0174, code lost:
    
        if (r19.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_OUTSIDE_LINEBACK) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x021e, code lost:
    
        r0 = r16.getResources().getString(com.sofascore.results.R.string.am_football_linebackers);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x022c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017e, code lost:
    
        if (r19.equals(com.sofascore.model.mvvm.model.PlayerKt.AMERICAN_FOOTBALL_MIDDLE_LINEBACK) == false) goto L8;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String t(Context context, Gender gender, String str, String str2, boolean z) {
        context.getClass();
        if (str == null || str2 == null) {
            String string = context.getString(R.string.value_unknown);
            string.getClass();
            return string;
        }
        switch (str.hashCode()) {
            case -2002238939:
                if (str.equals(Sports.ICE_HOCKEY)) {
                    int hashCode = str2.hashCode();
                    if (hashCode == 67) {
                        break;
                    } else if (hashCode == 68) {
                        break;
                    } else if (hashCode == 70) {
                        break;
                    } else if (hashCode != 71) {
                        if (hashCode == 76) {
                            break;
                        } else if (hashCode == 82) {
                            break;
                        } else if (hashCode == 2424) {
                            break;
                        } else if (hashCode == 2443) {
                            break;
                        } else if (hashCode == 2610) {
                            break;
                        } else if (hashCode == 2629) {
                            break;
                        }
                    } else if (str2.equals("G")) {
                        String string2 = context.getResources().getString(R.string.hockey_goalies);
                        string2.getClass();
                        return string2;
                    }
                }
                break;
            case -1721090992:
                if (str.equals(Sports.BASEBALL)) {
                    rk1.d.getClass();
                    rk1 rk1Var = rk1.e.contains(str2) ? rk1.g : (rk1) rk1.f.get(str2);
                    switch (rk1Var == null ? -1 : m2f.a[rk1Var.ordinal()]) {
                        case -1:
                            String string3 = context.getString(R.string.value_unknown);
                            string3.getClass();
                            return string3;
                        case 0:
                        default:
                            zzl.b();
                            return null;
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                            String string4 = context.getString(R.string.baseball_position_pitcher);
                            string4.getClass();
                            return string4;
                        case 17:
                            String string5 = context.getString(R.string.baseball_position_catcher);
                            string5.getClass();
                            return string5;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                            String string6 = context.getString(R.string.baseball_position_infielder);
                            string6.getClass();
                            return string6;
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                            String string7 = context.getString(R.string.baseball_position_outfielder);
                            string7.getClass();
                            return string7;
                        case 29:
                        case 30:
                            String string8 = context.getString(R.string.baseball_position_baserunner);
                            string8.getClass();
                            return string8;
                        case 31:
                        case 32:
                            String string9 = context.getString(R.string.baseball_hitter);
                            string9.getClass();
                            return string9;
                        case 33:
                        case 34:
                        case 35:
                            String string10 = context.getString(R.string.baseball_position_batter);
                            string10.getClass();
                            return string10;
                    }
                }
                break;
            case -83759494:
                if (str.equals(Sports.AMERICAN_FOOTBALL)) {
                    switch (str2.hashCode()) {
                        case 67:
                            break;
                        case 71:
                            break;
                        case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                            break;
                        case 80:
                            break;
                        case 84:
                            break;
                        case 2143:
                            break;
                        case 2174:
                            break;
                        case 2177:
                            break;
                        case 2184:
                            break;
                        case 2192:
                            break;
                        case 2236:
                            break;
                        case 2253:
                            break;
                        case 2422:
                            break;
                        case 2439:
                            break;
                        case 2502:
                            break;
                        case 2520:
                            break;
                        case 2525:
                            break;
                        case 2533:
                            break;
                        case 2562:
                            break;
                        case 2577:
                            if (str2.equals(PlayerKt.AMERICAN_FOOTBALL_QUARTERBACK)) {
                                String string11 = context.getResources().getString(R.string.am_football_quarterbacks);
                                string11.getClass();
                                return string11;
                            }
                            break;
                        case 2608:
                            break;
                        case 2656:
                            break;
                        case 2673:
                            break;
                        case 2779:
                            break;
                        case 72575:
                            break;
                        case 76419:
                            break;
                        case 78341:
                            break;
                        case 81848:
                            break;
                    }
                }
                break;
            case 1767150:
                if (str.equals(Sports.HANDBALL)) {
                    int hashCode2 = str2.hashCode();
                    if (hashCode2 != 71) {
                        if (hashCode2 != 80) {
                            if (hashCode2 == 2143) {
                                break;
                            } else if (hashCode2 == 2422) {
                                break;
                            } else if (hashCode2 == 2443) {
                                break;
                            } else if (hashCode2 == 2608) {
                                break;
                            } else if (hashCode2 == 2629) {
                                break;
                            }
                        } else if (str2.equals("P")) {
                            String string12 = context.getResources().getString(R.string.handball_position_pivot);
                            string12.getClass();
                            return string12;
                        }
                    } else if (str2.equals("G")) {
                        String string13 = context.getResources().getString(R.string.handball_position_goalkeeper);
                        string13.getClass();
                        return string13;
                    }
                }
                break;
            case 394668909:
                if (str.equals(Sports.FOOTBALL)) {
                    int hashCode3 = str2.hashCode();
                    if (hashCode3 != 68) {
                        if (hashCode3 != 77) {
                            if (hashCode3 != 70) {
                                if (hashCode3 == 71 && str2.equals("G")) {
                                    return hkg.Q(context, z ? R.string.football_goalkeepers : R.string.goalkeeper, gender, new Object[0]);
                                }
                            } else if (str2.equals("F")) {
                                return hkg.Q(context, z ? R.string.football_forwards : R.string.football_forward, gender, new Object[0]);
                            }
                        } else if (str2.equals(PlayerKt.FOOTBALL_MIDFIELDER)) {
                            return hkg.Q(context, z ? R.string.football_midfielders : R.string.football_midfielder, gender, new Object[0]);
                        }
                    } else if (str2.equals("D")) {
                        return hkg.Q(context, z ? R.string.football_defenders : R.string.football_defender, gender, new Object[0]);
                    }
                }
                break;
        }
        String string14 = context.getString(R.string.value_unknown);
        string14.getClass();
        return string14;
    }

    public static final int v(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                a70.p("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    public static final void x(String str) {
        str.getClass();
        if (str.length() <= 0) {
            a70.p("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('!' > charAt || charAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                String num = Integer.toString(charAt, CharsKt.checkRadix(16));
                num.getClass();
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                w1l.q(i, num, " at ", " in header name: ", sb);
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void y(String str, String str2) {
        str.getClass();
        str2.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                String num = Integer.toString(charAt, CharsKt.checkRadix(16));
                num.getClass();
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                w1l.q(i, num, " at ", " in ", sb);
                sb.append(str2);
                sb.append(" value");
                sb.append(wol.l(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final boolean z(char c2) {
        return '0' <= c2 && c2 < ':';
    }

    public abstract boolean A(Class cls);

    public abstract boolean J(k6h k6hVar);

    public abstract void K(k6h k6hVar);

    public abstract boolean O(Class cls);

    public abstract String[] Q(Class cls);

    public abstract Constructor R(Class cls);

    public abstract Method T(Class cls, Field field);

    public abstract Method q(Class cls, Field field);

    public abstract Constructor r(Class cls);

    public abstract String[] w(Class cls);
}
