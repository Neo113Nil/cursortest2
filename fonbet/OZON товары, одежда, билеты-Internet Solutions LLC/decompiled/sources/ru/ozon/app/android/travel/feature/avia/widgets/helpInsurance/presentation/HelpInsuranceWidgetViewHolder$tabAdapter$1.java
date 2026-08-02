package ru.ozon.app.android.travel.feature.avia.widgets.helpInsurance.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class HelpInsuranceWidgetViewHolder$tabAdapter$1 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ ComposerReferences $refs;
    final /* synthetic */ HelpInsuranceWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HelpInsuranceWidgetViewHolder$tabAdapter$1(ComposerReferences composerReferences, HelpInsuranceWidgetViewHolder helpInsuranceWidgetViewHolder) {
        super(1);
        this.$refs = composerReferences;
        this.this$0 = helpInsuranceWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        LinearLayoutManager linearLayoutManager;
        LinearLayoutManager linearLayoutManager2;
        InterfaceC7851b controller = this.$refs.getController();
        linearLayoutManager = this.this$0.tabsLayoutManager;
        if (linearLayoutManager == null) {
            Intrinsics.n("tabsLayoutManager");
            throw null;
        }
        int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        linearLayoutManager2 = this.this$0.tabsLayoutManager;
        if (linearLayoutManager2 != null) {
            controller.update(new CaseUpdate(i11, findFirstCompletelyVisibleItemPosition, linearLayoutManager2.findLastCompletelyVisibleItemPosition()));
        } else {
            Intrinsics.n("tabsLayoutManager");
            throw null;
        }
    }
}
