package ru.ozon.app.android.account.user.model.composer;

import Ak.C2436a;
import C.o0;
import Ds.C2880a;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import V.e;
import com.google.android.gms.common.Scopes;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0004%&'(B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006)"}, d2 = {"Lru/ozon/app/android/account/user/model/composer/GetUserResponse;", "", "userId", "", "credentials", "Lru/ozon/app/android/account/user/model/composer/GetUserResponse$Credentials;", Scopes.PROFILE, "Lru/ozon/app/android/account/user/model/composer/GetUserResponse$Profile;", "public", "Lru/ozon/app/android/account/user/model/composer/GetUserResponse$PublicInfo;", "contacts", "Lru/ozon/app/android/account/user/model/composer/GetUserResponse$Contacts;", "<init>", "(JLru/ozon/app/android/account/user/model/composer/GetUserResponse$Credentials;Lru/ozon/app/android/account/user/model/composer/GetUserResponse$Profile;Lru/ozon/app/android/account/user/model/composer/GetUserResponse$PublicInfo;Lru/ozon/app/android/account/user/model/composer/GetUserResponse$Contacts;)V", "getUserId", "()J", "getCredentials", "()Lru/ozon/app/android/account/user/model/composer/GetUserResponse$Credentials;", "getProfile", "()Lru/ozon/app/android/account/user/model/composer/GetUserResponse$Profile;", "getPublic", "()Lru/ozon/app/android/account/user/model/composer/GetUserResponse$PublicInfo;", "getContacts", "()Lru/ozon/app/android/account/user/model/composer/GetUserResponse$Contacts;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Credentials", "Profile", "PublicInfo", "Contacts", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GetUserResponse {
    private final Contacts contacts;
    private final Credentials credentials;
    private final Profile profile;
    private final PublicInfo public;
    private final long userId;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/account/user/model/composer/GetUserResponse$Contacts;", "", "phones", "", "", "emails", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getPhones", "()Ljava/util/List;", "getEmails", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Contacts {
        private final List<String> emails;
        private final List<String> phones;

        public Contacts(List<String> list, List<String> list2) {
            this.phones = list;
            this.emails = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Contacts copy$default(Contacts contacts, List list, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = contacts.phones;
            }
            if ((i11 & 2) != 0) {
                list2 = contacts.emails;
            }
            return contacts.copy(list, list2);
        }

        public final List<String> component1() {
            return this.phones;
        }

        public final List<String> component2() {
            return this.emails;
        }

        @NotNull
        public final Contacts copy(List<String> phones, List<String> emails) {
            return new Contacts(phones, emails);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Contacts)) {
                return false;
            }
            Contacts contacts = (Contacts) other;
            return Intrinsics.d(this.phones, contacts.phones) && Intrinsics.d(this.emails, contacts.emails);
        }

        public final List<String> getEmails() {
            return this.emails;
        }

        public final List<String> getPhones() {
            return this.phones;
        }

        public int hashCode() {
            List<String> list = this.phones;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<String> list2 = this.emails;
            return hashCode + (list2 != null ? list2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return C2436a.b("Contacts(phones=", this.phones, ", emails=", ")", this.emails);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/account/user/model/composer/GetUserResponse$Credentials;", "", Scopes.EMAIL, "", "phone", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getPhone", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/account/user/model/composer/GetUserResponse$Profile;", "", "firstName", "", "lastName", "middleName", "sex", "birthDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFirstName", "()Ljava/lang/String;", "getLastName", "getMiddleName", "getSex", "getBirthDate", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Profile {
        private final String birthDate;
        private final String firstName;
        private final String lastName;
        private final String middleName;
        private final String sex;

        public Profile(String str, String str2, String str3, String str4, String str5) {
            this.firstName = str;
            this.lastName = str2;
            this.middleName = str3;
            this.sex = str4;
            this.birthDate = str5;
        }

        public static /* synthetic */ Profile copy$default(Profile profile, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
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
                str4 = profile.sex;
            }
            if ((i11 & 16) != 0) {
                str5 = profile.birthDate;
            }
            String str6 = str5;
            String str7 = str3;
            return profile.copy(str, str2, str7, str4, str6);
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
        public final String getSex() {
            return this.sex;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBirthDate() {
            return this.birthDate;
        }

        @NotNull
        public final Profile copy(String firstName, String lastName, String middleName, String sex, String birthDate) {
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
            return Intrinsics.d(this.firstName, profile.firstName) && Intrinsics.d(this.lastName, profile.lastName) && Intrinsics.d(this.middleName, profile.middleName) && Intrinsics.d(this.sex, profile.sex) && Intrinsics.d(this.birthDate, profile.birthDate);
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

        public final String getSex() {
            return this.sex;
        }

        public int hashCode() {
            String str = this.firstName;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.lastName;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.middleName;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.sex;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.birthDate;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.firstName;
            String str2 = this.lastName;
            String str3 = this.middleName;
            String str4 = this.sex;
            String str5 = this.birthDate;
            StringBuilder d11 = C3660k.d("Profile(firstName=", str, ", lastName=", str2, ", middleName=");
            a.h(d11, str3, ", sex=", str4, ", birthDate=");
            return o0.c(d11, str5, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/account/user/model/composer/GetUserResponse$PublicInfo;", "", "fullName", "", "location", "age", "showAge", "", "guid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getFullName", "()Ljava/lang/String;", "getLocation", "getAge", "getShowAge", "()Z", "getGuid", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PublicInfo {
        private final String age;
        private final String fullName;
        private final String guid;
        private final String location;
        private final boolean showAge;

        public PublicInfo(String str, String str2, String str3, boolean z11, String str4) {
            this.fullName = str;
            this.location = str2;
            this.age = str3;
            this.showAge = z11;
            this.guid = str4;
        }

        public static /* synthetic */ PublicInfo copy$default(PublicInfo publicInfo, String str, String str2, String str3, boolean z11, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = publicInfo.fullName;
            }
            if ((i11 & 2) != 0) {
                str2 = publicInfo.location;
            }
            if ((i11 & 4) != 0) {
                str3 = publicInfo.age;
            }
            if ((i11 & 8) != 0) {
                z11 = publicInfo.showAge;
            }
            if ((i11 & 16) != 0) {
                str4 = publicInfo.guid;
            }
            String str5 = str4;
            String str6 = str3;
            return publicInfo.copy(str, str2, str6, z11, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFullName() {
            return this.fullName;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLocation() {
            return this.location;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAge() {
            return this.age;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowAge() {
            return this.showAge;
        }

        /* renamed from: component5, reason: from getter */
        public final String getGuid() {
            return this.guid;
        }

        @NotNull
        public final PublicInfo copy(String fullName, String location, String age, boolean showAge, String guid) {
            return new PublicInfo(fullName, location, age, showAge, guid);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PublicInfo)) {
                return false;
            }
            PublicInfo publicInfo = (PublicInfo) other;
            return Intrinsics.d(this.fullName, publicInfo.fullName) && Intrinsics.d(this.location, publicInfo.location) && Intrinsics.d(this.age, publicInfo.age) && this.showAge == publicInfo.showAge && Intrinsics.d(this.guid, publicInfo.guid);
        }

        public final String getAge() {
            return this.age;
        }

        public final String getFullName() {
            return this.fullName;
        }

        public final String getGuid() {
            return this.guid;
        }

        public final String getLocation() {
            return this.location;
        }

        public final boolean getShowAge() {
            return this.showAge;
        }

        public int hashCode() {
            String str = this.fullName;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.location;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.age;
            int a11 = C3532b.a((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.showAge);
            String str4 = this.guid;
            return a11 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.fullName;
            String str2 = this.location;
            String str3 = this.age;
            boolean z11 = this.showAge;
            String str4 = this.guid;
            StringBuilder d11 = C3660k.d("PublicInfo(fullName=", str, ", location=", str2, ", age=");
            C2880a.c(str3, ", showAge=", ", guid=", d11, z11);
            return o0.c(d11, str4, ")");
        }
    }

    public GetUserResponse(long j11, Credentials credentials, Profile profile, PublicInfo publicInfo, Contacts contacts) {
        this.userId = j11;
        this.credentials = credentials;
        this.profile = profile;
        this.public = publicInfo;
        this.contacts = contacts;
    }

    public static /* synthetic */ GetUserResponse copy$default(GetUserResponse getUserResponse, long j11, Credentials credentials, Profile profile, PublicInfo publicInfo, Contacts contacts, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = getUserResponse.userId;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            credentials = getUserResponse.credentials;
        }
        Credentials credentials2 = credentials;
        if ((i11 & 4) != 0) {
            profile = getUserResponse.profile;
        }
        Profile profile2 = profile;
        if ((i11 & 8) != 0) {
            publicInfo = getUserResponse.public;
        }
        PublicInfo publicInfo2 = publicInfo;
        if ((i11 & 16) != 0) {
            contacts = getUserResponse.contacts;
        }
        return getUserResponse.copy(j12, credentials2, profile2, publicInfo2, contacts);
    }

    /* renamed from: component1, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    /* renamed from: component2, reason: from getter */
    public final Credentials getCredentials() {
        return this.credentials;
    }

    /* renamed from: component3, reason: from getter */
    public final Profile getProfile() {
        return this.profile;
    }

    /* renamed from: component4, reason: from getter */
    public final PublicInfo getPublic() {
        return this.public;
    }

    /* renamed from: component5, reason: from getter */
    public final Contacts getContacts() {
        return this.contacts;
    }

    @NotNull
    public final GetUserResponse copy(long userId, Credentials credentials, Profile profile, PublicInfo r12, Contacts contacts) {
        return new GetUserResponse(userId, credentials, profile, r12, contacts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetUserResponse)) {
            return false;
        }
        GetUserResponse getUserResponse = (GetUserResponse) other;
        return this.userId == getUserResponse.userId && Intrinsics.d(this.credentials, getUserResponse.credentials) && Intrinsics.d(this.profile, getUserResponse.profile) && Intrinsics.d(this.public, getUserResponse.public) && Intrinsics.d(this.contacts, getUserResponse.contacts);
    }

    public final Contacts getContacts() {
        return this.contacts;
    }

    public final Credentials getCredentials() {
        return this.credentials;
    }

    public final Profile getProfile() {
        return this.profile;
    }

    public final PublicInfo getPublic() {
        return this.public;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.userId) * 31;
        Credentials credentials = this.credentials;
        int hashCode2 = (hashCode + (credentials == null ? 0 : credentials.hashCode())) * 31;
        Profile profile = this.profile;
        int hashCode3 = (hashCode2 + (profile == null ? 0 : profile.hashCode())) * 31;
        PublicInfo publicInfo = this.public;
        int hashCode4 = (hashCode3 + (publicInfo == null ? 0 : publicInfo.hashCode())) * 31;
        Contacts contacts = this.contacts;
        return hashCode4 + (contacts != null ? contacts.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GetUserResponse(userId=" + this.userId + ", credentials=" + this.credentials + ", profile=" + this.profile + ", public=" + this.public + ", contacts=" + this.contacts + ")";
    }
}
