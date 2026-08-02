package Z;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static AtomicInteger f14379a = new AtomicInteger(0);

    public static final int a() {
        return f14379a.addAndGet(1);
    }
}
