package com.google.android.gms.internal.mlkit_vision_barcode;

import Z8.d;
import Z8.g;
import android.content.Context;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.mlkit.common.sdkinternal.m;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public final class zzxk {
    private static final GmsLogger zzf = new GmsLogger("AutoZoom");
    final zzxm zza;
    final zzbw zzb;
    ScheduledFuture zzc;
    String zzd;
    int zze;
    private final AtomicBoolean zzg;
    private final Object zzh;
    private final ScheduledExecutorService zzi;
    private final zzbb zzj;
    private final zzwp zzk;
    private final String zzl;
    private Executor zzm;
    private float zzn;
    private float zzo;
    private long zzp;
    private long zzq;
    private boolean zzr;
    private d zzs;

    private zzxk(Context context, zzxm zzxmVar, String str) {
        zzg.zza();
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(2));
        zzbb zza = zzar.zza();
        zzwp zzwpVar = new zzwp(context, new m(context), new zzwi(context, zzwh.zzd("scanner-auto-zoom").zzd()), "scanner-auto-zoom");
        this.zzh = new Object();
        this.zza = zzxmVar;
        this.zzg = new AtomicBoolean(false);
        this.zzb = zzbw.zzz();
        this.zzi = unconfigurableScheduledExecutorService;
        this.zzj = zza;
        this.zzk = zzwpVar;
        this.zzl = str;
        this.zze = 1;
        this.zzn = 1.0f;
        this.zzo = -1.0f;
        this.zzp = zza.zza();
    }

    public static zzxk zzd(Context context, String str) {
        return new zzxk(context, zzxm.zza, str);
    }

    public static /* synthetic */ void zzf(zzxk zzxkVar) {
        ScheduledFuture scheduledFuture;
        synchronized (zzxkVar.zzh) {
            try {
                if (zzxkVar.zze == 2 && !zzxkVar.zzg.get() && (scheduledFuture = zzxkVar.zzc) != null && !scheduledFuture.isCancelled()) {
                    if (zzxkVar.zzn > 1.0f && zzxkVar.zza() >= zzxkVar.zza.zzi()) {
                        zzf.i("AutoZoom", "Reset zoom = 1");
                        zzxkVar.zzl(1.0f, zzrc.SCANNER_AUTO_ZOOM_AUTO_RESET, null);
                    }
                }
            } finally {
            }
        }
    }

    static /* bridge */ /* synthetic */ void zzg(zzxk zzxkVar, float f7) {
        synchronized (zzxkVar.zzh) {
            zzxkVar.zzn = f7;
            zzxkVar.zzr(false);
        }
    }

    private final float zzp(float f7) {
        float f11 = this.zzo;
        if (f7 < 1.0f) {
            f7 = 1.0f;
        }
        return (f11 <= 0.0f || f7 <= f11) ? f7 : f11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzq(zzrc zzrcVar, float f7, float f11, zzxn zzxnVar) {
        long convert;
        if (this.zzd != null) {
            zzuo zzuoVar = new zzuo();
            zzuoVar.zza(this.zzl);
            String str = this.zzd;
            str.getClass();
            zzuoVar.zze(str);
            zzuoVar.zzf(Float.valueOf(f7));
            zzuoVar.zzc(Float.valueOf(f11));
            synchronized (this.zzh) {
                convert = TimeUnit.MILLISECONDS.convert(this.zzj.zza() - this.zzq, TimeUnit.NANOSECONDS);
            }
            zzuoVar.zzb(Long.valueOf(convert));
            if (zzxnVar != null) {
                zzup zzupVar = new zzup();
                zzupVar.zzc(Float.valueOf(zzxnVar.zzc()));
                zzupVar.zze(Float.valueOf(zzxnVar.zze()));
                zzupVar.zzb(Float.valueOf(zzxnVar.zzb()));
                zzupVar.zzd(Float.valueOf(zzxnVar.zzd()));
                zzupVar.zza(Float.valueOf(0.0f));
                zzuoVar.zzd(zzupVar.zzf());
            }
            zzwp zzwpVar = this.zzk;
            zzrd zzrdVar = new zzrd();
            zzrdVar.zzi(zzuoVar.zzh());
            zzwpVar.zzd(zzws.zzf(zzrdVar), zzrcVar);
        }
    }

    private final void zzr(boolean z11) {
        ScheduledFuture scheduledFuture;
        synchronized (this.zzh) {
            try {
                this.zzb.zzs();
                this.zzp = this.zzj.zza();
                if (z11 && (scheduledFuture = this.zzc) != null) {
                    scheduledFuture.cancel(false);
                    this.zzc = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final long zza() {
        long convert;
        synchronized (this.zzh) {
            convert = TimeUnit.MILLISECONDS.convert(this.zzj.zza() - this.zzp, TimeUnit.NANOSECONDS);
        }
        return convert;
    }

    final /* synthetic */ zzet zzc(float f7) throws Exception {
        d dVar = this.zzs;
        zzp(f7);
        dVar.getClass();
        int i11 = g.f35698h;
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x026c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x000e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(int i11, zzxn zzxnVar) {
        float f7;
        synchronized (this.zzh) {
            try {
                if (this.zze != 2) {
                    return;
                }
                if (zzxnVar.zzh() && (!this.zza.zzl() || this.zza.zzb() <= 0.0f)) {
                    if (!this.zzr) {
                        zzrc zzrcVar = zzrc.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
                        float f11 = this.zzn;
                        zzq(zzrcVar, f11, f11, zzxnVar);
                        this.zzr = true;
                    }
                    GmsLogger gmsLogger = zzf;
                    Locale locale = Locale.getDefault();
                    Float valueOf = Float.valueOf(zzxnVar.zzc());
                    Float valueOf2 = Float.valueOf(zzxnVar.zze());
                    Float valueOf3 = Float.valueOf(zzxnVar.zzb());
                    Float valueOf4 = Float.valueOf(zzxnVar.zzd());
                    Float valueOf5 = Float.valueOf(0.0f);
                    Integer valueOf6 = Integer.valueOf(i11);
                    gmsLogger.i("AutoZoom", String.format(locale, "Process PredictedArea: [%.2f, %.2f, %.2f, %.2f, %.2f], frameIndex = %d", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6));
                    this.zzb.zzt(valueOf6, zzxnVar);
                    Set zzw = this.zzb.zzw();
                    if (zzw.size() - 1 > this.zza.zzh()) {
                        Iterator it = zzw.iterator();
                        int i12 = i11;
                        while (it.hasNext()) {
                            int intValue = ((Integer) it.next()).intValue();
                            if (i12 > intValue) {
                                i12 = intValue;
                            }
                        }
                        zzf.i("AutoZoom", "Removing recent frameIndex = " + i12);
                        this.zzb.zzf(Integer.valueOf(i12));
                    }
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : this.zzb.zzu()) {
                        if (((Integer) entry.getKey()).intValue() != i11) {
                            zzxn zzxnVar2 = (zzxn) entry.getValue();
                            if (zzxnVar2.zzh() && zzxnVar.zzh()) {
                                zzxg zzxgVar = new zzxg(Math.max(zzxnVar2.zzc(), zzxnVar.zzc()), Math.max(zzxnVar2.zze(), zzxnVar.zze()), Math.min(zzxnVar2.zzb(), zzxnVar.zzb()), Math.min(zzxnVar2.zzd(), zzxnVar.zzd()), 0.0f);
                                f7 = zzxgVar.zzf() / ((zzxnVar2.zzf() + zzxnVar.zzf()) - zzxgVar.zzf());
                            } else {
                                f7 = 0.0f;
                            }
                            if (f7 >= this.zza.zzd()) {
                                hashSet.add((Integer) entry.getKey());
                            }
                        }
                    }
                    if (hashSet.size() >= this.zza.zzg() || (this.zza.zzl() && this.zza.zza() <= 0.0f)) {
                        synchronized (this.zzh) {
                            if (zza() >= this.zza.zzj()) {
                                zzdv listIterator = zzcs.zzi(Float.valueOf(zzxnVar.zzc()), Float.valueOf(zzxnVar.zze()), Float.valueOf(zzxnVar.zzb()), Float.valueOf(zzxnVar.zzd())).listIterator(0);
                                float f12 = 1.0E9f;
                                while (listIterator.hasNext()) {
                                    float zzc = (this.zza.zzc() / 2.0f) / Math.max(Math.abs(((Float) listIterator.next()).floatValue() - 0.5f), 0.001f);
                                    if (f12 > zzc) {
                                        f12 = zzc;
                                    }
                                }
                                float zzp = zzp(this.zzn * f12);
                                if (this.zza.zzk()) {
                                    float f13 = this.zzn;
                                    float f14 = (zzp - f13) / f13;
                                    if (f14 <= this.zza.zze() && f14 >= (-this.zza.zzf())) {
                                        zzf.i("AutoZoom", "Auto zoom to " + zzp + " is filtered by threshold");
                                        this.zzp = this.zzj.zza();
                                    }
                                }
                                zzf.i("AutoZoom", "Going to set zoom = " + zzp);
                                zzl(zzp, zzrc.SCANNER_AUTO_ZOOM_AUTO_ZOOM, zzxnVar);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void zzj() {
        synchronized (this.zzh) {
            try {
                if (this.zze == 4) {
                    return;
                }
                zzn(false);
                this.zzi.shutdown();
                this.zze = 4;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzk(float f7) {
        synchronized (this.zzh) {
            zzaz.zzd(f7 >= 1.0f);
            this.zzo = f7;
        }
    }

    final void zzl(float f7, zzrc zzrcVar, zzxn zzxnVar) {
        synchronized (this.zzh) {
        }
    }

    public final void zzm() {
        synchronized (this.zzh) {
            try {
                int i11 = this.zze;
                if (i11 != 2 && i11 != 4) {
                    zzr(true);
                    this.zzc = this.zzi.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzxi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzxk.zzf(zzxk.this);
                        }
                    }, 500L, 500L, TimeUnit.MILLISECONDS);
                    if (this.zze == 1) {
                        this.zzd = UUID.randomUUID().toString();
                        this.zzq = this.zzj.zza();
                        this.zzr = false;
                        zzrc zzrcVar = zzrc.SCANNER_AUTO_ZOOM_START;
                        float f7 = this.zzn;
                        zzq(zzrcVar, f7, f7, null);
                    } else {
                        zzrc zzrcVar2 = zzrc.SCANNER_AUTO_ZOOM_RESUME;
                        float f11 = this.zzn;
                        zzq(zzrcVar2, f11, f11, null);
                    }
                    this.zze = 2;
                }
            } finally {
            }
        }
    }

    public final void zzn(boolean z11) {
        synchronized (this.zzh) {
            try {
                int i11 = this.zze;
                if (i11 != 1 && i11 != 4) {
                    zzr(true);
                    if (z11) {
                        if (!this.zzr) {
                            zzrc zzrcVar = zzrc.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
                            float f7 = this.zzn;
                            zzq(zzrcVar, f7, f7, null);
                        }
                        zzrc zzrcVar2 = zzrc.SCANNER_AUTO_ZOOM_SCAN_SUCCESS;
                        float f11 = this.zzn;
                        zzq(zzrcVar2, f11, f11, null);
                    } else {
                        zzrc zzrcVar3 = zzrc.SCANNER_AUTO_ZOOM_SCAN_FAILED;
                        float f12 = this.zzn;
                        zzq(zzrcVar3, f12, f12, null);
                    }
                    this.zzr = false;
                    this.zze = 1;
                    this.zzd = null;
                }
            } finally {
            }
        }
    }

    public final void zzo(d dVar, Executor executor) {
        this.zzs = dVar;
        this.zzm = executor;
    }
}
