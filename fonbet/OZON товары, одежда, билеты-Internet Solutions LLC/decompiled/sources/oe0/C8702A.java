package oe0;

import android.location.Location;
import android.location.LocationManager;
import android.os.HandlerThread;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import oe0.z;
import te0.C9867b;
import ue0.InterfaceC10046c;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.locationProvider.LocationTracker$subscribeToLocationUpdates$1", f = "LocationTracker.kt", l = {75}, m = "invokeSuspend")
/* renamed from: oe0.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8702A extends kotlin.coroutines.jvm.internal.j implements Function2<ze.u<? super z.b>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f78096d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f78097e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ z f78098f;

    /* renamed from: oe0.A$a */
    static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f78099b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f78100c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ HandlerThread f78101d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z zVar, b bVar, HandlerThread handlerThread) {
            super(0);
            this.f78099b = zVar;
            this.f78100c = bVar;
            this.f78101d = handlerThread;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            L l11;
            LocationManager b11;
            z zVar = this.f78099b;
            l11 = zVar.f78260b;
            if (l11 != null && (b11 = l11.b()) != null) {
                b11.removeUpdates(this.f78100c);
            }
            this.f78101d.quitSafely();
            C9867b c9867b = C9867b.f99466a;
            C9867b.g("canceled subscription for provider:" + zVar.b(), null, 6);
            return Unit.f71690a;
        }
    }

    /* renamed from: oe0.A$b */
    public static final class b implements androidx.core.location.a {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ze.u<z.b> f78102c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ z f78103d;

        /* JADX WARN: Multi-variable type inference failed */
        b(ze.u<? super z.b> uVar, z zVar) {
            this.f78102c = uVar;
            this.f78103d = zVar;
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            this.f78102c.b(new z.b.c(this.f78103d.b(), location));
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String provider) {
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.f78102c.b(new z.b.C1325b(this.f78103d.b(), false));
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String provider) {
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.f78102c.b(new z.b.C1325b(this.f78103d.b(), true));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8702A(z zVar, kotlin.coroutines.d<? super C8702A> dVar) {
        super(2, dVar);
        this.f78098f = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C8702A c8702a = new C8702A(this.f78098f, dVar);
        c8702a.f78097e = obj;
        return c8702a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ze.u<? super z.b> uVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C8702A) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0111 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        a aVar;
        L l11;
        L l12;
        LocationManager b11;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f78096d;
        if (i11 == 0) {
            Sc.s.b(obj);
            ze.u uVar = (ze.u) this.f78097e;
            HandlerThread handlerThread = new HandlerThread("LocationUpdatesThread");
            handlerThread.start();
            z zVar = this.f78098f;
            b bVar = new b(uVar, zVar);
            C9867b c9867b = C9867b.f99466a;
            C9867b.g("start subscription for provider:" + zVar.b(), null, 6);
            try {
                l11 = zVar.f78260b;
            } catch (IllegalArgumentException e11) {
                e = e11;
                th2 = null;
            } catch (SecurityException e12) {
                e = e12;
                th2 = null;
            }
            if (l11 != null) {
                LocationManager b12 = l11.b();
                if (b12 != null) {
                    try {
                        th2 = null;
                        try {
                            b12.requestLocationUpdates(zVar.b(), 5000L, 5.0f, bVar, handlerThread.getLooper());
                            l12 = zVar.f78260b;
                            uVar.b(new z.b.c(zVar.b(), (l12 != null || (b11 = l12.b()) == null) ? th2 : b11.getLastKnownLocation(zVar.b())));
                        } catch (IllegalArgumentException e13) {
                            e = e13;
                            String b13 = zVar.b();
                            z.a aVar3 = z.a.PROVIDER_NOT_AVAILABLE;
                            uVar.b(new z.b.a(b13, aVar3));
                            C9867b c9867b2 = C9867b.f99466a;
                            C9867b.f("error request location :" + aVar3 + " provider:" + zVar.b(), e, InterfaceC10046c.a.ERROR);
                            uVar.l(th2);
                            aVar = new a(zVar, bVar, handlerThread);
                            this.f78096d = 1;
                            if (ze.s.a(uVar, aVar, this) == aVar2) {
                            }
                            return Unit.f71690a;
                        } catch (SecurityException e14) {
                            e = e14;
                            String b14 = zVar.b();
                            z.a aVar4 = z.a.PERMISSION_DENIED;
                            uVar.b(new z.b.a(b14, aVar4));
                            C9867b c9867b3 = C9867b.f99466a;
                            C9867b.f("error request location :" + aVar4 + " provider:" + zVar.b(), e, InterfaceC10046c.a.ERROR);
                            uVar.l(th2);
                            aVar = new a(zVar, bVar, handlerThread);
                            this.f78096d = 1;
                            if (ze.s.a(uVar, aVar, this) == aVar2) {
                            }
                            return Unit.f71690a;
                        }
                    } catch (IllegalArgumentException e15) {
                        e = e15;
                        th2 = null;
                        String b132 = zVar.b();
                        z.a aVar32 = z.a.PROVIDER_NOT_AVAILABLE;
                        uVar.b(new z.b.a(b132, aVar32));
                        C9867b c9867b22 = C9867b.f99466a;
                        C9867b.f("error request location :" + aVar32 + " provider:" + zVar.b(), e, InterfaceC10046c.a.ERROR);
                        uVar.l(th2);
                        aVar = new a(zVar, bVar, handlerThread);
                        this.f78096d = 1;
                        if (ze.s.a(uVar, aVar, this) == aVar2) {
                        }
                        return Unit.f71690a;
                    } catch (SecurityException e16) {
                        e = e16;
                        th2 = null;
                        String b142 = zVar.b();
                        z.a aVar42 = z.a.PERMISSION_DENIED;
                        uVar.b(new z.b.a(b142, aVar42));
                        C9867b c9867b32 = C9867b.f99466a;
                        C9867b.f("error request location :" + aVar42 + " provider:" + zVar.b(), e, InterfaceC10046c.a.ERROR);
                        uVar.l(th2);
                        aVar = new a(zVar, bVar, handlerThread);
                        this.f78096d = 1;
                        if (ze.s.a(uVar, aVar, this) == aVar2) {
                        }
                        return Unit.f71690a;
                    }
                    aVar = new a(zVar, bVar, handlerThread);
                    this.f78096d = 1;
                    if (ze.s.a(uVar, aVar, this) == aVar2) {
                        return aVar2;
                    }
                }
            }
            th2 = null;
            l12 = zVar.f78260b;
            uVar.b(new z.b.c(zVar.b(), (l12 != null || (b11 = l12.b()) == null) ? th2 : b11.getLastKnownLocation(zVar.b())));
            aVar = new a(zVar, bVar, handlerThread);
            this.f78096d = 1;
            if (ze.s.a(uVar, aVar, this) == aVar2) {
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
