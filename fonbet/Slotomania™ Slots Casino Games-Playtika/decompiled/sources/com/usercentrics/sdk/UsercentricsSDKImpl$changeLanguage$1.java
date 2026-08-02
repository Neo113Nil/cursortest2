package com.usercentrics.sdk;

import com.usercentrics.sdk.core.settings.SettingsOrchestrator;
import com.usercentrics.sdk.v2.async.dispatcher.DispatcherScope;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: UsercentricsSDKImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lcom/usercentrics/sdk/v2/async/dispatcher/DispatcherScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.UsercentricsSDKImpl$changeLanguage$1", f = "UsercentricsSDKImpl.kt", i = {}, l = {251, 256}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class UsercentricsSDKImpl$changeLanguage$1 extends SuspendLambda implements Function2<DispatcherScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ String $language;
    final /* synthetic */ SettingsOrchestrator $settingsOrchestrator;
    int label;
    final /* synthetic */ UsercentricsSDKImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UsercentricsSDKImpl$changeLanguage$1(SettingsOrchestrator settingsOrchestrator, UsercentricsSDKImpl usercentricsSDKImpl, String str, Continuation<? super UsercentricsSDKImpl$changeLanguage$1> continuation) {
        super(2, continuation);
        this.$settingsOrchestrator = settingsOrchestrator;
        this.this$0 = usercentricsSDKImpl;
        this.$language = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UsercentricsSDKImpl$changeLanguage$1(this.$settingsOrchestrator, this.this$0, this.$language, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(DispatcherScope dispatcherScope, Continuation<? super Result<Unit>> continuation) {
        return ((UsercentricsSDKImpl$changeLanguage$1) create(dispatcherScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(DispatcherScope dispatcherScope, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(dispatcherScope, (Continuation<? super Result<Unit>>) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (r7 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r7 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object mo10591loadSettings0E7RQCE;
        Object m10588finishChangeLanguagegIAlus;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SettingsOrchestrator settingsOrchestrator = this.$settingsOrchestrator;
            str = this.this$0.activeControllerId;
            this.label = 1;
            mo10591loadSettings0E7RQCE = settingsOrchestrator.mo10591loadSettings0E7RQCE(str, this.$language, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                m10588finishChangeLanguagegIAlus = ((Result) obj).getValue();
                return Result.m11179boximpl(m10588finishChangeLanguagegIAlus);
            }
            ResultKt.throwOnFailure(obj);
            mo10591loadSettings0E7RQCE = ((Result) obj).getValue();
        }
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(mo10591loadSettings0E7RQCE);
        if (m11183exceptionOrNullimpl == null) {
            this.label = 2;
            m10588finishChangeLanguagegIAlus = this.this$0.m10588finishChangeLanguagegIAlus(this.$language, this);
        } else {
            throw m11183exceptionOrNullimpl;
        }
    }
}
