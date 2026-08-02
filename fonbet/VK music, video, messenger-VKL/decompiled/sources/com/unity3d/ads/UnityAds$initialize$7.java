package com.unity3d.ads;

import com.ironsource.adapters.yandex.YandexConstants;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityServices;
import com.unity3d.services.core.properties.ClientProperties;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: UnityAds.kt */
@b6l(c = "com.unity3d.ads.UnityAds$initialize$7", f = "UnityAds.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UnityAds$initialize$7 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ InitializationConfiguration $configuration;
    final /* synthetic */ InitializationListener $listener;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAds$initialize$7(InitializationConfiguration initializationConfiguration, InitializationListener initializationListener, spj<? super UnityAds$initialize$7> spjVar) {
        super(2, spjVar);
        this.$configuration = initializationConfiguration;
        this.$listener = initializationListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new UnityAds$initialize$7(this.$configuration, this.$listener, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (this.$configuration.getMediationInfo() != null) {
            MediationMetaData mediationMetaData = new MediationMetaData(ClientProperties.getApplicationContext());
            InitializationConfiguration initializationConfiguration = this.$configuration;
            mediationMetaData.setName(initializationConfiguration.getMediationInfo().getName());
            mediationMetaData.setVersion(initializationConfiguration.getMediationInfo().getVersion());
            mediationMetaData.set(YandexConstants.ADAPTER_VERSION_KEY, initializationConfiguration.getMediationInfo().getAdapterVersion());
            mediationMetaData.commit();
        }
        UnityServices.initialize(ClientProperties.getApplicationContext(), this.$configuration.getGameId(), this.$configuration.isTestModeEnabled(), this.$configuration, this.$listener);
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((UnityAds$initialize$7) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
