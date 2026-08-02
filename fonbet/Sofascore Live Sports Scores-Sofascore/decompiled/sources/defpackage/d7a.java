package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.style.shared.models.BlazeInsets;
import com.blaze.blazesdk.widgets.models.InsetsRemoteDto;
import com.google.android.gms.internal.ads.zzagn;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.Sports;
import com.sofascore.model.fantasy.FantasyPlayer;
import com.sofascore.results.R;
import com.sofascore.results.weeklyChallenge.WeeklyAlarmReceiver;
import com.unity3d.services.UnityAdsConstants;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class d7a implements zzagn {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;

    public static String A(String str) {
        return "TRuntime.".concat(str);
    }

    public static final boolean B(wma wmaVar) {
        int ordinal = wmaVar.G.d.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            zzl.b();
                            return false;
                        }
                        wma v = wmaVar.v();
                        if (v != null) {
                            return B(v);
                        }
                        a70.p("no parent for idle node");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean C(wma wmaVar) {
        if (wmaVar.h == null) {
            return false;
        }
        wma v = wmaVar.v();
        return (v != null ? v.h : null) == null || wmaVar.G.b;
    }

    public static boolean D(Context context) {
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
        return sharedPreferences.getBoolean("PREF_TAP_PLAYER_AVERAGE_POSITION_TRIGGERED", false);
    }

    public static final String E(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        return stringWriter2;
    }

    public static final void F(Context context, cai caiVar) {
        SharedPreferences d2;
        context.getClass();
        caiVar.getClass();
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
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.getClass();
        edit.putString("STANDINGS_VIEW_MODE_v2", caiVar.a);
        Unit unit = Unit.a;
        edit.apply();
    }

    public static void G(Context context) {
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
        sharedPreferences.edit().putBoolean("PREF_TAP_PLAYER_AVERAGE_POSITION_TRIGGERED", true).apply();
    }

    public static final int H(tzc tzcVar) {
        int c2;
        int i = tzcVar.b;
        int c3 = tzcVar.c(0);
        while (tzcVar.b != 0 && tzcVar.c(0) == c3) {
            tzcVar.f(0, tzcVar.d());
            tzcVar.e(tzcVar.b - 1);
            int i2 = tzcVar.b;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int c4 = tzcVar.c(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int c5 = tzcVar.c(i6);
                if (i5 >= i2 || (c2 = tzcVar.c(i5)) <= c5) {
                    if (c5 > c4) {
                        tzcVar.f(i4, c5);
                        tzcVar.f(i6, c4);
                        i4 = i6;
                    }
                } else if (c2 > c4) {
                    tzcVar.f(i4, c2);
                    tzcVar.f(i5, c4);
                    i4 = i5;
                }
            }
        }
        return c3;
    }

    public static final long I(long j) {
        return (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static boolean J(byte b2) {
        return b2 > -65;
    }

    public static final void a(Function1 function1, of3 of3Var, int i) {
        int i2;
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1625981022);
        if ((i & 6) == 0) {
            i2 = i | (av8Var.i(function1) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            utc utcVar = utc.a;
            xtc q = n9e.q(wnn.A(bkh.c(utcVar, 1.0f), o7g.a(16.0f)), lz.D(R.color.graphics_dark, av8Var), oyn.e);
            k1c c2 = e12.c(uxf.g, false);
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
            xtc e2 = bkh.e(bkh.d(utcVar, 1.0f), 144.0f);
            mv1 mv1Var = uxf.d;
            n12 n12Var = n12.a;
            xtc a2 = n12Var.a(e2, mv1Var);
            d7e t = haa.t(R.drawable.wc_26_bottom_sheet_bg_pattern, 0, av8Var);
            a99 a99Var = mp3.g;
            wkn.k(t, null, a2, null, a99Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 24632, 104);
            wkn.k(haa.t(R.drawable.wc_26_bottom_sheet_bg_pattern, 0, av8Var), null, n12Var.a(haa.v(bkh.e(bkh.d(utcVar, 1.0f), 144.0f), 180.0f), uxf.j), null, a99Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 24632, 104);
            kq9.b(s6a.N(R.drawable.ic_main_fantasy, 6, av8Var), null, bkh.l(utcVar, 188.0f), lz.D(R.color.on_color_highlight_2, av8Var), av8Var, 432, 0);
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a3 = t23.a(ww9.d, uxf.p, av8Var, 48);
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
            String v = oea.v(R.string.sofascore_fantasy, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131066);
            udj.c(oea.v(R.string.fantasy_ucl_popup_body, av8Var), l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.e(), av8Var, 48, 0, 130040);
            xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            bqh bqhVar = new bqh(s6a.N(R.drawable.ic_chevron_right_large_16, 6, av8Var), uxf.q);
            String v2 = oea.v(R.string.fantasy_play_now_button, av8Var);
            boolean z = (i2 & 14) == 4;
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new b4j(20, function1);
                av8Var.n0(O);
            }
            mha.h(v2, (Function0) O, f0, uqh.a, bqhVar, false, false, false, 0L, 0, 0, av8Var, 3456, 0, 2016);
            av8Var = av8Var;
            i3 = 1;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            i3 = 1;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new erc(i, i3, function1);
        }
    }

    public static final void b(qel qelVar, xtc xtcVar, Integer num, float f2, Function1 function1, of3 of3Var, int i) {
        int i2;
        xtc xtcVar2;
        f50 f50Var;
        f50 f50Var2;
        zg3 zg3Var;
        ry ryVar;
        f50 f50Var3;
        utc utcVar;
        lv1 lv1Var;
        boolean z;
        Unit unit;
        utc utcVar2;
        qel qelVar2 = qelVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(210338928);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(qelVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= av8Var.g(num) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= av8Var.d(f2) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= av8Var.i(function1) ? 16384 : 8192;
        }
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            utc utcVar3 = utc.a;
            xtc d2 = bkh.d(utcVar3, 1.0f);
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
                O2 = wzj.u;
                av8Var.n0(O2);
            }
            xtc y = tol.y(d2, true, true, true, D, wzcVar, new eui((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function1, qelVar2, 19), av8Var, 0);
            av8 av8Var2 = av8Var;
            xtc e0 = l98.e0(y, f2, 8.0f, 16.0f, 8.0f);
            lv1 lv1Var2 = uxf.m;
            l8g a2 = k8g.a(ww9.b, lv1Var2, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, e0);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var2);
            } else {
                av8Var2.q0();
            }
            f50 f50Var4 = hf3.g;
            waa.K(av8Var2, a2, f50Var4);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var5);
            ry ryVar2 = hf3.k;
            waa.J(av8Var2, ryVar2);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var2, C, f50Var6);
            if (num == null) {
                av8Var2.d0(-1779822279);
                av8Var2.s(false);
                unit = null;
                ryVar = ryVar2;
                utcVar = utcVar3;
                z = false;
                lv1Var = lv1Var2;
                f50Var3 = f50Var6;
                f50Var = f50Var5;
                zg3Var = zg3Var2;
                f50Var2 = f50Var4;
            } else {
                av8Var2.d0(-1779822278);
                String valueOf2 = String.valueOf(num.intValue() + 1);
                yf8 yf8Var = xth.a;
                f50Var = f50Var5;
                f50Var2 = f50Var4;
                zg3Var = zg3Var2;
                ryVar = ryVar2;
                f50Var3 = f50Var6;
                utcVar = utcVar3;
                lv1Var = lv1Var2;
                z = false;
                udj.c(valueOf2, bkh.p(l98.f0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), 16.0f), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.g(), av8Var2, 48, 0, 130040);
                av8Var2 = av8Var2;
                Unit unit2 = Unit.a;
                av8Var2.s(false);
                unit = Unit.a;
            }
            if (unit == null) {
                utcVar2 = utcVar;
                ljg.r(8.0f, -1779489493, av8Var2, av8Var2, utcVar2);
                Unit unit3 = Unit.a;
                av8Var2.s(z);
            } else {
                utcVar2 = utcVar;
                av8Var2.d0(2020796090);
                av8Var2.s(z);
            }
            FantasyPlayer fantasyPlayer = qelVar2.a;
            td4.C(fantasyPlayer.getPlayer().getId(), bkh.l(utcVar2, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 48, 12);
            xtc d0 = l98.d0(new goa(1.0f, true), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            int i4 = 6;
            u23 a3 = t23.a(new ng0(4.0f, true, new a70(i4)), uxf.o, av8Var2, 6);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, d0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var7 = f50Var2;
            waa.K(av8Var2, a3, f50Var7);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            String t = tba.t(fantasyPlayer.getPlayer());
            yf8 yf8Var2 = xth.a;
            av8 av8Var3 = av8Var2;
            utc utcVar4 = utcVar2;
            f50 f50Var8 = f50Var3;
            f50 f50Var9 = f50Var;
            udj.c(t, kda.O(utcVar2, "primary_label", av8Var2), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var3, 0, 0, 131064);
            l8g a4 = k8g.a(new ng0(4.0f, true, new a70(i4)), lv1Var, av8Var3, 54);
            int hashCode3 = Long.hashCode(av8Var3.T);
            aee m3 = av8Var3.m();
            xtc C3 = fqj.C(av8Var3, utcVar4);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a4, f50Var7);
            waa.K(av8Var3, m3, ff3Var);
            bf3.s(hashCode3, av8Var3, f50Var9, av8Var3, ryVar);
            waa.K(av8Var3, C3, f50Var8);
            td4.G(fantasyPlayer.getTeam().getId(), bkh.l(utcVar4, 16.0f), false, 0L, av8Var3, 48, 12);
            qelVar2 = qelVar;
            udj.c(qelVar2.c, kda.O(utcVar4, "secondary_label", av8Var3), lz.D(R.color.n_lv_3, av8Var3), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var3, 0, 0, 131064);
            av8Var3.s(true);
            av8Var3.s(true);
            udj.c(qelVar2.b, kda.O(utcVar4, "stat_value", av8Var3), lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, dfj.a(xth.e(), 0L, 0L, null, null, 0L, null, 0, 1, 0L, null, null, 0, 16711679), av8Var3, 0, 0, 131064);
            av8Var = av8Var3;
            av8Var.s(true);
            xtcVar2 = utcVar4;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zel(qelVar2, xtcVar2, num, f2, function1, i);
        }
    }

    public static final void c(wci wciVar, boolean z, Function1 function1, of3 of3Var, int i) {
        utc utcVar;
        float f2;
        f50 f50Var;
        f50 f50Var2;
        ry ryVar;
        ff3 ff3Var;
        f50 f50Var3;
        boolean z2;
        zg3 zg3Var;
        zdl zdlVar = wciVar.g;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-432710580);
        int i2 = i | (av8Var.g(wciVar) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.i(function1) ? 256 : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            long c2 = r13.c(lz.D(zdlVar.b, av8Var), 0.15f);
            long D = lz.D(zdlVar.b, av8Var);
            utc utcVar2 = utc.a;
            xtc A = wnn.A(bkh.d(utcVar2, 1.0f), o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12));
            jf9 jf9Var = oyn.e;
            xtc q = n9e.q(A, c2, jf9Var);
            boolean z3 = ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object O = av8Var.O();
            if (z3 || O == nf3.a) {
                O = new ufl(2, function1, wciVar);
                av8Var.n0(O);
            }
            xtc y = tol.y(q, false, false, false, 0L, null, (Function0) O, av8Var, 31);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, y);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var4 = hf3.g;
            waa.K(av8Var, a2, f50Var4);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var, m, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var, valueOf, f50Var5);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var, C, f50Var6);
            xtc e2 = bkh.e(bkh.d(utcVar2, 1.0f), 92.0f);
            l8g a3 = k8g.a(ww9.h, uxf.l, av8Var, 6);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, e2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var4);
            waa.K(av8Var, m2, ff3Var2);
            bf3.s(hashCode2, av8Var, f50Var5, av8Var, ryVar2);
            waa.K(av8Var, C2, f50Var6);
            if (z) {
                av8Var.d0(-537731971);
                utcVar = utcVar2;
                f2 = 16.0f;
                td4.D(wciVar.a, 48, av8Var, bkh.l(l98.f0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 92.0f));
                av8Var.s(false);
                ff3Var = ff3Var2;
                ryVar = ryVar2;
                f50Var = f50Var5;
                f50Var2 = f50Var6;
                z2 = false;
                f50Var3 = f50Var4;
            } else {
                utcVar = utcVar2;
                f2 = 16.0f;
                av8Var.d0(-537484343);
                f50Var = f50Var5;
                f50Var2 = f50Var6;
                ryVar = ryVar2;
                ff3Var = ff3Var2;
                f50Var3 = f50Var4;
                td4.C(wciVar.a, bkh.l(l98.f0(utcVar, 16.0f, 28.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 4), 56.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, 12);
                z2 = false;
                av8Var.s(false);
            }
            String str = wciVar.f;
            yf8 yf8Var = xth.a;
            float f3 = f2;
            ff3 ff3Var3 = ff3Var;
            f50 f50Var7 = f50Var;
            utc utcVar3 = utcVar;
            f50 f50Var8 = f50Var3;
            udj.c(str, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 9), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 48, 24960, 110584);
            av8Var.s(true);
            xtc c0 = l98.c0(n9e.q(n9e.q(bkh.d(utcVar3, 1.0f), D, jf9Var), lz.D(R.color.darken_overlay_1, av8Var), jf9Var), f3, 8.0f);
            lv1 lv1Var = uxf.m;
            l8g a4 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, c0);
            av8Var.h0();
            if (av8Var.S) {
                zg3Var = zg3Var2;
                av8Var.l(zg3Var);
            } else {
                zg3Var = zg3Var2;
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var8);
            waa.K(av8Var, m3, ff3Var3);
            bf3.s(hashCode3, av8Var, f50Var7, av8Var, ryVar);
            f50 f50Var9 = f50Var2;
            waa.K(av8Var, C3, f50Var9);
            zg3 zg3Var3 = zg3Var;
            ry ryVar3 = ryVar;
            udj.c("1", bkh.p(utcVar3, f3), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.g(), av8Var, 54, 0, 130040);
            xtc f0 = l98.f0(utcVar3, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            int i3 = 6;
            u23 a5 = t23.a(new ng0(4.0f, true, new a70(i3)), kv1Var, av8Var, 6);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, f0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var3);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a5, f50Var8);
            waa.K(av8Var, m4, ff3Var3);
            bf3.s(hashCode4, av8Var, f50Var7, av8Var, ryVar3);
            waa.K(av8Var, C4, f50Var9);
            udj.c(wciVar.b, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110586);
            l8g a6 = k8g.a(new ng0(4.0f, true, new a70(i3)), lv1Var, av8Var, 54);
            int hashCode5 = Long.hashCode(av8Var.T);
            aee m5 = av8Var.m();
            xtc C5 = fqj.C(av8Var, utcVar3);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var3);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a6, f50Var8);
            waa.K(av8Var, m5, ff3Var3);
            bf3.s(hashCode5, av8Var, f50Var7, av8Var, ryVar3);
            waa.K(av8Var, C5, f50Var9);
            td4.G(wciVar.c, bkh.l(utcVar3, 16.0f), false, 0L, av8Var, 48, 12);
            udj.c(wciVar.e, null, lz.D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
            nq8.h(av8Var, new goa(1.0f, true));
            e(wciVar.f, wciVar.d, av8Var, 0);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cfl(wciVar, z, function1, i, 2);
        }
    }

    public static final void e(String str, String str2, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1667674446);
        int i2 = i | (av8Var.g(str) ? 4 : 2) | (av8Var.g(str2) ? 32 : 16);
        if (!av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            av8Var.W();
        } else if (Intrinsics.c(str, oea.v(R.string.average_sofascore_rating, av8Var))) {
            av8Var.d0(1802970588);
            Double f2 = b.f(str2);
            if (f2 == null) {
                av8Var.d0(1802970587);
                av8Var.s(false);
            } else {
                av8Var.d0(1802970588);
                i9a.i(Double.valueOf(f2.doubleValue()), false, kda.O(utc.a, "rating_text", av8Var), new p75(24.0f), Integer.valueOf(R.color.on_color_primary), new p75(18.0f), false, av8Var, 12779952, 272);
                av8Var.s(false);
                Unit unit = Unit.a;
            }
            av8Var.s(false);
        } else {
            av8Var.d0(1803358584);
            yf8 yf8Var = xth.a;
            udj.c(str2, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.h(), av8Var, (i2 >> 3) & 14, 24576, 114682);
            av8Var = av8Var;
            av8Var.s(false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new v54(str, str2, i, 3);
        }
    }

    public static final long f(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final void g(final float f2, int i, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1505189522);
        int i2 = 2;
        int i3 = (av8Var.d(f2) ? 4 : 2) | i | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Object O = av8Var.O();
            rq3 rq3Var = null;
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = l6g.K(new xyh(R.string.football, Integer.valueOf(R.drawable.ic_football)), new xyh(R.string.basketball, Integer.valueOf(R.drawable.ic_basketball)), new xyh(R.string.tennis, Integer.valueOf(R.drawable.ic_tennis)), new xyh(R.string.ice_hockey, Integer.valueOf(R.drawable.ic_ice_hockey)), new xyh(R.string.american_football, Integer.valueOf(R.drawable.ic_american_football)), new xyh(R.string.and_many_more_sports, null));
                av8Var.n0(O);
            }
            final b7 b7Var = (b7) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = e.c(0);
                av8Var.n0(O2);
            }
            znh znhVar = (znh) O2;
            Unit unit = Unit.a;
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = new j8c(b7Var, znhVar, rq3Var, 19);
                av8Var.n0(O3);
            }
            hz8.o(av8Var, unit, (Function2) O3);
            Integer valueOf = Integer.valueOf(znhVar.h());
            Object O4 = av8Var.O();
            if (O4 == a99Var) {
                O4 = new a7d(22);
                av8Var.n0(O4);
            }
            tc3 H = yqo.H(-1156159048, av8Var, new et8() { // from class: lrd
                @Override // defpackage.et8
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int intValue = ((Integer) obj2).intValue();
                    of3 of3Var2 = (of3) obj3;
                    ((Integer) obj4).getClass();
                    ((k60) obj).getClass();
                    xyh xyhVar = (xyh) b7.this.get(intValue);
                    u23 a2 = t23.a(ww9.d, uxf.p, of3Var2, 48);
                    av8 av8Var2 = (av8) of3Var2;
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    utc utcVar = utc.a;
                    xtc C = fqj.C(of3Var2, utcVar);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8 av8Var3 = (av8) of3Var2;
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var);
                    } else {
                        av8Var3.q0();
                    }
                    waa.K(of3Var2, a2, hf3.g);
                    waa.K(of3Var2, m, hf3.f);
                    waa.K(of3Var2, Integer.valueOf(hashCode), hf3.j);
                    waa.J(of3Var2, hf3.k);
                    waa.K(of3Var2, C, hf3.d);
                    if (xyhVar.b != null) {
                        av8Var3.d0(-564023158);
                        kq9.b(s6a.N(xyhVar.b.intValue(), 6, of3Var2), null, bkh.l(utcVar, f2), lz.D(R.color.on_color_primary, of3Var2), of3Var2, 48, 0);
                        av8Var3.s(false);
                    } else {
                        av8Var3.d0(-563765052);
                        nq8.h(of3Var2, bkh.l(utcVar, 40.0f));
                        av8Var3.s(false);
                    }
                    nq8.h(of3Var2, bkh.l(utcVar, 16.0f));
                    String v = oea.v(xyhVar.a, of3Var2);
                    yf8 yf8Var = xth.a;
                    udj.c(v, null, lz.D(R.color.on_color_primary, of3Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.h(), of3Var2, 0, 24960, 110586);
                    av8Var3.s(true);
                    return Unit.a;
                }
            });
            xtcVar2 = utc.a;
            l98.b(valueOf, xtcVar2, (Function1) O4, null, null, null, H, av8Var, 1573296, 56);
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new w73(f2, i, i2, xtcVar2);
        }
    }

    public static final xml h(long j) {
        int i = (int) j;
        int i2 = (int) (j >> 32);
        int i3 = ~i;
        int i4 = (i << 10) ^ (i2 >>> 4);
        xml xmlVar = new xml();
        xmlVar.c = i;
        xmlVar.d = i2;
        xmlVar.e = 0;
        xmlVar.f = 0;
        xmlVar.g = i3;
        xmlVar.h = i4;
        xmlVar.j();
        for (int i5 = 0; i5 < 64; i5++) {
            xmlVar.d();
        }
        return xmlVar;
    }

    public static final void i(otg otgVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        tc3 tc3Var;
        int i3;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1332679917);
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = (av8Var2.i(otgVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i5 = 0;
        int i6 = 1;
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            int i7 = otgVar.g;
            x43 x43Var = otgVar.q;
            String str = otgVar.h;
            String str2 = otgVar.i;
            boolean z = otgVar.e;
            tc3 H = yqo.H(-192334931, av8Var2, new ktg(otgVar, i5));
            tc3 H2 = yqo.H(1552586547, av8Var2, new ktg(otgVar, i6));
            tc3 H3 = yqo.H(2024926193, av8Var2, new ktg(otgVar, i4));
            int i8 = i2 & 112;
            boolean i9 = (i8 == 32) | av8Var2.i(otgVar);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (i9 || O == a99Var) {
                tc3Var = H3;
                i3 = 0;
                O = new ltg(function1, otgVar, i3);
                av8Var2.n0(O);
            } else {
                tc3Var = H3;
                i3 = 0;
            }
            Function0 function0 = (Function0) O;
            if (i8 == 32) {
                i3 = 1;
            }
            int i10 = i3 | (av8Var2.i(otgVar) ? 1 : 0);
            Object O2 = av8Var2.O();
            if (i10 != 0 || O2 == a99Var) {
                O2 = new ltg(function1, otgVar, 1);
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            pco.a(i7, x43Var, xtcVar, H, H2, null, tc3Var, null, str, str2, false, z, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, function1, function0, (Function0) O2, av8Var, (i2 & 896) | 1600512, (i2 << 15) & 3670016, 62624);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mtg(otgVar, function1, xtcVar, i, 0);
        }
    }

    public static final void j(xtc xtcVar, tc3 tc3Var, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1854833411);
        int i2 = 2;
        int i3 = (av8Var.g(xtcVar) ? 4 : 2) | i;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = g00.j;
                av8Var.n0(O);
            }
            k1c k1cVar = (k1c) O;
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
            waa.K(av8Var, k1cVar, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            fc6.v(6, tc3Var, av8Var, true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s5h(xtcVar, tc3Var, i, i2);
        }
    }

    public static final void k(int i, of3 of3Var, xtc xtcVar, Function0 function0, Function0 function02) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-327467090);
        int i2 = i | (av8Var.i(function0) ? 4 : 2) | (av8Var.i(function02) ? 32 : 16) | 384;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
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
            xtc u0 = hkg.u0(bkh.d(ljg.g(av8Var, C, f50Var3, 1.0f, false), 1.0f), hkg.o0(av8Var), false, 14);
            u23 a3 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, u0);
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
            uaa.k(54, 0, av8Var, l98.c0(utcVar, 24.0f, 16.0f), false, true);
            String w = oea.w(R.string.percent_off, new Object[]{yid.r(30)}, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(w, l98.c0(n9e.q(yso.o(new we9(uxf.q), 1.0f, lz.D(R.color.on_color_secondary, av8Var), o7g.c(24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, 6)), lz.D(R.color.success, av8Var), o7g.c(24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, 6)), 24.0f, 8.0f), lz.D(R.color.surface_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131064);
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            xtc d0 = l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a4 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d0);
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
            String upperCase = oea.v(R.string.world_cup_special, av8Var).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            udj.c(upperCase, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
            udj.c(oea.v(R.string.sofascore_analyst, av8Var), null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.h(), av8Var, 0, 0, 131066);
            v9g.f(bf3.g(8.0f, R.string.sofascore_analyst_benefit_matchup, av8Var, av8Var, utcVar), l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), lz.D(R.color.on_color_primary, av8Var), lz.D(R.color.on_color_primary, av8Var), av8Var, 48, 0);
            v9g.f(oea.v(R.string.sofascore_analyst_benefit_player_form, av8Var), l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), lz.D(R.color.on_color_primary, av8Var), lz.D(R.color.on_color_primary, av8Var), av8Var, 48, 0);
            v9g.f(oea.v(R.string.sofascore_analyst_benefit_corners, av8Var), l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), lz.D(R.color.on_color_primary, av8Var), lz.D(R.color.on_color_primary, av8Var), av8Var, 48, 0);
            v9g.f(oea.v(R.string.sofascore_analyst_benefit_probabilities, av8Var), l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), lz.D(R.color.on_color_primary, av8Var), lz.D(R.color.on_color_primary, av8Var), av8Var, 48, 0);
            v9g.f(oea.w(R.string.sofascore_analyst_benefit_wc_leagues, new Object[]{250}, av8Var), l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), lz.D(R.color.on_color_primary, av8Var), lz.D(R.color.on_color_primary, av8Var), av8Var, 48, 0);
            av8Var.s(true);
            av8Var.s(true);
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            mha.h(oea.v(R.string.button_view_offer, av8Var), function0, l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lqh.a, null, false, false, false, 0L, 0, 0, av8Var, ((i2 << 3) & 112) | 3456, 0, 2032);
            mha.h(bf3.g(8.0f, R.string.close, av8Var, av8Var, utcVar), function02, l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), hqh.a, null, false, false, false, 0L, 0, 0, av8Var, (i2 & 112) | 3456, 0, 2032);
            av8Var = av8Var;
            w1l.s(utcVar, 16.0f, av8Var, true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x51(function0, function02, xtcVar2, i, 2);
        }
    }

    public static final void l(wil wilVar, boolean z, Function1 function1, of3 of3Var, int i) {
        boolean z2;
        wil wilVar2 = wilVar;
        kv1 kv1Var = uxf.o;
        p4h p4hVar = ww9.d;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-888477493);
        int i2 = i | (av8Var.g(wilVar2) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (!av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            z2 = z;
            av8Var.W();
        } else if (wilVar2.equals(uil.a)) {
            av8Var.d0(1250674332);
            a(function1, av8Var, (i2 >> 6) & 14);
            av8Var.s(false);
            z2 = z;
        } else {
            boolean z3 = wilVar2 instanceof vil;
            utc utcVar = utc.a;
            a99 a99Var = nf3.a;
            if (z3) {
                av8Var.d0(1250819040);
                xtc q = n9e.q(wnn.A(bkh.d(utcVar, 1.0f), o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f));
                u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 0);
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
                vil vilVar = (vil) wilVar2;
                wci wciVar = vilVar.a;
                int i3 = i2 & 896;
                boolean z4 = i3 == 256;
                Object O = av8Var.O();
                int i4 = i3;
                int i5 = 15;
                if (z4 || O == a99Var) {
                    O = new fuj(i5, function1);
                    av8Var.n0(O);
                }
                c(wciVar, z, (Function1) O, av8Var, i2 & 112);
                u23 a3 = t23.a(p4hVar, kv1Var, av8Var, 0);
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
                av8Var.d0(1220875545);
                int i6 = 0;
                for (Object obj : vilVar.b) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        kotlin.collections.b.q();
                        throw null;
                    }
                    unj unjVar = ((vnj) obj).a;
                    Integer valueOf2 = Integer.valueOf(i7);
                    int i8 = i4;
                    boolean z5 = i8 == 256;
                    Object O2 = av8Var.O();
                    if (z5 || O2 == a99Var) {
                        O2 = new o34(15, function1);
                        av8Var.n0(O2);
                    }
                    sha.m(unjVar, null, Sports.FOOTBALL, null, valueOf2, 16.0f, (Function2) O2, av8Var, 1573296, 24);
                    i4 = i8;
                    i6 = i7;
                    a99Var = a99Var;
                }
                i.p(av8Var, false, true, true, false);
                wilVar2 = wilVar;
                z2 = z;
            } else {
                if (!(wilVar2 instanceof til)) {
                    throw dmi.h(av8Var, 871628373, false);
                }
                av8Var.d0(1252026769);
                xtc q2 = n9e.q(wnn.A(bkh.d(utcVar, 1.0f), o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f));
                u23 a4 = t23.a(p4hVar, kv1Var, av8Var, 0);
                int hashCode3 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C3 = fqj.C(av8Var, q2);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a4, hf3.g);
                waa.K(av8Var, m3, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode3), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C3, hf3.d);
                til tilVar = (til) wilVar2;
                wci wciVar2 = tilVar.a;
                boolean z6 = (i2 & 896) == 256;
                Object O3 = av8Var.O();
                if (z6 || O3 == a99Var) {
                    O3 = new fuj(13, function1);
                    av8Var.n0(O3);
                }
                z2 = z;
                c(wciVar2, z2, (Function1) O3, av8Var, i2 & 112);
                av8Var.d0(-925265491);
                int i9 = 0;
                for (Object obj2 : tilVar.b) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        kotlin.collections.b.q();
                        throw null;
                    }
                    b((qel) obj2, null, Integer.valueOf(i10), 16.0f, function1, av8Var, (57344 & (i2 << 6)) | 3072);
                    i9 = i10;
                }
                ljg.t(av8Var, false, true, false);
            }
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cfl(wilVar2, z2, function1, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m(final int i, xtc xtcVar, final t3e t3eVar, final float f2, a6e a6eVar, final tc3 tc3Var, of3 of3Var, final int i2, final int i3) {
        final a6e a6eVar2;
        int i4;
        int i5;
        final xtc xtcVar2;
        eqf u;
        int i6;
        xtc xtcVar3;
        a6e b2;
        int i7;
        Object O;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1996520636);
        int i8 = i2 | (av8Var.e(i) ? 4 : 2);
        int i9 = i3 & 2;
        if (i9 != 0) {
            i8 |= 48;
        } else if ((i2 & 48) == 0) {
            i8 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if ((i3 & 16) == 0) {
            a6eVar2 = a6eVar;
            if (av8Var.g(a6eVar2)) {
                i4 = 16384;
                i5 = i8 | i4;
                int i10 = 1;
                if (av8Var.T(i5 & 1, (74899 & i5) == 74898)) {
                    av8Var.W();
                    xtcVar2 = xtcVar;
                } else {
                    av8Var.Y();
                    int i11 = i2 & 1;
                    a99 a99Var = nf3.a;
                    if (i11 == 0 || av8Var.B()) {
                        xtc xtcVar4 = i9 != 0 ? utc.a : xtcVar;
                        if ((i3 & 16) != 0) {
                            boolean z = (i5 & 14) == 4;
                            Object O2 = av8Var.O();
                            Object obj = O2;
                            if (z || O2 == a99Var) {
                                rpa rpaVar = new rpa(i, i10);
                                av8Var.n0(rpaVar);
                                obj = rpaVar;
                            }
                            b2 = c6e.b(0, (Function0) obj, av8Var, 0, 3);
                            i6 = i5 & (-57345);
                            xtcVar3 = xtcVar4;
                            av8Var.t();
                            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
                            int i12 = ((i6 & 14) != 4 ? 1 : 0) | (av8Var.g(kx4Var) ? 1 : 0);
                            if ((((57344 & i6) ^ 24576) > 16384 || !av8Var.g(b2)) && (i6 & 24576) != 16384) {
                                i10 = 0;
                            }
                            i7 = i12 | i10;
                            O = av8Var.O();
                            if (i7 == 0 || O == a99Var) {
                                dak dakVar = new dak(i, tc3Var, kx4Var, b2, t3eVar, f2);
                                av8Var.n0(dakVar);
                                O = dakVar;
                            }
                            rz8.r(xtcVar3, (Function2) O, av8Var, (i6 >> 3) & 14, 0);
                            a6eVar2 = b2;
                            xtcVar2 = xtcVar3;
                        } else {
                            i6 = i5;
                            xtcVar3 = xtcVar4;
                        }
                    } else {
                        av8Var.W();
                        if ((i3 & 16) != 0) {
                            i5 &= -57345;
                        }
                        xtcVar3 = xtcVar;
                        i6 = i5;
                    }
                    b2 = a6eVar2;
                    av8Var.t();
                    kx4 kx4Var2 = (kx4) av8Var.k(dh3.h);
                    int i122 = ((i6 & 14) != 4 ? 1 : 0) | (av8Var.g(kx4Var2) ? 1 : 0);
                    if (((57344 & i6) ^ 24576) > 16384) {
                    }
                    i10 = 0;
                    i7 = i122 | i10;
                    O = av8Var.O();
                    if (i7 == 0) {
                    }
                    dak dakVar2 = new dak(i, tc3Var, kx4Var2, b2, t3eVar, f2);
                    av8Var.n0(dakVar2);
                    O = dakVar2;
                    rz8.r(xtcVar3, (Function2) O, av8Var, (i6 >> 3) & 14, 0);
                    a6eVar2 = b2;
                    xtcVar2 = xtcVar3;
                }
                u = av8Var.u();
                if (u == null) {
                    u.d = new Function2() { // from class: eak
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            d7a.m(i, xtcVar2, t3eVar, f2, a6eVar2, tc3Var, (of3) obj2, aba.K(i2 | 1), i3);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            a6eVar2 = a6eVar;
        }
        i4 = 8192;
        i5 = i8 | i4;
        int i102 = 1;
        if (av8Var.T(i5 & 1, (74899 & i5) == 74898)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void n(yil yilVar, Function1 function1, boolean z, xtc xtcVar, of3 of3Var, int i) {
        yilVar.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(931665708);
        int i2 = i | (av8Var.g(yilVar) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(xtcVar) ? a.o : 1024);
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            xtc f0 = l98.f0(bkh.d(xtcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            u23 a2 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.o, av8Var, 6);
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
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a3 = k8g.a(ww9.h, uxf.m, av8Var, 54);
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
            String v = oea.v(R.string.leaders, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, 0, 0, 131066);
            String v2 = oea.v(R.string.see_more, av8Var);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z2 || O == a99Var) {
                O = new b4j(19, function1);
                av8Var.n0(O);
            }
            tz9.s(0, 4, av8Var, null, v2, (Function0) O);
            av8Var.s(true);
            xtc O2 = kda.O(bkh.d(utcVar, 1.0f), "wc26_stats_leaders_chip", av8Var);
            gv9 gv9Var = yilVar.a;
            xil xilVar = yilVar.c;
            jrh jrhVar = jrh.m;
            boolean z3 = i3 == 32;
            Object O3 = av8Var.O();
            if (z3 || O3 == a99Var) {
                O3 = new fuj(14, function1);
                av8Var.n0(O3);
            }
            trh.a(gv9Var, xilVar, (Function1) O3, O2, null, null, jrhVar, false, false, false, null, null, av8Var, 1572864, 4016);
            av8Var = av8Var;
            gv9 gv9Var2 = yilVar.b;
            Object O4 = av8Var.O();
            if (O4 == a99Var) {
                O4 = new pcl(12);
                av8Var.n0(O4);
            }
            Function1 function12 = (Function1) O4;
            Object O5 = av8Var.O();
            if (O5 == a99Var) {
                O5 = new pcl(13);
                av8Var.n0(O5);
            }
            l98.b(gv9Var2, null, function12, null, null, (Function1) O5, yqo.H(-645954947, av8Var, new r73(yilVar, z, function1)), av8Var, 1769856, 26);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p81(yilVar, function1, z, xtcVar, i, 27);
        }
    }

    public static final void o(InsetsRemoteDto insetsRemoteDto, BlazeInsets blazeInsets) {
        blazeInsets.getClass();
        Integer start = insetsRemoteDto.getStart();
        blazeInsets.setStart(start != null ? new BlazeDp(start.intValue()) : blazeInsets.getStart());
        Integer top = insetsRemoteDto.getTop();
        blazeInsets.setTop(top != null ? new BlazeDp(top.intValue()) : blazeInsets.getTop());
        Integer end = insetsRemoteDto.getEnd();
        blazeInsets.setEnd(end != null ? new BlazeDp(end.intValue()) : blazeInsets.getEnd());
        Integer bottom = insetsRemoteDto.getBottom();
        blazeInsets.setBottom(bottom != null ? new BlazeDp(bottom.intValue()) : blazeInsets.getBottom());
    }

    public static final void p(tzc tzcVar, int i) {
        if (tzcVar.b == 0 || !(tzcVar.c(0) == i || tzcVar.c(tzcVar.b - 1) == i)) {
            int i2 = tzcVar.b;
            tzcVar.a(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int c2 = tzcVar.c(i3);
                if (i <= c2) {
                    break;
                }
                tzcVar.f(i2, c2);
                i2 = i3;
            }
            tzcVar.f(i2, i);
        }
    }

    public static float q(float[] fArr) {
        if (fArr.length < 6) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = (((((f4 * f7) + ((f3 * f6) + (f2 * f5))) - (f5 * f6)) - (f3 * f4)) - (f2 * f7)) * 0.5f;
        return f8 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? -f8 : f8;
    }

    public static final String r(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static final void s(Context context) {
        Object systemService = context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        systemService.getClass();
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) WeeklyAlarmReceiver.class), 33554432);
        broadcast.getClass();
        ((AlarmManager) systemService).cancel(broadcast);
    }

    public static void t(Object obj, String str, String str2) {
        if (Log.isLoggable("TRuntime.".concat(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static final void u(BufferedReader bufferedReader, Function1 function1) {
        try {
            Iterator it = new ml3(new oh0(bufferedReader, 2)).iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
            Unit unit = Unit.a;
            bufferedReader.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                n4o.x(bufferedReader, th);
                throw th2;
            }
        }
    }

    public static final ArrayList v(l9a l9aVar) {
        l9aVar.getClass();
        wma y0 = ((tkb) l9aVar).y0();
        boolean B = B(y0);
        j0d j0dVar = (j0d) y0.p();
        i1d i1dVar = (i1d) j0dVar.b;
        ArrayList arrayList = new ArrayList(i1dVar.c);
        int i = i1dVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            wma wmaVar = (wma) j0dVar.get(i2);
            arrayList.add(B ? wmaVar.m() : wmaVar.n());
        }
        return arrayList;
    }

    public static Intent w(Context context, ComponentName componentName) {
        String y = y(context, componentName);
        if (y == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), y);
        return y(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static Intent x(AppCompatActivity appCompatActivity) {
        Intent parentActivityIntent = appCompatActivity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String y = y(appCompatActivity, appCompatActivity.getComponentName());
            if (y != null) {
                ComponentName componentName = new ComponentName(appCompatActivity, y);
                try {
                    return y(appCompatActivity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            ilg.k(e2);
            return null;
        }
    }

    public static String y(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final cai z(Context context, String str) {
        context.getClass();
        return (cai) n9e.x(context, new jp1(str, 29));
    }
}
