package defpackage;

import com.google.protobuf.FieldType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class pz7 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FieldType.values().length];
        a = iArr;
        try {
            iArr[FieldType.MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[FieldType.GROUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[FieldType.MESSAGE_LIST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[FieldType.GROUP_LIST.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
