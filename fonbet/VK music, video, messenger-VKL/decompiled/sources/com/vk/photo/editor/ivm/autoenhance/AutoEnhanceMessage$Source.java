package com.vk.photo.editor.ivm.autoenhance;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutoEnhanceMessage.kt */
/* loaded from: classes4.dex */
public final class AutoEnhanceMessage$Source {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AutoEnhanceMessage$Source[] $VALUES;
    public static final AutoEnhanceMessage$Source Synthetic;
    public static final AutoEnhanceMessage$Source UserInput;

    static {
        AutoEnhanceMessage$Source autoEnhanceMessage$Source = new AutoEnhanceMessage$Source("UserInput", 0);
        UserInput = autoEnhanceMessage$Source;
        AutoEnhanceMessage$Source autoEnhanceMessage$Source2 = new AutoEnhanceMessage$Source("Synthetic", 1);
        Synthetic = autoEnhanceMessage$Source2;
        AutoEnhanceMessage$Source[] autoEnhanceMessage$SourceArr = {autoEnhanceMessage$Source, autoEnhanceMessage$Source2};
        $VALUES = autoEnhanceMessage$SourceArr;
        $ENTRIES = new asp(autoEnhanceMessage$SourceArr);
    }

    public AutoEnhanceMessage$Source() {
        throw null;
    }

    public static AutoEnhanceMessage$Source valueOf(String str) {
        return (AutoEnhanceMessage$Source) Enum.valueOf(AutoEnhanceMessage$Source.class, str);
    }

    public static AutoEnhanceMessage$Source[] values() {
        return (AutoEnhanceMessage$Source[]) $VALUES.clone();
    }
}
