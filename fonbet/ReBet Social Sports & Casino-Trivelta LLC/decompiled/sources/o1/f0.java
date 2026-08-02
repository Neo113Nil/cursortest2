package o1;

import c1.p;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class f0 extends c1.r {
    private byte[] endBuffer = e1.Z.EMPTY_BYTE_ARRAY;

    /* renamed from: i, reason: collision with root package name */
    public int f58823i;

    /* renamed from: j, reason: collision with root package name */
    public int f58824j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f58825k;

    /* renamed from: l, reason: collision with root package name */
    public int f58826l;

    /* renamed from: m, reason: collision with root package name */
    public int f58827m;

    /* renamed from: n, reason: collision with root package name */
    public long f58828n;

    @Override // c1.r, c1.p
    public ByteBuffer a() {
        int i10;
        if (super.b() && (i10 = this.f58827m) > 0) {
            l(i10).put(this.endBuffer, 0, this.f58827m).flip();
            this.f58827m = 0;
        }
        return super.a();
    }

    @Override // c1.r, c1.p
    public boolean b() {
        return super.b() && this.f58827m == 0;
    }

    @Override // c1.p
    public void d(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 == 0) {
            return;
        }
        int min = Math.min(i10, this.f58826l);
        this.f58828n += min / this.f26785b.f26783d;
        this.f58826l -= min;
        byteBuffer.position(position + min);
        if (this.f58826l > 0) {
            return;
        }
        int i11 = i10 - min;
        int length = (this.f58827m + i11) - this.endBuffer.length;
        ByteBuffer l10 = l(length);
        int o10 = e1.Z.o(length, 0, this.f58827m);
        l10.put(this.endBuffer, 0, o10);
        int o11 = e1.Z.o(length - o10, 0, i11);
        byteBuffer.limit(byteBuffer.position() + o11);
        l10.put(byteBuffer);
        byteBuffer.limit(limit);
        int i12 = i11 - o11;
        int i13 = this.f58827m - o10;
        this.f58827m = i13;
        byte[] bArr = this.endBuffer;
        System.arraycopy(bArr, o10, bArr, 0, i13);
        byteBuffer.get(this.endBuffer, this.f58827m, i12);
        this.f58827m += i12;
        l10.flip();
    }

    @Override // c1.p
    public long f(long j10) {
        return j10 - e1.Z.o1(this.f58824j + this.f58823i, this.f26785b.f26780a);
    }

    @Override // c1.r
    public p.a h(p.a aVar) {
        if (!e1.Z.O0(aVar.f26782c)) {
            throw new p.b(aVar);
        }
        this.f58825k = true;
        return (this.f58823i == 0 && this.f58824j == 0) ? p.a.f26779e : aVar;
    }

    @Override // c1.r
    public void i() {
        if (this.f58825k) {
            this.f58825k = false;
            int i10 = this.f58824j;
            int i11 = this.f26785b.f26783d;
            this.endBuffer = new byte[i10 * i11];
            this.f58826l = this.f58823i * i11;
        }
        this.f58827m = 0;
    }

    @Override // c1.r
    public void j() {
        if (this.f58825k) {
            if (this.f58827m > 0) {
                this.f58828n += r0 / this.f26785b.f26783d;
            }
            this.f58827m = 0;
        }
    }

    @Override // c1.r
    public void k() {
        this.endBuffer = e1.Z.EMPTY_BYTE_ARRAY;
    }

    public long m() {
        return this.f58828n;
    }

    public void n() {
        this.f58828n = 0L;
    }

    public void o(int i10, int i11) {
        this.f58823i = i10;
        this.f58824j = i11;
    }
}
