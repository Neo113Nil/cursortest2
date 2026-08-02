package L9;

import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f7102a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f7103b = new AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    public final ThreadFactory f7104c = Executors.defaultThreadFactory();

    public c(String str) {
        AbstractC3191o.n(str, "Name must not be null");
        this.f7102a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f7104c.newThread(new d(runnable, 0));
        int andIncrement = this.f7103b.getAndIncrement();
        int length = String.valueOf(andIncrement).length();
        String str = this.f7102a;
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + length + 1);
        sb2.append(str);
        sb2.append("[");
        sb2.append(andIncrement);
        sb2.append("]");
        newThread.setName(sb2.toString());
        return newThread;
    }
}
