package ru.ozon.app.android.yandexsearchsheet.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.yandexsearchsheet.SuggestVO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<unused var>", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$SuggestInfo;", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class YandexSuggestionsAdapter$onAddressClick$1 extends AbstractC7737t implements Function2<SuggestVO.Suggest.SuggestInfo, Integer, Unit> {
    public static final YandexSuggestionsAdapter$onAddressClick$1 INSTANCE = new YandexSuggestionsAdapter$onAddressClick$1();

    YandexSuggestionsAdapter$onAddressClick$1() {
        super(2);
    }

    public final void invoke(SuggestVO.Suggest.SuggestInfo suggestInfo, int i11) {
        Intrinsics.checkNotNullParameter(suggestInfo, "<unused var>");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(SuggestVO.Suggest.SuggestInfo suggestInfo, Integer num) {
        invoke(suggestInfo, num.intValue());
        return Unit.f71690a;
    }
}
