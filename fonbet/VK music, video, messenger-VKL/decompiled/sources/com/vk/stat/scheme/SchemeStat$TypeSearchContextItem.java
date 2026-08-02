package com.vk.stat.scheme;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeSearchContextItem implements SchemeStat$NavigationScreenInfoItem.b {

    @pmi0("object_id")
    private final long objectId;

    @pmi0("object_type")
    private final ObjectType objectType;

    @pmi0(X3.i.L)
    private final int position;

    @pmi0("query")
    private final String query;

    @pmi0("refer")
    private final String refer;

    @pmi0("track_code")
    private final String trackCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class ObjectType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ObjectType[] $VALUES;

        @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
        public static final ObjectType APP;

        @pmi0("group")
        public static final ObjectType GROUP;

        @pmi0("link")
        public static final ObjectType LINK;

        @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
        public static final ObjectType PROFILE;

        @pmi0("unknown")
        public static final ObjectType UNKNOWN;

        @pmi0("user")
        public static final ObjectType USER;

        static {
            ObjectType objectType = new ObjectType("PROFILE", 0);
            PROFILE = objectType;
            ObjectType objectType2 = new ObjectType("USER", 1);
            USER = objectType2;
            ObjectType objectType3 = new ObjectType("GROUP", 2);
            GROUP = objectType3;
            ObjectType objectType4 = new ObjectType("APP", 3);
            APP = objectType4;
            ObjectType objectType5 = new ObjectType("LINK", 4);
            LINK = objectType5;
            ObjectType objectType6 = new ObjectType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5);
            UNKNOWN = objectType6;
            ObjectType[] objectTypeArr = {objectType, objectType2, objectType3, objectType4, objectType5, objectType6};
            $VALUES = objectTypeArr;
            $ENTRIES = new asp(objectTypeArr);
        }

        private ObjectType(String str, int i) {
        }

        public static ObjectType valueOf(String str) {
            return (ObjectType) Enum.valueOf(ObjectType.class, str);
        }

        public static ObjectType[] values() {
            return (ObjectType[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeSearchContextItem(int i, ObjectType objectType, long j, String str, String str2, String str3) {
        this.position = i;
        this.objectType = objectType;
        this.objectId = j;
        this.query = str;
        this.refer = str2;
        this.trackCode = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeSearchContextItem)) {
            return false;
        }
        SchemeStat$TypeSearchContextItem schemeStat$TypeSearchContextItem = (SchemeStat$TypeSearchContextItem) obj;
        return this.position == schemeStat$TypeSearchContextItem.position && this.objectType == schemeStat$TypeSearchContextItem.objectType && this.objectId == schemeStat$TypeSearchContextItem.objectId && epx.f(this.query, schemeStat$TypeSearchContextItem.query) && epx.f(this.refer, schemeStat$TypeSearchContextItem.refer) && epx.f(this.trackCode, schemeStat$TypeSearchContextItem.trackCode);
    }

    public final int hashCode() {
        int a = bh10.a((this.objectType.hashCode() + (Integer.hashCode(this.position) * 31)) * 31, 31, this.objectId);
        String str = this.query;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.refer;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trackCode;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeSearchContextItem(position=");
        sb.append(this.position);
        sb.append(", objectType=");
        sb.append(this.objectType);
        sb.append(", objectId=");
        sb.append(this.objectId);
        sb.append(", query=");
        sb.append(this.query);
        sb.append(", refer=");
        sb.append(this.refer);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    public /* synthetic */ SchemeStat$TypeSearchContextItem(int i, ObjectType objectType, long j, String str, String str2, String str3, int i2, zcl zclVar) {
        this(i, objectType, j, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : str3);
    }
}
