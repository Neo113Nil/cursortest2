package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {
    private static final /* synthetic */ i[] $VALUES;
    public static final i HIGH;
    public static final i IMMEDIATE;
    public static final i LOW;
    public static final i NORMAL;

    static {
        i iVar = new i("IMMEDIATE", 0);
        IMMEDIATE = iVar;
        i iVar2 = new i("HIGH", 1);
        HIGH = iVar2;
        i iVar3 = new i("NORMAL", 2);
        NORMAL = iVar3;
        i iVar4 = new i("LOW", 3);
        LOW = iVar4;
        $VALUES = new i[]{iVar, iVar2, iVar3, iVar4};
    }

    private i() {
        throw null;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
