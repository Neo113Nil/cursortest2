package ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.di;

import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.data.CourierTipsApi;
import ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation.CourierTipsViewModel;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CourierTipsComponent$Companion$create$1$1$viewModel$2 extends AbstractC7737t implements Function0<CourierTipsViewModel> {
    final /* synthetic */ C7475g $storage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CourierTipsComponent$Companion$create$1$1$viewModel$2(C7475g c7475g) {
        super(0);
        this.$storage = c7475g;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CourierTipsViewModel invoke() {
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository = ((ComposerWidgetAsyncComponentApi) this.$storage.getComponent(ComposerWidgetAsyncComponentApi.class)).getComposerAsyncWidgetRepository();
        Object create = ((NetworkComponentApi) this.$storage.getComponent(NetworkComponentApi.class)).getRetrofit().create(CourierTipsApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return new CourierTipsViewModel(composerAsyncWidgetRepository, (CourierTipsApi) create);
    }
}
