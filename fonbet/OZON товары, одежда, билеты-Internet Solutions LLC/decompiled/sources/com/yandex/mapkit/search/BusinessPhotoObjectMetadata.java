package com.yandex.mapkit.search;

import B90.C2616s;
import F3.G;
import androidx.annotation.NonNull;
import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class BusinessPhotoObjectMetadata implements BaseMetadata, Serializable {
    private int count;
    private boolean count__is_initialized;
    private NativeObject nativeObject;
    private List<Photo> photos;
    private boolean photos__is_initialized;

    public BusinessPhotoObjectMetadata() {
        this.count__is_initialized = false;
        this.photos__is_initialized = false;
    }

    private native int getCount__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::BusinessPhotoObjectMetadata";
    }

    private native List<Photo> getPhotos__Native();

    private native NativeObject init(int i11, List<Photo> list);

    public synchronized int getCount() {
        try {
            if (!this.count__is_initialized) {
                this.count = getCount__Native();
                this.count__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.count;
    }

    @NonNull
    public synchronized List<Photo> getPhotos() {
        try {
            if (!this.photos__is_initialized) {
                this.photos = getPhotos__Native();
                this.photos__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.photos;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getCount());
            C2616s.f(Photo.class, archive, getPhotos(), false);
            return;
        }
        this.count = archive.add(this.count);
        this.count__is_initialized = true;
        List<Photo> d11 = G.d(Photo.class, archive, this.photos, false);
        this.photos = d11;
        this.photos__is_initialized = true;
        this.nativeObject = init(this.count, d11);
    }

    public static class Photo implements Serializable {

        /* renamed from: id, reason: collision with root package name */
        private String f60738id;
        private boolean id__is_initialized;
        private List<PhotoLink> links;
        private boolean links__is_initialized;
        private NativeObject nativeObject;

        public Photo() {
            this.id__is_initialized = false;
            this.links__is_initialized = false;
        }

        private native String getId__Native();

        private native List<PhotoLink> getLinks__Native();

        public static String getNativeName() {
            return "yandex::maps::mapkit::search::BusinessPhotoObjectMetadata::Photo";
        }

        private native NativeObject init(String str, List<PhotoLink> list);

        @NonNull
        public synchronized String getId() {
            try {
                if (!this.id__is_initialized) {
                    this.f60738id = getId__Native();
                    this.id__is_initialized = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.f60738id;
        }

        @NonNull
        public synchronized List<PhotoLink> getLinks() {
            try {
                if (!this.links__is_initialized) {
                    this.links = getLinks__Native();
                    this.links__is_initialized = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.links;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            if (!archive.isReader()) {
                archive.add(getId(), false);
                C2616s.f(PhotoLink.class, archive, getLinks(), false);
                return;
            }
            this.f60738id = archive.add(this.f60738id, false);
            this.id__is_initialized = true;
            List<PhotoLink> d11 = G.d(PhotoLink.class, archive, this.links, false);
            this.links = d11;
            this.links__is_initialized = true;
            this.nativeObject = init(this.f60738id, d11);
        }

        public static class PhotoLink implements Serializable {
            private NativeObject nativeObject;
            private String type;
            private boolean type__is_initialized;
            private String uri;
            private boolean uri__is_initialized;

            public PhotoLink() {
                this.type__is_initialized = false;
                this.uri__is_initialized = false;
            }

            public static String getNativeName() {
                return "yandex::maps::mapkit::search::BusinessPhotoObjectMetadata::Photo::PhotoLink";
            }

            private native String getType__Native();

            private native String getUri__Native();

            private native NativeObject init(String str, String str2);

            public synchronized String getType() {
                try {
                    if (!this.type__is_initialized) {
                        this.type = getType__Native();
                        this.type__is_initialized = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
                return this.type;
            }

            @NonNull
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

            @Override // com.yandex.runtime.bindings.Serializable
            public void serialize(Archive archive) {
                if (!archive.isReader()) {
                    archive.add(getType(), true);
                    archive.add(getUri(), false);
                    return;
                }
                this.type = archive.add(this.type, true);
                this.type__is_initialized = true;
                String add = archive.add(this.uri, false);
                this.uri = add;
                this.uri__is_initialized = true;
                this.nativeObject = init(this.type, add);
            }

            public PhotoLink(String str, @NonNull String str2) {
                this.type__is_initialized = false;
                this.uri__is_initialized = false;
                if (str2 != null) {
                    this.nativeObject = init(str, str2);
                    this.type = str;
                    this.type__is_initialized = true;
                    this.uri = str2;
                    this.uri__is_initialized = true;
                    return;
                }
                throw new IllegalArgumentException("Required field \"uri\" cannot be null");
            }

            private PhotoLink(NativeObject nativeObject) {
                this.type__is_initialized = false;
                this.uri__is_initialized = false;
                this.nativeObject = nativeObject;
            }
        }

        public Photo(@NonNull String str, @NonNull List<PhotoLink> list) {
            this.id__is_initialized = false;
            this.links__is_initialized = false;
            if (str == null) {
                throw new IllegalArgumentException("Required field \"id\" cannot be null");
            }
            if (list != null) {
                this.nativeObject = init(str, list);
                this.f60738id = str;
                this.id__is_initialized = true;
                this.links = list;
                this.links__is_initialized = true;
                return;
            }
            throw new IllegalArgumentException("Required field \"links\" cannot be null");
        }

        private Photo(NativeObject nativeObject) {
            this.id__is_initialized = false;
            this.links__is_initialized = false;
            this.nativeObject = nativeObject;
        }
    }

    public BusinessPhotoObjectMetadata(int i11, @NonNull List<Photo> list) {
        this.count__is_initialized = false;
        this.photos__is_initialized = false;
        if (list != null) {
            this.nativeObject = init(i11, list);
            this.count = i11;
            this.count__is_initialized = true;
            this.photos = list;
            this.photos__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"photos\" cannot be null");
    }

    private BusinessPhotoObjectMetadata(NativeObject nativeObject) {
        this.count__is_initialized = false;
        this.photos__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
