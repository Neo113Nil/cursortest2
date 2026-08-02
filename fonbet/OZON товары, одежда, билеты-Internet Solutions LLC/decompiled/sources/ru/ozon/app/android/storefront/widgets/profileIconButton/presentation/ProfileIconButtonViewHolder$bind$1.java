package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation;

import WZ.l;
import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProfileIconButtonViewHolder$bind$1 extends AbstractC7737t implements Function1<Map<String, ? extends TokenizedTrackingInfo>, Unit> {
    final /* synthetic */ ProfileIconButtonVO $item;
    final /* synthetic */ ProfileIconButtonViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileIconButtonViewHolder$bind$1(ProfileIconButtonVO profileIconButtonVO, ProfileIconButtonViewHolder profileIconButtonViewHolder) {
        super(1);
        this.$item = profileIconButtonVO;
        this.this$0 = profileIconButtonViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends TokenizedTrackingInfo> map) {
        invoke2((Map<String, TokenizedTrackingInfo>) map);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, TokenizedTrackingInfo> map) {
        t tokenizedEvent$default;
        l lVar;
        if (map == null || (tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(map, Long.valueOf(this.$item.getId()), null, 2, null)) == null) {
            return;
        }
        lVar = this.this$0.tokenizedAnalytics;
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, tokenizedEvent$default, null, 2, null);
    }
}
