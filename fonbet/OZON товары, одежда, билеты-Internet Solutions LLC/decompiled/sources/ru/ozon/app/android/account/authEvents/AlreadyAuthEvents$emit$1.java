package ru.ozon.app.android.account.authEvents;

import Ae.w0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.auth.flags.LogAlreadyAuthException;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.account.authEvents.AlreadyAuthEvents$emit$1", f = "AlreadyAuthEvents.kt", l = {AppUpdateInfo.Factory.DAYS_BETWEEN_30}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AlreadyAuthEvents$emit$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $deeplink;
    final /* synthetic */ String $redirectDeeplink;
    int label;
    final /* synthetic */ AlreadyAuthEvents this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AlreadyAuthEvents$emit$1(AlreadyAuthEvents alreadyAuthEvents, String str, String str2, d<? super AlreadyAuthEvents$emit$1> dVar) {
        super(2, dVar);
        this.this$0 = alreadyAuthEvents;
        this.$deeplink = str;
        this.$redirectDeeplink = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AlreadyAuthEvents$emit$1(this.this$0, this.$deeplink, this.$redirectDeeplink, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FeatureChecker featureChecker;
        w0 w0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            featureChecker = this.this$0.featureChecker;
            if (featureChecker.isEnabled(LogAlreadyAuthException.INSTANCE)) {
                this.this$0.sendNonFatal(this.$deeplink, this.$redirectDeeplink);
            }
            w0Var = this.this$0._flow;
            Unit unit = Unit.f71690a;
            this.label = 1;
            if (w0Var.emit(unit, this) == aVar) {
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
        return ((AlreadyAuthEvents$emit$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
