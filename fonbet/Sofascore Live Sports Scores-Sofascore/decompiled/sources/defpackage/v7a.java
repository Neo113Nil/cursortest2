package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.net.Uri;
import android.os.Build;
import android.view.InputEvent;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.features.stories.models.ui.StoryModel;
import com.ironsource.C4227o2;
import com.ironsource.V2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.wc26.WorldCupRound;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.team.TeamWorker;
import com.unity3d.services.UnityAdsConstants;
import defpackage.gim;
import defpackage.n4m;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class v7a {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;

    public static final void A(y3g y3gVar, m9j m9jVar, m9j m9jVar2, z41 z41Var, boolean z) {
        i1d i1dVar = (i1d) z41Var.b;
        int i = i1dVar.c;
        if (i > 1) {
            y3gVar.y(new kfj(0, m9jVar.c.toString(), m9jVar2.c.toString(), m9jVar.d, m9jVar2.d, 0L, false, 32));
            return;
        }
        if (i == 1) {
            jn2 jn2Var = (jn2) i1dVar.a[0];
            long g2 = t6a.g(jn2Var.c, jn2Var.d);
            jn2 jn2Var2 = (jn2) ((i1d) z41Var.b).a[0];
            long g3 = t6a.g(jn2Var2.a, jn2Var2.b);
            if (pej.d(g2) && pej.d(g3)) {
                return;
            }
            y3gVar.y(new kfj(pej.g(g2), t6a.K(g2, m9jVar), t6a.K(g3, m9jVar2), m9jVar.d, m9jVar2.d, 0L, z, 32));
        }
    }

    public static void D(int i, Context context) {
        Pair[] pairArr = {wv8.t(context, "ACTION", "REMOVE_TEAM"), new Pair("TEAM_ID", Integer.valueOf(i))};
        hpo hpoVar = new hpo(18);
        for (int i2 = 0; i2 < 2; i2++) {
            Pair pair = pairArr[i2];
            hpoVar.B(pair.b, (String) pair.a);
        }
        md4 l = hpoVar.l();
        vxd.h(context).b("TeamWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(TeamWorker.class, l).a());
    }

    public static String E(double d2) {
        return new DecimalFormat("0.#", new DecimalFormatSymbols(Locale.US)).format(d2);
    }

    public static void F(ska skaVar, cy1 cy1Var) {
        PorterDuff.Mode mode;
        if (Build.VERSION.SDK_INT >= 29) {
            eq3.N(skaVar, cy1Var != null ? eq3.G(cy1Var) : null);
            return;
        }
        if (cy1Var == null) {
            skaVar.setXfermode(null);
            return;
        }
        switch (dy1.a[cy1Var.ordinal()]) {
            case 1:
                mode = PorterDuff.Mode.CLEAR;
                break;
            case 2:
                mode = PorterDuff.Mode.SRC;
                break;
            case 3:
                mode = PorterDuff.Mode.DST;
                break;
            case 4:
                mode = PorterDuff.Mode.SRC_OVER;
                break;
            case 5:
                mode = PorterDuff.Mode.DST_OVER;
                break;
            case 6:
                mode = PorterDuff.Mode.SRC_IN;
                break;
            case 7:
                mode = PorterDuff.Mode.DST_IN;
                break;
            case 8:
                mode = PorterDuff.Mode.SRC_OUT;
                break;
            case 9:
                mode = PorterDuff.Mode.DST_OUT;
                break;
            case 10:
                mode = PorterDuff.Mode.SRC_ATOP;
                break;
            case 11:
                mode = PorterDuff.Mode.DST_ATOP;
                break;
            case 12:
                mode = PorterDuff.Mode.XOR;
                break;
            case 13:
                mode = PorterDuff.Mode.ADD;
                break;
            case 14:
                mode = PorterDuff.Mode.MULTIPLY;
                break;
            case 15:
                mode = PorterDuff.Mode.SCREEN;
                break;
            case 16:
                mode = PorterDuff.Mode.OVERLAY;
                break;
            case 17:
                mode = PorterDuff.Mode.DARKEN;
                break;
            case 18:
                mode = PorterDuff.Mode.LIGHTEN;
                break;
            default:
                mode = null;
                break;
        }
        skaVar.setXfermode(mode != null ? new PorterDuffXfermode(mode) : null);
    }

    public static final void G(Context context) {
        SharedPreferences d2;
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
        SharedPreferences.Editor i = dmi.i(sharedPreferences, "PREF_MEASUREMENT_UNITS_FIRST_RUN", false);
        Unit unit = Unit.a;
        i.apply();
    }

    public static final void H(s3h s3hVar, int i, i43 i43Var) {
        s3h s3hVar2;
        i1d i1dVar = new i1d(new s3h[16], 0);
        List i2 = s3hVar.i(false, false);
        while (true) {
            i1dVar.d(i1dVar.c, i2);
            while (true) {
                int i3 = i1dVar.c;
                if (i3 == 0) {
                    return;
                }
                s3hVar2 = (s3h) i1dVar.r(i3 - 1);
                boolean J = rd0.J(s3hVar2);
                l3h l3hVar = s3hVar2.d;
                x0d x0dVar = l3hVar.a;
                if (!J && !x0dVar.c(w3h.j)) {
                    wdd d2 = s3hVar2.d();
                    if (d2 == null) {
                        throw wt3.j("Expected semantics node to have a coordinator.");
                    }
                    x6a J2 = y6a.J(o6a.m(d2, true));
                    if (J2.a < J2.c && J2.b < J2.d) {
                        Object g2 = l3hVar.a.g(k3h.e);
                        if (g2 == null) {
                            g2 = null;
                        }
                        Function2 function2 = (Function2) g2;
                        Object g3 = x0dVar.g(w3h.w);
                        wtg wtgVar = (wtg) (g3 != null ? g3 : null);
                        if (function2 != null && wtgVar != null && ((Number) wtgVar.b.invoke()).floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            int i4 = 1 + i;
                            i43Var.invoke(new xtg(s3hVar2, i4, J2, d2));
                            H(s3hVar2, i4, i43Var);
                        }
                    }
                }
            }
            i2 = s3hVar2.i(false, false);
        }
    }

    public static String I(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b2 : bArr) {
            if (b2 == 34) {
                sb.append("\\\"");
            } else if (b2 == 39) {
                sb.append("\\'");
            } else if (b2 != 92) {
                switch (b2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b2 < 32 || b2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b2 >>> 6) & 3) + 48));
                            sb.append((char) (((b2 >>> 3) & 7) + 48));
                            sb.append((char) ((b2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b2);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static nin J(nin ninVar, String[] strArr, Map map) {
        int length;
        int i = 0;
        if (ninVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (nin) map.get(strArr[0]);
            }
            if (length2 > 1) {
                nin ninVar2 = new nin();
                while (i < length2) {
                    ninVar2.a((nin) map.get(strArr[i]));
                    i++;
                }
                return ninVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                ninVar.a((nin) map.get(strArr[0]));
                return ninVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i < length) {
                    ninVar.a((nin) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return ninVar;
    }

    public static final void a(o8d o8dVar, boolean z, Function0 function0, Function0 function02, of3 of3Var, int i) {
        Function0 function03;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1220469155);
        int i2 = i | (av8Var.g(o8dVar) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | 384 | (av8Var.i(function02) ? a.o : 1024);
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (O == obj) {
                O = new ivc(8);
                av8Var.n0(O);
            }
            Function0 function04 = (Function0) O;
            Object O2 = av8Var.O();
            int i3 = 9;
            if (O2 == obj) {
                O2 = new ivc(i3);
                av8Var.n0(O2);
            }
            Function0 function05 = (Function0) O2;
            Object O3 = av8Var.O();
            if (O3 == obj) {
                O3 = new ivc(10);
                av8Var.n0(O3);
            }
            int i4 = (i2 & 14) | V2.b.f;
            int i5 = i2 << 9;
            b(o8dVar, false, function05, (Function0) O3, z, function04, function02, av8Var, i4 | (57344 & i5) | 196608 | (i5 & 3670016));
            function03 = function04;
        } else {
            av8Var.W();
            function03 = function0;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p81(o8dVar, z, function03, function02, i, 13);
        }
    }

    public static final void b(final o8d o8dVar, final boolean z, final Function0 function0, final Function0 function02, final boolean z2, final Function0 function03, final Function0 function04, of3 of3Var, final int i) {
        int i2;
        final Function0 function05;
        Function0 function06;
        boolean z3;
        Function0 function07;
        Object obj;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(898330592);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(o8dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function05 = function0;
            i2 |= av8Var.i(function05) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            function05 = function0;
        }
        if ((i & 3072) == 0) {
            function06 = function02;
            i2 |= av8Var.i(function06) ? a.o : 1024;
        } else {
            function06 = function02;
        }
        if ((i & 24576) == 0) {
            z3 = z2;
            i2 |= av8Var.h(z3) ? 16384 : 8192;
        } else {
            z3 = z2;
        }
        if ((196608 & i) == 0) {
            function07 = function03;
            i2 |= av8Var.i(function07) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        } else {
            function07 = function03;
        }
        if ((i & 1572864) == 0) {
            i2 |= av8Var.i(function04) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (av8Var.T(i2 & 1, (i2 & 599187) != 599186)) {
            g8d g8dVar = (g8d) av8Var.k(ohb.a);
            if (g8dVar == null) {
                a70.r("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
                return;
            }
            Object navigationEventDispatcher = g8dVar.getNavigationEventDispatcher();
            int i3 = i2 & 14;
            boolean z4 = i3 == 4;
            Object O = av8Var.O();
            Object obj2 = nf3.a;
            if (z4 || O == obj2) {
                O = new me3((l8d) ((eoh) o8dVar.c).getValue(), new mnc(o8dVar, 13));
                av8Var.n0(O);
            }
            final me3 me3Var = (me3) O;
            boolean i4 = ((i2 & 3670016) == 1048576) | av8Var.i(me3Var) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072) | (i3 == 4);
            Object O2 = av8Var.O();
            if (i4 || O2 == obj2) {
                final Function0 function08 = function06;
                final boolean z5 = z3;
                obj = obj2;
                final Function0 function09 = function07;
                Object obj3 = new Function0() { // from class: i8d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        me3 me3Var2 = me3.this;
                        boolean z6 = me3Var2.f;
                        boolean z7 = z;
                        if (z6 != z7) {
                            me3Var2.f = z7;
                            f8d f8dVar = me3Var2.g;
                            if (f8dVar != null) {
                                f8dVar.b.b();
                            }
                        }
                        me3Var2.i = function05;
                        me3Var2.j = function08;
                        me3Var2.g(z5);
                        me3Var2.k = function09;
                        me3Var2.l = function04;
                        o8d o8dVar2 = o8dVar;
                        l8d l8dVar = (l8d) ((eoh) o8dVar2.c).getValue();
                        List list = (List) ((eoh) o8dVar2.b).getValue();
                        List list2 = (List) ((eoh) o8dVar2.d).getValue();
                        l8dVar.getClass();
                        list.getClass();
                        list2.getClass();
                        me3Var2.a = l8dVar;
                        me3Var2.b = list;
                        me3Var2.c = list2;
                        f8d f8dVar2 = me3Var2.g;
                        if (f8dVar2 != null) {
                            f8dVar2.b.d(me3Var2);
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(obj3);
                O2 = obj3;
            } else {
                obj = obj2;
            }
            hz8.t((Function0) O2, av8Var);
            boolean i5 = (i3 == 4) | av8Var.i(me3Var) | av8Var.i(navigationEventDispatcher);
            Object O3 = av8Var.O();
            if (i5 || O3 == obj) {
                O3 = new vsc(2, o8dVar, me3Var, navigationEventDispatcher);
                av8Var.n0(O3);
            }
            hz8.d(o8dVar, (Function1) O3, av8Var);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: j8d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    v7a.b(o8d.this, z, function0, function02, z2, function03, function04, (of3) obj4, aba.K(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(int i, of3 of3Var, xtc xtcVar, final Function0 function0) {
        xtc xtcVar2;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-669579752);
        int i2 = (av8Var.i(function0) ? 4 : 2) | i | (av8Var.g(xtcVar) ? 32 : 16);
        final int i3 = 1;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            Object k = av8Var.k(ngb.a);
            final BaseActivity baseActivity = k instanceof BaseActivity ? (BaseActivity) k : null;
            if (baseActivity == null) {
                a70.r("Required value was null.");
                return;
            }
            String v = oea.v(R.string.never_miss_a_play_header, av8Var);
            String v2 = oea.v(R.string.never_miss_a_play_body_text, av8Var);
            int i4 = i2 & 14;
            boolean i5 = av8Var.i(baseActivity) | (i4 == 4);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            Object obj = O;
            if (i5 || O == a99Var) {
                Function0 function02 = new Function0() { // from class: gsd
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i6 = r3;
                        Function0 function03 = function0;
                        BaseActivity baseActivity2 = baseActivity;
                        switch (i6) {
                            case 0:
                                if (Build.VERSION.SDK_INT >= 33) {
                                    p4h.t(baseActivity2, true, new ord(2, baseActivity2, function03), null, 40);
                                } else {
                                    zsd zsdVar = zsd.Continue;
                                    zic zicVar = xsd.c;
                                    nv.d0(baseActivity2, C4227o2.x, "continue", 3);
                                    function03.invoke();
                                }
                                break;
                            default:
                                zsd zsdVar2 = zsd.Continue;
                                zic zicVar2 = xsd.c;
                                nv.d0(baseActivity2, C4227o2.x, "maybe_later", 3);
                                function03.invoke();
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(function02);
                obj = function02;
            }
            Function0 u = tol.u((Function0) obj, av8Var);
            int i6 = (av8Var.i(baseActivity) ? 1 : 0) | (i4 == 4 ? 1 : 0);
            Object O2 = av8Var.O();
            Object obj2 = O2;
            if (i6 != 0 || O2 == a99Var) {
                Function0 function03 = new Function0() { // from class: gsd
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i62 = i3;
                        Function0 function032 = function0;
                        BaseActivity baseActivity2 = baseActivity;
                        switch (i62) {
                            case 0:
                                if (Build.VERSION.SDK_INT >= 33) {
                                    p4h.t(baseActivity2, true, new ord(2, baseActivity2, function032), null, 40);
                                } else {
                                    zsd zsdVar = zsd.Continue;
                                    zic zicVar = xsd.c;
                                    nv.d0(baseActivity2, C4227o2.x, "continue", 3);
                                    function032.invoke();
                                }
                                break;
                            default:
                                zsd zsdVar2 = zsd.Continue;
                                zic zicVar2 = xsd.c;
                                nv.d0(baseActivity2, C4227o2.x, "maybe_later", 3);
                                function032.invoke();
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(function03);
                obj2 = function03;
            }
            xtcVar2 = xtcVar;
            n4o.l(v, v2, j72.b, u, tol.u((Function0) obj2, av8Var), xtcVar2, av8Var, ((i2 << 12) & 458752) | 384);
        } else {
            xtcVar2 = xtcVar;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new fm(function0, xtcVar2, i, 8);
        }
    }

    public static final void d(sre sreVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(997150055);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (av8Var2.i(sreVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            tc3 H = yqo.H(-1101969344, av8Var2, new t1d(sreVar, 9));
            tc3 H2 = yqo.H(1325798376, av8Var2, new ore(sreVar, 3));
            boolean i4 = av8Var2.i(sreVar) | ((i2 & 112) == 32);
            Object O = av8Var2.O();
            if (i4 || O == nf3.a) {
                O = new pre(function1, sreVar, i3);
                av8Var2.n0(O);
            }
            av8Var = av8Var2;
            v9g.c(xtcVar, H, H2, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, null, (Function0) O, av8Var, ((i2 >> 6) & 14) | 432, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new qre(sreVar, function1, xtcVar, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(long j, List list, xtc xtcVar, of3 of3Var, int i, int i2) {
        int i3;
        xtc xtcVar2;
        xtc xtcVar3;
        eqf u;
        e1d e1dVar;
        list.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1008369920);
        if ((i & 6) == 0) {
            i3 = (av8Var.f(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i3 | (av8Var.i(list) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            if (av8Var.T(i4 & 1, (i4 & 147) == 146)) {
                av8Var.W();
                xtcVar3 = xtcVar2;
            } else {
                utc utcVar = utc.a;
                if (i5 != 0) {
                    xtcVar2 = utcVar;
                }
                Object O = av8Var.O();
                Object obj = nf3.a;
                if (O == obj) {
                    O = e.f(CollectionsKt.Y(list));
                    av8Var.n0(O);
                }
                e1d e1dVar2 = (e1d) O;
                xlb I = x2a.I(new ylb(R.raw.sofascore_logomark_loader), av8Var);
                PointF pointF = nmb.a;
                Integer valueOf = Integer.valueOf(hkg.s0(lz.D(R.color.n_lv_1, av8Var)));
                String[] strArr = {"**"};
                av8Var.e0(-1788530187);
                av8Var.e0(1613443961);
                boolean g2 = av8Var.g(strArr);
                Object O2 = av8Var.O();
                if (g2 || O2 == obj) {
                    O2 = new aja((String[]) Arrays.copyOf(strArr, 1));
                    av8Var.n0(O2);
                }
                aja ajaVar = (aja) O2;
                av8Var.s(false);
                av8Var.e0(1613444012);
                boolean g3 = av8Var.g(ajaVar) | av8Var.g(valueOf);
                Object O3 = av8Var.O();
                if (g3 || O3 == obj) {
                    O3 = new imb(ajaVar, valueOf);
                    av8Var.n0(O3);
                }
                av8Var.s(false);
                av8Var.s(false);
                imb[] imbVarArr = {(imb) O3};
                av8Var.e0(-395574495);
                int hashCode = Arrays.hashCode(imbVarArr);
                av8Var.e0(34468001);
                boolean e2 = av8Var.e(hashCode);
                Object O4 = av8Var.O();
                if (e2 || O4 == obj) {
                    O4 = new hmb(ph0.X(imbVarArr));
                    av8Var.n0(O4);
                }
                hmb hmbVar = (hmb) O4;
                av8Var.s(false);
                av8Var.s(false);
                Unit unit = Unit.a;
                boolean i6 = av8Var.i(list) | ((i4 & 14) == 4);
                Object O5 = av8Var.O();
                if (i6 || O5 == obj) {
                    e1dVar = e1dVar2;
                    ouh ouhVar = new ouh(list, j, e1dVar, null);
                    av8Var.n0(ouhVar);
                    O5 = ouhVar;
                } else {
                    e1dVar = e1dVar2;
                }
                hz8.o(av8Var, unit, (Function2) O5);
                xtc d2 = bkh.d(xtcVar2, 1.0f);
                u23 a2 = t23.a(new ng0(16.0f, true, new a70(6)), uxf.p, av8Var, 54);
                int hashCode2 = Long.hashCode(av8Var.T);
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
                waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C, hf3.d);
                xtc xtcVar4 = xtcVar2;
                aba.b((plb) I.getValue(), bkh.l(utcVar, 16.0f), Integer.MAX_VALUE, hmbVar, av8Var, 1572912, 32768, 4177852);
                String str = (String) e1dVar.getValue();
                Object O6 = av8Var.O();
                if (O6 == obj) {
                    O6 = new z1h(19);
                    av8Var.n0(O6);
                }
                l98.b(str, null, (Function1) O6, null, null, null, fkf.c, av8Var, 1573248, 58);
                av8Var = av8Var;
                av8Var.s(true);
                xtcVar3 = xtcVar4;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new xj(j, list, xtcVar3, i, i2);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if (av8Var.T(i4 & 1, (i4 & 147) == 146)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    public static final void f(int i, of3 of3Var) {
        boolean B;
        int i2;
        WorldCupRound worldCupRound;
        long f2;
        boolean z;
        long f3;
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(77342206);
        boolean z2 = 1;
        boolean z3 = false;
        if (av8Var.T(i & 1, i != 0)) {
            Object O = av8Var.O();
            if (O == nf3.a) {
                yea yeaVar = j58.a;
                O = l6g.W(j58.g());
                av8Var.n0(O);
            }
            gv9 gv9Var = (gv9) O;
            utc utcVar = utc.a;
            float f4 = 1.0f;
            float f5 = 16.0f;
            xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 32.0f, 2);
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
            Iterator p = ljg.p(av8Var, C, hf3.d, 34172895, gv9Var);
            int i4 = 0;
            while (p.hasNext()) {
                Object next = p.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    b.q();
                    throw null;
                }
                WorldCupRound worldCupRound2 = (WorldCupRound) next;
                if (i4 != gv9Var.size() - z2) {
                    if (yaa.w() >= worldCupRound2.getStartTimestamp()) {
                        long w = yaa.w();
                        WorldCupRound worldCupRound3 = (WorldCupRound) CollectionsKt.a0(i5, gv9Var);
                        if (w < (worldCupRound3 != null ? worldCupRound3.getStartTimestamp() : 0L)) {
                            B = z2;
                        }
                    }
                    B = z3;
                } else {
                    B = fc6.B(fc6.t(Instant.ofEpochSecond(worldCupRound2.getStartTimestamp())));
                }
                xtc f02 = l98.f0(bkh.d(utcVar, f4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                float f6 = f5;
                lv1 lv1Var = uxf.m;
                wxf wxfVar = ww9.b;
                l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 48);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, f02);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                f50 f50Var = hf3.g;
                waa.K(av8Var, a3, f50Var);
                ff3 ff3Var = hf3.f;
                waa.K(av8Var, m2, ff3Var);
                Integer valueOf = Integer.valueOf(hashCode2);
                f50 f50Var2 = hf3.j;
                waa.K(av8Var, valueOf, f50Var2);
                ry ryVar = hf3.k;
                waa.J(av8Var, ryVar);
                f50 f50Var3 = hf3.d;
                waa.K(av8Var, C2, f50Var3);
                gv9 gv9Var2 = gv9Var;
                if (B) {
                    i2 = i4;
                    worldCupRound = worldCupRound2;
                    f2 = ljg.f(av8Var, 693855568, R.color.n_lv_1, av8Var, false);
                } else {
                    i2 = i4;
                    worldCupRound = worldCupRound2;
                    f2 = ljg.f(av8Var, 693856048, R.color.n_lv_5, av8Var, false);
                }
                xtc b0 = l98.b0(n9e.q(utcVar, f2, o7g.a(4.0f)), 8.0f);
                l8g a4 = k8g.a(wxfVar, uxf.l, av8Var, 0);
                WorldCupRound worldCupRound4 = worldCupRound;
                utc utcVar2 = utcVar;
                int hashCode3 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C3 = fqj.C(av8Var, b0);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a4, f50Var);
                waa.K(av8Var, m3, ff3Var);
                bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C3, f50Var3);
                long startTimestamp = worldCupRound4.getStartTimestamp();
                bi4 bi4Var = bi4.PATTERN_DM;
                ConcurrentHashMap concurrentHashMap = hk4.a;
                String format = hk4.a(bi4Var.d()).format(Instant.ofEpochSecond(startTimestamp));
                format.getClass();
                String O2 = l4a.O(format);
                String format2 = hk4.a(bi4Var.d()).format(Instant.ofEpochSecond(worldCupRound4.getEndTimestamp()));
                format2.getClass();
                String O3 = l4a.O(format2);
                if (!O2.equals(O3)) {
                    O2 = lnb.o(O2, " - ", O3);
                }
                yf8 yf8Var = xth.a;
                dfj b2 = xth.b();
                if (B) {
                    z = false;
                    f3 = ljg.f(av8Var, 1598931864, R.color.surface_1, av8Var, false);
                } else {
                    z = false;
                    f3 = ljg.f(av8Var, 1598932468, R.color.n_lv_1, av8Var, false);
                }
                av8 av8Var2 = av8Var;
                int i6 = i2;
                udj.c(O2, null, f3, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, b2, av8Var2, 0, 0, 131066);
                av8Var2.s(true);
                xtc f03 = l98.f0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                vel velVar = vel.a;
                switch (i6) {
                    case 1:
                        i3 = R.string.round_of_32;
                        break;
                    case 2:
                        i3 = R.string.round_of_16;
                        break;
                    case 3:
                        i3 = R.string.quarterfinals;
                        break;
                    case 4:
                        i3 = R.string.semifinals;
                        break;
                    case 5:
                        i3 = R.string.third_place_match;
                        break;
                    case 6:
                        i3 = R.string.final_string;
                        break;
                    default:
                        i3 = R.string.group_stage;
                        break;
                }
                udj.c(oea.v(i3, av8Var2), f03, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var2, 48, 0, 131064);
                av8Var = av8Var2;
                av8Var.s(true);
                z2 = 1;
                f5 = f6;
                i4 = i5;
                f4 = 1.0f;
                gv9Var = gv9Var2;
                utcVar = utcVar2;
                z3 = false;
            }
            av8Var.s(z3);
            av8Var.s(z2);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t6j(i, 23);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [n4m] */
    public static final xlm g(StoryModel storyModel) {
        String e2;
        String e3;
        storyModel.getClass();
        List<srl> list = storyModel.g;
        ArrayList arrayList = new ArrayList();
        for (srl srlVar : list) {
            srlVar.getClass();
            atm atmVar = (atm) CollectionsKt.firstOrNull(srlVar.g.b.a);
            if (atmVar != null) {
                n4m.a a2 = fgm.a(srlVar.g, atmVar, (atm) CollectionsKt.firstOrNull(srlVar.d.a), Double.valueOf(srlVar.b));
                if (a2 != null) {
                    Date date = srlVar.k;
                    if (date == null || (e3 = evl.e(date)) == null) {
                        Date date2 = srlVar.f;
                        e2 = date2 != null ? evl.e(date2) : null;
                    } else {
                        e2 = e3;
                    }
                    r5 = new n4m(srlVar.a, new gim.d(storyModel, srlVar), a2, storyModel.title, null, null, e2, storyModel.d, srlVar.e, tz9.t(storyModel.g, srlVar), storyModel.a, srlVar.c, srlVar.h, false, 0, 0, null, null, null, null, Boolean.valueOf(srlVar.q), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7331888, null);
                }
            }
            if (r5 != null) {
                arrayList.add(r5);
            }
        }
        return new xlm(storyModel.id, arrayList, (n4m) CollectionsKt.a0(storyModel.q, arrayList), 0, storyModel.c, storyModel.h, storyModel.i, storyModel.j, 8, null);
    }

    public static void h(int i, Context context) {
        Pair[] pairArr = {wv8.t(context, "ACTION", "ADD_TEAM"), new Pair("TEAM_ID", Integer.valueOf(i))};
        hpo hpoVar = new hpo(18);
        for (int i2 = 0; i2 < 2; i2++) {
            Pair pair = pairArr[i2];
            hpoVar.B(pair.b, (String) pair.a);
        }
        md4 l = hpoVar.l();
        vxd.h(context).b("TeamWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(TeamWorker.class, l).a());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(k8f k8fVar, Function0 function0, rq3 rq3Var) {
        h8f h8fVar;
        int i;
        try {
            if (rq3Var instanceof h8f) {
                h8fVar = (h8f) rq3Var;
                int i2 = h8fVar.t;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    h8fVar.t = i2 - Integer.MIN_VALUE;
                    Object obj = h8fVar.s;
                    lu3 lu3Var = lu3.a;
                    i = h8fVar.t;
                    if (i != 0) {
                        y6a.M(obj);
                        if (h8fVar.getContext().get(uic.g) != k8fVar) {
                            a70.r("awaitClose() can only be invoked from the producer context");
                            return null;
                        }
                        h8fVar.r = function0;
                        h8fVar.t = 1;
                        lj2 lj2Var = new lj2(1, z9a.b(h8fVar));
                        lj2Var.t();
                        ((j8f) k8fVar).b(new oi(lj2Var, 15));
                        if (lj2Var.q() == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        function0 = h8fVar.r;
                        y6a.M(obj);
                    }
                    function0.invoke();
                    return Unit.a;
                }
            }
            if (i != 0) {
            }
            function0.invoke();
            return Unit.a;
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
        h8fVar = new h8f(rq3Var);
        Object obj2 = h8fVar.s;
        lu3 lu3Var2 = lu3.a;
        i = h8fVar.t;
    }

    public static final Pair j(zdc zdcVar) {
        Charset charset = Charsets.UTF_8;
        if (zdcVar != null) {
            Charset a2 = zdc.a(zdcVar);
            if (a2 == null) {
                try {
                    zdcVar = bea.v(zdcVar + "; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    zdcVar = null;
                }
            } else {
                charset = a2;
            }
        }
        return new Pair(charset, zdcVar);
    }

    public static void m(int i, Context context) {
        Pair[] pairArr = {wv8.t(context, "ACTION", "DISABLE_NOTIFICATIONS"), new Pair("TEAM_ID", Integer.valueOf(i))};
        hpo hpoVar = new hpo(18);
        for (int i2 = 0; i2 < 2; i2++) {
            Pair pair = pairArr[i2];
            hpoVar.B(pair.b, (String) pair.a);
        }
        md4 l = hpoVar.l();
        vxd.h(context).b("TeamWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(TeamWorker.class, l).a());
    }

    public static final Object n(i0f i0fVar, String str, sq3 sq3Var) {
        Object c2 = i0fVar.c(str, new crj(7), sq3Var);
        return c2 == lu3.a ? c2 : Unit.a;
    }

    public static final long o(float f2, int i, long j, boolean z) {
        int h = ((z || i == 2 || i == 4 || i == 5) && an3.d(j)) ? an3.h(j) : Integer.MAX_VALUE;
        if (an3.j(j) != h) {
            h = llf.c(ufa.l(f2), an3.j(j), h);
        }
        return pco.E(0, h, 0, an3.g(j));
    }

    public static final String p(long j) {
        String l;
        if (j <= -999500000) {
            l = lnb.l((j - 500000000) / 1000000000, " s ", new StringBuilder());
        } else if (j <= -999500) {
            l = lnb.l((j - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j <= 0) {
            l = lnb.l((j - 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500) {
            l = lnb.l((j + 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500000) {
            l = lnb.l((j + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            l = lnb.l((j + 500000000) / 1000000000, " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{l}, 1));
    }

    public static String q(Context context, double d2) {
        context.getClass();
        if (Intrinsics.c(u(context), "METRIC")) {
            String string = context.getString(R.string.weight_format_kilograms, E(d2));
            string.getClass();
            return string;
        }
        String string2 = context.getString(R.string.weight_format_pounds, E(d2 / 0.454d));
        string2.getClass();
        return string2;
    }

    public static final String r(Context context, double d2) {
        context.getClass();
        if (Intrinsics.c(u(context), "METRIC")) {
            String string = d2 >= 1000.0d ? context.getString(R.string.kilometers_format, E(d2 / 1000.0d)) : context.getString(R.string.meters_format, E(d2));
            string.getClass();
            return string;
        }
        if (d2 / 0.3048d < 5280.0d) {
            return s(context, d2, false);
        }
        String string2 = context.getString(R.string.miles_format, E(d2 / 1609.344d));
        string2.getClass();
        return string2;
    }

    public static final String s(Context context, double d2, boolean z) {
        if (z) {
            String string = context.getString(R.string.inches_format, Integer.valueOf(wzb.a(d2 / 0.0254d)));
            string.getClass();
            return string;
        }
        int i = (int) (d2 / 0.3048d);
        int a2 = wzb.a((d2 - (i * 0.3048d)) / 0.0254d);
        if (a2 == 12.0d) {
            i++;
            a2 = 0;
        }
        String string2 = context.getString(R.string.feet_inches_format, Integer.valueOf(i), Integer.valueOf(a2));
        string2.getClass();
        return string2;
    }

    public static final String u(Context context) {
        SharedPreferences d2;
        context.getClass();
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
        return sharedPreferences.getString("PREF_MEASUREMENT_UNITS", "METRIC");
    }

    public static final float v(kx4 kx4Var, boolean z, long j) {
        float d2 = dnd.d(h5a.q(njh.f(j), njh.d(j))) / 2.0f;
        return z ? kx4Var.H0(10.0f) + d2 : d2;
    }

    public static final String w(Context context, double d2, boolean z, boolean z2) {
        context.getClass();
        if (!Intrinsics.c(u(context), "METRIC")) {
            return s(context, d2, z2);
        }
        String string = context.getString(z ? R.string.centimeters_format : R.string.meters_format, (z ? Integer.valueOf(wzb.a(d2 * 100.0d)) : Double.valueOf(d2)).toString());
        string.getClass();
        return string;
    }

    public static final void y(Logger logger, xti xtiVar, bui buiVar, String str) {
        logger.fine(buiVar.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + xtiVar.a);
    }

    public static j8f z(ku3 ku3Var, Function2 function2) {
        g gVar = g.a;
        a62 a62Var = a62.a;
        nu3 nu3Var = nu3.a;
        j8f j8fVar = new j8f(yt3.b(ku3Var, gVar), ml4.g(0, 4, a62Var));
        j8fVar.l0(nu3Var, j8fVar, function2);
        return j8fVar;
    }

    public abstract Object B(Uri uri, InputEvent inputEvent, rq3 rq3Var);

    public abstract Object C(Uri uri, rq3 rq3Var);

    public ric k(wic wicVar) {
        ByteBuffer byteBuffer = wicVar.i;
        byteBuffer.getClass();
        z1a.s(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return l(wicVar, byteBuffer);
    }

    public abstract ric l(wic wicVar, ByteBuffer byteBuffer);

    public abstract Object t(rq3 rq3Var);
}
