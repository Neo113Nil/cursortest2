package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.text.Layout;
import android.view.KeyEvent;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.core.app.NotificationCompat;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.newNetwork.statistics.season.player.VolleyballPlayerSeasonStatistics;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.service.MuteStageWorker;
import com.sofascore.results.service.RegistrationWorker;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class u0a {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;

    public static SimpleDateFormat A(int i, int i2) {
        String str;
        String str2;
        if (i == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i == 1) {
            str = "MMMM d, yyyy";
        } else if (i == 2) {
            str = "MMM d, yyyy";
        } else {
            if (i != 3) {
                a70.p(ljg.j(i, "Unknown DateFormat style: "));
                return null;
            }
            str = "M/d/yy";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(" ");
        if (i2 == 0 || i2 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i2 == 2) {
            str2 = "h:mm:ss a";
        } else {
            if (i2 != 3) {
                a70.p(ljg.j(i2, "Unknown DateFormat style: "));
                return null;
            }
            str2 = "h:mm a";
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    public static final int B(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static void C(Context context) {
        Pair[] pairArr = {wv8.t(context, "ACTION", "INFO")};
        hpo hpoVar = new hpo(18);
        Pair pair = pairArr[0];
        hpoVar.B(pair.b, (String) pair.a);
        md4 l = hpoVar.l();
        vxd.h(context).b("RegistrationWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(RegistrationWorker.class, l).a());
    }

    public static void D(Context context, boolean z) {
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        if (!sharedPreferences.getBoolean("INIT_DONE", false) || z) {
            Pair[] pairArr = {new Pair("ACTION", "INIT")};
            hpo hpoVar = new hpo(18);
            Pair pair = pairArr[0];
            hpoVar.B(pair.b, (String) pair.a);
            md4 l = hpoVar.l();
            vxd.h(context).b("RegistrationWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(RegistrationWorker.class, l).a());
        }
    }

    public static final boolean E(tbj tbjVar, boolean z) {
        dma c2;
        q5b q5bVar = tbjVar.d;
        if (q5bVar == null || (c2 = q5bVar.c()) == null) {
            return false;
        }
        return pea.q(tbjVar.j(z), pea.H(c2));
    }

    public static final xtc F(xtc xtcVar, icb icbVar, float f, of3 of3Var, int i) {
        uah c2;
        jf9 jf9Var = oyn.e;
        xtcVar.getClass();
        long D = lz.D(R.color.surface_1, of3Var);
        if ((i & 8) != 0) {
            f = 4.0f;
        }
        float f2 = (i & 16) != 0 ? 8.0f : 0.0f;
        boolean z = (i & 32) != 0;
        icb icbVar2 = icb.d;
        float f3 = (icbVar == icbVar2 || icbVar == icb.a) ? f : 0.0f;
        if (icbVar != icbVar2 && icbVar != icb.c) {
            f = 0.0f;
        }
        xtc e0 = l98.e0(xtcVar, f2, f3, f2, f);
        int ordinal = icbVar.ordinal();
        if (ordinal == 0) {
            c2 = o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
        } else if (ordinal == 1) {
            c2 = jf9Var;
        } else if (ordinal == 2) {
            c2 = o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 3);
        } else {
            if (ordinal != 3) {
                zzl.b();
                return null;
            }
            c2 = o7g.a(16.0f);
        }
        xtc q = n9e.q(wnn.A(e0, c2), D, jf9Var);
        return (icbVar == icb.c && z) ? q.z(l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7)) : q;
    }

    public static void G(BaseActivity baseActivity) {
        Pair[] pairArr = {new Pair("ACTION", "LOGIN")};
        hpo hpoVar = new hpo(18);
        Pair pair = pairArr[0];
        hpoVar.B(pair.b, (String) pair.a);
        md4 l = hpoVar.l();
        ktd g = vxd.g(RegistrationWorker.class, l);
        Context applicationContext = baseActivity.getApplicationContext();
        applicationContext.getClass();
        xbl d2 = xbl.d(applicationContext);
        d2.getClass();
        d2.b("RegistrationWorker-".concat(mha.o(l)), nf6.a, (ltd) g.a());
    }

    public static final xbb H(VolleyballPlayerSeasonStatistics volleyballPlayerSeasonStatistics, Context context, fzg fzgVar) {
        volleyballPlayerSeasonStatistics.getClass();
        context.getClass();
        xbb b2 = a.b();
        String string = context.getString(R.string.volleyball_matches);
        string.getClass();
        xbb b3 = a.b();
        String string2 = context.getString(R.string.volleyball_matches_played);
        string2.getClass();
        ezg.e(b3, string2, volleyballPlayerSeasonStatistics.getAppearances(), null, false);
        String string3 = context.getString(R.string.volleyball_sets_played);
        string3.getClass();
        ezg.e(b3, string3, volleyballPlayerSeasonStatistics.getSets(), null, false);
        xbb a2 = a.a(b3);
        km5 km5Var = km5.a;
        ezg.g(b2, string, a2, km5Var);
        String string4 = context.getString(R.string.volleyball_points);
        string4.getClass();
        xbb b4 = a.b();
        String string5 = context.getString(R.string.total);
        string5.getClass();
        Integer pointsTotal = volleyballPlayerSeasonStatistics.getPointsTotal();
        Integer appearances = volleyballPlayerSeasonStatistics.getAppearances();
        fzg fzgVar2 = fzg.e;
        ezg.e(b4, string5, pointsTotal, appearances, fzgVar == fzgVar2);
        String string6 = context.getString(R.string.volleyball_break_points);
        string6.getClass();
        ezg.e(b4, string6, volleyballPlayerSeasonStatistics.getBreakPoints(), volleyballPlayerSeasonStatistics.getAppearances(), fzgVar == fzgVar2);
        String string7 = context.getString(R.string.volleyball_block_points);
        string7.getClass();
        ezg.e(b4, string7, volleyballPlayerSeasonStatistics.getBlockPoints(), volleyballPlayerSeasonStatistics.getAppearances(), fzgVar == fzgVar2);
        ezg.g(b2, string4, a.a(b4), km5Var);
        String string8 = context.getString(R.string.volleyball_serve);
        string8.getClass();
        xbb b5 = a.b();
        String string9 = context.getString(R.string.total);
        string9.getClass();
        ezg.e(b5, string9, volleyballPlayerSeasonStatistics.getServes(), volleyballPlayerSeasonStatistics.getAppearances(), fzgVar == fzgVar2);
        String string10 = context.getString(R.string.volleyball_errors);
        string10.getClass();
        ezg.e(b5, string10, volleyballPlayerSeasonStatistics.getServeErrors(), volleyballPlayerSeasonStatistics.getAppearances(), fzgVar == fzgVar2);
        String string11 = context.getString(R.string.volleyball_aces);
        string11.getClass();
        ezg.e(b5, string11, volleyballPlayerSeasonStatistics.getAces(), volleyballPlayerSeasonStatistics.getAppearances(), fzgVar == fzgVar2);
        ezg.g(b2, string8, a.a(b5), km5Var);
        String string12 = context.getString(R.string.volleyball_reception);
        string12.getClass();
        xbb b6 = a.b();
        String string13 = context.getString(R.string.total);
        string13.getClass();
        ezg.e(b6, string13, volleyballPlayerSeasonStatistics.getReceptionsTotal(), volleyballPlayerSeasonStatistics.getAppearances(), fzgVar == fzgVar2);
        String string14 = context.getString(R.string.volleyball_errors);
        string14.getClass();
        ezg.e(b6, string14, volleyballPlayerSeasonStatistics.getReceptionErrors(), volleyballPlayerSeasonStatistics.getAppearances(), fzgVar == fzgVar2);
        Double receptionPerf = volleyballPlayerSeasonStatistics.getReceptionPerf();
        ezg.c(b6, context, R.string.volleyball_excellent_reception_percentage, receptionPerf != null ? Double.valueOf(receptionPerf.doubleValue() * 100.0d) : null, 8);
        ezg.g(b2, string12, a.a(b6), km5Var);
        String string15 = context.getString(R.string.volleyball_attack);
        string15.getClass();
        xbb b7 = a.b();
        String string16 = context.getString(R.string.total);
        string16.getClass();
        ezg.e(b7, string16, volleyballPlayerSeasonStatistics.getAttacksTotal(), volleyballPlayerSeasonStatistics.getAppearances(), fzgVar == fzgVar2);
        String string17 = context.getString(R.string.volleyball_errors);
        string17.getClass();
        ezg.e(b7, string17, volleyballPlayerSeasonStatistics.getAttackErrors(), volleyballPlayerSeasonStatistics.getAppearances(), fzgVar == fzgVar2);
        String string18 = context.getString(R.string.volleyball_blocked_attacks);
        string18.getClass();
        ezg.e(b7, string18, volleyballPlayerSeasonStatistics.getAttacksBlocked(), volleyballPlayerSeasonStatistics.getAppearances(), fzgVar == fzgVar2);
        String string19 = context.getString(R.string.volleyball_points);
        string19.getClass();
        ezg.e(b7, string19, volleyballPlayerSeasonStatistics.getAttackPoints(), volleyballPlayerSeasonStatistics.getAppearances(), fzgVar == fzgVar2);
        Integer attackPoints = volleyballPlayerSeasonStatistics.getAttackPoints();
        ezg.c(b7, context, R.string.volleyball_points_percentage, yid.b(attackPoints != null ? Integer.valueOf(attackPoints.intValue() * 100) : null, volleyballPlayerSeasonStatistics.getAttacksTotal()), 8);
        ezg.g(b2, string15, a.a(b7), km5Var);
        return a.a(b2);
    }

    public static void I(int i, Context context) {
        Pair[] pairArr = {wv8.t(context, "ACTION", "MUTE_STAGE"), new Pair("STAGE_ID", Integer.valueOf(i))};
        hpo hpoVar = new hpo(18);
        for (int i2 = 0; i2 < 2; i2++) {
            Pair pair = pairArr[i2];
            hpoVar.B(pair.b, (String) pair.a);
        }
        md4 l = hpoVar.l();
        vxd.h(context).b("MuteStageWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(MuteStageWorker.class, l).a());
    }

    public static final qug J(of3 of3Var) {
        Object[] objArr = new Object[0];
        boolean e2 = ((av8) of3Var).e(0);
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (e2 || O == a99Var) {
            O = new ivc(26);
            av8Var.n0(O);
        }
        qug qugVar = (qug) o3a.M(objArr, qug.j, (Function0) O, av8Var, 0);
        Unit unit = Unit.a;
        boolean g = av8Var.g(qugVar);
        Object O2 = av8Var.O();
        if (g || O2 == a99Var) {
            O2 = new ww6(qugVar, null, 2);
            av8Var.n0(O2);
        }
        hz8.o(av8Var, unit, (Function2) O2);
        return qugVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0073  */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [lg3] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [af0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v5, types: [kqf] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v5, types: [yda] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v19, types: [int] */
    /* JADX WARN: Type inference failed for: r4v20, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object K(zij zijVar, Context context, af0 af0Var, uij uijVar, ptj ptjVar, sq3 sq3Var) {
        x8h x8hVar;
        o7a o7aVar;
        x8h x8hVar2;
        lu3 lu3Var;
        ?? r1;
        g9i g9iVar;
        o7a o7aVar2;
        Context context2;
        kqf kqfVar;
        uij uijVar2;
        af0 af0Var2;
        zij zijVar2;
        kqf kqfVar2;
        yda ydaVar;
        o7a o7aVar3;
        lg3 lg3Var;
        x40 x40Var;
        sg3 sg3Var;
        kqf kqfVar3;
        ?? r4;
        ?? r3 = context;
        ?? r2 = af0Var;
        try {
            if (sq3Var instanceof x8h) {
                x8hVar = (x8h) sq3Var;
                r4 = x8hVar.A;
                if ((r4 & Integer.MIN_VALUE) != 0) {
                    ?? r42 = r4 - Integer.MIN_VALUE;
                    x8hVar.A = r42;
                    o7aVar = r42;
                    x8hVar2 = x8hVar;
                    Object obj = x8hVar2.z;
                    lu3Var = lu3.a;
                    r1 = x8hVar2.A;
                    int i = 2;
                    rq3 rq3Var = null;
                    if (r1 != 0) {
                        y6a.M(obj);
                        o7aVar2 = new o7a(zijVar);
                        g9i L = xw3.L(zijVar, null, null, new u41(i, rq3Var, 13), 3);
                        ku3 ku3Var = zijVar.a;
                        r2.getClass();
                        eyf eyfVar = new eyf();
                        fdi a2 = gdi.a(Boolean.FALSE);
                        w8h w8hVar = new w8h(zijVar, r2, r3);
                        ptjVar.getClass();
                        aea a3 = bea.a();
                        yda ydaVar2 = (yda) ku3Var.getCoroutineContext().get(uic.g);
                        if (ydaVar2 != null) {
                            ydaVar2.n(new xjd(a3, 6));
                        }
                        kqf kqfVar4 = new kqf(ku3Var.getCoroutineContext().plus(a3).plus(w8hVar));
                        sg3 sg3Var2 = new sg3(kqfVar4, new pf0(eyfVar));
                        try {
                            jk jkVar = new jk(sg3Var2, (Object) r2, (Object) r3, kqfVar4, zijVar, (rq3) null, 21);
                            sg3Var = sg3Var2;
                            kqfVar3 = kqfVar4;
                            try {
                                xw3.L(zijVar, o7aVar2, null, jkVar, 2);
                                g9iVar = L;
                                af0Var2 = af0Var;
                            } catch (Throwable th) {
                                th = th;
                                g9iVar = L;
                                r2 = kqfVar3;
                                r3 = g9iVar;
                                o7aVar = o7aVar2;
                                r1 = sg3Var;
                                r1.d();
                                o7aVar.a();
                                r3.e(null);
                                r2.A();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sg3Var = sg3Var2;
                            kqfVar3 = kqfVar4;
                        }
                        try {
                            context2 = context;
                            zijVar2 = zijVar;
                            xw3.L(zijVar2, null, null, new o46(kqfVar3, af0Var2, a2, context, eyfVar, zijVar, uijVar, null), 3);
                            jk0 jk0Var = new jk0(i, rq3Var, 1);
                            x8hVar2.r = zijVar2;
                            x8hVar2.s = context2;
                            x8hVar2.t = af0Var2;
                            uijVar2 = uijVar;
                            x8hVar2.u = uijVar2;
                            x8hVar2.v = o7aVar2;
                            x8hVar2.w = g9iVar;
                            x8hVar2.x = kqfVar3;
                            x8hVar2.y = sg3Var;
                            x8hVar2.A = 1;
                            if (rd0.z(a2, jk0Var, x8hVar2) != lu3Var) {
                                kqfVar = kqfVar3;
                                r1 = sg3Var;
                            }
                            return lu3Var;
                        } catch (Throwable th3) {
                            th = th3;
                            r2 = kqfVar3;
                            r3 = g9iVar;
                            o7aVar = o7aVar2;
                            r1 = sg3Var;
                            r1.d();
                            o7aVar.a();
                            r3.e(null);
                            r2.A();
                            throw th;
                        }
                    }
                    try {
                        if (r1 != 1) {
                            if (r1 != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            lg3 lg3Var2 = (lg3) x8hVar2.u;
                            kqfVar2 = (kqf) x8hVar2.t;
                            ydaVar = (yda) x8hVar2.s;
                            o7aVar3 = (o7a) x8hVar2.r;
                            y6a.M(obj);
                            lg3Var = lg3Var2;
                            lg3Var.d();
                            o7aVar3.a();
                            ydaVar.e(null);
                            kqfVar2.A();
                            return Unit.a;
                        }
                        sg3 sg3Var3 = x8hVar2.y;
                        kqf kqfVar5 = x8hVar2.x;
                        g9i g9iVar2 = x8hVar2.w;
                        o7a o7aVar4 = x8hVar2.v;
                        uij uijVar3 = (uij) x8hVar2.u;
                        af0 af0Var3 = (af0) x8hVar2.t;
                        Context context3 = (Context) x8hVar2.s;
                        zij zijVar3 = (zij) x8hVar2.r;
                        y6a.M(obj);
                        g9iVar = g9iVar2;
                        o7aVar2 = o7aVar4;
                        context2 = context3;
                        kqfVar = kqfVar5;
                        uijVar2 = uijVar3;
                        af0Var2 = af0Var3;
                        zijVar2 = zijVar3;
                        r1 = sg3Var3;
                    } catch (Throwable th4) {
                        th = th4;
                        r1.d();
                        o7aVar.a();
                        r3.e(null);
                        r2.A();
                        throw th;
                    }
                    x40Var = new x40(8, zijVar2, uijVar2, o7aVar2);
                    x8hVar2.r = o7aVar2;
                    x8hVar2.s = g9iVar;
                    x8hVar2.t = kqfVar;
                    x8hVar2.u = r1;
                    x8hVar2.v = null;
                    x8hVar2.w = null;
                    x8hVar2.x = null;
                    x8hVar2.y = null;
                    x8hVar2.A = 2;
                    if (af0Var2.d(context2, x40Var, x8hVar2) != lu3Var) {
                        kqfVar2 = kqfVar;
                        ydaVar = g9iVar;
                        o7aVar3 = o7aVar2;
                        lg3Var = r1;
                        lg3Var.d();
                        o7aVar3.a();
                        ydaVar.e(null);
                        kqfVar2.A();
                        return Unit.a;
                    }
                    return lu3Var;
                }
            }
            x40Var = new x40(8, zijVar2, uijVar2, o7aVar2);
            x8hVar2.r = o7aVar2;
            x8hVar2.s = g9iVar;
            x8hVar2.t = kqfVar;
            x8hVar2.u = r1;
            x8hVar2.v = null;
            x8hVar2.w = null;
            x8hVar2.x = null;
            x8hVar2.y = null;
            x8hVar2.A = 2;
            if (af0Var2.d(context2, x40Var, x8hVar2) != lu3Var) {
            }
            return lu3Var;
        } catch (Throwable th5) {
            th = th5;
            r2 = kqfVar;
            r3 = g9iVar;
            o7aVar = o7aVar2;
            r1.d();
            o7aVar.a();
            r3.e(null);
            r2.A();
            throw th;
        }
        x8hVar = new x8h(sq3Var);
        o7aVar = r4;
        x8hVar2 = x8hVar;
        Object obj2 = x8hVar2.z;
        lu3Var = lu3.a;
        r1 = x8hVar2.A;
        int i2 = 2;
        rq3 rq3Var2 = null;
        if (r1 != 0) {
        }
    }

    public static final xtc L(xtc xtcVar, uah uahVar, long j, qz1 qz1Var, float f) {
        xtc E = d2a.E(xtcVar, f, uahVar, false, 0L, 24);
        xtc xtcVar2 = utc.a;
        if (qz1Var != null) {
            xtcVar2 = yso.p(xtcVar2, qz1Var.a, qz1Var.b, uahVar);
        }
        return wnn.A(n9e.q(E.z(xtcVar2), j, uahVar), uahVar);
    }

    public static final long M(long j, wo4 wo4Var, float f, av8 av8Var) {
        long c2 = ((p23) av8Var.k(q23.a)).c();
        int i = r13.j;
        if (!e8k.a(j, c2) || wo4Var == null) {
            av8Var.d0(-1124546347);
            av8Var.s(false);
            return j;
        }
        av8Var.d0(-1124614454);
        long a2 = wo4.a(f, 0, j, av8Var);
        av8Var.s(false);
        return a2;
    }

    public static void N(int i, Context context) {
        Pair[] pairArr = {wv8.t(context, "ACTION", "UN_MUTE_STAGE"), new Pair("STAGE_ID", Integer.valueOf(i))};
        hpo hpoVar = new hpo(18);
        for (int i2 = 0; i2 < 2; i2++) {
            Pair pair = pairArr[i2];
            hpoVar.B(pair.b, (String) pair.a);
        }
        md4 l = hpoVar.l();
        vxd.h(context).b("MuteStageWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(MuteStageWorker.class, l).a());
    }

    public static int O(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static int P(byte[] bArr, int i, p7n p7nVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return R(b2, bArr, i2, p7nVar);
        }
        p7nVar.a = b2;
        return i2;
    }

    public static void Q(Object obj, Object obj2) {
        if (obj == null) {
            yhk.s("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            String obj3 = obj.toString();
            yhk.s(wt3.m("null value in entry: ", obj3, new StringBuilder(obj3.length() + 26), "=null"));
        }
    }

    public static int R(int i, byte[] bArr, int i2, p7n p7nVar) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        if (b2 >= 0) {
            p7nVar.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            p7nVar.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            p7nVar.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            p7nVar.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                p7nVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static void S(int i, String str) {
        if (i >= 0) {
            return;
        }
        a70.p(bf3.h(i, str, " cannot be negative but was: ", new StringBuilder(str.length() + 29 + String.valueOf(i).length())));
    }

    public static int T(byte[] bArr, int i, p7n p7nVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            p7nVar.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        p7nVar.b = j2;
        return i3;
    }

    public static int U(int i, byte[] bArr) {
        int i2 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i3 = bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static long V(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static int W(byte[] bArr, int i, p7n p7nVar) {
        int P = P(bArr, i, p7nVar);
        int i2 = p7nVar.a;
        if (i2 < 0) {
            hbo.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - P) {
            hbo.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            p7nVar.c = g8n.b;
            return P;
        }
        p7nVar.c = g8n.v(P, i2, bArr);
        return P + i2;
    }

    public static int X(Object obj, pcn pcnVar, byte[] bArr, int i, int i2, p7n p7nVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = R(i4, bArr, i3, p7nVar);
            i4 = p7nVar.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            hbo.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i6 = p7nVar.e + 1;
        p7nVar.e = i6;
        if (i6 >= 100) {
            hbo.m("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i7 = i5 + i4;
        pcnVar.f(obj, bArr, i5, i7, p7nVar);
        p7nVar.e--;
        p7nVar.c = obj;
        return i7;
    }

    public static int Y(Object obj, pcn pcnVar, byte[] bArr, int i, int i2, int i3, p7n p7nVar) {
        xbn xbnVar = (xbn) pcnVar;
        int i4 = p7nVar.e + 1;
        p7nVar.e = i4;
        if (i4 >= 100) {
            hbo.m("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int x = xbnVar.x(obj, bArr, i, i2, i3, p7nVar);
        p7nVar.e--;
        p7nVar.c = obj;
        return x;
    }

    public static int Z(int i, byte[] bArr, int i2, int i3, ian ianVar, p7n p7nVar) {
        aan aanVar = (aan) ianVar;
        int P = P(bArr, i2, p7nVar);
        aanVar.g(p7nVar.a);
        while (P < i3) {
            int P2 = P(bArr, P, p7nVar);
            if (i != p7nVar.a) {
                break;
            }
            P = P(bArr, P2, p7nVar);
            aanVar.g(p7nVar.a);
        }
        return P;
    }

    public static final void a(Function0 function0, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1585206132);
        int i2 = i | (av8Var.i(function0) ? 4 : 2);
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            utc utcVar = utc.a;
            xtc d0 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
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
            xtc e2 = fn0.e(1.0f, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), true);
            yf8 yf8Var = xth.a;
            udj.c(oea.v(R.string.tv_channels_text, av8Var), e2, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var, 0, 0, 131064);
            av8Var = av8Var;
            mha.h(oea.v(R.string.contribute, av8Var), function0, null, tqh.a, null, false, false, false, 0L, 0, 0, av8Var, ((i2 << 3) & 112) | 3072, 0, 2036);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f91(i, 12, function0);
        }
    }

    public static int a0(byte[] bArr, int i, ian ianVar, p7n p7nVar) {
        aan aanVar = (aan) ianVar;
        int P = P(bArr, i, p7nVar);
        int i2 = p7nVar.a + P;
        while (P < i2) {
            P = P(bArr, P, p7nVar);
            aanVar.g(p7nVar.a);
        }
        if (P == i2) {
            return P;
        }
        hbo.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static final void b(int i, int i2, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(65580233);
        int i3 = (av8Var.e(i) ? 4 : 2) | i2;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            uni.a(null, o7g.a(24.0f), lz.D(R.color.n_lv_5, av8Var), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, yqo.H(838072868, av8Var, new o81(i, 6)), av8Var, 12582912, Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new o81(i, i2, 7);
        }
    }

    public static int b0(pcn pcnVar, int i, byte[] bArr, int i2, int i3, ian ianVar, p7n p7nVar) {
        y9n zza = pcnVar.zza();
        pcn pcnVar2 = pcnVar;
        byte[] bArr2 = bArr;
        int i4 = i3;
        p7n p7nVar2 = p7nVar;
        int X = X(zza, pcnVar2, bArr2, i2, i4, p7nVar2);
        pcnVar2.c(zza);
        p7nVar2.c = zza;
        ianVar.add(zza);
        while (X < i4) {
            p7n p7nVar3 = p7nVar2;
            int i5 = i4;
            int P = P(bArr2, X, p7nVar3);
            if (i != p7nVar3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            pcn pcnVar3 = pcnVar2;
            y9n zza2 = pcnVar3.zza();
            X = X(zza2, pcnVar3, bArr3, P, i5, p7nVar3);
            pcnVar2 = pcnVar3;
            bArr2 = bArr3;
            i4 = i5;
            p7nVar2 = p7nVar3;
            pcnVar2.c(zza2);
            p7nVar2.c = zza2;
            ianVar.add(zza2);
        }
        return X;
    }

    public static final void c(d2e d2eVar, d2e d2eVar2, d2e d2eVar3, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(644544659);
        int i2 = (av8Var.g(d2eVar) ? 4 : 2) | i | (av8Var.g(d2eVar2) ? 32 : 16) | (av8Var.g(d2eVar3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            tol.b(dh3.n.a(ema.a), yqo.H(-661308461, av8Var, new f2e(xtcVar, d2eVar2, d2eVar, d2eVar3)), av8Var, 56);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f2e(d2eVar, d2eVar2, d2eVar3, xtcVar, i);
        }
    }

    public static int c0(int i, byte[] bArr, int i2, int i3, fdn fdnVar, p7n p7nVar) {
        if ((i >>> 3) == 0) {
            hbo.m("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int T = T(bArr, i2, p7nVar);
            fdnVar.d(i, Long.valueOf(p7nVar.b));
            return T;
        }
        if (i4 == 1) {
            fdnVar.d(i, Long.valueOf(V(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int P = P(bArr, i2, p7nVar);
            int i5 = p7nVar.a;
            if (i5 < 0) {
                hbo.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - P) {
                hbo.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                fdnVar.d(i, g8n.b);
            } else {
                fdnVar.d(i, g8n.v(P, i5, bArr));
            }
            return P + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                fdnVar.d(i, Integer.valueOf(U(i2, bArr)));
                return i2 + 4;
            }
            hbo.m("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        fdn a2 = fdn.a();
        int i7 = p7nVar.e + 1;
        p7nVar.e = i7;
        if (i7 >= 100) {
            hbo.m("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int P2 = P(bArr, i2, p7nVar);
            int i9 = p7nVar.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = P2;
                break;
            }
            i2 = c0(i9, bArr, P2, i3, a2, p7nVar);
            i8 = i9;
        }
        p7nVar.e--;
        if (i2 > i3 || i8 != i6) {
            hbo.m("Failed to parse the message.");
            return 0;
        }
        fdnVar.d(i, a2);
        return i2;
    }

    public static final void d(d2e d2eVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1479839911);
        if ((i & 6) == 0) {
            i2 = i | (av8Var.g(d2eVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) av8Var.k(nz.b);
            n7g a2 = o7g.a(16.0f);
            utc utcVar = utc.a;
            xtc d0 = l98.d0(wnn.A(utcVar, a2), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
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
                O2 = jxa.w;
                av8Var.n0(O2);
            }
            xtc y = tol.y(d0, true, true, true, D, wzcVar, new gi(20, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), context, d2eVar), av8Var, 0);
            u23 a3 = t23.a(ww9.d, uxf.p, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, y);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            td4.C(d2eVar.a, bkh.l(utcVar, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 48, 12);
            xtc f = vxd.f(utcVar, 4.0f, av8Var, utcVar, 1.0f);
            String str = d2eVar.c;
            if (str == null) {
                str = d2eVar.b;
            }
            yf8 yf8Var = xth.a;
            udj.c(str, f, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 2, 0, null, xth.b(), av8Var, 48, 24960, 109560);
            av8Var = av8Var;
            nq8.h(av8Var, bkh.e(utcVar, 8.0f));
            b(d2eVar.d, 0, av8Var);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new n61(d2eVar, i, 12);
        }
    }

    public static final void e(d2e d2eVar, k2f k2fVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-641136000);
        int i2 = (av8Var.g(d2eVar) ? 32 : 16) | i;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar = new goa(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
            u23 a2 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.p, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, goaVar);
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
            d(d2eVar, av8Var, (i2 >> 3) & 14);
            f(k2fVar, bkh.d(utc.a, 1.0f), av8Var, 54);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new op9(d2eVar, k2fVar, i, 24);
        }
    }

    public static final void f(final k2f k2fVar, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        int i3;
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1226637183);
        if ((i & 6) == 0) {
            i2 = (av8Var.e(k2fVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            final jej Q = h5a.Q(0, 0, 1, av8Var);
            k2f k2fVar2 = k2f.c;
            final boolean contains = ph0.a0(new k2f[]{k2fVar2, k2f.d}).contains(k2fVar);
            final boolean contains2 = ph0.a0(new k2f[]{k2fVar2, k2f.e}).contains(k2fVar);
            final long D = lz.D(R.color.n_lv_4, av8Var);
            if (k2fVar == k2fVar2) {
                i3 = 1977305268;
                i4 = R.color.primary_highlight;
            } else {
                i3 = 1977306120;
                i4 = R.color.n_lv_5;
            }
            final long f = ljg.f(av8Var, i3, i4, av8Var, false);
            xtc e2 = bkh.e(xtcVar, k2fVar.b);
            boolean h = ((i2 & 14) == 4) | av8Var.h(contains) | av8Var.h(contains2) | av8Var.f(D) | av8Var.f(f) | av8Var.g(Q);
            Object O = av8Var.O();
            if (h || O == nf3.a) {
                Function1 function1 = new Function1() { // from class: e2e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        long j;
                        ha5 ha5Var = (ha5) obj;
                        ha5Var.getClass();
                        float H0 = ha5Var.H0(16.0f);
                        b20 a2 = e20.a();
                        if (contains) {
                            a2.g(H0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                        a2.f(contains2 ? Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - H0 : Float.intBitsToFloat((int) (ha5Var.n() >> 32)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        a2.f(Float.intBitsToFloat((int) (ha5Var.n() >> 32)), H0);
                        a2.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, H0);
                        a2.d();
                        ha5.X0(ha5Var, a2, D, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 60);
                        k2f k2fVar3 = k2f.c;
                        k2f k2fVar4 = k2fVar;
                        long j2 = f;
                        if (k2fVar4 == k2fVar3) {
                            ha5.X0(ha5Var, a2, j2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 60);
                            j = j2;
                        } else {
                            j = j2;
                        }
                        float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.n() >> 32));
                        ha5.o0(ha5Var, j, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(H0) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) - H0) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 120);
                        aej a3 = jej.a(Q, k2fVar4.a, new dfj(0L, ha5Var.O(Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) * 0.5f), wg8.j, xth.a, 0L, 0, 0, 0L, 16777177), 1020);
                        long j3 = a3.c;
                        o6a.w(ha5Var, a3, j, (Float.floatToRawIntBits((Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - ((int) (j3 >> 32))) / 2.0f) << 32) | (Float.floatToRawIntBits(wt3.e(Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) - H0, (int) (j3 & 4294967295L), 2.0f, H0)) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 248);
                        return Unit.a;
                    }
                };
                av8Var.n0(function1);
                O = function1;
            }
            lz.d(0, av8Var, e2, (Function1) O);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p8b(k2fVar, xtcVar, i, 13);
        }
    }

    public static final void g(int i, r2f r2fVar, boolean z, Function0 function0, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1611657463);
        int i3 = i2 | (av8Var.e(i) ? 4 : 2) | (av8Var.g(r2fVar) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function0) ? 2048 : 1024);
        if (!av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            av8Var.W();
        } else if (r2fVar.equals(p2f.a)) {
            av8Var.d0(-1680366488);
            i(0, av8Var);
            av8Var.s(false);
        } else if (r2fVar.equals(q2f.a)) {
            av8Var.d0(-1680364820);
            h(0, av8Var);
            av8Var.s(false);
        } else {
            if (!(r2fVar instanceof o2f)) {
                throw dmi.h(av8Var, -1680367286, false);
            }
            av8Var.d0(-551631465);
            o2f o2fVar = (o2f) r2fVar;
            int i4 = o2fVar.a;
            String str = o2fVar.b;
            Double d2 = o2fVar.e;
            Integer num = o2fVar.c;
            int intValue = num != null ? num.intValue() : 0;
            String str2 = o2fVar.d;
            if (str2 == null) {
                str2 = "";
            }
            mte mteVar = new mte(i4, str, d2, null, null, intValue, str2, null, null);
            xtc O = kda.O(utc.a, "matchday_highlight_potm_" + i, av8Var);
            boolean z2 = (i3 & 7168) == 2048;
            Object O2 = av8Var.O();
            if (z2 || O2 == nf3.a) {
                O2 = new ma0(10, function0);
                av8Var.n0(O2);
            }
            wkn.c(mteVar, (Function1) O2, O, false, z, av8Var, (i3 << 6) & 57344, 8);
            av8Var.s(false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new di(i, r2fVar, z, function0, i2);
        }
    }

    public static final void h(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-470507706);
        if (av8Var.T(i & 1, i != 0)) {
            utc utcVar = utc.a;
            xtc c0 = l98.c0(bkh.d(utcVar, 1.0f), 16.0f, 8.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
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
            wkn.b(null, 0L, null, null, 0L, false, null, av8Var, 0, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
            xtc d0 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            String v = oea.v(R.string.no_data_available, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, d0, lz.D(R.color.neutral_default, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 48, 0, 131064);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mpa(i, 9);
        }
    }

    public static final void i(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-531386033);
        if (av8Var.T(i & 1, i != 0)) {
            utc utcVar = utc.a;
            xtc O = kda.O(l98.c0(bkh.d(utcVar, 1.0f), 16.0f, 8.0f), "matchday_highlight_potm_skeleton", av8Var);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, O);
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
            wkn.b(null, 0L, null, null, 0L, false, null, av8Var, 0, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
            xtc d0 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            int i2 = 6;
            l8g a3 = k8g.a(new ng0(16.0f, true, new a70(i2)), uxf.m, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d0);
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
            xtc A = wnn.A(bkh.l(utcVar, 40.0f), o7g.a(20.0f));
            long D = lz.D(R.color.n_lv_4, av8Var);
            jf9 jf9Var = oyn.e;
            e12.a(0, av8Var, n9e.q(A, D, jf9Var));
            goa goaVar = new goa(1.0f, true);
            u23 a4 = t23.a(new ng0(4.0f, true, new a70(i2)), kv1Var, av8Var, 6);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, goaVar);
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
            e12.a(0, av8Var, n9e.q(wnn.A(bkh.p(bkh.e(utcVar, 14.0f), 120.0f), o7g.a(2.0f)), lz.D(R.color.n_lv_4, av8Var), jf9Var));
            e12.a(0, av8Var, n9e.q(wnn.A(bkh.p(bkh.e(utcVar, 12.0f), 80.0f), o7g.a(2.0f)), lz.D(R.color.n_lv_4, av8Var), jf9Var));
            av8Var.s(true);
            e12.a(0, av8Var, n9e.q(wnn.A(bkh.m(utcVar, 24.0f, 24.0f), o7g.a(2.0f)), lz.D(R.color.n_lv_4, av8Var), jf9Var));
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mpa(i, 10);
        }
    }

    public static final void j(int i, r2f r2fVar, boolean z, Integer num, r13 r13Var, String str, String str2, Function0 function0, xtc xtcVar, wla wlaVar, of3 of3Var, int i2) {
        int i3;
        r2f r2fVar2;
        Function0 function02;
        xtc xtcVar2;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2137245821);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            r2fVar2 = r2fVar;
            i3 |= av8Var.g(r2fVar2) ? 32 : 16;
        } else {
            r2fVar2 = r2fVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.g(num) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var.g(r13Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= av8Var.g(str) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i2) == 0) {
            i3 |= av8Var.g(str2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            function02 = function0;
            i3 |= av8Var.i(function02) ? 8388608 : 4194304;
        } else {
            function02 = function0;
        }
        int i4 = i3 | 100663296;
        if ((805306368 & i2) == 0) {
            i4 |= (1073741824 & i2) == 0 ? av8Var.g(wlaVar) : av8Var.i(wlaVar) ? 536870912 : 268435456;
        }
        int i5 = i4;
        if (av8Var.T(i5 & 1, (306783379 & i5) != 306783378)) {
            r13 r13Var2 = z ? r13Var : null;
            BrandLocation brandLocation = BrandLocation.FeaturedTournament;
            utc utcVar = utc.a;
            int i6 = i5 >> 6;
            s02.b(r13Var2, num, str2, str, brandLocation, 16, wlaVar, kda.O(utcVar, "wc26_potm_card", av8Var), null, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, yqo.H(203059215, av8Var, new ak(r2fVar2, i, function02, 2, z)), av8Var, (i6 & 7168) | (i6 & 112) | 221184 | ((i5 >> 12) & 896) | ((i5 >> 9) & 3670016), 3072, 7936);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new pm1(i, r2fVar, z, num, r13Var, str, str2, function0, xtcVar2, wlaVar, i2);
        }
    }

    public static final void k(int i, String str, p4b p4bVar, boolean z, int i2, Function0 function0, xtc xtcVar, of3 of3Var, int i3) {
        xtc xtcVar2;
        str.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1048660420);
        int i4 = i3 | (av8Var.e(i) ? 4 : 2) | (av8Var.g(str) ? 32 : 16) | (av8Var.g(p4bVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z) ? com.ironsource.mediationsdk.metadata.a.o : 1024) | (av8Var.e(i2) ? 16384 : 8192) | (av8Var.i(function0) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | 1572864;
        if (av8Var.T(i4 & 1, (599187 & i4) != 599186)) {
            utc utcVar = utc.a;
            Context context = (Context) av8Var.k(nz.b);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                context.getClass();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = context.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences = a5f.d(applicationContext);
                        uic.j = sharedPreferences;
                    }
                    sharedPreferences.getClass();
                }
                O = e.f(Boolean.valueOf(sharedPreferences.getBoolean("PREF_WEEKLY_CHALLENGE_MUTED", false)));
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            kv1 kv1Var = uxf.p;
            xtc f0 = l98.f0(l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5);
            u23 a2 = t23.a(ww9.d, kv1Var, av8Var, 48);
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
            xtc d2 = bkh.d(utcVar, 1.0f);
            String v = oea.v(i, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, d2, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, 48, 0, 131064);
            nq8.h(av8Var, bkh.e(utcVar, 24.0f));
            int i5 = i4 >> 3;
            o6a.d(r4a.J(bkh.p(utcVar, 90.0f), IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, 1000), p4bVar, av8Var, i5 & 112, 0);
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            udj.c(p4bVar.c, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, 0, 0, 131066);
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.e(), av8Var, i5 & 14, 0, 130042);
            v8a.f(i2, (i4 >> 9) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 8, av8Var, n9e.q(vxd.f(utcVar, 16.0f, av8Var, utcVar, 1.0f), lz.D(R.color.n_lv_5, av8Var), o7g.a(4.0f)), null, z);
            av8Var = av8Var;
            nq8.h(av8Var, bkh.e(utcVar, 12.0f));
            boolean booleanValue = ((Boolean) e1dVar.getValue()).booleanValue();
            boolean i6 = av8Var.i(context);
            Object O2 = av8Var.O();
            if (i6 || O2 == a99Var) {
                O2 = new d44(context, e1dVar);
                av8Var.n0(O2);
            }
            v9g.e(booleanValue, (Function1) O2, new q80(oea.v(R.string.exit_checkbox, av8Var)), null, xth.e(), av8Var, 0, 8);
            ww9.q(vxd.f(utcVar, 12.0f, av8Var, utcVar, 1.0f), oea.v(R.string.view_challenge, av8Var), false, true, function0, av8Var, (i5 & 57344) | 3078, 4);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ci(i, str, p4bVar, z, i2, function0, xtcVar2, i3);
        }
    }

    public static final void l(jsh jshVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(148923490);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(jshVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i3 = 0;
        int i4 = 1;
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            int i5 = jshVar.g;
            x43 x43Var = jshVar.o;
            String str = jshVar.h;
            String str2 = jshVar.i;
            boolean z = jshVar.e;
            tc3 H = yqo.H(1100771848, av8Var2, new gsh(jshVar, i3));
            tc3 H2 = yqo.H(-606846908, av8Var2, new gsh(jshVar, i4));
            int i6 = i2 & 112;
            int i7 = i2 & 14;
            boolean z2 = (i6 == 32) | (i7 == 4);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (z2 || O == a99Var) {
                O = new hsh(function1, jshVar, 0);
                av8Var2.n0(O);
            }
            Function0 function0 = (Function0) O;
            boolean z3 = (i6 == 32) | (i7 == 4);
            Object O2 = av8Var2.O();
            if (z3 || O2 == a99Var) {
                O2 = new hsh(function1, jshVar, 1);
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            pco.a(i5, x43Var, xtcVar, H, null, null, H2, null, str, str2, false, z, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, function1, function0, (Function0) O2, av8Var, (i2 & 896) | 1575936, (i2 << 15) & 3670016, 62640);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ish(jshVar, function1, xtcVar, i, 0);
        }
    }

    public static final void m(xtc xtcVar, final uah uahVar, final long j, long j2, final tc3 tc3Var, of3 of3Var, final int i) {
        final xtc xtcVar2;
        final long j3;
        long j4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(174096871);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= av8Var.g(uahVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.f(j) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        int i3 = i2 | 221184;
        if ((1572864 & i) == 0) {
            i3 |= av8Var.i(tc3Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (av8Var.T(i3 & 1, (599187 & i3) != 599186)) {
            av8Var.Y();
            if ((i & 1) == 0 || av8Var.B()) {
                long b2 = q23.b(j, av8Var);
                xtcVar = utc.a;
                j4 = b2;
            } else {
                av8Var.W();
                j4 = j2;
            }
            xtcVar2 = xtcVar;
            av8Var.t();
            ff5 ff5Var = cj5.b;
            float f = ((p75) av8Var.k(ff5Var)).a + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            tol.c(new gb0[]{mo3.a.a(new r13(j4)), ff5Var.a(new p75(f))}, yqo.H(-2004281689, av8Var, new pni(xtcVar2, uahVar, j, f, tc3Var)), av8Var, 56);
            j3 = j4;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
            j3 = j2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: qni
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    u0a.m(xtc.this, uahVar, j, j3, tc3Var, (of3) obj, aba.K(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void n(final Function0 function0, final xtc xtcVar, final boolean z, final uah uahVar, final long j, final long j2, final qz1 qz1Var, final float f, final wzc wzcVar, final tc3 tc3Var, of3 of3Var, final int i) {
        int i2;
        xtc xtcVar2;
        boolean z2;
        uah uahVar2;
        wzc wzcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2141308794);
        if ((i & 6) == 0) {
            i2 = (av8Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            xtcVar2 = xtcVar;
            i2 |= av8Var.g(xtcVar2) ? 32 : 16;
        } else {
            xtcVar2 = xtcVar;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            uahVar2 = uahVar;
            i2 |= av8Var.g(uahVar2) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        } else {
            uahVar2 = uahVar;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var.f(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= av8Var.f(j2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i2 |= av8Var.g(qz1Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= av8Var.d(f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            wzcVar2 = wzcVar;
            i2 |= av8Var.g(wzcVar2) ? 67108864 : 33554432;
        } else {
            wzcVar2 = wzcVar;
        }
        if ((805306368 & i) == 0) {
            i2 |= av8Var.i(tc3Var) ? 536870912 : 268435456;
        }
        if (av8Var.T(i2 & 1, (306783379 & i2) != 306783378)) {
            av8Var.Y();
            if ((i & 1) != 0 && !av8Var.B()) {
                av8Var.W();
            }
            av8Var.t();
            ff5 ff5Var = cj5.b;
            final float f2 = ((p75) av8Var.k(ff5Var)).a + f;
            final xtc xtcVar3 = xtcVar2;
            final boolean z3 = z2;
            final uah uahVar3 = uahVar2;
            final wzc wzcVar3 = wzcVar2;
            tol.c(new gb0[]{mo3.a.a(new r13(j2)), ff5Var.a(new p75(f2))}, yqo.H(-1766606150, av8Var, new Function2() { // from class: nni
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    of3 of3Var2 = (of3) obj;
                    int intValue = ((Integer) obj2).intValue();
                    av8 av8Var2 = (av8) of3Var2;
                    if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                        ff5 ff5Var2 = m7a.a;
                        xtc u = oyn.u(u0a.L(xtcVar3.z(zjc.a), uahVar3, u0a.M(j, (wo4) av8Var2.k(cj5.a), f2, av8Var2), qz1Var, f), wzcVar3, o5g.a(), z3, null, null, function0, 24);
                        k1c c2 = e12.c(uxf.c, true);
                        int G = z8e.G(av8Var2);
                        aee m = av8Var2.m();
                        xtc C = fqj.C(av8Var2, u);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var2.h0();
                        if (av8Var2.S) {
                            av8Var2.l(zg3Var);
                        } else {
                            av8Var2.q0();
                        }
                        waa.K(av8Var2, c2, hf3.g);
                        waa.K(av8Var2, m, hf3.f);
                        f50 f50Var = hf3.j;
                        if (av8Var2.S || !Intrinsics.c(av8Var2.O(), Integer.valueOf(G))) {
                            mz1.t(G, av8Var2, G, f50Var);
                        }
                        waa.K(av8Var2, C, hf3.d);
                        fc6.v(0, tc3Var, av8Var2, true);
                    } else {
                        av8Var2.W();
                    }
                    return Unit.a;
                }
            }), av8Var, 56);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: oni
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(i | 1);
                    u0a.n(Function0.this, xtcVar, z, uahVar, j, j2, qz1Var, f, wzcVar, tc3Var, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void o(boolean z, d1g d1gVar, tbj tbjVar, of3 of3Var, int i) {
        int i2;
        boolean z2;
        d1g d1gVar2;
        bej d2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1344558920);
        if ((i & 6) == 0) {
            i2 = (av8Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.e(d1gVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(tbjVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean g = (i3 == 4) | av8Var.g(tbjVar);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (g || O == a99Var) {
                O = new qbj(tbjVar, z);
                av8Var.n0(O);
            }
            b9j b9jVar = (b9j) O;
            boolean i4 = av8Var.i(tbjVar) | (i3 == 4);
            Object O2 = av8Var.O();
            if (i4 || O2 == a99Var) {
                O2 = new ubj(tbjVar, z);
                av8Var.n0(O2);
            }
            pnd pndVar = (pnd) O2;
            boolean h = pej.h(tbjVar.l().b);
            wcj l = tbjVar.l();
            int i5 = (int) (z ? l.b >> 32 : l.b & 4294967295L);
            q5b q5bVar = tbjVar.d;
            float u = (q5bVar == null || (d2 = q5bVar.d()) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : l4a.u(d2.a, i5);
            boolean i6 = av8Var.i(b9jVar);
            Object O3 = av8Var.O();
            if (i6 || O3 == a99Var) {
                O3 = new m00(b9jVar, 9);
                av8Var.n0(O3);
            }
            d1gVar2 = d1gVar;
            float f = u;
            z2 = z;
            fcp.Y(pndVar, z2, d1gVar2, h, 0L, f, koi.a(utc.a, b9jVar, (PointerInputEventHandler) O3), av8Var, (i2 << 3) & 1008, 16);
        } else {
            z2 = z;
            d1gVar2 = d1gVar;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new di(z2, d1gVar2, tbjVar, i);
        }
    }

    public static final void p(String str, gv9 gv9Var, boolean z, Function0 function0, Function2 function2, Function0 function02, Function0 function03, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-72648718);
        int i2 = i | (av8Var.g(str) ? 4 : 2) | (av8Var.g(gv9Var) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function0) ? com.ironsource.mediationsdk.metadata.a.o : 1024) | (av8Var.i(function2) ? 16384 : 8192) | (av8Var.i(function02) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.i(function03) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (av8Var.T(i2 & 1, (599187 & i2) != 599186)) {
            un0.a(bkh.d(l98.c0(utc.a, 8.0f, 4.0f), 1.0f), o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(1799642560, av8Var, new l3k(gv9Var, z, function02, function03, str, function0, function2)), av8Var, 196614, 24);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new rc7(str, gv9Var, z, function0, function2, function02, function03, i, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0328  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void q(final i3k i3kVar, boolean z, final Function2 function2, of3 of3Var, int i) {
        int i2;
        o3k o3kVar;
        a99 a99Var;
        float f;
        utc utcVar;
        final int i3;
        int i4;
        a99 a99Var2;
        boolean z2;
        Object O;
        boolean z3;
        final Function2 function22 = function2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-886097596);
        int i5 = i | (av8Var.g(i3kVar) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.i(function22) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i5 & 1, (i5 & 147) != 146)) {
            utc utcVar2 = utc.a;
            xtc d2 = bkh.d(l98.d0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), 1.0f);
            lv1 lv1Var = uxf.m;
            wxf wxfVar = ww9.b;
            l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 48);
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
            kq9.b(s6a.N(R.drawable.ic_tv, 6, av8Var), null, null, lz.D(R.color.n_lv_1, av8Var), av8Var, 48, 4);
            String str = i3kVar.c;
            o3k o3kVar2 = i3kVar.f;
            a99 a99Var3 = nf3.a;
            p8g p8gVar = p8g.a;
            if (str != null) {
                av8Var.d0(1505749238);
                Context context = (Context) av8Var.k(nz.b);
                boolean i6 = av8Var.i(context) | ((i5 & 14) == 4);
                Object O2 = av8Var.O();
                if (i6 || O2 == a99Var3) {
                    O2 = new fej(7, context, i3kVar);
                    av8Var.n0(O2);
                }
                xtc f0 = l98.f0(p8gVar.a(1.0f, bea.Q(utcVar2, (Function0) O2, 2), true), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 48);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, f0);
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
                xtc f02 = l98.f0(p8gVar.a(1.0f, utcVar2, false), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                long D = lz.D(R.color.n_lv_4, av8Var);
                Object O3 = av8Var.O();
                if (O3 == a99Var3) {
                    O3 = mz1.e(av8Var);
                }
                wzc wzcVar = (wzc) O3;
                Object[] objArr = new Object[0];
                Object O4 = av8Var.O();
                if (O4 == a99Var3) {
                    O4 = wzj.e;
                    av8Var.n0(O4);
                }
                xtc y = tol.y(f02, true, true, true, D, wzcVar, new eui((boh) o3a.N(objArr, (Function0) O4, av8Var, 48), context, i3kVar, 11), av8Var, 0);
                yf8 yf8Var = xth.a;
                i2 = i5;
                a99Var = a99Var3;
                o3kVar = o3kVar2;
                udj.c(i3kVar.b, y, lz.D(R.color.primary_default, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 110584);
                av8Var = av8Var;
                kq9.b(s6a.N(R.drawable.ic_external_link_16, 6, av8Var), null, bkh.l(utcVar2, 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
                av8Var.s(true);
                av8Var.s(false);
                utcVar = utcVar2;
                i3 = 0;
                i4 = 6;
                f = 8.0f;
            } else {
                i2 = i5;
                o3kVar = o3kVar2;
                a99Var = a99Var3;
                av8Var.d0(1507574766);
                xtc a4 = p8gVar.a(1.0f, l98.d0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), true);
                yf8 yf8Var2 = xth.a;
                f = 8.0f;
                utcVar = utcVar2;
                i3 = 0;
                i4 = 6;
                udj.c(i3kVar.b, a4, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 110584);
                av8Var = av8Var;
                av8Var.s(false);
            }
            ImageVector N = s6a.N(R.drawable.ic_tv_channel_checkmark_16, i4, av8Var);
            long D2 = lz.D(R.color.success, av8Var);
            int i7 = i3kVar.d;
            boolean z4 = o3kVar == o3k.a ? 1 : i3;
            boolean z5 = (o3kVar == null && z) ? 1 : i3;
            int i8 = i2;
            int i9 = i8 & 896;
            int i10 = i8 & 14;
            int i11 = (i9 == 256 ? 1 : i3) | (i10 == 4 ? 1 : i3);
            Object O5 = av8Var.O();
            if (i11 == 0) {
                a99Var2 = a99Var;
                if (O5 != a99Var2) {
                    a99 a99Var4 = a99Var2;
                    r(N, D2, i7, z4, z5, (Function0) O5, null, av8Var, 0, 64);
                    xtc f03 = l98.f0(utcVar, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                    ImageVector N2 = s6a.N(R.drawable.ic_tv_channel_x_16, 6, av8Var);
                    long D3 = lz.D(R.color.error, av8Var);
                    int i12 = i3kVar.e;
                    boolean z6 = o3kVar != o3k.b;
                    boolean z7 = o3kVar != null && z;
                    z2 = (i9 != 256) | (i10 != 4);
                    O = av8Var.O();
                    if (!z2 || O == a99Var4) {
                        function22 = function2;
                        z3 = true;
                        final char c2 = 1 == true ? 1 : 0;
                        O = new Function0() { // from class: m3k
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i13 = c2;
                                i3k i3kVar2 = i3kVar;
                                Function2 function23 = function22;
                                switch (i13) {
                                    case 0:
                                        function23.invoke(Integer.valueOf(i3kVar2.a), o3k.a);
                                        break;
                                    default:
                                        function23.invoke(Integer.valueOf(i3kVar2.a), o3k.b);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var.n0(O);
                    } else {
                        function22 = function2;
                        z3 = true;
                    }
                    r(N2, D3, i12, z6, z7, (Function0) O, f03, av8Var, 1572864, 0);
                    av8Var.s(z3);
                }
            } else {
                a99Var2 = a99Var;
            }
            O5 = new Function0() { // from class: m3k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i13 = i3;
                    i3k i3kVar2 = i3kVar;
                    Function2 function23 = function2;
                    switch (i13) {
                        case 0:
                            function23.invoke(Integer.valueOf(i3kVar2.a), o3k.a);
                            break;
                        default:
                            function23.invoke(Integer.valueOf(i3kVar2.a), o3k.b);
                            break;
                    }
                    return Unit.a;
                }
            };
            av8Var.n0(O5);
            a99 a99Var42 = a99Var2;
            r(N, D2, i7, z4, z5, (Function0) O5, null, av8Var, 0, 64);
            xtc f032 = l98.f0(utcVar, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            ImageVector N22 = s6a.N(R.drawable.ic_tv_channel_x_16, 6, av8Var);
            long D32 = lz.D(R.color.error, av8Var);
            int i122 = i3kVar.e;
            if (o3kVar != o3k.b) {
            }
            if (o3kVar != null) {
            }
            z2 = (i9 != 256) | (i10 != 4);
            O = av8Var.O();
            if (z2) {
            }
            function22 = function2;
            z3 = true;
            final int c22 = 1 == true ? 1 : 0;
            O = new Function0() { // from class: m3k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i13 = c22;
                    i3k i3kVar2 = i3kVar;
                    Function2 function23 = function22;
                    switch (i13) {
                        case 0:
                            function23.invoke(Integer.valueOf(i3kVar2.a), o3k.a);
                            break;
                        default:
                            function23.invoke(Integer.valueOf(i3kVar2.a), o3k.b);
                            break;
                    }
                    return Unit.a;
                }
            };
            av8Var.n0(O);
            r(N22, D32, i122, z6, z7, (Function0) O, f032, av8Var, 1572864, 0);
            av8Var.s(z3);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t60(i3kVar, z, function22, i, 28);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void r(final ImageVector imageVector, final long j, final int i, final boolean z, final boolean z2, final Function0 function0, xtc xtcVar, of3 of3Var, final int i2, final int i3) {
        xtc xtcVar2;
        final xtc xtcVar3;
        eqf u;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1726563229);
        int i4 = i2 | (av8Var.g(imageVector) ? 4 : 2) | (av8Var.f(j) ? 32 : 16) | (av8Var.e(i) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z) ? com.ironsource.mediationsdk.metadata.a.o : 1024) | (av8Var.h(z2) ? 16384 : 8192) | (av8Var.i(function0) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        int i5 = i3 & 64;
        if (i5 != 0) {
            i4 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var.g(xtcVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            if (av8Var.T(i4 & 1, (599187 & i4) == 599186)) {
                av8Var.W();
                xtcVar3 = xtcVar2;
            } else {
                utc utcVar = utc.a;
                xtc xtcVar4 = i5 != 0 ? utcVar : xtcVar2;
                xtc o = yso.o(xtcVar4, 1.0f, z ? ljg.f(av8Var, -1369877450, R.color.primary_default, av8Var, false) : ljg.f(av8Var, -1369876660, R.color.n_lv_4, av8Var, false), o7g.a(4.0f));
                long D = lz.D(R.color.n_lv_4, av8Var);
                Object O = av8Var.O();
                a99 a99Var = nf3.a;
                if (O == a99Var) {
                    O = mz1.e(av8Var);
                }
                wzc wzcVar = (wzc) O;
                Object[] objArr = new Object[0];
                int i6 = i4;
                Object O2 = av8Var.O();
                if (O2 == a99Var) {
                    O2 = wzj.f;
                    av8Var.n0(O2);
                }
                cyg cygVar = new cyg((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function0, 25);
                xtc xtcVar5 = xtcVar4;
                xtc b0 = l98.b0(tol.y(o, z2, true, true, D, wzcVar, cygVar, av8Var, 0), 4.0f);
                l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, b0);
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
                kq9.b(imageVector, null, null, j, av8Var, (i6 & 14) | 48 | ((i6 << 6) & 7168), 4);
                xtc f0 = l98.f0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                yf8 yf8Var = xth.a;
                udj.c(String.valueOf(i), f0, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 48, 0, 131064);
                av8Var = av8Var;
                av8Var.s(true);
                xtcVar3 = xtcVar5;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new Function2() { // from class: n3k
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        u0a.r(ImageVector.this, j, i, z, z2, function0, xtcVar3, (of3) obj, aba.K(i2 | 1), i3);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if (av8Var.T(i4 & 1, (599187 & i4) == 599186)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static final void s(gv9 gv9Var, qug qugVar, koh kohVar, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var;
        gv9Var.getClass();
        qugVar.getClass();
        kohVar.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1801652734);
        int i2 = i | (av8Var2.g(gv9Var) ? 4 : 2) | (av8Var2.g(qugVar) ? 32 : 16) | (av8Var2.g(kohVar) ? 256 : 128) | (av8Var2.g(xtcVar) ? com.ironsource.mediationsdk.metadata.a.o : 1024);
        boolean z = false;
        boolean z2 = 1;
        if (av8Var2.T(i2 & 1, (i2 & 1171) != 1170)) {
            boolean c0 = hkg.c0((Context) av8Var2.k(nz.b));
            boolean z3 = ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (z3 || O == a99Var) {
                O = goh.b(new b93(qugVar, c0, kohVar, gv9Var, 7));
                av8Var2.n0(O);
            }
            cdi cdiVar = (cdi) O;
            xtc d2 = bkh.d(xtcVar, 1.0f);
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            xtc g = bkh.g(d2, 48.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            k1c c2 = e12.c(uxf.i, false);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, g);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c2, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            av8Var2.d0(-7134690);
            for (iwk iwkVar : (List) cdiVar.getValue()) {
                int i3 = iwkVar.a;
                r9k r9kVar = iwkVar.b;
                int i4 = iwkVar.c;
                av8Var2.a0(118032399, Integer.valueOf(i3));
                String b2 = r9kVar.b((Context) av8Var2.k(nz.b));
                xtc d0 = l98.d0(utc.a, f, 16.0f, z2);
                boolean e2 = av8Var2.e(i4);
                Object O2 = av8Var2.O();
                if (e2 || O2 == a99Var) {
                    O2 = new kwi(i4, 13);
                    av8Var2.n0(O2);
                }
                xtc M = s02.M(d0, (Function1) O2);
                yf8 yf8Var = xth.a;
                boolean z4 = z;
                av8 av8Var3 = av8Var2;
                udj.c(b2, M, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var3, 0, 0, 131064);
                av8Var3.s(z4);
                f = f;
                z2 = z2;
                z = z4;
                av8Var2 = av8Var3;
                a99Var = a99Var;
            }
            av8Var = av8Var2;
            av8Var.s(z);
            av8Var.s(z2);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mp9(gv9Var, qugVar, kohVar, xtcVar, i, 19);
        }
    }

    public static int t(int i, boolean z) {
        return dmi.e(i, 31, z);
    }

    public static final float u(Layout layout, int i, Paint paint) {
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = dej.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : t0a.a[paragraphAlignment.ordinal()]) == 1) {
            return wt3.e(layout.getWidth(), measureText, 2.0f, Math.abs(lineLeft));
        }
        return (layout.getWidth() - measureText) + Math.abs(lineLeft);
    }

    public static final float v(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = dej.a;
        if (layout.getEllipsisCount(i) <= 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? t0a.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    public static final long w(KeyEvent keyEvent) {
        return d2a.b(keyEvent.getKeyCode());
    }

    public static final long x(glg glgVar) {
        glgVar.getClass();
        if (y(glgVar) == 0) {
            return -1L;
        }
        nlg V0 = glgVar.V0("SELECT last_insert_rowid()");
        try {
            V0.U0();
            long j = V0.getLong(0);
            o1j.t(V0, null);
            return j;
        } finally {
        }
    }

    public static final int y(glg glgVar) {
        glgVar.getClass();
        nlg V0 = glgVar.V0("SELECT changes()");
        try {
            V0.U0();
            int i = (int) V0.getLong(0);
            o1j.t(V0, null);
            return i;
        } finally {
        }
    }

    public static final int z(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }
}
