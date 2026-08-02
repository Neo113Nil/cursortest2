package kotlin.ranges;

import kd.InterfaceC7664c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/b;", "Lkotlin/ranges/a;", "Lkd/c;", "", "", "e", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b extends a implements InterfaceC7664c<Character> {
    static {
        new b((char) 1, (char) 0);
    }

    @Override // kd.InterfaceC7664c
    public final Character e() {
        return Character.valueOf(getF71834b());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (isEmpty() && ((b) obj).isEmpty()) {
            return true;
        }
        b bVar = (b) obj;
        return getF71833a() == bVar.getF71833a() && getF71834b() == bVar.getF71834b();
    }

    @Override // kd.InterfaceC7664c
    public final Character getStart() {
        return Character.valueOf(getF71833a());
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return getF71834b() + (getF71833a() * 31);
    }

    @Override // kd.InterfaceC7664c
    public final boolean isEmpty() {
        return Intrinsics.i(getF71833a(), getF71834b()) > 0;
    }

    @NotNull
    public final String toString() {
        return getF71833a() + ".." + getF71834b();
    }
}
