package jf0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: jf0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7421a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f70001a;

    public AbstractC7421a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f70001a = name;
    }

    @NotNull
    public final String a() {
        return this.f70001a;
    }
}
