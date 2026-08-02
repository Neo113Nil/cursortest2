package com.plaid.internal;

import com.plaid.internal.C3556a6;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class R0 implements M5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final S0 f39574a;

    public R0(@NotNull S0 embeddedWebviewUrlParser) {
        Intrinsics.checkNotNullParameter(embeddedWebviewUrlParser, "embeddedWebviewUrlParser");
        this.f39574a = embeddedWebviewUrlParser;
    }

    @Override // com.plaid.internal.M5
    public final void a(@NotNull AbstractC3743s4 openInterstitialMessage) {
        Intrinsics.checkNotNullParameter(openInterstitialMessage, "openInterstitialMessage");
    }

    @Override // com.plaid.internal.M5
    public final boolean a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            this.f39574a.b(url);
            return true;
        } catch (Exception e10) {
            C3556a6.a.a(C3556a6.f39823a, e10);
            return true;
        }
    }
}
