package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import kotlinx.coroutines.flow.StateFlow;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC2819b {

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b$a */
    public interface a {
        void a();

        void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar);

        void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar);
    }

    void a(long j, a aVar);

    StateFlow<Boolean> isLoaded();
}
