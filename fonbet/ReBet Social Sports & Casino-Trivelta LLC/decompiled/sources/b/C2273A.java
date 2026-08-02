package b;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: b.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2273A implements InterfaceC2315l {

    /* renamed from: a, reason: collision with root package name */
    public final C2306e f24054a;

    /* renamed from: b, reason: collision with root package name */
    public C2309f0 f24055b;

    public C2273A(C2306e c2306e) {
        this.f24054a = c2306e;
    }

    @Override // b.InterfaceC2315l
    public final InputStream a() {
        C2309f0 c2309f0 = new C2309f0(this.f24054a);
        this.f24055b = c2309f0;
        return c2309f0;
    }

    @Override // b.InterfaceC2310g
    public final w0 b() {
        C2309f0 c2309f0 = new C2309f0(this.f24054a);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = c2309f0.read(bArr, 0, 4096);
            if (read < 0) {
                return new C2327x(byteArrayOutputStream.toByteArray(), c2309f0.f24109d);
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    @Override // b.InterfaceC2323t
    public final w0 d() {
        try {
            C2309f0 c2309f0 = new C2309f0(this.f24054a);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int read = c2309f0.read(bArr, 0, 4096);
                if (read < 0) {
                    return new C2327x(byteArrayOutputStream.toByteArray(), c2309f0.f24109d);
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e10) {
            throw new t0("IOException converting stream to byte array: " + e10.getMessage(), e10);
        }
    }

    @Override // b.InterfaceC2315l
    public final int e() {
        return this.f24055b.f24109d;
    }
}
