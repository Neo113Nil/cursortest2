package androidx.compose.material3.internal;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TextFieldImpl.kt */
/* loaded from: classes11.dex */
public final class TextFieldType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ TextFieldType[] $VALUES;
    public static final TextFieldType Filled;
    public static final TextFieldType Outlined;

    static {
        TextFieldType textFieldType = new TextFieldType("Filled", 0);
        Filled = textFieldType;
        TextFieldType textFieldType2 = new TextFieldType("Outlined", 1);
        Outlined = textFieldType2;
        TextFieldType[] textFieldTypeArr = {textFieldType, textFieldType2};
        $VALUES = textFieldTypeArr;
        $ENTRIES = new asp(textFieldTypeArr);
    }

    public TextFieldType() {
        throw null;
    }

    public static TextFieldType valueOf(String str) {
        return (TextFieldType) Enum.valueOf(TextFieldType.class, str);
    }

    public static TextFieldType[] values() {
        return (TextFieldType[]) $VALUES.clone();
    }
}
