package me;

import java.util.List;
import je.n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: me.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8136a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<n0> f74750a;

    /* JADX WARN: Multi-variable type inference failed */
    public C8136a(@NotNull List<? extends n0> translators) {
        Intrinsics.checkNotNullParameter(translators, "translators");
        this.f74750a = translators;
    }

    @NotNull
    public final List<n0> a() {
        return this.f74750a;
    }
}
