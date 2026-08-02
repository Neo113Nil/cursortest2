package com.google.android.gms.internal.measurement;

import Ra.k;
import Ra.n;
import Ra.t;
import Ra.u;
import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class zzkm {
    public static final /* synthetic */ int zzc = 0;
    private static final Object zzd = new Object();
    private static volatile zzkh zze = null;
    private static volatile boolean zzf = false;
    private static final AtomicInteger zzh;
    final zzkg zza;
    final String zzb;
    private Object zzg;
    private volatile int zzi = -1;
    private volatile Object zzj;
    private volatile boolean zzk;

    static {
        new AtomicReference();
        n.l(zzkk.zza, "BuildInfo must be non-null");
        zzh = new AtomicInteger();
    }

    public /* synthetic */ zzkm(zzkg zzkgVar, String str, Object obj, boolean z10, byte[] bArr) {
        if (zzkgVar.zza == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zza = zzkgVar;
        this.zzb = str;
        this.zzg = obj;
        this.zzk = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004c, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void zzb(final Context context) {
        if (zze != null || context == null) {
            return;
        }
        Object obj = zzd;
        synchronized (obj) {
            try {
                if (zze == null) {
                    synchronized (obj) {
                        zzkh zzkhVar = zze;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (zzkhVar != null) {
                            if (zzkhVar.zza() != context) {
                            }
                        }
                        if (zzkhVar != null) {
                            zzjr.zzd();
                            zzko.zzb();
                            zzjy.zzc();
                        }
                        zze = new zzjn(context, u.a(new t() { // from class: com.google.android.gms.internal.measurement.zzkl
                            @Override // Ra.t
                            public final /* synthetic */ Object get() {
                                int i10 = zzkm.zzc;
                                return zzjz.zza(context);
                            }
                        }));
                        zzh.incrementAndGet();
                    }
                }
            } finally {
            }
        }
    }

    public static void zzc() {
        zzh.incrementAndGet();
    }

    public abstract Object zza(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:16:0x0050, B:18:0x005b, B:20:0x0065, B:22:0x0088, B:24:0x0090, B:27:0x00b7, B:30:0x00bf, B:31:0x00c2, B:32:0x00c6, B:33:0x0099, B:35:0x009d, B:37:0x00ad, B:39:0x00b3, B:43:0x0076, B:46:0x00ca), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:16:0x0050, B:18:0x005b, B:20:0x0065, B:22:0x0088, B:24:0x0090, B:27:0x00b7, B:30:0x00bf, B:31:0x00c2, B:32:0x00c6, B:33:0x0099, B:35:0x009d, B:37:0x00ad, B:39:0x00b3, B:43:0x0076, B:46:0x00ca), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:16:0x0050, B:18:0x005b, B:20:0x0065, B:22:0x0088, B:24:0x0090, B:27:0x00b7, B:30:0x00bf, B:31:0x00c2, B:32:0x00c6, B:33:0x0099, B:35:0x009d, B:37:0x00ad, B:39:0x00b3, B:43:0x0076, B:46:0x00ca), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzd() {
        String str;
        Object zza;
        String zze2;
        Object zze3;
        int i10 = zzh.get();
        if (this.zzi < i10) {
            synchronized (this) {
                try {
                    if (this.zzi < i10) {
                        zzkh zzkhVar = zze;
                        k a10 = k.a();
                        Object obj = null;
                        if (zzkhVar != null && zzkhVar.zzb() != null) {
                            a10 = (k) ((t) n.k(zzkhVar.zzb())).get();
                            if (a10.c()) {
                                zzjt zzjtVar = (zzjt) a10.b();
                                zzkg zzkgVar = this.zza;
                                str = zzjtVar.zza(zzkgVar.zza, null, zzkgVar.zzc, this.zzb);
                                n.q(zzkhVar == null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                                zzkg zzkgVar2 = this.zza;
                                Uri uri = zzkgVar2.zza;
                                zzjv zza2 = uri == null ? zzka.zza(zzkhVar.zza(), uri) ? zzjr.zza(zzkhVar.zza().getContentResolver(), uri, zzkj.zza) : null : zzko.zza(zzkhVar.zza(), (String) n.k(null), zzki.zza);
                                zza = (zza2 != null || (zze3 = zza2.zze(this.zzb)) == null) ? null : zza(zze3);
                                if (zza == null) {
                                    if (!zzkgVar2.zzd && (zze2 = zzjy.zza(zzkhVar.zza()).zze(this.zzb)) != null) {
                                        obj = zza(zze2);
                                    }
                                    zza = obj == null ? this.zzg : obj;
                                }
                                if (a10.c()) {
                                    zza = str == null ? this.zzg : zza(str);
                                }
                                this.zzj = zza;
                                this.zzi = i10;
                            }
                        }
                        str = null;
                        n.q(zzkhVar == null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        zzkg zzkgVar22 = this.zza;
                        Uri uri2 = zzkgVar22.zza;
                        if (uri2 == null) {
                        }
                        if (zza2 != null) {
                        }
                        if (zza == null) {
                        }
                        if (a10.c()) {
                        }
                        this.zzj = zza;
                        this.zzi = i10;
                    }
                } finally {
                }
            }
        }
        return this.zzj;
    }
}
