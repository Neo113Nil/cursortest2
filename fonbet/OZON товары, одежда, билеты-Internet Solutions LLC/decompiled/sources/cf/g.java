package cf;

import We.C4859a;
import We.C4867i;
import We.y;
import java.security.cert.Certificate;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import lf.AbstractC7947c;

/* loaded from: classes6.dex */
final class g extends AbstractC7737t implements Function0<List<? extends Certificate>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4867i f57122b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ y f57123c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4859a f57124d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(C4867i c4867i, y yVar, C4859a c4859a) {
        super(0);
        this.f57122b = c4867i;
        this.f57123c = yVar;
        this.f57124d = c4859a;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends Certificate> invoke() {
        AbstractC7947c c11 = this.f57122b.c();
        Intrinsics.f(c11);
        return c11.a(this.f57124d.l().h(), this.f57123c.c());
    }
}
