package ru.ozon.app.android.travel.molecules.view.tripLeg.v2;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.molecules.dto.tripLeg.v2.TripLegV2DTO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.text.TextDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.molecules.view.tripLeg.v2.TripLegV2View$processAirportLayout$1$1", f = "TripLegV2View.kt", l = {149, 153}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TripLegV2View$processAirportLayout$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ int $columnWidth;
    final /* synthetic */ TripLegV2DTO $data;
    boolean Z$0;
    int label;
    final /* synthetic */ TripLegV2View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TripLegV2View$processAirportLayout$1$1(TripLegV2View tripLegV2View, int i11, TripLegV2DTO tripLegV2DTO, d<? super TripLegV2View$processAirportLayout$1$1> dVar) {
        super(2, dVar);
        this.this$0 = tripLegV2View;
        this.$columnWidth = i11;
        this.$data = tripLegV2DTO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TripLegV2View$processAirportLayout$1$1(this.this$0, this.$columnWidth, this.$data, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        TextAtomV2View textAtomV2View;
        TextAtomV2View textAtomV2View2;
        Object checkAirportWidth;
        boolean z11;
        TextAtomV2View textAtomV2View3;
        TextAtomV2View textAtomV2View4;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            TripLegV2View tripLegV2View = this.this$0;
            textAtomV2View = tripLegV2View.airportName;
            tripLegV2View.addView(textAtomV2View);
            TripLegV2View tripLegV2View2 = this.this$0;
            textAtomV2View2 = tripLegV2View2.airportCode;
            tripLegV2View2.addView(textAtomV2View2);
            TripLegV2View tripLegV2View3 = this.this$0;
            int i12 = this.$columnWidth;
            TextDTO airportName = this.$data.getDeparture().getAirportName();
            TextDTO airportCode = this.$data.getDeparture().getAirportCode();
            this.label = 1;
            obj = tripLegV2View3.checkAirportWidth(i12, airportName, airportCode, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z11 = this.Z$0;
                s.b(obj);
                boolean booleanValue = ((Boolean) obj).booleanValue() | z11;
                TripLegV2View tripLegV2View4 = this.this$0;
                textAtomV2View3 = tripLegV2View4.airportName;
                tripLegV2View4.removeView(textAtomV2View3);
                TripLegV2View tripLegV2View5 = this.this$0;
                textAtomV2View4 = tripLegV2View5.airportCode;
                tripLegV2View5.removeView(textAtomV2View4);
                this.this$0.updateAirportsConstraints(booleanValue);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        boolean booleanValue2 = ((Boolean) obj).booleanValue();
        TripLegV2View tripLegV2View6 = this.this$0;
        int i13 = this.$columnWidth;
        TextDTO airportName2 = this.$data.getArrival().getAirportName();
        TextDTO airportCode2 = this.$data.getArrival().getAirportCode();
        this.Z$0 = booleanValue2;
        this.label = 2;
        checkAirportWidth = tripLegV2View6.checkAirportWidth(i13, airportName2, airportCode2, this);
        if (checkAirportWidth != aVar) {
            z11 = booleanValue2;
            obj = checkAirportWidth;
            boolean booleanValue3 = ((Boolean) obj).booleanValue() | z11;
            TripLegV2View tripLegV2View42 = this.this$0;
            textAtomV2View3 = tripLegV2View42.airportName;
            tripLegV2View42.removeView(textAtomV2View3);
            TripLegV2View tripLegV2View52 = this.this$0;
            textAtomV2View4 = tripLegV2View52.airportCode;
            tripLegV2View52.removeView(textAtomV2View4);
            this.this$0.updateAirportsConstraints(booleanValue3);
            return Unit.f71690a;
        }
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TripLegV2View$processAirportLayout$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
