package ru.ozon.app.android.storefront.widgets.naviBlocksV5.core;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.widgets.naviBlocksV5.di.NaviBlocksV5WidgetComponent;
import ru.ozon.app.android.storefront.widgets.naviBlocksV5.presentation.NaviBlocksV5WidgetViewHolder;
import ru.ozon.app.android.storefront.widgets.naviBlocksV5.view.NaviBlocksV5View;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/presentation/NaviBlocksV5WidgetViewHolder;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NaviBlocksV5ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, NaviBlocksV5WidgetViewHolder> {
    final /* synthetic */ NaviBlocksV5ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NaviBlocksV5ViewMapper$holderProducer$1(NaviBlocksV5ViewMapper naviBlocksV5ViewMapper) {
        super(2);
        this.this$0 = naviBlocksV5ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final NaviBlocksV5WidgetViewHolder invoke(View view, ComposerReferences references) {
        NaviBlocksV5WidgetComponent naviBlocksV5WidgetComponent;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        naviBlocksV5WidgetComponent = this.this$0.component;
        return new NaviBlocksV5WidgetViewHolder((NaviBlocksV5View) view, naviBlocksV5WidgetComponent.getTokenizedAnalytics(), references);
    }
}
