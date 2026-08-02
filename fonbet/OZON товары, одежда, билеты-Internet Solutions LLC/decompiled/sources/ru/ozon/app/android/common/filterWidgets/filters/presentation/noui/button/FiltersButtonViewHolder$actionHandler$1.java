package ru.ozon.app.android.common.filterWidgets.filters.presentation.noui.button;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.category.FilterSharedViewModel;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class FiltersButtonViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ ComposerNavigator $navigator;
    final /* synthetic */ FiltersButtonViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FiltersButtonViewHolder$actionHandler$1(ComposerNavigator composerNavigator, FiltersButtonViewHolder filtersButtonViewHolder) {
        super(1);
        this.$navigator = composerNavigator;
        this.this$0 = filtersButtonViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction action) {
        boolean z11;
        FilterSharedViewModel filterSharedViewModel;
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.DismissRefresh) {
            AtomAction.DismissRefresh dismissRefresh = (AtomAction.DismissRefresh) action;
            if (Intrinsics.d(dismissRefresh.getId(), "applyCategories") || Intrinsics.d(dismissRefresh.getId(), "applyAspectsFilters")) {
                String link = dismissRefresh.getLink();
                if (link != null) {
                    if (h.K(link)) {
                        link = null;
                    }
                    if (link != null) {
                        filterSharedViewModel = this.this$0.filterSharedViewModel;
                        filterSharedViewModel.sendRefresh(link);
                    }
                }
                this.$navigator.popBackStack();
                z11 = true;
                return Boolean.valueOf(z11);
            }
        }
        z11 = false;
        return Boolean.valueOf(z11);
    }
}
