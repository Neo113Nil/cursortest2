package ru.ozon.composer.ui.widget;

import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final HashMap<String, HashSet<Long>> f94866a = new HashMap<>();

    public final void a() {
        this.f94866a.clear();
    }

    public final boolean b(long j11, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        HashSet<Long> hashSet = this.f94866a.get(stateId);
        if (hashSet != null) {
            return hashSet.contains(Long.valueOf(j11));
        }
        return false;
    }

    public final boolean c(@NotNull String stateId) {
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        return this.f94866a.containsKey(stateId);
    }

    public final void d(Long l11, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        HashMap<String, HashSet<Long>> hashMap = this.f94866a;
        HashSet<Long> hashSet = hashMap.get(stateId);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            hashMap.put(stateId, hashSet);
        }
        if (l11 != null) {
            hashSet.add(l11);
        }
    }

    public final void e(@NotNull String stateId) {
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        d(null, stateId);
    }
}
