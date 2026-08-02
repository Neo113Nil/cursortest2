package com.vk.superapp.api.dto.geo.common;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Language.kt */
/* loaded from: classes6.dex */
public final class Language {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Language[] $VALUES;

    @pmi0("en-EN")
    public static final Language EN;

    @pmi0("ru-RU")
    public static final Language RU;

    static {
        Language language = new Language("RU", 0);
        RU = language;
        Language language2 = new Language("EN", 1);
        EN = language2;
        Language[] languageArr = {language, language2};
        $VALUES = languageArr;
        $ENTRIES = new asp(languageArr);
    }

    private Language(String str, int i) {
    }

    public static Language valueOf(String str) {
        return (Language) Enum.valueOf(Language.class, str);
    }

    public static Language[] values() {
        return (Language[]) $VALUES.clone();
    }
}
