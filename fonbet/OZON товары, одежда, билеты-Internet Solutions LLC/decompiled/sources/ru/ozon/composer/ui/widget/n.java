package ru.ozon.composer.ui.widget;

import WZ.s;
import WZ.t;
import android.os.Parcelable;
import f10.AbstractC6400a;
import h20.C6787b;
import h20.InterfaceC6786a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import m20.InterfaceC8046a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.h;

/* loaded from: classes7.dex */
public final class n extends AbstractC6400a<l> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final n20.k<? extends InterfaceC8046a<?, ?>> f94889b;

    /* renamed from: c, reason: collision with root package name */
    private final C6787b f94890c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final d f94891d;

    public n(@NotNull n20.k<? extends InterfaceC8046a<?, ?>> widgetStore, C6787b c6787b, @NotNull d trackingDataHolderCache) {
        Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
        Intrinsics.checkNotNullParameter(trackingDataHolderCache, "trackingDataHolderCache");
        this.f94889b = widgetStore;
        this.f94890c = c6787b;
        this.f94891d = trackingDataHolderCache;
    }

    @Override // f10.AbstractC6400a
    public final void b(@NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f94891d.c(info);
    }

    @Override // f10.AbstractC6400a
    public final void c(@NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f94891d.b(info);
    }

    @Override // f10.AbstractC6400a
    public final l d(Object state, l20.b viewItemInfo) {
        h hVar;
        Pc.a<? extends InterfaceC6786a> viewModelWidgetProvider;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(viewItemInfo, "viewItemInfo");
        InterfaceC8046a<?, ?> viewMapper = this.f94889b.getViewMapper(viewItemInfo.h());
        if (viewMapper == null) {
            throw new IllegalArgumentException(Nk.a.b("viewMapper must not be null for ", N.b(viewItemInfo.c().getClass()).B()).toString());
        }
        t tVar = null;
        e eVar = viewMapper instanceof e ? (e) viewMapper : null;
        if (eVar == null || (hVar = eVar.getWidgetSpan(state, viewItemInfo.c())) == null) {
            hVar = h.e.f94873b;
        }
        h hVar2 = hVar;
        W10.d a11 = this.f94891d.a(viewItemInfo.b());
        W10.c b11 = a11.b();
        T00.m c11 = viewItemInfo.b().c();
        long d11 = viewItemInfo.d();
        String j11 = c11.j();
        if (c11.n() && j11 != null && !kotlin.text.h.K(j11)) {
            Parcelable.Creator<t> creator = t.CREATOR;
            s.a aVar = new s.a();
            aVar.a("widget_view");
            String k11 = c11.k();
            if (k11 != null) {
                aVar.c(k11);
            }
            Unit unit = Unit.f71690a;
            aVar.l(j11);
            aVar.k(d11);
            tVar = t.a.a("view", aVar.b());
        }
        l lVar = new l(viewItemInfo, hVar2, a11, b11, tVar);
        C6787b c6787b = this.f94890c;
        if (c6787b != null && (viewMapper instanceof g) && (viewModelWidgetProvider = ((g) viewMapper).getViewModelWidgetProvider()) != null) {
            c6787b.c(lVar, viewModelWidgetProvider);
        }
        return lVar;
    }
}
