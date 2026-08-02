package com.vk.superapp.vkclient.js.bridge.api.events;

import com.google.gson.JsonParseException;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.bd6;
import xsna.epx;
import xsna.hay;
import xsna.ho8;
import xsna.ms9;
import xsna.pmi0;
import xsna.tay;
import xsna.uay;
import xsna.uqi;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GetGroupInfo.kt */
/* loaded from: classes6.dex */
public final class GetGroupInfo$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    /* compiled from: GetGroupInfo.kt */
    public static abstract class Data {

        @pmi0(CommonUrlParts.REQUEST_ID)
        private String requestId;

        /* compiled from: GetGroupInfo.kt */
        public static final class GroupValue extends Data {

            @pmi0("group")
            private final Group group;

            public GroupValue(Group group) {
                super(null);
                this.group = group;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GroupValue) && epx.f(this.group, ((GroupValue) obj).group);
            }

            public final int hashCode() {
                return this.group.hashCode();
            }

            public final String toString() {
                return "GroupValue(group=" + this.group + ')';
            }
        }

        /* compiled from: GetGroupInfo.kt */
        public static final class GroupsValue extends Data {

            @pmi0("groups")
            private final Groups groups;

            public GroupsValue(Groups groups) {
                super(null);
                this.groups = groups;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GroupsValue) && epx.f(this.groups, ((GroupsValue) obj).groups);
            }

            public final int hashCode() {
                return this.groups.hashCode();
            }

            public final String toString() {
                return "GroupsValue(groups=" + this.groups + ')';
            }
        }

        public /* synthetic */ Data(zcl zclVar) {
            this();
        }

        private Data() {
        }
    }

    /* compiled from: GetGroupInfo.kt */
    public static final class Groups {

        @pmi0("result")
        private final List<Group> result;

        public Groups(List<Group> list) {
            this.result = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Groups) && epx.f(this.result, ((Groups) obj).result);
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("Groups(result="), this.result);
        }
    }

    public GetGroupInfo$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new GetGroupInfo$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetGroupInfo$Response)) {
            return false;
        }
        GetGroupInfo$Response getGroupInfo$Response = (GetGroupInfo$Response) obj;
        return epx.f(this.type, getGroupInfo$Response.type) && epx.f(this.data, getGroupInfo$Response.data) && epx.f(this.requestId, getGroupInfo$Response.requestId);
    }

    public final int hashCode() {
        int hashCode = (this.data.hashCode() + (this.type.hashCode() * 31)) * 31;
        String str = this.requestId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(type=");
        sb.append(this.type);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }

    public /* synthetic */ GetGroupInfo$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppGetGroupInfoResult" : str, data, str2);
    }

    /* compiled from: GetGroupInfo.kt */
    public static final class Group {

        @pmi0("description")
        private final String description;

        @pmi0("id")
        private final long id;

        @pmi0("is_closed")
        private final IsClosed isClosed;

        @pmi0("is_member")
        private final Integer isMember;

        @pmi0("members_count")
        private final Integer membersCount;

        @pmi0("name")
        private final String name;

        @pmi0("photo_100")
        private final String photo100;

        @pmi0("photo_200")
        private final String photo200;

        @pmi0("photo_50")
        private final String photo50;

        @pmi0("screen_name")
        private final String screenName;

        @pmi0("type")
        private final String type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GetGroupInfo.kt */
        public static final class IsClosed {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ IsClosed[] $VALUES;
            public static final IsClosed CLOSED;
            public static final IsClosed OPEN;
            public static final IsClosed PRIVATE;
            private final int value;

            /* compiled from: GetGroupInfo.kt */
            public static final class Serializer implements uay<IsClosed>, a9y<IsClosed> {
                @Override // xsna.a9y
                public final Object a(b9y b9yVar, z8y z8yVar) {
                    IsClosed isClosed;
                    IsClosed[] values = IsClosed.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            isClosed = null;
                            break;
                        }
                        isClosed = values[i];
                        if (epx.f(String.valueOf(isClosed.value), b9yVar.i().k())) {
                            break;
                        }
                        i++;
                    }
                    if (isClosed != null) {
                        return isClosed;
                    }
                    throw new JsonParseException(String.valueOf(b9yVar));
                }

                @Override // xsna.uay
                public final b9y b(Object obj, tay tayVar) {
                    return new hay(Integer.valueOf(((IsClosed) obj).value));
                }
            }

            static {
                IsClosed isClosed = new IsClosed("OPEN", 0, 0);
                OPEN = isClosed;
                IsClosed isClosed2 = new IsClosed("CLOSED", 1, 1);
                CLOSED = isClosed2;
                IsClosed isClosed3 = new IsClosed("PRIVATE", 2, 2);
                PRIVATE = isClosed3;
                IsClosed[] isClosedArr = {isClosed, isClosed2, isClosed3};
                $VALUES = isClosedArr;
                $ENTRIES = new asp(isClosedArr);
            }

            public IsClosed(String str, int i, int i2) {
                this.value = i2;
            }

            public static IsClosed valueOf(String str) {
                return (IsClosed) Enum.valueOf(IsClosed.class, str);
            }

            public static IsClosed[] values() {
                return (IsClosed[]) $VALUES.clone();
            }
        }

        public Group(long j, String str, String str2, String str3, String str4, String str5, IsClosed isClosed, String str6, String str7, Integer num, Integer num2) {
            this.id = j;
            this.name = str;
            this.screenName = str2;
            this.photo50 = str3;
            this.photo100 = str4;
            this.photo200 = str5;
            this.isClosed = isClosed;
            this.type = str6;
            this.description = str7;
            this.membersCount = num;
            this.isMember = num2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Group)) {
                return false;
            }
            Group group = (Group) obj;
            return this.id == group.id && epx.f(this.name, group.name) && epx.f(this.screenName, group.screenName) && epx.f(this.photo50, group.photo50) && epx.f(this.photo100, group.photo100) && epx.f(this.photo200, group.photo200) && this.isClosed == group.isClosed && epx.f(this.type, group.type) && epx.f(this.description, group.description) && epx.f(this.membersCount, group.membersCount) && epx.f(this.isMember, group.isMember);
        }

        public final int hashCode() {
            int a = urd0.a((this.isClosed.hashCode() + urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(Long.hashCode(this.id) * 31, 31, this.name), 31, this.screenName), 31, this.photo50), 31, this.photo100), 31, this.photo200)) * 31, 31, this.type);
            String str = this.description;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.membersCount;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.isMember;
            return hashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Group(id=");
            sb.append(this.id);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", screenName=");
            sb.append(this.screenName);
            sb.append(", photo50=");
            sb.append(this.photo50);
            sb.append(", photo100=");
            sb.append(this.photo100);
            sb.append(", photo200=");
            sb.append(this.photo200);
            sb.append(", isClosed=");
            sb.append(this.isClosed);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", description=");
            sb.append(this.description);
            sb.append(", membersCount=");
            sb.append(this.membersCount);
            sb.append(", isMember=");
            return uqi.b(sb, this.isMember, ')');
        }

        public /* synthetic */ Group(long j, String str, String str2, String str3, String str4, String str5, IsClosed isClosed, String str6, String str7, Integer num, Integer num2, int i, zcl zclVar) {
            this(j, str, str2, str3, str4, str5, isClosed, str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : num2);
        }
    }
}
