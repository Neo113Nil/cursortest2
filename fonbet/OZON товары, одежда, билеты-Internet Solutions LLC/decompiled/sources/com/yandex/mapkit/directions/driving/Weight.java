package com.yandex.mapkit.directions.driving;

import androidx.annotation.NonNull;
import com.yandex.mapkit.LocalizedValue;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class Weight implements Serializable {
    private LocalizedValue distance;
    private LocalizedValue time;
    private LocalizedValue timeWithTraffic;

    public Weight(@NonNull LocalizedValue localizedValue, @NonNull LocalizedValue localizedValue2, @NonNull LocalizedValue localizedValue3) {
        if (localizedValue == null) {
            throw new IllegalArgumentException("Required field \"time\" cannot be null");
        }
        if (localizedValue2 == null) {
            throw new IllegalArgumentException("Required field \"timeWithTraffic\" cannot be null");
        }
        if (localizedValue3 == null) {
            throw new IllegalArgumentException("Required field \"distance\" cannot be null");
        }
        this.time = localizedValue;
        this.timeWithTraffic = localizedValue2;
        this.distance = localizedValue3;
    }

    @NonNull
    public LocalizedValue getDistance() {
        return this.distance;
    }

    @NonNull
    public LocalizedValue getTime() {
        return this.time;
    }

    @NonNull
    public LocalizedValue getTimeWithTraffic() {
        return this.timeWithTraffic;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.time = (LocalizedValue) archive.add((Archive) this.time, false, (Class<Archive>) LocalizedValue.class);
        this.timeWithTraffic = (LocalizedValue) archive.add((Archive) this.timeWithTraffic, false, (Class<Archive>) LocalizedValue.class);
        this.distance = (LocalizedValue) archive.add((Archive) this.distance, false, (Class<Archive>) LocalizedValue.class);
    }

    public Weight() {
    }
}
