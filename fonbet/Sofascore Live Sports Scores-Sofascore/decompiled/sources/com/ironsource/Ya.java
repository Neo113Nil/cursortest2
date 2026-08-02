package com.ironsource;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ya {

    @Nullable
    private final C4070f6 a;

    @Nullable
    private final C4070f6 b;

    @Nullable
    private final C4406y2 c;

    @NotNull
    private final Map<String, Ad> d;

    public Ya(@Nullable C4070f6 c4070f6, @Nullable C4070f6 c4070f62, @Nullable C4406y2 c4406y2, @NotNull Map<String, Ad> map) {
        map.getClass();
        this.a = c4070f6;
        this.b = c4070f62;
        this.c = c4406y2;
        this.d = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Ya a(Ya ya, C4070f6 c4070f6, C4070f6 c4070f62, C4406y2 c4406y2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            c4070f6 = ya.a;
        }
        if ((i & 2) != 0) {
            c4070f62 = ya.b;
        }
        if ((i & 4) != 0) {
            c4406y2 = ya.c;
        }
        if ((i & 8) != 0) {
            map = ya.d;
        }
        return ya.a(c4070f6, c4070f62, c4406y2, map);
    }

    @Nullable
    public final C4070f6 b() {
        return this.b;
    }

    @Nullable
    public final C4406y2 c() {
        return this.c;
    }

    @NotNull
    public final Map<String, Ad> d() {
        return this.d;
    }

    @Nullable
    public final C4406y2 e() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ya)) {
            return false;
        }
        Ya ya = (Ya) obj;
        return Intrinsics.c(this.a, ya.a) && Intrinsics.c(this.b, ya.b) && Intrinsics.c(this.c, ya.c) && Intrinsics.c(this.d, ya.d);
    }

    @Nullable
    public final C4070f6 f() {
        return this.b;
    }

    @NotNull
    public final Map<String, Ad> g() {
        return this.d;
    }

    @Nullable
    public final C4070f6 h() {
        return this.a;
    }

    public int hashCode() {
        C4070f6 c4070f6 = this.a;
        int hashCode = (c4070f6 == null ? 0 : c4070f6.hashCode()) * 31;
        C4070f6 c4070f62 = this.b;
        int hashCode2 = (hashCode + (c4070f62 == null ? 0 : c4070f62.hashCode())) * 31;
        C4406y2 c4406y2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (c4406y2 != null ? c4406y2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "LevelPlayInitConfig2(rewarded=" + this.a + ", interstitial=" + this.b + ", banner=" + this.c + ", providerConfig=" + this.d + ")";
    }

    @NotNull
    public final Ya a(@Nullable C4070f6 c4070f6, @Nullable C4070f6 c4070f62, @Nullable C4406y2 c4406y2, @NotNull Map<String, Ad> map) {
        map.getClass();
        return new Ya(c4070f6, c4070f62, c4406y2, map);
    }

    @Nullable
    public final C4070f6 a() {
        return this.a;
    }
}
