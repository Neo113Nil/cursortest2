package Jc;

import Ic.AbstractC1350d;
import Ic.B;
import Ic.C1348b;
import Ic.m;
import Ic.o;
import Ic.p;
import Ic.q;
import Ic.t;
import Ic.u;
import Ic.x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f6104a = new e();

    @NotNull
    private static final AbstractC1350d.c[] handlerFactories = {new q.d(), new B.b(), new o.b(), new t.b(), new u.a(), new x.b(), new C1348b.C0121b(), new p.a(), new m.b()};

    public final AbstractC1350d.c a(AbstractC1350d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        for (AbstractC1350d.c cVar : handlerFactories) {
            if (Intrinsics.areEqual(cVar.e(), handler.getClass())) {
                return cVar;
            }
        }
        return null;
    }

    public final AbstractC1350d.c b(String handlerName) {
        Intrinsics.checkNotNullParameter(handlerName, "handlerName");
        for (AbstractC1350d.c cVar : handlerFactories) {
            if (Intrinsics.areEqual(cVar.d(), handlerName)) {
                return cVar;
            }
        }
        return null;
    }
}
