package c5;

import androidx.annotation.NonNull;
import androidx.work.impl.C5475c;
import androidx.work.o;
import g5.C6627B;
import java.util.HashMap;

/* renamed from: c5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5745a {

    /* renamed from: d, reason: collision with root package name */
    static final String f56495d = o.i("DelayedWorkTracker");

    /* renamed from: a, reason: collision with root package name */
    final b f56496a;

    /* renamed from: b, reason: collision with root package name */
    private final C5475c f56497b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f56498c = new HashMap();

    /* renamed from: c5.a$a, reason: collision with other inner class name */
    final class RunnableC0852a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6627B f56499a;

        RunnableC0852a(C6627B c6627b) {
            this.f56499a = c6627b;
        }

        @Override // java.lang.Runnable
        public final void run() {
            o e11 = o.e();
            String str = C5745a.f56495d;
            StringBuilder sb2 = new StringBuilder("Scheduling work ");
            C6627B c6627b = this.f56499a;
            sb2.append(c6627b.f63799a);
            e11.a(str, sb2.toString());
            C5745a.this.f56496a.a(c6627b);
        }
    }

    public C5745a(@NonNull b bVar, @NonNull C5475c c5475c) {
        this.f56496a = bVar;
        this.f56497b = c5475c;
    }

    public final void a(@NonNull C6627B c6627b) {
        HashMap hashMap = this.f56498c;
        String str = c6627b.f63799a;
        Runnable runnable = (Runnable) hashMap.remove(str);
        C5475c c5475c = this.f56497b;
        if (runnable != null) {
            c5475c.a(runnable);
        }
        RunnableC0852a runnableC0852a = new RunnableC0852a(c6627b);
        hashMap.put(str, runnableC0852a);
        c5475c.b(runnableC0852a, c6627b.a() - System.currentTimeMillis());
    }

    public final void b(@NonNull String str) {
        Runnable runnable = (Runnable) this.f56498c.remove(str);
        if (runnable != null) {
            this.f56497b.a(runnable);
        }
    }
}
