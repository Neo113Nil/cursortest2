package ru.ozon.uni.atoms.v3.holders.price;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.atoms.data.price.Price;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/drawable/Drawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class PriceHolder$onBind$1$1$1 extends AbstractC7737t implements Function1<Drawable, Unit> {
    final /* synthetic */ int $iconSize;
    final /* synthetic */ Price $item;
    final /* synthetic */ PriceView $this_run;
    final /* synthetic */ PriceHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceHolder$onBind$1$1$1(PriceView priceView, int i11, PriceHolder priceHolder, Price price) {
        super(1);
        this.$this_run = priceView;
        this.$iconSize = i11;
        this.this$0 = priceHolder;
        this.$item = price;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Drawable drawable) {
        invoke2(drawable);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Drawable drawable) {
        int imageMargin;
        this.$this_run.setImageDrawable(drawable, this.$iconSize);
        PriceView priceView = this.$this_run;
        imageMargin = this.this$0.imageMargin(this.$item.getCurrentStyle());
        priceView.setImageMargin(imageMargin);
        PriceView priceView2 = this.$this_run;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = priceView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        priceView2.setImageTint(styleParser.parseColor(context, this.$item.getImageTintColor()));
    }
}
