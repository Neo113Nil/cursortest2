package ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.presentation;

import Pc.a;
import WZ.l;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/main/widgets/couponGoals/v2/presentation/CouponGoalsV2ViewHolder;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CouponGoalsV2ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, CouponGoalsV2ViewHolder> {
    final /* synthetic */ CouponGoalsV2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CouponGoalsV2ViewMapper$holderProducer$1(CouponGoalsV2ViewMapper couponGoalsV2ViewMapper) {
        super(2);
        this.this$0 = couponGoalsV2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final CouponGoalsV2ViewHolder invoke(View view, ComposerReferences references) {
        a couponsAdapterFactory;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        RecyclerView recyclerView = (RecyclerView) view;
        l tokenizedAnalytics = this.this$0.component().getTokenizedAnalytics();
        couponsAdapterFactory = this.this$0.getCouponsAdapterFactory();
        return new CouponGoalsV2ViewHolder(recyclerView, references, tokenizedAnalytics, this.this$0.component().getCustomActionHandlersStoreFactory(), couponsAdapterFactory);
    }
}
