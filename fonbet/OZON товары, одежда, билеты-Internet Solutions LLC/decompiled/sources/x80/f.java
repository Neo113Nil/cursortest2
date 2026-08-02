package x80;

import H30.x;
import android.net.Uri;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y80.InterfaceC10862a;

/* loaded from: classes3.dex */
public final class f implements InterfaceC10862a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f105122a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final S80.b f105123b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<Boolean> f105124c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function0<String> f105125d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC10862a.EnumC2293a f105126e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f105127f;

    public f(@NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull S80.b fintechNavigation, @NotNull Function0<Boolean> isStarted, @NotNull Function0<String> getTabId) {
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(isStarted, "isStarted");
        Intrinsics.checkNotNullParameter(getTabId, "getTabId");
        this.f105122a = fintechSettings;
        this.f105123b = fintechNavigation;
        this.f105124c = isStarted;
        this.f105125d = getTabId;
        this.f105126e = InterfaceC10862a.EnumC2293a.OZON_WEB_AUTH;
        this.f105127f = true;
    }

    @Override // y80.InterfaceC10862a
    public final boolean a(@NotNull String url, @NotNull Uri uri, @NotNull Uri baseBankUri) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(baseBankUri, "baseBankUri");
        boolean z11 = Intrinsics.d(uri.getScheme(), "ozon") && Intrinsics.d(uri.getAuthority(), "web") && Intrinsics.d(x.b(uri), "/auth") && this.f105122a.isStandAloneIntegration();
        L80.a.a("Interceptor", "Interceptor type=" + this.f105126e + " canProcess=" + z11 + " url=" + url);
        return z11;
    }

    @Override // y80.InterfaceC10862a
    public final void b(@NotNull String url, @NotNull Uri uri, @NotNull Uri baseBankUri) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(baseBankUri, "baseBankUri");
        if (this.f105124c.invoke().booleanValue()) {
            this.f105123b.j0(url, this.f105125d.invoke(), true);
        }
    }

    @Override // y80.InterfaceC10862a
    public final boolean c() {
        return this.f105127f;
    }

    @Override // y80.InterfaceC10862a
    @NotNull
    public final InterfaceC10862a.EnumC2293a getType() {
        return this.f105126e;
    }
}
