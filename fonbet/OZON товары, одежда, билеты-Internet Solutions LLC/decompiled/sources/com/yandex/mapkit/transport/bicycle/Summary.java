package com.yandex.mapkit.transport.bicycle;

import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class Summary implements Serializable {
    private Flags flags;
    private boolean flags__is_initialized;
    private NativeObject nativeObject;
    private Weight weight;
    private boolean weight__is_initialized;

    public Summary() {
        this.weight__is_initialized = false;
        this.flags__is_initialized = false;
    }

    private native Flags getFlags__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::bicycle::Summary";
    }

    private native Weight getWeight__Native();

    private native NativeObject init(Weight weight, Flags flags);

    public synchronized Flags getFlags() {
        try {
            if (!this.flags__is_initialized) {
                this.flags = getFlags__Native();
                this.flags__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.flags;
    }

    @NonNull
    public synchronized Weight getWeight() {
        try {
            if (!this.weight__is_initialized) {
                this.weight = getWeight__Native();
                this.weight__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.weight;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getWeight(), false, (Class<Archive>) Weight.class);
            archive.add((Archive) getFlags(), true, (Class<Archive>) Flags.class);
            return;
        }
        this.weight = (Weight) archive.add((Archive) this.weight, false, (Class<Archive>) Weight.class);
        this.weight__is_initialized = true;
        Flags flags = (Flags) archive.add((Archive) this.flags, true, (Class<Archive>) Flags.class);
        this.flags = flags;
        this.flags__is_initialized = true;
        this.nativeObject = init(this.weight, flags);
    }

    public Summary(@NonNull Weight weight, Flags flags) {
        this.weight__is_initialized = false;
        this.flags__is_initialized = false;
        if (weight != null) {
            this.nativeObject = init(weight, flags);
            this.weight = weight;
            this.weight__is_initialized = true;
            this.flags = flags;
            this.flags__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"weight\" cannot be null");
    }

    private Summary(NativeObject nativeObject) {
        this.weight__is_initialized = false;
        this.flags__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
