package ai.verisoul.sdk;

import Ph.P;
import ai.verisoul.sdk.helpers.session.SessionHelper;
import ai.verisoul.sdk.logger.Logger;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ai.verisoul.sdk.Core$init$1", f = "Core.kt", i = {}, l = {98, 101}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class Core$init$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ VerisoulEnvironment $deploymentEnvironment;
    final /* synthetic */ String $projectIdentifier;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Core$init$1(String str, VerisoulEnvironment verisoulEnvironment, Continuation<? super Core$init$1> continuation) {
        super(2, continuation);
        this.$projectIdentifier = str;
        this.$deploymentEnvironment = verisoulEnvironment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new Core$init$1(this.$projectIdentifier, this.$deploymentEnvironment, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((Core$init$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r6.init(r1, r4, r5) == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        SessionHelper sessionHelper;
        boolean acquireDebounce;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        try {
        } catch (CancellationException e10) {
            Logger.INSTANCE.info("Verisoul-[Core]", "Init cancelled: " + e10.getMessage());
            throw e10;
        } catch (Exception e11) {
            Logger.INSTANCE.error("Verisoul-[Core]", "Failed to init: " + e11.getMessage());
        }
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            sessionHelper = Core.INSTANCE.getSessionHelper();
            this.label = 1;
            obj = sessionHelper.isNeedToGenerateAnewToken(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            acquireDebounce = Core.INSTANCE.acquireDebounce();
            if (!acquireDebounce) {
                return Unit.INSTANCE;
            }
        }
        SessionManager sessionManager = SessionManager.INSTANCE;
        String str = this.$projectIdentifier;
        VerisoulEnvironment verisoulEnvironment = this.$deploymentEnvironment;
        this.label = 2;
    }
}
