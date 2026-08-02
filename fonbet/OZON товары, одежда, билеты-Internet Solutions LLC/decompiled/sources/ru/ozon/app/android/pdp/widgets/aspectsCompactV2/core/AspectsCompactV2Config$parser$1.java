package ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "params", "", "state", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AspectsCompactV2Config$parser$1 extends AbstractC7737t implements Function2<String, String, List<? extends Object>> {
    final /* synthetic */ AspectsCompactV2Config this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AspectsCompactV2Config$parser$1(AspectsCompactV2Config aspectsCompactV2Config) {
        super(2);
        this.this$0 = aspectsCompactV2Config;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<Object> invoke(String str, String str2) {
        AspectCompactV2Parser aspectCompactV2Parser;
        JsonParser jsonParser;
        List<Object> invoke;
        aspectCompactV2Parser = this.this$0.aspectCompatV2Parser;
        if (aspectCompactV2Parser != null && (invoke = aspectCompactV2Parser.invoke(str, str2)) != null) {
            return invoke;
        }
        jsonParser = this.this$0.jsonDeserializer;
        AspectCompactV2Parser aspectCompactV2Parser2 = new AspectCompactV2Parser(jsonParser);
        this.this$0.aspectCompatV2Parser = aspectCompactV2Parser2;
        return aspectCompactV2Parser2.invoke(str, str2);
    }
}
