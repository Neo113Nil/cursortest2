package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.ads.zzagn;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.results.R;
import com.sofascore.results.ads.UpgradeSofascoreActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class g7a implements zzagn {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;

    public static void A(View view, int i, int i2, int i3, int i4) {
        view.getMeasuredWidth();
        view.getMeasuredHeight();
        if (view.getVisibility() == 8) {
            i = 0;
            i2 = 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i, i3), View.MeasureSpec.makeMeasureSpec(i2, i4));
        view.getMeasuredWidth();
        view.getMeasuredHeight();
    }

    public static void B(View view, int i, int i2) {
        A(view, i, i2, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final dfj C(dfj dfjVar, ema emaVar) {
        long j;
        bdj bdjVar;
        int i;
        int i2;
        lej lejVar;
        pwh pwhVar = dfjVar.a;
        ycj ycjVar = qwh.d;
        ycj ycjVar2 = pwhVar.a;
        if (ycjVar2.equals(xcj.a)) {
            ycjVar2 = qwh.d;
        }
        ycj ycjVar3 = ycjVar2;
        long j2 = pwhVar.b;
        mfj[] mfjVarArr = lfj.b;
        if ((j2 & 1095216660480L) == 0) {
            j2 = qwh.a;
        }
        long j3 = j2;
        wg8 wg8Var = pwhVar.c;
        if (wg8Var == null) {
            wg8Var = wg8.g;
        }
        wg8 wg8Var2 = wg8Var;
        rg8 rg8Var = pwhVar.d;
        rg8 rg8Var2 = new rg8(rg8Var != null ? rg8Var.a : 0);
        sg8 sg8Var = pwhVar.e;
        sg8 sg8Var2 = new sg8(sg8Var != null ? sg8Var.a : 65535);
        tf8 tf8Var = pwhVar.f;
        if (tf8Var == null) {
            tf8Var = tf8.a;
        }
        tf8 tf8Var2 = tf8Var;
        String str = pwhVar.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = pwhVar.h;
        if ((j4 & 1095216660480L) == 0) {
            j4 = qwh.b;
        }
        long j5 = j4;
        sn1 sn1Var = pwhVar.i;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f3 = sn1Var != null ? sn1Var.a : 0.0f;
        if (!Float.isNaN(f3)) {
            f2 = f3;
        }
        sn1 sn1Var2 = new sn1(f2);
        zcj zcjVar = pwhVar.j;
        if (zcjVar == null) {
            zcjVar = zcj.c;
        }
        zcj zcjVar2 = zcjVar;
        eib eibVar = pwhVar.k;
        if (eibVar == null) {
            eib eibVar2 = eib.c;
            eibVar = pie.a.P();
        }
        eib eibVar3 = eibVar;
        long j6 = pwhVar.l;
        if (j6 == 16) {
            j6 = qwh.c;
        }
        long j7 = j6;
        v8j v8jVar = pwhVar.m;
        if (v8jVar == null) {
            v8jVar = v8j.b;
        }
        v8j v8jVar2 = v8jVar;
        qah qahVar = pwhVar.n;
        if (qahVar == null) {
            qahVar = qah.d;
        }
        qah qahVar2 = qahVar;
        mje mjeVar = pwhVar.o;
        ja5 ja5Var = pwhVar.p;
        if (ja5Var == null) {
            ja5Var = e28.a;
        }
        pwh pwhVar2 = new pwh(ycjVar3, j3, wg8Var2, rg8Var2, sg8Var2, tf8Var2, str2, j5, sn1Var2, zcjVar2, eibVar3, j7, v8jVar2, qahVar2, mjeVar, ja5Var);
        g8e g8eVar = dfjVar.b;
        int i3 = h8e.b;
        int i4 = g8eVar.a;
        int i5 = 5;
        if (i4 == 0) {
            i4 = 5;
        }
        int i6 = g8eVar.b;
        if (i6 != 3) {
            if (i6 == 0) {
                int ordinal = emaVar.ordinal();
                if (ordinal == 0) {
                    i6 = 1;
                } else {
                    if (ordinal != 1) {
                        zzl.b();
                        return null;
                    }
                    i5 = 2;
                }
            }
            j = g8eVar.c;
            if ((j & 1095216660480L) == 0) {
                j = h8e.a;
            }
            bdjVar = g8eVar.d;
            if (bdjVar == null) {
                bdjVar = bdj.c;
            }
            aje ajeVar = g8eVar.e;
            r7b r7bVar = g8eVar.f;
            i = g8eVar.g;
            if (i == 0) {
                i = l7b.b;
            }
            i2 = g8eVar.h;
            if (i2 == 0) {
                i2 = 1;
            }
            lejVar = g8eVar.i;
            if (lejVar == null) {
                lejVar = lej.c;
            }
            return new dfj(pwhVar2, new g8e(i4, i6, j, bdjVar, ajeVar, r7bVar, i, i2, lejVar), dfjVar.c);
        }
        int ordinal2 = emaVar.ordinal();
        if (ordinal2 == 0) {
            i5 = 4;
        } else if (ordinal2 != 1) {
            zzl.b();
            return null;
        }
        i6 = i5;
        j = g8eVar.c;
        if ((j & 1095216660480L) == 0) {
        }
        bdjVar = g8eVar.d;
        if (bdjVar == null) {
        }
        aje ajeVar2 = g8eVar.e;
        r7b r7bVar2 = g8eVar.f;
        i = g8eVar.g;
        if (i == 0) {
        }
        i2 = g8eVar.h;
        if (i2 == 0) {
        }
        lejVar = g8eVar.i;
        if (lejVar == null) {
        }
        return new dfj(pwhVar2, new g8e(i4, i6, j, bdjVar, ajeVar2, r7bVar2, i, i2, lejVar), dfjVar.c);
    }

    public static final int D(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final nak E(Context context, UniqueStage uniqueStage) {
        context.getClass();
        jfj jfjVar = new jfj(7, (String) null, (Integer) (0 == true ? 1 : 0));
        nak nakVar = new nak();
        nakVar.a = uniqueStage;
        nakVar.b = null;
        nakVar.c = jfjVar;
        nakVar.d = null;
        nakVar.e = false;
        nakVar.f = false;
        nakVar.b = new jfj(6, wyh.c(context, uniqueStage.getCategory().getSport().getSlug()), (Integer) (0 == true ? 1 : 0));
        nakVar.c = new jfj(4, uniqueStage.getName(), Integer.valueOf(R.color.n_lv_3));
        return nakVar;
    }

    public static int F(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                try {
                    int i3 = tqo.a;
                    int length2 = str.length();
                    int i4 = 0;
                    while (i < length2) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 2048) {
                            i4 += (127 - charAt2) >>> 31;
                        } else {
                            i4 += 2;
                            if (charAt2 >= 55296 && charAt2 <= 57343) {
                                if (Character.codePointAt(str, i) < 65536) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32 + String.valueOf(length2).length());
                                    sb.append("Unpaired surrogate at index ");
                                    sb.append(i);
                                    sb.append(" of ");
                                    sb.append(length2);
                                    throw new sqo(sb.toString());
                                }
                                i++;
                            }
                        }
                        i++;
                    }
                    i2 += i4;
                } catch (sqo unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
        }
        if (i2 >= length) {
            return i2;
        }
        long j = i2 + 4294967296L;
        a70.p(x5n.m(j, "UTF-8 length does not fit in int: ", new StringBuilder(String.valueOf(j).length() + 34)));
        return 0;
    }

    public static final void a(int i, int i2, of3 of3Var) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1221470263);
        int i3 = (av8Var2.e(i) ? 4 : 2) | i2;
        if (av8Var2.T(i3 & 1, (i3 & 3) != 2)) {
            xtc c0 = l98.c0(utc.a, 16.0f, 8.0f);
            yf8 yf8Var = xth.a;
            av8Var = av8Var2;
            udj.c(oea.v(i, av8Var2), c0, 0L, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 48, 0, 131068);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new o81(i, i2, 9);
        }
    }

    public static final void b(gv9 gv9Var, Function1 function1, Function2 function2, int i, boolean z, sza szaVar, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        xtc xtcVar2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1106395067);
        int i3 = i2 | (av8Var2.g(gv9Var) ? 4 : 2) | (av8Var2.i(function1) ? 32 : 16) | (av8Var2.i(function2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.e(i) ? a.o : 1024) | (av8Var2.h(z) ? 16384 : 8192) | (av8Var2.e(szaVar.ordinal()) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | 1572864;
        if (av8Var2.T(i3 & 1, (599187 & i3) != 599186)) {
            Object O = av8Var2.O();
            Object obj = nf3.a;
            if (O == obj) {
                O = e.f(Boolean.FALSE);
                av8Var2.n0(O);
            }
            e1d e1dVar = (e1d) O;
            qug o0 = hkg.o0(av8Var2);
            utc utcVar = utc.a;
            xtc d2 = bkh.d(n9e.q(wnn.A(l98.c0(gz8.x(utcVar, null, null, 3), 8.0f, 4.0f), o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var2), o7g.a(16.0f)), 1.0f);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, d2);
            if3.k7.getClass();
            Function0 function0 = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(function0);
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
            int i4 = i3;
            xtc e0 = l98.e0(utcVar, 16.0f, 16.0f, 16.0f, 8.0f);
            u23 a3 = t23.a(p4hVar, kv1Var, av8Var2, 0);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, e0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(function0);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            String v = oea.v(R.string.top_performances, av8Var2);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var2, 0, 0, 131066);
            udj.c(oea.t(R.plurals.last_hours, i, new Object[]{Integer.valueOf(i)}, av8Var2), null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var2, 0, 0, 131066);
            av8Var2.s(true);
            kza kzaVar = (kza) CollectionsKt.firstOrNull(gv9Var);
            Gender gender = kzaVar != null ? kzaVar.e : null;
            boolean z2 = (i4 & 112) == 32;
            Object O2 = av8Var2.O();
            if (z2 || O2 == obj) {
                O2 = new uj8(12, function1);
                av8Var2.n0(O2);
            }
            int i5 = (i4 >> 3) & 7168;
            k(gender, szaVar, o0, z, (Function1) O2, null, av8Var2, ((i4 >> 12) & 112) | i5);
            av8Var2.d0(-678838690);
            for (kza kzaVar2 : CollectionsKt.L0(gv9Var, ((Boolean) e1dVar.getValue()).booleanValue() ? 10 : 3)) {
                int i6 = i4;
                boolean g2 = av8Var2.g(kzaVar2) | ((i6 & 896) == 256);
                Object O3 = av8Var2.O();
                if (g2 || O3 == obj) {
                    O3 = new ixa(3, function2, kzaVar2);
                    av8Var2.n0(O3);
                }
                Function0 function02 = (Function0) O3;
                int i7 = i5;
                i4 = i6;
                l(kzaVar2, o0, szaVar, z, tol.y(utcVar, false, false, false, 0L, null, function02, av8Var2, 31), av8Var2, ((i4 >> 9) & 896) | i7);
                i5 = i7;
            }
            av8Var2.s(false);
            Object O4 = av8Var2.O();
            if (O4 == obj) {
                O4 = new tra(3, e1dVar);
                av8Var2.n0(O4);
            }
            xtc f0 = l98.f0(bkh.d(tol.y(utcVar, false, false, false, 0L, null, (Function0) O4, av8Var2, 31), 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20.0f, 5);
            l8g a4 = k8g.a(ww9.f, uxf.m, av8Var2, 54);
            int hashCode3 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C3 = fqj.C(av8Var2, f0);
            if3.k7.getClass();
            Function0 function03 = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(function03);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a4, hf3.g);
            waa.K(av8Var2, m3, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode3), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C3, hf3.d);
            String v2 = oea.v(((Boolean) e1dVar.getValue()).booleanValue() ? R.string.see_less : R.string.see_all, av8Var2);
            yf8 yf8Var2 = xth.a;
            udj.c(v2, null, lz.D(R.color.primary_default, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var2, 0, 0, 131066);
            av8Var = av8Var2;
            kq9.b(s6a.N(((Boolean) e1dVar.getValue()).booleanValue() ? R.drawable.ic_chevron_up_large_16 : R.drawable.ic_chevron_down_large_16, 6, av8Var), null, bkh.l(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
            av8Var.s(true);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hp1(gv9Var, function1, function2, i, z, szaVar, xtcVar2, i2);
        }
    }

    public static final void c(mjb mjbVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        xtc xtcVar2;
        long j;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(559208109);
        if ((i & 6) == 0) {
            i2 = i | (av8Var.e(mjbVar.ordinal()) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function1) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) av8Var.k(nz.b);
            utc utcVar = utc.a;
            xtc o = yso.o(n9e.q(wnn.A(bkh.d(utcVar, 1.0f), o7g.a(8.0f)), lz.D(R.color.surface_1, av8Var), oyn.e), 1.0f, lz.D(R.color.n_lv_4, av8Var), o7g.a(8.0f));
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
                O2 = jxa.r;
                av8Var.n0(O2);
            }
            xtc c0 = l98.c0(tol.y(o, true, true, true, D, wzcVar, new gi(18, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function1, mjbVar), av8Var, 0), 12.0f, 16.0f);
            k1c c2 = e12.c(uxf.c, false);
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
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String a2 = mjbVar.a.a(av8Var);
            yf8 yf8Var = xth.a;
            dfj g2 = xth.g();
            long D2 = lz.D(R.color.n_lv_1, av8Var);
            mv1 mv1Var = uxf.g;
            n12 n12Var = n12.a;
            udj.c(a2, n12Var.a(utcVar, mv1Var), D2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, g2, av8Var, 0, 0, 131064);
            av8Var = av8Var;
            ImageVector N = s6a.N(mjbVar.b, 6, av8Var);
            if (mjbVar.c && hkg.b0(context)) {
                j = ljg.f(av8Var, 1016630972, R.color.n_lv_1, av8Var, false);
            } else {
                av8Var.d0(1016631646);
                av8Var.s(false);
                j = r13.i;
            }
            kq9.b(N, null, n12Var.a(bkh.l(utcVar, 16.0f), uxf.f), j, av8Var, 48, 0);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zt7(mjbVar, function1, xtcVar2, i, 22);
        }
    }

    public static final void e(boolean z, String str, Function0 function0, Function0 function02, xtc xtcVar, String str2, of3 of3Var, int i, int i2) {
        int i3;
        String str3;
        int i4;
        av8 av8Var;
        dfh dfhVar;
        int i5;
        Object obj;
        str.getClass();
        function0.getClass();
        function02.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1271906240);
        if ((i & 6) == 0) {
            i3 = (av8Var2.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i3 | (av8Var2.g(str) ? 32 : 16);
        if ((i & 384) == 0) {
            i6 |= av8Var2.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i7 = i6 | (av8Var2.i(function02) ? a.o : 1024) | (av8Var2.g(xtcVar) ? 16384 : 8192);
        int i8 = i2 & 32;
        if (i8 != 0) {
            i4 = i7 | 196608;
            str3 = str2;
        } else {
            str3 = str2;
            i4 = i7 | (av8Var2.g(str3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        }
        if (av8Var2.T(i4 & 1, (74899 & i4) != 74898)) {
            if (i8 != 0) {
                str3 = null;
            }
            Object O = av8Var2.O();
            Object obj2 = nf3.a;
            if (O == obj2) {
                O = hz8.G(g.a, av8Var2);
                av8Var2.n0(O);
            }
            Object obj3 = (ku3) O;
            dfh g2 = ctc.g(null, av8Var2, 6, 2);
            Object k = av8Var2.k(ngb.a);
            ComponentActivity componentActivity = k instanceof ComponentActivity ? (ComponentActivity) k : null;
            if (componentActivity == null) {
                a70.r("Required value was null.");
                return;
            }
            sgh sghVar = (sgh) av8Var2.k(uhb.a);
            Object obj4 = sghVar.a;
            bfk bfkVar = sghVar.b;
            Object O2 = av8Var2.O();
            if (O2 == obj2) {
                O2 = Boolean.valueOf(b.j(0, 2, 18).contains(Integer.valueOf(GoogleApiAvailability.e.b(componentActivity, GoogleApiAvailabilityLight.a))));
                av8Var2.n0(O2);
            }
            boolean booleanValue = ((Boolean) O2).booleanValue();
            mjb mjbVar = mjb.FACEBOOK;
            mjb mjbVar2 = mjb.GOOGLE;
            if (!booleanValue) {
                mjbVar2 = null;
            }
            gv9 W = l6g.W(ph0.x(new mjb[]{mjbVar, mjbVar2}));
            Object O3 = av8Var2.O();
            if (O3 == obj2) {
                O3 = new op9(20, obj3, bfkVar);
                av8Var2.n0(O3);
            }
            Function2 function2 = (Function2) O3;
            Unit unit = Unit.a;
            int i9 = i4;
            boolean i10 = ((i4 & 7168) == 2048) | av8Var2.i(componentActivity) | av8Var2.i(obj4) | av8Var2.i(obj3) | av8Var2.g(g2);
            Object O4 = av8Var2.O();
            if (i10 || O4 == obj2) {
                dfhVar = g2;
                i5 = 1;
                Object yx1Var = new yx1(componentActivity, function2, obj4, obj3, dfhVar, function02, 4);
                obj = obj4;
                av8Var2.n0(yx1Var);
                O4 = yx1Var;
            } else {
                dfhVar = g2;
                obj = obj4;
                i5 = 1;
            }
            hz8.d(unit, (Function1) O4, av8Var2);
            av8Var = av8Var2;
            tz9.l(z, function0, xtcVar, false, dfhVar, str, null, null, yqo.H(-834113603, av8Var2, new zya(i5, W, obj, str3)), av8Var, (i9 & 14) | 100663296 | ((i9 >> 3) & 112) | ((i9 >> 6) & 896) | ((i9 << 12) & 458752), 200);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vr5(z, str, function0, function02, xtcVar, str3, i, i2);
        }
    }

    public static final void f(int i, of3 of3Var, gv9 gv9Var, xtc xtcVar, String str, Function1 function1) {
        Function1 function12;
        gv9 gv9Var2;
        xtc xtcVar2;
        zg3 zg3Var;
        kv1 kv1Var;
        int i2;
        f50 f50Var;
        f50 f50Var2;
        ff3 ff3Var;
        utc utcVar;
        f50 f50Var3;
        ry ryVar;
        boolean z;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1048904233);
        int i3 = i | (av8Var.g(gv9Var) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | 384 | (av8Var.g(str) ? a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            utc utcVar2 = utc.a;
            xtc f0 = l98.f0(l98.d0(bkh.d(utcVar2, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32.0f, 7);
            p4h p4hVar = ww9.d;
            kv1 kv1Var2 = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var2, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
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
            if (str == null) {
                av8Var.d0(-377483814);
                av8Var.s(false);
                f50Var = f50Var4;
                i2 = i3;
                utcVar = utcVar2;
                z = false;
                f50Var2 = f50Var6;
                ff3Var = ff3Var2;
                zg3Var = zg3Var2;
                kv1Var = kv1Var2;
                ryVar = ryVar2;
                f50Var3 = f50Var5;
            } else {
                av8Var.d0(-377483813);
                yf8 yf8Var = xth.a;
                zg3Var = zg3Var2;
                kv1Var = kv1Var2;
                i2 = i3;
                f50Var = f50Var4;
                f50Var2 = f50Var6;
                ff3Var = ff3Var2;
                utcVar = utcVar2;
                f50Var3 = f50Var5;
                ryVar = ryVar2;
                z = false;
                udj.c(str, l98.d0(bkh.d(utcVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, ((i3 >> 9) & 14) | 48, 0, 131064);
                av8Var = av8Var;
                av8Var.s(false);
            }
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            ng0 ng0Var = new ng0(12.0f, true, new a70(6));
            xtc h = ljg.h(8.0f, bkh.d(utcVar, 1.0f), lz.D(R.color.brand_tertiary_highlight, av8Var), 12.0f);
            u23 a3 = t23.a(ng0Var, kv1Var, av8Var, 6);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, h);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var3, av8Var, ryVar);
            gv9Var2 = gv9Var;
            Iterator p = ljg.p(av8Var, C2, f50Var2, -1635152522, gv9Var2);
            while (p.hasNext()) {
                c((mjb) p.next(), function1, null, av8Var, i2 & 112);
            }
            function12 = function1;
            av8Var.s(z);
            av8Var.s(true);
            nq8.h(av8Var, bkh.e(utcVar, 24.0f));
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = new a7d(23);
                av8Var.n0(O);
            }
            td4.a((Function1) O, null, null, av8Var, 6, 6);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            function12 = function1;
            gv9Var2 = gv9Var;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new al1(gv9Var2, function12, xtcVar2, str, i);
        }
    }

    public static final void g(sre sreVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        tc3 tc3Var;
        int i3;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1541315728);
        int i4 = 2;
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
        int i5 = 0;
        int i6 = 1;
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            int i7 = sreVar.g;
            x43 x43Var = sreVar.r;
            String str = sreVar.h;
            String str2 = sreVar.i;
            boolean z = sreVar.e;
            tc3 H = yqo.H(-400970742, av8Var2, new ore(sreVar, i5));
            tc3 H2 = yqo.H(1343950736, av8Var2, new ore(sreVar, i6));
            tc3 H3 = yqo.H(1816290382, av8Var2, new ore(sreVar, i4));
            int i8 = i2 & 112;
            boolean i9 = (i8 == 32) | av8Var2.i(sreVar);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (i9 || O == a99Var) {
                tc3Var = H3;
                i3 = 0;
                O = new pre(function1, sreVar, i3);
                av8Var2.n0(O);
            } else {
                tc3Var = H3;
                i3 = 0;
            }
            Function0 function0 = (Function0) O;
            if (i8 == 32) {
                i3 = 1;
            }
            int i10 = i3 | (av8Var2.i(sreVar) ? 1 : 0);
            Object O2 = av8Var2.O();
            if (i10 != 0 || O2 == a99Var) {
                O2 = new pre(function1, sreVar, 1);
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
            u.d = new qre(sreVar, function1, xtcVar, i, 0);
        }
    }

    public static final void h(otg otgVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(30594246);
        int i3 = 2;
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
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            String str = otgVar.h;
            String str2 = otgVar.i;
            tc3 H = yqo.H(359242567, av8Var2, new ktg(otgVar, 3));
            boolean i4 = av8Var2.i(otgVar) | ((i2 & 112) == 32);
            Object O = av8Var2.O();
            if (i4 || O == nf3.a) {
                O = new ltg(function1, otgVar, i3);
                av8Var2.n0(O);
            }
            av8Var = av8Var2;
            v9g.c(xtcVar, null, H, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, str, str2, (Function0) O, av8Var, ((i2 >> 6) & 14) | 384, 506);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mtg(otgVar, function1, xtcVar, i, 1);
        }
    }

    public static final void i(final fv fvVar, Function0 function0, xtc xtcVar, of3 of3Var, int i) {
        final fv fvVar2;
        av8 av8Var;
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1097430132);
        int i2 = i | (av8Var2.e(fvVar.ordinal()) ? 4 : 2) | (av8Var2.i(function0) ? 32 : 16) | (av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        final int i3 = 0;
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            final Context context = (Context) av8Var2.k(nz.b);
            boolean z = av8Var2.k(dh3.n) == ema.b;
            xtc A = wnn.A(xtcVar, o7g.a(16.0f));
            int i4 = i2 & 14;
            boolean i5 = av8Var2.i(context) | (i4 == 4);
            Object O = av8Var2.O();
            Object obj = nf3.a;
            if (i5 || O == obj) {
                O = new Function0() { // from class: juh
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i6 = i3;
                        fv fvVar3 = fvVar;
                        Context context2 = context;
                        switch (i6) {
                            case 0:
                                nv.p0(context2, fvVar3, "analyst", "banner", null);
                                break;
                            default:
                                nv.o0(context2, fvVar3, "analyst", "banner", null);
                                int i7 = UpgradeSofascoreActivity.M;
                                e2f.k(context2, false);
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var2.n0(O);
            }
            xtc Q = bea.Q(A, (Function0) O, 2);
            mv1 mv1Var = uxf.c;
            k1c c2 = e12.c(mv1Var, false);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, Q);
            if3.k7.getClass();
            Function0 function02 = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(function02);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            d7e t = haa.t(2131232920, 0, av8Var2);
            n12 n12Var = n12.a;
            utc utcVar = utc.a;
            wkn.k(t, null, n12Var.b(utcVar), null, mp3.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var2, 24632, 104);
            xtc f0 = l98.f0(n12Var.b(utcVar), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            k1c c3 = e12.c(mv1Var, false);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, f0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(function02);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c3, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            wkn.k(haa.t(2131232917, 0, av8Var2), null, f6a.D(bkh.c(n12Var.a(utcVar, uxf.k), 1.0f), z ? -1.0f : 1.0f, 1.0f), null, mp3.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var2, 24632, 104);
            av8Var2.s(true);
            xtc d2 = bkh.d(utcVar, 1.0f);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var2, 0);
            int hashCode3 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C3 = fqj.C(av8Var2, d2);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(function02);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, f50Var);
            waa.K(av8Var2, m3, ff3Var);
            bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C3, f50Var3);
            ImageVector N = s6a.N(R.drawable.ic_close, 6, av8Var2);
            long D = lz.D(R.color.on_color_primary, av8Var2);
            xtc l = bkh.l(new we9(uxf.q), 32.0f);
            long D2 = lz.D(R.color.n_lv_4, av8Var2);
            Object O2 = av8Var2.O();
            if (O2 == obj) {
                O2 = mz1.e(av8Var2);
            }
            wzc wzcVar = (wzc) O2;
            Object[] objArr = new Object[0];
            Object O3 = av8Var2.O();
            if (O3 == obj) {
                O3 = mce.C;
                av8Var2.n0(O3);
            }
            kq9.b(N, null, l98.b0(tol.y(l, true, false, true, D2, wzcVar, new cyg((boh) o3a.N(objArr, (Function0) O3, av8Var2, 48), function0, 7), av8Var2, 0), 8.0f), D, av8Var2, 48, 0);
            nq8.h(av8Var2, bkh.e(utcVar, 48.0f));
            xtc d0 = l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a3 = t23.a(p4hVar, kv1Var, av8Var2, 0);
            int hashCode4 = Long.hashCode(av8Var2.T);
            aee m4 = av8Var2.m();
            xtc C4 = fqj.C(av8Var2, d0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(function02);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m4, ff3Var);
            bf3.s(hashCode4, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C4, f50Var3);
            xtc c0 = l98.c0(n9e.q(utcVar, lz.D(R.color.success, av8Var2), o7g.a(2.0f)), 6.0f, 2.0f);
            yf8 yf8Var = xth.a;
            boolean z2 = false;
            udj.c(oea.w(R.string.percent_off, new Object[]{yid.r(30)}, av8Var2), c0, lz.D(R.color.surface_1, av8Var2), null, 0L, null, 0L, null, new p7j(5), 0L, 0, false, 0, 0, null, f6a.N(xth.g()), av8Var2, 0, 0, 130040);
            udj.c(oea.v(R.string.sofascore_analyst_wc_elevate, av8Var2), l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5), lz.D(R.color.on_color_primary, av8Var2), null, 0L, null, 0L, null, new p7j(5), 0L, 0, false, 0, 0, null, xth.j(), av8Var2, 48, 0, 130040);
            v9g.f(oea.v(R.string.sofascore_analyst_benefit_wc_104, av8Var2), l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), lz.D(R.color.on_color_primary, av8Var2), lz.D(R.color.on_color_primary, av8Var2), av8Var2, 48, 0);
            v9g.f(oea.v(R.string.sofascore_analyst_benefit_player_form, av8Var2), l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), lz.D(R.color.on_color_primary, av8Var2), lz.D(R.color.on_color_primary, av8Var2), av8Var2, 48, 0);
            v9g.f(oea.v(R.string.sofascore_analyst_benefit_corners, av8Var2), l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), lz.D(R.color.on_color_primary, av8Var2), lz.D(R.color.on_color_primary, av8Var2), av8Var2, 48, 0);
            xtc f2 = vxd.f(utcVar, 16.0f, av8Var2, utcVar, 1.0f);
            String v = oea.v(R.string.claim_offer, av8Var2);
            boolean i6 = av8Var2.i(context);
            if (i4 == 4) {
                z2 = true;
            }
            boolean z3 = i6 | z2;
            Object O4 = av8Var2.O();
            if (z3 || O4 == obj) {
                final int i7 = 1;
                fvVar2 = fvVar;
                O4 = new Function0() { // from class: juh
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i62 = i7;
                        fv fvVar3 = fvVar2;
                        Context context2 = context;
                        switch (i62) {
                            case 0:
                                nv.p0(context2, fvVar3, "analyst", "banner", null);
                                break;
                            default:
                                nv.o0(context2, fvVar3, "analyst", "banner", null);
                                int i72 = UpgradeSofascoreActivity.M;
                                e2f.k(context2, false);
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var2.n0(O4);
            } else {
                fvVar2 = fvVar;
            }
            mha.h(v, (Function0) O4, f2, lqh.a, null, false, false, false, 0L, 0, 0, av8Var2, 3456, 0, 2032);
            av8Var = av8Var2;
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            av8Var.s(true);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            fvVar2 = fvVar;
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mfh(fvVar2, function0, xtcVar, i, 1);
        }
    }

    public static final void j(cai caiVar, Function1 function1, String str, lrh lrhVar, of3 of3Var, int i, int i2) {
        String str2;
        int i3;
        lrh lrhVar2;
        int i4;
        av8 av8Var;
        lrh lrhVar3;
        String str3;
        String str4;
        caiVar.getClass();
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1846076276);
        int i5 = i | (av8Var2.e(caiVar.ordinal()) ? 4 : 2) | (av8Var2.i(function1) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i5 | 384;
            str2 = str;
        } else {
            str2 = str;
            i3 = i5 | (av8Var2.g(str2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i4 = i3 | 3072;
            lrhVar2 = lrhVar;
        } else {
            lrhVar2 = lrhVar;
            i4 = i3 | (av8Var2.g(lrhVar2) ? a.o : 1024);
        }
        if (av8Var2.T(i4 & 1, (i4 & 1171) != 1170)) {
            String str5 = i6 != 0 ? null : str2;
            lrh lrhVar4 = i7 != 0 ? irh.m : lrhVar2;
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(Boolean.FALSE);
                av8Var2.n0(O);
            }
            e1d e1dVar = (e1d) O;
            l8g a2 = k8g.a(ww9.b, uxf.l, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, utc.a);
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
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = new tra(23, e1dVar);
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            qha.g(R.drawable.ic_list_view_black, (Function0) O2, null, lrhVar4, false, false, true, av8Var, (i4 & 7168) | 1572912, 52);
            lrh lrhVar5 = lrhVar4;
            kp5 kp5Var = cai.f;
            ArrayList arrayList = new ArrayList();
            for (Object obj : kp5Var) {
                cai caiVar2 = (cai) obj;
                if (!Intrinsics.c(str5, Sports.AMERICAN_FOOTBALL) || caiVar2 != cai.c) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                str4 = str5;
                av8Var.d0(1425914410);
                av8Var.s(false);
            } else {
                av8Var.d0(1424464261);
                Object O3 = av8Var.O();
                if (O3 == a99Var) {
                    O3 = e.f(caiVar);
                    av8Var.n0(O3);
                }
                e1d e1dVar2 = (e1d) O3;
                boolean booleanValue = ((Boolean) e1dVar.getValue()).booleanValue();
                long D = lz.D(R.color.surface_P, av8Var);
                n7g a3 = o7g.a(8.0f);
                Object O4 = av8Var.O();
                if (O4 == a99Var) {
                    O4 = new tra(24, e1dVar);
                    av8Var.n0(O4);
                }
                str4 = str5;
                u10.a(booleanValue, (Function0) O4, null, 0L, null, null, a3, D, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, yqo.H(-1109313384, av8Var, new er6(arrayList, function1, e1dVar2, e1dVar, 25)), av8Var, 48, 1852);
                av8Var = av8Var;
                av8Var.s(false);
            }
            av8Var.s(true);
            lrhVar3 = lrhVar5;
            str3 = str4;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            lrhVar3 = lrhVar2;
            str3 = str2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bk1(caiVar, function1, str3, lrhVar3, i, i2);
        }
    }

    public static final void k(Gender gender, sza szaVar, qug qugVar, boolean z, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(829420450);
        int i3 = (i & 6) == 0 ? (av8Var.e(gender == null ? -1 : gender.ordinal()) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= av8Var.e(szaVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var.g(qugVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= av8Var.h(z) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= av8Var.i(function1) ? 16384 : 8192;
        }
        int i4 = i3 | 196608;
        if (av8Var.T(i4 & 1, (74899 & i4) != 74898)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                List j = b.j(sza.c, sza.d, sza.e, sza.f, sza.g, sza.h);
                ArrayList arrayList = new ArrayList();
                for (Object obj : j) {
                    if (((sza) obj) != sza.h || z) {
                        arrayList.add(obj);
                    }
                }
                av8Var.n0(arrayList);
                O = arrayList;
            }
            List list = (List) O;
            utc utcVar = utc.a;
            xtc f0 = l98.f0(bkh.e(bkh.d(utcVar, 1.0f), 48.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            wxf wxfVar = ww9.b;
            lv1 lv1Var = uxf.l;
            l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 0);
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
            String a3 = new n9k(R.string.player, gender).a(av8Var);
            long D = lz.D(R.color.n_lv_3, av8Var);
            yf8 yf8Var = xth.a;
            xtcVar2 = utcVar;
            int i5 = 16384;
            boolean z2 = true;
            udj.c(a3, l98.f0(bkh.p(utcVar, 128.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.m(), av8Var, 48, 0, 131064);
            av8Var = av8Var;
            w1l.o(1.0f, true, av8Var);
            xtc Z = hkg.Z(xtcVar2, qugVar, false, 14);
            l8g a4 = k8g.a(wxfVar, lv1Var, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, Z);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            av8Var.d0(728880885);
            Iterator it = list.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i7 = i6 + 1;
                if (i6 < 0) {
                    b.q();
                    throw null;
                }
                sza szaVar2 = (sza) next;
                boolean z3 = szaVar == szaVar2 ? z2 : false;
                kv1 kv1Var = uxf.p;
                boolean z4 = !z3;
                boolean e2 = ((i4 & 57344) == i5 ? z2 : false) | av8Var.e(szaVar2.ordinal());
                Object O2 = av8Var.O();
                if (e2 || O2 == a99Var) {
                    i2 = 4;
                    O2 = new ixa(i2, function1, szaVar2);
                    av8Var.n0(O2);
                } else {
                    i2 = 4;
                }
                av8 av8Var2 = av8Var;
                xtc xtcVar3 = xtcVar2;
                xtc y = tol.y(xtcVar3, z4, false, false, 0L, null, (Function0) O2, av8Var2, 30);
                u23 a5 = t23.a(ww9.d, kv1Var, av8Var2, 48);
                int hashCode3 = Long.hashCode(av8Var2.T);
                aee m3 = av8Var2.m();
                xtc C3 = fqj.C(av8Var2, y);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var2);
                } else {
                    av8Var2.q0();
                }
                f50 f50Var4 = hf3.g;
                waa.K(av8Var2, a5, f50Var4);
                ff3 ff3Var2 = hf3.f;
                waa.K(av8Var2, m3, ff3Var2);
                Integer valueOf2 = Integer.valueOf(hashCode3);
                f50 f50Var5 = hf3.j;
                waa.K(av8Var2, valueOf2, f50Var5);
                ry ryVar2 = hf3.k;
                waa.J(av8Var2, ryVar2);
                f50 f50Var6 = hf3.d;
                waa.K(av8Var2, C3, f50Var6);
                k1c c2 = e12.c(uxf.c, false);
                boolean z5 = z2;
                int hashCode4 = Long.hashCode(av8Var2.T);
                aee m4 = av8Var2.m();
                Iterator it2 = it;
                xtc C4 = fqj.C(av8Var2, xtcVar3);
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var2);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, c2, f50Var4);
                waa.K(av8Var2, m4, ff3Var2);
                bf3.s(hashCode4, av8Var2, f50Var5, av8Var2, ryVar2);
                waa.K(av8Var2, C4, f50Var6);
                String str = szaVar2.a;
                xtc p = bkh.p(xtcVar3, 32.0f);
                yf8 yf8Var2 = xth.a;
                xtcVar2 = xtcVar3;
                q5a.w(str, p, z3 ? ljg.f(av8Var2, 2020060167, R.color.primary_default, av8Var2, false) : ljg.f(av8Var2, 2020060957, R.color.n_lv_3, av8Var2, false), null, 0L, 0L, new p7j(3), 0L, 2, false, 1, 0, (dfj) xth.r.getValue(), av8Var2, 48, 24960, 109560);
                av8Var = av8Var2;
                if (i6 != list.size() - 1) {
                    av8Var.d0(-1802355775);
                    tz9.r(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 14, 0L, 0L, av8Var, n12.a.a(bkh.e(xtcVar2, 20.0f), uxf.h));
                    av8Var = av8Var;
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1802097266);
                    av8Var.s(false);
                }
                av8Var.s(z5);
                if (z3) {
                    av8Var.d0(-1665146998);
                    kq9.b(s6a.N(R.drawable.ic_position_arrow_down_8, 6, av8Var), null, bkh.l(xtcVar2, 8.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1664819576);
                    av8Var.s(false);
                }
                av8Var.s(true);
                z2 = true;
                i6 = i7;
                it = it2;
                i5 = 16384;
            }
            boolean z6 = z2;
            ljg.t(av8Var, false, z6, z6);
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hp1(gender, szaVar, qugVar, z, function1, xtcVar2, i, 6);
        }
    }

    public static final void l(kza kzaVar, qug qugVar, sza szaVar, boolean z, xtc xtcVar, of3 of3Var, int i) {
        Object kd3Var;
        pm3 pm3Var;
        e1d e1dVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2117299119);
        int i2 = (i & 6) == 0 ? (av8Var.g(kzaVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= av8Var.g(qugVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.e(szaVar.ordinal()) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.h(z) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var.g(xtcVar) ? 16384 : 8192;
        }
        if (av8Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                List j = b.j(sza.c, sza.d, sza.e, sza.f, sza.g, sza.h);
                ArrayList arrayList = new ArrayList();
                for (Object obj : j) {
                    if (((sza) obj) != sza.h || z) {
                        arrayList.add(obj);
                    }
                }
                av8Var.n0(arrayList);
                O = arrayList;
            }
            List list = (List) O;
            boolean z2 = av8Var.k(dh3.n) == ema.b;
            xtc e2 = bkh.e(bkh.d(xtcVar, 1.0f), 48.0f);
            av8Var.d0(-1003410150);
            av8Var.d0(212064437);
            av8Var.s(false);
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new t1c(kx4Var);
                av8Var.n0(O2);
            }
            t1c t1cVar = (t1c) O2;
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = new am3();
                av8Var.n0(O3);
            }
            am3 am3Var = (am3) O3;
            Object O4 = av8Var.O();
            if (O4 == a99Var) {
                O4 = e.f(Boolean.FALSE);
                av8Var.n0(O4);
            }
            e1d e1dVar2 = (e1d) O4;
            Object O5 = av8Var.O();
            if (O5 == a99Var) {
                O5 = new pm3(am3Var);
                av8Var.n0(O5);
            }
            pm3 pm3Var2 = (pm3) O5;
            Object O6 = av8Var.O();
            if (O6 == a99Var) {
                O6 = e.e(Unit.a, f7a.k);
                av8Var.n0(O6);
            }
            e1d e1dVar3 = (e1d) O6;
            boolean i3 = av8Var.i(t1cVar) | av8Var.e(257);
            Object O7 = av8Var.O();
            if (i3 || O7 == a99Var) {
                kd3Var = new kd3(e1dVar3, t1cVar, pm3Var2, e1dVar2, 7);
                pm3Var = pm3Var2;
                e1dVar = e1dVar2;
                av8Var.n0(kd3Var);
            } else {
                kd3Var = O7;
                pm3Var = pm3Var2;
                e1dVar = e1dVar2;
            }
            k1c k1cVar = (k1c) kd3Var;
            Object O8 = av8Var.O();
            int i4 = 7;
            if (O8 == a99Var) {
                O8 = new ld3(e1dVar, pm3Var, i4);
                av8Var.n0(O8);
            }
            Function0 function0 = (Function0) O8;
            boolean i5 = av8Var.i(t1cVar);
            Object O9 = av8Var.O();
            if (i5 || O9 == a99Var) {
                O9 = new md3(t1cVar, i4);
                av8Var.n0(O9);
            }
            s6a.h(o3h.a(e2, false, (Function1) O9), yqo.H(1200550679, av8Var, new iza(e1dVar3, am3Var, function0, z2, qugVar, kzaVar, list, szaVar)), k1cVar, av8Var, 48);
            av8Var.s(false);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ki4(kzaVar, qugVar, szaVar, z, xtcVar, i, 8);
        }
    }

    public static final void m(boolean z, String str, gv9 gv9Var, uv3 uv3Var, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var;
        xtc xtcVar2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-418296427);
        int i2 = i | (av8Var2.h(z) ? 4 : 2) | (av8Var2.g(str) ? 32 : 16) | (av8Var2.g(gv9Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.g(uv3Var) ? a.o : 1024) | (av8Var2.i(function1) ? 16384 : 8192) | 196608;
        if (av8Var2.T(i2 & 1, (74899 & i2) != 74898)) {
            Object O = av8Var2.O();
            if (O == nf3.a) {
                O = new pcl(14);
                av8Var2.n0(O);
            }
            jvg u = haa.u((Function1) O, av8Var2, 6);
            utc utcVar = utc.a;
            xtc a2 = bvg.a(bkh.d(utcVar, 1.0f), u, ewd.a, null, true, false, null, 128);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, a2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            n(z, str, av8Var2, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            long D = lz.D(R.color.on_color_primary, av8Var2);
            long D2 = lz.D(R.color.on_color_primary, av8Var2);
            long D3 = lz.D(R.color.on_color_highlight_1, av8Var2);
            int i3 = i2 >> 6;
            un0.d(gv9Var, uv3Var, function1, D, D2, null, lz.D(R.color.on_color_primary, av8Var2), new r13(D3), lz.D(R.color.on_color_highlight_1, av8Var2), lz.D(R.color.on_color_highlight_1, av8Var2), lqh.a, false, av8Var2, (i3 & 896) | (i3 & 14) | 196608 | (i3 & 112), 54, 0);
            av8Var = av8Var2;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new x64(z, str, gv9Var, uv3Var, function1, xtcVar2, i, 9);
        }
    }

    public static final void n(boolean z, String str, of3 of3Var, int i) {
        int i2;
        boolean z2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1762241688);
        if ((i & 6) == 0) {
            i2 = i | (av8Var.h(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(str) ? 32 : 16;
        }
        int i3 = i2;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
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
            if (z) {
                av8Var.d0(1092369813);
                xtc c0 = l98.c0(bkh.d(utcVar, 1.0f), 16.0f, 8.0f);
                l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 54);
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
                wkn.k(haa.t(2131233094, 0, av8Var), null, bkh.l(utcVar, 48.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 440, 120);
                nq8.h(av8Var, bkh.p(utcVar, 12.0f));
                yf8 yf8Var = xth.a;
                z2 = true;
                udj.c(str, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, (i3 >> 3) & 14, 0, 131066);
                av8Var.s(true);
                udj.c(oea.v(R.string.team_spotlight_matches_unselected, av8Var), l98.c0(utcVar, 16.0f, 8.0f), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 48, 0, 131064);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                av8Var.d0(1093442661);
                String v = oea.v(R.string.select_your_team, av8Var);
                yf8 yf8Var2 = xth.a;
                udj.c(v, l98.f0(utcVar, 16.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, 4), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, 48, 0, 131064);
                av8Var = av8Var;
                av8Var.s(false);
                z2 = true;
            }
            av8Var.s(z2);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l9b(i, 3, str, z);
        }
    }

    public static int o(float f2, int i) {
        return fc6.a(f2, i, 31);
    }

    public static final void p(d8j d8jVar, final Context context, final boolean z, final CharSequence charSequence, final long j) {
        if (pej.d(j) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        List list = (List) v9g.g.invoke(context);
        if (list.isEmpty()) {
            return;
        }
        d8jVar.a();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            d8jVar.a.a(new m8j(new d8f(i), resolveInfo.loadLabel(packageManager).toString(), 0, new Function1() { // from class: e8f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    v9g.h.invoke(context, resolveInfo, Boolean.valueOf(z), charSequence, new pej(j));
                    ((r8j) obj).close();
                    return Unit.a;
                }
            }));
        }
        d8jVar.a();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003d -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object q(defpackage.noi r7, defpackage.h21 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.c5g
            if (r0 == 0) goto L13
            r0 = r8
            c5g r0 = (defpackage.c5g) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            c5g r0 = new c5g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.s
            lu3 r1 = defpackage.lu3.a
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            noi r7 = r0.r
            defpackage.y6a.M(r8)
            goto L40
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.a70.r(r7)
            r7 = 0
            return r7
        L30:
            defpackage.y6a.M(r8)
        L33:
            r0.r = r7
            r0.t = r3
            gze r8 = defpackage.gze.b
            java.lang.Object r8 = r7.b(r8, r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            fze r8 = (defpackage.fze) r8
            int r2 = r8.d
            java.util.List r8 = r8.a
            r2 = r2 & 66
            if (r2 == 0) goto L33
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L50:
            if (r5 >= r2) goto L62
            java.lang.Object r6 = r8.get(r5)
            mze r6 = (defpackage.mze) r6
            boolean r6 = defpackage.qea.k(r6)
            if (r6 != 0) goto L5f
            goto L33
        L5f:
            int r5 = r5 + 1
            goto L50
        L62:
            java.lang.Object r7 = r8.get(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g7a.q(noi, h21):java.lang.Object");
    }

    public static final k7d t(View view) {
        view.getClass();
        k7d k7dVar = (k7d) i5h.j(i5h.o(e5h.e(view, new a7d(8)), new a7d(9)));
        if (k7dVar != null) {
            return k7dVar;
        }
        ilg.f(view, " does not have a NavController set", "View ");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [km5] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    public static final void u(olk olkVar, Map map) {
        ?? r0;
        nlk nlkVar;
        flk flkVar;
        alk alkVar;
        olkVar.getClass();
        tkk tkkVar = olkVar.b;
        if (tkkVar == null || (flkVar = tkkVar.a) == null || (alkVar = flkVar.d) == null) {
            r0 = km5.a;
        } else {
            ArrayList arrayList = alkVar.a;
            r0 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                List a2 = ((zkk) next).a();
                if (a2 != null && !a2.isEmpty()) {
                    r0.add(next);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = r0.iterator();
        while (it2.hasNext()) {
            hlk hlkVar = ((zkk) it2.next()).a;
            String str = (hlkVar == null || (nlkVar = hlkVar.c) == null) ? null : nlkVar.b;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        w(map, arrayList2, "Click");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [km5] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4, types: [km5] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    public static final void v(olk olkVar, int i, Map map) {
        ?? r0;
        List arrayList;
        ?? r2;
        List list;
        flk flkVar;
        alk alkVar;
        List list2;
        flk flkVar2;
        alk alkVar2;
        olkVar.getClass();
        if (i == 0) {
            throw null;
        }
        tkk tkkVar = olkVar.b;
        if (i == 0) {
            throw null;
        }
        switch (wt3.C(i)) {
            case 0:
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
                if (tkkVar == null || (flkVar = tkkVar.a) == null || (alkVar = flkVar.d) == null) {
                    r0 = km5.a;
                } else {
                    ArrayList arrayList2 = alkVar.a;
                    r0 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        List a2 = ((zkk) next).a();
                        if (a2 != null && !a2.isEmpty()) {
                            r0.add(next);
                        }
                    }
                }
                arrayList = new ArrayList();
                Iterator it2 = r0.iterator();
                while (it2.hasNext()) {
                    hlk hlkVar = ((zkk) it2.next()).a;
                    if (hlkVar == null || (list = hlkVar.b.a) == null) {
                        r2 = km5.a;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : list) {
                            if (((llk) obj).c == i) {
                                arrayList3.add(obj);
                            }
                        }
                        r2 = new ArrayList(k13.r(arrayList3, 10));
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            r2.add(((llk) it3.next()).a);
                        }
                    }
                    o13.v(r2, arrayList);
                }
                break;
            case 13:
                if (tkkVar == null || (flkVar2 = tkkVar.a) == null || (alkVar2 = flkVar2.d) == null) {
                    list2 = km5.a;
                } else {
                    ArrayList arrayList4 = alkVar2.a;
                    list2 = new ArrayList();
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        ykk ykkVar = ((zkk) it4.next()).b;
                        o13.v(ykkVar != null ? ykkVar.a : km5.a, list2);
                    }
                }
                arrayList = new ArrayList();
                Iterator it5 = list2.iterator();
                while (it5.hasNext()) {
                    List list3 = ((xkk) it5.next()).b.a;
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj2 : list3) {
                        if (((llk) obj2).c == i) {
                            arrayList5.add(obj2);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(k13.r(arrayList5, 10));
                    Iterator it6 = arrayList5.iterator();
                    while (it6.hasNext()) {
                        arrayList6.add(((llk) it6.next()).a);
                    }
                    o13.v(arrayList6, arrayList);
                }
                break;
            case 14:
                arrayList = km5.a;
                break;
            default:
                zzl.b();
                return;
        }
        w(map, arrayList, dmi.A(i));
    }

    public static g9i w(Map map, List list, String str) {
        ct8 ct8Var = v14.b;
        if (ct8Var == null) {
            ct8Var = ztj.a;
        }
        ct8 ct8Var2 = ct8Var;
        list.getClass();
        str.getClass();
        map.getClass();
        ct8Var2.getClass();
        ad2 ad2Var = oc3.a;
        hs4 hs4Var = z45.a;
        return xw3.L(ad2Var, hq4.c, null, new kuj(list, map, ct8Var2, str, (rq3) null), 2);
    }

    public static final Object x(g1c g1cVar) {
        Object h = g1cVar.h();
        jma jmaVar = h instanceof jma ? (jma) h : null;
        if (jmaVar != null) {
            return jmaVar.t0();
        }
        return null;
    }

    public static Serializable y(Intent intent, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return z9.o(intent, str, cls);
        }
        Serializable serializableExtra = intent.getSerializableExtra(str);
        if (cls.isInstance(serializableExtra)) {
            return serializableExtra;
        }
        return null;
    }

    public static final f6e z(f6e f6eVar, Function2 function2) {
        f6eVar.getClass();
        return new f6e(new v98(f6eVar.a, function2, 5), f6eVar.b, f6eVar.c, jxa.D);
    }

    public Metadata r(vic vicVar) {
        ByteBuffer byteBuffer = vicVar.h;
        byteBuffer.getClass();
        qx9.r(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (vicVar.i(Integer.MIN_VALUE)) {
            return null;
        }
        return s(vicVar, byteBuffer);
    }

    public abstract Metadata s(vic vicVar, ByteBuffer byteBuffer);
}
