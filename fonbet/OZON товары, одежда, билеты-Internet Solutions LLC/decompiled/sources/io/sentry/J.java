package io.sentry;

import java.io.Closeable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface J extends Closeable {

    public enum a {
        UNKNOWN,
        CONNECTED,
        DISCONNECTED,
        NO_PERMISSION
    }

    public interface b {
        void j(@NotNull a aVar);
    }

    String D();

    void I0(@NotNull b bVar);

    boolean O1(@NotNull b bVar);

    @NotNull
    a l();
}
