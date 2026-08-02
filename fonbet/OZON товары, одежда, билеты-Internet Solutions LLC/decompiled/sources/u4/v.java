package u4;

import java.util.Arrays;

/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final int f100264a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f100265b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f100266c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f100267d;

    /* renamed from: e, reason: collision with root package name */
    public int f100268e;

    public v(int i11) {
        this.f100264a = i11;
        byte[] bArr = new byte[131];
        this.f100267d = bArr;
        bArr[2] = 1;
    }

    public final void a(int i11, int i12, byte[] bArr) {
        if (this.f100265b) {
            int i13 = i12 - i11;
            byte[] bArr2 = this.f100267d;
            int length = bArr2.length;
            int i14 = this.f100268e;
            if (length < i14 + i13) {
                this.f100267d = Arrays.copyOf(bArr2, (i14 + i13) * 2);
            }
            System.arraycopy(bArr, i11, this.f100267d, this.f100268e, i13);
            this.f100268e += i13;
        }
    }

    public final boolean b(int i11) {
        if (!this.f100265b) {
            return false;
        }
        this.f100268e -= i11;
        this.f100265b = false;
        this.f100266c = true;
        return true;
    }

    public final boolean c() {
        return this.f100266c;
    }

    public final void d() {
        this.f100265b = false;
        this.f100266c = false;
    }

    public final void e(int i11) {
        G10.a.h(!this.f100265b);
        boolean z11 = i11 == this.f100264a;
        this.f100265b = z11;
        if (z11) {
            this.f100268e = 3;
            this.f100266c = false;
        }
    }
}
