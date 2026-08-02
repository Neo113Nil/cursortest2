package com.vk.dto.stickers.images;

import java.util.LinkedHashMap;
import java.util.Map;
import xsna.asp;
import xsna.on00;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageUrlMorpheme.kt */
/* loaded from: classes18.dex */
public final class ModifierType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ModifierType[] $VALUES;
    public static final a Companion;
    public static final ModifierType FORMAT;
    public static final ModifierType IMAGE_ID;
    public static final ModifierType SIZE;
    public static final ModifierType THEME;
    public static final ModifierType VERSION;
    private static final Map<String, ModifierType> map;
    private final String value;

    /* compiled from: ImageUrlMorpheme.kt */
    public static final class a {
    }

    static {
        ModifierType modifierType = new ModifierType("IMAGE_ID", 0, "{image_id}");
        IMAGE_ID = modifierType;
        ModifierType modifierType2 = new ModifierType("SIZE", 1, "{size}");
        SIZE = modifierType2;
        ModifierType modifierType3 = new ModifierType("THEME", 2, "{theme_modifier}");
        THEME = modifierType3;
        ModifierType modifierType4 = new ModifierType("FORMAT", 3, "{format}");
        FORMAT = modifierType4;
        ModifierType modifierType5 = new ModifierType("VERSION", 4, "{version}");
        VERSION = modifierType5;
        ModifierType[] modifierTypeArr = {modifierType, modifierType2, modifierType3, modifierType4, modifierType5};
        $VALUES = modifierTypeArr;
        $ENTRIES = new asp(modifierTypeArr);
        Companion = new a();
        ModifierType[] values = values();
        int e = on00.e(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (ModifierType modifierType6 : values) {
            linkedHashMap.put(modifierType6.value, modifierType6);
        }
        map = linkedHashMap;
    }

    public ModifierType(String str, int i, String str2) {
        this.value = str2;
    }

    public static ModifierType valueOf(String str) {
        return (ModifierType) Enum.valueOf(ModifierType.class, str);
    }

    public static ModifierType[] values() {
        return (ModifierType[]) $VALUES.clone();
    }
}
