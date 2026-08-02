package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class Flags implements Serializable {
    private boolean hasAutoRoad;
    private boolean requiresAccessPass;

    public Flags(boolean z11, boolean z12) {
        this.requiresAccessPass = z11;
        this.hasAutoRoad = z12;
    }

    public boolean getHasAutoRoad() {
        return this.hasAutoRoad;
    }

    public boolean getRequiresAccessPass() {
        return this.requiresAccessPass;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.requiresAccessPass = archive.add(this.requiresAccessPass);
        this.hasAutoRoad = archive.add(this.hasAutoRoad);
    }

    public Flags() {
    }
}
