package oe0;

import android.location.Location;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;
import ze.C11115c;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.locationProvider.SmartLocationPicker$getCurrentLocationSuspend$2", f = "SmartLocationPicker.kt", l = {112}, m = "invokeSuspend")
/* renamed from: oe0.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8704C extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    ze.j f78111d;

    /* renamed from: e, reason: collision with root package name */
    int f78112e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C11115c f78113f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ArrayList f78114g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8704C(C11115c c11115c, ArrayList arrayList, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f78113f = c11115c;
        this.f78114g = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C8704C(this.f78113f, this.f78114g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C8704C) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ze.j jVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f78112e;
        if (i11 == 0) {
            Sc.s.b(obj);
            ze.j it = this.f78113f.iterator();
            this.f78111d = it;
            this.f78112e = 1;
            Object b11 = it.b(this);
            if (b11 == aVar) {
                return aVar;
            }
            jVar = it;
            obj = b11;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = this.f78111d;
            Sc.s.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.f78114g.add((Location) jVar.next());
        }
        return Unit.f71690a;
    }
}
