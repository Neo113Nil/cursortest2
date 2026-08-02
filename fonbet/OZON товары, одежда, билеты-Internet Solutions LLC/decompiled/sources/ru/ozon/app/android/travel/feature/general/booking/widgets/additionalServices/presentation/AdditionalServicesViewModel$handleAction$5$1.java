package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation;

import Ae.w0;
import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell.AdditionalServicesCellVO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesViewModel$handleAction$5$1", f = "AdditionalServicesViewModel.kt", l = {315, 316}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AdditionalServicesViewModel$handleAction$5$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $asyncData;
    final /* synthetic */ AdditionalServicesCellVO $cell;
    final /* synthetic */ AdditionalServicesCellVO.ControlType $controlType;
    int label;
    final /* synthetic */ AdditionalServicesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalServicesViewModel$handleAction$5$1(AdditionalServicesViewModel additionalServicesViewModel, AdditionalServicesCellVO additionalServicesCellVO, AdditionalServicesCellVO.ControlType controlType, String str, d<? super AdditionalServicesViewModel$handleAction$5$1> dVar) {
        super(2, dVar);
        this.this$0 = additionalServicesViewModel;
        this.$cell = additionalServicesCellVO;
        this.$controlType = controlType;
        this.$asyncData = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AdditionalServicesViewModel$handleAction$5$1(this.this$0, this.$cell, this.$controlType, this.$asyncData, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        if (r0 == r6) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (Ae.C2399j.u(r0, r22) == r6) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AdditionalServicesCellVO.ControlType.Button newButton;
        w0 w0Var;
        Map map;
        Object fetchWithJobsMap;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            AdditionalServicesViewModel additionalServicesViewModel = this.this$0;
            AdditionalServicesCellVO additionalServicesCellVO = this.$cell;
            newButton = additionalServicesViewModel.getNewButton((AdditionalServicesCellVO.ControlType.Button) this.$controlType);
            additionalServicesViewModel.setState(AdditionalServicesCellVO.copy$default(additionalServicesCellVO, 0, null, null, null, null, false, newButton, null, false, false, false, null, 4031, null));
            w0Var = this.this$0.modalDismissFlow;
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        AdditionalServicesViewModel additionalServicesViewModel2 = this.this$0;
        String str = this.$asyncData;
        AdditionalServicesCellVO additionalServicesCellVO2 = this.$cell;
        map = additionalServicesViewModel2.modalDismissFetchJobs;
        this.label = 2;
        fetchWithJobsMap = additionalServicesViewModel2.fetchWithJobsMap(str, null, additionalServicesCellVO2, map, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AdditionalServicesViewModel$handleAction$5$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
