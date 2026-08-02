package ru.ozon.app.android.travel.feature.avia.widgets.additionalServiceCard.data;

import Sc.r;
import Sc.s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalServiceCard/data/AdditionalServiceCardDTOWrapper;", "<unused var>", "", "state", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class AdditionalServiceCardConfig$parser$1 extends AbstractC7737t implements Function2<String, String, AdditionalServiceCardDTOWrapper> {
    final /* synthetic */ JsonParser $deserializer;
    final /* synthetic */ AdditionalServiceCardConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalServiceCardConfig$parser$1(AdditionalServiceCardConfig additionalServiceCardConfig, JsonParser jsonParser) {
        super(2);
        this.this$0 = additionalServiceCardConfig;
        this.$deserializer = jsonParser;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [Sc.r$b] */
    @Override // kotlin.jvm.functions.Function2
    public final AdditionalServiceCardDTOWrapper invoke(String str, String str2) {
        AdditionalServiceCardDTO additionalServiceCardDTO;
        if (str2 != null) {
            JsonParser jsonParser = this.$deserializer;
            try {
                r.Companion companion = r.INSTANCE;
                additionalServiceCardDTO = (AdditionalServiceCardDTO) jsonParser.fromJson(str2, AdditionalServiceCardDTO.class);
            } catch (Throwable th2) {
                r.Companion companion2 = r.INSTANCE;
                additionalServiceCardDTO = s.a(th2);
            }
            r3 = additionalServiceCardDTO instanceof r.b ? null : additionalServiceCardDTO;
        }
        return new AdditionalServiceCardDTOWrapper(r3);
    }
}
