package ru.ozon.app.android.ugc.widgets.listquestions.core.more;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.databinding.WidgetListquestionsMoreBinding;
import ru.ozon.app.android.ugc.widgets.listquestions.presentation.more.MoreQuestionsViewHolder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/widgets/listquestions/presentation/more/MoreQuestionsViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class MoreQuestionsViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, MoreQuestionsViewHolder> {
    public static final MoreQuestionsViewMapper$holderProducer$1 INSTANCE = new MoreQuestionsViewMapper$holderProducer$1();

    MoreQuestionsViewMapper$holderProducer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final MoreQuestionsViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        WidgetListquestionsMoreBinding bind = WidgetListquestionsMoreBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new MoreQuestionsViewHolder(bind, refs);
    }
}
