package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.NotificationCompat;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4094gc;
import com.ironsource.V2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Sports;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.fantasy.FantasyRoundTransfers;
import com.sofascore.model.fantasy.FantasyTransfer;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.transfers.model.FantasyTransferPlayer;
import com.sofascore.results.fantasy.transfers.model.FantasyTransferPlayers;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.LockSupport;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class td4 {
    public static final tc3 a = new tc3(-753710574, new ed3(3), false);
    public static final tc3 b = new tc3(435680491, new qs2(8), false);
    public static final tc3 c = new tc3(-639834880, new qd3(22), false);
    public static final tc3 d = new tc3(-1467755753, new qd3(23), false);
    public static final nl8 e = new nl8(28);
    public static final Object f = new Object();
    public static final Object g = new Object();
    public static boolean h;
    public static long i;
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;

    public static final void A(int i2, int i3, of3 of3Var, xtc xtcVar) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1037315823);
        int i4 = (av8Var.e(i2) ? 4 : 2) | i3;
        int i5 = 12;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            haa.b(vxd.j(i2, (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "news-provider/", "/logo"), "", xtcVar, wv8.c(lz.D(R.color.neutral_default, av8Var), 5, haa.t(R.drawable.ic_sofascore_logomark, 0, av8Var), 12), wv8.c(lz.D(R.color.neutral_default, av8Var), 5, haa.t(R.drawable.ic_sofascore_logomark, 0, av8Var), 12), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 37296, 0, 32736);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xz(i2, xtcVar, i3, i5);
        }
    }

    public static final xtc A0(xtc xtcVar, w8l w8lVar) {
        return xtcVar.z(new a5a(w8lVar));
    }

    public static final void B(osa osaVar, of3 of3Var, int i2) {
        av8 av8Var;
        int i3;
        osaVar.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1207381173);
        int i4 = (av8Var2.i(osaVar) ? 4 : 2) | i2;
        if (av8Var2.T(i4 & 1, (i4 & 3) != 2)) {
            Context context = (Context) av8Var2.k(nz.b);
            Object O = av8Var2.O();
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
                O = e.f(Boolean.valueOf(sharedPreferences.getBoolean("POTSMostAwardsShowDisclaimer", true)));
                av8Var2.n0(O);
            }
            e1d e1dVar = (e1d) O;
            int i5 = i4 & 14;
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = e.f(null);
                av8Var2.n0(O2);
            }
            e1d e1dVar2 = (e1d) O2;
            xba xbaVar = (xba) ((eoh) osaVar.d).getValue();
            if (e1dVar2.getValue() == null && xbaVar.size() >= 4) {
                IntRange intRange = new IntRange(0, 3, 1);
                ArrayList arrayList = new ArrayList();
                v6a it = intRange.iterator();
                while (it.c) {
                    d2e d2eVar = (d2e) xbaVar.get(it.nextInt());
                    if (d2eVar != null) {
                        arrayList.add(d2eVar);
                    }
                }
                if (arrayList.size() == 4) {
                    ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Integer.valueOf(((d2e) it2.next()).d));
                    }
                    e1dVar2.setValue(Boolean.valueOf(CollectionsKt.S0(CollectionsKt.V0(arrayList2)).size() == 4));
                }
            }
            xtc J = lz.J(bkh.c, jaa.L(av8Var2), null);
            t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 72.0f, 7);
            boolean i6 = av8Var2.i(context) | av8Var2.g(e1dVar2) | (i5 == 4 || av8Var2.i(osaVar));
            Object O3 = av8Var2.O();
            if (i6 || O3 == nf3.a) {
                lwc lwcVar = new lwc(osaVar, e1dVar, context, e1dVar2, 4);
                av8Var2.n0(lwcVar);
                O3 = lwcVar;
            }
            av8Var = av8Var2;
            i3 = 7;
            v8a.a(J, null, C, null, null, null, false, null, (Function1) O3, av8Var, 100663680, 250);
        } else {
            av8Var = av8Var2;
            i3 = 7;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t1d(osaVar, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object B0(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, rq3 rq3Var) {
        tn2 tn2Var;
        int i2;
        Object c2;
        Object invoke;
        if (rq3Var instanceof tn2) {
            tn2Var = (tn2) rq3Var;
            int i3 = tn2Var.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tn2Var.w = i3 - Integer.MIN_VALUE;
                Object obj3 = tn2Var.v;
                Object obj4 = lu3.a;
                i2 = tn2Var.w;
                if (i2 != 0) {
                    y6a.M(obj3);
                    c2 = yfj.c(coroutineContext, obj2);
                    try {
                        tn2Var.r = coroutineContext;
                        tn2Var.s = obj;
                        tn2Var.t = coroutineContext;
                        tn2Var.u = c2;
                        tn2Var.w = 1;
                        w0i w0iVar = new w0i(tn2Var, coroutineContext);
                        if (function2 == null) {
                            invoke = z9a.c(function2, obj, w0iVar);
                        } else {
                            i5k.e(2, function2);
                            invoke = function2.invoke(obj, w0iVar);
                        }
                        obj3 = invoke;
                        if (obj3 == obj4) {
                            return obj4;
                        }
                    } catch (Throwable th) {
                        th = th;
                        yfj.a(coroutineContext, c2);
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj5 = tn2Var.u;
                    CoroutineContext coroutineContext2 = tn2Var.t;
                    try {
                        y6a.M(obj3);
                        c2 = obj5;
                        coroutineContext = coroutineContext2;
                    } catch (Throwable th2) {
                        c2 = obj5;
                        coroutineContext = coroutineContext2;
                        th = th2;
                        yfj.a(coroutineContext, c2);
                        throw th;
                    }
                }
                yfj.a(coroutineContext, c2);
                return obj3;
            }
        }
        tn2Var = new tn2(rq3Var);
        Object obj32 = tn2Var.v;
        Object obj42 = lu3.a;
        i2 = tn2Var.w;
        if (i2 != 0) {
        }
        yfj.a(coroutineContext, c2);
        return obj32;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void C(final int i2, final xtc xtcVar, long j2, float f2, of3 of3Var, final int i3, final int i4) {
        int i5;
        long j3;
        float f3;
        av8 av8Var;
        final float f4;
        eqf u;
        float f5;
        int i6;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(576561145);
        if ((i3 & 6) == 0) {
            i5 = (av8Var2.e(i2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= av8Var2.g(xtcVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            if ((i4 & 4) == 0) {
                j3 = j2;
                if (av8Var2.f(j3)) {
                    i6 = NotificationCompat.FLAG_LOCAL_ONLY;
                    i5 |= i6;
                }
            } else {
                j3 = j2;
            }
            i6 = 128;
            i5 |= i6;
        } else {
            j3 = j2;
        }
        int i7 = i4 & 8;
        if (i7 != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            f3 = f2;
            i5 |= av8Var2.d(f3) ? a.o : 1024;
            if (av8Var2.T(i5 & 1, (i5 & 1171) == 1170)) {
                av8Var = av8Var2;
                av8Var.W();
                f4 = f3;
            } else {
                av8Var2.Y();
                if ((i3 & 1) == 0 || av8Var2.B()) {
                    if ((i4 & 4) != 0) {
                        j3 = lz.D(R.color.n_lv_4, av8Var2);
                        i5 &= -897;
                    }
                    if (i7 != 0) {
                        f5 = 1.0f;
                        av8Var2.t();
                        String M = (!((Boolean) ((eoh) as9.b).getValue()).booleanValue() && i2 == 12994 && as9.a) ? "https://userimage.sofascore.com/ca464615b00248daf4f30df1cb2caddc.jpg" : pco.M(i2);
                        d7e t = haa.t(R.drawable.player_photo_placeholder, 0, av8Var2);
                        d7e t2 = haa.t(R.drawable.player_photo_placeholder, 0, av8Var2);
                        n7g n7gVar = o7g.a;
                        av8Var = av8Var2;
                        haa.b(M, "", yso.o(wnn.A(xtcVar, n7gVar), 1.0f, j3, n7gVar), t2, t, null, null, f5, av8Var, 36912, (i5 >> 6) & 112, 30688);
                        f4 = f5;
                    }
                } else {
                    av8Var2.W();
                    if ((i4 & 4) != 0) {
                        i5 &= -897;
                    }
                }
                f5 = f3;
                av8Var2.t();
                String M2 = (!((Boolean) ((eoh) as9.b).getValue()).booleanValue() && i2 == 12994 && as9.a) ? "https://userimage.sofascore.com/ca464615b00248daf4f30df1cb2caddc.jpg" : pco.M(i2);
                d7e t3 = haa.t(R.drawable.player_photo_placeholder, 0, av8Var2);
                d7e t22 = haa.t(R.drawable.player_photo_placeholder, 0, av8Var2);
                n7g n7gVar2 = o7g.a;
                av8Var = av8Var2;
                haa.b(M2, "", yso.o(wnn.A(xtcVar, n7gVar2), 1.0f, j3, n7gVar2), t22, t3, null, null, f5, av8Var, 36912, (i5 >> 6) & 112, 30688);
                f4 = f5;
            }
            final long j4 = j3;
            u = av8Var.u();
            if (u == null) {
                u.d = new Function2() { // from class: es9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        td4.C(i2, xtcVar, j4, f4, (of3) obj, aba.K(i3 | 1), i4);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        f3 = f2;
        if (av8Var2.T(i5 & 1, (i5 & 1171) == 1170)) {
        }
        final long j42 = j3;
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void D(int i2, int i3, of3 of3Var, xtc xtcVar) {
        int i4;
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(34931094);
        if ((i3 & 6) == 0) {
            i4 = (av8Var.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            xtcVar2 = xtcVar;
            haa.b(vxd.j(i2, (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "player/", "/image/enhanced"), "", xtcVar2, haa.t(R.drawable.player_photo_placeholder_no_bg, 0, av8Var), haa.t(R.drawable.player_photo_placeholder_no_bg, 0, av8Var), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, ((i4 << 3) & 896) | 36912, 0, 32736);
        } else {
            xtcVar2 = xtcVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hn1(i2, xtcVar2, i3, 6);
        }
    }

    public static final void E(d2e d2eVar, Function0 function0, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1360079102);
        int i3 = i2 | (av8Var.g(d2eVar) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc F = u0a.F(bkh.d(utcVar, 1.0f), icb.d, 4.0f, av8Var, 54);
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
                O2 = jxa.y;
                av8Var.n0(O2);
            }
            xtc c0 = l98.c0(tol.y(F, true, true, true, D, wzcVar, new p28(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), 20), av8Var, 0), 16.0f, 8.0f);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
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
            C(d2eVar.a, bkh.l(utcVar, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 48, 12);
            goa d2 = bf3.d(utcVar, 16.0f, av8Var, 1.0f, true);
            String str = d2eVar.b;
            yf8 yf8Var = xth.a;
            udj.c(str, d2, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110584);
            nq8.h(av8Var, bkh.p(utcVar, 16.0f));
            q5a.w(String.valueOf(d2eVar.d), null, lz.D(R.color.n_lv_1, av8Var), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.i(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            kq9.b(s6a.N(R.drawable.ic_pots_trophy, 6, av8Var), null, ljg.i(utcVar, 4.0f, av8Var, utcVar, 16.0f), lz.D(R.color.rating_90, av8Var), av8Var, 432, 0);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new op9(d2eVar, function0, i2, 25);
        }
    }

    public static final void F(int i2, String str, Integer num, xtc xtcVar, long j2, of3 of3Var, int i3) {
        long j3;
        long D;
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(11018580);
        int i5 = i3 | (av8Var.e(i2) ? 4 : 2) | (av8Var.g(str) ? 32 : 16) | (av8Var.g(num) ? 256 : 128) | 8192;
        if (av8Var.T(i5 & 1, (i5 & 9363) != 9362)) {
            av8Var.Y();
            if ((i3 & 1) == 0 || av8Var.B()) {
                D = lz.D(R.color.n_lv_3, av8Var);
                i4 = i5 & (-57345);
            } else {
                av8Var.W();
                i4 = i5 & (-57345);
                D = j2;
            }
            av8Var.t();
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(null);
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            gn8 c2 = wv8.c(D, 5, haa.t(R.drawable.sofascore_lockup, 0, av8Var), 12);
            gn8 c3 = wv8.c(D, 5, haa.t(R.drawable.sofascore_lockup, 0, av8Var), 12);
            String str2 = (String) e1dVar.getValue();
            if (str2 == null) {
                av8Var.d0(1998939943);
                str2 = pco.Q(i2, hkg.b0((Context) av8Var.k(nz.b)));
            } else {
                av8Var.d0(1998938920);
            }
            av8Var.s(false);
            boolean z = ((i4 & 112) == 32) | ((i4 & 896) == 256);
            Object O2 = av8Var.O();
            if (z || O2 == a99Var) {
                O2 = new dr6(17, str, num, e1dVar);
                av8Var.n0(O2);
            }
            haa.b(str2, "", xtcVar, c3, c2, (Function1) O2, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 37296, 6, 31456);
            j3 = D;
        } else {
            av8Var.W();
            j3 = j2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new dv6(i2, str, num, xtcVar, j3, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void G(final int i2, final xtc xtcVar, boolean z, long j2, of3 of3Var, final int i3, final int i4) {
        int i5;
        final boolean z2;
        final long j3;
        eqf u;
        Object a2;
        int i6;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1606322377);
        if ((i3 & 6) == 0) {
            i5 = (av8Var.e(i2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        int i7 = i4 & 4;
        if (i7 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            z2 = z;
            i5 |= av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            if ((i3 & 3072) != 0) {
                if ((i4 & 8) == 0) {
                    j3 = j2;
                    if (av8Var.f(j3)) {
                        i6 = a.o;
                        i5 |= i6;
                    }
                } else {
                    j3 = j2;
                }
                i6 = 1024;
                i5 |= i6;
            } else {
                j3 = j2;
            }
            if (av8Var.T(i5 & 1, (i5 & 1171) == 1170)) {
                av8Var.W();
            } else {
                av8Var.Y();
                if ((i3 & 1) == 0 || av8Var.B()) {
                    boolean z3 = i7 == 0 ? z2 : true;
                    if ((i4 & 8) != 0) {
                        i5 &= -7169;
                        j3 = lz.D(R.color.neutral_default, av8Var);
                    }
                    z2 = z3;
                } else {
                    av8Var.W();
                    if ((i4 & 8) != 0) {
                        i5 &= -7169;
                    }
                }
                av8Var.t();
                Context context = (Context) av8Var.k(nz.b);
                gn8 c2 = wv8.c(j3, 5, haa.t(R.drawable.team_logo_placeholder, 0, av8Var), 12);
                gn8 c3 = wv8.c(j3, 5, haa.t(R.drawable.team_logo_placeholder, 0, av8Var), 12);
                if (z2) {
                    a2 = pco.R(i2);
                } else {
                    ht9 ht9Var = new ht9(context);
                    ht9Var.c = pco.R(i2);
                    st9.a(ht9Var, false);
                    a2 = ht9Var.a();
                }
                haa.b(a2, "", xtcVar, c3, c2, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, ((i5 << 3) & 896) | 36912, 0, 32736);
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new Function2() { // from class: hs9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        td4.G(i2, xtcVar, z2, j3, (of3) obj, aba.K(i3 | 1), i4);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        z2 = z;
        if ((i3 & 3072) != 0) {
        }
        if (av8Var.T(i5 & 1, (i5 & 1171) == 1170)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void H(final int i2, final String str, xtc xtcVar, boolean z, String str2, String str3, Integer num, Integer num2, String str4, String str5, boolean z2, boolean z3, final float f2, boolean z4, of3 of3Var, final int i3, final int i4, final int i5) {
        int i6;
        xtc xtcVar2;
        int i7;
        boolean z5;
        int i8;
        String str6;
        int i9;
        String str7;
        int i10;
        Integer num3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        final Integer num4;
        av8 av8Var;
        final boolean z6;
        final String str8;
        final String str9;
        final Integer num5;
        final xtc xtcVar3;
        final String str10;
        final String str11;
        final boolean z7;
        final boolean z8;
        final boolean z9;
        eqf u;
        Integer num6;
        boolean z10;
        String str12;
        boolean z11;
        boolean z12;
        mv1 mv1Var = uxf.k;
        mv1 mv1Var2 = uxf.i;
        str.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(2128830218);
        if ((i3 & 6) == 0) {
            i6 = (av8Var2.e(i2) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= av8Var2.g(str) ? 32 : 16;
        }
        int i22 = i5 & 4;
        if (i22 != 0) {
            i6 |= 384;
        } else if ((i3 & 384) == 0) {
            xtcVar2 = xtcVar;
            i6 |= av8Var2.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i3 & 3072) == 0) {
                z5 = z;
                i6 |= av8Var2.h(z5) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    str6 = str2;
                    i6 |= av8Var2.g(str6) ? 16384 : 8192;
                    i9 = i5 & 32;
                    if (i9 == 0) {
                        i6 |= 196608;
                        str7 = str3;
                    } else {
                        str7 = str3;
                        if ((i3 & 196608) == 0) {
                            i6 |= av8Var2.g(str7) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        }
                    }
                    i10 = i5 & 64;
                    if (i10 == 0) {
                        i6 |= 1572864;
                        num3 = num;
                    } else {
                        num3 = num;
                        if ((i3 & 1572864) == 0) {
                            i6 |= av8Var2.g(num3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                        }
                    }
                    i11 = i6;
                    i12 = i5 & 128;
                    if (i12 == 0) {
                        i11 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        i13 = i12;
                        i11 |= av8Var2.g(num2) ? 8388608 : 4194304;
                        i14 = i5 & NotificationCompat.FLAG_LOCAL_ONLY;
                        if (i14 != 0) {
                            i11 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            i15 = i14;
                            i11 |= av8Var2.g(str4) ? 67108864 : 33554432;
                            i16 = i5 & 512;
                            if (i16 == 0) {
                                i11 |= 805306368;
                            } else if ((i3 & 805306368) == 0) {
                                i17 = i16;
                                i11 |= av8Var2.g(str5) ? 536870912 : 268435456;
                                int i23 = i4 | 6;
                                i18 = i5 & a.o;
                                if (i18 != 0) {
                                    i23 = i4 | 54;
                                } else if ((i4 & 48) == 0) {
                                    i19 = i18;
                                    i23 |= av8Var2.h(z3) ? 32 : 16;
                                    if ((i4 & 384) == 0) {
                                        i23 |= av8Var2.d(f2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                                    }
                                    i20 = i23;
                                    i21 = i5 & 8192;
                                    if (i21 == 0) {
                                        i20 |= 3072;
                                    } else if ((i4 & 3072) == 0) {
                                        i20 |= av8Var2.h(z4) ? 2048 : 1024;
                                        if (av8Var2.T(i11 & 1, (i11 & 306783379) == 306783378 || (i20 & 1171) != 1170)) {
                                            utc utcVar = utc.a;
                                            if (i22 != 0) {
                                                xtcVar2 = utcVar;
                                            }
                                            if (i7 != 0) {
                                                z5 = false;
                                            }
                                            if (i8 != 0) {
                                                str6 = null;
                                            }
                                            if (i9 != 0) {
                                                str7 = null;
                                            }
                                            if (i10 != 0) {
                                                num3 = null;
                                            }
                                            Integer num7 = i13 != 0 ? null : num2;
                                            String str13 = i15 != 0 ? null : str4;
                                            String str14 = i17 == 0 ? str5 : null;
                                            boolean z13 = i19 != 0 ? false : z3;
                                            boolean z14 = i21 != 0 ? false : z4;
                                            boolean z15 = (z5 || str6 == null || str6.length() == 0) ? false : true;
                                            if (str.equals(Sports.TENNIS)) {
                                                av8Var2.d0(494600901);
                                                k1c c2 = e12.c(uxf.c, false);
                                                String str15 = str14;
                                                int hashCode = Long.hashCode(av8Var2.T);
                                                aee m = av8Var2.m();
                                                xtc C = fqj.C(av8Var2, xtcVar2);
                                                if3.k7.getClass();
                                                num6 = num7;
                                                zg3 zg3Var = hf3.b;
                                                av8Var2.h0();
                                                z10 = z5;
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
                                                n12 n12Var = n12.a;
                                                if (!z13) {
                                                    av8Var2.d0(1697400952);
                                                    J(i2, i11 & 14, av8Var2, bkh.l(utcVar, f2));
                                                    if (z15) {
                                                        av8Var2.d0(1697515962);
                                                        k(str6, bkh.l(n12Var.a(utcVar, mv1Var2), 16.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var2, (i11 >> 12) & 14, 12);
                                                        z12 = false;
                                                        av8Var2.s(false);
                                                    } else {
                                                        z12 = false;
                                                        av8Var2.d0(1697792730);
                                                        av8Var2.s(false);
                                                    }
                                                    if (str7 != null) {
                                                        av8Var2.d0(1697860992);
                                                        K(((i11 >> 15) & 14) | 48, av8Var2, n12Var.a(utcVar, mv1Var), str7, z12);
                                                        av8Var2.s(z12);
                                                    } else {
                                                        av8Var2.d0(1697969306);
                                                        av8Var2.s(z12);
                                                    }
                                                    av8Var2.s(z12);
                                                    str14 = str15;
                                                    str12 = str13;
                                                } else if (num3 == null || num6 == null) {
                                                    str14 = str15;
                                                    str12 = str13;
                                                    z12 = false;
                                                    av8Var2.d0(1699490042);
                                                    av8Var2.s(false);
                                                } else {
                                                    av8Var2.d0(1698084099);
                                                    J(num6.intValue(), (i11 >> 21) & 14, av8Var2, bkh.l(l98.f0(utcVar, !z14 ? 32.0f : 14.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), f2));
                                                    J(num3.intValue(), (i11 >> 18) & 14, av8Var2, bkh.l(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), f2));
                                                    if (str13 == null || str13.length() == 0) {
                                                        str12 = str13;
                                                        av8Var2.d0(1698927578);
                                                        av8Var2.s(false);
                                                    } else {
                                                        av8Var2.d0(1698646005);
                                                        String str16 = str13;
                                                        k(str16, bkh.l(n12Var.a(utcVar, mv1Var2), 16.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var2, (i11 >> 24) & 14, 12);
                                                        str12 = str16;
                                                        av8Var2.s(false);
                                                    }
                                                    if (str7 != null) {
                                                        av8Var2.d0(1698995902);
                                                        K(((i11 >> 15) & 14) | 48, av8Var2, n12Var.a(utcVar, uxf.j), str7, true);
                                                        av8Var2.s(false);
                                                    } else {
                                                        av8Var2.d0(1699106138);
                                                        av8Var2.s(false);
                                                    }
                                                    if (str15 == null || str15.length() == 0) {
                                                        str14 = str15;
                                                        z12 = false;
                                                        av8Var2.d0(1699472186);
                                                        av8Var2.s(false);
                                                    } else {
                                                        av8Var2.d0(1699193496);
                                                        k(str15, bkh.l(n12Var.a(utcVar, mv1Var), 16.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var2, (i11 >> 27) & 14, 12);
                                                        str14 = str15;
                                                        z12 = false;
                                                        av8Var2.s(false);
                                                    }
                                                    av8Var2.s(z12);
                                                }
                                                z11 = true;
                                                av8Var2.s(true);
                                                av8Var2.s(z12);
                                            } else {
                                                num6 = num7;
                                                z10 = z5;
                                                str12 = str13;
                                                z11 = true;
                                                av8Var2.d0(496762965);
                                                G(i2, bkh.l(xtcVar2, f2), false, 0L, av8Var2, i11 & 14, 12);
                                                av8Var2.s(false);
                                            }
                                            boolean z16 = z11;
                                            str10 = str12;
                                            av8Var = av8Var2;
                                            str9 = str7;
                                            z7 = z16;
                                            num4 = num6;
                                            str8 = str6;
                                            num5 = num3;
                                            z8 = z13;
                                            z6 = z10;
                                            str11 = str14;
                                            xtcVar3 = xtcVar2;
                                            z9 = z14;
                                        } else {
                                            av8Var2.W();
                                            num4 = num2;
                                            av8Var = av8Var2;
                                            z6 = z5;
                                            str8 = str6;
                                            str9 = str7;
                                            num5 = num3;
                                            xtcVar3 = xtcVar2;
                                            str10 = str4;
                                            str11 = str5;
                                            z7 = z2;
                                            z8 = z3;
                                            z9 = z4;
                                        }
                                        u = av8Var.u();
                                        if (u != null) {
                                            u.d = new Function2() { // from class: js9
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    ((Integer) obj2).getClass();
                                                    int K = aba.K(i3 | 1);
                                                    int K2 = aba.K(i4);
                                                    td4.H(i2, str, xtcVar3, z6, str8, str9, num5, num4, str10, str11, z7, z8, f2, z9, (of3) obj, K, K2, i5);
                                                    return Unit.a;
                                                }
                                            };
                                            return;
                                        }
                                        return;
                                    }
                                    if (av8Var2.T(i11 & 1, (i11 & 306783379) == 306783378 || (i20 & 1171) != 1170)) {
                                    }
                                    u = av8Var.u();
                                    if (u != null) {
                                    }
                                }
                                i19 = i18;
                                if ((i4 & 384) == 0) {
                                }
                                i20 = i23;
                                i21 = i5 & 8192;
                                if (i21 == 0) {
                                }
                                if (av8Var2.T(i11 & 1, (i11 & 306783379) == 306783378 || (i20 & 1171) != 1170)) {
                                }
                                u = av8Var.u();
                                if (u != null) {
                                }
                            }
                            i17 = i16;
                            int i232 = i4 | 6;
                            i18 = i5 & a.o;
                            if (i18 != 0) {
                            }
                            i19 = i18;
                            if ((i4 & 384) == 0) {
                            }
                            i20 = i232;
                            i21 = i5 & 8192;
                            if (i21 == 0) {
                            }
                            if (av8Var2.T(i11 & 1, (i11 & 306783379) == 306783378 || (i20 & 1171) != 1170)) {
                            }
                            u = av8Var.u();
                            if (u != null) {
                            }
                        }
                        i15 = i14;
                        i16 = i5 & 512;
                        if (i16 == 0) {
                        }
                        i17 = i16;
                        int i2322 = i4 | 6;
                        i18 = i5 & a.o;
                        if (i18 != 0) {
                        }
                        i19 = i18;
                        if ((i4 & 384) == 0) {
                        }
                        i20 = i2322;
                        i21 = i5 & 8192;
                        if (i21 == 0) {
                        }
                        if (av8Var2.T(i11 & 1, (i11 & 306783379) == 306783378 || (i20 & 1171) != 1170)) {
                        }
                        u = av8Var.u();
                        if (u != null) {
                        }
                    }
                    i13 = i12;
                    i14 = i5 & NotificationCompat.FLAG_LOCAL_ONLY;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    i16 = i5 & 512;
                    if (i16 == 0) {
                    }
                    i17 = i16;
                    int i23222 = i4 | 6;
                    i18 = i5 & a.o;
                    if (i18 != 0) {
                    }
                    i19 = i18;
                    if ((i4 & 384) == 0) {
                    }
                    i20 = i23222;
                    i21 = i5 & 8192;
                    if (i21 == 0) {
                    }
                    if (av8Var2.T(i11 & 1, (i11 & 306783379) == 306783378 || (i20 & 1171) != 1170)) {
                    }
                    u = av8Var.u();
                    if (u != null) {
                    }
                }
                str6 = str2;
                i9 = i5 & 32;
                if (i9 == 0) {
                }
                i10 = i5 & 64;
                if (i10 == 0) {
                }
                i11 = i6;
                i12 = i5 & 128;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i5 & NotificationCompat.FLAG_LOCAL_ONLY;
                if (i14 != 0) {
                }
                i15 = i14;
                i16 = i5 & 512;
                if (i16 == 0) {
                }
                i17 = i16;
                int i232222 = i4 | 6;
                i18 = i5 & a.o;
                if (i18 != 0) {
                }
                i19 = i18;
                if ((i4 & 384) == 0) {
                }
                i20 = i232222;
                i21 = i5 & 8192;
                if (i21 == 0) {
                }
                if (av8Var2.T(i11 & 1, (i11 & 306783379) == 306783378 || (i20 & 1171) != 1170)) {
                }
                u = av8Var.u();
                if (u != null) {
                }
            }
            z5 = z;
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            str6 = str2;
            i9 = i5 & 32;
            if (i9 == 0) {
            }
            i10 = i5 & 64;
            if (i10 == 0) {
            }
            i11 = i6;
            i12 = i5 & 128;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i5 & NotificationCompat.FLAG_LOCAL_ONLY;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i5 & 512;
            if (i16 == 0) {
            }
            i17 = i16;
            int i2322222 = i4 | 6;
            i18 = i5 & a.o;
            if (i18 != 0) {
            }
            i19 = i18;
            if ((i4 & 384) == 0) {
            }
            i20 = i2322222;
            i21 = i5 & 8192;
            if (i21 == 0) {
            }
            if (av8Var2.T(i11 & 1, (i11 & 306783379) == 306783378 || (i20 & 1171) != 1170)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        z5 = z;
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        str6 = str2;
        i9 = i5 & 32;
        if (i9 == 0) {
        }
        i10 = i5 & 64;
        if (i10 == 0) {
        }
        i11 = i6;
        i12 = i5 & 128;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i5 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i5 & 512;
        if (i16 == 0) {
        }
        i17 = i16;
        int i23222222 = i4 | 6;
        i18 = i5 & a.o;
        if (i18 != 0) {
        }
        i19 = i18;
        if ((i4 & 384) == 0) {
        }
        i20 = i23222222;
        i21 = i5 & 8192;
        if (i21 == 0) {
        }
        if (av8Var2.T(i11 & 1, (i11 & 306783379) == 306783378 || (i20 & 1171) != 1170)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void I(int i2, int i3, of3 of3Var, xtc xtcVar, boolean z) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1946697988);
        int i4 = (av8Var.e(i2) ? 4 : 2) | i3 | 384;
        boolean z2 = true;
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            haa.b(vxd.j(i2, (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "team/", "/image/enhanced"), "", xtcVar, wv8.c(lz.D(R.color.neutral_default, av8Var), 5, haa.t(R.drawable.team_logo_placeholder, 0, av8Var), 12), wv8.c(lz.D(R.color.neutral_default, av8Var), 5, haa.t(R.drawable.team_logo_placeholder, 0, av8Var), 12), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 37296, 0, 32736);
        } else {
            av8Var.W();
            z2 = z;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gs5(i2, xtcVar, z2, i3);
        }
    }

    public static final void J(int i2, int i3, of3 of3Var, xtc xtcVar) {
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1729770019);
        int i5 = 4;
        if ((i3 & 6) == 0) {
            i4 = (av8Var.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            d7e t = haa.t(R.drawable.player_photo_placeholder, 0, av8Var);
            d7e t2 = haa.t(R.drawable.player_photo_placeholder, 0, av8Var);
            String R = pco.R(i2);
            n7g n7gVar = o7g.a;
            haa.b(R, "", yso.o(wnn.A(xtcVar, n7gVar), 1.0f, lz.D(R.color.n_lv_4, av8Var), n7gVar), t2, t, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 36912, 0, 32736);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hn1(i2, xtcVar, i3, i5);
        }
    }

    public static final void K(int i2, of3 of3Var, xtc xtcVar, String str, boolean z) {
        String str2;
        int i3;
        av8 av8Var;
        String v;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1827156824);
        if ((i2 & 6) == 0) {
            str2 = str;
            i3 = (av8Var2.g(str2) ? 4 : 2) | i2;
        } else {
            str2 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            Integer r = uaa.r(str2);
            xtc d0 = l98.d0(n9e.q(xtcVar, lz.D(uaa.p(str2), av8Var2), o7g.a(8.0f)), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            if (r == null) {
                av8Var2.d0(1586976223);
                av8Var2.s(false);
                v = null;
            } else {
                av8Var2.d0(1586976224);
                v = oea.v(r.intValue(), av8Var2);
                av8Var2.s(false);
            }
            if (v == null) {
                v = str2;
            }
            yf8 yf8Var = xth.a;
            av8Var = av8Var2;
            udj.c(v, d0, lz.D(R.color.surface_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, !z ? xth.c() : xth.b(), av8Var, 0, 0, 131064);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p73(str2, z, xtcVar, i2, 1);
        }
    }

    public static final void L(int i2, of3 of3Var, xtc xtcVar, String str) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1472613116);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            d7e t = haa.t(R.drawable.player_photo_placeholder, 0, av8Var);
            d7e t2 = haa.t(R.drawable.player_photo_placeholder, 0, av8Var);
            n7g n7gVar = o7g.a;
            haa.b(str, "", yso.o(wnn.A(xtcVar, n7gVar), 1.0f, lz.D(R.color.n_lv_4, av8Var), n7gVar), t2, t, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, (i3 & 14) | 36912, 0, 32736);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new yi7(str, xtcVar, i2, i4);
        }
    }

    public static final void M(int i2, int i3, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(701992398);
        int i4 = (av8Var.e(i2) ? 4 : 2) | i3 | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            gn8 c2 = wv8.c(lz.D(R.color.neutral_default, av8Var), 5, haa.t(R.drawable.ic_venue_placeholder, 0, av8Var), 12);
            xtcVar2 = xtcVar;
            haa.b(vxd.j(i2, (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "venue/", "/image"), "", xtcVar2, wv8.c(lz.D(R.color.neutral_default, av8Var), 5, haa.t(R.drawable.ic_venue_placeholder, 0, av8Var), 12), c2, null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, ((i4 << 3) & 896) | 36912, 6, 31712);
        } else {
            xtcVar2 = xtcVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xz(i2, xtcVar2, i3, 15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void N(xtc xtcVar, float f2, long j2, of3 of3Var, int i2, int i3) {
        int i4;
        long j3;
        long d2;
        boolean z;
        Object O;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1534852205);
        if ((i2 & 6) == 0) {
            i4 = (av8Var.g(xtcVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= av8Var.d(f2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ((i3 & 4) == 0 && av8Var.f(j2)) ? 256 : 128;
        }
        int i6 = 0;
        boolean z2 = true;
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            av8Var.Y();
            if ((i2 & 1) == 0 || av8Var.B()) {
                if (i5 != 0) {
                    f2 = j65.a;
                }
                if ((i3 & 4) != 0) {
                    float f3 = j65.a;
                    d2 = i23.d(n65.a, av8Var);
                    i4 &= -897;
                    av8Var.t();
                    xtc p = bkh.p(bkh.c(xtcVar, 1.0f), f2);
                    boolean z3 = (i4 & 112) != 32;
                    if ((((i4 & 896) ^ 384) > 256 || !av8Var.f(d2)) && (i4 & 384) != 256) {
                        z2 = false;
                    }
                    z = z3 | z2;
                    O = av8Var.O();
                    if (!z || O == nf3.a) {
                        O = new l65(d2, i6, f2);
                        av8Var.n0(O);
                    }
                    lz.d(0, av8Var, p, (Function1) O);
                    j3 = d2;
                }
            } else {
                av8Var.W();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
            }
            d2 = j2;
            av8Var.t();
            xtc p2 = bkh.p(bkh.c(xtcVar, 1.0f), f2);
            if ((i4 & 112) != 32) {
            }
            if (((i4 & 896) ^ 384) > 256) {
            }
            z2 = false;
            z = z3 | z2;
            O = av8Var.O();
            if (!z) {
            }
            O = new l65(d2, i6, f2);
            av8Var.n0(O);
            lz.d(0, av8Var, p2, (Function1) O);
            j3 = d2;
        } else {
            av8Var.W();
            j3 = j2;
        }
        float f4 = f2;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new m65(f4, i2, i3, 0, j3, xtcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void O(final String str, xtc xtcVar, long j2, boolean z, boolean z2, of3 of3Var, final int i2, final int i3) {
        xtc xtcVar2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        av8 av8Var;
        final boolean z5;
        final xtc xtcVar3;
        final boolean z6;
        final long j3;
        eqf u;
        int i6;
        boolean z7;
        boolean z8;
        long j4;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1490275960);
        int i7 = (av8Var2.g(str) ? 4 : 2) | i2;
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 = i7 | 48;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i4 = i7 | (av8Var2.g(xtcVar2) ? 32 : 16);
        }
        int i9 = i4 | 128;
        int i10 = i3 & 8;
        if (i10 != 0) {
            i9 = i4 | 3200;
        } else if ((i2 & 3072) == 0) {
            z3 = z;
            i9 |= av8Var2.h(z3) ? a.o : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i9 |= 24576;
            } else if ((i2 & 24576) == 0) {
                z4 = z2;
                i9 |= av8Var2.h(z4) ? 16384 : 8192;
                if (av8Var2.T(i9 & 1, (i9 & 9363) != 9362)) {
                    av8Var2.Y();
                    int i11 = i2 & 1;
                    utc utcVar = utc.a;
                    if (i11 == 0 || av8Var2.B()) {
                        if (i8 != 0) {
                            xtcVar2 = utcVar;
                        }
                        long D = lz.D(R.color.n_lv_3, av8Var2);
                        int i12 = i9 & (-897);
                        boolean z9 = i10 == 0 ? z3 : true;
                        if (i5 != 0) {
                            i6 = i12;
                            z8 = z9;
                            z7 = false;
                        } else {
                            i6 = i12;
                            z7 = z4;
                            z8 = z9;
                        }
                        j4 = D;
                    } else {
                        av8Var2.W();
                        int i13 = i9 & (-897);
                        z8 = z3;
                        i6 = i13;
                        z7 = z4;
                        j4 = j2;
                    }
                    av8Var2.t();
                    av8Var2.d0(1931115667);
                    av8Var2.d0(1931099002);
                    xtc q = n9e.q(xtcVar2.z(bkh.c), lz.D(R.color.n_lv_4, av8Var2), oyn.e);
                    a99 a99Var = nf3.a;
                    if (z8 && !z7) {
                        Object O = av8Var2.O();
                        if (O == a99Var) {
                            O = new yo9(6);
                            av8Var2.n0(O);
                        }
                        q = q.z(Z(utcVar, (Function1) O));
                    }
                    av8Var2.s(false);
                    if (z7) {
                        Object O2 = av8Var2.O();
                        if (O2 == a99Var) {
                            O2 = new yo9(7);
                            av8Var2.n0(O2);
                        }
                        q = q.z(Z(utcVar, (Function1) O2));
                    }
                    av8Var2.s(false);
                    av8Var = av8Var2;
                    haa.b(str, "", q, null, wv8.c(j4, 5, haa.t(R.drawable.sofascore_lockup, 0, av8Var2), 12), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, (i6 & 14) | 32816, 6, 31720);
                    z6 = z7;
                    z5 = z8;
                    xtcVar3 = xtcVar2;
                    j3 = j4;
                } else {
                    av8Var = av8Var2;
                    av8Var.W();
                    z5 = z3;
                    xtcVar3 = xtcVar2;
                    z6 = z4;
                    j3 = j2;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new Function2() { // from class: ls9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            td4.O(str, xtcVar3, j3, z5, z6, (of3) obj, aba.K(i2 | 1), i3);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            z4 = z2;
            if (av8Var2.T(i9 & 1, (i9 & 9363) != 9362)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        z3 = z;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        z4 = z2;
        if (av8Var2.T(i9 & 1, (i9 & 9363) != 9362)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r10.bottom <= r12.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0071, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r9 == 17) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r9 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        r11 = j0(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r9 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r9 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r9 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r9 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r11 >= java.lang.Math.max(1, r9 - r10)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        defpackage.a70.p("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0031, code lost:
    
        if (r10.right <= r12.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0038, code lost:
    
        if (r10.top >= r12.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003f, code lost:
    
        if (r10.left >= r12.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean P(int i2, Rect rect, Rect rect2, Rect rect3) {
        boolean Q = Q(i2, rect, rect2);
        if (!Q(i2, rect, rect3) && Q) {
            if (i2 != 17) {
                if (i2 != 33) {
                    if (i2 != 66) {
                        if (i2 != 130) {
                            a70.p("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean Q(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        a70.p("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        if (rect2.bottom >= rect.top && rect2.top <= rect.bottom) {
            return true;
        }
    }

    public static final gv9 S(Context context, Map map, Function1 function1) {
        int i2;
        context.getClass();
        map.getClass();
        o73 o73Var = new o73(context, map);
        function1.invoke(o73Var);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = o73Var.c;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            if (((l83) next) instanceof e83) {
                l83 l83Var = (l83) CollectionsKt.a0(i3, arrayList2);
                i2 = ((l83Var instanceof b83) || (l83Var instanceof h83)) ? 0 : i3;
            }
            arrayList.add(next);
        }
        return l6g.W(arrayList);
    }

    public static final xtc T(xtc xtcVar, i68 i68Var) {
        return xtcVar.z(new kak(i68Var));
    }

    public static final xtc U(p3e p3eVar) {
        return new q3e(p3eVar);
    }

    public static final Function0 V(Function1 function1, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        int hashCode = Long.hashCode(av8Var.T);
        Context context = (Context) av8Var.k(nz.b);
        androidx.compose.runtime.a S = z8e.S(av8Var);
        spg spgVar = (spg) av8Var.k(upg.a);
        View view = (View) av8Var.k(nz.f);
        boolean i3 = ((((i2 & 14) ^ 6) > 4 && av8Var.g(function1)) || (i2 & 6) == 4) | av8Var.i(context) | av8Var.i(S) | av8Var.i(spgVar) | av8Var.e(hashCode) | av8Var.i(view);
        Object O = av8Var.O();
        if (i3 || O == nf3.a) {
            h50 h50Var = new h50(context, function1, S, spgVar, hashCode, view);
            av8Var.n0(h50Var);
            O = h50Var;
        }
        return (Function0) O;
    }

    public static final xtc X(xtc xtcVar, Function1 function1) {
        return xtcVar.z(new z95(function1));
    }

    public static final xtc Y(xtc xtcVar, Function1 function1) {
        return xtcVar.z(new la5(function1));
    }

    public static final xtc Z(xtc xtcVar, Function1 function1) {
        return xtcVar.z(new ma5(function1));
    }

    public static final void a(Function1 function1, xtc xtcVar, Function1 function12, of3 of3Var, int i2, int i3) {
        int i4;
        xtc xtcVar2;
        Function1 function13;
        ry ryVar = ry.v;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1783766393);
        if ((i2 & 6) == 0) {
            i4 = (av8Var.i(function1) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= av8Var.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            if (i5 != 0) {
                xtcVar = utc.a;
            }
            xtc xtcVar3 = xtcVar;
            Function1 function14 = i6 != 0 ? ryVar : function12;
            b(function1, xtcVar3, null, ryVar, function14, av8Var, (i4 & 14) | 3072 | (i4 & 112) | (57344 & (i4 << 6)), 4);
            xtcVar2 = xtcVar3;
            function13 = function14;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
            function13 = function12;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new e50(function1, xtcVar2, function13, i2, i3);
        }
    }

    public static final ViewGroup a0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (((FrameLayout) view).getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(Function1 function1, xtc xtcVar, Function1 function12, Function1 function13, Function1 function14, of3 of3Var, int i2, int i3) {
        int i4;
        xtc xtcVar2;
        int i5;
        Function1 function15;
        int i6;
        Function1 function16;
        int i7;
        Function1 function17;
        av8 av8Var;
        Function1 function18;
        Function1 function19;
        Function1 function110;
        eqf u;
        Function1 function111;
        Function1 function112;
        ry ryVar = ry.v;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-180024211);
        y0 y0Var = av8Var2.a;
        if ((i2 & 6) == 0) {
            i4 = (av8Var2.i(function1) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var2.g(xtcVar2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                function15 = function12;
                i4 |= av8Var2.i(function15) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    function16 = function13;
                    i4 |= av8Var2.i(function16) ? a.o : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        function17 = function14;
                        i4 |= av8Var2.i(function17) ? 16384 : 8192;
                        if (av8Var2.T(i4 & 1, (i4 & 9363) != 9362)) {
                            xtc xtcVar3 = i8 != 0 ? utc.a : xtcVar2;
                            Function1 function113 = i5 != 0 ? null : function15;
                            if (i6 != 0) {
                                function16 = ryVar;
                            }
                            if (i7 != 0) {
                                function17 = ryVar;
                            }
                            int hashCode = Long.hashCode(av8Var2.T);
                            xtc C = fqj.C(av8Var2, xtcVar3.z(od8.a).z(me8.a).z(oe8.a).z(ke8.a));
                            kx4 kx4Var = (kx4) av8Var2.k(dh3.h);
                            ema emaVar = (ema) av8Var2.k(dh3.n);
                            aee m = av8Var2.m();
                            u6b u6bVar = (u6b) av8Var2.k(mhb.a);
                            qqg qqgVar = (qqg) av8Var2.k(shb.a);
                            if (function113 != null) {
                                av8Var2.d0(1313917368);
                                Function0 V = V(function1, av8Var2, i4 & 14);
                                if (!(y0Var instanceof a9k)) {
                                    z8e.N();
                                    throw null;
                                }
                                av8Var2.h0();
                                if (av8Var2.S) {
                                    av8Var2.l(V);
                                } else {
                                    av8Var2.q0();
                                }
                                function111 = function16;
                                function112 = function17;
                                z0(av8Var2, C, hashCode, kx4Var, u6bVar, qqgVar, emaVar, m);
                                waa.K(av8Var2, function113, f50.j);
                                waa.K(av8Var2, function112, f50.k);
                                waa.K(av8Var2, function111, f50.l);
                                av8Var2.s(true);
                                av8Var2.s(false);
                            } else {
                                function111 = function16;
                                function112 = function17;
                                av8Var2.d0(1314774735);
                                Function0 V2 = V(function1, av8Var2, i4 & 14);
                                if (!(y0Var instanceof a9k)) {
                                    z8e.N();
                                    throw null;
                                }
                                av8Var2.b0();
                                if (av8Var2.S) {
                                    av8Var2.l(V2);
                                } else {
                                    av8Var2.q0();
                                }
                                z0(av8Var2, C, hashCode, kx4Var, u6bVar, qqgVar, emaVar, m);
                                waa.K(av8Var2, function112, f50.m);
                                waa.K(av8Var2, function111, f50.n);
                                av8Var2.s(true);
                                av8Var2.s(false);
                            }
                            Function1 function114 = function112;
                            xtcVar2 = xtcVar3;
                            function110 = function114;
                            function19 = function111;
                            av8Var = av8Var2;
                            function18 = function113;
                        } else {
                            av8Var2.W();
                            av8Var = av8Var2;
                            function18 = function15;
                            function19 = function16;
                            function110 = function17;
                        }
                        u = av8Var.u();
                        if (u != null) {
                            u.d = new g50(i2, i3, 0, function110, xtcVar2, function1, function18, function19);
                            return;
                        }
                        return;
                    }
                    function17 = function14;
                    if (av8Var2.T(i4 & 1, (i4 & 9363) != 9362)) {
                    }
                    u = av8Var.u();
                    if (u != null) {
                    }
                }
                function16 = function13;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                function17 = function14;
                if (av8Var2.T(i4 & 1, (i4 & 9363) != 9362)) {
                }
                u = av8Var.u();
                if (u != null) {
                }
            }
            function15 = function12;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            function16 = function13;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            function17 = function14;
            if (av8Var2.T(i4 & 1, (i4 & 9363) != 9362)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        function15 = function12;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        function16 = function13;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        function17 = function14;
        if (av8Var2.T(i4 & 1, (i4 & 9363) != 9362)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static gn8 b0(d7e d7eVar, ay1 ay1Var, int i2) {
        if ((i2 & 2) != 0) {
            ay1Var = null;
        }
        ay1 ay1Var2 = ay1Var;
        long i3 = (i2 & 4) != 0 ? d7eVar.i() : 9205357640488583168L;
        d7eVar.getClass();
        return new gn8(d7eVar, ay1Var2, i3, e);
    }

    public static final void c(sm1 sm1Var, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(847241428);
        int i3 = (av8Var.g(sm1Var) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            kv1 kv1Var = uxf.p;
            xtc d0 = l98.d0(n9e.q(xtcVar, lz.D(R.color.surface_1, av8Var), o7g.a(4.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
            u23 a2 = t23.a(ww9.d, kv1Var, av8Var, 48);
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
            String upperCase = oea.v(sm1Var.a, av8Var).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            yf8 yf8Var = xth.a;
            udj.c(upperCase, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var, 0, 24960, 110586);
            udj.c(sm1Var.b, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lj(sm1Var, xtcVar, i2, 2);
        }
    }

    public static final int c0(ucd ucdVar) {
        int[] D = wt3.D(6);
        int length = D.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            int i4 = D[i3];
            if (wt3.c(i4) == ucdVar.a.a[0].f.c) {
                i2 = i4;
                break;
            }
            i3++;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public static final void d(tm1 tm1Var, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        boolean z;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1635040314);
        int i3 = i2 | (av8Var.g(tm1Var) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | 384;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            kv1 kv1Var = uxf.p;
            utc utcVar = utc.a;
            xtc b0 = l98.b0(tol.y(n9e.q(wnn.A(bkh.p(utcVar, 156.0f), o7g.a(8.0f)), lz.D(R.color.surface_2, av8Var), oyn.e), false, false, false, 0L, null, function0, av8Var, 31), 8.0f);
            u23 a2 = t23.a(ww9.d, kv1Var, av8Var, 48);
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
            xtc l2 = bkh.l(utcVar, 40.0f);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, l2);
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
            int i4 = tm1Var.a;
            gv9<sm1> gv9Var = tm1Var.f;
            mv1 mv1Var = uxf.g;
            n12 n12Var = n12.a;
            C(i4, bkh.l(n12Var.a(utcVar, mv1Var), 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, 12);
            G(tm1Var.b, bkh.l(n12Var.a(utcVar, uxf.k), 16.0f), false, 0L, av8Var, 0, 12);
            bf3.t(av8Var, true, utcVar, 16.0f, av8Var);
            String str = tm1Var.c;
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 110586);
            String str2 = tm1Var.e;
            if (str2 == null) {
                str2 = "";
            }
            udj.c(str2, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            ng0 ng0Var = new ng0(4.0f, true, new a70(6));
            xtc d2 = bkh.d(utcVar, 1.0f);
            l8g a3 = k8g.a(ng0Var, uxf.l, av8Var, 6);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d2);
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
            if (gv9Var.isEmpty()) {
                av8Var.d0(777096659);
                c(new sm1(R.string.baseball_strikeouts_short, "0"), s02.j0(), av8Var, 48);
                av8Var.s(false);
                z = true;
            } else {
                av8Var.d0(777434652);
                for (sm1 sm1Var : gv9Var) {
                    av8Var.a0(-2070438371, Integer.valueOf(sm1Var.a));
                    c(sm1Var, new goa(1.0f, true), av8Var, 0);
                    av8Var.s(false);
                }
                z = true;
                av8Var.s(false);
            }
            av8Var.s(z);
            av8Var.s(z);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cyb(tm1Var, function0, xtcVar2, i2, 6);
        }
    }

    public static Drawable d0(int i2, Context context) {
        return t1g.b().c(i2, context);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static final void e(int r51, defpackage.of3 r52, defpackage.gv9 r53, defpackage.xtc r54, kotlin.jvm.functions.Function0 r55, kotlin.jvm.functions.Function1 r56) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.td4.e(int, of3, gv9, xtc, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1):void");
    }

    public static final void f(String str, op3 op3Var, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(963761025);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(op3Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            ht9 ht9Var = new ht9((Context) av8Var.k(nz.b));
            ht9Var.c = str;
            ht9Var.f = str;
            haa.b(ht9Var.a(), null, xtcVar, null, haa.t(R.drawable.sofascore_lockup, 0, av8Var), null, op3Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, (i3 & 896) | 32816, (i3 >> 3) & 14, 31720);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ns9(str, op3Var, xtcVar, i2, 0);
        }
    }

    public static final void g(int i2, int i3, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(699542493);
        int i4 = (av8Var.e(i2) ? 4 : 2) | i3 | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            String j2 = vxd.j(i2, (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "branding/provider/", "/interstitial-header-image");
            ht9 ht9Var = new ht9(context);
            ht9Var.c = j2;
            ht9Var.f = j2;
            xtcVar2 = xtcVar;
            haa.a(ht9Var.a(), null, xtcVar2, null, null, av8Var, ((i4 << 3) & 896) | 48, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
        } else {
            xtcVar2 = xtcVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xz(i2, xtcVar2, i3, 13);
        }
    }

    public static final boolean g0(String str) {
        str.getClass();
        return Intrinsics.c(str, C4094gc.b) || Intrinsics.c(str, "PATCH") || Intrinsics.c(str, "PUT") || Intrinsics.c(str, "DELETE") || Intrinsics.c(str, "MOVE");
    }

    public static final void h(int i2, of3 of3Var, xtc xtcVar, String str) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1944896397);
        int i3 = 4;
        int i4 = (av8Var.g(str) ? 4 : 2) | i2;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            ht9 ht9Var = new ht9((Context) av8Var.k(nz.b));
            ht9Var.c = str;
            ht9Var.f = str;
            xtcVar2 = xtcVar;
            haa.a(ht9Var.a(), null, xtcVar2, null, null, av8Var, 432, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
        } else {
            xtcVar2 = xtcVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x81(str, xtcVar2, i2, i3);
        }
    }

    public static boolean h0(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            if ((i3 > i4 || rect.left >= i4) && rect.left > rect2.left) {
                return true;
            }
        } else if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if ((i5 > i6 || rect.top >= i6) && rect.top > rect2.top) {
                return true;
            }
        } else if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {
                return true;
            }
        } else {
            if (i2 != 130) {
                a70.p("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            int i9 = rect.top;
            int i10 = rect2.top;
            if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
                return true;
            }
        }
        return false;
    }

    public static final void i(Integer num, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        String str;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(853987884);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(num) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            gn8 c2 = wv8.c(lz.D(R.color.neutral_default, av8Var), 5, haa.t(R.drawable.ic_flag_placeholder, 0, av8Var), 12);
            gn8 c3 = wv8.c(lz.D(R.color.neutral_default, av8Var), 5, haa.t(R.drawable.ic_flag_placeholder, 0, av8Var), 12);
            if (num != null) {
                str = vxd.j(num.intValue(), (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "category/", "/image");
            } else {
                str = "";
            }
            haa.b(str, null, xtcVar, c3, c2, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, ((i3 << 3) & 896) | 36912, 0, 32736);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gs9(num, xtcVar, i2, 0, (byte) 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ff, code lost:
    
        if (r9 > 15) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0103, code lost:
    
        if (r14 == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0106, code lost:
    
        defpackage.is8.e("SNTP: Zero transmitTime");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long i0() {
        byte b2;
        SocketTimeoutException socketTimeoutException;
        byte[] bArr;
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            Object obj = g;
            synchronized (obj) {
            }
            datagramSocket.setSoTimeout(1000);
            synchronized (obj) {
            }
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b3 = 0;
            SocketTimeoutException socketTimeoutException2 = null;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                byte[] bArr2 = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr2, 48, allByName[i2], Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
                bArr2[b3] = 27;
                long currentTimeMillis = System.currentTimeMillis();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (currentTimeMillis == 0) {
                    Arrays.fill(bArr2, 40, 48, b3);
                    b2 = b3;
                    socketTimeoutException = socketTimeoutException2;
                    bArr = bArr2;
                } else {
                    long j2 = currentTimeMillis / 1000;
                    long j3 = currentTimeMillis - (j2 * 1000);
                    b2 = b3;
                    socketTimeoutException = socketTimeoutException2;
                    long j4 = j2 + 2208988800L;
                    bArr = bArr2;
                    bArr[40] = (byte) (j4 >> 24);
                    bArr[41] = (byte) (j4 >> 16);
                    bArr[42] = (byte) (j4 >> 8);
                    bArr[43] = (byte) j4;
                    long j5 = (j3 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j5 >> 24);
                    bArr[45] = (byte) (j5 >> 16);
                    bArr[46] = (byte) (j5 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                byte[] bArr3 = bArr;
                try {
                    datagramSocket.receive(new DatagramPacket(bArr3, 48));
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j6 = (elapsedRealtime2 - elapsedRealtime) + currentTimeMillis;
                    byte b4 = bArr3[b2];
                    byte b5 = (byte) ((b4 >> 6) & 3);
                    byte b6 = (byte) (b4 & 7);
                    int i4 = bArr3[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    long r0 = r0(24, bArr3);
                    long r02 = r0(32, bArr3);
                    long r03 = r0(40, bArr3);
                    if (b5 != 3) {
                        if (b6 != 4 && b6 != 5) {
                            is8.e(ljg.j(b6, "SNTP: Untrusted mode: "));
                        }
                        is8.e(ljg.j(i4, "SNTP: Untrusted stratum: "));
                    } else {
                        is8.e("SNTP: Unsynchronized server");
                    }
                    long j7 = (j6 + (((r03 - j6) + (r02 - r0)) / 2)) - elapsedRealtime2;
                    datagramSocket.close();
                    return j7;
                } catch (SocketTimeoutException e2) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException2 = e2;
                    } else {
                        SocketTimeoutException socketTimeoutException3 = socketTimeoutException;
                        socketTimeoutException3.addSuppressed(e2);
                        socketTimeoutException2 = socketTimeoutException3;
                    }
                    int i5 = i3 + 1;
                    if (i3 >= 10) {
                        break;
                    }
                    i2++;
                    i3 = i5;
                    b3 = b2;
                }
            }
            socketTimeoutException2.getClass();
            throw socketTimeoutException2;
        } finally {
        }
    }

    public static final void j(int i2, int i3, of3 of3Var, xtc xtcVar) {
        int i4;
        int i5;
        int i6;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(288948077);
        int i7 = 2;
        if ((i3 & 6) == 0) {
            i4 = (av8Var.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        int i8 = i4 | 48;
        if (av8Var.T(i8 & 1, (i8 & 19) != 18)) {
            if (i2 > 0) {
                i5 = -1493768039;
                i6 = R.color.success;
            } else if (i2 < 0) {
                i5 = -1493766921;
                i6 = R.color.error;
            } else {
                i5 = -1493766048;
                i6 = R.color.neutral_default;
            }
            long f2 = ljg.f(av8Var, i5, i6, av8Var, false);
            mv1 mv1Var = uxf.g;
            utc utcVar = utc.a;
            xtc l2 = bkh.l(utcVar, 16.0f);
            n7g n7gVar = o7g.a;
            xtc A = wnn.A(l2, n7gVar);
            jf9 jf9Var = oyn.e;
            xtc q = n9e.q(A, f2, jf9Var);
            k1c c2 = e12.c(mv1Var, false);
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
            if (i2 > 0) {
                av8Var.d0(-409932965);
                kq9.b(s6a.N(R.drawable.ic_chevron_up_large_16, 6, av8Var), null, bkh.l(utcVar, 12.0f), r13.d, av8Var, V2.b.f, 0);
                av8Var.s(false);
            } else if (i2 < 0) {
                av8Var.d0(-409663079);
                kq9.b(s6a.N(R.drawable.ic_chevron_down_large_16, 6, av8Var), null, bkh.l(utcVar, 12.0f), r13.d, av8Var, V2.b.f, 0);
                av8Var.s(false);
            } else {
                av8Var.d0(-983037728);
                e12.a(0, av8Var, n9e.q(wnn.A(bkh.e(bkh.p(utcVar, 7.0f), 2.0f), n7gVar), r13.d, jf9Var));
                av8Var.s(false);
            }
            av8Var.s(true);
            xtcVar = utcVar;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hn1(i2, xtcVar, i3, i7);
        }
    }

    public static int j0(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else {
            if (i2 != 130) {
                a70.p("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i3 = rect2.top;
            i4 = rect.bottom;
        }
        return Math.max(0, i3 - i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(final String str, final xtc xtcVar, float f2, boolean z, of3 of3Var, final int i2, final int i3) {
        int i4;
        xtc xtcVar2;
        float f3;
        int i5;
        boolean z2;
        final float f4;
        final boolean z3;
        eqf u;
        Object obj;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1572022022);
        if ((i2 & 6) == 0) {
            i4 = (av8Var.g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var.g(xtcVar2) ? 32 : 16;
        } else {
            xtcVar2 = xtcVar;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            f3 = f2;
            i4 |= av8Var.d(f3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                z2 = z;
                i4 |= av8Var.h(z2) ? a.o : 1024;
                if (av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
                    float f5 = i6 != 0 ? 1.0f : f3;
                    boolean z4 = i5 != 0 ? true : z2;
                    Context context = (Context) av8Var.k(nz.b);
                    if (str != null) {
                        obj = fc6.n((Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "country/", str, "/flag");
                    } else {
                        obj = "";
                    }
                    gn8 c2 = wv8.c(lz.D(R.color.neutral_default, av8Var), 5, haa.t(R.drawable.ic_flag_placeholder, 0, av8Var), 12);
                    gn8 c3 = wv8.c(lz.D(R.color.neutral_default, av8Var), 5, haa.t(R.drawable.ic_flag_placeholder, 0, av8Var), 12);
                    if (!z4) {
                        ht9 ht9Var = new ht9(context);
                        ht9Var.c = obj;
                        st9.a(ht9Var, false);
                        obj = ht9Var.a();
                    }
                    haa.b(obj, null, xtcVar2, c3, c2, null, null, f5, av8Var, ((i4 << 3) & 896) | 36912, (i4 >> 3) & 112, 30688);
                    z3 = z4;
                    f4 = f5;
                } else {
                    av8Var.W();
                    f4 = f3;
                    z3 = z2;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new Function2() { // from class: fs9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            td4.k(str, xtcVar, f4, z3, (of3) obj2, aba.K(i2 | 1), i3);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            z2 = z;
            if (av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        f3 = f2;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if (av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final ArrayList k0(List list) {
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        int i2 = 10;
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FantasyRoundTransfers fantasyRoundTransfers = (FantasyRoundTransfers) it.next();
            int roundId = fantasyRoundTransfers.getRoundId();
            String roundName = fantasyRoundTransfers.getRoundName();
            int roundSequence = fantasyRoundTransfers.getRoundSequence();
            int transferPenalty = fantasyRoundTransfers.getTransferPenalty();
            double d2 = 0.0d;
            for (FantasyTransfer fantasyTransfer : fantasyRoundTransfers.getTransfers()) {
                d2 += fantasyTransfer.getPriceOut() - fantasyTransfer.getPriceIn();
            }
            float f2 = (float) d2;
            Boolean quickFixActive = fantasyRoundTransfers.getQuickFixActive();
            Boolean bool = Boolean.TRUE;
            boolean c2 = Intrinsics.c(quickFixActive, bool);
            boolean c3 = Intrinsics.c(fantasyRoundTransfers.getRebuildSquadActive(), bool);
            List<FantasyTransfer> transfers = fantasyRoundTransfers.getTransfers();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : transfers) {
                FantasyTransfer fantasyTransfer2 = (FantasyTransfer) obj;
                if (fantasyTransfer2.getPlayerIn().getPosition() != null && fantasyTransfer2.getPlayerOut().getPosition() != null) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, i2));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                FantasyTransfer fantasyTransfer3 = (FantasyTransfer) it2.next();
                String C = tba.C(fantasyTransfer3.getPlayerOut());
                if (C == null) {
                    C = tba.t(fantasyTransfer3.getPlayerOut());
                }
                int fantasyPlayerIdOut = fantasyTransfer3.getFantasyPlayerIdOut();
                int id = fantasyTransfer3.getPlayerOut().getId();
                int teamIdOut = fantasyTransfer3.getTeamIdOut();
                String teamNameCodeOut = fantasyTransfer3.getTeamNameCodeOut();
                float priceOut = (float) fantasyTransfer3.getPriceOut();
                f7a f7aVar = rz6.g;
                String position = fantasyTransfer3.getPlayerOut().getPosition();
                if (position == null) {
                    a70.r("Required value was null.");
                    return null;
                }
                f7aVar.getClass();
                rz6 g2 = f7a.g(position);
                ArrayList arrayList4 = arrayList3;
                FantasyTransferPlayer fantasyTransferPlayer = new FantasyTransferPlayer(C, id, fantasyPlayerIdOut, teamIdOut, teamNameCodeOut, priceOut, g2, valueOf);
                String C2 = tba.C(fantasyTransfer3.getPlayerIn());
                if (C2 == null) {
                    C2 = tba.t(fantasyTransfer3.getPlayerIn());
                }
                int fantasyPlayerIdIn = fantasyTransfer3.getFantasyPlayerIdIn();
                int id2 = fantasyTransfer3.getPlayerIn().getId();
                int teamIdIn = fantasyTransfer3.getTeamIdIn();
                String teamNameCodeIn = fantasyTransfer3.getTeamNameCodeIn();
                float priceIn = (float) fantasyTransfer3.getPriceIn();
                String position2 = fantasyTransfer3.getPlayerIn().getPosition();
                if (position2 == null) {
                    a70.r("Required value was null.");
                    return null;
                }
                arrayList4.add(new FantasyTransferPlayers(new FantasyTransferPlayer(C2, id2, fantasyPlayerIdIn, teamIdIn, teamNameCodeIn, priceIn, f7a.g(position2), valueOf), fantasyTransferPlayer));
                it = it;
                arrayList3 = arrayList4;
            }
            arrayList.add(new lj7(roundId, roundName, roundSequence, f2, transferPenalty, l6g.W(arrayList3), c3, c2));
            i2 = 10;
        }
        return arrayList;
    }

    public static final void l(g5i g5iVar, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-229159650);
        int i3 = (av8Var.g(g5iVar) ? 4 : 2) | i2;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            k1c c2 = e12.c(uxf.c, false);
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
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            g28 g28Var = bkh.c;
            ImageVector N = s6a.N(R.drawable.ic_cycling_shirt_colored, 6, av8Var);
            int i4 = g5iVar.a;
            Integer num = g5iVar.b;
            wkn.l(N, g28Var, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new ay1(hkg.b(context.getColor(i4)), 5), av8Var, 432, 56);
            if (num != null) {
                av8Var.d0(1148589679);
                wkn.l(s6a.N(R.drawable.ic_cycling_shirt_polkadot_mask, 6, av8Var), g28Var, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new ay1(hkg.b(context.getColor(num.intValue())), 5), av8Var, 432, 56);
                av8Var.s(false);
            } else {
                av8Var.d0(1148902314);
                av8Var.s(false);
            }
            wkn.l(s6a.N(R.drawable.ic_cycling_shirt_mask, 6, av8Var), g28Var, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 432, 120);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new op9(g5iVar, xtcVar, i2, 2);
        }
    }

    public static int l0(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        a70.p("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final void m(final mte mteVar, final boolean z, Integer num, final long j2, Long l2, final Function1 function1, final Function0 function0, final xtc xtcVar, final boolean z2, of3 of3Var, final int i2) {
        int i3;
        Integer num2;
        av8 av8Var;
        int i4;
        r13 r13Var;
        long j3;
        int i5;
        boolean z3;
        r13 e2;
        long j4;
        long j5;
        Integer num3;
        boolean z4;
        Integer num4;
        boolean z5;
        Double d2;
        Long l3 = l2;
        function1.getClass();
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1644296186);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(mteVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.g(num) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var2.f(j2) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var2.g(l3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= av8Var2.i(function1) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i2) == 0) {
            i3 |= av8Var2.i(function0) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= av8Var2.g(xtcVar) ? 8388608 : 4194304;
        }
        int i6 = i3 | 100663296;
        if ((805306368 & i2) == 0) {
            i6 |= av8Var2.h(z2) ? 536870912 : 268435456;
        }
        if (av8Var2.T(i6 & 1, (306783379 & i6) != 306783378)) {
            boolean z6 = av8Var2.k(dh3.n) == ema.b;
            float f2 = z6 ? 0.15f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f3 = z6 ? 0.0f : 0.15f;
            Double d3 = mteVar != null ? mteVar.c : null;
            if (d3 == null) {
                av8Var2.d0(-1125130875);
                av8Var2.s(false);
                i4 = i6;
                r13Var = null;
            } else {
                av8Var2.d0(-1125130874);
                i4 = i6;
                long x = kpg.x(d3.doubleValue(), av8Var2);
                av8Var2.s(false);
                r13Var = new r13(x);
            }
            if (r13Var == null) {
                j3 = ljg.f(av8Var2, 379349267, R.color.rating_90, av8Var2, false);
            } else {
                av8Var2.d0(379346973);
                av8Var2.s(false);
                j3 = r13Var.a;
            }
            boolean f4 = av8Var2.f(j3) | av8Var2.d(f2) | av8Var2.d(f3);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            Object obj = O;
            if (f4 || O == a99Var) {
                Pair[] pairArr = {new Pair(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new r13(r13.c(j3, f2))), new Pair(Float.valueOf(1.0f), new r13(r13.c(j3, f3)))};
                av8Var2.n0(pairArr);
                obj = pairArr;
            }
            Pair[] pairArr2 = (Pair[]) obj;
            av8Var2.d0(379364516);
            xtc p = n9e.p(wnn.A(bkh.d(n9e.q(xtcVar, lz.D(R.color.surface_1, av8Var2), oyn.e), 1.0f), o7g.a(8.0f)), wxf.t((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), null, 6);
            long D = lz.D(R.color.n_lv_4, av8Var2);
            n7g a2 = o7g.a(8.0f);
            utc utcVar = utc.a;
            xtc z7 = p.z(yso.o(utcVar, 1.0f, D, a2));
            av8Var2.s(false);
            boolean z8 = mteVar != null;
            long D2 = lz.D(R.color.n_lv_4, av8Var2);
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = mz1.e(av8Var2);
            }
            wzc wzcVar = (wzc) O2;
            Object[] objArr = new Object[0];
            Object O3 = av8Var2.O();
            if (O3 == a99Var) {
                O3 = b74.p;
                av8Var2.n0(O3);
            }
            xtc c0 = l98.c0(tol.y(z7, z8, true, true, D2, wzcVar, new qz5((boh) o3a.N(objArr, (Function0) O3, av8Var2, 48), function1, mteVar, 0), av8Var2, 0), 16.0f, 8.0f);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a3 = t23.a(p4hVar, kv1Var, av8Var2, 0);
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
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a3, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            String v = oea.v(R.string.fans_player_of_the_match_pick, av8Var2);
            Double d4 = mteVar != null ? mteVar.c : null;
            if (d4 == null) {
                av8Var2.d0(101857582);
                av8Var2.s(false);
                z3 = false;
                e2 = null;
            } else {
                av8Var2.d0(101857583);
                double doubleValue = d4.doubleValue();
                if (doubleValue != 0.0d) {
                    if (doubleValue < 6.0d) {
                        i5 = R.color.rating_10;
                    } else if (doubleValue < 6.5d) {
                        i5 = R.color.rating_60;
                    } else if (doubleValue < 7.0d) {
                        i5 = R.color.rating_65;
                    } else if (doubleValue < 8.0d) {
                        i5 = R.color.rating_70;
                    } else if (doubleValue < 9.0d) {
                        i5 = R.color.rating_80;
                    } else if (doubleValue <= 10.0d) {
                        i5 = R.color.rating_90;
                    }
                    long D3 = lz.D(i5, av8Var2);
                    z3 = false;
                    e2 = vxd.e(av8Var2, false, D3);
                }
                i5 = R.color.rating_00;
                long D32 = lz.D(i5, av8Var2);
                z3 = false;
                e2 = vxd.e(av8Var2, false, D32);
            }
            if (e2 == null) {
                j4 = ljg.f(av8Var2, -1520732701, R.color.primary_default, av8Var2, z3);
            } else {
                av8Var2.d0(-1520735398);
                av8Var2.s(z3);
                j4 = e2.a;
            }
            Integer valueOf2 = Integer.valueOf(R.drawable.ic_chevron_right_large_16);
            if (num == null || z) {
                valueOf2 = null;
            }
            Integer num5 = valueOf2;
            r13 r13Var2 = new r13(lz.D(R.color.primary_default, av8Var2));
            if (num == null || z) {
                r13Var2 = null;
            }
            if (r13Var2 == null) {
                j5 = ljg.f(av8Var2, -1520723815, R.color.n_lv_1, av8Var2, false);
            } else {
                av8Var2.d0(-1520726140);
                av8Var2.s(false);
                j5 = r13Var2.a;
            }
            boolean z9 = (num == null || z) ? false : true;
            long D4 = lz.D(R.color.n_lv_4, av8Var2);
            boolean z10 = z9;
            Object O4 = av8Var2.O();
            if (O4 == a99Var) {
                O4 = mz1.e(av8Var2);
            }
            wzc wzcVar2 = (wzc) O4;
            Object[] objArr2 = new Object[0];
            Object O5 = av8Var2.O();
            if (O5 == a99Var) {
                O5 = b74.q;
                av8Var2.n0(O5);
            }
            wkn.b(tol.y(utcVar, z10, true, true, D4, wzcVar2, new gm((boh) o3a.N(objArr2, (Function0) O5, av8Var2, 48), function0, 18), av8Var2, 0), j4, null, v, j5, true, num5, av8Var2, 196608, 4);
            xtc d0 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            lv1 lv1Var = uxf.m;
            wxf wxfVar = ww9.b;
            l8g a4 = k8g.a(wxfVar, lv1Var, av8Var2, 48);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, d0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a4, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            if (!z || mteVar == null) {
                av8Var2.d0(-1955889657);
                kq9.b(s6a.N(R.drawable.player_photo_placeholder, 6, av8Var2), null, bkh.l(utcVar, 40.0f), r13.i, av8Var2, V2.b.f, 0);
                av8Var = av8Var2;
                nq8.h(av8Var, bkh.p(utcVar, 8.0f));
                l3 = l2;
                num3 = null;
                wnn.g(l3, null, z2, av8Var, ((i4 >> 12) & 14) | ((i4 >> 21) & 896));
                if (1.0f <= 0.0d) {
                    p3a.a("invalid weight; must be greater than zero");
                }
                z4 = true;
                nq8.h(av8Var, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                av8Var.s(false);
            } else {
                av8Var2.d0(-1957258338);
                C(mteVar.a, bkh.l(utcVar, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 48, 12);
                nq8.h(av8Var2, bkh.p(utcVar, 8.0f));
                if (1.0f <= 0.0d) {
                    p3a.a("invalid weight; must be greater than zero");
                }
                goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                u23 a5 = t23.a(p4hVar, kv1Var, av8Var2, 0);
                int hashCode3 = Long.hashCode(av8Var2.T);
                aee m3 = av8Var2.m();
                xtc C3 = fqj.C(av8Var2, goaVar);
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, a5, f50Var);
                waa.K(av8Var2, m3, ff3Var);
                bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
                waa.K(av8Var2, C3, f50Var3);
                String str = mteVar.b;
                yf8 yf8Var = xth.a;
                udj.c(str, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var2, 0, 24960, 110586);
                nq8.h(av8Var2, bkh.e(utcVar, 2.0f));
                l8g a6 = k8g.a(wxfVar, lv1Var, av8Var2, 48);
                int hashCode4 = Long.hashCode(av8Var2.T);
                aee m4 = av8Var2.m();
                xtc C4 = fqj.C(av8Var2, utcVar);
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, a6, f50Var);
                waa.K(av8Var2, m4, ff3Var);
                bf3.s(hashCode4, av8Var2, f50Var2, av8Var2, ryVar);
                waa.K(av8Var2, C4, f50Var3);
                G(mteVar.f, bkh.l(utcVar, 16.0f), false, 0L, av8Var2, 48, 12);
                nq8.h(av8Var2, bkh.p(utcVar, 2.0f));
                udj.c(mteVar.g, null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var2, 0, 24960, 110586);
                av8Var = av8Var2;
                ljg.t(av8Var, true, true, false);
                l3 = l2;
                z4 = true;
                num3 = null;
            }
            if (num != null || z) {
                av8Var.d0(-1955022463);
                if (mteVar == null || (d2 = mteVar.d) == null) {
                    num4 = num3;
                } else {
                    num4 = num3;
                    num3 = Integer.valueOf((int) d2.doubleValue());
                }
                num2 = num;
                z5 = z4;
                oyn.d(num3, mteVar != null ? mteVar.e : num4, j2, Intrinsics.c(mteVar != null ? Integer.valueOf(mteVar.a) : num4, num2), z, null, av8Var, ((i4 >> 3) & 896) | ((i4 << 9) & 57344));
                av8Var.s(false);
            } else {
                av8Var.d0(-1955285560);
                av8 av8Var3 = av8Var;
                yfa.e(oea.v(R.string.vote_now_button, av8Var), function0, null, null, bph.a, null, false, false, 0L, av8Var3, ((i4 >> 15) & 112) | 24576, 1004);
                av8Var = av8Var3;
                av8Var.s(false);
                num2 = num;
                z5 = z4;
            }
            av8Var.s(z5);
            av8Var.s(z5);
        } else {
            num2 = num;
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            final Long l4 = l3;
            final Integer num6 = num2;
            u.d = new Function2() { // from class: pz5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    td4.m(mte.this, z, num6, j2, l4, function1, function0, xtcVar, z2, (of3) obj2, aba.K(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final xtc m0(xtc xtcVar, Function1 function1) {
        return xtcVar.z(new un3(function1));
    }

    public static final void n(int i2, xtc xtcVar, mv1 mv1Var, of3 of3Var, int i3) {
        xtc xtcVar2;
        mv1 mv1Var2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(840776027);
        int i4 = (av8Var.e(i2) ? 4 : 2) | i3;
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            xtcVar2 = xtcVar;
            mv1Var2 = mv1Var;
            haa.a(vxd.j(i2, (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "branding/provider/", "/logo"), null, xtcVar2, mv1Var2, mp3.b, av8Var, 1769904, 1944);
        } else {
            xtcVar2 = xtcVar;
            mv1Var2 = mv1Var;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lj(i2, xtcVar2, mv1Var2, i3);
        }
    }

    public static final Double n0(Number number, Integer num) {
        if (num == null || num.intValue() == 0) {
            num = null;
        }
        return yid.a(number, num);
    }

    public static final void o(int i2, xtc xtcVar, dfj dfjVar, of3 of3Var, int i3, int i4) {
        int i5;
        dfj dfjVar2;
        av8 av8Var;
        xtc xtcVar2;
        dfj dfjVar3;
        int i6;
        boolean z;
        int i7;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1761178243);
        if ((i3 & 6) == 0) {
            i5 = (av8Var2.e(i2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i8 = i5 | 48;
        if ((i3 & 384) == 0) {
            if ((i4 & 4) == 0) {
                dfjVar2 = dfjVar;
                if (av8Var2.g(dfjVar2)) {
                    i7 = NotificationCompat.FLAG_LOCAL_ONLY;
                    i8 |= i7;
                }
            } else {
                dfjVar2 = dfjVar;
            }
            i7 = 128;
            i8 |= i7;
        } else {
            dfjVar2 = dfjVar;
        }
        if (av8Var2.T(i8 & 1, (i8 & 147) != 146)) {
            av8Var2.Y();
            if ((i3 & 1) == 0 || av8Var2.B()) {
                int i9 = i4 & 4;
                utc utcVar = utc.a;
                if (i9 != 0) {
                    yf8 yf8Var = xth.a;
                    dfjVar2 = xth.j();
                    i8 &= -897;
                }
                dfjVar3 = dfjVar2;
                i6 = i8;
                xtcVar2 = utcVar;
            } else {
                av8Var2.W();
                if ((i4 & 4) != 0) {
                    i8 &= -897;
                }
                dfjVar3 = dfjVar2;
                i6 = i8;
                xtcVar2 = xtcVar;
            }
            av8Var2.t();
            l8g a2 = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.m, av8Var2, 54);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, xtcVar2);
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
            j(i2, i6 & 14, av8Var2, null);
            if (i2 != 0) {
                av8Var2.d0(-12927366);
                z = true;
                q5a.w(String.valueOf(Math.abs(i2)), null, i2 < 0 ? ljg.f(av8Var2, -138960221, R.color.error, av8Var2, false) : ljg.f(av8Var2, -138959707, R.color.success, av8Var2, false), null, 0L, 0L, null, 0L, 0, false, 1, 0, dfjVar3, av8Var2, 0, ((i6 << 15) & 29360128) | 24576, 114682);
                av8Var = av8Var2;
                av8Var.s(false);
            } else {
                av8Var = av8Var2;
                z = true;
                av8Var.d0(-12718519);
                av8Var.s(false);
            }
            av8Var.s(z);
            dfjVar2 = dfjVar3;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ds6(i2, xtcVar2, dfjVar2, i3, i4);
        }
    }

    public static final boolean o0(String str) {
        str.getClass();
        return (Intrinsics.c(str, C4094gc.a) || Intrinsics.c(str, "HEAD")) ? false : true;
    }

    public static final void p(FantasyCompetitionType fantasyCompetitionType, Integer num, int i2, boolean z, xtc xtcVar, of3 of3Var, int i3) {
        fantasyCompetitionType.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1795085272);
        int i4 = i3 | (av8Var.e(fantasyCompetitionType.ordinal()) ? 4 : 2) | (av8Var.g(num) ? 32 : 16) | (av8Var.e(i2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z) ? a.o : 1024);
        if (av8Var.T(i4 & 1, (i4 & 9363) != 9362)) {
            int i5 = rs9.a[fantasyCompetitionType.ordinal()];
            if (i5 == 1) {
                av8Var.d0(747798290);
                q(num, i2, z, bkh.l(xtcVar, 24.0f), av8Var, (i4 >> 3) & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
                av8Var.s(false);
            } else {
                if (i5 != 2) {
                    throw dmi.h(av8Var, -1499899870, false);
                }
                av8Var.d0(748100323);
                kq9.b(s6a.N(R.drawable.ic_leagues, 6, av8Var), null, bkh.l(xtcVar, 24.0f), lz.D(R.color.value, av8Var), av8Var, 48, 0);
                av8Var = av8Var;
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s73(fantasyCompetitionType, num, i2, z, xtcVar, i3, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void p0(tc3 tc3Var, sq3 sq3Var) {
        ky8 ky8Var;
        int i2;
        if (sq3Var instanceof ky8) {
            ky8Var = (ky8) sq3Var;
            int i3 = ky8Var.s;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ky8Var.s = i3 - Integer.MIN_VALUE;
                Object obj = ky8Var.r;
                lu3 lu3Var = lu3.a;
                i2 = ky8Var.s;
                if (i2 == 0) {
                    if (i2 == 1) {
                        throw wt3.i(obj);
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return;
                }
                y6a.M(obj);
                lp3 lp3Var = (lp3) ky8Var.getContext().get(wxf.e);
                if (lp3Var == null) {
                    a70.r("provideContent requires a ContentReceiver and should only be called from GlanceAppWidget.provideGlance");
                    return;
                } else {
                    ky8Var.s = 1;
                    ((cf0) lp3Var).a(tc3Var, ky8Var);
                    return;
                }
            }
        }
        ky8Var = new ky8(sq3Var);
        Object obj2 = ky8Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = ky8Var.s;
        if (i2 == 0) {
        }
    }

    public static final void q(Integer num, int i2, boolean z, xtc xtcVar, of3 of3Var, int i3) {
        int i4;
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-802438811);
        if ((i3 & 6) == 0) {
            i4 = (av8Var.g(num) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= av8Var.e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= av8Var.g(xtcVar) ? a.o : 1024;
        }
        if (!av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
            xtcVar2 = xtcVar;
            av8Var.W();
        } else if (num == null || !z) {
            xtcVar2 = xtcVar;
            av8Var.d0(333550801);
            i(Integer.valueOf(i2), xtcVar2, av8Var, ((i4 >> 6) & 112) | ((i4 >> 3) & 14));
            av8Var.s(false);
        } else {
            av8Var.d0(333664323);
            xtcVar2 = xtcVar;
            y(num.intValue(), (i4 & 14) | ((i4 >> 6) & 112), 12, av8Var, xtcVar2, null, false);
            av8Var.s(false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x80(num, i2, z, xtcVar2, i3);
        }
    }

    public static long q0(int i2, byte[] bArr) {
        int i3 = bArr[i2];
        int i4 = bArr[i2 + 1];
        int i5 = bArr[i2 + 2];
        int i6 = bArr[i2 + 3];
        if ((i3 & 128) == 128) {
            i3 = (i3 & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) + 128;
        }
        if ((i6 & 128) == 128) {
            i6 = (i6 & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) + 128;
        }
        return (i3 << 24) + (i4 << 16) + (i5 << 8) + i6;
    }

    public static final void r(int i2, of3 of3Var, xtc xtcVar) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(917334433);
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            xtc b0 = l98.b0(n9e.q(wnn.A(l98.b0(xtcVar, 16.0f), o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var), oyn.e), 16.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
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
            String v = oea.v(R.string.fantasy_placeholder_round_message_title, av8Var);
            yf8 yf8Var = xth.a;
            dfj i3 = xth.i();
            long D = lz.D(R.color.n_lv_1, av8Var);
            utc utcVar = utc.a;
            udj.c(v, bkh.d(utcVar, 1.0f), D, null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, i3, av8Var, 48, 24576, 114680);
            udj.c(bf3.g(16.0f, R.string.fantasy_placeholder_round_message_body, av8Var, av8Var, utcVar), bkh.d(utcVar, 1.0f), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 48, 0, 131064);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l63(xtcVar, i2, 12);
        }
    }

    public static long r0(int i2, byte[] bArr) {
        long q0 = q0(i2, bArr);
        long q02 = q0(i2 + 4, bArr);
        if (q0 == 0 && q02 == 0) {
            return 0L;
        }
        return ((q02 * 1000) / 4294967296L) + ((q0 - 2208988800L) * 1000);
    }

    public static final void s(int i2, int i3, of3 of3Var, xtc xtcVar, boolean z) {
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1665486322);
        if ((i3 & 6) == 0) {
            i4 = (av8Var.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            if (z) {
                av8Var.d0(1040979705);
                d7e t = haa.t(R.drawable.ic_jersey_placeholder, 0, av8Var);
                haa.b(((Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/") + "fantasy/player/" + i2 + "/image").concat("/restricted"), null, xtcVar, haa.t(R.drawable.ic_jersey_placeholder, 0, av8Var), t, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, (i4 & 896) | 36912, 0, 32736);
                av8Var.s(false);
            } else {
                av8Var.d0(1041347582);
                d7e t2 = haa.t(R.drawable.player_photo_placeholder, 0, av8Var);
                d7e t3 = haa.t(R.drawable.player_photo_placeholder, 0, av8Var);
                String j2 = vxd.j(i2, (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "fantasy/player/", "/image");
                n7g n7gVar = o7g.a;
                haa.b(j2, null, yso.o(wnn.A(xtcVar, n7gVar), 1.0f, lz.D(R.color.n_lv_4, av8Var), n7gVar), t3, t2, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 36912, 0, 32736);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ms9(i2, xtcVar, z, i3);
        }
    }

    public static final rsk s0(wma wmaVar) {
        rsk rskVar = wmaVar.o;
        if (rskVar != null) {
            return rskVar;
        }
        throw wt3.j("Required value was null.");
    }

    public static final void t(int i2, int i3, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1762241729);
        int i4 = (av8Var.e(i2) ? 4 : 2) | i3;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            xtcVar2 = xtcVar;
            haa.b(vxd.j(i2, (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "fantasy/competition/", "/officialPartnerLogo"), null, xtcVar2, wv8.c(lz.D(R.color.neutral_default, av8Var), 5, haa.t(R.drawable.cup_logo_placeholder, 0, av8Var), 12), wv8.c(lz.D(R.color.neutral_default, av8Var), 5, haa.t(R.drawable.cup_logo_placeholder, 0, av8Var), 12), null, mp3.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 37296, 6, 31712);
        } else {
            xtcVar2 = xtcVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xz(i2, xtcVar2, i3, 14);
        }
    }

    public static final Object t0(CoroutineContext coroutineContext, Function2 function2) {
        g26 g26Var;
        CoroutineContext a2;
        long r0;
        if (((d) coroutineContext.get(d.Q7)) == null) {
            g26Var = cgj.a();
            a2 = yt3.a(g.a, coroutineContext.plus(g26Var), true);
            hs4 hs4Var = z45.a;
            if (a2 != hs4Var && a2.get(d.Q7) == null) {
                a2 = a2.plus(hs4Var);
            }
        } else {
            g26Var = (g26) cgj.a.get();
            a2 = yt3.a(g.a, coroutineContext, true);
            hs4 hs4Var2 = z45.a;
            if (a2 != hs4Var2 && a2.get(d.Q7) == null) {
                a2 = a2.plus(hs4Var2);
            }
        }
        my1 my1Var = new my1(a2, Thread.currentThread(), g26Var);
        my1Var.l0(nu3.a, my1Var, function2);
        g26 g26Var2 = my1Var.f;
        if (g26Var2 != null) {
            int i2 = g26.f;
            g26Var2.n0(false);
        }
        while (true) {
            if (g26Var2 != null) {
                try {
                    r0 = g26Var2.r0();
                } catch (Throwable th) {
                    if (g26Var2 != null) {
                        int i3 = g26.f;
                        g26Var2.g0(false);
                    }
                    throw th;
                }
            } else {
                r0 = Long.MAX_VALUE;
            }
            if (my1Var.t()) {
                break;
            }
            LockSupport.parkNanos(my1Var, r0);
            if (Thread.interrupted()) {
                my1Var.x(new InterruptedException());
            }
        }
        if (g26Var2 != null) {
            int i4 = g26.f;
            g26Var2.g0(false);
        }
        Object a3 = lea.a(my1Var.O());
        eb3 eb3Var = a3 instanceof eb3 ? (eb3) a3 : null;
        if (eb3Var == null) {
            return a3;
        }
        throw eb3Var.a;
    }

    public static final void u(int i2, int i3, of3 of3Var, xtc xtcVar) {
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-508571788);
        if ((i3 & 6) == 0) {
            i4 = (av8Var.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        int i5 = 5;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            haa.b(vxd.j(i2, (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "fantasy/team/", "/image"), null, xtcVar, wv8.c(lz.D(R.color.neutral_default, av8Var), 5, haa.t(R.drawable.team_logo_placeholder, 0, av8Var), 12), wv8.c(lz.D(R.color.neutral_default, av8Var), 5, haa.t(R.drawable.team_logo_placeholder, 0, av8Var), 12), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, ((i4 << 3) & 896) | 36912, 0, 32736);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hn1(i2, xtcVar, i3, i5);
        }
    }

    public static Object u0(Function2 function2) {
        return t0(g.a, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void v(final String str, long j2, boolean z, of3 of3Var, final int i2, final int i3) {
        boolean z2;
        final long j3;
        eqf u;
        int i4;
        long D;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1896043538);
        int i5 = (av8Var.g(str) ? 4 : 2) | i2;
        int i6 = i5 | 16;
        int i7 = i3 & 4;
        if (i7 != 0) {
            i6 = i5 | 400;
        } else if ((i2 & 384) == 0) {
            z2 = z;
            i6 |= av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            if (av8Var.T(i6 & 1, (i6 & 147) == 146)) {
                av8Var.W();
                j3 = j2;
            } else {
                av8Var.Y();
                if ((i2 & 1) == 0 || av8Var.B()) {
                    i4 = i6 & (-113);
                    D = lz.D(R.color.n_lv_3, av8Var);
                    if (i7 != 0) {
                        z2 = false;
                    }
                } else {
                    av8Var.W();
                    i4 = i6 & (-113);
                    D = j2;
                }
                av8Var.t();
                av8Var.d0(1031714558);
                xtc q = n9e.q(bkh.c, lz.D(R.color.n_lv_4, av8Var), oyn.e);
                int i8 = 8;
                if (z2) {
                    Object O = av8Var.O();
                    if (O == nf3.a) {
                        O = new yo9(i8);
                        av8Var.n0(O);
                    }
                    q = q.z(Z(utc.a, (Function1) O));
                }
                av8Var.s(false);
                haa.b(str, "", q, wv8.c(D, 5, haa.t(R.drawable.sofascore_lockup, 0, av8Var), 8), wv8.c(D, 5, haa.t(R.drawable.sofascore_lockup, 0, av8Var), 8), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, (i4 & 14) | 36912, 6, 31712);
                j3 = D;
            }
            final boolean z3 = z2;
            u = av8Var.u();
            if (u == null) {
                u.d = new Function2() { // from class: os9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        td4.v(str, j3, z3, (of3) obj, aba.K(i2 | 1), i3);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        z2 = z;
        if (av8Var.T(i6 & 1, (i6 & 147) == 146)) {
        }
        final boolean z32 = z2;
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void v0(ucd ucdVar, int i2) {
        if (i2 == 0) {
            throw null;
        }
        ucdVar.a.a[0].f.c = wt3.c(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void w(xtc xtcVar, float f2, long j2, of3 of3Var, int i2, int i3) {
        int i4;
        float f3;
        boolean z;
        Object O;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(75144485);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (av8Var.g(xtcVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= av8Var.d(f2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var.f(j2) ? 256 : 128;
        }
        int i7 = 1;
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            av8Var.Y();
            if ((i2 & 1) == 0 || av8Var.B()) {
                if (i5 != 0) {
                    xtcVar = utc.a;
                }
                if (i6 != 0) {
                    f3 = j65.a;
                    av8Var.t();
                    xtc e2 = bkh.e(bkh.d(xtcVar, 1.0f), f3);
                    z = ((((i4 & 896) ^ 384) <= 256 && av8Var.f(j2)) || (i4 & 384) == 256) | ((i4 & 112) != 32);
                    O = av8Var.O();
                    if (!z || O == nf3.a) {
                        O = new l65(j2, i7, f3);
                        av8Var.n0(O);
                    }
                    lz.d(0, av8Var, e2, (Function1) O);
                }
            } else {
                av8Var.W();
            }
            f3 = f2;
            av8Var.t();
            xtc e22 = bkh.e(bkh.d(xtcVar, 1.0f), f3);
            if ((i4 & 112) != 32) {
            }
            z = ((((i4 & 896) ^ 384) <= 256 && av8Var.f(j2)) || (i4 & 384) == 256) | ((i4 & 112) != 32);
            O = av8Var.O();
            if (!z) {
            }
            O = new l65(j2, i7, f3);
            av8Var.n0(O);
            lz.d(0, av8Var, e22, (Function1) O);
        } else {
            av8Var.W();
            f3 = f2;
        }
        xtc xtcVar2 = xtcVar;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new m65(f3, i2, i3, 1, j2, xtcVar2);
        }
    }

    public static void w0(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static final void x(String str, String str2, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1217473458);
        int i3 = i2 | (av8Var.g(str) ? 4 : 2) | (av8Var.g(str2) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) av8Var.k(nz.b);
            ht9 ht9Var = new ht9(context);
            ht9Var.c = str;
            ht9Var.f = str2;
            ht9Var.i = str2;
            ht9Var.c(str2);
            z8e.Q(ht9Var, context, R.drawable.ic_jersey_placeholder, null, null);
            haa.b(ht9Var.a(), null, xtcVar, haa.t(R.drawable.ic_jersey_placeholder, 0, av8Var), haa.t(R.drawable.ic_jersey_placeholder, 0, av8Var), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, (i3 & 896) | 36912, 0, 32736);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cv3(str, str2, xtcVar, i2, 4);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final ex8 x0(CharSequence charSequence, String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -781118336:
                if (str.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    return new dx8(charSequence, 3);
                }
                break;
            case -408155724:
                if (str.equals("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new hx8(charSequence);
                }
                break;
            case -45448328:
                if (str.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    return new dx8(charSequence, 1);
                }
                break;
            case 580557411:
                if (str.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    return new bx8(charSequence);
                }
                break;
            case 627896683:
                if (str.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    return new cdd(charSequence);
                }
                break;
            case 1594095913:
                if (str.equals("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new dx8(charSequence, 2);
                }
                break;
        }
        if (!c.v(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
            return new dx8(charSequence, str);
        }
        int i2 = nx8.c;
        String obj = charSequence != null ? charSequence.toString() : null;
        try {
            if (!c.v(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                throw new lr8();
            }
            int i3 = nx8.c;
            return zm2.t(str, obj);
        } catch (lr8 unused) {
            return new dx8(obj, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void y(int i2, int i3, int i4, of3 of3Var, xtc xtcVar, Integer num, boolean z) {
        int i5;
        xtc xtcVar2;
        Integer num2;
        boolean z2;
        Integer num3;
        boolean z3;
        eqf u;
        int i6;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1304503427);
        if ((i3 & 6) == 0) {
            i5 = (av8Var.e(i2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            xtcVar2 = xtcVar;
            i5 |= av8Var.g(xtcVar2) ? 32 : 16;
        } else {
            xtcVar2 = xtcVar;
        }
        int i7 = i4 & 4;
        if (i7 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            num2 = num;
            i5 |= av8Var.g(num2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            if ((i3 & 3072) != 0) {
                if ((i4 & 8) == 0) {
                    z2 = z;
                    if (av8Var.h(z2)) {
                        i6 = a.o;
                        i5 |= i6;
                    }
                } else {
                    z2 = z;
                }
                i6 = 1024;
                i5 |= i6;
            } else {
                z2 = z;
            }
            if (av8Var.T(i5 & 1, (i5 & 1171) == 1170)) {
                av8Var.W();
                num3 = num2;
                z3 = z2;
            } else {
                av8Var.Y();
                if ((i3 & 1) == 0 || av8Var.B()) {
                    num3 = i7 != 0 ? null : num2;
                    if ((i4 & 8) != 0) {
                        z3 = hkg.b0((Context) av8Var.k(nz.b));
                        i5 &= -7169;
                        av8Var.t();
                        gn8 c2 = wv8.c(lz.D(R.color.neutral_default, av8Var), 5, haa.t(R.drawable.cup_logo_placeholder, 0, av8Var), 12);
                        haa.b(pco.I(num3 != null ? num3.intValue() : 0, Integer.valueOf(i2), z3), null, xtcVar2, wv8.c(lz.D(R.color.neutral_default, av8Var), 5, haa.t(R.drawable.cup_logo_placeholder, 0, av8Var), 12), c2, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, ((i5 << 3) & 896) | 36912, 0, 32736);
                    }
                } else {
                    av8Var.W();
                    if ((i4 & 8) != 0) {
                        i5 &= -7169;
                    }
                    num3 = num2;
                }
                z3 = z2;
                av8Var.t();
                gn8 c22 = wv8.c(lz.D(R.color.neutral_default, av8Var), 5, haa.t(R.drawable.cup_logo_placeholder, 0, av8Var), 12);
                haa.b(pco.I(num3 != null ? num3.intValue() : 0, Integer.valueOf(i2), z3), null, xtcVar2, wv8.c(lz.D(R.color.neutral_default, av8Var), 5, haa.t(R.drawable.cup_logo_placeholder, 0, av8Var), 12), c22, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, ((i5 << 3) & 896) | 36912, 0, 32736);
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new is9(i2, xtcVar, num3, z3, i3, i4);
                return;
            }
            return;
        }
        num2 = num;
        if ((i3 & 3072) != 0) {
        }
        if (av8Var.T(i5 & 1, (i5 & 1171) == 1170)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object y0(t01 t01Var, Context context, sq3 sq3Var) {
        ly8 ly8Var;
        int i2;
        t01 t01Var2;
        Iterator it;
        if (sq3Var instanceof ly8) {
            ly8Var = (ly8) sq3Var;
            int i3 = ly8Var.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ly8Var.v = i3 - Integer.MIN_VALUE;
                Object obj = ly8Var.u;
                Object obj2 = lu3.a;
                i2 = ly8Var.v;
                if (i2 != 0) {
                    y6a.M(obj);
                    ry8 ry8Var = new ry8(context);
                    Class<?> cls = t01Var.getClass();
                    ly8Var.r = t01Var;
                    ly8Var.s = context;
                    ly8Var.v = 1;
                    obj = ry8Var.a(cls, ly8Var);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it = ly8Var.t;
                        context = ly8Var.s;
                        t01Var2 = ly8Var.r;
                        y6a.M(obj);
                        while (it.hasNext()) {
                            re0 re0Var = (re0) it.next();
                            ly8Var.r = t01Var2;
                            ly8Var.s = context;
                            ly8Var.t = it;
                            ly8Var.v = 2;
                            if (t01Var2.L(context, re0Var, ly8Var) == obj2) {
                                return obj2;
                            }
                        }
                        return Unit.a;
                    }
                    context = ly8Var.s;
                    t01Var = ly8Var.r;
                    y6a.M(obj);
                }
                t01Var2 = t01Var;
                it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                }
                return Unit.a;
            }
        }
        ly8Var = new ly8(sq3Var);
        Object obj3 = ly8Var.u;
        Object obj22 = lu3.a;
        i2 = ly8Var.v;
        if (i2 != 0) {
        }
        t01Var2 = t01Var;
        it = ((Iterable) obj3).iterator();
        while (it.hasNext()) {
        }
        return Unit.a;
    }

    public static final void z(Integer num, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1818411344);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var2.g(num) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (!av8Var2.T(i3 & 1, (i3 & 19) != 18)) {
            av8Var = av8Var2;
            av8Var.W();
        } else if (num != null) {
            av8Var2.d0(-130026444);
            d7e t = haa.t(R.drawable.manager_photo_placeholder, 0, av8Var2);
            d7e t2 = haa.t(R.drawable.manager_photo_placeholder, 0, av8Var2);
            String K = pco.K(num.intValue());
            n7g n7gVar = o7g.a;
            av8Var = av8Var2;
            haa.b(K, null, yso.o(wnn.A(xtcVar, n7gVar), 1.0f, lz.D(R.color.n_lv_4, av8Var2), n7gVar), t2, t, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 36912, 0, 32736);
            av8Var.s(false);
        } else {
            av8Var = av8Var2;
            av8Var.d0(-129501893);
            ImageVector N = s6a.N(R.drawable.manager_photo_placeholder, 6, av8Var);
            long j2 = r13.i;
            n7g n7gVar2 = o7g.a;
            kq9.b(N, null, yso.o(wnn.A(xtcVar, n7gVar2), 1.0f, lz.D(R.color.n_lv_4, av8Var), n7gVar2), j2, av8Var, 3120, 0);
            av8Var.s(false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gs9(num, xtcVar, i2, 1, (byte) 0);
        }
    }

    public static final void z0(of3 of3Var, xtc xtcVar, int i2, kx4 kx4Var, u6b u6bVar, qqg qqgVar, ema emaVar, aee aeeVar) {
        if3.k7.getClass();
        waa.K(of3Var, aeeVar, hf3.f);
        waa.K(of3Var, xtcVar, f50.o);
        waa.K(of3Var, kx4Var, f50.p);
        waa.K(of3Var, u6bVar, f50.q);
        waa.K(of3Var, qqgVar, f50.r);
        waa.K(of3Var, emaVar, f50.s);
        waa.K(of3Var, Integer.valueOf(i2), hf3.j);
    }

    public abstract void R(nlg nlgVar, Object obj);

    public abstract String W();

    public int e0(glg glgVar, Object obj) {
        glgVar.getClass();
        if (obj == null) {
            return 0;
        }
        nlg V0 = glgVar.V0(W());
        try {
            R(V0, obj);
            V0.U0();
            o1j.t(V0, null);
            return u0a.y(glgVar);
        } finally {
        }
    }

    public int f0(glg glgVar, Iterable iterable) {
        int i2 = 0;
        if (iterable == null) {
            return 0;
        }
        nlg V0 = glgVar.V0(W());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    R(V0, obj);
                    V0.U0();
                    V0.reset();
                    i2 += u0a.y(glgVar);
                }
            }
            Unit unit = Unit.a;
            o1j.t(V0, null);
            return i2;
        } finally {
        }
    }
}
