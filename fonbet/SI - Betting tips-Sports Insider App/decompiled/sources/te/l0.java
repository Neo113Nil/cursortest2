package te;

import android.app.DownloadManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.net.Uri;
import android.os.Environment;
import androidx.lifecycle.k1;
import androidx.lifecycle.p0;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import eg.m0;
import eg.t1;
import hg.d1;
import hg.u0;
import j$.time.Instant;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l0 extends k1 {

    /* renamed from: b, reason: collision with root package name */
    public final p0 f23898b;

    /* renamed from: c, reason: collision with root package name */
    public final p0 f23899c;

    /* renamed from: d, reason: collision with root package name */
    public final md.m f23900d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f23901e;

    /* renamed from: f, reason: collision with root package name */
    public String f23902f;

    /* renamed from: g, reason: collision with root package name */
    public String f23903g;

    /* renamed from: h, reason: collision with root package name */
    public final p0 f23904h;

    /* renamed from: i, reason: collision with root package name */
    public t1 f23905i;
    public final d1 j;

    /* renamed from: k, reason: collision with root package name */
    public final p0 f23906k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f23907l;

    /* renamed from: m, reason: collision with root package name */
    public final p0 f23908m;

    /* renamed from: n, reason: collision with root package name */
    public long f23909n;

    public l0() {
        p0 p0Var = new p0(null);
        this.f23898b = p0Var;
        this.f23899c = p0Var;
        this.f23900d = new md.m();
        this.f23901e = -1;
        this.f23904h = new p0(f0.f23874a);
        this.j = u0.b(kotlin.collections.e0.f19204a);
        Boolean bool = Boolean.FALSE;
        this.f23906k = new p0(bool);
        this.f23907l = new AtomicBoolean(false);
        this.f23908m = new p0(bool);
    }

    public static final void e(l0 l0Var, String str) {
        p0 p0Var = l0Var.f23904h;
        if (CollectionsKt.A(lc.d.f19672b, str)) {
            l0Var.f23902f = str;
            p0Var.h(f0.f23877d);
        } else if (!CollectionsKt.A(lc.d.f19671a, str)) {
            l0Var.p();
        } else {
            l0Var.f23902f = str;
            p0Var.h(f0.f23876c);
        }
    }

    public static sd.d h(ka.a supportData) {
        Intrinsics.checkNotNullParameter(supportData, "supportData");
        ArrayList arrayList = new ArrayList();
        String str = supportData.f18951g;
        String str2 = supportData.j;
        String str3 = supportData.f18954k;
        String str4 = supportData.f18952h;
        if (str == null) {
            if (str4 != null) {
                arrayList.add(sd.n.f23498e);
            }
            if (str3 != null && str2 != null && supportData.f18948d >= 2) {
                arrayList.add(sd.n.f23499f);
                arrayList.add(sd.n.f23500g);
                arrayList.add(sd.n.f23502i);
            }
            if (supportData.f18948d < 2) {
                arrayList.add(sd.n.f23497d);
                arrayList.add(sd.n.f23501h);
            }
        } else {
            if (str4 != null) {
                arrayList.add(sd.n.f23498e);
            }
            if (str3 != null && str2 != null) {
                arrayList.add(sd.n.f23499f);
                arrayList.add(sd.n.f23500g);
                arrayList.add(sd.n.f23502i);
            }
        }
        return new sd.d(arrayList, 2);
    }

    @Override // androidx.lifecycle.k1
    public final void d() {
        t1 t1Var = this.f23905i;
        if (t1Var != null) {
            t1Var.k(null);
        }
        this.f23905i = null;
    }

    public final void f(ka.a supportData) {
        Intrinsics.checkNotNullParameter(supportData, "supportData");
        new cd.d().g("delete_cache_file");
        md.m mVar = this.f23900d;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(supportData, "supportData");
        eg.c0.t(MyApp.f6830c, mVar.f20574c, null, new kd.e(mVar, supportData, (Continuation) null, 25), 2);
    }

    public final void g(ka.a supportData) {
        Intrinsics.checkNotNullParameter(supportData, "supportData");
        new cd.d().g("save_content");
        String str = supportData.j;
        String str2 = supportData.f18954k;
        this.f23900d.getClass();
        gf.t b10 = gf.k.b(new id.a(13));
        gf.t b11 = gf.k.b(new id.a(14));
        try {
            ((zc.k) b10.getValue()).getClass();
            Intrinsics.checkNotNullParameter("download", "name");
            za.i iVar = (za.i) zc.k.e();
            iVar.getClass();
            Intrinsics.checkNotNullParameter("download", "name");
            Object systemService = iVar.f25901a.getSystemService("download");
            Intrinsics.checkNotNullExpressionValue(systemService, "getSystemService(...)");
            DownloadManager downloadManager = systemService instanceof DownloadManager ? (DownloadManager) systemService : null;
            if (downloadManager != null && str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
                Uri parse = Uri.parse(str2);
                ((zc.k) b10.getValue()).getClass();
                String f6 = zc.k.f(R.string.app_name);
                StringBuilder sb2 = new StringBuilder();
                ((zc.k) b10.getValue()).getClass();
                sb2.append(zc.k.f(R.string.technical_support));
                sb2.append(' ');
                sb2.append(str);
                String sb3 = sb2.toString();
                String str3 = Environment.DIRECTORY_DOWNLOADS;
                StringBuilder sb4 = new StringBuilder();
                String format = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.getDefault()).format(new Date());
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                sb4.append(format);
                sb4.append("  ");
                sb4.append(kotlin.text.z.m(kotlin.text.z.m(str, "image/", "."), "application/", "."));
                String sb5 = sb4.toString();
                DownloadManager.Request request = new DownloadManager.Request(parse);
                request.setAllowedNetworkTypes(3);
                request.setTitle(f6);
                request.setDescription(sb3);
                request.setMimeType(str);
                request.setNotificationVisibility(0);
                request.setDestinationInExternalPublicDir(str3, sb5);
                downloadManager.enqueue(request);
                rc.z.a((rc.z) b11.getValue(), "Download successfully to " + parse.getPath());
            }
        } catch (Exception e7) {
            zc.d.b(4, "downloadToDownloadFolderS", e7);
        }
    }

    public final void i(boolean z5) {
        AtomicBoolean atomicBoolean = this.f23907l;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        Boolean bool = Boolean.TRUE;
        p0 p0Var = this.f23906k;
        p0Var.j(bool);
        int i5 = 0;
        if (!z5 && this.f23909n + 300 >= Instant.now().getEpochSecond()) {
            atomicBoolean.set(false);
            p0Var.j(Boolean.FALSE);
        } else {
            u1.a i10 = androidx.lifecycle.d1.i(this);
            lg.e eVar = m0.f9201a;
            eg.c0.t(i10, lg.d.f20063c, null, new j0(this, null, i5), 2);
        }
    }

    public final void j(Uri uri) {
        if (uri == null) {
            return;
        }
        u1.a i5 = androidx.lifecycle.d1.i(this);
        lg.e eVar = m0.f9201a;
        eg.c0.t(i5, jg.q.f18523a, null, new i0(this, uri, null), 2);
    }

    public final void k(y1.c0 c0Var) {
        u1.a i5 = androidx.lifecycle.d1.i(this);
        lg.e eVar = m0.f9201a;
        eg.c0.t(i5, jg.q.f18523a, null, new me.y(c0Var, this, null, 29), 2);
    }

    public final void l(ka.a supportData) {
        Intrinsics.checkNotNullParameter(supportData, "supportData");
        String txt = supportData.f18952h;
        if (txt == null) {
            return;
        }
        new cd.d().g("copy");
        this.f23900d.getClass();
        Intrinsics.checkNotNullParameter("MsgSupport", "lbl");
        Intrinsics.checkNotNullParameter(txt, "txt");
        gf.t b10 = gf.k.b(new id.a(13));
        gf.t b11 = gf.k.b(new id.a(14));
        Intrinsics.checkNotNullParameter("MsgSupport", "lbl");
        Intrinsics.checkNotNullParameter(txt, "txt");
        try {
            ((zc.k) b10.getValue()).getClass();
            Intrinsics.checkNotNullParameter("clipboard", "name");
            za.i iVar = (za.i) zc.k.e();
            iVar.getClass();
            Intrinsics.checkNotNullParameter("clipboard", "name");
            Object systemService = iVar.f25901a.getSystemService("clipboard");
            Intrinsics.checkNotNullExpressionValue(systemService, "getSystemService(...)");
            ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
            if (clipboardManager == null) {
                throw new Exception("ClipboardManager is null");
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText("MsgSupport", txt));
            rc.z.a((rc.z) b11.getValue(), "Copy");
        } catch (Exception e7) {
            zc.d.b(4, "clipboard", e7);
            rc.z.a((rc.z) b11.getValue(), "Error copy");
        }
    }

    public final void m(String str) {
        new cd.d().f(null, null, null);
        Integer num = this.f23901e;
        this.f23900d.getClass();
        gf.t b10 = gf.k.b(new id.a(13));
        gf.k.b(new id.a(14));
        ((zc.k) b10.getValue()).getClass();
        if (md.a.a(new WeakReference(((za.i) zc.k.e()).f25901a), str, num, null)) {
            new cd.d().h();
        }
    }

    public final void n(ka.a supportData) {
        Intrinsics.checkNotNullParameter(supportData, "supportData");
        String str = supportData.f18954k;
        this.f23900d.getClass();
        gf.t b10 = gf.k.b(new id.a(13));
        gf.k.b(new id.a(14));
        boolean z5 = false;
        if (str != null) {
            try {
                String encode = Uri.encode(str, "UTF-8");
                ((zc.k) b10.getValue()).getClass();
                WeakReference weakReference = new WeakReference(((za.i) zc.k.e()).f25901a);
                if (encode != null) {
                    z5 = zc.e.e(encode, weakReference, null);
                }
            } catch (Exception e7) {
                zc.d.b(4, "toLinkS", e7);
            }
        }
        if (z5) {
            new cd.d().g("open_browser");
        } else {
            o(supportData);
        }
    }

    public final void o(ka.a supportData) {
        Intrinsics.checkNotNullParameter(supportData, "supportData");
        new cd.d().g("share");
        String str = supportData.j;
        String str2 = supportData.f18954k;
        this.f23900d.getClass();
        gf.t b10 = gf.k.b(new id.a(13));
        gf.t b11 = gf.k.b(new id.a(14));
        try {
            ((zc.k) b10.getValue()).getClass();
            u6.h.v(new WeakReference(((za.i) zc.k.e()).f25901a), str, str2);
        } catch (Exception e7) {
            zc.d.b(4, "shareContentS", e7);
            rc.z.a((rc.z) b11.getValue(), "Error");
        }
    }

    public final void p() {
        this.f23904h.h(f0.f23874a);
        this.f23902f = null;
        this.f23903g = null;
    }
}
