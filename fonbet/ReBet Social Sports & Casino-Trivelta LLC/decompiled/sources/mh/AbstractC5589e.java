package mh;

import kotlin.jvm.internal.Intrinsics;
import mh.f;

/* renamed from: mh.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5589e implements f {
    @Override // mh.f
    public void O1(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        f.a.a(this);
    }

    @Override // mh.f
    public void dispose() {
    }
}
