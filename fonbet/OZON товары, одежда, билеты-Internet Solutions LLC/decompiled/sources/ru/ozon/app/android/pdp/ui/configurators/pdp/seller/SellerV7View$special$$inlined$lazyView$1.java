package ru.ozon.app.android.pdp.ui.configurators.pdp.seller;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "V", "invoke", "()Landroid/view/View;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
public final class SellerV7View$special$$inlined$lazyView$1 extends AbstractC7737t implements Function0<Layer> {
    final /* synthetic */ Context $context$inlined;
    final /* synthetic */ ViewGroup $parent;
    final /* synthetic */ SellerV7View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerV7View$special$$inlined$lazyView$1(ViewGroup viewGroup, Context context, SellerV7View sellerV7View) {
        super(0);
        this.$parent = viewGroup;
        this.$context$inlined = context;
        this.this$0 = sellerV7View;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Layer invoke() {
        IconView secondIv;
        TextAtomV2View secondTav;
        GradientDrawable gradientDrawable;
        Layer layer = new Layer(this.$context$inlined);
        layer.setId(R$id.sellerSecondIslandL);
        layer.setLayoutParams(new ConstraintLayout.b(-2, -2));
        secondIv = this.this$0.getSecondIv();
        int id2 = secondIv.getId();
        secondTav = this.this$0.getSecondTav();
        layer.setReferencedIds(new int[]{id2, secondTav.getId()});
        Dimens dimens = Dimens.INSTANCE;
        layer.setPadding(layer.getPaddingLeft(), dimens.getDP_7(), layer.getPaddingRight(), dimens.getDP_7());
        gradientDrawable = this.this$0.islandsBgDrawable;
        layer.setBackground(gradientDrawable);
        final SellerV7View sellerV7View = this.this$0;
        layer.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.pdp.ui.configurators.pdp.seller.SellerV7View$secondIslandLayer$2$1$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Function0 function0;
                function0 = SellerV7View.this.secondIslandClick;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        layer.setElevation(1.0f);
        layer.setClipToOutline(true);
        ViewGroup viewGroup = this.$parent;
        if (viewGroup != null) {
            viewGroup.addView(layer);
        }
        return layer;
    }
}
