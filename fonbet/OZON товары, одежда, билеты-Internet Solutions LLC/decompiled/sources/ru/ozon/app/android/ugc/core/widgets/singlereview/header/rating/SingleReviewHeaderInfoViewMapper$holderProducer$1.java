package ru.ozon.app.android.ugc.core.widgets.singlereview.header.rating;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/rating/SingleReviewHeaderInfoViewHolder;", "view", "Landroid/view/View;", "<unused var>", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SingleReviewHeaderInfoViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, SingleReviewHeaderInfoViewHolder> {
    final /* synthetic */ SingleReviewHeaderInfoViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleReviewHeaderInfoViewMapper$holderProducer$1(SingleReviewHeaderInfoViewMapper singleReviewHeaderInfoViewMapper) {
        super(2);
        this.this$0 = singleReviewHeaderInfoViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final SingleReviewHeaderInfoViewHolder invoke(View view, ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "<unused var>");
        return new SingleReviewHeaderInfoViewHolder((SingleReviewHeaderInfoView) view, this.this$0.component().getTokenizedAnalytics());
    }
}
