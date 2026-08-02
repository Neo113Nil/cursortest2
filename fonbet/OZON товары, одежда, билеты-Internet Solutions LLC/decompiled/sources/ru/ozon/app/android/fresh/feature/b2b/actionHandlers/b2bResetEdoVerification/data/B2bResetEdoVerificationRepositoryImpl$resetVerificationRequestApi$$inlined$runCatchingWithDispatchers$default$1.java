package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bResetEdoVerification.data;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bResetEdoVerification.api.B2bResetEdoVerificationApi;
import ru.ozon.app.android.utils.Result;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import xe.M;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Return", "Lxe/M;", "Lru/ozon/app/android/utils/Result;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/utils/Result;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bResetEdoVerification.data.B2bResetEdoVerificationRepositoryImpl$resetVerificationRequestApi$$inlined$runCatchingWithDispatchers$default$1", f = "B2bResetEdoVerificationRepository.kt", l = {AppUpdateInfo.Factory.DAYS_BETWEEN_30}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class B2bResetEdoVerificationRepositoryImpl$resetVerificationRequestApi$$inlined$runCatchingWithDispatchers$default$1 extends j implements Function2<M, d<? super Result<B2bResetVerificationResponse>>, Object> {
    final /* synthetic */ String $actionName$inlined;
    final /* synthetic */ String $id$inlined;
    final /* synthetic */ Object $this_runCatchingWithDispatchers;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B2bResetEdoVerificationRepositoryImpl$resetVerificationRequestApi$$inlined$runCatchingWithDispatchers$default$1(Object obj, d dVar, String str, String str2) {
        super(2, dVar);
        this.$this_runCatchingWithDispatchers = obj;
        this.$actionName$inlined = str;
        this.$id$inlined = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new B2bResetEdoVerificationRepositoryImpl$resetVerificationRequestApi$$inlined$runCatchingWithDispatchers$default$1(this.$this_runCatchingWithDispatchers, dVar, this.$actionName$inlined, this.$id$inlined);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        B2bResetEdoVerificationApi b2bResetEdoVerificationApi;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                b2bResetEdoVerificationApi = ((B2bResetEdoVerificationRepositoryImpl) this.$this_runCatchingWithDispatchers).resetVerificationRequestApi;
                String str = this.$actionName$inlined;
                Map<String, String> i12 = U.i(new Pair("legalEntityId", this.$id$inlined));
                this.label = 1;
                obj = b2bResetEdoVerificationApi.resetVerificationRequest(str, i12, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return new Result.Success(obj);
        } catch (Throwable th2) {
            return new Result.Failure(th2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Result<B2bResetVerificationResponse>> dVar) {
        return ((B2bResetEdoVerificationRepositoryImpl$resetVerificationRequestApi$$inlined$runCatchingWithDispatchers$default$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
