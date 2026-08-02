package ru.ozon.app.android.common.filterWidgets.filters.presentation.category.footer;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.navigation.FlowTag;
import ru.ozon.uni.atoms.af.AtomAction;
import uZ.C9992d;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class FilterCategoryFooterViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ FilterCategoryFooterViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FilterCategoryFooterViewHolder$actionHandler$1(FilterCategoryFooterViewHolder filterCategoryFooterViewHolder) {
        super(1);
        this.this$0 = filterCategoryFooterViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction it) {
        boolean z11;
        ComposerReferences composerReferences;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof AtomAction.Move) {
            composerReferences = this.this$0.refs;
            ComposerNavigator navigator = composerReferences.getNavigator();
            String link = ((AtomAction.Move) it).getLink();
            if (link == null) {
                return Boolean.FALSE;
            }
            ComposerNavigator.DefaultImpls.openDeeplinkInBottomSheet$default(navigator, "allCategories", link, null, new C9992d.b.C2202b(FlowTag.FILTER_VALUES), null, 20, null);
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }
}
