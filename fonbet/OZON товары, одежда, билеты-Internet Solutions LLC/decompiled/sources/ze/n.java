package ze;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.C10740o0;
import ze.l;

/* loaded from: classes.dex */
public final class n {
    public static final void a(@NotNull w<?> wVar, Throwable th2) {
        CancellationException cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (cancellationException == null) {
            cancellationException = C10740o0.a("Channel was consumed, consumer had failed", th2);
        }
        wVar.j(cancellationException);
    }

    @NotNull
    public static final void b(@NotNull x xVar, Object obj) {
        Object b11 = xVar.b(obj);
        if (b11 instanceof l.b) {
            ((l) C10727i.d(kotlin.coroutines.g.f71771a, new o(xVar, obj, null))).getClass();
        } else {
            Unit unit = Unit.f71690a;
        }
    }
}
