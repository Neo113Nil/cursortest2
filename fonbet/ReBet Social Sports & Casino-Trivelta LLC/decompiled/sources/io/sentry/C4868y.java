package io.sentry;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: io.sentry.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4868y implements T {

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f52886b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4770k0 f52887a;

    public C4868y(InterfaceC4770k0 interfaceC4770k0) {
        this.f52887a = interfaceC4770k0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0084, code lost:
    
        r11 = new io.sentry.C4866x2(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0089, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008c, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e5, code lost:
    
        throw new java.lang.IllegalArgumentException("Item header at index '" + r2.size() + "' is null or empty.");
     */
    @Override // io.sentry.T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4866x2 a(InputStream inputStream) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        int i11 = -1;
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i11 == -1 && i12 < read) {
                        if (bArr[i12] == 10) {
                            i11 = i10 + i12;
                            break;
                        }
                        i12++;
                    }
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i10 += read;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length == 0) {
            throw new IllegalArgumentException("Empty stream.");
        }
        if (i11 == -1) {
            throw new IllegalArgumentException("Envelope contains no header.");
        }
        C4871y2 b10 = b(byteArray, 0, i11);
        if (b10 == null) {
            throw new IllegalArgumentException("Envelope header is null.");
        }
        int i13 = i11 + 1;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i14 = i13;
            while (true) {
                if (i14 >= byteArray.length) {
                    i14 = -1;
                    break;
                }
                if (byteArray[i14] == 10) {
                    break;
                }
                i14++;
            }
            if (i14 == -1) {
                throw new IllegalArgumentException("Invalid envelope. Item at index '" + arrayList.size() + "'. has no header delimiter.");
            }
            C4728b3 c10 = c(byteArray, i13, i14 - i13);
            if (c10 == null || c10.d() <= 0) {
                break;
            }
            int d10 = c10.d() + i14;
            int i15 = d10 + 1;
            if (i15 > byteArray.length) {
                throw new IllegalArgumentException("Invalid length for item at index '" + arrayList.size() + "'. Item is '" + i15 + "' bytes. There are '" + byteArray.length + "' in the buffer.");
            }
            arrayList.add(new C4665a3(c10, Arrays.copyOfRange(byteArray, i14 + 1, i15)));
            if (i15 == byteArray.length) {
                break;
            }
            i13 = d10 + 2;
            if (i13 == byteArray.length) {
                if (byteArray[i15] != 10) {
                    throw new IllegalArgumentException("Envelope has invalid data following an item.");
                }
            }
        }
    }

    public final C4871y2 b(byte[] bArr, int i10, int i11) {
        StringReader stringReader = new StringReader(new String(bArr, i10, i11, f52886b));
        try {
            C4871y2 c4871y2 = (C4871y2) this.f52887a.c(stringReader, C4871y2.class);
            stringReader.close();
            return c4871y2;
        } catch (Throwable th2) {
            try {
                stringReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final C4728b3 c(byte[] bArr, int i10, int i11) {
        StringReader stringReader = new StringReader(new String(bArr, i10, i11, f52886b));
        try {
            C4728b3 c4728b3 = (C4728b3) this.f52887a.c(stringReader, C4728b3.class);
            stringReader.close();
            return c4728b3;
        } catch (Throwable th2) {
            try {
                stringReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
