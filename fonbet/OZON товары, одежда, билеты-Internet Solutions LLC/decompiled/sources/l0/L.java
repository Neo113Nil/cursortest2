package l0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import l1.C7811b0;
import m0.C8013s;
import m1.AbstractC8032c;
import m1.C8034e;

/* loaded from: classes.dex */
final class L extends AbstractC7737t implements Function1<C8013s, C7807Z> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC8032c f72026b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L(AbstractC8032c abstractC8032c) {
        super(1);
        this.f72026b = abstractC8032c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C7807Z invoke(C8013s c8013s) {
        C8013s c8013s2 = c8013s;
        float g10 = c8013s2.g();
        if (g10 < 0.0f) {
            g10 = 0.0f;
        }
        if (g10 > 1.0f) {
            g10 = 1.0f;
        }
        float h11 = c8013s2.h();
        if (h11 < -0.5f) {
            h11 = -0.5f;
        }
        if (h11 > 0.5f) {
            h11 = 0.5f;
        }
        float i11 = c8013s2.i();
        float f7 = i11 >= -0.5f ? i11 : -0.5f;
        float f11 = f7 <= 0.5f ? f7 : 0.5f;
        float f12 = c8013s2.f();
        float f13 = f12 >= 0.0f ? f12 : 0.0f;
        return C7807Z.m(C7807Z.n(C7811b0.a(g10, h11, f11, f13 <= 1.0f ? f13 : 1.0f, C8034e.p()), this.f72026b));
    }
}
