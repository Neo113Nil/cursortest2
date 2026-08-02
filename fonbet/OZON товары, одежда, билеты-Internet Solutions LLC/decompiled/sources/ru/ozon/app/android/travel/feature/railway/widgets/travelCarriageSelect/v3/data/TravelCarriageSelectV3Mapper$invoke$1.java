package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.data;

import Sc.s;
import Wc.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.data.TravelCarriageSelectV3DTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.TravelCarriageSelectV3VO;
import xe.C10721f;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO;", "<anonymous>", "(Lxe/M;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.data.TravelCarriageSelectV3Mapper$invoke$1", f = "TravelCarriageSelectV3Mapper.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TravelCarriageSelectV3Mapper$invoke$1 extends j implements Function2<M, d<? super List<? extends TravelCarriageSelectV3VO>>, Object> {
    final /* synthetic */ TravelCarriageSelectV3DTO $state;
    final /* synthetic */ l20.d $widgetInfo;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TravelCarriageSelectV3Mapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelCarriageSelectV3Mapper$invoke$1(TravelCarriageSelectV3DTO travelCarriageSelectV3DTO, TravelCarriageSelectV3Mapper travelCarriageSelectV3Mapper, l20.d dVar, d<? super TravelCarriageSelectV3Mapper$invoke$1> dVar2) {
        super(2, dVar2);
        this.$state = travelCarriageSelectV3DTO;
        this.this$0 = travelCarriageSelectV3Mapper;
        this.$widgetInfo = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TravelCarriageSelectV3Mapper$invoke$1 travelCarriageSelectV3Mapper$invoke$1 = new TravelCarriageSelectV3Mapper$invoke$1(this.$state, this.this$0, this.$widgetInfo, dVar);
        travelCarriageSelectV3Mapper$invoke$1.L$0 = obj;
        return travelCarriageSelectV3Mapper$invoke$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super List<? extends TravelCarriageSelectV3VO>> dVar) {
        return invoke2(m11, (d<? super List<TravelCarriageSelectV3VO>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        M m11 = (M) this.L$0;
        List<TravelCarriageSelectV3DTO.CarriageDTO> carriages = this.$state.getCarriages();
        TravelCarriageSelectV3Mapper travelCarriageSelectV3Mapper = this.this$0;
        l20.d dVar = this.$widgetInfo;
        ArrayList arrayList = new ArrayList(C7714v.z(carriages, 10));
        Iterator<T> it = carriages.iterator();
        while (it.hasNext()) {
            arrayList.add(C10727i.a(m11, null, null, new TravelCarriageSelectV3Mapper$invoke$1$1$1(travelCarriageSelectV3Mapper, (TravelCarriageSelectV3DTO.CarriageDTO) it.next(), dVar, null), 3));
        }
        this.label = 1;
        Object a11 = C10721f.a(arrayList, this);
        return a11 == aVar ? aVar : a11;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<? super List<TravelCarriageSelectV3VO>> dVar) {
        return ((TravelCarriageSelectV3Mapper$invoke$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
