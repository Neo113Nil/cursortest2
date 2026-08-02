package ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0010\u0006\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"State", "", "<unused var>", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
public final class SteppedThermometerConfig$special$$inlined$provideDefaultParser$1 extends AbstractC7737t implements Function2<String, String, SteppedThermometerDTO> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SteppedThermometerConfig$special$$inlined$provideDefaultParser$1(JsonParser jsonParser) {
        super(2);
        this.$jsonDeserializer = jsonParser;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.data.SteppedThermometerDTO] */
    @Override // kotlin.jvm.functions.Function2
    public final SteppedThermometerDTO invoke(String str, String str2) {
        JsonParser jsonParser = this.$jsonDeserializer;
        if (str2 != null) {
            return jsonParser.fromJson(str2, SteppedThermometerDTO.class);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
