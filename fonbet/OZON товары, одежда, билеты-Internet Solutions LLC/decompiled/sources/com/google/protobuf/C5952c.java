package com.google.protobuf;

import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: com.google.protobuf.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C5952c {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<SoftReference<byte[]>> f60200a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f60201b;

    /* renamed from: c, reason: collision with root package name */
    private static final long f60202c;

    static {
        Class<?> cls;
        long C11;
        try {
            cls = Class.forName("java.io.FileOutputStream");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f60201b = cls;
        if (cls != null) {
            if (UnsafeUtil.A()) {
                C11 = UnsafeUtil.C(cls.getDeclaredField(AppsFlyerProperties.CHANNEL));
                f60202c = C11;
            }
        }
        C11 = -1;
        f60202c = C11;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0004, B:5:0x000a, B:9:0x0023, B:11:0x002d, B:14:0x0035, B:16:0x003f, B:18:0x0047, B:22:0x0065, B:24:0x0068, B:27:0x007f, B:29:0x0085, B:31:0x0071, B:33:0x0077, B:34:0x005c), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void a(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        boolean z11;
        int length;
        WritableByteChannel writableByteChannel;
        int position = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else {
                long j11 = f60202c;
                byte[] bArr = null;
                if (j11 >= 0 && f60201b.isInstance(outputStream)) {
                    try {
                        writableByteChannel = (WritableByteChannel) UnsafeUtil.y(outputStream, j11);
                    } catch (ClassCastException unused) {
                        writableByteChannel = null;
                    }
                    if (writableByteChannel != null) {
                        writableByteChannel.write(byteBuffer);
                        z11 = true;
                        if (!z11) {
                            int max = Math.max(byteBuffer.remaining(), UserVerificationMethods.USER_VERIFY_ALL);
                            ThreadLocal<SoftReference<byte[]>> threadLocal = f60200a;
                            SoftReference<byte[]> softReference = threadLocal.get();
                            if (softReference != null) {
                                bArr = softReference.get();
                            }
                            if (bArr == null || ((length = bArr.length) < max && length < max * 0.5f)) {
                                bArr = new byte[max];
                                if (max <= 16384) {
                                    threadLocal.set(new SoftReference<>(bArr));
                                }
                            }
                            while (byteBuffer.hasRemaining()) {
                                int min = Math.min(byteBuffer.remaining(), bArr.length);
                                byteBuffer.get(bArr, 0, min);
                                outputStream.write(bArr, 0, min);
                            }
                        }
                    }
                }
                z11 = false;
                if (!z11) {
                }
            }
            byteBuffer.position(position);
        } catch (Throwable th2) {
            byteBuffer.position(position);
            throw th2;
        }
    }
}
