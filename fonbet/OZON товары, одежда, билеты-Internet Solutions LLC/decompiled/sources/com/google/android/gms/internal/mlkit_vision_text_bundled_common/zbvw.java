package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
final class zbvw implements zbvj {
    private final zbvm zba;
    private final String zbb;
    private final Object[] zbc;
    private final int zbd;

    zbvw(zbvm zbvmVar, String str, Object[] objArr) {
        this.zba = zbvmVar;
        this.zbb = str;
        this.zbc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zbd = charAt;
            return;
        }
        int i11 = charAt & 8191;
        int i12 = 1;
        int i13 = 13;
        while (true) {
            int i14 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 < 55296) {
                this.zbd = i11 | (charAt2 << i13);
                return;
            } else {
                i11 |= (charAt2 & 8191) << i13;
                i13 += 13;
                i12 = i14;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvj
    public final zbvm zba() {
        return this.zba;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvj
    public final boolean zbb() {
        return (this.zbd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvj
    public final int zbc() {
        int i11 = this.zbd;
        if ((i11 & 1) != 0) {
            return 1;
        }
        return (i11 & 4) == 4 ? 3 : 2;
    }

    final String zbd() {
        return this.zbb;
    }

    final Object[] zbe() {
        return this.zbc;
    }
}
