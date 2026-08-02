package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i implements h {
    public static final a h = new a(null);
    public static final int i = 8;
    public static final String j = "InlineInstallLauncher";
    public final m a;
    public final String b;
    public final c c;
    public final b d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a e;
    public final MetricsRecorder f;
    public final AtomicBoolean g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public i(m installer, String str, c bundleExtractor, b bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVar, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(installer, "installer");
        Intrinsics.checkNotNullParameter(bundleExtractor, "bundleExtractor");
        this.a = installer;
        this.b = str;
        this.c = bundleExtractor;
        this.d = bVar;
        this.e = aVar;
        this.f = metricsRecorder;
        this.g = new AtomicBoolean(false);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.h
    public void a(String str, r externalLinkHandler) {
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVar = this.e;
        if (aVar == null || !aVar.g()) {
            return;
        }
        MetricsRecorder metricsRecorder = this.f;
        if (metricsRecorder != null) {
            metricsRecorder.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.Q.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.g.c(), "auto_inline"));
        }
        String f = this.e.f();
        if (f != null) {
            str = f;
        }
        a(externalLinkHandler, str, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.a(i.this, (k) obj);
            }
        });
        String h2 = this.e.h();
        if (h2 != null) {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger, j, "auto_halfsheet_shown success", null, false, 12, null);
            a.i.a.c().a(h2);
            MolocoLogger.info$default(molocoLogger, j, "auto_inline_success fire this event once: " + h2, null, false, 12, null);
            MetricsRecorder metricsRecorder2 = this.f;
            if (metricsRecorder2 != null) {
                metricsRecorder2.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.R.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "auto_halfsheet_shown"));
            }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.h
    public void b(String str, r externalLinkHandler) {
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        b bVar = this.d;
        if (bVar == null || !bVar.c()) {
            if (str != null) {
                externalLinkHandler.a(str);
            }
        } else {
            MetricsRecorder metricsRecorder = this.f;
            if (metricsRecorder != null) {
                metricsRecorder.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.Q.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.g.c(), "android_inline"));
            }
            a(externalLinkHandler, str, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return i.b(i.this, (k) obj);
                }
            });
        }
    }

    public static final Unit a(i iVar, k outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        if (!Intrinsics.areEqual(outcome, k.c.b)) {
            if (Intrinsics.areEqual(outcome, k.a.b)) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, j, "auto_fullsheet_shown", null, false, 12, null);
                MetricsRecorder metricsRecorder = iVar.f;
                if (metricsRecorder != null) {
                    metricsRecorder.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.R.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "auto_fullsheet_shown"));
                }
            } else if (Intrinsics.areEqual(outcome, k.b.b)) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, j, "auto_fallback_shown", null, false, 12, null);
                MetricsRecorder metricsRecorder2 = iVar.f;
                if (metricsRecorder2 != null) {
                    metricsRecorder2.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.R.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "auto_fallback_shown"));
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit b(i iVar, k outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        if (Intrinsics.areEqual(outcome, k.c.b)) {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger, j, "click_inline_halfsheet_shown", null, false, 12, null);
            MetricsRecorder metricsRecorder = iVar.f;
            if (metricsRecorder != null) {
                metricsRecorder.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.R.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "click_inline_halfsheet_shown"));
            }
            if (iVar.g.compareAndSet(false, true)) {
                String d = iVar.d.d();
                if (d != null) {
                    a.i.a.c().a(d);
                    MolocoLogger.info$default(molocoLogger, j, "inline_install_success fire this event once: " + d, null, false, 12, null);
                }
            } else {
                MolocoLogger.info$default(molocoLogger, j, "inline_install_success already fired", null, false, 12, null);
            }
        } else if (Intrinsics.areEqual(outcome, k.a.b)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, j, "click_inline_fullsheet_shown", null, false, 12, null);
            MetricsRecorder metricsRecorder2 = iVar.f;
            if (metricsRecorder2 != null) {
                metricsRecorder2.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.R.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "click_inline_fullsheet_shown"));
            }
        } else if (Intrinsics.areEqual(outcome, k.b.b)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, j, "click_inline_fallback_shown", null, false, 12, null);
            MetricsRecorder metricsRecorder3 = iVar.f;
            if (metricsRecorder3 != null) {
                metricsRecorder3.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.R.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "click_inline_fallback_shown"));
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    public final void a(r rVar, String str, Function1<? super k, Unit> function1) {
        String b;
        String str2 = this.b;
        if (str2 == null || !this.c.a(str2)) {
            b = str != null ? this.c.b(str) : null;
        } else {
            b = this.b;
        }
        String d = str != null ? this.c.d(str) : null;
        if (b != null && this.c.a(b)) {
            a(b, d, str, rVar, function1);
            return;
        }
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, j, "Store URL found but bundle extraction/validation failed: " + str, null, false, 12, null);
        if (str == null || str.length() == 0) {
            return;
        }
        rVar.a(str);
        function1.invoke(k.b.b);
    }

    public final void a(String str, String str2, String str3, r rVar, final Function1<? super k, Unit> function1) {
        if (this.a.a(str, str2, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.a(Function1.this, (k) obj);
            }
        }) || str3 == null) {
            return;
        }
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, j, "Cannot resolve app install intent", null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, j, "inline_install_fallback", null, false, 12, null);
        rVar.a(str3);
        function1.invoke(k.b.b);
    }

    public static final Unit a(Function1 function1, k outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        function1.invoke(outcome);
        return Unit.INSTANCE;
    }
}
