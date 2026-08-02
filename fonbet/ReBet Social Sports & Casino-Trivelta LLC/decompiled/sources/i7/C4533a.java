package i7;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4533a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public int f48137a;

    /* renamed from: b, reason: collision with root package name */
    public final H6.a f48138b;

    public C4533a(int i10, H6.a bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f48137a = i10;
        this.f48138b = bitmap;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f48138b.close();
    }

    public final H6.a d() {
        return this.f48138b;
    }

    public final boolean isValid() {
        return this.f48138b.isValid();
    }

    public final int k() {
        return this.f48137a;
    }
}
