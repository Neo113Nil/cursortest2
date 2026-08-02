package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.be5;
import defpackage.kj2;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.n4o;
import defpackage.p2g;
import defpackage.qij;
import defpackage.rq3;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.wba;
import defpackage.wd5;
import defpackage.wkn;
import defpackage.xd5;
import defpackage.y6a;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0096B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidInstallReferrerDataSource;", "Lcom/unity3d/ads/core/data/datasource/InstallReferrerDataSource;", "Landroid/content/Context;", "appContext", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lku3;", "scope", "<init>", "(Landroid/content/Context;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lku3;)V", "Lkj2;", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "continuation", "", "onError", "(Lkj2;)V", "invoke", "(Lrq3;)Ljava/lang/Object;", "Landroid/content/Context;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lku3;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidInstallReferrerDataSource implements InstallReferrerDataSource {
    private static final long TIME_OUT_MS = 500;

    @NotNull
    private final Context appContext;

    @NotNull
    private final ku3 scope;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidInstallReferrerDataSource(@NotNull Context context, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull ku3 ku3Var) {
        context.getClass();
        sendDiagnosticEvent.getClass();
        ku3Var.getClass();
        this.appContext = context;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.scope = ku3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(kj2 continuation) {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            continuation.resumeWith(null);
            u2gVar = Unit.a;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (u2gVar instanceof u2g) {
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "install_referral_fetch_failed", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.unity3d.ads.core.data.datasource.InstallReferrerDataSource
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull rq3<? super InitializationRequestOuterClass.InstallReferrer> rq3Var) {
        AndroidInstallReferrerDataSource$invoke$1 androidInstallReferrerDataSource$invoke$1;
        int i;
        try {
            if (rq3Var instanceof AndroidInstallReferrerDataSource$invoke$1) {
                androidInstallReferrerDataSource$invoke$1 = (AndroidInstallReferrerDataSource$invoke$1) rq3Var;
                int i2 = androidInstallReferrerDataSource$invoke$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    androidInstallReferrerDataSource$invoke$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = androidInstallReferrerDataSource$invoke$1.result;
                    lu3 lu3Var = lu3.a;
                    i = androidInstallReferrerDataSource$invoke$1.label;
                    if (i != 0) {
                        y6a.M(obj);
                        wd5 wd5Var = xd5.b;
                        long S = wkn.S(500L, be5.MILLISECONDS);
                        AndroidInstallReferrerDataSource$invoke$2 androidInstallReferrerDataSource$invoke$2 = new AndroidInstallReferrerDataSource$invoke$2(this, null);
                        androidInstallReferrerDataSource$invoke$1.label = 1;
                        obj = wba.U(n4o.R(S), androidInstallReferrerDataSource$invoke$2, androidInstallReferrerDataSource$invoke$1);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    return (InitializationRequestOuterClass.InstallReferrer) obj;
                }
            }
            if (i != 0) {
            }
            return (InitializationRequestOuterClass.InstallReferrer) obj;
        } catch (qij unused) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "install_referral_fetch_timed_out", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (Object) null);
            return null;
        }
        androidInstallReferrerDataSource$invoke$1 = new AndroidInstallReferrerDataSource$invoke$1(this, rq3Var);
        Object obj2 = androidInstallReferrerDataSource$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidInstallReferrerDataSource$invoke$1.label;
    }
}
