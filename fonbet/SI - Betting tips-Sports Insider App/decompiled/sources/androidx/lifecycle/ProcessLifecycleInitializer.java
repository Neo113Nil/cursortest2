package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lx2/b;", "Landroidx/lifecycle/e0;", "<init>", "()V", "lifecycle-process"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements x2.b {
    @Override // x2.b
    public final List a() {
        return kotlin.collections.e0.f19204a;
    }

    @Override // x2.b
    public final Object create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        x2.a c2 = x2.a.c(context);
        Intrinsics.checkNotNullExpressionValue(c2, "getInstance(...)");
        if (!c2.f25385b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        AtomicBoolean atomicBoolean = b0.f2137a;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!b0.f2137a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new a0());
        }
        ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f2124i;
        Intrinsics.checkNotNullParameter(context, "context");
        ProcessLifecycleOwner processLifecycleOwner2 = ProcessLifecycleOwner.f2124i;
        processLifecycleOwner2.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        processLifecycleOwner2.f2129e = new Handler();
        processLifecycleOwner2.f2130f.e(w.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new t0(processLifecycleOwner2));
        return processLifecycleOwner2;
    }
}
