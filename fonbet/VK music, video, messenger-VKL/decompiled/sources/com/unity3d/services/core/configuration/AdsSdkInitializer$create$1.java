package com.unity3d.services.core.configuration;

import android.content.Context;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.services.core.di.ServiceProvider;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.fpf0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.xek;
import xsna.yvj;

/* compiled from: AdsSdkInitializer.kt */
@b6l(c = "com.unity3d.services.core.configuration.AdsSdkInitializer$create$1", f = "AdsSdkInitializer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AdsSdkInitializer$create$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsSdkInitializer$create$1(Context context, spj<? super AdsSdkInitializer$create$1> spjVar) {
        super(2, spjVar);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AdsSdkInitializer$create$1(this.$context, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.a(obj);
        ((OrientationRepository) ServiceProvider.INSTANCE.getRegistry().getService("", fpf0.a(OrientationRepository.class))).invoke();
        try {
            xek.a(this.$context);
        } catch (Throwable unused) {
        }
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((AdsSdkInitializer$create$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
