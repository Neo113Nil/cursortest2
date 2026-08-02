package r20;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: r20.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9167d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C9165b f82870a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f82871b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<U20.c> f82872c;

    public C9167d(@NotNull C9165b config, @NotNull ArrayList groupProviders, @NotNull List libConfigs) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(groupProviders, "groupProviders");
        Intrinsics.checkNotNullParameter(libConfigs, "libConfigs");
        this.f82870a = config;
        this.f82871b = groupProviders;
        this.f82872c = libConfigs;
    }

    @NotNull
    public final C9165b a() {
        return this.f82870a;
    }

    @NotNull
    public final List<AbstractC9166c> b() {
        return this.f82871b;
    }

    @NotNull
    public final List<U20.c> c() {
        return this.f82872c;
    }
}
