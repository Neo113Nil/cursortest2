package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class d2 implements Internal.ListAdapter.Converter {
    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public final Object convert(Object obj) {
        int intValue = ((Integer) obj).intValue();
        i2 i2Var = intValue != 0 ? intValue != 1 ? intValue != 2 ? null : i2.LEVEL_PLAY : i2.MAX : i2.UNKNOWN;
        return i2Var == null ? i2.UNRECOGNIZED : i2Var;
    }
}
