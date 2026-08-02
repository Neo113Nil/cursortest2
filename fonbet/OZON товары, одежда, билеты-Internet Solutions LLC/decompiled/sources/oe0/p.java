package oe0;

import ag.InterfaceC5020b;
import ag.e;
import android.location.Location;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.locationProvider.LocationProviderImp$baseSubscribeForLocationUpdates$1", f = "LocationProviderImp.kt", l = {166}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class p extends kotlin.coroutines.jvm.internal.j implements Function2<ze.u<? super Location>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f78228d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f78229e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ o f78230f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f78231g;

    static final class a extends AbstractC7737t implements Function1<InterfaceC5020b, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f78232b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f78233c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j11, c cVar) {
            super(1);
            this.f78232b = j11;
            this.f78233c = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC5020b interfaceC5020b) {
            InterfaceC5020b safeCallLocationRequest = interfaceC5020b;
            Intrinsics.checkNotNullParameter(safeCallLocationRequest, "$this$safeCallLocationRequest");
            e.a aVar = new e.a(this.f78232b);
            aVar.e((float) 0.0d);
            safeCallLocationRequest.b(aVar.d(), this.f78233c, Looper.getMainLooper());
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f78234b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f78235c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o oVar, c cVar) {
            super(0);
            this.f78234b = oVar;
            this.f78235c = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o.c(this.f78234b, new q(this.f78235c));
            return Unit.f71690a;
        }
    }

    public static final class c implements ag.c<ag.f> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ze.u<Location> f78236a;

        /* JADX WARN: Multi-variable type inference failed */
        c(ze.u<? super Location> uVar) {
            this.f78236a = uVar;
        }

        @Override // ag.c
        public final void a(ag.f fVar) {
            Location b11 = fVar.b();
            if (b11 != null) {
                this.f78236a.b(b11);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(o oVar, long j11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f78230f = oVar;
        this.f78231g = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        p pVar = new p(this.f78230f, this.f78231g, dVar);
        pVar.f78229e = obj;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ze.u<? super Location> uVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((p) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f78228d;
        if (i11 == 0) {
            Sc.s.b(obj);
            ze.u uVar = (ze.u) this.f78229e;
            c cVar = new c(uVar);
            a aVar2 = new a(this.f78231g, cVar);
            o oVar = this.f78230f;
            o.c(oVar, aVar2);
            b bVar = new b(oVar, cVar);
            this.f78228d = 1;
            if (ze.s.a(uVar, bVar, this) == aVar) {
                return aVar;
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
