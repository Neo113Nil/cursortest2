package ru.ozon.app.android.cart.totalV3.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "updateResponse", "Lru/ozon/app/android/cart/totalV3/presentation/TotalV3UpdateResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/cart/totalV3/presentation/TotalV3UpdateResponse;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TotalViewHolder$onAttachViewModel$1 extends AbstractC7737t implements Function1<TotalV3UpdateResponse, Unit> {
    final /* synthetic */ TotalViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TotalViewHolder$onAttachViewModel$1(TotalViewHolder totalViewHolder) {
        super(1);
        this.this$0 = totalViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TotalV3UpdateResponse totalV3UpdateResponse) {
        invoke2(totalV3UpdateResponse);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TotalV3UpdateResponse totalV3UpdateResponse) {
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        Map<String, String> trackingPayloads = totalV3UpdateResponse.getTrackingPayloads();
        if (trackingPayloads != null) {
            composerReferences2 = this.this$0.references;
            composerReferences2.getTokenizedAnalytics().e(trackingPayloads);
        }
        composerReferences = this.this$0.references;
        composerReferences.getController().update(new TotalV3StateUpdate(totalV3UpdateResponse.getDto()));
    }
}
