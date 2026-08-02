package ru.ozon.composer.ui.widget;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<l20.d, W10.d> f94865a = new ConcurrentHashMap<>();

    @NotNull
    public final W10.d a(@NotNull l20.d info) {
        W10.d putIfAbsent;
        Intrinsics.checkNotNullParameter(info, "info");
        ConcurrentHashMap<l20.d, W10.d> concurrentHashMap = this.f94865a;
        W10.d dVar = concurrentHashMap.get(info);
        if (dVar == null && (putIfAbsent = concurrentHashMap.putIfAbsent(info, (dVar = new W10.d(info)))) != null) {
            dVar = putIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(dVar, "getOrPut(...)");
        return dVar;
    }

    public final void b(@NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f94865a.putIfAbsent(info, new W10.d(info));
    }

    public final void c(@NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f94865a.remove(info);
    }
}
