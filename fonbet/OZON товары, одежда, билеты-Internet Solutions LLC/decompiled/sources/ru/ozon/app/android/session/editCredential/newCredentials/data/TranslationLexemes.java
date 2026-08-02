package ru.ozon.app.android.session.editCredential.newCredentials.data;

import V.e;
import com.google.android.gms.common.Scopes;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes;", "", "validationLexemes", "Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes$ValidationLexemes;", "<init>", "(Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes$ValidationLexemes;)V", "getValidationLexemes", "()Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes$ValidationLexemes;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ValidationLexemes", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TranslationLexemes {
    public static final int $stable = 0;

    @NotNull
    private final ValidationLexemes validationLexemes;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes$ValidationLexemes;", "", "isEmpty", "Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes$ValidationLexemes$IsEmpty;", "isInvalid", "Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes$ValidationLexemes$IsInvalid;", "<init>", "(Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes$ValidationLexemes$IsEmpty;Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes$ValidationLexemes$IsInvalid;)V", "()Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes$ValidationLexemes$IsEmpty;", "()Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes$ValidationLexemes$IsInvalid;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "IsEmpty", "IsInvalid", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ValidationLexemes {
        public static final int $stable = 0;

        @NotNull
        private final IsEmpty isEmpty;

        @NotNull
        private final IsInvalid isInvalid;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes$ValidationLexemes$IsEmpty;", "", Scopes.EMAIL, "", "phone", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getPhone", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class IsEmpty {
            public static final int $stable = 0;

            @NotNull
            private final String email;

            @NotNull
            private final String phone;

            public IsEmpty(@NotNull String email, @NotNull String phone) {
                Intrinsics.checkNotNullParameter(email, "email");
                Intrinsics.checkNotNullParameter(phone, "phone");
                this.email = email;
                this.phone = phone;
            }

            public static /* synthetic */ IsEmpty copy$default(IsEmpty isEmpty, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = isEmpty.email;
                }
                if ((i11 & 2) != 0) {
                    str2 = isEmpty.phone;
                }
                return isEmpty.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getEmail() {
                return this.email;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getPhone() {
                return this.phone;
            }

            @NotNull
            public final IsEmpty copy(@NotNull String email, @NotNull String phone) {
                Intrinsics.checkNotNullParameter(email, "email");
                Intrinsics.checkNotNullParameter(phone, "phone");
                return new IsEmpty(email, phone);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof IsEmpty)) {
                    return false;
                }
                IsEmpty isEmpty = (IsEmpty) other;
                return Intrinsics.d(this.email, isEmpty.email) && Intrinsics.d(this.phone, isEmpty.phone);
            }

            @NotNull
            public final String getEmail() {
                return this.email;
            }

            @NotNull
            public final String getPhone() {
                return this.phone;
            }

            public int hashCode() {
                return this.phone.hashCode() + (this.email.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return e.a("IsEmpty(email=", this.email, ", phone=", this.phone, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/session/editCredential/newCredentials/data/TranslationLexemes$ValidationLexemes$IsInvalid;", "", Scopes.EMAIL, "", "phone", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getPhone", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class IsInvalid {
            public static final int $stable = 0;

            @NotNull
            private final String email;

            @NotNull
            private final String phone;

            public IsInvalid(@NotNull String email, @NotNull String phone) {
                Intrinsics.checkNotNullParameter(email, "email");
                Intrinsics.checkNotNullParameter(phone, "phone");
                this.email = email;
                this.phone = phone;
            }

            public static /* synthetic */ IsInvalid copy$default(IsInvalid isInvalid, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = isInvalid.email;
                }
                if ((i11 & 2) != 0) {
                    str2 = isInvalid.phone;
                }
                return isInvalid.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getEmail() {
                return this.email;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getPhone() {
                return this.phone;
            }

            @NotNull
            public final IsInvalid copy(@NotNull String email, @NotNull String phone) {
                Intrinsics.checkNotNullParameter(email, "email");
                Intrinsics.checkNotNullParameter(phone, "phone");
                return new IsInvalid(email, phone);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof IsInvalid)) {
                    return false;
                }
                IsInvalid isInvalid = (IsInvalid) other;
                return Intrinsics.d(this.email, isInvalid.email) && Intrinsics.d(this.phone, isInvalid.phone);
            }

            @NotNull
            public final String getEmail() {
                return this.email;
            }

            @NotNull
            public final String getPhone() {
                return this.phone;
            }

            public int hashCode() {
                return this.phone.hashCode() + (this.email.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return e.a("IsInvalid(email=", this.email, ", phone=", this.phone, ")");
            }
        }

        public ValidationLexemes(@NotNull IsEmpty isEmpty, @NotNull IsInvalid isInvalid) {
            Intrinsics.checkNotNullParameter(isEmpty, "isEmpty");
            Intrinsics.checkNotNullParameter(isInvalid, "isInvalid");
            this.isEmpty = isEmpty;
            this.isInvalid = isInvalid;
        }

        public static /* synthetic */ ValidationLexemes copy$default(ValidationLexemes validationLexemes, IsEmpty isEmpty, IsInvalid isInvalid, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                isEmpty = validationLexemes.isEmpty;
            }
            if ((i11 & 2) != 0) {
                isInvalid = validationLexemes.isInvalid;
            }
            return validationLexemes.copy(isEmpty, isInvalid);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IsEmpty getIsEmpty() {
            return this.isEmpty;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final IsInvalid getIsInvalid() {
            return this.isInvalid;
        }

        @NotNull
        public final ValidationLexemes copy(@NotNull IsEmpty isEmpty, @NotNull IsInvalid isInvalid) {
            Intrinsics.checkNotNullParameter(isEmpty, "isEmpty");
            Intrinsics.checkNotNullParameter(isInvalid, "isInvalid");
            return new ValidationLexemes(isEmpty, isInvalid);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValidationLexemes)) {
                return false;
            }
            ValidationLexemes validationLexemes = (ValidationLexemes) other;
            return Intrinsics.d(this.isEmpty, validationLexemes.isEmpty) && Intrinsics.d(this.isInvalid, validationLexemes.isInvalid);
        }

        public int hashCode() {
            return this.isInvalid.hashCode() + (this.isEmpty.hashCode() * 31);
        }

        @NotNull
        public final IsEmpty isEmpty() {
            return this.isEmpty;
        }

        @NotNull
        public final IsInvalid isInvalid() {
            return this.isInvalid;
        }

        @NotNull
        public String toString() {
            return "ValidationLexemes(isEmpty=" + this.isEmpty + ", isInvalid=" + this.isInvalid + ")";
        }
    }

    public TranslationLexemes(@NotNull ValidationLexemes validationLexemes) {
        Intrinsics.checkNotNullParameter(validationLexemes, "validationLexemes");
        this.validationLexemes = validationLexemes;
    }

    public static /* synthetic */ TranslationLexemes copy$default(TranslationLexemes translationLexemes, ValidationLexemes validationLexemes, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            validationLexemes = translationLexemes.validationLexemes;
        }
        return translationLexemes.copy(validationLexemes);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ValidationLexemes getValidationLexemes() {
        return this.validationLexemes;
    }

    @NotNull
    public final TranslationLexemes copy(@NotNull ValidationLexemes validationLexemes) {
        Intrinsics.checkNotNullParameter(validationLexemes, "validationLexemes");
        return new TranslationLexemes(validationLexemes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TranslationLexemes) && Intrinsics.d(this.validationLexemes, ((TranslationLexemes) other).validationLexemes);
    }

    @NotNull
    public final ValidationLexemes getValidationLexemes() {
        return this.validationLexemes;
    }

    public int hashCode() {
        return this.validationLexemes.hashCode();
    }

    @NotNull
    public String toString() {
        return "TranslationLexemes(validationLexemes=" + this.validationLexemes + ")";
    }
}
