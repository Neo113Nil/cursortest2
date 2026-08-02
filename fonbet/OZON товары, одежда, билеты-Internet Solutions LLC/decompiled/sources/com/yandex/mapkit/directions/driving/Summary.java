package com.yandex.mapkit.directions.driving;

import androidx.annotation.NonNull;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class Summary implements Serializable {
    private Flags flags;
    private NonAvoidedFeatures nonAvoidedFeatures;
    private Weight weight;

    public Summary(@NonNull Weight weight, @NonNull Flags flags, @NonNull NonAvoidedFeatures nonAvoidedFeatures) {
        if (weight == null) {
            throw new IllegalArgumentException("Required field \"weight\" cannot be null");
        }
        if (flags == null) {
            throw new IllegalArgumentException("Required field \"flags\" cannot be null");
        }
        if (nonAvoidedFeatures == null) {
            throw new IllegalArgumentException("Required field \"nonAvoidedFeatures\" cannot be null");
        }
        this.weight = weight;
        this.flags = flags;
        this.nonAvoidedFeatures = nonAvoidedFeatures;
    }

    @NonNull
    public Flags getFlags() {
        return this.flags;
    }

    @NonNull
    public NonAvoidedFeatures getNonAvoidedFeatures() {
        return this.nonAvoidedFeatures;
    }

    @NonNull
    public Weight getWeight() {
        return this.weight;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.weight = (Weight) archive.add((Archive) this.weight, false, (Class<Archive>) Weight.class);
        this.flags = (Flags) archive.add((Archive) this.flags, false, (Class<Archive>) Flags.class);
        this.nonAvoidedFeatures = (NonAvoidedFeatures) archive.add((Archive) this.nonAvoidedFeatures, false, (Class<Archive>) NonAvoidedFeatures.class);
    }

    public Summary() {
    }
}
