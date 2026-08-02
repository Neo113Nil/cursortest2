package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Parcel;
import android.text.TextPaint;
import android.view.View;
import android.widget.EditText;
import androidx.compose.runtime.e;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.w;
import com.google.android.gms.internal.ads.zzagn;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.results.R;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceEntrant;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceTeam;
import com.sofascore.results.view.SofaTextInputLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class b6a implements zzagn {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int i = 0;

    public static final Object A(u6b u6bVar, e6b e6bVar, Function2 function2, rq3 rq3Var) {
        Object z = z(u6bVar.getLifecycle(), e6bVar, function2, rq3Var);
        return z == lu3.a ? z : Unit.a;
    }

    public static final long B(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static String C(int i2) {
        return i2 == 1 ? "Clip" : i2 == 2 ? "Ellipsis" : i2 == 5 ? "MiddleEllipsis" : i2 == 3 ? "Visible" : i2 == 4 ? "StartEllipsis" : "Invalid";
    }

    public static final void D(Point2D point2D, Rect rect, int i2) {
        point2D.getClass();
        rect.getClass();
        float f2 = i2 / 2.0f;
        rect.set(wzb.b(point2D.getX() - f2), wzb.b(point2D.getY() - f2), wzb.b(point2D.getX() + f2), wzb.b(point2D.getY() + f2));
    }

    public static final void E(final SofaTextInputLayout sofaTextInputLayout, final Function1 function1) {
        sofaTextInputLayout.getClass();
        EditText editText = sofaTextInputLayout.getEditText();
        if (editText != null) {
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: vth
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    view.getClass();
                    EditText editText2 = (EditText) view;
                    int length = editText2.getText().toString().length();
                    SofaTextInputLayout sofaTextInputLayout2 = SofaTextInputLayout.this;
                    if (length == 0) {
                        sofaTextInputLayout2.setError(null);
                    } else {
                        if (z) {
                            return;
                        }
                        sofaTextInputLayout2.setError((CharSequence) function1.invoke(editText2.getText().toString()));
                    }
                }
            });
        }
    }

    public static int F(int i2) {
        return (int) (Integer.rotateLeft((int) (i2 * (-862048943)), 15) * 461845907);
    }

    public static final void a(gv9 gv9Var, xtc xtcVar, tc3 tc3Var, of3 of3Var, int i2) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1537009503);
        int i3 = (av8Var.g(gv9Var) ? 4 : 2) | i2 | 384;
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = (i3 & 14) == 4;
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new rbb(gv9Var, i4);
                av8Var.n0(O);
            }
            k1c k1cVar = (k1c) O;
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
            waa.K(av8Var, k1cVar, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            fc6.v(6, tc3Var, av8Var, true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wbc(gv9Var, xtcVar2, tc3Var, i2, 17);
        }
    }

    public static final void b(final k7d k7dVar, final g7d g7dVar, final xtc xtcVar, final io ioVar, final Function1 function1, final Function1 function12, final Function1 function13, final Function1 function14, of3 of3Var, final int i2) {
        int i3;
        final xtc xtcVar2;
        final io ioVar2;
        final Function1 function15;
        Function1 function16;
        final oe3 oe3Var;
        e1d e1dVar;
        av8 av8Var;
        z8d z8dVar;
        y15 y15Var;
        int i4;
        a99 a99Var;
        z8d z8dVar2;
        g0d g0dVar;
        boolean z;
        Function1 function17;
        o0h o0hVar;
        axj axjVar;
        d6d d6dVar;
        g0d g0dVar2;
        oe3 oe3Var2;
        cdi cdiVar;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1964664536);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.i(k7dVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.i(g7dVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var2.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            xtcVar2 = xtcVar;
        }
        if ((i2 & 3072) == 0) {
            ioVar2 = ioVar;
            i3 |= av8Var2.g(ioVar2) ? a.o : 1024;
        } else {
            ioVar2 = ioVar;
        }
        if ((i2 & 24576) == 0) {
            function15 = function1;
            i3 |= av8Var2.i(function15) ? 16384 : 8192;
        } else {
            function15 = function1;
        }
        if ((196608 & i2) == 0) {
            function16 = function12;
            i3 |= av8Var2.i(function16) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        } else {
            function16 = function12;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= av8Var2.i(function13) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= av8Var2.i(function14) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= av8Var2.i(null) ? 67108864 : 33554432;
        }
        if ((i3 & 38347923) == 38347922 && av8Var2.D()) {
            av8Var2.W();
            av8Var = av8Var2;
        } else {
            av8Var2.Y();
            if ((i2 & 1) != 0 && !av8Var2.B()) {
                av8Var2.W();
            }
            av8Var2.t();
            u6b u6bVar = (u6b) av8Var2.k(mhb.a);
            ttk a2 = cib.a(av8Var2);
            if (a2 == null) {
                a70.r("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                return;
            }
            k7dVar.h(a2.getViewModelStore());
            k6d k6dVar = k7dVar.b;
            g7dVar.getClass();
            k6dVar.getClass();
            z8d z8dVar3 = k6dVar.s;
            k6dVar.r(g7dVar, null);
            y8d b2 = z8dVar3.b("composable");
            oe3 oe3Var3 = b2 instanceof oe3 ? (oe3) b2 : null;
            if (oe3Var3 == null) {
                eqf u = av8Var2.u();
                if (u != null) {
                    final int i5 = 2;
                    final Function1 function18 = function16;
                    u.d = new Function2() { // from class: n7d
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i5) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    b6a.b(k7dVar, g7dVar, xtcVar2, ioVar2, function15, function18, function13, function14, (of3) obj, aba.K(i2 | 1));
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    b6a.b(k7dVar, g7dVar, xtcVar2, ioVar2, function15, function18, function13, function14, (of3) obj, aba.K(i2 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    b6a.b(k7dVar, g7dVar, xtcVar2, ioVar2, function15, function18, function13, function14, (of3) obj, aba.K(i2 | 1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            e1d l = sea.l(oe3Var3.b().e, av8Var2, 0);
            Object O = av8Var2.O();
            a99 a99Var2 = nf3.a;
            Object obj = O;
            if (O == a99Var2) {
                xnh b3 = e.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                av8Var2.n0(b3);
                obj = b3;
            }
            xnh xnhVar = (xnh) obj;
            Object O2 = av8Var2.O();
            Object obj2 = O2;
            if (O2 == a99Var2) {
                e1d f2 = e.f(Boolean.FALSE);
                av8Var2.n0(f2);
                obj2 = f2;
            }
            final e1d e1dVar2 = (e1d) obj2;
            int i6 = 1;
            boolean z2 = ((List) l.getValue()).size() > 1;
            boolean g2 = av8Var2.g(l) | av8Var2.i(oe3Var3);
            Object O3 = av8Var2.O();
            if (g2 || O3 == a99Var2) {
                oe3 oe3Var4 = oe3Var3;
                O3 = new h10(oe3Var4, l, xnhVar, e1dVar2, null, 14);
                oe3Var = oe3Var4;
                e1dVar = l;
                av8Var2.n0(O3);
            } else {
                oe3 oe3Var5 = oe3Var3;
                e1dVar = l;
                oe3Var = oe3Var5;
            }
            o3a.f(z2, (Function2) O3, av8Var2, 0);
            boolean i7 = av8Var2.i(k7dVar) | av8Var2.i(u6bVar);
            Object O4 = av8Var2.O();
            Object obj3 = O4;
            if (i7 || O4 == a99Var2) {
                lsb lsbVar = new lsb(18, k7dVar, u6bVar);
                av8Var2.n0(lsbVar);
                obj3 = lsbVar;
            }
            hz8.d(u6bVar, (Function1) obj3, av8Var2);
            ppg I = i2a.I(av8Var2);
            e1d l2 = sea.l(k6dVar.i, av8Var2, 0);
            Object O5 = av8Var2.O();
            Object obj4 = O5;
            if (O5 == a99Var2) {
                ay4 b4 = goh.b(new m56(l2, i6));
                av8Var2.n0(b4);
                obj4 = b4;
            }
            cdi cdiVar2 = (cdi) obj4;
            d6d d6dVar2 = (d6d) CollectionsKt.j0((List) cdiVar2.getValue());
            Object O6 = av8Var2.O();
            Object obj5 = O6;
            if (O6 == a99Var2) {
                int i8 = ujd.a;
                g0d g0dVar3 = new g0d(6);
                av8Var2.n0(g0dVar3);
                obj5 = g0dVar3;
            }
            g0d g0dVar4 = (g0d) obj5;
            if (d6dVar2 != null) {
                av8Var2.d0(-1797563167);
                boolean i9 = av8Var2.i(oe3Var) | ((((i3 & 3670016) ^ 1572864) > 1048576 && av8Var2.g(function13)) || (i3 & 1572864) == 1048576) | ((57344 & i3) == 16384);
                Object O7 = av8Var2.O();
                if (i9 || O7 == a99Var2) {
                    final int i10 = 1;
                    i4 = i3;
                    a99Var = a99Var2;
                    z8dVar2 = z8dVar3;
                    g0dVar = g0dVar4;
                    z = true;
                    Function1 function19 = new Function1() { // from class: l7d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            Function1 function110;
                            Function1 function111;
                            Function1 function112;
                            Function1 function113;
                            int i11 = i10;
                            Object obj7 = null;
                            e1d e1dVar3 = e1dVar2;
                            Function1 function114 = function1;
                            Function1 function115 = function13;
                            oe3 oe3Var6 = oe3Var;
                            r60 r60Var = (r60) obj6;
                            switch (i11) {
                                case 0:
                                    s6d s6dVar = ((d6d) r60Var.b()).b;
                                    s6dVar.getClass();
                                    ne3 ne3Var = (ne3) s6dVar;
                                    if (((Boolean) ((eoh) oe3Var6.c).getValue()).booleanValue() || ((Boolean) e1dVar3.getValue()).booleanValue()) {
                                        int i12 = s6d.f;
                                        Iterator it = l4a.t(ne3Var).iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                s6d s6dVar2 = (s6d) it.next();
                                                of6 of6Var = (!(s6dVar2 instanceof ne3) || (function110 = ((ne3) s6dVar2).k) == null) ? null : (of6) function110.invoke(r60Var);
                                                if (of6Var != null) {
                                                    obj7 = of6Var;
                                                }
                                            }
                                        }
                                        return obj7 == null ? (of6) function115.invoke(r60Var) : obj7;
                                    }
                                    int i13 = s6d.f;
                                    Iterator it2 = l4a.t(ne3Var).iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            s6d s6dVar3 = (s6d) it2.next();
                                            of6 of6Var2 = (!(s6dVar3 instanceof ne3) || (function111 = ((ne3) s6dVar3).i) == null) ? null : (of6) function111.invoke(r60Var);
                                            if (of6Var2 != null) {
                                                obj7 = of6Var2;
                                            }
                                        }
                                    }
                                    return obj7 == null ? (of6) function114.invoke(r60Var) : obj7;
                                default:
                                    s6d s6dVar4 = ((d6d) r60Var.a()).b;
                                    s6dVar4.getClass();
                                    ne3 ne3Var2 = (ne3) s6dVar4;
                                    if (((Boolean) ((eoh) oe3Var6.c).getValue()).booleanValue() || ((Boolean) e1dVar3.getValue()).booleanValue()) {
                                        int i14 = s6d.f;
                                        Iterator it3 = l4a.t(ne3Var2).iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                s6d s6dVar5 = (s6d) it3.next();
                                                zo5 zo5Var = (!(s6dVar5 instanceof ne3) || (function112 = ((ne3) s6dVar5).j) == null) ? null : (zo5) function112.invoke(r60Var);
                                                if (zo5Var != null) {
                                                    obj7 = zo5Var;
                                                }
                                            }
                                        }
                                        return obj7 == null ? (zo5) function115.invoke(r60Var) : obj7;
                                    }
                                    int i15 = s6d.f;
                                    Iterator it4 = l4a.t(ne3Var2).iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            s6d s6dVar6 = (s6d) it4.next();
                                            zo5 zo5Var2 = (!(s6dVar6 instanceof ne3) || (function113 = ((ne3) s6dVar6).h) == null) ? null : (zo5) function113.invoke(r60Var);
                                            if (zo5Var2 != null) {
                                                obj7 = zo5Var2;
                                            }
                                        }
                                    }
                                    return obj7 == null ? (zo5) function114.invoke(r60Var) : obj7;
                            }
                        }
                    };
                    av8Var2.n0(function19);
                    O7 = function19;
                } else {
                    i4 = i3;
                    a99Var = a99Var2;
                    z8dVar2 = z8dVar3;
                    g0dVar = g0dVar4;
                    z = true;
                }
                Function1 function110 = (Function1) O7;
                boolean i11 = av8Var2.i(oe3Var) | (((((29360128 & i4) ^ 12582912) <= 8388608 || !av8Var2.g(function14)) && (i4 & 12582912) != 8388608) ? false : z) | ((458752 & i4) == 131072 ? z : false);
                Object O8 = av8Var2.O();
                if (i11 || O8 == a99Var) {
                    final int i12 = 0;
                    function17 = function110;
                    Function1 function111 = new Function1() { // from class: l7d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            Function1 function1102;
                            Function1 function1112;
                            Function1 function112;
                            Function1 function113;
                            int i112 = i12;
                            Object obj7 = null;
                            e1d e1dVar3 = e1dVar2;
                            Function1 function114 = function12;
                            Function1 function115 = function14;
                            oe3 oe3Var6 = oe3Var;
                            r60 r60Var = (r60) obj6;
                            switch (i112) {
                                case 0:
                                    s6d s6dVar = ((d6d) r60Var.b()).b;
                                    s6dVar.getClass();
                                    ne3 ne3Var = (ne3) s6dVar;
                                    if (((Boolean) ((eoh) oe3Var6.c).getValue()).booleanValue() || ((Boolean) e1dVar3.getValue()).booleanValue()) {
                                        int i122 = s6d.f;
                                        Iterator it = l4a.t(ne3Var).iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                s6d s6dVar2 = (s6d) it.next();
                                                of6 of6Var = (!(s6dVar2 instanceof ne3) || (function1102 = ((ne3) s6dVar2).k) == null) ? null : (of6) function1102.invoke(r60Var);
                                                if (of6Var != null) {
                                                    obj7 = of6Var;
                                                }
                                            }
                                        }
                                        return obj7 == null ? (of6) function115.invoke(r60Var) : obj7;
                                    }
                                    int i13 = s6d.f;
                                    Iterator it2 = l4a.t(ne3Var).iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            s6d s6dVar3 = (s6d) it2.next();
                                            of6 of6Var2 = (!(s6dVar3 instanceof ne3) || (function1112 = ((ne3) s6dVar3).i) == null) ? null : (of6) function1112.invoke(r60Var);
                                            if (of6Var2 != null) {
                                                obj7 = of6Var2;
                                            }
                                        }
                                    }
                                    return obj7 == null ? (of6) function114.invoke(r60Var) : obj7;
                                default:
                                    s6d s6dVar4 = ((d6d) r60Var.a()).b;
                                    s6dVar4.getClass();
                                    ne3 ne3Var2 = (ne3) s6dVar4;
                                    if (((Boolean) ((eoh) oe3Var6.c).getValue()).booleanValue() || ((Boolean) e1dVar3.getValue()).booleanValue()) {
                                        int i14 = s6d.f;
                                        Iterator it3 = l4a.t(ne3Var2).iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                s6d s6dVar5 = (s6d) it3.next();
                                                zo5 zo5Var = (!(s6dVar5 instanceof ne3) || (function112 = ((ne3) s6dVar5).j) == null) ? null : (zo5) function112.invoke(r60Var);
                                                if (zo5Var != null) {
                                                    obj7 = zo5Var;
                                                }
                                            }
                                        }
                                        return obj7 == null ? (zo5) function115.invoke(r60Var) : obj7;
                                    }
                                    int i15 = s6d.f;
                                    Iterator it4 = l4a.t(ne3Var2).iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            s6d s6dVar6 = (s6d) it4.next();
                                            zo5 zo5Var2 = (!(s6dVar6 instanceof ne3) || (function113 = ((ne3) s6dVar6).h) == null) ? null : (zo5) function113.invoke(r60Var);
                                            if (zo5Var2 != null) {
                                                obj7 = zo5Var2;
                                            }
                                        }
                                    }
                                    return obj7 == null ? (zo5) function114.invoke(r60Var) : obj7;
                            }
                        }
                    };
                    av8Var2.n0(function111);
                    O8 = function111;
                } else {
                    function17 = function110;
                }
                Function1 function112 = (Function1) O8;
                boolean z3 = (234881024 & i4) == 67108864 ? z : false;
                Object O9 = av8Var2.O();
                Object obj6 = O9;
                if (z3 || O9 == a99Var) {
                    a7d a7dVar = new a7d(4);
                    av8Var2.n0(a7dVar);
                    obj6 = a7dVar;
                }
                Function1 function113 = (Function1) obj6;
                Boolean bool = Boolean.TRUE;
                boolean i13 = av8Var2.i(oe3Var);
                Object O10 = av8Var2.O();
                Object obj7 = O10;
                if (i13 || O10 == a99Var) {
                    lsb lsbVar2 = new lsb(17, cdiVar2, oe3Var);
                    av8Var2.n0(lsbVar2);
                    obj7 = lsbVar2;
                }
                hz8.d(bool, (Function1) obj7, av8Var2);
                Object O11 = av8Var2.O();
                Object obj8 = O11;
                if (O11 == a99Var) {
                    o0h o0hVar2 = new o0h(d6dVar2);
                    av8Var2.n0(o0hVar2);
                    obj8 = o0hVar2;
                }
                o0h o0hVar3 = (o0h) obj8;
                axj H = yso.H(o0hVar3, "entry", av8Var2, 56);
                if (((Boolean) e1dVar2.getValue()).booleanValue()) {
                    av8Var2.d0(-1795329152);
                    Float valueOf = Float.valueOf(xnhVar.h());
                    boolean g3 = av8Var2.g(e1dVar) | av8Var2.i(o0hVar3);
                    Object O12 = av8Var2.O();
                    if (g3 || O12 == a99Var) {
                        y15Var = null;
                        O12 = new j8c((Object) o0hVar3, (Object) e1dVar, (Object) xnhVar, (rq3) (false ? 1 : 0), 14);
                        av8Var2.n0(O12);
                    } else {
                        y15Var = null;
                    }
                    hz8.o(av8Var2, valueOf, (Function2) O12);
                    av8Var2.s(false);
                    o0hVar = o0hVar3;
                    axjVar = H;
                    d6dVar = d6dVar2;
                } else {
                    y15Var = null;
                    boolean z4 = false;
                    av8Var2.d0(-1794910745);
                    boolean i14 = av8Var2.i(o0hVar3) | av8Var2.i(d6dVar2) | av8Var2.g(H);
                    Object O13 = av8Var2.O();
                    if (i14 || O13 == a99Var) {
                        o0hVar = o0hVar3;
                        axjVar = H;
                        O13 = new va8((Object) o0hVar, (Object) d6dVar2, (Object) axjVar, (rq3) (z4 ? 1 : 0), 24);
                        d6dVar = d6dVar2;
                        av8Var2.n0(O13);
                    } else {
                        o0hVar = o0hVar3;
                        axjVar = H;
                        d6dVar = d6dVar2;
                    }
                    hz8.o(av8Var2, d6dVar, (Function2) O13);
                    av8Var2.s(false);
                }
                g0d g0dVar5 = g0dVar;
                boolean i15 = av8Var2.i(g0dVar5) | av8Var2.i(oe3Var) | av8Var2.g(function17) | av8Var2.g(function112) | av8Var2.g(function113);
                Object O14 = av8Var2.O();
                if (i15 || O14 == a99Var) {
                    oe3 oe3Var6 = oe3Var;
                    O14 = new gj(g0dVar5, oe3Var6, function17, function112, function113, cdiVar2, e1dVar2, 6);
                    g0dVar2 = g0dVar5;
                    oe3Var2 = oe3Var6;
                    cdiVar = cdiVar2;
                    e1dVar2 = e1dVar2;
                    av8Var2.n0(O14);
                } else {
                    oe3Var2 = oe3Var;
                    g0dVar2 = g0dVar5;
                    cdiVar = cdiVar2;
                }
                Function1 function114 = (Function1) O14;
                Object O15 = av8Var2.O();
                Object obj9 = O15;
                if (O15 == a99Var) {
                    a7d a7dVar2 = new a7d(6);
                    av8Var2.n0(a7dVar2);
                    obj9 = a7dVar2;
                }
                d6d d6dVar3 = d6dVar;
                axj axjVar2 = axjVar;
                l98.a(axjVar2, xtcVar, function114, ioVar, (Function1) obj9, yqo.H(820763100, av8Var2, new o7d(o0hVar, d6dVar3, I, e1dVar2, cdiVar, 0)), av8Var2, ((i4 >> 3) & 112) | 221184 | (i4 & 7168));
                av8Var = av8Var2;
                Object w = axjVar2.a.w();
                Object value = ((eoh) axjVar2.d).getValue();
                boolean g4 = av8Var.g(axjVar2) | av8Var.i(k7dVar) | av8Var.i(d6dVar3) | av8Var.i(oe3Var2) | av8Var.i(g0dVar2);
                Object O16 = av8Var.O();
                if (g4 || O16 == a99Var) {
                    z8dVar = z8dVar2;
                    p7d p7dVar = new p7d(axjVar2, k7dVar, d6dVar3, g0dVar2, cdiVar, oe3Var2, null, 0);
                    av8Var.n0(p7dVar);
                    O16 = p7dVar;
                } else {
                    z8dVar = z8dVar2;
                }
                hz8.q(w, value, (Function2) O16, av8Var);
                av8Var.s(false);
            } else {
                av8Var = av8Var2;
                z8dVar = z8dVar3;
                y15Var = null;
                av8Var.d0(-1789758886);
                av8Var.s(false);
            }
            y8d b5 = z8dVar.b("dialog");
            y15 y15Var2 = b5 instanceof y15 ? (y15) b5 : y15Var;
            if (y15Var2 == null) {
                eqf u2 = av8Var.u();
                if (u2 != null) {
                    final int i16 = 0;
                    u2.d = new Function2() { // from class: n7d
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj10, Object obj22) {
                            switch (i16) {
                                case 0:
                                    ((Integer) obj22).getClass();
                                    b6a.b(k7dVar, g7dVar, xtcVar, ioVar, function1, function12, function13, function14, (of3) obj10, aba.K(i2 | 1));
                                    break;
                                case 1:
                                    ((Integer) obj22).getClass();
                                    b6a.b(k7dVar, g7dVar, xtcVar, ioVar, function1, function12, function13, function14, (of3) obj10, aba.K(i2 | 1));
                                    break;
                                default:
                                    ((Integer) obj22).getClass();
                                    b6a.b(k7dVar, g7dVar, xtcVar, ioVar, function1, function12, function13, function14, (of3) obj10, aba.K(i2 | 1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            rd0.d(y15Var2, av8Var, 0);
        }
        eqf u3 = av8Var.u();
        if (u3 != null) {
            final int i17 = 1;
            u3.d = new Function2() { // from class: n7d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj10, Object obj22) {
                    switch (i17) {
                        case 0:
                            ((Integer) obj22).getClass();
                            b6a.b(k7dVar, g7dVar, xtcVar, ioVar, function1, function12, function13, function14, (of3) obj10, aba.K(i2 | 1));
                            break;
                        case 1:
                            ((Integer) obj22).getClass();
                            b6a.b(k7dVar, g7dVar, xtcVar, ioVar, function1, function12, function13, function14, (of3) obj10, aba.K(i2 | 1));
                            break;
                        default:
                            ((Integer) obj22).getClass();
                            b6a.b(k7dVar, g7dVar, xtcVar, ioVar, function1, function12, function13, function14, (of3) obj10, aba.K(i2 | 1));
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final k7d k7dVar, final Object obj, xtc xtcVar, io ioVar, Map map, Function1 function1, Function1 function12, Function1 function13, Function1 function14, final Function1 function15, of3 of3Var, final int i2, final int i3) {
        int i4;
        xtc xtcVar2;
        int i5;
        int i6;
        int i7;
        Object obj2;
        Object O;
        Function1 function16;
        Object O2;
        int i8;
        Function1 function17;
        int i9;
        Map map2;
        io ioVar2;
        xtc xtcVar3;
        int i10;
        Function1 function18;
        Function1 function19;
        boolean g2;
        Object O3;
        final Function1 function110;
        av8 av8Var;
        final Function1 function111;
        final Function1 function112;
        final Map map3;
        final Function1 function113;
        final io ioVar3;
        final xtc xtcVar4;
        eqf u;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1476019057);
        if ((i2 & 6) == 0) {
            i4 = (av8Var2.i(k7dVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var2.i(obj) ? 32 : 16;
        }
        int i11 = i3 & 4;
        if (i11 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var2.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            i5 = 14380032 | i4;
            if ((i2 & 100663296) == 0) {
                i5 = 47934464 | i4;
            }
            if ((805306368 & i2) == 0) {
                i5 |= 268435456;
            }
            i6 = (av8Var2.i(function15) ? ' ' : (char) 16) | 6;
            if ((306783379 & i5) != 306783378 && (i6 & 19) == 18 && av8Var2.D()) {
                av8Var2.W();
                ioVar3 = ioVar;
                function113 = function1;
                function111 = function12;
                function110 = function14;
                xtcVar4 = xtcVar2;
                av8Var = av8Var2;
                map3 = map;
                function112 = function13;
            } else {
                av8Var2.Y();
                i7 = i2 & 1;
                obj2 = nf3.a;
                if (i7 != 0 || av8Var2.B()) {
                    if (i11 != 0) {
                        xtcVar2 = utc.a;
                    }
                    mv1 mv1Var = uxf.c;
                    lm5 lm5Var = lm5.a;
                    lm5Var.getClass();
                    O = av8Var2.O();
                    if (O != obj2) {
                        O = new a7d(3);
                        av8Var2.n0(O);
                    }
                    function16 = (Function1) O;
                    O2 = av8Var2.O();
                    if (O2 != obj2) {
                        i8 = 100663296;
                        O2 = new a7d(5);
                        av8Var2.n0(O2);
                    } else {
                        i8 = 100663296;
                    }
                    function17 = (Function1) O2;
                    i9 = i6;
                    map2 = lm5Var;
                    ioVar2 = mv1Var;
                    xtcVar3 = xtcVar2;
                    i10 = i5 & (-2113929217);
                    function18 = function17;
                    function19 = function16;
                } else {
                    av8Var2.W();
                    int i12 = i5 & (-2113929217);
                    map2 = map;
                    function19 = function13;
                    i10 = i12;
                    i9 = i6;
                    xtcVar3 = xtcVar2;
                    i8 = 100663296;
                    ioVar2 = ioVar;
                    function16 = function1;
                    function18 = function12;
                    function17 = function14;
                }
                av8Var2.t();
                Function1 function114 = function16;
                g2 = ((i9 & 112) != 32) | av8Var2.g(null) | av8Var2.g(obj);
                O3 = av8Var2.O();
                if (!g2 || O3 == obj2) {
                    h7d h7dVar = new h7d(k7dVar.b.s, obj, map2);
                    function15.invoke(h7dVar);
                    O3 = h7dVar.i();
                    av8Var2.n0(O3);
                }
                g7d g7dVar = (g7d) O3;
                int i13 = i10 & 8078;
                int i14 = i10 >> 6;
                b(k7dVar, g7dVar, xtcVar3, ioVar2, function114, function18, function19, function17, av8Var2, i13 | (57344 & i14) | (i14 & 458752) | i8);
                function110 = function17;
                av8Var = av8Var2;
                function111 = function18;
                function112 = function19;
                map3 = map2;
                function113 = function114;
                ioVar3 = ioVar2;
                xtcVar4 = xtcVar3;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new Function2() { // from class: m7d
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        b6a.c(k7d.this, obj, xtcVar4, ioVar3, map3, function113, function111, function112, function110, function15, (of3) obj3, aba.K(i2 | 1), i3);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        i5 = 14380032 | i4;
        if ((i2 & 100663296) == 0) {
        }
        if ((805306368 & i2) == 0) {
        }
        i6 = (av8Var2.i(function15) ? ' ' : (char) 16) | 6;
        if ((306783379 & i5) != 306783378) {
        }
        av8Var2.Y();
        i7 = i2 & 1;
        obj2 = nf3.a;
        if (i7 != 0) {
        }
        if (i11 != 0) {
        }
        mv1 mv1Var2 = uxf.c;
        lm5 lm5Var2 = lm5.a;
        lm5Var2.getClass();
        O = av8Var2.O();
        if (O != obj2) {
        }
        function16 = (Function1) O;
        O2 = av8Var2.O();
        if (O2 != obj2) {
        }
        function17 = (Function1) O2;
        i9 = i6;
        map2 = lm5Var2;
        ioVar2 = mv1Var2;
        xtcVar3 = xtcVar2;
        i10 = i5 & (-2113929217);
        function18 = function17;
        function19 = function16;
        av8Var2.t();
        Function1 function1142 = function16;
        g2 = ((i9 & 112) != 32) | av8Var2.g(null) | av8Var2.g(obj);
        O3 = av8Var2.O();
        if (!g2) {
        }
        h7d h7dVar2 = new h7d(k7dVar.b.s, obj, map2);
        function15.invoke(h7dVar2);
        O3 = h7dVar2.i();
        av8Var2.n0(O3);
        g7d g7dVar2 = (g7d) O3;
        int i132 = i10 & 8078;
        int i142 = i10 >> 6;
        b(k7dVar, g7dVar2, xtcVar3, ioVar2, function1142, function18, function19, function17, av8Var2, i132 | (57344 & i142) | (i142 & 458752) | i8);
        function110 = function17;
        av8Var = av8Var2;
        function111 = function18;
        function112 = function19;
        map3 = map2;
        function113 = function1142;
        ioVar3 = ioVar2;
        xtcVar4 = xtcVar3;
        u = av8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r36v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r4v1, types: [av8, of3] */
    public static final void e(final gv9 gv9Var, tee teeVar, gv9 gv9Var2, final int i2, final int i3, final boolean z, int i4, final Integer num, xtc xtcVar, of3 of3Var, int i5) {
        int i6;
        av8 av8Var;
        long j;
        boolean z2;
        e1d e1dVar;
        boolean z3;
        tee teeVar2;
        Object obj;
        int i7;
        Object zb9Var;
        znh znhVar;
        int i8;
        Function0 function0;
        boolean z4;
        e1d e1dVar2;
        int i9;
        Object obj2;
        koh kohVar;
        e1d e1dVar3;
        Object okfVar;
        int i10;
        boolean z5;
        tee teeVar3;
        int i11;
        Object obj3;
        e1d e1dVar4;
        int i12;
        tee teeVar4;
        e1d e1dVar5;
        long j2;
        long j3;
        long j4;
        long j5;
        u6b u6bVar;
        int i13;
        Function0 function02;
        ku3 ku3Var;
        int i14;
        koh kohVar2;
        koh kohVar3;
        xnh xnhVar;
        koh kohVar4;
        Function2 function2;
        Function2 function22;
        koh kohVar5;
        final tee teeVar5;
        xtc xtcVar2;
        ?? r4 = (av8) of3Var;
        r4.f0(-1145253764);
        if ((i5 & 6) == 0) {
            i6 = (r4.g(gv9Var) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= r4.i(teeVar) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= r4.g(gv9Var2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i5 & 3072) == 0) {
            i6 |= r4.e(i2) ? a.o : 1024;
        }
        if ((i5 & 24576) == 0) {
            i6 |= r4.e(i3) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i6 |= r4.h(z) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((i5 & 1572864) == 0) {
            i6 |= r4.e(i4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i6 |= r4.g(num) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i6 |= r4.g(xtcVar) ? 67108864 : 33554432;
        }
        if (r4.T(i6 & 1, (i6 & 38347923) != 38347922)) {
            boolean z6 = r4.k(dh3.n) == ema.b;
            kx4 kx4Var = (kx4) r4.k(dh3.h);
            jej Q = h5a.Q(0, 0, 1, r4);
            Object O = r4.O();
            Object obj4 = nf3.a;
            if (O == obj4) {
                O = hz8.G(g.a, r4);
                r4.n0(O);
            }
            ku3 ku3Var2 = (ku3) O;
            long D = lz.D(R.color.n_lv_4, r4);
            long D2 = lz.D(R.color.on_color_primary, r4);
            long D3 = lz.D(R.color.live, r4);
            long D4 = lz.D(R.color.surface_1, r4);
            long D5 = lz.D(R.color.neutral_default, r4);
            Object O2 = r4.O();
            if (O2 == obj4) {
                yf8 yf8Var = xth.a;
                O2 = dfj.a(xth.n(), D2, kx4Var.u(12.0f), null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777212);
                j = D2;
                r4.n0(O2);
            } else {
                j = D2;
            }
            dfj dfjVar = (dfj) O2;
            final e1d g2 = e.g(gv9Var2, r4);
            Object O3 = r4.O();
            if (O3 == obj4) {
                final int i15 = 0;
                O3 = goh.b(new Function0() { // from class: nkf
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i16 = i15;
                        e1d e1dVar6 = g2;
                        gv9 gv9Var3 = gv9Var;
                        switch (i16) {
                            case 0:
                                ArrayList arrayList = new ArrayList();
                                for (Object obj5 : gv9Var3) {
                                    if (((gv9) e1dVar6.getValue()).contains(Integer.valueOf(((RaceFlowModels$RaceEntrant) obj5).a))) {
                                        arrayList.add(obj5);
                                    }
                                }
                                return l6g.W(CollectionsKt.B0(arrayList));
                            default:
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj6 : gv9Var3) {
                                    if (!((gv9) e1dVar6.getValue()).contains(Integer.valueOf(((RaceFlowModels$RaceEntrant) obj6).a))) {
                                        arrayList2.add(obj6);
                                    }
                                }
                                return l6g.W(CollectionsKt.B0(arrayList2));
                        }
                    }
                });
                r4.n0(O3);
            }
            final cdi cdiVar = (cdi) O3;
            Object O4 = r4.O();
            if (O4 == obj4) {
                final int i16 = 1;
                O4 = goh.b(new Function0() { // from class: nkf
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i162 = i16;
                        e1d e1dVar6 = g2;
                        gv9 gv9Var3 = gv9Var;
                        switch (i162) {
                            case 0:
                                ArrayList arrayList = new ArrayList();
                                for (Object obj5 : gv9Var3) {
                                    if (((gv9) e1dVar6.getValue()).contains(Integer.valueOf(((RaceFlowModels$RaceEntrant) obj5).a))) {
                                        arrayList.add(obj5);
                                    }
                                }
                                return l6g.W(CollectionsKt.B0(arrayList));
                            default:
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj6 : gv9Var3) {
                                    if (!((gv9) e1dVar6.getValue()).contains(Integer.valueOf(((RaceFlowModels$RaceEntrant) obj6).a))) {
                                        arrayList2.add(obj6);
                                    }
                                }
                                return l6g.W(CollectionsKt.B0(arrayList2));
                        }
                    }
                });
                r4.n0(O4);
            }
            final cdi cdiVar2 = (cdi) O4;
            int i17 = i6 & 14;
            boolean z7 = i17 == 4;
            Object O5 = r4.O();
            if (z7 || O5 == obj4) {
                ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
                Iterator it = gv9Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((RaceFlowModels$RaceEntrant) it.next()).b));
                }
                int c2 = sub.c(k13.r(arrayList, 10));
                if (c2 < 16) {
                    c2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(c2);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    linkedHashMap.put(next, jej.a(Q, String.valueOf(((Number) next).intValue()), dfjVar, 1004));
                    it2 = it2;
                    z6 = z6;
                }
                z2 = z6;
                O5 = l6g.X(linkedHashMap);
                r4.n0(O5);
            } else {
                z2 = z6;
            }
            tee teeVar6 = (tee) O5;
            boolean z8 = i17 == 4;
            Object O6 = r4.O();
            if (z8 || O6 == obj4) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = gv9Var.iterator();
                while (it3.hasNext()) {
                    RaceFlowModels$RaceTeam raceFlowModels$RaceTeam = ((RaceFlowModels$RaceEntrant) it3.next()).e;
                    if (raceFlowModels$RaceTeam != null) {
                        arrayList2.add(raceFlowModels$RaceTeam);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    if (hashSet.add(Integer.valueOf(((RaceFlowModels$RaceTeam) next2).a))) {
                        arrayList3.add(next2);
                    }
                }
                int c3 = sub.c(k13.r(arrayList3, 10));
                if (c3 < 16) {
                    c3 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(c3);
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    RaceFlowModels$RaceTeam raceFlowModels$RaceTeam2 = (RaceFlowModels$RaceTeam) it5.next();
                    linkedHashMap2.put(Integer.valueOf(raceFlowModels$RaceTeam2.a), new r13(hkg.b(raceFlowModels$RaceTeam2.c)));
                    g2 = g2;
                }
                e1dVar = g2;
                O6 = l6g.X(rub.b(linkedHashMap2, new pkf(D5)));
                r4.n0(O6);
            } else {
                e1dVar = g2;
            }
            tee teeVar7 = (tee) O6;
            Object O7 = r4.O();
            if (O7 == obj4) {
                O7 = e.f(Boolean.FALSE);
                r4.n0(O7);
            }
            e1d e1dVar6 = (e1d) O7;
            Object O8 = r4.O();
            if (O8 == obj4) {
                z3 = false;
                O8 = e.c(0);
                r4.n0(O8);
            } else {
                z3 = false;
            }
            znh znhVar2 = (znh) O8;
            Object O9 = r4.O();
            if (O9 == obj4) {
                O9 = new koh();
                r4.n0(O9);
            }
            koh kohVar6 = (koh) O9;
            Object O10 = r4.O();
            if (O10 == obj4) {
                O10 = e.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                r4.n0(O10);
            }
            xnh xnhVar2 = (xnh) O10;
            int i18 = 29360128 & i6;
            boolean z9 = i18 == 8388608 ? true : z3;
            Object O11 = r4.O();
            if (z9 || O11 == obj4) {
                O11 = e.f(num != null ? Float.valueOf(num.intValue() / i3) : null);
                r4.n0(O11);
            }
            e1d e1dVar7 = (e1d) O11;
            Object O12 = r4.O();
            if (O12 == obj4) {
                teeVar2 = teeVar7;
                Pair[] pairArr = {new Pair("path_clip_progress", ml4.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), new Pair("live_line_alpha", ml4.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))};
                koh kohVar7 = new koh();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(sub.c(2));
                tub.n(linkedHashMap3, pairArr);
                kohVar7.putAll(linkedHashMap3);
                r4.n0(kohVar7);
                obj = kohVar7;
            } else {
                teeVar2 = teeVar7;
                obj = O12;
            }
            koh kohVar8 = (koh) obj;
            Object O13 = r4.O();
            if (O13 == obj4) {
                O13 = new koh();
                r4.n0(O13);
            }
            koh kohVar9 = (koh) O13;
            int i19 = i6 & 7168;
            int i20 = 57344 & i6;
            boolean z10 = (i20 == 16384 ? true : z3) | (i19 == 2048 ? true : z3);
            Object O14 = r4.O();
            if (z10 || O14 == obj4) {
                O14 = new yg9(i2, i3, znhVar2);
                r4.n0(O14);
            }
            Function0 function03 = (Function0) O14;
            boolean g3 = (i19 == 2048 ? true : z3) | (i20 == 16384 ? true : z3) | r4.g(function03);
            Object O15 = r4.O();
            if (g3 || O15 == obj4) {
                i7 = i18;
                znhVar = znhVar2;
                i8 = i20;
                function0 = function03;
                z4 = z2;
                e1dVar2 = e1dVar;
                i9 = i19;
                obj2 = obj4;
                kohVar = kohVar8;
                e1dVar3 = e1dVar6;
                zb9Var = new zb9(kohVar, i2, i3, function0, znhVar, e1dVar3, null);
                r4.n0(zb9Var);
            } else {
                zb9Var = O15;
                i7 = i18;
                znhVar = znhVar2;
                i9 = i19;
                obj2 = obj4;
                i8 = i20;
                kohVar = kohVar8;
                z4 = z2;
                e1dVar3 = e1dVar6;
                function0 = function03;
                e1dVar2 = e1dVar;
            }
            Function2 function23 = (Function2) zb9Var;
            boolean g4 = (i17 == 4 ? true : z3) | r4.g(function0);
            Object O16 = r4.O();
            if (g4 || O16 == obj2) {
                i10 = i8;
                z5 = z4;
                teeVar3 = teeVar6;
                i11 = i7;
                obj3 = obj2;
                e1dVar4 = e1dVar7;
                i12 = i9;
                teeVar4 = teeVar2;
                e1dVar5 = e1dVar2;
                j2 = D5;
                j3 = D;
                j4 = D3;
                j5 = D4;
                u6bVar = null;
                av8Var = r4;
                i13 = i6;
                koh kohVar10 = kohVar;
                function02 = function0;
                ku3Var = ku3Var2;
                i14 = i17;
                okfVar = new okf(gv9Var, kohVar9, kohVar10, xnhVar2, kohVar6, function02, null, 1);
                kohVar2 = kohVar9;
                kohVar3 = kohVar10;
                xnhVar = xnhVar2;
                kohVar4 = kohVar6;
                av8Var.n0(okfVar);
            } else {
                koh kohVar11 = kohVar;
                i14 = i17;
                kohVar3 = kohVar11;
                kohVar2 = kohVar9;
                i11 = i7;
                i10 = i8;
                av8Var = r4;
                z5 = z4;
                i13 = i6;
                e1dVar4 = e1dVar7;
                teeVar3 = teeVar6;
                okfVar = O16;
                function02 = function0;
                i12 = i9;
                ku3Var = ku3Var2;
                teeVar4 = teeVar2;
                e1dVar5 = e1dVar2;
                j2 = D5;
                j3 = D;
                j4 = D3;
                j5 = D4;
                u6bVar = null;
                obj3 = obj2;
                xnhVar = xnhVar2;
                kohVar4 = kohVar6;
            }
            Function2 function24 = (Function2) okfVar;
            boolean g5 = av8Var.g(function02) | av8Var.g(e1dVar5);
            Object O17 = av8Var.O();
            if (g5 || O17 == obj3) {
                O17 = new h10(function02, kohVar3, cdiVar, e1dVar5, null, 19);
                av8Var.n0(O17);
            }
            Function2 function25 = (Function2) O17;
            d6b d6bVar = d6b.ON_RESUME;
            boolean i21 = av8Var.i(ku3Var) | av8Var.i(function23) | av8Var.i(function25);
            Object O18 = av8Var.O();
            if (i21 || O18 == obj3) {
                O18 = new l97(26, ku3Var, function23, function25);
                av8Var.n0(O18);
            }
            jca.b(d6bVar, u6bVar, (Function0) O18, av8Var, 6);
            Integer valueOf = Integer.valueOf(i4);
            boolean i22 = ((i13 & 3670016) == 1048576 ? true : z3) | (i14 == 4 ? true : z3) | av8Var.i(function23) | av8Var.i(function25);
            Object O19 = av8Var.O();
            if (i22 || O19 == obj3) {
                function2 = function23;
                function22 = function24;
                ru1 ru1Var = new ru1(i4, kohVar3, gv9Var, e1dVar3, znhVar, function2, function25, (rq3) null);
                av8Var.n0(ru1Var);
                O19 = ru1Var;
            } else {
                function2 = function23;
                function22 = function24;
            }
            hz8.o(av8Var, valueOf, (Function2) O19);
            cee ceeVar = kohVar4.e().c;
            Boolean bool = (Boolean) e1dVar3.getValue();
            bool.getClass();
            boolean i23 = av8Var.i(function22) | av8Var.i(function2);
            Object O20 = av8Var.O();
            if (i23 || O20 == obj3) {
                O20 = new t53((Object) e1dVar3, (Object) function22, (Object) function2, (rq3) u6bVar, 8);
                av8Var.n0(O20);
            }
            hz8.q(ceeVar, bool, (Function2) O20, av8Var);
            gv9 gv9Var3 = (gv9) e1dVar5.getValue();
            boolean i24 = av8Var.i(teeVar) | (i14 == 4 ? true : z3) | av8Var.g(e1dVar5);
            Object O21 = av8Var.O();
            if (i24 || O21 == obj3) {
                okf okfVar2 = new okf(gv9Var, kohVar3, cdiVar, teeVar, e1dVar5, e1dVar3, null, 0);
                kohVar5 = kohVar3;
                teeVar5 = teeVar;
                av8Var.n0(okfVar2);
                O21 = okfVar2;
            } else {
                kohVar5 = kohVar3;
                teeVar5 = teeVar;
            }
            hz8.o(av8Var, gv9Var3, (Function2) O21);
            xtc d2 = bkh.d(xtcVar, 1.0f);
            final boolean z11 = z5;
            final long j6 = j3;
            final tee teeVar8 = teeVar4;
            final long j7 = j;
            final long j8 = j2;
            boolean h2 = av8Var.h(z11) | (i10 == 16384 ? true : z3) | (i14 == 4 ? true : z3) | av8Var.i(teeVar5) | (i12 == 2048 ? true : z3) | av8Var.f(j6) | av8Var.g(teeVar8) | av8Var.f(j7) | av8Var.f(j8);
            final long j9 = j4;
            final tee teeVar9 = teeVar3;
            final e1d e1dVar8 = e1dVar4;
            boolean f2 = h2 | ((i13 & 458752) == 131072 ? true : z3) | av8Var.f(j9) | av8Var.i(teeVar9) | av8Var.g(e1dVar8);
            if (i11 == 8388608) {
                z3 = true;
            }
            final long j10 = j5;
            boolean f3 = f2 | z3 | av8Var.f(j10);
            Object O22 = av8Var.O();
            if (f3 || O22 == obj3) {
                xtcVar2 = d2;
                final koh kohVar12 = kohVar4;
                final xnh xnhVar3 = xnhVar;
                final koh kohVar13 = kohVar5;
                final koh kohVar14 = kohVar2;
                O22 = new Function1() { // from class: jkf
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        tee teeVar10;
                        koh kohVar15;
                        koh kohVar16;
                        float f4;
                        Iterator it6;
                        gv9 gv9Var4;
                        tee teeVar11;
                        c20 c20Var;
                        ykf ykfVar;
                        c20 c20Var2;
                        Pair pair;
                        te2 te2Var = (te2) obj5;
                        te2Var.getClass();
                        final float j11 = te2Var.j() * 16.0f;
                        final float j12 = te2Var.j() * 8.0f;
                        float j13 = te2Var.j() * 2.0f;
                        final float j14 = te2Var.j() * 1.0f;
                        c20 c20Var3 = new c20(new CornerPathEffect(j14));
                        c20 r = f5p.r(new float[]{j13, 3.0f * j13}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        int i25 = i3;
                        final boolean z12 = z11;
                        final ikf ikfVar = new ikf(i25, z12, j12, te2Var);
                        final n28 n28Var = new n28(8, j12, j11);
                        gv9 gv9Var5 = gv9.this;
                        int c4 = sub.c(k13.r(gv9Var5, 10));
                        if (c4 < 16) {
                            c4 = 16;
                        }
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(c4);
                        Iterator<E> it7 = gv9Var5.iterator();
                        while (true) {
                            boolean hasNext = it7.hasNext();
                            teeVar10 = teeVar5;
                            if (!hasNext) {
                                break;
                            }
                            RaceFlowModels$RaceEntrant raceFlowModels$RaceEntrant = (RaceFlowModels$RaceEntrant) it7.next();
                            List list = (List) teeVar10.get(Integer.valueOf(raceFlowModels$RaceEntrant.a));
                            if (list == null) {
                                list = km5.a;
                            }
                            boolean isEmpty = list.isEmpty();
                            int i26 = raceFlowModels$RaceEntrant.a;
                            if (isEmpty) {
                                pair = new Pair(Integer.valueOf(i26), e20.a());
                                c20Var2 = c20Var3;
                            } else {
                                Integer valueOf2 = Integer.valueOf(i26);
                                b20 a2 = e20.a();
                                Iterator it8 = list.iterator();
                                boolean z13 = true;
                                while (it8.hasNext()) {
                                    c20 c20Var4 = c20Var3;
                                    ykf ykfVar2 = (ykf) it8.next();
                                    Iterator it9 = it8;
                                    float floatValue = ((Number) ikfVar.invoke(Integer.valueOf(ykfVar2.a))).floatValue();
                                    float floatValue2 = ((Number) n28Var.invoke(Integer.valueOf(ykfVar2.b))).floatValue();
                                    if (z13) {
                                        a2.g(floatValue, floatValue2);
                                        z13 = false;
                                    } else {
                                        a2.f(floatValue, floatValue2);
                                    }
                                    it8 = it9;
                                    c20Var3 = c20Var4;
                                }
                                c20Var2 = c20Var3;
                                pair = new Pair(valueOf2, a2);
                            }
                            linkedHashMap4.put(pair.a, pair.b);
                            c20Var3 = c20Var2;
                        }
                        final c20 c20Var5 = c20Var3;
                        final tee X = l6g.X(linkedHashMap4);
                        Iterator it10 = gv9Var5.iterator();
                        while (true) {
                            boolean hasNext2 = it10.hasNext();
                            kohVar15 = kohVar14;
                            if (!hasNext2) {
                                break;
                            }
                            RaceFlowModels$RaceEntrant raceFlowModels$RaceEntrant2 = (RaceFlowModels$RaceEntrant) it10.next();
                            boolean z14 = raceFlowModels$RaceEntrant2.g;
                            int i27 = raceFlowModels$RaceEntrant2.a;
                            if (!z14) {
                                List list2 = (List) teeVar10.get(Integer.valueOf(i27));
                                if (list2 == null || (ykfVar = (ykf) CollectionsKt.j0(list2)) == null) {
                                    it6 = it10;
                                    gv9Var4 = gv9Var5;
                                    teeVar11 = teeVar10;
                                    c20Var = r;
                                } else {
                                    Integer valueOf3 = Integer.valueOf(i27);
                                    it6 = it10;
                                    teeVar11 = teeVar10;
                                    c20Var = r;
                                    dnd dndVar = new dnd((Float.floatToRawIntBits(((Number) ikfVar.invoke(Integer.valueOf(ykfVar.a))).floatValue()) << 32) | (Float.floatToRawIntBits(((Number) n28Var.invoke(Integer.valueOf(ykfVar.b))).floatValue()) & 4294967295L));
                                    if (kohVar15.containsKey("number_circle_position_" + i27)) {
                                        gv9Var4 = gv9Var5;
                                    } else {
                                        gv9Var4 = gv9Var5;
                                        kohVar15.put(ljg.j(i27, "number_circle_position_"), new q50(dndVar, lz.k, null, 12));
                                    }
                                    kohVar12.put(valueOf3, dndVar);
                                }
                                it10 = it6;
                                r = c20Var;
                                gv9Var5 = gv9Var4;
                                teeVar10 = teeVar11;
                            }
                        }
                        final gv9 gv9Var6 = gv9Var5;
                        final tee teeVar12 = teeVar10;
                        final c20 c20Var6 = r;
                        final int i28 = i2;
                        Number number = (Number) ikfVar.invoke(Integer.valueOf(i28));
                        float floatValue3 = number.floatValue();
                        final koh kohVar17 = kohVar13;
                        if (!kohVar17.containsKey("live_line_position")) {
                            kohVar17.put("live_line_position", ml4.b(floatValue3));
                        }
                        xnhVar3.i(number.floatValue());
                        q50 q50Var = (q50) kohVar17.get("path_clip_progress");
                        float floatValue4 = q50Var != null ? ((Number) q50Var.d()).floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        r62 r62Var = te2Var.a;
                        final float intBitsToFloat = z12 ? Float.intBitsToFloat((int) (r62Var.n() >> 32)) : (Float.intBitsToFloat((int) (r62Var.n() >> 32)) - j12) * floatValue4;
                        if (z12) {
                            kohVar16 = kohVar15;
                            f4 = me4.b(1.0f, floatValue4, Float.intBitsToFloat((int) (te2Var.a.n() >> 32)) - j12, j12);
                        } else {
                            kohVar16 = kohVar15;
                            f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                        final long j15 = j6;
                        final boolean z15 = z;
                        final tee teeVar13 = teeVar8;
                        final tee teeVar14 = teeVar9;
                        final long j16 = j8;
                        final long j17 = j7;
                        final cdi cdiVar3 = cdiVar2;
                        final cdi cdiVar4 = cdiVar;
                        final long j18 = j9;
                        final e1d e1dVar9 = e1dVar8;
                        final Integer num2 = num;
                        final long j19 = j10;
                        final koh kohVar18 = kohVar16;
                        final float f5 = f4;
                        return te2Var.a(new Function1() { // from class: lkf
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                float f6;
                                boolean z16;
                                sx2 sx2Var;
                                long j20;
                                tnh tnhVar;
                                tee X2;
                                float H0;
                                float H02;
                                Iterator it11;
                                long j21;
                                tee teeVar15;
                                koh kohVar19;
                                long j22;
                                tee teeVar16;
                                tee teeVar17;
                                ikf ikfVar2;
                                tnh tnhVar2;
                                n28 n28Var2;
                                long j23;
                                c20 c20Var7;
                                String str;
                                String str2;
                                long j24;
                                koh kohVar20;
                                long floatToRawIntBits;
                                int floatToRawIntBits2;
                                sx2 sx2Var2;
                                ha5 ha5Var;
                                long j25;
                                tee teeVar18;
                                ikf ikfVar3;
                                float f7;
                                sx2 sx2Var3;
                                float f8;
                                lkf lkfVar = this;
                                float f9 = f5;
                                float f10 = intBitsToFloat;
                                koh kohVar21 = kohVar17;
                                cdi cdiVar5 = cdiVar3;
                                cdi cdiVar6 = cdiVar4;
                                ha5 ha5Var2 = (ha5) obj6;
                                ha5Var2.getClass();
                                gv9 gv9Var7 = gv9.this;
                                int size = gv9Var7.size();
                                int i29 = 0;
                                while (true) {
                                    f6 = j12;
                                    z16 = z12;
                                    float f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    if (i29 >= size) {
                                        break;
                                    }
                                    if (z16) {
                                        f11 = f6;
                                    }
                                    float f12 = (j11 * i29) + f6;
                                    gv9 gv9Var8 = gv9Var7;
                                    float f13 = f9;
                                    ha5.W0(ha5Var2, j15, (Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32), (Float.floatToRawIntBits(z16 ? Float.intBitsToFloat((int) (ha5Var2.n() >> 32)) : Float.intBitsToFloat((int) (ha5Var2.n() >> 32)) - f6) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L), j14, 1, c20Var6, 448);
                                    i29++;
                                    gv9Var7 = gv9Var8;
                                    f9 = f13;
                                }
                                gv9<RaceFlowModels$RaceEntrant> gv9Var9 = gv9Var7;
                                float f14 = f9;
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L));
                                sx2 L0 = ha5Var2.L0();
                                long D6 = L0.D();
                                L0.t().o();
                                try {
                                    ((hpo) L0.a).q(f14, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, intBitsToFloat2, 1);
                                    gv9 gv9Var10 = (gv9) cdiVar5.getValue();
                                    int size2 = kohVar21.size();
                                    tnhVar = kohVar21.b;
                                    LinkedHashMap linkedHashMap5 = new LinkedHashMap(sub.c(size2));
                                    Iterator it12 = tnhVar.iterator();
                                    while (it12.hasNext()) {
                                        Object next3 = it12.next();
                                        linkedHashMap5.put(((Map.Entry) next3).getKey(), Float.valueOf(((Number) ((q50) ((Map.Entry) next3).getValue()).d()).floatValue()));
                                    }
                                    X2 = l6g.X(linkedHashMap5);
                                    H0 = ha5Var2.H0(4.0f);
                                    H02 = ha5Var2.H0(2.0f);
                                    it11 = gv9Var10.iterator();
                                } catch (Throwable th) {
                                    th = th;
                                    sx2Var = L0;
                                    j20 = D6;
                                }
                                while (true) {
                                    boolean hasNext3 = it11.hasNext();
                                    j21 = D6;
                                    teeVar15 = teeVar13;
                                    kohVar19 = kohVar21;
                                    j22 = j16;
                                    teeVar16 = teeVar12;
                                    teeVar17 = X;
                                    Iterator it13 = it11;
                                    ikfVar2 = ikfVar;
                                    tnhVar2 = tnhVar;
                                    n28Var2 = n28Var;
                                    float f15 = H0;
                                    j23 = j17;
                                    c20Var7 = c20Var5;
                                    str = "pit_circle_alpha_";
                                    str2 = "path_alpha_";
                                    Integer num3 = null;
                                    if (!hasNext3) {
                                        break;
                                    }
                                    try {
                                        cdi cdiVar7 = cdiVar6;
                                        RaceFlowModels$RaceEntrant raceFlowModels$RaceEntrant3 = (RaceFlowModels$RaceEntrant) it13.next();
                                        int i30 = raceFlowModels$RaceEntrant3.a;
                                        ha5 ha5Var3 = ha5Var2;
                                        b20 b20Var = (b20) teeVar17.get(Integer.valueOf(i30));
                                        if (b20Var == null || b20Var.a.isEmpty()) {
                                            lkfVar = this;
                                            D6 = j21;
                                            H0 = f15;
                                            it11 = it13;
                                            kohVar21 = kohVar19;
                                            tnhVar = tnhVar2;
                                            cdiVar6 = cdiVar7;
                                            ha5Var2 = ha5Var3;
                                        } else {
                                            RaceFlowModels$RaceTeam raceFlowModels$RaceTeam3 = raceFlowModels$RaceEntrant3.e;
                                            if (raceFlowModels$RaceTeam3 != null) {
                                                try {
                                                    num3 = Integer.valueOf(raceFlowModels$RaceTeam3.a);
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    sx2Var = L0;
                                                    j20 = j21;
                                                }
                                            }
                                            r13 r13Var = (r13) teeVar15.get(num3);
                                            long j26 = r13Var != null ? r13Var.a : j22;
                                            Float f16 = (Float) X2.get("path_alpha_" + i30);
                                            float floatValue5 = f16 != null ? f16.floatValue() : 0.0f;
                                            Float f17 = (Float) X2.get("pit_circle_alpha_" + i30);
                                            float floatValue6 = f17 != null ? f17.floatValue() : 0.0f;
                                            long c5 = r13.c(j26, floatValue5);
                                            boolean z17 = z16;
                                            sx2Var3 = L0;
                                            j24 = j21;
                                            tee teeVar19 = X2;
                                            float f18 = f6;
                                            long j27 = j26;
                                            ha5Var2 = ha5Var3;
                                            try {
                                                ha5.X0(ha5Var2, b20Var, c5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new jii(H02, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, c20Var7, 14), 52);
                                                List list3 = (List) teeVar16.get(Integer.valueOf(i30));
                                                if (list3 != null) {
                                                    ArrayList arrayList4 = new ArrayList();
                                                    for (Object obj7 : list3) {
                                                        if (((ykf) obj7).c) {
                                                            arrayList4.add(obj7);
                                                        }
                                                    }
                                                    Iterator it14 = arrayList4.iterator();
                                                    while (it14.hasNext()) {
                                                        ykf ykfVar3 = (ykf) it14.next();
                                                        float floatValue7 = ((Number) ikfVar2.invoke(Integer.valueOf(ykfVar3.a))).floatValue();
                                                        float floatValue8 = ((Number) n28Var2.invoke(Integer.valueOf(ykfVar3.b))).floatValue();
                                                        float f19 = f15;
                                                        ha5.U(ha5Var2, r13.c(j27, floatValue6), f19, (Float.floatToRawIntBits(floatValue7) << 32) | (Float.floatToRawIntBits(floatValue8) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 120);
                                                        ha5.U(ha5Var2, r13.c(j23, floatValue6), H02, (Float.floatToRawIntBits(floatValue7) << 32) | (Float.floatToRawIntBits(floatValue8) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 120);
                                                        f15 = f19;
                                                        j27 = j27;
                                                    }
                                                    f8 = f15;
                                                    Unit unit = Unit.a;
                                                } else {
                                                    f8 = f15;
                                                }
                                                lkfVar = this;
                                                L0 = sx2Var3;
                                                f6 = f18;
                                                it11 = it13;
                                                X2 = teeVar19;
                                                H0 = f8;
                                                z16 = z17;
                                                kohVar21 = kohVar19;
                                                tnhVar = tnhVar2;
                                                cdiVar6 = cdiVar7;
                                                D6 = j24;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                sx2Var = sx2Var3;
                                                j20 = j24;
                                                mz1.v(sx2Var, j20);
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        sx2Var3 = L0;
                                        j24 = j21;
                                    }
                                    j20 = j24;
                                    mz1.v(sx2Var, j20);
                                    throw th;
                                }
                                cdi cdiVar8 = cdiVar6;
                                float f20 = f6;
                                sx2Var = L0;
                                tee teeVar20 = teeVar16;
                                j24 = j21;
                                boolean z18 = z16;
                                try {
                                    gv9<RaceFlowModels$RaceEntrant> gv9Var11 = (gv9) cdiVar8.getValue();
                                    LinkedHashMap linkedHashMap6 = new LinkedHashMap(sub.c(kohVar19.size()));
                                    Iterator it15 = tnhVar2.iterator();
                                    while (it15.hasNext()) {
                                        Object next4 = it15.next();
                                        linkedHashMap6.put(((Map.Entry) next4).getKey(), Float.valueOf(((Number) ((q50) ((Map.Entry) next4).getValue()).d()).floatValue()));
                                        f20 = f20;
                                    }
                                    float f21 = f20;
                                    tee X3 = l6g.X(linkedHashMap6);
                                    float H03 = ha5Var2.H0(4.0f);
                                    float H04 = ha5Var2.H0(2.0f);
                                    for (RaceFlowModels$RaceEntrant raceFlowModels$RaceEntrant4 : gv9Var11) {
                                        try {
                                            int i31 = raceFlowModels$RaceEntrant4.a;
                                            b20 b20Var2 = (b20) teeVar17.get(Integer.valueOf(i31));
                                            if (b20Var2 != null) {
                                                try {
                                                    if (b20Var2.a.isEmpty()) {
                                                        continue;
                                                    } else {
                                                        RaceFlowModels$RaceTeam raceFlowModels$RaceTeam4 = raceFlowModels$RaceEntrant4.e;
                                                        r13 r13Var2 = (r13) teeVar15.get(raceFlowModels$RaceTeam4 != null ? Integer.valueOf(raceFlowModels$RaceTeam4.a) : null);
                                                        if (r13Var2 != null) {
                                                            ha5Var = ha5Var2;
                                                            j25 = r13Var2.a;
                                                        } else {
                                                            ha5Var = ha5Var2;
                                                            j25 = j22;
                                                        }
                                                        tee teeVar21 = teeVar17;
                                                        Float f22 = (Float) X3.get(str2 + i31);
                                                        float floatValue9 = f22 != null ? f22.floatValue() : 0.0f;
                                                        String str3 = str2;
                                                        Float f23 = (Float) X3.get(str + i31);
                                                        float floatValue10 = f23 != null ? f23.floatValue() : 0.0f;
                                                        long c6 = r13.c(j25, floatValue9);
                                                        tee teeVar22 = teeVar15;
                                                        sx2Var2 = sx2Var;
                                                        String str4 = str;
                                                        long j28 = j25;
                                                        ha5Var2 = ha5Var;
                                                        try {
                                                            ha5.X0(ha5Var2, b20Var2, c6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new jii(H04, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, c20Var7, 14), 52);
                                                            List list4 = (List) teeVar20.get(Integer.valueOf(i31));
                                                            if (list4 != null) {
                                                                ArrayList arrayList5 = new ArrayList();
                                                                for (Object obj8 : list4) {
                                                                    if (((ykf) obj8).c) {
                                                                        arrayList5.add(obj8);
                                                                    }
                                                                }
                                                                Iterator it16 = arrayList5.iterator();
                                                                while (it16.hasNext()) {
                                                                    ykf ykfVar4 = (ykf) it16.next();
                                                                    float floatValue11 = ((Number) ikfVar2.invoke(Integer.valueOf(ykfVar4.a))).floatValue();
                                                                    float floatValue12 = ((Number) n28Var2.invoke(Integer.valueOf(ykfVar4.b))).floatValue();
                                                                    float f24 = H03;
                                                                    ha5.U(ha5Var2, r13.c(j28, floatValue10), f24, (Float.floatToRawIntBits(floatValue11) << 32) | (Float.floatToRawIntBits(floatValue12) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 120);
                                                                    ha5.U(ha5Var2, r13.c(j23, floatValue10), H04, (Float.floatToRawIntBits(floatValue11) << 32) | (Float.floatToRawIntBits(floatValue12) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 120);
                                                                    H03 = f24;
                                                                    teeVar20 = teeVar20;
                                                                    ikfVar2 = ikfVar2;
                                                                }
                                                                teeVar18 = teeVar20;
                                                                ikfVar3 = ikfVar2;
                                                                f7 = H03;
                                                                Unit unit2 = Unit.a;
                                                            } else {
                                                                teeVar18 = teeVar20;
                                                                ikfVar3 = ikfVar2;
                                                                f7 = H03;
                                                            }
                                                            teeVar15 = teeVar22;
                                                            teeVar17 = teeVar21;
                                                            str2 = str3;
                                                            sx2Var = sx2Var2;
                                                            str = str4;
                                                            H03 = f7;
                                                            teeVar20 = teeVar18;
                                                            ikfVar2 = ikfVar3;
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            sx2Var = sx2Var2;
                                                            j20 = j24;
                                                            mz1.v(sx2Var, j20);
                                                            throw th;
                                                        }
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    sx2Var2 = sx2Var;
                                                }
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                        }
                                    }
                                    tee teeVar23 = teeVar15;
                                    mz1.v(sx2Var, j24);
                                    if (z15) {
                                        kohVar20 = kohVar19;
                                        q50 q50Var2 = (q50) kohVar20.get("live_line_position");
                                        if (q50Var2 != null) {
                                            float floatValue13 = ((Number) q50Var2.d()).floatValue();
                                            q50 q50Var3 = (q50) kohVar20.get("live_line_alpha");
                                            ha5.W0(ha5Var2, r13.c(j18, q50Var3 != null ? ((Number) q50Var3.d()).floatValue() : 0.0f), (Float.floatToRawIntBits(floatValue13) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (Float.floatToRawIntBits(floatValue13) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L))) & 4294967295L), ha5Var2.H0(2.0f), 2, null, 480);
                                            Unit unit3 = Unit.a;
                                        }
                                    } else {
                                        kohVar20 = kohVar19;
                                    }
                                    koh kohVar22 = kohVar18;
                                    LinkedHashMap linkedHashMap7 = new LinkedHashMap(sub.c(kohVar22.size()));
                                    Iterator it17 = kohVar22.b.iterator();
                                    while (it17.hasNext()) {
                                        Map.Entry entry = (Map.Entry) it17.next();
                                        Object key = entry.getKey();
                                        dnd dndVar2 = (dnd) ((q50) entry.getValue()).d();
                                        long j29 = dndVar2.a;
                                        linkedHashMap7.put(key, dndVar2);
                                    }
                                    tee X4 = l6g.X(linkedHashMap7);
                                    LinkedHashMap linkedHashMap8 = new LinkedHashMap(sub.c(kohVar20.size()));
                                    Iterator it18 = tnhVar2.iterator();
                                    while (it18.hasNext()) {
                                        Map.Entry entry2 = (Map.Entry) it18.next();
                                        linkedHashMap8.put(entry2.getKey(), Float.valueOf(((Number) ((q50) entry2.getValue()).d()).floatValue()));
                                    }
                                    tee X5 = l6g.X(linkedHashMap8);
                                    float H05 = ha5Var2.H0(8.0f);
                                    for (RaceFlowModels$RaceEntrant raceFlowModels$RaceEntrant5 : gv9Var9) {
                                        RaceFlowModels$RaceTeam raceFlowModels$RaceTeam5 = raceFlowModels$RaceEntrant5.e;
                                        int i32 = raceFlowModels$RaceEntrant5.a;
                                        r13 r13Var3 = (r13) teeVar23.get(raceFlowModels$RaceTeam5 != null ? Integer.valueOf(raceFlowModels$RaceTeam5.a) : null);
                                        long j30 = r13Var3 != null ? r13Var3.a : j22;
                                        dnd dndVar3 = (dnd) X4.get("number_circle_position_" + i32);
                                        if (dndVar3 != null) {
                                            long j31 = dndVar3.a;
                                            Float f25 = (Float) X5.get("number_circle_alpha_" + i32);
                                            float floatValue14 = f25 != null ? f25.floatValue() : 0.0f;
                                            if (floatValue14 > 0.01f) {
                                                ha5.U(ha5Var2, r13.c(j30, floatValue14), H05, j31, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 120);
                                                float f26 = H05;
                                                aej aejVar = (aej) teeVar14.get(Integer.valueOf(raceFlowModels$RaceEntrant5.b));
                                                if (aejVar != null) {
                                                    long j32 = aejVar.c;
                                                    o6a.w(ha5Var2, aejVar, 0L, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j31 >> 32)) - (((int) (j32 >> 32)) / 2.0f)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j31 & 4294967295L)) - (((int) (j32 & 4294967295L)) / 2.0f)) & 4294967295L), floatValue14, 242);
                                                }
                                                H05 = f26;
                                            }
                                        }
                                    }
                                    Float f27 = (Float) e1dVar9.getValue();
                                    if (f27 != null) {
                                        float floatValue15 = f27.floatValue();
                                        Integer num4 = num2;
                                        float f28 = (num4 != null && num4.intValue() == i28) ? f21 : 0.0f;
                                        float intBitsToFloat3 = z18 ? ((Float.intBitsToFloat((int) (ha5Var2.n() >> 32)) - f21) * (1.0f - floatValue15)) + f21 : floatValue15 * (Float.intBitsToFloat((int) (ha5Var2.n() >> 32)) - f21);
                                        float f29 = z18 ? 0.0f : intBitsToFloat3 + f28;
                                        if (z18) {
                                            float intBitsToFloat4 = Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L));
                                            floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat3 - f28);
                                            floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat4);
                                        } else {
                                            float intBitsToFloat5 = Float.intBitsToFloat((int) (ha5Var2.n() >> 32)) - f29;
                                            float intBitsToFloat6 = Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L));
                                            floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat5);
                                            floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat6);
                                        }
                                        ha5.o0(ha5Var2, r13.c(j19, 0.65f), (Float.floatToRawIntBits(f29) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 120);
                                        Unit unit4 = Unit.a;
                                    }
                                    return Unit.a;
                                } catch (Throwable th8) {
                                    th = th8;
                                }
                            }
                        });
                    }
                };
                av8Var = av8Var;
                av8Var.n0(O22);
            } else {
                xtcVar2 = d2;
            }
            nq8.h(av8Var, td4.Y(xtcVar2, (Function1) O22));
        } else {
            av8Var = r4;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kkf(gv9Var, teeVar, gv9Var2, i2, i3, z, i4, num, xtcVar, i5);
        }
    }

    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v32 */
    public static final void f(final xkf xkfVar, final gv9 gv9Var, final tee teeVar, final gv9 gv9Var2, final int i2, final int i3, final boolean z, final int i4, final Integer num, final Function1 function1, xtc xtcVar, of3 of3Var, final int i5) {
        av8 av8Var;
        final xtc xtcVar2;
        ?? r7;
        int i6;
        int i7;
        gv9Var.getClass();
        teeVar.getClass();
        gv9Var2.getClass();
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-480772031);
        int i8 = i5 | (av8Var2.e(xkfVar == null ? -1 : xkfVar.ordinal()) ? 4 : 2) | (av8Var2.g(gv9Var) ? 32 : 16) | (av8Var2.i(teeVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.g(gv9Var2) ? a.o : 1024) | (av8Var2.e(i2) ? 16384 : 8192) | (av8Var2.e(i3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var2.h(z) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var2.e(i4) ? 8388608 : 4194304) | (av8Var2.g(num) ? 67108864 : 33554432) | (av8Var2.i(function1) ? 536870912 : 268435456);
        if (av8Var2.T(i8 & 1, (i8 & 306783379) != 306783378)) {
            float size = ((gv9Var.size() - 1) * 4.0f) + (gv9Var.size() * 12.0f) + 4.0f;
            long u = ((kx4) av8Var2.k(dh3.h)).u(10.0f);
            boolean z2 = ((i8 & 458752) == 131072) | ((i8 & 14) == 4);
            Object O = av8Var2.O();
            char c2 = 0;
            if (z2 || O == nf3.a) {
                xkf.a.getClass();
                xbb b2 = kotlin.collections.a.b();
                int i9 = xkfVar == null ? -1 : vkf.a[xkfVar.ordinal()];
                if (i9 == 1 || i9 == 2) {
                    b2.add(new Pair(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), "GR"));
                    for (int i10 = 5; i10 <= i3; i10 += 5) {
                        b2.add(new Pair(Float.valueOf(i10 / i3), String.valueOf(i10)));
                    }
                    if (i3 % 5 != 0) {
                        b2.add(new Pair(Float.valueOf(1.0f), String.valueOf(i3)));
                    }
                } else {
                    v6a it = new IntRange(0, i3, 1).iterator();
                    while (it.c) {
                        int nextInt = it.nextInt();
                        b2.add(new Pair(Float.valueOf(nextInt / i3), String.valueOf(nextInt + 1)));
                    }
                }
                O = kotlin.collections.a.a(b2);
                av8Var2.n0(O);
            }
            List list = (List) O;
            utc utcVar = utc.a;
            xtc b0 = l98.b0(utcVar, 8.0f);
            l8g a2 = k8g.a(ww9.b, uxf.l, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, b0);
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
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            xtc d0 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, 1);
            utc utcVar2 = utcVar;
            char c3 = 0;
            u23 a3 = t23.a(new ng0(4.0f, true, new a70(6)), uxf.q, av8Var2, 54);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, d0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            av8Var2.d0(-271684259);
            int i11 = 0;
            for (Object obj : CollectionsKt.H0(gv9Var, new laf(5))) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    b.q();
                    throw null;
                }
                if (gv9Var2.contains(Integer.valueOf(((RaceFlowModels$RaceEntrant) obj).a))) {
                    i6 = -316840836;
                    i7 = R.color.n_lv_1;
                    r7 = 0;
                } else {
                    r7 = 0;
                    i6 = -316840356;
                    i7 = R.color.n_lv_3;
                }
                long f2 = ljg.f(av8Var2, i6, i7, av8Var2, r7);
                av8 av8Var3 = av8Var2;
                utc utcVar3 = utcVar2;
                cdi a4 = wih.a(f2, s02.h0(400, r7, null, 6), null, av8Var3, 48, 12);
                String valueOf2 = String.valueOf(i12);
                yf8 yf8Var = xth.a;
                udj.c(valueOf2, bkh.l(utcVar3, 12.0f), ((r13) a4.getValue()).a, null, 0L, null, 0L, null, new p7j(6), 0L, 0, false, 0, 0, null, dfj.a(xth.c(), 0L, u, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777213), av8Var3, 48, 0, 130040);
                size = size;
                utcVar2 = utcVar3;
                i11 = i12;
                av8Var2 = av8Var3;
                c3 = 0;
                c2 = 0;
            }
            av8 av8Var4 = av8Var2;
            float f3 = size;
            utc utcVar4 = utcVar2;
            av8Var4.s(false);
            av8Var4.s(true);
            xtc d2 = bkh.d(utcVar4, 1.0f);
            u23 a5 = t23.a(ww9.d, uxf.o, av8Var4, 0);
            int hashCode3 = Long.hashCode(av8Var4.T);
            aee m3 = av8Var4.m();
            xtc C3 = fqj.C(av8Var4, d2);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var4.h0();
            if (av8Var4.S) {
                av8Var4.l(zg3Var2);
            } else {
                av8Var4.q0();
            }
            f50 f50Var4 = hf3.g;
            waa.K(av8Var4, a5, f50Var4);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var4, m3, ff3Var2);
            Integer valueOf3 = Integer.valueOf(hashCode3);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var4, valueOf3, f50Var5);
            ry ryVar2 = hf3.k;
            waa.J(av8Var4, ryVar2);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var4, C3, f50Var6);
            xtc f0 = l98.f0(utcVar4, 7.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            k1c c4 = e12.c(uxf.c, false);
            int hashCode4 = Long.hashCode(av8Var4.T);
            aee m4 = av8Var4.m();
            xtc C4 = fqj.C(av8Var4, f0);
            av8Var4.h0();
            if (av8Var4.S) {
                av8Var4.l(zg3Var2);
            } else {
                av8Var4.q0();
            }
            waa.K(av8Var4, c4, f50Var4);
            waa.K(av8Var4, m4, ff3Var2);
            bf3.s(hashCode4, av8Var4, f50Var5, av8Var4, ryVar2);
            waa.K(av8Var4, C4, f50Var6);
            int i13 = 1;
            e(gv9Var, teeVar, gv9Var2, i2, i3, z, i4, num, bkh.e(utcVar4, f3), av8Var4, (i8 >> 3) & 33554430);
            int i14 = i8 >> 15;
            f6a.b(i3, i2, i4, function1, n12.a.b(l98.f0(utcVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11)), av8Var4, (i14 & 896) | (i14 & 14) | ((i8 >> 9) & 112) | ((i8 >> 18) & 7168));
            av8Var = av8Var4;
            av8Var.s(true);
            nq8.h(av8Var, bkh.e(utcVar4, 4.0f));
            ArrayList arrayList = new ArrayList(k13.r(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Float.valueOf(((Number) ((Pair) it2.next()).a).floatValue()));
            }
            a(l6g.W(arrayList), null, yqo.H(-1184618353, av8Var, new o43(list, i13)), av8Var, 3120);
            av8Var.s(true);
            av8Var.s(true);
            xtcVar2 = utcVar4;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new Function2(gv9Var, teeVar, gv9Var2, i2, i3, z, i4, num, function1, xtcVar2, i5) { // from class: mkf
                public final /* synthetic */ gv9 b;
                public final /* synthetic */ tee c;
                public final /* synthetic */ gv9 d;
                public final /* synthetic */ int e;
                public final /* synthetic */ int f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ int h;
                public final /* synthetic */ Integer i;
                public final /* synthetic */ Function1 j;
                public final /* synthetic */ xtc k;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int K = aba.K(1);
                    b6a.f(xkf.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (of3) obj2, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(int i2, int i3, Integer num, gv9 gv9Var, Function1 function1, xtc xtcVar, int i4, gv9 gv9Var2, of3 of3Var, int i5) {
        av8 av8Var;
        xtc xtcVar2;
        Object zp2Var;
        q50 q50Var;
        Object obj;
        utc utcVar;
        lmk lmkVar;
        Boolean bool;
        int i6;
        boolean z;
        TextPaint textPaint;
        float f2;
        Integer num2;
        int i7;
        zp2 zp2Var2;
        long j;
        int i8;
        c20 c20Var;
        int i9;
        long j2;
        xtc xtcVar3;
        gv9Var.getClass();
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1321387006);
        int i10 = i5 | (av8Var2.e(i2) ? 4 : 2) | (av8Var2.e(i3) ? 32 : 16) | (av8Var2.g(num) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.g(gv9Var) ? a.o : 1024) | (av8Var2.i(function1) ? 16384 : 8192) | 196608 | (av8Var2.e(i4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var2.g(gv9Var2) ? 8388608 : 4194304);
        if (av8Var2.T(i10 & 1, (i10 & 4793491) != 4793490)) {
            boolean z2 = av8Var2.k(dh3.n) == ema.b;
            kx4 kx4Var = (kx4) av8Var2.k(dh3.h);
            List j3 = b.j(new r13(lz.D(R.color.home_primary, av8Var2)), new r13(lz.D(R.color.away_primary, av8Var2)), new r13(lz.D(R.color.value, av8Var2)), new r13(lz.D(R.color.brand_tertiary_default, av8Var2)));
            long D = lz.D(R.color.n_lv_3, av8Var2);
            long D2 = lz.D(R.color.n_lv_4, av8Var2);
            long D3 = lz.D(R.color.surface_1, av8Var2);
            long D4 = lz.D(R.color.on_color_primary, av8Var2);
            lmk J = o6a.J(s6a.N(R.drawable.ic_x_16, 6, av8Var2), av8Var2);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = ml4.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                av8Var2.n0(O);
            }
            q50 q50Var2 = (q50) O;
            boolean i11 = av8Var2.i(q50Var2);
            Object O2 = av8Var2.O();
            if (i11 || O2 == a99Var) {
                O2 = new w07(q50Var2, null, 28);
                av8Var2.n0(O2);
            }
            hz8.o(av8Var2, gv9Var, (Function2) O2);
            boolean g2 = av8Var2.g(kx4Var);
            Object O3 = av8Var2.O();
            if (g2 || O3 == a99Var) {
                kx4Var.getClass();
                zp2Var = new zp2(kx4Var.H0(36.0f), kx4Var.H0(16.0f), kx4Var.H0(10.0f), kx4Var.H0(36.0f), kx4Var.H0(2.0f), kx4Var.H0(1.0f), kx4Var.H0(12.0f), kx4Var.H0(20.0f), kx4Var.h0(v8a.v(10)), kx4Var.H0(8.0f), kx4Var.H0(1.0f));
                av8Var2.n0(zp2Var);
            } else {
                zp2Var = O3;
            }
            zp2 zp2Var3 = (zp2) zp2Var;
            Object O4 = av8Var2.O();
            if (O4 == a99Var) {
                O4 = f5p.r(new float[]{10.0f, 20.0f}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                av8Var2.n0(O4);
            }
            c20 c20Var2 = (c20) O4;
            sf8 sf8Var = (sf8) av8Var2.k(dh3.k);
            yf8 yf8Var = xth.a;
            dfj c2 = xth.c();
            boolean g3 = av8Var2.g(sf8Var) | av8Var2.g(c2);
            Object O5 = av8Var2.O();
            if (g3 || O5 == a99Var) {
                pwh pwhVar = c2.a;
                tf8 tf8Var = pwhVar.f;
                wg8 wg8Var = pwhVar.c;
                if (wg8Var == null) {
                    wg8Var = wg8.h;
                }
                q50Var = q50Var2;
                Object value = sf8.a(sf8Var, tf8Var, wg8Var, 0, 12).getValue();
                value.getClass();
                O5 = (Typeface) value;
                av8Var2.n0(O5);
            } else {
                q50Var = q50Var2;
            }
            Typeface typeface = (Typeface) O5;
            boolean f3 = av8Var2.f(D) | av8Var2.g(typeface);
            Object O6 = av8Var2.O();
            if (f3 || O6 == a99Var) {
                TextPaint textPaint2 = new TextPaint();
                textPaint2.setTextAlign(Paint.Align.CENTER);
                textPaint2.setColor(hkg.s0(D));
                textPaint2.setTextSize(zp2Var3.i);
                textPaint2.setTypeface(typeface);
                textPaint2.setAntiAlias(true);
                av8Var2.n0(textPaint2);
                obj = textPaint2;
            } else {
                obj = O6;
            }
            TextPaint textPaint3 = (TextPaint) obj;
            float floatValue = ((Number) q50Var.d()).floatValue();
            utc utcVar2 = utc.a;
            xtc e2 = bkh.e(bkh.d(utcVar2, 1.0f), 320.0f);
            Integer valueOf = Integer.valueOf(i3);
            Boolean valueOf2 = Boolean.valueOf(z2);
            int i12 = i10 & 112;
            boolean g4 = av8Var2.g(zp2Var3) | (i12 == 32);
            int i13 = i10 & 14;
            boolean z3 = g4 | (i13 == 4);
            int i14 = i10 & 57344;
            boolean h2 = z3 | (i14 == 16384) | av8Var2.h(z2);
            Object O7 = av8Var2.O();
            if (h2 || O7 == a99Var) {
                utcVar = utcVar2;
                lmkVar = J;
                bool = valueOf2;
                i6 = i13;
                z = true;
                textPaint = textPaint3;
                f2 = floatValue;
                num2 = valueOf;
                i7 = i12;
                zp2Var2 = zp2Var3;
                j = D;
                i8 = i14;
                c20Var = c20Var2;
                i9 = i10;
                j2 = D4;
                O7 = new ttj(zp2Var2, i3, i2, function1, z2, 0);
                av8Var2.n0(O7);
            } else {
                utcVar = utcVar2;
                lmkVar = J;
                bool = valueOf2;
                i9 = i10;
                i6 = i13;
                z = true;
                textPaint = textPaint3;
                f2 = floatValue;
                num2 = valueOf;
                i7 = i12;
                zp2Var2 = zp2Var3;
                j2 = D4;
                j = D;
                c20Var = c20Var2;
                i8 = i14;
            }
            xtc b2 = koi.b(e2, num2, bool, (PointerInputEventHandler) O7);
            Integer valueOf3 = Integer.valueOf(i3);
            Boolean valueOf4 = Boolean.valueOf(z2);
            boolean g5 = av8Var2.g(zp2Var2) | (i7 == 32 ? z : false) | (i6 == 4 ? z : false) | (i8 == 16384 ? z : false) | av8Var2.h(z2);
            Object O8 = av8Var2.O();
            if (g5 || O8 == a99Var) {
                ttj ttjVar = new ttj(zp2Var2, i3, i2, function1, z2, 1);
                av8Var2.n0(ttjVar);
                O8 = ttjVar;
            }
            xtc b3 = koi.b(b2, valueOf3, valueOf4, (PointerInputEventHandler) O8);
            TextPaint textPaint4 = textPaint;
            boolean h3 = (i6 == 4 ? z : false) | av8Var2.h(z2) | av8Var2.g(zp2Var2) | (i7 == 32 ? z : false) | av8Var2.f(D2) | av8Var2.i(c20Var) | av8Var2.i(textPaint4) | ((i9 & 3670016) == 1048576 ? z : false) | ((i9 & 29360128) == 8388608 ? z : false);
            int i15 = i9;
            float f4 = f2;
            lmk lmkVar2 = lmkVar;
            zp2 zp2Var4 = zp2Var2;
            long j4 = j2;
            boolean g6 = h3 | ((i15 & 7168) == 2048 ? z : false) | av8Var2.g(j3) | av8Var2.d(f4) | av8Var2.i(lmkVar2) | av8Var2.f(j4);
            if ((i15 & 896) != 256) {
                z = false;
            }
            long j5 = j;
            boolean f5 = g6 | z | av8Var2.f(D3) | av8Var2.f(j5);
            Object O9 = av8Var2.O();
            if (f5 || O9 == a99Var) {
                xtcVar3 = b3;
                rtj rtjVar = new rtj(i2, z2, zp2Var4, i3, D2, c20Var, textPaint4, i4, gv9Var2, gv9Var, j3, f4, lmkVar2, j4, num, D3, j5);
                av8Var = av8Var2;
                av8Var.n0(rtjVar);
                O9 = rtjVar;
            } else {
                xtcVar3 = b3;
                av8Var = av8Var2;
            }
            lz.d(0, av8Var, xtcVar3, (Function1) O9);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x75(i2, i3, num, gv9Var, function1, xtcVar2, i4, gv9Var2, i5);
        }
    }

    public static void h(Parcel parcel, Integer num) {
        w1l.u(parcel, 1, num);
    }

    public static final boolean i(String str) {
        if (StringsKt.R(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        Locale[] availableLocales = Locale.getAvailableLocales();
        availableLocales.getClass();
        ArrayList arrayList = new ArrayList(availableLocales.length);
        for (Locale locale : availableLocales) {
            String languageTag = locale.toLanguageTag();
            languageTag.getClass();
            String lowerCase2 = languageTag.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            arrayList.add(lowerCase2);
        }
        Locale[] availableLocales2 = Locale.getAvailableLocales();
        availableLocales2.getClass();
        ArrayList arrayList2 = new ArrayList(availableLocales2.length);
        for (Locale locale2 : availableLocales2) {
            String language = locale2.getLanguage();
            language.getClass();
            String lowerCase3 = language.toLowerCase(Locale.ROOT);
            lowerCase3.getClass();
            arrayList2.add(lowerCase3);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((String) next).length() > 0) {
                arrayList3.add(next);
            }
        }
        return CollectionsKt.W0(CollectionsKt.w0(arrayList3, arrayList)).contains(lowerCase);
    }

    public static final e6a j(String str, String str2) {
        e6a e6aVar = new e6a();
        e6aVar.b = c6a.c;
        Context a2 = w.a();
        String str3 = null;
        try {
            PackageInfo packageInfo = a2.getPackageManager().getPackageInfo(a2.getPackageName(), 0);
            if (packageInfo != null) {
                str3 = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        e6aVar.d = str3;
        e6aVar.e = str;
        e6aVar.f = str2;
        Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        e6aVar.g = valueOf;
        StringBuffer stringBuffer = new StringBuffer("anr_log_");
        stringBuffer.append(String.valueOf(valueOf));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        stringBuffer2.getClass();
        e6aVar.a = stringBuffer2;
        return e6aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final e6a k(Throwable th, c6a c6aVar) {
        String str;
        PackageInfo packageInfo;
        e6a e6aVar = new e6a();
        e6aVar.b = c6aVar;
        Context a2 = w.a();
        String str2 = null;
        Throwable th2 = null;
        try {
            packageInfo = a2.getPackageManager().getPackageInfo(a2.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageInfo != null) {
            str = packageInfo.versionName;
            e6aVar.d = str;
            e6aVar.e = th != null ? null : th.getCause() == null ? th.toString() : String.valueOf(th.getCause());
            if (th != null) {
                JSONArray jSONArray = new JSONArray();
                while (th != null && th != th2) {
                    StackTraceElement[] stackTrace = th.getStackTrace();
                    stackTrace.getClass();
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        jSONArray.put(stackTraceElement.toString());
                    }
                    th2 = th;
                    th = th.getCause();
                }
                str2 = jSONArray.toString();
            }
            e6aVar.f = str2;
            Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
            e6aVar.g = valueOf;
            StringBuffer stringBuffer = new StringBuffer();
            int ordinal = c6aVar.ordinal();
            stringBuffer.append(ordinal == 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "anr_log_" : "analysis_log_");
            stringBuffer.append(String.valueOf(valueOf));
            stringBuffer.append(".json");
            String stringBuffer2 = stringBuffer.toString();
            stringBuffer2.getClass();
            e6aVar.a = stringBuffer2;
            return e6aVar;
        }
        str = null;
        e6aVar.d = str;
        e6aVar.e = th != null ? null : th.getCause() == null ? th.toString() : String.valueOf(th.getCause());
        if (th != null) {
        }
        e6aVar.f = str2;
        Long valueOf2 = Long.valueOf(System.currentTimeMillis() / 1000);
        e6aVar.g = valueOf2;
        StringBuffer stringBuffer3 = new StringBuffer();
        int ordinal2 = c6aVar.ordinal();
        stringBuffer3.append(ordinal2 == 1 ? ordinal2 != 2 ? ordinal2 != 3 ? ordinal2 != 4 ? ordinal2 != 5 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "anr_log_" : "analysis_log_");
        stringBuffer3.append(String.valueOf(valueOf2));
        stringBuffer3.append(".json");
        String stringBuffer22 = stringBuffer3.toString();
        stringBuffer22.getClass();
        e6aVar.a = stringBuffer22;
        return e6aVar;
    }

    public static final double l(Point2D point2D, Point2D point2D2) {
        point2D.getClass();
        point2D2.getClass();
        return Math.hypot(Math.abs(point2D.getX() - point2D2.getX()), Math.abs(point2D.getY() - point2D2.getY()));
    }

    public static final void m(Canvas canvas, String str, float f2, float f3, Paint paint, boolean z) {
        if (!z) {
            canvas.drawText(str, f2, f3, paint);
            return;
        }
        int save = canvas.save();
        try {
            canvas.scale(-1.0f, 1.0f, f2, f3);
            canvas.drawText(str, f2, f3, paint);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(pof pofVar, sq3 sq3Var) {
        eod eodVar;
        int i2;
        fsf fsfVar;
        fsf fsfVar2;
        IOException iOException;
        if (sq3Var instanceof eod) {
            eodVar = (eod) sq3Var;
            int i3 = eodVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eodVar.u = i3 - Integer.MIN_VALUE;
                Object obj = eodVar.t;
                lu3 lu3Var = lu3.a;
                i2 = eodVar.u;
                if (i2 != 0) {
                    fsf g2 = lnb.g(obj);
                    g2.a = "";
                    fsf fsfVar3 = new fsf();
                    g62 g3 = ml4.g(0, 7, null);
                    FirebasePerfOkHttpClient.enqueue(pofVar, new hcc(15, fsfVar3, g3, g2));
                    eodVar.r = g2;
                    eodVar.s = fsfVar3;
                    eodVar.u = 1;
                    if (g3.f(eodVar) == lu3Var) {
                        return lu3Var;
                    }
                    fsfVar = g2;
                    fsfVar2 = fsfVar3;
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsfVar2 = eodVar.s;
                    fsfVar = eodVar.r;
                    y6a.M(obj);
                }
                iOException = (IOException) fsfVar2.a;
                if (iOException != null) {
                    return fsfVar.a;
                }
                throw iOException;
            }
        }
        eodVar = new eod(sq3Var);
        Object obj2 = eodVar.t;
        lu3 lu3Var2 = lu3.a;
        i2 = eodVar.u;
        if (i2 != 0) {
        }
        iOException = (IOException) fsfVar2.a;
        if (iOException != null) {
        }
    }

    public static final float o(float f2) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f2) & 8589934591L) / 3)) + 709952852);
        float f3 = intBitsToFloat - ((intBitsToFloat - (f2 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f3 - ((f3 - (f2 / (f3 * f3))) * 0.33333334f);
    }

    public static void p(olk olkVar, int i2) {
        flk flkVar;
        String str;
        int i3;
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        if (i2 == 0) {
            throw null;
        }
        tkk tkkVar = olkVar.b;
        if (tkkVar == null || (flkVar = tkkVar.a) == null) {
            return;
        }
        ArrayList arrayList = flkVar.f;
        switch (i2) {
            case 1:
                str = "unknown";
                break;
            case 2:
                str = "xmlParsingError";
                break;
            case 3:
                str = "vastValidationError";
                break;
            case 4:
                str = "vastVersionNotSupported";
                break;
            case 5:
                str = "traffickingError";
                break;
            case 6:
                str = "playerExpectsDifferentLinearity";
                break;
            case 7:
                str = "playerExpectsDifferentDuration";
                break;
            case 8:
                str = "playerExpectsDifferentSize";
                break;
            case 9:
                str = "wrapperLimit";
                break;
            case 10:
                str = "adLoadTimeout";
                break;
            case 11:
                str = "generalLinearError";
                break;
            case 12:
                str = "mediaFileNotFound";
                break;
            case 13:
                str = "mediaFileTimeout";
                break;
            case 14:
                str = "supportedMediaFileNotFound";
                break;
            case 15:
                str = "mediaFileCantBePlayed";
                break;
            case 16:
                str = "cantFetchCompanionResource";
                break;
            case 17:
                str = "supportedCompanionResourceNotFound";
                break;
            default:
                throw null;
        }
        switch (i2) {
            case 1:
                i3 = 900;
                break;
            case 2:
                i3 = 100;
                break;
            case 3:
                i3 = 101;
                break;
            case 4:
                i3 = 102;
                break;
            case 5:
                i3 = 200;
                break;
            case 6:
                i3 = 201;
                break;
            case 7:
                i3 = 202;
                break;
            case 8:
                i3 = 203;
                break;
            case 9:
                i3 = Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE;
                break;
            case 10:
                i3 = Sdk.SDKError.Reason.AD_EXPIRED_VALUE;
                break;
            case 11:
                i3 = 400;
                break;
            case 12:
                i3 = 401;
                break;
            case 13:
                i3 = TTAdConstant.AD_ID_IS_NULL_CODE;
                break;
            case 14:
                i3 = 403;
                break;
            case 15:
                i3 = 405;
                break;
            case 16:
                i3 = IronSourceError.ERROR_BN_LOAD_WHILE_LONG_INITIATION;
                break;
            case 17:
                i3 = IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED;
                break;
            default:
                throw null;
        }
        g7a.w(tub.k(lm5Var, sub.d(new Pair(znb.errorCode, String.valueOf(i3)))), arrayList, str);
    }

    public static gnh q(a6e a6eVar, of3 of3Var, int i2) {
        v5e v5eVar = new v5e();
        ol4 a2 = iyh.a(of3Var);
        Map map = hwk.a;
        boolean z = true;
        g0i e0 = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, Float.valueOf(1.0f), 1);
        av8 av8Var = (av8) of3Var;
        kx4 kx4Var = (kx4) av8Var.k(dh3.h);
        ema emaVar = (ema) av8Var.k(dh3.n);
        boolean g2 = ((((i2 & 14) ^ 6) > 4 && av8Var.g(a6eVar)) || (i2 & 6) == 4) | av8Var.g(a2) | av8Var.g(e0);
        if ((((i2 & 112) ^ 48) <= 32 || !av8Var.g(v5eVar)) && (i2 & 48) != 32) {
            z = false;
        }
        boolean g3 = g2 | z | av8Var.g(kx4Var) | av8Var.e(emaVar.ordinal());
        Object O = av8Var.O();
        if (g3 || O == nf3.a) {
            gnh gnhVar = new gnh(new gsa(a6eVar, new yya(8, a6eVar, emaVar), v5eVar), a2, e0);
            av8Var.n0(gnhVar);
            O = gnhVar;
        }
        return (gnh) O;
    }

    public static final Pair r(Point2D point2D, Point2D point2D2) {
        double l = l(point2D, point2D2);
        return new Pair(Double.valueOf((point2D2.getX() - point2D.getX()) / l), Double.valueOf((point2D2.getY() - point2D.getY()) / l));
    }

    public static final xtc s(xtc xtcVar, wla wlaVar) {
        return xtcVar.z(new vla(wlaVar));
    }

    public static final float t(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    public static final int u(float f2, int i2, int i3) {
        return i2 + ((int) Math.round((i3 - i2) * f2));
    }

    public static final e6a v(File file) {
        file.getClass();
        e6a e6aVar = new e6a();
        String name = file.getName();
        name.getClass();
        e6aVar.a = name;
        e6aVar.b = c.v(name, "crash_log_", false) ? c6a.d : c.v(name, "shield_log_", false) ? c6a.e : c.v(name, "thread_check_log_", false) ? c6a.f : c.v(name, "analysis_log_", false) ? c6a.b : c.v(name, "anr_log_", false) ? c6a.c : c6a.a;
        JSONObject z = f6a.z(name);
        if (z != null) {
            e6aVar.g = Long.valueOf(z.optLong("timestamp", 0L));
            e6aVar.d = z.optString("app_version", null);
            e6aVar.e = z.optString("reason", null);
            e6aVar.f = z.optString("callstack", null);
            e6aVar.c = z.optJSONArray("feature_names");
        }
        return e6aVar;
    }

    public static final Point2D w(Point2D point2D, Point2D point2D2, float f2) {
        Pair r = r(point2D, point2D2);
        double doubleValue = ((Number) r.a).doubleValue();
        double doubleValue2 = ((Number) r.b).doubleValue();
        double d2 = f2;
        return new Point2D((doubleValue * d2) + point2D.getX(), (doubleValue2 * d2) + point2D.getY());
    }

    public static or4 x(a6e a6eVar, ewd ewdVar, of3 of3Var, int i2) {
        boolean z = (((i2 & 14) ^ 6) > 4 && ((av8) of3Var).g(a6eVar)) || (i2 & 6) == 4;
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        if (z || O == nf3.a) {
            O = new or4(a6eVar, ewdVar);
            av8Var.n0(O);
        }
        return (or4) O;
    }

    public static final File y(Context context, String str) {
        context.getClass();
        str.getClass();
        return gvd.v(context, str + ".preferences_pb");
    }

    public static final Object z(g6b g6bVar, e6b e6bVar, Function2 function2, rq3 rq3Var) {
        if (e6bVar == e6b.b) {
            a70.p("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
            return null;
        }
        if (g6bVar.b() == e6b.a) {
            return Unit.a;
        }
        Object r = s9a.r(new jce(g6bVar, e6bVar, function2, null, 1), rq3Var);
        return r == lu3.a ? r : Unit.a;
    }
}
