package com.vk.toggle.data;

import com.unity3d.ads.BuildConfig;
import java.util.Iterator;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoNotificationRedesignConfig.kt */
/* loaded from: classes6.dex */
public final class GroupType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupType[] $VALUES;
    public static final GroupType BY_OWNER;
    public static final GroupType BY_TYPE;
    public static final a Companion;
    public static final GroupType DEFAULT;
    public static final GroupType NO_GROUP;
    private final String groupType;

    /* compiled from: VideoNotificationRedesignConfig.kt */
    public static final class a {
        public static GroupType a(String str) {
            Object obj;
            Iterator<E> it = GroupType.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((GroupType) obj).i(), str)) {
                    break;
                }
            }
            GroupType groupType = (GroupType) obj;
            return groupType == null ? GroupType.DEFAULT : groupType;
        }
    }

    static {
        GroupType groupType = new GroupType("DEFAULT", 0, BuildConfig.FLAVOR);
        DEFAULT = groupType;
        GroupType groupType2 = new GroupType("BY_OWNER", 1, "by_owner");
        BY_OWNER = groupType2;
        GroupType groupType3 = new GroupType("BY_TYPE", 2, "by_type");
        BY_TYPE = groupType3;
        GroupType groupType4 = new GroupType("NO_GROUP", 3, "no_group");
        NO_GROUP = groupType4;
        GroupType[] groupTypeArr = {groupType, groupType2, groupType3, groupType4};
        $VALUES = groupTypeArr;
        $ENTRIES = new asp(groupTypeArr);
        Companion = new a();
    }

    public GroupType(String str, int i, String str2) {
        this.groupType = str2;
    }

    public static zrp<GroupType> h() {
        return $ENTRIES;
    }

    public static GroupType valueOf(String str) {
        return (GroupType) Enum.valueOf(GroupType.class, str);
    }

    public static GroupType[] values() {
        return (GroupType[]) $VALUES.clone();
    }

    public final String i() {
        return this.groupType;
    }
}
