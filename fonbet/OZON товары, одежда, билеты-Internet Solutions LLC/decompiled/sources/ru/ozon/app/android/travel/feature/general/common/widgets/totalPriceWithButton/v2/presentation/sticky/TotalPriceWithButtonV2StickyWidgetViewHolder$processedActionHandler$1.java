package ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.sticky;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage;
import ru.ozon.app.android.travel.utils.extensions.MapExtensionsKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TotalPriceWithButtonV2StickyWidgetViewHolder$processedActionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ TotalPriceWithButtonV2StickyWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TotalPriceWithButtonV2StickyWidgetViewHolder$processedActionHandler$1(TotalPriceWithButtonV2StickyWidgetViewHolder totalPriceWithButtonV2StickyWidgetViewHolder) {
        super(1);
        this.this$0 = totalPriceWithButtonV2StickyWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        Function1 function1;
        TravelPageKeyValueStorage travelPageKeyValueStorage;
        Function1 function12;
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof AtomAction.ComposerAction)) {
            function12 = this.this$0.actionHandler;
            function12.invoke(action);
            return;
        }
        function1 = this.this$0.actionHandler;
        AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
        Map<String, String> params = composerAction.getParams();
        travelPageKeyValueStorage = this.this$0.pageStorage;
        function1.invoke(AtomAction.ComposerAction.copy$default(composerAction, null, null, MapExtensionsKt.combineWith(params, travelPageKeyValueStorage.getAll()), null, null, 27, null));
    }
}
