package ru.ozon.app.android.search.widgets.expandableCells.presentation;

import Ae.C2406m0;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.search.widgets.expandableCells.data.api.GetWarlockSectionRequest;
import xe.C10727i;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/presentation/GetWarlockSectionViewModelImpl;", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/GetWarlockSectionViewModel;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "LAe/h;", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/WarlockResult;", "observeResultFlow", "()LAe/h;", "", "actionId", "Lru/ozon/app/android/search/widgets/expandableCells/data/api/GetWarlockSectionRequest;", "request", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellVO;", "item", "", "getWarlockSection", "(Ljava/lang/String;Lru/ozon/app/android/search/widgets/expandableCells/data/api/GetWarlockSectionRequest;Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellVO;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "LAe/w0;", "sharedFlow", "LAe/w0;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetWarlockSectionViewModelImpl extends GetWarlockSectionViewModel {

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final w0<WarlockResult> sharedFlow;

    public GetWarlockSectionViewModelImpl(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        this.sharedFlow = E0.b(0, 0, null, 7);
    }

    @Override // ru.ozon.app.android.search.widgets.expandableCells.presentation.GetWarlockSectionViewModel
    public void getWarlockSection(@NotNull String actionId, @NotNull GetWarlockSectionRequest request, @NotNull ExpandableCellVO item) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(item, "item");
        C10727i.c(x0.a(this), null, null, new GetWarlockSectionViewModelImpl$getWarlockSection$1(this, new ActionV2Request(request, actionId, false, 4, null), item, null), 3);
    }

    @Override // ru.ozon.app.android.search.widgets.expandableCells.presentation.GetWarlockSectionViewModel
    @NotNull
    public InterfaceC2395h<WarlockResult> observeResultFlow() {
        return new C2406m0(this.sharedFlow);
    }
}
