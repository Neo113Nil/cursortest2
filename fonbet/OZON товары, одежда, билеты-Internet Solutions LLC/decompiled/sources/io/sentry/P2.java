package io.sentry;

import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class P2 {

    /* renamed from: a, reason: collision with root package name */
    protected CopyOnWriteArraySet f66712a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    protected CopyOnWriteArraySet f66713b = new CopyOnWriteArraySet();

    public final void a(@NotNull String str) {
        this.f66712a.add(str);
        this.f66713b.remove(str);
    }

    @NotNull
    public final CopyOnWriteArraySet b() {
        return this.f66712a;
    }

    @NotNull
    public final CopyOnWriteArraySet c() {
        return this.f66713b;
    }

    public void d(boolean z11) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.f66713b;
        CopyOnWriteArraySet copyOnWriteArraySet2 = this.f66712a;
        if (z11) {
            copyOnWriteArraySet2.add("android.widget.ImageView");
            copyOnWriteArraySet.remove("android.widget.ImageView");
        } else {
            copyOnWriteArraySet.add("android.widget.ImageView");
            copyOnWriteArraySet2.remove("android.widget.ImageView");
        }
    }

    public void e(boolean z11) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.f66713b;
        CopyOnWriteArraySet copyOnWriteArraySet2 = this.f66712a;
        if (z11) {
            copyOnWriteArraySet2.add("android.widget.TextView");
            copyOnWriteArraySet.remove("android.widget.TextView");
        } else {
            copyOnWriteArraySet.add("android.widget.TextView");
            copyOnWriteArraySet2.remove("android.widget.TextView");
        }
    }

    public abstract void f();
}
