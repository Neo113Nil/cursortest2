package com.vk.dto.group;

import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupLeaveMode.kt */
/* loaded from: classes18.dex */
public final class GroupLeaveMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupLeaveMode[] $VALUES;
    public static final a Companion;
    public static final GroupLeaveMode NO_MODE_ALERT;
    public static final GroupLeaveMode OPTIONS_SELECTOR;
    private final String serverName;

    /* compiled from: GroupLeaveMode.kt */
    public static final class a {
        public static GroupLeaveMode a(String str) {
            if (str == null) {
                return null;
            }
            for (GroupLeaveMode groupLeaveMode : GroupLeaveMode.values()) {
                if (epx.f(groupLeaveMode.h(), str)) {
                    return groupLeaveMode;
                }
            }
            return null;
        }
    }

    static {
        GroupLeaveMode groupLeaveMode = new GroupLeaveMode("NO_MODE_ALERT", 0, "admin_leave_alert");
        NO_MODE_ALERT = groupLeaveMode;
        GroupLeaveMode groupLeaveMode2 = new GroupLeaveMode("OPTIONS_SELECTOR", 1, "admin_leave_options");
        OPTIONS_SELECTOR = groupLeaveMode2;
        GroupLeaveMode[] groupLeaveModeArr = {groupLeaveMode, groupLeaveMode2};
        $VALUES = groupLeaveModeArr;
        $ENTRIES = new asp(groupLeaveModeArr);
        Companion = new a();
    }

    public GroupLeaveMode(String str, int i, String str2) {
        this.serverName = str2;
    }

    public static final GroupLeaveMode a(String str) {
        Companion.getClass();
        return a.a(str);
    }

    public static GroupLeaveMode valueOf(String str) {
        return (GroupLeaveMode) Enum.valueOf(GroupLeaveMode.class, str);
    }

    public static GroupLeaveMode[] values() {
        return (GroupLeaveMode[]) $VALUES.clone();
    }

    public final String h() {
        return this.serverName;
    }
}
