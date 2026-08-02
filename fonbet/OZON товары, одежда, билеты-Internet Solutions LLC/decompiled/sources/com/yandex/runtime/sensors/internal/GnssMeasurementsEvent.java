package com.yandex.runtime.sensors.internal;

import B90.C2616s;
import F3.G;
import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class GnssMeasurementsEvent implements Serializable {
    private GnssClock clock;
    private boolean clock__is_initialized;
    private List<GnssMeasurement> measurements;
    private boolean measurements__is_initialized;
    private NativeObject nativeObject;

    public GnssMeasurementsEvent() {
        this.clock__is_initialized = false;
        this.measurements__is_initialized = false;
    }

    private native GnssClock getClock__Native();

    private native List<GnssMeasurement> getMeasurements__Native();

    public static String getNativeName() {
        return "yandex::maps::runtime::sensors::internal::GnssMeasurementsEvent";
    }

    private native NativeObject init(GnssClock gnssClock, List<GnssMeasurement> list);

    @NonNull
    public synchronized GnssClock getClock() {
        try {
            if (!this.clock__is_initialized) {
                this.clock = getClock__Native();
                this.clock__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.clock;
    }

    @NonNull
    public synchronized List<GnssMeasurement> getMeasurements() {
        try {
            if (!this.measurements__is_initialized) {
                this.measurements = getMeasurements__Native();
                this.measurements__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.measurements;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getClock(), false, (Class<Archive>) GnssClock.class);
            C2616s.f(GnssMeasurement.class, archive, getMeasurements(), false);
            return;
        }
        this.clock = (GnssClock) archive.add((Archive) this.clock, false, (Class<Archive>) GnssClock.class);
        this.clock__is_initialized = true;
        List<GnssMeasurement> d11 = G.d(GnssMeasurement.class, archive, this.measurements, false);
        this.measurements = d11;
        this.measurements__is_initialized = true;
        this.nativeObject = init(this.clock, d11);
    }

    public GnssMeasurementsEvent(@NonNull GnssClock gnssClock, @NonNull List<GnssMeasurement> list) {
        this.clock__is_initialized = false;
        this.measurements__is_initialized = false;
        if (gnssClock == null) {
            throw new IllegalArgumentException("Required field \"clock\" cannot be null");
        }
        if (list != null) {
            this.nativeObject = init(gnssClock, list);
            this.clock = gnssClock;
            this.clock__is_initialized = true;
            this.measurements = list;
            this.measurements__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"measurements\" cannot be null");
    }

    private GnssMeasurementsEvent(NativeObject nativeObject) {
        this.clock__is_initialized = false;
        this.measurements__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
