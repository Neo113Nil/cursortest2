package od;

import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final class c implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f78036a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f78037b;

    public c(Class cls, Map map) {
        this.f78036a = cls;
        this.f78037b = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        sb2.append(this.f78036a.getCanonicalName());
        C7714v.U(this.f78037b.entrySet(), sb2, ", ", "(", ")", e.f78043a, 48);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
