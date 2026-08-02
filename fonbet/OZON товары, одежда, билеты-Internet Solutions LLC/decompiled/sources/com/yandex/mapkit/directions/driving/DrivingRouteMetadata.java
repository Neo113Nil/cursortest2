package com.yandex.mapkit.directions.driving;

import F3.G;
import androidx.annotation.NonNull;
import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class DrivingRouteMetadata implements BaseMetadata, Serializable {
    private Flags flags;
    private boolean flags__is_initialized;
    private NativeObject nativeObject;
    private NonAvoidedFeatures nonAvoidedFeatures;
    private boolean nonAvoidedFeatures__is_initialized;
    private List<RoutePoint> routePoints;
    private boolean routePoints__is_initialized;
    private String uri;
    private boolean uri__is_initialized;
    private Weight weight;
    private boolean weight__is_initialized;

    public DrivingRouteMetadata() {
        this.weight__is_initialized = false;
        this.flags__is_initialized = false;
        this.routePoints__is_initialized = false;
        this.uri__is_initialized = false;
        this.nonAvoidedFeatures__is_initialized = false;
    }

    private native Flags getFlags__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::RouteMetadata";
    }

    private native NonAvoidedFeatures getNonAvoidedFeatures__Native();

    private native List<RoutePoint> getRoutePoints__Native();

    private native String getUri__Native();

    private native Weight getWeight__Native();

    private native NativeObject init(Weight weight, Flags flags, List<RoutePoint> list, String str, NonAvoidedFeatures nonAvoidedFeatures);

    @NonNull
    public synchronized Flags getFlags() {
        try {
            if (!this.flags__is_initialized) {
                this.flags = getFlags__Native();
                this.flags__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.flags;
    }

    public synchronized NonAvoidedFeatures getNonAvoidedFeatures() {
        try {
            if (!this.nonAvoidedFeatures__is_initialized) {
                this.nonAvoidedFeatures = getNonAvoidedFeatures__Native();
                this.nonAvoidedFeatures__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.nonAvoidedFeatures;
    }

    @NonNull
    public synchronized List<RoutePoint> getRoutePoints() {
        try {
            if (!this.routePoints__is_initialized) {
                this.routePoints = getRoutePoints__Native();
                this.routePoints__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.routePoints;
    }

    public synchronized String getUri() {
        try {
            if (!this.uri__is_initialized) {
                this.uri = getUri__Native();
                this.uri__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.uri;
    }

    @NonNull
    public synchronized Weight getWeight() {
        try {
            if (!this.weight__is_initialized) {
                this.weight = getWeight__Native();
                this.weight__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.weight;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getWeight(), false, (Class<Archive>) Weight.class);
            archive.add((Archive) getFlags(), false, (Class<Archive>) Flags.class);
            archive.add((List) getRoutePoints(), false, (ArchivingHandler) new ClassHandler(RoutePoint.class));
            archive.add(getUri(), true);
            archive.add((Archive) getNonAvoidedFeatures(), true, (Class<Archive>) NonAvoidedFeatures.class);
            return;
        }
        this.weight = (Weight) archive.add((Archive) this.weight, false, (Class<Archive>) Weight.class);
        this.weight__is_initialized = true;
        this.flags = (Flags) archive.add((Archive) this.flags, false, (Class<Archive>) Flags.class);
        this.flags__is_initialized = true;
        this.routePoints = G.d(RoutePoint.class, archive, this.routePoints, false);
        this.routePoints__is_initialized = true;
        this.uri = archive.add(this.uri, true);
        this.uri__is_initialized = true;
        NonAvoidedFeatures nonAvoidedFeatures = (NonAvoidedFeatures) archive.add((Archive) this.nonAvoidedFeatures, true, (Class<Archive>) NonAvoidedFeatures.class);
        this.nonAvoidedFeatures = nonAvoidedFeatures;
        this.nonAvoidedFeatures__is_initialized = true;
        this.nativeObject = init(this.weight, this.flags, this.routePoints, this.uri, nonAvoidedFeatures);
    }

    public DrivingRouteMetadata(@NonNull Weight weight, @NonNull Flags flags, @NonNull List<RoutePoint> list, String str, NonAvoidedFeatures nonAvoidedFeatures) {
        this.weight__is_initialized = false;
        this.flags__is_initialized = false;
        this.routePoints__is_initialized = false;
        this.uri__is_initialized = false;
        this.nonAvoidedFeatures__is_initialized = false;
        if (weight == null) {
            throw new IllegalArgumentException("Required field \"weight\" cannot be null");
        }
        if (flags == null) {
            throw new IllegalArgumentException("Required field \"flags\" cannot be null");
        }
        if (list != null) {
            this.nativeObject = init(weight, flags, list, str, nonAvoidedFeatures);
            this.weight = weight;
            this.weight__is_initialized = true;
            this.flags = flags;
            this.flags__is_initialized = true;
            this.routePoints = list;
            this.routePoints__is_initialized = true;
            this.uri = str;
            this.uri__is_initialized = true;
            this.nonAvoidedFeatures = nonAvoidedFeatures;
            this.nonAvoidedFeatures__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"routePoints\" cannot be null");
    }

    private DrivingRouteMetadata(NativeObject nativeObject) {
        this.weight__is_initialized = false;
        this.flags__is_initialized = false;
        this.routePoints__is_initialized = false;
        this.uri__is_initialized = false;
        this.nonAvoidedFeatures__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
