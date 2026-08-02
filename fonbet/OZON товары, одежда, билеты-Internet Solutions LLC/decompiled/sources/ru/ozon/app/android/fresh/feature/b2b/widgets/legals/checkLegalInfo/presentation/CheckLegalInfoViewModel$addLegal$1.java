package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.presentation;

import Sc.o;
import Sc.s;
import Wc.a;
import androidx.lifecycle.V;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder.LegalsResultStateHolder;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data.AddLegalRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data.AddLegalResponse;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.presentation.CheckLegalInfoViewModel;
import ru.ozon.app.android.utils.Result;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.presentation.CheckLegalInfoViewModel$addLegal$1", f = "CheckLegalInfoViewModel.kt", l = {AppUpdateInfo.Factory.DAYS_BETWEEN_30}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CheckLegalInfoViewModel$addLegal$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $action;
    final /* synthetic */ String $postData;
    int label;
    final /* synthetic */ CheckLegalInfoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckLegalInfoViewModel$addLegal$1(CheckLegalInfoViewModel checkLegalInfoViewModel, String str, String str2, d<? super CheckLegalInfoViewModel$addLegal$1> dVar) {
        super(2, dVar);
        this.this$0 = checkLegalInfoViewModel;
        this.$action = str;
        this.$postData = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CheckLegalInfoViewModel$addLegal$1(this.this$0, this.$action, this.$postData, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AddLegalRepository addLegalRepository;
        V v11;
        V v12;
        V v13;
        LegalsResultStateHolder legalsResultStateHolder;
        V v14;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            addLegalRepository = this.this$0.repository;
            String str = this.$action;
            String str2 = this.$postData;
            this.label = 1;
            obj = addLegalRepository.addLegalMobile(str, str2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        Result result = (Result) obj;
        if (result instanceof Result.Success) {
            AddLegalResponse addLegalResponse = (AddLegalResponse) ((Result.Success) result).getValue();
            CheckLegalInfoViewModel.LoginResult result2 = addLegalResponse != null ? this.this$0.toResult(addLegalResponse) : null;
            if (Intrinsics.d(result2, CheckLegalInfoViewModel.LoginResult.Success.INSTANCE)) {
                legalsResultStateHolder = this.this$0.legalsResultStateHolder;
                legalsResultStateHolder.notifyChangeLegalState();
                v14 = this.this$0._state;
                v14.setValue(CheckLegalInfoViewModel.State.Success.INSTANCE);
            } else if (result2 instanceof CheckLegalInfoViewModel.LoginResult.ErrorWithMessage) {
                v13 = this.this$0._state;
                v13.setValue(new CheckLegalInfoViewModel.State.KppErrorWithMessage(((CheckLegalInfoViewModel.LoginResult.ErrorWithMessage) result2).getMsg()));
            } else {
                v12 = this.this$0._state;
                v12.setValue(CheckLegalInfoViewModel.State.KppError.INSTANCE);
            }
        } else {
            if (!(result instanceof Result.Failure)) {
                throw new o();
            }
            v11 = this.this$0._state;
            v11.setValue(CheckLegalInfoViewModel.State.KppError.INSTANCE);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CheckLegalInfoViewModel$addLegal$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
