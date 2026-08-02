package gZ;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.cdn.chooser.internal.domain.CdnChooserUpdater$startRefreshConfig$1", f = "CdnChooserUpdater.kt", l = {84}, m = "invokeSuspend")
/* renamed from: gZ.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C6703k extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f64208d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C6701i f64209e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6703k(C6701i c6701i, kotlin.coroutines.d<? super C6703k> dVar) {
        super(2, dVar);
        this.f64209e = c6701i;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C6703k(this.f64209e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C6703k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f64208d;
        if (i11 == 0) {
            s.b(obj);
            this.f64208d = 1;
            if (C6701i.a(this.f64209e, this) == aVar) {
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
