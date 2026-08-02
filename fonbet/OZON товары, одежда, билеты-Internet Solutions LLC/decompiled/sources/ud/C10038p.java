package ud;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ud.p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10038p implements InterfaceC10030h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC10030h f100661a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<Sd.c, Boolean> f100662b;

    public C10038p() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10038p(@NotNull InterfaceC10030h delegate, @NotNull Function1<? super Sd.c, Boolean> fqNameFilter) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(fqNameFilter, "fqNameFilter");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(fqNameFilter, "fqNameFilter");
        this.f100661a = delegate;
        this.f100662b = fqNameFilter;
    }

    @Override // ud.InterfaceC10030h
    public final boolean K0(@NotNull Sd.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (this.f100662b.invoke(fqName).booleanValue()) {
            return this.f100661a.K0(fqName);
        }
        return false;
    }

    @Override // ud.InterfaceC10030h
    public final boolean isEmpty() {
        InterfaceC10030h interfaceC10030h = this.f100661a;
        if ((interfaceC10030h instanceof Collection) && ((Collection) interfaceC10030h).isEmpty()) {
            return false;
        }
        Iterator<InterfaceC10025c> it = interfaceC10030h.iterator();
        while (it.hasNext()) {
            Sd.c c11 = it.next().c();
            if (c11 != null && this.f100662b.invoke(c11).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<InterfaceC10025c> iterator() {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC10025c interfaceC10025c : this.f100661a) {
            Sd.c c11 = interfaceC10025c.c();
            if (c11 != null && this.f100662b.invoke(c11).booleanValue()) {
                arrayList.add(interfaceC10025c);
            }
        }
        return arrayList.iterator();
    }

    @Override // ud.InterfaceC10030h
    public final InterfaceC10025c j(@NotNull Sd.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (this.f100662b.invoke(fqName).booleanValue()) {
            return this.f100661a.j(fqName);
        }
        return null;
    }
}
