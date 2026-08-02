package com.yandex.mapkit.transport.masstransit;

import B90.C2616s;
import F3.G;
import androidx.annotation.NonNull;
import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class Stop implements BaseMetadata, Serializable {
    private String additionalName;
    private boolean additionalName__is_initialized;
    private StopFeatureMask features;
    private boolean features__is_initialized;

    /* renamed from: id, reason: collision with root package name */
    private String f60748id;
    private boolean id__is_initialized;
    private String name;
    private boolean name__is_initialized;
    private NativeObject nativeObject;
    private List<TransportContour> transportContours;
    private boolean transportContours__is_initialized;

    public Stop() {
        this.id__is_initialized = false;
        this.name__is_initialized = false;
        this.additionalName__is_initialized = false;
        this.features__is_initialized = false;
        this.transportContours__is_initialized = false;
    }

    private native String getAdditionalName__Native();

    private native StopFeatureMask getFeatures__Native();

    private native String getId__Native();

    private native String getName__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::Stop";
    }

    private native List<TransportContour> getTransportContours__Native();

    private native NativeObject init(String str, String str2, String str3, StopFeatureMask stopFeatureMask, List<TransportContour> list);

    public synchronized String getAdditionalName() {
        try {
            if (!this.additionalName__is_initialized) {
                this.additionalName = getAdditionalName__Native();
                this.additionalName__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.additionalName;
    }

    public synchronized StopFeatureMask getFeatures() {
        try {
            if (!this.features__is_initialized) {
                this.features = getFeatures__Native();
                this.features__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.features;
    }

    @NonNull
    public synchronized String getId() {
        try {
            if (!this.id__is_initialized) {
                this.f60748id = getId__Native();
                this.id__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f60748id;
    }

    @NonNull
    public synchronized String getName() {
        try {
            if (!this.name__is_initialized) {
                this.name = getName__Native();
                this.name__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.name;
    }

    @NonNull
    public synchronized List<TransportContour> getTransportContours() {
        try {
            if (!this.transportContours__is_initialized) {
                this.transportContours = getTransportContours__Native();
                this.transportContours__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.transportContours;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getId(), false);
            archive.add(getName(), false);
            archive.add(getAdditionalName(), true);
            archive.add((Archive) getFeatures(), true, (Class<Archive>) StopFeatureMask.class);
            C2616s.f(TransportContour.class, archive, getTransportContours(), false);
            return;
        }
        this.f60748id = archive.add(this.f60748id, false);
        this.id__is_initialized = true;
        this.name = archive.add(this.name, false);
        this.name__is_initialized = true;
        this.additionalName = archive.add(this.additionalName, true);
        this.additionalName__is_initialized = true;
        this.features = (StopFeatureMask) archive.add((Archive) this.features, true, (Class<Archive>) StopFeatureMask.class);
        this.features__is_initialized = true;
        List<TransportContour> d11 = G.d(TransportContour.class, archive, this.transportContours, false);
        this.transportContours = d11;
        this.transportContours__is_initialized = true;
        this.nativeObject = init(this.f60748id, this.name, this.additionalName, this.features, d11);
    }

    public Stop(@NonNull String str, @NonNull String str2, String str3, StopFeatureMask stopFeatureMask, @NonNull List<TransportContour> list) {
        this.id__is_initialized = false;
        this.name__is_initialized = false;
        this.additionalName__is_initialized = false;
        this.features__is_initialized = false;
        this.transportContours__is_initialized = false;
        if (str == null) {
            throw new IllegalArgumentException("Required field \"id\" cannot be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Required field \"name\" cannot be null");
        }
        if (list != null) {
            this.nativeObject = init(str, str2, str3, stopFeatureMask, list);
            this.f60748id = str;
            this.id__is_initialized = true;
            this.name = str2;
            this.name__is_initialized = true;
            this.additionalName = str3;
            this.additionalName__is_initialized = true;
            this.features = stopFeatureMask;
            this.features__is_initialized = true;
            this.transportContours = list;
            this.transportContours__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"transportContours\" cannot be null");
    }

    private Stop(NativeObject nativeObject) {
        this.id__is_initialized = false;
        this.name__is_initialized = false;
        this.additionalName__is_initialized = false;
        this.features__is_initialized = false;
        this.transportContours__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
