package x80;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y80.InterfaceC10862a;

/* loaded from: classes3.dex */
public final class d implements InterfaceC10862a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f105114a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final S80.b f105115b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC10862a.EnumC2293a f105116c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f105117d;

    public d(@NotNull S80.b fintechNavigation, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings) {
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        this.f105114a = fintechSettings;
        this.f105115b = fintechNavigation;
        this.f105116c = InterfaceC10862a.EnumC2293a.OZON_OTHERS;
        this.f105117d = true;
    }

    @Override // y80.InterfaceC10862a
    public final boolean a(@NotNull String url, @NotNull Uri uri, @NotNull Uri baseBankUri) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(baseBankUri, "baseBankUri");
        boolean z11 = this.f105114a.isStandAloneIntegration() && Intrinsics.d(uri.getScheme(), "ozon");
        L80.a.a("Interceptor", "Interceptor type=" + this.f105116c + " canProcess=" + z11 + " url=" + url);
        return z11;
    }

    @Override // y80.InterfaceC10862a
    public final void b(@NotNull String url, @NotNull Uri uri, @NotNull Uri baseBankUri) {
        boolean u11;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(baseBankUri, "baseBankUri");
        boolean p11 = this.f105114a.p();
        S80.b bVar = this.f105115b;
        if (p11) {
            String uri2 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
            u11 = bVar.m(uri2);
        } else {
            u11 = bVar.u("ru.ozon.app.android");
        }
        this.f105117d = u11;
    }

    @Override // y80.InterfaceC10862a
    public final boolean c() {
        return this.f105117d;
    }

    @Override // y80.InterfaceC10862a
    @NotNull
    public final InterfaceC10862a.EnumC2293a getType() {
        return this.f105116c;
    }
}
