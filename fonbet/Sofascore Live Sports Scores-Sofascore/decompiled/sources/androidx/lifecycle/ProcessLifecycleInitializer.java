package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.a70;
import defpackage.a8f;
import defpackage.b8f;
import defpackage.d6b;
import defpackage.k3a;
import defpackage.km5;
import defpackage.m6b;
import defpackage.n6b;
import defpackage.sx2;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lk3a;", "Lu6b;", "<init>", "()V", "lifecycle-process"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements k3a {
    @Override // defpackage.k3a
    public final Object create(Context context) {
        context.getClass();
        sx2 x = sx2.x(context);
        x.getClass();
        if (!((HashSet) x.b).contains(ProcessLifecycleInitializer.class)) {
            a70.r("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!n6b.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new m6b());
        }
        b8f b8fVar = b8f.i;
        b8fVar.getClass();
        b8fVar.e = new Handler();
        b8fVar.f.g(d6b.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new a8f(b8fVar));
        return b8fVar;
    }

    @Override // defpackage.k3a
    public final List dependencies() {
        return km5.a;
    }
}
