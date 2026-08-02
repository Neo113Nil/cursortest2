package vj;

import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: vj.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10324a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f102994a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f102995b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f102996c;

    /* renamed from: d, reason: collision with root package name */
    private final int f102997d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f102998e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<String> f102999f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final List<String> f103000g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final List<String> f103001h;

    public C10324a(String appName, String version, String commitHash, int i11) {
        K unsecuredBodyKeys = K.f71697a;
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(commitHash, "commitHash");
        Intrinsics.checkNotNullParameter("har_logger", "databasePath");
        Intrinsics.checkNotNullParameter(unsecuredBodyKeys, "unsecuredCookies");
        Intrinsics.checkNotNullParameter(unsecuredBodyKeys, "unsecuredHeaders");
        Intrinsics.checkNotNullParameter(unsecuredBodyKeys, "unsecuredBodyKeys");
        this.f102994a = appName;
        this.f102995b = version;
        this.f102996c = commitHash;
        this.f102997d = i11;
        this.f102998e = "har_logger";
        this.f102999f = unsecuredBodyKeys;
        this.f103000g = unsecuredBodyKeys;
        this.f103001h = unsecuredBodyKeys;
    }

    @NotNull
    public final String a() {
        return this.f102994a;
    }

    @NotNull
    public final String b() {
        return this.f102996c;
    }

    @NotNull
    public final String c() {
        return this.f102998e;
    }

    public final int d() {
        return this.f102997d;
    }

    @NotNull
    public final List<String> e() {
        return this.f103001h;
    }

    @NotNull
    public final List<String> f() {
        return this.f102999f;
    }

    @NotNull
    public final List<String> g() {
        return this.f103000g;
    }

    @NotNull
    public final String h() {
        return this.f102995b;
    }
}
