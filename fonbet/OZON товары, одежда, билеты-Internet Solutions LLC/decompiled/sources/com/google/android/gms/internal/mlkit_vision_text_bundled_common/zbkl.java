package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
final class zbkl extends zbkn {
    final /* synthetic */ zbkm zba;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zbkl(zbkm zbkmVar, zbko zbkoVar, CharSequence charSequence) {
        super(zbkoVar, charSequence);
        this.zba = zbkmVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkn
    public final int zbc(int i11) {
        return this.zba.zba.length() + i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r7 = r7 + 1;
     */
    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zbd(int i11) {
        int length = ((zbkn) this).zbb.length();
        int length2 = this.zba.zba.length();
        int i12 = length - length2;
        while (i11 <= i12) {
            for (int i13 = 0; i13 < length2; i13++) {
                if (((zbkn) this).zbb.charAt(i13 + i11) != this.zba.zba.charAt(i13)) {
                    break;
                }
            }
            return i11;
        }
        return -1;
    }
}
