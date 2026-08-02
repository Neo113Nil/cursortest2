package ru.ozon.app.android.common.filterWidgets.filters.presentation.noui.navbar;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.FilterValuesViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class FilterNavBarViewHolder$actionHandler$3 extends AbstractC7737t implements Function1<AtomAction.ComposerAction, Unit> {
    final /* synthetic */ FilterValuesViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FilterNavBarViewHolder$actionHandler$3(FilterValuesViewModel filterValuesViewModel) {
        super(1);
        this.$viewModel = filterValuesViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
        invoke2(composerAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.ComposerAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$viewModel.processComposerAction(it);
    }
}
