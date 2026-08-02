package ru.ozon.app.android.common.serviceCarousel.presentation;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.commonvertical.sharedCarouselViewModel.SharedCarouselViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ServiceCarouselViewHolder$getActionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ ServiceCarouselViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ServiceCarouselViewHolder$getActionHandler$1(ServiceCarouselViewHolder serviceCarouselViewHolder) {
        super(1);
        this.this$0 = serviceCarouselViewHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction it) {
        t tokenizedEvent;
        ComposerReferences composerReferences;
        SharedCarouselViewModel sharedCarouselViewModel;
        t tokenizedEvent2;
        ComposerReferences composerReferences2;
        SharedCarouselViewModel sharedCarouselViewModel2;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof AtomAction.ViewAction) {
            tokenizedEvent2 = this.this$0.getTokenizedEvent((AtomAction.SendAnalytics) it);
            if (tokenizedEvent2 != null) {
                ServiceCarouselViewHolder serviceCarouselViewHolder = this.this$0;
                composerReferences2 = serviceCarouselViewHolder.references;
                l tokenizedAnalytics = composerReferences2.getTokenizedAnalytics();
                sharedCarouselViewModel2 = serviceCarouselViewHolder.sharedViewModel;
                TokenizedAnalyticsExtensionsKt.processViewEvents(tokenizedAnalytics, tokenizedEvent2, new ServiceCarouselViewHolder$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0(sharedCarouselViewModel2.pageIdModifier()));
            }
        } else {
            if (!(it instanceof AtomAction.Click)) {
                return Boolean.FALSE;
            }
            tokenizedEvent = this.this$0.getTokenizedEvent((AtomAction.SendAnalytics) it);
            if (tokenizedEvent != null) {
                ServiceCarouselViewHolder serviceCarouselViewHolder2 = this.this$0;
                composerReferences = serviceCarouselViewHolder2.references;
                l tokenizedAnalytics2 = composerReferences.getTokenizedAnalytics();
                sharedCarouselViewModel = serviceCarouselViewHolder2.sharedViewModel;
                TokenizedAnalyticsExtensionsKt.processClickEvents(tokenizedAnalytics2, tokenizedEvent, new ServiceCarouselViewHolder$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0(sharedCarouselViewModel.pageIdModifier()));
            }
        }
        return Boolean.TRUE;
    }
}
