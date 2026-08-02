package com.fyber.inneractive.sdk.protobuf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum p0 {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);

    private final boolean isList;

    p0(boolean z) {
        this.isList = z;
    }

    public final boolean a() {
        return this.isList;
    }
}
