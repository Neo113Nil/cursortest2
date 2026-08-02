package x80;

import A30.m;
import H30.x;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import y80.InterfaceC10862a;

/* loaded from: classes3.dex */
public final class h implements InterfaceC10862a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f105130a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final S80.b f105131b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final R30.a f105132c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final m f105133d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC10862a.EnumC2293a f105134e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f105135f;

    public h(@NotNull m authInteractor, @NotNull R30.a appCoroutineScopes, @NotNull S80.b fintechNavigation, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings) {
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        Intrinsics.checkNotNullParameter(authInteractor, "authInteractor");
        this.f105130a = fintechSettings;
        this.f105131b = fintechNavigation;
        this.f105132c = appCoroutineScopes;
        this.f105133d = authInteractor;
        this.f105134e = InterfaceC10862a.EnumC2293a.OZON_WEB_AUTH_NEW_ARCH;
        this.f105135f = true;
    }

    @Override // y80.InterfaceC10862a
    public final boolean a(@NotNull String url, @NotNull Uri uri, @NotNull Uri baseBankUri) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(baseBankUri, "baseBankUri");
        boolean z11 = Intrinsics.d(uri.getScheme(), "ozon") && Intrinsics.d(uri.getAuthority(), "web") && Intrinsics.d(x.b(uri), "/auth") && this.f105130a.isStandAloneIntegration();
        L80.a.a("Interceptor", "Interceptor type=" + this.f105134e + " canProcess=" + z11 + " url=" + url);
        return z11;
    }

    @Override // y80.InterfaceC10862a
    public final void b(@NotNull String url, @NotNull Uri uri, @NotNull Uri baseBankUri) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(baseBankUri, "baseBankUri");
        C10727i.c(this.f105132c.b(), null, null, new g(this, null), 3);
    }

    @Override // y80.InterfaceC10862a
    public final boolean c() {
        return this.f105135f;
    }

    @Override // y80.InterfaceC10862a
    @NotNull
    public final InterfaceC10862a.EnumC2293a getType() {
        return this.f105134e;
    }
}
