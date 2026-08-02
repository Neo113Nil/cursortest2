package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbcr {
    private final int zba;
    private final int zbb;

    public zbcr(int i11, int i12) {
        zbkj.zbc(i11 < 32767 && i11 >= 0);
        zbkj.zbc(i12 < 32767 && i12 >= 0);
        this.zba = i11;
        this.zbb = i12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zbcr) {
            zbcr zbcrVar = (zbcr) obj;
            if (this.zba == zbcrVar.zba && this.zbb == zbcrVar.zbb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zba << 16) | this.zbb;
    }

    public final String toString() {
        return this.zba + "x" + this.zbb;
    }

    public final int zba() {
        return this.zbb;
    }

    public final int zbb() {
        return this.zba;
    }
}
