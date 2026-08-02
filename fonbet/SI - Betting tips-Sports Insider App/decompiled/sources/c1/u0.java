package c1;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final mf.i f3481a;

    /* renamed from: b, reason: collision with root package name */
    public final eg.r f3482b;

    /* renamed from: c, reason: collision with root package name */
    public final c1 f3483c;

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineContext f3484d;

    /* JADX WARN: Multi-variable type inference failed */
    public u0(Function2 transform, eg.r ack, c1 c1Var, CoroutineContext callerContext) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(ack, "ack");
        Intrinsics.checkNotNullParameter(callerContext, "callerContext");
        this.f3481a = (mf.i) transform;
        this.f3482b = ack;
        this.f3483c = c1Var;
        this.f3484d = callerContext;
    }
}
