package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewGallery;

import android.content.Context;
import android.view.View;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.cell.CellView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ReviewGalleryV2Configurator$preCreateView$1$infos$1 extends AbstractC7737t implements Function0<View> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ReviewGalleryV2Configurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryV2Configurator$preCreateView$1$infos$1(Context context, ReviewGalleryV2Configurator reviewGalleryV2Configurator) {
        super(0);
        this.$context = context;
        this.this$0 = reviewGalleryV2Configurator;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        Set set;
        Context context = this.$context;
        set = this.this$0.socialHeaderCellSubViewsSet;
        return new CellView(context, null, 0, 0, set, 14, null);
    }
}
