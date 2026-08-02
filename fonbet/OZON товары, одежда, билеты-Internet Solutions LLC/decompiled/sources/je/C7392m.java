package je;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: je.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7392m implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC7394n f69903a;

    public C7392m(AbstractC7394n abstractC7394n) {
        this.f69903a = abstractC7394n;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        N it = (N) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f69903a.j(it);
        return Unit.f71690a;
    }
}
