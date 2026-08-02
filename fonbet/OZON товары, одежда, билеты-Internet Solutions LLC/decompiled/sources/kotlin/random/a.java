package kotlin.random;

import java.util.Random;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/random/a;", "Lkotlin/random/c;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class a extends c {
    @Override // kotlin.random.c
    public final int b(int i11) {
        return ((-i11) >> 31) & (i().nextInt() >>> (32 - i11));
    }

    @Override // kotlin.random.c
    public final int d() {
        return i().nextInt();
    }

    @Override // kotlin.random.c
    public final int e(int i11) {
        return i().nextInt(i11);
    }

    @Override // kotlin.random.c
    public final long g() {
        return i().nextLong();
    }

    @NotNull
    public abstract Random i();
}
