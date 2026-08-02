package ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.data;

import Sc.r;
import Sc.s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/data/BuyTogetherWrapperDTO;", "<unused var>", "", "state", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class BuyTogetherConfig$parser$1 extends AbstractC7737t implements Function2<String, String, BuyTogetherWrapperDTO> {
    final /* synthetic */ JsonParser $deserializer;
    final /* synthetic */ BuyTogetherConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BuyTogetherConfig$parser$1(BuyTogetherConfig buyTogetherConfig, JsonParser jsonParser) {
        super(2);
        this.this$0 = buyTogetherConfig;
        this.$deserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function2
    public final BuyTogetherWrapperDTO invoke(String str, String str2) {
        Object a11;
        JsonParser jsonParser = this.$deserializer;
        try {
            r.Companion companion = r.INSTANCE;
            if (str2 == null) {
                str2 = "";
            }
            a11 = (BuyTogetherDTO) jsonParser.fromJson(str2, BuyTogetherDTO.class);
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (a11 instanceof r.b) {
            a11 = null;
        }
        return new BuyTogetherWrapperDTO((BuyTogetherDTO) a11);
    }
}
