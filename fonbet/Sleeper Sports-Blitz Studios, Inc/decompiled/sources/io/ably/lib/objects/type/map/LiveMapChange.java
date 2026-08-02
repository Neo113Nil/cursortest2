package io.ably.lib.objects.type.map;

import io.ably.lib.objects.ObjectsSubscription;

/* loaded from: classes9.dex */
public interface LiveMapChange {

    public interface Listener {
        void onUpdated(LiveMapUpdate liveMapUpdate);
    }

    ObjectsSubscription subscribe(Listener listener);

    void unsubscribe(Listener listener);

    void unsubscribeAll();
}
