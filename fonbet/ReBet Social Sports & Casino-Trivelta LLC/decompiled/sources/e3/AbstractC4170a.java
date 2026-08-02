package e3;

import java.io.ByteArrayOutputStream;

/* renamed from: e3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4170a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4171b f45637a = new C4171b();

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            f45637a.a(byteArrayOutputStream, str);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            throw new C4172c("unable to decode base64 string: " + e10.getMessage(), e10);
        }
    }

    public static byte[] b(byte[] bArr) {
        int length = bArr.length;
        C4171b c4171b = f45637a;
        c4171b.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((length + 2) / 3) * 4);
        try {
            c4171b.c(bArr, length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            throw new C4173d("exception encoding base64 string: " + e10.getMessage(), e10);
        }
    }
}
