package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public class zbua extends zbtz implements zbvn {
    protected zbua(zbub zbubVar) {
        super(zbubVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvl
    /* renamed from: zbd, reason: merged with bridge method [inline-methods] */
    public final zbub zbl() {
        if (!((zbub) this.zba).zbG()) {
            return (zbub) this.zba;
        }
        ((zbub) this.zba).zbb.zbh();
        return (zbub) super.zbl();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz
    protected final void zbo() {
        super.zbo();
        if (((zbub) this.zba).zbb != zbtu.zbe()) {
            zbub zbubVar = (zbub) this.zba;
            zbubVar.zbb = zbubVar.zbb.clone();
        }
    }
}
