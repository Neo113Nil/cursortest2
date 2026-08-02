package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;

/* compiled from: AndroidInstallReferrerDataSource.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidInstallReferrerDataSource;", "Lcom/unity3d/ads/core/data/datasource/InstallReferrerDataSource;", "appContext", "Landroid/content/Context;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Landroid/content/Context;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AndroidInstallReferrerDataSource implements InstallReferrerDataSource {
    private static final long TIME_OUT_MS = 500;
    private final Context appContext;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidInstallReferrerDataSource(Context appContext, SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.appContext = appContext;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.unity3d.ads.core.data.datasource.InstallReferrerDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(Continuation<? super InitializationRequestOuterClass.InstallReferrer> continuation) {
        AndroidInstallReferrerDataSource$invoke$1 androidInstallReferrerDataSource$invoke$1;
        int i;
        AndroidInstallReferrerDataSource androidInstallReferrerDataSource;
        if (continuation instanceof AndroidInstallReferrerDataSource$invoke$1) {
            androidInstallReferrerDataSource$invoke$1 = (AndroidInstallReferrerDataSource$invoke$1) continuation;
            if ((androidInstallReferrerDataSource$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidInstallReferrerDataSource$invoke$1.label -= Integer.MIN_VALUE;
                Object obj = androidInstallReferrerDataSource$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidInstallReferrerDataSource$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        AndroidInstallReferrerDataSource$invoke$2 androidInstallReferrerDataSource$invoke$2 = new AndroidInstallReferrerDataSource$invoke$2(this, null);
                        androidInstallReferrerDataSource$invoke$1.L$0 = this;
                        androidInstallReferrerDataSource$invoke$1.label = 1;
                        obj = TimeoutKt.withTimeout(500L, androidInstallReferrerDataSource$invoke$2, androidInstallReferrerDataSource$invoke$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        androidInstallReferrerDataSource = this;
                    } catch (TimeoutCancellationException unused) {
                        androidInstallReferrerDataSource = this;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(androidInstallReferrerDataSource.sendDiagnosticEvent, "install_referral_fetch_timed_out", null, null, null, null, null, 62, null);
                        return null;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidInstallReferrerDataSource = (AndroidInstallReferrerDataSource) androidInstallReferrerDataSource$invoke$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (TimeoutCancellationException unused2) {
                        SendDiagnosticEvent.DefaultImpls.invoke$default(androidInstallReferrerDataSource.sendDiagnosticEvent, "install_referral_fetch_timed_out", null, null, null, null, null, 62, null);
                        return null;
                    }
                }
                return (InitializationRequestOuterClass.InstallReferrer) obj;
            }
        }
        androidInstallReferrerDataSource$invoke$1 = new AndroidInstallReferrerDataSource$invoke$1(this, continuation);
        Object obj2 = androidInstallReferrerDataSource$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidInstallReferrerDataSource$invoke$1.label;
        if (i != 0) {
        }
        return (InitializationRequestOuterClass.InstallReferrer) obj2;
    }
}
