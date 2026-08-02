package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
final class zbto {
    private final Object zba;
    private final int zbb;

    zbto(Object obj, int i11) {
        this.zba = obj;
        this.zbb = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zbto)) {
            return false;
        }
        zbto zbtoVar = (zbto) obj;
        return this.zba == zbtoVar.zba && this.zbb == zbtoVar.zbb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zba) * 65535) + this.zbb;
    }
}
