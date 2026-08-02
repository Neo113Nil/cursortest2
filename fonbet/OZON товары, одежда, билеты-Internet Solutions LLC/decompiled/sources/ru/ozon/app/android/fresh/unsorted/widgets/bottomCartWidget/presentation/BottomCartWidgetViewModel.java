package ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation;

import androidx.lifecycle.P;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.WidgetState;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/BottomCartWidgetViewModel;", "", "", "asyncData", "", "setAsyncData", "(Ljava/lang/String;)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/WidgetState$NewState;", "getWidgetState", "()Landroidx/lifecycle/P;", "widgetState", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BottomCartWidgetViewModel {
    @NotNull
    P<WidgetState.NewState> getWidgetState();

    void setAsyncData(String asyncData);
}
