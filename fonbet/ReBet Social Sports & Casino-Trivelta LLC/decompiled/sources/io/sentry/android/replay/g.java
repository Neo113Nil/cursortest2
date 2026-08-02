package io.sentry.android.replay;

import java.io.Closeable;

/* loaded from: classes3.dex */
public interface g extends Closeable {
    void g(s sVar);

    void pause();

    void reset();

    void resume();

    void start();

    void stop();
}
