package com.yandex.mapkit.uri;

import B90.C2616s;
import F3.G;
import androidx.annotation.NonNull;
import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class UriObjectMetadata implements BaseMetadata, Serializable {
    private NativeObject nativeObject;
    private List<Uri> uris;
    private boolean uris__is_initialized;

    public UriObjectMetadata() {
        this.uris__is_initialized = false;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::uri::UriObjectMetadata";
    }

    private native List<Uri> getUris__Native();

    private native NativeObject init(List<Uri> list);

    @NonNull
    public synchronized List<Uri> getUris() {
        try {
            if (!this.uris__is_initialized) {
                this.uris = getUris__Native();
                this.uris__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.uris;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            C2616s.f(Uri.class, archive, getUris(), false);
            return;
        }
        List<Uri> d11 = G.d(Uri.class, archive, this.uris, false);
        this.uris = d11;
        this.uris__is_initialized = true;
        this.nativeObject = init(d11);
    }

    public UriObjectMetadata(@NonNull List<Uri> list) {
        this.uris__is_initialized = false;
        if (list != null) {
            this.nativeObject = init(list);
            this.uris = list;
            this.uris__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"uris\" cannot be null");
    }

    private UriObjectMetadata(NativeObject nativeObject) {
        this.uris__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
