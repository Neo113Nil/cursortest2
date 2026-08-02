package ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.presentation;

import WZ.l;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.main.databinding.WidgetFreshMiniappHeaderBinding;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FreshMiniappHeaderViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, FreshMiniappHeaderHolder> {
    final /* synthetic */ FreshMiniappHeaderViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshMiniappHeaderViewMapper$holderProducer$1(FreshMiniappHeaderViewMapper freshMiniappHeaderViewMapper) {
        super(2);
        this.this$0 = freshMiniappHeaderViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final FreshMiniappHeaderHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        WidgetFreshMiniappHeaderBinding bind = WidgetFreshMiniappHeaderBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        AddressUiInfoViewModel addressUiInfoViewModel = this.this$0.component().getAddressUiInfoViewModel();
        l tokenizedAnalytics = this.this$0.component().getTokenizedAnalytics();
        FreshMiniappHeaderViewModel freshMiniappHeaderViewModel = this.this$0.component().getViewModelProvider().get();
        Intrinsics.checkNotNullExpressionValue(freshMiniappHeaderViewModel, "get(...)");
        return new FreshMiniappHeaderHolder(bind, refs, addressUiInfoViewModel, tokenizedAnalytics, freshMiniappHeaderViewModel, this.this$0.component().getMapper());
    }
}
