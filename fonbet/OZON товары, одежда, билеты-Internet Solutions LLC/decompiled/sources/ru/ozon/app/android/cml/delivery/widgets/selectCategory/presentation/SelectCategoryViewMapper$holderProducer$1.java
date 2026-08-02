package ru.ozon.app.android.cml.delivery.widgets.selectCategory.presentation;

import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cml/delivery/widgets/selectCategory/presentation/SelectCategoryViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SelectCategoryViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, SelectCategoryViewHolder> {
    final /* synthetic */ SelectCategoryViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectCategoryViewMapper$holderProducer$1(SelectCategoryViewMapper selectCategoryViewMapper) {
        super(2);
        this.this$0 = selectCategoryViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final SelectCategoryViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        return new SelectCategoryViewHolder((LinearLayout) view, this.this$0.component().getTokenizedAnalytics(), refs, this.this$0.component().getActionHandlersStoreFactory());
    }
}
