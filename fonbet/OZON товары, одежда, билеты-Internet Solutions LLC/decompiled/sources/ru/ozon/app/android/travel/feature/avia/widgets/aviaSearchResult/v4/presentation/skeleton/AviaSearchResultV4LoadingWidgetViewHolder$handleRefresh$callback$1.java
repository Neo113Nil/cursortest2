package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.skeleton;

import A00.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import i10.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.AviaSearchResultV4LoadingVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Lkotlin/Unit;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaSearchResultV4LoadingWidgetViewHolder$handleRefresh$callback$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ AviaSearchResultV4LoadingVO.State.Refresh $state;
    final /* synthetic */ AviaSearchResultV4LoadingWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultV4LoadingWidgetViewHolder$handleRefresh$callback$1(AviaSearchResultV4LoadingVO.State.Refresh refresh, AviaSearchResultV4LoadingWidgetViewHolder aviaSearchResultV4LoadingWidgetViewHolder) {
        super(0);
        this.$state = refresh;
        this.this$0 = aviaSearchResultV4LoadingWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ComposerReferences composerReferences;
        LinearLayoutManager linearLayoutManager;
        int i11;
        AtomAction refreshAction = this.$state.getRefreshAction();
        if (refreshAction == null) {
            return null;
        }
        AviaSearchResultV4LoadingWidgetViewHolder aviaSearchResultV4LoadingWidgetViewHolder = this.this$0;
        composerReferences = aviaSearchResultV4LoadingWidgetViewHolder.refs;
        InterfaceC7851b controller = composerReferences.getController();
        String link = ((AtomAction.Refresh) refreshAction).getLink();
        linearLayoutManager = aviaSearchResultV4LoadingWidgetViewHolder.linearLayoutManager;
        int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        i11 = aviaSearchResultV4LoadingWidgetViewHolder.dp16;
        InterfaceC7851b.a.a(controller, link, null, null, new h.b(new a.C.b(findFirstCompletelyVisibleItemPosition, i11), null, 2), 6);
        return Unit.f71690a;
    }
}
