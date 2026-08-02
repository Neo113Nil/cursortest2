package org.maplibre.android.style.sources;

import Sc.InterfaceC3999a;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private String f79991a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String[] f79992b;

    /* renamed from: c, reason: collision with root package name */
    public Float f79993c;

    /* renamed from: d, reason: collision with root package name */
    public Float f79994d;

    /* renamed from: e, reason: collision with root package name */
    private Float[] f79995e;

    public b(@NotNull String... tiles) {
        Intrinsics.checkNotNullParameter("2.1.0", "tilejson");
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        this.f79992b = (String[]) Arrays.copyOf(tiles, tiles.length);
    }

    @InterfaceC3999a
    public final void a(@NotNull Float[] bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.f79995e = bounds;
    }

    public final void b() {
        this.f79991a = "xyz";
    }

    @NotNull
    public final HashMap c() {
        HashMap hashMap = new HashMap();
        hashMap.put("tilejson", "2.1.0");
        hashMap.put("tiles", this.f79992b);
        String str = this.f79991a;
        if (str != null) {
            hashMap.put("scheme", str);
        }
        Float f7 = this.f79993c;
        if (f7 != null) {
            hashMap.put("minzoom", f7);
        }
        Float f11 = this.f79994d;
        if (f11 != null) {
            hashMap.put("maxzoom", f11);
        }
        Float[] fArr = this.f79995e;
        if (fArr != null) {
            hashMap.put("bounds", fArr);
        }
        return hashMap;
    }
}
