package com.vk.dto.group;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Iterator;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupContentTabCollectionType.kt */
/* loaded from: classes18.dex */
public final class GroupContentTabCollectionType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GroupContentTabCollectionType[] $VALUES;
    public static final a Companion;
    public static final GroupContentTabCollectionType SCHEDULED;
    public static final GroupContentTabCollectionType UNKNOWN;
    private final String id;

    /* compiled from: GroupContentTabCollectionType.kt */
    public static final class a {
        public static GroupContentTabCollectionType a(String str) {
            Object obj;
            Iterator<E> it = GroupContentTabCollectionType.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((GroupContentTabCollectionType) obj).getId(), str)) {
                    break;
                }
            }
            GroupContentTabCollectionType groupContentTabCollectionType = (GroupContentTabCollectionType) obj;
            return groupContentTabCollectionType == null ? GroupContentTabCollectionType.UNKNOWN : groupContentTabCollectionType;
        }
    }

    static {
        GroupContentTabCollectionType groupContentTabCollectionType = new GroupContentTabCollectionType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, "");
        UNKNOWN = groupContentTabCollectionType;
        GroupContentTabCollectionType groupContentTabCollectionType2 = new GroupContentTabCollectionType("SCHEDULED", 1, "scheduled");
        SCHEDULED = groupContentTabCollectionType2;
        GroupContentTabCollectionType[] groupContentTabCollectionTypeArr = {groupContentTabCollectionType, groupContentTabCollectionType2};
        $VALUES = groupContentTabCollectionTypeArr;
        $ENTRIES = new asp(groupContentTabCollectionTypeArr);
        Companion = new a();
    }

    public GroupContentTabCollectionType(String str, int i, String str2) {
        this.id = str2;
    }

    public static zrp<GroupContentTabCollectionType> h() {
        return $ENTRIES;
    }

    public static GroupContentTabCollectionType valueOf(String str) {
        return (GroupContentTabCollectionType) Enum.valueOf(GroupContentTabCollectionType.class, str);
    }

    public static GroupContentTabCollectionType[] values() {
        return (GroupContentTabCollectionType[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }
}
