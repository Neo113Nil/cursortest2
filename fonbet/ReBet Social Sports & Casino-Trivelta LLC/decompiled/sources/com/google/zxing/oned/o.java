package com.google.zxing.oned;

import java.util.Map;

/* loaded from: classes3.dex */
public final class o implements com.google.zxing.g {

    /* renamed from: a, reason: collision with root package name */
    public final j f38424a = new j();

    @Override // com.google.zxing.g
    public Lb.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map map) {
        if (aVar == com.google.zxing.a.UPC_A) {
            return this.f38424a.a("0".concat(String.valueOf(str)), com.google.zxing.a.EAN_13, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(aVar)));
    }
}
