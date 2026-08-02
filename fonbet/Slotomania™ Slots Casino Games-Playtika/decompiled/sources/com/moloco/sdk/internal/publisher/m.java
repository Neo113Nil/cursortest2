package com.moloco.sdk.internal.publisher;

import android.content.Context;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.ortb.model.C2791e;
import com.moloco.sdk.internal.services.InterfaceC2811f;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2821b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes6.dex */
public final class m {

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function8<Context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a, C2791e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y, com.moloco.sdk.internal.A, com.moloco.sdk.internal.services.s, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g>> {
        public static final a a = new a();

        public a() {
            super(8, m.class, "createXenossAggregatedBanner", "createXenossAggregatedBanner(Landroid/content/Context;Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService;Lcom/moloco/sdk/internal/ortb/model/Bid;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ExternalLinkHandler;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/Watermark;Lcom/moloco/sdk/internal/ViewLifecycleOwner;Lcom/moloco/sdk/internal/services/ClickthroughService;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/ButtonTracker;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/XenossBannerView;", 1);
        }

        @Override // kotlin.jvm.functions.Function8
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g> invoke(Context p0, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a p1, C2791e p2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r p3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y p4, com.moloco.sdk.internal.A p5, com.moloco.sdk.internal.services.s p6, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h p7) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            Intrinsics.checkNotNullParameter(p2, "p2");
            Intrinsics.checkNotNullParameter(p3, "p3");
            Intrinsics.checkNotNullParameter(p4, "p4");
            Intrinsics.checkNotNullParameter(p5, "p5");
            Intrinsics.checkNotNullParameter(p6, "p6");
            Intrinsics.checkNotNullParameter(p7, "p7");
            return m.b(p0, p1, p2, p3, p4, p5, p6, p7);
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w, c> {
        public static final b a = new b();

        public b() {
            super(1, m.class, "createXenossAggregatedAdShowListener", "createXenossAggregatedAdShowListener(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/VastAdShowListener;)Lcom/moloco/sdk/internal/publisher/BannerKt$createXenossAggregatedAdShowListener$1;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.b(p0);
        }
    }

    public static final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w {
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w a;

        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w wVar) {
            this.a = wVar;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a() {
            this.a.a();
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void b() {
            this.a.b();
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
            Intrinsics.checkNotNullParameter(internalShowError, "internalShowError");
            this.a.a(internalShowError);
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w
        public void a(boolean z) {
            this.a.a(z);
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g> b(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, C2791e c2791e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, com.moloco.sdk.internal.A a2, com.moloco.sdk.internal.services.s sVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar) {
        return new C2821b(context, aVar, null, c2791e, a(c2791e.getExt().getPlayer()), rVar, yVar, a2, CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))), sVar, hVar);
    }

    public static final Banner a(Context context, InterfaceC2811f appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, String adUnitId, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, C2793a adCreateLoadTimeoutManager, com.moloco.sdk.internal.A viewLifecycleOwnerSingleton, com.moloco.sdk.internal.i bannerSize, com.moloco.sdk.internal.services.s clickthroughService, MetricsRecorder metricsRecorder, Q viewVisibilityTracker, AdFormatType adFormatType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        return new n(context, appLifecycleTrackerService, customUserEventBuilderService, adUnitId, z, externalLinkHandler, a.a, b.a, watermark, adCreateLoadTimeoutManager, viewLifecycleOwnerSingleton, bannerSize, clickthroughService, metricsRecorder, viewVisibilityTracker, adFormatType);
    }

    public static final c b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w wVar) {
        return new c(wVar);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h a(com.moloco.sdk.internal.ortb.model.z zVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h a2;
        return (zVar == null || (a2 = com.moloco.sdk.internal.d.a(zVar)) == null) ? com.moloco.sdk.internal.d.a() : a2;
    }
}
