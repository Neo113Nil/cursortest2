package oi0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c implements InterfaceC8743a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f78386a;

    /* renamed from: b, reason: collision with root package name */
    private final int f78387b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f78388c;

    public c(@NotNull String field, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(field, "field");
        this.f78386a = field;
        this.f78387b = i11;
        this.f78388c = z11;
    }

    public final int a() {
        return this.f78387b;
    }

    @NotNull
    public final String b() {
        return this.f78386a;
    }

    public final boolean c() {
        return this.f78388c;
    }
}
