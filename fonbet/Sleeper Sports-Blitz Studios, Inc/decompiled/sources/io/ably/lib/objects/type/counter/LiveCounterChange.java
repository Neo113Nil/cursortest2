package io.ably.lib.objects.type.counter;

import io.ably.lib.objects.ObjectsSubscription;

/* loaded from: classes9.dex */
public interface LiveCounterChange {

    public interface Listener {
        void onUpdated(LiveCounterUpdate liveCounterUpdate);
    }

    ObjectsSubscription subscribe(Listener listener);

    void unsubscribe(Listener listener);

    void unsubscribeAll();
}
