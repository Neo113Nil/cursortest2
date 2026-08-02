package com.google.protobuf;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class l1 implements Internal.MapAdapter.Converter {
    public final /* synthetic */ Internal.EnumLiteMap a;
    public final /* synthetic */ Internal.EnumLite b;

    public l1(Internal.EnumLiteMap enumLiteMap, Internal.EnumLite enumLite) {
        this.a = enumLiteMap;
        this.b = enumLite;
    }

    @Override // com.google.protobuf.Internal.MapAdapter.Converter
    public final Object doBackward(Object obj) {
        return Integer.valueOf(((Internal.EnumLite) obj).getNumber());
    }

    @Override // com.google.protobuf.Internal.MapAdapter.Converter
    public final Object doForward(Object obj) {
        Internal.EnumLite findValueByNumber = this.a.findValueByNumber(((Integer) obj).intValue());
        return findValueByNumber == null ? this.b : findValueByNumber;
    }
}
