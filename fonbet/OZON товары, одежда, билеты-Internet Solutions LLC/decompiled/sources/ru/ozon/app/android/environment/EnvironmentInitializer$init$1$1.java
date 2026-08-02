package ru.ozon.app.android.environment;

import Ob0.a;
import Pb0.b;
import Sc.s;
import android.app.Application;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.network.auth.AuthNetworkService;
import ru.ozon.app.android.utils.ApplicationUtilsKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.environment.EnvironmentInitializer$init$1$1", f = "EnvironmentInitializer.kt", l = {TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class EnvironmentInitializer$init$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ EnvironmentInitializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnvironmentInitializer$init$1$1(EnvironmentInitializer environmentInitializer, d<? super EnvironmentInitializer$init$1$1> dVar) {
        super(2, dVar);
        this.this$0 = environmentInitializer;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new EnvironmentInitializer$init$1$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AuthNetworkService authNetworkService;
        a aVar;
        Application application;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            authNetworkService = this.this$0.authNetworkService;
            authNetworkService.clearUserDataOnLogout(false);
            aVar = this.this$0.ozonIdAppApi;
            b bVar = new b() { // from class: ru.ozon.app.android.environment.EnvironmentInitializer$init$1$1.1
                private final boolean restoreRequiredCookie = true;
                private final boolean clearAccountManager = true;

                @Override // Pb0.b
                public boolean getClearAccountManager() {
                    return this.clearAccountManager;
                }

                @Override // Pb0.b
                public boolean getRestoreRequiredCookie() {
                    return this.restoreRequiredCookie;
                }
            };
            this.label = 1;
            if (aVar.K(bVar, this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        application = this.this$0.application;
        ApplicationUtilsKt.restartApp(application);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((EnvironmentInitializer$init$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
