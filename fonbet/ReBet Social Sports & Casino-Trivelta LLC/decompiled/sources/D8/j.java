package D8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public class j extends e {
    public j(i iVar, d dVar, long j10) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(dVar.f2579a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = dVar.f2581c + (j10 * dVar.f2583e);
        this.f2588a = iVar.A0(allocate, j11);
        this.f2589b = iVar.A0(allocate, 4 + j11);
        this.f2590c = iVar.A0(allocate, 8 + j11);
        this.f2591d = iVar.A0(allocate, j11 + 20);
    }
}
