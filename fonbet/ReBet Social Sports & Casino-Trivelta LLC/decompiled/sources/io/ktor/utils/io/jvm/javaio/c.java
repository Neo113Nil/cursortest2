package io.ktor.utils.io.jvm.javaio;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final c f49505a = new c();

    @Override // io.ktor.utils.io.jvm.javaio.e
    public void a(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        LockSupport.parkNanos(j10);
    }

    @Override // io.ktor.utils.io.jvm.javaio.e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(Thread token) {
        Intrinsics.checkNotNullParameter(token, "token");
        LockSupport.unpark(token);
    }
}
