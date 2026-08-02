package com.unity3d.ads.core.data.datasource;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.ReferrerDetails;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.InstallReferrerKt;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.kq9;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: AndroidInstallReferrerDataSource.kt */
@b6l(c = "com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1", f = "AndroidInstallReferrerDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ kq9<InitializationRequestOuterClass.InstallReferrer> $continuation;
    final /* synthetic */ InstallReferrerClient $referrerClient;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidInstallReferrerDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1(InstallReferrerClient installReferrerClient, AndroidInstallReferrerDataSource androidInstallReferrerDataSource, kq9<? super InitializationRequestOuterClass.InstallReferrer> kq9Var, spj<? super AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1> spjVar) {
        super(2, spjVar);
        this.$referrerClient = installReferrerClient;
        this.this$0 = androidInstallReferrerDataSource;
        this.$continuation = kq9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1 androidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1 = new AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1(this.$referrerClient, this.this$0, this.$continuation, spjVar);
        androidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1.L$0 = obj;
        return androidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        SendDiagnosticEvent sendDiagnosticEvent;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        try {
            try {
                try {
                    ReferrerDetails installReferrer = this.$referrerClient.getInstallReferrer();
                    kq9<InitializationRequestOuterClass.InstallReferrer> kq9Var = this.$continuation;
                    try {
                        InstallReferrerKt.Dsl _create = InstallReferrerKt.Dsl.Companion._create(InitializationRequestOuterClass.InstallReferrer.newBuilder());
                        String installReferrer2 = installReferrer.getInstallReferrer();
                        if (installReferrer2 != null) {
                            _create.setUrl(installReferrer2);
                        }
                        _create.setClickTime(installReferrer.getReferrerClickTimestampSeconds());
                        _create.setInstallTime(installReferrer.getInstallBeginTimestampServerSeconds());
                        _create.setInstantExperienceLunch(installReferrer.getGooglePlayInstantParam());
                        kq9Var.resumeWith(_create._build());
                        failure = s3q0.a;
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    if (!(failure instanceof Result.Failure)) {
                        sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "install_referral_fetch_completed", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (Object) null);
                    }
                } catch (CancellationException e) {
                    throw e;
                }
            } catch (RemoteException unused) {
                this.this$0.onError(this.$continuation);
            } catch (Throwable unused2) {
                this.this$0.onError(this.$continuation);
            }
            try {
                this.$referrerClient.endConnection();
            } catch (Throwable unused3) {
            }
            return s3q0.a;
        } finally {
        }
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
