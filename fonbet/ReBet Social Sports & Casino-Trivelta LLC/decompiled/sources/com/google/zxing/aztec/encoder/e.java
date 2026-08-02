package com.google.zxing.aztec.encoder;

import kotlin.text.Typography;

/* loaded from: classes3.dex */
public final class e extends g {

    /* renamed from: c, reason: collision with root package name */
    public final short f38371c;

    /* renamed from: d, reason: collision with root package name */
    public final short f38372d;

    public e(g gVar, int i10, int i11) {
        super(gVar);
        this.f38371c = (short) i10;
        this.f38372d = (short) i11;
    }

    @Override // com.google.zxing.aztec.encoder.g
    public void c(Lb.a aVar, byte[] bArr) {
        aVar.c(this.f38371c, this.f38372d);
    }

    public String toString() {
        short s10 = this.f38371c;
        short s11 = this.f38372d;
        return "<" + Integer.toBinaryString((s10 & ((1 << s11) - 1)) | (1 << s11) | (1 << this.f38372d)).substring(1) + Typography.greater;
    }
}
