package ru.ozon.app.android.cart.totalV3.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.cart.totalV3.data.TotalDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO;", "<unused var>", "", "state", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TotalConfig$parser$1 extends AbstractC7737t implements Function2<String, String, TotalDTO> {
    final /* synthetic */ JsonParser $deserializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TotalConfig$parser$1(JsonParser jsonParser) {
        super(2);
        this.$deserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TotalDTO invoke(String str, String str2) {
        JsonParser jsonParser = this.$deserializer;
        if (str2 != null) {
            return (TotalDTO) jsonParser.fromJson(str2, TotalDTO.class);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
