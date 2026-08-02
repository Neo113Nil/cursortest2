package com.google.android.gms.internal.location;

import V9.AbstractC1755k;
import V9.E;
import V9.InterfaceC1749e;
import V9.InterfaceC1756l;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC3163x;
import com.google.android.gms.common.api.internal.C3140l;
import com.google.android.gms.common.api.internal.C3142m;
import com.google.android.gms.common.api.internal.InterfaceC3153s;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzbp extends e implements InterfaceC1749e {
    static final C3117a.g zza;
    public static final C3117a zzb;

    static {
        C3117a.g gVar = new C3117a.g();
        zza = gVar;
        zzb = new C3117a("LocationServices.API", new zzbm(), gVar);
    }

    public zzbp(Activity activity) {
        super(activity, zzb, (C3117a.d) C3117a.d.f32289J4, e.a.f32290c);
    }

    private final Task zza(final LocationRequest locationRequest, C3140l c3140l) {
        final zzbo zzboVar = new zzbo(this, c3140l, new zzbn() { // from class: com.google.android.gms.internal.location.zzax
            @Override // com.google.android.gms.internal.location.zzbn
            public final void zza(zzda zzdaVar, C3140l.a aVar, boolean z10, TaskCompletionSource taskCompletionSource) {
                zzdaVar.zzB(aVar, z10, taskCompletionSource);
            }
        });
        return doRegisterEventListener(r.a().b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.location.zzay
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                C3117a c3117a = zzbp.zzb;
                ((zzda) obj).zzu(zzbo.this, locationRequest, (TaskCompletionSource) obj2);
            }
        }).d(zzboVar).e(c3140l).c(2436).a());
    }

    private final Task zzb(final LocationRequest locationRequest, C3140l c3140l) {
        final zzbo zzboVar = new zzbo(this, c3140l, new zzbn() { // from class: com.google.android.gms.internal.location.zzbd
            @Override // com.google.android.gms.internal.location.zzbn
            public final void zza(zzda zzdaVar, C3140l.a aVar, boolean z10, TaskCompletionSource taskCompletionSource) {
                zzdaVar.zzC(aVar, z10, taskCompletionSource);
            }
        });
        return doRegisterEventListener(r.a().b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.location.zzbf
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                C3117a c3117a = zzbp.zzb;
                ((zzda) obj).zzv(zzbo.this, locationRequest, (TaskCompletionSource) obj2);
            }
        }).d(zzboVar).e(c3140l).c(2435).a());
    }

    public final Task<Void> flushLocations() {
        return doWrite(AbstractC3163x.a().b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.location.zzav
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                ((zzda) obj).zzr((TaskCompletionSource) obj2);
            }
        }).e(2422).a());
    }

    public final Task<Location> getCurrentLocation(int i10, CancellationToken cancellationToken) {
        CurrentLocationRequest.a aVar = new CurrentLocationRequest.a();
        aVar.d(i10);
        CurrentLocationRequest a10 = aVar.a();
        if (cancellationToken != null) {
            AbstractC3191o.b(!cancellationToken.isCancellationRequested(), "cancellationToken may not be already canceled");
        }
        Task<Location> doRead = doRead(AbstractC3163x.a().b(new zzbh(a10, cancellationToken)).e(2415).a());
        if (cancellationToken == null) {
            return doRead;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationToken);
        doRead.continueWith(new zzbi(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // V9.InterfaceC1749e
    public final Task<Location> getLastLocation() {
        return doRead(AbstractC3163x.a().b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.location.zzbe
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                ((zzda) obj).zzt(new LastLocationRequest.a().a(), (TaskCompletionSource) obj2);
            }
        }).e(2414).a());
    }

    public final Task<LocationAvailability> getLocationAvailability() {
        return doRead(AbstractC3163x.a().b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.location.zzba
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                C3117a c3117a = zzbp.zzb;
                ((TaskCompletionSource) obj2).setResult(((zzda) obj).zzp());
            }
        }).e(2416).a());
    }

    @Override // V9.InterfaceC1749e
    public final Task<Void> removeLocationUpdates(final PendingIntent pendingIntent) {
        return doWrite(AbstractC3163x.a().b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.location.zzbg
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                C3117a c3117a = zzbp.zzb;
                ((zzda) obj).zzD(pendingIntent, (TaskCompletionSource) obj2, null);
            }
        }).e(2418).a());
    }

    @Override // V9.InterfaceC1749e
    public final Task<Void> requestLocationUpdates(final LocationRequest locationRequest, final PendingIntent pendingIntent) {
        return doWrite(AbstractC3163x.a().b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.location.zzaz
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                C3117a c3117a = zzbp.zzb;
                ((zzda) obj).zzw(pendingIntent, locationRequest, (TaskCompletionSource) obj2);
            }
        }).e(2417).a());
    }

    public final Task<Void> setMockLocation(final Location location) {
        AbstractC3191o.a(location != null);
        return doWrite(AbstractC3163x.a().b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.location.zzaw
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                C3117a c3117a = zzbp.zzb;
                ((zzda) obj).zzz(location, (TaskCompletionSource) obj2);
            }
        }).e(2421).a());
    }

    public final Task<Void> setMockMode(final boolean z10) {
        return doWrite(AbstractC3163x.a().b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.location.zzbb
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                C3117a c3117a = zzbp.zzb;
                ((zzda) obj).zzA(z10, (TaskCompletionSource) obj2);
            }
        }).e(2420).a());
    }

    public zzbp(Context context) {
        super(context, zzb, C3117a.d.f32289J4, e.a.f32290c);
    }

    public final Task<Location> getLastLocation(final LastLocationRequest lastLocationRequest) {
        return doRead(AbstractC3163x.a().b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.location.zzbj
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                C3117a c3117a = zzbp.zzb;
                ((zzda) obj).zzt(LastLocationRequest.this, (TaskCompletionSource) obj2);
            }
        }).e(2414).d(E.f12825f).a());
    }

    @Override // V9.InterfaceC1749e
    public final Task<Void> removeLocationUpdates(AbstractC1755k abstractC1755k) {
        return doUnregisterEventListener(C3142m.c(abstractC1755k, AbstractC1755k.class.getSimpleName()), 2418).continueWith(zzbk.zza, new Continuation() { // from class: com.google.android.gms.internal.location.zzbc
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                C3117a c3117a = zzbp.zzb;
                return null;
            }
        });
    }

    @Override // V9.InterfaceC1749e
    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, AbstractC1755k abstractC1755k, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            AbstractC3191o.n(looper, "invalid null looper");
        }
        return zza(locationRequest, C3142m.a(abstractC1755k, looper, AbstractC1755k.class.getSimpleName()));
    }

    public final Task<Void> removeLocationUpdates(InterfaceC1756l interfaceC1756l) {
        return doUnregisterEventListener(C3142m.c(interfaceC1756l, InterfaceC1756l.class.getSimpleName()), 2418).continueWith(zzbk.zza, new Continuation() { // from class: com.google.android.gms.internal.location.zzbl
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                C3117a c3117a = zzbp.zzb;
                return null;
            }
        });
    }

    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, InterfaceC1756l interfaceC1756l, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            AbstractC3191o.n(looper, "invalid null looper");
        }
        return zzb(locationRequest, C3142m.a(interfaceC1756l, looper, InterfaceC1756l.class.getSimpleName()));
    }

    @Override // V9.InterfaceC1749e
    public final Task<Location> getCurrentLocation(CurrentLocationRequest currentLocationRequest, CancellationToken cancellationToken) {
        if (cancellationToken != null) {
            AbstractC3191o.b(!cancellationToken.isCancellationRequested(), "cancellationToken may not be already canceled");
        }
        Task<Location> doRead = doRead(AbstractC3163x.a().b(new zzbh(currentLocationRequest, cancellationToken)).e(2415).a());
        if (cancellationToken == null) {
            return doRead;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationToken);
        doRead.continueWith(new zzbi(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, Executor executor, AbstractC1755k abstractC1755k) {
        return zza(locationRequest, C3142m.b(abstractC1755k, executor, AbstractC1755k.class.getSimpleName()));
    }

    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, Executor executor, InterfaceC1756l interfaceC1756l) {
        return zzb(locationRequest, C3142m.b(interfaceC1756l, executor, InterfaceC1756l.class.getSimpleName()));
    }
}
