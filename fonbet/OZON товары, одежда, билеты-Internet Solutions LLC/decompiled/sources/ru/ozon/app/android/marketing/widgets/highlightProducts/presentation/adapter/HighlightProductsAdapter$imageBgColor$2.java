package ru.ozon.app.android.marketing.widgets.highlightProducts.presentation.adapter;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class HighlightProductsAdapter$imageBgColor$2 extends AbstractC7737t implements Function0<Integer> {
    final /* synthetic */ HighlightProductsAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HighlightProductsAdapter$imageBgColor$2(HighlightProductsAdapter highlightProductsAdapter) {
        super(0);
        this.this$0 = highlightProductsAdapter;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Context context;
        Context context2;
        int i11;
        int color;
        Context context3;
        int i12;
        AppTypeResolver appTypeResolver = AppTypeResolver.INSTANCE;
        context = this.this$0.context;
        if (appTypeResolver.isSelect(context)) {
            context3 = this.this$0.context;
            i12 = this.this$0.selectColorAttr;
            color = ThemeExtKt.themeColor(context3, i12);
        } else {
            context2 = this.this$0.context;
            i11 = this.this$0.bxColor;
            color = context2.getColor(i11);
        }
        return Integer.valueOf(color);
    }
}
