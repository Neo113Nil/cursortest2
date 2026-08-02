package io.ably.lib.objects.type.counter;

import io.ably.lib.objects.ObjectsCallback;
import io.ably.lib.objects.type.ObjectLifecycleChange;

/* loaded from: classes9.dex */
public interface LiveCounter extends LiveCounterChange, ObjectLifecycleChange {
    void decrement(Number number);

    void decrementAsync(Number number, ObjectsCallback<Void> objectsCallback);

    void increment(Number number);

    void incrementAsync(Number number, ObjectsCallback<Void> objectsCallback);

    Double value();
}
