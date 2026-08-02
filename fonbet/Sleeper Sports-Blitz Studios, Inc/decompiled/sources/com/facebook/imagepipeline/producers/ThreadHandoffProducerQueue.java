package com.facebook.imagepipeline.producers;

/* loaded from: classes6.dex */
public interface ThreadHandoffProducerQueue {
    void addToQueueOrExecute(Runnable runnable);

    boolean isQueueing();

    void remove(Runnable runnable);

    void startQueueing();

    void stopQueuing();
}
