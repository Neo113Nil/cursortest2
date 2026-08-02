package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.View;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.ironsource.C4427z5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class oo extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oo(Object obj, int i) {
        super(1);
        this.i = i;
        this.j = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 0;
        int i2 = 1;
        rq3 rq3Var = null;
        switch (this.i) {
            case 0:
                po poVar = (po) obj;
                xma xmaVar = (xma) this.j;
                if (poVar.F() != Integer.MAX_VALUE) {
                    if (poVar.a().b) {
                        poVar.k();
                    }
                    for (Map.Entry entry : poVar.a().i.entrySet()) {
                        xmaVar.a((jo) entry.getKey(), ((Number) entry.getValue()).intValue(), poVar.y());
                    }
                    wdd wddVar = poVar.y().q;
                    wddVar.getClass();
                    while (!wddVar.equals(xmaVar.a.y())) {
                        for (jo joVar : xmaVar.b(wddVar).keySet()) {
                            xmaVar.a(joVar, xmaVar.c(wddVar, joVar), wddVar);
                        }
                        wddVar = wddVar.q;
                        wddVar.getClass();
                    }
                }
                return Unit.a;
            case 1:
                return Boolean.valueOf(((ne8) obj).r1(((md8) this.j).a));
            case 2:
                qkb qkbVar = (qkb) obj;
                xy xyVar = ((ky) this.j).p;
                if (xyVar.getInsetsListener().g.h() > 0) {
                    uzc uzcVar = gal.a;
                    qkbVar.a = true;
                    tkb tkbVar = qkbVar.d;
                    dma w0 = tkbVar.w0();
                    if (r6a.b(qkbVar.b, 9223372034707292159L)) {
                        qkbVar.b = s6a.L(w0.I(0L));
                        qkbVar.c = w0.e();
                    }
                    tkbVar.y0().G.b();
                    long e = w0.e();
                    x0d x0dVar = xyVar.getInsetsListener().f;
                    int i3 = (int) (e >> 32);
                    int i4 = (int) (e & 4294967295L);
                    eal[] ealVarArr = gal.b;
                    int length = ealVarArr.length;
                    int i5 = 0;
                    while (i5 < length) {
                        eal ealVar = ealVarArr[i5];
                        Object g = x0dVar.g(ealVar);
                        g.getClass();
                        ral ralVar = (ral) g;
                        qkb qkbVar2 = qkbVar;
                        gal.a(qkbVar2, ((fal) ealVar).c, ralVar.h, i3, i4);
                        if (((Boolean) ((eoh) ralVar.b).getValue()).booleanValue()) {
                            gal.a(qkbVar2, ralVar.f, ralVar.j, i3, i4);
                            gal.a(qkbVar2, ralVar.g, ralVar.k, i3, i4);
                        }
                        gal.a(qkbVar2, ((fal) ealVar).d, ralVar.i, i3, i4);
                        i5++;
                        qkbVar = qkbVar2;
                    }
                    qkb qkbVar3 = qkbVar;
                    l0d l0dVar = xyVar.getInsetsListener().h;
                    if (l0dVar.i()) {
                        SnapshotStateList snapshotStateList = xyVar.getInsetsListener().i;
                        Object[] objArr = l0dVar.a;
                        int i6 = l0dVar.b;
                        while (i < i6) {
                            e1d e1dVar = (e1d) objArr[i];
                            a4a a4aVar = (a4a) snapshotStateList.get(i);
                            Rect rect = (Rect) e1dVar.getValue();
                            qkbVar3.a(a4aVar.b(), rect.left);
                            qkbVar3.a(a4aVar.d(), rect.top);
                            qkbVar3.a(a4aVar.c(), rect.right);
                            qkbVar3.a(a4aVar.a(), rect.bottom);
                            i++;
                        }
                    }
                }
                return Unit.a;
            case 3:
                return Boolean.valueOf(((p6a) this.j).a(((s3h) obj).f));
            case 4:
                return Boolean.valueOf(wkn.F((s3h) obj, (Resources) this.j));
            case 5:
                ((wma) this.j).a0((kx4) obj);
                return Unit.a;
            case 6:
                return Boolean.valueOf(Intrinsics.c(obj, this.j));
            case 7:
                ((j8f) ((k8f) this.j)).d(null);
                return Unit.a;
            case 8:
                oqf oqfVar = (oqf) obj;
                q32 q32Var = (q32) this.j;
                if (q32Var.n) {
                    xw3.L(q32Var.Y0(), null, null, new hy1(q32Var, oqfVar, rq3Var, i2), 3);
                }
                return Unit.a;
            case 9:
                i80 i80Var = (i80) obj;
                float f = i80Var.b;
                float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f3 = i80Var.c;
                if (f3 < -0.5f) {
                    f3 = -0.5f;
                }
                if (f3 > 0.5f) {
                    f3 = 0.5f;
                }
                float f4 = i80Var.d;
                float f5 = f4 >= -0.5f ? f4 : -0.5f;
                float f6 = f5 <= 0.5f ? f5 : 0.5f;
                float f7 = i80Var.a;
                if (f7 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f2 = f7;
                }
                return new r13(r13.b(hkg.a(f, f3, f6, f2 <= 1.0f ? f2 : 1.0f, l23.x), (j23) this.j));
            case 10:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) this.j).cancel();
                }
                return Unit.a;
            case 11:
                return new le((s55) this.j, 8);
            case 12:
                f4g f4gVar = (f4g) obj;
                j7l j7lVar = (j7l) this.j;
                if (!Float.isNaN(j7lVar.d) || !Float.isNaN(j7lVar.e)) {
                    f4gVar.s(uaa.h(Float.isNaN(j7lVar.d) ? 0.5f : j7lVar.d, Float.isNaN(j7lVar.e) ? 0.5f : j7lVar.e));
                }
                if (!Float.isNaN(j7lVar.f)) {
                    f4gVar.g(j7lVar.f);
                }
                if (!Float.isNaN(j7lVar.g)) {
                    f4gVar.h(j7lVar.g);
                }
                if (!Float.isNaN(j7lVar.h)) {
                    f4gVar.i(j7lVar.h);
                }
                if (!Float.isNaN(j7lVar.i)) {
                    f4gVar.w(j7lVar.i);
                }
                if (!Float.isNaN(j7lVar.j)) {
                    f4gVar.y(j7lVar.j);
                }
                if (!Float.isNaN(j7lVar.k)) {
                    f4gVar.m(j7lVar.k);
                }
                if (!Float.isNaN(j7lVar.l) || !Float.isNaN(j7lVar.m)) {
                    f4gVar.k(Float.isNaN(j7lVar.l) ? 1.0f : j7lVar.l);
                    f4gVar.l(Float.isNaN(j7lVar.m) ? 1.0f : j7lVar.m);
                }
                if (!Float.isNaN(j7lVar.n)) {
                    f4gVar.b(j7lVar.n);
                }
                return Unit.a;
            case 13:
                return Boolean.valueOf(!Intrinsics.c(obj, ((eoh) ((axj) this.j).d).getValue()));
            case 14:
                ((f4g) obj).b(((Number) ((cdi) this.j).getValue()).floatValue());
                return Unit.a;
            case 15:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                Collection collection = (Collection) this.j;
                View view = (View) entry2.getValue();
                WeakHashMap weakHashMap = bsk.a;
                return Boolean.valueOf(CollectionsKt.R(collection, view.getTransitionName()));
            case 16:
                ((m45) this.j).k = true;
                return Unit.a;
            case 17:
                g85 g85Var = (g85) obj;
                if (!g85Var.a.n) {
                    return iyj.b;
                }
                h85 h85Var = g85Var.q;
                if (h85Var != null) {
                    h85Var.G((a85) this.j);
                }
                g85Var.q = null;
                g85Var.p = null;
                return iyj.a;
            case 18:
                if (e09.b.compareAndSet(false, true)) {
                    ((g62) this.j).d(Unit.a);
                }
                return Unit.a;
            case 19:
                String str = (String) obj;
                Object opt = ((JSONObject) this.j).opt(str);
                if (opt == null) {
                    return null;
                }
                try {
                    return URLEncoder.encode(str, C.UTF8_NAME) + C4427z5.U + URLEncoder.encode(opt.toString(), C.UTF8_NAME);
                } catch (Exception unused) {
                    return null;
                }
            case 20:
                ha5 ha5Var = (ha5) obj;
                n29 n29Var = (n29) this.j;
                b20 b20Var = n29Var.l;
                if (n29Var.n && n29Var.w && b20Var != null) {
                    sx2 L0 = ha5Var.L0();
                    long D = L0.D();
                    L0.t().o();
                    try {
                        ((hpo) L0.a).p(b20Var);
                        n29Var.d(ha5Var);
                    } finally {
                        mz1.v(L0, D);
                    }
                } else {
                    n29Var.d(ha5Var);
                }
                return Unit.a;
            case 21:
                ha5 ha5Var2 = (ha5) obj;
                q29 q29Var = (q29) this.j;
                uj2 t = ha5Var2.L0().t();
                Function2 function2 = q29Var.d;
                if (function2 != null) {
                    function2.invoke(t, (n29) ha5Var2.L0().b);
                }
                return Unit.a;
            case 22:
                ujk ujkVar = (ujk) obj;
                u39 u39Var = (u39) this.j;
                u39Var.g(ujkVar);
                Function1 function1 = u39Var.i;
                if (function1 != null) {
                    function1.invoke(ujkVar);
                }
                return Unit.a;
            case 23:
                if (!((rf9) obj).q) {
                    return iyj.a;
                }
                ((asf) this.j).a = false;
                return iyj.c;
            case 24:
                sid sidVar = (sid) obj;
                InputConnection inputConnection = sidVar.b;
                if (inputConnection != null) {
                    inputConnection.closeConnection();
                    sidVar.b = null;
                }
                g4a g4aVar = (g4a) this.j;
                i1d i1dVar = g4aVar.d;
                Object[] objArr2 = i1dVar.a;
                int i7 = i1dVar.c;
                while (true) {
                    if (i >= i7) {
                        i = -1;
                    } else if (!Intrinsics.c((e0l) objArr2[i], sidVar)) {
                        i++;
                    }
                }
                if (i >= 0) {
                    i1dVar.r(i);
                }
                if (i1dVar.c == 0) {
                    g4aVar.b.invoke();
                }
                return Unit.a;
            case 25:
                o7a o7aVar = (o7a) this.j;
                synchronized (o7aVar.c) {
                    o7aVar.d = 5;
                    o7aVar.f = null;
                }
                return Unit.a;
            case 26:
                nwf nwfVar = (nwf) obj;
                xla xlaVar = (xla) this.j;
                ((eoh) xlaVar.o.a).setValue(nwfVar);
                xlaVar.q = nwfVar;
                return Unit.a;
            case 27:
                ((ddb) this.j).cancel(false);
                return Unit.a;
            case 28:
                ((kmb) obj).getClass();
                return (Integer) this.j;
            default:
                ((i1d) this.j).b((vtc) obj);
                return Boolean.TRUE;
        }
    }
}
