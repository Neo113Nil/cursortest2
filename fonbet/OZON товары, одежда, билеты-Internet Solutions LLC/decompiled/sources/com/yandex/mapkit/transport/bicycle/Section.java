package com.yandex.mapkit.transport.bicycle;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class Section implements Serializable {
    private Subpolyline geometry;
    private boolean geometry__is_initialized;
    private NativeObject nativeObject;
    private Weight weight;
    private boolean weight__is_initialized;

    public Section() {
        this.weight__is_initialized = false;
        this.geometry__is_initialized = false;
    }

    private native Subpolyline getGeometry__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::bicycle::Section";
    }

    private native Weight getWeight__Native();

    private native NativeObject init(Weight weight, Subpolyline subpolyline);

    @NonNull
    public synchronized Subpolyline getGeometry() {
        try {
            if (!this.geometry__is_initialized) {
                this.geometry = getGeometry__Native();
                this.geometry__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.geometry;
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
            archive.add((Archive) getGeometry(), false, (Class<Archive>) Subpolyline.class);
            return;
        }
        this.weight = (Weight) archive.add((Archive) this.weight, false, (Class<Archive>) Weight.class);
        this.weight__is_initialized = true;
        Subpolyline subpolyline = (Subpolyline) archive.add((Archive) this.geometry, false, (Class<Archive>) Subpolyline.class);
        this.geometry = subpolyline;
        this.geometry__is_initialized = true;
        this.nativeObject = init(this.weight, subpolyline);
    }

    public Section(@NonNull Weight weight, @NonNull Subpolyline subpolyline) {
        this.weight__is_initialized = false;
        this.geometry__is_initialized = false;
        if (weight == null) {
            throw new IllegalArgumentException("Required field \"weight\" cannot be null");
        }
        if (subpolyline != null) {
            this.nativeObject = init(weight, subpolyline);
            this.weight = weight;
            this.weight__is_initialized = true;
            this.geometry = subpolyline;
            this.geometry__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"geometry\" cannot be null");
    }

    private Section(NativeObject nativeObject) {
        this.weight__is_initialized = false;
        this.geometry__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
