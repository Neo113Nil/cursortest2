package je;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes10.dex */
final class P implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final s0 f69854a;

    /* renamed from: b, reason: collision with root package name */
    private final List f69855b;

    /* renamed from: c, reason: collision with root package name */
    private final o0 f69856c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f69857d;

    /* renamed from: e, reason: collision with root package name */
    private final ce.l f69858e;

    public P(ce.l lVar, List list, o0 o0Var, s0 s0Var, boolean z11) {
        this.f69854a = s0Var;
        this.f69855b = list;
        this.f69856c = o0Var;
        this.f69857d = z11;
        this.f69858e = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        o0 o0Var = this.f69856c;
        boolean z11 = this.f69857d;
        Q.b(this.f69854a, this.f69855b, o0Var, z11, this.f69858e, (ke.h) obj);
        return null;
    }
}
