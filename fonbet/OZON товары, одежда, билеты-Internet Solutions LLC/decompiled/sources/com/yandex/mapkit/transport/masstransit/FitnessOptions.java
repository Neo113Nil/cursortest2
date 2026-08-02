package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class FitnessOptions implements Serializable {
    private boolean avoidStairs;
    private boolean avoidSteep;

    public FitnessOptions(boolean z11, boolean z12) {
        this.avoidSteep = z11;
        this.avoidStairs = z12;
    }

    public boolean getAvoidStairs() {
        return this.avoidStairs;
    }

    public boolean getAvoidSteep() {
        return this.avoidSteep;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.avoidSteep = archive.add(this.avoidSteep);
        this.avoidStairs = archive.add(this.avoidStairs);
    }

    public FitnessOptions() {
        this.avoidSteep = false;
        this.avoidStairs = false;
    }
}
