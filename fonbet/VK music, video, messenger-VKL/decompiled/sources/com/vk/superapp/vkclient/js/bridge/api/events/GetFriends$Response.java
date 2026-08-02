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
import xsna.pmi0;
import xsna.tay;
import xsna.uay;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GetFriends.kt */
/* loaded from: classes6.dex */
public final class GetFriends$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public GetFriends$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new GetFriends$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetFriends$Response)) {
            return false;
        }
        GetFriends$Response getFriends$Response = (GetFriends$Response) obj;
        return epx.f(this.type, getFriends$Response.type) && epx.f(this.data, getFriends$Response.data) && epx.f(this.requestId, getFriends$Response.requestId);
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

    /* compiled from: GetFriends.kt */
    public static final class Data {

        @pmi0("lists")
        private final List<Integer> lists;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("users")
        private final List<Users> users;

        /* compiled from: GetFriends.kt */
        public static final class Users {

            @pmi0("first_name")
            private final String firstName;

            @pmi0("id")
            private final int id;

            @pmi0("last_name")
            private final String lastName;

            @pmi0("photo_200")
            private final String photo200;

            @pmi0("sex")
            private final Sex sex;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: GetFriends.kt */
            public static final class Sex {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Sex[] $VALUES;
                public static final Sex ANY;
                public static final Sex FEMALE;
                public static final Sex MALE;
                private final int value;

                /* compiled from: GetFriends.kt */
                public static final class Serializer implements uay<Sex>, a9y<Sex> {
                    @Override // xsna.a9y
                    public final Object a(b9y b9yVar, z8y z8yVar) {
                        Sex sex;
                        Sex[] values = Sex.values();
                        int length = values.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                sex = null;
                                break;
                            }
                            sex = values[i];
                            if (epx.f(String.valueOf(sex.value), b9yVar.i().k())) {
                                break;
                            }
                            i++;
                        }
                        if (sex != null) {
                            return sex;
                        }
                        throw new JsonParseException(String.valueOf(b9yVar));
                    }

                    @Override // xsna.uay
                    public final b9y b(Object obj, tay tayVar) {
                        return new hay(Integer.valueOf(((Sex) obj).value));
                    }
                }

                static {
                    Sex sex = new Sex("ANY", 0, 0);
                    ANY = sex;
                    Sex sex2 = new Sex("MALE", 1, 1);
                    MALE = sex2;
                    Sex sex3 = new Sex("FEMALE", 2, 2);
                    FEMALE = sex3;
                    Sex[] sexArr = {sex, sex2, sex3};
                    $VALUES = sexArr;
                    $ENTRIES = new asp(sexArr);
                }

                public Sex(String str, int i, int i2) {
                    this.value = i2;
                }

                public static Sex valueOf(String str) {
                    return (Sex) Enum.valueOf(Sex.class, str);
                }

                public static Sex[] values() {
                    return (Sex[]) $VALUES.clone();
                }
            }

            public Users(int i, String str, String str2, String str3, Sex sex) {
                this.id = i;
                this.firstName = str;
                this.lastName = str2;
                this.photo200 = str3;
                this.sex = sex;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Users)) {
                    return false;
                }
                Users users = (Users) obj;
                return this.id == users.id && epx.f(this.firstName, users.firstName) && epx.f(this.lastName, users.lastName) && epx.f(this.photo200, users.photo200) && this.sex == users.sex;
            }

            public final int hashCode() {
                return this.sex.hashCode() + urd0.a(urd0.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.firstName), 31, this.lastName), 31, this.photo200);
            }

            public final String toString() {
                return "Users(id=" + this.id + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", photo200=" + this.photo200 + ", sex=" + this.sex + ')';
            }
        }

        public Data(List<Integer> list, List<Users> list2, String str) {
            this.lists = list;
            this.users = list2;
            this.requestId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return epx.f(this.lists, data.lists) && epx.f(this.users, data.users) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            List<Integer> list = this.lists;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<Users> list2 = this.users;
            int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str = this.requestId;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(lists=");
            sb.append(this.lists);
            sb.append(", users=");
            sb.append(this.users);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(List list, List list2, String str, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, str);
        }
    }

    public /* synthetic */ GetFriends$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppGetFriendsResult" : str, data, str2);
    }
}
