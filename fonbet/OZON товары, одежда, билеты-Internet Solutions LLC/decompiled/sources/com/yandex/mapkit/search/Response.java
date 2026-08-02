package com.yandex.mapkit.search;

import androidx.annotation.NonNull;
import com.yandex.mapkit.GeoObjectCollection;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class Response implements Serializable {
    private GeoObjectCollection collection;
    private boolean collection__is_initialized;
    private boolean isOffline;
    private boolean isOffline__is_initialized;
    private SearchMetadata metadata;
    private boolean metadata__is_initialized;
    private NativeObject nativeObject;

    public Response() {
        this.metadata__is_initialized = false;
        this.collection__is_initialized = false;
        this.isOffline__is_initialized = false;
    }

    private native GeoObjectCollection getCollection__Native();

    private native boolean getIsOffline__Native();

    private native SearchMetadata getMetadata__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::Response";
    }

    private native NativeObject init(SearchMetadata searchMetadata, GeoObjectCollection geoObjectCollection, boolean z11);

    @NonNull
    public synchronized GeoObjectCollection getCollection() {
        try {
            if (!this.collection__is_initialized) {
                this.collection = getCollection__Native();
                this.collection__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.collection;
    }

    public synchronized boolean getIsOffline() {
        try {
            if (!this.isOffline__is_initialized) {
                this.isOffline = getIsOffline__Native();
                this.isOffline__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.isOffline;
    }

    @NonNull
    public synchronized SearchMetadata getMetadata() {
        try {
            if (!this.metadata__is_initialized) {
                this.metadata = getMetadata__Native();
                this.metadata__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.metadata;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getMetadata(), false, (Class<Archive>) SearchMetadata.class);
            archive.add((Archive) getCollection(), false, (Class<Archive>) GeoObjectCollection.class);
            archive.add(getIsOffline());
            return;
        }
        this.metadata = (SearchMetadata) archive.add((Archive) this.metadata, false, (Class<Archive>) SearchMetadata.class);
        this.metadata__is_initialized = true;
        this.collection = (GeoObjectCollection) archive.add((Archive) this.collection, false, (Class<Archive>) GeoObjectCollection.class);
        this.collection__is_initialized = true;
        boolean add = archive.add(this.isOffline);
        this.isOffline = add;
        this.isOffline__is_initialized = true;
        this.nativeObject = init(this.metadata, this.collection, add);
    }

    public Response(@NonNull SearchMetadata searchMetadata, @NonNull GeoObjectCollection geoObjectCollection, boolean z11) {
        this.metadata__is_initialized = false;
        this.collection__is_initialized = false;
        this.isOffline__is_initialized = false;
        if (searchMetadata == null) {
            throw new IllegalArgumentException("Required field \"metadata\" cannot be null");
        }
        if (geoObjectCollection != null) {
            this.nativeObject = init(searchMetadata, geoObjectCollection, z11);
            this.metadata = searchMetadata;
            this.metadata__is_initialized = true;
            this.collection = geoObjectCollection;
            this.collection__is_initialized = true;
            this.isOffline = z11;
            this.isOffline__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"collection\" cannot be null");
    }

    private Response(NativeObject nativeObject) {
        this.metadata__is_initialized = false;
        this.collection__is_initialized = false;
        this.isOffline__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
