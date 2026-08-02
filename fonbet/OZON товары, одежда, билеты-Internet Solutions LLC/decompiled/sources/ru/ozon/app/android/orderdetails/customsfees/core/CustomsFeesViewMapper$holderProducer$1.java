package ru.ozon.app.android.orderdetails.customsfees.core;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.orderdetails.customsfees.presentation.FeeViewHolder;
import ru.ozon.app.android.orderdetails.databinding.WidgetFeeBinding;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/orderdetails/customsfees/presentation/FeeViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CustomsFeesViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, FeeViewHolder> {
    final /* synthetic */ CustomsFeesViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomsFeesViewMapper$holderProducer$1(CustomsFeesViewMapper customsFeesViewMapper) {
        super(2);
        this.this$0 = customsFeesViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final FeeViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        WidgetFeeBinding bind = WidgetFeeBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new FeeViewHolder(bind, refs, this.this$0.component().getCustomActionHandlersStoreFactory(), this.this$0.component().getAdultListDelegateProvider());
    }
}
