package je;

import ie.InterfaceC7061j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class U extends M0 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ie.o f69861b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<N> f69862c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j<N> f69863d;

    /* JADX WARN: Multi-variable type inference failed */
    public U(@NotNull ie.o storageManager, @NotNull Function0<? extends N> computation) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(computation, "computation");
        this.f69861b = storageManager;
        this.f69862c = computation;
        this.f69863d = storageManager.a(computation);
    }

    static N N0(ke.h hVar, U u11) {
        return hVar.a(u11.f69862c.invoke());
    }

    @Override // je.N
    public final N J0(ke.h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new U(this.f69861b, new T(kotlinTypeRefiner, this));
    }

    @Override // je.M0
    @NotNull
    protected final N L0() {
        return this.f69863d.invoke();
    }

    @Override // je.M0
    public final boolean M0() {
        return this.f69863d.i();
    }
}
