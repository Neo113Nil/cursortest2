package ru.ozon.app.android.pdp.widgets.sellerV7.core;

import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.widgets.sellerV7.presentation.SellerV7HeaderVH;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/sellerV7/presentation/SellerV7HeaderVH;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SellerV7HeaderViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, SellerV7HeaderVH> {
    final /* synthetic */ SellerV7HeaderViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerV7HeaderViewMapper$holderProducer$1(SellerV7HeaderViewMapper sellerV7HeaderViewMapper) {
        super(2);
        this.this$0 = sellerV7HeaderViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final SellerV7HeaderVH invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        return new SellerV7HeaderVH((LinearLayout) view, refs, this.this$0.component().getCustomActionHandlersStoreFactory(), this.this$0.component().getWidgetImagePlaceholderAdapter(), this.this$0.component().getSellerFavoriteService());
    }
}
