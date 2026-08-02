package io.radar.sdk;

import V9.C1754j;
import V9.InterfaceC1749e;
import V9.InterfaceC1750f;
import V9.InterfaceC1753i;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import io.radar.sdk.C4589c;
import io.radar.sdk.L;
import io.radar.sdk.N0;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.radar.sdk.w0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4654w0 extends L {

    /* renamed from: a, reason: collision with root package name */
    public final Context f50165a;

    /* renamed from: b, reason: collision with root package name */
    public final G0 f50166b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1749e f50167c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1753i f50168d;

    /* renamed from: io.radar.sdk.w0$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[N0.b.values().length];
            iArr[N0.b.HIGH.ordinal()] = 1;
            iArr[N0.b.MEDIUM.ordinal()] = 2;
            iArr[N0.b.LOW.ordinal()] = 3;
            iArr[N0.b.NONE.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C4654w0(Context context, G0 logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f50165a = context;
        this.f50166b = logger;
        InterfaceC1749e a10 = LocationServices.a(context);
        Intrinsics.checkNotNullExpressionValue(a10, "getFusedLocationProviderClient(context)");
        this.f50167c = a10;
        InterfaceC1753i b10 = LocationServices.b(context);
        Intrinsics.checkNotNullExpressionValue(b10, "getGeofencingClient(context)");
        this.f50168d = b10;
    }

    public static final void r(Function1 block, Void r12) {
        Intrinsics.checkNotNullParameter(block, "$block");
        block.invoke(Boolean.TRUE);
    }

    public static final void s(Function1 block, Exception it) {
        Intrinsics.checkNotNullParameter(block, "$block");
        Intrinsics.checkNotNullParameter(it, "it");
        block.invoke(Boolean.FALSE);
    }

    public static final void t(C4654w0 this$0, Function1 block, Location location) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(block, "$block");
        G0.b(this$0.f50166b, "Received current location", null, null, 6, null);
        block.invoke(location);
    }

    public static final void u(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "$block");
        block.invoke(null);
    }

    public static final void v(Function1 block, Location location) {
        Intrinsics.checkNotNullParameter(block, "$block");
        block.invoke(location);
    }

    public static final void w(Function1 block, Exception it) {
        Intrinsics.checkNotNullParameter(block, "$block");
        Intrinsics.checkNotNullParameter(it, "it");
        block.invoke(null);
    }

    public static final void y(Function1 function1, Void r12) {
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
    }

    public static final void z(Function1 function1, Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.radar.sdk.L
    public void a(L.a[] abstractGeofences, L.b abstractGeofenceRequest, PendingIntent pendingIntent, final Function1 block) {
        Intrinsics.checkNotNullParameter(abstractGeofences, "abstractGeofences");
        Intrinsics.checkNotNullParameter(abstractGeofenceRequest, "abstractGeofenceRequest");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        Intrinsics.checkNotNullParameter(block, "block");
        ArrayList arrayList = new ArrayList();
        for (L.a aVar : abstractGeofences) {
            boolean g10 = aVar.g();
            int i10 = g10;
            if (aVar.h()) {
                i10 = (g10 ? 1 : 0) | 2;
            }
            if (aVar.f()) {
                i10 = (i10 == true ? 1 : 0) | 4;
            }
            InterfaceC1750f a10 = new InterfaceC1750f.a().f(aVar.e()).b(aVar.b(), aVar.c(), aVar.d()).c(-1L).g(i10).d(aVar.a()).a();
            Intrinsics.checkNotNullExpressionValue(a10, "Builder()\n              …\n                .build()");
            arrayList.add(a10);
        }
        boolean b10 = abstractGeofenceRequest.b();
        boolean z10 = b10;
        if (abstractGeofenceRequest.c()) {
            z10 = (b10 ? 1 : 0) | 2;
        }
        int i11 = z10;
        if (abstractGeofenceRequest.a()) {
            i11 = (z10 ? 1 : 0) | 4;
        }
        GeofencingRequest c10 = new GeofencingRequest.a().b(arrayList).d(i11).c();
        Intrinsics.checkNotNullExpressionValue(c10, "Builder()\n            .a…ger)\n            .build()");
        Task addGeofences = this.f50168d.addGeofences(c10, pendingIntent);
        addGeofences.addOnSuccessListener(new OnSuccessListener() { // from class: io.radar.sdk.s0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C4654w0.r(Function1.this, (Void) obj);
            }
        });
        addGeofences.addOnFailureListener(new OnFailureListener() { // from class: io.radar.sdk.t0
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C4654w0.s(Function1.this, exc);
            }
        });
    }

    @Override // io.radar.sdk.L
    public void b(N0.b desiredAccuracy, final Function1 block) {
        Intrinsics.checkNotNullParameter(desiredAccuracy, "desiredAccuracy");
        Intrinsics.checkNotNullParameter(block, "block");
        CurrentLocationRequest.a d10 = new CurrentLocationRequest.a().d(x(desiredAccuracy));
        Intrinsics.checkNotNullExpressionValue(d10, "Builder()\n            .setPriority(priority)");
        if (desiredAccuracy == N0.b.HIGH) {
            d10 = d10.c(0L);
            Intrinsics.checkNotNullExpressionValue(d10, "currentLocationRequestBu….setMaxUpdateAgeMillis(0)");
        }
        int b10 = L0.f49705a.s(this.f50165a).b();
        if (b10 > 0) {
            G0.b(this.f50166b, "Requesting location with timeout | timeout = " + b10, null, null, 6, null);
            d10 = d10.b((long) b10);
            Intrinsics.checkNotNullExpressionValue(d10, "currentLocationRequestBu…nMillis(timeout.toLong())");
        } else {
            G0.b(this.f50166b, "Requesting location with default timeout", null, null, 6, null);
        }
        CurrentLocationRequest a10 = d10.a();
        Intrinsics.checkNotNullExpressionValue(a10, "currentLocationRequestBuilder.build()");
        this.f50167c.getCurrentLocation(a10, null).addOnSuccessListener(new OnSuccessListener() { // from class: io.radar.sdk.o0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C4654w0.t(C4654w0.this, block, (Location) obj);
            }
        }).addOnCanceledListener(new OnCanceledListener() { // from class: io.radar.sdk.p0
            @Override // com.google.android.gms.tasks.OnCanceledListener
            public final void onCanceled() {
                C4654w0.u(Function1.this);
            }
        });
    }

    @Override // io.radar.sdk.L
    public void c(final Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f50167c.getLastLocation().addOnSuccessListener(new OnSuccessListener() { // from class: io.radar.sdk.q0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C4654w0.v(Function1.this, (Location) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: io.radar.sdk.r0
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C4654w0.w(Function1.this, exc);
            }
        });
    }

    @Override // io.radar.sdk.L
    public Location d(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        C1754j a10 = C1754j.a(intent);
        if (a10 == null) {
            return null;
        }
        return a10.e();
    }

    @Override // io.radar.sdk.L
    public Location e(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        LocationResult g10 = LocationResult.g(intent);
        if (g10 == null) {
            return null;
        }
        return g10.h();
    }

    @Override // io.radar.sdk.L
    public C4589c.EnumC4597i f(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        C1754j a10 = C1754j.a(intent);
        if (a10 == null) {
            return null;
        }
        int c10 = a10.c();
        return c10 != 1 ? c10 != 4 ? C4589c.EnumC4597i.GEOFENCE_EXIT : C4589c.EnumC4597i.GEOFENCE_DWELL : C4589c.EnumC4597i.GEOFENCE_ENTER;
    }

    @Override // io.radar.sdk.L
    public void g(PendingIntent pendingIntent, final Function1 function1) {
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        Task removeGeofences = this.f50168d.removeGeofences(pendingIntent);
        removeGeofences.addOnSuccessListener(new OnSuccessListener() { // from class: io.radar.sdk.u0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C4654w0.y(Function1.this, (Void) obj);
            }
        });
        removeGeofences.addOnFailureListener(new OnFailureListener() { // from class: io.radar.sdk.v0
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C4654w0.z(Function1.this, exc);
            }
        });
    }

    @Override // io.radar.sdk.L
    public void h(PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        this.f50167c.removeLocationUpdates(pendingIntent);
    }

    @Override // io.radar.sdk.L
    public void i(N0.b desiredAccuracy, int i10, int i11, PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(desiredAccuracy, "desiredAccuracy");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        LocationRequest.a e10 = new LocationRequest.a(x(desiredAccuracy), i10 * 1000).e(i11 * 1000);
        Intrinsics.checkNotNullExpressionValue(e10, "Builder(priority, interv…(fastestInterval * 1000L)");
        if (desiredAccuracy == N0.b.HIGH) {
            e10 = e10.d(0L);
            Intrinsics.checkNotNullExpressionValue(e10, "locationRequestBuilder.setMaxUpdateAgeMillis(0)");
        }
        LocationRequest a10 = e10.a();
        Intrinsics.checkNotNullExpressionValue(a10, "locationRequestBuilder.build()");
        this.f50167c.requestLocationUpdates(a10, pendingIntent);
    }

    public final int x(N0.b bVar) {
        int i10 = a.$EnumSwitchMapping$0[bVar.ordinal()];
        if (i10 == 1) {
            return 100;
        }
        if (i10 == 2) {
            return 102;
        }
        if (i10 == 3) {
            return 104;
        }
        if (i10 == 4) {
            return 105;
        }
        throw new NoWhenBranchMatchedException();
    }
}
