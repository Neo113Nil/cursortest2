package D8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public class g extends d {

    /* renamed from: j, reason: collision with root package name */
    public final i f2593j;

    public g(boolean z10, i iVar) {
        this.f2579a = z10;
        this.f2593j = iVar;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(z10 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f2580b = iVar.U(allocate, 16L);
        this.f2581c = iVar.A0(allocate, 28L);
        this.f2582d = iVar.A0(allocate, 32L);
        this.f2583e = iVar.U(allocate, 42L);
        this.f2584f = iVar.U(allocate, 44L);
        this.f2585g = iVar.U(allocate, 46L);
        this.f2586h = iVar.U(allocate, 48L);
        this.f2587i = iVar.U(allocate, 50L);
    }

    @Override // D8.d
    public c a(long j10, int i10) {
        return new a(this.f2593j, this, j10, i10);
    }

    @Override // D8.d
    public e b(long j10) {
        return new j(this.f2593j, this, j10);
    }

    @Override // D8.d
    public f c(int i10) {
        return new l(this.f2593j, this, i10);
    }
}
