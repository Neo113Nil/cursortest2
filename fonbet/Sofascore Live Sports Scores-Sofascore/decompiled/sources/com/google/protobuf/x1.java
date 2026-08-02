package com.google.protobuf;

import com.google.protobuf.WireFormat;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class x1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WireFormat.FieldType.values().length];
        a = iArr;
        try {
            iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[WireFormat.FieldType.BYTES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[WireFormat.FieldType.FIXED32.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[WireFormat.FieldType.FLOAT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[WireFormat.FieldType.ENUM.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            a[WireFormat.FieldType.INT32.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            a[WireFormat.FieldType.UINT32.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            a[WireFormat.FieldType.INT64.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            a[WireFormat.FieldType.UINT64.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            a[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            a[WireFormat.FieldType.SINT32.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            a[WireFormat.FieldType.SINT64.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            a[WireFormat.FieldType.STRING.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
    }
}
