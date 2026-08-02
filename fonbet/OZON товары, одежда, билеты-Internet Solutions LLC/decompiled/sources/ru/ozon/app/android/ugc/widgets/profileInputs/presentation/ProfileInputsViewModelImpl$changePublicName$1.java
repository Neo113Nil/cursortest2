package ru.ozon.app.android.ugc.widgets.profileInputs.presentation;

import Ae.x0;
import Sc.r;
import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.ugc.widgets.profileInputs.data.ChangePublicNameResponse;
import ru.ozon.app.android.ugc.widgets.profileInputs.presentation.InputResult;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.profileInputs.presentation.ProfileInputsViewModelImpl$changePublicName$1", f = "ProfileInputsViewModel.kt", l = {104, 87, 90}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ProfileInputsViewModelImpl$changePublicName$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionId;
    final /* synthetic */ Map<String, String> $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ProfileInputsViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileInputsViewModelImpl$changePublicName$1(ProfileInputsViewModelImpl profileInputsViewModelImpl, Map<String, String> map, String str, d<? super ProfileInputsViewModelImpl$changePublicName$1> dVar) {
        super(2, dVar);
        this.this$0 = profileInputsViewModelImpl;
        this.$request = map;
        this.$actionId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ProfileInputsViewModelImpl$changePublicName$1 profileInputsViewModelImpl$changePublicName$1 = new ProfileInputsViewModelImpl$changePublicName$1(this.this$0, this.$request, this.$actionId, dVar);
        profileInputsViewModelImpl$changePublicName$1.L$0 = obj;
        return profileInputsViewModelImpl$changePublicName$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c1, code lost:
    
        if (r13.emit(r3, r12) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        if (r13.emit(r6, r12) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Object obj2;
        InputResult inputResult;
        InputResult notificationError;
        x0 x0Var;
        x0 x0Var2;
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
            ProfileInputsViewModelImpl profileInputsViewModelImpl = this.this$0;
            Map<String, String> map = this.$request;
            String str = this.$actionId;
            r.Companion companion2 = r.INSTANCE;
            actionV2Repository = profileInputsViewModelImpl.actionV2Repository;
            ActionV2Request actionV2Request = new ActionV2Request(map, str, false, 4, null);
            this.label = 1;
            obj = actionV2Repository.callActionSuspend(actionV2Request, ChangePublicNameResponse.class, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                obj2 = this.L$0;
                s.b(obj);
                ProfileInputsViewModelImpl profileInputsViewModelImpl2 = this.this$0;
                if (r.b(obj2) != null) {
                    x0Var2 = profileInputsViewModelImpl2.stateFlow;
                    InputResult.NotificationError notificationError2 = new InputResult.NotificationError(null, 1, null);
                    this.L$0 = obj2;
                    this.label = 3;
                }
                return Unit.f71690a;
            }
            s.b(obj);
        }
        a11 = (ChangePublicNameResponse) ((ActionV2Response) obj).getData();
        r.Companion companion3 = r.INSTANCE;
        obj2 = a11;
        ProfileInputsViewModelImpl profileInputsViewModelImpl3 = this.this$0;
        if (!(obj2 instanceof r.b)) {
            ChangePublicNameResponse changePublicNameResponse = (ChangePublicNameResponse) obj2;
            if (changePublicNameResponse == null) {
                inputResult = new InputResult.NotificationError(null, 1, null);
            } else {
                if (changePublicNameResponse.getErrorInputMessage() != null) {
                    notificationError = new InputResult.InputError(changePublicNameResponse.getErrorInputMessage());
                } else if (changePublicNameResponse.getErrorNotificationBar() != null) {
                    notificationError = new InputResult.NotificationError(changePublicNameResponse.getErrorNotificationBar());
                } else {
                    inputResult = InputResult.ChangeNameSuccess.INSTANCE;
                }
                inputResult = notificationError;
            }
            x0Var = profileInputsViewModelImpl3.stateFlow;
            this.L$0 = obj2;
            this.label = 2;
        }
        ProfileInputsViewModelImpl profileInputsViewModelImpl22 = this.this$0;
        if (r.b(obj2) != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ProfileInputsViewModelImpl$changePublicName$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
