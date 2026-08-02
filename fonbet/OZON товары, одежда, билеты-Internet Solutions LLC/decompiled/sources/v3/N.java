package v3;

import java.nio.ByteBuffer;
import k3.e;

/* loaded from: classes.dex */
public final class N extends k3.g {

    /* renamed from: i, reason: collision with root package name */
    private int f101868i;

    /* renamed from: j, reason: collision with root package name */
    private int f101869j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f101870k;

    /* renamed from: l, reason: collision with root package name */
    private int f101871l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f101872m = m3.N.f74291c;

    /* renamed from: n, reason: collision with root package name */
    private int f101873n;

    /* renamed from: o, reason: collision with root package name */
    private long f101874o;

    @Override // k3.g, k3.e
    public final boolean a() {
        return super.a() && this.f101873n == 0;
    }

    @Override // k3.e
    public final void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i11 = limit - position;
        if (i11 == 0) {
            return;
        }
        int min = Math.min(i11, this.f101871l);
        this.f101874o += min / this.f70388b.f70387d;
        this.f101871l -= min;
        byteBuffer.position(position + min);
        if (this.f101871l > 0) {
            return;
        }
        int i12 = i11 - min;
        int length = (this.f101873n + i12) - this.f101872m.length;
        ByteBuffer k11 = k(length);
        int i13 = m3.N.i(length, 0, this.f101873n);
        k11.put(this.f101872m, 0, i13);
        int i14 = m3.N.i(length - i13, 0, i12);
        byteBuffer.limit(byteBuffer.position() + i14);
        k11.put(byteBuffer);
        byteBuffer.limit(limit);
        int i15 = i12 - i14;
        int i16 = this.f101873n - i13;
        this.f101873n = i16;
        byte[] bArr = this.f101872m;
        System.arraycopy(bArr, i13, bArr, 0, i16);
        byteBuffer.get(this.f101872m, this.f101873n, i15);
        this.f101873n += i15;
        k11.flip();
    }

    @Override // k3.g, k3.e
    public final ByteBuffer d() {
        int i11;
        if (super.a() && (i11 = this.f101873n) > 0) {
            k(i11).put(this.f101872m, 0, this.f101873n).flip();
            this.f101873n = 0;
        }
        return super.d();
    }

    @Override // k3.g
    public final e.a g(e.a aVar) throws e.b {
        if (!m3.N.M(aVar.f70386c)) {
            throw new e.b(aVar);
        }
        this.f101870k = true;
        return (this.f101868i == 0 && this.f101869j == 0) ? e.a.f70383e : aVar;
    }

    @Override // k3.g
    protected final void h() {
        if (this.f101870k) {
            this.f101870k = false;
            int i11 = this.f101869j;
            int i12 = this.f70388b.f70387d;
            this.f101872m = new byte[i11 * i12];
            this.f101871l = this.f101868i * i12;
        }
        this.f101873n = 0;
    }

    @Override // k3.g
    protected final void i() {
        if (this.f101870k) {
            if (this.f101873n > 0) {
                this.f101874o += r0 / this.f70388b.f70387d;
            }
            this.f101873n = 0;
        }
    }

    @Override // k3.g
    protected final void j() {
        this.f101872m = m3.N.f74291c;
    }

    public final long l() {
        return this.f101874o;
    }

    public final void m() {
        this.f101874o = 0L;
    }

    public final void n(int i11, int i12) {
        this.f101868i = i11;
        this.f101869j = i12;
    }
}
