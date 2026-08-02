package com.yandex.mapkit.location;

import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class LocationError implements Serializable {
    private Range lateralErrorRange;
    private boolean lateralErrorRange__is_initialized;
    private Range longitudinalErrorRange;
    private boolean longitudinalErrorRange__is_initialized;
    private NativeObject nativeObject;

    public LocationError() {
        this.lateralErrorRange__is_initialized = false;
        this.longitudinalErrorRange__is_initialized = false;
    }

    private native Range getLateralErrorRange__Native();

    private native Range getLongitudinalErrorRange__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::location::LocationError";
    }

    private native NativeObject init(Range range, Range range2);

    @NonNull
    public synchronized Range getLateralErrorRange() {
        try {
            if (!this.lateralErrorRange__is_initialized) {
                this.lateralErrorRange = getLateralErrorRange__Native();
                this.lateralErrorRange__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.lateralErrorRange;
    }

    @NonNull
    public synchronized Range getLongitudinalErrorRange() {
        try {
            if (!this.longitudinalErrorRange__is_initialized) {
                this.longitudinalErrorRange = getLongitudinalErrorRange__Native();
                this.longitudinalErrorRange__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.longitudinalErrorRange;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getLateralErrorRange(), false, (Class<Archive>) Range.class);
            archive.add((Archive) getLongitudinalErrorRange(), false, (Class<Archive>) Range.class);
            return;
        }
        this.lateralErrorRange = (Range) archive.add((Archive) this.lateralErrorRange, false, (Class<Archive>) Range.class);
        this.lateralErrorRange__is_initialized = true;
        Range range = (Range) archive.add((Archive) this.longitudinalErrorRange, false, (Class<Archive>) Range.class);
        this.longitudinalErrorRange = range;
        this.longitudinalErrorRange__is_initialized = true;
        this.nativeObject = init(this.lateralErrorRange, range);
    }

    public LocationError(@NonNull Range range, @NonNull Range range2) {
        this.lateralErrorRange__is_initialized = false;
        this.longitudinalErrorRange__is_initialized = false;
        if (range == null) {
            throw new IllegalArgumentException("Required field \"lateralErrorRange\" cannot be null");
        }
        if (range2 != null) {
            this.nativeObject = init(range, range2);
            this.lateralErrorRange = range;
            this.lateralErrorRange__is_initialized = true;
            this.longitudinalErrorRange = range2;
            this.longitudinalErrorRange__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"longitudinalErrorRange\" cannot be null");
    }

    private LocationError(NativeObject nativeObject) {
        this.lateralErrorRange__is_initialized = false;
        this.longitudinalErrorRange__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
