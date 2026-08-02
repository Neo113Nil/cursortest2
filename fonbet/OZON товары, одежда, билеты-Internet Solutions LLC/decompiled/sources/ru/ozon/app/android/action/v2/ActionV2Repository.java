package ru.ozon.app.android.action.v2;

import Sc.r;
import W10.c;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.sheet.ActionSheetVO;
import ru.ozon.app.android.action.sheet.AnalyticsInfo;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J7\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&¢\u0006\u0004\b\t\u0010\nJC\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\b0\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦@¢\u0006\u0004\b\u0017\u0010\u0018J>\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦@¢\u0006\u0004\b\u0019\u0010\u001aJ8\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u001b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦@¢\u0006\u0004\b\u001c\u0010\u0018JD\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u001b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦@¢\u0006\u0004\b\u001e\u0010\u001a¨\u0006 "}, d2 = {"Lru/ozon/app/android/action/v2/ActionV2Repository;", "", "D", "Lru/ozon/app/android/action/v2/models/ActionV2Request;", "request", "Ljava/lang/Class;", "type", "Lio/reactivex/y;", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "callAction", "(Lru/ozon/app/android/action/v2/models/ActionV2Request;Ljava/lang/Class;)Lio/reactivex/y;", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "widgetTrackingData", "callActionWithTracking", "(Lru/ozon/app/android/action/v2/models/ActionV2Request;LW10/c;Ljava/lang/Class;)Lio/reactivex/y;", "", "refer", "Lru/ozon/app/android/action/sheet/AnalyticsInfo;", "analyticsInfo", "Lru/ozon/app/android/action/sheet/ActionSheetVO;", "requestActionSheet", "(Lru/ozon/app/android/action/v2/models/ActionV2Request;Ljava/lang/String;Lru/ozon/app/android/action/sheet/AnalyticsInfo;)Lio/reactivex/y;", "callActionSuspend", "(Lru/ozon/app/android/action/v2/models/ActionV2Request;Ljava/lang/Class;Lkotlin/coroutines/d;)Ljava/lang/Object;", "callActionWithTrackingSuspend", "(Lru/ozon/app/android/action/v2/models/ActionV2Request;LW10/c;Ljava/lang/Class;Lkotlin/coroutines/d;)Ljava/lang/Object;", "LSc/r;", "requestActionResult-0E7RQCE", "requestActionResult", "requestActionResultWithTracking-BWLJW6A", "requestActionResultWithTracking", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ActionV2Repository {
    @NotNull
    <D> y<ActionV2Response<D>> callAction(@NotNull ActionV2Request request, @NotNull Class<D> type);

    <D> Object callActionSuspend(@NotNull ActionV2Request actionV2Request, @NotNull Class<D> cls, @NotNull d<? super ActionV2Response<D>> dVar);

    @NotNull
    <D> y<ActionV2Response<D>> callActionWithTracking(@NotNull ActionV2Request request, @NotNull c widgetTrackingData, @NotNull Class<D> type);

    <D> Object callActionWithTrackingSuspend(@NotNull ActionV2Request actionV2Request, @NotNull c cVar, @NotNull Class<D> cls, @NotNull d<? super ActionV2Response<D>> dVar);

    /* renamed from: requestActionResult-0E7RQCE, reason: not valid java name */
    <D> Object mo479requestActionResult0E7RQCE(@NotNull ActionV2Request actionV2Request, @NotNull Class<D> cls, @NotNull d<? super r<ActionV2Response<D>>> dVar);

    /* renamed from: requestActionResultWithTracking-BWLJW6A, reason: not valid java name */
    <D> Object mo480requestActionResultWithTrackingBWLJW6A(@NotNull ActionV2Request actionV2Request, @NotNull c cVar, @NotNull Class<D> cls, @NotNull d<? super r<ActionV2Response<D>>> dVar);

    @NotNull
    y<ActionV2Response<ActionSheetVO>> requestActionSheet(@NotNull ActionV2Request request, String refer, AnalyticsInfo analyticsInfo);
}
