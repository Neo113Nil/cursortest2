package ru.ozon.app.android.marketing.widgets.coupon.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.core.HighlightsWrapperParser;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperParser;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CouponWidgetComponent$Companion$create$1$1$parser$2 extends AbstractC7737t implements Function0<HighlightsWrapperParser> {
    final /* synthetic */ CouponWidgetComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CouponWidgetComponent$Companion$create$1$1$parser$2(CouponWidgetComponent$Companion$create$1$1 couponWidgetComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = couponWidgetComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final HighlightsWrapperParser invoke() {
        JsonParser jsonDeserializer;
        jsonDeserializer = this.this$0.getJsonDeserializer();
        return new HighlightsWrapperParser(jsonDeserializer);
    }
}
