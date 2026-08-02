package ru.ozon.app.android.travel.usecase;

import Sc.r;
import Sc.s;
import W10.c;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6512o;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResponseV2;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002@\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ>\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000e\u001a\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00032\n\u0010\u0010\u001a\u00060\u0005j\u0002`\u0006H\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/usecase/RequestTravelCommonActionV2UseCase;", "Lkotlin/Function4;", "", "", "", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "Lkotlin/coroutines/d;", "LSc/r;", "Lru/ozon/app/android/travel/usecase/TravelCommonActionV2Model;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "actionName", "params", "trackingData", "invoke-BWLJW6A", "(Ljava/lang/String;Ljava/util/Map;LW10/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "invoke", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RequestTravelCommonActionV2UseCase implements InterfaceC6512o<String, Map<String, ? extends Object>, c, d<? super r<? extends TravelCommonActionV2Model>>, Object> {

    @NotNull
    private final ActionV2Repository actionV2Repository;

    public RequestTravelCommonActionV2UseCase(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:27|28))(3:29|30|(1:32))|11|12|(3:17|18|(1:20)(2:21|22))|14|15))|37|6|7|(0)(0)|11|12|(0)|14|15|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0027, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004f, code lost:
    
        r6 = Sc.r.INSTANCE;
        r8 = Sc.s.a(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // fd.InterfaceC6512o
    /* renamed from: invoke-BWLJW6A, reason: not valid java name and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull c cVar, @NotNull d<? super r<TravelCommonActionV2Model>> dVar) {
        RequestTravelCommonActionV2UseCase$invoke$1 requestTravelCommonActionV2UseCase$invoke$1;
        int i11;
        Object a11;
        if (dVar instanceof RequestTravelCommonActionV2UseCase$invoke$1) {
            requestTravelCommonActionV2UseCase$invoke$1 = (RequestTravelCommonActionV2UseCase$invoke$1) dVar;
            int i12 = requestTravelCommonActionV2UseCase$invoke$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                requestTravelCommonActionV2UseCase$invoke$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = requestTravelCommonActionV2UseCase$invoke$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = requestTravelCommonActionV2UseCase$invoke$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    r.Companion companion = r.INSTANCE;
                    ActionV2Repository actionV2Repository = this.actionV2Repository;
                    ActionV2Request actionV2Request = new ActionV2Request(map, str, true);
                    requestTravelCommonActionV2UseCase$invoke$1.label = 1;
                    obj = actionV2Repository.callActionWithTrackingSuspend(actionV2Request, cVar, TravelCommonActionResponseV2.class, requestTravelCommonActionV2UseCase$invoke$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                a11 = (ActionV2Response) obj;
                r.Companion companion2 = r.INSTANCE;
                if (!(a11 instanceof r.b)) {
                    try {
                        Object data = ((ActionV2Response) a11).getData();
                        if (data == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        TravelCommonActionResponseV2 travelCommonActionResponseV2 = (TravelCommonActionResponseV2) data;
                        a11 = new TravelCommonActionV2Model(AtomActionMapperKt.toAtomAction(travelCommonActionResponseV2.getAction(), null), travelCommonActionResponseV2.getNotification());
                    } catch (Throwable th2) {
                        r.Companion companion3 = r.INSTANCE;
                        a11 = s.a(th2);
                    }
                }
                return r.a(a11);
            }
        }
        requestTravelCommonActionV2UseCase$invoke$1 = new RequestTravelCommonActionV2UseCase$invoke$1(this, dVar);
        Object obj2 = requestTravelCommonActionV2UseCase$invoke$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = requestTravelCommonActionV2UseCase$invoke$1.label;
        if (i11 != 0) {
        }
        a11 = (ActionV2Response) obj2;
        r.Companion companion22 = r.INSTANCE;
        if (!(a11 instanceof r.b)) {
        }
        return r.a(a11);
    }
}
