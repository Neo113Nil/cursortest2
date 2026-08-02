package C7;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class B implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final int f1174a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1175b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1176c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicInteger f1177d;

    public B(int i10, String prefix, boolean z10) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        this.f1174a = i10;
        this.f1175b = prefix;
        this.f1176c = z10;
        this.f1177d = new AtomicInteger(1);
    }

    public static final void b(B this$0, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        try {
            Process.setThreadPriority(this$0.f1174a);
        } catch (Throwable unused) {
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        String str;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Runnable runnable2 = new Runnable() { // from class: C7.A
            @Override // java.lang.Runnable
            public final void run() {
                B.b(B.this, runnable);
            }
        };
        if (this.f1176c) {
            str = this.f1175b + "-" + this.f1177d.getAndIncrement();
        } else {
            str = this.f1175b;
        }
        return new Thread(runnable2, str);
    }
}
