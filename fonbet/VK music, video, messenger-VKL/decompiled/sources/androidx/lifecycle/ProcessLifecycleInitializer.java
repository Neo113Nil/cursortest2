package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.k;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.f5z;
import xsna.lzw;
import xsna.o53;

/* compiled from: ProcessLifecycleInitializer.kt */
/* loaded from: classes12.dex */
public final class ProcessLifecycleInitializer implements lzw<f5z> {
    @Override // xsna.lzw
    public final f5z create(Context context) {
        if (!o53.d(context).b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!k.a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new k.a());
        }
        q qVar = q.j;
        qVar.getClass();
        qVar.f = new Handler();
        qVar.g.c(Lifecycle.Event.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new r(qVar));
        return qVar;
    }

    @Override // xsna.lzw
    public final List<Class<? extends lzw<?>>> dependencies() {
        return EmptyList.b;
    }
}
