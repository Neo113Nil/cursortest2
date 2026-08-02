package ru.ozon.app.android.storefront.widgets.cms.banner.presentation;

import GZ.g;
import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BannerComposableKt$BannerComposable$2$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ BannerVI $item;
    final /* synthetic */ g $router;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BannerComposableKt$BannerComposable$2$1(BannerVI bannerVI, g gVar, l lVar) {
        super(0);
        this.$item = bannerVI;
        this.$router = gVar;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String deeplink = this.$item.getDeeplink();
        if (deeplink != null) {
            BannerVI bannerVI = this.$item;
            g gVar = this.$router;
            l lVar = this.$tokenizedAnalytics;
            t tokenizedEvent = bannerVI.getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processAnyEvents$default(lVar, tokenizedEvent, null, 2, null);
            }
            g.a.a(gVar, deeplink, null, null, 6);
        }
    }
}
