package com.yandex.mapkit.places.panorama;

import androidx.annotation.NonNull;
import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class AirshipTapInfo implements BaseMetadata, Serializable {
    private NativeObject nativeObject;
    private String panoramaId;
    private boolean panoramaId__is_initialized;

    public AirshipTapInfo() {
        this.panoramaId__is_initialized = false;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::places::panorama::AirshipTapInfo";
    }

    private native String getPanoramaId__Native();

    private native NativeObject init(String str);

    @NonNull
    public synchronized String getPanoramaId() {
        try {
            if (!this.panoramaId__is_initialized) {
                this.panoramaId = getPanoramaId__Native();
                this.panoramaId__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.panoramaId;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getPanoramaId(), false);
            return;
        }
        String add = archive.add(this.panoramaId, false);
        this.panoramaId = add;
        this.panoramaId__is_initialized = true;
        this.nativeObject = init(add);
    }

    public AirshipTapInfo(@NonNull String str) {
        this.panoramaId__is_initialized = false;
        if (str != null) {
            this.nativeObject = init(str);
            this.panoramaId = str;
            this.panoramaId__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"panoramaId\" cannot be null");
    }

    private AirshipTapInfo(NativeObject nativeObject) {
        this.panoramaId__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
