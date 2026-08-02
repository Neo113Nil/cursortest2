package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.WindowInsetsController;
import android.widget.ImageView;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.common.api.internal.zaaz;
import com.google.android.gms.common.api.internal.zabv;
import com.google.android.gms.common.internal.zam;
import com.google.android.gms.internal.ads.zzadd;
import com.google.android.gms.internal.ads.zzadn;
import com.google.android.gms.internal.ads.zzaek;
import com.google.firebase.perf.metrics.Counter;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.PerfSession;
import com.ironsource.C4094gc;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class bka implements ph2, dg2, zli, l55, PAGAppOpenAdInteractionListener, x9f, dtk, gn5, gml, zam, zzadd {
    public final /* synthetic */ int a;
    public Object b;

    public bka(int i) {
        this.a = i;
        switch (i) {
            case 11:
                this.b = new nkb((Object) null);
                break;
            case 15:
                this.b = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
                break;
            case 20:
                sx2 sx2Var = new sx2();
                sx2Var.a = this;
                sx2Var.b = new j2d();
                this.b = sx2Var;
                break;
            case 23:
                this.b = new SparseArray();
                break;
            case 25:
                this.b = new sf5(0);
                break;
            default:
                this.b = new j9e();
                break;
        }
    }

    public static boolean u(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static void z(String str) {
        if (str.startsWith("gcm.n.")) {
            str.substring(6);
        }
    }

    @Override // defpackage.x9f
    public void a(int i, Object obj) {
        if (i == 6 || i == 7 || i == 8) {
        }
        ((ProfileInstallReceiver) this.b).setResultCode(i);
    }

    public ut3 b(ut3 ut3Var) {
        return ut3Var instanceof lwf ? ut3Var : new mk(-((qzb) this.b).l(), ut3Var);
    }

    public fsj c() {
        List unmodifiableList;
        csj w = fsj.w();
        w.q(((Trace) this.b).d);
        w.o(((Trace) this.b).k.a);
        Trace trace = (Trace) this.b;
        w.p(trace.k.b(trace.l));
        for (Counter counter : ((Trace) this.b).e.values()) {
            w.m(counter.b.get(), counter.a);
        }
        ArrayList arrayList = ((Trace) this.b).h;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                w.j(new bka((Trace) it.next(), 24).c());
            }
        }
        w.l(((Trace) this.b).getAttributes());
        Trace trace2 = (Trace) this.b;
        synchronized (trace2.g) {
            try {
                ArrayList arrayList2 = new ArrayList();
                for (PerfSession perfSession : trace2.g) {
                    if (perfSession != null) {
                        arrayList2.add(perfSession);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList2);
            } catch (Throwable th) {
                throw th;
            }
        }
        sde[] b = PerfSession.b(unmodifiableList);
        if (b != null) {
            w.d(Arrays.asList(b));
        }
        return (fsj) w.build();
    }

    @Override // defpackage.l55
    public void d() {
        boolean z;
        switch (this.a) {
            case 9:
                av4 av4Var = (av4) this.b;
                if (av4Var.isActive()) {
                    av4Var.e(null);
                    return;
                }
                return;
            default:
                dvk c = l.c((ImageView) this.b);
                synchronized (c) {
                    z = this != c.b;
                }
                if (z) {
                    return;
                }
                l.c((ImageView) this.b).a();
                return;
        }
    }

    @Override // defpackage.ph2
    public void e(zg2 zg2Var, c2g c2gVar) {
        lj2 lj2Var = (lj2) this.b;
        if (!c2gVar.a.q) {
            p2g p2gVar = w2g.b;
            lj2Var.resumeWith(new u2g(new wi9(c2gVar)));
            return;
        }
        Object obj = c2gVar.b;
        if (obj != null) {
            p2g p2gVar2 = w2g.b;
            lj2Var.resumeWith(obj);
            return;
        }
        qzf H = zg2Var.H();
        H.getClass();
        Object c = H.c(duf.a.getOrCreateKotlinClass(dba.class));
        c.getClass();
        dba dbaVar = (dba) c;
        gka gkaVar = new gka("Response from " + dbaVar.a.getName() + '.' + dbaVar.c.getName() + " was null but response body type was declared as non-null");
        p2g p2gVar3 = w2g.b;
        lj2Var.resumeWith(new u2g(gkaVar));
    }

    public Object f(String str, Map map, pag pagVar) {
        String C = fc6.C();
        gc2 gc2Var = gc2.d;
        gc2 o = q1f.o(C);
        zdc zdcVar = ezc.g;
        ArrayList arrayList = new ArrayList();
        zdc zdcVar2 = ezc.h;
        zdcVar2.getClass();
        if (!Intrinsics.c(zdcVar2.b, "multipart")) {
            hg6.e(zdcVar2, "multipart != ");
            return null;
        }
        String jSONObject = new JSONObject(map).toString();
        jSONObject.getClass();
        yzf.Companion.getClass();
        arrayList.add(sha.p("jsonMessage", null, xzf.b(jSONObject, null)));
        if (arrayList.isEmpty()) {
            a70.r("Multipart body must have at least one part.");
            return null;
        }
        ezc ezcVar = new ezc(o, zdcVar2, yol.j(arrayList));
        pzf pzfVar = new pzf();
        pzfVar.f(str);
        pzfVar.e(C4094gc.b, ezcVar);
        return b6a.n(new pof((jod) this.b, new qzf(pzfVar)), pagVar);
    }

    @Override // defpackage.zli
    public void h(byte[] bArr, int i, int i2, yli yliVar, wn3 wn3Var) {
        m74 a;
        j9e j9eVar = (j9e) this.b;
        j9eVar.L(bArr, i2 + i);
        j9eVar.N(i);
        ArrayList arrayList = new ArrayList();
        while (j9eVar.a() > 0) {
            z1a.r("Incomplete Mp4Webvtt Top Level box header found.", j9eVar.a() >= 8);
            int m = j9eVar.m();
            if (j9eVar.m() == 1987343459) {
                int i3 = m - 8;
                CharSequence charSequence = null;
                k74 k74Var = null;
                while (i3 > 0) {
                    z1a.r("Incomplete vtt cue box header found.", i3 >= 8);
                    int m2 = j9eVar.m();
                    int m3 = j9eVar.m();
                    int i4 = m2 - 8;
                    byte[] bArr2 = j9eVar.a;
                    int i5 = j9eVar.b;
                    String str = nik.a;
                    String str2 = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    j9eVar.O(i4);
                    i3 = (i3 - 8) - i4;
                    if (m3 == 1937011815) {
                        d2l d2lVar = new d2l();
                        f2l.e(str2, d2lVar);
                        k74Var = d2lVar.b();
                    } else if (m3 == 1885436268) {
                        charSequence = f2l.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (k74Var != null) {
                    k74Var.a = charSequence;
                    k74Var.b = null;
                    a = k74Var.a();
                } else {
                    Pattern pattern = f2l.a;
                    d2l d2lVar2 = new d2l();
                    d2lVar2.c = charSequence;
                    a = d2lVar2.b().a();
                }
                arrayList.add(a);
            } else {
                j9eVar.O(m - 8);
            }
        }
        wn3Var.accept(new q74(arrayList, C.TIME_UNSET, C.TIME_UNSET));
    }

    @Override // defpackage.gn5
    public boolean i(Object obj, File file, uvd uvdVar) {
        InputStream inputStream = (InputStream) obj;
        kn4 kn4Var = (kn4) this.b;
        byte[] bArr = (byte[]) kn4Var.d(C.DEFAULT_BUFFER_SEGMENT_SIZE, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, read);
                } catch (IOException unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    kn4Var.j(bArr);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    kn4Var.j(bArr);
                    throw th;
                }
            }
            fileOutputStream2.close();
            try {
                fileOutputStream2.close();
            } catch (IOException unused4) {
            }
            kn4Var.j(bArr);
            return true;
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.gml
    public lw1 k(String str, int i, EnumMap enumMap) {
        if (i == 15) {
            return ((sf5) this.b).k("0".concat(String.valueOf(str)), 8, enumMap);
        }
        a70.p("Can only encode UPC-A, but got ".concat(fn0.C(i)));
        return null;
    }

    @Override // defpackage.zli
    public int l() {
        return 2;
    }

    @Override // defpackage.ph2
    public void m(zg2 zg2Var, Throwable th) {
        lj2 lj2Var = (lj2) this.b;
        p2g p2gVar = w2g.b;
        lj2Var.resumeWith(new u2g(th));
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public void n(float f) {
        zzadn zzadnVar = (zzadn) this.b;
        zzaek zzaekVar = zzadnVar.C0.b;
        if (zzaekVar.e != f) {
            zzaekVar.e = f;
            zzaekVar.b(false);
        }
        zzadnVar.r0(zzadnVar.L);
    }

    public boolean o(String str) {
        String s = s(str);
        return "1".equals(s) || Boolean.parseBoolean(s);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
        MediationAppOpenAdCallback mediationAppOpenAdCallback = ((m7e) this.b).d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
        MediationAppOpenAdCallback mediationAppOpenAdCallback = ((m7e) this.b).d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdClosed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
        m7e m7eVar = (m7e) this.b;
        MediationAppOpenAdCallback mediationAppOpenAdCallback = m7eVar.d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdOpened();
            m7eVar.d.reportAdImpression();
        }
    }

    public Integer p(String str) {
        String s = s(str);
        if (TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(s));
        } catch (NumberFormatException unused) {
            z(str);
            return null;
        }
    }

    public JSONArray q(String str) {
        String s = s(str);
        if (TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            return new JSONArray(s);
        } catch (JSONException unused) {
            z(str);
            return null;
        }
    }

    public String r(Resources resources, String str, String str2) {
        String[] strArr;
        String s = s(str2);
        if (!TextUtils.isEmpty(s)) {
            return s;
        }
        String s2 = s(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(s2)) {
            return null;
        }
        int identifier = resources.getIdentifier(s2, "string", str);
        if (identifier == 0) {
            z(str2.concat("_loc_key"));
            return null;
        }
        JSONArray q = q(str2.concat("_loc_args"));
        if (q == null) {
            strArr = null;
        } else {
            int length = q.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = q.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException unused) {
            z(str2);
            Arrays.toString(strArr);
            return null;
        }
    }

    public String s(String str) {
        Bundle bundle = (Bundle) this.b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public boolean t() {
        zabv zabvVar = ((zaaz) this.b).d;
        return zabvVar != null && zabvVar.e();
    }

    public void v(Exception exc) {
        m6k.C("Audio sink error", exc);
        qo0 qo0Var = ((t2c) this.b).F0;
        Handler handler = qo0Var.a;
        if (handler != null) {
            handler.post(new no0(qo0Var, exc, 7));
        }
    }

    public Bundle w() {
        Bundle bundle = (Bundle) this.b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public yih x(k1d k1dVar, xy xyVar) {
        long j;
        boolean z;
        long L;
        nkb nkbVar = (nkb) this.b;
        nkb nkbVar2 = new nkb(((ArrayList) k1dVar.b).size());
        ArrayList arrayList = (ArrayList) k1dVar.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            oze ozeVar = (oze) arrayList.get(i);
            long j2 = ozeVar.a;
            nze nzeVar = (nze) nkbVar.c(j2);
            if (nzeVar == null) {
                j = ozeVar.b;
                L = ozeVar.d;
                z = false;
            } else {
                long j3 = nzeVar.a;
                j = j3;
                z = nzeVar.c;
                L = xyVar.L(nzeVar.b);
            }
            long j4 = ozeVar.a;
            int i2 = i;
            ArrayList arrayList2 = arrayList;
            int i3 = size;
            nkbVar2.g(new mze(j4, ozeVar.b, ozeVar.d, ozeVar.e, ozeVar.f, j, L, z, ozeVar.g, ozeVar.i, ozeVar.j, ozeVar.k, ozeVar.l, ozeVar.m), j4);
            boolean z2 = ozeVar.e;
            if (z2) {
                nkbVar.g(new nze(z2, ozeVar.b, ozeVar.c), j2);
            } else {
                nkbVar.h(j2);
            }
            i = i2 + 1;
            arrayList = arrayList2;
            size = i3;
        }
        return new yih(nkbVar2, k1dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|26|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0028, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if (r6.a != r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        throw r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r5v0, types: [bka, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object y(cl clVar, sq3 sq3Var) {
        mih mihVar;
        int i;
        if (sq3Var instanceof mih) {
            mihVar = (mih) sq3Var;
            int i2 = mihVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mihVar.t = i2 - Integer.MIN_VALUE;
                Object obj = mihVar.r;
                lu3 lu3Var = lu3.a;
                i = mihVar.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    v1f v1fVar = new v1f((Object) this, clVar, rq3Var, 23);
                    mihVar.t = 1;
                    Object r = s9a.r(v1fVar, mihVar);
                    this = r;
                    if (r == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    this = this;
                }
                return Unit.a;
            }
        }
        mihVar = new mih(this, sq3Var);
        Object obj2 = mihVar.r;
        lu3 lu3Var2 = lu3.a;
        i = mihVar.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        return Unit.a;
    }

    public /* synthetic */ bka(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public bka(b10 b10Var) {
        this.a = 16;
        this.b = ufa.n(b10Var.f());
    }

    public bka(mpg mpgVar) {
        this.a = 27;
        this.b = new WeakReference(mpgVar);
    }

    public bka(View view) {
        this.a = 21;
        if (Build.VERSION.SDK_INT >= 30) {
            ovh ovhVar = new ovh(view, 18);
            ovhVar.c = view;
            this.b = ovhVar;
            return;
        }
        this.b = new yia(view, 18);
    }

    public bka(Bundle bundle) {
        this.a = 7;
        this.b = new Bundle(bundle);
    }

    public bka(WindowInsetsController windowInsetsController) {
        this.a = 21;
        ovh ovhVar = new ovh(null, 18);
        ovhVar.d = windowInsetsController;
        this.b = ovhVar;
    }

    public /* synthetic */ bka(int i, boolean z) {
        this.a = i;
    }
}
