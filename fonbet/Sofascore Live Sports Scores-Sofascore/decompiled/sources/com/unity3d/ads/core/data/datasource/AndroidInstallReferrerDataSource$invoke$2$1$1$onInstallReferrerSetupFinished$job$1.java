package com.unity3d.ads.core.data.datasource;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.ReferrerDetails;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.kj2;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.rq3;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.y6a;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.InstallReferrerKt;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1", f = "AndroidInstallReferrerDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    final /* synthetic */ kj2 $continuation;
    final /* synthetic */ InstallReferrerClient $referrerClient;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidInstallReferrerDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1(InstallReferrerClient installReferrerClient, AndroidInstallReferrerDataSource androidInstallReferrerDataSource, kj2 kj2Var, rq3<? super AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1> rq3Var) {
        super(2, rq3Var);
        this.$referrerClient = installReferrerClient;
        this.this$0 = androidInstallReferrerDataSource;
        this.$continuation = kj2Var;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1 androidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1 = new AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1(this.$referrerClient, this.this$0, this.$continuation, rq3Var);
        androidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1.L$0 = obj;
        return androidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object u2gVar;
        SendDiagnosticEvent sendDiagnosticEvent;
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        try {
            try {
                try {
                    try {
                        ReferrerDetails installReferrer = this.$referrerClient.getInstallReferrer();
                        kj2 kj2Var = this.$continuation;
                        try {
                            p2g p2gVar = w2g.b;
                            InstallReferrerKt.Dsl.Companion companion = InstallReferrerKt.Dsl.INSTANCE;
                            InitializationRequestOuterClass.InstallReferrer.Builder newBuilder = InitializationRequestOuterClass.InstallReferrer.newBuilder();
                            newBuilder.getClass();
                            InstallReferrerKt.Dsl _create = companion._create(newBuilder);
                            String installReferrer2 = installReferrer.getInstallReferrer();
                            if (installReferrer2 != null) {
                                _create.setUrl(installReferrer2);
                            }
                            _create.setClickTime(installReferrer.getReferrerClickTimestampSeconds());
                            _create.setInstallTime(installReferrer.getInstallBeginTimestampServerSeconds());
                            _create.setInstantExperienceLunch(installReferrer.getGooglePlayInstantParam());
                            kj2Var.resumeWith(_create._build());
                            u2gVar = Unit.a;
                        } catch (Throwable th) {
                            p2g p2gVar2 = w2g.b;
                            u2gVar = new u2g(th);
                        }
                        if (!(u2gVar instanceof u2g)) {
                            sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "install_referral_fetch_completed", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (Object) null);
                        }
                    } catch (CancellationException e) {
                        throw e;
                    }
                } catch (Throwable unused) {
                    this.this$0.onError(this.$continuation);
                }
            } catch (RemoteException unused2) {
                this.this$0.onError(this.$continuation);
            }
            try {
                this.$referrerClient.endConnection();
            } catch (Throwable unused3) {
            }
            return Unit.a;
        } finally {
        }
    }
}
