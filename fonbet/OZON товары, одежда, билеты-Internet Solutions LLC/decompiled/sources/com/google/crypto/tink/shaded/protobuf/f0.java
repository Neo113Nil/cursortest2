package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C5899e;
import java.io.IOException;

/* loaded from: classes.dex */
interface f0<T> {
    void a(T t2, byte[] bArr, int i11, int i12, C5899e.a aVar) throws IOException;

    void b(Object obj, C5905k c5905k, C5910p c5910p) throws IOException;

    boolean c(AbstractC5917x abstractC5917x, AbstractC5917x abstractC5917x2);

    int d(AbstractC5917x abstractC5917x);

    int e(AbstractC5895a abstractC5895a);

    void f(T t2, t0 t0Var) throws IOException;

    boolean isInitialized(T t2);

    void makeImmutable(T t2);

    void mergeFrom(T t2, T t11);

    T newInstance();
}
