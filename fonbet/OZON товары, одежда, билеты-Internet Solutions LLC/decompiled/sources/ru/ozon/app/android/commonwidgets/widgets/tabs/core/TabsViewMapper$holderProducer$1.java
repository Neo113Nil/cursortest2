package ru.ozon.app.android.commonwidgets.widgets.tabs.core;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.commonwidgets.widgets.tabs.presentation.TabsViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/commonwidgets/widgets/tabs/presentation/TabsViewHolder;", "itemView", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TabsViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TabsViewHolder> {
    public static final TabsViewMapper$holderProducer$1 INSTANCE = new TabsViewMapper$holderProducer$1();

    TabsViewMapper$holderProducer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final TabsViewHolder invoke(View itemView, ComposerReferences references) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(references, "references");
        return new TabsViewHolder(itemView, references.getController(), references.getTokenizedAnalytics());
    }
}
