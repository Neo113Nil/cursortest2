package ru.ozon.app.android.storefront.widgets.naviGrid.core.accent;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.widgets.naviGrid.presentation.NaviGridItemViewHolder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/widgets/naviGrid/presentation/NaviGridItemViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class NaviGridAccentViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, NaviGridItemViewHolder> {
    final /* synthetic */ NaviGridAccentViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NaviGridAccentViewMapper$holderProducer$1(NaviGridAccentViewMapper naviGridAccentViewMapper) {
        super(2);
        this.this$0 = naviGridAccentViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final NaviGridItemViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        return new NaviGridItemViewHolder(view, refs, this.this$0.component().getActionHandlersStoreFactory(), this.this$0.component().getTokenizedAnalytics());
    }
}
