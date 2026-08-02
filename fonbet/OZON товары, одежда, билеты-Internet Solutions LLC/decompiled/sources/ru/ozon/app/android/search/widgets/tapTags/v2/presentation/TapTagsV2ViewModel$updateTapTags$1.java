package ru.ozon.app.android.search.widgets.tapTags.v2.presentation;

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
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.search.widgets.commonTapTags.TapTagsRequestDTO;
import ru.ozon.app.android.search.widgets.tapTags.v2.core.TapTagsV2DTO;
import ru.ozon.app.android.search.widgets.tapTags.v2.core.TapTagsV2MapperKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.widgets.tapTags.v2.presentation.TapTagsV2ViewModel$updateTapTags$1", f = "TapTagsV2ViewModel.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class TapTagsV2ViewModel$updateTapTags$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ TapTagsRequestDTO $request;
    int label;
    final /* synthetic */ TapTagsV2ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapTagsV2ViewModel$updateTapTags$1(TapTagsV2ViewModel tapTagsV2ViewModel, TapTagsRequestDTO tapTagsRequestDTO, d<? super TapTagsV2ViewModel$updateTapTags$1> dVar) {
        super(2, dVar);
        this.this$0 = tapTagsV2ViewModel;
        this.$request = tapTagsRequestDTO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActionV2Response invokeSuspend$lambda$0(Throwable th2) {
        Lm0.a.f17149a.e(th2);
        return ActionV2Response.INSTANCE.empty();
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TapTagsV2ViewModel$updateTapTags$1(this.this$0, this.$request, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            actionV2Repository = this.this$0.actionV2Repository;
            y callAction = actionV2Repository.callAction(new ActionV2Request(TapTagsRequestDTO.copy$default(this.$request, null, null, new Integer(2), false, null, 27, null), "getSearchTapTags", false, 4, null), TapTagsV2DTO.class);
            a aVar2 = new a();
            callAction.getClass();
            u k11 = new Bc.u(callAction, aVar2).k();
            Intrinsics.checkNotNullExpressionValue(k11, "toObservable(...)");
            InterfaceC2395h a11 = n.a(k11);
            final TapTagsV2ViewModel tapTagsV2ViewModel = this.this$0;
            InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.search.widgets.tapTags.v2.presentation.TapTagsV2ViewModel$updateTapTags$1.2
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((ActionV2Response<TapTagsV2DTO>) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(ActionV2Response<TapTagsV2DTO> actionV2Response, d<? super Unit> dVar) {
                    V v11;
                    TapTagsV2DTO data = actionV2Response.getData();
                    if (data == null) {
                        data = TapTagsV2DTO.INSTANCE.createEmptyDTO();
                    }
                    v11 = TapTagsV2ViewModel.this._tapTags;
                    v11.setValue(TapTagsV2MapperKt.toVO(data));
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
        return ((TapTagsV2ViewModel$updateTapTags$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
