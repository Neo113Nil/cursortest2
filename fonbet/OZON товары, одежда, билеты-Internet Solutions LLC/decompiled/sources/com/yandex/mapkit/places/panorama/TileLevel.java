package com.yandex.mapkit.places.panorama;

import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class TileLevel implements Serializable {
    private ImageSize imageSize;
    private boolean imageSize__is_initialized;
    private int level;
    private boolean level__is_initialized;
    private NativeObject nativeObject;

    public TileLevel() {
        this.level__is_initialized = false;
        this.imageSize__is_initialized = false;
    }

    private native ImageSize getImageSize__Native();

    private native int getLevel__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::places::panorama::TileLevel";
    }

    private native NativeObject init(int i11, ImageSize imageSize);

    @NonNull
    public synchronized ImageSize getImageSize() {
        try {
            if (!this.imageSize__is_initialized) {
                this.imageSize = getImageSize__Native();
                this.imageSize__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.imageSize;
    }

    public synchronized int getLevel() {
        try {
            if (!this.level__is_initialized) {
                this.level = getLevel__Native();
                this.level__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.level;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getLevel());
            archive.add((Archive) getImageSize(), false, (Class<Archive>) ImageSize.class);
            return;
        }
        this.level = archive.add(this.level);
        this.level__is_initialized = true;
        ImageSize imageSize = (ImageSize) archive.add((Archive) this.imageSize, false, (Class<Archive>) ImageSize.class);
        this.imageSize = imageSize;
        this.imageSize__is_initialized = true;
        this.nativeObject = init(this.level, imageSize);
    }

    public TileLevel(int i11, @NonNull ImageSize imageSize) {
        this.level__is_initialized = false;
        this.imageSize__is_initialized = false;
        if (imageSize != null) {
            this.nativeObject = init(i11, imageSize);
            this.level = i11;
            this.level__is_initialized = true;
            this.imageSize = imageSize;
            this.imageSize__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"imageSize\" cannot be null");
    }

    private TileLevel(NativeObject nativeObject) {
        this.level__is_initialized = false;
        this.imageSize__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
