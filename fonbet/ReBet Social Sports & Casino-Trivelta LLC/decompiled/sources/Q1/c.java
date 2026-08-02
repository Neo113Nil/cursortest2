package Q1;

import b1.C2334C;
import e1.AbstractC4134a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class c implements a {
    @Override // Q1.a
    public final C2334C a(b bVar) {
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC4134a.e(bVar.f54108d);
        AbstractC4134a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(bVar, byteBuffer);
    }

    public abstract C2334C b(b bVar, ByteBuffer byteBuffer);
}
