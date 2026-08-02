package v5;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.I;
import androidx.lifecycle.J;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import x5.InterfaceC10659c;
import xe.B0;

/* renamed from: v5.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10246t implements InterfaceC10241o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final l5.i f102280a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10234h f102281b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC10659c<?> f102282c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AbstractC5434v f102283d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final B0 f102284e;

    public C10246t(@NotNull l5.i iVar, @NotNull C10234h c10234h, @NotNull InterfaceC10659c interfaceC10659c, @NotNull AbstractC5434v abstractC5434v, @NotNull B0 b02) {
        this.f102280a = iVar;
        this.f102281b = c10234h;
        this.f102282c = interfaceC10659c;
        this.f102283d = abstractC5434v;
        this.f102284e = b02;
    }

    public final void a() {
        this.f102284e.j(null);
        InterfaceC10659c<?> interfaceC10659c = this.f102282c;
        boolean z11 = interfaceC10659c instanceof I;
        AbstractC5434v abstractC5434v = this.f102283d;
        if (z11) {
            abstractC5434v.e((I) interfaceC10659c);
        }
        abstractC5434v.e(this);
    }

    public final void b() {
        this.f102280a.a(this.f102281b);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View] */
    @Override // v5.InterfaceC10241o
    public final void o0() {
        InterfaceC10659c<?> interfaceC10659c = this.f102282c;
        if (interfaceC10659c.getView().isAttachedToWindow()) {
            return;
        }
        A5.k.d(interfaceC10659c.getView()).c(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View] */
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(@NotNull J j11) {
        A5.k.d(this.f102282c.getView()).a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    @Override // v5.InterfaceC10241o
    public final void start() {
        AbstractC5434v abstractC5434v = this.f102283d;
        abstractC5434v.a(this);
        InterfaceC10659c<?> interfaceC10659c = this.f102282c;
        if (interfaceC10659c instanceof I) {
            I i11 = (I) interfaceC10659c;
            abstractC5434v.e(i11);
            abstractC5434v.a(i11);
        }
        A5.k.d(interfaceC10659c.getView()).c(this);
    }
}
