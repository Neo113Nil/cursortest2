package jh0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: jh0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C7429a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f70121a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final b f70122b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final c f70123c;

    public C7429a(@NotNull String token, @NotNull b type, @NotNull c updateTrigger) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(updateTrigger, "updateTrigger");
        this.f70121a = token;
        this.f70122b = type;
        this.f70123c = updateTrigger;
    }

    @NotNull
    public final String a() {
        return this.f70121a;
    }

    @NotNull
    public final b b() {
        return this.f70122b;
    }

    @NotNull
    public final c c() {
        return this.f70123c;
    }

    @NotNull
    public final String toString() {
        return "type: " + this.f70122b + ", token: " + this.f70121a + ", update trigger: " + this.f70123c;
    }
}
