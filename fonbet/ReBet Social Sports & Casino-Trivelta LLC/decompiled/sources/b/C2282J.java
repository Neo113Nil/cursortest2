package b;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: b.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2282J implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final C2306e f24072a;

    public C2282J(C2306e c2306e) {
        this.f24072a = c2306e;
    }

    @Override // b.InterfaceC2310g
    public final w0 b() {
        i0 i0Var = new i0(this.f24072a);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = i0Var.read(bArr, 0, 4096);
            if (read < 0) {
                return new C2279G(byteArrayOutputStream.toByteArray(), null);
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    @Override // b.n0
    public final InputStream c() {
        return new i0(this.f24072a);
    }

    @Override // b.InterfaceC2323t
    public final w0 d() {
        try {
            i0 i0Var = new i0(this.f24072a);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int read = i0Var.read(bArr, 0, 4096);
                if (read < 0) {
                    return new C2279G(byteArrayOutputStream.toByteArray(), null);
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e10) {
            throw new t0("IOException converting stream to byte array: " + e10.getMessage(), e10);
        }
    }
}
