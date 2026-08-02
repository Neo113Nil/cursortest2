package vl0;

import org.jetbrains.annotations.NotNull;

/* renamed from: vl0.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC10328b {
    KOTLIN("kotlin"),
    UNITY("unity"),
    FLUTTER("flutter"),
    UNREAL_ENGINE("unreal-engine"),
    GODOT("godot"),
    REACT_NATIVE("react-native"),
    CONSTRUCT("construct"),
    DEFOLD("defold");


    @NotNull
    public static final a Companion = new a();

    @NotNull
    private static final String KEY = "type";

    @NotNull
    private final String value;

    /* renamed from: vl0.b$a */
    public static final class a {
    }

    EnumC10328b(String str) {
        this.value = str;
    }

    @NotNull
    public final String a() {
        return this.value;
    }
}
