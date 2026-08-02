package com.yandex.mapkit.location;

import androidx.annotation.NonNull;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class SubscriptionSettings implements Serializable {
    private Purpose purpose;
    private UseInBackground useInBackground;

    public SubscriptionSettings(@NonNull UseInBackground useInBackground, @NonNull Purpose purpose) {
        if (useInBackground == null) {
            throw new IllegalArgumentException("Required field \"useInBackground\" cannot be null");
        }
        if (purpose == null) {
            throw new IllegalArgumentException("Required field \"purpose\" cannot be null");
        }
        this.useInBackground = useInBackground;
        this.purpose = purpose;
    }

    @NonNull
    public Purpose getPurpose() {
        return this.purpose;
    }

    @NonNull
    public UseInBackground getUseInBackground() {
        return this.useInBackground;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.useInBackground = (UseInBackground) archive.add((Archive) this.useInBackground, false, (Class<Archive>) UseInBackground.class);
        this.purpose = (Purpose) archive.add((Archive) this.purpose, false, (Class<Archive>) Purpose.class);
    }

    public SubscriptionSettings() {
    }
}
