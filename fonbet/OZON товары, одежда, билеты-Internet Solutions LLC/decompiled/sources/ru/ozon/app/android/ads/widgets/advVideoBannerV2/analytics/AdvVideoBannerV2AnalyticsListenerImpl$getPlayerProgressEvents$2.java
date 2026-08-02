package ru.ozon.app.android.ads.widgets.advVideoBannerV2.analytics;

import j3.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Ljava/lang/Long;)Ljava/lang/Long;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AdvVideoBannerV2AnalyticsListenerImpl$getPlayerProgressEvents$2 extends AbstractC7737t implements Function1<Long, Long> {
    final /* synthetic */ y $player;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvVideoBannerV2AnalyticsListenerImpl$getPlayerProgressEvents$2(y yVar) {
        super(1);
        this.$player = yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Long invoke(Long it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Long.valueOf(this.$player.getCurrentPosition());
    }
}
