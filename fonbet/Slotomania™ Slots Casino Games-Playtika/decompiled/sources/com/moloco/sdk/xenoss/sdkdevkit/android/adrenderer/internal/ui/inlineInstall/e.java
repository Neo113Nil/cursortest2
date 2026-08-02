package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements l {
    public static final int j = 8;
    public final h a;
    public final r b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final MetricsRecorder i;

    public e(h inlineInstallSheetLauncher, r fallbackHandler, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(inlineInstallSheetLauncher, "inlineInstallSheetLauncher");
        Intrinsics.checkNotNullParameter(fallbackHandler, "fallbackHandler");
        this.a = inlineInstallSheetLauncher;
        this.b = fallbackHandler;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = str;
        this.h = str2;
        this.i = metricsRecorder;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l
    public void a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (this.c) {
            this.a.b(url, this.b);
        } else {
            this.b.a(url);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l
    public void b(String str) {
        if (this.d && !this.f) {
            this.a.a(str, this.b);
            return;
        }
        if (this.f) {
            String str2 = this.g;
            if (str2 != null) {
                str = str2;
            }
            if (str != null) {
                this.b.a(str);
                MetricsRecorder metricsRecorder = this.i;
                if (metricsRecorder != null) {
                    metricsRecorder.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.R.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "auto_fullsheet_shown_complete"));
                }
                String str3 = this.h;
                if (str3 != null) {
                    a.i.a.c().a(str3);
                }
            }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l
    public void c(String str) {
        if (this.e && !this.f) {
            this.a.a(str, this.b);
            return;
        }
        if (this.f) {
            String str2 = this.g;
            if (str2 != null) {
                str = str2;
            }
            if (str != null) {
                this.b.a(str);
                MetricsRecorder metricsRecorder = this.i;
                if (metricsRecorder != null) {
                    metricsRecorder.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.R.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "auto_fullsheet_shown_skip"));
                }
                String str3 = this.h;
                if (str3 != null) {
                    a.i.a.c().a(str3);
                }
            }
        }
    }
}
