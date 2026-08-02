package com.google.android.gms.measurement.internal;

import C.C2702w;
import G.g;
import N3.C3661l;
import T7.E;
import U7.C4056a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

@VisibleForTesting
/* loaded from: classes.dex */
public final class zzke extends zzf {
    private final zzkd zza;
    private zzeq zzb;
    private volatile Boolean zzc;
    private final zzap zzd;
    private final zzkv zze;
    private final List zzf;
    private final zzap zzg;

    protected zzke(zzgk zzgkVar) {
        super(zzgkVar);
        this.zzf = new ArrayList();
        this.zze = new zzkv(zzgkVar.zzav());
        this.zza = new zzkd(this);
        this.zzd = new zzjo(this, zzgkVar);
        this.zzg = new zzjq(this, zzgkVar);
    }

    private final zzq zzO(boolean z11) {
        Pair zza;
        this.zzs.zzaw();
        zzer zzh = this.zzs.zzh();
        String str = null;
        if (z11) {
            zzfa zzay = this.zzs.zzay();
            if (zzay.zzs.zzm().zzb != null && (zza = zzay.zzs.zzm().zzb.zza()) != null && zza != zzfp.zza) {
                str = g.c(String.valueOf(zza.second), ProductContainerDTO.RATIO_DELIMITER, (String) zza.first);
            }
        }
        return zzh.zzj(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzP() {
        zzg();
        this.zzs.zzay().zzj().zzb("Processing queued up service tasks", Integer.valueOf(this.zzf.size()));
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e11) {
                this.zzs.zzay().zzd().zzb("Task exception while flushing queue", e11);
            }
        }
        this.zzf.clear();
        this.zzg.zzb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzQ() {
        zzg();
        this.zze.zzb();
        zzap zzapVar = this.zzd;
        this.zzs.zzf();
        zzapVar.zzd(((Long) zzen.zzI.zza(null)).longValue());
    }

    private final void zzR(Runnable runnable) throws IllegalStateException {
        zzg();
        if (zzL()) {
            runnable.run();
            return;
        }
        int size = this.zzf.size();
        this.zzs.zzf();
        if (size >= 1000) {
            C3661l.b(this.zzs, "Discarding data. Max runnable queue size reached");
            return;
        }
        this.zzf.add(runnable);
        this.zzg.zzd(60000L);
        zzr();
    }

    private final boolean zzS() {
        this.zzs.zzaw();
        return true;
    }

    static /* bridge */ /* synthetic */ void zzo(zzke zzkeVar, ComponentName componentName) {
        zzkeVar.zzg();
        if (zzkeVar.zzb != null) {
            zzkeVar.zzb = null;
            zzkeVar.zzs.zzay().zzj().zzb("Disconnected from device MeasurementService", componentName);
            zzkeVar.zzg();
            zzkeVar.zzr();
        }
    }

    protected final void zzA(zzaw zzawVar, String str) {
        Preconditions.checkNotNull(zzawVar);
        zzg();
        zza();
        zzS();
        zzR(new zzjt(this, true, zzO(true), this.zzs.zzi().zzo(zzawVar), zzawVar, str));
    }

    public final void zzB(com.google.android.gms.internal.measurement.zzcf zzcfVar, zzaw zzawVar, String str) {
        zzg();
        zza();
        if (this.zzs.zzv().zzo(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) == 0) {
            zzR(new zzjp(this, zzawVar, str, zzcfVar));
        } else {
            C4056a.a(this.zzs, "Not bundling data. Service unavailable or out of date");
            this.zzs.zzv().zzS(zzcfVar, new byte[0]);
        }
    }

    protected final void zzC() {
        zzg();
        zza();
        zzq zzO = zzO(false);
        zzS();
        this.zzs.zzi().zzj();
        zzR(new zzji(this, zzO));
    }

    @VisibleForTesting
    final void zzD(zzeq zzeqVar, AbstractSafeParcelable abstractSafeParcelable, zzq zzqVar) {
        int i11;
        zzg();
        zza();
        zzS();
        this.zzs.zzf();
        int i12 = 100;
        int i13 = 0;
        while (i13 < 1001 && i12 == 100) {
            ArrayList arrayList = new ArrayList();
            List zzi = this.zzs.zzi().zzi(100);
            if (zzi != null) {
                arrayList.addAll(zzi);
                i11 = zzi.size();
            } else {
                i11 = 0;
            }
            if (abstractSafeParcelable != null && i11 < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i14);
                if (abstractSafeParcelable2 instanceof zzaw) {
                    try {
                        zzeqVar.zzk((zzaw) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e11) {
                        this.zzs.zzay().zzd().zzb("Failed to send event to the service", e11);
                    }
                } else if (abstractSafeParcelable2 instanceof zzlo) {
                    try {
                        zzeqVar.zzt((zzlo) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e12) {
                        this.zzs.zzay().zzd().zzb("Failed to send user property to the service", e12);
                    }
                } else if (abstractSafeParcelable2 instanceof zzac) {
                    try {
                        zzeqVar.zzn((zzac) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e13) {
                        this.zzs.zzay().zzd().zzb("Failed to send conditional user property to the service", e13);
                    }
                } else {
                    C3661l.b(this.zzs, "Discarding data. Unrecognized parcel type.");
                }
            }
            i13++;
            i12 = i11;
        }
    }

    protected final void zzE(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        zzg();
        zza();
        this.zzs.zzaw();
        zzR(new zzju(this, true, zzO(true), this.zzs.zzi().zzn(zzacVar), new zzac(zzacVar), zzacVar));
    }

    protected final void zzF(boolean z11) {
        zzg();
        zza();
        if (z11) {
            zzS();
            this.zzs.zzi().zzj();
        }
        if (zzM()) {
            zzR(new zzjs(this, zzO(false)));
        }
    }

    protected final void zzG(zziw zziwVar) {
        zzg();
        zza();
        zzR(new zzjm(this, zziwVar));
    }

    public final void zzH(Bundle bundle) {
        zzg();
        zza();
        zzR(new zzjn(this, zzO(false), bundle));
    }

    protected final void zzI() {
        zzg();
        zza();
        zzR(new zzjr(this, zzO(true)));
    }

    @VisibleForTesting
    protected final void zzJ(zzeq zzeqVar) {
        zzg();
        Preconditions.checkNotNull(zzeqVar);
        this.zzb = zzeqVar;
        zzQ();
        zzP();
    }

    protected final void zzK(zzlo zzloVar) {
        zzg();
        zza();
        zzS();
        zzR(new zzjg(this, zzO(true), this.zzs.zzi().zzp(zzloVar), zzloVar));
    }

    public final boolean zzL() {
        zzg();
        zza();
        return this.zzb != null;
    }

    final boolean zzM() {
        zzg();
        zza();
        return !zzN() || this.zzs.zzv().zzm() >= ((Integer) zzen.zzai.zza(null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean zzN() {
        zzg();
        zza();
        if (this.zzc == null) {
            zzg();
            zza();
            zzfp zzm = this.zzs.zzm();
            zzm.zzg();
            boolean z11 = false;
            Boolean valueOf = !zzm.zza().contains("use_service") ? null : Boolean.valueOf(zzm.zza().getBoolean("use_service", false));
            if (valueOf == null || !valueOf.booleanValue()) {
                this.zzs.zzaw();
                if (this.zzs.zzh().zzh() != 1) {
                    E.g(this.zzs, "Checking service availability");
                    int zzo = this.zzs.zzv().zzo(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                    if (zzo != 0) {
                        if (zzo == 1) {
                            E.g(this.zzs, "Service missing");
                        } else if (zzo != 2) {
                            if (zzo == 3) {
                                C4056a.a(this.zzs, "Service disabled");
                            } else if (zzo == 9) {
                                C4056a.a(this.zzs, "Service invalid");
                            } else if (zzo != 18) {
                                this.zzs.zzay().zzk().zzb("Unexpected service status", Integer.valueOf(zzo));
                            } else {
                                C4056a.a(this.zzs, "Service updating");
                            }
                            r1 = false;
                        } else {
                            this.zzs.zzay().zzc().zza("Service container out of date");
                            if (this.zzs.zzv().zzm() >= 17443) {
                                z11 = valueOf == null;
                                r1 = false;
                            }
                        }
                        if (z11 && this.zzs.zzf().zzx()) {
                            C3661l.b(this.zzs, "No way to upload. Consider using the full version of Analytics");
                        } else if (r1) {
                            zzfp zzm2 = this.zzs.zzm();
                            zzm2.zzg();
                            C2702w.e(zzm2.zza(), "use_service", z11);
                        }
                        r1 = z11;
                    } else {
                        E.g(this.zzs, "Service available");
                    }
                }
                z11 = true;
                if (z11) {
                }
                if (r1) {
                }
                r1 = z11;
            }
            this.zzc = Boolean.valueOf(r1);
        }
        return this.zzc.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }

    final Boolean zzj() {
        return this.zzc;
    }

    protected final void zzq() {
        zzg();
        zza();
        zzq zzO = zzO(true);
        this.zzs.zzi().zzk();
        zzR(new zzjl(this, zzO));
    }

    final void zzr() {
        zzg();
        zza();
        if (zzL()) {
            return;
        }
        if (zzN()) {
            this.zza.zzc();
            return;
        }
        if (this.zzs.zzf().zzx()) {
            return;
        }
        this.zzs.zzaw();
        List<ResolveInfo> queryIntentServices = this.zzs.zzau().getPackageManager().queryIntentServices(new Intent().setClassName(this.zzs.zzau(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            C3661l.b(this.zzs, "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context zzau = this.zzs.zzau();
        this.zzs.zzaw();
        intent.setComponent(new ComponentName(zzau, "com.google.android.gms.measurement.AppMeasurementService"));
        this.zza.zzb(intent);
    }

    public final void zzs() {
        zzg();
        zza();
        this.zza.zzd();
        try {
            ConnectionTracker.getInstance().unbindService(this.zzs.zzau(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzb = null;
    }

    public final void zzt(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzg();
        zza();
        zzR(new zzjk(this, zzO(false), zzcfVar));
    }

    public final void zzu(AtomicReference atomicReference) {
        zzg();
        zza();
        zzR(new zzjj(this, atomicReference, zzO(false)));
    }

    protected final void zzv(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2) {
        zzg();
        zza();
        zzR(new zzjw(this, str, str2, zzO(false), zzcfVar));
    }

    protected final void zzw(AtomicReference atomicReference, String str, String str2, String str3) {
        zzg();
        zza();
        zzR(new zzjv(this, atomicReference, null, str2, str3, zzO(false)));
    }

    protected final void zzx(AtomicReference atomicReference, boolean z11) {
        zzg();
        zza();
        zzR(new zzjh(this, atomicReference, zzO(false), z11));
    }

    protected final void zzy(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2, boolean z11) {
        zzg();
        zza();
        zzR(new zzjf(this, str, str2, zzO(false), z11, zzcfVar));
    }

    protected final void zzz(AtomicReference atomicReference, String str, String str2, String str3, boolean z11) {
        zzg();
        zza();
        zzR(new zzjx(this, atomicReference, null, str2, str3, zzO(false), z11));
    }
}
