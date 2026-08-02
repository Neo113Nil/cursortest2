package ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.presentation;

import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionWithErrorResponse;
import ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.data.ToursLoaderApi;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionWithErrorResponse;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionWithErrorResponse;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.presentation.ToursLoaderViewModel$performComposerAction$1$1$1", f = "ToursLoaderViewModel.kt", l = {DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class ToursLoaderViewModel$performComposerAction$1$1$1 extends j implements Function2<M, d<? super TravelCommonActionWithErrorResponse>, Object> {
    final /* synthetic */ AtomAction $atomAction;
    int label;
    final /* synthetic */ ToursLoaderViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursLoaderViewModel$performComposerAction$1$1$1(ToursLoaderViewModel toursLoaderViewModel, AtomAction atomAction, d<? super ToursLoaderViewModel$performComposerAction$1$1$1> dVar) {
        super(2, dVar);
        this.this$0 = toursLoaderViewModel;
        this.$atomAction = atomAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ToursLoaderViewModel$performComposerAction$1$1$1(this.this$0, this.$atomAction, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ToursLoaderApi toursLoaderApi;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        toursLoaderApi = this.this$0.api;
        String actionName = ((AtomAction.ComposerAction) this.$atomAction).getActionName();
        Map<String, String> params = ((AtomAction.ComposerAction) this.$atomAction).getParams();
        if (params == null) {
            params = U.c();
        }
        this.label = 1;
        Object performActionWithError = toursLoaderApi.performActionWithError(actionName, params, this);
        return performActionWithError == aVar ? aVar : performActionWithError;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super TravelCommonActionWithErrorResponse> dVar) {
        return ((ToursLoaderViewModel$performComposerAction$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
