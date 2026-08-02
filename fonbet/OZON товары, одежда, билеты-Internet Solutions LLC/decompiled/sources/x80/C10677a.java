package x80;

import android.net.Uri;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y80.C10864c;
import y80.InterfaceC10862a;

/* renamed from: x80.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10677a implements InterfaceC10862a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<String, Boolean, Boolean, Unit> f105102a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final S80.b f105103b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<Boolean> f105104c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC10862a.EnumC2293a f105105d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f105106e;

    /* JADX WARN: Multi-variable type inference failed */
    public C10677a(@NotNull InterfaceC6511n<? super String, ? super Boolean, ? super Boolean, Unit> closeActivity, @NotNull S80.b fintechNavigation, @NotNull Function0<Boolean> provideActivityForResult) {
        Intrinsics.checkNotNullParameter(closeActivity, "closeActivity");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(provideActivityForResult, "provideActivityForResult");
        this.f105102a = closeActivity;
        this.f105103b = fintechNavigation;
        this.f105104c = provideActivityForResult;
        this.f105105d = InterfaceC10862a.EnumC2293a.INTEGRATION;
        this.f105106e = true;
    }

    @Override // y80.InterfaceC10862a
    public final boolean a(@NotNull String url, @NotNull Uri uri, @NotNull Uri baseBankUri) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(baseBankUri, "baseBankUri");
        boolean gotoDeeplinkOnlyIntegration = this.f105103b.gotoDeeplinkOnlyIntegration(url);
        L80.a.a("Interceptor", "Interceptor type=" + this.f105105d + " canProcess=" + gotoDeeplinkOnlyIntegration + " url=" + url);
        return gotoDeeplinkOnlyIntegration;
    }

    @Override // y80.InterfaceC10862a
    public final void b(@NotNull String url, @NotNull Uri uri, @NotNull Uri baseBankUri) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(baseBankUri, "baseBankUri");
        if (C10864c.a(uri)) {
            return;
        }
        Intrinsics.checkNotNullParameter(uri, "<this>");
        if (Intrinsics.d(uri.getScheme(), "ozon") && Intrinsics.d(uri.getAuthority(), "browser")) {
            return;
        }
        this.f105102a.invoke(null, Boolean.TRUE, this.f105104c.invoke());
    }

    @Override // y80.InterfaceC10862a
    public final boolean c() {
        return this.f105106e;
    }

    @Override // y80.InterfaceC10862a
    @NotNull
    public final InterfaceC10862a.EnumC2293a getType() {
        return this.f105105d;
    }
}
