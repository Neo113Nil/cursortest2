package ru.ozon.app.android.cscore.buttonv2.viewmodel;

import He.b;
import Sc.r;
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
import ru.ozon.app.android.cscore.buttonv2.viewmodel.ActionButtonViewModel;
import ru.ozon.app.android.csma.api.models.ComposerActionResponse;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cscore.buttonv2.viewmodel.ActionButtonViewModel$onButtonClick$1", f = "ActionButtonViewModel.kt", l = {38}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ActionButtonViewModel$onButtonClick$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ String $params;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActionButtonViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActionButtonViewModel$onButtonClick$1(ActionButtonViewModel actionButtonViewModel, String str, String str2, d<? super ActionButtonViewModel$onButtonClick$1> dVar) {
        super(2, dVar);
        this.this$0 = actionButtonViewModel;
        this.$actionName = str;
        this.$params = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ActionButtonViewModel$onButtonClick$1 actionButtonViewModel$onButtonClick$1 = new ActionButtonViewModel$onButtonClick$1(this.this$0, this.$actionName, this.$params, dVar);
        actionButtonViewModel$onButtonClick$1.L$0 = obj;
        return actionButtonViewModel$onButtonClick$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
    
        r8 = r0.getErrorMessage(r2);
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        String message;
        SingleLiveEvent singleLiveEvent;
        We.M errorBody;
        SingleLiveEvent singleLiveEvent2;
        SingleLiveEvent singleLiveEvent3;
        SingleLiveEvent singleLiveEvent4;
        SingleLiveEvent singleLiveEvent5;
        SingleLiveEvent singleLiveEvent6;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        String str = null;
        try {
            if (i11 == 0) {
                s.b(obj);
                singleLiveEvent5 = this.this$0.singleLoading;
                singleLiveEvent5.setValue(Boolean.TRUE);
                singleLiveEvent6 = this.this$0.singleClickableAction;
                singleLiveEvent6.setValue(Boolean.FALSE);
                ActionButtonViewModel actionButtonViewModel = this.this$0;
                String str2 = this.$actionName;
                String str3 = this.$params;
                r.Companion companion = r.INSTANCE;
                C10720e0 c10720e0 = C10720e0.f105451a;
                b bVar = b.f10879b;
                ActionButtonViewModel$onButtonClick$1$1$1 actionButtonViewModel$onButtonClick$1$1$1 = new ActionButtonViewModel$onButtonClick$1$1$1(actionButtonViewModel, str2, str3, null);
                this.label = 1;
                obj = C10727i.f(bVar, actionButtonViewModel$onButtonClick$1$1$1, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            a11 = (ComposerActionResponse) obj;
            r.Companion companion2 = r.INSTANCE;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        ActionButtonViewModel actionButtonViewModel2 = this.this$0;
        Throwable b11 = r.b(a11);
        if (b11 == null) {
            ComposerActionResponse composerActionResponse = (ComposerActionResponse) a11;
            singleLiveEvent4 = actionButtonViewModel2.singleAction;
            singleLiveEvent4.setValue(new ActionButtonViewModel.Action.Success(composerActionResponse.getMessage(), composerActionResponse.getDeeplink()));
        } else {
            if (b11 instanceof HttpException) {
                Response<?> response = ((HttpException) b11).response();
                if (response != null && (errorBody = response.errorBody()) != null) {
                    str = errorBody.string();
                }
                if (str == null || message == null) {
                    message = StringProvider.getString(R$string.error_common_message_service_error);
                }
            } else if (b11 instanceof IOException) {
                message = StringProvider.getString(R$string.error_common_message_service_error);
            } else {
                message = b11.getMessage();
                if (message == null) {
                    message = StringProvider.getString(R$string.error_common_message_service_error);
                }
            }
            singleLiveEvent = actionButtonViewModel2.singleAction;
            singleLiveEvent.setValue(new ActionButtonViewModel.Action.Error(message, !(b11 instanceof IOException)));
        }
        singleLiveEvent2 = this.this$0.singleLoading;
        singleLiveEvent2.setValue(Boolean.FALSE);
        singleLiveEvent3 = this.this$0.singleClickableAction;
        singleLiveEvent3.setValue(Boolean.TRUE);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ActionButtonViewModel$onButtonClick$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
