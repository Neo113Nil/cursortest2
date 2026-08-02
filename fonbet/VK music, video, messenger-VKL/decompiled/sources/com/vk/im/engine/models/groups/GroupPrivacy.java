package com.vk.im.engine.models.groups;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import xsna.asp;
import xsna.bpn0;
import xsna.f20;
import xsna.lhg;
import xsna.on00;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupPrivacy.kt */
/* loaded from: classes2.dex */
public final class GroupPrivacy {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupPrivacy[] $VALUES;
    public static final GroupPrivacy CLOSED;
    public static final a Companion;
    public static final GroupPrivacy OPEN;
    public static final GroupPrivacy PRIVATE;
    private static final Lazy<Map<Integer, GroupPrivacy>> values$delegate;
    private final int type;

    /* compiled from: GroupPrivacy.kt */
    public static final class a {
        public static GroupPrivacy a(int i) {
            Object obj = ((Map) GroupPrivacy.values$delegate.getValue()).get(Integer.valueOf(i));
            if (obj != null) {
                return (GroupPrivacy) obj;
            }
            throw new IllegalArgumentException(lhg.a(i, "Unknown type: ").toString());
        }
    }

    static {
        GroupPrivacy groupPrivacy = new GroupPrivacy("OPEN", 0, 0);
        OPEN = groupPrivacy;
        GroupPrivacy groupPrivacy2 = new GroupPrivacy("CLOSED", 1, 1);
        CLOSED = groupPrivacy2;
        GroupPrivacy groupPrivacy3 = new GroupPrivacy("PRIVATE", 2, 2);
        PRIVATE = groupPrivacy3;
        GroupPrivacy[] groupPrivacyArr = {groupPrivacy, groupPrivacy2, groupPrivacy3};
        $VALUES = groupPrivacyArr;
        $ENTRIES = new asp(groupPrivacyArr);
        Companion = new a();
        values$delegate = new bpn0(new f20(18));
    }

    public GroupPrivacy(String str, int i, int i2) {
        this.type = i2;
    }

    public static LinkedHashMap h() {
        GroupPrivacy[] values = values();
        int e = on00.e(values.length);
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (GroupPrivacy groupPrivacy : values) {
            linkedHashMap.put(Integer.valueOf(groupPrivacy.type), groupPrivacy);
        }
        return linkedHashMap;
    }

    public static GroupPrivacy valueOf(String str) {
        return (GroupPrivacy) Enum.valueOf(GroupPrivacy.class, str);
    }

    public static GroupPrivacy[] values() {
        return (GroupPrivacy[]) $VALUES.clone();
    }

    public final int j() {
        return this.type;
    }
}
