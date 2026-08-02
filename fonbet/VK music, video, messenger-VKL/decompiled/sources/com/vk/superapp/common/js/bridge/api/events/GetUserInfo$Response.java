package com.vk.superapp.common.js.bridge.api.events;

import com.google.gson.JsonParseException;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
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
import xsna.tn;
import xsna.uay;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GetUserInfo.kt */
/* loaded from: classes6.dex */
public final class GetUserInfo$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    /* compiled from: GetUserInfo.kt */
    public static abstract class Data {

        @pmi0(CommonUrlParts.REQUEST_ID)
        private String requestId;

        /* compiled from: GetUserInfo.kt */
        public static final class UserValue extends Data {

            @pmi0("user")
            private final User user;

            public UserValue(User user) {
                super(null);
                this.user = user;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UserValue) && epx.f(this.user, ((UserValue) obj).user);
            }

            public final int hashCode() {
                return this.user.hashCode();
            }

            public final String toString() {
                return "UserValue(user=" + this.user + ')';
            }
        }

        /* compiled from: GetUserInfo.kt */
        public static final class UsersValue extends Data {

            @pmi0("users")
            private final Users users;

            public UsersValue(Users users) {
                super(null);
                this.users = users;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UsersValue) && epx.f(this.users, ((UsersValue) obj).users);
            }

            public final int hashCode() {
                return this.users.hashCode();
            }

            public final String toString() {
                return "UsersValue(users=" + this.users + ')';
            }
        }

        public /* synthetic */ Data(zcl zclVar) {
            this();
        }

        public final void a(String str) {
            this.requestId = str;
        }

        private Data() {
        }
    }

    /* compiled from: GetUserInfo.kt */
    public static final class Users {

        @pmi0("result")
        private final List<User> result;

        public Users(List<User> list) {
            this.result = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Users) && epx.f(this.result, ((Users) obj).result);
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("Users(result="), this.result);
        }
    }

    public GetUserInfo$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new GetUserInfo$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetUserInfo$Response)) {
            return false;
        }
        GetUserInfo$Response getUserInfo$Response = (GetUserInfo$Response) obj;
        return epx.f(this.type, getUserInfo$Response.type) && epx.f(this.data, getUserInfo$Response.data) && epx.f(this.requestId, getUserInfo$Response.requestId);
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

    public /* synthetic */ GetUserInfo$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppGetUserInfoResult" : str, data, str2);
    }

    /* compiled from: GetUserInfo.kt */
    public static final class User {

        @pmi0("bdate")
        private final String bdate;

        @pmi0("bdate_visibility")
        private final Integer bdateVisibility;

        @pmi0("can_access_closed")
        private final Boolean canAccessClosed;

        @pmi0("city")
        private final City city;

        @pmi0("country")
        private final Country country;

        @pmi0("first_name")
        private final String firstName;

        @pmi0("id")
        private final long id;

        @pmi0("is_closed")
        private final Boolean isClosed;

        @pmi0("last_name")
        private final String lastName;

        @pmi0("photo_100")
        private final String photo100;

        @pmi0("photo_200")
        private final String photo200;

        @pmi0("photo_max_orig")
        private final String photoMaxOrig;

        @pmi0("sex")
        private final Sex sex;

        @pmi0(AnalyticsBaseParamsConstantsKt.TIMEZONE)
        private final Float timezone;

        /* compiled from: GetUserInfo.kt */
        public static final class City {

            @pmi0("id")
            private final Integer id;

            @pmi0("title")
            private final String title;

            /* JADX WARN: Multi-variable type inference failed */
            public City() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof City)) {
                    return false;
                }
                City city = (City) obj;
                return epx.f(this.id, city.id) && epx.f(this.title, city.title);
            }

            public final int hashCode() {
                Integer num = this.id;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                String str = this.title;
                return hashCode + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("City(id=");
                sb.append(this.id);
                sb.append(", title=");
                return ho8.a(sb, this.title, ')');
            }

            public City(Integer num, String str) {
                this.id = num;
                this.title = str;
            }

            public /* synthetic */ City(Integer num, String str, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
            }
        }

        /* compiled from: GetUserInfo.kt */
        public static final class Country {

            @pmi0("id")
            private final Integer id;

            @pmi0("title")
            private final String title;

            /* JADX WARN: Multi-variable type inference failed */
            public Country() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Country)) {
                    return false;
                }
                Country country = (Country) obj;
                return epx.f(this.id, country.id) && epx.f(this.title, country.title);
            }

            public final int hashCode() {
                Integer num = this.id;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                String str = this.title;
                return hashCode + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Country(id=");
                sb.append(this.id);
                sb.append(", title=");
                return ho8.a(sb, this.title, ')');
            }

            public Country(Integer num, String str) {
                this.id = num;
                this.title = str;
            }

            public /* synthetic */ Country(Integer num, String str, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GetUserInfo.kt */
        public static final class Sex {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Sex[] $VALUES;
            public static final Sex ANY;
            public static final Sex FEMALE;
            public static final Sex MALE;
            private final int value;

            /* compiled from: GetUserInfo.kt */
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

        public User(long j, String str, String str2, String str3, Sex sex, String str4, Integer num, City city, Country country, String str5, String str6, Float f, Boolean bool, Boolean bool2) {
            this.id = j;
            this.firstName = str;
            this.lastName = str2;
            this.photo200 = str3;
            this.sex = sex;
            this.bdate = str4;
            this.bdateVisibility = num;
            this.city = city;
            this.country = country;
            this.photo100 = str5;
            this.photoMaxOrig = str6;
            this.timezone = f;
            this.canAccessClosed = bool;
            this.isClosed = bool2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof User)) {
                return false;
            }
            User user = (User) obj;
            return this.id == user.id && epx.f(this.firstName, user.firstName) && epx.f(this.lastName, user.lastName) && epx.f(this.photo200, user.photo200) && this.sex == user.sex && epx.f(this.bdate, user.bdate) && epx.f(this.bdateVisibility, user.bdateVisibility) && epx.f(this.city, user.city) && epx.f(this.country, user.country) && epx.f(this.photo100, user.photo100) && epx.f(this.photoMaxOrig, user.photoMaxOrig) && epx.f(this.timezone, user.timezone) && epx.f(this.canAccessClosed, user.canAccessClosed) && epx.f(this.isClosed, user.isClosed);
        }

        public final int hashCode() {
            int hashCode = (this.sex.hashCode() + urd0.a(urd0.a(urd0.a(Long.hashCode(this.id) * 31, 31, this.firstName), 31, this.lastName), 31, this.photo200)) * 31;
            String str = this.bdate;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.bdateVisibility;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            City city = this.city;
            int hashCode4 = (hashCode3 + (city == null ? 0 : city.hashCode())) * 31;
            Country country = this.country;
            int hashCode5 = (hashCode4 + (country == null ? 0 : country.hashCode())) * 31;
            String str2 = this.photo100;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.photoMaxOrig;
            int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Float f = this.timezone;
            int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
            Boolean bool = this.canAccessClosed;
            int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isClosed;
            return hashCode9 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("User(id=");
            sb.append(this.id);
            sb.append(", firstName=");
            sb.append(this.firstName);
            sb.append(", lastName=");
            sb.append(this.lastName);
            sb.append(", photo200=");
            sb.append(this.photo200);
            sb.append(", sex=");
            sb.append(this.sex);
            sb.append(", bdate=");
            sb.append(this.bdate);
            sb.append(", bdateVisibility=");
            sb.append(this.bdateVisibility);
            sb.append(", city=");
            sb.append(this.city);
            sb.append(", country=");
            sb.append(this.country);
            sb.append(", photo100=");
            sb.append(this.photo100);
            sb.append(", photoMaxOrig=");
            sb.append(this.photoMaxOrig);
            sb.append(", timezone=");
            sb.append(this.timezone);
            sb.append(", canAccessClosed=");
            sb.append(this.canAccessClosed);
            sb.append(", isClosed=");
            return tn.a(sb, this.isClosed, ')');
        }

        public /* synthetic */ User(long j, String str, String str2, String str3, Sex sex, String str4, Integer num, City city, Country country, String str5, String str6, Float f, Boolean bool, Boolean bool2, int i, zcl zclVar) {
            this(j, str, str2, str3, sex, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : city, (i & 256) != 0 ? null : country, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : f, (i & 4096) != 0 ? null : bool, (i & 8192) != 0 ? null : bool2);
        }
    }
}
