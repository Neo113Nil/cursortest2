package oi0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b implements InterfaceC8743a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f78384a;

    /* renamed from: b, reason: collision with root package name */
    private final int f78385b;

    public b(@NotNull String field, int i11) {
        Intrinsics.checkNotNullParameter(field, "field");
        this.f78384a = field;
        this.f78385b = i11;
    }

    public final int a() {
        return this.f78385b;
    }

    @NotNull
    public final String b() {
        return this.f78384a;
    }
}
