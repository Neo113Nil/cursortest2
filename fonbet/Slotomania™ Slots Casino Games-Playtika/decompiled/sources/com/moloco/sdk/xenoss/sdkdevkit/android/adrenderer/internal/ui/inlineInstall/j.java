package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j {
    public static final int h = 8;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final MetricsRecorder g;

    public j(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, MetricsRecorder metricsRecorder) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
        this.f = str2;
        this.g = metricsRecorder;
    }

    public final l a(r externalLinkHandler, h hVar) {
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        return ((this.a || this.c || this.b) && hVar != null) ? new e(hVar, externalLinkHandler, this.a, this.b, this.c, this.d, this.e, this.f, this.g) : new f(externalLinkHandler);
    }
}
