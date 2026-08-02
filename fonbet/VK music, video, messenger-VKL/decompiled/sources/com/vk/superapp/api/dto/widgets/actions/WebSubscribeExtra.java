package com.vk.superapp.api.dto.widgets.actions;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import xsna.asp;
import xsna.qoy;
import xsna.zrp;

/* compiled from: WebSubscribeExtra.kt */
/* loaded from: classes6.dex */
public final class WebSubscribeExtra implements Parcelable {
    public static final a CREATOR = new a();
    public final WebSubscribeObjectType b;
    public final GroupType c;
    public boolean d;
    public MemberStatus e;
    public final GroupClosedType f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WebSubscribeExtra.kt */
    public static final class GroupClosedType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ GroupClosedType[] $VALUES;
        public static final GroupClosedType CLOSED;
        public static final GroupClosedType OPEN;
        public static final GroupClosedType PRIVATE;

        static {
            GroupClosedType groupClosedType = new GroupClosedType("OPEN", 0);
            OPEN = groupClosedType;
            GroupClosedType groupClosedType2 = new GroupClosedType("CLOSED", 1);
            CLOSED = groupClosedType2;
            GroupClosedType groupClosedType3 = new GroupClosedType("PRIVATE", 2);
            PRIVATE = groupClosedType3;
            GroupClosedType[] groupClosedTypeArr = {groupClosedType, groupClosedType2, groupClosedType3};
            $VALUES = groupClosedTypeArr;
            $ENTRIES = new asp(groupClosedTypeArr);
        }

        public GroupClosedType() {
            throw null;
        }

        public static GroupClosedType valueOf(String str) {
            return (GroupClosedType) Enum.valueOf(GroupClosedType.class, str);
        }

        public static GroupClosedType[] values() {
            return (GroupClosedType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WebSubscribeExtra.kt */
    public static final class GroupType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ GroupType[] $VALUES;
        public static final GroupType EVENT;
        public static final GroupType GROUP;
        public static final GroupType PAGE;

        static {
            GroupType groupType = new GroupType("GROUP", 0);
            GROUP = groupType;
            GroupType groupType2 = new GroupType("PAGE", 1);
            PAGE = groupType2;
            GroupType groupType3 = new GroupType("EVENT", 2);
            EVENT = groupType3;
            GroupType[] groupTypeArr = {groupType, groupType2, groupType3};
            $VALUES = groupTypeArr;
            $ENTRIES = new asp(groupTypeArr);
        }

        public GroupType() {
            throw null;
        }

        public static GroupType valueOf(String str) {
            return (GroupType) Enum.valueOf(GroupType.class, str);
        }

        public static GroupType[] values() {
            return (GroupType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WebSubscribeExtra.kt */
    public static final class MemberStatus {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MemberStatus[] $VALUES;
        public static final MemberStatus DECLINED;
        public static final MemberStatus HAS_SENT_A_REQUEST;
        public static final MemberStatus INVITED;
        public static final MemberStatus MEMBER;
        public static final MemberStatus NOT_A_MEMBER;
        public static final MemberStatus NOT_SURE;

        static {
            MemberStatus memberStatus = new MemberStatus("NOT_A_MEMBER", 0);
            NOT_A_MEMBER = memberStatus;
            MemberStatus memberStatus2 = new MemberStatus("MEMBER", 1);
            MEMBER = memberStatus2;
            MemberStatus memberStatus3 = new MemberStatus("NOT_SURE", 2);
            NOT_SURE = memberStatus3;
            MemberStatus memberStatus4 = new MemberStatus("DECLINED", 3);
            DECLINED = memberStatus4;
            MemberStatus memberStatus5 = new MemberStatus("HAS_SENT_A_REQUEST", 4);
            HAS_SENT_A_REQUEST = memberStatus5;
            MemberStatus memberStatus6 = new MemberStatus("INVITED", 5);
            INVITED = memberStatus6;
            MemberStatus[] memberStatusArr = {memberStatus, memberStatus2, memberStatus3, memberStatus4, memberStatus5, memberStatus6};
            $VALUES = memberStatusArr;
            $ENTRIES = new asp(memberStatusArr);
        }

        public MemberStatus() {
            throw null;
        }

        public static MemberStatus valueOf(String str) {
            return (MemberStatus) Enum.valueOf(MemberStatus.class, str);
        }

        public static MemberStatus[] values() {
            return (MemberStatus[]) $VALUES.clone();
        }
    }

    /* compiled from: WebSubscribeExtra.kt */
    public static final class a implements Parcelable.Creator<WebSubscribeExtra> {
        @Override // android.os.Parcelable.Creator
        public final WebSubscribeExtra createFromParcel(Parcel parcel) {
            return new WebSubscribeExtra(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WebSubscribeExtra[] newArray(int i) {
            return new WebSubscribeExtra[i];
        }
    }

    public WebSubscribeExtra(WebSubscribeObjectType webSubscribeObjectType, GroupType groupType, boolean z, MemberStatus memberStatus, GroupClosedType groupClosedType) {
        this.b = webSubscribeObjectType;
        this.c = groupType;
        this.d = z;
        this.e = memberStatus;
        this.f = groupClosedType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSubscribeExtra)) {
            return false;
        }
        WebSubscribeExtra webSubscribeExtra = (WebSubscribeExtra) obj;
        return this.b == webSubscribeExtra.b && this.c == webSubscribeExtra.c && this.d == webSubscribeExtra.d && this.e == webSubscribeExtra.e && this.f == webSubscribeExtra.f;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        GroupType groupType = this.c;
        int b = qoy.b((hashCode + (groupType == null ? 0 : groupType.hashCode())) * 31, 31, this.d);
        MemberStatus memberStatus = this.e;
        int hashCode2 = (b + (memberStatus == null ? 0 : memberStatus.hashCode())) * 31;
        GroupClosedType groupClosedType = this.f;
        return hashCode2 + (groupClosedType != null ? groupClosedType.hashCode() : 0);
    }

    public final String toString() {
        return "WebSubscribeExtra(objectType=" + this.b + ", type=" + this.c + ", isMember=" + this.d + ", memberStatus=" + this.e + ", closedType=" + this.f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        GroupType groupType = this.c;
        parcel.writeString(groupType != null ? groupType.name() : null);
        parcel.writeInt(this.d ? 1 : 0);
        MemberStatus memberStatus = this.e;
        parcel.writeString(memberStatus != null ? memberStatus.name() : null);
        GroupClosedType groupClosedType = this.f;
        parcel.writeString(groupClosedType != null ? groupClosedType.name() : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WebSubscribeExtra(Parcel parcel) {
        this(r4, r5, r6, r7, (GroupClosedType) r2);
        Object obj;
        Enum valueOf;
        String readString;
        Enum valueOf2;
        String readString2;
        String readString3 = parcel.readString();
        Object obj2 = WebSubscribeObjectType.GROUP;
        Enum r2 = null;
        if (readString3 != null) {
            try {
                obj = Enum.valueOf(WebSubscribeObjectType.class, readString3.toUpperCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            if (obj != null) {
                obj2 = obj;
            }
        }
        WebSubscribeObjectType webSubscribeObjectType = (WebSubscribeObjectType) obj2;
        String readString4 = parcel.readString();
        if (readString4 != null) {
            try {
                valueOf = Enum.valueOf(GroupType.class, readString4.toUpperCase(Locale.US));
            } catch (IllegalArgumentException unused2) {
            }
            GroupType groupType = (GroupType) valueOf;
            boolean z = parcel.readInt() == 0;
            readString = parcel.readString();
            if (readString != null) {
                try {
                    valueOf2 = Enum.valueOf(MemberStatus.class, readString.toUpperCase(Locale.US));
                } catch (IllegalArgumentException unused3) {
                }
                MemberStatus memberStatus = (MemberStatus) valueOf2;
                readString2 = parcel.readString();
                if (readString2 != null) {
                    try {
                        r2 = Enum.valueOf(GroupClosedType.class, readString2.toUpperCase(Locale.US));
                    } catch (IllegalArgumentException unused4) {
                    }
                }
            }
            valueOf2 = null;
            MemberStatus memberStatus2 = (MemberStatus) valueOf2;
            readString2 = parcel.readString();
            if (readString2 != null) {
            }
        }
        valueOf = null;
        GroupType groupType2 = (GroupType) valueOf;
        boolean z2 = parcel.readInt() == 0;
        readString = parcel.readString();
        if (readString != null) {
        }
        valueOf2 = null;
        MemberStatus memberStatus22 = (MemberStatus) valueOf2;
        readString2 = parcel.readString();
        if (readString2 != null) {
        }
    }
}
