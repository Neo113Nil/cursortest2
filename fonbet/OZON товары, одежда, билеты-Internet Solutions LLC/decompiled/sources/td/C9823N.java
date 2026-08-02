package td;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: td.N, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9823N implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final Sd.c f99377a;

    public C9823N(Sd.c cVar) {
        this.f99377a = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Sd.c it = (Sd.c) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!it.d() && it.e().equals(this.f99377a));
    }
}
