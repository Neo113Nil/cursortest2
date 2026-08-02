package com.unity3d.services.core.configuration;

import android.app.Application;
import android.content.Context;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import defpackage.bu3;
import defpackage.k3a;
import defpackage.km5;
import defpackage.s9a;
import defpackage.xw3;
import defpackage.z45;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/unity3d/services/core/configuration/AdsSdkInitializer;", "Lk3a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)V", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdsSdkInitializer implements k3a {
    /* renamed from: create, reason: collision with other method in class */
    public void m756create(@NotNull Context context) {
        context.getClass();
        ClientProperties.setApplicationContext(context.getApplicationContext());
        if (context instanceof Application) {
            ClientProperties.setApplication((Application) context);
        } else if (context.getApplicationContext() instanceof Application) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ClientProperties.setApplication((Application) applicationContext);
        }
        SdkProperties.setAppInitializationTimeSinceEpoch(System.currentTimeMillis());
        xw3.L(s9a.F(s9a.c(z45.a), new AdsSdkInitializer$create$$inlined$CoroutineExceptionHandler$1(bu3.a)), null, null, new AdsSdkInitializer$create$1(context, null), 3);
    }

    @Override // defpackage.k3a
    @NotNull
    public List<Class<? extends k3a>> dependencies() {
        return km5.a;
    }

    @Override // defpackage.k3a
    public /* bridge */ /* synthetic */ Object create(Context context) {
        m756create(context);
        return Unit.a;
    }
}
