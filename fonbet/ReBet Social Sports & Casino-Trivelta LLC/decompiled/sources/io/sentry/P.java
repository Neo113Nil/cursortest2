package io.sentry;

import java.io.Closeable;

/* loaded from: classes3.dex */
public interface P extends Closeable {

    public enum a {
        UNKNOWN,
        CONNECTED,
        DISCONNECTED,
        NO_PERMISSION
    }

    public interface b {
        void B(a aVar);
    }

    String I();

    void J1(b bVar);

    a s0();

    boolean x1(b bVar);
}
