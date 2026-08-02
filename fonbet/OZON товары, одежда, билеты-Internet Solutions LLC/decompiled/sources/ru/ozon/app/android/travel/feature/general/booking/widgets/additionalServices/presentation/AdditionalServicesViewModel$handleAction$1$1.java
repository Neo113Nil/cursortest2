package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation;

import Ae.w0;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.m;
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
@e(c = "ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesViewModel$handleAction$1$1", f = "AdditionalServicesViewModel.kt", l = {199, m.e.DEFAULT_DRAG_ANIMATION_DURATION, 207}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AdditionalServicesViewModel$handleAction$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $asyncData;
    final /* synthetic */ AdditionalServicesCellVO $cell;
    final /* synthetic */ Map<String, Object> $params;
    final /* synthetic */ boolean $withWaitingModalDismiss;
    int label;
    final /* synthetic */ AdditionalServicesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalServicesViewModel$handleAction$1$1(boolean z11, AdditionalServicesViewModel additionalServicesViewModel, String str, AdditionalServicesCellVO additionalServicesCellVO, Map<String, ? extends Object> map, d<? super AdditionalServicesViewModel$handleAction$1$1> dVar) {
        super(2, dVar);
        this.$withWaitingModalDismiss = z11;
        this.this$0 = additionalServicesViewModel;
        this.$asyncData = str;
        this.$cell = additionalServicesCellVO;
        this.$params = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AdditionalServicesViewModel$handleAction$1$1(this.$withWaitingModalDismiss, this.this$0, this.$asyncData, this.$cell, this.$params, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r11 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (Ae.C2399j.u(r11, r10) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (r11 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map map;
        Object fetchWithJobsMap;
        w0 w0Var;
        Map map2;
        Object fetchWithJobsMap2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            if (this.$withWaitingModalDismiss) {
                w0Var = this.this$0.modalDismissFlow;
                this.label = 1;
            } else {
                AdditionalServicesViewModel additionalServicesViewModel = this.this$0;
                String str = this.$asyncData;
                Map<String, Object> map3 = this.$params;
                AdditionalServicesCellVO additionalServicesCellVO = this.$cell;
                map = additionalServicesViewModel.controlsFetchJobs;
                this.label = 3;
                fetchWithJobsMap = additionalServicesViewModel.fetchWithJobsMap(str, map3, additionalServicesCellVO, map, this);
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                s.b(obj);
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
        s.b(obj);
        AdditionalServicesViewModel additionalServicesViewModel2 = this.this$0;
        String str2 = this.$asyncData;
        AdditionalServicesCellVO additionalServicesCellVO2 = this.$cell;
        map2 = additionalServicesViewModel2.modalDismissFetchJobs;
        this.label = 2;
        fetchWithJobsMap2 = additionalServicesViewModel2.fetchWithJobsMap(str2, null, additionalServicesCellVO2, map2, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AdditionalServicesViewModel$handleAction$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
