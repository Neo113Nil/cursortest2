package com.google.protobuf;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class o2 implements Internal.EnumVerifier {
    public static final o2 a = new o2();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return Syntax.forNumber(i) != null;
    }
}
