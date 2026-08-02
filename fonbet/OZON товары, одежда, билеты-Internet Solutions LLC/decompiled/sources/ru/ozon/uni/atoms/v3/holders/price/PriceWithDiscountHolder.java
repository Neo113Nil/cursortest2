package ru.ozon.uni.atoms.v3.holders.price;

import Sc.InterfaceC3999a;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceWithDiscountView;
import ru.ozon.uni.atoms.data.price.PriceWithDiscount;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.WrappedAtomHolder;

@InterfaceC3999a
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/price/PriceWithDiscountHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/price/PriceWithDiscount;", "Lru/ozon/uni/android/uikit/view/atoms/price/PriceWithDiscountView;", "Lru/ozon/uni/atoms/v3/holders/WrappedAtomHolder;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/price/PriceWithDiscountView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceWithDiscountHolder extends AtomV3<PriceWithDiscount, PriceWithDiscountView> implements WrappedAtomHolder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceWithDiscountHolder(@NotNull PriceWithDiscountView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PriceWithDiscountHolder(@NotNull Context context, String str) {
        this(new PriceWithDiscountView(context, null, 0, 0, 14, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull PriceWithDiscount item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((PriceWithDiscountHolder) item);
        PriceWithDiscountView containerView = getContainerView();
        containerView.setPrice(item.getPrice());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        containerView.setPriceColor(styleParser.parseColor(context, item.getPriceColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY));
        Context context2 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        String strikethroughColor = item.getStrikethroughColor();
        StyleParser.OzColor ozColor = StyleParser.OzColor.OZ_SEMANTIC_TEXT_SALE;
        containerView.setStrikethroughColor(styleParser.parseColor(context2, strikethroughColor, ozColor));
        containerView.setDiscount(item.getDiscount());
        Context context3 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        containerView.setDiscountColor(styleParser.parseColor(context3, item.getDiscountColor(), ozColor));
    }
}
