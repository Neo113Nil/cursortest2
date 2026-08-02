package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.f;
import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC2193s;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements H2.b {

    public static class a extends f.c {
        public a(Context context) {
            super(new b(context));
            b(1);
        }
    }

    public static class b implements f.h {

        /* renamed from: a, reason: collision with root package name */
        public final Context f19717a;

        public class a extends f.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f.i f19718a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThreadPoolExecutor f19719b;

            public a(f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f19718a = iVar;
                this.f19719b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.f.i
            public void a(Throwable th2) {
                try {
                    this.f19718a.a(th2);
                } finally {
                    this.f19719b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.f.i
            public void b(n nVar) {
                try {
                    this.f19718a.b(nVar);
                } finally {
                    this.f19719b.shutdown();
                }
            }
        }

        public b(Context context) {
            this.f19717a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.f.h
        public void a(final f.i iVar) {
            final ThreadPoolExecutor b10 = androidx.emoji2.text.c.b("EmojiCompatInitializer");
            b10.execute(new Runnable() { // from class: androidx.emoji2.text.g
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.b.this.c(iVar, b10);
                }
            });
        }

        public void c(f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                k a10 = d.a(this.f19717a);
                if (a10 == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                a10.c(threadPoolExecutor);
                a10.a().a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th2) {
                iVar.a(th2);
                threadPoolExecutor.shutdown();
            }
        }
    }

    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                u0.o.a("EmojiCompat.EmojiCompatInitializer.run");
                if (f.i()) {
                    f.c().l();
                }
            } finally {
                u0.o.b();
            }
        }
    }

    @Override // H2.b
    public List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // H2.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean create(Context context) {
        f.h(new a(context));
        c(context);
        return Boolean.TRUE;
    }

    public void c(Context context) {
        final AbstractC2185j lifecycle = ((InterfaceC2193s) H2.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new DefaultLifecycleObserver() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(InterfaceC2193s interfaceC2193s) {
                EmojiCompatInitializer.this.d();
                lifecycle.d(this);
            }
        });
    }

    public void d() {
        androidx.emoji2.text.c.c().postDelayed(new c(), 500L);
    }
}
