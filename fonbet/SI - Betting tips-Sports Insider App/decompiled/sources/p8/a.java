package p8;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f21531e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f21532a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f21533b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21534c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f21535d;

    public a(String str, int i5, StrictMode.ThreadPolicy threadPolicy) {
        this.f21533b = str;
        this.f21534c = i5;
        this.f21535d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f21531e.newThread(new io.sentry.android.replay.util.c(17, this, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.f21533b + " Thread #" + this.f21532a.getAndIncrement());
        return newThread;
    }
}
