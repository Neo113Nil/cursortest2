package io.sentry;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class I {

    /* renamed from: b, reason: collision with root package name */
    public static final I f50380b = new I();

    /* renamed from: a, reason: collision with root package name */
    public final List f50381a = new CopyOnWriteArrayList();

    public interface a {
    }

    public static I a() {
        return f50380b;
    }

    public void b(a aVar) {
        this.f50381a.add(aVar);
    }
}
