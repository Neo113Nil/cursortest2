package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public final class TimeOptions implements Serializable {
    private Long arrivalTime;
    private Long departureTime;

    public TimeOptions(Long l11, Long l12) {
        this.departureTime = l11;
        this.arrivalTime = l12;
    }

    public Long getArrivalTime() {
        return this.arrivalTime;
    }

    public Long getDepartureTime() {
        return this.departureTime;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.departureTime = archive.add(this.departureTime, true);
        this.arrivalTime = archive.add(this.arrivalTime, true);
    }

    public TimeOptions setArrivalTime(Long l11) {
        this.arrivalTime = l11;
        return this;
    }

    public TimeOptions setDepartureTime(Long l11) {
        this.departureTime = l11;
        return this;
    }

    public TimeOptions() {
        this.departureTime = null;
        this.arrivalTime = null;
    }
}
