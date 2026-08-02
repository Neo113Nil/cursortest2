package jd;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljd/a;", "Lkotlin/random/a;", "<init>", "()V", "kotlin-stdlib-jdk8"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jd.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7347a extends kotlin.random.a {
    @Override // kotlin.random.c
    public final int f(int i11, int i12) {
        return ThreadLocalRandom.current().nextInt(i11, i12);
    }

    @Override // kotlin.random.c
    public final long h(long j11, long j12) {
        return ThreadLocalRandom.current().nextLong(j11, j12);
    }

    @Override // kotlin.random.a
    @NotNull
    public final Random i() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        Intrinsics.checkNotNullExpressionValue(current, "current(...)");
        return current;
    }
}
