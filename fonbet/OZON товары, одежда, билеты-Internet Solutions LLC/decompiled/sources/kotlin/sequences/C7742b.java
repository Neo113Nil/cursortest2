package kotlin.sequences;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.collections.AbstractC7695b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.sequences.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C7742b<T, K> extends AbstractC7695b<T> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Iterator<T> f71898c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<T, K> f71899d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final HashSet<K> f71900e;

    /* JADX WARN: Multi-variable type inference failed */
    public C7742b(@NotNull Iterator<? extends T> source, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        this.f71898c = source;
        this.f71899d = keySelector;
        this.f71900e = new HashSet<>();
    }

    @Override // kotlin.collections.AbstractC7695b
    protected final void b() {
        T next;
        do {
            Iterator<T> it = this.f71898c;
            if (!it.hasNext()) {
                c();
                return;
            } else {
                next = it.next();
            }
        } while (!this.f71900e.add(this.f71899d.invoke(next)));
        e(next);
    }
}
