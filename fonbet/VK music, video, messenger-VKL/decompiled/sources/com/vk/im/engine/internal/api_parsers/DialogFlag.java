package com.vk.im.engine.internal.api_parsers;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DialogFlag.kt */
/* loaded from: classes2.dex */
public final class DialogFlag {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DialogFlag[] $VALUES;
    public static final DialogFlag ARCHIVED;
    public static final a Companion;
    public static final DialogFlag MARKED_AS_UNREAD;
    public static final DialogFlag PUSH_SETTINGS;
    private static final DialogFlag[] values;
    private final int mask;

    /* compiled from: DialogFlag.kt */
    public static final class a {
        public static List a(int i) {
            if (i == 0) {
                return EmptyList.b;
            }
            DialogFlag[] dialogFlagArr = DialogFlag.values;
            ArrayList arrayList = new ArrayList();
            for (DialogFlag dialogFlag : dialogFlagArr) {
                if (dialogFlag.i(i)) {
                    arrayList.add(dialogFlag);
                }
            }
            return arrayList;
        }
    }

    static {
        DialogFlag dialogFlag = new DialogFlag("PUSH_SETTINGS", 0, 4);
        PUSH_SETTINGS = dialogFlag;
        DialogFlag dialogFlag2 = new DialogFlag("MARKED_AS_UNREAD", 1, 20);
        MARKED_AS_UNREAD = dialogFlag2;
        DialogFlag dialogFlag3 = new DialogFlag("ARCHIVED", 2, 23);
        ARCHIVED = dialogFlag3;
        DialogFlag[] dialogFlagArr = {dialogFlag, dialogFlag2, dialogFlag3};
        $VALUES = dialogFlagArr;
        $ENTRIES = new asp(dialogFlagArr);
        Companion = new a();
        values = values();
    }

    public DialogFlag(String str, int i, int i2) {
        this.mask = 1 << i2;
    }

    public static DialogFlag valueOf(String str) {
        return (DialogFlag) Enum.valueOf(DialogFlag.class, str);
    }

    public static DialogFlag[] values() {
        return (DialogFlag[]) $VALUES.clone();
    }

    public final boolean i(int i) {
        return (i & this.mask) != 0;
    }
}
