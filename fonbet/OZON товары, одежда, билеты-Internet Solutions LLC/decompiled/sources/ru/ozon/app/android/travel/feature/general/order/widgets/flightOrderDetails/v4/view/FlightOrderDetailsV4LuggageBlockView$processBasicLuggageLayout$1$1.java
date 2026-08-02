package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.view;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.presentation.FlightOrderDetailsV4VO;
import ru.ozon.app.android.travel.molecules.extensions.ViewExtensionsKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.view.FlightOrderDetailsV4LuggageBlockView$processBasicLuggageLayout$1$1", f = "FlightOrderDetailsV4LuggageBlockView.kt", l = {171, 171}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FlightOrderDetailsV4LuggageBlockView$processBasicLuggageLayout$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ int $availableWidth;
    final /* synthetic */ FlightOrderDetailsV4VO.SegmentPartVO.FlightSegmentVO.LuggageBlockVO $data;
    int I$0;
    int label;
    final /* synthetic */ FlightOrderDetailsV4LuggageBlockView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightOrderDetailsV4LuggageBlockView$processBasicLuggageLayout$1$1(FlightOrderDetailsV4LuggageBlockView flightOrderDetailsV4LuggageBlockView, FlightOrderDetailsV4VO.SegmentPartVO.FlightSegmentVO.LuggageBlockVO luggageBlockVO, int i11, d<? super FlightOrderDetailsV4LuggageBlockView$processBasicLuggageLayout$1$1> dVar) {
        super(2, dVar);
        this.this$0 = flightOrderDetailsV4LuggageBlockView;
        this.$data = luggageBlockVO;
        this.$availableWidth = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FlightOrderDetailsV4LuggageBlockView$processBasicLuggageLayout$1$1(this.this$0, this.$data, this.$availableWidth, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r5 == r0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007f  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlightOrderDetailsV4LuggageView flightOrderDetailsV4LuggageView;
        FlightOrderDetailsV4LuggageView flightOrderDetailsV4LuggageView2;
        FlightOrderDetailsV4LuggageView flightOrderDetailsV4LuggageView3;
        FlightOrderDetailsV4LuggageView flightOrderDetailsV4LuggageView4;
        int i11;
        int i12;
        a aVar = a.COROUTINE_SUSPENDED;
        int i13 = this.label;
        if (i13 == 0) {
            s.b(obj);
            this.this$0.addTemporaryViews();
            flightOrderDetailsV4LuggageView = this.this$0.measureHandCarryLV;
            flightOrderDetailsV4LuggageView.bind(this.$data.getHandCarry());
            flightOrderDetailsV4LuggageView2 = this.this$0.measureLuggageLV;
            flightOrderDetailsV4LuggageView2.bind(this.$data.getLuggage());
            flightOrderDetailsV4LuggageView3 = this.this$0.measureHandCarryLV;
            this.label = 1;
            obj = ViewExtensionsKt.getWidthAfterLayout(flightOrderDetailsV4LuggageView3, this);
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.I$0;
                s.b(obj);
                int intValue = ((Number) obj).intValue() + i11;
                i12 = this.this$0.dp8;
                boolean z11 = i12 + intValue <= this.$availableWidth;
                this.this$0.removeTemporaryViews();
                this.this$0.updateConstraints(z11);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        int intValue2 = ((Number) obj).intValue();
        flightOrderDetailsV4LuggageView4 = this.this$0.measureLuggageLV;
        this.I$0 = intValue2;
        this.label = 2;
        Object widthAfterLayout = ViewExtensionsKt.getWidthAfterLayout(flightOrderDetailsV4LuggageView4, this);
        if (widthAfterLayout != aVar) {
            i11 = intValue2;
            obj = widthAfterLayout;
            int intValue3 = ((Number) obj).intValue() + i11;
            i12 = this.this$0.dp8;
            if (i12 + intValue3 <= this.$availableWidth) {
            }
            this.this$0.removeTemporaryViews();
            this.this$0.updateConstraints(z11);
            return Unit.f71690a;
        }
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FlightOrderDetailsV4LuggageBlockView$processBasicLuggageLayout$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
