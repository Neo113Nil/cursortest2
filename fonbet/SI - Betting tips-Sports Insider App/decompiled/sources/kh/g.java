package kh;

import android.content.ClipDescription;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzom;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okio.Sink;
import okio.Socket;
import okio.Source;
import org.json.JSONException;
import s7.e2;
import s7.f1;
import s7.g2;
import s7.j2;
import s7.l0;
import s7.n0;
import s7.p0;
import s7.r0;
import s7.r3;
import s7.s3;
import s7.x;
import s7.y2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class g implements Socket, r0.f, g2, p0, gf.i, y9.c {

    /* renamed from: e, reason: collision with root package name */
    public static g f19113e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19114a;

    /* renamed from: b, reason: collision with root package name */
    public Object f19115b;

    /* renamed from: c, reason: collision with root package name */
    public Object f19116c;

    /* renamed from: d, reason: collision with root package name */
    public Object f19117d;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i5) {
        this.f19114a = i5;
        this.f19115b = obj;
        this.f19116c = obj2;
        this.f19117d = obj3;
    }

    @Override // y9.c
    public y9.b a(y9.a aVar) {
        g gVar = (g) this.f19117d;
        try {
            File file = (File) ((HashMap) this.f19116c).remove(aVar);
            if (file == null || !file.exists()) {
                throw new IOException("Expected a pending batch file but found none.");
            }
            gVar.getClass();
            File file2 = new File(file.getAbsolutePath() + ".metadata");
            if (file2.exists()) {
                return new z9.a(aVar, file, file2, gVar);
            }
            throw new IOException("Metadata file does not exist for " + aVar.toString());
        } catch (Throwable th2) {
            gVar.o((File) gVar.f19115b);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0136  */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.String] */
    @Override // s7.g2, s7.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(String str, int i5, Throwable th2, byte[] bArr, Map map) {
        int i10;
        j2 j2Var;
        AtomicReference atomicReference;
        switch (this.f19114a) {
            case 4:
                e2 e2Var = (e2) this.f19115b;
                e2Var.j();
                zzom zzomVar = (zzom) this.f19117d;
                if (i5 == 200 || i5 == 204) {
                    i10 = i5;
                } else {
                    i10 = 304;
                    if (i5 != 304) {
                        i10 = i5;
                        n0 n0Var = ((f1) e2Var.f3328a).f22745f;
                        f1.m(n0Var);
                        n0Var.f22906i.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar.f5804a), Integer.valueOf(i10), th2);
                        j2Var = !Arrays.asList(((String) x.f23219u.a(null)).split(StringUtils.COMMA)).contains(String.valueOf(i10)) ? j2.BACKOFF : j2.FAILURE;
                        atomicReference = (AtomicReference) this.f19116c;
                        y2 p10 = ((f1) e2Var.f3328a).p();
                        long j = zzomVar.f5804a;
                        zzaf zzafVar = new zzaf(j, zzomVar.f5809f, j2Var.f22833a);
                        p10.j();
                        p10.k();
                        p10.x(new b6.i((Object) p10, (Object) p10.z(true), (Object) zzafVar, 15));
                        n0 n0Var2 = ((f1) e2Var.f3328a).f22745f;
                        f1.m(n0Var2);
                        n0Var2.f22910n.c(Long.valueOf(j), j2Var, "[sgtm] Updated status for row_id");
                        synchronized (atomicReference) {
                            atomicReference.set(j2Var);
                            atomicReference.notifyAll();
                        }
                        return;
                    }
                }
                if (th2 == null) {
                    n0 n0Var3 = ((f1) e2Var.f3328a).f22745f;
                    f1.m(n0Var3);
                    n0Var3.f22910n.b(Long.valueOf(zzomVar.f5804a), "[sgtm] Upload succeeded for row_id");
                    j2Var = j2.SUCCESS;
                    atomicReference = (AtomicReference) this.f19116c;
                    y2 p102 = ((f1) e2Var.f3328a).p();
                    long j6 = zzomVar.f5804a;
                    zzaf zzafVar2 = new zzaf(j6, zzomVar.f5809f, j2Var.f22833a);
                    p102.j();
                    p102.k();
                    p102.x(new b6.i((Object) p102, (Object) p102.z(true), (Object) zzafVar2, 15));
                    n0 n0Var22 = ((f1) e2Var.f3328a).f22745f;
                    f1.m(n0Var22);
                    n0Var22.f22910n.c(Long.valueOf(j6), j2Var, "[sgtm] Updated status for row_id");
                    synchronized (atomicReference) {
                    }
                }
                n0 n0Var4 = ((f1) e2Var.f3328a).f22745f;
                f1.m(n0Var4);
                n0Var4.f22906i.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar.f5804a), Integer.valueOf(i10), th2);
                if (!Arrays.asList(((String) x.f23219u.a(null)).split(StringUtils.COMMA)).contains(String.valueOf(i10))) {
                }
                atomicReference = (AtomicReference) this.f19116c;
                y2 p1022 = ((f1) e2Var.f3328a).p();
                long j62 = zzomVar.f5804a;
                zzaf zzafVar22 = new zzaf(j62, zzomVar.f5809f, j2Var.f22833a);
                p1022.j();
                p1022.k();
                p1022.x(new b6.i((Object) p1022, (Object) p1022.z(true), (Object) zzafVar22, 15));
                n0 n0Var222 = ((f1) e2Var.f3328a).f22745f;
                f1.m(n0Var222);
                n0Var222.f22910n.c(Long.valueOf(j62), j2Var, "[sgtm] Updated status for row_id");
                synchronized (atomicReference) {
                }
                break;
            case 5:
                ((r3) this.f19117d).y(true, i5, th2, bArr, (String) this.f19115b, (ArrayList) this.f19116c);
                return;
            default:
                long j10 = ((s3) this.f19116c).f23062a;
                r3 r3Var = (r3) this.f19117d;
                String str2 = (String) this.f19115b;
                r3Var.b().j();
                r3Var.l0();
                if (bArr == null) {
                    try {
                        bArr = new byte[0];
                    } catch (Throwable th3) {
                        r3Var.f23005u = false;
                        r3Var.O();
                        throw th3;
                    }
                }
                if (i5 != 200) {
                    if (i5 == 204) {
                        i5 = 204;
                    }
                    String str3 = new String(bArr, StandardCharsets.UTF_8);
                    ?? substring = str3.substring(0, Math.min(32, str3.length()));
                    l0 l0Var = r3Var.a().f22907k;
                    Integer valueOf = Integer.valueOf(i5);
                    if (th2 == null) {
                        th2 = substring;
                    }
                    l0Var.d("Network upload failed. Will retry later. appId, status, error", str2, valueOf, th2);
                    s7.j jVar = r3Var.f22989c;
                    r3.U(jVar);
                    jVar.v(Long.valueOf(j10));
                    r3Var.N();
                    r3Var.f23005u = false;
                    r3Var.O();
                    return;
                }
                if (th2 == null) {
                    s7.j jVar2 = r3Var.f22989c;
                    r3.U(jVar2);
                    jVar2.q(Long.valueOf(j10));
                    r3Var.a().f22910n.c(str2, Integer.valueOf(i5), "Successfully uploaded batch from upload queue. appId, status");
                    r0 r0Var = r3Var.f22988b;
                    r3.U(r0Var);
                    if (r0Var.D()) {
                        s7.j jVar3 = r3Var.f22989c;
                        r3.U(jVar3);
                        if (jVar3.p(str2)) {
                            r3Var.t(str2);
                            r3Var.f23005u = false;
                            r3Var.O();
                            return;
                        }
                    }
                    r3Var.N();
                    r3Var.f23005u = false;
                    r3Var.O();
                    return;
                }
                String str32 = new String(bArr, StandardCharsets.UTF_8);
                ?? substring2 = str32.substring(0, Math.min(32, str32.length()));
                l0 l0Var2 = r3Var.a().f22907k;
                Integer valueOf2 = Integer.valueOf(i5);
                if (th2 == null) {
                }
                l0Var2.d("Network upload failed. Will retry later. appId, status, error", str2, valueOf2, th2);
                s7.j jVar4 = r3Var.f22989c;
                r3.U(jVar4);
                jVar4.v(Long.valueOf(j10));
                r3Var.N();
                r3Var.f23005u = false;
                r3Var.O();
                return;
        }
    }

    @Override // r0.f
    public Uri c() {
        return (Uri) this.f19115b;
    }

    @Override // okio.Socket
    public void cancel() {
        ((lh.f) ((h) this.f19117d).f19122e).cancel();
    }

    @Override // r0.f
    public Uri e() {
        return (Uri) this.f19117d;
    }

    @Override // y9.c
    public ArrayList f() {
        ArrayList arrayList = new ArrayList();
        g gVar = (g) this.f19117d;
        File[] listFiles = ((File) gVar.f19115b).listFiles();
        if (listFiles == null) {
            listFiles = new File[0];
        }
        try {
            for (File file : listFiles) {
                y9.a i5 = i(file);
                if (i5 != null) {
                    arrayList.add(i5);
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            gVar.o((File) gVar.f19115b);
            throw th2;
        }
    }

    @Override // r0.f
    public Object g() {
        return null;
    }

    @Override // r0.f
    public ClipDescription getDescription() {
        return (ClipDescription) this.f19116c;
    }

    @Override // okio.Socket
    public Sink getSink() {
        return (e) this.f19115b;
    }

    @Override // okio.Socket
    public Source getSource() {
        return (f) this.f19116c;
    }

    @Override // gf.i
    public Object getValue() {
        ag.c cVar = (ag.c) this.f19115b;
        y1.i iVar = (y1.i) this.f19117d;
        if (iVar != null) {
            return iVar;
        }
        Bundle bundle = (Bundle) ((Function0) this.f19116c).invoke();
        s.e eVar = y1.j.f25572b;
        Method method = (Method) eVar.get(cVar);
        if (method == null) {
            method = u6.h.k(cVar).getMethod("fromBundle", (Class[]) Arrays.copyOf(y1.j.f25571a, 1));
            eVar.put(cVar, method);
            Intrinsics.checkNotNullExpressionValue(method, "also(...)");
        }
        Object invoke = method.invoke(null, bundle);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        y1.i iVar2 = (y1.i) invoke;
        this.f19117d = iVar2;
        return iVar2;
    }

    @Override // y9.c
    public y9.b h(y9.a aVar) {
        ba.d dVar = (ba.d) this.f19115b;
        g gVar = (g) this.f19117d;
        gVar.k(52428800L, 0.1d);
        String uuid = UUID.randomUUID().toString();
        File file = new File((File) gVar.f19115b, uuid);
        if (!file.createNewFile()) {
            throw new IOException("Batch UUID Collision! This should never happen.");
        }
        ((ba.d) gVar.f19117d).a("Created batch file with uuid " + uuid);
        File file2 = new File(file.getAbsolutePath() + ".metadata");
        if (!file2.createNewFile()) {
            throw new IOException("Metadata File Collision! This should never happen.");
        }
        try {
            String a7 = aVar.a();
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                try {
                    outputStreamWriter.write(a7);
                    outputStreamWriter.flush();
                    outputStreamWriter.close();
                    fileOutputStream.close();
                    dVar.o("Created new batch for " + aVar.f25735a.c());
                    return new z9.a(aVar, file, file2, gVar);
                } finally {
                }
            } finally {
            }
        } catch (JSONException e7) {
            dVar.e("Failed to create JSON for metadata file", e7);
            throw new IOException("Failed to create metadata file.");
        }
    }

    public y9.a i(File file) {
        g gVar = (g) this.f19117d;
        ba.d dVar = (ba.d) this.f19115b;
        String name = file.getName();
        if (name.length() != 36) {
            if (name.length() == 45 && name.endsWith(".metadata")) {
                if (new File(file.getAbsolutePath().replace(".metadata", "")).exists()) {
                    return null;
                }
                throw new y9.h("Found a metadata file with no matching batch file: ".concat(name));
            }
            dVar.j("Removing unexpected session file: ".concat(name));
            gVar.o(file);
            return null;
        }
        try {
            UUID.fromString(name);
            File file2 = new File(file.getAbsolutePath() + ".metadata");
            if (!file2.exists()) {
                throw new y9.h("Missing metadata file for batch: ".concat(name));
            }
            dVar.a("Found matching metadata file for batch: ".concat(name));
            y9.a j = j(file, file2);
            ((HashMap) this.f19116c).put(j, file);
            return j;
        } catch (IllegalArgumentException unused) {
            dVar.j("Removing invalid batch file: ".concat(name));
            gVar.o(file);
            return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public y9.a j(java.io.File r29, java.io.File r30) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kh.g.j(java.io.File, java.io.File):y9.a");
    }

    public void k(long j, double d10) {
        long usableSpace = ((File) this.f19115b).getUsableSpace();
        double usableSpace2 = r0.getUsableSpace() / r0.getTotalSpace();
        if (usableSpace <= j || usableSpace2 <= d10) {
            StringBuilder p10 = r4.k.p(usableSpace, "Not enough storage remaining - availableBytes: ", ", availablePercent: ");
            p10.append(usableSpace2);
            throw new IOException(p10.toString());
        }
        ba.d dVar = (ba.d) this.f19117d;
        StringBuilder p11 = r4.k.p(usableSpace, "availableBytes: ", ", availablePercent: ");
        p11.append(usableSpace2);
        dVar.a(p11.toString());
    }

    public void l(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f19115b;
        w8.f fVar = new w8.f(byteArrayOutputStream, hashMap, (HashMap) this.f19116c, (t8.d) this.f19117d);
        t8.d dVar = (t8.d) hashMap.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
        } else {
            throw new t8.b("No encoder for " + obj.getClass());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void m(WebView webView, ue.e eVar) {
        if (webView != null) {
            webView.setWebViewClient((xe.f) ((gf.t) this.f19116c).getValue());
            webView.setWebChromeClient((xe.e) ((gf.t) this.f19117d).getValue());
        }
        WebSettings settings = webView != null ? webView.getSettings() : null;
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDisplayZoomControls(true);
            if (Build.VERSION.SDK_INT <= 35) {
                settings.setDatabaseEnabled(true);
            }
            settings.setUseWideViewPort(true);
            settings.setDomStorageEnabled(true);
            settings.setAllowContentAccess(true);
            settings.setAllowFileAccess(true);
            settings.setLoadWithOverviewMode(true);
        }
        this.f19115b = (Fragment) eVar;
    }

    public boolean n(int i5, androidx.constraintlayout.widget.e eVar, x.d dVar) {
        y.b bVar = (y.b) this.f19116c;
        int[] iArr = dVar.f25320p0;
        int[] iArr2 = dVar.f25323t;
        bVar.f25478a = iArr[0];
        bVar.f25479b = iArr[1];
        bVar.f25480c = dVar.q();
        bVar.f25481d = dVar.k();
        bVar.f25486i = false;
        bVar.j = i5;
        boolean z5 = bVar.f25478a == 3;
        boolean z7 = bVar.f25479b == 3;
        boolean z10 = z5 && dVar.W > 0.0f;
        boolean z11 = z7 && dVar.W > 0.0f;
        if (z10 && iArr2[0] == 4) {
            bVar.f25478a = 1;
        }
        if (z11 && iArr2[1] == 4) {
            bVar.f25479b = 1;
        }
        eVar.b(dVar, bVar);
        dVar.O(bVar.f25482e);
        dVar.L(bVar.f25483f);
        dVar.E = bVar.f25485h;
        dVar.I(bVar.f25484g);
        bVar.j = 0;
        return bVar.f25486i;
    }

    public void o(File file) {
        File file2 = (File) this.f19116c;
        if (file.exists()) {
            file.renameTo(new File(file2, UUID.randomUUID().toString()));
            if (file.exists()) {
                throw new IOException("File or directory still exists after moving to trash: " + file.getPath());
            }
        }
    }

    public void p(x.e eVar, int i5, int i10, int i11) {
        int i12 = eVar.f25296b0;
        int i13 = eVar.f25298c0;
        eVar.f25296b0 = 0;
        eVar.f25298c0 = 0;
        eVar.O(i10);
        eVar.L(i11);
        if (i12 < 0) {
            eVar.f25296b0 = 0;
        } else {
            eVar.f25296b0 = i12;
        }
        if (i13 < 0) {
            eVar.f25298c0 = 0;
        } else {
            eVar.f25298c0 = i13;
        }
        x.e eVar2 = (x.e) this.f19117d;
        eVar2.f25333t0 = i5;
        eVar2.U();
    }

    public void q(x.e eVar) {
        ArrayList arrayList = (ArrayList) this.f19115b;
        arrayList.clear();
        int size = eVar.f25330q0.size();
        for (int i5 = 0; i5 < size; i5++) {
            x.d dVar = (x.d) eVar.f25330q0.get(i5);
            int[] iArr = dVar.f25320p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f25332s0.f18747a = true;
    }

    public synchronized void r(int i5, int i10, long j, long j6) {
        ((f1) this.f19115b).f22749k.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.f19117d;
        if (atomicLong.get() != -1 && elapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        ((i6.d) this.f19116c).d(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i5, 0, j, j6, null, null, 0, i10)))).d(new androidx.recyclerview.widget.j(4, elapsedRealtime, this));
    }

    public String toString() {
        switch (this.f19114a) {
            case 14:
                String str = (String) this.f19117d;
                String str2 = (String) this.f19116c;
                StringBuilder sb2 = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f19115b;
                if (uri != null) {
                    sb2.append(" uri=");
                    sb2.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb2.append(" action=");
                    sb2.append(str2);
                }
                if (str != null) {
                    sb2.append(" mimetype=");
                    sb2.append(str);
                }
                sb2.append(" }");
                String sb3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                return sb3;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ g(r3 r3Var, String str, Object obj, int i5) {
        this.f19114a = i5;
        this.f19115b = str;
        this.f19116c = obj;
        this.f19117d = r3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(int i5) {
        Class<?> cls;
        String str;
        String str2;
        this.f19114a = i5;
        final int i10 = 1;
        final int i11 = 0;
        switch (i5) {
            case 9:
                this.f19116c = gf.k.b(new Function0(this) { // from class: ue.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ kh.g f24251b;

                    {
                        this.f24251b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i11) {
                            case 0:
                                xe.f fVar = new xe.f();
                                fVar.f25458a = this.f24251b;
                                return fVar;
                            default:
                                xe.e eVar = new xe.e();
                                eVar.f25457a = this.f24251b;
                                return eVar;
                        }
                    }
                });
                this.f19117d = gf.k.b(new Function0(this) { // from class: ue.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ kh.g f24251b;

                    {
                        this.f24251b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i10) {
                            case 0:
                                xe.f fVar = new xe.f();
                                fVar.f25458a = this.f24251b;
                                return fVar;
                            default:
                                xe.e eVar = new xe.e();
                                eVar.f25457a = this.f24251b;
                                return eVar;
                        }
                    }
                });
                break;
            case 10:
                break;
            default:
                this.f19115b = new ba.d("asset-manager");
                this.f19116c = null;
                this.f19117d = null;
                String str3 = "com.facebook.react.common.assets.ReactFontManager";
                try {
                    try {
                        Method method = aa.k.f110a;
                        cls = Class.forName("com.facebook.react.common.assets.ReactFontManager");
                    } catch (Throwable th2) {
                        th = th2;
                        i10 = i11;
                        if (i10 == 0) {
                            ((ba.d) this.f19115b).e("Failed to detect React Native asset fonts", th);
                        }
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                    ((ba.d) this.f19115b).o("New version of ReactFontManager could not be found. Checking for deprecated version instead.");
                    str3 = "com.facebook.react.views.text.ReactFontManager";
                    Method method2 = aa.k.f110a;
                    cls = Class.forName("com.facebook.react.views.text.ReactFontManager");
                    i11 = 1;
                }
                try {
                    Object invoke = cls.getMethod("getInstance", null).invoke(null, null);
                    if (i11 != 0) {
                        str = "mFontCache";
                    } else {
                        str = "fontCache";
                    }
                    Field declaredField = cls.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    this.f19116c = (Map) declaredField.get(invoke);
                    Class<?> cls2 = Class.forName(str3.concat("$AssetFontFamily"));
                    if (i11 != 0) {
                        str2 = "mTypefaceSparseArray";
                    } else {
                        str2 = "typefaceSparseArray";
                    }
                    Field declaredField2 = cls2.getDeclaredField(str2);
                    this.f19117d = declaredField2;
                    declaredField2.setAccessible(true);
                    break;
                } catch (Throwable th3) {
                    th = th3;
                    if (i10 == 0) {
                    }
                }
        }
    }

    public g(Context context, f1 f1Var) {
        this.f19114a = 3;
        this.f19117d = new AtomicLong(-1L);
        this.f19116c = new i6.d(context, null, i6.d.f10999m, new g6.i("measurement:api"), d6.f.f8246c);
        this.f19115b = f1Var;
    }

    public g(File file, File file2) {
        this.f19114a = 15;
        this.f19117d = new ba.d("file-system");
        this.f19115b = file;
        this.f19116c = file2;
    }

    public g(g gVar) {
        this.f19114a = 16;
        this.f19115b = new ba.d("persistence:on-disk");
        this.f19116c = new HashMap();
        this.f19117d = gVar;
    }

    public g(ag.c navArgsClass, Function0 argumentProducer) {
        this.f19114a = 13;
        Intrinsics.checkNotNullParameter(navArgsClass, "navArgsClass");
        Intrinsics.checkNotNullParameter(argumentProducer, "argumentProducer");
        this.f19115b = navArgsClass;
        this.f19116c = argumentProducer;
    }

    public g(x.e eVar) {
        this.f19114a = 12;
        this.f19115b = new ArrayList();
        this.f19116c = new y.b();
        this.f19117d = eVar;
    }

    public g(h hVar) {
        this.f19114a = 0;
        this.f19117d = hVar;
        lh.f fVar = (lh.f) hVar.f19122e;
        this.f19115b = new e(hVar, fVar.f().getSink(), -1L, true);
        this.f19116c = new f(hVar, fVar.f().getSource(), -1L, true);
    }

    @Override // r0.f
    public void d() {
    }
}
