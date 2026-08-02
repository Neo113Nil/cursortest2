package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.ads.internal.api.AdComponentViewParentApi;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.C4427z5;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.mvvm.model.Event;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class dad implements rgj, AdComponentViewParentApi, yc0, znl, w1g, nu, n32, iq2, ij2, ya3, SuccessContinuation, vfb, tf0, sm6 {
    public static final String[] c = {"_data"};
    public static final jle d = new jle(15);
    public final /* synthetic */ int a;
    public Object b;

    public dad(int i) {
        this.a = i;
        switch (i) {
            case 11:
                break;
            case 20:
                this.b = o1j.u(Looper.getMainLooper());
                break;
            case 21:
                this.b = new yvh(s02.e);
                break;
            case 24:
                this.b = new we2(false, 5, 1.0f, 1);
                break;
            case 27:
                this.b = new g7h(this);
                break;
            default:
                int i2 = opn.a;
                this.b = new d1l(new e4o[]{mx9.i, d}, 16);
                break;
        }
    }

    public static String A(Bundle bundle, String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public static dad w(int i, int i2, int i3, int i4, boolean z) {
        return new dad(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z), 3);
    }

    @Override // defpackage.ya3
    public void a(k55 k55Var) {
        ((ya3) this.b).a(k55Var);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super/*android.view.ViewGroup*/.addView(view, i, layoutParams);
    }

    @Override // defpackage.vfb
    public void b(yfb yfbVar, long j, long j2, boolean z) {
        ((id4) this.b).u((x9e) yfbVar, j, j2);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public void bringChildToFront(View view) {
        super/*android.view.ViewGroup*/.bringChildToFront(view);
    }

    @Override // defpackage.sm6
    public Object c() {
        nc3 nc3Var = (nc3) this.b;
        return new jo5((oz8) nc3Var.a, (oz8) nc3Var.b, (oz8) nc3Var.c, (oz8) nc3Var.d, (sn5) nc3Var.e, (sn5) nc3Var.f, (sx2) nc3Var.g);
    }

    @Override // defpackage.vfb
    public void d(yfb yfbVar, long j, long j2) {
        x9e x9eVar = (x9e) yfbVar;
        id4 id4Var = (id4) this.b;
        long j3 = x9eVar.a;
        xe4 xe4Var = x9eVar.b;
        tei teiVar = x9eVar.d;
        lfb lfbVar = new lfb(xe4Var, teiVar.c, teiVar.d, j, j2, teiVar.b);
        id4Var.m.getClass();
        id4Var.q.v(lfbVar, x9eVar.c, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        zc4 zc4Var = (zc4) x9eVar.f;
        zc4 zc4Var2 = id4Var.G;
        int size = zc4Var2 == null ? 0 : zc4Var2.m.size();
        long j4 = zc4Var.a(0).b;
        int i = 0;
        while (i < size && id4Var.G.a(i).b < j4) {
            i++;
        }
        if (zc4Var.d) {
            if (size - i > zc4Var.m.size()) {
                tgj.d0("Loaded out of sync manifest");
            } else {
                long j5 = id4Var.M;
                if (j5 == C.TIME_UNSET || zc4Var.h * 1000 > j5) {
                    id4Var.L = 0;
                } else {
                    tgj.d0("Loaded stale dynamic manifest: " + zc4Var.h + ", " + id4Var.M);
                }
            }
            int i2 = id4Var.L;
            id4Var.L = i2 + 1;
            if (i2 < id4Var.m.n(x9eVar.c)) {
                id4Var.D.postDelayed(id4Var.v, Math.min((id4Var.L - 1) * 1000, 5000));
                return;
            } else {
                id4Var.C = new jz2();
                return;
            }
        }
        id4Var.G = zc4Var;
        id4Var.H = zc4Var.d & id4Var.H;
        id4Var.I = j - j2;
        id4Var.J = j;
        id4Var.N += i;
        synchronized (id4Var.t) {
            if (x9eVar.b.a.equals(id4Var.E)) {
                Uri uri = id4Var.G.k;
                if (uri == null) {
                    uri = c6o.Y(x9eVar.d.c);
                }
                id4Var.E = uri;
            }
        }
        zc4 zc4Var3 = id4Var.G;
        if (!zc4Var3.d || id4Var.K != C.TIME_UNSET) {
            id4Var.w(true);
            return;
        }
        tm0 tm0Var = zc4Var3.i;
        if (tm0Var == null) {
            id4Var.t();
            return;
        }
        String str = tm0Var.b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                id4Var.K = nik.W(tm0Var.c) - id4Var.J;
                id4Var.w(true);
                return;
            } catch (s9e e) {
                id4Var.v(e);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            id4Var.x(tm0Var, new gd4());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            id4Var.x(tm0Var, new f8h(20));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            id4Var.t();
        } else {
            id4Var.v(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // defpackage.tf0
    public Object e(oug ougVar, Float f, Float f2, Function1 function1, fnh fnhVar) {
        Object m = kda.m(ougVar, f.floatValue(), t62.a(28, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2.floatValue()), (ol4) this.b, function1, fnhVar);
        return m == lu3.a ? m : (z70) m;
    }

    @Override // defpackage.iq2
    public void f(Event event) {
        ((z03) this.b).q(event);
    }

    @Override // defpackage.rgj
    public Cursor h(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return ((ContentResolver) this.b).query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, c, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
    }

    @Override // defpackage.ij2
    public void j(Typeface typeface) {
        b13 b13Var = (b13) this.b;
        if (b13Var.t(typeface)) {
            b13Var.l(false);
        }
    }

    @Override // defpackage.iq2
    public View k() {
        return (z03) this.b;
    }

    @Override // defpackage.vfb
    public void l(yfb yfbVar, long j, long j2, int i) {
        lfb lfbVar;
        x9e x9eVar = (x9e) yfbVar;
        id4 id4Var = (id4) this.b;
        if (i == 0) {
            long j3 = x9eVar.a;
            lfbVar = new lfb(x9eVar.b, j);
        } else {
            long j4 = x9eVar.a;
            xe4 xe4Var = x9eVar.b;
            tei teiVar = x9eVar.d;
            lfbVar = new lfb(xe4Var, teiVar.c, teiVar.d, j, j2, teiVar.b);
        }
        id4Var.q.y(lfbVar, x9eVar.c, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, i);
    }

    @Override // defpackage.nu
    public void m(Bundle bundle, String str) {
        mw3 mw3Var = (mw3) this.b;
        if (mw3Var != null) {
            try {
                String str2 = "$A$:" + A(bundle, str);
                nw3 nw3Var = mw3Var.a;
                nw3Var.getClass();
                ((xx3) nw3Var.o.b).h(new lw3(nw3Var, System.currentTimeMillis() - nw3Var.d, str2));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // defpackage.w1g
    public e1g o(e1g e1gVar, uvd uvdVar) {
        Resources resources = (Resources) this.b;
        if (e1gVar == null) {
            return null;
        }
        return new ex1(resources, e1gVar);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
    }

    @Override // defpackage.ya3
    public void onComplete() {
        ((ya3) this.b).onComplete();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
    }

    @Override // defpackage.ya3
    public void onError(Throwable th) {
        ((ya3) this.b).onComplete();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public void onMeasure(int i, int i2) {
        super/*android.widget.FrameLayout*/.onMeasure(i, i2);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public void onVisibilityChanged(View view, int i) {
        super/*android.view.View*/.onVisibilityChanged(view, i);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public void onWindowFocusChanged(boolean z) {
        super/*android.view.View*/.onWindowFocusChanged(z);
    }

    @Override // defpackage.iq2
    public void p(Event event) {
        ((z03) this.b).setEvent(event);
    }

    @Override // defpackage.n32
    public void q(mw3 mw3Var) {
        this.b = mw3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vfb
    public r5a r(yfb yfbVar, long j, long j2, IOException iOException, int i) {
        long min;
        x9e x9eVar = (x9e) yfbVar;
        id4 id4Var = (id4) this.b;
        long j3 = x9eVar.a;
        xe4 xe4Var = x9eVar.b;
        tei teiVar = x9eVar.d;
        lfb lfbVar = new lfb(xe4Var, teiVar.c, teiVar.d, j, j2, teiVar.b);
        int i2 = x9eVar.c;
        id4Var.m.getClass();
        for (Throwable th = iOException; th != null; th = th.getCause()) {
            if ((th instanceof s9e) || (th instanceof FileNotFoundException) || (th instanceof mi9) || (th instanceof cgb) || ((th instanceof te4) && ((te4) th).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i - 1) * 1000, 5000);
        r5a r5aVar = min == C.TIME_UNSET ? x6k.g : new r5a(min, 0, 0 == true ? 1 : 0);
        id4Var.q.x(lfbVar, i2, iOException, !r5aVar.b());
        return r5aVar;
    }

    public void s(wma wmaVar) {
        if (!wmaVar.H()) {
            r3a.b("DepthSortedSet.add called on an unattached node");
        }
        ((yvh) this.b).add(wmaVar);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super/*android.view.View*/.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
    public void setMeasuredDimension(int i, int i2) {
        super/*android.view.View*/.setMeasuredDimension(i, i2);
    }

    public void t(StringBuilder sb, Iterator it) {
        ih2 ih2Var = (ih2) this.b;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(ih2Var.f(entry.getKey()));
            sb.append(U3.j.b);
            sb.append(ih2Var.f(entry.getValue()));
            while (it.hasNext()) {
                sb.append((CharSequence) ih2Var.b);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(ih2Var.f(entry2.getKey()));
                sb.append(U3.j.b);
                sb.append(ih2Var.f(entry2.getValue()));
            }
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        bah bahVar = (bah) obj;
        jw3 jw3Var = ((hw3) this.b).e;
        if (bahVar == null) {
            return Tasks.forResult(null);
        }
        dw3 dw3Var = jw3.r;
        return Tasks.whenAll((Task<?>[]) new Task[]{jw3Var.g(), jw3Var.m.h(null, (xx3) jw3Var.e.b)});
    }

    public String toString() {
        switch (this.a) {
            case 21:
                return ((yvh) this.b).toString();
            default:
                return super.toString();
        }
    }

    public void u(sfb sfbVar, vvk vvkVar) {
        sfbVar.getClass();
        vvkVar.getClass();
        if (sfbVar != sfb.b && sfbVar != sfb.c) {
            hg6.e(sfbVar, "invalid load type for reset: ");
            return;
        }
        g7h g7hVar = (g7h) this.b;
        synchronized (((v9f) g7hVar.e)) {
            eb9 eb9Var = (eb9) g7hVar.b;
            eb9 eb9Var2 = (eb9) g7hVar.c;
            if (sfbVar == sfb.b) {
                eb9Var.a(vvkVar);
            } else {
                eb9Var2.a(vvkVar);
            }
            Unit unit = Unit.a;
            Unit unit2 = Unit.a;
        }
    }

    public omb v(Context context, String str, InputStream inputStream, String str2, String str3) {
        omb h;
        x08 x08Var;
        t9d t9dVar = (t9d) this.b;
        if (str2 == null) {
            str2 = C4427z5.M;
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            ajb.a();
            x08 x08Var2 = x08.ZIP;
            h = str3 != null ? ulb.h(context, new ZipInputStream(new FileInputStream(t9dVar.n(str, inputStream, x08Var2))), str) : ulb.h(context, new ZipInputStream(inputStream), null);
            x08Var = x08Var2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            ajb.a();
            x08Var = x08.GZIP;
            if (str3 != null) {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(t9dVar.n(str, inputStream, x08Var)));
                HashMap hashMap = ulb.a;
                h = ulb.e(f6a.I(gZIPInputStream), str);
            } else {
                GZIPInputStream gZIPInputStream2 = new GZIPInputStream(inputStream);
                HashMap hashMap2 = ulb.a;
                h = ulb.e(f6a.I(gZIPInputStream2), null);
            }
        } else {
            ajb.a();
            x08Var = x08.JSON;
            if (str3 != null) {
                FileInputStream fileInputStream = new FileInputStream(t9dVar.n(str, inputStream, x08Var).getAbsolutePath());
                HashMap hashMap3 = ulb.a;
                h = ulb.e(f6a.I(fileInputStream), str);
            } else {
                HashMap hashMap4 = ulb.a;
                h = ulb.e(f6a.I(inputStream), null);
            }
        }
        if (str3 != null && h.a != null) {
            File file = new File(t9dVar.j(), t9d.a(str, x08Var, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean renameTo = file.renameTo(file2);
            file2.toString();
            ajb.a();
            if (!renameTo) {
                ajb.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return h;
    }

    public void x(dbc dbcVar, mac macVar, Collection collection) {
        yz8 yz8Var = (yz8) this.b;
        if (dbcVar != yz8Var.y || macVar == null) {
            if (dbcVar == yz8Var.e) {
                if (macVar != null) {
                    yz8Var.p(yz8Var.d, macVar);
                }
                lbc a = yz8Var.d.a();
                if (a != null) {
                    a.p(collection);
                    return;
                }
                return;
            }
            return;
        }
        nbc nbcVar = yz8Var.x.a;
        String d2 = macVar.d();
        lbc lbcVar = new lbc(nbcVar, d2, yz8Var.b(nbcVar, d2));
        lbcVar.i(macVar);
        if (yz8Var.d == lbcVar) {
            return;
        }
        dbc dbcVar2 = yz8Var.y;
        obc obcVar = yz8Var.x;
        mbc mbcVar = yz8Var.f;
        if (mbcVar != null) {
            ebc ebcVar = mbcVar.a;
            if (!mbcVar.i && !mbcVar.j) {
                mbcVar.j = true;
                if (ebcVar != null) {
                    ebcVar.h(0);
                    ebcVar.d();
                }
            }
            yz8Var.f = null;
        }
        mbc mbcVar2 = new mbc(yz8Var, lbcVar, dbcVar2, 3, true, obcVar, collection);
        yz8Var.f = mbcVar2;
        mbcVar2.a();
        yz8Var.x = null;
        yz8Var.y = null;
    }

    public void y(ArrayList arrayList) {
        Iterator it = ((bk6) this.b).c.iterator();
        it.getClass();
        if (it.hasNext()) {
            throw lnb.i(it);
        }
    }

    public boolean z(wma wmaVar) {
        if (!wmaVar.H()) {
            r3a.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((yvh) this.b).remove(wmaVar);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public void addView(View view) {
        super/*android.view.ViewGroup*/.addView(view);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public void addView(View view, int i) {
        super/*android.view.ViewGroup*/.addView(view, i);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super/*android.view.ViewGroup*/.addView(view, layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdComponentView
    public void addView(View view, int i, int i2) {
        super/*android.view.ViewGroup*/.addView(view, i, i2);
    }

    @Override // defpackage.yc0
    public void g(int i) {
    }

    @Override // defpackage.yc0
    public void n(int i) {
    }

    public void i(int i, float f) {
    }

    public /* synthetic */ dad(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ dad(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
    }

    public dad(sa3 sa3Var, ya3 ya3Var) {
        this.a = 14;
        this.b = ya3Var;
    }

    public dad(zm0 zm0Var) {
        this.a = 8;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(zm0Var.a).setFlags(zm0Var.b).setUsage(zm0Var.c);
        int i = lik.a;
        if (i >= 29) {
            wm0.a(usage, zm0Var.d);
        }
        if (i >= 32) {
            xm0.a(usage, zm0Var.e);
        }
        this.b = usage.build();
    }
}
