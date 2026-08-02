package ru.ozon.app.android.product;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.comparison.RemoveFromComparisonResponse;
import ru.ozon.app.android.uikit.text.StringProvider;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0002*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Response", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
public final class TileActionSheetHandler$handleComposerAction$lambda$4$$inlined$invokeComparisonRequest$1 extends AbstractC7737t implements Function1<ActionV2Response<RemoveFromComparisonResponse>, Unit> {
    final /* synthetic */ TileActionSheetHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileActionSheetHandler$handleComposerAction$lambda$4$$inlined$invokeComparisonRequest$1(TileActionSheetHandler tileActionSheetHandler) {
        super(1);
        this.this$0 = tileActionSheetHandler;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ActionV2Response<RemoveFromComparisonResponse> actionV2Response) {
        invoke2(actionV2Response);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActionV2Response<RemoveFromComparisonResponse> actionV2Response) {
        RemoveFromComparisonResponse data = actionV2Response.getData();
        TileActionSheetHandler.onMessageReceived$default(this.this$0, StringProvider.getString(R$string.favorites_comparison_removed_from_comparison_android), data != null ? data.getDeeplink() : null, null, 4, null);
    }
}
