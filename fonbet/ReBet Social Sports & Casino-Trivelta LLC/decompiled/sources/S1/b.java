package S1;

import b1.C2334C;
import e1.AbstractC4134a;
import e1.J;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends Q1.c {
    @Override // Q1.c
    public C2334C b(Q1.b bVar, ByteBuffer byteBuffer) {
        return new C2334C(c(new J(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(J j10) {
        return new a((String) AbstractC4134a.e(j10.G()), (String) AbstractC4134a.e(j10.G()), j10.F(), j10.F(), Arrays.copyOfRange(j10.f(), j10.g(), j10.j()));
    }
}
