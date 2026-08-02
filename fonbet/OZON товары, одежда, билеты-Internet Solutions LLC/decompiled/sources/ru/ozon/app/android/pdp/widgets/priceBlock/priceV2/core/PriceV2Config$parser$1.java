package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.data.PriceV2DtoWrapper;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "params", "", "state", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class PriceV2Config$parser$1 extends AbstractC7737t implements Function2<String, String, List<? extends Object>> {
    final /* synthetic */ JsonParser $jsonDeserializer;
    final /* synthetic */ PriceV2Config this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceV2Config$parser$1(PriceV2Config priceV2Config, JsonParser jsonParser) {
        super(2);
        this.this$0 = priceV2Config;
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<Object> invoke(String str, String str2) {
        PriceV2Parser priceV2Parser;
        List<PriceV2DtoWrapper> invoke;
        priceV2Parser = this.this$0.priceV2Parser;
        if (priceV2Parser != null && (invoke = priceV2Parser.invoke(str, str2)) != null) {
            return invoke;
        }
        PriceV2Parser priceV2Parser2 = new PriceV2Parser(this.$jsonDeserializer);
        this.this$0.priceV2Parser = priceV2Parser2;
        return priceV2Parser2.invoke(str, str2);
    }
}
