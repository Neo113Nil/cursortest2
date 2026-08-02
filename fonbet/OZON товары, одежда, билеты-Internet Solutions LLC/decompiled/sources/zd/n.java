package zd;

import kotlin.jvm.functions.Function1;

/* loaded from: classes10.dex */
final class n implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final n f108840a = new n();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String simpleName = ((Class) obj).getSimpleName();
        if (!Sd.f.h(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return Sd.f.f(simpleName);
        }
        return null;
    }
}
