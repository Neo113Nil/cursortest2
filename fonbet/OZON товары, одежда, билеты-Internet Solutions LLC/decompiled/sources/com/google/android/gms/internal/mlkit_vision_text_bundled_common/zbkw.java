package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
final class zbkw extends zbkx {
    final transient int zba;
    final transient int zbb;
    final /* synthetic */ zbkx zbc;

    zbkw(zbkx zbkxVar, int i11, int i12) {
        this.zbc = zbkxVar;
        this.zba = i11;
        this.zbb = i12;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zbkj.zba(i11, this.zbb, "index");
        return this.zbc.get(i11 + this.zba);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkt
    final int zbb() {
        return this.zbc.zbc() + this.zba + this.zbb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkt
    final int zbc() {
        return this.zbc.zbc() + this.zba;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkt
    final Object[] zbe() {
        return this.zbc.zbe();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx, java.util.List
    /* renamed from: zbf, reason: merged with bridge method [inline-methods] */
    public final zbkx subList(int i11, int i12) {
        zbkj.zbd(i11, i12, this.zbb);
        int i13 = this.zba;
        return this.zbc.subList(i11 + i13, i12 + i13);
    }
}
