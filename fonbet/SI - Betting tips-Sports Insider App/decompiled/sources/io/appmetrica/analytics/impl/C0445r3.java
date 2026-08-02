package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.r3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0445r3 implements T7 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f14541a;

    /* renamed from: b, reason: collision with root package name */
    public final S7 f14542b;

    public C0445r3(@Nullable Map<String, String> map, @NotNull S7 s72) {
        this.f14541a = map;
        this.f14542b = s72;
    }

    @NotNull
    public final C0445r3 a(@Nullable Map<String, String> map, @NotNull S7 s72) {
        return new C0445r3(map, s72);
    }

    @Nullable
    public final Map<String, String> b() {
        return this.f14541a;
    }

    @NotNull
    public final S7 c() {
        return this.f14542b;
    }

    @Nullable
    public final Map<String, String> d() {
        return this.f14541a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0445r3)) {
            return false;
        }
        C0445r3 c0445r3 = (C0445r3) obj;
        return Intrinsics.areEqual(this.f14541a, c0445r3.f14541a) && this.f14542b == c0445r3.f14542b;
    }

    public final int hashCode() {
        Map map = this.f14541a;
        return this.f14542b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "Candidate(clids=" + this.f14541a + ", source=" + this.f14542b + ')';
    }

    public static C0445r3 a(C0445r3 c0445r3, Map map, S7 s72, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            map = c0445r3.f14541a;
        }
        if ((i5 & 2) != 0) {
            s72 = c0445r3.f14542b;
        }
        c0445r3.getClass();
        return new C0445r3(map, s72);
    }

    @Override // io.appmetrica.analytics.impl.T7
    @NotNull
    public final S7 a() {
        return this.f14542b;
    }
}
