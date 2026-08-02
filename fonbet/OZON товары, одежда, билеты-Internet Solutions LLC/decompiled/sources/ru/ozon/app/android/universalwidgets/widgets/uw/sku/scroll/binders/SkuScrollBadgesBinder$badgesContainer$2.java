package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.widgets.uw.badgescontainer.HorizontalBadgesContainerView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/universalwidgets/widgets/uw/badgescontainer/HorizontalBadgesContainerView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SkuScrollBadgesBinder$badgesContainer$2 extends AbstractC7737t implements Function0<HorizontalBadgesContainerView> {
    final /* synthetic */ SkuScrollBadgesBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SkuScrollBadgesBinder$badgesContainer$2(SkuScrollBadgesBinder skuScrollBadgesBinder) {
        super(0);
        this.this$0 = skuScrollBadgesBinder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final HorizontalBadgesContainerView invoke() {
        View findViewById;
        findViewById = this.this$0.findViewById(R$id.badgesContainer);
        return (HorizontalBadgesContainerView) findViewById;
    }
}
