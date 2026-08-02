package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class Wait implements Serializable {
    private int dummy;

    public Wait(int i11) {
        this.dummy = i11;
    }

    public int getDummy() {
        return this.dummy;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.dummy = archive.add(this.dummy);
    }

    public Wait() {
    }
}
