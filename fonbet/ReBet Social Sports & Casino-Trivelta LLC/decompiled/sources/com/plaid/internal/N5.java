package com.plaid.internal;

import android.app.Application;
import android.webkit.WebView;
import com.plaid.internal.C3556a6;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class N5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Application f39456a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public P5 f39457b;

    @Inject
    public N5(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f39456a = application;
    }

    public final void a() {
        C3556a6.a.d(C3556a6.f39823a, "Destroying webview " + this.f39457b);
        P5 p52 = this.f39457b;
        if (p52 != null && !p52.a().getAndSet(true)) {
            p52.destroy();
        }
        this.f39457b = null;
    }

    @NotNull
    public final P5 b() {
        C3556a6.a.d(C3556a6.f39823a, "Creating webview");
        if ((this.f39456a.getApplicationInfo().flags & 2) != 0) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        P5 p52 = new P5(this.f39456a);
        this.f39457b = p52;
        Intrinsics.checkNotNull(p52);
        return p52;
    }

    @NotNull
    public final P5 c() {
        C3556a6.a.d(C3556a6.f39823a, "Returning webview " + this.f39457b);
        P5 p52 = this.f39457b;
        if (p52 == null) {
            p52 = b();
        }
        this.f39457b = null;
        return p52;
    }
}
