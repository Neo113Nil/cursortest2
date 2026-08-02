package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Sb implements Pb, ToggleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12867a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f12868b = C0353na.k().w().b();

    /* renamed from: c, reason: collision with root package name */
    public Kn f12869c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12870d;

    public final void a(@Nullable Toggle toggle) {
        Kn kn = new Kn(toggle);
        this.f12869c = kn;
        kn.f12490c.registerObserver(this, true);
    }

    public final void b(@NotNull Object obj) {
        Kn kn = this.f12869c;
        if (kn == null) {
            Intrinsics.throwUninitializedPropertyAccessException("togglesHolder");
            kn = null;
        }
        kn.f12489b.b(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
    public final void onStateChanged(boolean z5) {
        this.f12868b.execute(new com.google.android.material.internal.b(this, z5, 1));
    }

    public final void a(@NotNull LocationControllerObserver locationControllerObserver, boolean z5) {
        this.f12868b.execute(new com.logrocket.core.l(1, this, locationControllerObserver, z5));
    }

    public static final void a(Sb sb2, LocationControllerObserver locationControllerObserver, boolean z5) {
        sb2.f12867a.add(locationControllerObserver);
        if (z5) {
            if (sb2.f12870d) {
                locationControllerObserver.startLocationTracking();
            } else {
                locationControllerObserver.stopLocationTracking();
            }
        }
    }

    public static final void a(Sb sb2, boolean z5) {
        if (sb2.f12870d != z5) {
            sb2.f12870d = z5;
            Function1 function1 = z5 ? Qb.f12772a : Rb.f12814a;
            Iterator it = sb2.f12867a.iterator();
            while (it.hasNext()) {
                function1.invoke((LocationControllerObserver) it.next());
            }
        }
    }

    public final void a(@NotNull Object obj) {
        Kn kn = this.f12869c;
        if (kn == null) {
            Intrinsics.throwUninitializedPropertyAccessException("togglesHolder");
            kn = null;
        }
        kn.f12489b.a(obj);
    }

    public final void a(boolean z5) {
        Kn kn = this.f12869c;
        if (kn == null) {
            Intrinsics.throwUninitializedPropertyAccessException("togglesHolder");
            kn = null;
        }
        kn.f12488a.a(z5);
    }
}
