package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation;

import androidx.lifecycle.J;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentAdapter;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentAdapterDelegate;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentDiffUtil;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentAdapter;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class StaticCouponListViewHolder$adapter$2 extends AbstractC7737t implements Function0<StaticCouponListContentAdapter> {
    final /* synthetic */ StaticCouponListContentDiffUtil $contentDiffUtil;
    final /* synthetic */ Map<Integer, StaticCouponListContentAdapterDelegate> $delegates;
    final /* synthetic */ ComposerReferences $refs;
    final /* synthetic */ StaticCouponListViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    StaticCouponListViewHolder$adapter$2(ComposerReferences composerReferences, StaticCouponListViewHolder staticCouponListViewHolder, Map<Integer, ? extends StaticCouponListContentAdapterDelegate> map, StaticCouponListContentDiffUtil staticCouponListContentDiffUtil) {
        super(0);
        this.$refs = composerReferences;
        this.this$0 = staticCouponListViewHolder;
        this.$delegates = map;
        this.$contentDiffUtil = staticCouponListContentDiffUtil;
    }

    @Override // kotlin.jvm.functions.Function0
    public final StaticCouponListContentAdapter invoke() {
        Function1 function1;
        J e11 = this.$refs.getContainer().e();
        function1 = this.this$0.actionHandler;
        return new StaticCouponListContentAdapter(this.$delegates, function1, e11, this.$contentDiffUtil);
    }
}
