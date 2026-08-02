package androidx.emoji2.text;

import android.content.Context;
import android.os.Trace;
import androidx.annotation.NonNull;
import androidx.emoji2.text.c;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import xsna.adp;
import xsna.azc;
import xsna.f5z;
import xsna.lwi;
import xsna.lzw;
import xsna.o53;
import xsna.pdp0;

/* loaded from: classes12.dex */
public class EmojiCompatInitializer implements lzw<Boolean> {

    public static class a extends c.AbstractC0029c {
    }

    public static class b implements c.h {
        public final Context a;

        public b(Context context) {
            this.a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.c.h
        public final void a(@NonNull c.i iVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new lwi("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new azc(this, iVar, threadPoolExecutor, 1));
        }
    }

    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                int i = pdp0.a;
                Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (androidx.emoji2.text.c.d()) {
                    androidx.emoji2.text.c.a().e();
                }
                Trace.endSection();
            } catch (Throwable th) {
                int i2 = pdp0.a;
                Trace.endSection();
                throw th;
            }
        }
    }

    @Override // xsna.lzw
    @NonNull
    public final Boolean create(@NonNull Context context) {
        Object obj;
        a aVar = new a(new b(context));
        aVar.b = 1;
        if (androidx.emoji2.text.c.k == null) {
            synchronized (androidx.emoji2.text.c.j) {
                try {
                    if (androidx.emoji2.text.c.k == null) {
                        androidx.emoji2.text.c.k = new androidx.emoji2.text.c(aVar);
                    }
                } finally {
                }
            }
        }
        o53 d = o53.d(context);
        d.getClass();
        synchronized (o53.e) {
            try {
                obj = d.a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = d.c(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        Lifecycle lifecycle = ((f5z) obj).getLifecycle();
        lifecycle.addObserver(new adp(this, lifecycle));
        return Boolean.TRUE;
    }

    @Override // xsna.lzw
    @NonNull
    public final List<Class<? extends lzw<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
