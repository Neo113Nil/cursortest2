package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.sequences.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7743c<T, K> implements Sequence<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.collections.F f71901a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<T, K> f71902b;

    public C7743c(@NotNull kotlin.collections.F source, @NotNull Function1 keySelector) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        this.f71901a = source;
        this.f71902b = keySelector;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator<T> iterator() {
        return new C7742b(this.f71901a.iterator(), this.f71902b);
    }
}
