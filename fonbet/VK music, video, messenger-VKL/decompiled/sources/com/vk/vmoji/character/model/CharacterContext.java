package com.vk.vmoji.character.model;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CharacterContext.kt */
/* loaded from: classes7.dex */
public final class CharacterContext {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CharacterContext[] $VALUES;
    public static final a Companion;
    public static final CharacterContext MY_CHARACTER;
    public static final CharacterContext OTHER_CHARACTER;
    public static final CharacterContext UNKNOWN;
    private final String typeName;

    /* compiled from: CharacterContext.kt */
    public static final class a {
    }

    static {
        CharacterContext characterContext = new CharacterContext("MY_CHARACTER", 0, "my_character");
        MY_CHARACTER = characterContext;
        CharacterContext characterContext2 = new CharacterContext("OTHER_CHARACTER", 1, "other_character");
        OTHER_CHARACTER = characterContext2;
        CharacterContext characterContext3 = new CharacterContext(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2, "unknown");
        UNKNOWN = characterContext3;
        CharacterContext[] characterContextArr = {characterContext, characterContext2, characterContext3};
        $VALUES = characterContextArr;
        $ENTRIES = new asp(characterContextArr);
        Companion = new a();
    }

    public CharacterContext(String str, int i, String str2) {
        this.typeName = str2;
    }

    public static CharacterContext valueOf(String str) {
        return (CharacterContext) Enum.valueOf(CharacterContext.class, str);
    }

    public static CharacterContext[] values() {
        return (CharacterContext[]) $VALUES.clone();
    }

    public final String h() {
        return this.typeName;
    }
}
