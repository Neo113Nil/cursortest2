package ru.ozon.app.android.initializers.lastlocation;

import Ae.C;
import Ae.InterfaceC2397i;
import Ge.n;
import Sc.s;
import Wc.a;
import android.location.Location;
import fd.InterfaceC6511n;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.location.LocationRepository;
import ru.ozon.app.android.mapcommon.mapcommon.LastLocationRepository;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.initializers.lastlocation.LastLocationInitializer$init$1$onStart$1", f = "LastLocationInitializer.kt", l = {38}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class LastLocationInitializer$init$1$onStart$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ LastLocationInitializer this$0;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LAe/i;", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "", "it", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.initializers.lastlocation.LastLocationInitializer$init$1$onStart$1$1", f = "LastLocationInitializer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.initializers.lastlocation.LastLocationInitializer$init$1$onStart$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements InterfaceC6511n<InterfaceC2397i<? super Location>, Throwable, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super Location> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
            anonymousClass1.L$0 = th2;
            return anonymousClass1.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Lm0.a.f17149a.e((Throwable) this.L$0);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LastLocationInitializer$init$1$onStart$1(LastLocationInitializer lastLocationInitializer, d<? super LastLocationInitializer$init$1$onStart$1> dVar) {
        super(2, dVar);
        this.this$0 = lastLocationInitializer;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new LastLocationInitializer$init$1$onStart$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        LocationRepository locationRepository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            locationRepository = this.this$0.locationRepository;
            p k11 = LocationRepository.DefaultImpls.getLastLocation$default(locationRepository, false, 1, null).k();
            Intrinsics.checkNotNullExpressionValue(k11, "toObservable(...)");
            C c11 = new C(n.a(k11), new AnonymousClass1(null));
            final LastLocationInitializer lastLocationInitializer = this.this$0;
            InterfaceC2397i<? super Object> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.initializers.lastlocation.LastLocationInitializer$init$1$onStart$1.2
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((Location) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(Location location, d<? super Unit> dVar) {
                    LastLocationRepository lastLocationRepository;
                    lastLocationRepository = LastLocationInitializer.this.lastLocationRepository;
                    Intrinsics.f(location);
                    lastLocationRepository.updateUserLocation(location);
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (c11.collect(interfaceC2397i, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((LastLocationInitializer$init$1$onStart$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
