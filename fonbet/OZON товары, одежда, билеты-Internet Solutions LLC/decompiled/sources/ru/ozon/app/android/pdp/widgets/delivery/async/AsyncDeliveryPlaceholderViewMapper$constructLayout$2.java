package ru.ozon.app.android.pdp.widgets.delivery.async;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.widgets.delivery.async.AsyncDeliveryWidgetViewModel;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncDeliveryWidgetViewModel$Event;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncDeliveryWidgetViewModel$Event;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AsyncDeliveryPlaceholderViewMapper$constructLayout$2 extends AbstractC7737t implements Function1<AsyncDeliveryWidgetViewModel.Event, Unit> {
    final /* synthetic */ ComposerReferences $references;
    final /* synthetic */ l $viewObject;
    final /* synthetic */ AsyncDeliveryPlaceholderViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncDeliveryPlaceholderViewMapper$constructLayout$2(AsyncDeliveryPlaceholderViewMapper asyncDeliveryPlaceholderViewMapper, l lVar, ComposerReferences composerReferences) {
        super(1);
        this.this$0 = asyncDeliveryPlaceholderViewMapper;
        this.$viewObject = lVar;
        this.$references = composerReferences;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AsyncDeliveryWidgetViewModel.Event event) {
        invoke2(event);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AsyncDeliveryWidgetViewModel.Event event) {
        AsyncDeliveryPlaceholderViewMapper asyncDeliveryPlaceholderViewMapper = this.this$0;
        Intrinsics.f(event);
        asyncDeliveryPlaceholderViewMapper.handleEvent(event, this.$viewObject, this.$references);
    }
}
