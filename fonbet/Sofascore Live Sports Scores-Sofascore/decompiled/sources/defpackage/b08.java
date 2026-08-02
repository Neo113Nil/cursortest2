package defpackage;

import com.google.protobuf.JavaType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class b08 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[JavaType.values().length];
        b = iArr;
        try {
            iArr[JavaType.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[JavaType.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[JavaType.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[c08.values().length];
        a = iArr2;
        try {
            iArr2[3] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[1] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[0] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
