package ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.posting;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.RefreshWithSelectedIdsHandler;
import ru.ozon.app.android.returns.cancels.databinding.WidgetCancelPostingsV2PostingBinding;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/posting/CancelPostingsV2PostingViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class CancelPostingsV2PostingViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, CancelPostingsV2PostingViewHolder> {
    public static final CancelPostingsV2PostingViewMapper$holderProducer$1 INSTANCE = new CancelPostingsV2PostingViewMapper$holderProducer$1();

    CancelPostingsV2PostingViewMapper$holderProducer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final CancelPostingsV2PostingViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        WidgetCancelPostingsV2PostingBinding bind = WidgetCancelPostingsV2PostingBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new CancelPostingsV2PostingViewHolder(bind, refs, new RefreshWithSelectedIdsHandler(refs));
    }
}
