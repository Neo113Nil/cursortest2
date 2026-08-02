package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation;

import Sc.r;
import Sc.s;
import Wc.a;
import androidx.lifecycle.V;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResponse;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.data.AdditionalLuggageV2Api;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2ViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2ViewModel$onSaveButtonClicked$1", f = "AdditionalLuggageV2ViewModel.kt", l = {115}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class AdditionalLuggageV2ViewModel$onSaveButtonClicked$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AdditionalLuggageV2ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalLuggageV2ViewModel$onSaveButtonClicked$1(AdditionalLuggageV2ViewModel additionalLuggageV2ViewModel, AtomAction atomAction, d<? super AdditionalLuggageV2ViewModel$onSaveButtonClicked$1> dVar) {
        super(2, dVar);
        this.this$0 = additionalLuggageV2ViewModel;
        this.$action = atomAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AdditionalLuggageV2ViewModel$onSaveButtonClicked$1 additionalLuggageV2ViewModel$onSaveButtonClicked$1 = new AdditionalLuggageV2ViewModel$onSaveButtonClicked$1(this.this$0, this.$action, dVar);
        additionalLuggageV2ViewModel$onSaveButtonClicked$1.L$0 = obj;
        return additionalLuggageV2ViewModel$onSaveButtonClicked$1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [xe.M] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        M m11;
        V v11;
        SingleLiveEvent singleLiveEvent;
        V v12;
        AdditionalLuggageV2Api additionalLuggageV2Api;
        Map<String, Object> prepareRequestBody;
        AdditionalLuggageV2ViewModel additionalLuggageV2ViewModel;
        SingleLiveEvent singleLiveEvent2;
        V v13;
        AtomActionDTO action;
        a aVar = a.COROUTINE_SUSPENDED;
        ?? r12 = this.label;
        try {
            if (r12 == 0) {
                s.b(obj);
                M m12 = (M) this.L$0;
                AdditionalLuggageV2ViewModel additionalLuggageV2ViewModel2 = this.this$0;
                AtomAction atomAction = this.$action;
                r.Companion companion = r.INSTANCE;
                v12 = additionalLuggageV2ViewModel2.progressLiveData;
                v12.setValue(Boolean.TRUE);
                additionalLuggageV2Api = additionalLuggageV2ViewModel2.api;
                String actionName = ((AtomAction.ComposerAction) atomAction).getActionName();
                prepareRequestBody = additionalLuggageV2ViewModel2.prepareRequestBody(((AtomAction.ComposerAction) atomAction).getParams());
                this.L$0 = m12;
                this.L$1 = additionalLuggageV2ViewModel2;
                this.label = 1;
                Object saveLuggage = additionalLuggageV2Api.saveLuggage(actionName, prepareRequestBody, this);
                if (saveLuggage == aVar) {
                    return aVar;
                }
                additionalLuggageV2ViewModel = additionalLuggageV2ViewModel2;
                obj = saveLuggage;
                r12 = m12;
            } else {
                if (r12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                additionalLuggageV2ViewModel = (AdditionalLuggageV2ViewModel) this.L$1;
                M m13 = (M) this.L$0;
                s.b(obj);
                r12 = m13;
            }
            ActionV2Response actionV2Response = (ActionV2Response) obj;
            TravelCommonActionResponse travelCommonActionResponse = (TravelCommonActionResponse) actionV2Response.getData();
            AtomAction atomAction2 = null;
            if (travelCommonActionResponse != null && (action = travelCommonActionResponse.getAction()) != null) {
                atomAction2 = AtomActionMapperKt.toAtomAction(action, null);
            }
            if (N.f(r12)) {
                singleLiveEvent2 = additionalLuggageV2ViewModel.saveLuggageResultLiveData;
                singleLiveEvent2.setValue(atomAction2 != null ? new AdditionalLuggageV2ViewModel.SaveLuggageResult.Success(atomAction2, actionV2Response.getTrackingInfo(), actionV2Response.getTrackingPayloads()) : AdditionalLuggageV2ViewModel.SaveLuggageResult.Error.INSTANCE);
                v13 = additionalLuggageV2ViewModel.progressLiveData;
                v13.setValue(Boolean.FALSE);
            }
            a11 = Unit.f71690a;
            r.Companion companion2 = r.INSTANCE;
            m11 = r12;
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
            m11 = r12;
        }
        AdditionalLuggageV2ViewModel additionalLuggageV2ViewModel3 = this.this$0;
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            Lm0.a.f17149a.e(b11);
            if (N.f(m11)) {
                v11 = additionalLuggageV2ViewModel3.progressLiveData;
                v11.setValue(Boolean.FALSE);
                singleLiveEvent = additionalLuggageV2ViewModel3.saveLuggageResultLiveData;
                singleLiveEvent.setValue(AdditionalLuggageV2ViewModel.SaveLuggageResult.Error.INSTANCE);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AdditionalLuggageV2ViewModel$onSaveButtonClicked$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
