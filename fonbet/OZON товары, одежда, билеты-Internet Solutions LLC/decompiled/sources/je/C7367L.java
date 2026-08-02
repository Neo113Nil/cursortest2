package je;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: je.L, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C7367L implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final M f69844a;

    public C7367L(M m11) {
        this.f69844a = m11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ke.h kotlinTypeRefiner = (ke.h) obj;
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f69844a.f(kotlinTypeRefiner).c();
    }
}
