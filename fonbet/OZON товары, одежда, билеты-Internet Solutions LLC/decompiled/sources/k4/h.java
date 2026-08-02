package k4;

import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public abstract class h extends s3.h<m, n, k> implements j {
    @Override // k4.j
    public final void d(long j11) {
    }

    @Override // s3.h
    protected final m h() {
        return new m();
    }

    @Override // s3.h
    protected final n i() {
        return new g(this);
    }

    @Override // s3.h
    protected final k j(Throwable th2) {
        return new k("Unexpected decode error", th2);
    }

    @Override // s3.h
    protected final k k(m mVar, n nVar, boolean z11) {
        m mVar2 = mVar;
        n nVar2 = nVar;
        try {
            ByteBuffer byteBuffer = mVar2.f98184d;
            byteBuffer.getClass();
            nVar2.o(mVar2.f98186f, r(byteBuffer.array(), byteBuffer.limit(), z11), mVar2.f70471i);
            nVar2.f98190c = false;
            return null;
        } catch (k e11) {
            return e11;
        }
    }

    protected abstract i r(byte[] bArr, int i11, boolean z11) throws k;
}
