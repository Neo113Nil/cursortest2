package z0;

import D1.AbstractC2810k0;
import Z1.r;
import k1.C7460f;
import k1.C7461g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class j extends AbstractC7737t implements Function0<C7460f> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7460f f106876b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC2810k0 f106877c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(C7460f c7460f, AbstractC2810k0 abstractC2810k0) {
        super(0);
        this.f106876b = c7460f;
        this.f106877c = abstractC2810k0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C7460f invoke() {
        C7460f c7460f = this.f106876b;
        if (c7460f != null) {
            return c7460f;
        }
        AbstractC2810k0 abstractC2810k0 = this.f106877c;
        if (!abstractC2810k0.I()) {
            abstractC2810k0 = null;
        }
        if (abstractC2810k0 != null) {
            return C7461g.a(0L, r.b(abstractC2810k0.a()));
        }
        return null;
    }
}
