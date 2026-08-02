package ai.verisoul.sdk.helpers.integrity;

import Ph.P;
import ai.verisoul.sdk.helpers.integrity.AppIntegrityResult;
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
@DebugMetadata(c = "ai.verisoul.sdk.helpers.integrity.AppIntegrityHelperImp$syncAppIntegrityData$2", f = "AppIntegrityHelper.kt", i = {}, l = {44, 46}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AppIntegrityHelperImp$syncAppIntegrityData$2 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $expectedSessionId;
    final /* synthetic */ long $integrityCheckStartTimestamp;
    int label;
    final /* synthetic */ AppIntegrityHelperImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppIntegrityHelperImp$syncAppIntegrityData$2(AppIntegrityHelperImp appIntegrityHelperImp, String str, long j10, Continuation<? super AppIntegrityHelperImp$syncAppIntegrityData$2> continuation) {
        super(2, continuation);
        this.this$0 = appIntegrityHelperImp;
        this.$expectedSessionId = str;
        this.$integrityCheckStartTimestamp = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AppIntegrityHelperImp$syncAppIntegrityData$2(this.this$0, this.$expectedSessionId, this.$integrityCheckStartTimestamp, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((AppIntegrityHelperImp$syncAppIntegrityData$2) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:36|(1:(4:39|40|18|19)(2:41|42))(1:43))(4:3|4|5|(2:7|8))|10|11|(3:13|14|15)(2:22|(1:24))|17|18|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r10 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        r0 = e;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        Exception exc;
        AppIntegrityHelperImp$syncAppIntegrityData$2 appIntegrityHelperImp$syncAppIntegrityData$2;
        CancellationException cancellationException;
        String str;
        String str2;
        String str3;
        String str4;
        Object postIntegrityToken;
        AppIntegrityService appIntegrityService;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 != 0) {
            try {
            } catch (CancellationException e10) {
                cancellationException = e10;
                appIntegrityHelperImp$syncAppIntegrityData$2 = this;
                Logger logger = Logger.INSTANCE;
                str2 = appIntegrityHelperImp$syncAppIntegrityData$2.this$0.logTag;
                logger.info(str2, "Integrity check cancelled");
                throw cancellationException;
            } catch (Exception e11) {
                exc = e11;
                appIntegrityHelperImp$syncAppIntegrityData$2 = this;
                Logger logger2 = Logger.INSTANCE;
                str = appIntegrityHelperImp$syncAppIntegrityData$2.this$0.logTag;
                logger2.error(str, "Integrity check error: " + exc.getMessage());
                return Unit.INSTANCE;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            try {
                appIntegrityService = this.this$0.integrityService;
                this.label = 1;
                obj = appIntegrityService.checkAppIntegrity(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (CancellationException e12) {
                e = e12;
                appIntegrityHelperImp$syncAppIntegrityData$2 = this;
                cancellationException = e;
                Logger logger3 = Logger.INSTANCE;
                str2 = appIntegrityHelperImp$syncAppIntegrityData$2.this$0.logTag;
                logger3.info(str2, "Integrity check cancelled");
                throw cancellationException;
            } catch (Exception e13) {
                e = e13;
                appIntegrityHelperImp$syncAppIntegrityData$2 = this;
                exc = e;
                Logger logger22 = Logger.INSTANCE;
                str = appIntegrityHelperImp$syncAppIntegrityData$2.this$0.logTag;
                logger22.error(str, "Integrity check error: " + exc.getMessage());
                return Unit.INSTANCE;
            }
        }
        AppIntegrityResult appIntegrityResult = (AppIntegrityResult) obj;
        if (appIntegrityResult instanceof AppIntegrityResult.Success) {
            AppIntegrityHelperImp appIntegrityHelperImp = this.this$0;
            String str5 = (String) ((AppIntegrityResult.Success) appIntegrityResult).getValue();
            String str6 = this.$expectedSessionId;
            long j10 = this.$integrityCheckStartTimestamp;
            this.label = 2;
            appIntegrityHelperImp$syncAppIntegrityData$2 = this;
            postIntegrityToken = appIntegrityHelperImp.postIntegrityToken(str5, str6, j10, appIntegrityHelperImp$syncAppIntegrityData$2);
        } else {
            appIntegrityHelperImp$syncAppIntegrityData$2 = this;
            if (appIntegrityResult instanceof AppIntegrityResult.Failure) {
                Logger logger4 = Logger.INSTANCE;
                str3 = appIntegrityHelperImp$syncAppIntegrityData$2.this$0.logTag;
                logger4.error(str3, "Failed to get integrity token: " + ((AppIntegrityError) ((AppIntegrityResult.Failure) appIntegrityResult).getError()).getMessage());
                long currentTimeMillis = System.currentTimeMillis();
                str4 = appIntegrityHelperImp$syncAppIntegrityData$2.this$0.logTag;
                logger4.metricLog(str4, "integrity_overall_duration", currentTimeMillis - appIntegrityHelperImp$syncAppIntegrityData$2.$integrityCheckStartTimestamp);
            }
        }
        return Unit.INSTANCE;
    }
}
