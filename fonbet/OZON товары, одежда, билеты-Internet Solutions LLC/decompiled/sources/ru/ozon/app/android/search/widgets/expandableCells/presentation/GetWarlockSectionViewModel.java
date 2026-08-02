package ru.ozon.app.android.search.widgets.expandableCells.presentation;

import Ae.InterfaceC2395h;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.expandableCells.data.api.GetWarlockSectionRequest;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/presentation/GetWarlockSectionViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "LAe/h;", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/WarlockResult;", "observeResultFlow", "()LAe/h;", "", "actionId", "Lru/ozon/app/android/search/widgets/expandableCells/data/api/GetWarlockSectionRequest;", "request", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellVO;", "item", "", "getWarlockSection", "(Ljava/lang/String;Lru/ozon/app/android/search/widgets/expandableCells/data/api/GetWarlockSectionRequest;Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellVO;)V", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class GetWarlockSectionViewModel extends w0 {
    public abstract void getWarlockSection(@NotNull String actionId, @NotNull GetWarlockSectionRequest request, @NotNull ExpandableCellVO item);

    @NotNull
    public abstract InterfaceC2395h<WarlockResult> observeResultFlow();
}
