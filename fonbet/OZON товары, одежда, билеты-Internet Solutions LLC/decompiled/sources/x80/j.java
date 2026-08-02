package x80;

import android.net.Uri;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y80.InterfaceC10862a;

/* loaded from: classes3.dex */
public final class j implements InterfaceC10862a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final S80.b f105140a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC10862a.EnumC2293a f105141b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f105142c;

    public j(@NotNull S80.b fintechNavigation) {
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        this.f105140a = fintechNavigation;
        this.f105141b = InterfaceC10862a.EnumC2293a.SYSTEM;
        this.f105142c = true;
    }

    @Override // y80.InterfaceC10862a
    public final boolean a(@NotNull String url, @NotNull Uri uri, @NotNull Uri baseBankUri) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(baseBankUri, "baseBankUri");
        R80.b i11 = R80.c.i(url);
        String[] elements = {"http", "https", "ozonbank", "ozonbanksme", "ozoncheck"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        R80.b k11 = R80.c.k(i11, C7705l.j0(elements));
        L80.a.a("Interceptor", "Interceptor type=" + this.f105141b + " deepResult=" + k11 + " url=" + url);
        return k11.e();
    }

    @Override // y80.InterfaceC10862a
    public final void b(@NotNull String url, @NotNull Uri uri, @NotNull Uri baseBankUri) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(baseBankUri, "baseBankUri");
        if (a(url, uri, baseBankUri)) {
            this.f105142c = this.f105140a.m(url);
        }
    }

    @Override // y80.InterfaceC10862a
    public final boolean c() {
        return this.f105142c;
    }

    @Override // y80.InterfaceC10862a
    @NotNull
    public final InterfaceC10862a.EnumC2293a getType() {
        return this.f105141b;
    }
}
