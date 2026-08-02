package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.util.Clock;
import defpackage.am0;
import defpackage.eho;
import defpackage.etn;
import defpackage.fc6;
import defpackage.mpi;
import defpackage.qgo;
import defpackage.vxd;
import defpackage.wt3;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcjy extends zzcjs implements zziq {
    public static final AtomicInteger o = new AtomicInteger(0);
    public String d;
    public final zzcie e;
    public boolean f;
    public final am0 g;
    public final zzcjb h;
    public ByteBuffer i;
    public boolean j;
    public final Object k;
    public final String l;
    public final int m;
    public boolean n;

    public zzcjy(zzcif zzcifVar, zzcie zzcieVar) {
        super(zzcifVar);
        this.e = zzcieVar;
        this.g = new am0(14);
        this.h = new zzcjb();
        this.k = new Object();
        String zzn = zzcifVar.zzn();
        this.l = (String) (zzn == null ? qgo.a : new eho(zzn)).d();
        this.m = zzcifVar.zzp();
        o.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zziq
    public final void e(zzhk zzhkVar, zzhw zzhwVar, boolean z) {
        if (zzhkVar instanceof zzid) {
            ((ArrayList) this.g.c).add((zzid) zzhkVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11, types: [com.google.android.gms.internal.ads.zzciz] */
    /* JADX WARN: Type inference failed for: r27v0, types: [com.google.android.gms.internal.ads.zzcjs, com.google.android.gms.internal.ads.zzcjy, com.google.android.gms.internal.ads.zziq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v9, types: [boolean] */
    @Override // com.google.android.gms.internal.ads.zzcjs
    public final boolean g(String str) {
        String str2;
        ?? r7;
        zzid zzidVar;
        Clock clock;
        String str3 = str;
        this.d = str3;
        String str4 = "error";
        String concat = "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzg(str3)));
        try {
            zzhz zzhzVar = new zzhz();
            zzhzVar.c = this.b;
            zzcie zzcieVar = this.e;
            zzhzVar.d = zzcieVar.d;
            zzhzVar.e = zzcieVar.e;
            zzhzVar.f = true;
            zzhzVar.b = this;
            zzid zza = zzhzVar.zza();
            if (zzcieVar.i) {
                zza = new zzciz(this.a, zza, this.l, this.m);
            }
            zza.a(new zzhw(Uri.parse(str3), 0L, -1L));
            zzcif zzcifVar = (zzcif) this.c.get();
            if (zzcifVar != null) {
                zzcifVar.D(concat, this);
            }
            Clock zzk = com.google.android.gms.ads.internal.zzt.zzk();
            long a = zzk.a();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.r0)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.q0)).longValue();
            this.i = ByteBuffer.allocate(zzcieVar.c);
            byte[] bArr = new byte[8192];
            long j = a;
            while (true) {
                try {
                    int b = zza.b(0, Math.min(this.i.remaining(), 8192), bArr);
                    if (b == -1) {
                        this.n = true;
                        str3 = str;
                        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new mpi(3, (int) this.h.a(this.i), this, str3, concat));
                        return true;
                    }
                    str3 = str;
                    str2 = str4;
                    try {
                        synchronized (this.k) {
                            zzidVar = zza;
                            try {
                                if (this.f) {
                                    clock = zzk;
                                } else {
                                    clock = zzk;
                                    this.i.put(bArr, 0, b);
                                }
                            } finally {
                            }
                        }
                        if (this.i.remaining() <= 0) {
                            r();
                            return true;
                        }
                        r7 = this.f;
                        try {
                            if (r7 != 0) {
                                int limit = this.i.limit();
                                StringBuilder sb = new StringBuilder(String.valueOf(limit).length() + 24);
                                sb.append("Precache abort at ");
                                sb.append(limit);
                                sb.append(" bytes");
                                throw new IOException(sb.toString());
                            }
                            long a2 = clock.a();
                            if (a2 - j >= longValue) {
                                r();
                                j = a2;
                            }
                            if (a2 - a > 1000 * longValue2) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(longValue2).length() + 29);
                                sb2.append("Timeout exceeded. Limit: ");
                                sb2.append(longValue2);
                                sb2.append(" sec");
                                throw new IOException(sb2.toString());
                            }
                            str4 = str2;
                            zza = zzidVar;
                            zzk = clock;
                        } catch (Exception e) {
                            e = e;
                            String canonicalName = e.getClass().getCanonicalName();
                            String message = e.getMessage();
                            String m = wt3.m(canonicalName, ":", new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length()), message);
                            String o2 = fc6.o(new StringBuilder(m.length() + String.valueOf(str3).length() + 34), "Failed to preload url ", str3, " Exception: ", m);
                            int i = com.google.android.gms.ads.internal.util.zze.zza;
                            zzo.zzi(o2);
                            p(str3, concat, r7, m);
                            return false;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        r7 = str2;
                        String canonicalName2 = e.getClass().getCanonicalName();
                        String message2 = e.getMessage();
                        String m2 = wt3.m(canonicalName2, ":", new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length()), message2);
                        String o22 = fc6.o(new StringBuilder(m2.length() + String.valueOf(str3).length() + 34), "Failed to preload url ", str3, " Exception: ", m2);
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzi(o22);
                        p(str3, concat, r7, m2);
                        return false;
                    }
                } catch (Exception e3) {
                    e = e3;
                    str3 = str;
                    str2 = str4;
                    r7 = str2;
                    String canonicalName22 = e.getClass().getCanonicalName();
                    String message22 = e.getMessage();
                    String m22 = wt3.m(canonicalName22, ":", new StringBuilder(String.valueOf(canonicalName22).length() + 1 + String.valueOf(message22).length()), message22);
                    String o222 = fc6.o(new StringBuilder(m22.length() + String.valueOf(str3).length() + 34), "Failed to preload url ", str3, " Exception: ", m22);
                    int i22 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzi(o222);
                    p(str3, concat, r7, m22);
                    return false;
                }
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void o() {
        this.f = true;
    }

    public final void r() {
        am0 am0Var = this.g;
        Iterator it = ((ArrayList) am0Var.c).iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((zzid) it.next()).zzj().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        am0Var.b = Math.max(am0Var.b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        int i = (int) am0Var.b;
        int a = (int) this.h.a(this.i);
        int position = this.i.position();
        int b = vxd.b(position, i, a);
        int i2 = zzchw.a.get();
        int i3 = zzchw.b.get();
        String str = this.d;
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new etn(this, str, "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzg(str))), position, i, b, a, b > 0, i2, i3));
    }

    @Override // com.google.android.gms.internal.ads.zzcjs, com.google.android.gms.common.api.Releasable
    public final void release() {
        o.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zziq
    public final void f(zzhw zzhwVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zziq
    public final void m(zzhw zzhwVar, boolean z, int i) {
    }
}
