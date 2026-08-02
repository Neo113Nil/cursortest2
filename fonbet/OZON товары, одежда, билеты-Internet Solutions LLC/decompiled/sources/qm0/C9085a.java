package qm0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: qm0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9085a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private String f82275a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private String f82276b;

    public C9085a(@NotNull String url, @NotNull String apiKey) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f82275a = url;
        this.f82276b = apiKey;
    }

    @NotNull
    public final String a() {
        return this.f82276b;
    }

    @NotNull
    public final String b() {
        return this.f82275a;
    }
}
