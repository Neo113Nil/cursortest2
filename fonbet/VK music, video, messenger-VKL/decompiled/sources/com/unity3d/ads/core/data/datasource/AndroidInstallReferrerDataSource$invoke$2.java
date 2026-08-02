package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.lq9;
import xsna.myc0;
import xsna.s3q0;
import xsna.s7s0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: AndroidInstallReferrerDataSource.kt */
@b6l(c = "com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2", f = "AndroidInstallReferrerDataSource.kt", l = {111}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidInstallReferrerDataSource$invoke$2 extends SuspendLambda implements wzs<yvj, spj<? super InitializationRequestOuterClass.InstallReferrer>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ AndroidInstallReferrerDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidInstallReferrerDataSource$invoke$2(AndroidInstallReferrerDataSource androidInstallReferrerDataSource, spj<? super AndroidInstallReferrerDataSource$invoke$2> spjVar) {
        super(2, spjVar);
        this.this$0 = androidInstallReferrerDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidInstallReferrerDataSource$invoke$2(this.this$0, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context context;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        final AndroidInstallReferrerDataSource androidInstallReferrerDataSource = this.this$0;
        this.L$0 = androidInstallReferrerDataSource;
        this.label = 1;
        final lq9 lq9Var = new lq9(1, s7s0.c(this));
        lq9Var.o();
        try {
            context = androidInstallReferrerDataSource.appContext;
            final InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
            build.startConnection(new InstallReferrerStateListener() { // from class: com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2$1$1
                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerServiceDisconnected() {
                    AndroidInstallReferrerDataSource.this.onError(lq9Var);
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerSetupFinished(int i2) {
                    yvj yvjVar;
                    if (i2 != 0) {
                        try {
                            build.endConnection();
                        } catch (Throwable unused) {
                        }
                        AndroidInstallReferrerDataSource.this.onError(lq9Var);
                        return;
                    }
                    yvjVar = AndroidInstallReferrerDataSource.this.scope;
                    if (myc0.h(yvjVar, null, null, new AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1(build, AndroidInstallReferrerDataSource.this, lq9Var, null), 3).isActive()) {
                        return;
                    }
                    try {
                        build.endConnection();
                    } catch (Throwable unused2) {
                    }
                    AndroidInstallReferrerDataSource.this.onError(lq9Var);
                }
            });
        } catch (Throwable unused) {
            androidInstallReferrerDataSource.onError(lq9Var);
        }
        Object n = lq9Var.n();
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n == coroutineSingletons ? coroutineSingletons : n;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super InitializationRequestOuterClass.InstallReferrer> spjVar) {
        return ((AndroidInstallReferrerDataSource$invoke$2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
