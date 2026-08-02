package ru.ozon.app.android.common.filterWidgets.filters.presentation.textinputfilter;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.TextInputFilterRefreshHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.filterWidgets.databinding.WidgetFiltersTextInputFilterBinding;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/textinputfilter/TextInputFilterViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TextInputFilterViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TextInputFilterViewHolder> {
    final /* synthetic */ TextInputFilterViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextInputFilterViewMapper$holderProducer$1(TextInputFilterViewMapper textInputFilterViewMapper) {
        super(2);
        this.this$0 = textInputFilterViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TextInputFilterViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        WidgetFiltersTextInputFilterBinding bind = WidgetFiltersTextInputFilterBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new TextInputFilterViewHolder(bind, refs, new TextInputFilterRefreshHandler(this.this$0.component().getHandlersInhibitor(), refs));
    }
}
