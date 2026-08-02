package io.ktor.utils.io.jvm.javaio;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final g f49516a = new g();

    @Override // io.ktor.utils.io.jvm.javaio.e
    public void a(long j10) {
        c();
        throw new KotlinNothingValueException();
    }

    public final Void c() {
        throw new UnsupportedOperationException("Parking is prohibited on this thread. Most likely you are using blocking operation on the wrong thread/dispatcher that doesn't allow blocking. Consider wrapping you blocking code withContext(Dispatchers.IO) {...}.");
    }

    @Override // io.ktor.utils.io.jvm.javaio.e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(Thread token) {
        Intrinsics.checkNotNullParameter(token, "token");
        c.f49505a.b(token);
    }
}
