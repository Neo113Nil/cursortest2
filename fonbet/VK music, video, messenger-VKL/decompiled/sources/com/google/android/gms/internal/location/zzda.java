package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
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
import xsna.dpj0;
import xsna.ehz;
import xsna.exc0;
import xsna.fhz;
import xsna.gl01;
import xsna.gmv;
import xsna.i380;
import xsna.lhg;
import xsna.olc;
import xsna.u2u;
import xsna.x3j;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes.dex */
public final class zzda extends u2u {
    public static final /* synthetic */ int zze = 0;
    private final dpj0 zzf;
    private final dpj0 zzg;
    private final dpj0 zzh;

    public zzda(Context context, Looper looper, olc olcVar, x3j x3jVar, i380 i380Var) {
        super(context, looper, 23, olcVar, x3jVar, i380Var);
        this.zzf = new dpj0();
        this.zzg = new dpj0();
        this.zzh = new dpj0();
    }

    private final boolean zzE(Feature feature) {
        Feature feature2;
        Feature[] availableFeatures = getAvailableFeatures();
        if (availableFeatures == null) {
            return false;
        }
        int length = availableFeatures.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                feature2 = null;
                break;
            }
            feature2 = availableFeatures[i];
            if (feature.b.equals(feature2.b)) {
                break;
            }
            i++;
        }
        return feature2 != null && feature2.i() >= feature.i();
    }

    @Override // xsna.rd6
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof zzo ? (zzo) queryLocalInterface : new zzn(iBinder);
    }

    @Override // xsna.rd6
    public final Feature[] getApiFeatures() {
        return gl01.g;
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // xsna.rd6
    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // xsna.rd6
    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // xsna.rd6
    public final void onConnectionSuspended(int i) {
        super.onConnectionSuspended(i);
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

    @Override // xsna.rd6
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void zzA(boolean z, TaskCompletionSource taskCompletionSource) throws RemoteException {
        if (zzE(gl01.d)) {
            ((zzo) getService()).zzx(z, new zzcl(this, null, taskCompletionSource));
        } else {
            ((zzo) getService()).zzw(z);
            taskCompletionSource.setResult(null);
        }
    }

    public final void zzB(ehz.a aVar, boolean z, TaskCompletionSource taskCompletionSource) throws RemoteException {
        synchronized (this.zzg) {
            try {
                zzcw zzcwVar = (zzcw) this.zzg.remove(aVar);
                if (zzcwVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                zzcwVar.zzh();
                if (!z) {
                    taskCompletionSource.setResult(Boolean.TRUE);
                } else if (zzE(gl01.f)) {
                    ((zzo) getService()).zzy(zzdb.zzb(null, zzcwVar, null, null), new zzcl(this, Boolean.TRUE, taskCompletionSource));
                } else {
                    ((zzo) getService()).zzz(new zzdf(2, null, null, zzcwVar, null, new zzcn(Boolean.TRUE, taskCompletionSource), null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzC(ehz.a aVar, boolean z, TaskCompletionSource taskCompletionSource) throws RemoteException {
        synchronized (this.zzf) {
            try {
                zzcz zzczVar = (zzcz) this.zzf.remove(aVar);
                if (zzczVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                zzczVar.zzg();
                if (!z) {
                    taskCompletionSource.setResult(Boolean.TRUE);
                } else if (zzE(gl01.f)) {
                    ((zzo) getService()).zzy(zzdb.zzc(null, zzczVar, null, null), new zzcl(this, Boolean.TRUE, taskCompletionSource));
                } else {
                    ((zzo) getService()).zzz(new zzdf(2, null, zzczVar, null, null, new zzcn(Boolean.TRUE, taskCompletionSource), null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzD(PendingIntent pendingIntent, TaskCompletionSource taskCompletionSource, Object obj) throws RemoteException {
        if (zzE(gl01.f)) {
            ((zzo) getService()).zzy(zzdb.zza(pendingIntent, null, null), new zzcl(this, null, taskCompletionSource));
        } else {
            ((zzo) getService()).zzz(new zzdf(2, null, null, null, pendingIntent, new zzcn(null, taskCompletionSource), null));
        }
    }

    public final LocationAvailability zzp() throws RemoteException {
        return ((zzo) getService()).zzf(getContext().getPackageName());
    }

    public final void zzq(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, TaskCompletionSource taskCompletionSource) throws RemoteException {
        exc0.j(geofencingRequest, "geofencingRequest can't be null.");
        exc0.j(pendingIntent, "PendingIntent must be specified.");
        ((zzo) getService()).zzg(geofencingRequest, pendingIntent, new zzci(taskCompletionSource));
    }

    public final void zzr(TaskCompletionSource taskCompletionSource) throws RemoteException {
        ((zzo) getService()).zzi(new zzcn(null, taskCompletionSource));
    }

    public final void zzs(CurrentLocationRequest currentLocationRequest, CancellationToken cancellationToken, final TaskCompletionSource taskCompletionSource) throws RemoteException {
        getContext();
        if (zzE(gl01.b)) {
            final gmv zze2 = ((zzo) getService()).zze(currentLocationRequest, new zzcm(this, taskCompletionSource));
            if (cancellationToken != null) {
                cancellationToken.onCanceledRequested(new OnTokenCanceledListener() { // from class: com.google.android.gms.internal.location.zzcf
                    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                    public final void onCanceled() {
                        try {
                            gmv.this.cancel();
                        } catch (RemoteException unused) {
                        }
                    }
                });
                return;
            }
            return;
        }
        ehz b = fhz.b(new zzcj(this, taskCompletionSource), "GetCurrentLocation", zzdx.zza());
        final ehz.a b2 = b.b();
        b2.getClass();
        zzck zzckVar = new zzck(this, b, taskCompletionSource);
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        LocationRequest.a aVar = new LocationRequest.a(currentLocationRequest.l());
        aVar.e();
        aVar.b(currentLocationRequest.i());
        aVar.c(currentLocationRequest.j());
        aVar.d(currentLocationRequest.k());
        aVar.g(currentLocationRequest.o());
        aVar.i(currentLocationRequest.zza());
        aVar.f();
        aVar.h(currentLocationRequest.zzd());
        aVar.j(currentLocationRequest.n());
        zzu(zzckVar, aVar.a(), taskCompletionSource2);
        taskCompletionSource2.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.location.zzcg
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                TaskCompletionSource taskCompletionSource3 = TaskCompletionSource.this;
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
                        zzda.this.zzB(b2, true, new TaskCompletionSource());
                    } catch (RemoteException unused) {
                    }
                }
            });
        }
    }

    public final void zzt(LastLocationRequest lastLocationRequest, TaskCompletionSource taskCompletionSource) throws RemoteException {
        getContext();
        if (zzE(gl01.c)) {
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
    public final void zzu(zzcs zzcsVar, LocationRequest locationRequest, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzcw zzcwVar;
        ehz zza = zzcsVar.zza();
        ehz.a b = zza.b();
        b.getClass();
        boolean zzE = zzE(gl01.f);
        synchronized (this.zzg) {
            try {
                zzcw zzcwVar2 = (zzcw) this.zzg.get(b);
                if (zzcwVar2 != null && !zzE) {
                    zzcwVar2.zzg(zza);
                    zzcwVar = zzcwVar2;
                    zzcwVar2 = null;
                    getContext();
                    String a = b.a();
                    if (zzE) {
                        zzo zzoVar = (zzo) getService();
                        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
                        aVar.h(null);
                        zzoVar.zzz(new zzdf(1, zzdd.zza(null, aVar.a()), null, zzcwVar, null, new zzcp(taskCompletionSource, zzcwVar), a));
                    } else {
                        ((zzo) getService()).zzk(zzdb.zzb(zzcwVar2, zzcwVar, null, a), locationRequest, new zzcl(this, null, taskCompletionSource));
                    }
                }
                zzcw zzcwVar3 = new zzcw(zzcsVar);
                this.zzg.put(b, zzcwVar3);
                zzcwVar = zzcwVar3;
                getContext();
                String a2 = b.a();
                if (zzE) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x001a, B:8:0x0028, B:9:0x003d, B:11:0x0046, B:12:0x0081, B:16:0x0059, B:17:0x0030), top: B:3:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x001a, B:8:0x0028, B:9:0x003d, B:11:0x0046, B:12:0x0081, B:16:0x0059, B:17:0x0030), top: B:3:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzv(zzcs zzcsVar, LocationRequest locationRequest, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzcz zzczVar;
        ehz zza = zzcsVar.zza();
        ehz.a b = zza.b();
        b.getClass();
        boolean zzE = zzE(gl01.f);
        synchronized (this.zzf) {
            try {
                zzcz zzczVar2 = (zzcz) this.zzf.get(b);
                if (zzczVar2 != null && !zzE) {
                    zzczVar2.zzf(zza);
                    zzczVar = zzczVar2;
                    zzczVar2 = null;
                    getContext();
                    String a = b.a();
                    if (zzE) {
                        zzo zzoVar = (zzo) getService();
                        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
                        aVar.h(null);
                        zzoVar.zzz(new zzdf(1, zzdd.zza(null, aVar.a()), zzczVar, null, null, new zzco(taskCompletionSource, zzczVar), a));
                    } else {
                        ((zzo) getService()).zzk(zzdb.zzc(zzczVar2, zzczVar, null, a), locationRequest, new zzcl(this, null, taskCompletionSource));
                    }
                }
                zzcz zzczVar3 = new zzcz(zzcsVar);
                this.zzf.put(b, zzczVar3);
                zzczVar = zzczVar3;
                getContext();
                String a2 = b.a();
                if (zzE) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzw(PendingIntent pendingIntent, LocationRequest locationRequest, TaskCompletionSource taskCompletionSource) throws RemoteException {
        getContext();
        if (zzE(gl01.f)) {
            ((zzo) getService()).zzk(zzdb.zza(pendingIntent, null, null), locationRequest, new zzcl(this, null, taskCompletionSource));
            return;
        }
        zzo zzoVar = (zzo) getService();
        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
        aVar.h(null);
        zzoVar.zzz(new zzdf(1, zzdd.zza(null, aVar.a()), null, null, pendingIntent, new zzcn(null, taskCompletionSource), lhg.a(pendingIntent.hashCode(), "PendingIntent@")));
    }

    public final void zzx(PendingIntent pendingIntent, TaskCompletionSource taskCompletionSource) throws RemoteException {
        exc0.j(pendingIntent, "PendingIntent must be specified.");
        ((zzo) getService()).zzn(pendingIntent, new zzci(taskCompletionSource), getContext().getPackageName());
    }

    public final void zzy(List list, TaskCompletionSource taskCompletionSource) throws RemoteException {
        exc0.a("geofenceRequestIds can't be null nor empty.", (list == null || list.isEmpty()) ? false : true);
        ((zzo) getService()).zzo((String[]) list.toArray(new String[0]), new zzci(taskCompletionSource), getContext().getPackageName());
    }

    public final void zzz(Location location, TaskCompletionSource taskCompletionSource) throws RemoteException {
        if (zzE(gl01.e)) {
            ((zzo) getService()).zzv(location, new zzcl(this, null, taskCompletionSource));
        } else {
            ((zzo) getService()).zzu(location);
            taskCompletionSource.setResult(null);
        }
    }
}
