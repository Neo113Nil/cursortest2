package ru.ozon.app.android.bank.widgets.cbottom.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.ui.ActionResult2UI;
import y40.C10837a;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "act", "Lru/ozon/fintech/ui/ActionResult2UI;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CbottomWidgetMapper$invoke$result$1 extends AbstractC7737t implements Function1<ActionResult2UI, Unit> {
    final /* synthetic */ long $uuid;
    final /* synthetic */ CbottomWidgetMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CbottomWidgetMapper$invoke$result$1(CbottomWidgetMapper cbottomWidgetMapper, long j11) {
        super(1);
        this.this$0 = cbottomWidgetMapper;
        this.$uuid = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ActionResult2UI actionResult2UI) {
        invoke2(actionResult2UI);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActionResult2UI act) {
        CbottomWidgetListenersStore cbottomWidgetListenersStore;
        Intrinsics.checkNotNullParameter(act, "act");
        cbottomWidgetListenersStore = this.this$0.listenersStore;
        cbottomWidgetListenersStore.cbottomListenerInvoke(this.$uuid, C10837a.a(act));
    }
}
