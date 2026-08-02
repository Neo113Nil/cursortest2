package ru.ozon.app.android.travel.utils.asyncWidget;

import Q00.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "VO", "", "onAsyncWidgetFetched", "", "fetchedModel", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "onAsyncWidgetFetchingFailed", "throwable", "", "onAsyncWidgetSkipped", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface AsyncWidgetCallbacks<VO> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <VO> void onAsyncWidgetSkipped(@NotNull AsyncWidgetCallbacks<VO> asyncWidgetCallbacks) {
            asyncWidgetCallbacks.onAsyncWidgetFetchingFailed(new a(null));
        }
    }

    void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<VO> fetchedModel);

    void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable);

    void onAsyncWidgetSkipped();
}
