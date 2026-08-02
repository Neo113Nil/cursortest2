package ru.ozon.app.android.travel.utils.asyncWidget;

import Q00.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u001c\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\b\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/utils/asyncWidget/AsyncMultipleRequestsWidgetCallbacks;", "VO", "", "onAsyncWidgetFetched", "", "fetchedModel", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "asyncData", "", "onAsyncWidgetFetchingFailed", "throwable", "", "onAsyncWidgetSkipped", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface AsyncMultipleRequestsWidgetCallbacks<VO> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void onAsyncWidgetFetchingFailed$default(AsyncMultipleRequestsWidgetCallbacks asyncMultipleRequestsWidgetCallbacks, Throwable th2, String str, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAsyncWidgetFetchingFailed");
            }
            if ((i11 & 2) != 0) {
                str = null;
            }
            asyncMultipleRequestsWidgetCallbacks.onAsyncWidgetFetchingFailed(th2, str);
        }

        public static <VO> void onAsyncWidgetSkipped(@NotNull AsyncMultipleRequestsWidgetCallbacks<VO> asyncMultipleRequestsWidgetCallbacks) {
            onAsyncWidgetFetchingFailed$default(asyncMultipleRequestsWidgetCallbacks, new a(null), null, 2, null);
        }
    }

    void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<VO> fetchedModel, @NotNull String asyncData);

    void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable, String asyncData);

    void onAsyncWidgetSkipped();
}
