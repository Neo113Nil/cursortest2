package ru.ozon.app.android.ads.widgets.advVideoBannerV2.analytics;

import io.reactivex.p;
import io.reactivex.u;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lkotlin/jvm/internal/EnhancedNullability;", "isPlaying", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/u;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class AdvVideoBannerV2AnalyticsListenerImpl$getPlayerProgressEvents$1 extends AbstractC7737t implements Function1<Boolean, u<? extends Long>> {
    public static final AdvVideoBannerV2AnalyticsListenerImpl$getPlayerProgressEvents$1 INSTANCE = new AdvVideoBannerV2AnalyticsListenerImpl$getPlayerProgressEvents$1();

    AdvVideoBannerV2AnalyticsListenerImpl$getPlayerProgressEvents$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final u<? extends Long> invoke(Boolean isPlaying) {
        Intrinsics.checkNotNullParameter(isPlaying, "isPlaying");
        return isPlaying.booleanValue() ? p.interval(500L, TimeUnit.MILLISECONDS) : p.never();
    }
}
