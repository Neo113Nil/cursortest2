package td;

import kotlin.jvm.functions.Function1;
import td.C9819J;

/* renamed from: td.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C9818I implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final C9819J f99366a;

    public C9818I(C9819J c9819j) {
        this.f99366a = c9819j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return C9819J.b(this.f99366a, (C9819J.a) obj);
    }
}
