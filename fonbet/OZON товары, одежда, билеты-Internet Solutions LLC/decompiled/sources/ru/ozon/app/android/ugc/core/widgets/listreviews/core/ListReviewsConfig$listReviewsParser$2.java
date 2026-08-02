package ru.ozon.app.android.ugc.core.widgets.listreviews.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/core/widgets/listreviews/core/ListReviewsParser;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ListReviewsConfig$listReviewsParser$2 extends AbstractC7737t implements Function0<ListReviewsParser> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ListReviewsConfig$listReviewsParser$2(JsonParser jsonParser) {
        super(0);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ListReviewsParser invoke() {
        return new ListReviewsParser(this.$jsonDeserializer);
    }
}
