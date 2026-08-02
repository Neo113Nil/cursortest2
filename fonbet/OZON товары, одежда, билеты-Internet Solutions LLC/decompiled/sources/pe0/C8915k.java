package pe0;

import Ae.C0;
import Ae.C2399j;
import Ae.I0;
import Ae.M0;
import Ae.x0;
import De.C2862e;
import android.content.Context;
import android.view.ViewGroup;
import ce0.InterfaceC5817a;
import kotlin.jvm.internal.Intrinsics;
import oe0.o;
import org.jetbrains.annotations.NotNull;
import qe0.C9049d;
import re0.C9260c;
import se0.AbstractC9672a;
import we0.p;
import ze0.InterfaceC11117a;

/* renamed from: pe0.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8915k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ViewGroup f80483a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC11117a f80484b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final o f80485c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2862e f80486d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC5817a f80487e;

    public C8915k(@NotNull ViewGroup mapView, @NotNull InterfaceC11117a projectionController, @NotNull o locationProvider, @NotNull C2862e coroutineScope, @NotNull InterfaceC5817a cameraController) {
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(projectionController, "projectionController");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        this.f80483a = mapView;
        this.f80484b = projectionController;
        this.f80485c = locationProvider;
        this.f80486d = coroutineScope;
        this.f80487e = cameraController;
    }

    @NotNull
    public final C8914j a(@NotNull AbstractC9672a pulsingControl) {
        Intrinsics.checkNotNullParameter(pulsingControl, "pulsingControl");
        InterfaceC5817a interfaceC5817a = this.f80487e;
        C2862e c2862e = this.f80486d;
        C8907c c8907c = new C8907c(interfaceC5817a, c2862e);
        o oVar = this.f80485c;
        C9260c c9260c = new C9260c(c2862e, oVar, pulsingControl);
        C8908d c8908d = new C8908d(c2862e, oVar);
        x0<p> b11 = c8908d.b();
        ViewGroup viewGroup = this.f80483a;
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C9049d c9049d = new C9049d(b11, context, c2862e);
        C8912h c8912h = new C8912h(c9049d.b());
        C0 d11 = c8912h.d();
        int i11 = I0.f818a;
        I0 c11 = I0.a.c();
        p value = c9049d.b().getValue();
        if (value == null) {
            value = c8908d.b().getValue();
        }
        M0 M11 = C2399j.M(d11, c2862e, c11, value);
        Context context2 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return new C8914j(c8907c, c9260c, c8908d, c9049d, c8912h, M11, new C8913i(M11, context2, this.f80487e, this.f80484b, this.f80486d, this.f80483a));
    }
}
