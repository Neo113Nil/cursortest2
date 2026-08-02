package ru.ozon.app.android.travel.feature.general.common.widgets.disposableBanner.presentation;

import BO.b;
import Mc.a;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.w0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonCompletableApi;
import uc.i;
import vc.p;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/disposableBanner/presentation/DisposableBannerViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonCompletableApi;", "api", "<init>", "(Lru/ozon/app/android/travel/commonapi/api/TravelCommonCompletableApi;)V", "", "actionName", "", "params", "", "processAction", "(Ljava/lang/String;Ljava/util/Map;)V", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonCompletableApi;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DisposableBannerViewModel extends w0 {

    @NotNull
    private final TravelCommonCompletableApi api;

    public DisposableBannerViewModel(@NotNull TravelCommonCompletableApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void processAction$lambda$0() {
    }

    public final void processAction(@NotNull String actionName, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        C5415f.a(this).d();
        TravelCommonCompletableApi travelCommonCompletableApi = this.api;
        if (params == null) {
            params = U.c();
        }
        p k11 = travelCommonCompletableApi.completableResponse(actionName, params).k(a.b());
        i iVar = new i(new b(DisposableBannerViewModel$processAction$2.INSTANCE, 0), new BO.a());
        k11.a(iVar);
        C5415f.a(this).a(iVar);
    }
}
