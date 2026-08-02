package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.Serializable;

/* loaded from: classes9.dex */
public abstract class zbki<T> implements Serializable {
    zbki() {
    }

    public static zbki zbd() {
        return zbjy.zba;
    }

    public static zbki zbe(Object obj) {
        obj.getClass();
        return new zbkk(obj);
    }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract Object zba();

    public abstract Object zbb(Object obj);

    public abstract boolean zbc();
}
