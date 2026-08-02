package kotlin.collections;

import gd.InterfaceC6712a;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class O<T> implements Iterable<IndexedValue<? extends T>>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f71700a;

    /* JADX WARN: Multi-variable type inference failed */
    public O(@NotNull Function0<? extends Iterator<? extends T>> iteratorFactory) {
        Intrinsics.checkNotNullParameter(iteratorFactory, "iteratorFactory");
        this.f71700a = (AbstractC7737t) iteratorFactory;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<IndexedValue<T>> iterator() {
        return new P((Iterator) this.f71700a.invoke());
    }
}
