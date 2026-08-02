package ru.ozon.id.user.data;

import C.o0;
import N3.C3660k;
import V.e;
import Xc.b;
import com.google.android.gms.common.Scopes;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lru/ozon/id/user/data/OzonIdUser;", "", "id", "", "credentials", "Lru/ozon/id/user/data/OzonIdUser$Credentials;", Scopes.PROFILE, "Lru/ozon/id/user/data/OzonIdUser$Profile;", "<init>", "(JLru/ozon/id/user/data/OzonIdUser$Credentials;Lru/ozon/id/user/data/OzonIdUser$Profile;)V", "getId", "()J", "getCredentials", "()Lru/ozon/id/user/data/OzonIdUser$Credentials;", "getProfile", "()Lru/ozon/id/user/data/OzonIdUser$Profile;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Credentials", "Profile", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OzonIdUser {
    private final Credentials credentials;
    private final long id;
    private final Profile profile;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/id/user/data/OzonIdUser$Credentials;", "", Scopes.EMAIL, "", "phone", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getPhone", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Credentials {
        private final String email;
        private final String phone;

        public Credentials(String str, String str2) {
            this.email = str;
            this.phone = str2;
        }

        public static /* synthetic */ Credentials copy$default(Credentials credentials, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = credentials.email;
            }
            if ((i11 & 2) != 0) {
                str2 = credentials.phone;
            }
            return credentials.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        @NotNull
        public final Credentials copy(String email, String phone) {
            return new Credentials(email, phone);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Credentials)) {
                return false;
            }
            Credentials credentials = (Credentials) other;
            return Intrinsics.d(this.email, credentials.email) && Intrinsics.d(this.phone, credentials.phone);
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getPhone() {
            return this.phone;
        }

        public int hashCode() {
            String str = this.email;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.phone;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return e.a("Credentials(email=", this.email, ", phone=", this.phone, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\f¨\u0006$"}, d2 = {"Lru/ozon/id/user/data/OzonIdUser$Profile;", "", "", "firstName", "lastName", "middleName", "Lru/ozon/id/user/data/OzonIdUser$Profile$a;", "sex", "birthDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/id/user/data/OzonIdUser$Profile$a;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lru/ozon/id/user/data/OzonIdUser$Profile$a;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/id/user/data/OzonIdUser$Profile$a;Ljava/lang/String;)Lru/ozon/id/user/data/OzonIdUser$Profile;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFirstName", "getLastName", "getMiddleName", "Lru/ozon/id/user/data/OzonIdUser$Profile$a;", "getSex", "getBirthDate", "a", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Profile {
        private final String birthDate;
        private final String firstName;
        private final String lastName;
        private final String middleName;
        private final a sex;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/id/user/data/OzonIdUser$Profile$a;", "", "<init>", "(Ljava/lang/String;I)V", "Male", "Female", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = false)
        public static final class a {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ a[] $VALUES;

            @i(name = "male")
            public static final a Male = new a("Male", 0);

            @i(name = "female")
            public static final a Female = new a("Female", 1);

            private static final /* synthetic */ a[] $values() {
                return new a[]{Male, Female};
            }

            static {
                a[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private a(String str, int i11) {
            }

            @NotNull
            public static Xc.a<a> getEntries() {
                return $ENTRIES;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) $VALUES.clone();
            }
        }

        public Profile(String str, String str2, String str3, a aVar, String str4) {
            this.firstName = str;
            this.lastName = str2;
            this.middleName = str3;
            this.sex = aVar;
            this.birthDate = str4;
        }

        public static /* synthetic */ Profile copy$default(Profile profile, String str, String str2, String str3, a aVar, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = profile.firstName;
            }
            if ((i11 & 2) != 0) {
                str2 = profile.lastName;
            }
            if ((i11 & 4) != 0) {
                str3 = profile.middleName;
            }
            if ((i11 & 8) != 0) {
                aVar = profile.sex;
            }
            if ((i11 & 16) != 0) {
                str4 = profile.birthDate;
            }
            String str5 = str4;
            String str6 = str3;
            return profile.copy(str, str2, str6, aVar, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFirstName() {
            return this.firstName;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLastName() {
            return this.lastName;
        }

        /* renamed from: component3, reason: from getter */
        public final String getMiddleName() {
            return this.middleName;
        }

        /* renamed from: component4, reason: from getter */
        public final a getSex() {
            return this.sex;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBirthDate() {
            return this.birthDate;
        }

        @NotNull
        public final Profile copy(String firstName, String lastName, String middleName, a sex, String birthDate) {
            return new Profile(firstName, lastName, middleName, sex, birthDate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Profile)) {
                return false;
            }
            Profile profile = (Profile) other;
            return Intrinsics.d(this.firstName, profile.firstName) && Intrinsics.d(this.lastName, profile.lastName) && Intrinsics.d(this.middleName, profile.middleName) && this.sex == profile.sex && Intrinsics.d(this.birthDate, profile.birthDate);
        }

        public final String getBirthDate() {
            return this.birthDate;
        }

        public final String getFirstName() {
            return this.firstName;
        }

        public final String getLastName() {
            return this.lastName;
        }

        public final String getMiddleName() {
            return this.middleName;
        }

        public final a getSex() {
            return this.sex;
        }

        public int hashCode() {
            String str = this.firstName;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.lastName;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.middleName;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            a aVar = this.sex;
            int hashCode4 = (hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str4 = this.birthDate;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.firstName;
            String str2 = this.lastName;
            String str3 = this.middleName;
            a aVar = this.sex;
            String str4 = this.birthDate;
            StringBuilder d11 = C3660k.d("Profile(firstName=", str, ", lastName=", str2, ", middleName=");
            d11.append(str3);
            d11.append(", sex=");
            d11.append(aVar);
            d11.append(", birthDate=");
            return o0.c(d11, str4, ")");
        }
    }

    public OzonIdUser(@i(name = "userId") long j11, Credentials credentials, Profile profile) {
        this.id = j11;
        this.credentials = credentials;
        this.profile = profile;
    }

    public static /* synthetic */ OzonIdUser copy$default(OzonIdUser ozonIdUser, long j11, Credentials credentials, Profile profile, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = ozonIdUser.id;
        }
        if ((i11 & 2) != 0) {
            credentials = ozonIdUser.credentials;
        }
        if ((i11 & 4) != 0) {
            profile = ozonIdUser.profile;
        }
        return ozonIdUser.copy(j11, credentials, profile);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Credentials getCredentials() {
        return this.credentials;
    }

    /* renamed from: component3, reason: from getter */
    public final Profile getProfile() {
        return this.profile;
    }

    @NotNull
    public final OzonIdUser copy(@i(name = "userId") long id2, Credentials credentials, Profile profile) {
        return new OzonIdUser(id2, credentials, profile);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OzonIdUser)) {
            return false;
        }
        OzonIdUser ozonIdUser = (OzonIdUser) other;
        return this.id == ozonIdUser.id && Intrinsics.d(this.credentials, ozonIdUser.credentials) && Intrinsics.d(this.profile, ozonIdUser.profile);
    }

    public final Credentials getCredentials() {
        return this.credentials;
    }

    public final long getId() {
        return this.id;
    }

    public final Profile getProfile() {
        return this.profile;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Credentials credentials = this.credentials;
        int hashCode2 = (hashCode + (credentials == null ? 0 : credentials.hashCode())) * 31;
        Profile profile = this.profile;
        return hashCode2 + (profile != null ? profile.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OzonIdUser(id=" + this.id + ", credentials=" + this.credentials + ", profile=" + this.profile + ")";
    }
}
