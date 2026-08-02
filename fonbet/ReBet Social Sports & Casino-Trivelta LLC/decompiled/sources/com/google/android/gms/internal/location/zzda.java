package com.google.android.gms.internal.location;

import V9.E;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C3140l;
import com.google.android.gms.common.api.internal.C3142m;
import com.google.android.gms.common.api.internal.InterfaceC3128f;
import com.google.android.gms.common.api.internal.InterfaceC3146o;
import com.google.android.gms.common.internal.AbstractC3181e;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.C3180d;
import com.google.android.gms.common.internal.InterfaceC3185i;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import z.r;

/* loaded from: classes2.dex */
public final class zzda extends AbstractC3181e {
    public static final /* synthetic */ int zze = 0;
    private final r zzf;
    private final r zzg;
    private final r zzh;

    public zzda(Context context, Looper looper, C3180d c3180d, InterfaceC3128f interfaceC3128f, InterfaceC3146o interfaceC3146o) {
        super(context, looper, 23, c3180d, interfaceC3128f, interfaceC3146o);
        this.zzf = new r();
        this.zzg = new r();
        this.zzh = new r();
    }

    private final boolean zzE(Feature feature) {
        Feature feature2;
        Feature[] availableFeatures = getAvailableFeatures();
        if (availableFeatures == null) {
            return false;
        }
        int length = availableFeatures.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                feature2 = null;
                break;
            }
            feature2 = availableFeatures[i10];
            if (feature.h().equals(feature2.h())) {
                break;
            }
            i10++;
        }
        return feature2 != null && feature2.i() >= feature.i();
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof zzo ? (zzo) queryLocalInterface : new zzn(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final Feature[] getApiFeatures() {
        return E.zzl;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c, com.google.android.gms.common.api.C3117a.f
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final void onConnectionSuspended(int i10) {
        super.onConnectionSuspended(i10);
        synchronized (this.zzf) {
            this.zzf.clear();
        }
        synchronized (this.zzg) {
            this.zzg.clear();
        }
        synchronized (this.zzh) {
            this.zzh.clear();
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void zzA(boolean z10, TaskCompletionSource taskCompletionSource) {
        if (zzE(E.f12826g)) {
            ((zzo) getService()).zzx(z10, new zzcl(this, null, taskCompletionSource));
        } else {
            ((zzo) getService()).zzw(z10);
            taskCompletionSource.setResult(null);
        }
    }

    public final void zzB(C3140l.a aVar, boolean z10, TaskCompletionSource taskCompletionSource) {
        synchronized (this.zzg) {
            try {
                zzcw zzcwVar = (zzcw) this.zzg.remove(aVar);
                if (zzcwVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                zzcwVar.zzh();
                if (!z10) {
                    taskCompletionSource.setResult(Boolean.TRUE);
                } else if (zzE(E.f12829j)) {
                    ((zzo) getService()).zzy(zzdb.zzb(null, zzcwVar, null, null), new zzcl(this, Boolean.TRUE, taskCompletionSource));
                } else {
                    ((zzo) getService()).zzz(new zzdf(2, null, null, zzcwVar, null, new zzcn(Boolean.TRUE, taskCompletionSource), null));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzC(C3140l.a aVar, boolean z10, TaskCompletionSource taskCompletionSource) {
        synchronized (this.zzf) {
            try {
                zzcz zzczVar = (zzcz) this.zzf.remove(aVar);
                if (zzczVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                zzczVar.zzg();
                if (!z10) {
                    taskCompletionSource.setResult(Boolean.TRUE);
                } else if (zzE(E.f12829j)) {
                    ((zzo) getService()).zzy(zzdb.zzc(null, zzczVar, null, null), new zzcl(this, Boolean.TRUE, taskCompletionSource));
                } else {
                    ((zzo) getService()).zzz(new zzdf(2, null, zzczVar, null, null, new zzcn(Boolean.TRUE, taskCompletionSource), null));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzD(PendingIntent pendingIntent, TaskCompletionSource taskCompletionSource, Object obj) {
        if (zzE(E.f12829j)) {
            ((zzo) getService()).zzy(zzdb.zza(pendingIntent, null, null), new zzcl(this, null, taskCompletionSource));
        } else {
            ((zzo) getService()).zzz(new zzdf(2, null, null, null, pendingIntent, new zzcn(null, taskCompletionSource), null));
        }
    }

    public final LocationAvailability zzp() {
        return ((zzo) getService()).zzf(getContext().getPackageName());
    }

    public final void zzq(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, TaskCompletionSource taskCompletionSource) {
        AbstractC3191o.n(geofencingRequest, "geofencingRequest can't be null.");
        AbstractC3191o.n(pendingIntent, "PendingIntent must be specified.");
        ((zzo) getService()).zzg(geofencingRequest, pendingIntent, new zzci(taskCompletionSource));
    }

    public final void zzr(TaskCompletionSource taskCompletionSource) {
        ((zzo) getService()).zzi(new zzcn(null, taskCompletionSource));
    }

    public final void zzs(CurrentLocationRequest currentLocationRequest, CancellationToken cancellationToken, final TaskCompletionSource taskCompletionSource) {
        getContext();
        if (zzE(E.f12824e)) {
            final InterfaceC3185i zze2 = ((zzo) getService()).zze(currentLocationRequest, new zzcm(this, taskCompletionSource));
            if (cancellationToken != null) {
                cancellationToken.onCanceledRequested(new OnTokenCanceledListener() { // from class: com.google.android.gms.internal.location.zzcf
                    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                    public final void onCanceled() {
                        InterfaceC3185i interfaceC3185i = InterfaceC3185i.this;
                        int i10 = zzda.zze;
                        try {
                            interfaceC3185i.cancel();
                        } catch (RemoteException unused) {
                        }
                    }
                });
                return;
            }
            return;
        }
        C3140l b10 = C3142m.b(new zzcj(this, taskCompletionSource), zzdx.zza(), "GetCurrentLocation");
        final C3140l.a b11 = b10.b();
        b11.getClass();
        zzck zzckVar = new zzck(this, b10, taskCompletionSource);
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        LocationRequest.a aVar = new LocationRequest.a(currentLocationRequest.j(), 0L);
        aVar.e(0L);
        aVar.b(currentLocationRequest.g());
        aVar.c(currentLocationRequest.h());
        aVar.d(currentLocationRequest.i());
        aVar.g(currentLocationRequest.m());
        aVar.i(currentLocationRequest.k());
        aVar.f(true);
        aVar.h(currentLocationRequest.zzd());
        aVar.j(currentLocationRequest.l());
        zzu(zzckVar, aVar.a(), taskCompletionSource2);
        taskCompletionSource2.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.location.zzcg
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                TaskCompletionSource taskCompletionSource3 = TaskCompletionSource.this;
                int i10 = zzda.zze;
                if (task.isSuccessful()) {
                    return;
                }
                Exception exception = task.getException();
                exception.getClass();
                taskCompletionSource3.trySetException(exception);
            }
        });
        if (cancellationToken != null) {
            cancellationToken.onCanceledRequested(new OnTokenCanceledListener() { // from class: com.google.android.gms.internal.location.zzch
                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final void onCanceled() {
                    try {
                        zzda.this.zzB(b11, true, new TaskCompletionSource());
                    } catch (RemoteException unused) {
                    }
                }
            });
        }
    }

    public final void zzt(LastLocationRequest lastLocationRequest, TaskCompletionSource taskCompletionSource) {
        getContext();
        if (zzE(E.f12825f)) {
            ((zzo) getService()).zzj(lastLocationRequest, new zzcm(this, taskCompletionSource));
        } else {
            taskCompletionSource.setResult(((zzo) getService()).zzd());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x001a, B:8:0x0028, B:9:0x003d, B:11:0x0046, B:12:0x0081, B:16:0x0059, B:17:0x0030), top: B:3:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x001a, B:8:0x0028, B:9:0x003d, B:11:0x0046, B:12:0x0081, B:16:0x0059, B:17:0x0030), top: B:3:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzu(zzcs zzcsVar, LocationRequest locationRequest, TaskCompletionSource taskCompletionSource) {
        zzcw zzcwVar;
        C3140l zza = zzcsVar.zza();
        C3140l.a b10 = zza.b();
        b10.getClass();
        boolean zzE = zzE(E.f12829j);
        synchronized (this.zzg) {
            try {
                zzcw zzcwVar2 = (zzcw) this.zzg.get(b10);
                if (zzcwVar2 != null && !zzE) {
                    zzcwVar2.zzg(zza);
                    zzcwVar = zzcwVar2;
                    zzcwVar2 = null;
                    getContext();
                    String a10 = b10.a();
                    if (zzE) {
                        zzo zzoVar = (zzo) getService();
                        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
                        aVar.h(null);
                        zzoVar.zzz(new zzdf(1, zzdd.zza(null, aVar.a()), null, zzcwVar, null, new zzcp(taskCompletionSource, zzcwVar), a10));
                    } else {
                        ((zzo) getService()).zzk(zzdb.zzb(zzcwVar2, zzcwVar, null, a10), locationRequest, new zzcl(this, null, taskCompletionSource));
                    }
                }
                zzcw zzcwVar3 = new zzcw(zzcsVar);
                this.zzg.put(b10, zzcwVar3);
                zzcwVar = zzcwVar3;
                getContext();
                String a102 = b10.a();
                if (zzE) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x001a, B:8:0x0028, B:9:0x003d, B:11:0x0046, B:12:0x0081, B:16:0x0059, B:17:0x0030), top: B:3:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x001a, B:8:0x0028, B:9:0x003d, B:11:0x0046, B:12:0x0081, B:16:0x0059, B:17:0x0030), top: B:3:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzv(zzcs zzcsVar, LocationRequest locationRequest, TaskCompletionSource taskCompletionSource) {
        zzcz zzczVar;
        C3140l zza = zzcsVar.zza();
        C3140l.a b10 = zza.b();
        b10.getClass();
        boolean zzE = zzE(E.f12829j);
        synchronized (this.zzf) {
            try {
                zzcz zzczVar2 = (zzcz) this.zzf.get(b10);
                if (zzczVar2 != null && !zzE) {
                    zzczVar2.zzf(zza);
                    zzczVar = zzczVar2;
                    zzczVar2 = null;
                    getContext();
                    String a10 = b10.a();
                    if (zzE) {
                        zzo zzoVar = (zzo) getService();
                        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
                        aVar.h(null);
                        zzoVar.zzz(new zzdf(1, zzdd.zza(null, aVar.a()), zzczVar, null, null, new zzco(taskCompletionSource, zzczVar), a10));
                    } else {
                        ((zzo) getService()).zzk(zzdb.zzc(zzczVar2, zzczVar, null, a10), locationRequest, new zzcl(this, null, taskCompletionSource));
                    }
                }
                zzcz zzczVar3 = new zzcz(zzcsVar);
                this.zzf.put(b10, zzczVar3);
                zzczVar = zzczVar3;
                getContext();
                String a102 = b10.a();
                if (zzE) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzw(PendingIntent pendingIntent, LocationRequest locationRequest, TaskCompletionSource taskCompletionSource) {
        getContext();
        if (zzE(E.f12829j)) {
            ((zzo) getService()).zzk(zzdb.zza(pendingIntent, null, null), locationRequest, new zzcl(this, null, taskCompletionSource));
            return;
        }
        zzo zzoVar = (zzo) getService();
        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
        aVar.h(null);
        zzoVar.zzz(new zzdf(1, zzdd.zza(null, aVar.a()), null, null, pendingIntent, new zzcn(null, taskCompletionSource), "PendingIntent@" + pendingIntent.hashCode()));
    }

    public final void zzx(PendingIntent pendingIntent, TaskCompletionSource taskCompletionSource) {
        AbstractC3191o.n(pendingIntent, "PendingIntent must be specified.");
        ((zzo) getService()).zzn(pendingIntent, new zzci(taskCompletionSource), getContext().getPackageName());
    }

    public final void zzy(List list, TaskCompletionSource taskCompletionSource) {
        AbstractC3191o.b((list == null || list.isEmpty()) ? false : true, "geofenceRequestIds can't be null nor empty.");
        ((zzo) getService()).zzo((String[]) list.toArray(new String[0]), new zzci(taskCompletionSource), getContext().getPackageName());
    }

    public final void zzz(Location location, TaskCompletionSource taskCompletionSource) {
        if (zzE(E.f12827h)) {
            ((zzo) getService()).zzv(location, new zzcl(this, null, taskCompletionSource));
        } else {
            ((zzo) getService()).zzu(location);
            taskCompletionSource.setResult(null);
        }
    }
}
