package androidx.compose.foundation.text.selection;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlatformSelectionBehaviors.kt */
/* loaded from: classes11.dex */
public final class SelectedTextType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SelectedTextType[] $VALUES;
    public static final SelectedTextType EditableText;
    public static final SelectedTextType StaticText;

    static {
        SelectedTextType selectedTextType = new SelectedTextType("EditableText", 0);
        EditableText = selectedTextType;
        SelectedTextType selectedTextType2 = new SelectedTextType("StaticText", 1);
        StaticText = selectedTextType2;
        SelectedTextType[] selectedTextTypeArr = {selectedTextType, selectedTextType2};
        $VALUES = selectedTextTypeArr;
        $ENTRIES = new asp(selectedTextTypeArr);
    }

    public SelectedTextType() {
        throw null;
    }

    public static SelectedTextType valueOf(String str) {
        return (SelectedTextType) Enum.valueOf(SelectedTextType.class, str);
    }

    public static SelectedTextType[] values() {
        return (SelectedTextType[]) $VALUES.clone();
    }
}
