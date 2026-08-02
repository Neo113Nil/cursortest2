package ud;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ud.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10037o implements InterfaceC10030h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<InterfaceC10030h> f100660a;

    /* JADX WARN: Multi-variable type inference failed */
    public C10037o(@NotNull List<? extends InterfaceC10030h> delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f100660a = delegates;
    }

    @Override // ud.InterfaceC10030h
    public final boolean K0(@NotNull Sd.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Iterator<Object> it = C7714v.w(this.f100660a).iterator();
        while (it.hasNext()) {
            if (((InterfaceC10030h) it.next()).K0(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // ud.InterfaceC10030h
    public final boolean isEmpty() {
        List<InterfaceC10030h> list = this.f100660a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC10030h) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<InterfaceC10025c> iterator() {
        return kotlin.sequences.l.m(C7714v.w(this.f100660a), C10036n.f100659a).iterator();
    }

    @Override // ud.InterfaceC10030h
    public final InterfaceC10025c j(@NotNull Sd.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return (InterfaceC10025c) kotlin.sequences.l.l(kotlin.sequences.l.w(C7714v.w(this.f100660a), new C10035m(fqName)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10037o(@NotNull InterfaceC10030h... delegates) {
        this((List<? extends InterfaceC10030h>) C7705l.f0(delegates));
        Intrinsics.checkNotNullParameter(delegates, "delegates");
    }
}
