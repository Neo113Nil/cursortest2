package ru.ozon.app.android.pdp.widgets.sellerV7.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.SellerV7DTO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/SellerV7DTO;", "<unused var>", "", "state", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SellerV7Config$parser$1 extends AbstractC7737t implements Function2<String, String, SellerV7DTO> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerV7Config$parser$1(JsonParser jsonParser) {
        super(2);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function2
    public final SellerV7DTO invoke(String str, String str2) {
        JsonParser jsonParser = this.$jsonDeserializer;
        Intrinsics.f(str2);
        SellerV7DTO sellerV7DTO = (SellerV7DTO) jsonParser.fromJson(str2, SellerV7DTO.class);
        sellerV7DTO.setJson(str2);
        return sellerV7DTO;
    }
}
