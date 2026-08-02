package je;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
final class O implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final s0 f69850a;

    /* renamed from: b, reason: collision with root package name */
    private final List f69851b;

    /* renamed from: c, reason: collision with root package name */
    private final o0 f69852c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f69853d;

    public O(s0 s0Var, List list, o0 o0Var, boolean z11) {
        this.f69850a = s0Var;
        this.f69851b = list;
        this.f69852c = o0Var;
        this.f69853d = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Q.a(this.f69851b, this.f69852c, this.f69850a, (ke.h) obj, this.f69853d);
        return null;
    }
}
