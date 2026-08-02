package ru.ozon.app.android.marketing.widgets.highlightProducts.presentation.adapter;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import y7.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly7/k;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "()Ly7/k;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class HighlightProductsAdapter$miniProductShape$2 extends AbstractC7737t implements Function0<k> {
    final /* synthetic */ HighlightProductsAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HighlightProductsAdapter$miniProductShape$2(HighlightProductsAdapter highlightProductsAdapter) {
        super(0);
        this.this$0 = highlightProductsAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final k invoke() {
        Context context;
        k.a aVar = new k.a();
        AppTypeResolver appTypeResolver = AppTypeResolver.INSTANCE;
        context = this.this$0.context;
        aVar.c(appTypeResolver.isSelect(context) ? HighlightProductsAdapter.selectRadius : HighlightProductsAdapter.bxRadius);
        return aVar.a();
    }
}
