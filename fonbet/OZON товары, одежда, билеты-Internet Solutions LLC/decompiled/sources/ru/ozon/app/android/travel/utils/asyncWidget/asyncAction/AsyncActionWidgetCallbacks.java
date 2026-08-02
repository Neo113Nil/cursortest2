package ru.ozon.app.android.travel.utils.asyncWidget.asyncAction;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionWidgetCallbacks;", "VO", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "onAsyncWidgetAction", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface AsyncActionWidgetCallbacks<VO> extends AsyncWidgetCallbacks<VO> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <VO> void onAsyncWidgetSkipped(@NotNull AsyncActionWidgetCallbacks<VO> asyncActionWidgetCallbacks) {
            AsyncWidgetCallbacks.DefaultImpls.onAsyncWidgetSkipped(asyncActionWidgetCallbacks);
        }
    }

    void onAsyncWidgetAction(@NotNull AtomActionDTO action);
}
