package ce;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
final class i implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f57040a;

    public i(Function0 function0) {
        this.f57040a = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        l lVar = (l) this.f57040a.invoke();
        return lVar instanceof AbstractC5814a ? ((AbstractC5814a) lVar).h() : lVar;
    }
}
