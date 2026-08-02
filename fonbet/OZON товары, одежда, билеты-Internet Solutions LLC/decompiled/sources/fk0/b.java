package fk0;

import java.util.LinkedList;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b<V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedList f63626a;

    /* renamed from: b, reason: collision with root package name */
    private int f63627b;

    public b() {
        this(null);
    }

    public final boolean a(@NotNull V item) {
        Intrinsics.checkNotNullParameter(item, "item");
        LinkedList linkedList = this.f63626a;
        if (linkedList.size() >= this.f63627b) {
            return false;
        }
        return linkedList.add(item);
    }

    public final void b() {
        this.f63626a.clear();
    }

    public final V c() {
        return (V) C7714v.v0(this.f63626a);
    }

    public final int d() {
        return this.f63627b;
    }

    public final int e() {
        return this.f63626a.size();
    }

    public final void f(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Negative size is not supported");
        }
        while (true) {
            LinkedList linkedList = this.f63626a;
            if (linkedList.size() <= i11) {
                this.f63627b = i11;
                return;
            }
            linkedList.remove(C7714v.P(linkedList));
        }
    }

    public b(Object obj) {
        LinkedList scrapHeap = new LinkedList();
        Intrinsics.checkNotNullParameter(scrapHeap, "scrapHeap");
        this.f63626a = scrapHeap;
        this.f63627b = 5;
    }
}
