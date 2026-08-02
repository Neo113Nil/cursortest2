package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.U3;
import com.ironsource.V2;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.sofascore.model.profile.InvitedUser;
import com.sofascore.results.R;
import com.sofascore.results.league.fragment.details.compose.totr.share.TotrSharePayload;
import com.sofascore.results.league.fragment.topStats.TopStatsCategory;
import com.sofascore.results.service.NotificationWorker;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Encoder;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class mha {
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static Context e;
    public final /* synthetic */ int a = 13;

    public static final ktd A(ktd ktdVar) {
        return (ktd) ktdVar.d(zy0.a, 20L, TimeUnit.SECONDS);
    }

    public static long B(String str) {
        long j;
        int length = str.length();
        str.getClass();
        long j2 = 0;
        if (length < 0) {
            ogj.h(dmi.k(length, 0, "endIndex < beginIndex: ", " < "));
            return 0L;
        }
        if (length > str.length()) {
            ogj.e(str.length(), lnb.t(length, "endIndex > string.length: ", " > "));
            return 0L;
        }
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                j2++;
            } else {
                if (charAt < 2048) {
                    j = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    j = 3;
                } else {
                    int i2 = i + 1;
                    char charAt2 = i2 < length ? str.charAt(i2) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j2++;
                        i = i2;
                    } else {
                        j2 += 4;
                        i += 2;
                    }
                }
                j2 += j;
            }
            i++;
        }
        return j2;
    }

    public static void C(nm2 nm2Var) {
        nm2Var.t(3);
        nm2Var.t(8);
        boolean h = nm2Var.h();
        boolean h2 = nm2Var.h();
        if (h) {
            nm2Var.t(5);
        }
        if (h2) {
            nm2Var.t(6);
        }
    }

    public static void D(nm2 nm2Var) {
        int i;
        int i2 = nm2Var.i(2);
        if (i2 == 0) {
            nm2Var.t(6);
            return;
        }
        int w = w(nm2Var, 5, 8, 16) + 1;
        if (i2 == 1) {
            nm2Var.t(w * 7);
            return;
        }
        if (i2 == 2) {
            boolean h = nm2Var.h();
            int i3 = h ? 1 : 5;
            int i4 = h ? 7 : 5;
            int i5 = h ? 8 : 6;
            int i6 = 0;
            while (i6 < w) {
                if (nm2Var.h()) {
                    nm2Var.t(7);
                    i = 0;
                } else {
                    if (nm2Var.i(2) == 3 && nm2Var.i(i4) * i3 != 0) {
                        nm2Var.s();
                    }
                    i = nm2Var.i(i5) * i3;
                    if (i != 0 && i != 180) {
                        nm2Var.s();
                    }
                    nm2Var.s();
                }
                if (i != 0 && i != 180 && nm2Var.h()) {
                    i6++;
                }
                i6++;
            }
        }
    }

    public static final String E(Object[] objArr, int i, int i2, v6 v6Var) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append(U3.j.d);
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == v6Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append(U3.j.e);
        return sb.toString();
    }

    public static void F(Context context) {
        Pair[] pairArr = {wv8.t(context, "ACTION", "UPDATE")};
        hpo hpoVar = new hpo(18);
        Pair pair = pairArr[0];
        hpoVar.B(pair.b, (String) pair.a);
        md4 l = hpoVar.l();
        vxd.h(context).b("NotificationWorker-".concat(o(l)), nf6.a, (ltd) vxd.g(NotificationWorker.class, l).a());
    }

    public static final xtc G(xtc xtcVar, float f) {
        return xtcVar.z(new nol(f));
    }

    public static String H(byte[] bArr) {
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

    public static void I(ddb ddbVar, z7p z7pVar, Executor executor) {
        ddbVar.addListener(new a8p(0, ddbVar, z7pVar), executor);
    }

    public static Object J(Future future) {
        Object obj;
        if (!future.isDone()) {
            a70.r(wca.O("Future was expected to be done: %s", future));
            return null;
        }
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final void a(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(490151487);
        if (av8Var.T(i & 1, i != 0)) {
            utc utcVar = utc.a;
            xtc l = bkh.l(utcVar, 16.0f);
            long D = lz.D(R.color.surface_1, av8Var);
            n7g n7gVar = o7g.a;
            xtc o = yso.o(n9e.q(l, D, n7gVar), 1.0f, lz.D(R.color.n_lv_4, av8Var), n7gVar);
            k1c c2 = e12.c(uxf.g, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, o);
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
            kq9.b(s6a.N(R.drawable.ic_cross_16, 6, av8Var), null, bkh.l(utcVar, 12.0f), lz.D(R.color.error, av8Var), av8Var, 432, 0);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mpa(i, 24);
        }
    }

    public static final void b(final String str, final dfj dfjVar, xtc xtcVar, int i, final long j, float f, int i2, long j2, long j3, of3 of3Var, final int i3) {
        final xtc xtcVar2;
        final int i4;
        final float f2;
        final int i5;
        final long j4;
        final long j5;
        int i6;
        float f3;
        int i7;
        long Q;
        long j6;
        int i8;
        xtc xtcVar3;
        float f4;
        int i9;
        xtc xtcVar4;
        str.getClass();
        dfjVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1703755794);
        int i10 = i3 | (av8Var.g(str) ? 4 : 2) | (av8Var.g(dfjVar) ? 32 : 16) | 1408 | (av8Var.f(j) ? 16384 : 8192) | 316145664;
        if (av8Var.T(i10 & 1, (306783379 & i10) != 306783378)) {
            av8Var.Y();
            int i11 = i3 & 1;
            utc utcVar = utc.a;
            if (i11 == 0 || av8Var.B()) {
                wd5 wd5Var = xd5.b;
                i6 = 5;
                f3 = 24.0f;
                i7 = Integer.MAX_VALUE;
                Q = wkn.Q(1.2d, be5.SECONDS);
                j6 = Q;
                i8 = i10 & (-2113936385);
                xtcVar3 = utcVar;
            } else {
                av8Var.W();
                i6 = i;
                f3 = f;
                i7 = i2;
                Q = j2;
                j6 = j3;
                i8 = i10 & (-2113936385);
                xtcVar3 = xtcVar;
            }
            av8Var.t();
            int i12 = i8 & 14;
            boolean z = i12 == 4;
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (z || O == obj) {
                O = e.f(null);
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            boolean z2 = Build.VERSION.SDK_INT > 28;
            mv1 mv1Var = uxf.g;
            boolean z3 = z2;
            av8Var.d0(-926757063);
            if (Intrinsics.c((Boolean) e1dVar.getValue(), Boolean.TRUE) && z3) {
                Object O2 = av8Var.O();
                if (O2 == obj) {
                    O2 = new abb(20);
                    av8Var.n0(O2);
                }
                xtc M = s02.M(utcVar, (Function1) O2);
                Object O3 = av8Var.O();
                if (O3 == obj) {
                    O3 = new abb(21);
                    av8Var.n0(O3);
                }
                float f5 = f3;
                int i13 = i7;
                i9 = i13;
                f4 = f5;
                xtcVar4 = xtcVar3.z(tgj.s(td4.Z(M, (Function1) O3), i13, (int) xd5.e(Q), (int) xd5.e(j6), null, f5, 18));
            } else {
                f4 = f3;
                i9 = i7;
                xtcVar4 = xtcVar3;
            }
            av8Var.s(false);
            k1c c2 = e12.c(mv1Var, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar4);
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
            int i14 = z3 ? 1 : 2;
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            p7j p7jVar = new p7j(i6);
            boolean g = av8Var.g(e1dVar);
            Object O4 = av8Var.O();
            if (g || O4 == obj) {
                O4 = new fw6(17, e1dVar);
                av8Var.n0(O4);
            }
            udj.c(str, d0, j, null, 0L, null, 0L, null, p7jVar, 0L, i14, false, 1, 0, (Function1) O4, dfjVar, av8Var, i12 | ((i8 >> 6) & 896), 24576 | ((i8 << 18) & 29360128), 44024);
            av8Var = av8Var;
            av8Var.s(true);
            j4 = Q;
            j5 = j6;
            f2 = f4;
            i5 = i9;
            xtcVar2 = xtcVar3;
            i4 = i6;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
            i4 = i;
            f2 = f;
            i5 = i2;
            j4 = j2;
            j5 = j3;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(str, dfjVar, xtcVar2, i4, j, f2, i5, j4, j5, i3) { // from class: ivb
                public final /* synthetic */ String a;
                public final /* synthetic */ dfj b;
                public final /* synthetic */ xtc c;
                public final /* synthetic */ int d;
                public final /* synthetic */ long e;
                public final /* synthetic */ float f;
                public final /* synthetic */ int g;
                public final /* synthetic */ long h;
                public final /* synthetic */ long i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int K = aba.K(196609);
                    mha.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (of3) obj2, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(zzd zzdVar, Function0 function0, of3 of3Var, int i) {
        zzd zzdVar2;
        xtc xtcVar;
        long f;
        boolean z;
        long f2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1585646265);
        int i2 = i | (av8Var.g(zzdVar) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc g = bkh.g(n9e.q(wnn.A(l98.c0(bkh.d(utcVar, 1.0f), 16.0f, 4.0f), o7g.a(16.0f)), lz.D(R.color.surface_2, av8Var), oyn.e), 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            boolean z2 = zzdVar.f;
            boolean z3 = zzdVar.a;
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
                O2 = jxa.t;
                av8Var.n0(O2);
            }
            xtc c0 = l98.c0(tol.y(g, z2, true, true, D, wzcVar, new p28((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function0, 19), av8Var, 0), 8.0f, 4.0f);
            lv1 lv1Var = uxf.m;
            wxf wxfVar = ww9.b;
            l8g a = k8g.a(wxfVar, lv1Var, av8Var, 48);
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
            waa.K(av8Var, a, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            xtc l = bkh.l(utcVar, 16.0f);
            ImageVector N = s6a.N(z3 ? R.drawable.ic_transfer_in_16 : R.drawable.ic_transfer_out_16, 6, av8Var);
            if (z3) {
                xtcVar = l;
                f = ljg.f(av8Var, -1189038463, R.color.success, av8Var, false);
            } else {
                xtcVar = l;
                f = ljg.f(av8Var, -1189037889, R.color.error, av8Var, false);
            }
            kq9.b(N, null, xtcVar, f, av8Var, 432, 0);
            nq8.h(av8Var, bkh.p(utcVar, 4.0f));
            xtc q = bkh.q(utcVar, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            String str = zzdVar.c;
            yf8 yf8Var = xth.a;
            dfj b2 = xth.b();
            if (z3) {
                z = false;
                f2 = ljg.f(av8Var, -1189028639, R.color.success, av8Var, false);
            } else {
                z = false;
                f2 = ljg.f(av8Var, -1189028065, R.color.error, av8Var, false);
            }
            udj.c(str, q, f2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, b2, av8Var, 48, 0, 131064);
            nq8.h(av8Var, bkh.p(utcVar, 4.0f));
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, goaVar);
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
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            zzdVar2 = zzdVar;
            udj.c(zzdVar.b, new goa(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, false), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110584);
            av8Var = av8Var;
            av8Var.d0(-1343092776);
            if (Boolean.valueOf(zzdVar2.e).equals(Boolean.TRUE)) {
                nq8.h(av8Var, bkh.p(utcVar, 2.0f));
                a(0, av8Var);
                Unit unit = Unit.a;
            }
            av8Var.s(false);
            av8Var.s(true);
            Integer num = zzdVar2.d;
            if (num == null) {
                av8Var.d0(1795491083);
                av8Var.s(false);
            } else {
                av8Var.d0(1795491084);
                td4.C(num.intValue(), ljg.i(utcVar, 4.0f, av8Var, utcVar, 24.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 48, 12);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            zzdVar2 = zzdVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new op9(zzdVar2, function0, i, 22);
        }
    }

    public static final void d(boolean z, boolean z2, boolean z3, int i, ox1 ox1Var, Function0 function0, of3 of3Var, int i2) {
        zg3 zg3Var;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1679171301);
        int i3 = i2 | (av8Var.h(z) ? 4 : 2) | (av8Var.h(z2) ? 32 : 16) | (av8Var.h(z3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.e(i) ? a.o : 1024) | (av8Var.i(ox1Var) ? 16384 : 8192) | (av8Var.i(function0) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var.T(i3 & 1, (74899 & i3) != 74898)) {
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = e.f(Boolean.TRUE);
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
            long D = lz.D(R.color.primary_highlight, av8Var);
            jf9 jf9Var = oyn.e;
            xtc q = n9e.q(d2, D, jf9Var);
            u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, q);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            xtc f0 = l98.f0(tol.y(bkh.b(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 56.0f, 1), ((Boolean) e1dVar.getValue()).booleanValue() && !z3, false, false, 0L, null, function0, av8Var, 30), 20.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, f0);
            av8Var.h0();
            if (av8Var.S) {
                zg3Var = zg3Var2;
                av8Var.l(zg3Var);
            } else {
                zg3Var = zg3Var2;
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            xtc a2 = n12.a.a(utcVar, uxf.g);
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, a2);
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
            kq9.b(s6a.N(R.drawable.flag_pinned, 6, av8Var), null, bkh.l(utcVar, 32.0f), r13.i, av8Var, V2.b.f, 0);
            String f = fc6.f(20.0f, R.string.pinned_list, av8Var, av8Var, utcVar);
            long D2 = lz.D(R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            dfj d3 = xth.d();
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            udj.c(f, new goa(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), D2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, d3, av8Var, 0, 0, 131064);
            av8Var = av8Var;
            fz8.d(z && z2, null, uo5.e(null, 3), uo5.f(null, 3), null, yqo.H(925077661, av8Var, new yya(9, ox1Var, e1dVar)), av8Var, 1600518, 18);
            fz8.d(((Boolean) e1dVar.getValue()).booleanValue() && !z3, null, null, null, null, yqo.H(-118995436, av8Var, new s28(i, z)), av8Var, 1572870, 30);
            av8Var.s(true);
            av8Var.s(true);
            if (z3) {
                av8Var.d0(581002278);
                udj.c(oea.v(R.string.pinned_tutorial_body_1, av8Var), l98.e0(n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_1, av8Var), jf9Var), 56.0f, 8.0f, 56.0f, 16.0f), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(1), 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 130040);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                av8Var.d0(581597447);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ny6(z, z2, z3, i, ox1Var, function0, i2);
        }
    }

    public static final void e(Function0 function0, Function0 function02, of3 of3Var, int i) {
        function0.getClass();
        function02.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1864073360);
        int i2 = (av8Var.i(function0) ? 4 : 2) | i | (av8Var.i(function02) ? 32 : 16);
        int i3 = 18;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            un0.a(bkh.d(l98.d0(utc.a, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 1.0f), o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(1772842206, av8Var, new yya(i3, function0, function02)), av8Var, 196614, 24);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gme(function0, function02, i, 24);
        }
    }

    public static final void f(InvitedUser invitedUser, boolean z, Function0 function0, Function0 function02, of3 of3Var, int i) {
        function0.getClass();
        function02.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1838902230);
        int i2 = (av8Var.i(invitedUser) ? 4 : 2) | i | (av8Var.h(z) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.i(function02) ? a.o : 1024;
        }
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            un0.a(bkh.d(l98.d0(utc.a, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 1.0f), o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(1596239900, av8Var, new a93(9, function0, function02, invitedUser, z)), av8Var, 196614, 24);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s73(invitedUser, z, function0, function02, i, 18);
        }
    }

    public static final void g(TotrSharePayload totrSharePayload, Function1 function1, Function1 function12, of3 of3Var, int i) {
        e1d e1dVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(54723172);
        int i2 = i | (av8Var.g(totrSharePayload) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            n29 a = r29.a(av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = hz8.G(g.a, av8Var);
                av8Var.n0(O);
            }
            ku3 ku3Var = (ku3) O;
            Object O2 = av8Var.O();
            rq3 rq3Var = null;
            if (O2 == a99Var) {
                O2 = e.f(null);
                av8Var.n0(O2);
            }
            e1d e1dVar2 = (e1d) O2;
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = e.f(Boolean.FALSE);
                av8Var.n0(O3);
            }
            e1d e1dVar3 = (e1d) O3;
            Unit unit = Unit.a;
            Object O4 = av8Var.O();
            int i3 = 5;
            if (O4 == a99Var) {
                O4 = new eqh(i3, e1dVar2);
                av8Var.n0(O4);
            }
            hz8.d(unit, (Function1) O4, av8Var);
            Object O5 = av8Var.O();
            int i4 = 3;
            if (O5 == a99Var) {
                O5 = new c27(e1dVar3, rq3Var, i4);
                av8Var.n0(O5);
            }
            hz8.o(av8Var, unit, (Function2) O5);
            boolean i5 = av8Var.i(a) | av8Var.i(ku3Var);
            Object O6 = av8Var.O();
            if (i5 || O6 == a99Var) {
                O6 = new lwc(a, ku3Var, e1dVar3, e1dVar2, 10);
                e1dVar = e1dVar2;
                av8Var.n0(O6);
            } else {
                e1dVar = e1dVar2;
            }
            utc utcVar = utc.a;
            int i6 = i2 & 14;
            z8e.q(totrSharePayload, td4.Z(utcVar, (Function1) O6), av8Var, i6, 0);
            xtc d2 = bkh.d(utcVar, 1.0f);
            e1d e1dVar4 = e1dVar;
            long D = lz.D(R.color.surface_0, av8Var);
            jf9 jf9Var = oyn.e;
            xtc u0 = hkg.u0(n9e.q(d2, D, jf9Var), hkg.o0(av8Var), false, 14);
            u23 a2 = t23.a(new ng0(16.0f, true, new a70(6)), uxf.o, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, u0);
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
            z8e.q(totrSharePayload, null, av8Var, i6, 2);
            xtc b0 = l98.b0(n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_P, av8Var), jf9Var), 16.0f);
            kv1 kv1Var = uxf.q;
            l8g a3 = k8g.a(new ng0(12.0f, true, new l1(kv1Var, 5)), uxf.m, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, b0);
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
            xtc q = n9e.q(wnn.A(bkh.l(utcVar, 40.0f), o7g.a(8.0f)), r13.c(lz.D(R.color.primary_default, av8Var), 0.12f), jf9Var);
            boolean z = ((Bitmap) e1dVar4.getValue()) != null;
            long D2 = lz.D(R.color.n_lv_4, av8Var);
            Object O7 = av8Var.O();
            if (O7 == a99Var) {
                O7 = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O7;
            Object[] objArr = new Object[0];
            Object O8 = av8Var.O();
            if (O8 == a99Var) {
                O8 = nuh.m;
                av8Var.n0(O8);
            }
            xtc y = tol.y(q, z, true, true, D2, wzcVar, new eui((boh) o3a.N(objArr, (Function0) O8, av8Var, 48), function12, e1dVar4, 3), av8Var, 0);
            k1c c2 = e12.c(uxf.g, false);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, y);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            kq9.b(s6a.N(R.drawable.ic_download, 6, av8Var), oea.v(R.string.save, av8Var), bkh.l(utcVar, 20.0f), lz.D(R.color.primary_default, av8Var), av8Var, 384, 0);
            av8Var.s(true);
            String v = oea.v(R.string.share_image, av8Var);
            boolean z2 = ((Bitmap) e1dVar4.getValue()) != null;
            bqh bqhVar = new bqh(s6a.N(R.drawable.ic_menu_list_share, 6, av8Var), kv1Var);
            boolean z3 = (i2 & 112) == 32;
            Object O9 = av8Var.O();
            if (z3 || O9 == a99Var) {
                O9 = new s91(function1, e1dVar4, 11);
                av8Var.n0(O9);
            }
            h(v, (Function0) O9, null, kqh.a, bqhVar, z2, false, false, 0L, 0, 0, av8Var, 3072, 0, 1988);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mfh(totrSharePayload, function1, function12, i, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(final String str, final Function0 function0, xtc xtcVar, xqh xqhVar, bqh bqhVar, boolean z, boolean z2, boolean z3, long j, int i, int i2, of3 of3Var, final int i3, final int i4, final int i5) {
        int i6;
        Function0 function02;
        xtc xtcVar2;
        int i7;
        xqh xqhVar2;
        int i8;
        bqh bqhVar2;
        int i9;
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z5;
        final boolean z6;
        final int i16;
        final xtc xtcVar3;
        final xqh xqhVar3;
        final bqh bqhVar3;
        final boolean z7;
        final boolean z8;
        final long j2;
        final int i17;
        eqf u;
        int i18;
        long j3;
        str.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1377871372);
        if ((i3 & 6) == 0) {
            i6 = (av8Var.g(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            function02 = function0;
            i6 |= av8Var.i(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        int i19 = i5 & 4;
        if (i19 != 0) {
            i6 |= 384;
        } else if ((i3 & 384) == 0) {
            xtcVar2 = xtcVar;
            i6 |= av8Var.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i3 & 3072) == 0) {
                xqhVar2 = xqhVar;
                i6 |= av8Var.g(xqhVar2) ? a.o : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    bqhVar2 = bqhVar;
                    i6 |= av8Var.g(bqhVar2) ? 16384 : 8192;
                    i9 = i5 & 32;
                    if (i9 == 0) {
                        i6 |= 196608;
                    } else if ((196608 & i3) == 0) {
                        z4 = z;
                        i6 |= av8Var.h(z4) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        i10 = i5 & 64;
                        if (i10 != 0) {
                            i6 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i6 |= av8Var.h(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                        }
                        i11 = i6 | 12582912;
                        i12 = i5 & NotificationCompat.FLAG_LOCAL_ONLY;
                        if (i12 != 0) {
                            i11 = i6 | 113246208;
                        } else if ((100663296 & i3) == 0) {
                            i11 |= av8Var.f(j) ? 67108864 : 33554432;
                        }
                        i13 = i5 & 512;
                        if (i13 != 0) {
                            i11 |= 805306368;
                        } else if ((i3 & 805306368) == 0) {
                            i11 |= av8Var.e(i) ? 536870912 : 268435456;
                        }
                        i14 = i5 & 1024;
                        if (i14 != 0) {
                            i15 = 6;
                        } else if ((i4 & 6) == 0) {
                            i15 = i4 | (av8Var.e(i2) ? 4 : 2);
                        } else {
                            i15 = i4;
                        }
                        if ((i11 & 306783379) != 306783378 && (i15 & 3) == 2) {
                            z5 = false;
                            if (av8Var.T(i11 & 1, z5)) {
                                xtc xtcVar4 = i19 != 0 ? utc.a : xtcVar2;
                                xqh xqhVar4 = i7 != 0 ? kqh.a : xqhVar2;
                                bqh bqhVar4 = i8 != 0 ? null : bqhVar2;
                                boolean z9 = i9 != 0 ? true : z4;
                                boolean z10 = i10 != 0 ? false : z2;
                                if (i12 != 0) {
                                    i18 = i14;
                                    j3 = 200;
                                } else {
                                    i18 = i14;
                                    j3 = j;
                                }
                                int i20 = i13 != 0 ? 2 : i;
                                int i21 = i18 != 0 ? 1 : i2;
                                tol.b(l7a.c.a(new p75(Float.NaN)), yqo.H(1280592204, av8Var, new v77(bqhVar4, xtcVar4, function02, j3, xqhVar4, z9, z10, str, i20, i21)), av8Var, 56);
                                bqhVar3 = bqhVar4;
                                xtcVar3 = xtcVar4;
                                j2 = j3;
                                xqhVar3 = xqhVar4;
                                z7 = z9;
                                z8 = z10;
                                i17 = i20;
                                i16 = i21;
                                z6 = true;
                            } else {
                                av8Var.W();
                                z6 = z3;
                                i16 = i2;
                                xtcVar3 = xtcVar2;
                                xqhVar3 = xqhVar2;
                                bqhVar3 = bqhVar2;
                                z7 = z4;
                                z8 = z2;
                                j2 = j;
                                i17 = i;
                            }
                            u = av8Var.u();
                            if (u != null) {
                                u.d = new Function2() { // from class: cqh
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        int K = aba.K(i3 | 1);
                                        int K2 = aba.K(i4);
                                        mha.h(str, function0, xtcVar3, xqhVar3, bqhVar3, z7, z8, z6, j2, i17, i16, (of3) obj, K, K2, i5);
                                        return Unit.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        z5 = true;
                        if (av8Var.T(i11 & 1, z5)) {
                        }
                        u = av8Var.u();
                        if (u != null) {
                        }
                    }
                    z4 = z;
                    i10 = i5 & 64;
                    if (i10 != 0) {
                    }
                    i11 = i6 | 12582912;
                    i12 = i5 & NotificationCompat.FLAG_LOCAL_ONLY;
                    if (i12 != 0) {
                    }
                    i13 = i5 & 512;
                    if (i13 != 0) {
                    }
                    i14 = i5 & 1024;
                    if (i14 != 0) {
                    }
                    if ((i11 & 306783379) != 306783378) {
                        z5 = false;
                        if (av8Var.T(i11 & 1, z5)) {
                        }
                        u = av8Var.u();
                        if (u != null) {
                        }
                    }
                    z5 = true;
                    if (av8Var.T(i11 & 1, z5)) {
                    }
                    u = av8Var.u();
                    if (u != null) {
                    }
                }
                bqhVar2 = bqhVar;
                i9 = i5 & 32;
                if (i9 == 0) {
                }
                z4 = z;
                i10 = i5 & 64;
                if (i10 != 0) {
                }
                i11 = i6 | 12582912;
                i12 = i5 & NotificationCompat.FLAG_LOCAL_ONLY;
                if (i12 != 0) {
                }
                i13 = i5 & 512;
                if (i13 != 0) {
                }
                i14 = i5 & 1024;
                if (i14 != 0) {
                }
                if ((i11 & 306783379) != 306783378) {
                }
                z5 = true;
                if (av8Var.T(i11 & 1, z5)) {
                }
                u = av8Var.u();
                if (u != null) {
                }
            }
            xqhVar2 = xqhVar;
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            bqhVar2 = bqhVar;
            i9 = i5 & 32;
            if (i9 == 0) {
            }
            z4 = z;
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            i11 = i6 | 12582912;
            i12 = i5 & NotificationCompat.FLAG_LOCAL_ONLY;
            if (i12 != 0) {
            }
            i13 = i5 & 512;
            if (i13 != 0) {
            }
            i14 = i5 & 1024;
            if (i14 != 0) {
            }
            if ((i11 & 306783379) != 306783378) {
            }
            z5 = true;
            if (av8Var.T(i11 & 1, z5)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        xqhVar2 = xqhVar;
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        bqhVar2 = bqhVar;
        i9 = i5 & 32;
        if (i9 == 0) {
        }
        z4 = z;
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        i11 = i6 | 12582912;
        i12 = i5 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i12 != 0) {
        }
        i13 = i5 & 512;
        if (i13 != 0) {
        }
        i14 = i5 & 1024;
        if (i14 != 0) {
        }
        if ((i11 & 306783379) != 306783378) {
        }
        z5 = true;
        if (av8Var.T(i11 & 1, z5)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void i(int i, int i2, of3 of3Var, Function0 function0, Function0 function02, boolean z) {
        int i3;
        Function0 function03;
        int i4;
        av8 av8Var;
        Function0 function04;
        utc utcVar;
        Function0 function05;
        a99 a99Var;
        av8 av8Var2;
        int i5;
        Function0 function06;
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(1157880281);
        if ((i & 6) == 0) {
            i3 = i | (av8Var3.h(z) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i3 | (av8Var3.i(function0) ? 32 : 16);
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 = i6 | 384;
            function03 = function02;
        } else {
            function03 = function02;
            i4 = i6 | (av8Var3.i(function03) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        }
        if (av8Var3.T(i4 & 1, (i4 & 147) != 146)) {
            Function0 function07 = i7 != 0 ? null : function03;
            av8Var3.d0(326426740);
            Function0 function08 = function07;
            utc utcVar2 = utc.a;
            xtc d2 = bkh.d(utcVar2, 1.0f);
            a99 a99Var2 = nf3.a;
            if (z) {
                utcVar = utcVar2;
                function05 = function08;
                a99Var = a99Var2;
                av8Var2 = av8Var3;
                i5 = 48;
            } else {
                long D = lz.D(R.color.n_lv_4, av8Var3);
                Object O = av8Var3.O();
                if (O == a99Var2) {
                    O = mz1.e(av8Var3);
                }
                wzc wzcVar = (wzc) O;
                Object[] objArr = new Object[0];
                Object O2 = av8Var3.O();
                if (O2 == a99Var2) {
                    O2 = mce.o;
                    av8Var3.n0(O2);
                }
                av8Var2 = av8Var3;
                a99Var = a99Var2;
                function05 = function08;
                i5 = 48;
                utcVar = utcVar2;
                d2 = d2.z(tol.y(utcVar2, true, false, true, D, wzcVar, new p28((boh) o3a.N(objArr, (Function0) O2, av8Var3, 48), function0, 28), av8Var2, 0));
            }
            av8Var2.s(false);
            xtc e0 = l98.e0(d2, 16.0f, 16.0f, 16.0f, 12.0f);
            l8g a = k8g.a(ww9.b, uxf.m, av8Var2, i5);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, e0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            kq9.b(s6a.N(R.drawable.ic_gift, 6, av8Var2), null, null, lz.D(R.color.n_lv_1, av8Var2), av8Var2, 48, 4);
            xtc e2 = fn0.e(1.0f, l98.f0(utcVar, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), true);
            String v = oea.v(z ? R.string.referral_program_reward_ready : R.string.referral_program_header, av8Var2);
            yf8 yf8Var = xth.a;
            av8 av8Var4 = av8Var2;
            udj.c(v, e2, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var4, 0, 0, 131064);
            av8Var = av8Var4;
            if (z) {
                av8Var.d0(-659789567);
                String v2 = oea.v(R.string.button_redeem, av8Var);
                boolean z2 = (i4 & 896) == 256;
                Object O3 = av8Var.O();
                if (z2 || O3 == a99Var) {
                    function06 = function05;
                    O3 = new rsd(8, function06);
                    av8Var.n0(O3);
                } else {
                    function06 = function05;
                }
                function05 = function06;
                h(v2, (Function0) O3, null, tqh.a, null, false, false, false, 0L, 0, 0, av8Var, 3072, 0, 2036);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                av8Var.d0(-659570800);
                kq9.b(s6a.N(R.drawable.ic_chevron_right, 6, av8Var), null, null, lz.D(R.color.primary_default, av8Var), av8Var, 48, 4);
                av8Var.s(false);
            }
            av8Var.s(true);
            function04 = function05;
        } else {
            av8Var = av8Var3;
            av8Var.W();
            function04 = function03;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x80(z, function0, function04, i, i2, 9);
        }
    }

    public static final void j(int i, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(994753143);
        int i2 = i | 6;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) av8Var.k(nz.b);
            u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
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
            waa.K(av8Var, a, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            l8g a2 = k8g.a(ww9.f, uxf.m, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, f0);
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
                O2 = nuh.f;
                av8Var.n0(O2);
            }
            xtc b0 = l98.b0(tol.y(utcVar, true, true, true, D, wzcVar, new he7((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), context, 3), av8Var, 0), 4.0f);
            yf8 yf8Var = xth.a;
            udj.c(oea.v(R.string.terms_and_conditions, av8Var), b0, lz.D(R.color.primary_default, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131064);
            tz9.r(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 14, 0L, 0L, av8Var, n9e.q(bkh.e(utcVar, 12.0f), lz.D(R.color.n_lv_4, av8Var), oyn.e));
            long D2 = lz.D(R.color.n_lv_4, av8Var);
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = mz1.e(av8Var);
            }
            wzc wzcVar2 = (wzc) O3;
            Object[] objArr2 = new Object[0];
            Object O4 = av8Var.O();
            if (O4 == a99Var) {
                O4 = nuh.g;
                av8Var.n0(O4);
            }
            udj.c(oea.v(R.string.privacy_policy, av8Var), l98.b0(tol.y(utcVar, true, true, true, D2, wzcVar2, new he7((boh) o3a.N(objArr2, (Function0) O4, av8Var, 48), context, 4), av8Var, 0), 4.0f), lz.D(R.color.primary_default, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131064);
            av8Var.s(true);
            udj.c(oea.v(R.string.recurring_billing_cancel_statement, av8Var), l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, 5), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.g(), av8Var, 48, 0, 130040);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l63(xtcVar2, i, 27);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0291  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(final String str, final TopStatsCategory topStatsCategory, final Function0 function0, final boolean z, final Function0 function02, xtc xtcVar, long j, boolean z2, int i, boolean z3, boolean z4, float f, Function2 function2, Function2 function22, of3 of3Var, final int i2, final int i3, final int i4) {
        boolean z5;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        av8 av8Var;
        final xtc xtcVar2;
        final Function2 function23;
        final int i14;
        final long j2;
        final boolean z6;
        final boolean z7;
        final boolean z8;
        final float f2;
        final Function2 function24;
        eqf u;
        xtc xtcVar3;
        Function2 function25;
        xtc xtcVar4;
        boolean z9;
        boolean z10;
        boolean z11;
        float f3;
        int i15;
        int i16;
        long j3;
        Function2 function26;
        Function2 function27;
        Function2 function28;
        boolean z12;
        Object O;
        gv9 gv9Var;
        xtc xtcVar5;
        int i17;
        long j4;
        Function2 function29;
        Function2 function210;
        boolean z13;
        boolean z14;
        Function2 function211;
        Function2 function212;
        str.getClass();
        topStatsCategory.getClass();
        function0.getClass();
        function02.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-592208875);
        int i18 = ((i2 & 6) == 0 ? (av8Var2.g(str) ? 4 : 2) | i2 : i2) | (av8Var2.g(topStatsCategory) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i18 |= av8Var2.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i18 |= av8Var2.h(z) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i18 |= av8Var2.i(function02) ? 16384 : 8192;
        }
        int i19 = i4 & 32;
        if (i19 != 0) {
            i18 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i18 |= av8Var2.g(xtcVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        long j5 = j;
        int i20 = i18 | (((i4 & 64) == 0 && av8Var2.f(j5)) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        int i21 = i4 & 128;
        if (i21 != 0) {
            i20 |= 12582912;
            z5 = z2;
        } else {
            z5 = z2;
            if ((i2 & 12582912) == 0) {
                i20 |= av8Var2.h(z5) ? 8388608 : 4194304;
            }
        }
        int i22 = i4 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i22 != 0) {
            i6 = i20 | 100663296;
            i5 = i;
        } else {
            i5 = i;
            i6 = i20 | (av8Var2.e(i5) ? 67108864 : 33554432);
        }
        int i23 = i4 & 512;
        if (i23 != 0) {
            i6 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            i7 = i23;
            i6 |= av8Var2.h(z3) ? 536870912 : 268435456;
            i8 = i4 & 1024;
            if (i8 == 0) {
                i10 = i3 | 6;
                i9 = i8;
            } else if ((i3 & 6) == 0) {
                i9 = i8;
                i10 = i3 | (av8Var2.h(z4) ? 4 : 2);
            } else {
                i9 = i8;
                i10 = i3;
            }
            i11 = i4 & a.o;
            if (i11 == 0) {
                i10 |= 48;
                i12 = i11;
            } else if ((i3 & 48) == 0) {
                i12 = i11;
                i10 |= av8Var2.d(f) ? 32 : 16;
            } else {
                i12 = i11;
            }
            int i24 = i10;
            int i25 = i4 & 4096;
            int i26 = i25 == 0 ? i24 | 384 : i24 | (av8Var2.i(function2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
            int i27 = i4 & 8192;
            i13 = i27 == 0 ? i26 | 3072 : i26 | (av8Var2.i(function22) ? a.o : 1024);
            if (av8Var2.T(i6 & 1, (i6 & 306783379) == 306783378 || (i13 & 1171) != 1170)) {
                av8Var = av8Var2;
                av8Var.W();
                xtcVar2 = xtcVar;
                function23 = function22;
                i14 = i5;
                j2 = j5;
                z6 = z5;
                z7 = z3;
                z8 = z4;
                f2 = f;
                function24 = function2;
            } else {
                av8Var2.Y();
                int i28 = i2 & 1;
                utc utcVar = utc.a;
                Object obj = nf3.a;
                int i29 = i13;
                if (i28 == 0 || av8Var2.B()) {
                    xtc xtcVar6 = i19 != 0 ? utcVar : xtcVar;
                    if ((i4 & 64) != 0) {
                        j5 = lz.D(R.color.surface_1, av8Var2);
                        i6 &= -3670017;
                    }
                    if (i21 != 0) {
                        z5 = true;
                    }
                    if (i22 != 0) {
                        i5 = 3;
                    }
                    boolean z15 = i7 != 0 ? true : z3;
                    boolean z16 = i9 != 0 ? true : z4;
                    float f4 = i12 != 0 ? 16.0f : f;
                    if (i25 != 0) {
                        Object O2 = av8Var2.O();
                        if (O2 == obj) {
                            xtcVar3 = xtcVar6;
                            O2 = new t6j(14);
                            av8Var2.n0(O2);
                        } else {
                            xtcVar3 = xtcVar6;
                        }
                        function25 = (Function2) O2;
                    } else {
                        xtcVar3 = xtcVar6;
                        function25 = function2;
                    }
                    if (i27 != 0) {
                        Object O3 = av8Var2.O();
                        if (O3 == obj) {
                            function27 = function25;
                            O3 = new t6j(15);
                            av8Var2.n0(O3);
                        } else {
                            function27 = function25;
                        }
                        Function2 function213 = (Function2) O3;
                        z9 = z15;
                        z10 = z5;
                        z11 = z16;
                        f3 = f4;
                        i15 = i6;
                        i16 = i5;
                        j3 = j5;
                        function26 = function27;
                        function28 = function213;
                        xtcVar4 = xtcVar3;
                        av8Var2.t();
                        boolean z17 = z10;
                        z12 = ((i15 & 112) != 32) | ((i15 & 7168) != 2048);
                        O = av8Var2.O();
                        if (!z12 || O == obj) {
                            O = topStatsCategory.getB();
                            av8Var2.n0(O);
                        }
                        gv9Var = (gv9) O;
                        if (gv9Var.isEmpty()) {
                            av8Var2.d0(1232026959);
                            xtc q = n9e.q(wnn.A(bkh.d(xtcVar4, 1.0f), o7g.a(f3)), j3, o7g.a(f3));
                            if (z9) {
                                xtcVar5 = xtcVar4;
                                q = q.z(gz8.x(utcVar, null, null, 3));
                            } else {
                                xtcVar5 = xtcVar4;
                            }
                            u23 a = t23.a(ww9.d, uxf.o, av8Var2, 0);
                            int hashCode = Long.hashCode(av8Var2.T);
                            aee m = av8Var2.m();
                            xtc C = fqj.C(av8Var2, q);
                            if3.k7.getClass();
                            Function0 function03 = hf3.b;
                            av8Var2.h0();
                            if (av8Var2.S) {
                                av8Var2.l(function03);
                            } else {
                                av8Var2.q0();
                            }
                            waa.K(av8Var2, a, hf3.g);
                            waa.K(av8Var2, m, hf3.f);
                            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                            waa.J(av8Var2, hf3.k);
                            waa.K(av8Var2, C, hf3.d);
                            int i30 = (i15 << 6) & 896;
                            rha.i(topStatsCategory, (gv9Var.size() <= i16 || !z11) ? null : function02, str, null, av8Var2, ((i15 >> 3) & 14) | i30);
                            av8Var2.d0(-1578470764);
                            for (c71 c71Var : CollectionsKt.L0(gv9Var, i16)) {
                                if (c71Var instanceof aoj) {
                                    av8Var2.d0(-1956636831);
                                    Function2 function214 = function26;
                                    tz9.q((aoj) c71Var, null, null, function214, av8Var2, (i29 << 3) & 7168, 6);
                                    function211 = function214;
                                    av8Var2.s(false);
                                    function212 = function28;
                                } else {
                                    function211 = function26;
                                    if (c71Var instanceof vnj) {
                                        av8Var2.d0(-1956362729);
                                        Function2 function215 = function28;
                                        sha.m(((vnj) c71Var).a, null, str, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, function215, av8Var2, i30 | 48 | ((i29 << 12) & 29360128), 120);
                                        function212 = function215;
                                        av8Var2.s(false);
                                    } else {
                                        function212 = function28;
                                        if (!(c71Var instanceof tnj)) {
                                            throw dmi.h(av8Var2, -2002781296, false);
                                        }
                                        av8Var2.d0(-1956022907);
                                        tnj tnjVar = (tnj) c71Var;
                                        sha.m(tnjVar.a, tnjVar.b, str, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var2, i30, 248);
                                        av8Var2.s(false);
                                    }
                                }
                                function26 = function211;
                                function28 = function212;
                            }
                            function29 = function26;
                            function210 = function28;
                            av8Var2.s(false);
                            Integer c2 = topStatsCategory.getC();
                            if (!z17 || c2 == null) {
                                av8Var = av8Var2;
                                z13 = false;
                                i17 = i16;
                                j4 = j3;
                                z14 = true;
                                bf3.r(8.0f, -1686009354, av8Var, av8Var, utcVar);
                                av8Var.s(false);
                            } else {
                                av8Var2.d0(-1686853081);
                                String v = oea.v(c2.intValue(), av8Var2);
                                long D = lz.D(R.color.surface_2, av8Var2);
                                lv1 lv1Var = uxf.l;
                                xtc f0 = l98.f0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 8.0f, 2);
                                tc3 H = yqo.H(-116517893, av8Var2, new f91(11, function0));
                                j4 = j3;
                                i17 = i16;
                                z13 = false;
                                z14 = true;
                                x2a.d(v, f0, null, 0L, 0L, D, null, H, lv1Var, 8.0f, null, av8Var2, 918552624, 0, 1116);
                                av8Var = av8Var2;
                                av8Var.s(false);
                            }
                            av8Var.s(z14);
                            av8Var.s(z13);
                        } else {
                            xtcVar5 = xtcVar4;
                            av8Var = av8Var2;
                            i17 = i16;
                            j4 = j3;
                            function29 = function26;
                            function210 = function28;
                            av8Var.d0(1234638957);
                            av8Var.s(false);
                        }
                        i14 = i17;
                        xtcVar2 = xtcVar5;
                        function24 = function29;
                        z7 = z9;
                        z8 = z11;
                        f2 = f3;
                        z6 = z17;
                        function23 = function210;
                        j2 = j4;
                    } else {
                        Function2 function216 = function25;
                        xtcVar4 = xtcVar3;
                        z9 = z15;
                        z10 = z5;
                        z11 = z16;
                        f3 = f4;
                        i15 = i6;
                        i16 = i5;
                        j3 = j5;
                        function26 = function216;
                    }
                } else {
                    av8Var2.W();
                    if ((i4 & 64) != 0) {
                        i6 &= -3670017;
                    }
                    xtcVar4 = xtcVar;
                    z9 = z3;
                    z11 = z4;
                    f3 = f;
                    z10 = z5;
                    i15 = i6;
                    i16 = i5;
                    j3 = j5;
                    function26 = function2;
                }
                function28 = function22;
                av8Var2.t();
                boolean z172 = z10;
                z12 = ((i15 & 112) != 32) | ((i15 & 7168) != 2048);
                O = av8Var2.O();
                if (!z12) {
                }
                O = topStatsCategory.getB();
                av8Var2.n0(O);
                gv9Var = (gv9) O;
                if (gv9Var.isEmpty()) {
                }
                i14 = i17;
                xtcVar2 = xtcVar5;
                function24 = function29;
                z7 = z9;
                z8 = z11;
                f2 = f3;
                z6 = z172;
                function23 = function210;
                j2 = j4;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new Function2() { // from class: tmj
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int K = aba.K(i2 | 1);
                        int K2 = aba.K(i3);
                        mha.k(str, topStatsCategory, function0, z, function02, xtcVar2, j2, z6, i14, z7, z8, f2, function24, function23, (of3) obj2, K, K2, i4);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        i7 = i23;
        i8 = i4 & 1024;
        if (i8 == 0) {
        }
        i11 = i4 & a.o;
        if (i11 == 0) {
        }
        int i242 = i10;
        int i252 = i4 & 4096;
        if (i252 == 0) {
        }
        int i272 = i4 & 8192;
        if (i272 == 0) {
        }
        if (av8Var2.T(i6 & 1, (i6 & 306783379) == 306783378 || (i13 & 1171) != 1170)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static void l(StringBuilder sb, String str, oha ohaVar) {
        if (ohaVar != null) {
            sb.append("\"");
            int[] iArr = ln5.a;
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '\f') {
                    sb.append("\\f");
                } else if (charAt == '\r') {
                    sb.append("\\r");
                } else if (charAt == '\"') {
                    sb.append("\\\"");
                } else if (charAt == '/') {
                    sb.append("\\/");
                } else if (charAt != '\\') {
                    switch (charAt) {
                        case '\b':
                            sb.append("\\b");
                            break;
                        case '\t':
                            sb.append("\\t");
                            break;
                        case '\n':
                            sb.append("\\n");
                            break;
                        default:
                            if (charAt < ' ') {
                                sb.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                                break;
                            } else {
                                sb.append(charAt);
                                break;
                            }
                    }
                } else {
                    sb.append("\\\\");
                }
            }
            sb.append("\":");
            sb.append(ohaVar.a());
            sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
        }
    }

    public static final dy4 m(e7 e7Var, uf3 uf3Var, String str) {
        dy4 a = e7Var.a(uf3Var, str);
        if (a != null) {
            return a;
        }
        pd0.I(str, e7Var.c());
        throw null;
    }

    public static final KSerializer n(e7 e7Var, Encoder encoder, Object obj) {
        encoder.getClass();
        obj.getClass();
        KSerializer b2 = e7Var.b(encoder, obj);
        if (b2 != null) {
            return b2;
        }
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(obj.getClass());
        KClass c2 = e7Var.c();
        orCreateKotlinClass.getClass();
        c2.getClass();
        String simpleName = orCreateKotlinClass.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(orCreateKotlinClass);
        }
        pd0.I(simpleName, c2);
        throw null;
    }

    public static final String o(md4 md4Var) {
        md4 md4Var2 = md4.b;
        return tgj.u(ww9.I(md4Var));
    }

    public static String p(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((xsj) it.next()).a.g.o;
            if (sjc.o(str2)) {
                return MimeTypes.VIDEO_MP4;
            }
            if (sjc.k(str2)) {
                z = true;
            } else if (sjc.m(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z ? MimeTypes.AUDIO_MP4 : str != null ? str : MimeTypes.APPLICATION_MP4;
    }

    public static List q(Map map, int i, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add((o1k) rub.a(str, map));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Integer num = ((o1k) next).b;
            if (num != null && num.intValue() >= 10) {
                arrayList2.add(next);
            }
        }
        List L0 = CollectionsKt.L0(arrayList2, i);
        if (L0.size() < i) {
            return null;
        }
        return CollectionsKt.L0(L0, i);
    }

    public static final ViewParent r(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static o1k s(String str, Map map) {
        o1k o1kVar = (o1k) rub.a(str, map);
        Integer num = o1kVar.b;
        if ((num != null ? num.intValue() : 0) >= 10) {
            return o1kVar;
        }
        return null;
    }

    public static final boolean t(int i, KeyEvent keyEvent) {
        return ((int) (u0a.w(keyEvent) >> 32)) == i;
    }

    public static ArrayList u(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = u((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = v((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static HashMap v(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = u((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = v((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    public static int w(nm2 nm2Var, int i, int i2, int i3) {
        z1a.s(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        o6a.q(o6a.q(i4, i5), 1 << i3);
        if (nm2Var.b() < i) {
            return -1;
        }
        int i6 = nm2Var.i(i);
        if (i6 == i4) {
            if (nm2Var.b() < i2) {
                return -1;
            }
            int i7 = nm2Var.i(i2);
            i6 += i7;
            if (i7 == i5) {
                if (nm2Var.b() < i3) {
                    return -1;
                }
                return nm2Var.i(i3) + i6;
            }
        }
        return i6;
    }

    public static void x(ContextWrapper contextWrapper, int i) {
        Pair[] pairArr = {new Pair("ACTION", "REMOVE"), new Pair("NOTIFICATION_ID", Integer.valueOf(i))};
        hpo hpoVar = new hpo(18);
        for (int i2 = 0; i2 < 2; i2++) {
            Pair pair = pairArr[i2];
            hpoVar.B(pair.b, (String) pair.a);
        }
        md4 l = hpoVar.l();
        ktd g = vxd.g(NotificationWorker.class, l);
        Context applicationContext = contextWrapper.getApplicationContext();
        applicationContext.getClass();
        xbl d2 = xbl.d(applicationContext);
        d2.getClass();
        d2.b("NotificationWorker-".concat(o(l)), nf6.a, (ltd) g.a());
    }

    public static final void y(ktd ktdVar) {
        ktdVar.getClass();
        jbd jbdVar = jbd.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ktdVar.c.j = new zm3(new nad(null), jbd.b, false, false, false, false, -1L, -1L, CollectionsKt.W0(linkedHashSet));
    }

    public static final void z(int i, int i2, Object[] objArr) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public int hashCode() {
        switch (this.a) {
            case 13:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.a) {
            case 13:
                String simpleName = duf.a.getOrCreateKotlinClass(getClass()).getSimpleName();
                simpleName.getClass();
                return simpleName;
            default:
                return super.toString();
        }
    }
}
