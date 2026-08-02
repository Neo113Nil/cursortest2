package com.vk.im.engine.models.groups;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import xsna.asp;
import xsna.bpn0;
import xsna.lhg;
import xsna.on00;
import xsna.pr0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupType.kt */
/* loaded from: classes2.dex */
public final class GroupType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupType[] $VALUES;
    public static final a Companion;
    public static final GroupType EVENT;
    public static final GroupType GROUP;
    public static final GroupType PAGE;
    private static final Lazy<Map<Integer, GroupType>> values$delegate;
    private final int type;

    /* compiled from: GroupType.kt */
    public static final class a {
        public static GroupType a(int i) {
            Object obj = ((Map) GroupType.values$delegate.getValue()).get(Integer.valueOf(i));
            if (obj != null) {
                return (GroupType) obj;
            }
            throw new IllegalArgumentException(lhg.a(i, "Unknown type: ").toString());
        }
    }

    static {
        GroupType groupType = new GroupType("GROUP", 0, 1);
        GROUP = groupType;
        GroupType groupType2 = new GroupType("PAGE", 1, 2);
        PAGE = groupType2;
        GroupType groupType3 = new GroupType("EVENT", 2, 3);
        EVENT = groupType3;
        GroupType[] groupTypeArr = {groupType, groupType2, groupType3};
        $VALUES = groupTypeArr;
        $ENTRIES = new asp(groupTypeArr);
        Companion = new a();
        values$delegate = new bpn0(new pr0(16));
    }

    public GroupType(String str, int i, int i2) {
        this.type = i2;
    }

    public static LinkedHashMap h() {
        GroupType[] values = values();
        int e = on00.e(values.length);
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (GroupType groupType : values) {
            linkedHashMap.put(Integer.valueOf(groupType.type), groupType);
        }
        return linkedHashMap;
    }

    public static GroupType valueOf(String str) {
        return (GroupType) Enum.valueOf(GroupType.class, str);
    }

    public static GroupType[] values() {
        return (GroupType[]) $VALUES.clone();
    }

    public final int j() {
        return this.type;
    }
}
