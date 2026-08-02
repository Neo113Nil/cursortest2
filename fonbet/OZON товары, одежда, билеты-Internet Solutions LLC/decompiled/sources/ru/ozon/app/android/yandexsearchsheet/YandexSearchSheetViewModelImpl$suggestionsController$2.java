package ru.ozon.app.android.yandexsearchsheet;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.mapcommon.mapcommon.SdkSuggestionsControllerWrapper;
import ru.ozon.app.android.mapcommon.mapcommon.di.provider.SdkSuggestionsControllerWrapperProvider;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/mapcommon/mapcommon/SdkSuggestionsControllerWrapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class YandexSearchSheetViewModelImpl$suggestionsController$2 extends AbstractC7737t implements Function0<SdkSuggestionsControllerWrapper> {
    final /* synthetic */ YandexSearchSheetViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    YandexSearchSheetViewModelImpl$suggestionsController$2(YandexSearchSheetViewModelImpl yandexSearchSheetViewModelImpl) {
        super(0);
        this.this$0 = yandexSearchSheetViewModelImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SdkSuggestionsControllerWrapper invoke() {
        SdkSuggestionsControllerWrapperProvider sdkSuggestionsControllerWrapperProvider;
        sdkSuggestionsControllerWrapperProvider = this.this$0.suggestionsProvider;
        return sdkSuggestionsControllerWrapperProvider.provideSuggestionsController();
    }
}
