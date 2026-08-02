package ne0;

import De.C2862e;
import android.content.Context;
import android.view.ViewGroup;
import ce0.InterfaceC5817a;
import kotlin.jvm.internal.Intrinsics;
import oe0.o;
import org.jetbrains.annotations.NotNull;
import pe0.AbstractC8905a;
import pe0.C8915k;
import ze0.InterfaceC11117a;

/* renamed from: ne0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8582a implements InterfaceC8585d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final o f77079a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C8915k f77080b;

    public AbstractC8582a(@NotNull Context context, @NotNull C2862e coroutineScope, @NotNull ViewGroup mapView, @NotNull InterfaceC11117a projectionController, @NotNull InterfaceC5817a cameraController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(projectionController, "projectionController");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        o oVar = new o(context, coroutineScope);
        this.f77079a = oVar;
        this.f77080b = new C8915k(mapView, projectionController, oVar, coroutineScope, cameraController);
    }

    public final void b() {
        this.f77079a.d();
        e().b();
    }

    @NotNull
    public final o c() {
        return this.f77079a;
    }

    @NotNull
    protected final C8915k d() {
        return this.f77080b;
    }

    @NotNull
    public abstract AbstractC8905a<?> e();
}
