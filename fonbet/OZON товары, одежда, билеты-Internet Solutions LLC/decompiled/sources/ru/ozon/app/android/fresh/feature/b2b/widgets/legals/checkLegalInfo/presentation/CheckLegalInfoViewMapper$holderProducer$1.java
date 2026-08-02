package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.common.LegalRouter;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoWidgetViewHolder;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CheckLegalInfoViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, CheckLegalInfoWidgetViewHolder> {
    final /* synthetic */ CheckLegalInfoViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckLegalInfoViewMapper$holderProducer$1(CheckLegalInfoViewMapper checkLegalInfoViewMapper) {
        super(2);
        this.this$0 = checkLegalInfoViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final CheckLegalInfoWidgetViewHolder invoke(View view, ComposerReferences references) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        return new CheckLegalInfoWidgetViewHolder(view, references, new LegalRouter(references.getNavigator()), this.this$0.component().getCheckLegalInfoViewModel());
    }
}
