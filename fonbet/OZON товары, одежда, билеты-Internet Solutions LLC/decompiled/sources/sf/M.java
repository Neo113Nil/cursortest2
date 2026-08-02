package sf;

import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public interface M extends Closeable {
    long read(@NotNull C9681g c9681g, long j11) throws IOException;

    @NotNull
    N timeout();
}
