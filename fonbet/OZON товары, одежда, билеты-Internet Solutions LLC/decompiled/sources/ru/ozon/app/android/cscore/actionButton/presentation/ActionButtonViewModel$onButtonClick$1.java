package ru.ozon.app.android.cscore.actionButton.presentation;

import Sc.s;
import Wc.a;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.ozon.app.android.cscore.actionButton.presentation.ActionButtonViewModel;
import ru.ozon.app.android.csma.api.ComposerActionApi;
import ru.ozon.app.android.csma.api.models.ComposerActionResponse;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cscore.actionButton.presentation.ActionButtonViewModel$onButtonClick$1", f = "ActionButtonViewModel.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ActionButtonViewModel$onButtonClick$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ Object $params;
    final /* synthetic */ Long $regularId;
    int label;
    final /* synthetic */ ActionButtonViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActionButtonViewModel$onButtonClick$1(ActionButtonViewModel actionButtonViewModel, String str, Long l11, Object obj, d<? super ActionButtonViewModel$onButtonClick$1> dVar) {
        super(2, dVar);
        this.this$0 = actionButtonViewModel;
        this.$actionName = str;
        this.$regularId = l11;
        this.$params = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ActionButtonViewModel$onButtonClick$1(this.this$0, this.$actionName, this.$regularId, this.$params, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        r0 = r5.this$0.getErrorMessage(r0.string());
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SingleLiveEvent singleLiveEvent;
        SingleLiveEvent singleLiveEvent2;
        String string;
        SingleLiveEvent singleLiveEvent3;
        SingleLiveEvent singleLiveEvent4;
        SingleLiveEvent singleLiveEvent5;
        SingleLiveEvent singleLiveEvent6;
        SingleLiveEvent singleLiveEvent7;
        ComposerActionApi composerActionApi;
        SingleLiveEvent singleLiveEvent8;
        SingleLiveEvent singleLiveEvent9;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                singleLiveEvent6 = this.this$0.singleLoading;
                singleLiveEvent6.setValue(Boolean.TRUE);
                singleLiveEvent7 = this.this$0.singleClickableAction;
                singleLiveEvent7.setValue(Boolean.FALSE);
                composerActionApi = this.this$0.composerActionApi;
                String str = this.$actionName;
                Long l11 = this.$regularId;
                Object obj2 = this.$params;
                this.label = 1;
                obj = composerActionApi.callAction(str, l11, obj2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            ComposerActionResponse composerActionResponse = (ComposerActionResponse) obj;
            singleLiveEvent8 = this.this$0.singleAction;
            singleLiveEvent8.postValue(new ActionButtonViewModel.Action.Success(composerActionResponse.getMessage(), composerActionResponse.getDeeplink()));
            singleLiveEvent9 = this.this$0.singleLoading;
            singleLiveEvent9.setValue(Boolean.FALSE);
            singleLiveEvent5 = this.this$0.singleClickableAction;
        } catch (Throwable th2) {
            try {
                if (th2 instanceof HttpException) {
                    Response<?> response = th2.response();
                    if (response == null || (r0 = response.errorBody()) == null || string == null) {
                        string = StringProvider.getString(R$string.error_common_message_service_error);
                    }
                } else {
                    string = StringProvider.getString(R$string.error_common_message_service_error);
                }
                singleLiveEvent3 = this.this$0.singleAction;
                singleLiveEvent3.postValue(new ActionButtonViewModel.Action.Error(string, !(th2 instanceof IOException)));
                singleLiveEvent4 = this.this$0.singleLoading;
                singleLiveEvent4.setValue(Boolean.FALSE);
                singleLiveEvent5 = this.this$0.singleClickableAction;
            } catch (Throwable th3) {
                singleLiveEvent = this.this$0.singleLoading;
                singleLiveEvent.setValue(Boolean.FALSE);
                singleLiveEvent2 = this.this$0.singleClickableAction;
                singleLiveEvent2.setValue(Boolean.TRUE);
                throw th3;
            }
        }
        singleLiveEvent5.setValue(Boolean.TRUE);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ActionButtonViewModel$onButtonClick$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
