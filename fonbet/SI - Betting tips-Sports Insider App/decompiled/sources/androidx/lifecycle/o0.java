package androidx.lifecycle;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final i f2226a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f2227b;

    public o0(i target, CoroutineContext context) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f2226a = target;
        lg.e eVar = eg.m0.f9201a;
        this.f2227b = context.t(jg.q.f18523a.f9624e);
    }
}
