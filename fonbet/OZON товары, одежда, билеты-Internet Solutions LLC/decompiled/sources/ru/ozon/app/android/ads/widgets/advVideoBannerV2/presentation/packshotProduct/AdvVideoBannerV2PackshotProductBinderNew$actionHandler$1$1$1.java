package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.packshotProduct;

import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvBannerVideoV2VO;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AdvVideoBannerV2PackshotProductBinderNew$actionHandler$1$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ AdvBannerVideoV2VO $it;
    final /* synthetic */ AdvVideoBannerV2PackshotProductBinderNew this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvVideoBannerV2PackshotProductBinderNew$actionHandler$1$1$1(AdvBannerVideoV2VO advBannerVideoV2VO, AdvVideoBannerV2PackshotProductBinderNew advVideoBannerV2PackshotProductBinderNew) {
        super(0);
        this.$it = advBannerVideoV2VO;
        this.this$0 = advVideoBannerV2PackshotProductBinderNew;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        t tokenizedEvent;
        ComposerReferences composerReferences;
        AdvBannerVideoV2VO advBannerVideoV2VO = this.$it;
        AdvVideoBannerV2PackshotProductBinderNew advVideoBannerV2PackshotProductBinderNew = this.this$0;
        AdvBannerVideoV2VO.PackShotVO packshotVO = advBannerVideoV2VO.getPackshotVO();
        if (packshotVO == null || (tokenizedEvent = packshotVO.getTokenizedEvent()) == null) {
            return;
        }
        composerReferences = advVideoBannerV2PackshotProductBinderNew.refs;
        TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(composerReferences.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
    }
}
