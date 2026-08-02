package com.yandex.runtime.attestation;

import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class EcPublicKey implements Serializable {
    private byte[] affineX;
    private boolean affineX__is_initialized;
    private byte[] affineY;
    private boolean affineY__is_initialized;
    private NativeObject nativeObject;

    public EcPublicKey() {
        this.affineX__is_initialized = false;
        this.affineY__is_initialized = false;
    }

    private native byte[] getAffineX__Native();

    private native byte[] getAffineY__Native();

    public static String getNativeName() {
        return "yandex::maps::runtime::attestation::EcPublicKey";
    }

    private native NativeObject init(byte[] bArr, byte[] bArr2);

    @NonNull
    public synchronized byte[] getAffineX() {
        try {
            if (!this.affineX__is_initialized) {
                this.affineX = getAffineX__Native();
                this.affineX__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.affineX;
    }

    @NonNull
    public synchronized byte[] getAffineY() {
        try {
            if (!this.affineY__is_initialized) {
                this.affineY = getAffineY__Native();
                this.affineY__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.affineY;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getAffineX(), false);
            archive.add(getAffineY(), false);
            return;
        }
        this.affineX = archive.add(this.affineX, false);
        this.affineX__is_initialized = true;
        byte[] add = archive.add(this.affineY, false);
        this.affineY = add;
        this.affineY__is_initialized = true;
        this.nativeObject = init(this.affineX, add);
    }

    public EcPublicKey(@NonNull byte[] bArr, @NonNull byte[] bArr2) {
        this.affineX__is_initialized = false;
        this.affineY__is_initialized = false;
        if (bArr == null) {
            throw new IllegalArgumentException("Required field \"affineX\" cannot be null");
        }
        if (bArr2 != null) {
            this.nativeObject = init(bArr, bArr2);
            this.affineX = bArr;
            this.affineX__is_initialized = true;
            this.affineY = bArr2;
            this.affineY__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"affineY\" cannot be null");
    }

    private EcPublicKey(NativeObject nativeObject) {
        this.affineX__is_initialized = false;
        this.affineY__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
