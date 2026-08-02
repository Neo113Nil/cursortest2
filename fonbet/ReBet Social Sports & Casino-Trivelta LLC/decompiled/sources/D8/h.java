package D8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public class h extends d {

    /* renamed from: j, reason: collision with root package name */
    public final i f2594j;

    public h(boolean z10, i iVar) {
        this.f2579a = z10;
        this.f2594j = iVar;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(z10 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f2580b = iVar.U(allocate, 16L);
        this.f2581c = iVar.w0(allocate, 32L);
        this.f2582d = iVar.w0(allocate, 40L);
        this.f2583e = iVar.U(allocate, 54L);
        this.f2584f = iVar.U(allocate, 56L);
        this.f2585g = iVar.U(allocate, 58L);
        this.f2586h = iVar.U(allocate, 60L);
        this.f2587i = iVar.U(allocate, 62L);
    }

    @Override // D8.d
    public c a(long j10, int i10) {
        return new b(this.f2594j, this, j10, i10);
    }

    @Override // D8.d
    public e b(long j10) {
        return new k(this.f2594j, this, j10);
    }

    @Override // D8.d
    public f c(int i10) {
        return new m(this.f2594j, this, i10);
    }
}
