package nd;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import zd.C11104f;

/* loaded from: classes.dex */
final class P0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final R0 f76901a;

    public P0(R0 r02) {
        this.f76901a = r02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Type f7 = this.f76901a.f();
        Intrinsics.f(f7);
        return C11104f.d(f7);
    }
}
