package com.margelo.nitro.playagerangedeclaration;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.agesignals.AgeSignalsManager;
import com.google.android.play.agesignals.AgeSignalsRequest;
import com.google.android.play.agesignals.AgeSignalsResult;
import com.margelo.nitro.playagerangedeclaration.PlayAgeRangeDeclaration;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.objectweb.asm.Opcodes;

/* compiled from: PlayAgeRangeDeclaration.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclarationResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.margelo.nitro.playagerangedeclaration.PlayAgeRangeDeclaration$getPlayAgeRangeDeclaration$1", f = "PlayAgeRangeDeclaration.kt", i = {0, 0}, l = {Opcodes.DRETURN}, m = "invokeSuspend", n = {"manager", "request"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class PlayAgeRangeDeclaration$getPlayAgeRangeDeclaration$1 extends SuspendLambda implements Function1<Continuation<? super PlayAgeRangeDeclarationResult>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PlayAgeRangeDeclaration this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayAgeRangeDeclaration$getPlayAgeRangeDeclaration$1(PlayAgeRangeDeclaration playAgeRangeDeclaration, Continuation<? super PlayAgeRangeDeclaration$getPlayAgeRangeDeclaration$1> continuation) {
        super(1, continuation);
        this.this$0 = playAgeRangeDeclaration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new PlayAgeRangeDeclaration$getPlayAgeRangeDeclaration$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super PlayAgeRangeDeclarationResult> continuation) {
        return ((PlayAgeRangeDeclaration$getPlayAgeRangeDeclaration$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context appContext;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PlayAgeRangeDeclaration.Companion companion = PlayAgeRangeDeclaration.INSTANCE;
                appContext = this.this$0.getAppContext();
                AgeSignalsManager manager = companion.getManager(appContext);
                AgeSignalsRequest build = AgeSignalsRequest.builder().build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                this.L$0 = manager;
                this.L$1 = build;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                Task<AgeSignalsResult> checkAgeSignals = manager.checkAgeSignals(build);
                final Function1<AgeSignalsResult, Unit> function1 = new Function1<AgeSignalsResult, Unit>() { // from class: com.margelo.nitro.playagerangedeclaration.PlayAgeRangeDeclaration$getPlayAgeRangeDeclaration$1$result$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AgeSignalsResult ageSignalsResult) {
                        invoke2(ageSignalsResult);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void invoke2(AgeSignalsResult ageSignalsResult) {
                        PlayAgeRangeDeclarationUserStatus playAgeRangeDeclarationUserStatus;
                        PlayAgeRangeDeclarationUserStatus playAgeRangeDeclarationUserStatus2;
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ConstantsKt.READABLE_DATE_FORMAT, Locale.US);
                        Date mostRecentApprovalDate = ageSignalsResult.mostRecentApprovalDate();
                        String format = mostRecentApprovalDate != null ? simpleDateFormat.format(mostRecentApprovalDate) : null;
                        Integer userStatus = ageSignalsResult.userStatus();
                        if (userStatus != null && userStatus.intValue() == 0) {
                            playAgeRangeDeclarationUserStatus2 = PlayAgeRangeDeclarationUserStatus.VERIFIED;
                        } else if (userStatus != null && userStatus.intValue() == 1) {
                            playAgeRangeDeclarationUserStatus2 = PlayAgeRangeDeclarationUserStatus.SUPERVISED;
                        } else if (userStatus != null && userStatus.intValue() == 2) {
                            playAgeRangeDeclarationUserStatus2 = PlayAgeRangeDeclarationUserStatus.SUPERVISED_APPROVAL_PENDING;
                        } else if (userStatus != null && userStatus.intValue() == 3) {
                            playAgeRangeDeclarationUserStatus2 = PlayAgeRangeDeclarationUserStatus.SUPERVISED_APPROVAL_DENIED;
                        } else {
                            if (userStatus == null || userStatus.intValue() != 4) {
                                playAgeRangeDeclarationUserStatus = null;
                                boolean z = playAgeRangeDeclarationUserStatus != null;
                                CancellableContinuation<PlayAgeRangeDeclarationResult> cancellableContinuation = cancellableContinuationImpl2;
                                PlayAgeRangeDeclarationResult playAgeRangeDeclarationResult = new PlayAgeRangeDeclarationResult(z, ageSignalsResult.installId(), playAgeRangeDeclarationUserStatus, null, ageSignalsResult.ageLower() == null ? Double.valueOf(r1.intValue()) : null, ageSignalsResult.ageUpper() != null ? Double.valueOf(r12.intValue()) : null, format);
                                Result.Companion companion2 = Result.INSTANCE;
                                cancellableContinuation.resumeWith(Result.m13470constructorimpl(playAgeRangeDeclarationResult));
                            }
                            playAgeRangeDeclarationUserStatus2 = PlayAgeRangeDeclarationUserStatus.UNKNOWN;
                        }
                        playAgeRangeDeclarationUserStatus = playAgeRangeDeclarationUserStatus2;
                        boolean z2 = playAgeRangeDeclarationUserStatus != null;
                        CancellableContinuation<PlayAgeRangeDeclarationResult> cancellableContinuation2 = cancellableContinuationImpl2;
                        if (ageSignalsResult.ageLower() == null) {
                        }
                        PlayAgeRangeDeclarationResult playAgeRangeDeclarationResult2 = new PlayAgeRangeDeclarationResult(z2, ageSignalsResult.installId(), playAgeRangeDeclarationUserStatus, null, ageSignalsResult.ageLower() == null ? Double.valueOf(r1.intValue()) : null, ageSignalsResult.ageUpper() != null ? Double.valueOf(r12.intValue()) : null, format);
                        Result.Companion companion22 = Result.INSTANCE;
                        cancellableContinuation2.resumeWith(Result.m13470constructorimpl(playAgeRangeDeclarationResult2));
                    }
                };
                checkAgeSignals.addOnSuccessListener(new OnSuccessListener(function1) { // from class: com.margelo.nitro.playagerangedeclaration.PlayAgeRangeDeclaration$sam$com_google_android_gms_tasks_OnSuccessListener$0
                    private final /* synthetic */ Function1 function;

                    {
                        Intrinsics.checkNotNullParameter(function1, "function");
                        this.function = function1;
                    }

                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final /* synthetic */ void onSuccess(Object obj2) {
                        this.function.invoke(obj2);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: com.margelo.nitro.playagerangedeclaration.PlayAgeRangeDeclaration$getPlayAgeRangeDeclaration$1$result$1$2
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception e) {
                        Intrinsics.checkNotNullParameter(e, "e");
                        String message = e.getMessage();
                        if (message == null) {
                            message = "Unknown error";
                        }
                        CancellableContinuation<PlayAgeRangeDeclarationResult> cancellableContinuation = cancellableContinuationImpl2;
                        Result.Companion companion2 = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m13470constructorimpl(new PlayAgeRangeDeclarationResult(false, null, null, String.valueOf(message), null, null, null)));
                    }
                });
                obj = cancellableContinuationImpl.getResult();
                if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (PlayAgeRangeDeclarationResult) obj;
        } catch (Exception e) {
            Log.e("PlayAgeRangeDeclaration", "Initialization error", e);
            return new PlayAgeRangeDeclarationResult(false, null, null, "AGE_SIGNALS_INIT_ERROR: " + e.getMessage(), null, null, null);
        }
    }
}
