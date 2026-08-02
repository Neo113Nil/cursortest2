package x80;

import H30.x;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y80.C10864c;
import y80.InterfaceC10862a;

/* loaded from: classes3.dex */
public final class e implements InterfaceC10862a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f105118a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final S80.b f105119b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC10862a.EnumC2293a f105120c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f105121d;

    public e(@NotNull S80.b fintechNavigation, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings) {
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        this.f105118a = fintechSettings;
        this.f105119b = fintechNavigation;
        this.f105120c = InterfaceC10862a.EnumC2293a.OZON_PAYMENT;
        this.f105121d = true;
    }

    @Override // y80.InterfaceC10862a
    public final boolean a(@NotNull String url, @NotNull Uri uri, @NotNull Uri baseBankUri) {
        String c11;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(baseBankUri, "baseBankUri");
        boolean z11 = this.f105118a.isStandAloneIntegration() && C10864c.a(uri) && (c11 = x.c(uri, ImagesContract.URL)) != null && c11.length() > 0;
        L80.a.a("Interceptor", "Interceptor type=" + this.f105120c + " canProcess=" + z11 + " url=" + url);
        return z11;
    }

    @Override // y80.InterfaceC10862a
    public final void b(@NotNull String url, @NotNull Uri uri, @NotNull Uri baseBankUri) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(baseBankUri, "baseBankUri");
        String c11 = x.c(uri, ImagesContract.URL);
        if (c11 == null || c11.length() <= 0) {
            return;
        }
        this.f105119b.D(c11);
    }

    @Override // y80.InterfaceC10862a
    public final boolean c() {
        return this.f105121d;
    }

    @Override // y80.InterfaceC10862a
    @NotNull
    public final InterfaceC10862a.EnumC2293a getType() {
        return this.f105120c;
    }
}
