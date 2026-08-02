package com.unity3d.services.core.network.core;

import android.content.Context;
import kotlin.Metadata;
import org.chromium.net.CronetEngine;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;", "", "<init>", "()V", "createCronetEngineBuilder", "Lorg/chromium/net/CronetEngine$Builder;", "context", "Landroid/content/Context;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CronetEngineBuilderFactory {
    @NotNull
    public final CronetEngine.Builder createCronetEngineBuilder(@NotNull Context context) {
        context.getClass();
        return new CronetEngine.Builder(context);
    }
}
