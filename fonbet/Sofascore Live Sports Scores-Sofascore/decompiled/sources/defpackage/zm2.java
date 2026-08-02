package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.Score;
import com.sofascore.model.profile.ShortTeam;
import com.sofascore.results.R;
import com.sofascore.results.event.odds.model.OddsEventUIModel;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class zm2 {
    public static final dt a = new dt(9);
    public static final ol4 b = new ol4(new kpg(15));
    public static final tc3 c = new tc3(-1720058964, new gd3(22), false);
    public static final tc3 d = new tc3(283131168, new pr1(4), false);
    public static final tc3 e = new tc3(-1168296326, new qd3(15), false);
    public static final tc3 f = new tc3(263149091, new qd3(16), false);
    public static final co1 g = new co1();
    public static final boolean[] h = new boolean[3];
    public static final Object i = new Object();
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;
    public static final /* synthetic */ int m = 0;
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;
    public static final /* synthetic */ int p = 0;

    public static final pzc A(lc... lcVarArr) {
        ArrayList arrayList = new ArrayList(lcVarArr.length);
        for (lc lcVar : lcVarArr) {
            arrayList.add(new Pair(lcVar.a, lcVar.b));
        }
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        return new pzc(tub.i((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
    }

    public static void B(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = (Animator) arrayList.get(i2);
            j2 = Math.max(j2, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j2);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static byte[] C(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read < 0) {
                a70.r(ljg.j(i2, "Not enough bytes to read: "));
                return null;
            }
            i3 += read;
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] D(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[a.o];
            int i4 = 0;
            int i5 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i5 += inflater.inflate(bArr, i5, i3 - i5);
                    i4 += read;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } finally {
            inflater.end();
        }
    }

    public static long E(InputStream inputStream, int i2) {
        byte[] C = C(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (C[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << (i3 * 8);
        }
        return j2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object F(Function0 function0, Function2 function2, sq3 sq3Var) {
        jw jwVar;
        int i2;
        if (sq3Var instanceof jw) {
            jwVar = (jw) sq3Var;
            int i3 = jwVar.s;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jwVar.s = i3 - Integer.MIN_VALUE;
                Object obj = jwVar.r;
                lu3 lu3Var = lu3.a;
                i2 = jwVar.s;
                rq3 rq3Var = null;
                int i4 = 1;
                if (i2 != 0) {
                    y6a.M(obj);
                    ow owVar = new ow(function0, function2, rq3Var, i4);
                    jwVar.s = 1;
                    if (s9a.r(owVar, jwVar) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            }
        }
        jwVar = new jw(sq3Var);
        Object obj2 = jwVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = jwVar.s;
        rq3 rq3Var2 = null;
        int i42 = 1;
        if (i2 != 0) {
        }
        return Unit.a;
    }

    public static final void G(lj2 lj2Var, rq3 rq3Var, boolean z) {
        Object g2;
        Object r = lj2Var.r();
        Throwable f2 = lj2Var.f(r);
        if (f2 != null) {
            p2g p2gVar = w2g.b;
            g2 = new u2g(f2);
        } else {
            p2g p2gVar2 = w2g.b;
            g2 = lj2Var.g(r);
        }
        if (!z) {
            rq3Var.resumeWith(g2);
            return;
        }
        rq3Var.getClass();
        s45 s45Var = (s45) rq3Var;
        sq3 sq3Var = s45Var.e;
        Object obj = s45Var.g;
        CoroutineContext context = sq3Var.getContext();
        Object c2 = yfj.c(context, obj);
        x9k c3 = c2 != yfj.a ? yt3.c(sq3Var, context, c2) : null;
        try {
            sq3Var.resumeWith(g2);
            Unit unit = Unit.a;
            if (c3 == null || c3.n0()) {
                yfj.a(context, c2);
            }
        } catch (Throwable th) {
            if (c3 == null || c3.n0()) {
                yfj.a(context, c2);
            }
            throw th;
        }
    }

    public static void H(int i2, do1 do1Var, wm3 wm3Var, boolean z) {
        float f2 = wm3Var.e0;
        nl3 nl3Var = wm3Var.J;
        int d2 = nl3Var.f.d();
        nl3 nl3Var2 = wm3Var.L;
        int d3 = nl3Var2.f.d();
        int e2 = nl3Var.e() + d2;
        int e3 = d3 - nl3Var2.e();
        if (d2 == d3) {
            f2 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int r = wm3Var.r();
        int i3 = (d3 - d2) - r;
        if (d2 > d3) {
            i3 = (d2 - d3) - r;
        }
        int i4 = ((int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3)) + d2;
        int i5 = i4 + r;
        if (d2 > d3) {
            i5 = i4 - r;
        }
        wm3Var.L(i4, i5);
        v(i2 + 1, do1Var, wm3Var, z);
    }

    public static void I(int i2, wm3 wm3Var, do1 do1Var, wm3 wm3Var2, boolean z) {
        float f2 = wm3Var2.e0;
        nl3 nl3Var = wm3Var2.J;
        int e2 = nl3Var.e() + nl3Var.f.d();
        nl3 nl3Var2 = wm3Var2.L;
        int d2 = nl3Var2.f.d() - nl3Var2.e();
        if (d2 >= e2) {
            int r = wm3Var2.r();
            if (wm3Var2.h0 != 8) {
                int i3 = wm3Var2.s;
                if (i3 == 2) {
                    r = (int) (wm3Var2.e0 * 0.5f * (wm3Var instanceof xm3 ? wm3Var.r() : wm3Var.U.r()));
                } else if (i3 == 0) {
                    r = d2 - e2;
                }
                r = Math.max(wm3Var2.v, r);
                int i4 = wm3Var2.w;
                if (i4 > 0) {
                    r = Math.min(i4, r);
                }
            }
            int i5 = e2 + ((int) ((f2 * ((d2 - e2) - r)) + 0.5f));
            wm3Var2.L(i5, r + i5);
            v(i2 + 1, do1Var, wm3Var2, z);
        }
    }

    public static void J(int i2, do1 do1Var, wm3 wm3Var) {
        float f2 = wm3Var.f0;
        nl3 nl3Var = wm3Var.K;
        int d2 = nl3Var.f.d();
        nl3 nl3Var2 = wm3Var.M;
        int d3 = nl3Var2.f.d();
        int e2 = nl3Var.e() + d2;
        int e3 = d3 - nl3Var2.e();
        if (d2 == d3) {
            f2 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int l2 = wm3Var.l();
        int i3 = (d3 - d2) - l2;
        if (d2 > d3) {
            i3 = (d2 - d3) - l2;
        }
        int i4 = (int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3);
        int i5 = d2 + i4;
        int i6 = i5 + l2;
        if (d2 > d3) {
            i5 = d2 - i4;
            i6 = i5 - l2;
        }
        wm3Var.M(i5, i6);
        N(i2 + 1, do1Var, wm3Var);
    }

    public static void K(int i2, wm3 wm3Var, do1 do1Var, wm3 wm3Var2) {
        float f2 = wm3Var2.f0;
        nl3 nl3Var = wm3Var2.K;
        int e2 = nl3Var.e() + nl3Var.f.d();
        nl3 nl3Var2 = wm3Var2.M;
        int d2 = nl3Var2.f.d() - nl3Var2.e();
        if (d2 >= e2) {
            int l2 = wm3Var2.l();
            if (wm3Var2.h0 != 8) {
                int i3 = wm3Var2.t;
                if (i3 == 2) {
                    l2 = (int) (f2 * 0.5f * (wm3Var instanceof xm3 ? wm3Var.l() : wm3Var.U.l()));
                } else if (i3 == 0) {
                    l2 = d2 - e2;
                }
                l2 = Math.max(wm3Var2.y, l2);
                int i4 = wm3Var2.z;
                if (i4 > 0) {
                    l2 = Math.min(i4, l2);
                }
            }
            int i5 = e2 + ((int) ((f2 * ((d2 - e2) - l2)) + 0.5f));
            wm3Var2.M(i5, l2 + i5);
            N(i2 + 1, do1Var, wm3Var2);
        }
    }

    public static final ms3 L(ShortTeam shortTeam, Context context, Score score) {
        String name;
        int id = shortTeam.getId();
        FieldTranslations fieldTranslations = shortTeam.getFieldTranslations();
        if (fieldTranslations == null || (name = tba.r(fieldTranslations)) == null) {
            name = shortTeam.getName();
        }
        return new ms3(id, tv3.c(context, name), score.getDisplay(), score.getPenalties());
    }

    public static final void M() {
        throw new UnsupportedOperationException();
    }

    public static void N(int i2, do1 do1Var, wm3 wm3Var) {
        boolean z;
        nl3 nl3Var;
        nl3 nl3Var2;
        nl3 nl3Var3;
        nl3 nl3Var4;
        if (wm3Var.o) {
            return;
        }
        if (!(wm3Var instanceof xm3) && wm3Var.A() && m(wm3Var)) {
            xm3.b0(wm3Var, do1Var, new co1());
        }
        nl3 j2 = wm3Var.j(3);
        nl3 j3 = wm3Var.j(5);
        int d2 = j2.d();
        int d3 = j3.d();
        HashSet hashSet = j2.a;
        if (hashSet != null && j2.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                nl3 nl3Var5 = (nl3) it.next();
                wm3 wm3Var2 = nl3Var5.d;
                int i3 = i2 + 1;
                boolean m2 = m(wm3Var2);
                nl3 nl3Var6 = wm3Var2.K;
                nl3 nl3Var7 = wm3Var2.M;
                if (wm3Var2.A() && m2) {
                    xm3.b0(wm3Var2, do1Var, new co1());
                }
                boolean z2 = (nl3Var5 == nl3Var6 && (nl3Var4 = nl3Var7.f) != null && nl3Var4.c) || (nl3Var5 == nl3Var7 && (nl3Var3 = nl3Var6.f) != null && nl3Var3.c);
                int i4 = wm3Var2.q0[1];
                if (i4 != 3 || m2) {
                    if (!wm3Var2.A()) {
                        if (nl3Var5 == nl3Var6 && nl3Var7.f == null) {
                            int e2 = nl3Var6.e() + d2;
                            wm3Var2.M(e2, wm3Var2.l() + e2);
                            N(i3, do1Var, wm3Var2);
                        } else if (nl3Var5 == nl3Var7 && nl3Var6.f == null) {
                            int e3 = d2 - nl3Var7.e();
                            wm3Var2.M(e3 - wm3Var2.l(), e3);
                            N(i3, do1Var, wm3Var2);
                        } else if (z2 && !wm3Var2.z()) {
                            J(i3, do1Var, wm3Var2);
                        }
                    }
                } else if (i4 == 3 && wm3Var2.z >= 0 && wm3Var2.y >= 0 && (wm3Var2.h0 == 8 || (wm3Var2.t == 0 && wm3Var2.X == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
                    if (!wm3Var2.z() && !wm3Var2.G && z2 && !wm3Var2.z()) {
                        K(i3, wm3Var, do1Var, wm3Var2);
                    }
                }
            }
        }
        boolean z3 = true;
        z3 = true;
        z3 = true;
        if (wm3Var instanceof s49) {
            return;
        }
        HashSet hashSet2 = j3.a;
        if (hashSet2 != null && j3.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                nl3 nl3Var8 = (nl3) it2.next();
                wm3 wm3Var3 = nl3Var8.d;
                int i5 = i2 + 1;
                boolean m3 = m(wm3Var3);
                nl3 nl3Var9 = wm3Var3.K;
                nl3 nl3Var10 = wm3Var3.M;
                if (wm3Var3.A() && m3) {
                    xm3.b0(wm3Var3, do1Var, new co1());
                }
                boolean z4 = (nl3Var8 == nl3Var9 && (nl3Var2 = nl3Var10.f) != null && nl3Var2.c) || (nl3Var8 == nl3Var10 && (nl3Var = nl3Var9.f) != null && nl3Var.c);
                int i6 = wm3Var3.q0[1];
                if (i6 != 3 || m3) {
                    if (!wm3Var3.A()) {
                        if (nl3Var8 == nl3Var9 && nl3Var10.f == null) {
                            int e4 = nl3Var9.e() + d3;
                            wm3Var3.M(e4, wm3Var3.l() + e4);
                            N(i5, do1Var, wm3Var3);
                        } else if (nl3Var8 == nl3Var10 && nl3Var9.f == null) {
                            int e5 = d3 - nl3Var10.e();
                            wm3Var3.M(e5 - wm3Var3.l(), e5);
                            N(i5, do1Var, wm3Var3);
                        } else if (z4 && !wm3Var3.z()) {
                            J(i5, do1Var, wm3Var3);
                        }
                    }
                } else if (i6 == 3 && wm3Var3.z >= 0 && wm3Var3.y >= 0 && (wm3Var3.h0 == 8 || (wm3Var3.t == 0 && wm3Var3.X == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
                    if (!wm3Var3.z() && !wm3Var3.G && z4 && !wm3Var3.z()) {
                        K(i5, wm3Var, do1Var, wm3Var3);
                    }
                }
            }
        }
        nl3 j4 = wm3Var.j(6);
        if (j4.a != null && j4.c) {
            int d4 = j4.d();
            Iterator it3 = j4.a.iterator();
            while (it3.hasNext()) {
                nl3 nl3Var11 = (nl3) it3.next();
                wm3 wm3Var4 = nl3Var11.d;
                int i7 = i2 + 1;
                boolean m4 = m(wm3Var4);
                nl3 nl3Var12 = wm3Var4.N;
                if (wm3Var4.A() && m4) {
                    xm3.b0(wm3Var4, do1Var, new co1());
                }
                if (wm3Var4.q0[z3 ? 1 : 0] != 3 || m4) {
                    if (!wm3Var4.A()) {
                        if (nl3Var11 == nl3Var12) {
                            int e6 = nl3Var11.e() + d4;
                            if (wm3Var4.F) {
                                int i8 = e6 - wm3Var4.b0;
                                int i9 = wm3Var4.W + i8;
                                wm3Var4.a0 = i8;
                                wm3Var4.K.l(i8);
                                wm3Var4.M.l(i9);
                                nl3Var12.l(e6);
                                z = z3 ? 1 : 0;
                                wm3Var4.m = z;
                            } else {
                                z = z3 ? 1 : 0;
                            }
                            N(i7, do1Var, wm3Var4);
                            z3 = z;
                        }
                    }
                }
                z = z3 ? 1 : 0;
                z3 = z;
            }
        }
        wm3Var.o = z3;
    }

    public static void O(OutputStream outputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static void P(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        O(byteArrayOutputStream, i2, 2);
    }

    public static final void a(final mei meiVar, final boolean z, xtc xtcVar, final Function0 function0, final float f2, final nei neiVar, of3 of3Var, final int i2) {
        final xtc xtcVar2;
        boolean z2;
        r13 r13Var;
        boolean z3;
        int i3;
        boolean z4;
        Unit unit;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-198835365);
        int i4 = i2 | (av8Var.e(meiVar.ordinal()) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | 384 | (av8Var.i(function0) ? 2048 : 1024) | (av8Var.d(f2) ? 16384 : 8192) | (av8Var.e(neiVar == null ? -1 : neiVar.ordinal()) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var.T(i4 & 1, (74899 & i4) != 74898)) {
            kv1 kv1Var = uxf.p;
            utc utcVar = utc.a;
            xtc A = wnn.A(bkh.p(utcVar, f2), o7g.a(8.0f));
            boolean z5 = function0 != null;
            boolean z6 = (i4 & 7168) == 2048;
            Object O = av8Var.O();
            if (z6 || O == nf3.a) {
                O = new ve7(4, function0);
                av8Var.n0(O);
            }
            utc utcVar2 = utcVar;
            xtc f0 = l98.f0(tol.y(A, z5, false, false, 0L, null, (Function0) O, av8Var, 30), 2.0f, 4.0f, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
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
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, utcVar2);
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
            String upperCase = oea.v(meiVar.b, av8Var).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            yf8 yf8Var = xth.a;
            udj.c(upperCase, null, z ? ljg.f(av8Var, 642096596, R.color.primary_default, av8Var, false) : ljg.f(av8Var, 642097386, R.color.n_lv_3, av8Var, false), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, (dfj) xth.r.getValue(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            Integer num = meiVar.c;
            if (num == null) {
                av8Var.d0(-1569746337);
                z3 = false;
                av8Var.s(false);
                i3 = 6;
            } else {
                av8Var.d0(-1569746336);
                int intValue = num.intValue();
                nq8.h(av8Var, bkh.p(utcVar2, 2.0f));
                ImageVector N = s6a.N(intValue, 6, av8Var);
                xtc l2 = bkh.l(utcVar2, 16.0f);
                Integer num2 = meiVar.d;
                if (num2 == null) {
                    av8Var.d0(-1926535631);
                    z2 = false;
                    av8Var.s(false);
                    r13Var = null;
                } else {
                    z2 = false;
                    r13Var = new r13(wv8.b(av8Var, -1926535630, num2, av8Var, false));
                }
                long f3 = r13Var != null ? r13Var.a : z ? ljg.f(av8Var, -1447618198, R.color.primary_default, av8Var, z2) : ljg.f(av8Var, -1447617408, R.color.n_lv_3, av8Var, z2);
                z3 = z2;
                i3 = 6;
                kq9.b(N, null, l2, f3, av8Var, 432, 0);
                Unit unit2 = Unit.a;
                av8Var.s(z3);
            }
            av8Var.s(true);
            if (neiVar == null) {
                av8Var.d0(1850666945);
                av8Var.s(z3);
                z4 = z3;
                unit = null;
            } else {
                av8Var.d0(1850666946);
                ImageVector N2 = s6a.N(R.drawable.ic_arrow_drop_down_16, i3, av8Var);
                long D = lz.D(R.color.primary_default, av8Var);
                nei neiVar2 = nei.ASCENDING;
                float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                xtc v = haa.v(utcVar2, neiVar == neiVar2 ? 180.0f : 0.0f);
                if (z) {
                    f4 = 1.0f;
                }
                kq9.b(N2, null, u6h.C(v, f4), D, av8Var, 48, 0);
                Unit unit3 = Unit.a;
                z4 = false;
                av8Var.s(false);
                unit = Unit.a;
            }
            if (unit == null) {
                bf3.r(4.0f, 1851067993, av8Var, av8Var, utcVar2);
                Unit unit4 = Unit.a;
                av8Var.s(z4);
            } else {
                av8Var.d0(-1741416653);
                av8Var.s(z4);
            }
            av8Var.s(true);
            xtcVar2 = utcVar2;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(z, xtcVar2, function0, f2, neiVar, i2) { // from class: rk7
                public final /* synthetic */ boolean b;
                public final /* synthetic */ xtc c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ float e;
                public final /* synthetic */ nei f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    zm2.a(mei.this, this.b, this.c, this.d, this.e, this.f, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(int i2, of3 of3Var, vnb vnbVar, Function1 function1, boolean z) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1127073523);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(vnbVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = 16;
        if ((i2 & 48) == 0) {
            i3 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(function1) ? 256 : 128;
        }
        int i5 = i2 & 3072;
        utc utcVar = utc.a;
        if (i5 == 0) {
            i3 |= av8Var.g(utcVar) ? a.o : 1024;
        }
        int i6 = 0;
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z2 = (i3 & 896) == 256;
            Object O = av8Var.O();
            if (z2 || O == nf3.a) {
                O = new rt6(i4, function1);
                av8Var.n0(O);
            }
            ktm.s(vnbVar, (Function0) O, z, utcVar, null, 48.0f, null, null, yqo.H(1051865188, av8Var, new y47(i6, function1)), av8Var, (i3 & 14) | 100859904 | ((i3 << 3) & 896) | (i3 & 7168), Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ui(vnbVar, z, function1, i2);
        }
    }

    public static final void c(e57 e57Var, xtc xtcVar, of3 of3Var, int i2) {
        e57Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-215335283);
        int i3 = (av8Var.i(e57Var) ? 4 : 2) | i2 | 48;
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            e1d x = rfo.x(e57Var.f, av8Var, 0);
            e1d x2 = rfo.x(e57Var.j, av8Var, 0);
            vnb vnbVar = (vnb) x.getValue();
            boolean booleanValue = ((Boolean) x2.getValue()).booleanValue();
            boolean i5 = av8Var.i(context) | av8Var.i(e57Var);
            Object O = av8Var.O();
            if (i5 || O == nf3.a) {
                O = new w47(i4, (Object) context, (Object) e57Var);
                av8Var.n0(O);
            }
            b(3072, av8Var, vnbVar, (Function1) O, booleanValue);
            xtcVar = utc.a;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kz6(e57Var, xtcVar, i2, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(qug qugVar, xtc xtcVar, Function1 function1, mei meiVar, nei neiVar, ct8 ct8Var, boolean z, Function1 function12, boolean z2, boolean z3, boolean z4, of3 of3Var, int i2, int i3) {
        boolean z5;
        int i4;
        Function1 function13;
        int i5;
        boolean z6;
        int i6;
        int i7;
        int i8;
        boolean z7;
        boolean z8;
        Function1 function14;
        boolean z9;
        boolean z10;
        eqf u;
        Function1 function15;
        pm3 pm3Var;
        e1d e1dVar;
        qugVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(753655275);
        int i9 = i2 | (av8Var.g(qugVar) ? 4 : 2) | (av8Var.g(xtcVar) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.e(meiVar == null ? -1 : meiVar.ordinal()) ? a.o : 1024) | (av8Var.e(neiVar != null ? neiVar.ordinal() : -1) ? 16384 : 8192);
        if ((i2 & 196608) == 0) {
            i9 |= av8Var.i(ct8Var) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i10 = i3 & 64;
        if (i10 != 0) {
            i4 = i9 | 1572864;
            z5 = z;
        } else {
            z5 = z;
            i4 = i9 | (av8Var.h(z5) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        int i11 = i3 & 128;
        if (i11 != 0) {
            i4 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            function13 = function12;
            i4 |= av8Var.i(function13) ? 8388608 : 4194304;
            i5 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
            if (i5 == 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                z6 = z2;
                i4 |= av8Var.h(z6) ? 67108864 : 33554432;
                i6 = i3 & 512;
                if (i6 != 0) {
                    i7 = i4 | 805306368;
                } else {
                    i7 = i4 | (av8Var.h(z3) ? 536870912 : 268435456);
                }
                i8 = i3 & 1024;
                if (av8Var.T(i7 & 1, (i7 & 306783379) == 306783378 || ((i8 != 0 ? (char) 6 : av8Var.h(z4) ? (char) 4 : (char) 2) & 3) != 2)) {
                    z8 = i10 != 0 ? true : z5;
                    Object obj = nf3.a;
                    if (i11 != 0) {
                        Object O = av8Var.O();
                        if (O == obj) {
                            O = new e87(29);
                            av8Var.n0(O);
                        }
                        function15 = (Function1) O;
                    } else {
                        function15 = function13;
                    }
                    boolean z11 = i5 != 0 ? false : z6;
                    boolean z12 = i6 != 0 ? true : z3;
                    boolean z13 = i8 != 0 ? true : z4;
                    View view = (View) av8Var.k(nz.f);
                    cdi P = z1a.P(qugVar, av8Var);
                    xtc q = n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var), oyn.e);
                    av8Var.d0(-1003410150);
                    av8Var.d0(212064437);
                    av8Var.s(false);
                    kx4 kx4Var = (kx4) av8Var.k(dh3.h);
                    Object O2 = av8Var.O();
                    if (O2 == obj) {
                        O2 = new t1c(kx4Var);
                        av8Var.n0(O2);
                    }
                    t1c t1cVar = (t1c) O2;
                    Object O3 = av8Var.O();
                    if (O3 == obj) {
                        O3 = new am3();
                        av8Var.n0(O3);
                    }
                    am3 am3Var = (am3) O3;
                    Object O4 = av8Var.O();
                    if (O4 == obj) {
                        O4 = e.f(Boolean.FALSE);
                        av8Var.n0(O4);
                    }
                    e1d e1dVar2 = (e1d) O4;
                    Object O5 = av8Var.O();
                    if (O5 == obj) {
                        O5 = new pm3(am3Var);
                        av8Var.n0(O5);
                    }
                    pm3 pm3Var2 = (pm3) O5;
                    Object O6 = av8Var.O();
                    if (O6 == obj) {
                        O6 = e.e(Unit.a, f7a.k);
                        av8Var.n0(O6);
                    }
                    e1d e1dVar3 = (e1d) O6;
                    boolean i12 = av8Var.i(t1cVar) | av8Var.e(257);
                    Object O7 = av8Var.O();
                    if (i12 || O7 == obj) {
                        O7 = new kd3(e1dVar3, t1cVar, pm3Var2, e1dVar2, 5);
                        pm3Var = pm3Var2;
                        e1dVar = e1dVar2;
                        av8Var.n0(O7);
                    } else {
                        pm3Var = pm3Var2;
                        e1dVar = e1dVar2;
                    }
                    k1c k1cVar = (k1c) O7;
                    Object O8 = av8Var.O();
                    int i13 = 5;
                    if (O8 == obj) {
                        O8 = new ld3(e1dVar, pm3Var, 5);
                        av8Var.n0(O8);
                    }
                    Function0 function0 = (Function0) O8;
                    boolean i14 = av8Var.i(t1cVar);
                    Object O9 = av8Var.O();
                    if (i14 || O9 == obj) {
                        O9 = new md3(t1cVar, i13);
                        av8Var.n0(O9);
                    }
                    av8Var = av8Var;
                    s6a.h(o3h.a(q, false, (Function1) O9), yqo.H(1200550679, av8Var, new tk7(e1dVar3, am3Var, function0, ct8Var, P, qugVar, z8, z11, view, function15, z12, z13, meiVar, function1, neiVar)), k1cVar, av8Var, 48);
                    av8Var.s(false);
                    z9 = z11;
                    function14 = function15;
                    z7 = z12;
                    z10 = z13;
                } else {
                    av8Var.W();
                    z7 = z3;
                    z8 = z5;
                    function14 = function13;
                    z9 = z6;
                    z10 = z4;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new sk7(qugVar, xtcVar, function1, meiVar, neiVar, ct8Var, z8, function14, z9, z7, z10, i2, i3);
                    return;
                }
                return;
            }
            z6 = z2;
            i6 = i3 & 512;
            if (i6 != 0) {
            }
            i8 = i3 & 1024;
            if (av8Var.T(i7 & 1, (i7 & 306783379) == 306783378 || ((i8 != 0 ? (char) 6 : av8Var.h(z4) ? (char) 4 : (char) 2) & 3) != 2)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        function13 = function12;
        i5 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i5 == 0) {
        }
        z6 = z2;
        i6 = i3 & 512;
        if (i6 != 0) {
        }
        i8 = i3 & 1024;
        if (av8Var.T(i7 & 1, (i7 & 306783379) == 306783378 || ((i8 != 0 ? (char) 6 : av8Var.h(z4) ? (char) 4 : (char) 2) & 3) != 2)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void e(final int i2, final xmd xmdVar, final xtc xtcVar, of3 of3Var, final int i3) {
        av8 av8Var;
        eqf eqfVar;
        Function2 function2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1193413416);
        int i4 = i3 | (av8Var2.e(i2) ? 4 : 2) | (av8Var2.g(xmdVar) ? 32 : 16) | (av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var2.T(i4 & 1, (i4 & 147) != 146)) {
            if (xmdVar != null) {
                gv9<and> gv9Var = xmdVar.a;
                if (!gv9Var.isEmpty()) {
                    OddsEventUIModel oddsEventUIModel = xmdVar.c;
                    boolean z = gv9Var.size() == 1;
                    xtc d0 = l98.d0(bkh.d(xtcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                    p4h p4hVar = ww9.d;
                    u23 a2 = t23.a(p4hVar, uxf.o, av8Var2, 0);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m2 = av8Var2.m();
                    xtc C = fqj.C(av8Var2, d0);
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
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var2, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var2, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var2, C, f50Var3);
                    xtc d02 = l98.d0(bkh.d(utc.a, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
                    u23 a3 = t23.a(p4hVar, uxf.q, av8Var2, 48);
                    int hashCode2 = Long.hashCode(av8Var2.T);
                    aee m3 = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, d02);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a3, f50Var);
                    waa.K(av8Var2, m3, ff3Var);
                    bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                    waa.K(av8Var2, C2, f50Var3);
                    iu7.f(i2, i4 & 14, 2, av8Var2, null);
                    av8Var2.s(true);
                    av8Var2.d0(1059103636);
                    for (and andVar : gv9Var) {
                        av8Var2.a0(1336559729, Integer.valueOf(andVar.b.a));
                        int i5 = oddsEventUIModel.a;
                        String str = oddsEventUIModel.b;
                        String str2 = oddsEventUIModel.c;
                        OddsEventUIModel oddsEventUIModel2 = oddsEventUIModel;
                        old oldVar = andVar.a;
                        fgf fgfVar = andVar.b;
                        vmd vmdVar = vmd.WEEKLY_CHALLENGE;
                        bgf bgfVar = cgf.a;
                        boolean z2 = oldVar.c;
                        bgfVar.getClass();
                        av8 av8Var3 = av8Var2;
                        nld.d(i5, str, str2, oldVar, fgfVar, vmdVar, "featured", null, 0L, false, z ? cgf.c : z2 ? cgf.b : cgf.d, false, false, null, null, av8Var3, 1769472, 0, 31616);
                        av8Var3.s(false);
                        av8Var2 = av8Var3;
                        oddsEventUIModel = oddsEventUIModel2;
                    }
                    av8Var = av8Var2;
                    av8Var.s(false);
                    av8Var.s(true);
                }
            }
            eqfVar = av8Var2.u();
            if (eqfVar != null) {
                final int i6 = 0;
                function2 = new Function2(i2, xmdVar, xtcVar, i3, i6) { // from class: ju7
                    public final /* synthetic */ int a;
                    public final /* synthetic */ int b;
                    public final /* synthetic */ xmd c;
                    public final /* synthetic */ xtc d;

                    {
                        this.a = i6;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i7 = this.a;
                        of3 of3Var2 = (of3) obj;
                        ((Integer) obj2).getClass();
                        switch (i7) {
                            case 0:
                                zm2.e(this.b, this.c, this.d, of3Var2, aba.K(1));
                                break;
                            default:
                                zm2.e(this.b, this.c, this.d, of3Var2, aba.K(1));
                                break;
                        }
                        return Unit.a;
                    }
                };
                eqfVar.d = function2;
            }
            return;
        }
        av8Var = av8Var2;
        av8Var.W();
        eqfVar = av8Var.u();
        if (eqfVar != null) {
            final int i7 = 1;
            function2 = new Function2(i2, xmdVar, xtcVar, i3, i7) { // from class: ju7
                public final /* synthetic */ int a;
                public final /* synthetic */ int b;
                public final /* synthetic */ xmd c;
                public final /* synthetic */ xtc d;

                {
                    this.a = i7;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i72 = this.a;
                    of3 of3Var2 = (of3) obj;
                    ((Integer) obj2).getClass();
                    switch (i72) {
                        case 0:
                            zm2.e(this.b, this.c, this.d, of3Var2, aba.K(1));
                            break;
                        default:
                            zm2.e(this.b, this.c, this.d, of3Var2, aba.K(1));
                            break;
                    }
                    return Unit.a;
                }
            };
            eqfVar.d = function2;
        }
    }

    public static final void f(j3l j3lVar, of3 of3Var, int i2) {
        j3lVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(79204886);
        int i3 = (av8Var.i(j3lVar) ? 4 : 2) | i2;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            e1d x = rfo.x(j3lVar.i, av8Var, 0);
            Context context = (Context) av8Var.k(nz.b);
            h3l h3lVar = (h3l) x.getValue();
            if (h3lVar instanceof e3l) {
                av8Var.d0(1656029121);
                t6a.b(bkh.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 6, 14);
                av8Var.s(false);
            } else if (h3lVar instanceof f3l) {
                av8Var.d0(1656190383);
                j72.h(null, Integer.valueOf(R.drawable.no_statistics), Integer.valueOf(R.string.no_statistics_yet_title), Integer.valueOf(R.string.no_statistics_yet_description), false, null, 0, 0L, av8Var, 0, 241);
                av8Var.s(false);
            } else {
                if (!(h3lVar instanceof g3l)) {
                    throw dmi.h(av8Var, -1193507195, false);
                }
                av8Var.d0(1656563530);
                ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                t3e t3eVar = new t3e(8.0f, 8.0f, 8.0f, 8.0f);
                boolean g2 = av8Var.g(h3lVar) | av8Var.i(context);
                Object O = av8Var.O();
                if (g2 || O == nf3.a) {
                    O = new mwj(27, (g3l) h3lVar, context);
                    av8Var.n0(O);
                }
                v8a.a(null, null, t3eVar, ng0Var, null, null, false, null, (Function1) O, av8Var, 24960, 491);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lqj(j3lVar, i2, 14);
        }
    }

    public static xtc g(xtc xtcVar, dx dxVar, boolean z) {
        ewd ewdVar = ewd.a;
        return xtcVar.z(new bw(dxVar, z));
    }

    public static final Object h(dx dxVar, float f2, ax axVar, lo4 lo4Var, Object obj, c80 c80Var, hw hwVar) {
        Object k2;
        float c2 = lo4Var.c(obj);
        csf csfVar = new csf();
        csfVar.a = Float.isNaN(((xnh) dxVar.f).h()) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : ((xnh) dxVar.f).h();
        if (!Float.isNaN(c2)) {
            float f3 = csfVar.a;
            if (f3 != c2 && (k2 = d2a.k(f3, c2, f2, c80Var, new vn6(3, axVar, csfVar), hwVar)) == lu3.a) {
                return k2;
            }
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(dx dxVar, Object obj, float f2, c80 c80Var, ol4 ol4Var, sq3 sq3Var) {
        gw gwVar;
        int i2;
        float f3;
        csf csfVar;
        if (sq3Var instanceof gw) {
            gwVar = (gw) sq3Var;
            int i3 = gwVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gwVar.u = i3 - Integer.MIN_VALUE;
                gw gwVar2 = gwVar;
                Object obj2 = gwVar2.t;
                Object obj3 = lu3.a;
                i2 = gwVar2.u;
                if (i2 != 0) {
                    y6a.M(obj2);
                    csf csfVar2 = new csf();
                    csfVar2.a = f2;
                    hw hwVar = new hw(dxVar, f2, c80Var, csfVar2, ol4Var, null);
                    gwVar2.s = csfVar2;
                    gwVar2.r = f2;
                    gwVar2.u = 1;
                    if (dxVar.b(obj, m1d.a, hwVar, gwVar2) == obj3) {
                        return obj3;
                    }
                    f3 = f2;
                    csfVar = csfVar2;
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f3 = gwVar2.r;
                    csfVar = gwVar2.s;
                    y6a.M(obj2);
                }
                return new Float(f3 - csfVar.a);
            }
        }
        gwVar = new gw(sq3Var);
        gw gwVar22 = gwVar;
        Object obj22 = gwVar22.t;
        Object obj32 = lu3.a;
        i2 = gwVar22.u;
        if (i2 != 0) {
        }
        return new Float(f3 - csfVar.a);
    }

    public static Object j(dx dxVar, Object obj, float f2, pw pwVar) {
        c80 c80Var;
        ol4 ol4Var;
        if (dxVar.h()) {
            c80Var = (c80) dxVar.k;
            if (c80Var == null) {
                Intrinsics.i("snapAnimationSpec");
                throw null;
            }
        } else {
            c80Var = aw.a;
        }
        c80 c80Var2 = c80Var;
        if (dxVar.h()) {
            ol4Var = (ol4) dxVar.l;
            if (ol4Var == null) {
                Intrinsics.i("decayAnimationSpec");
                throw null;
            }
        } else {
            ol4Var = aw.c;
        }
        return i(dxVar, obj, f2, c80Var2, ol4Var, pwVar);
    }

    public static long k(wl1 wl1Var) {
        float b2 = llf.b((((117.0f - yid.l(wl1Var.d)) / 234.0f) * 1.3f) + 0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        float b3 = llf.b((((yid.l(wl1Var.e) - 170.0f) / 340.0f) * 2.3f) + 0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        return (Float.floatToRawIntBits(b2) << 32) | (Float.floatToRawIntBits(b3) & 4294967295L);
    }

    public static final Object l(xv4 xv4Var, Function0 function0, sq3 sq3Var) {
        Object obj;
        c40 c40Var;
        if (!((wtc) xv4Var).a.n) {
            return Unit.a;
        }
        wtc wtcVar = (wtc) xv4Var;
        if (!wtcVar.a.n) {
            r3a.b("visitAncestors called on an unattached node");
        }
        wtc wtcVar2 = wtcVar.a.e;
        wma c0 = c6o.c0(xv4Var);
        loop0: while (true) {
            obj = null;
            if (c0 == null) {
                break;
            }
            if ((((wtc) c0.F.g).d & 524288) != 0) {
                while (wtcVar2 != null) {
                    if ((wtcVar2.c & 524288) != 0) {
                        wtc wtcVar3 = wtcVar2;
                        i1d i1dVar = null;
                        while (wtcVar3 != null) {
                            if (wtcVar3 instanceof p32) {
                                obj = wtcVar3;
                                break loop0;
                            }
                            if ((wtcVar3.c & 524288) != 0 && (wtcVar3 instanceof bw4)) {
                                int i2 = 0;
                                for (wtc wtcVar4 = ((bw4) wtcVar3).p; wtcVar4 != null; wtcVar4 = wtcVar4.f) {
                                    if ((wtcVar4.c & 524288) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            wtcVar3 = wtcVar4;
                                        } else {
                                            if (i1dVar == null) {
                                                i1dVar = new i1d(new wtc[16], 0);
                                            }
                                            if (wtcVar3 != null) {
                                                i1dVar.b(wtcVar3);
                                                wtcVar3 = null;
                                            }
                                            i1dVar.b(wtcVar4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            wtcVar3 = c6o.X(i1dVar);
                        }
                    }
                    wtcVar2 = wtcVar2.e;
                }
            }
            c0 = c0.v();
            wtcVar2 = (c0 == null || (c40Var = c0.F) == null) ? null : (hti) c40Var.f;
        }
        p32 p32Var = (p32) obj;
        if (p32Var == null) {
            return Unit.a;
        }
        wdd b0 = c6o.b0(xv4Var);
        Object J0 = p32Var.J0(b0, new y1(13, function0, b0), sq3Var);
        return J0 == lu3.a ? J0 : Unit.a;
    }

    public static boolean m(wm3 wm3Var) {
        int[] iArr = wm3Var.q0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        xm3 xm3Var = wm3Var.U;
        if (xm3Var == null) {
            xm3Var = null;
        }
        if (xm3Var != null) {
            int i4 = xm3Var.q0[0];
        }
        if (xm3Var != null) {
            int i5 = xm3Var.q0[1];
        }
        boolean z = i2 == 1 || wm3Var.B() || i2 == 2 || (i2 == 3 && wm3Var.s == 0 && wm3Var.X == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && wm3Var.u(0)) || (i2 == 3 && wm3Var.s == 1 && wm3Var.v(0, wm3Var.r()));
        boolean z2 = i3 == 1 || wm3Var.C() || i3 == 2 || (i3 == 3 && wm3Var.t == 0 && wm3Var.X == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && wm3Var.u(1)) || (i3 == 3 && wm3Var.t == 1 && wm3Var.v(1, wm3Var.l()));
        return (wm3Var.X > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (z || z2)) || (z && z2);
    }

    public static void n(xm3 xm3Var, h8b h8bVar, wm3 wm3Var) {
        wm3Var.p = -1;
        nl3 nl3Var = wm3Var.N;
        int[] iArr = wm3Var.q0;
        nl3 nl3Var2 = wm3Var.M;
        nl3 nl3Var3 = wm3Var.K;
        nl3 nl3Var4 = wm3Var.L;
        nl3 nl3Var5 = wm3Var.J;
        wm3Var.q = -1;
        int[] iArr2 = xm3Var.q0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i2 = nl3Var5.g;
            int r = xm3Var.r() - nl3Var4.g;
            nl3Var5.i = h8bVar.k(nl3Var5);
            nl3Var4.i = h8bVar.k(nl3Var4);
            h8bVar.d(nl3Var5.i, i2);
            h8bVar.d(nl3Var4.i, r);
            wm3Var.p = 2;
            wm3Var.Z = i2;
            int i3 = r - i2;
            wm3Var.V = i3;
            int i4 = wm3Var.c0;
            if (i3 < i4) {
                wm3Var.V = i4;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i5 = nl3Var3.g;
        int l2 = xm3Var.l() - nl3Var2.g;
        nl3Var3.i = h8bVar.k(nl3Var3);
        nl3Var2.i = h8bVar.k(nl3Var2);
        h8bVar.d(nl3Var3.i, i5);
        h8bVar.d(nl3Var2.i, l2);
        if (wm3Var.b0 > 0 || wm3Var.h0 == 8) {
            rvh k2 = h8bVar.k(nl3Var);
            nl3Var.i = k2;
            h8bVar.d(k2, wm3Var.b0 + i5);
        }
        wm3Var.q = 2;
        wm3Var.a0 = i5;
        int i6 = l2 - i5;
        wm3Var.W = i6;
        int i7 = wm3Var.d0;
        if (i6 < i7) {
            wm3Var.W = i7;
        }
    }

    public static byte[] o(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(lo4 lo4Var, float f2, float f3, Function1 function1, Function0 function0) {
        if (Float.isNaN(f2)) {
            a70.p("The offset provided to computeTarget must not be NaN.");
            return null;
        }
        boolean z = Math.abs(f3) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z2 = z && f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (!z) {
            Object a2 = lo4Var.a(f2);
            a2.getClass();
            return a2;
        }
        if (Math.abs(f3) >= Math.abs(((Number) function0.invoke()).floatValue())) {
            Object b2 = lo4Var.b(f2, z2);
            b2.getClass();
            return b2;
        }
        Object b3 = lo4Var.b(f2, false);
        b3.getClass();
        float c2 = lo4Var.c(b3);
        Object b4 = lo4Var.b(f2, true);
        b4.getClass();
        float c3 = lo4Var.c(b4);
        float abs = Math.abs(((Number) function1.invoke(Float.valueOf(Math.abs(c2 - c3)))).floatValue());
        if (!z2) {
            c2 = c3;
        }
        boolean z3 = Math.abs(c2 - f2) >= abs;
        if (z3) {
            return z2 ? b4 : b3;
        }
        if (z3) {
            zzl.b();
            return null;
        }
        if (z2) {
        }
    }

    public static void q(long j2, nkk nkkVar, usj[] usjVarArr) {
        int i2;
        while (true) {
            if (nkkVar.c() <= 1) {
                return;
            }
            int i3 = 0;
            while (true) {
                if (nkkVar.c() == 0) {
                    i2 = -1;
                    break;
                }
                int s = nkkVar.s();
                i3 += s;
                if (s != 255) {
                    i2 = i3;
                    break;
                }
            }
            int i4 = 0;
            while (true) {
                if (nkkVar.c() == 0) {
                    i4 = -1;
                    break;
                }
                int s2 = nkkVar.s();
                i4 += s2;
                if (s2 != 255) {
                    break;
                }
            }
            int i5 = nkkVar.b + i4;
            if (i4 == -1 || i4 > nkkVar.c()) {
                m6k.f0();
                i5 = nkkVar.c;
            } else if (i2 == 4 && i4 >= 8) {
                int s3 = nkkVar.s();
                int x = nkkVar.x();
                int f2 = x == 49 ? nkkVar.f() : 0;
                int s4 = nkkVar.s();
                if (x == 47) {
                    nkkVar.F(1);
                }
                boolean z = s3 == 181 && (x == 49 || x == 47) && s4 == 3;
                if (x == 49) {
                    z &= f2 == 1195456820;
                }
                if (z) {
                    r(j2, nkkVar, usjVarArr);
                }
            }
            nkkVar.E(i5);
        }
    }

    public static void r(long j2, nkk nkkVar, usj[] usjVarArr) {
        long j3;
        int s = nkkVar.s();
        if ((s & 64) != 0) {
            nkkVar.F(1);
            int i2 = (s & 31) * 3;
            int i3 = nkkVar.b;
            int length = usjVarArr.length;
            int i4 = 0;
            while (i4 < length) {
                usj usjVar = usjVarArr[i4];
                nkkVar.E(i3);
                usjVar.d(i2, nkkVar);
                if (j2 != C.TIME_UNSET) {
                    j3 = j2;
                    usjVar.c(j3, 1, i2, 0, null);
                } else {
                    j3 = j2;
                }
                i4++;
                j2 = j3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [sn2] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public static final nb8 s(k6g k6gVar, boolean z, String[] strArr, Function1 function1) {
        k6gVar.getClass();
        taa invalidationTracker = k6gVar.getInvalidationTracker();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        invalidationTracker.getClass();
        i1k i1kVar = invalidationTracker.c;
        Pair j2 = i1kVar.j(strArr2);
        String[] strArr3 = (String[]) j2.a;
        int[] iArr = (int[]) j2.b;
        strArr3.getClass();
        iArr.getClass();
        pog pogVar = new pog(new kuj(i1kVar, iArr, strArr3, (rq3) (0 == true ? 1 : 0), 4));
        rqa rqaVar = invalidationTracker.i;
        o63 o63Var = rqaVar != null ? new o63(9, (aeh) rqaVar.h, strArr3) : null;
        if (o63Var != null) {
            z88[] z88VarArr = {pogVar, o63Var};
            int i2 = la8.a;
            pogVar = new sn2(new nh0(z88VarArr, 0), g.a, -2, a62.a, 1);
        }
        return new nb8(k53.W(pogVar, -1), k6gVar, z, function1);
    }

    public static ex8 t(String str, String str2) {
        Exception U;
        str.getClass();
        try {
            nx8 nx8Var = new nx8(new e0(26), null);
            if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                U = l98.U(new e0(0), str2, nx8Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                U = l98.U(new e0(1), str2, nx8Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                U = l98.U(new e0(2), str2, nx8Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                U = l98.U(new e0(3), str2, nx8Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                U = l98.U(new e0(4), str2, nx8Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                U = l98.U(new e0(5), str2, nx8Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                U = l98.U(new e0(6), str2, nx8Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                U = l98.U(new e0(7), str2, nx8Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                U = l98.U(new e0(8), str2, nx8Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                U = l98.U(new e0(9), str2, nx8Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                U = l98.U(new e0(10), str2, nx8Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                U = l98.U(new e0(11), str2, nx8Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                U = l98.U(new e0(12), str2, nx8Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                U = l98.U(new e0(13), str2, nx8Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                U = l98.U(new e0(14), str2, nx8Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                U = l98.U(new e0(15), str2, nx8Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                U = l98.U(new e0(16), str2, nx8Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                U = l98.U(new e0(17), str2, nx8Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                U = l98.U(new e0(18), str2, nx8Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                U = l98.U(new e0(19), str2, nx8Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                U = l98.U(new e0(20), str2, nx8Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                U = l98.U(new e0(21), str2, nx8Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                U = l98.U(new e0(22), str2, nx8Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                U = l98.U(new e0(23), str2, nx8Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                U = l98.U(new e0(24), str2, nx8Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                U = l98.U(new e0(25), str2, nx8Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                U = l98.U(new e0(26), str2, nx8Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                U = l98.U(new e0(27), str2, nx8Var);
            } else {
                if (!str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                    throw new lr8();
                }
                U = l98.U(new e0(28), str2, nx8Var);
            }
            return (ex8) U;
        } catch (lr8 unused) {
            return new dx8(str2, str);
        }
    }

    public static final boolean u(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static void v(int i2, do1 do1Var, wm3 wm3Var, boolean z) {
        nl3 nl3Var;
        nl3 nl3Var2;
        boolean z2;
        nl3 nl3Var3;
        nl3 nl3Var4;
        if (wm3Var.n) {
            return;
        }
        if (!(wm3Var instanceof xm3) && wm3Var.A() && m(wm3Var)) {
            xm3.b0(wm3Var, do1Var, new co1());
        }
        nl3 j2 = wm3Var.j(2);
        nl3 j3 = wm3Var.j(4);
        int d2 = j2.d();
        int d3 = j3.d();
        HashSet hashSet = j2.a;
        if (hashSet != null && j2.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                nl3 nl3Var5 = (nl3) it.next();
                wm3 wm3Var2 = nl3Var5.d;
                int i3 = i2 + 1;
                boolean m2 = m(wm3Var2);
                nl3 nl3Var6 = wm3Var2.J;
                nl3 nl3Var7 = wm3Var2.L;
                if (wm3Var2.A() && m2) {
                    z2 = true;
                    xm3.b0(wm3Var2, do1Var, new co1());
                } else {
                    z2 = true;
                }
                boolean z3 = ((nl3Var5 == nl3Var6 && (nl3Var4 = nl3Var7.f) != null && nl3Var4.c) || (nl3Var5 == nl3Var7 && (nl3Var3 = nl3Var6.f) != null && nl3Var3.c)) ? z2 : false;
                int i4 = wm3Var2.q0[0];
                if (i4 != 3 || m2) {
                    if (!wm3Var2.A()) {
                        if (nl3Var5 == nl3Var6 && nl3Var7.f == null) {
                            int e2 = nl3Var6.e() + d2;
                            wm3Var2.L(e2, wm3Var2.r() + e2);
                            v(i3, do1Var, wm3Var2, z);
                        } else if (nl3Var5 == nl3Var7 && nl3Var6.f == null) {
                            int e3 = d2 - nl3Var7.e();
                            wm3Var2.L(e3 - wm3Var2.r(), e3);
                            v(i3, do1Var, wm3Var2, z);
                        } else if (z3 && !wm3Var2.y()) {
                            H(i3, do1Var, wm3Var2, z);
                        }
                    }
                } else if (i4 == 3 && wm3Var2.w >= 0 && wm3Var2.v >= 0 && (wm3Var2.h0 == 8 || (wm3Var2.s == 0 && wm3Var2.X == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
                    if (!wm3Var2.y() && !wm3Var2.G && z3 && !wm3Var2.y()) {
                        I(i3, wm3Var, do1Var, wm3Var2, z);
                    }
                }
            }
        }
        if (wm3Var instanceof s49) {
            return;
        }
        HashSet hashSet2 = j3.a;
        if (hashSet2 != null && j3.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                nl3 nl3Var8 = (nl3) it2.next();
                wm3 wm3Var3 = nl3Var8.d;
                int i5 = i2 + 1;
                boolean m3 = m(wm3Var3);
                nl3 nl3Var9 = wm3Var3.J;
                nl3 nl3Var10 = wm3Var3.L;
                if (wm3Var3.A() && m3) {
                    xm3.b0(wm3Var3, do1Var, new co1());
                }
                boolean z4 = (nl3Var8 == nl3Var9 && (nl3Var2 = nl3Var10.f) != null && nl3Var2.c) || (nl3Var8 == nl3Var10 && (nl3Var = nl3Var9.f) != null && nl3Var.c);
                int i6 = wm3Var3.q0[0];
                if (i6 != 3 || m3) {
                    if (!wm3Var3.A()) {
                        if (nl3Var8 == nl3Var9 && nl3Var10.f == null) {
                            int e4 = nl3Var9.e() + d3;
                            wm3Var3.L(e4, wm3Var3.r() + e4);
                            v(i5, do1Var, wm3Var3, z);
                        } else if (nl3Var8 == nl3Var10 && nl3Var9.f == null) {
                            int e5 = d3 - nl3Var10.e();
                            wm3Var3.L(e5 - wm3Var3.r(), e5);
                            v(i5, do1Var, wm3Var3, z);
                        } else if (z4 && !wm3Var3.y()) {
                            H(i5, do1Var, wm3Var3, z);
                        }
                    }
                } else if (i6 == 3 && wm3Var3.w >= 0 && wm3Var3.v >= 0) {
                    if (wm3Var3.h0 == 8 || (wm3Var3.s == 0 && wm3Var3.X == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                        if (!wm3Var3.y() && !wm3Var3.G && z4 && !wm3Var3.y()) {
                            I(i5, wm3Var, do1Var, wm3Var3, z);
                        }
                    }
                }
            }
        }
        wm3Var.n = true;
    }

    public static xtc w(xtc xtcVar, wzc wzcVar) {
        return xtcVar.z(new uf9(wzcVar));
    }

    public static int x(int i2, int i3, int i4) {
        if ((i3 & 8) != 0) {
            i2--;
        }
        if (i4 <= i2) {
            return i2 - i4;
        }
        is8.e(dmi.k(i4, i2, "PROTOCOL_ERROR padding ", " > remaining length "));
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static pl1 y(List list, String str, String str2, Boolean bool, gl1 gl1Var) {
        List G0;
        List list2;
        ol1 ol1Var;
        Object[] objArr;
        int G = t62.G(ll1.b, gl1Var);
        m91 valueOf = str2 != null ? m91.valueOf(str2) : null;
        l91 valueOf2 = str != null ? l91.valueOf(str) : null;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            wl1 wl1Var = (wl1) obj;
            if (wl1Var.d != null && wl1Var.e != null) {
                arrayList.add(obj);
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wl1 wl1Var2 = (wl1) it.next();
            wl1Var2.getClass();
            l91 l91Var = wl1Var2.b;
            if (l91Var != null) {
                linkedHashSet.add(l91Var);
            }
        }
        if (valueOf2 != null) {
            List<wl1> I = t62.I(arrayList, null, valueOf2, 1);
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (wl1 wl1Var3 : I) {
                wl1Var3.getClass();
                m91 m91Var = wl1Var3.a;
                if (m91Var != null) {
                    linkedHashSet2.add(m91Var);
                }
            }
            G0 = CollectionsKt.G0(linkedHashSet2);
        } else {
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                wl1 wl1Var4 = (wl1) it2.next();
                wl1Var4.getClass();
                m91 m91Var2 = wl1Var4.a;
                if (m91Var2 != null) {
                    linkedHashSet3.add(m91Var2);
                }
            }
            G0 = CollectionsKt.G0(linkedHashSet3);
        }
        if (valueOf == null) {
            valueOf = !Intrinsics.c(bool, Boolean.FALSE) ? (m91) CollectionsKt.F0(G0) : null;
        }
        List I2 = t62.I(arrayList, valueOf, null, 2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : I2) {
            l91 l91Var2 = ((wl1) obj2).b;
            Object obj3 = linkedHashMap.get(l91Var2);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(l91Var2, obj3);
            }
            ((List) obj3).add(obj2);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = linkedHashMap.entrySet().iterator();
        while (true) {
            objArr = 0;
            if (!it3.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it3.next();
            l91 l91Var3 = (l91) entry.getKey();
            List list3 = (List) entry.getValue();
            if (l91Var3 != null) {
                String name = l91Var3.name();
                ArrayList arrayList3 = new ArrayList(k13.r(list3, 10));
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(new dnd(k((wl1) it4.next())));
                    G0 = G0;
                }
                list2 = G0;
                ol1Var = new ol1(name, l6g.W(arrayList3), l91Var3.d, valueOf2 == null || valueOf2 == l91Var3);
            } else {
                list2 = G0;
                ol1Var = null;
            }
            if (ol1Var != null) {
                arrayList2.add(ol1Var);
            }
            G0 = list2;
        }
        List list4 = G0;
        List F = t62.F(arrayList2);
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        Iterator it5 = F.iterator();
        while (it5.hasNext()) {
            linkedHashSet4.add(l91.valueOf(((ol1) it5.next()).a));
        }
        boolean z = valueOf2 == null || linkedHashSet4.contains(valueOf2);
        if (!z) {
            ArrayList arrayList4 = new ArrayList(k13.r(F, 10));
            Iterator it6 = F.iterator();
            while (it6.hasNext()) {
                arrayList4.add(ol1.a((ol1) it6.next()));
            }
            F = arrayList4;
        }
        Map a2 = h49.a(new xl1(arrayList, objArr == true ? 1 : 0));
        if (valueOf == null) {
            linkedHashSet4 = null;
        }
        boolean z2 = z;
        return new pl1(ll1.b, l6g.W(F), t62.w(new nl1(R.string.baseball_filter_by_pitch_outcome, l6g.W(t62.D(CollectionsKt.H0(linkedHashSet, new yl1(a2, 0)), true, linkedHashSet4)), (str == null || !z2) ? null : str)), isEmpty ? null : new nl1(R.string.baseball_pitch_type, l6g.W(t62.E(list4, false, null)), valueOf != null ? valueOf.name() : null), G);
    }

    public static pl1 z(List list, String str, String str2, Boolean bool, gl1 gl1Var) {
        List G0;
        ArrayList arrayList;
        ol1 ol1Var;
        int G = t62.G(ll1.a, gl1Var);
        m91 valueOf = str != null ? m91.valueOf(str) : null;
        l91 valueOf2 = str2 != null ? l91.valueOf(str2) : null;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            wl1 wl1Var = (wl1) obj;
            if (wl1Var.d != null && wl1Var.e != null) {
                arrayList2.add(obj);
            }
        }
        boolean isEmpty = arrayList2.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            wl1 wl1Var2 = (wl1) it.next();
            wl1Var2.getClass();
            m91 m91Var = wl1Var2.a;
            if (m91Var != null) {
                linkedHashSet.add(m91Var);
            }
        }
        if (valueOf != null) {
            List<wl1> I = t62.I(arrayList2, valueOf, null, 2);
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (wl1 wl1Var3 : I) {
                wl1Var3.getClass();
                l91 l91Var = wl1Var3.b;
                if (l91Var != null) {
                    linkedHashSet2.add(l91Var);
                }
            }
            G0 = CollectionsKt.G0(linkedHashSet2);
        } else {
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                wl1 wl1Var4 = (wl1) it2.next();
                wl1Var4.getClass();
                l91 l91Var2 = wl1Var4.b;
                if (l91Var2 != null) {
                    linkedHashSet3.add(l91Var2);
                }
            }
            G0 = CollectionsKt.G0(linkedHashSet3);
        }
        if (valueOf2 == null) {
            valueOf2 = !Intrinsics.c(bool, Boolean.FALSE) ? (l91) CollectionsKt.F0(G0) : null;
        }
        List I2 = t62.I(arrayList2, null, valueOf2, 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : I2) {
            m91 m91Var2 = ((wl1) obj2).a;
            Object obj3 = linkedHashMap.get(m91Var2);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(m91Var2, obj3);
            }
            ((List) obj3).add(obj2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = linkedHashMap.entrySet().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it3.next();
            m91 m91Var3 = (m91) entry.getKey();
            List list2 = (List) entry.getValue();
            if (m91Var3 != null) {
                String name = m91Var3.name();
                ArrayList arrayList4 = new ArrayList(k13.r(list2, 10));
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(new dnd(k((wl1) it4.next())));
                    arrayList3 = arrayList3;
                }
                arrayList = arrayList3;
                ol1Var = new ol1(name, l6g.W(arrayList4), m91Var3.d, valueOf == null || valueOf == m91Var3);
            } else {
                arrayList = arrayList3;
                ol1Var = null;
            }
            ArrayList arrayList5 = arrayList;
            if (ol1Var != null) {
                arrayList5.add(ol1Var);
            }
            arrayList3 = arrayList5;
        }
        List F = t62.F(arrayList3);
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        Iterator it5 = F.iterator();
        while (it5.hasNext()) {
            linkedHashSet4.add(m91.valueOf(((ol1) it5.next()).a));
        }
        boolean z = valueOf == null || linkedHashSet4.contains(valueOf);
        if (!z) {
            ArrayList arrayList6 = new ArrayList(k13.r(F, 10));
            Iterator it6 = F.iterator();
            while (it6.hasNext()) {
                arrayList6.add(ol1.a((ol1) it6.next()));
            }
            F = arrayList6;
        }
        Map a2 = h49.a(new zl1(arrayList2));
        if (valueOf2 == null) {
            linkedHashSet4 = null;
        }
        l91 l91Var3 = valueOf2;
        return new pl1(ll1.a, l6g.W(F), t62.w(new nl1(R.string.baseball_filter_by_pitch_type, l6g.W(t62.E(CollectionsKt.H0(linkedHashSet, new yl1(a2, 1)), true, linkedHashSet4)), (str == null || !z) ? null : str)), isEmpty ? null : new nl1(R.string.baseball_pitch_outcome, l6g.W(t62.D(G0, false, null)), l91Var3 != null ? l91Var3.name() : null), G);
    }
}
