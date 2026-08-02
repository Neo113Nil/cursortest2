package com.google.android.gms.internal.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;
import xsna.ehz;
import xsna.exc0;
import xsna.f5o0;
import xsna.fhz;
import xsna.gl01;
import xsna.grf0;
import xsna.kxz;
import xsna.l0t;
import xsna.ouf0;
import xsna.vxz;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes.dex */
public final class zzbp extends b implements l0t {
    static final a.g zza;
    public static final a zzb;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzb = new a("LocationServices.API", new zzbm(), gVar);
    }

    public zzbp(Activity activity) {
        super(activity, (a<a.d.c>) zzb, a.d.U6, b.a.c);
    }

    private final Task zza(final LocationRequest locationRequest, ehz ehzVar) {
        final zzbo zzboVar = new zzbo(this, ehzVar, new zzbn() { // from class: com.google.android.gms.internal.location.zzax
            @Override // com.google.android.gms.internal.location.zzbn
            public final void zza(zzda zzdaVar, ehz.a aVar, boolean z, TaskCompletionSource taskCompletionSource) {
                zzdaVar.zzB(aVar, z, taskCompletionSource);
            }
        });
        ouf0 ouf0Var = new ouf0() { // from class: com.google.android.gms.internal.location.zzay
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                a aVar = zzbp.zzb;
                ((zzda) obj).zzu(zzbo.this, locationRequest, (TaskCompletionSource) obj2);
            }
        };
        grf0.a a = grf0.a();
        a.b(ouf0Var);
        a.d(zzboVar);
        a.e(ehzVar);
        a.c(2436);
        return doRegisterEventListener(a.a());
    }

    private final Task zzb(final LocationRequest locationRequest, ehz ehzVar) {
        final zzbo zzboVar = new zzbo(this, ehzVar, new zzbn() { // from class: com.google.android.gms.internal.location.zzbd
            @Override // com.google.android.gms.internal.location.zzbn
            public final void zza(zzda zzdaVar, ehz.a aVar, boolean z, TaskCompletionSource taskCompletionSource) {
                zzdaVar.zzC(aVar, z, taskCompletionSource);
            }
        });
        ouf0 ouf0Var = new ouf0() { // from class: com.google.android.gms.internal.location.zzbf
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                a aVar = zzbp.zzb;
                ((zzda) obj).zzv(zzbo.this, locationRequest, (TaskCompletionSource) obj2);
            }
        };
        grf0.a a = grf0.a();
        a.b(ouf0Var);
        a.d(zzboVar);
        a.e(ehzVar);
        a.c(2435);
        return doRegisterEventListener(a.a());
    }

    public final Task<Void> flushLocations() {
        f5o0.a a = f5o0.a();
        a.a = new ouf0() { // from class: com.google.android.gms.internal.location.zzav
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                ((zzda) obj).zzr((TaskCompletionSource) obj2);
            }
        };
        a.e = 2422;
        return doWrite(a.a());
    }

    public final Task<Location> getCurrentLocation(int i, @Nullable CancellationToken cancellationToken) {
        CurrentLocationRequest.a aVar = new CurrentLocationRequest.a();
        aVar.b(i);
        CurrentLocationRequest a = aVar.a();
        if (cancellationToken != null) {
            exc0.a("cancellationToken may not be already canceled", !cancellationToken.isCancellationRequested());
        }
        f5o0.a a2 = f5o0.a();
        a2.a = new zzbh(a, cancellationToken);
        a2.e = 2415;
        Task<Location> doRead = doRead(a2.a());
        if (cancellationToken == null) {
            return doRead;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationToken);
        doRead.continueWith(new zzbi(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // xsna.l0t
    public final Task<Location> getLastLocation() {
        f5o0.a a = f5o0.a();
        a.a = new ouf0() { // from class: com.google.android.gms.internal.location.zzbe
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                ((zzda) obj).zzt(new LastLocationRequest(Long.MAX_VALUE, 0, false, null, null), (TaskCompletionSource) obj2);
            }
        };
        a.e = 2414;
        return doRead(a.a());
    }

    public final Task<LocationAvailability> getLocationAvailability() {
        f5o0.a a = f5o0.a();
        a.a = new ouf0() { // from class: com.google.android.gms.internal.location.zzba
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                a aVar = zzbp.zzb;
                ((TaskCompletionSource) obj2).setResult(((zzda) obj).zzp());
            }
        };
        a.e = 2416;
        return doRead(a.a());
    }

    public final Task<Void> removeLocationUpdates(final PendingIntent pendingIntent) {
        f5o0.a a = f5o0.a();
        a.a = new ouf0() { // from class: com.google.android.gms.internal.location.zzbg
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                a aVar = zzbp.zzb;
                ((zzda) obj).zzD(pendingIntent, (TaskCompletionSource) obj2, null);
            }
        };
        a.e = 2418;
        return doWrite(a.a());
    }

    public final Task<Void> requestLocationUpdates(final LocationRequest locationRequest, final PendingIntent pendingIntent) {
        f5o0.a a = f5o0.a();
        a.a = new ouf0() { // from class: com.google.android.gms.internal.location.zzaz
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                a aVar = zzbp.zzb;
                ((zzda) obj).zzw(pendingIntent, locationRequest, (TaskCompletionSource) obj2);
            }
        };
        a.e = 2417;
        return doWrite(a.a());
    }

    public final Task<Void> setMockLocation(final Location location) {
        exc0.b(location != null);
        f5o0.a a = f5o0.a();
        a.a = new ouf0() { // from class: com.google.android.gms.internal.location.zzaw
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                a aVar = zzbp.zzb;
                ((zzda) obj).zzz(location, (TaskCompletionSource) obj2);
            }
        };
        a.e = 2421;
        return doWrite(a.a());
    }

    public final Task<Void> setMockMode(final boolean z) {
        f5o0.a a = f5o0.a();
        a.a = new ouf0() { // from class: com.google.android.gms.internal.location.zzbb
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                a aVar = zzbp.zzb;
                ((zzda) obj).zzA(z, (TaskCompletionSource) obj2);
            }
        };
        a.e = 2420;
        return doWrite(a.a());
    }

    public zzbp(Context context) {
        super(context, (a<a.d.c>) zzb, a.d.U6, b.a.c);
    }

    public final Task<Location> getLastLocation(final LastLocationRequest lastLocationRequest) {
        f5o0.a a = f5o0.a();
        a.a = new ouf0() { // from class: com.google.android.gms.internal.location.zzbj
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                a aVar = zzbp.zzb;
                ((zzda) obj).zzt(LastLocationRequest.this, (TaskCompletionSource) obj2);
            }
        };
        a.e = 2414;
        a.d = new Feature[]{gl01.c};
        return doRead(a.a());
    }

    @Override // xsna.l0t
    public final Task<Void> removeLocationUpdates(kxz kxzVar) {
        return doUnregisterEventListener(fhz.c(kxzVar, kxz.class.getSimpleName()), 2418).continueWith(zzbk.zza, new Continuation() { // from class: com.google.android.gms.internal.location.zzbc
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                a aVar = zzbp.zzb;
                return null;
            }
        });
    }

    @Override // xsna.l0t
    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, kxz kxzVar, @Nullable Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            exc0.j(looper, "invalid null looper");
        }
        return zza(locationRequest, fhz.a(looper, kxzVar, kxz.class.getSimpleName()));
    }

    public final Task<Void> removeLocationUpdates(vxz vxzVar) {
        return doUnregisterEventListener(fhz.c(vxzVar, vxz.class.getSimpleName()), 2418).continueWith(zzbk.zza, new Continuation() { // from class: com.google.android.gms.internal.location.zzbl
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                a aVar = zzbp.zzb;
                return null;
            }
        });
    }

    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, vxz vxzVar, @Nullable Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            exc0.j(looper, "invalid null looper");
        }
        return zzb(locationRequest, fhz.a(looper, vxzVar, vxz.class.getSimpleName()));
    }

    public final Task<Location> getCurrentLocation(CurrentLocationRequest currentLocationRequest, @Nullable CancellationToken cancellationToken) {
        if (cancellationToken != null) {
            exc0.a("cancellationToken may not be already canceled", !cancellationToken.isCancellationRequested());
        }
        f5o0.a a = f5o0.a();
        a.a = new zzbh(currentLocationRequest, cancellationToken);
        a.e = 2415;
        Task<Location> doRead = doRead(a.a());
        if (cancellationToken == null) {
            return doRead;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationToken);
        doRead.continueWith(new zzbi(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, Executor executor, kxz kxzVar) {
        return zza(locationRequest, fhz.b(kxzVar, kxz.class.getSimpleName(), executor));
    }

    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, Executor executor, vxz vxzVar) {
        return zzb(locationRequest, fhz.b(vxzVar, vxz.class.getSimpleName(), executor));
    }
}
