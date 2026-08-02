package com.vk.core.compose.component.form;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FormField.kt */
/* loaded from: classes17.dex */
public final class FormField$Style {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FormField$Style[] $VALUES;
    public static final FormField$Style Default;
    public static final FormField$Style Error;
    public static final FormField$Style Valid;

    static {
        FormField$Style formField$Style = new FormField$Style("Default", 0);
        Default = formField$Style;
        FormField$Style formField$Style2 = new FormField$Style("Error", 1);
        Error = formField$Style2;
        FormField$Style formField$Style3 = new FormField$Style("Valid", 2);
        Valid = formField$Style3;
        FormField$Style[] formField$StyleArr = {formField$Style, formField$Style2, formField$Style3};
        $VALUES = formField$StyleArr;
        $ENTRIES = new asp(formField$StyleArr);
    }

    public FormField$Style() {
        throw null;
    }

    public static FormField$Style valueOf(String str) {
        return (FormField$Style) Enum.valueOf(FormField$Style.class, str);
    }

    public static FormField$Style[] values() {
        return (FormField$Style[]) $VALUES.clone();
    }
}
