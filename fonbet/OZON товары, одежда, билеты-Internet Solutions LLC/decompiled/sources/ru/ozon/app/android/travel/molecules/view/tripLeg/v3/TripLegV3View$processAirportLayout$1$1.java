package ru.ozon.app.android.travel.molecules.view.tripLeg.v3;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.molecules.dto.tripLeg.v3.TripLegV3DTO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.text.TextDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.molecules.view.tripLeg.v3.TripLegV3View$processAirportLayout$1$1", f = "TripLegV3View.kt", l = {169, 173}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TripLegV3View$processAirportLayout$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ int $columnWidth;
    final /* synthetic */ TripLegV3DTO $data;
    boolean Z$0;
    int label;
    final /* synthetic */ TripLegV3View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TripLegV3View$processAirportLayout$1$1(TripLegV3View tripLegV3View, int i11, TripLegV3DTO tripLegV3DTO, d<? super TripLegV3View$processAirportLayout$1$1> dVar) {
        super(2, dVar);
        this.this$0 = tripLegV3View;
        this.$columnWidth = i11;
        this.$data = tripLegV3DTO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TripLegV3View$processAirportLayout$1$1(this.this$0, this.$columnWidth, this.$data, dVar);
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
            TripLegV3View tripLegV3View = this.this$0;
            textAtomV2View = tripLegV3View.airportName;
            tripLegV3View.addView(textAtomV2View);
            TripLegV3View tripLegV3View2 = this.this$0;
            textAtomV2View2 = tripLegV3View2.airportCode;
            tripLegV3View2.addView(textAtomV2View2);
            TripLegV3View tripLegV3View3 = this.this$0;
            int i12 = this.$columnWidth;
            TextDTO airportName = this.$data.getDeparture().getAirportName();
            TextDTO airportCode = this.$data.getDeparture().getAirportCode();
            this.label = 1;
            obj = tripLegV3View3.checkAirportWidth(i12, airportName, airportCode, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z11 = this.Z$0;
                s.b(obj);
                boolean booleanValue = ((Boolean) obj).booleanValue() | z11;
                TripLegV3View tripLegV3View4 = this.this$0;
                textAtomV2View3 = tripLegV3View4.airportName;
                tripLegV3View4.removeView(textAtomV2View3);
                TripLegV3View tripLegV3View5 = this.this$0;
                textAtomV2View4 = tripLegV3View5.airportCode;
                tripLegV3View5.removeView(textAtomV2View4);
                this.this$0.updateAirportsConstraints(booleanValue);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        boolean booleanValue2 = ((Boolean) obj).booleanValue();
        TripLegV3View tripLegV3View6 = this.this$0;
        int i13 = this.$columnWidth;
        TextDTO airportName2 = this.$data.getArrival().getAirportName();
        TextDTO airportCode2 = this.$data.getArrival().getAirportCode();
        this.Z$0 = booleanValue2;
        this.label = 2;
        checkAirportWidth = tripLegV3View6.checkAirportWidth(i13, airportName2, airportCode2, this);
        if (checkAirportWidth != aVar) {
            z11 = booleanValue2;
            obj = checkAirportWidth;
            boolean booleanValue3 = ((Boolean) obj).booleanValue() | z11;
            TripLegV3View tripLegV3View42 = this.this$0;
            textAtomV2View3 = tripLegV3View42.airportName;
            tripLegV3View42.removeView(textAtomV2View3);
            TripLegV3View tripLegV3View52 = this.this$0;
            textAtomV2View4 = tripLegV3View52.airportCode;
            tripLegV3View52.removeView(textAtomV2View4);
            this.this$0.updateAirportsConstraints(booleanValue3);
            return Unit.f71690a;
        }
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TripLegV3View$processAirportLayout$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
