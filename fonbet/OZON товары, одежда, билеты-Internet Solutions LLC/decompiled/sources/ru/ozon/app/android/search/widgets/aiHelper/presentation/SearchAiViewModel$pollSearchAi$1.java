package ru.ozon.app.android.search.widgets.aiHelper.presentation;

import Ae.w0;
import Sc.r;
import Sc.s;
import Wc.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.search.widgets.aiHelper.data.PollSearchAiResponse;
import ru.ozon.app.android.search.widgets.aiHelper.data.ProcessingStatus;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.widgets.aiHelper.presentation.SearchAiViewModel$pollSearchAi$1", f = "SearchAiViewModel.kt", l = {ModuleDescriptor.MODULE_VERSION, 50, 55}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class SearchAiViewModel$pollSearchAi$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ActionV2Request $actionRequest;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SearchAiViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchAiViewModel$pollSearchAi$1(SearchAiViewModel searchAiViewModel, ActionV2Request actionV2Request, d<? super SearchAiViewModel$pollSearchAi$1> dVar) {
        super(2, dVar);
        this.this$0 = searchAiViewModel;
        this.$actionRequest = actionV2Request;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SearchAiViewModel$pollSearchAi$1 searchAiViewModel$pollSearchAi$1 = new SearchAiViewModel$pollSearchAi$1(this.this$0, this.$actionRequest, dVar);
        searchAiViewModel$pollSearchAi$1.L$0 = obj;
        return searchAiViewModel$pollSearchAi$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (r1.emit(r7, r6) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        w0 w0Var;
        w0 w0Var2;
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            SearchAiViewModel searchAiViewModel = this.this$0;
            ActionV2Request actionV2Request = this.$actionRequest;
            r.Companion companion2 = r.INSTANCE;
            actionV2Repository = searchAiViewModel.actionV2Repository;
            this.label = 1;
            obj = actionV2Repository.callActionSuspend(actionV2Request, PollSearchAiResponse.class, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        a11 = (ActionV2Response) obj;
        r.Companion companion3 = r.INSTANCE;
        SearchAiViewModel searchAiViewModel2 = this.this$0;
        if (r.b(a11) == null) {
            w0Var2 = searchAiViewModel2._pollingStatus;
            PollSearchAiResponse pollSearchAiResponse = (PollSearchAiResponse) ((ActionV2Response) a11).getData();
            if (pollSearchAiResponse == null || (r7 = pollSearchAiResponse.getStatus()) == null) {
                ProcessingStatus processingStatus = ProcessingStatus.PROCESSING_STATUS_UNKNOWN;
            }
            this.label = 2;
        } else {
            w0Var = searchAiViewModel2._pollingStatus;
            ProcessingStatus processingStatus2 = ProcessingStatus.PROCESSING_STATUS_UNKNOWN;
            this.label = 3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SearchAiViewModel$pollSearchAi$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
