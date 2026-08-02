package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.presentation;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewProduct/presentation/BadgesAdapter;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ReviewProductBinder$badgesAdapter$2 extends AbstractC7737t implements Function0<BadgesAdapter> {
    final /* synthetic */ ReviewProductBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewProductBinder$badgesAdapter$2(ReviewProductBinder reviewProductBinder) {
        super(0);
        this.this$0 = reviewProductBinder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final BadgesAdapter invoke() {
        Function1 function1;
        ReviewProductView reviewProductView;
        function1 = this.this$0.actionHandler;
        BadgesAdapter badgesAdapter = new BadgesAdapter(function1);
        reviewProductView = this.this$0.view;
        RecyclerView badgesRv = reviewProductView.getBadgesRv();
        if (badgesRv != null) {
            badgesRv.setAdapter(badgesAdapter);
        }
        return badgesAdapter;
    }
}
