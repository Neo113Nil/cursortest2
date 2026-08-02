package ud;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ud.InterfaceC10030h;

/* renamed from: ud.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10031i implements InterfaceC10030h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<InterfaceC10025c> f100652a;

    /* JADX WARN: Multi-variable type inference failed */
    public C10031i(@NotNull List<? extends InterfaceC10025c> annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        this.f100652a = annotations;
    }

    @Override // ud.InterfaceC10030h
    public final boolean K0(@NotNull Sd.c cVar) {
        return InterfaceC10030h.b.b(this, cVar);
    }

    @Override // ud.InterfaceC10030h
    public final boolean isEmpty() {
        return this.f100652a.isEmpty();
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<InterfaceC10025c> iterator() {
        return this.f100652a.iterator();
    }

    @Override // ud.InterfaceC10030h
    public final InterfaceC10025c j(@NotNull Sd.c cVar) {
        return InterfaceC10030h.b.a(this, cVar);
    }

    @NotNull
    public final String toString() {
        return this.f100652a.toString();
    }
}
