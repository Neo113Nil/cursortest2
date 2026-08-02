package ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.viewmodel;

import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.data.TimeoutAndActionV2DTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.viewmodel.TimeoutAndActionV2AsyncWidgetViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LAe/i;", "Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/data/TimeoutAndActionV2DTO;", "", "<anonymous>", "(LAe/i;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.viewmodel.TimeoutAndActionV2AsyncWidgetViewModel$fetchWidget$2$1", f = "TimeoutAndActionV2AsyncWidgetViewModel.kt", l = {101, 106}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TimeoutAndActionV2AsyncWidgetViewModel$fetchWidget$2$1 extends j implements Function2<InterfaceC2397i<? super ComposerAsyncWidgetResponse<TimeoutAndActionV2DTO>>, d<? super Unit>, Object> {
    final /* synthetic */ TimeoutAndActionV2AsyncWidgetViewModel.FetchingModel $state;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TimeoutAndActionV2AsyncWidgetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimeoutAndActionV2AsyncWidgetViewModel$fetchWidget$2$1(TimeoutAndActionV2AsyncWidgetViewModel timeoutAndActionV2AsyncWidgetViewModel, TimeoutAndActionV2AsyncWidgetViewModel.FetchingModel fetchingModel, d<? super TimeoutAndActionV2AsyncWidgetViewModel$fetchWidget$2$1> dVar) {
        super(2, dVar);
        this.this$0 = timeoutAndActionV2AsyncWidgetViewModel;
        this.$state = fetchingModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TimeoutAndActionV2AsyncWidgetViewModel$fetchWidget$2$1 timeoutAndActionV2AsyncWidgetViewModel$fetchWidget$2$1 = new TimeoutAndActionV2AsyncWidgetViewModel$fetchWidget$2$1(this.this$0, this.$state, dVar);
        timeoutAndActionV2AsyncWidgetViewModel$fetchWidget$2$1.L$0 = obj;
        return timeoutAndActionV2AsyncWidgetViewModel$fetchWidget$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2397i<? super ComposerAsyncWidgetResponse<TimeoutAndActionV2DTO>> interfaceC2397i, d<? super Unit> dVar) {
        return ((TimeoutAndActionV2AsyncWidgetViewModel$fetchWidget$2$1) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0060, code lost:
    
        if (r1.emit((ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse) r13, r12) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r13 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2397i interfaceC2397i;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository;
        TimeoutAndActionV2AsyncWidgetViewModel$fetchWidget$2$1 timeoutAndActionV2AsyncWidgetViewModel$fetchWidget$2$1;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            interfaceC2397i = (InterfaceC2397i) this.L$0;
            composerAsyncWidgetRepository = this.this$0.asyncWidgetRepository;
            String asyncData = this.$state.getAsyncData();
            Map<String, Object> params = this.$state.getParams();
            if (params == null) {
                params = U.c();
            }
            this.L$0 = interfaceC2397i;
            this.label = 1;
            timeoutAndActionV2AsyncWidgetViewModel$fetchWidget$2$1 = this;
            obj = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository, asyncData, params, TimeoutAndActionV2DTO.class, null, timeoutAndActionV2AsyncWidgetViewModel$fetchWidget$2$1, 8, null);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            interfaceC2397i = (InterfaceC2397i) this.L$0;
            s.b(obj);
            timeoutAndActionV2AsyncWidgetViewModel$fetchWidget$2$1 = this;
        }
        timeoutAndActionV2AsyncWidgetViewModel$fetchWidget$2$1.L$0 = null;
        timeoutAndActionV2AsyncWidgetViewModel$fetchWidget$2$1.label = 2;
    }
}
