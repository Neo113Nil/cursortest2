package ru.ozon.app.android.yandexsearchsheet.data;

import AA.d;
import Bc.j;
import Bc.r;
import W10.c;
import com.google.android.gms.common.internal.ImagesContract;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.analytic.ActionAnalyticDelegate;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.yandexsearchsheet.DetailsSuggest;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\t\u001a\u00020\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/data/YandexSearchSheetRepository;", "", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/action/v2/analytic/ActionAnalyticDelegate;", "actionAnalyticDelegate", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/action/v2/analytic/ActionAnalyticDelegate;)V", "", ImagesContract.URL, "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "request", "Lio/reactivex/y;", "Lru/ozon/app/android/yandexsearchsheet/DetailsSuggest;", "getDetails", "(Ljava/lang/String;LW10/c;Ljava/lang/Object;)Lio/reactivex/y;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/action/v2/analytic/ActionAnalyticDelegate;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class YandexSearchSheetRepository {

    @NotNull
    private final ActionAnalyticDelegate actionAnalyticDelegate;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    public YandexSearchSheetRepository(@NotNull ActionV2Repository actionV2Repository, @NotNull ActionAnalyticDelegate actionAnalyticDelegate) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(actionAnalyticDelegate, "actionAnalyticDelegate");
        this.actionV2Repository = actionV2Repository;
        this.actionAnalyticDelegate = actionAnalyticDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DetailsSuggest getDetails$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (DetailsSuggest) function1.invoke(p02);
    }

    @NotNull
    public final y<DetailsSuggest> getDetails(@NotNull String url, @NotNull c trackingData, Object request) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        y callAction = this.actionV2Repository.callAction(new ActionV2Request(request, url, false, 4, null), DetailsSuggest.class);
        d dVar = new d(new YandexSearchSheetRepository$getDetails$1(this, trackingData), 5);
        callAction.getClass();
        r rVar = new r(new j(callAction, dVar), new Cw.c(YandexSearchSheetRepository$getDetails$2.INSTANCE, 5));
        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
        return rVar;
    }
}
