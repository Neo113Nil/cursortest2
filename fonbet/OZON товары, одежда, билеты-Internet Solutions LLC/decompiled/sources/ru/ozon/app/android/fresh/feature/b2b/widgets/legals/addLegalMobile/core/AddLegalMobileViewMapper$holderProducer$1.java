package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalMobile.core;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetAddLegalMobileBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalMobile.presentation.AddLegalMobileViewHolder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalMobile/presentation/AddLegalMobileViewHolder;", "view", "Landroid/view/View;", "<unused var>", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AddLegalMobileViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, AddLegalMobileViewHolder> {
    final /* synthetic */ AddLegalMobileViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddLegalMobileViewMapper$holderProducer$1(AddLegalMobileViewMapper addLegalMobileViewMapper) {
        super(2);
        this.this$0 = addLegalMobileViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final AddLegalMobileViewHolder invoke(View view, ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "<unused var>");
        WidgetAddLegalMobileBinding bind = WidgetAddLegalMobileBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new AddLegalMobileViewHolder(bind, this.this$0.component().getOzonRouter());
    }
}
