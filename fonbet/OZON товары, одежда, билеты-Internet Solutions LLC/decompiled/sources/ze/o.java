package ze;

import Sc.r;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;
import ze.l;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", l = {DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class o extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super l<? extends Unit>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f108952d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f108953e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ x<Object> f108954f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Object f108955g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(x<Object> xVar, Object obj, kotlin.coroutines.d<? super o> dVar) {
        super(2, dVar);
        this.f108954f = xVar;
        this.f108955g = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        o oVar = new o(this.f108954f, this.f108955g, dVar);
        oVar.f108953e = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super l<? extends Unit>> dVar) {
        return ((o) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f108952d;
        try {
            if (i11 == 0) {
                Sc.s.b(obj);
                x<Object> xVar = this.f108954f;
                Object obj2 = this.f108955g;
                r.Companion companion = Sc.r.INSTANCE;
                this.f108952d = 1;
                if (xVar.n(obj2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            a11 = Unit.f71690a;
            r.Companion companion2 = Sc.r.INSTANCE;
        } catch (Throwable th2) {
            r.Companion companion3 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        return l.b(!(a11 instanceof r.b) ? Unit.f71690a : new l.a(Sc.r.b(a11)));
    }
}
