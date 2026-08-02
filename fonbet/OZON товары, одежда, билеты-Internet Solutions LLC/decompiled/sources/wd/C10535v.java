package wd;

import java.util.LinkedHashSet;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9836b;

/* renamed from: wd.v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C10535v extends Vd.m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LinkedHashSet f104339a;

    C10535v(LinkedHashSet linkedHashSet) {
        this.f104339a = linkedHashSet;
    }

    private static /* synthetic */ void d(int i11) {
        Object[] objArr = new Object[3];
        if (i11 == 1) {
            objArr[0] = "fromSuper";
        } else if (i11 != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i11 == 1 || i11 == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // Vd.m
    public final void a(@NotNull InterfaceC9836b interfaceC9836b) {
        if (interfaceC9836b == null) {
            d(0);
            throw null;
        }
        Vd.n.t(interfaceC9836b, null);
        this.f104339a.add(interfaceC9836b);
    }

    @Override // Vd.m
    protected final void b(@NotNull InterfaceC9836b interfaceC9836b, @NotNull InterfaceC9836b interfaceC9836b2) {
        if (interfaceC9836b2 != null) {
            return;
        }
        d(2);
        throw null;
    }
}
