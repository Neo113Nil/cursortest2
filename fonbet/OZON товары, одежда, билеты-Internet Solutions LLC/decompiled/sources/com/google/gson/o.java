package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class o {
    private static final /* synthetic */ o[] $VALUES;
    public static final o DEFAULT;
    public static final o STRING;

    static {
        o oVar = new o() { // from class: com.google.gson.o.a
        };
        DEFAULT = oVar;
        o oVar2 = new o() { // from class: com.google.gson.o.b
        };
        STRING = oVar2;
        $VALUES = new o[]{oVar, oVar2};
    }

    private o() {
        throw null;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
