package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders;

import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.main.R$color;
import ru.ozon.app.android.fresh.main.databinding.ItemWiseBannerBinding;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/GradientDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class WiseImageBannerHolder$paranjaDrawable$2 extends AbstractC7737t implements Function0<GradientDrawable> {
    final /* synthetic */ WiseImageBannerHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WiseImageBannerHolder$paranjaDrawable$2(WiseImageBannerHolder wiseImageBannerHolder) {
        super(0);
        this.this$0 = wiseImageBannerHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final GradientDrawable invoke() {
        ItemWiseBannerBinding itemWiseBannerBinding;
        ItemWiseBannerBinding itemWiseBannerBinding2;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        itemWiseBannerBinding = this.this$0.binding;
        int color = androidx.core.content.a.getColor(itemWiseBannerBinding.getConstraintLayout().getContext(), R$color.black_paranja);
        itemWiseBannerBinding2 = this.this$0.binding;
        return new GradientDrawable(orientation, new int[]{color, androidx.core.content.a.getColor(itemWiseBannerBinding2.getConstraintLayout().getContext(), R$color.black_transparent)});
    }
}
