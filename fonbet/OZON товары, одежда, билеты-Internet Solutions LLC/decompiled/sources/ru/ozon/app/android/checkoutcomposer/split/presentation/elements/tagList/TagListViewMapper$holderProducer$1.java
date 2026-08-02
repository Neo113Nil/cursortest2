package ru.ozon.app.android.checkoutcomposer.split.presentation.elements.tagList;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutcomposer.split.di.SplitWidgetComponent;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/tagList/TagListViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TagListViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TagListViewHolder> {
    final /* synthetic */ SplitWidgetComponent $component;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TagListViewMapper$holderProducer$1(SplitWidgetComponent splitWidgetComponent) {
        super(2);
        this.$component = splitWidgetComponent;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TagListViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        return new TagListViewHolder((RecyclerView) view, this.$component.getCustomActionHandlersStoreFactory(), refs);
    }
}
