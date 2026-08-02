package L9;

import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f7100a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadFactory f7101b = Executors.defaultThreadFactory();

    public b(String str) {
        AbstractC3191o.n(str, "Name must not be null");
        this.f7100a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f7101b.newThread(new d(runnable, 0));
        newThread.setName(this.f7100a);
        return newThread;
    }
}
