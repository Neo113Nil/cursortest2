package okio.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"setBitsOrZero", "", "Ljava/util/concurrent/atomic/AtomicInteger;", "bits", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class _AtomicKt {
    public static final int setBitsOrZero(@NotNull AtomicInteger atomicInteger, int i5) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
        do {
            i10 = atomicInteger.get();
            if ((i10 & i5) != 0) {
                return 0;
            }
            i11 = i10 | i5;
        } while (!atomicInteger.compareAndSet(i10, i11));
        return i11;
    }
}
