package ai.verisoul.sdk;

import Ph.P;
import ai.verisoul.sdk.logger.Logger;
import com.plaid.internal.EnumC3631g;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ai.verisoul.sdk.SessionManager$generateTokenInternal$2$1", f = "SessionManager.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SessionManager$generateTokenInternal$2$1 extends SuspendLambda implements Function2<P, Continuation<? super String>, Object> {
    final /* synthetic */ VerisoulEnvironment $env;
    final /* synthetic */ boolean $isReinitialization;
    final /* synthetic */ String $projectId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionManager$generateTokenInternal$2$1(String str, VerisoulEnvironment verisoulEnvironment, boolean z10, Continuation<? super SessionManager$generateTokenInternal$2$1> continuation) {
        super(2, continuation);
        this.$projectId = str;
        this.$env = verisoulEnvironment;
        this.$isReinitialization = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SessionManager$generateTokenInternal$2$1(this.$projectId, this.$env, this.$isReinitialization, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super String> continuation) {
        return ((SessionManager$generateTokenInternal$2$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String str;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SessionManager sessionManager = SessionManager.INSTANCE;
                String str3 = this.$projectId;
                VerisoulEnvironment verisoulEnvironment = this.$env;
                boolean z10 = this.$isReinitialization;
                this.label = 1;
                obj = sessionManager.collectData(str3, verisoulEnvironment, z10, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (String) obj;
        } catch (CancellationException e10) {
            Logger logger = Logger.INSTANCE;
            str2 = SessionManager.TAG;
            logger.info(str2, "Token generation cancelled");
            throw e10;
        } catch (Exception e11) {
            Logger logger2 = Logger.INSTANCE;
            str = SessionManager.TAG;
            logger2.error(str, "Token generation failed: " + e11.getMessage());
            throw e11;
        }
    }
}
