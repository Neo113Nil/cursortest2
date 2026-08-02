package com.vk.profile.community.impl.ui.suggestions.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuggestionVariant.kt */
/* loaded from: classes5.dex */
public final class SuggestionVariant {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SuggestionVariant[] $VALUES;
    public static final SuggestionVariant ON_SUBSCRIBE;
    public static final SuggestionVariant PERMANENT;

    static {
        SuggestionVariant suggestionVariant = new SuggestionVariant("ON_SUBSCRIBE", 0);
        ON_SUBSCRIBE = suggestionVariant;
        SuggestionVariant suggestionVariant2 = new SuggestionVariant("PERMANENT", 1);
        PERMANENT = suggestionVariant2;
        SuggestionVariant[] suggestionVariantArr = {suggestionVariant, suggestionVariant2};
        $VALUES = suggestionVariantArr;
        $ENTRIES = new asp(suggestionVariantArr);
    }

    public SuggestionVariant() {
        throw null;
    }

    public static SuggestionVariant valueOf(String str) {
        return (SuggestionVariant) Enum.valueOf(SuggestionVariant.class, str);
    }

    public static SuggestionVariant[] values() {
        return (SuggestionVariant[]) $VALUES.clone();
    }
}
