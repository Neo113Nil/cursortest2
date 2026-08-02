package io.sentry.backpressure;

/* loaded from: classes9.dex */
public interface IBackpressureMonitor {
    void close();

    int getDownsampleFactor();

    void start();
}
