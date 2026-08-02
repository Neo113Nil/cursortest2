package com.vk.im.engine.models;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import xsna.asp;
import xsna.bpn0;
import xsna.on00;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ButtonActionType.kt */
/* loaded from: classes2.dex */
public final class ButtonActionType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ButtonActionType[] $VALUES;
    public static final a Companion;
    public static final ButtonActionType JOIN_GROUP_AND_OPEN_URL;
    public static final ButtonActionType OPEN_URL;
    private static final Lazy<Map<Integer, ButtonActionType>> values$delegate;
    private final int typeAsInt;

    /* compiled from: ButtonActionType.kt */
    public static final class a {
    }

    static {
        ButtonActionType buttonActionType = new ButtonActionType("OPEN_URL", 0, 1);
        OPEN_URL = buttonActionType;
        ButtonActionType buttonActionType2 = new ButtonActionType("JOIN_GROUP_AND_OPEN_URL", 1, 2);
        JOIN_GROUP_AND_OPEN_URL = buttonActionType2;
        ButtonActionType[] buttonActionTypeArr = {buttonActionType, buttonActionType2};
        $VALUES = buttonActionTypeArr;
        $ENTRIES = new asp(buttonActionTypeArr);
        Companion = new a();
        values$delegate = new bpn0(new com.vk.movika.sdk.android.defaultplayer.interactive.b(4));
    }

    public ButtonActionType(String str, int i, int i2) {
        this.typeAsInt = i2;
    }

    public static LinkedHashMap h() {
        ButtonActionType[] values = values();
        int e = on00.e(values.length);
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (ButtonActionType buttonActionType : values) {
            linkedHashMap.put(Integer.valueOf(buttonActionType.typeAsInt), buttonActionType);
        }
        return linkedHashMap;
    }

    public static ButtonActionType valueOf(String str) {
        return (ButtonActionType) Enum.valueOf(ButtonActionType.class, str);
    }

    public static ButtonActionType[] values() {
        return (ButtonActionType[]) $VALUES.clone();
    }

    public final int j() {
        return this.typeAsInt;
    }
}
