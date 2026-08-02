package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
final class zbvc implements zbvk {
    private final zbvk[] zba;

    zbvc(zbvk... zbvkVarArr) {
        this.zba = zbvkVarArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvk
    public final zbvj zbb(Class cls) {
        for (int i11 = 0; i11 < 2; i11++) {
            zbvk zbvkVar = this.zba[i11];
            if (zbvkVar.zbc(cls)) {
                return zbvkVar.zbb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvk
    public final boolean zbc(Class cls) {
        for (int i11 = 0; i11 < 2; i11++) {
            if (this.zba[i11].zbc(cls)) {
                return true;
            }
        }
        return false;
    }
}
