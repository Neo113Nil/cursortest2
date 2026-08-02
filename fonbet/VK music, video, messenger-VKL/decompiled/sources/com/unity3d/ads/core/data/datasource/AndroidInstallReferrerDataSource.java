package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.eoo;
import xsna.kq9;
import xsna.oxo0;
import xsna.qsl;
import xsna.s3q0;
import xsna.spj;
import xsna.yvj;
import xsna.zcl;
import xsna.zno;

/* compiled from: AndroidInstallReferrerDataSource.kt */
/* loaded from: classes14.dex */
public final class AndroidInstallReferrerDataSource implements InstallReferrerDataSource {
    public static final Companion Companion = new Companion(null);
    private static final long TIME_OUT_MS = 500;
    private final Context appContext;
    private final yvj scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* compiled from: AndroidInstallReferrerDataSource.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidInstallReferrerDataSource(Context context, SendDiagnosticEvent sendDiagnosticEvent, yvj yvjVar) {
        this.appContext = context;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.scope = yvjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(kq9<? super InitializationRequestOuterClass.InstallReferrer> kq9Var) {
        Object failure;
        try {
            kq9Var.resumeWith(null);
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "install_referral_fetch_failed", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.unity3d.ads.core.data.datasource.InstallReferrerDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(spj<? super InitializationRequestOuterClass.InstallReferrer> spjVar) {
        AndroidInstallReferrerDataSource$invoke$1 androidInstallReferrerDataSource$invoke$1;
        int i;
        try {
            if (spjVar instanceof AndroidInstallReferrerDataSource$invoke$1) {
                androidInstallReferrerDataSource$invoke$1 = (AndroidInstallReferrerDataSource$invoke$1) spjVar;
                int i2 = androidInstallReferrerDataSource$invoke$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    androidInstallReferrerDataSource$invoke$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = androidInstallReferrerDataSource$invoke$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = androidInstallReferrerDataSource$invoke$1.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        zno.a aVar = zno.c;
                        long f = eoo.f(500L, DurationUnit.MILLISECONDS);
                        AndroidInstallReferrerDataSource$invoke$2 androidInstallReferrerDataSource$invoke$2 = new AndroidInstallReferrerDataSource$invoke$2(this, null);
                        androidInstallReferrerDataSource$invoke$1.label = 1;
                        obj = oxo0.b(qsl.e(f), androidInstallReferrerDataSource$invoke$2, androidInstallReferrerDataSource$invoke$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    return (InitializationRequestOuterClass.InstallReferrer) obj;
                }
            }
            if (i != 0) {
            }
            return (InitializationRequestOuterClass.InstallReferrer) obj;
        } catch (TimeoutCancellationException unused) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "install_referral_fetch_timed_out", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (Object) null);
            return null;
        }
        androidInstallReferrerDataSource$invoke$1 = new AndroidInstallReferrerDataSource$invoke$1(this, spjVar);
        Object obj2 = androidInstallReferrerDataSource$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidInstallReferrerDataSource$invoke$1.label;
    }
}
