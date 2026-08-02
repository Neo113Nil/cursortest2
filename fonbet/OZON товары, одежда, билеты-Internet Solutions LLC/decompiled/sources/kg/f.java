package kg;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference<f> f71582a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f71583b = 0;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        static final f f71584a;

        static {
            AtomicReference atomicReference = f.f71582a;
            j jVar = new j();
            while (!atomicReference.compareAndSet(null, jVar) && atomicReference.get() == null) {
            }
            f71584a = (f) f.f71582a.get();
        }
    }

    public abstract String b(mg.h hVar, long j11, k kVar, Locale locale);
}
