package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.data;

import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.domain.DeliveryWidgetV2Repository;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2Mapper;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2VO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000b*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJx\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/data/DeliveryWidgetV2RepositoryImpl;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/domain/DeliveryWidgetV2Repository;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "repository", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2Mapper;", "mapper", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2Mapper;)V", "", "", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "", "allowedDeliverySchemas", "filterSkusBySchemas", "(Ljava/util/Map;Ljava/util/List;)Ljava/util/List;", "addedItems", "updatedItems", "removedItems", "", "asyncData", "", "isExpressContext", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2VO;", "requestUpdateByCartChanges", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;ZLl20/d;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v2/presentation/DeliveryWidgetV2Mapper;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryWidgetV2RepositoryImpl implements DeliveryWidgetV2Repository {

    @NotNull
    private final DeliveryWidgetV2Mapper mapper;

    @NotNull
    private final ComposerAsyncWidgetRepository repository;
    public static final int $stable = 8;

    public DeliveryWidgetV2RepositoryImpl(@NotNull ComposerAsyncWidgetRepository repository, @NotNull DeliveryWidgetV2Mapper mapper) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.repository = repository;
        this.mapper = mapper;
    }

    private final List<Long> filterSkusBySchemas(Map<Long, CartItemInfo> map, List<Long> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Long, CartItemInfo> entry : map.entrySet()) {
            if (C7714v.A(list, entry.getValue().getSelectedDeliverySchema())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Number) ((Map.Entry) it.next()).getKey()).longValue()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.domain.DeliveryWidgetV2Repository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object requestUpdateByCartChanges(@NotNull Map<Long, CartItemInfo> map, @NotNull Map<Long, CartItemInfo> map2, @NotNull Map<Long, CartItemInfo> map3, @NotNull String str, @NotNull List<Long> list, boolean z11, @NotNull d dVar, @NotNull kotlin.coroutines.d<? super DeliveryWidgetV2VO> dVar2) {
        DeliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$1 deliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$1;
        int i11;
        List<Long> list2;
        List<Long> list3;
        d dVar3;
        DeliveryWidgetV2RepositoryImpl deliveryWidgetV2RepositoryImpl;
        if (dVar2 instanceof DeliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$1) {
            deliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$1 = (DeliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$1) dVar2;
            int i12 = deliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                deliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                DeliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$1 deliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$12 = deliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$1;
                Object obj = deliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$12.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = deliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$12.label;
                if (i11 != 0) {
                    s.b(obj);
                    List<Long> list4 = K.f71697a;
                    if (!list.isEmpty()) {
                        list4 = filterSkusBySchemas(map, list);
                        list2 = filterSkusBySchemas(map2, list);
                        list3 = filterSkusBySchemas(map3, list);
                    } else if (z11) {
                        list4 = new ArrayList<>(map.size());
                        Iterator<Map.Entry<Long, CartItemInfo>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            list4.add(new Long(it.next().getKey().longValue()));
                        }
                        list2 = new ArrayList<>(map2.size());
                        Iterator<Map.Entry<Long, CartItemInfo>> it2 = map2.entrySet().iterator();
                        while (it2.hasNext()) {
                            list2.add(new Long(it2.next().getKey().longValue()));
                        }
                        list3 = new ArrayList<>(map3.size());
                        Iterator<Map.Entry<Long, CartItemInfo>> it3 = map3.entrySet().iterator();
                        while (it3.hasNext()) {
                            list3.add(new Long(it3.next().getKey().longValue()));
                        }
                    } else {
                        list2 = list4;
                        list3 = list2;
                    }
                    if (list4.isEmpty() && list2.isEmpty() && list3.isEmpty()) {
                        return null;
                    }
                    ComposerAsyncWidgetRepository composerAsyncWidgetRepository = this.repository;
                    Map j11 = U.j(new Pair("addedItems", list4), new Pair("removedItems", list3), new Pair("updatedItems", list2), new Pair("isAsyncCall", Boolean.TRUE));
                    deliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$12.L$0 = this;
                    dVar3 = dVar;
                    deliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$12.L$1 = dVar3;
                    deliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$12.label = 1;
                    obj = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository, str, j11, DeliveryWidgetV2DTO.class, null, deliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$12, 8, null);
                    if (obj == aVar) {
                        return aVar;
                    }
                    deliveryWidgetV2RepositoryImpl = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar3 = (d) deliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$12.L$1;
                    deliveryWidgetV2RepositoryImpl = (DeliveryWidgetV2RepositoryImpl) deliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$12.L$0;
                    s.b(obj);
                }
                return (DeliveryWidgetV2VO) C7714v.M(deliveryWidgetV2RepositoryImpl.mapper.invoke((DeliveryWidgetV2DTO) ((ComposerAsyncWidgetResponse) obj).getState(), dVar3));
            }
        }
        deliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$1 = new DeliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$1(this, dVar2);
        DeliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$1 deliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$122 = deliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$1;
        Object obj2 = deliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$122.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = deliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$122.label;
        if (i11 != 0) {
        }
        return (DeliveryWidgetV2VO) C7714v.M(deliveryWidgetV2RepositoryImpl.mapper.invoke((DeliveryWidgetV2DTO) ((ComposerAsyncWidgetResponse) obj2).getState(), dVar3));
    }
}
