package com.vk.dto.group;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupAgeMark.kt */
/* loaded from: classes18.dex */
public final class GroupAgeMark {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupAgeMark[] $VALUES;
    public static final a Companion;
    public static final GroupAgeMark NO;
    public static final GroupAgeMark OVER_16;
    public static final GroupAgeMark OVER_18;
    private final int serverValue;

    /* compiled from: GroupAgeMark.kt */
    public static final class a {
    }

    static {
        GroupAgeMark groupAgeMark = new GroupAgeMark("NO", 0, 1);
        NO = groupAgeMark;
        GroupAgeMark groupAgeMark2 = new GroupAgeMark("OVER_16", 1, 2);
        OVER_16 = groupAgeMark2;
        GroupAgeMark groupAgeMark3 = new GroupAgeMark("OVER_18", 2, 3);
        OVER_18 = groupAgeMark3;
        GroupAgeMark[] groupAgeMarkArr = {groupAgeMark, groupAgeMark2, groupAgeMark3};
        $VALUES = groupAgeMarkArr;
        $ENTRIES = new asp(groupAgeMarkArr);
        Companion = new a();
    }

    public GroupAgeMark(String str, int i, int i2) {
        this.serverValue = i2;
    }

    public static final GroupAgeMark a(int i) {
        GroupAgeMark groupAgeMark;
        Companion.getClass();
        GroupAgeMark[] values = values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                groupAgeMark = null;
                break;
            }
            groupAgeMark = values[i2];
            if (groupAgeMark.serverValue == i) {
                break;
            }
            i2++;
        }
        return groupAgeMark == null ? NO : groupAgeMark;
    }

    public static GroupAgeMark valueOf(String str) {
        return (GroupAgeMark) Enum.valueOf(GroupAgeMark.class, str);
    }

    public static GroupAgeMark[] values() {
        return (GroupAgeMark[]) $VALUES.clone();
    }
}
