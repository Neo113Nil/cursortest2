package k6;

import androidx.annotation.NonNull;
import androidx.collection.C5132a;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p6.j;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<j> f70922a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    private final C5132a<j, List<Class<?>>> f70923b = new C5132a<>();

    public final List<Class<?>> a(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3) {
        List<Class<?>> list;
        j andSet = this.f70922a.getAndSet(null);
        if (andSet == null) {
            andSet = new j(cls, cls2, cls3);
        } else {
            andSet.a(cls, cls2, cls3);
        }
        synchronized (this.f70923b) {
            list = this.f70923b.get(andSet);
        }
        this.f70922a.set(andSet);
        return list;
    }

    public final void b(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3, @NonNull List<Class<?>> list) {
        synchronized (this.f70923b) {
            this.f70923b.put(new j(cls, cls2, cls3), list);
        }
    }
}
