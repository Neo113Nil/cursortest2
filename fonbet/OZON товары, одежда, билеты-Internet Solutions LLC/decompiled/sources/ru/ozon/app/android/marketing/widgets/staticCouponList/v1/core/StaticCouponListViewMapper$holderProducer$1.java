package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.core;

import WZ.l;
import android.view.View;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.di.StaticCouponListComponent;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListViewHolder;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentAdapterDelegate;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentDiffUtil;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.view.StaticCouponListView;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListViewHolder;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class StaticCouponListViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, StaticCouponListViewHolder> {
    final /* synthetic */ StaticCouponListViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StaticCouponListViewMapper$holderProducer$1(StaticCouponListViewMapper staticCouponListViewMapper) {
        super(2);
        this.this$0 = staticCouponListViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final StaticCouponListViewHolder invoke(View view, ComposerReferences references) {
        StaticCouponListComponent staticCouponListComponent;
        StaticCouponListComponent staticCouponListComponent2;
        StaticCouponListComponent staticCouponListComponent3;
        StaticCouponListComponent staticCouponListComponent4;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        StaticCouponListView staticCouponListView = (StaticCouponListView) view;
        staticCouponListComponent = this.this$0.component;
        Map<Integer, StaticCouponListContentAdapterDelegate> delegates = staticCouponListComponent.getDelegates();
        staticCouponListComponent2 = this.this$0.component;
        StaticCouponListContentDiffUtil contentDiffUtil = staticCouponListComponent2.getContentDiffUtil();
        staticCouponListComponent3 = this.this$0.component;
        l tokenizedAnalytics = staticCouponListComponent3.getTokenizedAnalytics();
        staticCouponListComponent4 = this.this$0.component;
        return new StaticCouponListViewHolder(staticCouponListView, tokenizedAnalytics, delegates, contentDiffUtil, references, staticCouponListComponent4.getHandlersInhibitor());
    }
}
