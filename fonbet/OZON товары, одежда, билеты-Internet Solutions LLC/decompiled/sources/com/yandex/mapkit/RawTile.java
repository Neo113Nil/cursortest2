package com.yandex.mapkit;

import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import java.util.Map;

/* loaded from: classes9.dex */
public class RawTile implements Serializable {
    private String etag;
    private boolean etag__is_initialized;
    private Map<String, String> features;
    private boolean features__is_initialized;
    private NativeObject nativeObject;
    private byte[] rawData;
    private boolean rawData__is_initialized;
    private State state;
    private boolean state__is_initialized;
    private UseCache useCache;
    private boolean useCache__is_initialized;
    private Version version;
    private boolean version__is_initialized;

    public enum State {
        OK,
        NOT_MODIFIED,
        ERROR
    }

    public enum UseCache {
        YES,
        NO
    }

    public RawTile() {
        this.version__is_initialized = false;
        this.features__is_initialized = false;
        this.etag__is_initialized = false;
        this.useCache__is_initialized = false;
        this.state__is_initialized = false;
        this.rawData__is_initialized = false;
    }

    private native String getEtag__Native();

    private native Map<String, String> getFeatures__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::RawTile";
    }

    private native byte[] getRawData__Native();

    private native State getState__Native();

    private native UseCache getUseCache__Native();

    private native Version getVersion__Native();

    private native NativeObject init(Version version, Map<String, String> map, String str, UseCache useCache, State state, byte[] bArr);

    @NonNull
    public synchronized String getEtag() {
        try {
            if (!this.etag__is_initialized) {
                this.etag = getEtag__Native();
                this.etag__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.etag;
    }

    @NonNull
    public synchronized Map<String, String> getFeatures() {
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
    public synchronized byte[] getRawData() {
        try {
            if (!this.rawData__is_initialized) {
                this.rawData = getRawData__Native();
                this.rawData__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.rawData;
    }

    @NonNull
    public synchronized State getState() {
        try {
            if (!this.state__is_initialized) {
                this.state = getState__Native();
                this.state__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.state;
    }

    @NonNull
    public synchronized UseCache getUseCache() {
        try {
            if (!this.useCache__is_initialized) {
                this.useCache = getUseCache__Native();
                this.useCache__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.useCache;
    }

    @NonNull
    public synchronized Version getVersion() {
        try {
            if (!this.version__is_initialized) {
                this.version = getVersion__Native();
                this.version__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.version;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getVersion(), false, (Class<Archive>) Version.class);
            archive.add(getFeatures(), false, new StringHandler(), new StringHandler());
            archive.add(getEtag(), false);
            archive.add((Archive) getUseCache(), false, (Class<Archive>) UseCache.class);
            archive.add((Archive) getState(), false, (Class<Archive>) State.class);
            archive.add(getRawData(), false);
            return;
        }
        this.version = (Version) archive.add((Archive) this.version, false, (Class<Archive>) Version.class);
        this.version__is_initialized = true;
        this.features = archive.add(this.features, false, new StringHandler(), new StringHandler());
        this.features__is_initialized = true;
        this.etag = archive.add(this.etag, false);
        this.etag__is_initialized = true;
        this.useCache = (UseCache) archive.add((Archive) this.useCache, false, (Class<Archive>) UseCache.class);
        this.useCache__is_initialized = true;
        this.state = (State) archive.add((Archive) this.state, false, (Class<Archive>) State.class);
        this.state__is_initialized = true;
        byte[] add = archive.add(this.rawData, false);
        this.rawData = add;
        this.rawData__is_initialized = true;
        this.nativeObject = init(this.version, this.features, this.etag, this.useCache, this.state, add);
    }

    public RawTile(@NonNull Version version, @NonNull Map<String, String> map, @NonNull String str, @NonNull UseCache useCache, @NonNull State state, @NonNull byte[] bArr) {
        this.version__is_initialized = false;
        this.features__is_initialized = false;
        this.etag__is_initialized = false;
        this.useCache__is_initialized = false;
        this.state__is_initialized = false;
        this.rawData__is_initialized = false;
        if (version == null) {
            throw new IllegalArgumentException("Required field \"version\" cannot be null");
        }
        if (map == null) {
            throw new IllegalArgumentException("Required field \"features\" cannot be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("Required field \"etag\" cannot be null");
        }
        if (useCache == null) {
            throw new IllegalArgumentException("Required field \"useCache\" cannot be null");
        }
        if (state == null) {
            throw new IllegalArgumentException("Required field \"state\" cannot be null");
        }
        if (bArr != null) {
            this.nativeObject = init(version, map, str, useCache, state, bArr);
            this.version = version;
            this.version__is_initialized = true;
            this.features = map;
            this.features__is_initialized = true;
            this.etag = str;
            this.etag__is_initialized = true;
            this.useCache = useCache;
            this.useCache__is_initialized = true;
            this.state = state;
            this.state__is_initialized = true;
            this.rawData = bArr;
            this.rawData__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"rawData\" cannot be null");
    }

    private RawTile(NativeObject nativeObject) {
        this.version__is_initialized = false;
        this.features__is_initialized = false;
        this.etag__is_initialized = false;
        this.useCache__is_initialized = false;
        this.state__is_initialized = false;
        this.rawData__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
