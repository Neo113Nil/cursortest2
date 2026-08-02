package ru.ozon.app.android.search.catalog.components.searchresultssortv2.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import pZ.f;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.domain.flags.FullWindowFiltersEnabledFlag;
import ru.ozon.app.android.navigation.FlowTag;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.uni.atoms.af.AtomAction;
import uZ.C9992d;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SearchResultsSortV2WidgetViewHolder$actionHandler$2 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ FeatureChecker $featureChecker;
    final /* synthetic */ SearchResultsSortV2WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchResultsSortV2WidgetViewHolder$actionHandler$2(FeatureChecker featureChecker, SearchResultsSortV2WidgetViewHolder searchResultsSortV2WidgetViewHolder) {
        super(1);
        this.$featureChecker = featureChecker;
        this.this$0 = searchResultsSortV2WidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction it) {
        boolean z11;
        ComposerReferences composerReferences;
        f fullWindowFiltersDestination;
        ComposerReferences composerReferences2;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof AtomAction.OpenComposerNestedPage) {
            if (this.$featureChecker.isEnabled(FullWindowFiltersEnabledFlag.INSTANCE)) {
                fullWindowFiltersDestination = this.this$0.getFullWindowFiltersDestination(((AtomAction.OpenComposerNestedPage) it).getLink());
                if (fullWindowFiltersDestination != null) {
                    composerReferences2 = this.this$0.refs;
                    composerReferences2.getNavigator().navigate(fullWindowFiltersDestination, 9001);
                }
            } else {
                composerReferences = this.this$0.refs;
                ComposerNavigator.DefaultImpls.openDeeplinkInBottomSheet$default(composerReferences.getNavigator(), "filters", ((AtomAction.OpenComposerNestedPage) it).getLink(), 9001, new C9992d.b.C2202b(FlowTag.FILTER_VALUES), null, 16, null);
            }
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }
}
