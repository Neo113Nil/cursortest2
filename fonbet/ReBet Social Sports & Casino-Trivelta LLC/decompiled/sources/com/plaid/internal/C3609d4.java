package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.d4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3609d4 implements M5 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public M5 f40555a;

    @Override // com.plaid.internal.M5
    public final boolean a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        M5 m52 = this.f40555a;
        if (m52 != null) {
            return m52.a(url);
        }
        return false;
    }

    @Override // com.plaid.internal.M5
    public final void a(@NotNull AbstractC3743s4 openInterstitialMessage) {
        Intrinsics.checkNotNullParameter(openInterstitialMessage, "openInterstitialMessage");
        M5 m52 = this.f40555a;
        if (m52 != null) {
            m52.a(openInterstitialMessage);
        }
    }
}
