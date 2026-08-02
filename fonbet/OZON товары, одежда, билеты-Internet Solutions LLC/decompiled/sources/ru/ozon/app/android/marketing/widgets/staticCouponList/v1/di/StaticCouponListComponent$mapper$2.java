package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data.StaticCouponListBackgroundMapperImpl;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data.StaticCouponListBadgeMapperImpl;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data.StaticCouponListCouponMapperImpl;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data.StaticCouponListCreativeMapperImpl;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data.StaticCouponListMapper;
import ru.ozon.app.android.travel.utils.timerFlow.ElapsedTimeProvider;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class StaticCouponListComponent$mapper$2 extends AbstractC7737t implements Function0<StaticCouponListMapper> {
    final /* synthetic */ StaticCouponListComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StaticCouponListComponent$mapper$2(StaticCouponListComponent staticCouponListComponent) {
        super(0);
        this.this$0 = staticCouponListComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final StaticCouponListMapper invoke() {
        ContextComponentDependencies contextComponentDependencies;
        ElapsedTimeProvider elapsedTimeProvider;
        contextComponentDependencies = this.this$0.contextComponentDependencies;
        StaticCouponListBackgroundMapperImpl staticCouponListBackgroundMapperImpl = new StaticCouponListBackgroundMapperImpl(contextComponentDependencies.getContext());
        elapsedTimeProvider = this.this$0.getElapsedTimeProvider();
        return new StaticCouponListMapper(new StaticCouponListBadgeMapperImpl(elapsedTimeProvider, staticCouponListBackgroundMapperImpl), new StaticCouponListCouponMapperImpl(staticCouponListBackgroundMapperImpl), new StaticCouponListCreativeMapperImpl());
    }
}
