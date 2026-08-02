package j30;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.analytic.domain.graylog.GraylogInteractor$checkAndSend$1", f = "GraylogInteractor.kt", l = {277}, m = "invokeSuspend")
/* renamed from: j30.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C7276a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f69362d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ c f69363e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f69364f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7276a(c cVar, boolean z11, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f69363e = cVar;
        this.f69364f = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C7276a(this.f69363e, this.f69364f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C7276a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f69362d;
        c cVar = this.f69363e;
        if (i11 == 0) {
            s.b(obj);
            this.f69362d = 1;
            obj = c.h(cVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean z11 = this.f69364f;
        if (booleanValue || z11) {
            cVar.i(1, z11, false);
        }
        return Unit.f71690a;
    }
}
