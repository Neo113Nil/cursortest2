package io.appmetrica.analytics.impl;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class H4 implements X6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12302a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12303b;

    public H4(@NotNull Q4 q42) {
        this.f12302a = String.format("component_%s.db", Arrays.copyOf(new Object[]{q42.d() ? "main" : q42.b()}, 1));
        this.f12303b = "db_metrica_" + q42;
    }

    @Override // io.appmetrica.analytics.impl.X6
    @NotNull
    public final String a() {
        return this.f12303b;
    }

    @Override // io.appmetrica.analytics.impl.X6
    @NotNull
    public final String b() {
        return this.f12302a;
    }
}
