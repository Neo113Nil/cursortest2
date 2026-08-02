package L0;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f6740a;

    public b(boolean z10) {
        this.f6740a = new AtomicBoolean(z10);
    }

    public final boolean a() {
        return this.f6740a.get();
    }

    public final void b(boolean z10) {
        this.f6740a.set(z10);
    }
}
