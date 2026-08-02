package ru.ozon.app.android.universalwidgets.widgets.uw.sku.secondarybutton;

import GZ.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SecondaryButtonMessageProcesser$showMessage$action$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ String $actionDeeplink;
    final /* synthetic */ SecondaryButtonMessageProcesser this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SecondaryButtonMessageProcesser$showMessage$action$1$1(String str, SecondaryButtonMessageProcesser secondaryButtonMessageProcesser) {
        super(0);
        this.$actionDeeplink = str;
        this.this$0 = secondaryButtonMessageProcesser;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        g gVar;
        String str = this.$actionDeeplink;
        if (str != null) {
            gVar = this.this$0.screenRouter;
            g.a.a(gVar, str, null, null, 6);
        }
    }
}
