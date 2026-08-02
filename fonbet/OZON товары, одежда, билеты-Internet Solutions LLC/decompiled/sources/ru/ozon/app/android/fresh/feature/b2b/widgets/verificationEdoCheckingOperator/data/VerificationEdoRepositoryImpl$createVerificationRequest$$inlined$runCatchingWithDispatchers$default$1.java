package ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.data;

import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.data.api.VerificationEdoApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.data.api.VerificationEdoResponse;
import ru.ozon.app.android.utils.Result;
import xe.M;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Return", "Lxe/M;", "Lru/ozon/app/android/utils/Result;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/utils/Result;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.data.VerificationEdoRepositoryImpl$createVerificationRequest$$inlined$runCatchingWithDispatchers$default$1", f = "VerificationEdoRepositoryImpl.kt", l = {DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class VerificationEdoRepositoryImpl$createVerificationRequest$$inlined$runCatchingWithDispatchers$default$1 extends j implements Function2<M, d<? super Result<VerificationEdoResponse>>, Object> {
    final /* synthetic */ String $actionName$inlined;
    final /* synthetic */ String $position$inlined;
    final /* synthetic */ Object $this_runCatchingWithDispatchers;
    final /* synthetic */ String $type$inlined;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationEdoRepositoryImpl$createVerificationRequest$$inlined$runCatchingWithDispatchers$default$1(Object obj, d dVar, String str, String str2, String str3) {
        super(2, dVar);
        this.$this_runCatchingWithDispatchers = obj;
        this.$actionName$inlined = str;
        this.$position$inlined = str2;
        this.$type$inlined = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new VerificationEdoRepositoryImpl$createVerificationRequest$$inlined$runCatchingWithDispatchers$default$1(this.$this_runCatchingWithDispatchers, dVar, this.$actionName$inlined, this.$position$inlined, this.$type$inlined);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        VerificationEdoApi verificationEdoApi;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                VerificationEdoRepositoryImpl verificationEdoRepositoryImpl = (VerificationEdoRepositoryImpl) this.$this_runCatchingWithDispatchers;
                Tc.d builder = new Tc.d();
                builder.put("position", this.$position$inlined);
                String str = this.$type$inlined;
                if (str != null) {
                    builder.put("type", str);
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                Tc.d u11 = builder.u();
                verificationEdoApi = verificationEdoRepositoryImpl.api;
                String str2 = this.$actionName$inlined;
                this.label = 1;
                obj = verificationEdoApi.createVerificationRequest(str2, u11, this);
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
    public final Object invoke(M m11, d<? super Result<VerificationEdoResponse>> dVar) {
        return ((VerificationEdoRepositoryImpl$createVerificationRequest$$inlined$runCatchingWithDispatchers$default$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
