package l0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import m0.C8013s;
import m1.C8034e;

/* loaded from: classes.dex */
final class K extends AbstractC7737t implements Function1<C7807Z, C8013s> {

    /* renamed from: b, reason: collision with root package name */
    public static final K f72025b = new K(1);

    @Override // kotlin.jvm.functions.Function1
    public final C8013s invoke(C7807Z c7807z) {
        long n11 = C7807Z.n(c7807z.w(), C8034e.p());
        return new C8013s(C7807Z.q(n11), C7807Z.u(n11), C7807Z.t(n11), C7807Z.r(n11));
    }
}
