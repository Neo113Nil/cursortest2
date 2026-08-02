package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.data;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.data.TravelCarriageSelectV3DTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.TravelCarriageSelectV3VO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.data.TravelCarriageSelectV3Mapper$invoke$1$1$1", f = "TravelCarriageSelectV3Mapper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TravelCarriageSelectV3Mapper$invoke$1$1$1 extends j implements Function2<M, d<? super TravelCarriageSelectV3VO>, Object> {
    final /* synthetic */ TravelCarriageSelectV3DTO.CarriageDTO $carriage;
    final /* synthetic */ l20.d $widgetInfo;
    int label;
    final /* synthetic */ TravelCarriageSelectV3Mapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelCarriageSelectV3Mapper$invoke$1$1$1(TravelCarriageSelectV3Mapper travelCarriageSelectV3Mapper, TravelCarriageSelectV3DTO.CarriageDTO carriageDTO, l20.d dVar, d<? super TravelCarriageSelectV3Mapper$invoke$1$1$1> dVar2) {
        super(2, dVar2);
        this.this$0 = travelCarriageSelectV3Mapper;
        this.$carriage = carriageDTO;
        this.$widgetInfo = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TravelCarriageSelectV3Mapper$invoke$1$1$1(this.this$0, this.$carriage, this.$widgetInfo, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TravelCarriageSelectV3VO mapCarriage;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        mapCarriage = this.this$0.mapCarriage(this.$carriage, this.$widgetInfo);
        return mapCarriage;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super TravelCarriageSelectV3VO> dVar) {
        return ((TravelCarriageSelectV3Mapper$invoke$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
