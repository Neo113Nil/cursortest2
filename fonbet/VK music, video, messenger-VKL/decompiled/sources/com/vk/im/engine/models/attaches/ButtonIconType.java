package com.vk.im.engine.models.attaches;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import xsna.asp;
import xsna.bpn0;
import xsna.g13;
import xsna.on00;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ButtonIconType.kt */
/* loaded from: classes2.dex */
public final class ButtonIconType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ButtonIconType[] $VALUES;
    public static final a Companion;
    public static final ButtonIconType NONE;
    public static final ButtonIconType PLAY;
    private static final Lazy<Map<Integer, ButtonIconType>> values$delegate;
    private final int typeAsInt;

    /* compiled from: ButtonIconType.kt */
    public static final class a {
    }

    static {
        ButtonIconType buttonIconType = new ButtonIconType("NONE", 0, 1);
        NONE = buttonIconType;
        ButtonIconType buttonIconType2 = new ButtonIconType("PLAY", 1, 2);
        PLAY = buttonIconType2;
        ButtonIconType[] buttonIconTypeArr = {buttonIconType, buttonIconType2};
        $VALUES = buttonIconTypeArr;
        $ENTRIES = new asp(buttonIconTypeArr);
        Companion = new a();
        values$delegate = new bpn0(new g13(2));
    }

    public ButtonIconType(String str, int i, int i2) {
        this.typeAsInt = i2;
    }

    public static LinkedHashMap h() {
        ButtonIconType[] values = values();
        int e = on00.e(values.length);
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (ButtonIconType buttonIconType : values) {
            linkedHashMap.put(Integer.valueOf(buttonIconType.typeAsInt), buttonIconType);
        }
        return linkedHashMap;
    }

    public static ButtonIconType valueOf(String str) {
        return (ButtonIconType) Enum.valueOf(ButtonIconType.class, str);
    }

    public static ButtonIconType[] values() {
        return (ButtonIconType[]) $VALUES.clone();
    }

    public final int j() {
        return this.typeAsInt;
    }
}
