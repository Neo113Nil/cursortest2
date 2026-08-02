package com.usercentrics.sdk.models.settings;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PredefinedUIData.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/usercentrics/sdk/models/settings/PredefinedUIVariant;", "", "(Ljava/lang/String;I)V", "SECOND_LAYER", "FULL", "SHEET", "POPUP_CENTER", "POPUP_BOTTOM", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PredefinedUIVariant {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PredefinedUIVariant[] $VALUES;
    public static final PredefinedUIVariant SECOND_LAYER = new PredefinedUIVariant("SECOND_LAYER", 0);
    public static final PredefinedUIVariant FULL = new PredefinedUIVariant("FULL", 1);
    public static final PredefinedUIVariant SHEET = new PredefinedUIVariant("SHEET", 2);
    public static final PredefinedUIVariant POPUP_CENTER = new PredefinedUIVariant("POPUP_CENTER", 3);
    public static final PredefinedUIVariant POPUP_BOTTOM = new PredefinedUIVariant("POPUP_BOTTOM", 4);

    private static final /* synthetic */ PredefinedUIVariant[] $values() {
        return new PredefinedUIVariant[]{SECOND_LAYER, FULL, SHEET, POPUP_CENTER, POPUP_BOTTOM};
    }

    public static EnumEntries<PredefinedUIVariant> getEntries() {
        return $ENTRIES;
    }

    public static PredefinedUIVariant valueOf(String str) {
        return (PredefinedUIVariant) Enum.valueOf(PredefinedUIVariant.class, str);
    }

    public static PredefinedUIVariant[] values() {
        return (PredefinedUIVariant[]) $VALUES.clone();
    }

    private PredefinedUIVariant(String str, int i) {
    }

    static {
        PredefinedUIVariant[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
