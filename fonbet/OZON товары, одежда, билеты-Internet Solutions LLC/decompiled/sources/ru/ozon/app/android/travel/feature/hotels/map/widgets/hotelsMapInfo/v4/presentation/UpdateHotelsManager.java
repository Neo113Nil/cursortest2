package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.BoundingBoxV2;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.HotelsMapInfoV4DTO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.HotelsMapInfoV4Mapper;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import we0.i;
import xe.C10727i;
import xe.I;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ:\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012Jg\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f*\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00132\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ?\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f*\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u0015H\u0002¢\u0006\u0004\b \u0010!J:\u0010$\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010#\u001a\u00020\"2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b$\u0010%JT\u0010&\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010#\u001a\u00020\"2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0086@¢\u0006\u0004\b&\u0010'Jh\u00101\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u000200\u0018\u00010/2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010#\u001a\u00020\"2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\u0006\u0010)\u001a\u00020(2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+H\u0086@¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/UpdateHotelsManager;", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4Mapper;", "mapper", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatchersProvider", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4Mapper;Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "", "actionName", "", "params", "", "widgetId", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/FetchPinsActionResponseVO;", "performUpdate", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Long;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "lastVisiblePinsOnMap", "Lwe0/i;", "area", "cachedDistrictIds", "", "currentZoom", "prepareParams", "(Ljava/util/Map;Ljava/util/List;Lwe0/i;Ljava/util/List;Ljava/lang/Float;)Ljava/util/Map;", "requiredIds", "prepareParamsForDownloadCard", "(Ljava/util/Map;Ljava/util/List;)Ljava/util/Map;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/BoundingBoxV2;", "toBoundingBoxV2", "(Lwe0/i;)Lru/ozon/app/android/travel/feature/hotels/map/shared/data/BoundingBoxV2;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "downloadPins", "(Ljava/lang/Long;Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Ljava/util/List;Lwe0/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "fetchHotels", "(Ljava/lang/Long;Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Ljava/util/List;Lwe0/i;Ljava/util/List;Ljava/lang/Float;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle;", "cardStyle", "favoriteIds", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "", "onGetNotification", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Card;", "downloadCards", "(Ljava/lang/Long;Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Ljava/util/List;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4Mapper;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UpdateHotelsManager {

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final CoroutineDispatcherProvider dispatchersProvider;

    @NotNull
    private final HotelsMapInfoV4Mapper mapper;

    public UpdateHotelsManager(@NotNull HotelsMapInfoV4Mapper mapper, @NotNull ActionV2Repository actionV2Repository, @NotNull CoroutineDispatcherProvider dispatchersProvider) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(dispatchersProvider, "dispatchersProvider");
        this.mapper = mapper;
        this.actionV2Repository = actionV2Repository;
        this.dispatchersProvider = dispatchersProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performUpdate(String str, Map<String, ? extends Object> map, Long l11, d<? super FetchPinsActionResponseVO> dVar) {
        UpdateHotelsManager$performUpdate$1 updateHotelsManager$performUpdate$1;
        int i11;
        UpdateHotelsManager updateHotelsManager;
        if (dVar instanceof UpdateHotelsManager$performUpdate$1) {
            updateHotelsManager$performUpdate$1 = (UpdateHotelsManager$performUpdate$1) dVar;
            int i12 = updateHotelsManager$performUpdate$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                updateHotelsManager$performUpdate$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = updateHotelsManager$performUpdate$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = updateHotelsManager$performUpdate$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    I io2 = this.dispatchersProvider.getIO();
                    UpdateHotelsManager$performUpdate$response$1 updateHotelsManager$performUpdate$response$1 = new UpdateHotelsManager$performUpdate$response$1(this, map, str, null);
                    updateHotelsManager$performUpdate$1.L$0 = this;
                    updateHotelsManager$performUpdate$1.L$1 = l11;
                    updateHotelsManager$performUpdate$1.label = 1;
                    obj = C10727i.f(io2, updateHotelsManager$performUpdate$response$1, updateHotelsManager$performUpdate$1);
                    if (obj != aVar) {
                        updateHotelsManager = this;
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return obj;
                }
                l11 = (Long) updateHotelsManager$performUpdate$1.L$1;
                updateHotelsManager = (UpdateHotelsManager) updateHotelsManager$performUpdate$1.L$0;
                s.b(obj);
                I i13 = updateHotelsManager.dispatchersProvider.getDefault();
                UpdateHotelsManager$performUpdate$2 updateHotelsManager$performUpdate$2 = new UpdateHotelsManager$performUpdate$2((ActionV2Response) obj, updateHotelsManager, l11, null);
                updateHotelsManager$performUpdate$1.L$0 = null;
                updateHotelsManager$performUpdate$1.L$1 = null;
                updateHotelsManager$performUpdate$1.label = 2;
                Object f7 = C10727i.f(i13, updateHotelsManager$performUpdate$2, updateHotelsManager$performUpdate$1);
                return f7 != aVar ? aVar : f7;
            }
        }
        updateHotelsManager$performUpdate$1 = new UpdateHotelsManager$performUpdate$1(this, dVar);
        Object obj2 = updateHotelsManager$performUpdate$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = updateHotelsManager$performUpdate$1.label;
        if (i11 != 0) {
        }
        I i132 = updateHotelsManager.dispatchersProvider.getDefault();
        UpdateHotelsManager$performUpdate$2 updateHotelsManager$performUpdate$22 = new UpdateHotelsManager$performUpdate$2((ActionV2Response) obj2, updateHotelsManager, l11, null);
        updateHotelsManager$performUpdate$1.L$0 = null;
        updateHotelsManager$performUpdate$1.L$1 = null;
        updateHotelsManager$performUpdate$1.label = 2;
        Object f72 = C10727i.f(i132, updateHotelsManager$performUpdate$22, updateHotelsManager$performUpdate$1);
        if (f72 != aVar2) {
        }
    }

    private final Map<String, Object> prepareParams(Map<String, ? extends Object> map, List<String> list, i iVar, List<String> list2, Float f7) {
        LinkedHashMap u11 = map != null ? U.u(map) : new LinkedHashMap();
        u11.put("cachedPinIds", list);
        u11.put("visibleRegion", iVar != null ? toBoundingBoxV2(iVar) : null);
        if (list2 != null) {
            u11.put("cachedDistrictIds", list2);
        }
        if (f7 != null) {
            u11.put("currentZoom", Float.valueOf(f7.floatValue()));
        }
        return u11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Map prepareParams$default(UpdateHotelsManager updateHotelsManager, Map map, List list, i iVar, List list2, Float f7, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            list2 = null;
        }
        if ((i11 & 8) != 0) {
            f7 = null;
        }
        return updateHotelsManager.prepareParams(map, list, iVar, list2, f7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> prepareParamsForDownloadCard(Map<String, ? extends Object> map, List<String> list) {
        LinkedHashMap u11 = map != null ? U.u(map) : new LinkedHashMap();
        u11.put("ids", list);
        return u11;
    }

    private final BoundingBoxV2 toBoundingBoxV2(i iVar) {
        return new BoundingBoxV2(new double[]{iVar.d().getLatitude(), iVar.d().getLongitude()}, new double[]{iVar.g().getLatitude(), iVar.g().getLongitude()});
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object downloadCards(Long l11, @NotNull AtomAction.ComposerAction composerAction, @NotNull List<String> list, @NotNull HotelsMapInfoV4DTO.CardStyle cardStyle, @NotNull List<String> list2, @NotNull Function1<? super NotificationDTO, Unit> function1, @NotNull d<? super Map<String, HotelsMapInfoV4VO.Card>> dVar) {
        UpdateHotelsManager$downloadCards$1 updateHotelsManager$downloadCards$1;
        int i11;
        Long l12;
        HotelsMapInfoV4DTO.CardStyle cardStyle2;
        List<String> list3;
        Function1<? super NotificationDTO, Unit> function12;
        UpdateHotelsManager updateHotelsManager;
        if (dVar instanceof UpdateHotelsManager$downloadCards$1) {
            updateHotelsManager$downloadCards$1 = (UpdateHotelsManager$downloadCards$1) dVar;
            int i12 = updateHotelsManager$downloadCards$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                updateHotelsManager$downloadCards$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = updateHotelsManager$downloadCards$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = updateHotelsManager$downloadCards$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    I io2 = this.dispatchersProvider.getIO();
                    UpdateHotelsManager$downloadCards$response$1 updateHotelsManager$downloadCards$response$1 = new UpdateHotelsManager$downloadCards$response$1(this, composerAction, list, null);
                    updateHotelsManager$downloadCards$1.L$0 = this;
                    updateHotelsManager$downloadCards$1.L$1 = l11;
                    updateHotelsManager$downloadCards$1.L$2 = cardStyle;
                    updateHotelsManager$downloadCards$1.L$3 = list2;
                    updateHotelsManager$downloadCards$1.L$4 = function1;
                    updateHotelsManager$downloadCards$1.label = 1;
                    obj = C10727i.f(io2, updateHotelsManager$downloadCards$response$1, updateHotelsManager$downloadCards$1);
                    if (obj != aVar) {
                        l12 = l11;
                        cardStyle2 = cardStyle;
                        list3 = list2;
                        function12 = function1;
                        updateHotelsManager = this;
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return obj;
                }
                Function1<? super NotificationDTO, Unit> function13 = (Function1) updateHotelsManager$downloadCards$1.L$4;
                List<String> list4 = (List) updateHotelsManager$downloadCards$1.L$3;
                HotelsMapInfoV4DTO.CardStyle cardStyle3 = (HotelsMapInfoV4DTO.CardStyle) updateHotelsManager$downloadCards$1.L$2;
                Long l13 = (Long) updateHotelsManager$downloadCards$1.L$1;
                UpdateHotelsManager updateHotelsManager2 = (UpdateHotelsManager) updateHotelsManager$downloadCards$1.L$0;
                s.b(obj);
                list3 = list4;
                cardStyle2 = cardStyle3;
                l12 = l13;
                updateHotelsManager = updateHotelsManager2;
                function12 = function13;
                ActionV2Response actionV2Response = (ActionV2Response) obj;
                I i13 = updateHotelsManager.dispatchersProvider.getDefault();
                UpdateHotelsManager$downloadCards$2 updateHotelsManager$downloadCards$2 = new UpdateHotelsManager$downloadCards$2(actionV2Response, function12, updateHotelsManager, l12, cardStyle2, list3, null);
                updateHotelsManager$downloadCards$1.L$0 = null;
                updateHotelsManager$downloadCards$1.L$1 = null;
                updateHotelsManager$downloadCards$1.L$2 = null;
                updateHotelsManager$downloadCards$1.L$3 = null;
                updateHotelsManager$downloadCards$1.L$4 = null;
                updateHotelsManager$downloadCards$1.label = 2;
                Object f7 = C10727i.f(i13, updateHotelsManager$downloadCards$2, updateHotelsManager$downloadCards$1);
                return f7 != aVar ? aVar : f7;
            }
        }
        updateHotelsManager$downloadCards$1 = new UpdateHotelsManager$downloadCards$1(this, dVar);
        Object obj2 = updateHotelsManager$downloadCards$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = updateHotelsManager$downloadCards$1.label;
        if (i11 != 0) {
        }
        ActionV2Response actionV2Response2 = (ActionV2Response) obj2;
        I i132 = updateHotelsManager.dispatchersProvider.getDefault();
        UpdateHotelsManager$downloadCards$2 updateHotelsManager$downloadCards$22 = new UpdateHotelsManager$downloadCards$2(actionV2Response2, function12, updateHotelsManager, l12, cardStyle2, list3, null);
        updateHotelsManager$downloadCards$1.L$0 = null;
        updateHotelsManager$downloadCards$1.L$1 = null;
        updateHotelsManager$downloadCards$1.L$2 = null;
        updateHotelsManager$downloadCards$1.L$3 = null;
        updateHotelsManager$downloadCards$1.L$4 = null;
        updateHotelsManager$downloadCards$1.label = 2;
        Object f72 = C10727i.f(i132, updateHotelsManager$downloadCards$22, updateHotelsManager$downloadCards$1);
        if (f72 != aVar2) {
        }
    }

    public final Object downloadPins(Long l11, @NotNull AtomAction.ComposerAction composerAction, @NotNull List<String> list, @NotNull i iVar, @NotNull d<? super FetchPinsActionResponseVO> dVar) {
        return performUpdate(composerAction.getActionName(), prepareParams$default(this, composerAction.getParams(), list, iVar, null, null, 12, null), l11, dVar);
    }

    public final Object fetchHotels(Long l11, @NotNull AtomAction.ComposerAction composerAction, @NotNull List<String> list, i iVar, @NotNull List<String> list2, Float f7, @NotNull d<? super FetchPinsActionResponseVO> dVar) {
        return performUpdate(composerAction.getActionName(), prepareParams(composerAction.getParams(), list, iVar, list2, f7), l11, dVar);
    }
}
