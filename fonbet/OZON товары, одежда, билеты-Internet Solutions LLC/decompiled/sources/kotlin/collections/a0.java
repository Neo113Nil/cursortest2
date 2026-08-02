package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.AbstractC7696c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a0<E> extends AbstractC7696c<E> implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<E> f71704b;

    /* renamed from: c, reason: collision with root package name */
    private int f71705c;

    /* renamed from: d, reason: collision with root package name */
    private int f71706d;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(@NotNull List<? extends E> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f71704b = list;
    }

    public final void b(int i11, int i12) {
        AbstractC7696c.Companion companion = AbstractC7696c.INSTANCE;
        int size = this.f71704b.size();
        companion.getClass();
        AbstractC7696c.Companion.c(i11, i12, size);
        this.f71705c = i11;
        this.f71706d = i12 - i11;
    }

    @Override // java.util.List
    public final E get(int i11) {
        AbstractC7696c.Companion companion = AbstractC7696c.INSTANCE;
        int i12 = this.f71706d;
        companion.getClass();
        AbstractC7696c.Companion.a(i11, i12);
        return this.f71704b.get(this.f71705c + i11);
    }

    @Override // kotlin.collections.AbstractC7694a
    public final int getSize() {
        return this.f71706d;
    }
}
