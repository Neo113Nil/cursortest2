package D8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public class m extends f {
    public m(i iVar, d dVar, int i10) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(dVar.f2579a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f2592a = iVar.A0(allocate, dVar.f2582d + (i10 * dVar.f2585g) + 44);
    }
}
