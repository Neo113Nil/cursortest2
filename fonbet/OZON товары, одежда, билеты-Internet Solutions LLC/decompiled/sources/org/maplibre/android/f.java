package org.maplibre.android;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final f MapLibre;
    public static final f MapTiler;
    public static final f Mapbox;

    static {
        f fVar = new f("Mapbox", 0);
        Mapbox = fVar;
        f fVar2 = new f("MapTiler", 1);
        MapTiler = fVar2;
        f fVar3 = new f("MapLibre", 2);
        MapLibre = fVar3;
        $VALUES = new f[]{fVar, fVar2, fVar3};
    }

    private f() {
        throw null;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
