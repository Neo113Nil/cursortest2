package ru.ozon.app.android.checkoutcomposer.sbp.top.mapper;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkout.databinding.WidgetPopularBankListBinding;
import ru.ozon.app.android.checkoutcomposer.sbp.top.di.PopularBankListComponent;
import ru.ozon.app.android.checkoutcomposer.sbp.top.presentation.PopularBankListViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/checkoutcomposer/sbp/top/presentation/PopularBankListViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class PopularBankListViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, PopularBankListViewHolder> {
    final /* synthetic */ PopularBankListViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PopularBankListViewMapper$holderProducer$1(PopularBankListViewMapper popularBankListViewMapper) {
        super(2);
        this.this$0 = popularBankListViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final PopularBankListViewHolder invoke(View view, ComposerReferences refs) {
        PopularBankListComponent popularBankListComponent;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        WidgetPopularBankListBinding bind = WidgetPopularBankListBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        popularBankListComponent = this.this$0.component;
        return new PopularBankListViewHolder(bind, refs, popularBankListComponent.getCustomActionHandlersStoreFactory());
    }
}
