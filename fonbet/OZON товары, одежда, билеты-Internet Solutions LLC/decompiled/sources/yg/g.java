package yg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f106609a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f106610b;

    /* renamed from: c, reason: collision with root package name */
    private final h f106611c;

    public g(@NotNull String url, h hVar) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter("POST", "method");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f106609a = "POST";
        this.f106610b = url;
        this.f106611c = hVar;
    }

    public final h a() {
        return this.f106611c;
    }

    @NotNull
    public final String b() {
        return this.f106609a;
    }

    @NotNull
    public final String c() {
        return this.f106610b;
    }
}
