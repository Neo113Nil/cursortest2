package oe0;

import android.location.Location;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.locationProvider.SmartLocationPicker$getCurrentLocationSuspend$3", f = "SmartLocationPicker.kt", l = {118}, m = "invokeSuspend")
/* renamed from: oe0.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8705D extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    ze.j f78115d;

    /* renamed from: e, reason: collision with root package name */
    int f78116e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ze.h<Location> f78117f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ List<Location> f78118g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8705D(ze.h<Location> hVar, List<Location> list, kotlin.coroutines.d<? super C8705D> dVar) {
        super(2, dVar);
        this.f78117f = hVar;
        this.f78118g = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C8705D(this.f78117f, this.f78118g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C8705D) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0029 -> B:5:0x002c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ze.j<Location> it;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f78116e;
        if (i11 == 0) {
            Sc.s.b(obj);
            it = this.f78117f.iterator();
            this.f78115d = it;
            this.f78116e = 1;
            obj = it.b(this);
            if (obj == aVar) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f78115d;
            Sc.s.b(obj);
            if (((Boolean) obj).booleanValue()) {
                this.f78118g.add(it.next());
                this.f78115d = it;
                this.f78116e = 1;
                obj = it.b(this);
                if (obj == aVar) {
                    return aVar;
                }
                if (((Boolean) obj).booleanValue()) {
                    return Unit.f71690a;
                }
            }
        }
    }
}
