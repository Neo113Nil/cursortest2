package xe0;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.C10544C;
import we0.u;
import we0.z;
import xe.C10727i;
import xe.C10749t0;
import xe.M;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final M f105536a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x0<C10544C> f105537b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayList f105538c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final M0<C10544C> f105539d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final x0<C10544C> f105540e;

    public j() {
        this(0);
    }

    public final void b() {
        C10727i.c(this.f105536a, null, null, new i(this, null), 3);
        Iterator it = this.f105538c.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
    }

    @NotNull
    public final z c(@NotNull u placemark) {
        Intrinsics.checkNotNullParameter(placemark, "placemark");
        this.f105537b.getValue();
        return placemark.d();
    }

    @NotNull
    public final M0<C10544C> d() {
        return this.f105539d;
    }

    @NotNull
    public final x0<C10544C> e() {
        return this.f105540e;
    }

    public final void f(@NotNull Function0 disposeCallback) {
        Intrinsics.checkNotNullParameter(disposeCallback, "disposeCallback");
        this.f105538c.add(disposeCallback);
    }

    public j(int i11) {
        C10749t0 coroutineScope = C10749t0.f105499a;
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f105536a = coroutineScope;
        x0<C10544C> a11 = O0.a(null);
        this.f105537b = a11;
        this.f105538c = new ArrayList();
        this.f105539d = C2399j.b(a11);
        this.f105540e = O0.a(null);
    }
}
