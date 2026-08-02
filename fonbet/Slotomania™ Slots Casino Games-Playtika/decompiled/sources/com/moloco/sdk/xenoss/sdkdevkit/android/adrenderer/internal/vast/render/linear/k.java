package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes.dex */
public interface k extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b, n, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g {
    void D();

    void F();

    String G();

    boolean L();

    StateFlow<m<Long>> Q();

    void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar);

    void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar);

    void b();

    void c(boolean z);

    void d(boolean z);

    void h();

    StateFlow<Boolean> q();
}
