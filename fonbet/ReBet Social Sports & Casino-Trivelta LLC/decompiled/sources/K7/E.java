package K7;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class E implements G6.i {

    /* renamed from: a, reason: collision with root package name */
    public final B f6252a;

    /* renamed from: b, reason: collision with root package name */
    public final G6.l f6253b;

    public E(B pool, G6.l pooledByteStreams) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(pooledByteStreams, "pooledByteStreams");
        this.f6252a = pool;
        this.f6253b = pooledByteStreams;
    }

    public final D f(InputStream inputStream, F outputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        this.f6253b.a(inputStream, outputStream);
        return outputStream.d();
    }

    @Override // G6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public D a(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        F f10 = new F(this.f6252a, 0, 2, null);
        try {
            return f(inputStream, f10);
        } finally {
            f10.close();
        }
    }

    @Override // G6.i
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public D b(InputStream inputStream, int i10) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        F f10 = new F(this.f6252a, i10);
        try {
            return f(inputStream, f10);
        } finally {
            f10.close();
        }
    }

    @Override // G6.i
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public D d(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        F f10 = new F(this.f6252a, bytes.length);
        try {
            try {
                f10.write(bytes, 0, bytes.length);
                return f10.d();
            } catch (IOException e10) {
                throw D6.p.a(e10);
            }
        } finally {
            f10.close();
        }
    }

    @Override // G6.i
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public F c() {
        return new F(this.f6252a, 0, 2, null);
    }

    @Override // G6.i
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public F e(int i10) {
        return new F(this.f6252a, i10);
    }
}
