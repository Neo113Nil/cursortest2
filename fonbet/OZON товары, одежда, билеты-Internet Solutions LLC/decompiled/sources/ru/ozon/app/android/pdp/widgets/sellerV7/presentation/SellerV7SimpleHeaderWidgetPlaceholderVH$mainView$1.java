package ru.ozon.app.android.pdp.widgets.sellerV7.presentation;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.widgets.sellerV7.presentation.SellerV7SimpleHeaderVH;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SellerV7SimpleHeaderWidgetPlaceholderVH$mainView$1 extends AbstractC7737t implements Function0<TextAtomV2View> {
    final /* synthetic */ SellerV7SimpleHeaderWidgetPlaceholderVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerV7SimpleHeaderWidgetPlaceholderVH$mainView$1(SellerV7SimpleHeaderWidgetPlaceholderVH sellerV7SimpleHeaderWidgetPlaceholderVH) {
        super(0);
        this.this$0 = sellerV7SimpleHeaderWidgetPlaceholderVH;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TextAtomV2View invoke() {
        FrameLayout frameLayout;
        SellerV7SimpleHeaderVH.Companion companion = SellerV7SimpleHeaderVH.INSTANCE;
        frameLayout = this.this$0.view;
        Context context = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return companion.createView(context);
    }
}
