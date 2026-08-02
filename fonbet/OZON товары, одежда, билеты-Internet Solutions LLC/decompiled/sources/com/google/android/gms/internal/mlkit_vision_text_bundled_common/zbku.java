package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Arrays;

/* loaded from: classes9.dex */
public final class zbku extends zbkr {
    public zbku() {
        super(4);
    }

    public final zbku zba(Object obj) {
        int i11 = this.zbb;
        int i12 = i11 + 1;
        Object[] objArr = this.zba;
        int length = objArr.length;
        if (length < i12) {
            int i13 = length + (length >> 1) + 1;
            if (i13 < i12) {
                int highestOneBit = Integer.highestOneBit(i11);
                i13 = highestOneBit + highestOneBit;
            }
            if (i13 < 0) {
                i13 = Integer.MAX_VALUE;
            }
            this.zba = Arrays.copyOf(objArr, i13);
            this.zbc = false;
        } else if (this.zbc) {
            this.zba = (Object[]) objArr.clone();
            this.zbc = false;
        }
        Object[] objArr2 = this.zba;
        int i14 = this.zbb;
        this.zbb = i14 + 1;
        objArr2[i14] = obj;
        return this;
    }

    public final zbkx zbb() {
        this.zbc = true;
        return zbkx.zbg(this.zba, this.zbb);
    }
}
