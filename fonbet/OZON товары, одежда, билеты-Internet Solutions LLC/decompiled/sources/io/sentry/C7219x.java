package io.sentry;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7219x implements M {

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f68661b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC7126b0 f68662a;

    public C7219x(@NotNull InterfaceC7126b0 interfaceC7126b0) {
        this.f68662a = interfaceC7126b0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00aa, code lost:
    
        r13 = new io.sentry.V1(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00af, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b2, code lost:
    
        return r13;
     */
    @Override // io.sentry.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V1 a(@NotNull BufferedInputStream bufferedInputStream) throws IOException {
        InterfaceC7126b0 interfaceC7126b0 = this.f68662a;
        Charset charset = f68661b;
        byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i11 = 0;
        int i12 = -1;
        while (true) {
            try {
                int read = bufferedInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                int i13 = 0;
                while (true) {
                    if (i12 == -1 && i13 < read) {
                        if (bArr[i13] == 10) {
                            i12 = i11 + i13;
                            break;
                        }
                        i13++;
                    }
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i11 += read;
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
        if (i12 == -1) {
            throw new IllegalArgumentException("Envelope contains no header.");
        }
        StringReader stringReader = new StringReader(new String(byteArray, 0, i12, charset));
        try {
            W1 w12 = (W1) interfaceC7126b0.c(stringReader, W1.class);
            stringReader.close();
            if (w12 == null) {
                throw new IllegalArgumentException("Envelope header is null.");
            }
            int i14 = i12 + 1;
            ArrayList arrayList = new ArrayList();
            while (true) {
                int i15 = i14;
                while (true) {
                    if (i15 >= byteArray.length) {
                        i15 = -1;
                        break;
                    }
                    if (byteArray[i15] == 10) {
                        break;
                    }
                    i15++;
                }
                if (i15 == -1) {
                    throw new IllegalArgumentException("Invalid envelope. Item at index '" + arrayList.size() + "'. has no header delimiter.");
                }
                stringReader = new StringReader(new String(byteArray, i14, i15 - i14, charset));
                try {
                    C7226y2 c7226y2 = (C7226y2) interfaceC7126b0.c(stringReader, C7226y2.class);
                    stringReader.close();
                    if (c7226y2 == null || c7226y2.d() <= 0) {
                        break;
                    }
                    int d11 = c7226y2.d() + i15;
                    int i16 = d11 + 1;
                    if (i16 > byteArray.length) {
                        throw new IllegalArgumentException("Invalid length for item at index '" + arrayList.size() + "'. Item is '" + i16 + "' bytes. There are '" + byteArray.length + "' in the buffer.");
                    }
                    arrayList.add(new C7222x2(c7226y2, Arrays.copyOfRange(byteArray, i15 + 1, i16)));
                    if (i16 == byteArray.length) {
                        break;
                    }
                    i14 = d11 + 2;
                    if (i14 == byteArray.length) {
                        if (byteArray[i16] != 10) {
                            throw new IllegalArgumentException("Envelope has invalid data following an item.");
                        }
                    }
                } finally {
                }
            }
            throw new IllegalArgumentException("Item header at index '" + arrayList.size() + "' is null or empty.");
        } finally {
        }
    }
}
