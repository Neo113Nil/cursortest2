package iZ;

import Ae.O0;
import Ae.x0;
import kZ.C7620a;
import kotlin.jvm.internal.Intrinsics;
import mZ.C8117b;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

/* renamed from: iZ.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C7036c implements InterfaceC7034a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f66192a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final He.c f66193b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final x0<Boolean> f66194c;

    /* renamed from: iZ.c$a */
    public interface a {
        @NotNull
        C7036c a(@NotNull x0 x0Var, @NotNull f fVar, @NotNull He.c cVar);
    }

    public C7036c(@NotNull C7620a timerFactory, @NotNull x0 configFlow, @NotNull f popReachabilityRepository, @NotNull He.c coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(timerFactory, "timerFactory");
        Intrinsics.checkNotNullParameter(configFlow, "configFlow");
        Intrinsics.checkNotNullParameter(popReachabilityRepository, "popReachabilityRepository");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        this.f66192a = popReachabilityRepository;
        this.f66193b = coroutineDispatcher;
        this.f66194c = O0.a(Boolean.FALSE);
        C10727i.c(C8117b.a(), coroutineDispatcher, null, new C7035b(configFlow, this, timerFactory, null), 2);
    }

    @Override // iZ.InterfaceC7034a
    public final void a() {
        this.f66194c.tryEmit(Boolean.TRUE);
    }
}
