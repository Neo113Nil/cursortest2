package eg;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class x0 extends w implements Closeable, AutoCloseable {
    static {
        a2.j safeCast = new a2.j(29);
        v baseKey = w.f9230b;
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        if (baseKey != null) {
            kotlin.coroutines.f fVar = baseKey.f19223b;
        }
    }

    public abstract Executor i0();
}
