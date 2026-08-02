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
public class PanoramasObjectMetadata implements BaseMetadata, Serializable {
    private NativeObject nativeObject;
    private List<Panorama> panoramas;
    private boolean panoramas__is_initialized;

    public PanoramasObjectMetadata() {
        this.panoramas__is_initialized = false;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::PanoramasObjectMetadata";
    }

    private native List<Panorama> getPanoramas__Native();

    private native NativeObject init(List<Panorama> list);

    @NonNull
    public synchronized List<Panorama> getPanoramas() {
        try {
            if (!this.panoramas__is_initialized) {
                this.panoramas = getPanoramas__Native();
                this.panoramas__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.panoramas;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            C2616s.f(Panorama.class, archive, getPanoramas(), false);
            return;
        }
        List<Panorama> d11 = G.d(Panorama.class, archive, this.panoramas, false);
        this.panoramas = d11;
        this.panoramas__is_initialized = true;
        this.nativeObject = init(d11);
    }

    public PanoramasObjectMetadata(@NonNull List<Panorama> list) {
        this.panoramas__is_initialized = false;
        if (list != null) {
            this.nativeObject = init(list);
            this.panoramas = list;
            this.panoramas__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"panoramas\" cannot be null");
    }

    private PanoramasObjectMetadata(NativeObject nativeObject) {
        this.panoramas__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
