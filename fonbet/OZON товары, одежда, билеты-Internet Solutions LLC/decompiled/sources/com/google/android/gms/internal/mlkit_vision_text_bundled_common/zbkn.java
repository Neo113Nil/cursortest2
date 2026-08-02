package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
abstract class zbkn extends zbjz {
    final CharSequence zbb;
    int zbc = 0;
    int zbd = Integer.MAX_VALUE;

    protected zbkn(zbko zbkoVar, CharSequence charSequence) {
        this.zbb = charSequence;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbjz
    protected final /* bridge */ /* synthetic */ Object zba() {
        int zbc;
        int i11 = this.zbc;
        while (true) {
            int i12 = this.zbc;
            if (i12 == -1) {
                zbb();
                return null;
            }
            int zbd = zbd(i12);
            if (zbd == -1) {
                zbd = this.zbb.length();
                this.zbc = -1;
                zbc = -1;
            } else {
                zbc = zbc(zbd);
                this.zbc = zbc;
            }
            if (zbc != i11) {
                if (i11 < zbd) {
                    this.zbb.charAt(i11);
                }
                if (i11 < zbd) {
                    this.zbb.charAt(zbd - 1);
                }
                int i13 = this.zbd;
                if (i13 == 1) {
                    zbd = this.zbb.length();
                    this.zbc = -1;
                    if (zbd > i11) {
                        this.zbb.charAt(zbd - 1);
                    }
                } else {
                    this.zbd = i13 - 1;
                }
                return this.zbb.subSequence(i11, zbd).toString();
            }
            int i14 = zbc + 1;
            this.zbc = i14;
            if (i14 > this.zbb.length()) {
                this.zbc = -1;
            }
        }
    }

    abstract int zbc(int i11);

    abstract int zbd(int i11);
}
