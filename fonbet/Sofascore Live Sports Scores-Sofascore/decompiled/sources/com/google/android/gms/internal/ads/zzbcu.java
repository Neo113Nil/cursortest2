package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import defpackage.emo;
import defpackage.inn;
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
/* loaded from: classes3.dex */
public final class zzbcu extends zzbdt {
    public static final zzbdu k = new zzbdu();
    public final zzaxt h;
    public final Context i;
    public final zzbaa j;

    public zzbcu(zzbcg zzbcgVar, zzaya zzayaVar, int i, Context context, zzaxt zzaxtVar, zzbaa zzbaaVar) {
        super(zzbcgVar, "Y4Si1UCd8xFA1yCw6ohazV+GUSwhVa9ffV9ZnN++nWMAkqLsgU7cmmd4wBpbGVgj", "1k+Az7ZOHMkdpE7lGA2cF/gUEsamDqjjLqQDV0dmR3A=", zzayaVar, i, 27);
        this.i = context;
        this.h = zzaxtVar;
        this.j = zzbaaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r2.a.equals("0000000000000000000000000000000000000000000000000000000000000000") == false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001b, B:13:0x002a, B:15:0x0034, B:17:0x00e4, B:18:0x00ea, B:34:0x003e, B:36:0x0042, B:37:0x00e1, B:38:0x0048, B:40:0x0072, B:41:0x0078, B:43:0x007e, B:46:0x0086, B:51:0x0092, B:53:0x0098, B:56:0x00a1, B:57:0x00a6, B:58:0x00a4, B:59:0x00a9, B:61:0x00af, B:63:0x00b5, B:67:0x009b, B:70:0x00bc, B:72:0x00d1, B:75:0x00da), top: B:3:0x000d }] */
    @Override // com.google.android.gms.internal.ads.zzbdt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        zzazx zzazxVar;
        zzazx zzazxVar2;
        boolean z;
        zzbdu zzbduVar = k;
        Context context = this.i;
        AtomicReference a = zzbduVar.a(context.getPackageName());
        synchronized (a) {
            try {
                zzazx zzazxVar3 = (zzazx) a.get();
                if (zzazxVar3 != null) {
                    String str = zzazxVar3.a;
                    if (str != null && !str.isEmpty()) {
                        z = false;
                        if (!z) {
                            if (!zzazxVar3.a.equals("E")) {
                            }
                        }
                    }
                    z = true;
                    if (!z) {
                    }
                }
                if (this.j != null) {
                    zzazxVar = c();
                } else {
                    Boolean valueOf = Boolean.valueOf(!this.h.D());
                    Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.v3);
                    String b = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.u3)).booleanValue() ? b() : null;
                    if (bool.booleanValue() && this.a.l) {
                        if (b == null || b.isEmpty()) {
                            try {
                                zzbcg zzbcgVar = this.a;
                                zzbbg zzbbgVar = zzbcgVar.j;
                                if ((zzbbgVar != null ? zzbbgVar.a : zzbcgVar.i) != null) {
                                    (zzbbgVar != null ? zzbbgVar.a : zzbcgVar.i).get();
                                }
                                zzaza b2 = zzbcgVar.b();
                                if (b2 != null && b2.e0()) {
                                    b = b2.z0();
                                }
                            } catch (InterruptedException | ExecutionException unused) {
                            }
                            b = null;
                        }
                    }
                    zzazx zzazxVar4 = new zzazx((String) this.e.invoke(null, context, valueOf, b));
                    String str2 = zzazxVar4.a;
                    if (!(str2 == null || str2.isEmpty())) {
                        str2.equals("E");
                    }
                    zzazxVar = zzazxVar4;
                }
                a.set(zzazxVar);
                zzazxVar2 = (zzazx) a.get();
            } finally {
            }
        }
        zzaya zzayaVar = this.d;
        synchronized (zzayaVar) {
            if (zzazxVar2 != null) {
                try {
                    String str3 = zzazxVar2.a;
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).W0(str3);
                    long j = zzazxVar2.b;
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).I(j);
                    String str4 = zzazxVar2.c;
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).H(str4);
                    String str5 = zzazxVar2.d;
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).R(str5);
                    String str6 = zzazxVar2.e;
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).S(str6);
                } finally {
                }
            }
        }
    }

    public final String b() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            byte[] a = zzbcj.a((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.w3));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(a)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzbcj.a((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.x3)))));
            }
            Context context = this.i;
            String packageName = context.getPackageName();
            ExecutorService executorService = this.a.b;
            return zzbdw.a(context, packageName, arrayList);
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    public final zzazx c() {
        String str;
        emo emoVar;
        inn innVar = zzbjg.J3;
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).intValue();
        zzaxt zzaxtVar = this.h;
        int E = (intValue <= 0 || ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).intValue() >= zzaxtVar.E()) ? zzaxtVar.E() : ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).intValue();
        zzazx zzazxVar = new zzazx((String) this.e.invoke(null, this.i, Boolean.FALSE, ""));
        zzbaa zzbaaVar = this.j;
        if (zzbaaVar != null && (emoVar = zzbaaVar.a) != null) {
            try {
                str = (String) emoVar.get(E, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
            zzazxVar.a = str;
            return zzazxVar;
        }
        str = "E";
        zzazxVar.a = str;
        return zzazxVar;
    }
}
