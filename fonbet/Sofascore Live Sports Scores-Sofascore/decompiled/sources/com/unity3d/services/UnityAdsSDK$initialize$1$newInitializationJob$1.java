package com.unity3d.services;

import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.joa;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.services.UnityAdsSDK$initialize$1$newInitializationJob$1", f = "UnityAdsSDK.kt", l = {Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class UnityAdsSDK$initialize$1$newInitializationJob$1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    final /* synthetic */ ku3 $initScope;
    final /* synthetic */ joa $initializeBoldSDK$delegate;
    final /* synthetic */ String $source;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$initialize$1$newInitializationJob$1(String str, ku3 ku3Var, joa joaVar, rq3<? super UnityAdsSDK$initialize$1$newInitializationJob$1> rq3Var) {
        super(2, rq3Var);
        this.$source = str;
        this.$initScope = ku3Var;
        this.$initializeBoldSDK$delegate = joaVar;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new UnityAdsSDK$initialize$1$newInitializationJob$1(this.$source, this.$initScope, this.$initializeBoldSDK$delegate, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((UnityAdsSDK$initialize$1$newInitializationJob$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        InitializeBoldSDK initialize$lambda$6$lambda$5;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            initialize$lambda$6$lambda$5 = UnityAdsSDK.initialize$lambda$6$lambda$5(this.$initializeBoldSDK$delegate);
            String str = this.$source;
            this.label = 1;
            if (initialize$lambda$6$lambda$5.invoke(str, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        s9a.o(this.$initScope, null);
        return Unit.a;
    }
}
