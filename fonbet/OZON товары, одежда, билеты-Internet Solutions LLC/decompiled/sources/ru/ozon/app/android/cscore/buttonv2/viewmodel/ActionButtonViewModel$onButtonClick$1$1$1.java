package ru.ozon.app.android.cscore.buttonv2.viewmodel;

import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.csma.api.ComposerActionApi;
import ru.ozon.app.android.csma.api.models.ComposerActionResponse;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/csma/api/models/ComposerActionResponse;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/csma/api/models/ComposerActionResponse;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cscore.buttonv2.viewmodel.ActionButtonViewModel$onButtonClick$1$1$1", f = "ActionButtonViewModel.kt", l = {DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ActionButtonViewModel$onButtonClick$1$1$1 extends j implements Function2<M, d<? super ComposerActionResponse>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ String $params;
    int label;
    final /* synthetic */ ActionButtonViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActionButtonViewModel$onButtonClick$1$1$1(ActionButtonViewModel actionButtonViewModel, String str, String str2, d<? super ActionButtonViewModel$onButtonClick$1$1$1> dVar) {
        super(2, dVar);
        this.this$0 = actionButtonViewModel;
        this.$actionName = str;
        this.$params = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ActionButtonViewModel$onButtonClick$1$1$1(this.this$0, this.$actionName, this.$params, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ComposerActionApi composerActionApi;
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
        composerActionApi = this.this$0.composerActionApi;
        String str = this.$actionName;
        String str2 = this.$params;
        this.label = 1;
        Object callAction = composerActionApi.callAction(str, str2, this);
        return callAction == aVar ? aVar : callAction;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super ComposerActionResponse> dVar) {
        return ((ActionButtonViewModel$onButtonClick$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
