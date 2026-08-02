package x80;

import H30.x;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y80.InterfaceC10862a;

/* loaded from: classes3.dex */
public final class c implements InterfaceC10862a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final S80.b f105111a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC10862a.EnumC2293a f105112b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f105113c;

    public c(@NotNull S80.b fintechNavigation, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings) {
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        this.f105111a = fintechNavigation;
        this.f105112b = InterfaceC10862a.EnumC2293a.OZON_ID_RECOVERY;
        this.f105113c = true;
    }

    @Override // y80.InterfaceC10862a
    public final boolean a(@NotNull String url, @NotNull Uri uri, @NotNull Uri baseBankUri) {
        boolean z11;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(baseBankUri, "baseBankUri");
        if (Intrinsics.d(uri.getScheme(), "ozon")) {
            Intrinsics.checkNotNullParameter(uri, "<this>");
            if (Intrinsics.d(uri.isHierarchical() ? uri.getAuthority() : null, "ozonid") && Intrinsics.d(x.b(uri), "/account-recovery-start")) {
                S80.b bVar = this.f105111a;
                if (bVar.canStartOzonIdRecoveryFlow(bVar.c(), url)) {
                    z11 = true;
                    L80.a.a("Interceptor", "Interceptor type=" + this.f105112b + " canProcess=" + z11 + " url=" + url);
                    return z11;
                }
            }
        }
        z11 = false;
        L80.a.a("Interceptor", "Interceptor type=" + this.f105112b + " canProcess=" + z11 + " url=" + url);
        return z11;
    }

    @Override // y80.InterfaceC10862a
    public final void b(@NotNull String url, @NotNull Uri uri, @NotNull Uri baseBankUri) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(baseBankUri, "baseBankUri");
    }

    @Override // y80.InterfaceC10862a
    public final boolean c() {
        return this.f105113c;
    }

    @Override // y80.InterfaceC10862a
    @NotNull
    public final InterfaceC10862a.EnumC2293a getType() {
        return this.f105112b;
    }
}
