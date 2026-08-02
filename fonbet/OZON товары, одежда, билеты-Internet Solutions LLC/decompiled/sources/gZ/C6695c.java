package gZ;

import Ae.x0;
import Sc.InterfaceC4008j;
import Sc.n;
import aZ.C4983a;
import dZ.C6132a;
import iZ.C7036c;
import iZ.InterfaceC7034a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: gZ.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6695c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4983a f64170a;

    /* renamed from: b, reason: collision with root package name */
    private final C6132a f64171b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C7036c.a f64172c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f64173d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f64174e;

    public C6695c(@NotNull C4983a cdnChooserManager, C6132a c6132a, @NotNull C7036c.a popReachabilityInteractorFactory) {
        Intrinsics.checkNotNullParameter(cdnChooserManager, "cdnChooserManager");
        Intrinsics.checkNotNullParameter(popReachabilityInteractorFactory, "popReachabilityInteractorFactory");
        this.f64170a = cdnChooserManager;
        this.f64171b = c6132a;
        this.f64172c = popReachabilityInteractorFactory;
        this.f64173d = Sc.k.a(n.PUBLICATION, new C6694b(this));
        this.f64174e = Sc.k.b(new C6693a(this));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Sc.j, java.lang.Object] */
    public final void d() {
        this.f64170a.a((x0) this.f64174e.getValue());
        InterfaceC7034a interfaceC7034a = (InterfaceC7034a) this.f64173d.getValue();
        if (interfaceC7034a != null) {
            interfaceC7034a.a();
        }
    }

    @NotNull
    public final x0 e() {
        return (x0) this.f64174e.getValue();
    }
}
