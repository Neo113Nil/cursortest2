package re0;

import Sc.s;
import android.location.Location;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import re0.C9260c;

@e(c = "ru.ozon.mapsdk.common.locationcontroller.userLocationManager.pulse.LocationPulseListener$onTimeout$1", f = "LocationPulseListener.kt", l = {111}, m = "invokeSuspend")
/* renamed from: re0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C9258a extends j implements Function2<Location, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f83330d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<kotlin.coroutines.d<? super Unit>, Object> f83331e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C9258a(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super C9258a> dVar) {
        super(2, dVar);
        this.f83331e = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9258a(this.f83331e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Location location, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9258a) create(location, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f83330d;
        if (i11 == 0) {
            s.b(obj);
            this.f83330d = 1;
            if (((C9260c.C1419c) this.f83331e).invoke(this) == aVar) {
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
}
