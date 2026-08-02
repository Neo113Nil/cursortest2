package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.atom.loader.data.LoaderSize;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/loader/ui/LoaderView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CartButtonV5ButtonView$loader$1 extends AbstractC7737t implements Function0<LoaderView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ CartButtonV5ButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartButtonV5ButtonView$loader$1(Context context, CartButtonV5ButtonView cartButtonV5ButtonView) {
        super(0);
        this.$context = context;
        this.this$0 = cartButtonV5ButtonView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LoaderView invoke() {
        LoaderView loaderView = new LoaderView(this.$context, null, 0, 6, null);
        Context context = this.$context;
        CartButtonV5ButtonView cartButtonV5ButtonView = this.this$0;
        loaderView.setId(R$id.loaderV);
        Dimens dimens = Dimens.INSTANCE;
        loaderView.setLayoutParams(new ConstraintLayout.b(dimens.getDP_24(), dimens.getDP_24()));
        StyleParser styleParser = StyleParser.INSTANCE;
        UniColors uniColors = UniColors.GRAPHIC_LIGHT_KEY;
        loaderView.setColor(styleParser.parseColor(context, uniColors.getToken(), uniColors.getResId()));
        loaderView.setLoaderSize(LoaderSize.LOADER_500);
        cartButtonV5ButtonView.addView(loaderView);
        ConstraintLayoutExtKt.updateConstraints(cartButtonV5ButtonView, new CartButtonV5ButtonView$loader$1$1$1(loaderView));
        return loaderView;
    }
}
