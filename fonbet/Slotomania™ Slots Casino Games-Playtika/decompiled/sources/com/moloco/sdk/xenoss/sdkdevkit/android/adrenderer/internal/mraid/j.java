package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.webkit.WebView;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes4.dex */
public interface j extends i, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k {
    void B();

    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l E();

    Flow<l> a();

    void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar);

    void a(String str, a.AbstractC0383a.f fVar);

    WebView c();

    StateFlow<n.f> e();
}
