package com.google.android.gms.internal.location;

import V9.AbstractC1755k;
import V9.InterfaceC1748d;
import V9.InterfaceC1756l;
import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.C3142m;
import com.google.android.gms.common.api.internal.InterfaceC3126e;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzau implements InterfaceC1748d {
    public static /* bridge */ /* synthetic */ TaskCompletionSource zza(final InterfaceC3126e interfaceC3126e) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.location.zzah
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                InterfaceC3126e interfaceC3126e2 = InterfaceC3126e.this;
                if (task.isSuccessful()) {
                    interfaceC3126e2.setResult(Status.f32275f);
                    return;
                }
                if (task.isCanceled()) {
                    interfaceC3126e2.setFailedResult(Status.f32279j);
                    return;
                }
                Exception exception = task.getException();
                if (exception instanceof b) {
                    interfaceC3126e2.setFailedResult(((b) exception).getStatus());
                } else {
                    interfaceC3126e2.setFailedResult(Status.f32277h);
                }
            }
        });
        return taskCompletionSource;
    }

    public final h flushLocations(f fVar) {
        return fVar.h(new zzaj(this, fVar));
    }

    public final Location getLastLocation(f fVar) {
        boolean await;
        boolean z10 = false;
        AbstractC3191o.b(fVar != null, "GoogleApiClient parameter is required.");
        zzda zzdaVar = (zzda) fVar.j(zzbp.zza);
        final AtomicReference atomicReference = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        try {
            zzdaVar.zzt(new LastLocationRequest.a().a(), taskCompletionSource);
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
                        } catch (InterruptedException unused) {
                            nanos = nanoTime - System.nanoTime();
                            z10 = true;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = true;
                        if (z10) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (z10) {
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

    public final LocationAvailability getLocationAvailability(f fVar) {
        AbstractC3191o.b(fVar != null, "GoogleApiClient parameter is required.");
        try {
            return ((zzda) fVar.j(zzbp.zza)).zzp();
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final h removeLocationUpdates(f fVar, PendingIntent pendingIntent) {
        return fVar.h(new zzao(this, fVar, pendingIntent));
    }

    public final h requestLocationUpdates(f fVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return fVar.h(new zzam(this, fVar, pendingIntent, locationRequest));
    }

    public final h setMockLocation(f fVar, Location location) {
        return fVar.h(new zzar(this, fVar, location));
    }

    public final h setMockMode(f fVar, boolean z10) {
        return fVar.h(new zzaq(this, fVar, z10));
    }

    public final h removeLocationUpdates(f fVar, AbstractC1755k abstractC1755k) {
        return fVar.h(new zzap(this, fVar, abstractC1755k));
    }

    public final h requestLocationUpdates(f fVar, LocationRequest locationRequest, AbstractC1755k abstractC1755k, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            AbstractC3191o.n(looper, "invalid null looper");
        }
        return fVar.h(new zzal(this, fVar, C3142m.a(abstractC1755k, looper, AbstractC1755k.class.getSimpleName()), locationRequest));
    }

    public final h removeLocationUpdates(f fVar, InterfaceC1756l interfaceC1756l) {
        return fVar.h(new zzan(this, fVar, interfaceC1756l));
    }

    @Override // V9.InterfaceC1748d
    public final h requestLocationUpdates(f fVar, LocationRequest locationRequest, InterfaceC1756l interfaceC1756l) {
        Looper myLooper = Looper.myLooper();
        AbstractC3191o.n(myLooper, "invalid null looper");
        return fVar.h(new zzak(this, fVar, C3142m.a(interfaceC1756l, myLooper, InterfaceC1756l.class.getSimpleName()), locationRequest));
    }

    public final h requestLocationUpdates(f fVar, LocationRequest locationRequest, InterfaceC1756l interfaceC1756l, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            AbstractC3191o.n(looper, "invalid null looper");
        }
        return fVar.h(new zzak(this, fVar, C3142m.a(interfaceC1756l, looper, InterfaceC1756l.class.getSimpleName()), locationRequest));
    }
}
