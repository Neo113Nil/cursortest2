package com.google.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class G {
    private static final /* synthetic */ G[] $VALUES;
    public static final G EDITIONS;
    public static final G PROTO2;
    public static final G PROTO3;

    static {
        G g10 = new G("PROTO2", 0);
        PROTO2 = g10;
        G g11 = new G("PROTO3", 1);
        PROTO3 = g11;
        G g12 = new G("EDITIONS", 2);
        EDITIONS = g12;
        $VALUES = new G[]{g10, g11, g12};
    }

    private G() {
        throw null;
    }

    public static G valueOf(String str) {
        return (G) java.lang.Enum.valueOf(G.class, str);
    }

    public static G[] values() {
        return (G[]) $VALUES.clone();
    }
}
