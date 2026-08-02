package ru.ozon.app.android.session.userAdultModalMobileV2.presentation;

import WZ.l;
import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.session.userAdultModalMobileV2.presentation.models.UserAdultModalV2VO;
import ru.ozon.composer.compose.widget.i;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: ru.ozon.app.android.session.userAdultModalMobileV2.presentation.ComposableSingletons$ComposeAdultConfirmationViewHolderKt$lambda-1$1$2$1, reason: invalid class name */
/* loaded from: classes2.dex */
final class ComposableSingletons$ComposeAdultConfirmationViewHolderKt$lambda1$1$2$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ l $analytics;
    final /* synthetic */ i<UserAdultModalV2VO> $this_content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposableSingletons$ComposeAdultConfirmationViewHolderKt$lambda1$1$2$1(i<UserAdultModalV2VO> iVar, l lVar) {
        super(0);
        this.$this_content = iVar;
        this.$analytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        t tokenizedEvent$default;
        Map<String, TokenizedTrackingInfo> trackingInfo = this.$this_content.b().getTrackingInfo();
        if (trackingInfo == null || (tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(this.$this_content.b().getId()), null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.$analytics, tokenizedEvent$default, null, 2, null);
    }
}
