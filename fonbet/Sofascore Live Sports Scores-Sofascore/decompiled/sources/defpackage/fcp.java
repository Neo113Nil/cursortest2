package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.EditText;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.WorkDatabase;
import com.appsflyer.internal.i;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.WSCGameData;
import com.sofascore.model.newNetwork.WSCStory;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class fcp implements Decoder, uf3 {
    public static final y3g e;
    public static final y3g f;
    public static final y3g g;
    public static final y3g h;
    public static final y3g i;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;
    public static final /* synthetic */ int m = 0;
    public static final /* synthetic */ int n = 0;
    public static final tc3 a = new tc3(-735235971, new qs2(4), false);
    public static final tc3 b = new tc3(306352663, new qd3(1), false);
    public static final tc3 c = new tc3(-1763137157, new ud3(23), false);
    public static final s58 d = new s58(1);
    public static final Object j = new Object();

    static {
        int i2 = 9;
        e = new y3g(i2, new wqg(3), new vqg(13));
        f = new y3g(i2, new wqg(4), new vqg(14));
        g = new y3g(i2, new wqg(5), new vqg(15));
        h = new y3g(i2, new wqg(6), new vqg(16));
        i = new y3g(i2, new wqg(7), new vqg(17));
    }

    public static final void F(s4c s4cVar, String str, of3 of3Var, int i2) {
        int i3;
        String str2 = s4cVar.f;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1116480529);
        int i4 = i2 | (av8Var.g(s4cVar) ? 4 : 2) | (av8Var.g(str) ? 32 : 16);
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            xtc d2 = bkh.d(utcVar, 1.0f);
            l8g a3 = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            xtc c0 = l98.c0(n9e.q(utcVar, lz.D(R.color.secondary_default, av8Var), o7g.a(12.0f)), 10.0f, 2.0f);
            double d3 = s4cVar.b;
            String str3 = s4cVar.k;
            String str4 = s4cVar.g;
            String str5 = s4cVar.j;
            String i5 = wv8.i(str2, "/", str5);
            if (str5 == null) {
                i5 = null;
            }
            if (i5 != null) {
                str2 = i5;
            }
            yf8 yf8Var = xth.a;
            i3 = 1;
            udj.c(str2, c0, lz.D(R.color.surface_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131064);
            udj.c(yaa.D((Context) av8Var.k(nz.b), s4cVar.a, str), new goa(1.0f, true), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 130040);
            xtc c02 = l98.c0(n9e.q(utcVar, lz.D(R.color.primary_default, av8Var), o7g.a(12.0f)), 10.0f, 2.0f);
            String i6 = str3 != null ? wv8.i(str4, "/", str3) : null;
            if (i6 == null) {
                i6 = str4;
            }
            udj.c(i6, c02, lz.D(R.color.surface_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131064);
            av8Var = av8Var;
            av8Var.s(true);
            double d4 = d3 + s4cVar.d;
            Float valueOf2 = s4cVar.i ? Float.valueOf(i0(d3, s4cVar.c)) : null;
            float floatValue = valueOf2 != null ? valueOf2.floatValue() : i0(d3, d4);
            xtc q = n9e.q(wnn.A(l98.f0(bkh.e(bkh.d(utcVar, 1.0f), 24.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), o7g.a(16.0f)), lz.D(R.color.n_lv_5, av8Var), oyn.e);
            long D = lz.D(R.color.secondary_default, av8Var);
            long D2 = lz.D(R.color.primary_default, av8Var);
            boolean d5 = av8Var.d(floatValue);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (d5 || O == a99Var) {
                O = new va6(floatValue);
                av8Var.n0(O);
            }
            Function0 function0 = (Function0) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new au5(24);
                av8Var.n0(O2);
            }
            ncf.c(function0, q, D, D2, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Function1) O2, av8Var, 1769472);
            av8Var.s(true);
        } else {
            i3 = 1;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new sa6(s4cVar, str, i2, i3);
        }
    }

    public static final void G(String str, String str2, of3 of3Var, int i2) {
        String str3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1935033112);
        int i3 = i2 | (av8Var.g(str) ? 4 : 2) | (av8Var.g(str2) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc d0 = l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a2 = k8g.a(ww9.b, uxf.l, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            kq9.b(s6a.N(R.drawable.ic_done, 6, av8Var), null, bkh.l(utcVar, 24.0f), lz.D(R.color.success, av8Var), av8Var, 432, 0);
            nq8.h(av8Var, bkh.p(utcVar, 16.0f));
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            yf8 yf8Var = xth.a;
            udj.c(str, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, (i3 & 14) | 48, 0, 131064);
            nq8.h(av8Var, bkh.e(utcVar, 12.0f));
            str3 = str2;
            udj.c(str3, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, (i3 >> 3) & 14, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            str3 = str2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new v54(str, str3, i2, 0);
        }
    }

    public static final qz1 H(long j2, float f2) {
        return new qz1(f2, new pvh(j2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x02d6, code lost:
    
        if (r13 == r12) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void I(s4c s4cVar, of3 of3Var, int i2) {
        av8 av8Var;
        Object obj;
        a99 a99Var;
        s4cVar.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(368421263);
        int i3 = i2 | (av8Var2.g(s4cVar) ? 4 : 2);
        if (av8Var2.T(i3 & 1, (i3 & 3) != 2)) {
            Context context = (Context) av8Var2.k(nz.b);
            boolean z = s4cVar.i;
            boolean z2 = s4cVar.h;
            double d2 = s4cVar.e;
            double d3 = s4cVar.c;
            double d4 = s4cVar.b;
            double d5 = s4cVar.d;
            int compare = z ? Float.compare(i0(d4, d3), i0(d5, d2)) : Double.compare(d4, d5);
            double d6 = d4 + d5;
            String D = yaa.D(context, s4cVar.a, Sports.BASKETBALL);
            Float valueOf = Float.valueOf(i0(d4, d3));
            if (!z) {
                valueOf = null;
            }
            float floatValue = valueOf != null ? valueOf.floatValue() : i0(d4, d6);
            Float valueOf2 = Float.valueOf(i0(d5, d2));
            if (!z) {
                valueOf2 = null;
            }
            float floatValue2 = valueOf2 != null ? valueOf2.floatValue() : i0(d5, d6);
            int b2 = wzb.b(floatValue * 100.0f);
            Object valueOf3 = Integer.valueOf(wzb.b(100.0f * floatValue2));
            if (!z) {
                valueOf3 = null;
            }
            if (valueOf3 == null) {
                valueOf3 = Float.valueOf(i0(d5, d6));
            }
            Object obj2 = valueOf3;
            float f2 = floatValue;
            Object O = av8Var2.O();
            a99 a99Var2 = nf3.a;
            if (O == a99Var2) {
                NumberFormat numberFormat = NumberFormat.getInstance(dla.d());
                numberFormat.setMaximumFractionDigits(2);
                av8Var2.n0(numberFormat);
                obj = numberFormat;
            } else {
                obj = O;
            }
            NumberFormat numberFormat2 = (NumberFormat) obj;
            Object O2 = av8Var2.O();
            if (O2 == a99Var2) {
                O2 = numberFormat2.format(d5);
                av8Var2.n0(O2);
            }
            String str = (String) O2;
            Object O3 = av8Var2.O();
            if (O3 == a99Var2) {
                Double valueOf4 = Double.valueOf(d2);
                if (!z) {
                    valueOf4 = null;
                }
                O3 = numberFormat2.format(valueOf4 != null ? valueOf4.doubleValue() : d6);
                av8Var2.n0(O3);
            }
            String str2 = (String) O3;
            utc utcVar = utc.a;
            xtc d7 = bkh.d(utcVar, 1.0f);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, d7);
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
            waa.K(av8Var2, m2, ff3Var);
            Integer valueOf5 = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf5, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            String format = numberFormat2.format(d4);
            Double valueOf6 = z ? Double.valueOf(d3) : null;
            String i4 = wv8.i(format, "/\u200b", numberFormat2.format(valueOf6 != null ? valueOf6.doubleValue() : d6));
            yf8 yf8Var = xth.a;
            float f3 = floatValue2;
            udj.c(i4, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var2, 0, 0, 131066);
            xtc f0 = l98.f0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            mv1 mv1Var = uxf.g;
            k1c c2 = e12.c(mv1Var, false);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, f0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c2, f50Var);
            waa.K(av8Var2, m3, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            udj.c(b2 + "%", null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var2, 0, 0, 131066);
            xtc l2 = bkh.l(utcVar, 42.0f);
            long j0 = j0(compare, av8Var2, true, z2);
            long D2 = lz.D(R.color.n_lv_5, av8Var2);
            boolean d8 = av8Var2.d(f2);
            Object O4 = av8Var2.O();
            if (d8) {
                a99Var = a99Var2;
            } else {
                a99Var = a99Var2;
            }
            O4 = new va6(f2);
            av8Var2.n0(O4);
            a99 a99Var3 = a99Var;
            ncf.b((Function0) O4, l2, j0, 6.0f, D2, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 1575984, 0);
            av8Var2.s(true);
            udj.c(D, l98.d0(new goa(1.0f, true), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.b(), av8Var2, 0, 0, 130040);
            xtc f02 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
            k1c c3 = e12.c(mv1Var, false);
            int hashCode3 = Long.hashCode(av8Var2.T);
            aee m4 = av8Var2.m();
            xtc C3 = fqj.C(av8Var2, f02);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c3, f50Var);
            waa.K(av8Var2, m4, ff3Var);
            bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C3, f50Var3);
            udj.c(obj2 + "%", null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var2, 0, 0, 131066);
            xtc l3 = bkh.l(utcVar, 42.0f);
            long j02 = j0(compare, av8Var2, false, z2);
            long D3 = lz.D(R.color.n_lv_5, av8Var2);
            boolean d9 = av8Var2.d(f3);
            Object O5 = av8Var2.O();
            if (d9 || O5 == a99Var3) {
                O5 = new va6(f3);
                av8Var2.n0(O5);
            }
            ncf.b((Function0) O5, l3, j02, 6.0f, D3, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 1575984, 0);
            av8Var2.s(true);
            udj.c(str + "/\u200b" + str2, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var2, 0, 0, 131066);
            av8 av8Var3 = av8Var2;
            av8Var3.s(true);
            av8Var = av8Var3;
        } else {
            av8Var2.W();
            av8Var = av8Var2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fv2(s4cVar, i2, 24);
        }
    }

    public static final void J(int i2, Function0 function0, xtc xtcVar, of3 of3Var, int i3) {
        int i4;
        Function0 function02;
        xtc xtcVar2;
        utc utcVar;
        e1d e1dVar;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1405676405);
        int i5 = 4;
        int i6 = i3 | (av8Var.e(i2) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | 384;
        if (av8Var.T(i6 & 1, (i6 & 147) != 146)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(Boolean.FALSE);
                av8Var.n0(O);
            }
            e1d e1dVar2 = (e1d) O;
            utc utcVar2 = utc.a;
            xtc A = wnn.A(bkh.d(utcVar2, 1.0f), o7g.a(16.0f));
            long D = lz.D(R.color.moto_gp, av8Var);
            jf9 jf9Var = oyn.e;
            xtc q = n9e.q(A, D, jf9Var);
            long D2 = lz.D(R.color.n_lv_4, av8Var);
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O2;
            Object[] objArr = new Object[0];
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = fi.C;
                av8Var.n0(O3);
            }
            xtc y = tol.y(q, true, true, true, D2, wzcVar, new dk1((boh) o3a.N(objArr, (Function0) O3, av8Var, 48), e1dVar2, i5), av8Var, 0);
            mv1 mv1Var = uxf.c;
            k1c c2 = e12.c(mv1Var, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, y);
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
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            wkn.k(haa.t(2131231344, 0, av8Var), null, n12.a.a(utcVar2, uxf.k), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 56, 120);
            xtc b0 = l98.b0(utcVar2, 16.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, b0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, utcVar2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            kq9.b(s6a.N(R.drawable.ic_crowdsourcing, 6, av8Var), null, bkh.l(utcVar2, 16.0f), lz.D(R.color.on_color_primary, av8Var), av8Var, 432, 0);
            String f2 = fc6.f(4.0f, R.string.crowdsourcing_sign_in_banner_title, av8Var, av8Var, utcVar2);
            yf8 yf8Var = xth.a;
            udj.c(f2, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
            bf3.t(av8Var, true, utcVar2, 4.0f, av8Var);
            udj.c(oea.v(R.string.crowdsourcing_sign_in_banner_body, av8Var), bkh.d(utcVar2, 0.75f), lz.D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 48, 0, 131064);
            nq8.h(av8Var, bkh.e(utcVar2, 12.0f));
            xtc c0 = l98.c0(n9e.q(wnn.A(utcVar2, o7g.a(48.0f)), lz.D(R.color.primary_default, av8Var), jf9Var), 16.0f, 8.0f);
            int i7 = 0;
            k1c c3 = e12.c(mv1Var, false);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m5 = av8Var.m();
            xtc C4 = fqj.C(av8Var, c0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c3, f50Var);
            waa.K(av8Var, m5, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            udj.c(oea.v(R.string.see_perks_button, av8Var), null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
            av8Var.s(true);
            if (((Boolean) e1dVar2.getValue()).booleanValue()) {
                av8Var.d0(576866011);
                dfh g2 = ctc.g(null, av8Var, 6, 2);
                Object O4 = av8Var.O();
                if (O4 == a99Var) {
                    e1dVar = e1dVar2;
                    O4 = new v30(9, e1dVar);
                    av8Var.n0(O4);
                } else {
                    e1dVar = e1dVar2;
                }
                i4 = i2;
                utcVar = utcVar2;
                function02 = function0;
                ctc.a((Function0) O4, null, g2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, lz.D(R.color.surface_1, av8Var), 0L, 0L, null, null, null, yqo.H(-1345776466, av8Var, new w54(i2, function0, e1dVar, i7)), av8Var, 6, 3072, 8122);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                i4 = i2;
                utcVar = utcVar2;
                function02 = function0;
                av8Var.d0(577713613);
                av8Var.s(false);
            }
            xtcVar2 = utcVar;
        } else {
            i4 = i2;
            function02 = function0;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zk1(i4, function02, xtcVar2, i3);
        }
    }

    public static final void K(int i2, of3 of3Var, xtc xtcVar, Function0 function0) {
        int i3;
        Function0 function02 = function0;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1815325266);
        int i4 = i2 | (av8Var.i(function02) ? 4 : 2) | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            xtc f0 = ml4.f0(l98.f0(bkh.d(hkg.u0(xtcVar, hkg.o0(av8Var), false, 14), 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7));
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            String v = oea.v(R.string.crowdsourcing_sign_in_perks_title, av8Var);
            yf8 yf8Var = xth.a;
            dfj i5 = xth.i();
            long D = lz.D(R.color.n_lv_1, av8Var);
            utc utcVar = utc.a;
            udj.c(v, l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, i5, av8Var, 48, 0, 131064);
            xtc d2 = bkh.d(bkh.e(l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 1), 1.0f), 1.0f);
            long D2 = lz.D(R.color.n_lv_4, av8Var);
            jf9 jf9Var = oyn.e;
            nq8.h(av8Var, n9e.q(d2, D2, jf9Var));
            G(oea.v(R.string.crowdsourcing_stay_informed_title, av8Var), oea.v(R.string.crowdsourcing_stay_informed_body, av8Var), av8Var, 0);
            G(bf3.g(24.0f, R.string.crowdsourcing_never_lose_track_title, av8Var, av8Var, utcVar), oea.v(R.string.crowdsourcing_never_lose_track_body, av8Var), av8Var, 0);
            G(bf3.g(24.0f, R.string.crowdsourcing_get_rewarded_title, av8Var, av8Var, utcVar), oea.v(R.string.crowdsourcing_get_rewarded_body, av8Var), av8Var, 0);
            nq8.h(av8Var, bkh.e(utcVar, 40.0f));
            xtc q = n9e.q(wnn.A(bkh.e(bkh.d(l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 1.0f), 40.0f), o7g.a(8.0f)), lz.D(R.color.primary_default, av8Var), jf9Var);
            long D3 = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = fi.D;
                av8Var.n0(O2);
            }
            xtc y = tol.y(q, true, true, true, D3, wzcVar, new gm(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), 8), av8Var, 0);
            k1c c2 = e12.c(uxf.g, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, y);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            function02 = function0;
            i3 = 2;
            udj.c(oea.v(R.string.user_sign_in, av8Var), null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.a(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            i3 = 2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fm(function02, xtcVar, i2, i3);
        }
    }

    public static final void L(ct8 ct8Var, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        e1d e1dVar;
        utc utcVar;
        ct8 ct8Var2 = ct8Var;
        ct8Var2.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-825517831);
        int i3 = (av8Var.i(ct8Var2) ? 4 : 2) | i2 | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(Boolean.TRUE);
                av8Var.n0(O);
            }
            e1d e1dVar2 = (e1d) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = e.f(Boolean.FALSE);
                av8Var.n0(O2);
            }
            e1d e1dVar3 = (e1d) O2;
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = e.f(Boolean.TRUE);
                av8Var.n0(O3);
            }
            e1d e1dVar4 = (e1d) O3;
            kv1 kv1Var = uxf.q;
            utc utcVar2 = utc.a;
            xtc f0 = l98.f0(l98.d0(n9e.q(wnn.A(l98.d0(bkh.d(utcVar2, 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), o7g.a(16.0f)), lz.D(R.color.surface_P, av8Var), oyn.e), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
            u23 a2 = t23.a(ww9.d, kv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            sha.a(6, 2, av8Var, null, "Delete app data");
            nq8.h(av8Var, bkh.e(utcVar2, 8.0f));
            xtc d0 = l98.d0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
            boolean booleanValue = ((Boolean) e1dVar2.getValue()).booleanValue();
            Object O4 = av8Var.O();
            if (O4 == a99Var) {
                e1dVar = e1dVar2;
                O4 = new w30(18, e1dVar);
                av8Var.n0(O4);
            } else {
                e1dVar = e1dVar2;
            }
            e1d e1dVar5 = e1dVar;
            o3a.g("Keep MCC/Region", booleanValue, (Function1) O4, d0, null, av8Var, 3462, 16);
            xtc d02 = l98.d0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
            boolean booleanValue2 = ((Boolean) e1dVar3.getValue()).booleanValue();
            Object O5 = av8Var.O();
            if (O5 == a99Var) {
                O5 = new w30(19, e1dVar3);
                av8Var.n0(O5);
            }
            o3a.g("Keep experiment", booleanValue2, (Function1) O5, d02, null, av8Var, 3462, 16);
            av8Var.d0(-1918877872);
            xtc d03 = l98.d0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
            boolean booleanValue3 = ((Boolean) e1dVar4.getValue()).booleanValue();
            Object O6 = av8Var.O();
            if (O6 == a99Var) {
                O6 = new w30(20, e1dVar4);
                av8Var.n0(O6);
            }
            o3a.g("Keep dev options", booleanValue3, (Function1) O6, d03, null, av8Var, 3462, 16);
            bf3.t(av8Var, false, utcVar2, 16.0f, av8Var);
            boolean z = (i3 & 14) == 4;
            Object O7 = av8Var.O();
            if (z || O7 == a99Var) {
                ct8Var2 = ct8Var;
                utcVar = utcVar2;
                pz4 pz4Var = new pz4(ct8Var2, e1dVar5, e1dVar3, e1dVar4, 0);
                av8Var.n0(pz4Var);
                O7 = pz4Var;
            } else {
                ct8Var2 = ct8Var;
                utcVar = utcVar2;
            }
            mha.h("Confirm", (Function0) O7, null, null, null, false, false, false, 0L, 0, 0, av8Var, 6, 0, 2044);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ns4(ct8Var2, xtcVar2, i2, 3);
        }
    }

    public static final void M(Event event, int i2, of3 of3Var, int i3) {
        e1d e1dVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1193480801);
        int i4 = (av8Var.i(event) ? 4 : 2) | i3 | (av8Var.e(i2) ? 32 : 16);
        int i5 = 8;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            boolean z = av8Var.k(dh3.n) == ema.b;
            xtc d2 = bkh.d(utc.a, 1.0f);
            long b2 = hkg.b(649179044);
            d2.getClass();
            xtc b0 = l98.b0(td4.X(d2, new yz(b2, 23)), 8.0f);
            av8Var.d0(-1003410150);
            av8Var.d0(212064437);
            av8Var.s(false);
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (O == obj) {
                O = new t1c(kx4Var);
                av8Var.n0(O);
            }
            t1c t1cVar = (t1c) O;
            Object O2 = av8Var.O();
            if (O2 == obj) {
                O2 = new am3();
                av8Var.n0(O2);
            }
            am3 am3Var = (am3) O2;
            Object O3 = av8Var.O();
            if (O3 == obj) {
                O3 = e.f(Boolean.FALSE);
                av8Var.n0(O3);
            }
            e1d e1dVar2 = (e1d) O3;
            Object O4 = av8Var.O();
            if (O4 == obj) {
                O4 = new pm3(am3Var);
                av8Var.n0(O4);
            }
            pm3 pm3Var = (pm3) O4;
            Object O5 = av8Var.O();
            if (O5 == obj) {
                O5 = e.e(Unit.a, f7a.k);
                av8Var.n0(O5);
            }
            e1d e1dVar3 = (e1d) O5;
            boolean i6 = av8Var.i(t1cVar) | av8Var.e(257);
            Object O6 = av8Var.O();
            if (i6 || O6 == obj) {
                O6 = new kd3(e1dVar3, t1cVar, pm3Var, e1dVar2, 8);
                e1dVar = e1dVar2;
                av8Var.n0(O6);
            } else {
                e1dVar = e1dVar2;
            }
            k1c k1cVar = (k1c) O6;
            Object O7 = av8Var.O();
            if (O7 == obj) {
                O7 = new ld3(e1dVar, pm3Var, i5);
                av8Var.n0(O7);
            }
            Function0 function0 = (Function0) O7;
            boolean i7 = av8Var.i(t1cVar);
            Object O8 = av8Var.O();
            if (i7 || O8 == obj) {
                O8 = new md3(t1cVar, i5);
                av8Var.n0(O8);
            }
            s6a.h(o3h.a(b0, false, (Function1) O8), yqo.H(1200550679, av8Var, new kzc(e1dVar3, am3Var, function0, event, context, z, i2)), k1cVar, av8Var, 48);
            av8Var.s(false);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new n61(event, i2, i3, i5);
        }
    }

    public static final void N(wa6 wa6Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        int i4;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1075337068);
        int i5 = 2;
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(wa6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i6 = 0;
        int i7 = 1;
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            int i8 = wa6Var.g;
            x43 x43Var = wa6Var.n;
            boolean z = wa6Var.e;
            tc3 H = yqo.H(-2079285242, av8Var2, new ra6(wa6Var, i6));
            tc3 H2 = yqo.H(-334363764, av8Var2, new ra6(wa6Var, i7));
            tc3 H3 = yqo.H(137975882, av8Var2, new ra6(wa6Var, i5));
            int i9 = i3 & 112;
            int i10 = i3 & 14;
            boolean z2 = (i9 == 32) | (i10 == 4);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (z2 || O == a99Var) {
                i4 = 0;
                O = new ta6(function1, wa6Var, i4);
                av8Var2.n0(O);
            } else {
                i4 = 0;
            }
            Function0 function0 = (Function0) O;
            int i11 = i9 == 32 ? 1 : i4;
            if (i10 == 4) {
                i4 = 1;
            }
            int i12 = i4 | i11;
            Object O2 = av8Var2.O();
            if (i12 != 0 || O2 == a99Var) {
                O2 = new ta6(function1, wa6Var, 1);
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            pco.a(i8, x43Var, xtcVar, H, H2, null, H3, null, null, null, false, z, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, function1, function0, (Function0) O2, av8Var, (i3 & 896) | 1600512, (i3 << 15) & 3670016, 63392);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ua6(wa6Var, function1, xtcVar, i2, 0);
        }
    }

    public static final void O(gv9 gv9Var, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        gv9Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2057827608);
        int i3 = (av8Var.g(gv9Var) ? 4 : 2) | i2;
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            xtcVar2 = xtcVar;
            un0.a(xtcVar2, o7g.a(12.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(91737690, av8Var, new k73(i4, gv9Var)), av8Var, 196614, 24);
        } else {
            xtcVar2 = xtcVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new y81(gv9Var, xtcVar2, i2, 8);
        }
    }

    public static final void P(int i2, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        zg3 zg3Var;
        lv1 lv1Var = uxf.l;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1942771259);
        int i3 = i2 | 6;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            utc utcVar = utc.a;
            xtc f0 = l98.f0(l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 5);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            String v = oea.v(R.string.fantasy_fdr_about_text, av8Var);
            yf8 yf8Var = xth.a;
            utc utcVar2 = utcVar;
            udj.c(v, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 0, 0, 131066);
            xtc f2 = vxd.f(utcVar2, 48.0f, av8Var, utcVar2, 1.0f);
            u23 a3 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, f2);
            av8Var.h0();
            if (av8Var.S) {
                zg3Var = zg3Var2;
                av8Var.l(zg3Var);
            } else {
                zg3Var = zg3Var2;
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            xtc d2 = bkh.d(utcVar2, 1.0f);
            l8g a4 = k8g.a(ww9.h, lv1Var, av8Var, 6);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            zg3 zg3Var3 = zg3Var;
            udj.c(oea.v(R.string.easy, av8Var), null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
            udj.c(oea.v(R.string.hard, av8Var), null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
            nq8.h(av8Var, bkh.e(utcVar2, 8.0f));
            int i4 = 6;
            ng0 ng0Var = new ng0(0.4f, true, new a70(i4));
            xtc A = wnn.A(bkh.d(utcVar2, 1.0f), o7g.a(4.0f));
            l8g a5 = k8g.a(ng0Var, lv1Var, av8Var, 6);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m5 = av8Var.m();
            xtc C4 = fqj.C(av8Var, A);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var3);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a5, f50Var);
            waa.K(av8Var, m5, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            av8Var.d0(224171423);
            Iterator<E> it = o68.i.iterator();
            while (it.hasNext()) {
                e12.a(0, av8Var, n9e.q(bkh.e(new goa(1.0f, true), 16.0f), lz.D(((o68) it.next()).a, av8Var), oyn.e));
            }
            boolean z = false;
            av8Var.s(false);
            av8Var.s(true);
            nq8.h(av8Var, bkh.e(utcVar2, 4.0f));
            ng0 ng0Var2 = new ng0(0.4f, true, new a70(i4));
            xtc d3 = bkh.d(utcVar2, 1.0f);
            l8g a6 = k8g.a(ng0Var2, lv1Var, av8Var, 6);
            int hashCode5 = Long.hashCode(av8Var.T);
            aee m6 = av8Var.m();
            xtc C5 = fqj.C(av8Var, d3);
            if3.k7.getClass();
            zg3 zg3Var4 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var4);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a6, hf3.g);
            waa.K(av8Var, m6, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode5), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C5, hf3.d);
            av8Var.d0(-1924229321);
            for (o68 o68Var : o68.i) {
                String valueOf2 = String.valueOf(o68Var.ordinal() + 1);
                goa goaVar = new goa(1.0f, true);
                long D = lz.D(o68Var.a, av8Var);
                p7j p7jVar = new p7j(3);
                yf8 yf8Var2 = xth.a;
                av8 av8Var2 = av8Var;
                udj.c(valueOf2, goaVar, D, null, 0L, null, 0L, null, p7jVar, 0L, 0, false, 0, 0, null, xth.e(), av8Var2, 0, 0, 130040);
                z = z;
                av8Var = av8Var2;
                utcVar2 = utcVar2;
            }
            i.p(av8Var, z, true, true, true);
            xtcVar2 = utcVar2;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l63(xtcVar2, i2, 7);
        }
    }

    public static final void Q(ho7 ho7Var, Function1 function1, gv9 gv9Var, gv9 gv9Var2, xtc xtcVar, of3 of3Var, int i2) {
        ksa ksaVar;
        Object zi7Var;
        int i3;
        int i4;
        a99 a99Var;
        e1d e1dVar;
        ksa ksaVar2;
        ho7 ho7Var2 = ho7Var;
        ho7Var2.getClass();
        function1.getClass();
        gv9Var.getClass();
        gv9Var2.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-978659660);
        int i5 = i2 | (av8Var.g(ho7Var2) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.g(gv9Var) ? 256 : 128) | (av8Var.g(gv9Var2) ? 2048 : 1024) | (av8Var.g(xtcVar) ? 16384 : 8192);
        if (av8Var.T(i5 & 1, (i5 & 9363) != 9362)) {
            ksa a2 = msa.a(0, 0, av8Var, 0, 3);
            View view = (View) av8Var.k(nz.f);
            Object O = av8Var.O();
            a99 a99Var2 = nf3.a;
            if (O == a99Var2) {
                O = e.f(Boolean.TRUE);
                av8Var.n0(O);
            }
            e1d e1dVar2 = (e1d) O;
            int i6 = i5 & 896;
            int i7 = i5 & 14;
            boolean g2 = (i6 == 256) | (i7 == 4) | av8Var.g(a2);
            Object O2 = av8Var.O();
            if (g2 || O2 == a99Var2) {
                ksaVar = a2;
                i3 = i6;
                i4 = i7;
                a99Var = a99Var2;
                e1dVar = e1dVar2;
                zi7Var = new zi7(gv9Var, ksaVar, ho7Var2, (rq3) null, 0);
                ho7Var2 = ho7Var2;
                av8Var.n0(zi7Var);
            } else {
                ksaVar = a2;
                i3 = i6;
                zi7Var = O2;
                i4 = i7;
                e1dVar = e1dVar2;
                a99Var = a99Var2;
            }
            hz8.o(av8Var, ho7Var2, (Function2) zi7Var);
            boolean booleanValue = ((Boolean) e1dVar.getValue()).booleanValue();
            xtc d2 = bkh.d(xtcVar, 1.0f);
            boolean g3 = av8Var.g(ksaVar);
            Object O3 = av8Var.O();
            if (g3 || O3 == a99Var) {
                O3 = new ni4(ksaVar, 7);
                av8Var.n0(O3);
            }
            Function0 function0 = (Function0) O3;
            boolean g4 = av8Var.g(ksaVar);
            Object O4 = av8Var.O();
            int i8 = 8;
            if (g4 || O4 == a99Var) {
                O4 = new ni4(ksaVar, i8);
                av8Var.n0(O4);
            }
            Function0 function02 = (Function0) O4;
            Object O5 = av8Var.O();
            if (O5 == a99Var) {
                O5 = new fw6(i8, e1dVar);
                av8Var.n0(O5);
            }
            a99 a99Var3 = a99Var;
            int i9 = i4;
            xtc v = i9a.v(d2, view, function0, function02, (Function1) O5, av8Var, 24576);
            boolean z = ((i5 & 7168) == 2048) | (i3 == 256) | (i9 == 4) | ((i5 & 112) == 32);
            Object O6 = av8Var.O();
            if (z || O6 == a99Var3) {
                ksaVar2 = ksaVar;
                l50 l50Var = new l50(22, gv9Var, gv9Var2, ho7Var, function1);
                av8Var.n0(l50Var);
                O6 = l50Var;
            } else {
                ksaVar2 = ksaVar;
            }
            v8a.c(v, ksaVar2, null, null, null, null, booleanValue, null, (Function1) O6, av8Var, 0, 380);
            av8Var = av8Var;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ere((Object) ho7Var, function1, (Object) gv9Var, (Object) gv9Var2, (Object) xtcVar, i2, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0201 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0234 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void R(mj7 mj7Var, Integer num, boolean z, boolean z2, boolean z3, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        long j2;
        long f2;
        int i3;
        int i4;
        boolean g2;
        long f3;
        long c2;
        Context context;
        String i5;
        String str;
        boolean g3;
        Object O;
        boolean z4;
        Object O2;
        int i6;
        int i7;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1643054973);
        int i8 = i2 | (av8Var.g(mj7Var) ? 4 : 2) | (av8Var.g(num) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z2) ? a.o : 1024) | (av8Var.h(z3) ? 16384 : 8192) | (av8Var.i(function1) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | 1572864;
        if (av8Var.T(i8 & 1, (599187 & i8) != 599186)) {
            Context context2 = (Context) av8Var.k(nz.b);
            i4k h0 = s02.h0(400, 0, null, 6);
            if (z3 && z) {
                j2 = ljg.f(av8Var, -1572122362, R.color.live, av8Var, false);
            } else if (z3) {
                j2 = ljg.f(av8Var, -1572121200, R.color.primary_default, av8Var, false);
            } else {
                av8Var.d0(-1572119736);
                av8Var.s(false);
                j2 = r13.h;
            }
            cdi a2 = wih.a(j2, h0, null, av8Var, 48, 12);
            i4k h02 = s02.h0(200, 0, null, 6);
            if (z3 && z) {
                i3 = -1572114074;
                i4 = R.color.live;
            } else if (z3) {
                i3 = -1572112912;
                i4 = R.color.primary_default;
            } else {
                f2 = ljg.f(av8Var, -1572111642, R.color.n_lv_3, av8Var, false);
                cdi a3 = wih.a(f2, h02, null, av8Var, 48, 12);
                g2 = mj7Var.g();
                if (g2) {
                    f3 = z2 ? ljg.f(av8Var, -1572104826, R.color.n_lv_3, av8Var, false) : ljg.f(av8Var, -1572103994, R.color.n_lv_1, av8Var, false);
                } else {
                    av8Var.d0(-1572106778);
                    f3 = r13.c(lz.D(R.color.surface_1, av8Var), z2 ? 0.75f : 1.0f);
                    av8Var.s(false);
                }
                long j3 = f3;
                if (g2) {
                    av8Var.d0(-1572101080);
                    av8Var.s(false);
                    c2 = r13.h;
                } else if (z) {
                    c2 = ljg.f(av8Var, -1572100122, R.color.live, av8Var, false);
                } else {
                    av8Var.d0(-1572098618);
                    c2 = r13.c(lz.D(R.color.primary_default, av8Var), z2 ? 0.75f : 1.0f);
                    av8Var.s(false);
                }
                if (yaa.w() > mj7Var.e) {
                    context = context2;
                    long j4 = mj7Var.d;
                    bi4 bi4Var = bi4.PATTERN_DMM;
                    ConcurrentHashMap concurrentHashMap = hk4.a;
                    i5 = fc6.i(j4, hk4.a(bi4Var.d()));
                } else if (mj7Var.g()) {
                    if (!mj7Var.h()) {
                        i6 = -1572090653;
                        i7 = R.string.upcoming;
                    } else if (z) {
                        i6 = -1572088695;
                        i7 = R.string.standings_live;
                    } else {
                        i6 = -1572086618;
                        i7 = R.string.in_progress;
                    }
                    str = ljg.k(av8Var, i6, i7, av8Var, false);
                    context = context2;
                    kv1 kv1Var = uxf.p;
                    utc utcVar = utc.a;
                    xtc g4 = bkh.g(bkh.q(utcVar, 88.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 54.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    g3 = av8Var.g(a2);
                    O = av8Var.O();
                    a99 a99Var = nf3.a;
                    if (!g3 || O == a99Var) {
                        O = new cl1(a2, 5);
                        av8Var.n0(O);
                    }
                    xtc X = td4.X(g4, (Function1) O);
                    long j5 = c2;
                    boolean z5 = !z2;
                    z4 = ((i8 & 458752) == 131072) | ((i8 & 14) == 4);
                    O2 = av8Var.O();
                    if (!z4 || O2 == a99Var) {
                        O2 = new n37(13, (Object) mj7Var, function1);
                        av8Var.n0(O2);
                    }
                    Context context3 = context;
                    xtc c0 = l98.c0(tol.y(X, z5, false, false, 0L, null, (Function0) O2, av8Var, 30), 8.0f, 12.0f);
                    u23 a4 = t23.a(ww9.d, kv1Var, av8Var, 48);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C = fqj.C(av8Var, c0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a4, hf3.g);
                    waa.K(av8Var, m2, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    String C2 = f5p.C(context3, mj7Var.c, mj7Var.b);
                    yf8 yf8Var = xth.a;
                    udj.c(C2, null, ((r13) a3.getValue()).a, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var, 0, 24960, 110586);
                    nq8.h(av8Var, bkh.e(utcVar, 2.0f));
                    udj.c(str, l98.c0(n9e.q(utcVar, j5, o7g.a(8.0f)), 8.0f, 1.0f), j3, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.k(), av8Var, 0, 24960, 110584);
                    av8Var = av8Var;
                    av8Var.s(true);
                    xtcVar2 = utcVar;
                } else if (num != null) {
                    int intValue = num.intValue();
                    context2.getClass();
                    String valueOf = String.valueOf(intValue);
                    valueOf.getClass();
                    context = context2;
                    i5 = context.getString(R.string.n_points, valueOf);
                    i5.getClass();
                } else {
                    context = context2;
                    i5 = "-";
                }
                str = i5;
                kv1 kv1Var2 = uxf.p;
                utc utcVar2 = utc.a;
                xtc g42 = bkh.g(bkh.q(utcVar2, 88.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 54.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                g3 = av8Var.g(a2);
                O = av8Var.O();
                a99 a99Var2 = nf3.a;
                if (!g3) {
                }
                O = new cl1(a2, 5);
                av8Var.n0(O);
                xtc X2 = td4.X(g42, (Function1) O);
                long j52 = c2;
                boolean z52 = !z2;
                z4 = ((i8 & 458752) == 131072) | ((i8 & 14) == 4);
                O2 = av8Var.O();
                if (!z4) {
                }
                O2 = new n37(13, (Object) mj7Var, function1);
                av8Var.n0(O2);
                Context context32 = context;
                xtc c02 = l98.c0(tol.y(X2, z52, false, false, 0L, null, (Function0) O2, av8Var, 30), 8.0f, 12.0f);
                u23 a42 = t23.a(ww9.d, kv1Var2, av8Var, 48);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m22 = av8Var.m();
                xtc C3 = fqj.C(av8Var, c02);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                }
                waa.K(av8Var, a42, hf3.g);
                waa.K(av8Var, m22, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C3, hf3.d);
                String C22 = f5p.C(context32, mj7Var.c, mj7Var.b);
                yf8 yf8Var2 = xth.a;
                udj.c(C22, null, ((r13) a3.getValue()).a, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var, 0, 24960, 110586);
                nq8.h(av8Var, bkh.e(utcVar2, 2.0f));
                udj.c(str, l98.c0(n9e.q(utcVar2, j52, o7g.a(8.0f)), 8.0f, 1.0f), j3, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.k(), av8Var, 0, 24960, 110584);
                av8Var = av8Var;
                av8Var.s(true);
                xtcVar2 = utcVar2;
            }
            f2 = ljg.f(av8Var, i3, i4, av8Var, false);
            cdi a32 = wih.a(f2, h02, null, av8Var, 48, 12);
            g2 = mj7Var.g();
            if (g2) {
            }
            long j32 = f3;
            if (g2) {
            }
            if (yaa.w() > mj7Var.e) {
            }
            str = i5;
            kv1 kv1Var22 = uxf.p;
            utc utcVar22 = utc.a;
            xtc g422 = bkh.g(bkh.q(utcVar22, 88.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 54.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            g3 = av8Var.g(a2);
            O = av8Var.O();
            a99 a99Var22 = nf3.a;
            if (!g3) {
            }
            O = new cl1(a2, 5);
            av8Var.n0(O);
            xtc X22 = td4.X(g422, (Function1) O);
            long j522 = c2;
            boolean z522 = !z2;
            z4 = ((i8 & 458752) == 131072) | ((i8 & 14) == 4);
            O2 = av8Var.O();
            if (!z4) {
            }
            O2 = new n37(13, (Object) mj7Var, function1);
            av8Var.n0(O2);
            Context context322 = context;
            xtc c022 = l98.c0(tol.y(X22, z522, false, false, 0L, null, (Function0) O2, av8Var, 30), 8.0f, 12.0f);
            u23 a422 = t23.a(ww9.d, kv1Var22, av8Var, 48);
            int hashCode22 = Long.hashCode(av8Var.T);
            aee m222 = av8Var.m();
            xtc C32 = fqj.C(av8Var, c022);
            if3.k7.getClass();
            zg3 zg3Var22 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
            }
            waa.K(av8Var, a422, hf3.g);
            waa.K(av8Var, m222, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode22), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C32, hf3.d);
            String C222 = f5p.C(context322, mj7Var.c, mj7Var.b);
            yf8 yf8Var22 = xth.a;
            udj.c(C222, null, ((r13) a32.getValue()).a, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var, 0, 24960, 110586);
            nq8.h(av8Var, bkh.e(utcVar22, 2.0f));
            udj.c(str, l98.c0(n9e.q(utcVar22, j522, o7g.a(8.0f)), 8.0f, 1.0f), j32, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.k(), av8Var, 0, 24960, 110584);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar22;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new c93(mj7Var, num, z, z2, z3, function1, xtcVar2, i2, 1);
        }
    }

    public static final void S(pnd pndVar, io ioVar, tc3 tc3Var, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1090171650);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? av8Var.g(pndVar) : av8Var.i(pndVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(ioVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(tc3Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        boolean z = true;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = (i3 & 112) == 32;
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !av8Var.g(pndVar))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object O = av8Var.O();
            if (z3 || O == nf3.a) {
                O = new o69(ioVar, pndVar);
                av8Var.n0(O);
            }
            t20.a((o69) O, null, new g2f(false, rzg.a, false), tc3Var, av8Var, ((i3 << 3) & 7168) | 384, 2);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b30(pndVar, ioVar, tc3Var, i2, 0);
        }
    }

    public static final void T(final ua9 ua9Var, String str, boolean z, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        Function1 function12;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-765008875);
        int i3 = i2 | (av8Var2.g(ua9Var) ? 4 : 2) | (av8Var2.g(str) ? 32 : 16) | (av8Var2.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function1) ? 2048 : 1024) | (av8Var2.g(xtcVar) ? 16384 : 8192);
        final int i4 = 0;
        if (av8Var2.T(i3 & 1, (i3 & 9363) != 9362)) {
            final Context context = (Context) av8Var2.k(nz.b);
            boolean z2 = ua9Var instanceof ta9;
            a99 a99Var = nf3.a;
            if (z2) {
                av8Var2.d0(-1282552438);
                xtc c0 = l98.c0(xtcVar, 8.0f, 4.0f);
                o5c o5cVar = new o5c(((ta9) ua9Var).a, 1, str);
                int i5 = (av8Var2.i(context) ? 1 : 0) | ((i3 & 14) != 4 ? 0 : 1);
                Object O = av8Var2.O();
                if (i5 != 0 || O == a99Var) {
                    O = new Function0() { // from class: oa9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Integer valueOf;
                            int i6 = i4;
                            ua9 ua9Var2 = ua9Var;
                            Context context2 = context;
                            switch (i6) {
                                case 0:
                                    WSCGameData game = ((ta9) ua9Var2).a.getGame();
                                    valueOf = game != null ? Integer.valueOf(game.getEventId()) : null;
                                    ia9 ia9Var = ia9.DETAILS;
                                    zu[] zuVarArr = zu.a;
                                    nv.B0(context2, valueOf, ia9Var);
                                    break;
                                default:
                                    WSCGameData game2 = ((sa9) ua9Var2).a.getGame();
                                    valueOf = game2 != null ? Integer.valueOf(game2.getEventId()) : null;
                                    ia9 ia9Var2 = ia9.DETAILS;
                                    zu[] zuVarArr2 = zu.a;
                                    nv.B0(context2, valueOf, ia9Var2);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    av8Var2.n0(O);
                }
                qea.j(o5cVar, function1, c0, z, (Function0) O, av8Var2, ((i3 >> 6) & 112) | ((i3 << 3) & 7168), 0);
                av8Var2.s(false);
                av8Var = av8Var2;
                function12 = function1;
            } else if (ua9Var instanceof sa9) {
                av8Var2.d0(-1281831130);
                xtc c02 = l98.c0(xtcVar, 8.0f, 4.0f);
                WSCStory wSCStory = ((sa9) ua9Var).a;
                String q = dmi.q("event_highlights_", wSCStory.getSdkId());
                n5c n5cVar = new n5c(wSCStory, 1, str);
                ia9 ia9Var = ia9.DETAILS;
                boolean i6 = ((i3 & 14) == 4) | av8Var2.i(context);
                Object O2 = av8Var2.O();
                if (i6 || O2 == a99Var) {
                    O2 = new Function0() { // from class: oa9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Integer valueOf;
                            int i62 = r3;
                            ua9 ua9Var2 = ua9Var;
                            Context context2 = context;
                            switch (i62) {
                                case 0:
                                    WSCGameData game = ((ta9) ua9Var2).a.getGame();
                                    valueOf = game != null ? Integer.valueOf(game.getEventId()) : null;
                                    ia9 ia9Var2 = ia9.DETAILS;
                                    zu[] zuVarArr = zu.a;
                                    nv.B0(context2, valueOf, ia9Var2);
                                    break;
                                default:
                                    WSCGameData game2 = ((sa9) ua9Var2).a.getGame();
                                    valueOf = game2 != null ? Integer.valueOf(game2.getEventId()) : null;
                                    ia9 ia9Var22 = ia9.DETAILS;
                                    zu[] zuVarArr2 = zu.a;
                                    nv.B0(context2, valueOf, ia9Var22);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    av8Var2.n0(O2);
                }
                int i7 = i3 << 6;
                oml.a(n5cVar, c02, q, ia9Var, z, function1, (Function0) O2, av8Var2, (57344 & i7) | 3072 | (i7 & 458752), 0);
                av8Var = av8Var2;
                function12 = function1;
                av8Var.s(false);
            } else {
                av8Var = av8Var2;
                function12 = function1;
                if (ua9Var instanceof ra9) {
                    av8Var.d0(-1281003833);
                    int i8 = (av8Var.i(context) ? 1 : 0) | ((i3 & 14) == 4 ? 1 : 0) | ((i3 & 7168) != 2048 ? 0 : 1);
                    Object O3 = av8Var.O();
                    if (i8 != 0 || O3 == a99Var) {
                        O3 = new dr6(context, ua9Var, function12, 16);
                        av8Var.n0(O3);
                    }
                    td4.a((Function1) O3, null, null, av8Var, 0, 6);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1280641877);
                    av8Var.s(false);
                }
            }
        } else {
            av8Var = av8Var2;
            function12 = function1;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f70(ua9Var, str, z, function12, xtcVar, i2, 7);
        }
    }

    public static final void U(f9b f9bVar, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        r13 r13Var;
        f9bVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1343754320);
        int i3 = (av8Var.g(f9bVar) ? 4 : 2) | i2 | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            xtcVar2 = utc.a;
            xtc d0 = l98.d0(xtcVar2, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            int i4 = f9bVar.b;
            xtc p = bkh.p(d0, i4 > 1 ? 24.0f : 16.0f);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, p);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            Integer num = f9bVar.c;
            if (num == null) {
                av8Var.d0(-1040024718);
                av8Var.s(false);
                r13Var = null;
            } else {
                r13Var = new r13(wv8.b(av8Var, -1040024717, num, av8Var, false));
            }
            r13 r13Var2 = r13Var;
            kq9.b(s6a.N(f9bVar.a, 6, av8Var), null, n12.a.a(bkh.l(xtcVar2, 16.0f), uxf.f), r13Var2 != null ? r13Var2.a : r13.i, av8Var, 48, 0);
            if (i4 > 1) {
                av8Var.d0(-1039682446);
                X(i4, r13Var2, av8Var, 6);
                av8Var.s(false);
            } else {
                av8Var.d0(-1039565204);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new op9(f9bVar, xtcVar2, i2, 4);
        }
    }

    public static final void V(s4c s4cVar, String str, of3 of3Var, int i2) {
        s4c s4cVar2;
        String str2;
        int compare;
        s4cVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(541704283);
        int i3 = i2 | (av8Var.g(s4cVar) ? 4 : 2) | (av8Var.g(str) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            boolean z = s4cVar.i;
            String str3 = s4cVar.k;
            String str4 = s4cVar.g;
            String str5 = s4cVar.j;
            String str6 = s4cVar.f;
            double d2 = s4cVar.e;
            double d3 = s4cVar.c;
            double d4 = s4cVar.b;
            double d5 = s4cVar.d;
            if (z) {
                str2 = str4;
                compare = Float.compare(i0(d4, d3), i0(d5, d2));
            } else {
                str2 = str4;
                compare = Double.compare(d4, d5);
            }
            int i4 = compare;
            double d6 = d4 + d5;
            String D = yaa.D(context, s4cVar.a, str);
            Float valueOf = Float.valueOf(i0(d4, d3));
            if (!z) {
                valueOf = null;
            }
            float floatValue = valueOf != null ? valueOf.floatValue() : i0(d4, d6);
            Float valueOf2 = Float.valueOf(i0(d5, d2));
            if (!z) {
                valueOf2 = null;
            }
            float floatValue2 = valueOf2 != null ? valueOf2.floatValue() : i0(d5, d6);
            utc utcVar = utc.a;
            xtc d7 = bkh.d(utcVar, 1.0f);
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d7);
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
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf3 = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf3, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            float f2 = floatValue2;
            xtc d8 = bkh.d(utcVar, 1.0f);
            yf8 yf8Var = xth.a;
            float f3 = floatValue;
            String str7 = str2;
            udj.c(D, d8, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.b(), av8Var, 48, 0, 130040);
            xtc d9 = bkh.d(utcVar, 1.0f);
            wxf wxfVar = ww9.b;
            lv1 lv1Var = uxf.l;
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d9);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String str8 = str6 + "/" + str5;
            if (str5 == null) {
                str8 = null;
            }
            if (str8 == null) {
                str8 = str6;
            }
            udj.c(str8, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 131066);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            nq8.h(av8Var, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            String str9 = str3 != null ? str7 + "/" + str3 : null;
            udj.c(str9 == null ? str7 : str9, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            bf3.t(av8Var, true, utcVar, 8.0f, av8Var);
            xtc d10 = bkh.d(utcVar, 1.0f);
            l8g a4 = k8g.a(wxfVar, lv1Var, av8Var, 0);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d10);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            s4cVar2 = s4cVar;
            tol.b(dh3.n.a(ema.b), yqo.H(1116864556, av8Var, new jn1(s4cVar2, i4, f3)), av8Var, 56);
            nq8.h(av8Var, bkh.p(utcVar, 16.0f));
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            xtc q = n9e.q(wnn.A(bkh.e(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 6.0f), o7g.a(16.0f)), lz.D(R.color.n_lv_5, av8Var), oyn.e);
            long j0 = j0(i4, av8Var, false, s4cVar2.h);
            long j2 = r13.h;
            boolean d11 = av8Var.d(f2);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (d11 || O == a99Var) {
                O = new va6(f2);
                av8Var.n0(O);
            }
            Function0 function0 = (Function0) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new au5(22);
                av8Var.n0(O2);
            }
            ncf.c(function0, q, j0, j2, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Function1) O2, av8Var, 1772544);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            s4cVar2 = s4cVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new sa6(s4cVar2, str, i2, 0);
        }
    }

    public static final void W(e9i e9iVar, elj eljVar, of3 of3Var, int i2) {
        e9i e9iVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(377932751);
        int i3 = (i2 & 6) == 0 ? i2 | (av8Var.g(e9iVar) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(eljVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            kg0 kg0Var = ww9.f;
            kv1 kv1Var = uxf.p;
            xtc d0 = l98.d0(bkh.c, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(kg0Var, kv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String a3 = eljVar.a.a(av8Var);
            yf8 yf8Var = xth.a;
            dfj i4 = xth.i();
            long D = lz.D(R.color.on_color_primary, av8Var);
            utc utcVar = utc.a;
            udj.c(a3, bkh.d(utcVar, 1.0f), D, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, i4, av8Var, 48, 0, 130040);
            av8Var = av8Var;
            nq8.h(av8Var, bkh.e(utcVar, 40.0f));
            av8Var.d0(615999899);
            int i5 = 0;
            for (Object obj : CollectionsKt.L0(eljVar.b, 3)) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    b.q();
                    throw null;
                }
                Event event = (Event) obj;
                float a4 = e9iVar.a((i5 * TTAdConstant.STYLE_SIZE_RADIO_3_2) + 1000, 1000);
                float f2 = (0.1f * a4) + 0.9f;
                boolean d2 = av8Var.d(a4) | av8Var.d(f2);
                Object O = av8Var.O();
                if (d2 || O == nf3.a) {
                    O = new n28(4, a4, f2);
                    av8Var.n0(O);
                }
                xtc M = s02.M(utcVar, (Function1) O);
                k1c c2 = e12.c(uxf.c, false);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C2 = fqj.C(av8Var, M);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c2, hf3.g);
                waa.K(av8Var, m3, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C2, hf3.d);
                M(event, i5, av8Var, 0);
                bf3.t(av8Var, true, utcVar, 16.0f, av8Var);
                i5 = i6;
            }
            e9iVar2 = e9iVar;
            av8Var.s(false);
            av8Var.s(true);
        } else {
            e9iVar2 = e9iVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p8b(e9iVar2, eljVar, i2, 8);
        }
    }

    public static final void X(int i2, r13 r13Var, of3 of3Var, int i3) {
        long j2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-633849164);
        int i4 = (av8Var.e(i2) ? 32 : 16) | i3 | (av8Var.g(r13Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            final String valueOf = String.valueOf(i2);
            final jej Q = h5a.Q(0, 0, 1, av8Var);
            yf8 yf8Var = xth.a;
            final dfj a2 = dfj.a(xth.k(), lz.D(R.color.surface_1, av8Var), ((kx4) av8Var.k(dh3.h)).u(12.0f), null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777212);
            boolean g2 = av8Var.g(valueOf) | av8Var.g(a2);
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (g2 || O == obj) {
                O = jej.a(Q, valueOf, a2, 1020);
                av8Var.n0(O);
            }
            final aej aejVar = (aej) O;
            if (r13Var == null) {
                j2 = ljg.f(av8Var, 756323517, R.color.n_lv_1, av8Var, false);
            } else {
                av8Var.d0(756323238);
                av8Var.s(false);
                j2 = r13Var.a;
            }
            final long j3 = j2;
            final long D = lz.D(R.color.surface_1, av8Var);
            xtc a3 = n12.a.a(bkh.l(utc.a, 11.0f), uxf.h);
            boolean f2 = av8Var.f(D) | av8Var.f(j3) | av8Var.i(aejVar) | av8Var.g(Q) | av8Var.g(valueOf) | av8Var.g(a2);
            Object O2 = av8Var.O();
            if (f2 || O2 == obj) {
                Object obj2 = new Function1() { // from class: sz9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        ha5 ha5Var = (ha5) obj3;
                        ha5Var.getClass();
                        ha5.U(ha5Var, D, ha5Var.H0(2.0f) + (njh.e(ha5Var.n()) / 2.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        ha5.U(ha5Var, j3, ha5Var.H0(1.0f) + (njh.e(ha5Var.n()) / 2.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.O0() >> 32));
                        aej aejVar2 = aejVar;
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var.O0() & 4294967295L)) - (((int) (aejVar2.c & 4294967295L)) / 2);
                        o6a.v(ha5Var, Q, valueOf, (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat - (((int) (aejVar2.c >> 32)) / 2)) << 32), a2, 496);
                        return Unit.a;
                    }
                };
                av8Var.n0(obj2);
                O2 = obj2;
            }
            lz.d(0, av8Var, a3, (Function1) O2);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new n61(i2, r13Var, i3, 4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d3, code lost:
    
        if (r21 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00d9, code lost:
    
        if (r21 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00e2, code lost:
    
        if (r21 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00e8, code lost:
    
        if (r21 != false) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Y(final pnd pndVar, final boolean z, final d1g d1gVar, final boolean z2, long j2, final float f2, final xtc xtcVar, of3 of3Var, final int i2, final int i3) {
        int i4;
        long j3;
        long j4;
        boolean z3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-466280168);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? av8Var.g(pndVar) : av8Var.i(pndVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var.e(d1gVar.ordinal()) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= av8Var.h(z2) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            j3 = j2;
            i4 |= ((i3 & 16) == 0 && av8Var.f(j3)) ? 16384 : 8192;
        } else {
            j3 = j2;
        }
        if ((1572864 & i2) == 0) {
            i4 |= av8Var.g(xtcVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (av8Var.T(i4 & 1, (533651 & i4) != 533650)) {
            av8Var.Y();
            if ((i2 & 1) != 0 && !av8Var.B()) {
                av8Var.W();
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                }
            } else if ((i3 & 16) != 0) {
                i4 &= -57345;
                j3 = 9205357640488583168L;
            }
            av8Var.t();
            if (z) {
                a4h a4hVar = f3h.a;
                if (d1gVar == d1g.a) {
                }
                if (d1gVar == d1g.b) {
                }
                z3 = false;
            } else {
                a4h a4hVar2 = f3h.a;
                if (d1gVar == d1g.a) {
                }
                if (d1gVar == d1g.b) {
                }
                z3 = true;
            }
            jv1 jv1Var = z3 ? pd0.b : pd0.a;
            int i5 = i4 & 14;
            boolean h2 = ((i4 & 112) == 32) | (i5 == 4 || ((i4 & 8) != 0 && av8Var.i(pndVar))) | av8Var.h(z3);
            Object O = av8Var.O();
            if (h2 || O == nf3.a) {
                O = new d30(pndVar, z, z3);
                av8Var.n0(O);
            }
            long j5 = j3;
            boolean z4 = z3;
            j4 = j5;
            S(pndVar, jv1Var, yqo.H(1365123137, av8Var, new e30((hsk) av8Var.k(dh3.t), j4, z4, o3h.a(xtcVar, false, (Function1) O), pndVar)), av8Var, i5 | 384);
        } else {
            av8Var.W();
            j4 = j3;
        }
        eqf u = av8Var.u();
        if (u != null) {
            final long j6 = j4;
            u.d = new Function2() { // from class: f30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fcp.Y(pnd.this, z, d1gVar, z2, j6, f2, xtcVar, (of3) obj, aba.K(i2 | 1), i3);
                    return Unit.a;
                }
            };
        }
    }

    public static final void Z(int i2, of3 of3Var, xtc xtcVar, Function0 function0, boolean z) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2111672474);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(xtcVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (av8Var.i(function0) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i5 = 0;
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            a4h a4hVar = f3h.a;
            nq8.h(av8Var, fqj.q(bkh.m(xtcVar, 25.0f, 25.0f), new j30(i5, function0, z)));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new i30(i2, xtcVar, function0, z);
        }
    }

    public static final void a0(v23 v23Var, elj eljVar, of3 of3Var, int i2) {
        elj eljVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-115563539);
        int i3 = (i2 & 6) == 0 ? i2 | (av8Var.g(v23Var) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(eljVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            nq8.h(av8Var, v23Var.a(55.0f, utcVar, true));
            String a2 = eljVar.e.a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a2, bkh.d(utcVar, 1.0f), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.i(), av8Var, 48, 0, 130040);
            av8Var = av8Var;
            nq8.h(av8Var, v23Var.a(40.0f, utcVar, true));
            av8Var.d0(612600439);
            eljVar2 = eljVar;
            int i4 = 0;
            for (Object obj : CollectionsKt.L0(eljVar2.b, 3)) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    b.q();
                    throw null;
                }
                M((Event) obj, i4, av8Var, 0);
                nq8.h(av8Var, bkh.e(utcVar, 16.0f));
                i4 = i5;
            }
            av8Var.s(false);
            nq8.h(av8Var, v23Var.a(79.0f, utcVar, true));
        } else {
            eljVar2 = eljVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p8b(v23Var, eljVar2, i2, 7);
        }
    }

    public static final void b0(xbl xblVar, String str) {
        gdl b2;
        WorkDatabase workDatabase = xblVar.c;
        workDatabase.getClass();
        qcl g2 = workDatabase.g();
        tx4 b3 = workDatabase.b();
        ArrayList l2 = b.l(str);
        while (!l2.isEmpty()) {
            String str2 = (String) o13.D(l2);
            sbl d2 = g2.d(str2);
            if (d2 != sbl.c && d2 != sbl.d) {
                ((Number) gz8.S(g2.a, false, true, new cfi(str2, 13))).intValue();
            }
            l2.addAll(b3.a(str2));
        }
        g8f g8fVar = xblVar.f;
        g8fVar.getClass();
        synchronized (g8fVar.k) {
            rik.o().getClass();
            g8fVar.i.add(str);
            b2 = g8fVar.b(str);
        }
        g8f.d(b2, 1);
        Iterator it = xblVar.e.iterator();
        while (it.hasNext()) {
            ((hsg) it.next()).b(str);
        }
    }

    public static final Object c0(z88 z88Var, Function2 function2, rq3 rq3Var) {
        int i2 = la8.a;
        Object collect = k53.W(la8.a(z88Var, new c37(function2, (rq3) null, 1)), 0).collect(med.a, rq3Var);
        lu3 lu3Var = lu3.a;
        if (collect != lu3Var) {
            collect = Unit.a;
        }
        return collect == lu3Var ? collect : Unit.a;
    }

    public static final ContentValues d0(Pair... pairArr) {
        ContentValues contentValues = new ContentValues(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.a;
            Object obj = pair.b;
            if (obj == null) {
                contentValues.putNull(str);
            } else if (obj instanceof String) {
                contentValues.put(str, (String) obj);
            } else if (obj instanceof Integer) {
                contentValues.put(str, (Integer) obj);
            } else if (obj instanceof Long) {
                contentValues.put(str, (Long) obj);
            } else if (obj instanceof Boolean) {
                contentValues.put(str, (Boolean) obj);
            } else if (obj instanceof Float) {
                contentValues.put(str, (Float) obj);
            } else if (obj instanceof Double) {
                contentValues.put(str, (Double) obj);
            } else if (obj instanceof byte[]) {
                contentValues.put(str, (byte[]) obj);
            } else if (obj instanceof Byte) {
                contentValues.put(str, (Byte) obj);
            } else {
                if (!(obj instanceof Short)) {
                    a70.p(bf3.k("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, "\""));
                    return null;
                }
                contentValues.put(str, (Short) obj);
            }
        }
        return contentValues;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r1 <= r6.getHeight()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final a10 e0(te2 te2Var, float f2) {
        int ceil = ((int) Math.ceil(f2)) * 2;
        a10 a10Var = u6h.k;
        wx wxVar = u6h.l;
        wj2 wj2Var = u6h.m;
        if (a10Var != null && wxVar != null) {
            Bitmap bitmap = a10Var.a;
            if (ceil <= bitmap.getWidth()) {
            }
        }
        a10Var = tgj.k(ceil, ceil, 1, 24);
        u6h.k = a10Var;
        wxVar = xx.a(a10Var);
        u6h.l = wxVar;
        a10 a10Var2 = a10Var;
        wx wxVar2 = wxVar;
        if (wj2Var == null) {
            wj2Var = new wj2();
            u6h.m = wj2Var;
        }
        wj2 wj2Var2 = wj2Var;
        vj2 vj2Var = wj2Var2.a;
        ema layoutDirection = te2Var.a.getLayoutDirection();
        Bitmap bitmap2 = a10Var2.a;
        float width = bitmap2.getWidth();
        float height = bitmap2.getHeight();
        kx4 kx4Var = vj2Var.a;
        ema emaVar = vj2Var.b;
        uj2 uj2Var = vj2Var.c;
        long j2 = vj2Var.d;
        vj2Var.a = te2Var;
        vj2Var.b = layoutDirection;
        vj2Var.c = wxVar2;
        vj2Var.d = (Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(height) & 4294967295L);
        wxVar2.o();
        ha5.o0(wj2Var2, r13.b, 0L, wj2Var2.n(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 58);
        ha5.o0(wj2Var2, hkg.d(4278190080L), 0L, (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 120);
        ha5.U(wj2Var2, hkg.d(4278190080L), f2, (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 120);
        wxVar2.h();
        vj2Var.a = kx4Var;
        vj2Var.b = emaVar;
        vj2Var.c = uj2Var;
        vj2Var.d = j2;
        return a10Var2;
    }

    public static final Object g0(b98 b98Var, z88 z88Var, rq3 rq3Var) {
        kik.n(b98Var);
        Object collect = z88Var.collect(b98Var, rq3Var);
        return collect == lu3.a ? collect : Unit.a;
    }

    public static ArrayList h0(LinkedHashMap linkedHashMap, boolean z) {
        String valueOf;
        Set entrySet = linkedHashMap.entrySet();
        entrySet.getClass();
        Set set = entrySet;
        ArrayList arrayList = new ArrayList(k13.r(set, 10));
        int i2 = 0;
        for (Object obj : set) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            entry.getClass();
            Object key = entry.getKey();
            key.getClass();
            Pair pair = (Pair) key;
            Object value = entry.getValue();
            value.getClass();
            Double d2 = (Double) value;
            r9k r9kVar = (r9k) pair.a;
            r9k r9kVar2 = (r9k) pair.b;
            if (z && i2 == 0) {
                int doubleValue = (int) d2.doubleValue();
                double d3 = 1.0d;
                if (d2.doubleValue() % 1.0d <= 0.3d) {
                    d3 = 0.0d;
                } else if (d2.doubleValue() % 1.0d <= 0.4d) {
                    d3 = 0.1d;
                } else if (d2.doubleValue() % 1.0d <= 0.7d) {
                    d3 = 0.2d;
                }
                valueOf = String.valueOf(doubleValue + d3);
            } else {
                valueOf = Double.isNaN(d2.doubleValue()) ? "-" : String.valueOf((int) d2.doubleValue());
            }
            arrayList.add(new y12(r9kVar, r9kVar2, false, false, valueOf, 0.0d));
            i2 = i3;
        }
        return arrayList;
    }

    public static final float i0(double d2, double d3) {
        return Double.compare(d3, 0.0d) == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (float) (d2 / d3);
    }

    public static final long j0(int i2, of3 of3Var, boolean z, boolean z2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (z) {
            av8 av8Var = (av8) of3Var;
            av8Var.d0(-1011653595);
            if ((i2 >= 0) ^ z2) {
                i5 = -1011608397;
                i6 = R.color.home_primary;
            } else {
                i5 = -1011562486;
                i6 = R.color.home_primary_highlight;
            }
            long f2 = ljg.f(av8Var, i5, i6, av8Var, false);
            av8Var.s(false);
            return f2;
        }
        av8 av8Var2 = (av8) of3Var;
        av8Var2.d0(-1011498843);
        if ((i2 <= 0) ^ z2) {
            i3 = -1011453645;
            i4 = R.color.away_primary;
        } else {
            i3 = -1011407734;
            i4 = R.color.away_primary_highlight;
        }
        long f3 = ljg.f(av8Var2, i3, i4, av8Var2, false);
        av8Var2.s(false);
        return f3;
    }

    public static rr8 k0(t9d t9dVar, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        rr8 rr8Var = (rr8) t9dVar.a;
        if (rr8Var != null && Intrinsics.c(rr8Var.a, sQLiteDatabase)) {
            return rr8Var;
        }
        rr8 rr8Var2 = new rr8(sQLiteDatabase);
        t9dVar.a = rr8Var2;
        return rr8Var2;
    }

    public static boolean l0(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static final yda m0(z88 z88Var, ku3 ku3Var) {
        return xw3.L(ku3Var, null, null, new d17(z88Var, null, 20), 3);
    }

    public static final List n0(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(CollectionsKt.Y(list)) : km5.a;
    }

    public static final Map o0(Map map) {
        int size = map.size();
        if (size == 0) {
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
            return lm5Var;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) CollectionsKt.X(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    @Override // defpackage.uf3
    public byte A(SerialDescriptor serialDescriptor, int i2) {
        serialDescriptor.getClass();
        return E();
    }

    @Override // defpackage.uf3
    public boolean B(SerialDescriptor serialDescriptor, int i2) {
        serialDescriptor.getClass();
        return u();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean C() {
        return true;
    }

    @Override // defpackage.uf3
    public double D(SerialDescriptor serialDescriptor, int i2) {
        serialDescriptor.getClass();
        return t();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public byte E() {
        Object f0 = f0();
        f0.getClass();
        return ((Byte) f0).byteValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public uf3 b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    public void c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    @Override // defpackage.uf3
    public Decoder e(b7f b7fVar, int i2) {
        return p(b7fVar.g(i2));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int f(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        Object f0 = f0();
        f0.getClass();
        return ((Integer) f0).intValue();
    }

    public Object f0() {
        throw new v5h(duf.a.getOrCreateKotlinClass(getClass()) + " can't retrieve untyped values");
    }

    @Override // defpackage.uf3
    public long g(SerialDescriptor serialDescriptor, int i2) {
        serialDescriptor.getClass();
        return m();
    }

    @Override // defpackage.uf3
    public char h(b7f b7fVar, int i2) {
        return v();
    }

    @Override // defpackage.uf3
    public Object i(SerialDescriptor serialDescriptor, int i2, dy4 dy4Var, Object obj) {
        serialDescriptor.getClass();
        dy4Var.getClass();
        if (dy4Var.getDescriptor().b() || C()) {
            return y(dy4Var);
        }
        return null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int k() {
        Object f0 = f0();
        f0.getClass();
        return ((Integer) f0).intValue();
    }

    @Override // defpackage.uf3
    public int l(SerialDescriptor serialDescriptor, int i2) {
        serialDescriptor.getClass();
        return k();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public long m() {
        Object f0 = f0();
        f0.getClass();
        return ((Long) f0).longValue();
    }

    @Override // defpackage.uf3
    public String n(SerialDescriptor serialDescriptor, int i2) {
        serialDescriptor.getClass();
        return z();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder p(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public short q() {
        Object f0 = f0();
        f0.getClass();
        return ((Short) f0).shortValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public float r() {
        Object f0 = f0();
        f0.getClass();
        return ((Float) f0).floatValue();
    }

    @Override // defpackage.uf3
    public float s(SerialDescriptor serialDescriptor, int i2) {
        serialDescriptor.getClass();
        return r();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double t() {
        Object f0 = f0();
        f0.getClass();
        return ((Double) f0).doubleValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean u() {
        Object f0 = f0();
        f0.getClass();
        return ((Boolean) f0).booleanValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char v() {
        Object f0 = f0();
        f0.getClass();
        return ((Character) f0).charValue();
    }

    public Object w(SerialDescriptor serialDescriptor, int i2, dy4 dy4Var, Object obj) {
        serialDescriptor.getClass();
        dy4Var.getClass();
        return y(dy4Var);
    }

    @Override // defpackage.uf3
    public short x(b7f b7fVar, int i2) {
        return q();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public String z() {
        Object f0 = f0();
        f0.getClass();
        return (String) f0;
    }
}
