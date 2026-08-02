package sd;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
final class n implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final u f98602a;

    public n(u uVar) {
        this.f98602a = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return u.h(this.f98602a, (Pair) obj);
    }
}
