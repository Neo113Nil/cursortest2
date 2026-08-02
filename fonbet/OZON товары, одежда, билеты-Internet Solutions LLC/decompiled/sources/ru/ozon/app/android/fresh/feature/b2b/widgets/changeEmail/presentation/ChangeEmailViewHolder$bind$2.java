package ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation;

import WZ.l;
import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation.ChangeEmailViewHolder;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ChangeEmailViewHolder$bind$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ChangeEmailVO $item;
    final /* synthetic */ ChangeEmailViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangeEmailViewHolder$bind$2(ChangeEmailVO changeEmailVO, ChangeEmailViewHolder changeEmailViewHolder) {
        super(0);
        this.$item = changeEmailVO;
        this.this$0 = changeEmailViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ChangeEmailViewModel changeEmailViewModel;
        ComposerReferences composerReferences;
        CommonControlSettings common;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        t mapToTokenizedEvent$default;
        l lVar;
        CellDTO cell = this.$item.getCell();
        if (cell != null && (common = cell.getCommon()) != null && (trackingInfo = common.getTrackingInfo()) != null && (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(this.$item.getId()), null, 2, null)) != null) {
            lVar = this.this$0.tokenizedAnalytics;
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, mapToTokenizedEvent$default, null, 2, null);
        }
        changeEmailViewModel = this.this$0.viewModel;
        changeEmailViewModel.toggleCommsPermission();
        composerReferences = this.this$0.composerReferences;
        composerReferences.getController().update(new ChangeEmailViewHolder.CommsSelectionUpdate());
    }
}
