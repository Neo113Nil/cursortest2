package ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation.view;

import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation.CatalogTileVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FavoriteBadgeView$bind$1$onClick$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Function2<t, AtomAction, Unit> $onAnalyticClickEvent;
    final /* synthetic */ CatalogTileVO.FavoriteBadge $this_with;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FavoriteBadgeView$bind$1$onClick$1(Function2<? super t, ? super AtomAction, Unit> function2, CatalogTileVO.FavoriteBadge favoriteBadge) {
        super(0);
        this.$onAnalyticClickEvent = function2;
        this.$this_with = favoriteBadge;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onAnalyticClickEvent.invoke(this.$this_with.getTokenizedEvent(), this.$this_with.getAction());
    }
}
