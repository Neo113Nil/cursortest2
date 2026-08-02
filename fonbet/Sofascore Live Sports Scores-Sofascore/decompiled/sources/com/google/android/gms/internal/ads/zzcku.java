package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.SparseBooleanArray;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzcie;
import com.google.android.gms.internal.ads.zzcku;
import com.google.android.gms.internal.ads.zzhs;
import com.google.android.gms.internal.ads.zzhz;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.ayo;
import defpackage.b1l;
import defpackage.bf3;
import defpackage.bgf;
import defpackage.bio;
import defpackage.c0l;
import defpackage.cwo;
import defpackage.ddb;
import defpackage.dno;
import defpackage.e2f;
import defpackage.e3c;
import defpackage.eho;
import defpackage.eyo;
import defpackage.gmo;
import defpackage.ktn;
import defpackage.mio;
import defpackage.n2f;
import defpackage.n6o;
import defpackage.ohn;
import defpackage.pwo;
import defpackage.qgo;
import defpackage.tg6;
import defpackage.tyo;
import defpackage.uvo;
import defpackage.v35;
import defpackage.wjn;
import defpackage.wt3;
import defpackage.xwo;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcku extends zzchw implements zziq, zznt {
    public static final /* synthetic */ int w = 0;
    public final Context c;
    public final zzcke d;
    public final zzabc e;
    public final zzcie f;
    public final WeakReference g;
    public final zzyx h;
    public zzno i;
    public ByteBuffer j;
    public boolean k;
    public zzchv l;
    public int m;
    public int n;
    public long o;
    public final String p;
    public final int q;
    public Integer s;
    public final ArrayList t;
    public volatile zzckh u;
    public final Object r = new Object();
    public final HashSet v = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0117, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjg.G2)).booleanValue() == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012c  */
    /* JADX WARN: Type inference failed for: r1v13, types: [ktn] */
    /* JADX WARN: Type inference failed for: r1v14, types: [ktn] */
    /* JADX WARN: Type inference failed for: r1v9, types: [ktn] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzcku(Context context, zzcie zzcieVar, zzcif zzcifVar, Integer num) {
        final boolean z;
        ktn ktnVar;
        ktn ktnVar2;
        zzhr c0lVar;
        ByteBuffer byteBuffer;
        this.c = context;
        this.f = zzcieVar;
        this.s = num;
        this.g = new WeakReference(zzcifVar);
        zzcke zzckeVar = new zzcke();
        this.d = zzckeVar;
        zzabc zzabcVar = new zzabc(context);
        this.e = zzabcVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        zzchw.a.incrementAndGet();
        zznn zznnVar = new zznn(context, new b1l(this, 8));
        zzjw zzjwVar = zznnVar.a;
        final int i = 1;
        zzguk.f(!zzjwVar.j);
        zzjwVar.e = new gmo(zzabcVar, 4);
        zzjw zzjwVar2 = zznnVar.a;
        zzguk.f(!zzjwVar2.j);
        zzjwVar2.f = new ohn(zzckeVar, 26);
        zzjw zzjwVar3 = zznnVar.a;
        zzguk.f(!zzjwVar3.j);
        zzjwVar3.j = true;
        zzno zznoVar = new zzno(zzjwVar3);
        this.i = zznoVar;
        zznoVar.c.b();
        zznoVar.b.c(this);
        final int i2 = 0;
        this.m = 0;
        this.o = 0L;
        this.n = 0;
        this.t = new ArrayList();
        this.u = null;
        String zzn = zzcifVar != null ? zzcifVar.zzn() : null;
        this.p = (String) (zzn == null ? qgo.a : new eho(zzn)).d();
        this.q = zzcifVar != null ? zzcifVar.zzp() : 0;
        final String zze = com.google.android.gms.ads.internal.zzt.zzc().zze(context, zzcifVar.zzs().afmaVersion);
        if (!this.k || this.j.limit() <= 0) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.O2)).booleanValue()) {
            }
            if (zzcieVar.i) {
                z = false;
                if (!zzcieVar.l) {
                    ktnVar2 = new zzhr(this) { // from class: ktn
                        public final /* synthetic */ zzcku b;

                        {
                            this.b = this;
                        }

                        @Override // com.google.android.gms.internal.ads.zzhr
                        public final zzhs zza() {
                            int i3 = i2;
                            boolean z2 = z;
                            zzcku zzckuVar = this.b;
                            switch (i3) {
                                case 0:
                                    zzcku zzckuVar2 = true != z2 ? null : zzckuVar;
                                    zzcie zzcieVar2 = zzckuVar.f;
                                    return new mtn(zze, zzckuVar2, zzcieVar2.d, zzcieVar2.e, zzcieVar2.m, zzcieVar2.n);
                                case 1:
                                    zzhz zzhzVar = new zzhz();
                                    zzhzVar.c = zze;
                                    zzhzVar.b = true == z2 ? zzckuVar : null;
                                    zzcie zzcieVar3 = zzckuVar.f;
                                    zzhzVar.d = zzcieVar3.d;
                                    zzhzVar.e = zzcieVar3.e;
                                    zzhzVar.f = true;
                                    return zzhzVar.zza();
                                default:
                                    zzcku zzckuVar3 = true != z2 ? null : zzckuVar;
                                    zzcie zzcieVar4 = zzckuVar.f;
                                    itn itnVar = new itn(zze, zzckuVar3, zzcieVar4.d, zzcieVar4.e, zzcieVar4.h);
                                    zzckuVar.v.add(new WeakReference(itnVar));
                                    return itnVar;
                            }
                        }
                    };
                } else if (zzcieVar.h > 0) {
                    final int i3 = 2;
                    ktnVar2 = ktnVar;
                    ktnVar = new zzhr(this) { // from class: ktn
                        public final /* synthetic */ zzcku b;

                        {
                            this.b = this;
                        }

                        @Override // com.google.android.gms.internal.ads.zzhr
                        public final zzhs zza() {
                            int i32 = i3;
                            boolean z2 = z;
                            zzcku zzckuVar = this.b;
                            switch (i32) {
                                case 0:
                                    zzcku zzckuVar2 = true != z2 ? null : zzckuVar;
                                    zzcie zzcieVar2 = zzckuVar.f;
                                    return new mtn(zze, zzckuVar2, zzcieVar2.d, zzcieVar2.e, zzcieVar2.m, zzcieVar2.n);
                                case 1:
                                    zzhz zzhzVar = new zzhz();
                                    zzhzVar.c = zze;
                                    zzhzVar.b = true == z2 ? zzckuVar : null;
                                    zzcie zzcieVar3 = zzckuVar.f;
                                    zzhzVar.d = zzcieVar3.d;
                                    zzhzVar.e = zzcieVar3.e;
                                    zzhzVar.f = true;
                                    return zzhzVar.zza();
                                default:
                                    zzcku zzckuVar3 = true != z2 ? null : zzckuVar;
                                    zzcie zzcieVar4 = zzckuVar.f;
                                    itn itnVar = new itn(zze, zzckuVar3, zzcieVar4.d, zzcieVar4.e, zzcieVar4.h);
                                    zzckuVar.v.add(new WeakReference(itnVar));
                                    return itnVar;
                            }
                        }
                    };
                } else {
                    ktnVar2 = ktnVar;
                    ktnVar = new zzhr(this) { // from class: ktn
                        public final /* synthetic */ zzcku b;

                        {
                            this.b = this;
                        }

                        @Override // com.google.android.gms.internal.ads.zzhr
                        public final zzhs zza() {
                            int i32 = i;
                            boolean z2 = z;
                            zzcku zzckuVar = this.b;
                            switch (i32) {
                                case 0:
                                    zzcku zzckuVar2 = true != z2 ? null : zzckuVar;
                                    zzcie zzcieVar2 = zzckuVar.f;
                                    return new mtn(zze, zzckuVar2, zzcieVar2.d, zzcieVar2.e, zzcieVar2.m, zzcieVar2.n);
                                case 1:
                                    zzhz zzhzVar = new zzhz();
                                    zzhzVar.c = zze;
                                    zzhzVar.b = true == z2 ? zzckuVar : null;
                                    zzcie zzcieVar3 = zzckuVar.f;
                                    zzhzVar.d = zzcieVar3.d;
                                    zzhzVar.e = zzcieVar3.e;
                                    zzhzVar.f = true;
                                    return zzhzVar.zza();
                                default:
                                    zzcku zzckuVar3 = true != z2 ? null : zzckuVar;
                                    zzcie zzcieVar4 = zzckuVar.f;
                                    itn itnVar = new itn(zze, zzckuVar3, zzcieVar4.d, zzcieVar4.e, zzcieVar4.h);
                                    zzckuVar.v.add(new WeakReference(itnVar));
                                    return itnVar;
                            }
                        }
                    };
                }
                c0lVar = !zzcieVar.i ? new c0l(22, this, ktnVar2) : ktnVar2;
                byteBuffer = this.j;
                if (byteBuffer != null && byteBuffer.limit() > 0) {
                    byte[] bArr = new byte[this.j.limit()];
                    this.j.get(bArr);
                    c0lVar = new c0l(23, c0lVar, bArr);
                }
            }
            z = true;
            if (!zzcieVar.l) {
            }
            if (!zzcieVar.i) {
            }
            byteBuffer = this.j;
            if (byteBuffer != null) {
                byte[] bArr2 = new byte[this.j.limit()];
                this.j.get(bArr2);
                c0lVar = new c0l(23, c0lVar, bArr2);
            }
        } else {
            byte[] bArr3 = new byte[this.j.limit()];
            this.j.get(bArr3);
            c0lVar = new e3c(bArr3, 28);
        }
        this.h = new zzyx(c0lVar, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.q)).booleanValue() ? n2f.d : e2f.d);
    }

    public final void A() {
        String str;
        boolean z;
        zzno zznoVar = this.i;
        if (zznoVar != null) {
            zznoVar.c.b();
            cwo cwoVar = zznoVar.b;
            cwoVar.o();
            cwoVar.q.f.b(this);
            zzno zznoVar2 = this.i;
            zznoVar2.c.b();
            cwo cwoVar2 = zznoVar2.b;
            cwoVar2.getClass();
            String hexString = Integer.toHexString(System.identityHashCode(cwoVar2));
            String str2 = zzfm.a;
            HashSet hashSet = zzal.a;
            synchronized (zzal.class) {
                str = zzal.b;
            }
            StringBuilder sb = new StringBuilder(wt3.h(String.valueOf(hexString).length(), 34, String.valueOf(str2).length(), 3, String.valueOf(str).length()) + 1);
            bf3.v(sb, "Release ", hexString, " [AndroidXMedia3/1.10.1] [", str2);
            sb.append("] [");
            sb.append(str);
            sb.append(U3.j.e);
            zzeh.b(sb.toString());
            cwoVar2.o();
            cwoVar2.w.a(false);
            zzfu zzfuVar = cwoVar2.x;
            if (zzfuVar.a) {
                zzfuVar.a = false;
            }
            tg6 tg6Var = cwoVar2.B;
            if (tg6Var != null && Build.VERSION.SDK_INT >= 34) {
                tg6Var.b();
            }
            zzfd zzfdVar = cwoVar2.A;
            zzfdVar.e.zzl();
            cwo cwoVar3 = zzfdVar.a;
            n6o n6oVar = zzfdVar.b;
            cwoVar3.o();
            n6oVar.getClass();
            cwoVar3.m.b(n6oVar);
            xwo xwoVar = cwoVar2.l;
            if (xwoVar.G || !xwoVar.i.getThread().isAlive()) {
                z = true;
            } else {
                xwoVar.G = true;
                zzdt zzdtVar = new zzdt();
                xwoVar.g.h(7, zzdtVar).a();
                z = zzdtVar.c(500L);
            }
            if (!z) {
                zzeg zzegVar = cwoVar2.m;
                zzegVar.c(10, bgf.o);
                zzegVar.d();
            }
            cwoVar2.m.e();
            cwoVar2.j.zzl();
            zzabu zzabuVar = cwoVar2.s;
            zzpv zzpvVar = cwoVar2.q;
            zzabuVar.a(zzpvVar);
            cwoVar2.V.getClass();
            eyo k = cwo.k(cwoVar2.V, 1);
            cwoVar2.V = k;
            eyo g = k.g(k.b);
            cwoVar2.V = g;
            g.p = g.r;
            cwoVar2.V.q = 0L;
            zzea zzeaVar = zzpvVar.h;
            zzeaVar.getClass();
            zzeaVar.f(new dno(zzpvVar, 11));
            Surface surface = cwoVar2.K;
            if (surface != null) {
                surface.release();
                cwoVar2.K = null;
            }
            bio bioVar = zzda.a;
            cwoVar2.T = true;
            if (!cwoVar2.V.a.g()) {
                eyo eyoVar = cwoVar2.V;
                boolean z2 = eyoVar.a.e(eyoVar.b.a) != -1;
                Locale locale = Locale.US;
                eyo eyoVar2 = cwoVar2.V;
                zzguk.g(String.format(locale, "periodUid %s not found in timeline %s with size %d", eyoVar2.b.a, eyoVar2.a.getClass().getName(), Integer.valueOf(cwoVar2.V.a.a())), z2);
            }
            this.i = null;
            zzchw.b.decrementAndGet();
        }
    }

    public final void B() {
        zzno zznoVar = this.i;
        zznoVar.c.b();
        cwo cwoVar = zznoVar.b;
        cwoVar.o();
        cwoVar.d(null);
        mio mioVar = zzgxm.b;
        s sVar = s.e;
        long j = cwoVar.V.r;
        new zzda(sVar);
    }

    public final void C(int i) {
        zzcke zzckeVar = this.d;
        synchronized (zzckeVar) {
            zzckeVar.d = i * 1000;
        }
    }

    public final void D(int i) {
        zzcke zzckeVar = this.d;
        synchronized (zzckeVar) {
            zzckeVar.e = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void a(zzbv zzbvVar) {
        zzchv zzchvVar = this.l;
        if (zzchvVar != null) {
            zzchvVar.b(zzbvVar.a, zzbvVar.b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void b(IOException iOException) {
        zzchv zzchvVar = this.l;
        if (zzchvVar != null) {
            if (this.f.j) {
                zzchvVar.d(iOException);
            } else {
                zzchvVar.c("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void d(int i) {
        this.n += i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zziq
    public final void e(zzhk zzhkVar, zzhw zzhwVar, boolean z) {
        if (zzhkVar instanceof zzil) {
            synchronized (this.r) {
                this.t.add((zzil) zzhkVar);
            }
        } else if (zzhkVar instanceof zzckh) {
            this.u = (zzckh) zzhkVar;
            zzcif zzcifVar = (zzcif) this.g.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.G2)).booleanValue() && zzcifVar != null && this.u.o) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.u.q));
                hashMap.put("gcacheDownloaded", String.valueOf(this.u.r));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new wjn(6, zzcifVar, hashMap));
            }
        }
    }

    public final void finalize() {
        zzchw.a.decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void i(zzv zzvVar) {
        zzcif zzcifVar = (zzcif) this.g.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.G2)).booleanValue() || zzcifVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String str = zzvVar.n;
        if (str != null) {
            hashMap.put("audioMime", str);
        }
        String str2 = zzvVar.o;
        if (str2 != null) {
            hashMap.put("audioSampleMime", str2);
        }
        String str3 = zzvVar.k;
        if (str3 != null) {
            hashMap.put("audioCodec", str3);
        }
        zzcifVar.n("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void j(int i) {
        zzchv zzchvVar = this.l;
        if (zzchvVar != null) {
            zzchvVar.zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void k(zzau zzauVar) {
        zzchv zzchvVar = this.l;
        if (zzchvVar != null) {
            zzchvVar.c("onPlayerError", zzauVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void l(zzv zzvVar) {
        zzcif zzcifVar = (zzcif) this.g.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.G2)).booleanValue() || zzcifVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzvVar.z));
        hashMap.put("bitRate", String.valueOf(zzvVar.j));
        int i = zzvVar.v;
        int i2 = zzvVar.w;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        hashMap.put("resolution", sb.toString());
        String str = zzvVar.n;
        if (str != null) {
            hashMap.put("videoMime", str);
        }
        String str2 = zzvVar.o;
        if (str2 != null) {
            hashMap.put("videoSampleMime", str2);
        }
        String str3 = zzvVar.k;
        if (str3 != null) {
            hashMap.put("videoCodec", str3);
        }
        zzcifVar.n("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zziq
    public final void m(zzhw zzhwVar, boolean z, int i) {
        this.m += i;
    }

    public final boolean p() {
        return this.i != null;
    }

    public final void q(boolean z) {
        zzno zznoVar = this.i;
        zznoVar.c.b();
        cwo cwoVar = zznoVar.b;
        cwoVar.o();
        eyo eyoVar = cwoVar.V;
        int i = eyoVar.n;
        int i2 = 0;
        if (i == 1) {
            if (z) {
                i = 1;
            } else {
                i = 1;
                i2 = 1;
            }
        }
        if (eyoVar.l == z && i == i2 && eyoVar.m == 1) {
            return;
        }
        cwoVar.E++;
        eyo h = eyoVar.h(1, i2, z);
        cwoVar.l.g.zze(1, z ? 1 : 0, (i2 << 4) | 1).a();
        cwoVar.h(h, 0, false, 5, C.TIME_UNSET, -1);
    }

    public final void r(int i) {
        zzcke zzckeVar = this.d;
        synchronized (zzckeVar) {
            zzckeVar.b = i * 1000;
        }
    }

    public final void s(int i) {
        zzcke zzckeVar = this.d;
        synchronized (zzckeVar) {
            zzckeVar.c = i * 1000;
        }
    }

    public final long t() {
        if (this.u == null || !this.u.p) {
            return this.m;
        }
        return 0L;
    }

    public final long u() {
        if (this.u != null && this.u.p && this.u.q) {
            return Math.min(this.m, this.u.s);
        }
        return 0L;
    }

    public final long v() {
        ddb ddbVar;
        if (this.u != null && this.u.p) {
            zzckh zzckhVar = this.u;
            if (zzckhVar.n != null) {
                AtomicLong atomicLong = zzckhVar.u;
                if (atomicLong.get() != -1) {
                    return atomicLong.get();
                }
                synchronized (zzckhVar) {
                    try {
                        ddbVar = zzckhVar.t;
                        if (ddbVar == null) {
                            ddbVar = zzcgj.a.submit(new v35(zzckhVar, 9));
                            zzckhVar.t = ddbVar;
                        }
                    } finally {
                    }
                }
                if (ddbVar.isDone()) {
                    try {
                        zzckhVar.u.compareAndSet(-1L, ((Long) zzckhVar.t.get()).longValue());
                        return zzckhVar.u.get();
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
            }
            return -1L;
        }
        synchronized (this.r) {
            while (true) {
                ArrayList arrayList = this.t;
                if (!arrayList.isEmpty()) {
                    long j = this.o;
                    Map zzj = ((zzil) arrayList.remove(0)).zzj();
                    long j2 = 0;
                    if (zzj != null) {
                        Iterator it = zzj.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && zzgts.d((CharSequence) entry.getKey(), "content-length") && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused2) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.o = j + j2;
                }
            }
        }
        return this.o;
    }

    public final void w(boolean z) {
        zzaaq zzaaqVar;
        boolean equals;
        if (this.i == null) {
            return;
        }
        int i = 0;
        while (true) {
            zzno zznoVar = this.i;
            zznoVar.c.b();
            cwo cwoVar = zznoVar.b;
            cwoVar.o();
            int length = cwoVar.g.length;
            if (i >= 2) {
                return;
            }
            zzabc zzabcVar = this.e;
            synchronized (zzabcVar.c) {
                zzaaqVar = zzabcVar.e;
            }
            zzaaqVar.getClass();
            zzaap zzaapVar = new zzaap(zzaaqVar);
            boolean z2 = !z;
            SparseBooleanArray sparseBooleanArray = zzaapVar.E;
            if (sparseBooleanArray.get(i) != z2) {
                if (z) {
                    sparseBooleanArray.delete(i);
                } else {
                    sparseBooleanArray.put(i, true);
                }
            }
            zzaaq zzaaqVar2 = new zzaaq(zzaapVar);
            synchronized (zzabcVar.c) {
                equals = zzabcVar.e.equals(zzaaqVar2);
                zzabcVar.e = zzaaqVar2;
            }
            if (!equals) {
                if (zzaaqVar2.A && zzabcVar.d == null) {
                    zzeh.c("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
                }
                xwo xwoVar = zzabcVar.a;
                if (xwoVar != null) {
                    xwoVar.g.g(10);
                }
            }
            i++;
        }
    }

    public final zzyy x(Uri uri) {
        zzz zzzVar = new zzz();
        zzzVar.b = uri;
        zzak a = zzzVar.a();
        int i = this.f.f;
        zzyx zzyxVar = this.h;
        zzyxVar.c = i;
        a.b.getClass();
        return new zzyy(a, zzyxVar.a, zzyxVar.b, zzyxVar.d, zzyxVar.c);
    }

    public final void y(Uri[] uriArr, String str) {
        z(uriArr, ByteBuffer.allocate(0), false);
    }

    public final void z(Uri[] uriArr, ByteBuffer byteBuffer, boolean z) {
        Object zzyfVar;
        if (this.i != null) {
            this.j = byteBuffer;
            this.k = z;
            int length = uriArr.length;
            if (length == 1) {
                zzyfVar = x(uriArr[0]);
            } else {
                zzxq[] zzxqVarArr = new zzxq[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzxqVarArr[i] = x(uriArr[i]);
                }
                zzyfVar = new zzyf(new zzwz(), zzxqVarArr);
            }
            zzno zznoVar = this.i;
            zznoVar.c.b();
            cwo cwoVar = zznoVar.b;
            cwoVar.o();
            List singletonList = Collections.singletonList(zzyfVar);
            cwoVar.o();
            cwoVar.o();
            cwoVar.e(cwoVar.V);
            cwoVar.s();
            cwoVar.E++;
            ArrayList arrayList = cwoVar.o;
            arrayList.clear();
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < singletonList.size(); i2++) {
                ayo ayoVar = new ayo((zzxq) singletonList.get(i2), cwoVar.p);
                arrayList2.add(ayoVar);
                arrayList.add(i2, new uvo(ayoVar.b, ayoVar.a));
            }
            cwoVar.Y = new zzzj(new Random(cwoVar.Y.a.nextLong())).a(arrayList2.size());
            tyo tyoVar = new tyo(arrayList, cwoVar.Y);
            boolean g = tyoVar.g();
            int i3 = tyoVar.d;
            if (!g && i3 < 0) {
                throw new zzw();
            }
            int k = tyoVar.k(false);
            eyo j = cwoVar.j(cwoVar.V, tyoVar, cwoVar.l(tyoVar, k, C.TIME_UNSET));
            int i4 = j.e;
            if (i4 == 1) {
                i4 = 1;
            } else {
                if (!tyoVar.g()) {
                    if (k != -1) {
                        if (k < i3) {
                            i4 = 2;
                        }
                    }
                }
                i4 = 4;
            }
            eyo k2 = cwo.k(j, i4);
            xwo xwoVar = cwoVar.l;
            long u = zzfm.u(C.TIME_UNSET);
            zzzj zzzjVar = cwoVar.Y;
            xwoVar.getClass();
            xwoVar.g.h(17, new pwo(arrayList2, zzzjVar, k, u)).a();
            cwoVar.h(k2, 0, (cwoVar.V.b.a.equals(k2.b.a) || cwoVar.V.a.g()) ? false : true, 4, cwoVar.g(k2), -1);
            zzno zznoVar2 = this.i;
            zznoVar2.c.b();
            cwo cwoVar2 = zznoVar2.b;
            cwoVar2.o();
            eyo eyoVar = cwoVar2.V;
            if (eyoVar.e == 1) {
                eyo e = eyoVar.e(null);
                eyo k3 = cwo.k(e, true == e.a.g() ? 4 : 2);
                cwoVar2.E++;
                cwoVar2.l.g.k(29).a();
                cwoVar2.h(k3, 1, false, 5, C.TIME_UNSET, -1);
            }
            zzchw.b.incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void zzo() {
        zzchv zzchvVar = this.l;
        if (zzchvVar != null) {
            zzchvVar.zzD();
        }
    }

    @Override // com.google.android.gms.internal.ads.zziq
    public final void f(zzhw zzhwVar, boolean z) {
    }
}
