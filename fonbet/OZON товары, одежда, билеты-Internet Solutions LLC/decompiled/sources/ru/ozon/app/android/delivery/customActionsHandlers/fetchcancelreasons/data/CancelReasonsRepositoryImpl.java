package ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data;

import Sc.s;
import W10.c;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsRepositoryImpl;", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsRepository;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "", "link", "", "body", "LW10/c;", "trackingData", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsWithPayloads;", "fetchCancelReasons", "(Ljava/lang/String;Ljava/util/Map;LW10/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CancelReasonsRepositoryImpl implements CancelReasonsRepository {

    @NotNull
    private final ActionV2Repository actionV2Repository;

    public CancelReasonsRepositoryImpl(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.CancelReasonsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchCancelReasons(@NotNull String str, Map<String, String> map, @NotNull c cVar, @NotNull d<? super CancelReasonsWithPayloads> dVar) {
        CancelReasonsRepositoryImpl$fetchCancelReasons$1 cancelReasonsRepositoryImpl$fetchCancelReasons$1;
        int i11;
        Object data;
        if (dVar instanceof CancelReasonsRepositoryImpl$fetchCancelReasons$1) {
            cancelReasonsRepositoryImpl$fetchCancelReasons$1 = (CancelReasonsRepositoryImpl$fetchCancelReasons$1) dVar;
            int i12 = cancelReasonsRepositoryImpl$fetchCancelReasons$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cancelReasonsRepositoryImpl$fetchCancelReasons$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cancelReasonsRepositoryImpl$fetchCancelReasons$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = cancelReasonsRepositoryImpl$fetchCancelReasons$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    ActionV2Repository actionV2Repository = this.actionV2Repository;
                    ActionV2Request actionV2Request = new ActionV2Request(map, str, false, 4, null);
                    cancelReasonsRepositoryImpl$fetchCancelReasons$1.label = 1;
                    obj = actionV2Repository.callActionWithTrackingSuspend(actionV2Request, cVar, CancelReasonsDTO.class, cancelReasonsRepositoryImpl$fetchCancelReasons$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                ActionV2Response actionV2Response = (ActionV2Response) obj;
                data = actionV2Response.getData();
                if (data == null) {
                    return new CancelReasonsWithPayloads((CancelReasonsDTO) data, actionV2Response.getTrackingPayloads());
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        cancelReasonsRepositoryImpl$fetchCancelReasons$1 = new CancelReasonsRepositoryImpl$fetchCancelReasons$1(this, dVar);
        Object obj2 = cancelReasonsRepositoryImpl$fetchCancelReasons$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = cancelReasonsRepositoryImpl$fetchCancelReasons$1.label;
        if (i11 != 0) {
        }
        ActionV2Response actionV2Response2 = (ActionV2Response) obj2;
        data = actionV2Response2.getData();
        if (data == null) {
        }
    }
}
