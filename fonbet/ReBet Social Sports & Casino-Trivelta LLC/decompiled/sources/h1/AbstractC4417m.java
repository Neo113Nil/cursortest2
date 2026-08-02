package h1;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: h1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4417m {
    public static void a(InterfaceC4411g interfaceC4411g) {
        if (interfaceC4411g != null) {
            try {
                interfaceC4411g.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] b(InterfaceC4411g interfaceC4411g) {
        byte[] bArr = new byte[1024];
        int i10 = 0;
        int i11 = 0;
        while (i10 != -1) {
            if (i11 == bArr.length) {
                bArr = Arrays.copyOf(bArr, bArr.length * 2);
            }
            i10 = interfaceC4411g.read(bArr, i11, bArr.length - i11);
            if (i10 != -1) {
                i11 += i10;
            }
        }
        return Arrays.copyOf(bArr, i11);
    }
}
