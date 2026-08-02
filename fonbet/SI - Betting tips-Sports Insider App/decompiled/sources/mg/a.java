package mg;

import eg.c0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a extends FunctionReferenceImpl implements vf.a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f20708a = new a(3, b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // vf.a
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b bVar = (b) obj;
        f fVar = (f) obj2;
        long j = bVar.f20709a;
        if (j <= 0) {
            ((e) fVar).f20728e = Unit.f19194a;
        } else {
            io.sentry.android.replay.util.c cVar = new io.sentry.android.replay.util.c(11, fVar, bVar);
            Intrinsics.checkNotNull(fVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            e eVar = (e) fVar;
            CoroutineContext coroutineContext = eVar.f20724a;
            eVar.f20726c = c0.m(coroutineContext).C(j, cVar, coroutineContext);
        }
        return Unit.f19194a;
    }
}
