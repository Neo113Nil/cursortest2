package com.yandex.mapkit.location;

import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class LocationSettings implements Serializable {
    private Range accuracy;
    private boolean accuracy__is_initialized;
    private Range headingError;
    private boolean headingError__is_initialized;
    private LocationError locationError;
    private boolean locationError__is_initialized;
    private TimeInterval locationTimeInterval;
    private boolean locationTimeInterval__is_initialized;
    private NativeObject nativeObject;
    private boolean provideAccuracy;
    private boolean provideAccuracy__is_initialized;
    private boolean provideHeading;
    private boolean provideHeading__is_initialized;
    private boolean provideSpeed;
    private boolean provideSpeed__is_initialized;
    private boolean provideWheelSpeed;
    private boolean provideWheelSpeed__is_initialized;
    private double speed;
    private boolean speed__is_initialized;
    private TimeInterval wheelSpeedTimeInterval;
    private boolean wheelSpeedTimeInterval__is_initialized;

    public LocationSettings() {
        this.provideAccuracy__is_initialized = false;
        this.accuracy__is_initialized = false;
        this.locationTimeInterval__is_initialized = false;
        this.provideSpeed__is_initialized = false;
        this.speed__is_initialized = false;
        this.provideHeading__is_initialized = false;
        this.headingError__is_initialized = false;
        this.locationError__is_initialized = false;
        this.provideWheelSpeed__is_initialized = false;
        this.wheelSpeedTimeInterval__is_initialized = false;
    }

    private native Range getAccuracy__Native();

    private native Range getHeadingError__Native();

    private native LocationError getLocationError__Native();

    private native TimeInterval getLocationTimeInterval__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::location::LocationSettings";
    }

    private native boolean getProvideAccuracy__Native();

    private native boolean getProvideHeading__Native();

    private native boolean getProvideSpeed__Native();

    private native boolean getProvideWheelSpeed__Native();

    private native double getSpeed__Native();

    private native TimeInterval getWheelSpeedTimeInterval__Native();

    private native NativeObject init(boolean z11, Range range, TimeInterval timeInterval, boolean z12, double d11, boolean z13, Range range2, LocationError locationError, boolean z14, TimeInterval timeInterval2);

    public synchronized Range getAccuracy() {
        try {
            if (!this.accuracy__is_initialized) {
                this.accuracy = getAccuracy__Native();
                this.accuracy__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.accuracy;
    }

    public synchronized Range getHeadingError() {
        try {
            if (!this.headingError__is_initialized) {
                this.headingError = getHeadingError__Native();
                this.headingError__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.headingError;
    }

    @NonNull
    public synchronized LocationError getLocationError() {
        try {
            if (!this.locationError__is_initialized) {
                this.locationError = getLocationError__Native();
                this.locationError__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.locationError;
    }

    @NonNull
    public synchronized TimeInterval getLocationTimeInterval() {
        try {
            if (!this.locationTimeInterval__is_initialized) {
                this.locationTimeInterval = getLocationTimeInterval__Native();
                this.locationTimeInterval__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.locationTimeInterval;
    }

    public synchronized boolean getProvideAccuracy() {
        try {
            if (!this.provideAccuracy__is_initialized) {
                this.provideAccuracy = getProvideAccuracy__Native();
                this.provideAccuracy__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.provideAccuracy;
    }

    public synchronized boolean getProvideHeading() {
        try {
            if (!this.provideHeading__is_initialized) {
                this.provideHeading = getProvideHeading__Native();
                this.provideHeading__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.provideHeading;
    }

    public synchronized boolean getProvideSpeed() {
        try {
            if (!this.provideSpeed__is_initialized) {
                this.provideSpeed = getProvideSpeed__Native();
                this.provideSpeed__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.provideSpeed;
    }

    public synchronized boolean getProvideWheelSpeed() {
        try {
            if (!this.provideWheelSpeed__is_initialized) {
                this.provideWheelSpeed = getProvideWheelSpeed__Native();
                this.provideWheelSpeed__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.provideWheelSpeed;
    }

    public synchronized double getSpeed() {
        try {
            if (!this.speed__is_initialized) {
                this.speed = getSpeed__Native();
                this.speed__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.speed;
    }

    @NonNull
    public synchronized TimeInterval getWheelSpeedTimeInterval() {
        try {
            if (!this.wheelSpeedTimeInterval__is_initialized) {
                this.wheelSpeedTimeInterval = getWheelSpeedTimeInterval__Native();
                this.wheelSpeedTimeInterval__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.wheelSpeedTimeInterval;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getProvideAccuracy());
            archive.add((Archive) getAccuracy(), true, (Class<Archive>) Range.class);
            archive.add((Archive) getLocationTimeInterval(), false, (Class<Archive>) TimeInterval.class);
            archive.add(getProvideSpeed());
            archive.add(getSpeed());
            archive.add(getProvideHeading());
            archive.add((Archive) getHeadingError(), true, (Class<Archive>) Range.class);
            archive.add((Archive) getLocationError(), false, (Class<Archive>) LocationError.class);
            archive.add(getProvideWheelSpeed());
            archive.add((Archive) getWheelSpeedTimeInterval(), false, (Class<Archive>) TimeInterval.class);
            return;
        }
        this.provideAccuracy = archive.add(this.provideAccuracy);
        this.provideAccuracy__is_initialized = true;
        this.accuracy = (Range) archive.add((Archive) this.accuracy, true, (Class<Archive>) Range.class);
        this.accuracy__is_initialized = true;
        this.locationTimeInterval = (TimeInterval) archive.add((Archive) this.locationTimeInterval, false, (Class<Archive>) TimeInterval.class);
        this.locationTimeInterval__is_initialized = true;
        this.provideSpeed = archive.add(this.provideSpeed);
        this.provideSpeed__is_initialized = true;
        this.speed = archive.add(this.speed);
        this.speed__is_initialized = true;
        this.provideHeading = archive.add(this.provideHeading);
        this.provideHeading__is_initialized = true;
        this.headingError = (Range) archive.add((Archive) this.headingError, true, (Class<Archive>) Range.class);
        this.headingError__is_initialized = true;
        this.locationError = (LocationError) archive.add((Archive) this.locationError, false, (Class<Archive>) LocationError.class);
        this.locationError__is_initialized = true;
        this.provideWheelSpeed = archive.add(this.provideWheelSpeed);
        this.provideWheelSpeed__is_initialized = true;
        TimeInterval timeInterval = (TimeInterval) archive.add((Archive) this.wheelSpeedTimeInterval, false, (Class<Archive>) TimeInterval.class);
        this.wheelSpeedTimeInterval = timeInterval;
        this.wheelSpeedTimeInterval__is_initialized = true;
        this.nativeObject = init(this.provideAccuracy, this.accuracy, this.locationTimeInterval, this.provideSpeed, this.speed, this.provideHeading, this.headingError, this.locationError, this.provideWheelSpeed, timeInterval);
    }

    public LocationSettings(boolean z11, Range range, @NonNull TimeInterval timeInterval, boolean z12, double d11, boolean z13, Range range2, @NonNull LocationError locationError, boolean z14, @NonNull TimeInterval timeInterval2) {
        this.provideAccuracy__is_initialized = false;
        this.accuracy__is_initialized = false;
        this.locationTimeInterval__is_initialized = false;
        this.provideSpeed__is_initialized = false;
        this.speed__is_initialized = false;
        this.provideHeading__is_initialized = false;
        this.headingError__is_initialized = false;
        this.locationError__is_initialized = false;
        this.provideWheelSpeed__is_initialized = false;
        this.wheelSpeedTimeInterval__is_initialized = false;
        if (timeInterval == null) {
            throw new IllegalArgumentException("Required field \"locationTimeInterval\" cannot be null");
        }
        if (locationError == null) {
            throw new IllegalArgumentException("Required field \"locationError\" cannot be null");
        }
        if (timeInterval2 != null) {
            this.nativeObject = init(z11, range, timeInterval, z12, d11, z13, range2, locationError, z14, timeInterval2);
            this.provideAccuracy = z11;
            this.provideAccuracy__is_initialized = true;
            this.accuracy = range;
            this.accuracy__is_initialized = true;
            this.locationTimeInterval = timeInterval;
            this.locationTimeInterval__is_initialized = true;
            this.provideSpeed = z12;
            this.provideSpeed__is_initialized = true;
            this.speed = d11;
            this.speed__is_initialized = true;
            this.provideHeading = z13;
            this.provideHeading__is_initialized = true;
            this.headingError = range2;
            this.headingError__is_initialized = true;
            this.locationError = locationError;
            this.locationError__is_initialized = true;
            this.provideWheelSpeed = z14;
            this.provideWheelSpeed__is_initialized = true;
            this.wheelSpeedTimeInterval = timeInterval2;
            this.wheelSpeedTimeInterval__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"wheelSpeedTimeInterval\" cannot be null");
    }

    private LocationSettings(NativeObject nativeObject) {
        this.provideAccuracy__is_initialized = false;
        this.accuracy__is_initialized = false;
        this.locationTimeInterval__is_initialized = false;
        this.provideSpeed__is_initialized = false;
        this.speed__is_initialized = false;
        this.provideHeading__is_initialized = false;
        this.headingError__is_initialized = false;
        this.locationError__is_initialized = false;
        this.provideWheelSpeed__is_initialized = false;
        this.wheelSpeedTimeInterval__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
