package sd;

import ie.C7056e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import wd.L;

/* renamed from: sd.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C9666h implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final C9669k f98590a;

    /* renamed from: b, reason: collision with root package name */
    private final C7056e f98591b;

    public C9666h(C9669k c9669k, C7056e c7056e) {
        this.f98590a = c9669k;
        this.f98591b = c7056e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C9669k c9669k = this.f98590a;
        L q11 = c9669k.q();
        Intrinsics.checkNotNullExpressionValue(q11, "getBuiltInsModule(...)");
        return new u(q11, this.f98591b, new C9668j(c9669k));
    }
}
