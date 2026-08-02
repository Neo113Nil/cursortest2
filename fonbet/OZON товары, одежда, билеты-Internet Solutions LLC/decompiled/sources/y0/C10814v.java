package y0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10727i;

/* renamed from: y0.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10814v extends AbstractC7737t implements Function0<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b0 f105870b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ xe.M f105871c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10814v(b0 b0Var, xe.M m11) {
        super(0);
        this.f105870b = b0Var;
        this.f105871c = m11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z11;
        b0 b0Var = this.f105870b;
        if (b0Var.b()) {
            C10727i.c(this.f105871c, null, null, new C10791A(b0Var, null), 3);
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }
}
