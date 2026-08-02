package x80;

import H30.x;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y80.InterfaceC10862a;

/* loaded from: classes3.dex */
public final class i implements InterfaceC10862a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f105136a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<String, Boolean, Unit> f105137b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC10862a.EnumC2293a f105138c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f105139d;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull Function2<? super String, ? super Boolean, Unit> handleUrl) {
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(handleUrl, "handleUrl");
        this.f105136a = fintechSettings;
        this.f105137b = handleUrl;
        this.f105138c = InterfaceC10862a.EnumC2293a.OZON_WEB;
        this.f105139d = true;
    }

    @Override // y80.InterfaceC10862a
    public final boolean a(@NotNull String url, @NotNull Uri uri, @NotNull Uri baseBankUri) {
        String c11;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(baseBankUri, "baseBankUri");
        boolean z11 = this.f105136a.isStandAloneIntegration() && Intrinsics.d(uri.getScheme(), "ozon") && Intrinsics.d(uri.getAuthority(), "web") && !Intrinsics.d(x.b(uri), "/auth") && !Boolean.parseBoolean(x.c(uri, "openInOzonApp")) && (c11 = x.c(uri, ImagesContract.URL)) != null && c11.length() > 0;
        L80.a.a("Interceptor", "Interceptor type=" + this.f105138c + " canProcess=" + z11 + " url=" + url);
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
        this.f105137b.invoke(c11, Boolean.FALSE);
    }

    @Override // y80.InterfaceC10862a
    public final boolean c() {
        return this.f105139d;
    }

    @Override // y80.InterfaceC10862a
    @NotNull
    public final InterfaceC10862a.EnumC2293a getType() {
        return this.f105138c;
    }
}
