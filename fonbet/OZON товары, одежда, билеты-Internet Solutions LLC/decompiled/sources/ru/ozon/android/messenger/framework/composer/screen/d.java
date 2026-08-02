package ru.ozon.android.messenger.framework.composer.screen;

import WZ.l;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.z0;
import j10.InterfaceC7238a;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.f;
import l10.r;
import l10.t;
import l10.v;
import n20.i;
import org.jetbrains.annotations.NotNull;
import s10.InterfaceC9582a;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f86774a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final e f86775b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final t f86776c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final r f86777d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Set<i> f86778e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final l10.f f86779f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Sg.a f86780g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final l f86781h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC9582a f86782i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final QZ.a<ru.ozon.composer.ui.widget.l> f86783j;

    public d(@NotNull b fragment, @NotNull e config, @NotNull t ownerContainer, @NotNull r viewModelOwnerProvider, @NotNull Set widgets, @NotNull f.e displayMode, @NotNull Set interceptors, @NotNull E00.a errorStateFactory, @NotNull C00.a initialWidgetsProvider) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(ownerContainer, "ownerContainer");
        Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        Intrinsics.checkNotNullParameter(displayMode, "displayMode");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(errorStateFactory, "errorStateFactory");
        Intrinsics.checkNotNullParameter(initialWidgetsProvider, "initialWidgetsProvider");
        this.f86774a = fragment;
        this.f86775b = config;
        this.f86776c = ownerContainer;
        this.f86777d = viewModelOwnerProvider;
        this.f86778e = widgets;
        ru.ozon.android.messenger.framework.composer.di.component.e d02 = ((ru.ozon.android.messenger.framework.composer.viewmodel.c) new z0(viewModelOwnerProvider.a(), new c(this)).a(ru.ozon.android.messenger.framework.composer.viewmodel.c.class)).d0();
        l10.f a11 = d02.getComposerScreenFactory().a(config, ownerContainer, viewModelOwnerProvider, displayMode, interceptors, errorStateFactory, initialWidgetsProvider);
        this.f86779f = a11;
        this.f86780g = d02.getAnalyticsScreenStorage();
        this.f86781h = d02.getTokenizedAnalytics();
        InterfaceC9582a b11 = a11.b();
        this.f86782i = b11;
        this.f86783j = b11.getComposer();
    }

    @NotNull
    public final l10.i b(@NotNull LayoutInflater inflater, ViewGroup viewGroup) {
        Function1<? super l10.i, Unit> function1;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        int i11 = l10.f.f72305d;
        function1 = l10.i.f72379g0;
        return this.f86779f.d(inflater, viewGroup, function1);
    }

    @NotNull
    public final Sg.a c() {
        return this.f86780g;
    }

    @NotNull
    public final QZ.a<ru.ozon.composer.ui.widget.l> d() {
        return this.f86783j;
    }

    @NotNull
    public final InterfaceC7238a<ru.ozon.composer.ui.widget.l> e() {
        return this.f86783j.r();
    }

    @NotNull
    public final e f() {
        return this.f86775b;
    }

    @NotNull
    public final InterfaceC7851b g() {
        return this.f86782i.getComposerController();
    }

    @NotNull
    public final b h() {
        return this.f86774a;
    }

    @NotNull
    public final t i() {
        return this.f86776c;
    }

    @NotNull
    public final v j() {
        return this.f86777d;
    }
}
