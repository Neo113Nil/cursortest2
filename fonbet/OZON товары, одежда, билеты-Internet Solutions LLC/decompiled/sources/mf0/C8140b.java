package mf0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import gf0.C6730b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lf0.C7955f;
import mf0.InterfaceC8141c;
import nf0.C8591a;
import org.jetbrains.annotations.NotNull;

/* renamed from: mf0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8140b implements InterfaceC8142d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x0<Object> f74833a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final M0<Object> f74834b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C8139a<InterfaceC8141c> f74835c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<InterfaceC8141c> f74836d;

    public C8140b() {
        x0<Object> a11 = O0.a(null);
        this.f74833a = a11;
        this.f74834b = C2399j.b(a11);
        C8139a<InterfaceC8141c> c8139a = new C8139a<>();
        this.f74835c = c8139a;
        this.f74836d = c8139a.a();
    }

    @Override // mf0.InterfaceC8142d
    public final void a() {
        this.f74835c.b(InterfaceC8141c.b.f74837a);
    }

    @Override // mf0.InterfaceC8142d
    public final void b(C7955f c7955f) {
        this.f74833a.setValue(c7955f);
    }

    @Override // mf0.InterfaceC8142d
    public final void c(@NotNull C6730b destination, @NotNull Function1 optionsBuilder) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(optionsBuilder, "optionsBuilder");
        this.f74835c.b(new InterfaceC8141c.i(destination, optionsBuilder));
    }

    @Override // mf0.InterfaceC8142d
    @NotNull
    public final InterfaceC2395h<InterfaceC8141c> d() {
        return this.f74836d;
    }

    public final void e(@NotNull String deeplink, @NotNull Function1<? super C8591a, Unit> optionsBuilder) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(optionsBuilder, "optionsBuilder");
        this.f74835c.b(new InterfaceC8141c.d(deeplink, optionsBuilder));
    }
}
