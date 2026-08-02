package com.unity3d.services.core.configuration;

import android.app.Application;
import android.content.Context;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.bdn;
import xsna.lzw;
import xsna.myc0;
import xsna.pvj;
import xsna.s3q0;
import xsna.zvj;

/* compiled from: AdsSdkInitializer.kt */
/* loaded from: classes14.dex */
public final class AdsSdkInitializer implements lzw<s3q0> {
    @Override // xsna.lzw
    public /* bridge */ /* synthetic */ s3q0 create(Context context) {
        create2(context);
        return s3q0.a;
    }

    @Override // xsna.lzw
    public List<Class<? extends lzw<?>>> dependencies() {
        return EmptyList.b;
    }

    /* renamed from: create, reason: avoid collision after fix types in other method */
    public void create2(Context context) {
        ClientProperties.setApplicationContext(context.getApplicationContext());
        if (context instanceof Application) {
            ClientProperties.setApplication((Application) context);
        } else if (context.getApplicationContext() instanceof Application) {
            ClientProperties.setApplication((Application) context.getApplicationContext());
        }
        SdkProperties.setAppInitializationTimeSinceEpoch(System.currentTimeMillis());
        myc0.h(zvj.g(zvj.a(bdn.b), new AdsSdkInitializer$create$$inlined$CoroutineExceptionHandler$1(pvj.a.b)), null, null, new AdsSdkInitializer$create$1(context, null), 3);
    }
}
