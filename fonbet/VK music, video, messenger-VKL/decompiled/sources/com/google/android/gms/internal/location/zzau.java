package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import xsna.cv90;
import xsna.exc0;
import xsna.fhz;
import xsna.k0t;
import xsna.kxz;
import xsna.ue6;
import xsna.vxz;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes.dex */
public final class zzau implements k0t {
    public static /* bridge */ /* synthetic */ TaskCompletionSource zza(final ue6 ue6Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.location.zzah
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ue6 ue6Var2 = ue6.this;
                if (task.isSuccessful()) {
                    ue6Var2.setResult(Status.f);
                    return;
                }
                if (task.isCanceled()) {
                    ue6Var2.setFailedResult(Status.j);
                    return;
                }
                Exception exception = task.getException();
                if (exception instanceof ApiException) {
                    ue6Var2.setFailedResult(((ApiException) exception).d());
                } else {
                    ue6Var2.setFailedResult(Status.h);
                }
            }
        });
        return taskCompletionSource;
    }

    public final cv90<Status> flushLocations(c cVar) {
        return cVar.b(new zzaj(this, cVar));
    }

    @Override // xsna.k0t
    public final Location getLastLocation(c cVar) {
        Throwable th;
        boolean await;
        boolean z = false;
        exc0.a("GoogleApiClient parameter is required.", cVar != null);
        zzda zzdaVar = (zzda) cVar.c(zzbp.zza);
        final AtomicReference atomicReference = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        try {
            zzdaVar.zzt(new LastLocationRequest(Long.MAX_VALUE, 0, false, null, null), taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.location.zzai
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    AtomicReference atomicReference2 = atomicReference;
                    CountDownLatch countDownLatch2 = countDownLatch;
                    if (task.isSuccessful()) {
                        atomicReference2.set((Location) task.getResult());
                    }
                    countDownLatch2.countDown();
                }
            });
            try {
                long nanos = TimeUnit.SECONDS.toNanos(30L);
                long nanoTime = System.nanoTime() + nanos;
                while (true) {
                    try {
                        try {
                            await = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            z = true;
                            if (!z) {
                                throw th;
                            }
                            Thread.currentThread().interrupt();
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        nanos = nanoTime - System.nanoTime();
                        z = true;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
                if (await) {
                    return (Location) atomicReference.get();
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public final LocationAvailability getLocationAvailability(c cVar) {
        exc0.a("GoogleApiClient parameter is required.", cVar != null);
        try {
            return ((zzda) cVar.c(zzbp.zza)).zzp();
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final cv90<Status> removeLocationUpdates(c cVar, PendingIntent pendingIntent) {
        return cVar.b(new zzao(this, cVar, pendingIntent));
    }

    public final cv90<Status> requestLocationUpdates(c cVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return cVar.b(new zzam(this, cVar, pendingIntent, locationRequest));
    }

    public final cv90<Status> setMockLocation(c cVar, Location location) {
        return cVar.b(new zzar(this, cVar, location));
    }

    public final cv90<Status> setMockMode(c cVar, boolean z) {
        return cVar.b(new zzaq(this, cVar, z));
    }

    public final cv90<Status> removeLocationUpdates(c cVar, kxz kxzVar) {
        return cVar.b(new zzap(this, cVar, kxzVar));
    }

    public final cv90<Status> requestLocationUpdates(c cVar, LocationRequest locationRequest, kxz kxzVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            exc0.j(looper, "invalid null looper");
        }
        return cVar.b(new zzal(this, cVar, fhz.a(looper, kxzVar, kxz.class.getSimpleName()), locationRequest));
    }

    public final cv90<Status> removeLocationUpdates(c cVar, vxz vxzVar) {
        return cVar.b(new zzan(this, cVar, vxzVar));
    }

    public final cv90<Status> requestLocationUpdates(c cVar, LocationRequest locationRequest, vxz vxzVar) {
        Looper myLooper = Looper.myLooper();
        exc0.j(myLooper, "invalid null looper");
        return cVar.b(new zzak(this, cVar, fhz.a(myLooper, vxzVar, vxz.class.getSimpleName()), locationRequest));
    }

    public final cv90<Status> requestLocationUpdates(c cVar, LocationRequest locationRequest, vxz vxzVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            exc0.j(looper, "invalid null looper");
        }
        return cVar.b(new zzak(this, cVar, fhz.a(looper, vxzVar, vxz.class.getSimpleName()), locationRequest));
    }
}
