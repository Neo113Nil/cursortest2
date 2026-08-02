package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class Connector implements Serializable {
    private IndoorLevel from;
    private IndoorLevel to;

    public Connector(IndoorLevel indoorLevel, IndoorLevel indoorLevel2) {
        this.from = indoorLevel;
        this.to = indoorLevel2;
    }

    public IndoorLevel getFrom() {
        return this.from;
    }

    public IndoorLevel getTo() {
        return this.to;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.from = (IndoorLevel) archive.add((Archive) this.from, true, (Class<Archive>) IndoorLevel.class);
        this.to = (IndoorLevel) archive.add((Archive) this.to, true, (Class<Archive>) IndoorLevel.class);
    }

    public Connector() {
    }
}
