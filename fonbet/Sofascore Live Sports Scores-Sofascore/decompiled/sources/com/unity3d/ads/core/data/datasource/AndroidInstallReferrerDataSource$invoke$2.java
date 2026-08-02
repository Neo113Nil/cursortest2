package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lj2;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z9a;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "<anonymous>", "(Lku3;)Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2", f = "AndroidInstallReferrerDataSource.kt", l = {111}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidInstallReferrerDataSource$invoke$2 extends hoi implements Function2<ku3, rq3<? super InitializationRequestOuterClass.InstallReferrer>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ AndroidInstallReferrerDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidInstallReferrerDataSource$invoke$2(AndroidInstallReferrerDataSource androidInstallReferrerDataSource, rq3<? super AndroidInstallReferrerDataSource$invoke$2> rq3Var) {
        super(2, rq3Var);
        this.this$0 = androidInstallReferrerDataSource;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new AndroidInstallReferrerDataSource$invoke$2(this.this$0, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super InitializationRequestOuterClass.InstallReferrer> rq3Var) {
        return ((AndroidInstallReferrerDataSource$invoke$2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Context context;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            return obj;
        }
        y6a.M(obj);
        final AndroidInstallReferrerDataSource androidInstallReferrerDataSource = this.this$0;
        this.L$0 = androidInstallReferrerDataSource;
        this.label = 1;
        final lj2 lj2Var = new lj2(1, z9a.b(this));
        lj2Var.t();
        try {
            context = androidInstallReferrerDataSource.appContext;
            final InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
            build.startConnection(new InstallReferrerStateListener() { // from class: com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2$1$1
                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerServiceDisconnected() {
                    AndroidInstallReferrerDataSource.this.onError(lj2Var);
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerSetupFinished(int responseCode) {
                    ku3 ku3Var;
                    if (responseCode != 0) {
                        try {
                            build.endConnection();
                        } catch (Throwable unused) {
                        }
                        AndroidInstallReferrerDataSource.this.onError(lj2Var);
                        return;
                    }
                    ku3Var = AndroidInstallReferrerDataSource.this.scope;
                    if (xw3.L(ku3Var, null, null, new AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1(build, AndroidInstallReferrerDataSource.this, lj2Var, null), 3).isActive()) {
                        return;
                    }
                    try {
                        build.endConnection();
                    } catch (Throwable unused2) {
                    }
                    AndroidInstallReferrerDataSource.this.onError(lj2Var);
                }
            });
        } catch (Throwable unused) {
            androidInstallReferrerDataSource.onError(lj2Var);
        }
        Object q = lj2Var.q();
        lu3 lu3Var2 = lu3.a;
        return q == lu3Var ? lu3Var : q;
    }
}
