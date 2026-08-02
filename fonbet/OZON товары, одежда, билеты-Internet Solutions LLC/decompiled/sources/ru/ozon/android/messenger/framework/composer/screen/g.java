package ru.ozon.android.messenger.framework.composer.screen;

import Cd.C2749j;
import Sc.InterfaceC4008j;
import Sc.k;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import l10.f;
import l10.r;
import l10.t;
import l10.u;
import m20.InterfaceC8046a;
import n20.C8425e;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.screen.e;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final K00.a f86808a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C8425e<InterfaceC8046a<?, ? extends l20.c>> f86809b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.composer.issue.a f86810c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final RZ.a f86811d;

    public g(@NotNull K00.a network, @NotNull C8425e<InterfaceC8046a<?, ? extends l20.c>> widgetStore, @NotNull ru.ozon.android.messenger.framework.composer.issue.a pageIssueFactory, @NotNull RZ.a analytics) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
        Intrinsics.checkNotNullParameter(pageIssueFactory, "pageIssueFactory");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f86808a = network;
        this.f86809b = widgetStore;
        this.f86810c = pageIssueFactory;
        this.f86811d = analytics;
    }

    @NotNull
    public final l10.f a(@NotNull e config, @NotNull t container, @NotNull r viewModelOwnerProvider, @NotNull f.e displayMode, @NotNull Set interceptors, @NotNull E00.a errorStateFactory, @NotNull C00.a initialWidgetsProvider) {
        e.a d11;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(container, "ownerContainer");
        Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        Intrinsics.checkNotNullParameter(displayMode, "displayMode");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(errorStateFactory, "errorStateFactory");
        Intrinsics.checkNotNullParameter(initialWidgetsProvider, "initialWidgetsProvider");
        InterfaceC4008j initialState = k.b(new f(config));
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        f.d dVar = new f.d(container.e(), viewModelOwnerProvider, initialState);
        dVar.a(this.f86811d);
        dVar.h0(this.f86808a);
        dVar.q0(this.f86809b);
        dVar.i0(this.f86810c);
        dVar.c(config.c());
        boolean z11 = false;
        f.d.n0(dVar, true, false, 6);
        dVar.b(config.b());
        if (config.d() == null && config.n()) {
            z11 = true;
        }
        dVar.o0(z11);
        dVar.i(displayMode);
        dVar.U(config.l());
        dVar.V(true);
        u k11 = config.k();
        if (k11 != null) {
            u.b bVar = null;
            if (config.d() != null && !config.d().h()) {
                k11 = null;
            }
            if (k11 != null) {
                u.b a11 = k11.a();
                if (a11 != null) {
                    int b11 = a11.b();
                    boolean d12 = a11.d();
                    String title = a11.getTitle();
                    Integer a12 = a11.a();
                    int ordinal = a11.e().ordinal();
                    u.c cVar = u.c.CENTER;
                    if (ordinal != cVar.ordinal()) {
                        cVar = u.c.LEFT;
                    }
                    bVar = new u.b(b11, d12, title, cVar, a12, 32);
                }
                dVar.p0(new u(bVar, k11.b()));
            }
        }
        if (displayMode == f.e.BOTTOM_SHEET_WRAP && (d11 = config.d()) != null) {
            dVar.g0(d11.d());
        }
        dVar.h(interceptors);
        dVar.g(errorStateFactory);
        dVar.R(initialWidgetsProvider);
        l10.f e11 = dVar.e();
        e11.c().getClass();
        C2749j.g();
        return e11;
    }
}
