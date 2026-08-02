package io.sentry;

import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class Z0 implements InterfaceC7146g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Z0 f66819a = new Z0();

    public static String c() {
        byte[] bArr = new byte[16];
        io.sentry.util.u.a().b(bArr);
        byte b11 = (byte) (bArr[6] & 15);
        bArr[6] = b11;
        bArr[6] = (byte) (b11 | 64);
        byte b12 = (byte) (bArr[8] & 63);
        bArr[8] = b12;
        bArr[8] = (byte) (b12 | 128);
        long j11 = 0;
        long j12 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            j12 = (j12 << 8) | (bArr[i11] & 255);
        }
        for (int i12 = 8; i12 < 16; i12++) {
            j11 = (j11 << 8) | (bArr[i12] & 255);
        }
        return io.sentry.util.z.b(new UUID(j12, j11));
    }

    public static Z0 d() {
        return f66819a;
    }

    @Override // io.sentry.InterfaceC7146g0
    public void a(@NotNull InterfaceC7142f0 interfaceC7142f0) {
    }

    @Override // io.sentry.InterfaceC7146g0
    public C7167l1 b(@NotNull e3 e3Var, List list, @NotNull W2 w22) {
        return null;
    }

    @Override // io.sentry.InterfaceC7146g0
    public void close() {
    }

    @Override // io.sentry.InterfaceC7146g0
    public boolean isRunning() {
        return false;
    }

    @Override // io.sentry.InterfaceC7146g0
    public void start() {
    }
}
