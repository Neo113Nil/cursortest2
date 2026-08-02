package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ea2 extends yr4 {
    @Override // defpackage.yr4
    public final Object e(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        byteBuffer.clear();
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        return byteBuffer;
    }

    @Override // defpackage.yr4
    public final Object h() {
        ByteBuffer allocate = ByteBuffer.allocate(4098);
        allocate.getClass();
        return allocate;
    }

    @Override // defpackage.yr4
    public final void m(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        byteBuffer.getClass();
        if (byteBuffer.capacity() != 4098) {
            a70.r("Check failed.");
        } else if (byteBuffer.isDirect()) {
            a70.r("Check failed.");
        }
    }
}
