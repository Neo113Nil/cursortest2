package com.yandex.mapkit;

import B90.C2616s;
import F3.G;
import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.TypeDictionary;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class GeoObjectCollection implements Serializable {
    private BoundingBox boundingBox;
    private boolean boundingBox__is_initialized;
    private List<Item> children;
    private boolean children__is_initialized;
    private TypeDictionary<BaseMetadata> metadataContainer;
    private boolean metadataContainer__is_initialized;
    private NativeObject nativeObject;

    public static class Item implements Serializable {
        private GeoObjectCollection collection;
        private GeoObject obj;

        @NonNull
        public static Item fromCollection(@NonNull GeoObjectCollection geoObjectCollection) {
            if (geoObjectCollection == null) {
                throw new IllegalArgumentException("Variant value \"collection\" cannot be null");
            }
            Item item = new Item();
            item.collection = geoObjectCollection;
            return item;
        }

        @NonNull
        public static Item fromObj(@NonNull GeoObject geoObject) {
            if (geoObject == null) {
                throw new IllegalArgumentException("Variant value \"obj\" cannot be null");
            }
            Item item = new Item();
            item.obj = geoObject;
            return item;
        }

        public GeoObjectCollection getCollection() {
            return this.collection;
        }

        public GeoObject getObj() {
            return this.obj;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.obj = (GeoObject) archive.add((Archive) this.obj, true, (Class<Archive>) GeoObject.class);
            this.collection = (GeoObjectCollection) archive.add((Archive) this.collection, true, (Class<Archive>) GeoObjectCollection.class);
        }
    }

    public GeoObjectCollection() {
        this.boundingBox__is_initialized = false;
        this.metadataContainer__is_initialized = false;
        this.children__is_initialized = false;
    }

    private native BoundingBox getBoundingBox__Native();

    private native List<Item> getChildren__Native();

    private native TypeDictionary<BaseMetadata> getMetadataContainer__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::GeoObjectCollection";
    }

    private native NativeObject init(BoundingBox boundingBox, TypeDictionary<BaseMetadata> typeDictionary, List<Item> list);

    public synchronized BoundingBox getBoundingBox() {
        try {
            if (!this.boundingBox__is_initialized) {
                this.boundingBox = getBoundingBox__Native();
                this.boundingBox__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.boundingBox;
    }

    @NonNull
    public synchronized List<Item> getChildren() {
        try {
            if (!this.children__is_initialized) {
                this.children = getChildren__Native();
                this.children__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.children;
    }

    @NonNull
    public synchronized TypeDictionary<BaseMetadata> getMetadataContainer() {
        try {
            if (!this.metadataContainer__is_initialized) {
                this.metadataContainer = getMetadataContainer__Native();
                this.metadataContainer__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.metadataContainer;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getBoundingBox(), true, (Class<Archive>) BoundingBox.class);
            archive.add((TypeDictionary) getMetadataContainer(), false, (ArchivingHandler) new ClassHandler(BaseMetadata.class));
            C2616s.f(Item.class, archive, getChildren(), false);
            return;
        }
        this.boundingBox = (BoundingBox) archive.add((Archive) this.boundingBox, true, (Class<Archive>) BoundingBox.class);
        this.boundingBox__is_initialized = true;
        this.metadataContainer = archive.add((TypeDictionary) this.metadataContainer, false, (ArchivingHandler) new ClassHandler(BaseMetadata.class));
        this.metadataContainer__is_initialized = true;
        List<Item> d11 = G.d(Item.class, archive, this.children, false);
        this.children = d11;
        this.children__is_initialized = true;
        this.nativeObject = init(this.boundingBox, this.metadataContainer, d11);
    }

    public GeoObjectCollection(BoundingBox boundingBox, @NonNull TypeDictionary<BaseMetadata> typeDictionary, @NonNull List<Item> list) {
        this.boundingBox__is_initialized = false;
        this.metadataContainer__is_initialized = false;
        this.children__is_initialized = false;
        if (typeDictionary == null) {
            throw new IllegalArgumentException("Required field \"metadataContainer\" cannot be null");
        }
        if (list != null) {
            this.nativeObject = init(boundingBox, typeDictionary, list);
            this.boundingBox = boundingBox;
            this.boundingBox__is_initialized = true;
            this.metadataContainer = typeDictionary;
            this.metadataContainer__is_initialized = true;
            this.children = list;
            this.children__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"children\" cannot be null");
    }

    private GeoObjectCollection(NativeObject nativeObject) {
        this.boundingBox__is_initialized = false;
        this.metadataContainer__is_initialized = false;
        this.children__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
