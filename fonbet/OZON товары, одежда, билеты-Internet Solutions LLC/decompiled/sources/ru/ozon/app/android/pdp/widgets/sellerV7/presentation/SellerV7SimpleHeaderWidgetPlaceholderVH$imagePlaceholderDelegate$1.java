package ru.ozon.app.android.pdp.widgets.sellerV7.presentation;

import Sc.InterfaceC4008j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/sellerV7/presentation/SellerV7SimpleHeaderBinder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SellerV7SimpleHeaderWidgetPlaceholderVH$imagePlaceholderDelegate$1 extends AbstractC7737t implements Function0<SellerV7SimpleHeaderBinder> {
    final /* synthetic */ WidgetImagePlaceholderAdapter $widgetImagePlaceholderAdapter;
    final /* synthetic */ SellerV7SimpleHeaderWidgetPlaceholderVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerV7SimpleHeaderWidgetPlaceholderVH$imagePlaceholderDelegate$1(SellerV7SimpleHeaderWidgetPlaceholderVH sellerV7SimpleHeaderWidgetPlaceholderVH, WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter) {
        super(0);
        this.this$0 = sellerV7SimpleHeaderWidgetPlaceholderVH;
        this.$widgetImagePlaceholderAdapter = widgetImagePlaceholderAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SellerV7SimpleHeaderBinder invoke() {
        InterfaceC4008j interfaceC4008j;
        interfaceC4008j = this.this$0.mainView;
        return new SellerV7SimpleHeaderBinder((TextAtomV2View) interfaceC4008j.getValue(), this.$widgetImagePlaceholderAdapter, this.this$0);
    }
}
