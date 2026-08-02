package ru.ozon.app.android.travel.actionhandler.travelResultAction;

import a00.C4911f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.custom.CustomActionHandler;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "response", "Lru/ozon/app/android/travel/actionhandler/travelResultAction/TravelResultActionResponseVO;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/actionhandler/travelResultAction/TravelResultActionResponseVO;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TravelResultActionHandler$processAction$4 extends AbstractC7737t implements Function1<TravelResultActionResponseVO, Unit> {
    final /* synthetic */ C4911f $container;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ TravelResultActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelResultActionHandler$processAction$4(TravelResultActionHandler travelResultActionHandler, C4911f c4911f, CustomActionHandler.HandlerReferences handlerReferences) {
        super(1);
        this.this$0 = travelResultActionHandler;
        this.$container = c4911f;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TravelResultActionResponseVO travelResultActionResponseVO) {
        invoke2(travelResultActionResponseVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TravelResultActionResponseVO travelResultActionResponseVO) {
        if (travelResultActionResponseVO.getAction() != null) {
            this.this$0.handleAtomAction(this.$handlerRefs, travelResultActionResponseVO.getAction());
        } else {
            this.this$0.showError(this.$container, travelResultActionResponseVO.getError());
        }
    }
}
