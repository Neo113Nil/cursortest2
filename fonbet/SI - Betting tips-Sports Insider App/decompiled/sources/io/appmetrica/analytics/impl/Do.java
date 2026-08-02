package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Do extends SimpleThreadSafeToggle {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f12172a;

    public Do() {
        super(false, "[WakelocksToggle]");
        this.f12172a = new WeakHashMap();
    }

    public final synchronized void a(@NotNull Object obj) {
        this.f12172a.put(obj, null);
        if (this.f12172a.size() == 1) {
            updateState(true);
        }
    }

    public final synchronized void b(@NotNull Object obj) {
        this.f12172a.remove(obj);
        if (this.f12172a.isEmpty()) {
            updateState(false);
        }
    }
}
