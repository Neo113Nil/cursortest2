package y0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10727i;

/* renamed from: y0.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10815w extends AbstractC7737t implements Function0<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b0 f105872b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ xe.M f105873c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10815w(b0 b0Var, xe.M m11) {
        super(0);
        this.f105872b = b0Var;
        this.f105873c = m11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z11;
        b0 b0Var = this.f105872b;
        if (b0Var.e()) {
            C10727i.c(this.f105873c, null, null, new C10818z(b0Var, null), 3);
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }
}
