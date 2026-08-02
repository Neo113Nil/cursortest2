package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class RestrictedEntry implements Serializable {
    private NativeObject nativeObject;
    private int position;
    private boolean position__is_initialized;

    public RestrictedEntry() {
        this.position__is_initialized = false;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::RestrictedEntry";
    }

    private native int getPosition__Native();

    private native NativeObject init(int i11);

    public synchronized int getPosition() {
        try {
            if (!this.position__is_initialized) {
                this.position = getPosition__Native();
                this.position__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.position;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getPosition());
            return;
        }
        int add = archive.add(this.position);
        this.position = add;
        this.position__is_initialized = true;
        this.nativeObject = init(add);
    }

    public RestrictedEntry(int i11) {
        this.position__is_initialized = false;
        this.nativeObject = init(i11);
        this.position = i11;
        this.position__is_initialized = true;
    }

    private RestrictedEntry(NativeObject nativeObject) {
        this.position__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
