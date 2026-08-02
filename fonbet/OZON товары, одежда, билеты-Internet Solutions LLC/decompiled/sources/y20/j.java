package y20;

import K1.T;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final T f105981a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final T f105982b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final T f105983c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final T f105984d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final T f105985e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final T f105986f;

    public j(@NotNull T headline500, @NotNull T body400, @NotNull T body300, @NotNull T bodyControl400, @NotNull T compact500, @NotNull T compactControl500) {
        Intrinsics.checkNotNullParameter(headline500, "headline500");
        Intrinsics.checkNotNullParameter(body400, "body400");
        Intrinsics.checkNotNullParameter(body300, "body300");
        Intrinsics.checkNotNullParameter(bodyControl400, "bodyControl400");
        Intrinsics.checkNotNullParameter(compact500, "compact500");
        Intrinsics.checkNotNullParameter(compactControl500, "compactControl500");
        this.f105981a = headline500;
        this.f105982b = body400;
        this.f105983c = body300;
        this.f105984d = bodyControl400;
        this.f105985e = compact500;
        this.f105986f = compactControl500;
    }

    @NotNull
    public final T a() {
        return this.f105983c;
    }

    @NotNull
    public final T b() {
        return this.f105982b;
    }

    @NotNull
    public final T c() {
        return this.f105984d;
    }

    @NotNull
    public final T d() {
        return this.f105985e;
    }

    @NotNull
    public final T e() {
        return this.f105986f;
    }

    @NotNull
    public final T f() {
        return this.f105981a;
    }
}
