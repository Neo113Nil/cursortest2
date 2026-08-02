package qi0;

import Sc.s;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.M;
import kotlin.time.b;
import ve.EnumC10311b;
import vi0.AbstractC10323a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.debug.menu.config.impl.TrackerConfigProviderImpl$provide$3", f = "TrackerConfigProviderImpl.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class g extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    M f82155d;

    /* renamed from: e, reason: collision with root package name */
    int f82156e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ M<kotlin.time.b> f82157f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ n f82158g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(M<kotlin.time.b> m11, n nVar, kotlin.coroutines.d<? super g> dVar) {
        super(1, dVar);
        this.f82157f = m11;
        this.f82158g = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new g(this.f82157f, this.f82158g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        M<kotlin.time.b> m11;
        T t2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f82156e;
        if (i11 == 0) {
            s.b(obj);
            AbstractC10323a.i iVar = AbstractC10323a.i.f102991c;
            M<kotlin.time.b> m12 = this.f82157f;
            this.f82155d = m12;
            this.f82156e = 1;
            obj = n.b(this.f82158g, iVar, this);
            if (obj == aVar) {
                return aVar;
            }
            m11 = m12;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m11 = this.f82155d;
            s.b(obj);
        }
        Integer num = (Integer) obj;
        if (num != null) {
            b.Companion companion = kotlin.time.b.INSTANCE;
            t2 = kotlin.time.b.e(kotlin.time.c.g(num.intValue(), EnumC10311b.MILLISECONDS));
        } else {
            t2 = 0;
        }
        m11.f71787a = t2;
        return Unit.f71690a;
    }
}
