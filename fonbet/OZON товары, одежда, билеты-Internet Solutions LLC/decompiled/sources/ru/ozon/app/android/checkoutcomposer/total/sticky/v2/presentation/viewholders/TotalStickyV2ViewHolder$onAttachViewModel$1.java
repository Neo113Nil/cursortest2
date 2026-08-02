package ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.viewholders;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.TotalStickyV2StateUpdate;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.TotalStickyV2UpdateResponse;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "updateResponse", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2UpdateResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2UpdateResponse;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TotalStickyV2ViewHolder$onAttachViewModel$1 extends AbstractC7737t implements Function1<TotalStickyV2UpdateResponse, Unit> {
    final /* synthetic */ TotalStickyV2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TotalStickyV2ViewHolder$onAttachViewModel$1(TotalStickyV2ViewHolder totalStickyV2ViewHolder) {
        super(1);
        this.this$0 = totalStickyV2ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TotalStickyV2UpdateResponse totalStickyV2UpdateResponse) {
        invoke2(totalStickyV2UpdateResponse);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TotalStickyV2UpdateResponse totalStickyV2UpdateResponse) {
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        Map<String, String> trackingPayloads = totalStickyV2UpdateResponse.getTrackingPayloads();
        if (trackingPayloads != null) {
            composerReferences2 = this.this$0.references;
            composerReferences2.getTokenizedAnalytics().e(trackingPayloads);
        }
        composerReferences = this.this$0.references;
        composerReferences.getController().update(new TotalStickyV2StateUpdate(totalStickyV2UpdateResponse.getDto()));
    }
}
