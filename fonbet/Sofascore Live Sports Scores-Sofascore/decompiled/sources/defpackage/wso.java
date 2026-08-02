package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wso extends puo {
    public static final quo k = new quo();
    public final i4n h;
    public final Context i;
    public final xfo j;

    public wso(zro zroVar, s9n s9nVar, int i, Context context, i4n i4nVar, xfo xfoVar) {
        super(zroVar, "Y4Si1UCd8xFA1yCw6ohazV+GUSwhVa9ffV9ZnN++nWMAkqLsgU7cmmd4wBpbGVgj", "1k+Az7ZOHMkdpE7lGA2cF/gUEsamDqjjLqQDV0dmR3A=", s9nVar, i, 27);
        this.i = context;
        this.h = i4nVar;
        this.j = xfoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r2.a.equals("0000000000000000000000000000000000000000000000000000000000000000") == false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001b, B:13:0x002a, B:15:0x0034, B:17:0x00e6, B:18:0x00ec, B:34:0x003e, B:36:0x0042, B:37:0x00e3, B:38:0x0048, B:40:0x0070, B:41:0x0076, B:43:0x007c, B:46:0x0084, B:51:0x0090, B:53:0x0096, B:56:0x00a1, B:57:0x00a8, B:58:0x00a6, B:59:0x00ab, B:61:0x00b1, B:63:0x00b7, B:67:0x009b, B:70:0x00be, B:72:0x00d3, B:75:0x00dc), top: B:3:0x000d }] */
    @Override // defpackage.puo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        efo efoVar;
        efo efoVar2;
        boolean z;
        quo quoVar = k;
        Context context = this.i;
        AtomicReference a = quoVar.a(context.getPackageName());
        synchronized (a) {
            try {
                efo efoVar3 = (efo) a.get();
                if (efoVar3 != null) {
                    String str = efoVar3.a;
                    if (str != null && !str.isEmpty()) {
                        z = false;
                        if (!z) {
                            if (!efoVar3.a.equals("E")) {
                            }
                        }
                    }
                    z = true;
                    if (!z) {
                    }
                }
                if (this.j != null) {
                    efoVar = c();
                } else {
                    Boolean valueOf = Boolean.valueOf(!this.h.s());
                    kwo kwoVar = exo.e;
                    bwo bwoVar = bwo.e;
                    Boolean bool = (Boolean) bwoVar.c.a(kwoVar);
                    String b = ((Boolean) bwoVar.c.a(exo.d)).booleanValue() ? b() : null;
                    if (bool.booleanValue() && this.a.l) {
                        if (b == null || b.isEmpty()) {
                            try {
                                zro zroVar = this.a;
                                gmo gmoVar = zroVar.j;
                                if ((gmoVar != null ? (q8p) gmoVar.b : zroVar.i) != null) {
                                    (gmoVar != null ? (q8p) gmoVar.b : zroVar.i).get();
                                }
                                cmn b2 = zroVar.b();
                                if (b2 != null && b2.S()) {
                                    b = b2.h0();
                                }
                            } catch (InterruptedException | ExecutionException unused) {
                            }
                            b = null;
                        }
                    }
                    efo efoVar4 = new efo((String) this.e.invoke(null, context, valueOf, b));
                    String str2 = efoVar4.a;
                    if (!(str2 == null || str2.isEmpty())) {
                        str2.equals("E");
                    }
                    efoVar = efoVar4;
                }
                a.set(efoVar);
                efoVar2 = (efo) a.get();
            } finally {
            }
        }
        s9n s9nVar = this.d;
        synchronized (s9nVar) {
            if (efoVar2 != null) {
                try {
                    String str3 = efoVar2.a;
                    s9nVar.b();
                    ((cmn) s9nVar.b).C0(str3);
                    long j = efoVar2.b;
                    s9nVar.b();
                    ((cmn) s9nVar.b).v(j);
                    String str4 = efoVar2.c;
                    s9nVar.b();
                    ((cmn) s9nVar.b).u(str4);
                    String str5 = efoVar2.d;
                    s9nVar.b();
                    ((cmn) s9nVar.b).E(str5);
                    String str6 = efoVar2.e;
                    s9nVar.b();
                    ((cmn) s9nVar.b).F(str6);
                } finally {
                }
            }
        }
    }

    public final String b() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            kwo kwoVar = exo.f;
            bwo bwoVar = bwo.e;
            byte[] h0 = m6k.h0((String) bwoVar.c.a(kwoVar));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(h0)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(m6k.h0((String) bwoVar.c.a(exo.g)))));
            }
            Context context = this.i;
            String packageName = context.getPackageName();
            ExecutorService executorService = this.a.b;
            return qz.F(context, packageName, arrayList);
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    public final efo c() {
        String str;
        q8p q8pVar;
        kwo kwoVar = exo.o;
        bwo bwoVar = bwo.e;
        ywo ywoVar = bwoVar.c;
        ywo ywoVar2 = bwoVar.c;
        int intValue = ((Integer) ywoVar.a(kwoVar)).intValue();
        i4n i4nVar = this.h;
        int t = (intValue <= 0 || ((Integer) ywoVar2.a(kwoVar)).intValue() >= i4nVar.t()) ? i4nVar.t() : ((Integer) ywoVar2.a(kwoVar)).intValue();
        efo efoVar = new efo((String) this.e.invoke(null, this.i, Boolean.FALSE, ""));
        xfo xfoVar = this.j;
        if (xfoVar != null && (q8pVar = xfoVar.a) != null) {
            try {
                str = (String) q8pVar.get(t, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
            efoVar.a = str;
            return efoVar;
        }
        str = "E";
        efoVar.a = str;
        return efoVar;
    }
}
