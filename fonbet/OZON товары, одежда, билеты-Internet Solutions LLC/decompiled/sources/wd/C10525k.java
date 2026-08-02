package wd;

import ce.y;
import kotlin.jvm.functions.Function0;

/* renamed from: wd.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C10525k implements Function0<ce.l> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10526l f104303a;

    C10525k(C10526l c10526l) {
        this.f104303a = c10526l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ce.l invoke() {
        StringBuilder sb2 = new StringBuilder("Scope for type parameter ");
        C10526l c10526l = this.f104303a;
        sb2.append(c10526l.f104304a.b());
        return y.a.a(sb2.toString(), c10526l.f104305b.getUpperBounds());
    }
}
