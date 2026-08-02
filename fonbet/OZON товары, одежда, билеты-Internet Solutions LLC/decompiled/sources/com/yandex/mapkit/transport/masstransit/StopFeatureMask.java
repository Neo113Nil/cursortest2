package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class StopFeatureMask implements Serializable {
    private boolean cooled;
    private boolean heated;

    public StopFeatureMask(boolean z11, boolean z12) {
        this.cooled = z11;
        this.heated = z12;
    }

    public boolean getCooled() {
        return this.cooled;
    }

    public boolean getHeated() {
        return this.heated;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.cooled = archive.add(this.cooled);
        this.heated = archive.add(this.heated);
    }

    public StopFeatureMask() {
    }
}
