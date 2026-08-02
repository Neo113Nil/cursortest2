package ru.ozon.app.android.search.widgets.tapTags.v3.presentation;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Be.AbstractC2635g;
import Ge.n;
import Sc.s;
import androidx.lifecycle.V;
import io.reactivex.u;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qc.o;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.search.widgets.commonTapTags.TapTagsRequestDTO;
import ru.ozon.app.android.search.widgets.tapTags.v3.core.TapTagsV3DTO;
import ru.ozon.app.android.search.widgets.tapTags.v3.core.TapTagsV3MapperKt;
import ru.ozon.app.android.search.widgets.tapTags.v3.presentation.TapTagsV3ViewModel;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.widgets.tapTags.v3.presentation.TapTagsV3ViewModel$updateTapTags$2", f = "TapTagsV3ViewModel.kt", l = {133}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class TapTagsV3ViewModel$updateTapTags$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ boolean $isFreshPage;
    final /* synthetic */ TapTagsRequestDTO $request;
    int label;
    final /* synthetic */ TapTagsV3ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapTagsV3ViewModel$updateTapTags$2(TapTagsV3ViewModel tapTagsV3ViewModel, TapTagsRequestDTO tapTagsRequestDTO, boolean z11, d<? super TapTagsV3ViewModel$updateTapTags$2> dVar) {
        super(2, dVar);
        this.this$0 = tapTagsV3ViewModel;
        this.$request = tapTagsRequestDTO;
        this.$isFreshPage = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActionV2Response invokeSuspend$lambda$0(TapTagsV3ViewModel tapTagsV3ViewModel, Throwable th2) {
        tapTagsV3ViewModel.getActionLiveData().postValue(TapTagsV3ViewModel.Action.Error.INSTANCE);
        Lm0.a.f17149a.e(th2);
        return ActionV2Response.INSTANCE.empty();
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TapTagsV3ViewModel$updateTapTags$2(this.this$0, this.$request, this.$isFreshPage, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            actionV2Repository = this.this$0.actionV2Repository;
            y callAction = actionV2Repository.callAction(new ActionV2Request(TapTagsRequestDTO.copy$default(this.$request, null, null, new Integer(3), false, null, 27, null), "getSearchTapTags", false, 4, null), TapTagsV3DTO.class);
            final TapTagsV3ViewModel tapTagsV3ViewModel = this.this$0;
            o oVar = new o() { // from class: ru.ozon.app.android.search.widgets.tapTags.v3.presentation.a
                @Override // qc.o
                public final Object apply(Object obj2) {
                    ActionV2Response invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = TapTagsV3ViewModel$updateTapTags$2.invokeSuspend$lambda$0(TapTagsV3ViewModel.this, (Throwable) obj2);
                    return invokeSuspend$lambda$0;
                }
            };
            callAction.getClass();
            u k11 = new Bc.u(callAction, oVar).k();
            Intrinsics.checkNotNullExpressionValue(k11, "toObservable(...)");
            InterfaceC2395h a11 = n.a(k11);
            final TapTagsV3ViewModel tapTagsV3ViewModel2 = this.this$0;
            final TapTagsRequestDTO tapTagsRequestDTO = this.$request;
            final boolean z11 = this.$isFreshPage;
            InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.search.widgets.tapTags.v3.presentation.TapTagsV3ViewModel$updateTapTags$2.2
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((ActionV2Response<TapTagsV3DTO>) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(ActionV2Response<TapTagsV3DTO> actionV2Response, d<? super Unit> dVar) {
                    l20.d dVar2;
                    TapTagsRequestDTO tapTagsRequestDTO2;
                    TapTagsV3VO tapTagsV3VO;
                    V v11;
                    TapTagsV3VO tapTagsV3VO2;
                    TapTagsV3DTO data = actionV2Response.getData();
                    if (data != null) {
                        TapTagsV3ViewModel tapTagsV3ViewModel3 = TapTagsV3ViewModel.this;
                        boolean z12 = z11;
                        TapTagsRequestDTO tapTagsRequestDTO3 = tapTagsRequestDTO;
                        dVar2 = tapTagsV3ViewModel3.widgetInfo;
                        tapTagsV3ViewModel3.cachedVo = TapTagsV3VO.copy$default(TapTagsV3MapperKt.toVO(data, new Long((dVar2 != null ? dVar2.d() : null) != null ? r0.hashCode() : 0)), 0L, null, 0, null, null, z12, 31, null);
                        tapTagsRequestDTO2 = tapTagsV3ViewModel3.lastRequest;
                        String query = tapTagsRequestDTO2 != null ? tapTagsRequestDTO2.getQuery() : null;
                        if ((query == null || query.length() == 0) && tapTagsRequestDTO3.getQuery().length() > 0) {
                            tapTagsV3ViewModel3.mustUseCached = true;
                        } else {
                            tapTagsV3ViewModel3.mustUseCached = false;
                            v11 = tapTagsV3ViewModel3._tapTags;
                            tapTagsV3VO2 = tapTagsV3ViewModel3.cachedVo;
                            v11.setValue(tapTagsV3VO2);
                        }
                        tapTagsV3VO = tapTagsV3ViewModel3.cachedVo;
                        tapTagsV3ViewModel3.handleSuggestedPage(tapTagsRequestDTO3, tapTagsV3VO.getSuggestedPage());
                    }
                    TapTagsV3ViewModel.this.lastRequest = tapTagsRequestDTO;
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (((AbstractC2635g) a11).collect(interfaceC2397i, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TapTagsV3ViewModel$updateTapTags$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
