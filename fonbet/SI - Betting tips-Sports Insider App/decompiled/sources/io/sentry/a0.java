package io.sentry;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import okio.Segment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a0 implements s0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f15438b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final g1 f15439a;

    public a0(g1 g1Var) {
        this.f15439a = g1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00aa, code lost:
    
        r13 = new l1.a(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00af, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b2, code lost:
    
        return r13;
     */
    @Override // io.sentry.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l1.a a(BufferedInputStream bufferedInputStream) {
        g1 g1Var = this.f15439a;
        Charset charset = f15438b;
        byte[] bArr = new byte[Segment.SHARE_MINIMUM];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i5 = 0;
        int i10 = -1;
        while (true) {
            try {
                int read = bufferedInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                int i11 = 0;
                while (true) {
                    if (i10 == -1 && i11 < read) {
                        if (bArr[i11] == 10) {
                            i10 = i5 + i11;
                            break;
                        }
                        i11++;
                    }
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i5 += read;
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
        if (i10 == -1) {
            throw new IllegalArgumentException("Envelope contains no header.");
        }
        StringReader stringReader = new StringReader(new String(byteArray, 0, i10, charset));
        try {
            m4 m4Var = (m4) g1Var.c(stringReader, m4.class);
            stringReader.close();
            if (m4Var == null) {
                throw new IllegalArgumentException("Envelope header is null.");
            }
            int i12 = i10 + 1;
            ArrayList arrayList = new ArrayList();
            while (true) {
                int i13 = i12;
                while (true) {
                    if (i13 >= byteArray.length) {
                        i13 = -1;
                        break;
                    }
                    if (byteArray[i13] == 10) {
                        break;
                    }
                    i13++;
                }
                if (i13 == -1) {
                    throw new IllegalArgumentException("Invalid envelope. Item at index '" + arrayList.size() + "'. has no header delimiter.");
                }
                stringReader = new StringReader(new String(byteArray, i12, i13 - i12, charset));
                try {
                    s4 s4Var = (s4) g1Var.c(stringReader, s4.class);
                    stringReader.close();
                    if (s4Var == null || s4Var.a() <= 0) {
                        break;
                    }
                    int a7 = s4Var.a() + i13;
                    int i14 = a7 + 1;
                    if (i14 > byteArray.length) {
                        throw new IllegalArgumentException("Invalid length for item at index '" + arrayList.size() + "'. Item is '" + i14 + "' bytes. There are '" + byteArray.length + "' in the buffer.");
                    }
                    arrayList.add(new r4(s4Var, Arrays.copyOfRange(byteArray, i13 + 1, i14)));
                    if (i14 == byteArray.length) {
                        break;
                    }
                    i12 = a7 + 2;
                    if (i12 == byteArray.length) {
                        if (byteArray[i14] != 10) {
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
