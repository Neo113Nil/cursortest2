package x80;

import A30.m;
import Sc.s;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.domain.interceptors.OzonWebAuthNewInterceptor$process$1", f = "OzonWebAuthNewInterceptor.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f105128d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h f105129e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(h hVar, kotlin.coroutines.d<? super g> dVar) {
        super(2, dVar);
        this.f105129e = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new g(this.f105129e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        S80.b bVar;
        m mVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f105128d;
        h hVar = this.f105129e;
        try {
            if (i11 == 0) {
                s.b(obj);
                bVar = hVar.f105131b;
                bVar.B(true);
                mVar = hVar.f105133d;
                this.f105128d = 1;
                if (mVar.w(true, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
        } catch (Exception unused) {
            L80.a.a(hVar.getType().name(), "Error logout e=" + hVar.getType());
        }
        return Unit.f71690a;
    }
}
