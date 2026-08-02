package he;

import ie.InterfaceC7061j;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ud.InterfaceC10025c;
import ud.InterfaceC10030h;

/* renamed from: he.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6931a implements InterfaceC10030h {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f65415b = {N.h(new kotlin.jvm.internal.E(N.b(C6931a.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j f65416a;

    public C6931a(@NotNull ie.o storageManager, @NotNull Function0<? extends List<? extends InterfaceC10025c>> compute) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f65416a = storageManager.a(compute);
    }

    @Override // ud.InterfaceC10030h
    public final boolean K0(@NotNull Sd.c cVar) {
        return InterfaceC10030h.b.b(this, cVar);
    }

    @Override // ud.InterfaceC10030h
    public boolean isEmpty() {
        return ((List) ie.n.a(this.f65416a, f65415b[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<InterfaceC10025c> iterator() {
        return ((List) ie.n.a(this.f65416a, f65415b[0])).iterator();
    }

    @Override // ud.InterfaceC10030h
    public final InterfaceC10025c j(@NotNull Sd.c cVar) {
        return InterfaceC10030h.b.a(this, cVar);
    }
}
