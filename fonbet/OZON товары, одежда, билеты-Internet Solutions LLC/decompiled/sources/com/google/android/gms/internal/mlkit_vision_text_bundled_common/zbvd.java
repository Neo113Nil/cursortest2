package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
final class zbvd implements zbvy {
    private static final zbvk zba = new zbvb();
    private final zbvk zbb;

    public zbvd() {
        zbty zba2 = zbty.zba();
        int i11 = zbvu.zba;
        zbvc zbvcVar = new zbvc(zba2, zba);
        byte[] bArr = zbuo.zbb;
        this.zbb = zbvcVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvy
    public final zbvx zba(Class cls) {
        int i11 = zbvz.zba;
        if (!zbuf.class.isAssignableFrom(cls)) {
            int i12 = zbvu.zba;
        }
        zbvj zbb = this.zbb.zbb(cls);
        if (zbb.zbb()) {
            int i13 = zbvu.zba;
            return zbvq.zbc(zbvz.zbm(), zbts.zba(), zbb.zba());
        }
        int i14 = zbvu.zba;
        return zbvp.zbl(cls, zbb, zbvt.zba(), zbuz.zba(), zbvz.zbm(), zbb.zbc() + (-1) != 1 ? zbts.zba() : null, zbvi.zba());
    }
}
