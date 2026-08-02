package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k {
    public static final int c = 8;
    public final j a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k b;

    public k(j resource, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k kVar) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        this.a = resource;
        this.b = kVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k kVar = this.b;
        if (kVar != null) {
            kVar.destroy();
        }
    }

    public final j k() {
        return this.a;
    }

    public /* synthetic */ k(j jVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k kVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, (i & 2) != 0 ? null : kVar);
    }
}
