package oe0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.locationProvider.FusedSubscribeLocationUpdates$1", f = "FusedSubscribeLocationUpdates.kt", l = {}, m = "invokeSuspend")
/* renamed from: oe0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8710a extends kotlin.coroutines.jvm.internal.j implements Function2<Integer, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ int f78133d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C8711b f78134e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8710a(kotlin.coroutines.d dVar, C8711b c8711b) {
        super(2, dVar);
        this.f78134e = c8711b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C8710a c8710a = new C8710a(dVar, this.f78134e);
        c8710a.f78133d = ((Number) obj).intValue();
        return c8710a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C8710a) create(Integer.valueOf(num.intValue()), dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        int i11 = this.f78133d;
        C8711b c8711b = this.f78134e;
        if (i11 > 0) {
            C8711b.d(c8711b);
        } else {
            C8711b.e(c8711b);
        }
        return Unit.f71690a;
    }
}
