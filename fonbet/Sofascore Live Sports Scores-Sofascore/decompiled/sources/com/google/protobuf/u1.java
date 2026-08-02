package com.google.protobuf;

import com.google.protobuf.WireFormat;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class u1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WireFormat.FieldType.values().length];
        a = iArr;
        try {
            iArr[WireFormat.FieldType.MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[WireFormat.FieldType.ENUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[WireFormat.FieldType.GROUP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
