package B1;

import e1.Z;
import h1.AbstractC4417m;
import h1.C4418n;
import h1.InterfaceC4411g;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class k extends e {
    private byte[] data;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f599j;

    public k(InterfaceC4411g interfaceC4411g, C4418n c4418n, int i10, androidx.media3.common.a aVar, int i11, Object obj, byte[] bArr) {
        super(interfaceC4411g, c4418n, i10, aVar, i11, obj, -9223372036854775807L, -9223372036854775807L);
        this.data = bArr == null ? Z.EMPTY_BYTE_ARRAY : bArr;
    }

    @Override // D1.m.e
    public final void a() {
        try {
            this.f564i.b(this.f557b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f599j) {
                i(i11);
                i10 = this.f564i.read(this.data, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f599j) {
                g(this.data, i11);
            }
            AbstractC4417m.a(this.f564i);
        } catch (Throwable th2) {
            AbstractC4417m.a(this.f564i);
            throw th2;
        }
    }

    @Override // D1.m.e
    public final void c() {
        this.f599j = true;
    }

    public abstract void g(byte[] bArr, int i10);

    public byte[] h() {
        return this.data;
    }

    public final void i(int i10) {
        byte[] bArr = this.data;
        if (bArr.length < i10 + 16384) {
            this.data = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }
}
