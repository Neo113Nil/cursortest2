package y0;

import I1.C3222a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: y0.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10817y extends AbstractC7737t implements Function1<I1.D, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f105876b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ b0 f105877c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ xe.M f105878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10817y(boolean z11, b0 b0Var, xe.M m11) {
        super(1);
        this.f105876b = z11;
        this.f105877c = b0Var;
        this.f105878d = m11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(I1.D d11) {
        I1.D d12 = d11;
        b0 b0Var = this.f105877c;
        boolean z11 = this.f105876b;
        xe.M m11 = this.f105878d;
        if (z11) {
            C10813u c10813u = new C10813u(b0Var, m11);
            int i11 = I1.z.f11793b;
            d12.b(I1.k.q(), new C3222a(null, c10813u));
            d12.b(I1.k.n(), new C3222a(null, new C10814v(b0Var, m11)));
        } else {
            C10815w c10815w = new C10815w(b0Var, m11);
            int i12 = I1.z.f11793b;
            d12.b(I1.k.o(), new C3222a(null, c10815w));
            d12.b(I1.k.p(), new C3222a(null, new C10816x(b0Var, m11)));
        }
        return Unit.f71690a;
    }
}
