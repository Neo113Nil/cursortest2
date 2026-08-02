package com.vk.im.engine.models.groups;

import xsna.asp;
import xsna.lhg;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupStatus.kt */
/* loaded from: classes2.dex */
public final class GroupStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupStatus[] $VALUES;
    public static final GroupStatus ANSWER_MARK;
    public static final a Companion;
    public static final GroupStatus NONE;
    public static final GroupStatus ONLINE;
    private final int id;

    /* compiled from: GroupStatus.kt */
    public static final class a {
        public static GroupStatus a(int i) {
            if (i == 0) {
                return GroupStatus.NONE;
            }
            if (i == 1) {
                return GroupStatus.ONLINE;
            }
            if (i == 2) {
                return GroupStatus.ANSWER_MARK;
            }
            throw new IllegalArgumentException(lhg.a(i, "Unknown id: "));
        }
    }

    static {
        GroupStatus groupStatus = new GroupStatus("NONE", 0, 0);
        NONE = groupStatus;
        GroupStatus groupStatus2 = new GroupStatus("ONLINE", 1, 1);
        ONLINE = groupStatus2;
        GroupStatus groupStatus3 = new GroupStatus("ANSWER_MARK", 2, 2);
        ANSWER_MARK = groupStatus3;
        GroupStatus[] groupStatusArr = {groupStatus, groupStatus2, groupStatus3};
        $VALUES = groupStatusArr;
        $ENTRIES = new asp(groupStatusArr);
        Companion = new a();
    }

    public GroupStatus(String str, int i, int i2) {
        this.id = i2;
    }

    public static GroupStatus valueOf(String str) {
        return (GroupStatus) Enum.valueOf(GroupStatus.class, str);
    }

    public static GroupStatus[] values() {
        return (GroupStatus[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
