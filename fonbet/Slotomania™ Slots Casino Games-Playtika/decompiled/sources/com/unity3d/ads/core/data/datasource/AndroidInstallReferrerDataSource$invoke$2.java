package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.InstallReferrerKt;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidInstallReferrerDataSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2", f = "AndroidInstallReferrerDataSource.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class AndroidInstallReferrerDataSource$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InitializationRequestOuterClass.InstallReferrer>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ AndroidInstallReferrerDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidInstallReferrerDataSource$invoke$2(AndroidInstallReferrerDataSource androidInstallReferrerDataSource, Continuation<? super AndroidInstallReferrerDataSource$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = androidInstallReferrerDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AndroidInstallReferrerDataSource$invoke$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InitializationRequestOuterClass.InstallReferrer> continuation) {
        return ((AndroidInstallReferrerDataSource$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SendDiagnosticEvent sendDiagnosticEvent;
        Context context;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        final AndroidInstallReferrerDataSource androidInstallReferrerDataSource = this.this$0;
        this.L$0 = androidInstallReferrerDataSource;
        this.label = 1;
        AndroidInstallReferrerDataSource$invoke$2 androidInstallReferrerDataSource$invoke$2 = this;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(androidInstallReferrerDataSource$invoke$2), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        try {
            context = androidInstallReferrerDataSource.appContext;
            final InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
            build.startConnection(new InstallReferrerStateListener() { // from class: com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2$1$1
                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerSetupFinished(int responseCode) {
                    SendDiagnosticEvent sendDiagnosticEvent2;
                    String str;
                    SendDiagnosticEvent sendDiagnosticEvent3;
                    SendDiagnosticEvent sendDiagnosticEvent4;
                    if (responseCode == 0) {
                        try {
                            ReferrerDetails installReferrer = InstallReferrerClient.this.getInstallReferrer();
                            String installReferrer2 = installReferrer.getInstallReferrer();
                            if (installReferrer2 != null) {
                                str = new Regex("[^a-zA-Z0-9]").replace(installReferrer2, "");
                            } else {
                                str = null;
                            }
                            if (cancellableContinuationImpl2.isActive()) {
                                CancellableContinuation<InitializationRequestOuterClass.InstallReferrer> cancellableContinuation = cancellableContinuationImpl2;
                                InstallReferrerKt.Dsl.Companion companion = InstallReferrerKt.Dsl.INSTANCE;
                                InitializationRequestOuterClass.InstallReferrer.Builder newBuilder = InitializationRequestOuterClass.InstallReferrer.newBuilder();
                                Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
                                InstallReferrerKt.Dsl _create = companion._create(newBuilder);
                                if (str != null) {
                                    _create.setUrl(str);
                                }
                                _create.setClickTime(installReferrer.getReferrerClickTimestampSeconds());
                                _create.setInstallTime(installReferrer.getInstallBeginTimestampServerSeconds());
                                _create.setInstantExperienceLunch(installReferrer.getGooglePlayInstantParam());
                                cancellableContinuation.resume((CancellableContinuation<InitializationRequestOuterClass.InstallReferrer>) _create._build(), (Function1<? super Throwable, Unit>) new Function1<Throwable, Unit>() { // from class: com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$2
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Throwable it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                        invoke2(th);
                                        return Unit.INSTANCE;
                                    }
                                });
                            }
                            InstallReferrerClient.this.endConnection();
                            sendDiagnosticEvent3 = androidInstallReferrerDataSource.sendDiagnosticEvent;
                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, "install_referral_fetch_completed", null, null, null, null, null, 62, null);
                            return;
                        } catch (RemoteException unused) {
                            if (cancellableContinuationImpl2.isActive()) {
                                CancellableContinuation<InitializationRequestOuterClass.InstallReferrer> cancellableContinuation2 = cancellableContinuationImpl2;
                                Result.Companion companion2 = Result.INSTANCE;
                                cancellableContinuation2.resumeWith(Result.m11180constructorimpl(null));
                                sendDiagnosticEvent2 = androidInstallReferrerDataSource.sendDiagnosticEvent;
                                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, "install_referral_fetch_failed", null, null, null, null, null, 62, null);
                                return;
                            }
                            return;
                        }
                    }
                    if (cancellableContinuationImpl2.isActive()) {
                        CancellableContinuation<InitializationRequestOuterClass.InstallReferrer> cancellableContinuation3 = cancellableContinuationImpl2;
                        Result.Companion companion3 = Result.INSTANCE;
                        cancellableContinuation3.resumeWith(Result.m11180constructorimpl(null));
                        sendDiagnosticEvent4 = androidInstallReferrerDataSource.sendDiagnosticEvent;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent4, "install_referral_fetch_failed", null, null, null, null, null, 62, null);
                    }
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerServiceDisconnected() {
                    SendDiagnosticEvent sendDiagnosticEvent2;
                    if (cancellableContinuationImpl2.isActive()) {
                        CancellableContinuation<InitializationRequestOuterClass.InstallReferrer> cancellableContinuation = cancellableContinuationImpl2;
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m11180constructorimpl(null));
                        sendDiagnosticEvent2 = androidInstallReferrerDataSource.sendDiagnosticEvent;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, "install_referral_fetch_failed", null, null, null, null, null, 62, null);
                    }
                }
            });
        } catch (Throwable unused) {
            if (cancellableContinuationImpl2.isActive()) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(Result.m11180constructorimpl(null));
                sendDiagnosticEvent = androidInstallReferrerDataSource.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "install_referral_fetch_failed", null, null, null, null, null, 62, null);
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(androidInstallReferrerDataSource$invoke$2);
        }
        return result == coroutine_suspended ? coroutine_suspended : result;
    }
}
