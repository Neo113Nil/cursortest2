package ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.rv;

import i10.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import pZ.f;
import ru.ozon.app.android.common.taglist.taglistv3.TagListUtilsKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.domain.flags.FullWindowFiltersEnabledFlag;
import ru.ozon.app.android.navigation.FlowTag;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.uni.atoms.af.AtomAction;
import uZ.C9992d;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ScrollingTagListV3ViewHolder$actionHandler$2 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ FeatureChecker $featureChecker;
    final /* synthetic */ ScrollingTagListV3ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingTagListV3ViewHolder$actionHandler$2(ScrollingTagListV3ViewHolder scrollingTagListV3ViewHolder, FeatureChecker featureChecker) {
        super(1);
        this.this$0 = scrollingTagListV3ViewHolder;
        this.$featureChecker = featureChecker;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction it) {
        f fullWindowFiltersDestination;
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        d dVar;
        ComposerReferences composerReferences3;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof AtomAction.Refresh) {
            AtomAction.Refresh refresh = (AtomAction.Refresh) it;
            if (!Intrinsics.d(refresh.getId(), "refreshAndScroll")) {
                return Boolean.FALSE;
            }
            dVar = this.this$0.widgetInfo;
            l.a loaderType = TagListUtilsKt.getLoaderType(dVar);
            composerReferences3 = this.this$0.composerReferences;
            TagListUtilsKt.refreshAndScroll(refresh, composerReferences3, loaderType);
            return Boolean.TRUE;
        }
        boolean z11 = false;
        if (it instanceof AtomAction.OpenComposerNestedPage) {
            AtomAction.OpenComposerNestedPage openComposerNestedPage = (AtomAction.OpenComposerNestedPage) it;
            boolean e02 = h.e0(openComposerNestedPage.getLink(), "ozon://modal/filters", false);
            boolean e03 = h.e0(openComposerNestedPage.getLink(), "ozon://modal/aspect", false);
            boolean e04 = h.e0(openComposerNestedPage.getLink(), "ozon://modal/favoriteFilters", false);
            if ((e02 || e04) && this.$featureChecker.isEnabled(FullWindowFiltersEnabledFlag.INSTANCE)) {
                fullWindowFiltersDestination = this.this$0.getFullWindowFiltersDestination(openComposerNestedPage.getLink());
                if (fullWindowFiltersDestination != null) {
                    composerReferences = this.this$0.composerReferences;
                    composerReferences.getNavigator().navigate(fullWindowFiltersDestination, 9001);
                }
            } else {
                composerReferences2 = this.this$0.composerReferences;
                ComposerNavigator.DefaultImpls.openDeeplinkInBottomSheet$default(composerReferences2.getNavigator(), e02 ? "filters" : "FragmentTag", openComposerNestedPage.getLink(), Integer.valueOf(e02 ? 9001 : 84721), e03 ? C9992d.b.c.f100438a : new C9992d.b.C2202b(FlowTag.FILTER_VALUES), null, 16, null);
            }
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }
}
