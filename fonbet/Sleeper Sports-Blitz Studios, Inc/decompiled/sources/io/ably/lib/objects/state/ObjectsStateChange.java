package io.ably.lib.objects.state;

import io.ably.lib.objects.ObjectsSubscription;

/* loaded from: classes9.dex */
public interface ObjectsStateChange {

    public interface Listener {
        void onStateChanged(ObjectsStateEvent objectsStateEvent);
    }

    void off(Listener listener);

    void offAll();

    ObjectsSubscription on(ObjectsStateEvent objectsStateEvent, Listener listener);
}
