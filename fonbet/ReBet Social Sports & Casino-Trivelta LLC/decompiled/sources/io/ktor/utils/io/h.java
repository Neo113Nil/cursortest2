package io.ktor.utils.io;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class h {
    public static final boolean a(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return fVar.cancel(null);
    }

    public static final Object b(f fVar, byte[] bArr, Continuation continuation) {
        return fVar.f(bArr, 0, bArr.length, continuation);
    }
}
