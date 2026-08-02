package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.WorkDatabase;
import com.appsflyer.internal.i;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.V2;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;
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
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class xw3 {
    public static final c50 a = new c50();
    public static final tc3 b = new tc3(990330129, new qs2(7), false);
    public static final tc3 c = new tc3(1585096897, new qd3(21), false);
    public static final nx4 d = new nx4(1.0f, 1.0f);
    public static final u5l e = new u5l(0.31006f, 0.31616f);
    public static final u5l f = new u5l(0.34567f, 0.3585f);
    public static final u5l g = new u5l(0.32168f, 0.33767f);
    public static final u5l h = new u5l(0.31271f, 0.32902f);
    public static final float[] i = {0.964212f, 1.0f, 0.825188f};
    public static final int[] j = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    public static final i68 k = new i68(0, 0, 0, 0);
    public static final /* synthetic */ int l = 0;
    public static final /* synthetic */ int m = 0;
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;

    public static final int A(long j2, long j3) {
        boolean J = J(j2);
        if (J != J(j3)) {
            return J ? -1 : 1;
        }
        return (Math.min(G(j2), G(j3)) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && I(j2) != I(j3)) ? I(j2) ? -1 : 1 : (int) Math.signum(G(j2) - G(j3));
    }

    public static final Long B(gj9 gj9Var) {
        gj9Var.getClass();
        o89 a2 = gj9Var.a();
        List list = zi9.a;
        String str = a2.get("Content-Length");
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }

    public static final up3 C(hj9 hj9Var) {
        hj9Var.getClass();
        t89 a2 = hj9Var.a();
        List list = zi9.a;
        String t = a2.t("Content-Type");
        if (t == null) {
            return null;
        }
        up3 up3Var = up3.e;
        return yqo.G(t);
    }

    public static final void D(yj9 yj9Var, up3 up3Var) {
        up3Var.getClass();
        t89 t89Var = yj9Var.c;
        List list = zi9.a;
        String up3Var2 = up3Var.toString();
        t89Var.P(up3Var2);
        List s = t89Var.s("Content-Type");
        s.clear();
        s.add(up3Var2);
    }

    public static FloatBuffer E(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static final int F(Cursor cursor, String str) {
        String str2;
        cursor.getClass();
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            columnNames.getClass();
            str2 = ph0.K(columnNames, null, null, null, null, 63);
        } catch (Exception unused) {
            str2 = "unknown";
        }
        a70.p(fc6.n("column '", str, "' does not exist. Available columns: ", str2));
        return 0;
    }

    public static final float G(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static boolean H(String str) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        y("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        y("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            throw new iy8(bf3.i(eglGetError, new StringBuilder("Error in getDefaultEglDisplay, error code: 0x")), hv9.z(Integer.valueOf(eglGetError)));
        }
        String eglQueryString = EGL14.eglQueryString(eglGetDisplay, 12373);
        return eglQueryString != null && eglQueryString.contains(str);
    }

    public static final boolean I(long j2) {
        return (j2 & 2) != 0;
    }

    public static final boolean J(long j2) {
        return (j2 & 1) != 0;
    }

    public static final g9i K(ku3 ku3Var, CoroutineContext coroutineContext, nu3 nu3Var, Function2 function2) {
        CoroutineContext b2 = yt3.b(ku3Var, coroutineContext);
        nu3Var.getClass();
        g9i vsaVar = nu3Var == nu3.b ? new vsa(b2, function2) : new g9i(b2, true);
        vsaVar.l0(nu3Var, vsaVar, function2);
        return vsaVar;
    }

    public static g9i L(ku3 ku3Var, CoroutineContext coroutineContext, nu3 nu3Var, Function2 function2, int i2) {
        if ((i2 & 1) != 0) {
            coroutineContext = g.a;
        }
        if ((i2 & 2) != 0) {
            nu3Var = nu3.a;
        }
        return K(ku3Var, coroutineContext, nu3Var, function2);
    }

    public static final void M(rsk rskVar, wma wmaVar) {
        long P = ((z3a) wmaVar.F.d).P(0L);
        int round = Math.round(Float.intBitsToFloat((int) (P >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (P & 4294967295L)));
        rskVar.layout(round, round2, rskVar.getMeasuredWidth() + round, rskVar.getMeasuredHeight() + round2);
    }

    public static void N(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final crb O(ce ceVar, Function1 function1, of3 of3Var) {
        Object keVar;
        Object obj;
        e.g(ceVar, of3Var);
        Object g2 = e.g(function1, of3Var);
        Object[] objArr = new Object[0];
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        Object obj2 = nf3.a;
        if (O == obj2) {
            O = new c0(11);
            av8Var.n0(O);
        }
        Object obj3 = (String) o3a.N(objArr, (Function0) O, av8Var, 48);
        me meVar = (me) av8Var.k(pgb.a);
        if (meVar == null) {
            av8Var.d0(1213380307);
            Object obj4 = (Context) av8Var.k(nz.b);
            while (true) {
                if (!(obj4 instanceof ContextWrapper)) {
                    obj4 = null;
                    break;
                }
                if (obj4 instanceof me) {
                    break;
                }
                obj4 = ((ContextWrapper) obj4).getBaseContext();
            }
            meVar = (me) obj4;
        } else {
            av8Var.d0(1213379439);
        }
        av8Var.s(false);
        if (meVar == null) {
            a70.r("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        Object activityResultRegistry = meVar.getActivityResultRegistry();
        Object O2 = av8Var.O();
        if (O2 == obj2) {
            O2 = new ee();
            av8Var.n0(O2);
        }
        ee eeVar = (ee) O2;
        Object O3 = av8Var.O();
        if (O3 == obj2) {
            O3 = new crb(eeVar);
            av8Var.n0(O3);
        }
        crb crbVar = (crb) O3;
        boolean i2 = av8Var.i(eeVar) | av8Var.i(activityResultRegistry) | av8Var.g(obj3) | av8Var.i(ceVar) | av8Var.g(g2);
        Object O4 = av8Var.O();
        if (i2 || O4 == obj2) {
            obj = ceVar;
            keVar = new ke(eeVar, activityResultRegistry, obj3, obj, g2, 0);
            av8Var.n0(keVar);
        } else {
            keVar = O4;
            obj = ceVar;
        }
        Function1 function12 = (Function1) keVar;
        boolean g3 = av8Var.g(activityResultRegistry) | av8Var.g(obj3) | av8Var.g(obj);
        Object O5 = av8Var.O();
        if (g3 || O5 == obj2) {
            O5 = new m55(function12);
            av8Var.n0(O5);
        }
        return crbVar;
    }

    public static boolean P(ml6 ml6Var, boolean z, boolean z2) {
        boolean z3;
        int i2;
        int i3;
        long length = ml6Var.getLength();
        long j2 = -1;
        int i4 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j3 = 4096;
        if (i4 != 0 && length <= 4096) {
            j3 = length;
        }
        int i5 = (int) j3;
        nkk nkkVar = new nkk(64);
        int i6 = 0;
        int i7 = 0;
        boolean z4 = false;
        while (i7 < i5) {
            nkkVar.B(8);
            if (!ml6Var.peekFully(nkkVar.a, i6, 8, true)) {
                break;
            }
            long t = nkkVar.t();
            int f2 = nkkVar.f();
            if (t == 1) {
                ml6Var.peekFully(nkkVar.a, 8, 8);
                nkkVar.D(16);
                i2 = i7;
                i3 = 16;
                t = nkkVar.m();
            } else {
                if (t == 0) {
                    long length2 = ml6Var.getLength();
                    if (length2 != j2) {
                        t = (length2 - ml6Var.getPeekPosition()) + 8;
                    }
                }
                i2 = i7;
                i3 = 8;
            }
            long j4 = i3;
            if (t < j4) {
                return false;
            }
            int i8 = i2 + i3;
            if (f2 == 1836019574) {
                i5 += (int) t;
                if (i4 != 0 && i5 > length) {
                    i5 = (int) length;
                }
                i7 = i8;
            } else {
                if (f2 == 1836019558 || f2 == 1836475768) {
                    z3 = true;
                    break;
                }
                int i9 = i4;
                if ((i8 + t) - j4 >= i5) {
                    break;
                }
                int i10 = (int) (t - j4);
                i7 = i8 + i10;
                if (f2 == 1718909296) {
                    if (i10 < 8) {
                        return false;
                    }
                    nkkVar.B(i10);
                    ml6Var.peekFully(nkkVar.a, 0, i10);
                    int i11 = i10 / 4;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (i12 != 1) {
                            int f3 = nkkVar.f();
                            if ((f3 >>> 8) != 3368816 && (f3 != 1751476579 || !z2)) {
                                for (int i13 = 0; i13 < 29; i13++) {
                                    if (j[i13] != f3) {
                                    }
                                }
                            }
                            z4 = true;
                            break;
                        }
                        nkkVar.F(4);
                    }
                    if (!z4) {
                        return false;
                    }
                } else if (i10 != 0) {
                    ml6Var.advancePeekPosition(i10);
                }
                i4 = i9;
            }
            j2 = -1;
            i6 = 0;
        }
        z3 = false;
        return z4 && z == z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Throwable Q(Throwable th) {
        th.getClass();
        Throwable th2 = th;
        while (true) {
            if (!(th2 instanceof CancellationException)) {
                if (th2 == null) {
                    break;
                }
                return th2;
            }
            CancellationException cancellationException = (CancellationException) th2;
            if (th2.equals(cancellationException.getCause())) {
                break;
            }
            th2 = cancellationException.getCause();
        }
    }

    public static final Object R(CoroutineContext coroutineContext, Function2 function2, rq3 rq3Var) {
        Object a2;
        CoroutineContext context = rq3Var.getContext();
        CoroutineContext plus = !((Boolean) coroutineContext.fold(Boolean.FALSE, new xt3(1))).booleanValue() ? context.plus(coroutineContext) : yt3.a(context, coroutineContext, false);
        bea.u(plus);
        if (plus == context) {
            btg btgVar = new btg(rq3Var, plus);
            a2 = y6a.L(btgVar, true, btgVar, function2);
        } else {
            tq3 tq3Var = d.Q7;
            if (Intrinsics.c(plus.get(tq3Var), context.get(tq3Var))) {
                x9k x9kVar = new x9k(rq3Var, plus);
                CoroutineContext coroutineContext2 = x9kVar.d;
                Object c2 = yfj.c(coroutineContext2, null);
                try {
                    Object L = y6a.L(x9kVar, true, x9kVar, function2);
                    yfj.a(coroutineContext2, c2);
                    a2 = L;
                } catch (Throwable th) {
                    yfj.a(coroutineContext2, c2);
                    throw th;
                }
            } else {
                u45 u45Var = new u45(rq3Var, plus);
                hkg.r0(function2, u45Var, u45Var);
                while (true) {
                    Unsafe unsafe = rh0.a;
                    long j2 = u45.f;
                    int intVolatile = unsafe.getIntVolatile(u45Var, j2);
                    if (intVolatile != 0) {
                        if (intVolatile != 2) {
                            a70.r("Already suspended");
                            return null;
                        }
                        a2 = lea.a(u45Var.O());
                        if (a2 instanceof eb3) {
                            throw ((eb3) a2).a;
                        }
                    } else if (unsafe.compareAndSwapInt(u45Var, j2, 0, 1)) {
                        a2 = lu3.a;
                        break;
                    }
                }
            }
        }
        lu3 lu3Var = lu3.a;
        return a2;
    }

    public static final lcl S(List list, lcl lclVar) {
        list.getClass();
        boolean f2 = lclVar.e.f("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
        boolean f3 = lclVar.e.f("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        boolean f4 = lclVar.e.f("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (f2 || !f3 || !f4) {
            return lclVar;
        }
        String str = lclVar.c;
        hpo hpoVar = new hpo(18);
        md4 md4Var = lclVar.e;
        md4Var.getClass();
        hpoVar.C(md4Var.a);
        ((LinkedHashMap) hpoVar.a).put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
        return lcl.b(lclVar, null, null, hpoVar.l(), 0, 0L, 0, 0, 0L, 0, 33554411);
    }

    /* JADX WARN: Removed duplicated region for block: B:220:0x095e  */
    /* JADX WARN: Removed duplicated region for block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i2, int i3, gv9 gv9Var, gv9 gv9Var2, boolean z, gv9 gv9Var3, gv9 gv9Var4, vsi vsiVar, vsi vsiVar2, Function1 function1, xtc xtcVar, of3 of3Var, int i4) {
        boolean z2;
        av8 av8Var;
        gv9 gv9Var5;
        vsi vsiVar3;
        vsi vsiVar4;
        Function1 function12;
        eqf u;
        mg0 mg0Var;
        int i5;
        b7 b7Var;
        e1d e1dVar;
        Unit unit;
        mg0 mg0Var2;
        av8 av8Var2;
        a99 a99Var;
        qug qugVar;
        Throwable th;
        e1d e1dVar2;
        a99 a99Var2;
        utc utcVar;
        boolean z3;
        float f2;
        boolean z4;
        int i6;
        int i7;
        wxf wxfVar = ww9.b;
        kv1 kv1Var = uxf.o;
        lv1 lv1Var = uxf.l;
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(-1496910826);
        int i8 = i4 | (av8Var3.e(i2) ? 4 : 2) | (av8Var3.e(i3) ? 32 : 16) | (av8Var3.g(gv9Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var3.g(gv9Var2) ? a.o : 1024) | (av8Var3.h(z) ? 16384 : 8192) | (av8Var3.g(gv9Var3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var3.g(gv9Var4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var3.g(vsiVar) ? 8388608 : 4194304) | (av8Var3.g(vsiVar2) ? 67108864 : 33554432) | (av8Var3.i(function1) ? 536870912 : 268435456);
        char c2 = av8Var3.g(xtcVar) ? (char) 4 : (char) 2;
        if ((i8 & 306783379) == 306783378 && (c2 & 3) == 2) {
            z2 = false;
            if (av8Var3.T(i8 & 1, z2)) {
                av8Var = av8Var3;
                gv9Var5 = gv9Var4;
                vsiVar3 = vsiVar;
                vsiVar4 = vsiVar2;
                function12 = function1;
                av8Var.W();
            } else {
                Object O = av8Var3.O();
                a99 a99Var3 = nf3.a;
                if (O == a99Var3) {
                    O = e.f(Boolean.TRUE);
                    av8Var3.n0(O);
                }
                e1d e1dVar3 = (e1d) O;
                View view = (View) av8Var3.k(nz.f);
                qug o0 = hkg.o0(av8Var3);
                boolean e2 = av8Var3.e(gv9Var3.size());
                Object O2 = av8Var3.O();
                if (e2 || O2 == a99Var3) {
                    O2 = gv9Var3.size() < 3 ? ww9.i : ww9.h;
                    av8Var3.n0(O2);
                }
                mg0 mg0Var3 = (mg0) O2;
                Object O3 = av8Var3.O();
                if (O3 == a99Var3) {
                    mg0Var = mg0Var3;
                    O3 = l6g.K(Integer.valueOf(R.string.baseball_runs_short), Integer.valueOf(R.string.baseball_hits_short), Integer.valueOf(R.string.baseball_errors_short));
                    av8Var3.n0(O3);
                } else {
                    mg0Var = mg0Var3;
                }
                b7 b7Var2 = (b7) O3;
                Unit unit2 = Unit.a;
                boolean g2 = ((57344 & i8) == 16384) | ((i8 & 896) == 256) | av8Var3.g(o0);
                Object O4 = av8Var3.O();
                rq3 rq3Var = null;
                if (g2 || O4 == a99Var3) {
                    i5 = i8;
                    b7Var = b7Var2;
                    e1dVar = e1dVar3;
                    unit = unit2;
                    mg0Var2 = mg0Var;
                    av8Var2 = av8Var3;
                    a99Var = a99Var3;
                    t3 t3Var = new t3(z, gv9Var, o0, rq3Var, 2);
                    qugVar = o0;
                    th = null;
                    av8Var2.n0(t3Var);
                    O4 = t3Var;
                } else {
                    av8Var2 = av8Var3;
                    i5 = i8;
                    qugVar = o0;
                    b7Var = b7Var2;
                    th = null;
                    e1dVar = e1dVar3;
                    unit = unit2;
                    mg0Var2 = mg0Var;
                    a99Var = a99Var3;
                }
                hz8.o(av8Var2, unit, (Function2) O4);
                xtc d0 = l98.d0(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var2), o7g.a(16.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                p4h p4hVar = ww9.d;
                u23 a2 = t23.a(p4hVar, kv1Var, av8Var2, 0);
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
                l8g a3 = k8g.a(wxfVar, uxf.n, av8Var2, 48);
                int hashCode2 = Long.hashCode(av8Var2.T);
                aee m3 = av8Var2.m();
                mg0 mg0Var4 = mg0Var2;
                utc utcVar2 = utc.a;
                xtc C2 = fqj.C(av8Var2, utcVar2);
                av8Var2.h0();
                a99 a99Var4 = a99Var;
                if (av8Var2.S) {
                    av8Var2.l(zg3Var);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, a3, f50Var);
                waa.K(av8Var2, m3, ff3Var);
                bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                waa.K(av8Var2, C2, f50Var3);
                nq8.h(av8Var2, bkh.p(utcVar2, 8.0f));
                u23 a4 = t23.a(p4hVar, kv1Var, av8Var2, 0);
                int hashCode3 = Long.hashCode(av8Var2.T);
                aee m4 = av8Var2.m();
                xtc C3 = fqj.C(av8Var2, utcVar2);
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, a4, f50Var);
                waa.K(av8Var2, m4, ff3Var);
                bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
                waa.K(av8Var2, C3, f50Var3);
                av8 av8Var4 = av8Var2;
                td4.G(i2, bkh.l(utcVar2, 20.0f), false, 0L, av8Var4, (i5 & 14) | 48, 12);
                nq8.h(av8Var2, bkh.e(utcVar2, 12.0f));
                td4.G(i3, bkh.l(utcVar2, 20.0f), false, 0L, av8Var4, ((i5 >> 3) & 14) | 48, 12);
                nq8.h(av8Var2, bkh.e(utcVar2, 8.0f));
                av8Var2.s(true);
                xtc M = kda.M(0, av8Var2, l98.d0(new goa(1.0f, true), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), qugVar.c(), qugVar.d());
                u23 a5 = t23.a(p4hVar, kv1Var, av8Var2, 0);
                int hashCode4 = Long.hashCode(av8Var2.T);
                aee m5 = av8Var2.m();
                xtc C4 = fqj.C(av8Var2, M);
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, a5, f50Var);
                waa.K(av8Var2, m5, ff3Var);
                bf3.s(hashCode4, av8Var2, f50Var2, av8Var2, ryVar);
                waa.K(av8Var2, C4, f50Var3);
                xtc Z = hkg.Z(l98.d0(bkh.d(utcVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), qugVar, ((Boolean) e1dVar.getValue()).booleanValue(), 12);
                Object O5 = av8Var2.O();
                int i9 = 6;
                if (O5 == a99Var4) {
                    e1dVar2 = e1dVar;
                    O5 = new w30(i9, e1dVar2);
                    av8Var2.n0(O5);
                } else {
                    e1dVar2 = e1dVar;
                }
                av8Var = av8Var2;
                utc utcVar3 = utcVar2;
                xtc u2 = i9a.u(Z, view, qugVar, (Function1) O5, av8Var, 3072);
                l8g a6 = k8g.a(mg0Var4, lv1Var, av8Var, 0);
                int hashCode5 = Long.hashCode(av8Var.T);
                aee m6 = av8Var.m();
                xtc C5 = fqj.C(av8Var, u2);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a6, f50Var);
                waa.K(av8Var, m6, ff3Var);
                bf3.s(hashCode5, av8Var, f50Var2, av8Var, ryVar);
                Iterator p = ljg.p(av8Var, C5, f50Var3, 514250966, gv9Var3);
                int i10 = 0;
                while (p.hasNext()) {
                    Object next = p.next();
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        b.q();
                        throw th;
                    }
                    String str = (String) next;
                    long D = lz.D(R.color.n_lv_3, av8Var);
                    yf8 yf8Var = xth.a;
                    q5a.w(str, bkh.p(l98.f0(utcVar3, i10 == 0 ? 8.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), 20.0f), D, null, 0L, 0L, new p7j(3), 0L, 0, false, 0, 0, xth.m(), av8Var, 0, 0, 130040);
                    i10 = i11;
                    utcVar3 = utcVar3;
                }
                utc utcVar4 = utcVar3;
                av8Var.s(false);
                av8Var.s(true);
                tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 15, 0L, 0L, av8Var, null);
                xtc Z2 = hkg.Z(l98.d0(bkh.d(utcVar4, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), qugVar, ((Boolean) e1dVar2.getValue()).booleanValue(), 12);
                Object O6 = av8Var.O();
                if (O6 == a99Var4) {
                    O6 = new w30(7, e1dVar2);
                    av8Var.n0(O6);
                }
                xtc u3 = i9a.u(Z2, view, qugVar, (Function1) O6, av8Var, 3072);
                l8g a7 = k8g.a(mg0Var4, lv1Var, av8Var, 0);
                int hashCode6 = Long.hashCode(av8Var.T);
                aee m7 = av8Var.m();
                xtc C6 = fqj.C(av8Var, u3);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a7, hf3.g);
                waa.K(av8Var, m7, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode6), hf3.j);
                waa.J(av8Var, hf3.k);
                Iterator p2 = ljg.p(av8Var, C6, hf3.d, -1377792150, gv9Var);
                int i12 = 0;
                while (true) {
                    if (p2.hasNext()) {
                        Object next2 = p2.next();
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            b.q();
                            throw th;
                        }
                        String str2 = (String) next2;
                        String str3 = str2 != null ? str2 : "";
                        String str4 = (String) CollectionsKt.a0(i12, gv9Var2);
                        ListIterator listIterator = gv9Var.listIterator(gv9Var.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                i7 = -1;
                                break;
                            } else if (n9e.F((String) listIterator.previous())) {
                                i7 = listIterator.nextIndex();
                                break;
                            }
                        }
                        p(z, str3, str4, l98.f0(utcVar4, i12 == 0 ? 8.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i12 == i7, av8Var, (i5 >> 12) & 14, 16);
                        i12 = i13;
                    } else {
                        av8Var.s(false);
                        av8Var.s(true);
                        xtc Z3 = hkg.Z(l98.d0(bkh.d(utcVar4, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), qugVar, ((Boolean) e1dVar2.getValue()).booleanValue(), 12);
                        Object O7 = av8Var.O();
                        if (O7 == a99Var4) {
                            O7 = new w30(8, e1dVar2);
                            av8Var.n0(O7);
                        }
                        xtc u4 = i9a.u(Z3, view, qugVar, (Function1) O7, av8Var, 3072);
                        l8g a8 = k8g.a(mg0Var4, lv1Var, av8Var, 0);
                        int hashCode7 = Long.hashCode(av8Var.T);
                        aee m8 = av8Var.m();
                        xtc C7 = fqj.C(av8Var, u4);
                        if3.k7.getClass();
                        zg3 zg3Var3 = hf3.b;
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var3);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, a8, hf3.g);
                        waa.K(av8Var, m8, hf3.f);
                        waa.K(av8Var, Integer.valueOf(hashCode7), hf3.j);
                        waa.J(av8Var, hf3.k);
                        Iterator p3 = ljg.p(av8Var, C7, hf3.d, 1206502665, gv9Var2);
                        int i14 = 0;
                        while (p3.hasNext()) {
                            Object next3 = p3.next();
                            int i15 = i14 + 1;
                            if (i14 < 0) {
                                b.q();
                                throw th;
                            }
                            String str5 = (String) next3;
                            if (str5 == null) {
                                str5 = "";
                            }
                            String str6 = (String) CollectionsKt.a0(i14, gv9Var);
                            ListIterator listIterator2 = gv9Var2.listIterator(gv9Var2.size());
                            while (true) {
                                if (!listIterator2.hasPrevious()) {
                                    i6 = -1;
                                    break;
                                } else if (n9e.F((String) listIterator2.previous())) {
                                    i6 = listIterator2.nextIndex();
                                    break;
                                }
                            }
                            p(z, str5, str6, l98.f0(utcVar4, i14 == 0 ? 8.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i14 == i6, av8Var, (i5 >> 12) & 14, 16);
                            i14 = i15;
                        }
                        ljg.t(av8Var, false, true, true);
                        if (vsiVar2 == null || vsiVar == null) {
                            vsiVar3 = vsiVar;
                            vsiVar4 = vsiVar2;
                            a99Var2 = a99Var4;
                            utcVar = utcVar4;
                            z3 = true;
                            f2 = 8.0f;
                            av8Var.d0(923554662);
                            av8Var.s(false);
                        } else {
                            av8Var.d0(920621690);
                            xtc b0 = l98.b0(n9e.q(utcVar4, lz.D(R.color.surface_2, av8Var), o7g.a(8.0f)), 8.0f);
                            u23 a9 = t23.a(new ng0(8.0f, true, new a70(6)), kv1Var, av8Var, 6);
                            int hashCode8 = Long.hashCode(av8Var.T);
                            aee m9 = av8Var.m();
                            xtc C8 = fqj.C(av8Var, b0);
                            if3.k7.getClass();
                            zg3 zg3Var4 = hf3.b;
                            av8Var.h0();
                            if (av8Var.S) {
                                av8Var.l(zg3Var4);
                            } else {
                                av8Var.q0();
                            }
                            f50 f50Var4 = hf3.g;
                            waa.K(av8Var, a9, f50Var4);
                            ff3 ff3Var2 = hf3.f;
                            waa.K(av8Var, m9, ff3Var2);
                            Integer valueOf2 = Integer.valueOf(hashCode8);
                            f50 f50Var5 = hf3.j;
                            waa.K(av8Var, valueOf2, f50Var5);
                            ry ryVar2 = hf3.k;
                            waa.J(av8Var, ryVar2);
                            f50 f50Var6 = hf3.d;
                            waa.K(av8Var, C8, f50Var6);
                            l8g a10 = k8g.a(new ng0(8.0f, true, new a70(6)), lv1Var, av8Var, 6);
                            int hashCode9 = Long.hashCode(av8Var.T);
                            aee m10 = av8Var.m();
                            xtc C9 = fqj.C(av8Var, utcVar4);
                            av8Var.h0();
                            if (av8Var.S) {
                                av8Var.l(zg3Var4);
                            } else {
                                av8Var.q0();
                            }
                            waa.K(av8Var, a10, f50Var4);
                            waa.K(av8Var, m10, ff3Var2);
                            bf3.s(hashCode9, av8Var, f50Var5, av8Var, ryVar2);
                            waa.K(av8Var, C9, f50Var6);
                            av8Var.d0(-641253502);
                            ListIterator<Object> listIterator3 = b7Var.listIterator(0);
                            while (listIterator3.hasNext()) {
                                String v = oea.v(((Number) listIterator3.next()).intValue(), av8Var);
                                long D2 = lz.D(R.color.n_lv_3, av8Var);
                                yf8 yf8Var2 = xth.a;
                                q5a.w(v, bkh.p(utcVar4, 16.0f), D2, null, 0L, 0L, new p7j(3), 0L, 0, false, 0, 0, xth.m(), av8Var, 48, 0, 130040);
                            }
                            av8Var.s(false);
                            av8Var.s(true);
                            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 14, 0L, 0L, av8Var, bkh.p(utcVar4, 64.0f));
                            l8g a11 = k8g.a(new ng0(8.0f, true, new a70(6)), lv1Var, av8Var, 6);
                            int hashCode10 = Long.hashCode(av8Var.T);
                            aee m11 = av8Var.m();
                            xtc C10 = fqj.C(av8Var, utcVar4);
                            if3.k7.getClass();
                            zg3 zg3Var5 = hf3.b;
                            av8Var.h0();
                            if (av8Var.S) {
                                av8Var.l(zg3Var5);
                            } else {
                                av8Var.q0();
                            }
                            f50 f50Var7 = hf3.g;
                            waa.K(av8Var, a11, f50Var7);
                            ff3 ff3Var3 = hf3.f;
                            waa.K(av8Var, m11, ff3Var3);
                            Integer valueOf3 = Integer.valueOf(hashCode10);
                            f50 f50Var8 = hf3.j;
                            waa.K(av8Var, valueOf3, f50Var8);
                            ry ryVar3 = hf3.k;
                            waa.J(av8Var, ryVar3);
                            f50 f50Var9 = hf3.d;
                            waa.K(av8Var, C10, f50Var9);
                            vsiVar3 = vsiVar;
                            vsiVar4 = vsiVar2;
                            int i16 = ((i5 >> 12) & 14) | 24576;
                            p(z, vsiVar3.c, vsiVar4.c, null, 16.0f, false, av8Var, i16, 40);
                            p(z, vsiVar3.a, vsiVar4.a, null, 16.0f, false, av8Var, i16, 40);
                            p(z, vsiVar3.b, vsiVar4.b, null, 16.0f, false, av8Var, i16, 40);
                            av8Var.s(true);
                            xtc f0 = l98.f0(utcVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                            f2 = 8.0f;
                            a99Var2 = a99Var4;
                            utcVar = utcVar4;
                            l8g a12 = k8g.a(new ng0(8.0f, true, new a70(6)), lv1Var, av8Var, 6);
                            int hashCode11 = Long.hashCode(av8Var.T);
                            aee m12 = av8Var.m();
                            xtc C11 = fqj.C(av8Var, f0);
                            av8Var.h0();
                            if (av8Var.S) {
                                av8Var.l(zg3Var5);
                            } else {
                                av8Var.q0();
                            }
                            waa.K(av8Var, a12, f50Var7);
                            waa.K(av8Var, m12, ff3Var3);
                            bf3.s(hashCode11, av8Var, f50Var8, av8Var, ryVar3);
                            waa.K(av8Var, C11, f50Var9);
                            p(z, vsiVar4.c, vsiVar3.c, null, 16.0f, false, av8Var, i16, 40);
                            p(z, vsiVar4.a, vsiVar3.a, null, 16.0f, false, av8Var, i16, 40);
                            p(z, vsiVar4.b, vsiVar3.b, null, 16.0f, false, av8Var, i16, 40);
                            z3 = true;
                            ljg.t(av8Var, true, true, false);
                        }
                        utc utcVar5 = utcVar;
                        bf3.u(utcVar5, f2, av8Var, z3);
                        if (gv9Var4 == null || gv9Var4.isEmpty()) {
                            gv9Var5 = gv9Var4;
                            function12 = function1;
                            z4 = true;
                            av8Var.d0(1369030818);
                            av8Var.s(false);
                        } else {
                            bf3.r(f2, 1368368689, av8Var, av8Var, utcVar5);
                            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 15, 0L, 0L, av8Var, null);
                            xtc f3 = vxd.f(utcVar5, f2, av8Var, utcVar5, 1.0f);
                            l8g a13 = k8g.a(wxfVar, lv1Var, av8Var, 0);
                            int hashCode12 = Long.hashCode(av8Var.T);
                            aee m13 = av8Var.m();
                            xtc C12 = fqj.C(av8Var, f3);
                            if3.k7.getClass();
                            zg3 zg3Var6 = hf3.b;
                            av8Var.h0();
                            if (av8Var.S) {
                                av8Var.l(zg3Var6);
                            } else {
                                av8Var.q0();
                            }
                            waa.K(av8Var, a13, hf3.g);
                            waa.K(av8Var, m13, hf3.f);
                            waa.K(av8Var, Integer.valueOf(hashCode12), hf3.j);
                            waa.J(av8Var, hf3.k);
                            gv9Var5 = gv9Var4;
                            Iterator p4 = ljg.p(av8Var, C12, hf3.d, 935007635, gv9Var5);
                            while (p4.hasNext()) {
                                lm1 lm1Var = (lm1) p4.next();
                                goa goaVar = new goa(1.0f, true);
                                boolean g3 = ((i5 & 1879048192) == 536870912) | av8Var.g(lm1Var);
                                Object O8 = av8Var.O();
                                a99 a99Var5 = a99Var2;
                                if (g3 || O8 == a99Var5) {
                                    O8 = new j4(22, function1, lm1Var);
                                    av8Var.n0(O8);
                                }
                                m(lm1Var, l98.d0(tol.y(goaVar, false, false, false, 0L, null, (Function0) O8, av8Var, 31), f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var, 0);
                                a99Var2 = a99Var5;
                            }
                            function12 = function1;
                            z4 = true;
                            ljg.t(av8Var, false, true, false);
                        }
                        av8Var.s(z4);
                    }
                }
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new pm1(i2, i3, gv9Var, gv9Var2, z, gv9Var3, gv9Var5, vsiVar3, vsiVar4, function12, xtcVar, i4);
                return;
            }
            return;
        }
        z2 = true;
        if (av8Var3.T(i8 & 1, z2)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void b(gv9 gv9Var, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        gv9 gv9Var2;
        int i4;
        gv9Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-175131008);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(gv9Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        int i5 = 1;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Object[] objArr = new Object[0];
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new t63(i5);
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) o3a.N(objArr, (Function0) O, av8Var, 48);
            cdi b2 = a60.b(((Boolean) e1dVar.getValue()).booleanValue() ? 180.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, "heatmapChevronRotation", av8Var, 3072, 22);
            xtc d2 = bkh.d(xtcVar, 1.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            utc utcVar = utc.a;
            xtc d3 = bkh.d(utcVar, 1.0f);
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O2;
            Object[] objArr2 = new Object[0];
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = fi.t;
                av8Var.n0(O3);
            }
            xtc e0 = l98.e0(tol.y(d3, true, true, true, D, wzcVar, new dk1((boh) o3a.N(objArr2, (Function0) O3, av8Var, 48), e1dVar, 3), av8Var, 0), 16.0f, 16.0f, 16.0f, 12.0f);
            l8g a3 = k8g.a(ww9.f, uxf.m, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, e0);
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
            String v = oea.v(R.string.season_heat_map, av8Var);
            yf8 yf8Var = xth.a;
            i4 = 2;
            udj.c(v, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
            ImageVector N = s6a.N(R.drawable.ic_chevron_down, 6, av8Var);
            long D2 = lz.D(R.color.n_lv_1, av8Var);
            xtc l2 = bkh.l(l98.f0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 24.0f);
            boolean g2 = av8Var.g(b2);
            Object O4 = av8Var.O();
            if (g2 || O4 == a99Var) {
                O4 = new cl1(b2, i4);
                av8Var.n0(O4);
            }
            kq9.b(N, null, s02.M(l2, (Function1) O4), D2, av8Var, 48, 0);
            av8Var.s(true);
            gv9Var2 = gv9Var;
            fz8.b(x23.a, ((Boolean) e1dVar.getValue()).booleanValue(), null, null, null, null, yqo.H(-1843430798, av8Var, new k73(0, gv9Var2)), av8Var, 1572870, 30);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            gv9Var2 = gv9Var;
            i4 = 2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new j73(gv9Var2, xtcVar, i2, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(Integer num, Integer num2, xtc xtcVar, of3 of3Var, int i2, int i3) {
        int i4;
        xtc xtcVar2;
        xtc xtcVar3;
        eqf u;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-313132810);
        if ((i2 & 6) == 0) {
            i4 = (av8Var.g(num) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var.g(num2) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            if (av8Var.T(i4 & 1, (i4 & 147) == 146)) {
                av8Var.W();
                xtcVar3 = xtcVar2;
            } else {
                utc utcVar = utc.a;
                xtc xtcVar4 = i5 != 0 ? utcVar : xtcVar2;
                Context context = (Context) av8Var.k(nz.b);
                xtc q = n9e.q(wnn.A(bkh.d(xtcVar4, 1.0f), o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f));
                u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
                int hashCode = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
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
                waa.K(av8Var, m2, ff3Var);
                Integer valueOf = Integer.valueOf(hashCode);
                f50 f50Var2 = hf3.j;
                waa.K(av8Var, valueOf, f50Var2);
                ry ryVar = hf3.k;
                waa.J(av8Var, ryVar);
                f50 f50Var3 = hf3.d;
                waa.K(av8Var, C, f50Var3);
                xtc f0 = l98.f0(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                l8g a3 = k8g.a(ww9.b, uxf.l, av8Var, 0);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C2 = fqj.C(av8Var, f0);
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
                String obj = (num == null ? "" : num).toString();
                String v = oea.v(R.string.profile_leaderboard_position, av8Var);
                if (1.0f <= 0.0d) {
                    p3a.a("invalid weight; must be greater than zero");
                }
                rd0.e(obj, v, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), av8Var, 0);
                String obj2 = (num2 != null ? num2 : "").toString();
                String v2 = oea.v(R.string.reputation_score, av8Var);
                if (1.0f <= 0.0d) {
                    p3a.a("invalid weight; must be greater than zero");
                }
                rd0.e(obj2, v2, new goa(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), av8Var, 0);
                av8Var.s(true);
                xtc xtcVar5 = xtcVar4;
                tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 13, lz.D(R.color.n_lv_4, av8Var), 0L, av8Var, null);
                String v3 = oea.v(R.string.view_top_contributors_button, av8Var);
                xtc d2 = bkh.d(utcVar, 1.0f);
                boolean i6 = av8Var.i(context);
                Object O = av8Var.O();
                if (i6 || O == nf3.a) {
                    O = new c6(context, 13);
                    av8Var.n0(O);
                }
                xtc y = tol.y(d2, false, false, false, 0L, null, (Function0) O, av8Var, 31);
                av8Var = av8Var;
                i9a.g(0, av8Var, l98.e0(y, 24.0f, 16.0f, 16.0f, 20.0f), Integer.valueOf(R.drawable.ic_top_contributor_badge), v3);
                av8Var.s(true);
                xtcVar3 = xtcVar5;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new r22(num, num2, xtcVar3, i2, i3, 1);
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

    public static final void d(int i2, of3 of3Var, xtc xtcVar) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1891182427);
        int i3 = i2 | 6;
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
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
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            av8Var.d0(2123429481);
            for (int i5 = 0; i5 < 3; i5++) {
                kq9.b(s6a.N(R.drawable.ic_chevron_down, 6, av8Var), null, haa.v(bkh.l(utcVar, 16.0f), 180.0f), lz.D(R.color.neutral_default, av8Var), av8Var, 432, 0);
            }
            av8Var.s(false);
            av8Var.s(true);
            xtcVar = utcVar;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l63(xtcVar, i2, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    public static final void e(long j2, boolean z, Function0 function0, Long l2, xtc xtcVar, boolean z2, of3 of3Var, int i2) {
        int i3;
        Long l3;
        a99 a99Var;
        Object obj;
        f50 f50Var;
        ?? r15;
        boolean z3;
        utc utcVar;
        boolean z4;
        boolean z5 = z2;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-27608648);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.f(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.g(l2) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var.g(xtcVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= av8Var.h(z5) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i4 = i3;
        if (av8Var.T(i4 & 1, (i4 & 74899) != 74898)) {
            boolean z6 = av8Var.k(dh3.n) == ema.b;
            long D = lz.D(R.color.surface_1, av8Var);
            long D2 = lz.D(R.color.surface_2, av8Var);
            boolean h2 = av8Var.h(z6) | av8Var.f(D) | av8Var.f(D2);
            Object O = av8Var.O();
            a99 a99Var2 = nf3.a;
            if (h2 || O == a99Var2) {
                a99Var = a99Var2;
                boolean z7 = z6;
                Pair pair = new Pair(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new r13(z6 ? D : D2));
                Float valueOf = Float.valueOf(1.0f);
                if (z7) {
                    D = D2;
                }
                obj = new Pair[]{pair, new Pair(valueOf, new r13(D))};
                av8Var.n0(obj);
            } else {
                obj = O;
                a99Var = a99Var2;
            }
            Pair[] pairArr = (Pair[]) obj;
            long f2 = z ? ljg.f(av8Var, -762088181, R.color.primary_default, av8Var, false) : ljg.f(av8Var, -762087391, R.color.n_lv_1, av8Var, false);
            xtc c0 = l98.c0(n9e.p(xtcVar, wxf.t((Pair[]) Arrays.copyOf(pairArr, pairArr.length), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), null, 6), 16.0f, 8.0f);
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var, 48);
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
            f50 f50Var2 = hf3.g;
            waa.K(av8Var, a2, f50Var2);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf2 = Integer.valueOf(hashCode);
            f50 f50Var3 = hf3.j;
            waa.K(av8Var, valueOf2, f50Var3);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var4 = hf3.d;
            waa.K(av8Var, C, f50Var4);
            lv1 lv1Var = uxf.m;
            long D3 = lz.D(R.color.n_lv_4, av8Var);
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O2;
            Object[] objArr = new Object[0];
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = b74.n;
                av8Var.n0(O3);
            }
            gm gmVar = new gm((boh) o3a.N(objArr, (Function0) O3, av8Var, 48), function0, 16);
            utc utcVar2 = utc.a;
            a99 a99Var3 = a99Var;
            xtc y = tol.y(utcVar2, z, true, true, D3, wzcVar, gmVar, av8Var, 0);
            l8g a3 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, y);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var2);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var3, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var4);
            String v = oea.v(R.string.fans_player_of_the_match_pick, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, f2, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            av8 av8Var2 = av8Var;
            if (z) {
                ljg.r(2.0f, -2134474568, av8Var2, av8Var2, utcVar2);
                f50Var = f50Var4;
                r15 = 1;
                kq9.b(s6a.N(R.drawable.ic_chevron_right_large_16, 6, av8Var2), null, bkh.l(utcVar2, 16.0f), f2, av8Var2, 432, 0);
                av8Var2 = av8Var2;
                z3 = false;
                av8Var2.s(false);
            } else {
                f50Var = f50Var4;
                r15 = 1;
                z3 = false;
                av8Var2.d0(-2134143984);
                av8Var2.s(false);
            }
            bf3.t(av8Var2, r15, utcVar2, 8.0f, av8Var2);
            xtc p = bkh.p(utcVar2, 52.0f);
            k1c c2 = e12.c(uxf.g, z3);
            int hashCode3 = Long.hashCode(av8Var2.T);
            aee m4 = av8Var2.m();
            xtc C3 = fqj.C(av8Var2, p);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c2, f50Var2);
            waa.K(av8Var2, m4, ff3Var);
            bf3.s(hashCode3, av8Var2, f50Var3, av8Var2, ryVar);
            waa.K(av8Var2, C3, f50Var);
            int i5 = z3;
            av8 av8Var3 = av8Var2;
            kq9.b(s6a.N(R.drawable.player_photo_placeholder, 6, av8Var2), null, bkh.l(utcVar2, 40.0f), r13.i, av8Var3, V2.b.f, 0);
            av8Var = av8Var3;
            c5n.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 28, lz.D(R.color.n_lv_3, av8Var), 0L, av8Var, n12.a.a(utcVar2, uxf.k));
            bf3.t(av8Var, r15, utcVar2, 8.0f, av8Var);
            l3 = l2;
            z5 = z2;
            wnn.g(l3, null, z5, av8Var, (i4 >> 9) & 910);
            nq8.h(av8Var, bkh.e(utcVar2, 10.0f));
            if (z) {
                av8Var.d0(-1236727736);
                oyn.d(null, null, j2, true, false, null, av8Var, ((i4 << 6) & 896) | 27702);
                av8Var.s(i5);
                utcVar = utcVar2;
                z4 = r15;
            } else {
                av8Var.d0(-1236434507);
                String v2 = oea.v(R.string.vote_now_button, av8Var);
                dfj a4 = xth.a();
                long D4 = lz.D(R.color.on_color_primary, av8Var);
                xtc q = n9e.q(wnn.A(utcVar2, o7g.a(4.0f)), lz.D(R.color.primary_default, av8Var), oyn.e);
                long D5 = lz.D(R.color.n_lv_4, av8Var);
                Object O4 = av8Var.O();
                if (O4 == a99Var3) {
                    O4 = mz1.e(av8Var);
                }
                wzc wzcVar2 = (wzc) O4;
                Object[] objArr2 = new Object[i5];
                Object O5 = av8Var.O();
                if (O5 == a99Var3) {
                    O5 = b74.o;
                    av8Var.n0(O5);
                }
                utcVar = utcVar2;
                xtc y2 = tol.y(q, true, true, true, D5, wzcVar2, new gm((boh) o3a.N(objArr2, (Function0) O5, av8Var, 48), function0, 17), av8Var, 0);
                av8Var = av8Var;
                z4 = r15;
                udj.c(v2, bkh.d(l98.d0(y2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, r15), 1.0f), D4, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, a4, av8Var, 0, 0, 130040);
                av8Var.s(i5);
            }
            w1l.s(utcVar, 12.0f, av8Var, z4);
        } else {
            l3 = l2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new oz5(j2, z, function0, l3, xtcVar, z5, i2);
        }
    }

    public static final void f(Integer num, int i2, String str, Integer num2, Integer num3, int i3, xtc xtcVar, of3 of3Var, int i4) {
        Integer num4;
        String str2 = str;
        Integer num5 = num3;
        str2.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-876476515);
        int i5 = i4 | (av8Var.g(num) ? 4 : 2) | (av8Var.e(i2) ? 32 : 16) | (av8Var.g(str2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(num2) ? a.o : 1024) | (av8Var.g(num5) ? 16384 : 8192) | (av8Var.e(i3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.g(xtcVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (av8Var.T(i5 & 1, (599187 & i5) != 599186)) {
            lv1 lv1Var = uxf.m;
            xtc d0 = l98.d0(pd0.q(i3, av8Var, wnn.A(bkh.d(xtcVar, 1.0f), o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 3))), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            wxf wxfVar = ww9.b;
            l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 48);
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
            kv1 kv1Var = uxf.p;
            ng0 ng0Var = new ng0(4.0f, true, new a70(6));
            p8g p8gVar = p8g.a;
            utc utcVar = utc.a;
            xtc b0 = l98.b0(p8gVar.a(1.0f, utcVar, true), 16.0f);
            u23 a3 = t23.a(ng0Var, kv1Var, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, b0);
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
            u23 a4 = t23.a(ww9.d, kv1Var, av8Var, 48);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, utcVar);
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
            String v = oea.v(R.string.fantasy_global_rank, av8Var);
            Locale locale = Locale.ROOT;
            String upperCase = v.toUpperCase(locale);
            upperCase.getClass();
            yf8 yf8Var = xth.a;
            udj.c(upperCase, null, lz.D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.c(), av8Var, 0, 24960, 109562);
            String i6 = num != null ? dla.i(num) : null;
            Regex regex = yid.a;
            if (i6 == null) {
                i6 = "-";
            }
            udj.c(i6, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.h(), av8Var, 0, 24576, 114682);
            av8Var = av8Var;
            av8Var.s(true);
            td4.o(i2, null, xth.c(), av8Var, (i5 >> 3) & 14, 2);
            av8Var.s(true);
            xtc a5 = p8gVar.a(1.0f, utcVar, true);
            l8g a6 = k8g.a(wxfVar, uxf.l, av8Var, 0);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m5 = av8Var.m();
            xtc C4 = fqj.C(av8Var, a5);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a6, f50Var);
            waa.K(av8Var, m5, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            str2 = str;
            String upperCase2 = str2.toUpperCase(locale);
            upperCase2.getClass();
            num4 = num2;
            k((i5 >> 6) & 112, av8Var, p8gVar.a(1.0f, utcVar, true), num4, upperCase2);
            String upperCase3 = oea.v(R.string.fantasy_total_points, av8Var).toUpperCase(locale);
            upperCase3.getClass();
            num5 = num3;
            k((i5 >> 9) & 112, av8Var, p8gVar.a(1.0f, utcVar, true), num5, upperCase3);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            num4 = num2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ei(num, i2, str2, num4, num5, i3, xtcVar, i4);
        }
    }

    public static final void g(f57 f57Var, boolean z, Function2 function2, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        function2.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1043490151);
        int i3 = i2 | (av8Var.g(f57Var) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.i(function2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function1) ? 2048 : 1024) | 24576;
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            lv1 lv1Var = uxf.m;
            utc utcVar = utc.a;
            xtc q = n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_1, av8Var), oyn.e);
            int i5 = i3 & 14;
            boolean z2 = ((i3 & 7168) == 2048) | (i5 == 4);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z2 || O == a99Var) {
                O = new n37(i4, (Object) f57Var, function1);
                av8Var.n0(O);
            }
            xtc f0 = l98.f0(l98.d0(tol.y(q, false, false, false, 0L, null, (Function0) O, av8Var, 31), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
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
            td4.L(48, av8Var, bkh.l(utcVar, 40.0f), f57Var.d);
            goa d2 = bf3.d(utcVar, 16.0f, av8Var, 1.0f, true);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
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
            String str = f57Var.b;
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110586);
            nq8.h(av8Var, bkh.e(utcVar, 4.0f));
            udj.c(f57Var.c, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
            if (z) {
                ljg.r(12.0f, -1382874121, av8Var, av8Var, utcVar);
                d7e t = haa.t(R.drawable.ic_close, 0, av8Var);
                long D = lz.D(R.color.error, av8Var);
                xtc A = wnn.A(utcVar, o7g.a);
                boolean z3 = (i5 == 4) | ((i3 & 896) == 256);
                Object O2 = av8Var.O();
                if (z3 || O2 == a99Var) {
                    O2 = new n37(2, function2, f57Var);
                    av8Var.n0(O2);
                }
                kq9.a(t, null, bkh.l(l98.b0(tol.y(A, false, false, false, 0L, null, (Function0) O2, av8Var, 31), 4.0f), 24.0f), D, av8Var, 56, 0);
                av8Var.s(false);
            } else {
                av8Var.d0(-1382430139);
                av8Var.s(false);
            }
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f70(f57Var, z, function2, function1, xtcVar2, i2, 4);
        }
    }

    public static final void h(q1e q1eVar, Function1 function1, Function0 function0, of3 of3Var, int i2) {
        Object obj;
        boolean z;
        r9k m9kVar;
        q1e q1eVar2 = q1eVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1688040393);
        int i3 = i2 | (av8Var.g(q1eVar2) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            utc utcVar = utc.a;
            xtc q = n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_1, av8Var), oyn.e);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            xtc b0 = l98.b0(bkh.d(utcVar, 1.0f), 8.0f);
            l8g a3 = k8g.a(ww9.h, uxf.l, av8Var, 6);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, b0);
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
            av8Var.d0(-1185091040);
            q1eVar2 = q1eVar;
            gv9<p1e> gv9Var = q1eVar2.a;
            ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
            for (p1e p1eVar : gv9Var) {
                if (p1eVar.equals(n1e.a)) {
                    m9kVar = new q9k(R.string.all_time_filter);
                } else {
                    if (!(p1eVar instanceof o1e)) {
                        zzl.b();
                        return;
                    }
                    m9kVar = new m9k(((o1e) p1eVar).a);
                }
                arrayList.add(new oxh(p1eVar, m9kVar.a(av8Var), null, null, null, false, 252));
            }
            av8Var.s(false);
            gv9 W = l6g.W(arrayList);
            Iterator<E> it = W.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.c(((oxh) obj).a, q1eVar2.b)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            oxh oxhVar = (oxh) obj;
            boolean z2 = (i3 & 112) == 32;
            Object O = av8Var.O();
            if (z2 || O == nf3.a) {
                z = true;
                O = new k1e(1 == true ? 1 : 0, function1);
                av8Var.n0(O);
            } else {
                z = true;
            }
            boolean z3 = z;
            r4a.j(W, oxhVar, (Function1) O, null, null, false, new t3e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 12582912, 888);
            av8Var = av8Var;
            tgj.i(function0, null, q1eVar2.c.a(), false, lz.D(R.color.surface_2, av8Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, ((i3 >> 6) & 14) | 196608, 10);
            av8Var.s(z3);
            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 15, 0L, 0L, av8Var, null);
            av8Var.s(z3);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wbc(i2, 9, q1eVar2, function0, function1);
        }
    }

    public static final void i(m1e m1eVar, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1101118707);
        int i3 = (av8Var.g(m1eVar) ? 4 : 2) | i2 | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            xtc d2 = bkh.d(xtcVar, 1.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            int i4 = i3 & 14;
            n(m1eVar, av8Var, i4);
            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 15, 0L, 0L, av8Var, null);
            q(m1eVar, av8Var, i4);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new op9(m1eVar, xtcVar, i2, 23);
        }
    }

    public static final void j(gv9 gv9Var, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-417341532);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(gv9Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        int i5 = 0;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            xtcVar2 = utc.a;
            xtc f0 = l98.f0(bkh.d(xtcVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
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
            Iterator p = ljg.p(av8Var, C, hf3.d, -1720902586, gv9Var);
            int i6 = 0;
            while (p.hasNext()) {
                Object next = p.next();
                int i7 = i6 + 1;
                if (i6 < 0) {
                    b.q();
                    throw null;
                }
                rd0.l((v0i) next, l98.d0(new goa(1.0f, true), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var, 0);
                if (i6 == 0) {
                    av8Var.d0(-1078786052);
                    d(0, av8Var, null);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1078737041);
                    av8Var.s(false);
                }
                i6 = i7;
            }
            av8Var.s(false);
            av8Var.s(true);
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new j73(gv9Var, xtcVar2, i2, i5);
        }
    }

    public static final void k(int i2, of3 of3Var, xtc xtcVar, Integer num, String str) {
        int i3;
        String str2;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1783165062);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.g(num) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            kv1 kv1Var = uxf.p;
            ng0 ng0Var = new ng0(2.0f, true, new a70(6));
            xtc d0 = l98.d0(xtcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            u23 a2 = t23.a(ng0Var, kv1Var, av8Var2, 54);
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
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m2, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.on_color_secondary, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.c(), av8Var2, i3 & 14, 24960, 109562);
            String i4 = num != null ? dla.i(num) : null;
            Regex regex = yid.a;
            if (i4 == null) {
                i4 = "-";
            }
            str2 = str;
            udj.c(i4, null, lz.D(R.color.on_color_primary, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 1, 0, null, xth.j(), av8Var2, 0, 24576, 113658);
            av8Var = av8Var2;
            av8Var.s(true);
        } else {
            str2 = str;
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cs6(num, str2, xtcVar, i2);
        }
    }

    public static final void l(q1e q1eVar, osa osaVar, Function1 function1, of3 of3Var, int i2) {
        int i3;
        osaVar.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1347814950);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? av8Var.g(q1eVar) : av8Var.i(q1eVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? av8Var.g(osaVar) : av8Var.i(osaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(function1) ? 256 : 128;
        }
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            ksa a2 = msa.a(0, 0, av8Var, 0, 3);
            p1e p1eVar = q1eVar.b;
            e1e e1eVar = q1eVar.c;
            boolean g2 = av8Var.g(a2);
            Object O = av8Var.O();
            Object obj = nf3.a;
            rq3 rq3Var = null;
            if (g2 || O == obj) {
                O = new ck1(14, rq3Var, a2);
                av8Var.n0(O);
            }
            hz8.q(p1eVar, e1eVar, (Function2) O, av8Var);
            xtc J = lz.J(bkh.c, jaa.L(av8Var), null);
            int i4 = 7;
            t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 72.0f, 7);
            boolean z = ((i3 & 14) == 4 || ((i3 & 8) != 0 && av8Var.i(q1eVar))) | ((i3 & 896) == 256) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && av8Var.i(osaVar)));
            Object O2 = av8Var.O();
            if (z || O2 == obj) {
                O2 = new vsc(i4, q1eVar, osaVar, function1);
                av8Var.n0(O2);
            }
            v8a.a(J, a2, C, null, null, null, false, null, (Function1) O2, av8Var, 100663680, 248);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zt7(q1eVar, osaVar, function1, i2, 24);
        }
    }

    public static final void m(lm1 lm1Var, xtc xtcVar, of3 of3Var, int i2) {
        zg3 zg3Var;
        lm1 lm1Var2 = lm1Var;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1460746380);
        int i3 = i2 | (av8Var.g(lm1Var2) ? 4 : 2) | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            lv1 lv1Var = uxf.m;
            wxf wxfVar = ww9.b;
            l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
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
            k1c c2 = e12.c(uxf.k, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            utc utcVar = utc.a;
            xtc C2 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            int i4 = lm1Var2.a;
            mm1 mm1Var = lm1Var2.b;
            td4.C(i4, bkh.l(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), 32.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 48, 12);
            String v = oea.v(mm1Var.a, av8Var);
            yf8 yf8Var = xth.a;
            q5a.w(v, bkh.s(n9e.q(bkh.o(utcVar, 20.0f, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), lz.D(mm1Var.b, av8Var), o7g.a(12.0f)), 2), lz.D(R.color.surface_1, av8Var), null, 0L, 0L, new p7j(3), 0L, 0, false, 0, 0, xth.c(), av8Var, 0, 0, 130040);
            i.o(av8Var, true, utcVar, 4.0f, av8Var);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                zg3Var = zg3Var2;
                av8Var.l(zg3Var);
            } else {
                zg3Var = zg3Var2;
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            zg3 zg3Var3 = zg3Var;
            udj.c(lm1Var.c, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.n(), av8Var, 0, 24960, 110586);
            nq8.h(av8Var, bkh.e(utcVar, 2.0f));
            xtc f0 = l98.f0(utcVar, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            l8g a4 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m5 = av8Var.m();
            xtc C4 = fqj.C(av8Var, f0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var3);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m5, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            lm1Var2 = lm1Var;
            String str = lm1Var2.d;
            mqi mqiVar = xth.l;
            udj.c(str, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, (dfj) mqiVar.getValue(), av8Var, 0, 0, 131066);
            tz9.r(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 14, 0L, 0L, av8Var, l98.d0(bkh.e(utcVar, 16.0f), 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2));
            udj.c(lm1Var2.e, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, (dfj) mqiVar.getValue(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            ljg.t(av8Var, true, true, true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vn6(lm1Var2, xtcVar, i2, 15);
        }
    }

    public static final void n(m1e m1eVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1792553615);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(m1eVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = 0;
        if (av8Var2.T(i3 & 1, (i3 & 3) != 2)) {
            Context context = (Context) av8Var2.k(nz.b);
            long D = lz.D(R.color.n_lv_4, av8Var2);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var2);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = jxa.u;
                av8Var2.n0(O2);
            }
            l1e l1eVar = new l1e((boh) o3a.N(objArr, (Function0) O2, av8Var2, 48), context, m1eVar, i4);
            utc utcVar = utc.a;
            xtc c0 = l98.c0(bkh.d(tol.y(utcVar, true, true, true, D, wzcVar, l1eVar, av8Var2, 0), 1.0f), 16.0f, 8.0f);
            l8g a2 = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.m, av8Var2, 54);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m2, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            td4.C(m1eVar.a, bkh.l(utcVar, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 48, 12);
            kda.e(m1eVar.c, 0, av8Var2, new goa(1.0f, true), m1eVar.b, m1eVar.d);
            i9a.i(Double.valueOf(m1eVar.i), false, null, null, null, null, false, av8Var2, 432, PglCryptUtils.BASE64_FAILED);
            av8Var = av8Var2;
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new j1e(m1eVar, i2, i4);
        }
    }

    public static final void o(gv9 gv9Var, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1250275050);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(gv9Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        int i5 = 1;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            int size = gv9Var.size();
            float f2 = size == 4 ? 12.0f : 16.0f;
            float f3 = size == 4 ? 4.0f : 8.0f;
            xtcVar2 = utc.a;
            xtc f0 = l98.f0(bkh.d(xtcVar2, 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 16.0f, 2);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
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
            d(0, av8Var, null);
            av8Var.d0(-1640621100);
            Iterator<E> it = gv9Var.iterator();
            while (it.hasNext()) {
                rd0.l((v0i) it.next(), l98.d0(new goa(1.0f, true), f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var, 0);
            }
            av8Var.s(false);
            av8Var.s(true);
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new j73(gv9Var, xtcVar2, i2, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void p(final boolean z, final String str, final String str2, xtc xtcVar, float f2, boolean z2, of3 of3Var, final int i2, final int i3) {
        int i4;
        xtc xtcVar2;
        int i5;
        float f3;
        int i6;
        boolean z3;
        av8 av8Var;
        final xtc xtcVar3;
        final float f4;
        final boolean z4;
        eqf u;
        long f5;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-108105318);
        if ((i2 & 6) == 0) {
            i4 = (av8Var2.h(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var2.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var2.g(str2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var2.g(xtcVar2) ? a.o : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                f3 = f2;
                i4 |= av8Var2.d(f3) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((196608 & i2) == 0) {
                    z3 = z2;
                    i4 |= av8Var2.h(z3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    if (av8Var2.T(i4 & 1, (74899 & i4) == 74898)) {
                        av8Var = av8Var2;
                        av8Var.W();
                        xtcVar3 = xtcVar2;
                        f4 = f3;
                        z4 = z3;
                    } else {
                        xtcVar3 = i7 != 0 ? utc.a : xtcVar2;
                        f4 = i5 != 0 ? 20.0f : f3;
                        z4 = i6 != 0 ? true : z3;
                        if (z4 && z) {
                            f5 = ljg.f(av8Var2, 660209351, R.color.live, av8Var2, false);
                        } else {
                            if (yid.m(StringsKt.toIntOrNull(str)) <= yid.m(str2 != null ? StringsKt.toIntOrNull(str2) : null)) {
                                if (yid.m(StringsKt.toIntOrNull(str)) != yid.m(str2 != null ? StringsKt.toIntOrNull(str2) : null) || yid.m(StringsKt.toIntOrNull(str)) <= 0) {
                                    f5 = ljg.f(av8Var2, 660500007, R.color.n_lv_3, av8Var2, false);
                                }
                            }
                            f5 = ljg.f(av8Var2, 660461319, R.color.n_lv_1, av8Var2, false);
                        }
                        long j2 = f5;
                        yf8 yf8Var = xth.a;
                        av8Var = av8Var2;
                        q5a.w(str, bkh.p(xtcVar3, f4), j2, null, 0L, 0L, new p7j(3), 0L, 0, false, 0, 0, xth.m(), av8Var, (i4 >> 3) & 14, 0, 130040);
                    }
                    u = av8Var.u();
                    if (u == null) {
                        u.d = new Function2() { // from class: qm1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                xw3.p(z, str, str2, xtcVar3, f4, z4, (of3) obj, aba.K(i2 | 1), i3);
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                z3 = z2;
                if (av8Var2.T(i4 & 1, (74899 & i4) == 74898)) {
                }
                u = av8Var.u();
                if (u == null) {
                }
            }
            f3 = f2;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            z3 = z2;
            if (av8Var2.T(i4 & 1, (74899 & i4) == 74898)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        xtcVar2 = xtcVar;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        f3 = f2;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        z3 = z2;
        if (av8Var2.T(i4 & 1, (74899 & i4) == 74898)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void q(m1e m1eVar, of3 of3Var, int i2) {
        int i3;
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-988232762);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(m1eVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        int i5 = 1;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            Context context = (Context) av8Var.k(nz.b);
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
                O2 = jxa.v;
                av8Var.n0(O2);
            }
            l1e l1eVar = new l1e((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), context, m1eVar, i5);
            utc utcVar = utc.a;
            xtc c0 = l98.c0(bkh.d(tol.y(utcVar, true, true, true, D, wzcVar, l1eVar, av8Var, 0), 1.0f), 16.0f, 8.0f);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
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
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            td4.y(m1eVar.e, 48, 12, av8Var, bkh.l(utcVar, 16.0f), null, false);
            goa d2 = bf3.d(utcVar, 4.0f, av8Var, 1.0f, true);
            String str = m1eVar.f;
            yf8 yf8Var = xth.a;
            udj.c(str, d2, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var, 0, 24960, 110584);
            av8Var = av8Var;
            if (m1eVar.h == null) {
                av8Var.d0(-1884982488);
                av8Var.s(false);
            } else {
                ljg.r(8.0f, -1884982487, av8Var, av8Var, utcVar);
                udj.c(m1eVar.h, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var, 0, 0, 131066);
                av8Var = av8Var;
                av8Var.s(false);
            }
            i4 = 1;
            av8Var.s(true);
        } else {
            i4 = 1;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new j1e(m1eVar, i2, i4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0288, code lost:
    
        if (r7.d == r6) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0110, code lost:
    
        if (r4.d == r12) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void r(xm3 xm3Var, h8b h8bVar, ArrayList arrayList, int i2) {
        int i3;
        ym2[] ym2VarArr;
        int i4;
        int i5;
        nl3[] nl3VarArr;
        boolean z;
        wm3 wm3Var;
        float f2;
        boolean z2;
        boolean z3;
        int i6;
        wm3 wm3Var2;
        h8b h8bVar2;
        wm3 wm3Var3;
        rvh rvhVar;
        nl3 nl3Var;
        rvh rvhVar2;
        wm3 wm3Var4;
        int i7;
        nl3[] nl3VarArr2;
        nl3 nl3Var2;
        rvh rvhVar3;
        wm3 wm3Var5;
        wm3 wm3Var6;
        int i8;
        nl3 nl3Var3;
        nl3[] nl3VarArr3;
        int i9;
        nl3 nl3Var4;
        rvh rvhVar4;
        rvh rvhVar5;
        int size;
        ArrayList arrayList2;
        int i10;
        wm3 wm3Var7;
        int i11;
        float f3;
        int i12;
        float f4;
        wm3 wm3Var8;
        int i13;
        int i14;
        int i15;
        wm3 wm3Var9;
        nl3 nl3Var5;
        wm3 wm3Var10;
        xm3 xm3Var2 = xm3Var;
        h8b h8bVar3 = h8bVar;
        ArrayList arrayList3 = arrayList;
        if (i2 == 0) {
            i3 = xm3Var2.A0;
            ym2VarArr = xm3Var2.D0;
            i4 = 0;
        } else {
            i3 = xm3Var2.B0;
            ym2VarArr = xm3Var2.C0;
            i4 = 2;
        }
        int i16 = i3;
        ym2[] ym2VarArr2 = ym2VarArr;
        int i17 = 0;
        while (i17 < i16) {
            ym2 ym2Var = ym2VarArr2[i17];
            boolean z4 = ym2Var.q;
            wm3 wm3Var11 = ym2Var.a;
            nl3[] nl3VarArr4 = wm3Var11.R;
            int i18 = 3;
            int i19 = 8;
            float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (z4) {
                i5 = i17;
            } else {
                int i20 = ym2Var.l;
                int i21 = i20 * 2;
                wm3 wm3Var12 = wm3Var11;
                wm3 wm3Var13 = wm3Var12;
                boolean z5 = false;
                while (!z5) {
                    ym2Var.i++;
                    wm3[] wm3VarArr = wm3Var12.n0;
                    nl3[] nl3VarArr5 = wm3Var12.R;
                    wm3VarArr[i20] = null;
                    wm3Var12.m0[i20] = null;
                    if (wm3Var12.h0 != i19) {
                        wm3Var12.k(i20);
                        nl3VarArr5[i21].e();
                        int i22 = i21 + 1;
                        nl3VarArr5[i22].e();
                        nl3VarArr5[i21].e();
                        nl3VarArr5[i22].e();
                        if (ym2Var.b == null) {
                            ym2Var.b = wm3Var12;
                        }
                        ym2Var.d = wm3Var12;
                        int i23 = wm3Var12.q0[i20];
                        if (i23 == i18) {
                            int i24 = wm3Var12.u[i20];
                            if (i24 == 0 || i24 == i18 || i24 == 2) {
                                ym2Var.j++;
                                float f6 = wm3Var12.l0[i20];
                                if (f6 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    i14 = i17;
                                    ym2Var.k += f6;
                                } else {
                                    i14 = i17;
                                }
                                i15 = i20;
                                if (wm3Var12.h0 != 8 && i23 == 3 && (i24 == 0 || i24 == 3)) {
                                    if (f6 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                        ym2Var.n = true;
                                    } else {
                                        ym2Var.o = true;
                                    }
                                    ArrayList arrayList4 = ym2Var.h;
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                        ym2Var.h = arrayList4;
                                    }
                                    arrayList4.add(wm3Var12);
                                }
                                if (ym2Var.f == null) {
                                    ym2Var.f = wm3Var12;
                                }
                                wm3 wm3Var14 = ym2Var.g;
                                if (wm3Var14 != null) {
                                    wm3Var14.m0[i15] = wm3Var12;
                                }
                                ym2Var.g = wm3Var12;
                            } else {
                                i14 = i17;
                                i15 = i20;
                            }
                            if (i15 == 0) {
                                if (wm3Var12.s == 0 && wm3Var12.v == 0) {
                                    int i25 = wm3Var12.w;
                                }
                            } else if (wm3Var12.t == 0 && wm3Var12.y == 0) {
                                int i26 = wm3Var12.z;
                            }
                            wm3Var9 = wm3Var13;
                            if (wm3Var9 != wm3Var12) {
                                wm3Var9.n0[i15] = wm3Var12;
                            }
                            nl3Var5 = nl3VarArr5[i21 + 1].f;
                            if (nl3Var5 != null) {
                                wm3Var10 = nl3Var5.d;
                                nl3 nl3Var6 = wm3Var10.R[i21].f;
                                if (nl3Var6 != null) {
                                }
                            }
                            wm3Var10 = null;
                            if (wm3Var10 != null) {
                                wm3Var10 = wm3Var12;
                                z5 = true;
                            }
                            wm3Var13 = wm3Var12;
                            i20 = i15;
                            i18 = 3;
                            i19 = 8;
                            wm3Var12 = wm3Var10;
                            i17 = i14;
                        }
                    }
                    i14 = i17;
                    i15 = i20;
                    wm3Var9 = wm3Var13;
                    if (wm3Var9 != wm3Var12) {
                    }
                    nl3Var5 = nl3VarArr5[i21 + 1].f;
                    if (nl3Var5 != null) {
                    }
                    wm3Var10 = null;
                    if (wm3Var10 != null) {
                    }
                    wm3Var13 = wm3Var12;
                    i20 = i15;
                    i18 = 3;
                    i19 = 8;
                    wm3Var12 = wm3Var10;
                    i17 = i14;
                }
                i5 = i17;
                int i27 = i20;
                wm3 wm3Var15 = ym2Var.b;
                if (wm3Var15 != null) {
                    wm3Var15.R[i21].e();
                }
                wm3 wm3Var16 = ym2Var.d;
                if (wm3Var16 != null) {
                    wm3Var16.R[i21 + 1].e();
                }
                ym2Var.c = wm3Var12;
                if (i27 == 0 && ym2Var.m) {
                    ym2Var.e = wm3Var12;
                } else {
                    ym2Var.e = wm3Var11;
                }
                ym2Var.p = ym2Var.o && ym2Var.n;
            }
            ym2Var.q = true;
            if (arrayList3 == null || arrayList3.contains(wm3Var11)) {
                wm3 wm3Var17 = ym2Var.c;
                wm3 wm3Var18 = ym2Var.b;
                wm3 wm3Var19 = ym2Var.d;
                wm3 wm3Var20 = ym2Var.e;
                float f7 = ym2Var.k;
                int[] iArr = xm3Var2.q0;
                nl3[] nl3VarArr6 = xm3Var2.R;
                boolean z6 = iArr[i2] == 2;
                if (i2 == 0) {
                    int i28 = wm3Var20.j0;
                    boolean z7 = i28 == 0;
                    nl3VarArr = nl3VarArr4;
                    boolean z8 = i28 == 1;
                    z = i28 == 2;
                    wm3Var = wm3Var11;
                    f2 = f7;
                    z3 = z8;
                    z2 = z7;
                } else {
                    nl3VarArr = nl3VarArr4;
                    int i29 = wm3Var20.k0;
                    boolean z9 = i29 == 0;
                    boolean z10 = i29 == 1;
                    z = i29 == 2;
                    wm3Var = wm3Var11;
                    f2 = f7;
                    z2 = z9;
                    z3 = z10;
                }
                boolean z11 = false;
                while (!z11) {
                    nl3[] nl3VarArr7 = wm3Var.R;
                    int[] iArr2 = wm3Var.q0;
                    nl3 nl3Var7 = nl3VarArr7[i4];
                    int i30 = z ? 1 : 4;
                    int e2 = nl3Var7.e();
                    boolean z12 = z6;
                    boolean z13 = z;
                    boolean z14 = iArr2[i2] == 3 && wm3Var.u[i2] == 0;
                    nl3 nl3Var8 = nl3Var7.f;
                    if (nl3Var8 != null && wm3Var != wm3Var11) {
                        e2 = nl3Var8.e() + e2;
                    }
                    int i31 = e2;
                    if (z13 && wm3Var != wm3Var11 && wm3Var != wm3Var18) {
                        i30 = 8;
                    }
                    wm3 wm3Var21 = wm3Var11;
                    nl3 nl3Var9 = nl3Var7.f;
                    if (nl3Var9 != null) {
                        boolean z15 = z14;
                        rvh rvhVar6 = nl3Var7.i;
                        rvh rvhVar7 = nl3Var9.i;
                        if (wm3Var == wm3Var18) {
                            h8bVar3.f(rvhVar6, rvhVar7, i31, 6);
                        } else {
                            h8bVar3.f(rvhVar6, rvhVar7, i31, 8);
                        }
                        if (z15 && !z13) {
                            i30 = 5;
                        }
                        h8bVar3.e(nl3Var7.i, nl3Var7.f.i, i31, (wm3Var == wm3Var18 && z13 && wm3Var.T[i2]) ? 5 : i30);
                    }
                    if (z12) {
                        if (wm3Var.h0 == 8 || iArr2[i2] != 3) {
                            i13 = 0;
                        } else {
                            i13 = 0;
                            h8bVar3.f(nl3VarArr7[i4 + 1].i, nl3VarArr7[i4].i, 0, 5);
                        }
                        h8bVar3.f(nl3VarArr7[i4].i, nl3VarArr6[i4].i, i13, 8);
                    }
                    nl3 nl3Var10 = nl3VarArr7[i4 + 1].f;
                    if (nl3Var10 != null) {
                        wm3Var8 = nl3Var10.d;
                        nl3 nl3Var11 = wm3Var8.R[i4].f;
                        if (nl3Var11 != null) {
                        }
                    }
                    wm3Var8 = null;
                    if (wm3Var8 != null) {
                        wm3Var = wm3Var8;
                    } else {
                        z11 = true;
                    }
                    wm3Var11 = wm3Var21;
                    z6 = z12;
                    z = z13;
                }
                boolean z16 = z6;
                boolean z17 = z;
                if (wm3Var19 != null) {
                    int i32 = i4 + 1;
                    if (wm3Var17.R[i32].f != null) {
                        nl3 nl3Var12 = wm3Var19.R[i32];
                        if (wm3Var19.q0[i2] == 3 && wm3Var19.u[i2] == 0 && !z17) {
                            nl3 nl3Var13 = nl3Var12.f;
                            if (nl3Var13.d == xm3Var2) {
                                h8bVar3.e(nl3Var12.i, nl3Var13.i, -nl3Var12.e(), 5);
                                h8bVar3.g(nl3Var12.i, wm3Var17.R[i32].f.i, -nl3Var12.e(), 6);
                            }
                        }
                        if (z17) {
                            nl3 nl3Var14 = nl3Var12.f;
                            if (nl3Var14.d == xm3Var2) {
                                h8bVar3.e(nl3Var12.i, nl3Var14.i, -nl3Var12.e(), 4);
                            }
                        }
                        h8bVar3.g(nl3Var12.i, wm3Var17.R[i32].f.i, -nl3Var12.e(), 6);
                    }
                }
                if (z16) {
                    int i33 = i4 + 1;
                    rvh rvhVar8 = nl3VarArr6[i33].i;
                    nl3 nl3Var15 = wm3Var17.R[i33];
                    h8bVar3.f(rvhVar8, nl3Var15.i, nl3Var15.e(), 8);
                }
                ArrayList arrayList5 = ym2Var.h;
                if (arrayList5 != null && (size = arrayList5.size()) > 1) {
                    if (ym2Var.n && !ym2Var.p) {
                        f2 = ym2Var.j;
                    }
                    wm3 wm3Var22 = null;
                    float f8 = 0.0f;
                    int i34 = 0;
                    while (i34 < size) {
                        wm3 wm3Var23 = (wm3) arrayList5.get(i34);
                        float[] fArr = wm3Var23.l0;
                        nl3[] nl3VarArr8 = wm3Var23.R;
                        float f9 = fArr[i2];
                        if (f9 < f5) {
                            if (ym2Var.p) {
                                arrayList2 = arrayList5;
                                i10 = size;
                                h8bVar3.e(nl3VarArr8[i4 + 1].i, nl3VarArr8[i4].i, 0, 4);
                                f4 = f8;
                                i11 = i16;
                                f3 = f5;
                                f8 = f4;
                                i12 = i34;
                                i34 = i12 + 1;
                                i16 = i11;
                                arrayList5 = arrayList2;
                                size = i10;
                                f5 = f3;
                            } else {
                                f9 = 1.0f;
                            }
                        }
                        arrayList2 = arrayList5;
                        i10 = size;
                        if (f9 == f5) {
                            f4 = f8;
                            h8bVar3.e(nl3VarArr8[i4 + 1].i, nl3VarArr8[i4].i, 0, 8);
                            i11 = i16;
                            f3 = f5;
                            f8 = f4;
                            i12 = i34;
                            i34 = i12 + 1;
                            i16 = i11;
                            arrayList5 = arrayList2;
                            size = i10;
                            f5 = f3;
                        } else {
                            float f10 = f8;
                            if (wm3Var22 != null) {
                                nl3[] nl3VarArr9 = wm3Var22.R;
                                rvh rvhVar9 = nl3VarArr9[i4].i;
                                int i35 = i4 + 1;
                                rvh rvhVar10 = nl3VarArr9[i35].i;
                                rvh rvhVar11 = nl3VarArr8[i4].i;
                                rvh rvhVar12 = nl3VarArr8[i35].i;
                                fh0 l2 = h8bVar3.l();
                                wm3Var7 = wm3Var23;
                                float f11 = f5;
                                l2.b = f11;
                                f3 = f11;
                                if (f2 == f11 || f10 == f9) {
                                    i12 = i34;
                                    i11 = i16;
                                    l2.d.g(rvhVar9, 1.0f);
                                    l2.d.g(rvhVar10, -1.0f);
                                    l2.d.g(rvhVar12, 1.0f);
                                    l2.d.g(rvhVar11, -1.0f);
                                } else {
                                    wg0 wg0Var = l2.d;
                                    if (f10 == f3) {
                                        i12 = i34;
                                        wg0Var.g(rvhVar9, 1.0f);
                                        l2.d.g(rvhVar10, -1.0f);
                                        i11 = i16;
                                    } else {
                                        i12 = i34;
                                        i11 = i16;
                                        if (f9 == f5) {
                                            wg0Var.g(rvhVar11, 1.0f);
                                            l2.d.g(rvhVar12, -1.0f);
                                        } else {
                                            float f12 = (f10 / f2) / (f9 / f2);
                                            wg0Var.g(rvhVar9, 1.0f);
                                            l2.d.g(rvhVar10, -1.0f);
                                            l2.d.g(rvhVar12, f12);
                                            l2.d.g(rvhVar11, -f12);
                                        }
                                    }
                                }
                                h8bVar3.c(l2);
                            } else {
                                wm3Var7 = wm3Var23;
                                i11 = i16;
                                f3 = f5;
                                i12 = i34;
                            }
                            f8 = f9;
                            wm3Var22 = wm3Var7;
                            i34 = i12 + 1;
                            i16 = i11;
                            arrayList5 = arrayList2;
                            size = i10;
                            f5 = f3;
                        }
                    }
                }
                i6 = i16;
                if (wm3Var18 == null || !(wm3Var18 == wm3Var19 || z17)) {
                    wm3Var2 = wm3Var19;
                    if (z2 && wm3Var18 != null) {
                        int i36 = ym2Var.j;
                        boolean z18 = i36 > 0 && ym2Var.i == i36;
                        wm3 wm3Var24 = wm3Var18;
                        wm3 wm3Var25 = wm3Var24;
                        while (true) {
                            nl3[] nl3VarArr10 = wm3Var25.R;
                            if (wm3Var24 == null) {
                                break;
                            }
                            nl3[] nl3VarArr11 = wm3Var24.R;
                            wm3 wm3Var26 = wm3Var24.n0[i2];
                            while (true) {
                                if (wm3Var26 == null) {
                                    i7 = 8;
                                    break;
                                }
                                i7 = 8;
                                if (wm3Var26.h0 != 8) {
                                    break;
                                } else {
                                    wm3Var26 = wm3Var26.n0[i2];
                                }
                            }
                            if (wm3Var26 != null || wm3Var24 == wm3Var2) {
                                nl3 nl3Var16 = nl3VarArr11[i4];
                                rvh rvhVar13 = nl3Var16.i;
                                nl3 nl3Var17 = nl3Var16.f;
                                rvh rvhVar14 = nl3Var17 != null ? nl3Var17.i : null;
                                if (wm3Var25 != wm3Var24) {
                                    rvhVar14 = nl3VarArr10[i4 + 1].i;
                                } else if (wm3Var24 == wm3Var18) {
                                    nl3 nl3Var18 = nl3VarArr[i4].f;
                                    rvhVar14 = nl3Var18 != null ? nl3Var18.i : null;
                                }
                                int e3 = nl3Var16.e();
                                int i37 = i4 + 1;
                                int e4 = nl3VarArr11[i37].e();
                                if (wm3Var26 != null) {
                                    nl3Var2 = wm3Var26.R[i4];
                                    nl3VarArr2 = nl3VarArr10;
                                    rvhVar3 = nl3Var2.i;
                                } else {
                                    nl3VarArr2 = nl3VarArr10;
                                    nl3Var2 = wm3Var17.R[i37].f;
                                    rvhVar3 = nl3Var2 != null ? nl3Var2.i : null;
                                }
                                rvh rvhVar15 = nl3VarArr11[i37].i;
                                if (nl3Var2 != null) {
                                    e4 += nl3Var2.e();
                                }
                                int e5 = nl3VarArr2[i37].e() + e3;
                                if (rvhVar13 == null || rvhVar14 == null || rvhVar3 == null || rvhVar15 == null) {
                                    wm3Var5 = wm3Var26;
                                    wm3Var6 = wm3Var25;
                                    i8 = 8;
                                } else {
                                    if (wm3Var24 == wm3Var18) {
                                        e5 = wm3Var18.R[i4].e();
                                    }
                                    int i38 = e5;
                                    if (wm3Var24 == wm3Var2) {
                                        e4 = wm3Var2.R[i37].e();
                                    }
                                    wm3Var5 = wm3Var26;
                                    wm3Var6 = wm3Var25;
                                    i8 = 8;
                                    h8bVar.b(rvhVar13, rvhVar14, i38, 0.5f, rvhVar3, rvhVar15, e4, z18 ? 8 : 5);
                                }
                            } else {
                                wm3Var5 = wm3Var26;
                                wm3Var6 = wm3Var25;
                                i8 = i7;
                            }
                            if (wm3Var24.h0 != i8) {
                                wm3Var6 = wm3Var24;
                            }
                            wm3Var24 = wm3Var5;
                            wm3Var25 = wm3Var6;
                        }
                    } else {
                        int i39 = 8;
                        if (z3 && wm3Var18 != null) {
                            int i40 = ym2Var.j;
                            boolean z19 = i40 > 0 && ym2Var.i == i40;
                            wm3 wm3Var27 = wm3Var18;
                            wm3 wm3Var28 = wm3Var27;
                            while (true) {
                                nl3[] nl3VarArr12 = wm3Var27.R;
                                if (wm3Var28 == null) {
                                    break;
                                }
                                nl3[] nl3VarArr13 = wm3Var28.R;
                                wm3 wm3Var29 = wm3Var28.n0[i2];
                                while (wm3Var29 != null && wm3Var29.h0 == i39) {
                                    wm3Var29 = wm3Var29.n0[i2];
                                }
                                if (wm3Var28 == wm3Var18 || wm3Var28 == wm3Var2 || wm3Var29 == null) {
                                    wm3Var3 = wm3Var27;
                                } else {
                                    if (wm3Var29 == wm3Var2) {
                                        wm3Var29 = null;
                                    }
                                    nl3 nl3Var19 = nl3VarArr13[i4];
                                    rvh rvhVar16 = nl3Var19.i;
                                    int i41 = i4 + 1;
                                    rvh rvhVar17 = nl3VarArr12[i41].i;
                                    int e6 = nl3Var19.e();
                                    int e7 = nl3VarArr13[i41].e();
                                    if (wm3Var29 != null) {
                                        nl3Var = wm3Var29.R[i4];
                                        rvhVar = nl3Var.i;
                                        wm3Var3 = wm3Var27;
                                        nl3 nl3Var20 = nl3Var.f;
                                        rvhVar2 = nl3Var20 != null ? nl3Var20.i : null;
                                    } else {
                                        wm3Var3 = wm3Var27;
                                        nl3 nl3Var21 = wm3Var2.R[i4];
                                        rvhVar = nl3Var21 != null ? nl3Var21.i : null;
                                        rvh rvhVar18 = nl3VarArr13[i41].i;
                                        nl3Var = nl3Var21;
                                        rvhVar2 = rvhVar18;
                                    }
                                    if (nl3Var != null) {
                                        e7 += nl3Var.e();
                                    }
                                    int e8 = nl3VarArr12[i41].e() + e6;
                                    wm3 wm3Var30 = wm3Var29;
                                    int i42 = e7;
                                    int i43 = z19 ? 8 : 4;
                                    if (rvhVar16 == null || rvhVar17 == null || rvhVar == null || rvhVar2 == null) {
                                        wm3Var4 = wm3Var30;
                                    } else {
                                        rvh rvhVar19 = rvhVar;
                                        wm3Var4 = wm3Var30;
                                        h8bVar.b(rvhVar16, rvhVar17, e8, 0.5f, rvhVar19, rvhVar2, i42, i43);
                                    }
                                    wm3Var29 = wm3Var4;
                                }
                                if (wm3Var28.h0 != 8) {
                                    wm3Var3 = wm3Var28;
                                }
                                wm3Var28 = wm3Var29;
                                i39 = 8;
                                wm3Var27 = wm3Var3;
                            }
                            h8bVar2 = h8bVar;
                            nl3 nl3Var22 = wm3Var18.R[i4];
                            nl3 nl3Var23 = nl3VarArr[i4].f;
                            int i44 = i4 + 1;
                            nl3 nl3Var24 = wm3Var2.R[i44];
                            nl3 nl3Var25 = wm3Var17.R[i44].f;
                            if (nl3Var23 != null) {
                                if (wm3Var18 != wm3Var2) {
                                    h8bVar2.e(nl3Var22.i, nl3Var23.i, nl3Var22.e(), 5);
                                } else if (nl3Var25 != null) {
                                    h8bVar2.b(nl3Var22.i, nl3Var23.i, nl3Var22.e(), 0.5f, nl3Var24.i, nl3Var25.i, nl3Var24.e(), 5);
                                }
                            }
                            if (nl3Var25 != null && wm3Var18 != wm3Var2) {
                                h8bVar2.e(nl3Var24.i, nl3Var25.i, -nl3Var24.e(), 5);
                            }
                            if ((!z2 || z3) && wm3Var18 != null && wm3Var18 != wm3Var2) {
                                nl3[] nl3VarArr14 = wm3Var18.R;
                                nl3Var3 = nl3VarArr14[i4];
                                if (wm3Var2 == null) {
                                    wm3Var2 = wm3Var18;
                                }
                                nl3VarArr3 = wm3Var2.R;
                                i9 = i4 + 1;
                                nl3Var4 = nl3VarArr3[i9];
                                nl3 nl3Var26 = nl3Var3.f;
                                rvhVar4 = nl3Var26 == null ? nl3Var26.i : null;
                                nl3 nl3Var27 = nl3Var4.f;
                                rvhVar5 = nl3Var27 == null ? nl3Var27.i : null;
                                if (wm3Var17 != wm3Var2) {
                                    nl3 nl3Var28 = wm3Var17.R[i9].f;
                                    rvhVar5 = nl3Var28 != null ? nl3Var28.i : null;
                                }
                                if (wm3Var18 == wm3Var2) {
                                    nl3Var4 = nl3VarArr14[i9];
                                }
                                if (rvhVar4 != null && rvhVar5 != null) {
                                    h8bVar2.b(nl3Var3.i, rvhVar4, nl3Var3.e(), 0.5f, rvhVar5, nl3Var4.i, nl3VarArr3[i9].e(), 5);
                                }
                            }
                        }
                    }
                } else {
                    nl3 nl3Var29 = nl3VarArr[i4];
                    int i45 = i4 + 1;
                    nl3 nl3Var30 = wm3Var17.R[i45];
                    nl3 nl3Var31 = nl3Var29.f;
                    rvh rvhVar20 = nl3Var31 != null ? nl3Var31.i : null;
                    nl3 nl3Var32 = nl3Var30.f;
                    rvh rvhVar21 = nl3Var32 != null ? nl3Var32.i : null;
                    nl3 nl3Var33 = wm3Var18.R[i4];
                    if (wm3Var19 != null) {
                        nl3Var30 = wm3Var19.R[i45];
                    }
                    if (rvhVar20 == null || rvhVar21 == null) {
                        wm3Var2 = wm3Var19;
                    } else {
                        float f13 = i2 == 0 ? wm3Var20.e0 : wm3Var20.f0;
                        int e9 = nl3Var33.e();
                        int e10 = nl3Var30.e();
                        rvh rvhVar22 = nl3Var33.i;
                        rvh rvhVar23 = nl3Var30.i;
                        rvh rvhVar24 = rvhVar20;
                        wm3Var2 = wm3Var19;
                        h8bVar3.b(rvhVar22, rvhVar24, e9, f13, rvhVar21, rvhVar23, e10, 7);
                    }
                }
                h8bVar2 = h8bVar;
                if (!z2) {
                }
                nl3[] nl3VarArr142 = wm3Var18.R;
                nl3Var3 = nl3VarArr142[i4];
                if (wm3Var2 == null) {
                }
                nl3VarArr3 = wm3Var2.R;
                i9 = i4 + 1;
                nl3Var4 = nl3VarArr3[i9];
                nl3 nl3Var262 = nl3Var3.f;
                if (nl3Var262 == null) {
                }
                nl3 nl3Var272 = nl3Var4.f;
                if (nl3Var272 == null) {
                }
                if (wm3Var17 != wm3Var2) {
                }
                if (wm3Var18 == wm3Var2) {
                }
                if (rvhVar4 != null) {
                    h8bVar2.b(nl3Var3.i, rvhVar4, nl3Var3.e(), 0.5f, rvhVar5, nl3Var4.i, nl3VarArr3[i9].e(), 5);
                }
            } else {
                i6 = i16;
            }
            i17 = i5 + 1;
            xm3Var2 = xm3Var;
            h8bVar3 = h8bVar;
            arrayList3 = arrayList;
            i16 = i6;
        }
    }

    public static final d5a s(j50 j50Var, of3 of3Var) {
        return new d5a(j50Var, (kx4) ((av8) of3Var).k(dh3.h));
    }

    public static av4 t(ku3 ku3Var, CoroutineContext coroutineContext, Function2 function2, int i2) {
        nu3 nu3Var = nu3.d;
        if ((i2 & 1) != 0) {
            coroutineContext = g.a;
        }
        if ((i2 & 2) != 0) {
            nu3Var = nu3.a;
        }
        CoroutineContext b2 = yt3.b(ku3Var, coroutineContext);
        av4 noaVar = nu3Var == nu3.b ? new noa(b2, function2) : new av4(b2, true);
        noaVar.l0(nu3Var, noaVar, function2);
        return noaVar;
    }

    public static void u(int i2, int i3) {
        GLES20.glBindTexture(i2, i3);
        x();
        GLES20.glTexParameteri(i2, 10240, 9729);
        x();
        GLES20.glTexParameteri(i2, 10241, 9729);
        x();
        GLES20.glTexParameteri(i2, 10242, 33071);
        x();
        GLES20.glTexParameteri(i2, 10243, 33071);
        x();
    }

    public static final Charset v(aq4 aq4Var) {
        up3 up3Var;
        aq4Var.getClass();
        o89 a2 = aq4Var.a();
        List list = zi9.a;
        String str = a2.get("Content-Type");
        if (str != null) {
            up3 up3Var2 = up3.e;
            up3Var = yqo.G(str);
        } else {
            up3Var = null;
        }
        if (up3Var != null) {
            return f5p.w(up3Var);
        }
        return null;
    }

    public static final void w(WorkDatabase workDatabase, ti3 ti3Var, lbl lblVar) {
        int i2;
        workDatabase.getClass();
        ti3Var.getClass();
        ArrayList l2 = b.l(lblVar);
        int i3 = 0;
        int i4 = 0;
        while (!l2.isEmpty()) {
            List list = ((lbl) o13.D(l2)).d;
            list.getClass();
            if (list.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it = list.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    if (!((icl) it.next()).b.j.i.isEmpty() && (i2 = i2 + 1) < 0) {
                        b.p();
                        throw null;
                    }
                }
            }
            i4 += i2;
        }
        if (i4 == 0) {
            return;
        }
        int intValue = ((Number) gz8.S(workDatabase.g().a, true, false, new pcl(i3))).intValue();
        if (intValue + i4 <= 8) {
            return;
        }
        a70.p(lnb.j(intValue, i4, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: 8;\nalready enqueued count: ", ";\ncurrent enqueue operation count: ", ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
    }

    public static void x() {
        StringBuilder sb = new StringBuilder();
        yqo.w(4, "initialCapacity");
        Object[] objArr = new Object[4];
        boolean z = false;
        int i2 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = bf3.i(glGetError, new StringBuilder("error code: 0x"));
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            Integer valueOf = Integer.valueOf(glGetError);
            int i3 = i2 + 1;
            int b2 = vu9.b(objArr.length, i3);
            if (b2 > objArr.length) {
                objArr = Arrays.copyOf(objArr, b2);
            }
            objArr[i2] = valueOf;
            z = true;
            i2 = i3;
        }
        if (z) {
            throw new iy8(sb.toString(), hv9.r(i2, objArr));
        }
    }

    public static void y(String str, boolean z) {
        if (z) {
            return;
        }
        av9 av9Var = hv9.b;
        throw new iy8(str, vvf.e);
    }

    public static final e1d z(wzc wzcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (O == a99Var) {
            O = e.f(Boolean.FALSE);
            av8Var.n0(O);
        }
        e1d e1dVar = (e1d) O;
        int i3 = 1;
        boolean z = (((i2 & 14) ^ 6) > 4 && av8Var.g(wzcVar)) || (i2 & 6) == 4;
        Object O2 = av8Var.O();
        if (z || O2 == a99Var) {
            O2 = new e85(wzcVar, e1dVar, null, i3);
            av8Var.n0(O2);
        }
        hz8.o(av8Var, wzcVar, (Function2) O2);
        return e1dVar;
    }
}
