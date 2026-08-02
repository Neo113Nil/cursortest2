package ru.ozon.android.messenger.framework.composer.configuration;

import j10.InterfaceC7238a;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.t;
import l10.v;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.composer.screen.d f86628a;

    public e(@NotNull ru.ozon.android.messenger.framework.composer.screen.d fragmentController) {
        Intrinsics.checkNotNullParameter(fragmentController, "fragmentController");
        this.f86628a = fragmentController;
    }

    @NotNull
    public final InterfaceC7238a<l> a() {
        return this.f86628a.e();
    }

    @NotNull
    public final InterfaceC7851b b() {
        return this.f86628a.g();
    }

    @NotNull
    public final t c() {
        return this.f86628a.i();
    }

    @NotNull
    public final v d() {
        return this.f86628a.j();
    }
}
