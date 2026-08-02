package ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.presentation.MarketingActionsPresenter;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class MarketingActionsViewMapper$holderProducer$1$1$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ MarketingActionsPresenter $presenter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarketingActionsViewMapper$holderProducer$1$1$1(MarketingActionsPresenter marketingActionsPresenter) {
        super(1);
        this.$presenter = marketingActionsPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$presenter.onActionLinkClick(it);
    }
}
